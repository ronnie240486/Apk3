package com.google.common.eventbus;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class AsyncEventBus extends com.google.common.eventbus.EventBus {
    public AsyncEventBus(java.lang.String r3, java.util.concurrent.Executor r4) {
            r2 = this;
            com.google.common.eventbus.Dispatcher r0 = com.google.common.eventbus.Dispatcher.legacyAsync()
            com.google.common.eventbus.EventBus$LoggingHandler r1 = com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AsyncEventBus(java.util.concurrent.Executor r4) {
            r3 = this;
            com.google.common.eventbus.Dispatcher r0 = com.google.common.eventbus.Dispatcher.legacyAsync()
            com.google.common.eventbus.EventBus$LoggingHandler r1 = com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE
            java.lang.String r2 = "default"
            r3.<init>(r2, r4, r0, r1)
            return
    }

    public AsyncEventBus(java.util.concurrent.Executor r3, com.google.common.eventbus.SubscriberExceptionHandler r4) {
            r2 = this;
            com.google.common.eventbus.Dispatcher r0 = com.google.common.eventbus.Dispatcher.legacyAsync()
            java.lang.String r1 = "default"
            r2.<init>(r1, r3, r0, r4)
            return
    }
}
