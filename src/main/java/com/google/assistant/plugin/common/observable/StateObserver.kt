package com.google.assistant.plugin.common.observable

/* compiled from: StateObservable.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/observable/StateObserver.class */
interface StateObserver<T> {
    fun onStateChange(t: T, t2: T?)
}
