package androidx.core.provider;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@java.lang.Deprecated
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private android.os.Handler.Callback mCallback;
    private final int mDestructAfterMillisec;

    @androidx.annotation.GuardedBy("mLock")
    private int mGeneration;

    @androidx.annotation.GuardedBy("mLock")
    private android.os.Handler mHandler;
    private final java.lang.Object mLock;
    private final int mPriority;

    @androidx.annotation.GuardedBy("mLock")
    private android.os.HandlerThread mThread;
    private final java.lang.String mThreadName;




    /* JADX INFO: loaded from: classes.dex */
    public interface ReplyCallback<T> {
        void onReply(T r1);
    }

    public SelfDestructiveThread(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.core.provider.SelfDestructiveThread$1 r0 = new androidx.core.provider.SelfDestructiveThread$1
            r0.<init>(r1)
            r1.mCallback = r0
            r1.mThreadName = r2
            r1.mPriority = r3
            r1.mDestructAfterMillisec = r4
            r2 = 0
            r1.mGeneration = r2
            return
    }

    private void post(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.mThread     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            if (r1 != 0) goto L2a
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r5.mThreadName     // Catch: java.lang.Throwable -> L3b
            int r4 = r5.mPriority     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b
            r5.mThread = r1     // Catch: java.lang.Throwable -> L3b
            r1.start()     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L3b
            android.os.HandlerThread r3 = r5.mThread     // Catch: java.lang.Throwable -> L3b
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L3b
            android.os.Handler$Callback r4 = r5.mCallback     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b
            r5.mHandler = r1     // Catch: java.lang.Throwable -> L3b
            int r1 = r5.mGeneration     // Catch: java.lang.Throwable -> L3b
            int r1 = r1 + r2
            r5.mGeneration = r1     // Catch: java.lang.Throwable -> L3b
        L2a:
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3b
            android.os.Message r6 = r1.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L3b
            r1.sendMessage(r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    @androidx.annotation.VisibleForTesting
    public int getGeneration() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mGeneration     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public boolean isRunning() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r2.mThread     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public final void onDestruction() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mHandler     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        Le:
            android.os.HandlerThread r1 = r3.mThread     // Catch: java.lang.Throwable -> L1a
            r1.quit()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.mThread = r1     // Catch: java.lang.Throwable -> L1a
            r3.mHandler = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    public final void onInvokeRunnable(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.mLock
            monitor-enter(r5)
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.mDestructAfterMillisec     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public <T> void postAndReply(java.util.concurrent.Callable<T> r3, androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> r4) {
            r2 = this;
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.SelfDestructiveThread$2 r1 = new androidx.core.provider.SelfDestructiveThread$2
            r1.<init>(r3, r0, r4)
            r2.post(r1)
            return
    }

    public <T> T postAndWait(java.util.concurrent.Callable<T> r12, int r13) throws java.lang.InterruptedException {
            r11 = this;
            java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
            r6.<init>()
            java.util.concurrent.locks.Condition r7 = r6.newCondition()
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r9.<init>(r0)
            androidx.core.provider.SelfDestructiveThread$3 r10 = new androidx.core.provider.SelfDestructiveThread$3
            r0 = r10
            r1 = r8
            r2 = r12
            r3 = r6
            r4 = r9
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r11.post(r10)
            r6.lock()
            boolean r12 = r9.get()     // Catch: java.lang.Throwable -> L5c
            if (r12 != 0) goto L33
            java.lang.Object r12 = r8.get()     // Catch: java.lang.Throwable -> L5c
            r6.unlock()
            return r12
        L33:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5c
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L5c
            long r12 = r12.toNanos(r0)     // Catch: java.lang.Throwable -> L5c
        L3a:
            long r12 = r7.awaitNanos(r12)     // Catch: java.lang.InterruptedException -> L3e java.lang.Throwable -> L5c
        L3e:
            boolean r0 = r9.get()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L4c
            java.lang.Object r12 = r8.get()     // Catch: java.lang.Throwable -> L5c
            r6.unlock()
            return r12
        L4c:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L53
            goto L3a
        L53:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r13 = "timeout"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L5c
            throw r12     // Catch: java.lang.Throwable -> L5c
        L5c:
            r12 = move-exception
            r6.unlock()
            throw r12
    }
}
