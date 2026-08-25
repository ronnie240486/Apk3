package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class AbstractIdleService implements com.google.common.util.concurrent.Service {
    private final com.google.common.util.concurrent.Service delegate;
    private final com.google.common.base.Supplier<java.lang.String> threadNameSupplier;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractIdleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 implements java.util.concurrent.Executor {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractIdleService this$0;

        public AnonymousClass1(com.google.common.util.concurrent.AbstractIdleService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r1.this$0
                com.google.common.base.Supplier r0 = com.google.common.util.concurrent.AbstractIdleService.access$200(r0)
                java.lang.Object r0 = r0.get()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Thread r2 = com.google.common.util.concurrent.MoreExecutors.newThread(r0, r2)
                r2.start()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class DelegateService extends com.google.common.util.concurrent.AbstractService {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractIdleService this$0;



        private DelegateService(com.google.common.util.concurrent.AbstractIdleService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ DelegateService(com.google.common.util.concurrent.AbstractIdleService r1, com.google.common.util.concurrent.AbstractIdleService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
                r2 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                java.util.Objects.requireNonNull(r0)
                com.google.common.util.concurrent.AbstractIdleService$1 r1 = new com.google.common.util.concurrent.AbstractIdleService$1
                r1.<init>(r0)
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                com.google.common.base.Supplier r0 = com.google.common.util.concurrent.AbstractIdleService.access$200(r0)
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(r1, r0)
                com.google.common.util.concurrent.AbstractIdleService$DelegateService$1 r1 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService$1
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
                r2 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                java.util.Objects.requireNonNull(r0)
                com.google.common.util.concurrent.AbstractIdleService$1 r1 = new com.google.common.util.concurrent.AbstractIdleService$1
                r1.<init>(r0)
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                com.google.common.base.Supplier r0 = com.google.common.util.concurrent.AbstractIdleService.access$200(r0)
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(r1, r0)
                com.google.common.util.concurrent.AbstractIdleService$DelegateService$2 r1 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService$2
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
                r1 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r1.this$0
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public final class ThreadNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
        public final /* synthetic */ com.google.common.util.concurrent.AbstractIdleService this$0;

        private ThreadNameSupplier(com.google.common.util.concurrent.AbstractIdleService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ThreadNameSupplier(com.google.common.util.concurrent.AbstractIdleService r1, com.google.common.util.concurrent.AbstractIdleService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.String get() {
                r1 = this;
                java.lang.String r0 = r1.get2()
                return r0
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public java.lang.String get2() {
                r4 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r4.this$0
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getSimpleName()
                com.google.common.util.concurrent.AbstractIdleService r1 = r4.this$0
                com.google.common.util.concurrent.Service$State r1 = r1.state()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 1
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = " "
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1)
                return r0
        }
    }

    public AbstractIdleService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier r0 = new com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier
            r1 = 0
            r0.<init>(r2, r1)
            r2.threadNameSupplier = r0
            com.google.common.util.concurrent.AbstractIdleService$DelegateService r0 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService
            r0.<init>(r2, r1)
            r2.delegate = r0
            return
    }

    public static /* synthetic */ com.google.common.base.Supplier access$200(com.google.common.util.concurrent.AbstractIdleService r0) {
            com.google.common.base.Supplier<java.lang.String> r0 = r0.threadNameSupplier
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitRunning()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitRunning(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitTerminated()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitTerminated(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            java.lang.Throwable r0 = r0.failureCause()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            boolean r0 = r0.isRunning()
            return r0
    }

    public abstract void shutDown() throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.startAsync()
            return r1
    }

    public abstract void startUp() throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            com.google.common.util.concurrent.Service$State r0 = r0.state()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.stopAsync()
            return r1
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
