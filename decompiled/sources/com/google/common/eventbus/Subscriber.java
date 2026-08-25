package com.google.common.eventbus;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
class Subscriber {

    @com.google.j2objc.annotations.Weak
    private com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.Executor executor;
    private final java.lang.reflect.Method method;

    @com.google.common.annotations.VisibleForTesting
    public final java.lang.Object target;


    @com.google.common.annotations.VisibleForTesting
    public static final class SynchronizedSubscriber extends com.google.common.eventbus.Subscriber {
        private SynchronizedSubscriber(com.google.common.eventbus.EventBus r2, java.lang.Object r3, java.lang.reflect.Method r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public /* synthetic */ SynchronizedSubscriber(com.google.common.eventbus.EventBus r1, java.lang.Object r2, java.lang.reflect.Method r3, com.google.common.eventbus.Subscriber.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.eventbus.Subscriber
        public final void invokeSubscriberMethod(java.lang.Object r1) throws java.lang.reflect.InvocationTargetException {
                r0 = this;
                monitor-enter(r0)
                super.invokeSubscriberMethod(r1)     // Catch: java.lang.Throwable -> L6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
                throw r1
        }
    }

    private Subscriber(com.google.common.eventbus.EventBus r1, java.lang.Object r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.bus = r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.target = r2
            r0.method = r3
            r2 = 1
            r3.setAccessible(r2)
            java.util.concurrent.Executor r1 = r1.executor()
            r0.executor = r1
            return
    }

    public /* synthetic */ Subscriber(com.google.common.eventbus.EventBus r1, java.lang.Object r2, java.lang.reflect.Method r3, com.google.common.eventbus.Subscriber.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ com.google.common.eventbus.SubscriberExceptionContext access$100(com.google.common.eventbus.Subscriber r0, java.lang.Object r1) {
            com.google.common.eventbus.SubscriberExceptionContext r0 = r0.context(r1)
            return r0
    }

    public static /* synthetic */ com.google.common.eventbus.EventBus access$200(com.google.common.eventbus.Subscriber r0) {
            com.google.common.eventbus.EventBus r0 = r0.bus
            return r0
    }

    private com.google.common.eventbus.SubscriberExceptionContext context(java.lang.Object r5) {
            r4 = this;
            com.google.common.eventbus.SubscriberExceptionContext r0 = new com.google.common.eventbus.SubscriberExceptionContext
            com.google.common.eventbus.EventBus r1 = r4.bus
            java.lang.Object r2 = r4.target
            java.lang.reflect.Method r3 = r4.method
            r0.<init>(r1, r5, r2, r3)
            return r0
    }

    public static com.google.common.eventbus.Subscriber create(com.google.common.eventbus.EventBus r2, java.lang.Object r3, java.lang.reflect.Method r4) {
            boolean r0 = isDeclaredThreadSafe(r4)
            if (r0 == 0) goto Lc
            com.google.common.eventbus.Subscriber r0 = new com.google.common.eventbus.Subscriber
            r0.<init>(r2, r3, r4)
            goto L12
        Lc:
            com.google.common.eventbus.Subscriber$SynchronizedSubscriber r0 = new com.google.common.eventbus.Subscriber$SynchronizedSubscriber
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
        L12:
            return r0
    }

    private static boolean isDeclaredThreadSafe(java.lang.reflect.Method r1) {
            java.lang.Class<com.google.common.eventbus.AllowConcurrentEvents> r0 = com.google.common.eventbus.AllowConcurrentEvents.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public final void dispatchEvent(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            com.google.common.eventbus.Subscriber$1 r1 = new com.google.common.eventbus.Subscriber$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.eventbus.Subscriber
            r1 = 0
            if (r0 == 0) goto L18
            com.google.common.eventbus.Subscriber r4 = (com.google.common.eventbus.Subscriber) r4
            java.lang.Object r0 = r3.target
            java.lang.Object r2 = r4.target
            if (r0 != r2) goto L18
            java.lang.reflect.Method r0 = r3.method
            java.lang.reflect.Method r4 = r4.method
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.Object r1 = r2.target
            int r1 = java.lang.System.identityHashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    public void invokeSubscriberMethod(java.lang.Object r6) throws java.lang.reflect.InvocationTargetException {
            r5 = this;
            java.lang.reflect.Method r0 = r5.method     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            java.lang.Object r1 = r5.target     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            r3 = 0
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L23 java.lang.IllegalArgumentException -> L3a
            return
        L12:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L22
            java.lang.Throwable r6 = r6.getCause()
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        L22:
            throw r6
        L23:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r2 = r6.length()
            int r2 = r2 + 28
            java.lang.String r3 = "Method became inaccessible: "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r6)
            r1.<init>(r6, r0)
            throw r1
        L3a:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r2 = r6.length()
            int r2 = r2 + 33
            java.lang.String r3 = "Method rejected target/argument: "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r6)
            r1.<init>(r6, r0)
            throw r1
    }
}
