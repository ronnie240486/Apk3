package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes2.dex */
public final class CallbackToFutureAdapter {

    /* JADX INFO: loaded from: classes.dex */
    public static final class Completer<T> {
        private boolean attemptedSetting;
        private androidx.concurrent.futures.ResolvableFuture<java.lang.Void> cancellationFuture;
        public androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> future;
        public java.lang.Object tag;

        public Completer() {
                r1 = this;
                r1.<init>()
                androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
                r1.cancellationFuture = r0
                return
        }

        private void setCompletedNormally() {
                r1 = this;
                r0 = 0
                r1.tag = r0
                r1.future = r0
                r1.cancellationFuture = r0
                return
        }

        public void addCancellationListener(@androidx.annotation.NonNull java.lang.Runnable r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r1 = this;
                androidx.concurrent.futures.ResolvableFuture<java.lang.Void> r0 = r1.cancellationFuture
                if (r0 == 0) goto L7
                r0.addListener(r2, r3)
            L7:
                return
        }

        public final void finalize() {
                r4 = this;
                androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture<T> r0 = r4.future
                if (r0 == 0) goto L21
                boolean r1 = r0.isDone()
                if (r1 != 0) goto L21
                androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException r1 = new androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException
                java.lang.String r2 = "The completer object was garbage collected - this future would otherwise never complete. The tag was: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.Object r3 = r4.tag
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.setException(r1)
            L21:
                boolean r0 = r4.attemptedSetting
                if (r0 != 0) goto L2d
                androidx.concurrent.futures.ResolvableFuture<java.lang.Void> r0 = r4.cancellationFuture
                if (r0 == 0) goto L2d
                r1 = 0
                r0.set(r1)
            L2d:
                return
        }

        public final void fireCancellationListeners() {
                r2 = this;
                r0 = 0
                r2.tag = r0
                r2.future = r0
                androidx.concurrent.futures.ResolvableFuture<java.lang.Void> r1 = r2.cancellationFuture
                r1.set(r0)
                return
        }

        public boolean set(T r3) {
                r2 = this;
                r0 = 1
                r2.attemptedSetting = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture<T> r1 = r2.future
                if (r1 == 0) goto Le
                boolean r3 = r1.set(r3)
                if (r3 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.setCompletedNormally()
            L14:
                return r0
        }

        public boolean setCancelled() {
                r2 = this;
                r0 = 1
                r2.attemptedSetting = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture<T> r1 = r2.future
                if (r1 == 0) goto Le
                boolean r1 = r1.cancelWithoutNotifyingCompleter()
                if (r1 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.setCompletedNormally()
            L14:
                return r0
        }

        public boolean setException(@androidx.annotation.NonNull java.lang.Throwable r3) {
                r2 = this;
                r0 = 1
                r2.attemptedSetting = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture<T> r1 = r2.future
                if (r1 == 0) goto Le
                boolean r3 = r1.setException(r3)
                if (r3 == 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r2.setCompletedNormally()
            L14:
                return r0
        }
    }

    public static final class FutureGarbageCollectedException extends java.lang.Throwable {
        public FutureGarbageCollectedException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Resolver<T> {
        @androidx.annotation.Nullable
        java.lang.Object attachCompleter(@androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> r1) throws java.lang.Exception;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SafeFuture<T> implements com.google.common.util.concurrent.ListenableFuture<T> {
        public final java.lang.ref.WeakReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T>> completerWeakReference;
        private final androidx.concurrent.futures.AbstractResolvableFuture<T> delegate;


        public SafeFuture(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> r2) {
                r1 = this;
                r1.<init>()
                androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture$1 r0 = new androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture$1
                r0.<init>(r1)
                r1.delegate = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.completerWeakReference = r0
                return
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@androidx.annotation.NonNull java.lang.Runnable r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                r0.addListener(r2, r3)
                return
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r3) {
                r2 = this;
                java.lang.ref.WeakReference<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<T>> r0 = r2.completerWeakReference
                java.lang.Object r0 = r0.get()
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
                androidx.concurrent.futures.AbstractResolvableFuture<T> r1 = r2.delegate
                boolean r3 = r1.cancel(r3)
                if (r3 == 0) goto L15
                if (r0 == 0) goto L15
                r0.fireCancellationListeners()
            L15:
                return r3
        }

        public final boolean cancelWithoutNotifyingCompleter() {
                r2 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r2.delegate
                r1 = 1
                boolean r0 = r0.cancel(r1)
                return r0
        }

        @Override // java.util.concurrent.Future
        public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // java.util.concurrent.Future
        public T get(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                java.lang.Object r2 = r0.get(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                boolean r0 = r0.isDone()
                return r0
        }

        public final boolean set(T r2) {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                boolean r2 = r0.set(r2)
                return r2
        }

        public final boolean setException(java.lang.Throwable r2) {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                boolean r2 = r0.setException(r2)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<T> r0 = r1.delegate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private CallbackToFutureAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <T> com.google.common.util.concurrent.ListenableFuture<T> getFuture(@androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<T> r3) {
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = new androidx.concurrent.futures.CallbackToFutureAdapter$Completer
            r0.<init>()
            androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture r1 = new androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture
            r1.<init>(r0)
            r0.future = r1
            java.lang.Class r2 = r3.getClass()
            r0.tag = r2
            java.lang.Object r3 = r3.attachCompleter(r0)     // Catch: java.lang.Exception -> L1b
            if (r3 == 0) goto L1f
            r0.tag = r3     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r1.setException(r3)
        L1f:
            return r1
    }
}
