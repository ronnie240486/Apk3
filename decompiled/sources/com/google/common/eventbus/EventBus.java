package com.google.common.eventbus;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class EventBus {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.eventbus.Dispatcher dispatcher;
    private final com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler;
    private final java.util.concurrent.Executor executor;
    private final java.lang.String identifier;
    private final com.google.common.eventbus.SubscriberRegistry subscribers;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class LoggingHandler implements com.google.common.eventbus.SubscriberExceptionHandler {
        public static final com.google.common.eventbus.EventBus.LoggingHandler INSTANCE = null;

        static {
                com.google.common.eventbus.EventBus$LoggingHandler r0 = new com.google.common.eventbus.EventBus$LoggingHandler
                r0.<init>()
                com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE = r0
                return
        }

        public LoggingHandler() {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.util.logging.Logger logger(com.google.common.eventbus.SubscriberExceptionContext r3) {
                java.lang.Class<com.google.common.eventbus.EventBus> r0 = com.google.common.eventbus.EventBus.class
                java.lang.String r0 = r0.getName()
                com.google.common.eventbus.EventBus r3 = r3.getEventBus()
                java.lang.String r3 = r3.identifier()
                int r1 = r0.length()
                int r1 = r1 + 1
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r0)
                java.lang.String r0 = "."
                r2.append(r0)
                r2.append(r3)
                java.lang.String r3 = r2.toString()
                java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
                return r3
        }

        private static java.lang.String message(com.google.common.eventbus.SubscriberExceptionContext r5) {
                java.lang.reflect.Method r0 = r5.getSubscriberMethod()
                java.lang.String r1 = r0.getName()
                java.lang.Class[] r0 = r0.getParameterTypes()
                r2 = 0
                r0 = r0[r2]
                java.lang.String r0 = r0.getName()
                java.lang.Object r2 = r5.getSubscriber()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.Object r5 = r5.getEvent()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r3 = 80
                int r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r3)
                int r4 = r0.length()
                int r4 = r4 + r3
                int r3 = r2.length()
                int r3 = r3 + r4
                int r4 = r5.length()
                int r4 = r4 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r4)
                java.lang.String r4 = "Exception thrown by subscriber method "
                r3.append(r4)
                r3.append(r1)
                r1 = 40
                r3.append(r1)
                r3.append(r0)
                r0 = 41
                r3.append(r0)
                java.lang.String r0 = " on subscriber "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = " when dispatching event: "
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                return r5
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(java.lang.Throwable r4, com.google.common.eventbus.SubscriberExceptionContext r5) {
                r3 = this;
                java.util.logging.Logger r0 = logger(r5)
                java.util.logging.Level r1 = java.util.logging.Level.SEVERE
                boolean r2 = r0.isLoggable(r1)
                if (r2 == 0) goto L13
                java.lang.String r5 = message(r5)
                r0.log(r1, r5, r4)
            L13:
                return
        }
    }

    static {
            java.lang.Class<com.google.common.eventbus.EventBus> r0 = com.google.common.eventbus.EventBus.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.eventbus.EventBus.logger = r0
            return
    }

    public EventBus() {
            r1 = this;
            java.lang.String r0 = "default"
            r1.<init>(r0)
            return
    }

    public EventBus(com.google.common.eventbus.SubscriberExceptionHandler r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher r1 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = "default"
            r3.<init>(r2, r0, r1, r4)
            return
    }

    public EventBus(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher r1 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher
            r2 = 0
            r1.<init>(r2)
            com.google.common.eventbus.EventBus$LoggingHandler r2 = com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public EventBus(java.lang.String r2, java.util.concurrent.Executor r3, com.google.common.eventbus.Dispatcher r4, com.google.common.eventbus.SubscriberExceptionHandler r5) {
            r1 = this;
            r1.<init>()
            com.google.common.eventbus.SubscriberRegistry r0 = new com.google.common.eventbus.SubscriberRegistry
            r0.<init>(r1)
            r1.subscribers = r0
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.identifier = r2
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r1.executor = r2
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.eventbus.Dispatcher r2 = (com.google.common.eventbus.Dispatcher) r2
            r1.dispatcher = r2
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.eventbus.SubscriberExceptionHandler r2 = (com.google.common.eventbus.SubscriberExceptionHandler) r2
            r1.exceptionHandler = r2
            return
    }

    public final java.util.concurrent.Executor executor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    public final void handleSubscriberException(java.lang.Throwable r6, com.google.common.eventbus.SubscriberExceptionContext r7) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.eventbus.SubscriberExceptionHandler r0 = r5.exceptionHandler     // Catch: java.lang.Throwable -> Lc
            r0.handleException(r6, r7)     // Catch: java.lang.Throwable -> Lc
            goto L25
        Lc:
            r7 = move-exception
            java.util.logging.Logger r0 = com.google.common.eventbus.EventBus.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.util.Locale r2 = java.util.Locale.ROOT
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r4 = 1
            r3[r4] = r6
            java.lang.String r6 = "Exception %s thrown while handling exception: %s"
            java.lang.String r6 = java.lang.String.format(r2, r6, r3)
            r0.log(r1, r6, r7)
        L25:
            return
    }

    public final java.lang.String identifier() {
            r1 = this;
            java.lang.String r0 = r1.identifier
            return r0
    }

    public void post(java.lang.Object r3) {
            r2 = this;
            com.google.common.eventbus.SubscriberRegistry r0 = r2.subscribers
            java.util.Iterator r0 = r0.getSubscribers(r3)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L12
            com.google.common.eventbus.Dispatcher r1 = r2.dispatcher
            r1.dispatch(r3, r0)
            goto L1e
        L12:
            boolean r0 = r3 instanceof com.google.common.eventbus.DeadEvent
            if (r0 != 0) goto L1e
            com.google.common.eventbus.DeadEvent r0 = new com.google.common.eventbus.DeadEvent
            r0.<init>(r2, r3)
            r2.post(r0)
        L1e:
            return
    }

    public void register(java.lang.Object r2) {
            r1 = this;
            com.google.common.eventbus.SubscriberRegistry r0 = r1.subscribers
            r0.register(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r2)
            java.lang.String r1 = r2.identifier
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregister(java.lang.Object r2) {
            r1 = this;
            com.google.common.eventbus.SubscriberRegistry r0 = r1.subscribers
            r0.unregister(r2)
            return
    }
}
