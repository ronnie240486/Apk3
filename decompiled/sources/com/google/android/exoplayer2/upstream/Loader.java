package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class Loader implements com.google.android.exoplayer2.upstream.LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction DONT_RETRY = null;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction DONT_RETRY_FATAL = null;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction RETRY = null;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction RETRY_RESET_ERROR_COUNT = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.Loader.LoadTask<? extends com.google.android.exoplayer2.upstream.Loader.Loadable> currentTask;
    private final java.util.concurrent.ExecutorService downloadExecutorService;

    @androidx.annotation.Nullable
    private java.io.IOException fatalError;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Callback<T extends com.google.android.exoplayer2.upstream.Loader.Loadable> {
        void onLoadCanceled(T r1, long r2, long r4, boolean r6);

        void onLoadCompleted(T r1, long r2, long r4);

        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(T r1, long r2, long r4, java.io.IOException r6, int r7);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.retryDelayMillis = r2
                return
        }

        public /* synthetic */ LoadErrorAction(int r1, long r2, com.google.android.exoplayer2.upstream.Loader.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ int access$300(com.google.android.exoplayer2.upstream.Loader.LoadErrorAction r0) {
                int r0 = r0.type
                return r0
        }

        public static /* synthetic */ long access$400(com.google.android.exoplayer2.upstream.Loader.LoadErrorAction r2) {
                long r0 = r2.retryDelayMillis
                return r0
        }

        public boolean isRetry() {
                r2 = this;
                int r0 = r2.type
                r1 = 1
                if (r0 == 0) goto L9
                if (r0 != r1) goto L8
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public final class LoadTask<T extends com.google.android.exoplayer2.upstream.Loader.Loadable> extends android.os.Handler implements java.lang.Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final java.lang.String TAG = "LoadTask";

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.Loader.Callback<T> callback;
        private boolean canceled;

        @androidx.annotation.Nullable
        private java.io.IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;

        @androidx.annotation.Nullable
        private java.lang.Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;
        public final /* synthetic */ com.google.android.exoplayer2.upstream.Loader this$0;

        public LoadTask(com.google.android.exoplayer2.upstream.Loader r1, android.os.Looper r2, T r3, com.google.android.exoplayer2.upstream.Loader.Callback<T> r4, int r5, long r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.loadable = r3
                r0.callback = r4
                r0.defaultMinRetryCount = r5
                r0.startTimeMs = r6
                return
        }

        private void execute() {
                r2 = this;
                r0 = 0
                r2.currentError = r0
                com.google.android.exoplayer2.upstream.Loader r0 = r2.this$0
                java.util.concurrent.ExecutorService r0 = com.google.android.exoplayer2.upstream.Loader.access$500(r0)
                com.google.android.exoplayer2.upstream.Loader r1 = r2.this$0
                com.google.android.exoplayer2.upstream.Loader$LoadTask r1 = com.google.android.exoplayer2.upstream.Loader.access$100(r1)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.execute(r1)
                return
        }

        private void finish() {
                r2 = this;
                com.google.android.exoplayer2.upstream.Loader r0 = r2.this$0
                r1 = 0
                com.google.android.exoplayer2.upstream.Loader.access$102(r0, r1)
                return
        }

        private long getRetryDelayMillis() {
                r2 = this;
                int r0 = r2.errorCount
                int r0 = r0 + (-1)
                int r0 = r0 * 1000
                r1 = 5000(0x1388, float:7.006E-42)
                int r0 = java.lang.Math.min(r0, r1)
                long r0 = (long) r0
                return r0
        }

        public void cancel(boolean r9) {
                r8 = this;
                r8.released = r9
                r0 = 0
                r8.currentError = r0
                r1 = 0
                boolean r2 = r8.hasMessages(r1)
                r3 = 1
                if (r2 == 0) goto L18
                r8.canceled = r3
                r8.removeMessages(r1)
                if (r9 != 0) goto L28
                r8.sendEmptyMessage(r3)
                goto L28
            L18:
                monitor-enter(r8)
                r8.canceled = r3     // Catch: java.lang.Throwable -> L47
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r1 = r8.loadable     // Catch: java.lang.Throwable -> L47
                r1.cancelLoad()     // Catch: java.lang.Throwable -> L47
                java.lang.Thread r1 = r8.executorThread     // Catch: java.lang.Throwable -> L47
                if (r1 == 0) goto L27
                r1.interrupt()     // Catch: java.lang.Throwable -> L47
            L27:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L47
            L28:
                if (r9 == 0) goto L46
                r8.finish()
                long r3 = android.os.SystemClock.elapsedRealtime()
                com.google.android.exoplayer2.upstream.Loader$Callback<T extends com.google.android.exoplayer2.upstream.Loader$Loadable> r9 = r8.callback
                java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
                r1 = r9
                com.google.android.exoplayer2.upstream.Loader$Callback r1 = (com.google.android.exoplayer2.upstream.Loader.Callback) r1
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r2 = r8.loadable
                long r5 = r8.startTimeMs
                long r5 = r3 - r5
                r7 = 1
                r1.onLoadCanceled(r2, r3, r5, r7)
                r8.callback = r0
            L46:
                return
            L47:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L47
                throw r9
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r13) {
                r12 = this;
                boolean r0 = r12.released
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r13.what
                if (r0 != 0) goto Ld
                r12.execute()
                return
            Ld:
                r1 = 3
                if (r0 == r1) goto L9a
                r12.finish()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r2 = r12.startTimeMs
                long r6 = r4 - r2
                com.google.android.exoplayer2.upstream.Loader$Callback<T extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r12.callback
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                r2 = r0
                com.google.android.exoplayer2.upstream.Loader$Callback r2 = (com.google.android.exoplayer2.upstream.Loader.Callback) r2
                boolean r0 = r12.canceled
                if (r0 == 0) goto L2f
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r3 = r12.loadable
                r8 = 0
                r2.onLoadCanceled(r3, r4, r6, r8)
                return
            L2f:
                int r0 = r13.what
                r10 = 1
                if (r0 == r10) goto L81
                r11 = 2
                if (r0 == r11) goto L38
                goto L99
            L38:
                java.lang.Object r13 = r13.obj
                r8 = r13
                java.io.IOException r8 = (java.io.IOException) r8
                r12.currentError = r8
                int r13 = r12.errorCount
                int r9 = r13 + 1
                r12.errorCount = r9
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r3 = r12.loadable
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r13 = r2.onLoadError(r3, r4, r6, r8, r9)
                int r0 = com.google.android.exoplayer2.upstream.Loader.LoadErrorAction.access$300(r13)
                if (r0 != r1) goto L59
                com.google.android.exoplayer2.upstream.Loader r13 = r12.this$0
                java.io.IOException r0 = r12.currentError
                com.google.android.exoplayer2.upstream.Loader.access$202(r13, r0)
                goto L99
            L59:
                int r0 = com.google.android.exoplayer2.upstream.Loader.LoadErrorAction.access$300(r13)
                if (r0 == r11) goto L99
                int r0 = com.google.android.exoplayer2.upstream.Loader.LoadErrorAction.access$300(r13)
                if (r0 != r10) goto L67
                r12.errorCount = r10
            L67:
                long r0 = com.google.android.exoplayer2.upstream.Loader.LoadErrorAction.access$400(r13)
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L79
                long r0 = com.google.android.exoplayer2.upstream.Loader.LoadErrorAction.access$400(r13)
                goto L7d
            L79:
                long r0 = r12.getRetryDelayMillis()
            L7d:
                r12.start(r0)
                goto L99
            L81:
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r3 = r12.loadable     // Catch: java.lang.RuntimeException -> L87
                r2.onLoadCompleted(r3, r4, r6)     // Catch: java.lang.RuntimeException -> L87
                goto L99
            L87:
                r13 = move-exception
                java.lang.String r0 = "LoadTask"
                java.lang.String r1 = "Unexpected exception handling load completed"
                com.google.android.exoplayer2.util.Log.e(r0, r1, r13)
                com.google.android.exoplayer2.upstream.Loader r0 = r12.this$0
                com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException r1 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
                r1.<init>(r13)
                com.google.android.exoplayer2.upstream.Loader.access$202(r0, r1)
            L99:
                return
            L9a:
                java.lang.Object r13 = r13.obj
                java.lang.Error r13 = (java.lang.Error) r13
                throw r13
        }

        public void maybeThrowError(int r3) throws java.io.IOException {
                r2 = this;
                java.io.IOException r0 = r2.currentError
                if (r0 == 0) goto La
                int r1 = r2.errorCount
                if (r1 > r3) goto L9
                goto La
            L9:
                throw r0
            La:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 2
                monitor-enter(r4)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                boolean r1 = r4.canceled     // Catch: java.lang.Throwable -> L52
                r2 = 1
                if (r1 != 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L52
                r4.executorThread = r3     // Catch: java.lang.Throwable -> L52
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
                if (r1 == 0) goto L3f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                r1.<init>()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                java.lang.String r3 = "load:"
                r1.append(r3)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r3 = r4.loadable     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                r1.append(r3)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                com.google.android.exoplayer2.util.TraceUtil.beginSection(r1)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                T extends com.google.android.exoplayer2.upstream.Loader$Loadable r1 = r4.loadable     // Catch: java.lang.Throwable -> L3a
                r1.load()     // Catch: java.lang.Throwable -> L3a
                com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                goto L3f
            L3a:
                r1 = move-exception
                com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                throw r1     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
            L3f:
                monitor-enter(r4)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                r1 = 0
                r4.executorThread = r1     // Catch: java.lang.Throwable -> L4f
                java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                boolean r1 = r4.released     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                if (r1 != 0) goto La8
                r4.sendEmptyMessage(r2)     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
                goto La8
            L4f:
                r1 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                throw r1     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
            L52:
                r1 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
                throw r1     // Catch: java.lang.Error -> L55 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L83 java.io.IOException -> L9c
            L55:
                r0 = move-exception
                boolean r1 = r4.released
                if (r1 != 0) goto L69
                java.lang.String r1 = "LoadTask"
                java.lang.String r2 = "Unexpected error loading stream"
                com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
                r1 = 3
                android.os.Message r1 = r4.obtainMessage(r1, r0)
                r1.sendToTarget()
            L69:
                throw r0
            L6a:
                r1 = move-exception
                boolean r2 = r4.released
                if (r2 != 0) goto La8
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "OutOfMemory error loading stream"
                com.google.android.exoplayer2.util.Log.e(r2, r3, r1)
                com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
                r2.<init>(r1)
                android.os.Message r0 = r4.obtainMessage(r0, r2)
                r0.sendToTarget()
                goto La8
            L83:
                r1 = move-exception
                boolean r2 = r4.released
                if (r2 != 0) goto La8
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "Unexpected exception loading stream"
                com.google.android.exoplayer2.util.Log.e(r2, r3, r1)
                com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
                r2.<init>(r1)
                android.os.Message r0 = r4.obtainMessage(r0, r2)
                r0.sendToTarget()
                goto La8
            L9c:
                r1 = move-exception
                boolean r2 = r4.released
                if (r2 != 0) goto La8
                android.os.Message r0 = r4.obtainMessage(r0, r1)
                r0.sendToTarget()
            La8:
                return
        }

        public void start(long r5) {
                r4 = this;
                com.google.android.exoplayer2.upstream.Loader r0 = r4.this$0
                com.google.android.exoplayer2.upstream.Loader$LoadTask r0 = com.google.android.exoplayer2.upstream.Loader.access$100(r0)
                r1 = 0
                if (r0 != 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.upstream.Loader r0 = r4.this$0
                com.google.android.exoplayer2.upstream.Loader.access$102(r0, r4)
                r2 = 0
                int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r0 <= 0) goto L1e
                r4.sendEmptyMessageDelayed(r1, r5)
                goto L21
            L1e:
                r4.execute()
            L21:
                return
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws java.io.IOException;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class ReleaseTask implements java.lang.Runnable {
        private final com.google.android.exoplayer2.upstream.Loader.ReleaseCallback callback;

        public ReleaseTask(com.google.android.exoplayer2.upstream.Loader.ReleaseCallback r1) {
                r0 = this;
                r0.<init>()
                r0.callback = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.google.android.exoplayer2.upstream.Loader$ReleaseCallback r0 = r1.callback
                r0.onLoaderReleased()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class UnexpectedLoaderException extends java.io.IOException {
        public UnexpectedLoaderException(java.lang.Throwable r3) {
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
        }
    }

    static {
            r0 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r0 = createRetryAction(r0, r1)
            com.google.android.exoplayer2.upstream.Loader.RETRY = r0
            r0 = 1
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r0 = createRetryAction(r0, r1)
            com.google.android.exoplayer2.upstream.Loader.RETRY_RESET_ERROR_COUNT = r0
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r0 = new com.google.android.exoplayer2.upstream.Loader$LoadErrorAction
            r3 = 2
            r4 = 0
            r0.<init>(r3, r1, r4)
            com.google.android.exoplayer2.upstream.Loader.DONT_RETRY = r0
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r0 = new com.google.android.exoplayer2.upstream.Loader$LoadErrorAction
            r3 = 3
            r0.<init>(r3, r1, r4)
            com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL = r0
            return
    }

    public Loader(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExoPlayer:Loader:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.util.concurrent.ExecutorService r3 = com.google.android.exoplayer2.util.Util.newSingleThreadExecutor(r3)
            r2.downloadExecutorService = r3
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadTask access$100(com.google.android.exoplayer2.upstream.Loader r0) {
            com.google.android.exoplayer2.upstream.Loader$LoadTask<? extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r0.currentTask
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadTask access$102(com.google.android.exoplayer2.upstream.Loader r0, com.google.android.exoplayer2.upstream.Loader.LoadTask r1) {
            r0.currentTask = r1
            return r1
    }

    public static /* synthetic */ java.io.IOException access$202(com.google.android.exoplayer2.upstream.Loader r0, java.io.IOException r1) {
            r0.fatalError = r1
            return r1
    }

    public static /* synthetic */ java.util.concurrent.ExecutorService access$500(com.google.android.exoplayer2.upstream.Loader r0) {
            java.util.concurrent.ExecutorService r0 = r0.downloadExecutorService
            return r0
    }

    public static com.google.android.exoplayer2.upstream.Loader.LoadErrorAction createRetryAction(boolean r2, long r3) {
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r0 = new com.google.android.exoplayer2.upstream.Loader$LoadErrorAction
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public void cancelLoading() {
            r2 = this;
            com.google.android.exoplayer2.upstream.Loader$LoadTask<? extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r2.currentTask
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.upstream.Loader$LoadTask r0 = (com.google.android.exoplayer2.upstream.Loader.LoadTask) r0
            r1 = 0
            r0.cancel(r1)
            return
    }

    public void clearFatalError() {
            r1 = this;
            r0 = 0
            r1.fatalError = r0
            return
    }

    public boolean hasFatalError() {
            r1 = this;
            java.io.IOException r0 = r1.fatalError
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader$LoadTask<? extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r1.currentTask
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws java.io.IOException {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.maybeThrowError(r0)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int r3) throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.fatalError
            if (r0 != 0) goto L12
            com.google.android.exoplayer2.upstream.Loader$LoadTask<? extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r2.currentTask
            if (r0 == 0) goto L11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r1) goto Le
            int r3 = r0.defaultMinRetryCount
        Le:
            r0.maybeThrowError(r3)
        L11:
            return
        L12:
            throw r0
    }

    public void release() {
            r1 = this;
            r0 = 0
            r1.release(r0)
            return
    }

    public void release(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.Loader.ReleaseCallback r3) {
            r2 = this;
            com.google.android.exoplayer2.upstream.Loader$LoadTask<? extends com.google.android.exoplayer2.upstream.Loader$Loadable> r0 = r2.currentTask
            if (r0 == 0) goto L8
            r1 = 1
            r0.cancel(r1)
        L8:
            if (r3 == 0) goto L14
            java.util.concurrent.ExecutorService r0 = r2.downloadExecutorService
            com.google.android.exoplayer2.upstream.Loader$ReleaseTask r1 = new com.google.android.exoplayer2.upstream.Loader$ReleaseTask
            r1.<init>(r3)
            r0.execute(r1)
        L14:
            java.util.concurrent.ExecutorService r3 = r2.downloadExecutorService
            r3.shutdown()
            return
    }

    public <T extends com.google.android.exoplayer2.upstream.Loader.Loadable> long startLoading(T r12, com.google.android.exoplayer2.upstream.Loader.Callback<T> r13, int r14) {
            r11 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r3 = r0
            android.os.Looper r3 = (android.os.Looper) r3
            r0 = 0
            r11.fatalError = r0
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.google.android.exoplayer2.upstream.Loader$LoadTask r0 = new com.google.android.exoplayer2.upstream.Loader$LoadTask
            r1 = r0
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12 = 0
            r0.start(r12)
            return r9
    }
}
