package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class AbstractScheduledService implements com.google.common.util.concurrent.Service {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.util.concurrent.AbstractService delegate;



    public interface Cancellable {
        void cancel(boolean r1);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends com.google.common.util.concurrent.AbstractScheduledService.Scheduler {

        public final class ReschedulableCallable implements java.util.concurrent.Callable<java.lang.Void> {

            @javax.annotation.CheckForNull
            @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
            private com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture cancellationDelegate;
            private final java.util.concurrent.ScheduledExecutorService executor;
            private final java.util.concurrent.locks.ReentrantLock lock;
            private final com.google.common.util.concurrent.AbstractService service;
            public final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler this$0;
            private final java.lang.Runnable wrappedRunnable;

            public ReschedulableCallable(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler r1, com.google.common.util.concurrent.AbstractService r2, java.util.concurrent.ScheduledExecutorService r3, java.lang.Runnable r4) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
                    r1.<init>()
                    r0.lock = r1
                    r0.wrappedRunnable = r4
                    r0.executor = r3
                    r0.service = r2
                    return
            }

            @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
            private com.google.common.util.concurrent.AbstractScheduledService.Cancellable initializeOrUpdateCancellationDelegate(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r3) {
                    r2 = this;
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture r0 = r2.cancellationDelegate
                    if (r0 != 0) goto L12
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture r0 = new com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture
                    java.util.concurrent.locks.ReentrantLock r1 = r2.lock
                    java.util.concurrent.ScheduledFuture r3 = r2.submitToExecutor(r3)
                    r0.<init>(r1, r3)
                    r2.cancellationDelegate = r0
                    return r0
                L12:
                    java.util.concurrent.Future r0 = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture.access$800(r0)
                    boolean r0 = r0.isCancelled()
                    if (r0 != 0) goto L25
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture r0 = r2.cancellationDelegate
                    java.util.concurrent.ScheduledFuture r3 = r2.submitToExecutor(r3)
                    com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture.access$802(r0, r3)
                L25:
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture r3 = r2.cancellationDelegate
                    return r3
            }

            private java.util.concurrent.ScheduledFuture<java.lang.Void> submitToExecutor(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r4) {
                    r3 = this;
                    java.util.concurrent.ScheduledExecutorService r0 = r3.executor
                    long r1 = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule.access$900(r4)
                    java.util.concurrent.TimeUnit r4 = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule.access$1000(r4)
                    java.util.concurrent.ScheduledFuture r4 = r0.schedule(r3, r1, r4)
                    return r4
            }

            @Override // java.util.concurrent.Callable
            @javax.annotation.CheckForNull
            public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                    r1 = this;
                    java.lang.Void r0 = r1.call2()
                    return r0
            }

            @Override // java.util.concurrent.Callable
            @javax.annotation.CheckForNull
            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public java.lang.Void call2() throws java.lang.Exception {
                    r1 = this;
                    java.lang.Runnable r0 = r1.wrappedRunnable
                    r0.run()
                    r1.reschedule()
                    r0 = 0
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.common.util.concurrent.AbstractScheduledService.Cancellable reschedule() {
                    r3 = this;
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler r0 = r3.this$0     // Catch: java.lang.Throwable -> L30
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$Schedule r0 = r0.getNextSchedule()     // Catch: java.lang.Throwable -> L30
                    r1 = 0
                    java.util.concurrent.locks.ReentrantLock r2 = r3.lock
                    r2.lock()
                    com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = r3.initializeOrUpdateCancellationDelegate(r0)     // Catch: java.lang.Throwable -> L16
                L10:
                    java.util.concurrent.locks.ReentrantLock r2 = r3.lock
                    r2.unlock()
                    goto L21
                L16:
                    r1 = move-exception
                    com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable r0 = new com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable     // Catch: java.lang.Throwable -> L29
                    com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.immediateCancelledFuture()     // Catch: java.lang.Throwable -> L29
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L29
                    goto L10
                L21:
                    if (r1 == 0) goto L28
                    com.google.common.util.concurrent.AbstractService r2 = r3.service
                    r2.notifyFailed(r1)
                L28:
                    return r0
                L29:
                    r0 = move-exception
                    java.util.concurrent.locks.ReentrantLock r1 = r3.lock
                    r1.unlock()
                    throw r0
                L30:
                    r0 = move-exception
                    com.google.common.util.concurrent.AbstractService r1 = r3.service
                    r1.notifyFailed(r0)
                    com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable r0 = new com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable
                    com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateCancelledFuture()
                    r0.<init>(r1)
                    return r0
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Schedule {
            private final long delay;
            private final java.util.concurrent.TimeUnit unit;

            public Schedule(long r1, java.util.concurrent.TimeUnit r3) {
                    r0 = this;
                    r0.<init>()
                    r0.delay = r1
                    java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                    java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
                    r0.unit = r1
                    return
            }

            public static /* synthetic */ java.util.concurrent.TimeUnit access$1000(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r0) {
                    java.util.concurrent.TimeUnit r0 = r0.unit
                    return r0
            }

            public static /* synthetic */ long access$900(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r2) {
                    long r0 = r2.delay
                    return r0
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class SupplantableFuture implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {

            @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
            private java.util.concurrent.Future<java.lang.Void> currentFuture;
            private final java.util.concurrent.locks.ReentrantLock lock;

            public SupplantableFuture(java.util.concurrent.locks.ReentrantLock r1, java.util.concurrent.Future<java.lang.Void> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.lock = r1
                    r0.currentFuture = r2
                    return
            }

            public static /* synthetic */ java.util.concurrent.Future access$800(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture r0) {
                    java.util.concurrent.Future<java.lang.Void> r0 = r0.currentFuture
                    return r0
            }

            public static /* synthetic */ java.util.concurrent.Future access$802(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture r0, java.util.concurrent.Future r1) {
                    r0.currentFuture = r1
                    return r1
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean r2) {
                    r1 = this;
                    java.util.concurrent.locks.ReentrantLock r0 = r1.lock
                    r0.lock()
                    java.util.concurrent.Future<java.lang.Void> r0 = r1.currentFuture     // Catch: java.lang.Throwable -> L10
                    r0.cancel(r2)     // Catch: java.lang.Throwable -> L10
                    java.util.concurrent.locks.ReentrantLock r2 = r1.lock
                    r2.unlock()
                    return
                L10:
                    r2 = move-exception
                    java.util.concurrent.locks.ReentrantLock r0 = r1.lock
                    r0.unlock()
                    throw r2
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                    r2 = this;
                    java.util.concurrent.locks.ReentrantLock r0 = r2.lock
                    r0.lock()
                    java.util.concurrent.Future<java.lang.Void> r0 = r2.currentFuture     // Catch: java.lang.Throwable -> L11
                    boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L11
                    java.util.concurrent.locks.ReentrantLock r1 = r2.lock
                    r1.unlock()
                    return r0
                L11:
                    r0 = move-exception
                    java.util.concurrent.locks.ReentrantLock r1 = r2.lock
                    r1.unlock()
                    throw r0
            }
        }

        public CustomScheduler() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public abstract com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule getNextSchedule() throws java.lang.Exception;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        public final com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService r2, java.util.concurrent.ScheduledExecutorService r3, java.lang.Runnable r4) {
                r1 = this;
                com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$ReschedulableCallable r0 = new com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$ReschedulableCallable
                r0.<init>(r1, r2, r3, r4)
                com.google.common.util.concurrent.AbstractScheduledService$Cancellable r2 = r0.reschedule()
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FutureAsCancellable implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {
        private final java.util.concurrent.Future<?> delegate;

        public FutureAsCancellable(java.util.concurrent.Future<?> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean r2) {
                r1 = this;
                java.util.concurrent.Future<?> r0 = r1.delegate
                r0.cancel(r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
                r1 = this;
                java.util.concurrent.Future<?> r0 = r1.delegate
                boolean r0 = r0.isCancelled()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Scheduler {



        private Scheduler() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Scheduler(com.google.common.util.concurrent.AbstractScheduledService.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(long r8, long r10, java.util.concurrent.TimeUnit r12) {
                com.google.common.base.Preconditions.checkNotNull(r12)
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.lang.String r1 = "delay must be > 0, found %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r10)
                com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 r0 = new com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1
                r2 = r0
                r3 = r8
                r5 = r10
                r7 = r12
                r2.<init>(r3, r5, r7)
                return r0
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(long r8, long r10, java.util.concurrent.TimeUnit r12) {
                com.google.common.base.Preconditions.checkNotNull(r12)
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.lang.String r1 = "period must be > 0, found %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r10)
                com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 r0 = new com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2
                r2 = r0
                r3 = r8
                r5 = r10
                r7 = r12
                r2.<init>(r3, r5, r7)
                return r0
        }

        public abstract com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService r1, java.util.concurrent.ScheduledExecutorService r2, java.lang.Runnable r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ServiceDelegate extends com.google.common.util.concurrent.AbstractService {

        @javax.annotation.CheckForNull
        private volatile java.util.concurrent.ScheduledExecutorService executorService;
        private final java.util.concurrent.locks.ReentrantLock lock;

        @javax.annotation.CheckForNull
        private volatile com.google.common.util.concurrent.AbstractScheduledService.Cancellable runningTask;
        private final java.lang.Runnable task;
        public final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService this$0;




        public class Task implements java.lang.Runnable {
            public final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate this$1;

            public Task(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r0)
                    r0.lock()
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L35
                    com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$300(r0)     // Catch: java.lang.Throwable -> L35
                    java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L35
                    com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = (com.google.common.util.concurrent.AbstractScheduledService.Cancellable) r0     // Catch: java.lang.Throwable -> L35
                    boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L35
                    if (r0 == 0) goto L24
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r0)
                    r0.unlock()
                    return
                L24:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L35
                    com.google.common.util.concurrent.AbstractScheduledService r0 = r0.this$0     // Catch: java.lang.Throwable -> L35
                    r0.runOneIteration()     // Catch: java.lang.Throwable -> L35
                L2b:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r0)
                    r0.unlock()
                    goto L61
                L35:
                    r0 = move-exception
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
                    com.google.common.util.concurrent.AbstractScheduledService r1 = r1.this$0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
                    java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
                    goto L4c
                L3e:
                    r0 = move-exception
                    goto L62
                L40:
                    r1 = move-exception
                    java.util.logging.Logger r2 = com.google.common.util.concurrent.AbstractScheduledService.access$400()     // Catch: java.lang.Throwable -> L3e
                    java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L3e
                    java.lang.String r4 = "Error while attempting to shut down the service after failure."
                    r2.log(r3, r4, r1)     // Catch: java.lang.Throwable -> L3e
                L4c:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1     // Catch: java.lang.Throwable -> L3e
                    r1.notifyFailed(r0)     // Catch: java.lang.Throwable -> L3e
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L3e
                    com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$300(r0)     // Catch: java.lang.Throwable -> L3e
                    java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L3e
                    com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = (com.google.common.util.concurrent.AbstractScheduledService.Cancellable) r0     // Catch: java.lang.Throwable -> L3e
                    r1 = 0
                    r0.cancel(r1)     // Catch: java.lang.Throwable -> L3e
                    goto L2b
                L61:
                    return
                L62:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r1 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r1)
                    r1.unlock()
                    throw r0
            }
        }

        private ServiceDelegate(com.google.common.util.concurrent.AbstractScheduledService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
                r1.<init>()
                r0.lock = r1
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$Task r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$Task
                r1.<init>(r0)
                r0.task = r1
                return
        }

        public /* synthetic */ ServiceDelegate(com.google.common.util.concurrent.AbstractScheduledService r1, com.google.common.util.concurrent.AbstractScheduledService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.util.concurrent.locks.ReentrantLock access$200(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.util.concurrent.locks.ReentrantLock r0 = r0.lock
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.Cancellable access$300(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = r0.runningTask
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.Cancellable access$302(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0, com.google.common.util.concurrent.AbstractScheduledService.Cancellable r1) {
                r0.runningTask = r1
                return r1
        }

        public static /* synthetic */ java.util.concurrent.ScheduledExecutorService access$600(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.util.concurrent.ScheduledExecutorService r0 = r0.executorService
                return r0
        }

        public static /* synthetic */ java.lang.Runnable access$700(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.lang.Runnable r0 = r0.task
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
                r4 = this;
                com.google.common.util.concurrent.AbstractScheduledService r0 = r4.this$0
                java.util.Objects.requireNonNull(r0)
                com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl r1 = new com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl
                r1.<init>(r0)
                java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r1)
                com.google.common.util.concurrent.AbstractScheduledService$1 r2 = new com.google.common.util.concurrent.AbstractScheduledService$1
                r2.<init>(r1)
                java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r0.addListener(r2, r3)
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1 r0 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1
                r0.<init>(r4)
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Preconditions.checkNotNull(r0)
                com.google.common.util.concurrent.MoreExecutors$4 r2 = new com.google.common.util.concurrent.MoreExecutors$4
                r2.<init>(r1, r0)
                r4.executorService = r2
                java.util.concurrent.ScheduledExecutorService r0 = r4.executorService
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2 r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2
                r1.<init>(r4)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
                r2 = this;
                com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = r2.runningTask
                java.util.Objects.requireNonNull(r0)
                java.util.concurrent.ScheduledExecutorService r0 = r2.executorService
                java.util.Objects.requireNonNull(r0)
                com.google.common.util.concurrent.AbstractScheduledService$Cancellable r0 = r2.runningTask
                r1 = 0
                r0.cancel(r1)
                java.util.concurrent.ScheduledExecutorService r0 = r2.executorService
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3 r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
                r1 = this;
                com.google.common.util.concurrent.AbstractScheduledService r0 = r1.this$0
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AbstractScheduledService> r0 = com.google.common.util.concurrent.AbstractScheduledService.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AbstractScheduledService.logger = r0
            return
    }

    public AbstractScheduledService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate
            r1 = 0
            r0.<init>(r2, r1)
            r2.delegate = r0
            return
    }

    public static /* synthetic */ java.util.logging.Logger access$400() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractScheduledService.logger
            return r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.AbstractService access$500(com.google.common.util.concurrent.AbstractScheduledService r0) {
            com.google.common.util.concurrent.AbstractService r0 = r0.delegate
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitRunning()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitRunning(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitTerminated()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitTerminated(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            java.lang.Throwable r0 = r0.failureCause()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            boolean r0 = r0.isRunning()
            return r0
    }

    public abstract void runOneIteration() throws java.lang.Exception;

    public abstract com.google.common.util.concurrent.AbstractScheduledService.Scheduler scheduler();

    public final java.lang.String serviceName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.startAsync()
            return r1
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            com.google.common.util.concurrent.Service$State r0 = r0.state()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.stopAsync()
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.serviceName()
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
