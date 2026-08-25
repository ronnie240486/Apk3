package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class AbstractService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_NEW_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STOPPING_EVENT = null;
    private final com.google.common.util.concurrent.Monitor.Guard hasReachedRunning;
    private final com.google.common.util.concurrent.Monitor.Guard isStartable;
    private final com.google.common.util.concurrent.Monitor.Guard isStoppable;
    private final com.google.common.util.concurrent.Monitor.Guard isStopped;
    private final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener> listeners;
    private final com.google.common.util.concurrent.Monitor monitor;
    private volatile com.google.common.util.concurrent.AbstractService.StateSnapshot snapshot;






    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State = null;

        static {
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State = r0
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class HasReachedRunningGuard extends com.google.common.util.concurrent.Monitor.Guard {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        public HasReachedRunningGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public final class IsStartableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        public IsStartableGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }
    }

    public final class IsStoppableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        public IsStoppableGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.compareTo(r1)
                if (r0 > 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public final class IsStoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        public IsStoppedGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public static final class StateSnapshot {

        @javax.annotation.CheckForNull
        public final java.lang.Throwable failure;
        public final boolean shutdownWhenStartupFinishes;
        public final com.google.common.util.concurrent.Service.State state;

        public StateSnapshot(com.google.common.util.concurrent.Service.State r3) {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
        }

        public StateSnapshot(com.google.common.util.concurrent.Service.State r5, boolean r6, @javax.annotation.CheckForNull java.lang.Throwable r7) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r1 = 1
                if (r6 == 0) goto Le
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STARTING
                if (r5 != r2) goto Lc
                goto Le
            Lc:
                r2 = 0
                goto Lf
            Le:
                r2 = 1
            Lf:
                java.lang.String r3 = "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead."
                com.google.common.base.Preconditions.checkArgument(r2, r3, r5)
                if (r7 == 0) goto L19
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.FAILED
                if (r5 != r3) goto L20
                r3 = 1
                goto L21
            L20:
                r3 = 0
            L21:
                if (r2 != r3) goto L24
                r0 = 1
            L24:
                java.lang.String r1 = "A failure cause should be set if and only if the state is failed.  Got %s and %s instead."
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r7)
                r4.state = r5
                r4.shutdownWhenStartupFinishes = r6
                r4.failure = r7
                return
        }
    }

    static {
            com.google.common.util.concurrent.AbstractService$1 r0 = new com.google.common.util.concurrent.AbstractService$1
            r0.<init>()
            com.google.common.util.concurrent.AbstractService.STARTING_EVENT = r0
            com.google.common.util.concurrent.AbstractService$2 r0 = new com.google.common.util.concurrent.AbstractService$2
            r0.<init>()
            com.google.common.util.concurrent.AbstractService.RUNNING_EVENT = r0
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STARTING
            com.google.common.util.concurrent.ListenerCallQueue$Event r1 = stoppingEvent(r0)
            com.google.common.util.concurrent.AbstractService.STOPPING_FROM_STARTING_EVENT = r1
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
            com.google.common.util.concurrent.ListenerCallQueue$Event r2 = stoppingEvent(r1)
            com.google.common.util.concurrent.AbstractService.STOPPING_FROM_RUNNING_EVENT = r2
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.NEW
            com.google.common.util.concurrent.ListenerCallQueue$Event r2 = terminatedEvent(r2)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_NEW_EVENT = r2
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r0)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STARTING_EVENT = r0
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r1)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_RUNNING_EVENT = r0
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STOPPING
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r0)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STOPPING_EVENT = r0
            return
    }

    public AbstractService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.Monitor r0 = new com.google.common.util.concurrent.Monitor
            r0.<init>()
            r2.monitor = r0
            com.google.common.util.concurrent.AbstractService$IsStartableGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStartableGuard
            r0.<init>(r2)
            r2.isStartable = r0
            com.google.common.util.concurrent.AbstractService$IsStoppableGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStoppableGuard
            r0.<init>(r2)
            r2.isStoppable = r0
            com.google.common.util.concurrent.AbstractService$HasReachedRunningGuard r0 = new com.google.common.util.concurrent.AbstractService$HasReachedRunningGuard
            r0.<init>(r2)
            r2.hasReachedRunning = r0
            com.google.common.util.concurrent.AbstractService$IsStoppedGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStoppedGuard
            r0.<init>(r2)
            r2.isStopped = r0
            com.google.common.util.concurrent.ListenerCallQueue r0 = new com.google.common.util.concurrent.ListenerCallQueue
            r0.<init>()
            r2.listeners = r0
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
            r0.<init>(r1)
            r2.snapshot = r0
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.Monitor access$000(com.google.common.util.concurrent.AbstractService r0) {
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            return r0
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
    private void checkCurrentState(com.google.common.util.concurrent.Service.State r8) {
            r7 = this;
            com.google.common.util.concurrent.Service$State r0 = r7.state()
            if (r0 == r8) goto L64
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
            java.lang.String r2 = " to be "
            java.lang.String r3 = "Expected the service "
            if (r0 != r1) goto L38
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r4 = r1.length()
            int r4 = r4 + 56
            int r5 = r8.length()
            int r5 = r5 + r4
            java.lang.StringBuilder r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r5, r3, r1, r2, r8)
            java.lang.String r1 = ", but the service has FAILED"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.Throwable r1 = r7.failureCause()
            r0.<init>(r8, r1)
            throw r0
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r4.length()
            int r5 = r5 + 38
            int r6 = r8.length()
            int r6 = r6 + r5
            int r5 = r0.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r5, r3, r4, r2, r8)
            java.lang.String r2 = ", but was "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r2, r0)
            r1.<init>(r8)
            throw r1
        L64:
            return
    }

    private void dispatchListenerEvents() {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r1.monitor
            boolean r0 = r0.isOccupiedByCurrentThread()
            if (r0 != 0) goto Ld
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r1.listeners
            r0.dispatch()
        Ld:
            return
    }

    private void enqueueFailedEvent(com.google.common.util.concurrent.Service.State r3, java.lang.Throwable r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.AbstractService$5 r1 = new com.google.common.util.concurrent.AbstractService$5
            r1.<init>(r3, r4)
            r0.enqueue(r1)
            return
    }

    private void enqueueRunningEvent() {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r1 = com.google.common.util.concurrent.AbstractService.RUNNING_EVENT
            r0.enqueue(r1)
            return
    }

    private void enqueueStartingEvent() {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r1 = com.google.common.util.concurrent.AbstractService.STARTING_EVENT
            r0.enqueue(r1)
            return
    }

    private void enqueueStoppingEvent(com.google.common.util.concurrent.Service.State r2) {
            r1 = this;
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STARTING
            if (r2 != r0) goto Lc
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.STOPPING_FROM_STARTING_EVENT
            r2.enqueue(r0)
            goto L17
        Lc:
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING
            if (r2 != r0) goto L18
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.STOPPING_FROM_RUNNING_EVENT
            r2.enqueue(r0)
        L17:
            return
        L18:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    private void enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State r2) {
            r1 = this;
            int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L2a;
                case 2: goto L22;
                case 3: goto L1a;
                case 4: goto L12;
                case 5: goto Lc;
                case 6: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L31
        Lc:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L12:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STOPPING_EVENT
            r2.enqueue(r0)
            goto L31
        L1a:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_RUNNING_EVENT
            r2.enqueue(r0)
            goto L31
        L22:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STARTING_EVENT
            r2.enqueue(r0)
            goto L31
        L2a:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_NEW_EVENT
            r2.enqueue(r0)
        L31:
            return
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> stoppingEvent(com.google.common.util.concurrent.Service.State r1) {
            com.google.common.util.concurrent.AbstractService$4 r0 = new com.google.common.util.concurrent.AbstractService$4
            r0.<init>(r1)
            return r0
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> terminatedEvent(com.google.common.util.concurrent.Service.State r1) {
            com.google.common.util.concurrent.AbstractService$3 r0 = new com.google.common.util.concurrent.AbstractService$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r1.listeners
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.hasReachedRunning
            r0.enterWhenUninterruptibly(r1)
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L12
            r2.checkCurrentState(r0)     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            r0.leave()
            return
        L12:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r2.monitor
            r1.leave()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.hasReachedRunning
            boolean r3 = r0.enterWhenUninterruptibly(r1, r3, r5)
            if (r3 == 0) goto L1c
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L15
            r2.checkCurrentState(r3)     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.Monitor r3 = r2.monitor
            r3.leave()
            return
        L15:
            r3 = move-exception
            com.google.common.util.concurrent.Monitor r4 = r2.monitor
            r4.leave()
            throw r3
        L1c:
            java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r5 = r4.length()
            int r5 = r5 + 50
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r1 = " to reach the RUNNING state."
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r0, r4, r1)
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.isStopped
            r0.enterWhenUninterruptibly(r1)
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L12
            r2.checkCurrentState(r0)     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            r0.leave()
            return
        L12:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r2.monitor
            r1.leave()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r4, java.util.concurrent.TimeUnit r6) throws java.util.concurrent.TimeoutException {
            r3 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r3.isStopped
            boolean r4 = r0.enterWhenUninterruptibly(r1, r4, r6)
            if (r4 == 0) goto L1c
            com.google.common.util.concurrent.Service$State r4 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L15
            r3.checkCurrentState(r4)     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.Monitor r4 = r3.monitor
            r4.leave()
            return
        L15:
            r4 = move-exception
            com.google.common.util.concurrent.Monitor r5 = r3.monitor
            r5.leave()
            throw r4
        L1c:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
            java.lang.String r5 = java.lang.String.valueOf(r3)
            com.google.common.util.concurrent.Service$State r6 = r3.state()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r0 = r5.length()
            int r0 = r0 + 65
            int r1 = r6.length()
            int r1 = r1 + r0
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r2 = " to reach a terminal state. Current state: "
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r5, r2, r6)
            r4.<init>(r5)
            throw r4
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract void doStart();

    @com.google.errorprone.annotations.ForOverride
    public abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r4 = this;
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r4.snapshot
            com.google.common.util.concurrent.Service$State r1 = r0.state
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.FAILED
            if (r1 != r2) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            java.lang.String r3 = "failureCause() is only valid if the service has failed, service is %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r1)
            java.lang.Throwable r0 = r0.failure
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r2 = this;
            com.google.common.util.concurrent.Service$State r0 = r2.state()
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final void notifyFailed(java.lang.Throwable r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.enter()
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L5b
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L5b
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L5b
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r1 == r2) goto L3a
            r2 = 2
            if (r1 == r2) goto L24
            r2 = 3
            if (r1 == r2) goto L24
            r2 = 4
            if (r1 == r2) goto L24
            r2 = 5
            if (r1 == r2) goto L3a
            goto L31
        L24:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r1 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L5b
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L5b
            r4.snapshot = r1     // Catch: java.lang.Throwable -> L5b
            r4.enqueueFailedEvent(r0, r5)     // Catch: java.lang.Throwable -> L5b
        L31:
            com.google.common.util.concurrent.Monitor r5 = r4.monitor
            r5.leave()
            r4.dispatchListenerEvents()
            return
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5b
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "Failed while in state:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L5b
            r3.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L5b:
            r5 = move-exception
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            throw r5
    }

    public final void notifyStarted() {
            r4 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.enter()
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r4.snapshot     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.Service$State r0 = r0.state     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L5d
            if (r0 != r1) goto L35
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r4.snapshot     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.shutdownWhenStartupFinishes     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L20
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L5d
            r4.doStop()     // Catch: java.lang.Throwable -> L5d
            goto L2c
        L20:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L5d
            r4.enqueueRunningEvent()     // Catch: java.lang.Throwable -> L5d
        L2c:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            return
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.AbstractService$StateSnapshot r1 = r4.snapshot     // Catch: java.lang.Throwable -> L5d
            com.google.common.util.concurrent.Service$State r1 = r1.state     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L5d
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + 43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "Cannot notifyStarted() when the service is "
            r3.append(r2)     // Catch: java.lang.Throwable -> L5d
            r3.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r4.notifyFailed(r0)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r4.monitor
            r1.leave()
            r4.dispatchListenerEvents()
            throw r0
    }

    public final void notifyStopped() {
            r4 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.enter()
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L4c
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L4c
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L4c
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L4c
            switch(r1) {
                case 1: goto L22;
                case 2: goto L15;
                case 3: goto L15;
                case 4: goto L15;
                case 5: goto L22;
                case 6: goto L22;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L4c
        L14:
            goto L43
        L15:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r1 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L4c
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r4.snapshot = r1     // Catch: java.lang.Throwable -> L4c
            r4.enqueueTerminatedEvent(r0)     // Catch: java.lang.Throwable -> L4c
            goto L43
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L4c
            int r2 = r2 + 43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "Cannot notifyStopped() when the service is "
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Throwable -> L4c
        L43:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            return
        L4c:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r4.monitor
            r1.leave()
            r4.dispatchListenerEvents()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r5 = this;
            com.google.common.util.concurrent.Monitor r0 = r5.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r5.isStartable
            boolean r0 = r0.enterIf(r1)
            if (r0 == 0) goto L31
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L1a
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            r5.snapshot = r0     // Catch: java.lang.Throwable -> L1a
            r5.enqueueStartingEvent()     // Catch: java.lang.Throwable -> L1a
            r5.doStart()     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            r5.notifyFailed(r0)     // Catch: java.lang.Throwable -> L27
        L1e:
            com.google.common.util.concurrent.Monitor r0 = r5.monitor
            r0.leave()
            r5.dispatchListenerEvents()
            return r5
        L27:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r5.monitor
            r1.leave()
            r5.dispatchListenerEvents()
            throw r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            int r2 = r2 + 33
            java.lang.String r3 = "Service "
            java.lang.String r4 = " has already been started"
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1, r4)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r3 = this;
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r3.snapshot
            boolean r1 = r0.shutdownWhenStartupFinishes
            if (r1 == 0) goto Lf
            com.google.common.util.concurrent.Service$State r1 = r0.state
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STARTING
            if (r1 != r2) goto Lf
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STOPPING
            goto L11
        Lf:
            com.google.common.util.concurrent.Service$State r0 = r0.state
        L11:
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r4 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r4.isStoppable
            boolean r0 = r0.enterIf(r1)
            if (r0 == 0) goto L82
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L6b
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L6b
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L6b
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L6b
            switch(r1) {
                case 1: goto L5c;
                case 2: goto L4d;
                case 3: goto L3b;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L1a;
                default: goto L19;
            }     // Catch: java.lang.Throwable -> L6b
        L19:
            goto L6f
        L1a:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6b
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L6b
            int r2 = r2 + 45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "isStoppable is incorrectly implemented, saw: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L6b
            r3.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L3b:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L6b
            r4.enqueueStoppingEvent(r0)     // Catch: java.lang.Throwable -> L6b
            r4.doStop()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L4d:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L6b
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L6b
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L6b
            r4.enqueueStoppingEvent(r1)     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L5c:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> L6b
            r4.enqueueTerminatedEvent(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            r4.notifyFailed(r0)     // Catch: java.lang.Throwable -> L78
        L6f:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            goto L82
        L78:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r4.monitor
            r1.leave()
            r4.dispatchListenerEvents()
            throw r0
        L82:
            return r4
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            com.google.common.util.concurrent.Service$State r1 = r5.state()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r2 = r2 + 3
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = " ["
            java.lang.String r4 = "]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
            return r0
    }
}
