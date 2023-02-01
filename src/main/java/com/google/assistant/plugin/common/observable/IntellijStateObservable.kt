package com.google.assistant.plugin.common.observable

import com.intellij.openapi.Disposable

/* compiled from: StateObservable.kt */
interface IntellijStateObservable<T> : StateObservable<T> {
    fun subscribe(disposable: Disposable, stateObserver: StateObserver<T>): StateSubscription
    fun subscribe(disposable: Disposable, function2: (T, T) -> Unit): StateSubscription
}
