package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class AbstractExecutionThreadService implements com.google.common.util.concurrent.Service {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.util.concurrent.Service delegate;



    static {
            java.lang.Class<com.google.common.util.concurrent.AbstractExecutionThreadService> r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AbstractExecutionThreadService.logger = r0
            return
    }

    public AbstractExecutionThreadService() {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = new com.google.common.util.concurrent.AbstractExecutionThreadService$1
            r0.<init>(r1)
            r1.delegate = r0
            return
    }

    public static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.logger
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

    public abstract void run() throws java.lang.Exception;

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
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.startAsync()
            return r1
    }

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
