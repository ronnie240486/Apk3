package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends androidx.loader.content.Loader<D> {
    public volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final java.util.concurrent.Executor mExecutor;
    public android.os.Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mTask;
    public long mUpdateThrottle;

    public final class LoadTask extends androidx.loader.content.ModernAsyncTask<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {
        private final java.util.concurrent.CountDownLatch mDone;
        public final /* synthetic */ androidx.loader.content.AsyncTaskLoader this$0;
        public boolean waiting;

        public LoadTask(androidx.loader.content.AsyncTaskLoader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
                r0 = 1
                r2.<init>(r0)
                r1.mDone = r2
                return
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final java.lang.Object doInBackground(java.lang.Void[] r2) {
                r1 = this;
                java.lang.Void[] r2 = (java.lang.Void[]) r2
                androidx.loader.content.AsyncTaskLoader r2 = r1.this$0     // Catch: androidx.core.os.OperationCanceledException -> L9
                java.lang.Object r2 = r2.loadInBackground()     // Catch: androidx.core.os.OperationCanceledException -> L9
                goto L11
            L9:
                r2 = move-exception
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto L12
                r2 = 0
            L11:
                return r2
            L12:
                throw r2
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void onCancelled(D r2) {
                r1 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb
                r0.dispatchOnCancelled(r1, r2)     // Catch: java.lang.Throwable -> Lb
                java.util.concurrent.CountDownLatch r2 = r1.mDone
                r2.countDown()
                return
            Lb:
                r2 = move-exception
                java.util.concurrent.CountDownLatch r0 = r1.mDone
                r0.countDown()
                throw r2
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void onPostExecute(D r4) {
                r3 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r3.this$0     // Catch: java.lang.Throwable -> L29
                androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r0.mTask     // Catch: java.lang.Throwable -> L29
                if (r1 == r3) goto La
                r0.dispatchOnCancelled(r3, r4)     // Catch: java.lang.Throwable -> L29
                goto L23
            La:
                boolean r1 = r0.isAbandoned()     // Catch: java.lang.Throwable -> L29
                if (r1 == 0) goto L14
                r0.onCanceled(r4)     // Catch: java.lang.Throwable -> L29
                goto L23
            L14:
                r0.commitContentChanged()     // Catch: java.lang.Throwable -> L29
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L29
                r0.mLastLoadCompleteTime = r1     // Catch: java.lang.Throwable -> L29
                r1 = 0
                r0.mTask = r1     // Catch: java.lang.Throwable -> L29
                r0.deliverResult(r4)     // Catch: java.lang.Throwable -> L29
            L23:
                java.util.concurrent.CountDownLatch r4 = r3.mDone
                r4.countDown()
                return
            L29:
                r4 = move-exception
                java.util.concurrent.CountDownLatch r0 = r3.mDone
                r0.countDown()
                throw r4
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.waiting = r0
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                r0.executePendingTask()
                return
        }

        public void waitForLoader() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.mDone     // Catch: java.lang.InterruptedException -> L5
                r0.await()     // Catch: java.lang.InterruptedException -> L5
            L5:
                return
        }
    }

    public AsyncTaskLoader(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.loader.content.ModernAsyncTask.THREAD_POOL_EXECUTOR
            r1.<init>(r2, r0)
            return
    }

    private AsyncTaskLoader(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = -10000(0xffffffffffffd8f0, double:NaN)
            r2.mLastLoadCompleteTime = r0
            r2.mExecutor = r4
            return
    }

    public void cancelLoadInBackground() {
            r0 = this;
            return
    }

    public final void dispatchOnCancelled(androidx.loader.content.AsyncTaskLoader<D>.LoadTask r1, D r2) {
            r0 = this;
            r0.onCanceled(r2)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r2 = r0.mCancellingTask
            if (r2 != r1) goto L19
            r0.rollbackContentChanged()
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.mLastLoadCompleteTime = r1
            r1 = 0
            r0.mCancellingTask = r1
            r0.deliverCancellation()
            r0.executePendingTask()
        L19:
            return
    }

    @Override // androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            super.dump(r5, r6, r7, r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            java.lang.String r8 = " waiting="
            if (r6 == 0) goto L20
            r7.print(r5)
            java.lang.String r6 = "mTask="
            r7.print(r6)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            r7.print(r6)
            r7.print(r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            boolean r6 = r6.waiting
            r7.println(r6)
        L20:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            if (r6 == 0) goto L3b
            r7.print(r5)
            java.lang.String r6 = "mCancellingTask="
            r7.print(r6)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            r7.print(r6)
            r7.print(r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            boolean r6 = r6.waiting
            r7.println(r6)
        L3b:
            long r0 = r4.mUpdateThrottle
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L61
            r7.print(r5)
            java.lang.String r5 = "mUpdateThrottle="
            r7.print(r5)
            long r5 = r4.mUpdateThrottle
            androidx.core.util.TimeUtils.formatDuration(r5, r7)
            java.lang.String r5 = " mLastLoadCompleteTime="
            r7.print(r5)
            long r5 = r4.mLastLoadCompleteTime
            long r0 = android.os.SystemClock.uptimeMillis()
            androidx.core.util.TimeUtils.formatDuration(r5, r0, r7)
            r7.println()
        L61:
            return
    }

    public final void executePendingTask() {
            r6 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mCancellingTask
            if (r0 != 0) goto L49
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            if (r0 == 0) goto L49
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L1a
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            r1 = 0
            r0.waiting = r1
            android.os.Handler r0 = r6.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r6.mTask
            r0.removeCallbacks(r1)
        L1a:
            long r0 = r6.mUpdateThrottle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.mLastLoadCompleteTime
            long r4 = r6.mUpdateThrottle
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L41
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            r1 = 1
            r0.waiting = r1
            android.os.Handler r0 = r6.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r6.mTask
            long r2 = r6.mLastLoadCompleteTime
            long r4 = r6.mUpdateThrottle
            long r2 = r2 + r4
            r0.postAtTime(r1, r2)
            return
        L41:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            java.util.concurrent.Executor r1 = r6.mExecutor
            r2 = 0
            r0.executeOnExecutor(r1, r2)
        L49:
            return
    }

    public boolean isLoadInBackgroundCanceled() {
            r1 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r1.mCancellingTask
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @androidx.annotation.Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public final boolean onCancelLoad() {
            r4 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r1 = 0
            if (r0 == 0) goto L4b
            boolean r0 = r4.mStarted
            if (r0 != 0) goto Lc
            r0 = 1
            r4.mContentChanged = r0
        Lc:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            r2 = 0
            if (r0 == 0) goto L25
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L22
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
        L22:
            r4.mTask = r2
            return r1
        L25:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L39
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
            r4.mTask = r2
            return r1
        L39:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L48
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r4.mTask
            r4.mCancellingTask = r1
            r4.cancelLoadInBackground()
        L48:
            r4.mTask = r2
            return r0
        L4b:
            return r1
    }

    public void onCanceled(@androidx.annotation.Nullable D r1) {
            r0 = this;
            return
    }

    @Override // androidx.loader.content.Loader
    public final void onForceLoad() {
            r1 = this;
            r1.cancelLoad()
            androidx.loader.content.AsyncTaskLoader$LoadTask r0 = new androidx.loader.content.AsyncTaskLoader$LoadTask
            r0.<init>(r1)
            r1.mTask = r0
            r1.executePendingTask()
            return
    }

    public void setUpdateThrottle(long r4) {
            r3 = this;
            r3.mUpdateThrottle = r4
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            r3.mHandler = r4
        Lf:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
            r1 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r1.mTask
            if (r0 == 0) goto L7
            r0.waitForLoader()
        L7:
            return
    }
}
