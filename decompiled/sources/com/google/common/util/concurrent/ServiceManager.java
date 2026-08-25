package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class ServiceManager implements com.google.common.util.concurrent.ServiceManagerBridge {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> HEALTHY_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> STOPPED_EVENT = null;
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> services;
    private final com.google.common.util.concurrent.ServiceManager.ServiceManagerState state;



    public static final class EmptyServiceManagerWarning extends java.lang.Throwable {
        private EmptyServiceManagerWarning() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ EmptyServiceManagerWarning(com.google.common.util.concurrent.ServiceManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static abstract class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void failure(com.google.common.util.concurrent.Service r1) {
                r0 = this;
                return
        }

        public void healthy() {
                r0 = this;
                return
        }

        public void stopped() {
                r0 = this;
                return
        }
    }

    public static final class NoOpService extends com.google.common.util.concurrent.AbstractService {
        private NoOpService() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ NoOpService(com.google.common.util.concurrent.ServiceManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
                r0 = this;
                r0.notifyStarted()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
                r0 = this;
                r0.notifyStopped()
                return
        }
    }

    public static final class ServiceListener extends com.google.common.util.concurrent.Service.Listener {
        public final com.google.common.util.concurrent.Service service;
        public final java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> state;

        public ServiceListener(com.google.common.util.concurrent.Service r1, java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> r2) {
                r0 = this;
                r0.<init>()
                r0.service = r1
                r0.state = r2
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(com.google.common.util.concurrent.Service.State r9, java.lang.Throwable r10) {
                r8 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r8.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L48
                com.google.common.util.concurrent.Service r1 = r8.service
                boolean r1 = r1 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                r1 = r1 ^ 1
                if (r1 == 0) goto L41
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                com.google.common.util.concurrent.Service r3 = r8.service
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r4 = java.lang.String.valueOf(r9)
                int r5 = r3.length()
                int r5 = r5 + 34
                int r6 = r4.length()
                int r6 = r6 + r5
                java.lang.String r5 = "Service "
                java.lang.String r7 = " has failed in the "
                java.lang.StringBuilder r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r6, r5, r3, r7, r4)
                java.lang.String r4 = " state."
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.log(r2, r3, r10)
            L41:
                com.google.common.util.concurrent.Service r10 = r8.service
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                r0.transitionService(r10, r9, r1)
            L48:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r4.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L13
                com.google.common.util.concurrent.Service r1 = r4.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STARTING
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.RUNNING
                r0.transitionService(r1, r2, r3)
            L13:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r4.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L26
                com.google.common.util.concurrent.Service r1 = r4.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.NEW
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.STARTING
                r0.transitionService(r1, r2, r3)
                com.google.common.util.concurrent.Service r0 = r4.service
                boolean r0 = r0 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                if (r0 != 0) goto L26
                java.util.logging.Logger r0 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r1 = java.util.logging.Level.FINE
                com.google.common.util.concurrent.Service r2 = r4.service
                java.lang.String r3 = "Starting {0}."
                r0.log(r1, r3, r2)
            L26:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(com.google.common.util.concurrent.Service.State r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r3.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L11
                com.google.common.util.concurrent.Service r1 = r3.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STOPPING
                r0.transitionService(r1, r4, r2)
            L11:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(com.google.common.util.concurrent.Service.State r7) {
                r6 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r6.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L2d
                com.google.common.util.concurrent.Service r1 = r6.service
                boolean r1 = r1 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                if (r1 != 0) goto L26
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r2 = java.util.logging.Level.FINE
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                com.google.common.util.concurrent.Service r5 = r6.service
                r3[r4] = r5
                r4 = 1
                r3[r4] = r7
                java.lang.String r4 = "Service {0} has terminated. Previous state was: {1}"
                r1.log(r2, r4, r3)
            L26:
                com.google.common.util.concurrent.Service r1 = r6.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.TERMINATED
                r0.transitionService(r1, r7, r2)
            L2d:
                return
        }
    }

    public static final class ServiceManagerState {
        public final com.google.common.util.concurrent.Monitor.Guard awaitHealthGuard;
        public final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager.Listener> listeners;
        public final com.google.common.util.concurrent.Monitor monitor;
        public final int numberOfServices;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public boolean ready;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public final com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public final java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> startupTimers;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public final com.google.common.collect.Multiset<com.google.common.util.concurrent.Service.State> states;
        public final com.google.common.util.concurrent.Monitor.Guard stoppedGuard;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public boolean transitioned;



        /* JADX INFO: loaded from: classes.dex */
        public final class AwaitHealthGuard extends com.google.common.util.concurrent.Monitor.Guard {
            public final /* synthetic */ com.google.common.util.concurrent.ServiceManager.ServiceManagerState this$0;

            public AwaitHealthGuard(com.google.common.util.concurrent.ServiceManager.ServiceManagerState r1) {
                    r0 = this;
                    r0.this$0 = r1
                    com.google.common.util.concurrent.Monitor r1 = r1.monitor
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @com.google.errorprone.annotations.concurrent.GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                    r3 = this;
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                    int r0 = r0.count(r1)
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r1 = r3.this$0
                    int r2 = r1.numberOfServices
                    if (r0 == r2) goto L35
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r1.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L35
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L35
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L33
                    goto L35
                L33:
                    r0 = 0
                    goto L36
                L35:
                    r0 = 1
                L36:
                    return r0
            }
        }

        public final class StoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
            public final /* synthetic */ com.google.common.util.concurrent.ServiceManager.ServiceManagerState this$0;

            public StoppedGuard(com.google.common.util.concurrent.ServiceManager.ServiceManagerState r1) {
                    r0 = this;
                    r0.this$0 = r1
                    com.google.common.util.concurrent.Monitor r1 = r1.monitor
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @com.google.errorprone.annotations.concurrent.GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                    r3 = this;
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                    int r0 = r0.count(r1)
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r1 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r1 = r1.states
                    com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.FAILED
                    int r1 = r1.count(r2)
                    int r1 = r1 + r0
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    int r0 = r0.numberOfServices
                    if (r1 != r0) goto L1d
                    r0 = 1
                    goto L1e
                L1d:
                    r0 = 0
                L1e:
                    return r0
            }
        }

        public ServiceManagerState(com.google.common.collect.ImmutableCollection<com.google.common.util.concurrent.Service> r3) {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.Monitor r0 = new com.google.common.util.concurrent.Monitor
                r0.<init>()
                r2.monitor = r0
                java.lang.Class<com.google.common.util.concurrent.Service$State> r0 = com.google.common.util.concurrent.Service.State.class
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = com.google.common.collect.MultimapBuilder.enumKeys(r0)
                com.google.common.collect.MultimapBuilder$SetMultimapBuilder r0 = r0.linkedHashSetValues()
                com.google.common.collect.SetMultimap r0 = r0.build()
                r2.servicesByState = r0
                com.google.common.collect.Multiset r1 = r0.keys()
                r2.states = r1
                java.util.IdentityHashMap r1 = com.google.common.collect.Maps.newIdentityHashMap()
                r2.startupTimers = r1
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$AwaitHealthGuard r1 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$AwaitHealthGuard
                r1.<init>(r2)
                r2.awaitHealthGuard = r1
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$StoppedGuard r1 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$StoppedGuard
                r1.<init>(r2)
                r2.stoppedGuard = r1
                com.google.common.util.concurrent.ListenerCallQueue r1 = new com.google.common.util.concurrent.ListenerCallQueue
                r1.<init>()
                r2.listeners = r1
                int r1 = r3.size()
                r2.numberOfServices = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
                r0.putAll(r1, r3)
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        public final void checkHealthy() {
                r4 = this;
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r4.states
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.count(r1)
                int r2 = r4.numberOfServices
                if (r0 != r2) goto Ld
                return
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r2 = r4.servicesByState
                com.google.common.base.Predicate r1 = com.google.common.base.Predicates.equalTo(r1)
                com.google.common.base.Predicate r1 = com.google.common.base.Predicates.not(r1)
                com.google.common.collect.SetMultimap r1 = com.google.common.collect.Multimaps.filterKeys(r2, r1)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                int r2 = r2 + 79
                java.lang.String r3 = "Expected to be healthy after starting. The following services are not running: "
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1)
                r0.<init>(r1)
                throw r0
        }

        public final void dispatchListenerEvents() {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                boolean r0 = r0.isOccupiedByCurrentThread()
                r0 = r0 ^ 1
                java.lang.String r1 = "It is incorrect to execute listeners with the monitor held."
                com.google.common.base.Preconditions.checkState(r0, r1)
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r2.listeners
                r0.dispatch()
                return
        }

        public final com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
                r4 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r0 = com.google.common.collect.ImmutableSetMultimap.builder()
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.enter()
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r1 = r4.servicesByState     // Catch: java.lang.Throwable -> L35
                java.util.Set r1 = r1.entries()     // Catch: java.lang.Throwable -> L35
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
            L13:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L35
                boolean r3 = r3 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> L35
                if (r3 != 0) goto L13
                r0.put(r2)     // Catch: java.lang.Throwable -> L35
                goto L13
            L2b:
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.leave()
                com.google.common.collect.ImmutableSetMultimap r0 = r0.build()
                return r0
            L35:
                r0 = move-exception
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.leave()
                throw r0
        }

        public final void transitionService(com.google.common.util.concurrent.Service r8, com.google.common.util.concurrent.Service.State r9, com.google.common.util.concurrent.Service.State r10) {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                r0 = 1
                r1 = 0
                if (r9 == r10) goto L9
                r2 = 1
                goto La
            L9:
                r2 = 0
            La:
                com.google.common.base.Preconditions.checkArgument(r2)
                com.google.common.util.concurrent.Monitor r2 = r7.monitor
                r2.enter()
                r7.transitioned = r0     // Catch: java.lang.Throwable -> Lb1
                boolean r2 = r7.ready     // Catch: java.lang.Throwable -> Lb1
                if (r2 != 0) goto L21
            L18:
                com.google.common.util.concurrent.Monitor r8 = r7.monitor
                r8.leave()
                r7.dispatchListenerEvents()
                return
            L21:
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r2 = r7.servicesByState     // Catch: java.lang.Throwable -> Lb1
                boolean r2 = r2.remove(r9, r8)     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r3 = "Service %s not at the expected location in the state map %s"
                com.google.common.base.Preconditions.checkState(r2, r3, r8, r9)     // Catch: java.lang.Throwable -> Lb1
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r9 = r7.servicesByState     // Catch: java.lang.Throwable -> Lb1
                boolean r9 = r9.put(r10, r8)     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r2 = "Service %s in the state map unexpectedly at %s"
                com.google.common.base.Preconditions.checkState(r9, r2, r8, r10)     // Catch: java.lang.Throwable -> Lb1
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r9 = r7.startupTimers     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> Lb1
                com.google.common.base.Stopwatch r9 = (com.google.common.base.Stopwatch) r9     // Catch: java.lang.Throwable -> Lb1
                if (r9 != 0) goto L4a
                com.google.common.base.Stopwatch r9 = com.google.common.base.Stopwatch.createStarted()     // Catch: java.lang.Throwable -> Lb1
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r2 = r7.startupTimers     // Catch: java.lang.Throwable -> Lb1
                r2.put(r8, r9)     // Catch: java.lang.Throwable -> Lb1
            L4a:
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> Lb1
                int r3 = r10.compareTo(r2)     // Catch: java.lang.Throwable -> Lb1
                if (r3 < 0) goto L71
                boolean r3 = r9.isRunning()     // Catch: java.lang.Throwable -> Lb1
                if (r3 == 0) goto L71
                r9.stop()     // Catch: java.lang.Throwable -> Lb1
                boolean r3 = r8 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> Lb1
                if (r3 != 0) goto L71
                java.util.logging.Logger r3 = com.google.common.util.concurrent.ServiceManager.access$200()     // Catch: java.lang.Throwable -> Lb1
                java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> Lb1
                java.lang.String r5 = "Started {0} in {1}."
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb1
                r6[r1] = r8     // Catch: java.lang.Throwable -> Lb1
                r6[r0] = r9     // Catch: java.lang.Throwable -> Lb1
                r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> Lb1
            L71:
                com.google.common.util.concurrent.Service$State r9 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> Lb1
                if (r10 != r9) goto L7f
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r10 = r7.listeners     // Catch: java.lang.Throwable -> Lb1
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2 r0 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2     // Catch: java.lang.Throwable -> Lb1
                r0.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
                r10.enqueue(r0)     // Catch: java.lang.Throwable -> Lb1
            L7f:
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r8 = r7.states     // Catch: java.lang.Throwable -> Lb1
                int r8 = r8.count(r2)     // Catch: java.lang.Throwable -> Lb1
                int r10 = r7.numberOfServices     // Catch: java.lang.Throwable -> Lb1
                if (r8 != r10) goto L93
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r8 = r7.listeners     // Catch: java.lang.Throwable -> Lb1
                com.google.common.util.concurrent.ListenerCallQueue$Event r9 = com.google.common.util.concurrent.ServiceManager.access$400()     // Catch: java.lang.Throwable -> Lb1
                r8.enqueue(r9)     // Catch: java.lang.Throwable -> Lb1
                goto L18
            L93:
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r8 = r7.states     // Catch: java.lang.Throwable -> Lb1
                com.google.common.util.concurrent.Service$State r10 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> Lb1
                int r8 = r8.count(r10)     // Catch: java.lang.Throwable -> Lb1
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r10 = r7.states     // Catch: java.lang.Throwable -> Lb1
                int r9 = r10.count(r9)     // Catch: java.lang.Throwable -> Lb1
                int r8 = r8 + r9
                int r9 = r7.numberOfServices     // Catch: java.lang.Throwable -> Lb1
                if (r8 != r9) goto L18
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r8 = r7.listeners     // Catch: java.lang.Throwable -> Lb1
                com.google.common.util.concurrent.ListenerCallQueue$Event r9 = com.google.common.util.concurrent.ServiceManager.access$300()     // Catch: java.lang.Throwable -> Lb1
                r8.enqueue(r9)     // Catch: java.lang.Throwable -> Lb1
                goto L18
            Lb1:
                r8 = move-exception
                com.google.common.util.concurrent.Monitor r9 = r7.monitor
                r9.leave()
                r7.dispatchListenerEvents()
                throw r8
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ServiceManager> r0 = com.google.common.util.concurrent.ServiceManager.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ServiceManager.logger = r0
            com.google.common.util.concurrent.ServiceManager$1 r0 = new com.google.common.util.concurrent.ServiceManager$1
            r0.<init>()
            com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT = r0
            com.google.common.util.concurrent.ServiceManager$2 r0 = new com.google.common.util.concurrent.ServiceManager$2
            r0.<init>()
            com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT = r0
            return
    }

    public ServiceManager(java.lang.Iterable<? extends com.google.common.util.concurrent.Service> r6) {
            r5 = this;
            r5.<init>()
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf(r6)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            java.util.logging.Logger r6 = com.google.common.util.concurrent.ServiceManager.logger
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            com.google.common.util.concurrent.ServiceManager$EmptyServiceManagerWarning r1 = new com.google.common.util.concurrent.ServiceManager$EmptyServiceManagerWarning
            r2 = 0
            r1.<init>(r2)
            java.lang.String r3 = "ServiceManager configured with no services.  Is your application configured properly?"
            r6.log(r0, r3, r1)
            com.google.common.util.concurrent.ServiceManager$NoOpService r6 = new com.google.common.util.concurrent.ServiceManager$NoOpService
            r6.<init>(r2)
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of(r6)
        L25:
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState
            r0.<init>(r6)
            r5.state = r0
            r5.services = r6
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.common.collect.UnmodifiableIterator r6 = r6.iterator()
        L37:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L60
            java.lang.Object r0 = r6.next()
            com.google.common.util.concurrent.Service r0 = (com.google.common.util.concurrent.Service) r0
            com.google.common.util.concurrent.ServiceManager$ServiceListener r3 = new com.google.common.util.concurrent.ServiceManager$ServiceListener
            r3.<init>(r0, r1)
            java.util.concurrent.Executor r4 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r3, r4)
            com.google.common.util.concurrent.Service$State r3 = r0.state()
            com.google.common.util.concurrent.Service$State r4 = com.google.common.util.concurrent.Service.State.NEW
            if (r3 != r4) goto L59
            goto L5a
        L59:
            r2 = 0
        L5a:
            java.lang.String r3 = "Can only manage NEW services, %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r0)
            goto L37
        L60:
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r6 = r5.state
            com.google.common.util.concurrent.Monitor r0 = r6.monitor
            r0.enter()
            boolean r0 = r6.transitioned     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L73
            r6.ready = r2     // Catch: java.lang.Throwable -> Lbc
            com.google.common.util.concurrent.Monitor r6 = r6.monitor
            r6.leave()
            return
        L73:
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()     // Catch: java.lang.Throwable -> Lbc
            com.google.common.collect.ImmutableSetMultimap r1 = r6.servicesByState()     // Catch: java.lang.Throwable -> Lbc
            com.google.common.collect.ImmutableCollection r1 = r1.values()     // Catch: java.lang.Throwable -> Lbc
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lbc
        L83:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lbc
            com.google.common.util.concurrent.Service r2 = (com.google.common.util.concurrent.Service) r2     // Catch: java.lang.Throwable -> Lbc
            com.google.common.util.concurrent.Service$State r3 = r2.state()     // Catch: java.lang.Throwable -> Lbc
            com.google.common.util.concurrent.Service$State r4 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> Lbc
            if (r3 == r4) goto L83
            r0.add(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L83
        L9b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lbc
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2 + 89
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "Services started transitioning asynchronously before the ServiceManager was constructed: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r1     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r6 = r6.monitor
            r6.leave()
            throw r0
    }

    public static /* synthetic */ java.util.logging.Logger access$200() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ServiceManager.logger
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenerCallQueue.Event access$300() {
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.ServiceManager$Listener> r0 = com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenerCallQueue.Event access$400() {
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.ServiceManager$Listener> r0 = com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT
            return r0
    }

    public void addListener(com.google.common.util.concurrent.ServiceManager.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r0.listeners
            r0.addListener(r2, r3)
            return
    }

    public void awaitHealthy() {
            r3 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.state
            com.google.common.util.concurrent.Monitor r1 = r0.monitor
            com.google.common.util.concurrent.Monitor$Guard r2 = r0.awaitHealthGuard
            r1.enterWhenUninterruptibly(r2)
            r0.checkHealthy()     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            r0.leave()
            return
        L12:
            r1 = move-exception
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            r0.leave()
            throw r1
    }

    public void awaitHealthy(long r4, java.util.concurrent.TimeUnit r6) throws java.util.concurrent.TimeoutException {
            r3 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.state
            com.google.common.util.concurrent.Monitor r1 = r0.monitor
            r1.enter()
            com.google.common.util.concurrent.Monitor r1 = r0.monitor     // Catch: java.lang.Throwable -> L4d
            com.google.common.util.concurrent.Monitor$Guard r2 = r0.awaitHealthGuard     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r1.waitForUninterruptibly(r2, r4, r6)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L1a
            r0.checkHealthy()     // Catch: java.lang.Throwable -> L4d
            com.google.common.util.concurrent.Monitor r4 = r0.monitor
            r4.leave()
            return
        L1a:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L4d
            com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r5 = r0.servicesByState     // Catch: java.lang.Throwable -> L4d
            com.google.common.util.concurrent.Service$State r6 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> L4d
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L4d
            com.google.common.collect.ImmutableSet r6 = com.google.common.collect.ImmutableSet.of(r6, r1)     // Catch: java.lang.Throwable -> L4d
            com.google.common.base.Predicate r6 = com.google.common.base.Predicates.in(r6)     // Catch: java.lang.Throwable -> L4d
            com.google.common.collect.SetMultimap r5 = com.google.common.collect.Multimaps.filterKeys(r5, r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L4d
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L4d
            int r6 = r6 + 93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "Timeout waiting for the services to become healthy. The following services have not started: "
            r1.append(r6)     // Catch: java.lang.Throwable -> L4d
            r1.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = move-exception
            com.google.common.util.concurrent.Monitor r5 = r0.monitor
            r5.leave()
            throw r4
    }

    public void awaitStopped() {
            r3 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.state
            com.google.common.util.concurrent.Monitor r1 = r0.monitor
            com.google.common.util.concurrent.Monitor$Guard r2 = r0.stoppedGuard
            r1.enterWhenUninterruptibly(r2)
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            r0.leave()
            return
    }

    public void awaitStopped(long r4, java.util.concurrent.TimeUnit r6) throws java.util.concurrent.TimeoutException {
            r3 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.state
            com.google.common.util.concurrent.Monitor r1 = r0.monitor
            r1.enter()
            com.google.common.util.concurrent.Monitor r1 = r0.monitor     // Catch: java.lang.Throwable -> L4e
            com.google.common.util.concurrent.Monitor$Guard r2 = r0.stoppedGuard     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r1.waitForUninterruptibly(r2, r4, r6)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L17
            com.google.common.util.concurrent.Monitor r4 = r0.monitor
            r4.leave()
            return
        L17:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L4e
            com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r5 = r0.servicesByState     // Catch: java.lang.Throwable -> L4e
            com.google.common.util.concurrent.Service$State r6 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L4e
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> L4e
            java.util.EnumSet r6 = java.util.EnumSet.of(r6, r1)     // Catch: java.lang.Throwable -> L4e
            com.google.common.base.Predicate r6 = com.google.common.base.Predicates.in(r6)     // Catch: java.lang.Throwable -> L4e
            com.google.common.base.Predicate r6 = com.google.common.base.Predicates.not(r6)     // Catch: java.lang.Throwable -> L4e
            com.google.common.collect.SetMultimap r5 = com.google.common.collect.Multimaps.filterKeys(r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L4e
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L4e
            int r6 = r6 + 83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = "Timeout waiting for the services to stop. The following services have not stopped: "
            r1.append(r6)     // Catch: java.lang.Throwable -> L4e
            r1.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L4e:
            r4 = move-exception
            com.google.common.util.concurrent.Monitor r5 = r0.monitor
            r5.leave()
            throw r4
    }

    public boolean isHealthy() {
            r2 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r2.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap servicesByState() {
            r1 = this;
            com.google.common.collect.ImmutableSetMultimap r0 = r1.servicesByState()
            return r0
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            com.google.common.collect.ImmutableSetMultimap r0 = r0.servicesByState()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.util.concurrent.ServiceManager startAsync() {
            r7 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r7.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            com.google.common.util.concurrent.Service$State r2 = r1.state()
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.NEW
            if (r2 != r3) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            java.lang.String r4 = "Service %s is %s, cannot start it."
            com.google.common.base.Preconditions.checkState(r3, r4, r1, r2)
            goto L6
        L23:
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r7.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r2 = r7.state     // Catch: java.lang.IllegalStateException -> L5f
            com.google.common.util.concurrent.Monitor r3 = r2.monitor     // Catch: java.lang.IllegalStateException -> L5f
            r3.enter()     // Catch: java.lang.IllegalStateException -> L5f
            java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r3 = r2.startupTimers     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L58
            com.google.common.base.Stopwatch r3 = (com.google.common.base.Stopwatch) r3     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L4f
            java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r3 = r2.startupTimers     // Catch: java.lang.Throwable -> L58
            com.google.common.base.Stopwatch r4 = com.google.common.base.Stopwatch.createStarted()     // Catch: java.lang.Throwable -> L58
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L58
        L4f:
            com.google.common.util.concurrent.Monitor r2 = r2.monitor     // Catch: java.lang.IllegalStateException -> L5f
            r2.leave()     // Catch: java.lang.IllegalStateException -> L5f
            r1.startAsync()     // Catch: java.lang.IllegalStateException -> L5f
            goto L29
        L58:
            r3 = move-exception
            com.google.common.util.concurrent.Monitor r2 = r2.monitor     // Catch: java.lang.IllegalStateException -> L5f
            r2.leave()     // Catch: java.lang.IllegalStateException -> L5f
            throw r3     // Catch: java.lang.IllegalStateException -> L5f
        L5f:
            r2 = move-exception
            java.util.logging.Logger r3 = com.google.common.util.concurrent.ServiceManager.logger
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            int r5 = r5 + 24
            java.lang.String r6 = "Unable to start Service "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r6, r1)
            r3.log(r4, r1, r2)
            goto L29
        L78:
            return r7
    }

    public com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
            r7 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r7.state
            com.google.common.util.concurrent.Monitor r1 = r0.monitor
            r1.enter()
            java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r1 = r0.startupTimers     // Catch: java.lang.Throwable -> L69
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayListWithCapacity(r1)     // Catch: java.lang.Throwable -> L69
            java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r2 = r0.startupTimers     // Catch: java.lang.Throwable -> L69
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L69
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L69
            com.google.common.util.concurrent.Service r4 = (com.google.common.util.concurrent.Service) r4     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            com.google.common.base.Stopwatch r3 = (com.google.common.base.Stopwatch) r3     // Catch: java.lang.Throwable -> L69
            boolean r5 = r3.isRunning()     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L1b
            boolean r5 = r4 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L1b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L69
            long r5 = r3.elapsed(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r4, r3)     // Catch: java.lang.Throwable -> L69
            r1.add(r3)     // Catch: java.lang.Throwable -> L69
            goto L1b
        L4f:
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            r0.leave()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1 r2 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1
            r2.<init>()
            com.google.common.collect.Ordering r0 = r0.onResultOf(r2)
            java.util.Collections.sort(r1, r0)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r1)
            return r0
        L69:
            r1 = move-exception
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            r0.leave()
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.util.concurrent.ServiceManager stopAsync() {
            r2 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r2.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            r1.stopAsync()
            goto L6
        L16:
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class<com.google.common.util.concurrent.ServiceManager> r0 = com.google.common.util.concurrent.ServiceManager.class
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r0)
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r1 = r3.services
            java.lang.Class<com.google.common.util.concurrent.ServiceManager$NoOpService> r2 = com.google.common.util.concurrent.ServiceManager.NoOpService.class
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.instanceOf(r2)
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.not(r2)
            java.util.Collection r1 = com.google.common.collect.Collections2.filter(r1, r2)
            java.lang.String r2 = "services"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
