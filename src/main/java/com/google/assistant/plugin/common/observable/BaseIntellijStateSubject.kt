package com.google.assistant.plugin.common.observable

import com.intellij.openapi.Disposable
import com.intellij.openapi.application.ApplicationManager
import com.intellij.util.messages.MessageBus
import com.intellij.util.messages.MessageBusConnection
import com.intellij.util.messages.Topic
import kotlin.jvm.internal.Intrinsics

/* compiled from: BaseIntellijStateSubject.kt */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/observable/BaseIntellijStateSubject.class */
abstract class BaseIntellijStateSubject<T>(id: String, val bus: MessageBus, t: T) : IntellijStateSubject<T>(t) {
    private val topic: Topic<StateObserver<T>>

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        val create = Topic.create(
            BaseIntellijStateSubject::class.java.simpleName + '-' + id,
            StateObserver::class.java
        )
        topic = create as Topic<StateObserver<T>>
    }

    override var state: T = super.state
        set(value) {
            ApplicationManager.getApplication().assertIsDispatchThread()
            val oldState = field
            field = value
            bus.syncPublisher(topic).onStateChange(field, oldState)
        }
    override fun subscribe(stateObserver: StateObserver<T>): StateSubscription {
        Intrinsics.checkNotNullParameter(stateObserver, "observer")
        val connection = bus.connect()
        Intrinsics.checkNotNullExpressionValue(connection, "bus.connect()")
        return startSubscription(connection, stateObserver)
    }

    override fun subscribe(function2: (T, T) -> Unit): StateSubscription {
        val connection = bus.connect()
        return startSubscription(connection, object : StateObserver<T> {
            override fun onStateChange(t: T, t2: T?) {
                function2(t, t)
            }
        })
    }

    override fun subscribe(disposable: Disposable, stateObserver: StateObserver<T>): StateSubscription {
        Intrinsics.checkNotNullParameter(disposable, "disposable")
        Intrinsics.checkNotNullParameter(stateObserver, "observer")
        val connection = bus.connect(disposable)
        Intrinsics.checkNotNullExpressionValue(connection, "bus.connect(disposable)")
        return startSubscription(connection, stateObserver)
    }

    override fun subscribe(disposable: Disposable, function2: (T, T) -> Unit): StateSubscription {
        Intrinsics.checkNotNullParameter(disposable, "disposable")
        Intrinsics.checkNotNullParameter(function2, "callback")
        val connection = bus.connect(disposable)
        Intrinsics.checkNotNullExpressionValue(connection, "bus.connect(disposable)")
        return startSubscription(connection, object : StateObserver<T> {
            override fun onStateChange(t: T, t2: T?) {
                function2(t, t)
            }
        })
    }

    private fun startSubscription(
        connection: MessageBusConnection,
        stateObserver: StateObserver<T>
    ): StateSubscription {
        connection.subscribe(topic, stateObserver)
        broadcastInitialState()
        return DisconnectingStateSubscription(connection)
    }

    private fun startSubscription(
        connection: MessageBusConnection,
        function2: (T, T?) -> Unit
    ): StateSubscription {
        connection.subscribe(topic, object : StateObserver<T> {
            override fun onStateChange(t: T, t2: T?) {
                // from class: com.google.assistant.plugin.common.observable.BaseIntellijStateSubject$startSubscription$1
                // com.google.assistant.plugin.common.observable.StateObserver
                function2.invoke(t, t2)
            }
        })
        broadcastInitialState()
        return DisconnectingStateSubscription(connection)
    }

    private fun broadcastInitialState() {
        ApplicationManager.getApplication().invokeLater {
            (bus.syncPublisher(topic)).onStateChange(state, null)
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: BaseIntellijStateSubject.kt */
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/observable/BaseIntellijStateSubject$DisconnectingStateSubscription.class */
    class DisconnectingStateSubscription(connection: MessageBusConnection) :
        StateSubscription {
        private val connection: MessageBusConnection

        init {
            Intrinsics.checkNotNullParameter(connection, "connection")
            this.connection = connection
        }

        // com.google.assistant.plugin.common.observable.StateSubscription
        override fun unsubscribe() {
            connection.disconnect()
        }
    }

    companion object {
        private val `topic$annotations`: Unit
            private get() {}
    }
}
