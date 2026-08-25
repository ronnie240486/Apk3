package io.realm.internal.async;

/* JADX INFO: loaded from: classes.dex */
public class RealmThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE = 0;
    private static final int QUEUE_SIZE = 100;
    private static final java.lang.String SYS_CPU_DIR = "/sys/devices/system/cpu/";
    private boolean isPaused;
    private java.util.concurrent.locks.ReentrantLock pauseLock;
    private java.util.concurrent.locks.Condition unpaused;


    static {
            int r0 = calculateCorePoolSize()
            io.realm.internal.async.RealmThreadPoolExecutor.CORE_POOL_SIZE = r0
            return
    }

    private RealmThreadPoolExecutor(int r8, int r9) {
            r7 = this;
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ArrayBlockingQueue r6 = new java.util.concurrent.ArrayBlockingQueue
            r0 = 100
            r6.<init>(r0)
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r5, r6)
            java.util.concurrent.locks.ReentrantLock r8 = new java.util.concurrent.locks.ReentrantLock
            r8.<init>()
            r7.pauseLock = r8
            java.util.concurrent.locks.Condition r8 = r8.newCondition()
            r7.unpaused = r8
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int calculateCorePoolSize() {
            java.lang.String r0 = "/sys/devices/system/cpu/"
            java.lang.String r1 = "cpu[0-9]+"
            int r0 = countFilesInDir(r0, r1)
            if (r0 > 0) goto L12
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
        L12:
            r1 = 1
            if (r0 > 0) goto L16
            goto L19
        L16:
            int r0 = r0 * 2
            int r1 = r1 + r0
        L19:
            return r1
    }

    private static int countFilesInDir(java.lang.String r2, java.lang.String r3) {
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.SecurityException -> L17
            r1.<init>(r2)     // Catch: java.lang.SecurityException -> L17
            io.realm.internal.async.RealmThreadPoolExecutor$1 r2 = new io.realm.internal.async.RealmThreadPoolExecutor$1     // Catch: java.lang.SecurityException -> L17
            r2.<init>(r3)     // Catch: java.lang.SecurityException -> L17
            java.io.File[] r2 = r1.listFiles(r2)     // Catch: java.lang.SecurityException -> L17
            if (r2 != 0) goto L16
            goto L17
        L16:
            int r0 = r2.length     // Catch: java.lang.SecurityException -> L17
        L17:
            return r0
    }

    public static io.realm.internal.async.RealmThreadPoolExecutor newDefaultExecutor() {
            io.realm.internal.async.RealmThreadPoolExecutor r0 = new io.realm.internal.async.RealmThreadPoolExecutor
            int r1 = io.realm.internal.async.RealmThreadPoolExecutor.CORE_POOL_SIZE
            r0.<init>(r1, r1)
            return r0
    }

    public static io.realm.internal.async.RealmThreadPoolExecutor newSingleThreadExecutor() {
            io.realm.internal.async.RealmThreadPoolExecutor r0 = new io.realm.internal.async.RealmThreadPoolExecutor
            r1 = 1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(java.lang.Thread r1, java.lang.Runnable r2) {
            r0 = this;
            super.beforeExecute(r1, r2)
            java.util.concurrent.locks.ReentrantLock r2 = r0.pauseLock
            r2.lock()
        L8:
            boolean r2 = r0.isPaused     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1a
            if (r2 == 0) goto L12
            java.util.concurrent.locks.Condition r2 = r0.unpaused     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1a
            r2.await()     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1a
            goto L8
        L12:
            java.util.concurrent.locks.ReentrantLock r1 = r0.pauseLock
            r1.unlock()
            goto L1e
        L18:
            r1 = move-exception
            goto L1f
        L1a:
            r1.interrupt()     // Catch: java.lang.Throwable -> L18
            goto L12
        L1e:
            return
        L1f:
            java.util.concurrent.locks.ReentrantLock r2 = r0.pauseLock
            r2.unlock()
            throw r1
    }

    public void pause() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.pauseLock
            r0.lock()
            r0 = 1
            r2.isPaused = r0     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.locks.ReentrantLock r0 = r2.pauseLock
            r0.unlock()
            return
        Le:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.pauseLock
            r1.unlock()
            throw r0
    }

    public void resume() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.pauseLock
            r0.lock()
            r0 = 0
            r2.isPaused = r0     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.locks.Condition r0 = r2.unpaused     // Catch: java.lang.Throwable -> L13
            r0.signalAll()     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.locks.ReentrantLock r0 = r2.pauseLock
            r0.unlock()
            return
        L13:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.pauseLock
            r1.unlock()
            throw r0
    }

    public java.util.concurrent.Future<?> submitTransaction(java.lang.Runnable r2) {
            r1 = this;
            io.realm.internal.async.BgPriorityRunnable r0 = new io.realm.internal.async.BgPriorityRunnable
            r0.<init>(r2)
            java.util.concurrent.Future r2 = super.submit(r0)
            return r2
    }
}
