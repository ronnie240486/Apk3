package com.google.common.eventbus;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class SubscriberExceptionContext {
    private final java.lang.Object event;
    private final com.google.common.eventbus.EventBus eventBus;
    private final java.lang.Object subscriber;
    private final java.lang.reflect.Method subscriberMethod;

    public SubscriberExceptionContext(com.google.common.eventbus.EventBus r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Method r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.eventbus.EventBus r1 = (com.google.common.eventbus.EventBus) r1
            r0.eventBus = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.event = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            r0.subscriber = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r0.subscriberMethod = r1
            return
    }

    public java.lang.Object getEvent() {
            r1 = this;
            java.lang.Object r0 = r1.event
            return r0
    }

    public com.google.common.eventbus.EventBus getEventBus() {
            r1 = this;
            com.google.common.eventbus.EventBus r0 = r1.eventBus
            return r0
    }

    public java.lang.Object getSubscriber() {
            r1 = this;
            java.lang.Object r0 = r1.subscriber
            return r0
    }

    public java.lang.reflect.Method getSubscriberMethod() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.subscriberMethod
            return r0
    }
}
