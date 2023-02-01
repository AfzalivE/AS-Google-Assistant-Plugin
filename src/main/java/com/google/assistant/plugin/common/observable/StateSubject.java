package com.google.assistant.plugin.common.observable;

import kotlin.Metadata;

/* compiled from: StateObservable.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028��¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u00028��X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/google/assistant/plugin/common/observable/StateSubject;", "T", "Lcom/google/assistant/plugin/common/observable/StateObservable;", "initialState", "(Ljava/lang/Object;)V", "state", "getState", "()Ljava/lang/Object;", "setState", "Ljava/lang/Object;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/observable/StateSubject.class */
public abstract class StateSubject<T> implements StateObservable<T> {
    private T state;

    public StateSubject(T t) {
        this.state = t;
    }

    @Override // com.google.assistant.plugin.common.observable.StateObservable
    public T getState() {
        return this.state;
    }

    public void setState(T t) {
        this.state = t;
    }
}
