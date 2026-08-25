package androidx.loader.content;

/* JADX INFO: loaded from: classes2.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final java.lang.String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE = 128;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR = null;
    private static volatile java.util.concurrent.Executor sDefaultExecutor;
    private static androidx.loader.content.ModernAsyncTask.InternalHandler sHandler;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> sPoolWorkQueue = null;
    private static final java.util.concurrent.ThreadFactory sThreadFactory = null;
    public final java.util.concurrent.atomic.AtomicBoolean mCancelled;
    private final java.util.concurrent.FutureTask<Result> mFuture;
    private volatile androidx.loader.content.ModernAsyncTask.Status mStatus;
    public final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked;
    private final androidx.loader.content.ModernAsyncTask.WorkerRunnable<Params, Result> mWorker;




    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = null;

        static {
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static class AsyncTaskResult<Data> {
        public final Data[] mData;
        public final androidx.loader.content.ModernAsyncTask mTask;

        public AsyncTaskResult(androidx.loader.content.ModernAsyncTask r1, Data... r2) {
                r0 = this;
                r0.<init>()
                r0.mTask = r1
                r0.mData = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class InternalHandler extends android.os.Handler {
        public InternalHandler() {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.Object r0 = r3.obj
                androidx.loader.content.ModernAsyncTask$AsyncTaskResult r0 = (androidx.loader.content.ModernAsyncTask.AsyncTaskResult) r0
                int r3 = r3.what
                r1 = 1
                if (r3 == r1) goto L13
                r1 = 2
                if (r3 == r1) goto Ld
                goto L1d
            Ld:
                androidx.loader.content.ModernAsyncTask r3 = r0.mTask
                java.util.Objects.requireNonNull(r3)
                goto L1d
            L13:
                androidx.loader.content.ModernAsyncTask r3 = r0.mTask
                Data[] r0 = r0.mData
                r1 = 0
                r0 = r0[r1]
                r3.finish(r0)
            L1d:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Status extends java.lang.Enum<androidx.loader.content.ModernAsyncTask.Status> {
        private static final /* synthetic */ androidx.loader.content.ModernAsyncTask.Status[] $VALUES = null;
        public static final androidx.loader.content.ModernAsyncTask.Status FINISHED = null;
        public static final androidx.loader.content.ModernAsyncTask.Status PENDING = null;
        public static final androidx.loader.content.ModernAsyncTask.Status RUNNING = null;

        static {
                androidx.loader.content.ModernAsyncTask$Status r0 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.loader.content.ModernAsyncTask.Status.PENDING = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.loader.content.ModernAsyncTask.Status.RUNNING = r1
                androidx.loader.content.ModernAsyncTask$Status r3 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r5 = "FINISHED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.loader.content.ModernAsyncTask.Status.FINISHED = r3
                r5 = 3
                androidx.loader.content.ModernAsyncTask$Status[] r5 = new androidx.loader.content.ModernAsyncTask.Status[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                androidx.loader.content.ModernAsyncTask.Status.$VALUES = r5
                return
        }

        private Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.loader.content.ModernAsyncTask.Status valueOf(java.lang.String r1) {
                java.lang.Class<androidx.loader.content.ModernAsyncTask$Status> r0 = androidx.loader.content.ModernAsyncTask.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.loader.content.ModernAsyncTask$Status r1 = (androidx.loader.content.ModernAsyncTask.Status) r1
                return r1
        }

        public static androidx.loader.content.ModernAsyncTask.Status[] values() {
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.loader.content.ModernAsyncTask$Status[] r0 = (androidx.loader.content.ModernAsyncTask.Status[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class WorkerRunnable<Params, Result> implements java.util.concurrent.Callable<Result> {
        public Params[] mParams;

        public WorkerRunnable() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.loader.content.ModernAsyncTask$1 r7 = new androidx.loader.content.ModernAsyncTask$1
            r7.<init>()
            androidx.loader.content.ModernAsyncTask.sThreadFactory = r7
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 10
            r6.<init>(r0)
            androidx.loader.content.ModernAsyncTask.sPoolWorkQueue = r6
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            r2 = 128(0x80, float:1.8E-43)
            r3 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            androidx.loader.content.ModernAsyncTask.THREAD_POOL_EXECUTOR = r8
            androidx.loader.content.ModernAsyncTask.sDefaultExecutor = r8
            return
    }

    public ModernAsyncTask() {
            r2 = this;
            r2.<init>()
            androidx.loader.content.ModernAsyncTask$Status r0 = androidx.loader.content.ModernAsyncTask.Status.PENDING
            r2.mStatus = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.mCancelled = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.mTaskInvoked = r0
            androidx.loader.content.ModernAsyncTask$2 r0 = new androidx.loader.content.ModernAsyncTask$2
            r0.<init>(r2)
            r2.mWorker = r0
            androidx.loader.content.ModernAsyncTask$3 r1 = new androidx.loader.content.ModernAsyncTask$3
            r1.<init>(r2, r0)
            r2.mFuture = r1
            return
    }

    public static void execute(java.lang.Runnable r1) {
            java.util.concurrent.Executor r0 = androidx.loader.content.ModernAsyncTask.sDefaultExecutor
            r0.execute(r1)
            return
    }

    private static android.os.Handler getHandler() {
            java.lang.Class<androidx.loader.content.ModernAsyncTask> r0 = androidx.loader.content.ModernAsyncTask.class
            monitor-enter(r0)
            androidx.loader.content.ModernAsyncTask$InternalHandler r1 = androidx.loader.content.ModernAsyncTask.sHandler     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            androidx.loader.content.ModernAsyncTask$InternalHandler r1 = new androidx.loader.content.ModernAsyncTask$InternalHandler     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            androidx.loader.content.ModernAsyncTask.sHandler = r1     // Catch: java.lang.Throwable -> L12
        Le:
            androidx.loader.content.ModernAsyncTask$InternalHandler r1 = androidx.loader.content.ModernAsyncTask.sHandler     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDefaultExecutor(java.util.concurrent.Executor r0) {
            androidx.loader.content.ModernAsyncTask.sDefaultExecutor = r0
            return
    }

    public final boolean cancel(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mCancelled
            r1 = 1
            r0.set(r1)
            java.util.concurrent.FutureTask<Result> r0 = r2.mFuture
            boolean r3 = r0.cancel(r3)
            return r3
    }

    public abstract Result doInBackground(Params... r1);

    public final androidx.loader.content.ModernAsyncTask<Params, Progress, Result> execute(Params... r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.loader.content.ModernAsyncTask.sDefaultExecutor
            androidx.loader.content.ModernAsyncTask r2 = r1.executeOnExecutor(r0, r2)
            return r2
    }

    public final androidx.loader.content.ModernAsyncTask<Params, Progress, Result> executeOnExecutor(java.util.concurrent.Executor r3, Params... r4) {
            r2 = this;
            androidx.loader.content.ModernAsyncTask$Status r0 = r2.mStatus
            androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.PENDING
            if (r0 == r1) goto L2e
            int[] r3 = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status
            androidx.loader.content.ModernAsyncTask$Status r4 = r2.mStatus
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L26
            r4 = 2
            if (r3 == r4) goto L1e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "We should never reach this state"
            r3.<init>(r4)
            throw r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot execute task: the task has already been executed (a task can be executed only once)"
            r3.<init>(r4)
            throw r3
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot execute task: the task is already running."
            r3.<init>(r4)
            throw r3
        L2e:
            androidx.loader.content.ModernAsyncTask$Status r0 = androidx.loader.content.ModernAsyncTask.Status.RUNNING
            r2.mStatus = r0
            androidx.loader.content.ModernAsyncTask$WorkerRunnable<Params, Result> r0 = r2.mWorker
            r0.mParams = r4
            java.util.concurrent.FutureTask<Result> r4 = r2.mFuture
            r3.execute(r4)
            return r2
    }

    public final void finish(Result r2) {
            r1 = this;
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto La
            r1.onCancelled(r2)
            goto Ld
        La:
            r1.onPostExecute(r2)
        Ld:
            androidx.loader.content.ModernAsyncTask$Status r2 = androidx.loader.content.ModernAsyncTask.Status.FINISHED
            r1.mStatus = r2
            return
    }

    public final Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.FutureTask<Result> r0 = r1.mFuture
            java.lang.Object r0 = r0.get()
            return r0
    }

    public final Result get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.FutureTask<Result> r0 = r1.mFuture
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    public final androidx.loader.content.ModernAsyncTask.Status getStatus() {
            r1 = this;
            androidx.loader.content.ModernAsyncTask$Status r0 = r1.mStatus
            return r0
    }

    public final boolean isCancelled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mCancelled
            boolean r0 = r0.get()
            return r0
    }

    public void onCancelled(Result r1) {
            r0 = this;
            return
    }

    public void onPostExecute(Result r1) {
            r0 = this;
            return
    }

    public final Result postResult(Result r6) {
            r5 = this;
            android.os.Handler r0 = getHandler()
            androidx.loader.content.ModernAsyncTask$AsyncTaskResult r1 = new androidx.loader.content.ModernAsyncTask$AsyncTaskResult
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            r1.<init>(r5, r3)
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            return r6
    }
}
