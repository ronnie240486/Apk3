package com.google.common.eventbus;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    /* JADX INFO: renamed from: com.google.common.eventbus.Dispatcher$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ImmediateDispatcher extends com.google.common.eventbus.Dispatcher {
        private static final com.google.common.eventbus.Dispatcher.ImmediateDispatcher INSTANCE = null;

        static {
                com.google.common.eventbus.Dispatcher$ImmediateDispatcher r0 = new com.google.common.eventbus.Dispatcher$ImmediateDispatcher
                r0.<init>()
                com.google.common.eventbus.Dispatcher.ImmediateDispatcher.INSTANCE = r0
                return
        }

        private ImmediateDispatcher() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.eventbus.Dispatcher
        public final void dispatch(java.lang.Object r2, java.util.Iterator<com.google.common.eventbus.Subscriber> r3) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
            L3:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                java.lang.Object r0 = r3.next()
                com.google.common.eventbus.Subscriber r0 = (com.google.common.eventbus.Subscriber) r0
                r0.dispatchEvent(r2)
                goto L3
            L13:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LegacyAsyncDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.util.concurrent.ConcurrentLinkedQueue<com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber> queue;

        /* JADX INFO: loaded from: classes.dex */
        public static final class EventWithSubscriber {
            private final java.lang.Object event;
            private final com.google.common.eventbus.Subscriber subscriber;

            private EventWithSubscriber(java.lang.Object r1, com.google.common.eventbus.Subscriber r2) {
                    r0 = this;
                    r0.<init>()
                    r0.event = r1
                    r0.subscriber = r2
                    return
            }

            public /* synthetic */ EventWithSubscriber(java.lang.Object r1, com.google.common.eventbus.Subscriber r2, com.google.common.eventbus.Dispatcher.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static /* synthetic */ java.lang.Object access$700(com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber r0) {
                    java.lang.Object r0 = r0.event
                    return r0
            }

            public static /* synthetic */ com.google.common.eventbus.Subscriber access$800(com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber r0) {
                    com.google.common.eventbus.Subscriber r0 = r0.subscriber
                    return r0
            }
        }

        private LegacyAsyncDispatcher() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r0 = com.google.common.collect.Queues.newConcurrentLinkedQueue()
                r1.queue = r0
                return
        }

        public /* synthetic */ LegacyAsyncDispatcher(com.google.common.eventbus.Dispatcher.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.eventbus.Dispatcher
        public final void dispatch(java.lang.Object r5, java.util.Iterator<com.google.common.eventbus.Subscriber> r6) {
                r4 = this;
                com.google.common.base.Preconditions.checkNotNull(r5)
            L3:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L1b
                java.util.concurrent.ConcurrentLinkedQueue<com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher$EventWithSubscriber> r0 = r4.queue
                com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher$EventWithSubscriber r1 = new com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher$EventWithSubscriber
                java.lang.Object r2 = r6.next()
                com.google.common.eventbus.Subscriber r2 = (com.google.common.eventbus.Subscriber) r2
                r3 = 0
                r1.<init>(r5, r2, r3)
                r0.add(r1)
                goto L3
            L1b:
                java.util.concurrent.ConcurrentLinkedQueue<com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher$EventWithSubscriber> r5 = r4.queue
                java.lang.Object r5 = r5.poll()
                com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher$EventWithSubscriber r5 = (com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber) r5
                if (r5 == 0) goto L31
                com.google.common.eventbus.Subscriber r6 = com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber.access$800(r5)
                java.lang.Object r5 = com.google.common.eventbus.Dispatcher.LegacyAsyncDispatcher.EventWithSubscriber.access$700(r5)
                r6.dispatchEvent(r5)
                goto L1b
            L31:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PerThreadQueuedDispatcher extends com.google.common.eventbus.Dispatcher {
        private final java.lang.ThreadLocal<java.lang.Boolean> dispatching;
        private final java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event>> queue;



        /* JADX INFO: loaded from: classes3.dex */
        public static final class Event {
            private final java.lang.Object event;
            private final java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers;

            private Event(java.lang.Object r1, java.util.Iterator<com.google.common.eventbus.Subscriber> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.event = r1
                    r0.subscribers = r2
                    return
            }

            public /* synthetic */ Event(java.lang.Object r1, java.util.Iterator r2, com.google.common.eventbus.Dispatcher.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static /* synthetic */ java.util.Iterator access$400(com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event r0) {
                    java.util.Iterator<com.google.common.eventbus.Subscriber> r0 = r0.subscribers
                    return r0
            }

            public static /* synthetic */ java.lang.Object access$500(com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event r0) {
                    java.lang.Object r0 = r0.event
                    return r0
            }
        }

        private PerThreadQueuedDispatcher() {
                r1 = this;
                r1.<init>()
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1 r0 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1
                r0.<init>()
                r1.queue = r0
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2 r0 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2
                r0.<init>()
                r1.dispatching = r0
                return
        }

        public /* synthetic */ PerThreadQueuedDispatcher(com.google.common.eventbus.Dispatcher.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.eventbus.Dispatcher
        public final void dispatch(java.lang.Object r4, java.util.Iterator<com.google.common.eventbus.Subscriber> r5) {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r0 = r3.queue
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event r1 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event
                r2 = 0
                r1.<init>(r4, r5, r2)
                r0.offer(r1)
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.dispatching
                java.lang.Object r4 = r4.get()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L67
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.dispatching
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r4.set(r5)
            L2c:
                java.lang.Object r4 = r0.poll()     // Catch: java.lang.Throwable -> L5b
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event r4 = (com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event) r4     // Catch: java.lang.Throwable -> L5b
                if (r4 == 0) goto L50
            L34:
                java.util.Iterator r5 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.access$400(r4)     // Catch: java.lang.Throwable -> L5b
                boolean r5 = r5.hasNext()     // Catch: java.lang.Throwable -> L5b
                if (r5 == 0) goto L2c
                java.util.Iterator r5 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.access$400(r4)     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L5b
                com.google.common.eventbus.Subscriber r5 = (com.google.common.eventbus.Subscriber) r5     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r1 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.access$500(r4)     // Catch: java.lang.Throwable -> L5b
                r5.dispatchEvent(r1)     // Catch: java.lang.Throwable -> L5b
                goto L34
            L50:
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.dispatching
                r4.remove()
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r4 = r3.queue
                r4.remove()
                goto L67
            L5b:
                r4 = move-exception
                java.lang.ThreadLocal<java.lang.Boolean> r5 = r3.dispatching
                r5.remove()
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r5 = r3.queue
                r5.remove()
                throw r4
            L67:
                return
        }
    }

    public Dispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.eventbus.Dispatcher legacyAsync() {
            com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher r0 = new com.google.common.eventbus.Dispatcher$LegacyAsyncDispatcher
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public abstract void dispatch(java.lang.Object r1, java.util.Iterator<com.google.common.eventbus.Subscriber> r2);
}
