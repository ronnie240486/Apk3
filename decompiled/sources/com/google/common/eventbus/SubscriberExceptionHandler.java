package com.google.common.eventbus;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler {
    void handleException(java.lang.Throwable r1, com.google.common.eventbus.SubscriberExceptionContext r2);
}
