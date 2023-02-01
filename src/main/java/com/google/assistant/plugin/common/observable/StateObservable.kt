package com.google.assistant.plugin.common.observable

/* compiled from: StateObservable.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/observable/StateObservable.class */
interface StateObservable<T> {
    val state: T
    fun subscribe(stateObserver: StateObserver<T>): StateSubscription
    fun subscribe(function2: (T, T) -> Unit): StateSubscription
}
