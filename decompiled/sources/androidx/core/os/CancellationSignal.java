package androidx.core.os;

/* JADX INFO: loaded from: classes3.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void cancel(java.lang.Object r0) {
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                r0.cancel()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.CancellationSignal createCancellationSignal() {
                android.os.CancellationSignal r0 = new android.os.CancellationSignal
                r0.<init>()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L0:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto La
            r1.wait()     // Catch: java.lang.InterruptedException -> L8
            goto L0
        L8:
            goto L0
        La:
            return
    }

    public void cancel() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsCanceled     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            return
        L7:
            r0 = 1
            r3.mIsCanceled = r0     // Catch: java.lang.Throwable -> L36
            r3.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L36
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r3.mCancellationSignalObj     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L1a
            r0.onCancel()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L20
        L1a:
            if (r1 == 0) goto L2b
            androidx.core.os.CancellationSignal.Api16Impl.cancel(r1)     // Catch: java.lang.Throwable -> L18
            goto L2b
        L20:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L28
            r3.notifyAll()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L28:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L2b:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L33
            r3.notifyAll()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getCancellationSignalObject() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L12
            android.os.CancellationSignal r0 = androidx.core.os.CancellationSignal.Api16Impl.createCancellationSignal()     // Catch: java.lang.Throwable -> L16
            r2.mCancellationSignalObj = r0     // Catch: java.lang.Throwable -> L16
            boolean r1 = r2.mIsCanceled     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L12
            androidx.core.os.CancellationSignal.Api16Impl.cancel(r0)     // Catch: java.lang.Throwable -> L16
        L12:
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void setOnCancelListener(@androidx.annotation.Nullable androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> L1a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> L1a
            if (r0 != r2) goto La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        La:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            if (r2 != 0) goto L13
            goto L18
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            r2.onCancel()
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public void throwIfCanceled() {
            r1 = this;
            boolean r0 = r1.isCanceled()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
    }
}
