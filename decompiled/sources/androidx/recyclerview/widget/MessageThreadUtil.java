package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class MessageThreadUtil<T> implements androidx.recyclerview.widget.ThreadUtil<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass1 implements androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> {
        private final android.os.Handler mMainThreadHandler;
        private java.lang.Runnable mMainThreadRunnable;
        public final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue;
        public final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.MainThreadCallback val$callback;


        public AnonymousClass1(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback r2) {
                r1 = this;
                r1.val$callback = r2
                r1.<init>()
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r2 = new androidx.recyclerview.widget.MessageThreadUtil$MessageQueue
                r2.<init>()
                r1.mQueue = r2
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0)
                r1.mMainThreadHandler = r2
                androidx.recyclerview.widget.MessageThreadUtil$1$1 r2 = new androidx.recyclerview.widget.MessageThreadUtil$1$1
                r2.<init>(r1)
                r1.mMainThreadRunnable = r2
                return
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessage(r2)
                android.os.Handler r2 = r1.mMainThreadHandler
                java.lang.Runnable r0 = r1.mMainThreadRunnable
                r2.post(r0)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int r2, androidx.recyclerview.widget.TileList.Tile<T> r3) {
                r1 = this;
                r0 = 2
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int r2, int r3) {
                r1 = this;
                r0 = 3
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int r2, int r3) {
                r1 = this;
                r0 = 1
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass2 implements androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> {
        private java.lang.Runnable mBackgroundRunnable;
        public java.util.concurrent.atomic.AtomicBoolean mBackgroundRunning;
        private final java.util.concurrent.Executor mExecutor;
        public final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue;
        public final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.BackgroundCallback val$callback;


        public AnonymousClass2(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback r2) {
                r1 = this;
                r1.val$callback = r2
                r1.<init>()
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r2 = new androidx.recyclerview.widget.MessageThreadUtil$MessageQueue
                r2.<init>()
                r1.mQueue = r2
                java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                r1.mExecutor = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r0 = 0
                r2.<init>(r0)
                r1.mBackgroundRunning = r2
                androidx.recyclerview.widget.MessageThreadUtil$2$1 r2 = new androidx.recyclerview.widget.MessageThreadUtil$2$1
                r2.<init>(r1)
                r1.mBackgroundRunnable = r2
                return
        }

        private void maybeExecuteBackgroundRunnable() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.mBackgroundRunning
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L11
                java.util.concurrent.Executor r0 = r3.mExecutor
                java.lang.Runnable r1 = r3.mBackgroundRunnable
                r0.execute(r1)
            L11:
                return
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessage(r2)
                r1.maybeExecuteBackgroundRunnable()
                return
        }

        private void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                androidx.recyclerview.widget.MessageThreadUtil$MessageQueue r0 = r1.mQueue
                r0.sendMessageAtFrontOfQueue(r2)
                r1.maybeExecuteBackgroundRunnable()
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int r2, int r3) {
                r1 = this;
                r0 = 3
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r2, r3)
                r1.sendMessage(r2)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> r3) {
                r2 = this;
                r0 = 4
                r1 = 0
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r3 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r1, r3)
                r2.sendMessage(r3)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r3 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r3, r1)
                r2.sendMessageAtFrontOfQueue(r3)
                return
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int r8, int r9, int r10, int r11, int r12) {
                r7 = this;
                r0 = 2
                r6 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r8 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                r7.sendMessageAtFrontOfQueue(r8)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class MessageQueue {
        private androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem mRoot;

        public MessageQueue() {
                r0 = this;
                r0.<init>()
                return
        }

        public final synchronized androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next() {
                r2 = this;
                monitor-enter(r2)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r0 = r2.mRoot     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L8
                r0 = 0
                monitor-exit(r2)
                return r0
            L8:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r0.next     // Catch: java.lang.Throwable -> Le
                r2.mRoot = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)
                return r0
            Le:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        public final synchronized void removeMessages(int r5) {
                r4 = this;
                monitor-enter(r4)
            L1:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r0 = r4.mRoot     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L11
                int r1 = r0.what     // Catch: java.lang.Throwable -> L28
                if (r1 != r5) goto L11
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r0.next     // Catch: java.lang.Throwable -> L28
                r4.mRoot = r1     // Catch: java.lang.Throwable -> L28
                r0.recycle()     // Catch: java.lang.Throwable -> L28
                goto L1
            L11:
                if (r0 == 0) goto L26
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r0.next     // Catch: java.lang.Throwable -> L28
            L15:
                if (r1 == 0) goto L26
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> L28
                int r3 = r1.what     // Catch: java.lang.Throwable -> L28
                if (r3 != r5) goto L23
                r0.next = r2     // Catch: java.lang.Throwable -> L28
                r1.recycle()     // Catch: java.lang.Throwable -> L28
                goto L24
            L23:
                r0 = r1
            L24:
                r1 = r2
                goto L15
            L26:
                monitor-exit(r4)
                return
            L28:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
        }

        public final synchronized void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r3) {
                r2 = this;
                monitor-enter(r2)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r0 = r2.mRoot     // Catch: java.lang.Throwable -> L13
                if (r0 != 0) goto L9
                r2.mRoot = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r2)
                return
            L9:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = r0.next     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto Lf
                r0 = r1
                goto L9
            Lf:
                r0.next = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r2)
                return
            L13:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }

        public final synchronized void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem r2) {
                r1 = this;
                monitor-enter(r1)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r0 = r1.mRoot     // Catch: java.lang.Throwable -> L9
                r2.next = r0     // Catch: java.lang.Throwable -> L9
                r1.mRoot = r2     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return
            L9:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }
    }

    public static class SyncQueueItem {
        private static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem sPool;
        private static final java.lang.Object sPoolLock = null;
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public java.lang.Object data;
        public androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next;
        public int what;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock = r0
                return
        }

        public SyncQueueItem() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r7, int r8, int r9) {
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r7 = obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        public static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r3, int r4, int r5, int r6, int r7, int r8, java.lang.Object r9) {
                java.lang.Object r0 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto Ld
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = new androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem     // Catch: java.lang.Throwable -> L24
                r1.<init>()     // Catch: java.lang.Throwable -> L24
                goto L14
            Ld:
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r2 = r1.next     // Catch: java.lang.Throwable -> L24
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool = r2     // Catch: java.lang.Throwable -> L24
                r2 = 0
                r1.next = r2     // Catch: java.lang.Throwable -> L24
            L14:
                r1.what = r3     // Catch: java.lang.Throwable -> L24
                r1.arg1 = r4     // Catch: java.lang.Throwable -> L24
                r1.arg2 = r5     // Catch: java.lang.Throwable -> L24
                r1.arg3 = r6     // Catch: java.lang.Throwable -> L24
                r1.arg4 = r7     // Catch: java.lang.Throwable -> L24
                r1.arg5 = r8     // Catch: java.lang.Throwable -> L24
                r1.data = r9     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                return r1
            L24:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r3
        }

        public static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int r7, int r8, java.lang.Object r9) {
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r7
                r1 = r8
                r6 = r9
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r7 = obtainMessage(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        public final void recycle() {
                r2 = this;
                r0 = 0
                r2.next = r0
                r1 = 0
                r2.arg5 = r1
                r2.arg4 = r1
                r2.arg3 = r1
                r2.arg2 = r1
                r2.arg1 = r1
                r2.what = r1
                r2.data = r0
                java.lang.Object r0 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPoolLock
                monitor-enter(r0)
                androidx.recyclerview.widget.MessageThreadUtil$SyncQueueItem r1 = androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool     // Catch: java.lang.Throwable -> L1f
                if (r1 == 0) goto L1b
                r2.next = r1     // Catch: java.lang.Throwable -> L1f
            L1b:
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.sPool = r2     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                return
            L1f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                throw r1
        }
    }

    public MessageThreadUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.MessageThreadUtil$2 r0 = new androidx.recyclerview.widget.MessageThreadUtil$2
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.MessageThreadUtil$1 r0 = new androidx.recyclerview.widget.MessageThreadUtil$1
            r0.<init>(r2)
            return r0
    }
}
