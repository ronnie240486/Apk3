package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class SimpleTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    private final java.util.concurrent.ExecutorService executor;


    private SimpleTimeLimiter(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            r0.executor = r1
            return
    }

    public static /* synthetic */ java.lang.Exception access$000(java.lang.Exception r1) throws java.lang.Exception {
            r0 = 0
            java.lang.Exception r1 = throwCause(r1, r0)
            return r1
    }

    public static /* synthetic */ java.lang.Object access$100(com.google.common.util.concurrent.SimpleTimeLimiter r0, java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4, boolean r5) throws java.lang.Exception {
            java.lang.Object r0 = r0.callWithTimeout(r1, r2, r4, r5)
            return r0
    }

    private <T> T callWithTimeout(java.util.concurrent.Callable<T> r2, long r3, java.util.concurrent.TimeUnit r5, boolean r6) throws java.lang.Exception {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            checkPositiveTimeout(r3)
            java.util.concurrent.ExecutorService r0 = r1.executor
            java.util.concurrent.Future r2 = r0.submit(r2)
            r0 = 1
            if (r6 == 0) goto L1c
            java.lang.Object r2 = r2.get(r3, r5)     // Catch: java.lang.InterruptedException -> L17 java.util.concurrent.TimeoutException -> L21 java.util.concurrent.ExecutionException -> L2b
            return r2
        L17:
            r3 = move-exception
            r2.cancel(r0)     // Catch: java.util.concurrent.TimeoutException -> L21 java.util.concurrent.ExecutionException -> L2b
            throw r3     // Catch: java.util.concurrent.TimeoutException -> L21 java.util.concurrent.ExecutionException -> L2b
        L1c:
            java.lang.Object r2 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2, r3, r5)     // Catch: java.util.concurrent.TimeoutException -> L21 java.util.concurrent.ExecutionException -> L2b
            return r2
        L21:
            r3 = move-exception
            r2.cancel(r0)
            com.google.common.util.concurrent.UncheckedTimeoutException r2 = new com.google.common.util.concurrent.UncheckedTimeoutException
            r2.<init>(r3)
            throw r2
        L2b:
            r2 = move-exception
            java.lang.Exception r2 = throwCause(r2, r0)
            throw r2
    }

    private static void checkPositiveTimeout(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "timeout must be positive: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            return
    }

    public static com.google.common.util.concurrent.SimpleTimeLimiter create(java.util.concurrent.ExecutorService r1) {
            com.google.common.util.concurrent.SimpleTimeLimiter r0 = new com.google.common.util.concurrent.SimpleTimeLimiter
            r0.<init>(r1)
            return r0
    }

    private static boolean declaresInterruptedEx(java.lang.reflect.Method r5) {
            java.lang.Class[] r5 = r5.getExceptionTypes()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L14
            r3 = r5[r2]
            java.lang.Class<java.lang.InterruptedException> r4 = java.lang.InterruptedException.class
            if (r3 != r4) goto L11
            r5 = 1
            return r5
        L11:
            int r2 = r2 + 1
            goto L7
        L14:
            return r1
    }

    private static java.util.Set<java.lang.reflect.Method> findInterruptibleMethods(java.lang.Class<?> r5) {
            java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
            java.lang.reflect.Method[] r5 = r5.getMethods()
            int r1 = r5.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            boolean r4 = declaresInterruptedEx(r3)
            if (r4 == 0) goto L17
            r0.add(r3)
        L17:
            int r2 = r2 + 1
            goto La
        L1a:
            return r0
    }

    private static <T> T newProxy(java.lang.Class<T> r3, java.lang.reflect.InvocationHandler r4) {
            java.lang.ClassLoader r0 = r3.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r4)
            java.lang.Object r3 = r3.cast(r4)
            return r3
    }

    private static java.lang.Exception throwCause(java.lang.Exception r3, boolean r4) throws java.lang.Exception {
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L2a
            if (r4 == 0) goto L1b
            java.lang.StackTraceElement[] r4 = r0.getStackTrace()
            java.lang.StackTraceElement[] r1 = r3.getStackTrace()
            java.lang.Class<java.lang.StackTraceElement> r2 = java.lang.StackTraceElement.class
            java.lang.Object[] r4 = com.google.common.collect.ObjectArrays.concat(r4, r1, r2)
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
            r0.setStackTrace(r4)
        L1b:
            boolean r4 = r0 instanceof java.lang.Exception
            if (r4 != 0) goto L27
            boolean r4 = r0 instanceof java.lang.Error
            if (r4 == 0) goto L26
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L26:
            throw r3
        L27:
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L2a:
            throw r3
    }

    private void wrapAndThrowExecutionExceptionOrError(java.lang.Throwable r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 != 0) goto L14
            boolean r0 = r2 instanceof java.lang.RuntimeException
            if (r0 == 0) goto Le
            com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
            r0.<init>(r2)
            throw r0
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            r0.<init>(r2)
            throw r0
        L14:
            com.google.common.util.concurrent.ExecutionError r0 = new com.google.common.util.concurrent.ExecutionError
            java.lang.Error r2 = (java.lang.Error) r2
            r0.<init>(r2)
            throw r0
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 == 0) goto Lc
            com.google.common.util.concurrent.ExecutionError r0 = new com.google.common.util.concurrent.ExecutionError
            java.lang.Error r2 = (java.lang.Error) r2
            r0.<init>(r2)
            throw r0
        Lc:
            com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            checkPositiveTimeout(r3)
            java.util.concurrent.ExecutorService r0 = r1.executor
            java.util.concurrent.Future r2 = r0.submit(r2)
            java.lang.Object r2 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2, r3, r5)     // Catch: java.util.concurrent.ExecutionException -> L14 java.util.concurrent.TimeoutException -> L22
            return r2
        L14:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            r1.wrapAndThrowExecutionExceptionOrError(r2)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L22:
            r3 = move-exception
            r4 = 1
            r2.cancel(r4)
            throw r3
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T callWithTimeout(java.util.concurrent.Callable<T> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            checkPositiveTimeout(r3)
            java.util.concurrent.ExecutorService r0 = r1.executor
            java.util.concurrent.Future r2 = r0.submit(r2)
            java.lang.Object r2 = r2.get(r3, r5)     // Catch: java.util.concurrent.ExecutionException -> L14 java.util.concurrent.TimeoutException -> L22 java.lang.InterruptedException -> L24
            return r2
        L14:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            r1.wrapAndThrowExecutionExceptionOrError(r2)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L22:
            r3 = move-exception
            goto L25
        L24:
            r3 = move-exception
        L25:
            r4 = 1
            r2.cancel(r4)
            throw r3
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T r10, java.lang.Class<T> r11, long r12, java.util.concurrent.TimeUnit r14) {
            r9 = this;
            com.google.common.base.Preconditions.checkNotNull(r10)
            com.google.common.base.Preconditions.checkNotNull(r11)
            com.google.common.base.Preconditions.checkNotNull(r14)
            checkPositiveTimeout(r12)
            boolean r0 = r11.isInterface()
            java.lang.String r1 = "interfaceType must be an interface type"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.util.Set r8 = findInterruptibleMethods(r11)
            com.google.common.util.concurrent.SimpleTimeLimiter$1 r0 = new com.google.common.util.concurrent.SimpleTimeLimiter$1
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            java.lang.Object r10 = newProxy(r11, r0)
            return r10
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            checkPositiveTimeout(r3)
            java.util.concurrent.ExecutorService r0 = r1.executor
            java.util.concurrent.Future r2 = r0.submit(r2)
            com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2, r3, r5)     // Catch: java.util.concurrent.ExecutionException -> L13 java.util.concurrent.TimeoutException -> L21
            return
        L13:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            r1.wrapAndThrowRuntimeExecutionExceptionOrError(r2)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L21:
            r3 = move-exception
            r4 = 1
            r2.cancel(r4)
            throw r3
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            checkPositiveTimeout(r3)
            java.util.concurrent.ExecutorService r0 = r1.executor
            java.util.concurrent.Future r2 = r0.submit(r2)
            r2.get(r3, r5)     // Catch: java.util.concurrent.ExecutionException -> L13 java.util.concurrent.TimeoutException -> L21 java.lang.InterruptedException -> L23
            return
        L13:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            r1.wrapAndThrowRuntimeExecutionExceptionOrError(r2)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L21:
            r3 = move-exception
            goto L24
        L23:
            r3 = move-exception
        L24:
            r4 = 1
            r2.cancel(r4)
            throw r3
    }
}
