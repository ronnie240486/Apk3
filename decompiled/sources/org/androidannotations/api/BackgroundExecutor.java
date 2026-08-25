package org.androidannotations.api;

/* JADX INFO: loaded from: classes3.dex */
public class BackgroundExecutor {
    public static java.util.concurrent.Executor DEFAULT_EXECUTOR = null;
    public static final org.androidannotations.api.BackgroundExecutor.WrongThreadListener DEFAULT_WRONG_THREAD_LISTENER = null;
    private static final java.lang.String TAG = "BackgroundExecutor";
    private static final java.lang.ThreadLocal<java.lang.String> currentSerial = null;
    private static java.util.concurrent.Executor executor;
    private static final java.util.List<org.androidannotations.api.BackgroundExecutor.Task> tasks = null;
    private static org.androidannotations.api.BackgroundExecutor.WrongThreadListener wrongThreadListener;



    public static abstract class Task implements java.lang.Runnable {
        private boolean executionAsked;
        private java.util.concurrent.Future<?> future;
        private java.lang.String id;
        private java.util.concurrent.atomic.AtomicBoolean managed;
        private int remainingDelay;
        private java.lang.String serial;
        private long targetTimeMillis;

        public Task(java.lang.String r4, int r5, java.lang.String r6) {
                r3 = this;
                r3.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r3.managed = r0
                java.lang.String r0 = ""
                boolean r1 = r0.equals(r4)
                if (r1 != 0) goto L14
                r3.id = r4
            L14:
                if (r5 <= 0) goto L20
                r3.remainingDelay = r5
                long r1 = java.lang.System.currentTimeMillis()
                long r4 = (long) r5
                long r1 = r1 + r4
                r3.targetTimeMillis = r1
            L20:
                boolean r4 = r0.equals(r6)
                if (r4 != 0) goto L28
                r3.serial = r6
            L28:
                return
        }

        public static /* synthetic */ java.lang.String access$000(org.androidannotations.api.BackgroundExecutor.Task r0) {
                java.lang.String r0 = r0.serial
                return r0
        }

        public static /* synthetic */ boolean access$100(org.androidannotations.api.BackgroundExecutor.Task r0) {
                boolean r0 = r0.executionAsked
                return r0
        }

        public static /* synthetic */ void access$102(org.androidannotations.api.BackgroundExecutor.Task r1) {
                r0 = 1
                r1.executionAsked = r0
                return
        }

        public static /* synthetic */ int access$200(org.androidannotations.api.BackgroundExecutor.Task r0) {
                int r0 = r0.remainingDelay
                return r0
        }

        public static /* synthetic */ java.lang.String access$300(org.androidannotations.api.BackgroundExecutor.Task r0) {
                java.lang.String r0 = r0.id
                return r0
        }

        public static /* synthetic */ java.util.concurrent.Future access$400(org.androidannotations.api.BackgroundExecutor.Task r0) {
                java.util.concurrent.Future<?> r0 = r0.future
                return r0
        }

        public static /* synthetic */ java.util.concurrent.Future access$402(org.androidannotations.api.BackgroundExecutor.Task r0, java.util.concurrent.Future r1) {
                r0.future = r1
                return r1
        }

        public static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$500(org.androidannotations.api.BackgroundExecutor.Task r0) {
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.managed
                return r0
        }

        public static /* synthetic */ void access$600(org.androidannotations.api.BackgroundExecutor.Task r0) {
                r0.postExecute()
                return
        }

        private void postExecute() {
                r7 = this;
                java.lang.String r0 = r7.id
                if (r0 != 0) goto L9
                java.lang.String r0 = r7.serial
                if (r0 != 0) goto L9
                return
            L9:
                java.lang.ThreadLocal r0 = org.androidannotations.api.BackgroundExecutor.access$700()
                r1 = 0
                r0.set(r1)
                java.lang.Class<org.androidannotations.api.BackgroundExecutor> r0 = org.androidannotations.api.BackgroundExecutor.class
                monitor-enter(r0)
                java.util.List r1 = org.androidannotations.api.BackgroundExecutor.access$800()     // Catch: java.lang.Throwable -> L3d
                r1.remove(r7)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = r7.serial     // Catch: java.lang.Throwable -> L3d
                if (r1 == 0) goto L3b
                org.androidannotations.api.BackgroundExecutor$Task r1 = org.androidannotations.api.BackgroundExecutor.access$900(r1)     // Catch: java.lang.Throwable -> L3d
                if (r1 == 0) goto L3b
                int r2 = r1.remainingDelay     // Catch: java.lang.Throwable -> L3d
                if (r2 == 0) goto L38
                r2 = 0
                long r3 = r7.targetTimeMillis     // Catch: java.lang.Throwable -> L3d
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3d
                long r3 = r3 - r5
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L3d
                int r2 = java.lang.Math.max(r2, r4)     // Catch: java.lang.Throwable -> L3d
                r1.remainingDelay = r2     // Catch: java.lang.Throwable -> L3d
            L38:
                org.androidannotations.api.BackgroundExecutor.execute(r1)     // Catch: java.lang.Throwable -> L3d
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                return
            L3d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                throw r1
        }

        public abstract void execute();

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.managed
                r1 = 1
                boolean r0 = r0.getAndSet(r1)
                if (r0 == 0) goto La
                return
            La:
                java.lang.ThreadLocal r0 = org.androidannotations.api.BackgroundExecutor.access$700()     // Catch: java.lang.Throwable -> L1a
                java.lang.String r1 = r2.serial     // Catch: java.lang.Throwable -> L1a
                r0.set(r1)     // Catch: java.lang.Throwable -> L1a
                r2.execute()     // Catch: java.lang.Throwable -> L1a
                r2.postExecute()
                return
            L1a:
                r0 = move-exception
                r2.postExecute()
                throw r0
        }
    }

    public interface WrongThreadListener {
        void onBgExpected(java.lang.String... r1);

        void onUiExpected();

        void onWrongBgSerial(java.lang.String r1, java.lang.String... r2);
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            org.androidannotations.api.BackgroundExecutor.DEFAULT_EXECUTOR = r0
            org.androidannotations.api.BackgroundExecutor.executor = r0
            org.androidannotations.api.BackgroundExecutor$1 r0 = new org.androidannotations.api.BackgroundExecutor$1
            r0.<init>()
            org.androidannotations.api.BackgroundExecutor.DEFAULT_WRONG_THREAD_LISTENER = r0
            org.androidannotations.api.BackgroundExecutor.wrongThreadListener = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.androidannotations.api.BackgroundExecutor.tasks = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            org.androidannotations.api.BackgroundExecutor.currentSerial = r0
            return
    }

    public BackgroundExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.ThreadLocal access$700() {
            java.lang.ThreadLocal<java.lang.String> r0 = org.androidannotations.api.BackgroundExecutor.currentSerial
            return r0
    }

    public static /* synthetic */ java.util.List access$800() {
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r0 = org.androidannotations.api.BackgroundExecutor.tasks
            return r0
    }

    public static /* synthetic */ org.androidannotations.api.BackgroundExecutor.Task access$900(java.lang.String r0) {
            org.androidannotations.api.BackgroundExecutor$Task r0 = take(r0)
            return r0
    }

    public static synchronized void cancelAll(java.lang.String r7, boolean r8) {
            java.lang.Class<org.androidannotations.api.BackgroundExecutor> r0 = org.androidannotations.api.BackgroundExecutor.class
            monitor-enter(r0)
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r1 = org.androidannotations.api.BackgroundExecutor.tasks     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            r2 = 1
            int r1 = r1 - r2
        Lb:
            if (r1 < 0) goto L66
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r3 = org.androidannotations.api.BackgroundExecutor.tasks     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L68
            org.androidannotations.api.BackgroundExecutor$Task r4 = (org.androidannotations.api.BackgroundExecutor.Task) r4     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = org.androidannotations.api.BackgroundExecutor.Task.access$300(r4)     // Catch: java.lang.Throwable -> L68
            boolean r5 = r7.equals(r5)     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L63
            java.util.concurrent.Future r5 = org.androidannotations.api.BackgroundExecutor.Task.access$400(r4)     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L3a
            java.util.concurrent.Future r3 = org.androidannotations.api.BackgroundExecutor.Task.access$400(r4)     // Catch: java.lang.Throwable -> L68
            r3.cancel(r8)     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.atomic.AtomicBoolean r3 = org.androidannotations.api.BackgroundExecutor.Task.access$500(r4)     // Catch: java.lang.Throwable -> L68
            boolean r3 = r3.getAndSet(r2)     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L63
            org.androidannotations.api.BackgroundExecutor.Task.access$600(r4)     // Catch: java.lang.Throwable -> L68
            goto L63
        L3a:
            boolean r5 = org.androidannotations.api.BackgroundExecutor.Task.access$100(r4)     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L60
            java.lang.String r3 = "BackgroundExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "A task with id "
            r5.append(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = org.androidannotations.api.BackgroundExecutor.Task.access$300(r4)     // Catch: java.lang.Throwable -> L68
            r5.append(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = " cannot be cancelled (the executor set does not support it)"
            r5.append(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L68
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L68
            goto L63
        L60:
            r3.remove(r1)     // Catch: java.lang.Throwable -> L68
        L63:
            int r1 = r1 + (-1)
            goto Lb
        L66:
            monitor-exit(r0)
            return
        L68:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public static void checkBgThread(java.lang.String... r4) {
            int r0 = r4.length
            if (r0 != 0) goto L17
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L16
            org.androidannotations.api.BackgroundExecutor$WrongThreadListener r0 = org.androidannotations.api.BackgroundExecutor.wrongThreadListener
            r0.onBgExpected(r4)
        L16:
            return
        L17:
            java.lang.ThreadLocal<java.lang.String> r0 = org.androidannotations.api.BackgroundExecutor.currentSerial
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L28
            org.androidannotations.api.BackgroundExecutor$WrongThreadListener r0 = org.androidannotations.api.BackgroundExecutor.wrongThreadListener
            r1 = 0
            r0.onWrongBgSerial(r1, r4)
            return
        L28:
            int r1 = r4.length
            r2 = 0
        L2a:
            if (r2 >= r1) goto L38
            r3 = r4[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L35
            return
        L35:
            int r2 = r2 + 1
            goto L2a
        L38:
            org.androidannotations.api.BackgroundExecutor$WrongThreadListener r1 = org.androidannotations.api.BackgroundExecutor.wrongThreadListener
            r1.onWrongBgSerial(r0, r4)
            return
    }

    public static void checkUiThread() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L13
            org.androidannotations.api.BackgroundExecutor$WrongThreadListener r0 = org.androidannotations.api.BackgroundExecutor.wrongThreadListener
            r0.onUiExpected()
        L13:
            return
    }

    private static java.util.concurrent.Future<?> directExecute(java.lang.Runnable r3, int r4) {
            if (r4 <= 0) goto L1a
            java.util.concurrent.Executor r0 = org.androidannotations.api.BackgroundExecutor.executor
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r1 == 0) goto L12
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            long r1 = (long) r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r3 = r0.schedule(r3, r1, r4)
            goto L2b
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The executor set does not support scheduling"
            r3.<init>(r4)
            throw r3
        L1a:
            java.util.concurrent.Executor r4 = org.androidannotations.api.BackgroundExecutor.executor
            boolean r0 = r4 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L27
            java.util.concurrent.ExecutorService r4 = (java.util.concurrent.ExecutorService) r4
            java.util.concurrent.Future r3 = r4.submit(r3)
            goto L2b
        L27:
            r4.execute(r3)
            r3 = 0
        L2b:
            return r3
    }

    public static void execute(java.lang.Runnable r1) {
            r0 = 0
            directExecute(r1, r0)
            return
    }

    public static void execute(java.lang.Runnable r0, int r1) {
            directExecute(r0, r1)
            return
    }

    public static void execute(java.lang.Runnable r1, java.lang.String r2, int r3, java.lang.String r4) {
            org.androidannotations.api.BackgroundExecutor$2 r0 = new org.androidannotations.api.BackgroundExecutor$2
            r0.<init>(r2, r3, r4, r1)
            execute(r0)
            return
    }

    public static void execute(java.lang.Runnable r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            execute(r1, r2, r0, r3)
            return
    }

    public static synchronized void execute(org.androidannotations.api.BackgroundExecutor.Task r3) {
            java.lang.Class<org.androidannotations.api.BackgroundExecutor> r0 = org.androidannotations.api.BackgroundExecutor.class
            monitor-enter(r0)
            java.lang.String r1 = org.androidannotations.api.BackgroundExecutor.Task.access$000(r3)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            java.lang.String r1 = org.androidannotations.api.BackgroundExecutor.Task.access$000(r3)     // Catch: java.lang.Throwable -> L37
            boolean r1 = hasSerialRunning(r1)     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L21
        L16:
            org.androidannotations.api.BackgroundExecutor.Task.access$102(r3)     // Catch: java.lang.Throwable -> L37
            int r1 = org.androidannotations.api.BackgroundExecutor.Task.access$200(r3)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.Future r1 = directExecute(r3, r1)     // Catch: java.lang.Throwable -> L37
        L21:
            java.lang.String r2 = org.androidannotations.api.BackgroundExecutor.Task.access$300(r3)     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L2d
            java.lang.String r2 = org.androidannotations.api.BackgroundExecutor.Task.access$000(r3)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L35
        L2d:
            org.androidannotations.api.BackgroundExecutor.Task.access$402(r3, r1)     // Catch: java.lang.Throwable -> L37
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r1 = org.androidannotations.api.BackgroundExecutor.tasks     // Catch: java.lang.Throwable -> L37
            r1.add(r3)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r0)
            return
        L37:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private static boolean hasSerialRunning(java.lang.String r3) {
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r0 = org.androidannotations.api.BackgroundExecutor.tasks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            org.androidannotations.api.BackgroundExecutor$Task r1 = (org.androidannotations.api.BackgroundExecutor.Task) r1
            boolean r2 = org.androidannotations.api.BackgroundExecutor.Task.access$100(r1)
            if (r2 == 0) goto L6
            java.lang.String r1 = org.androidannotations.api.BackgroundExecutor.Task.access$000(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public static void setExecutor(java.util.concurrent.Executor r0) {
            org.androidannotations.api.BackgroundExecutor.executor = r0
            return
    }

    public static void setWrongThreadListener(org.androidannotations.api.BackgroundExecutor.WrongThreadListener r0) {
            org.androidannotations.api.BackgroundExecutor.wrongThreadListener = r0
            return
    }

    private static org.androidannotations.api.BackgroundExecutor.Task take(java.lang.String r4) {
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r0 = org.androidannotations.api.BackgroundExecutor.tasks
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L25
            java.util.List<org.androidannotations.api.BackgroundExecutor$Task> r2 = org.androidannotations.api.BackgroundExecutor.tasks
            java.lang.Object r3 = r2.get(r1)
            org.androidannotations.api.BackgroundExecutor$Task r3 = (org.androidannotations.api.BackgroundExecutor.Task) r3
            java.lang.String r3 = org.androidannotations.api.BackgroundExecutor.Task.access$000(r3)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L22
            java.lang.Object r4 = r2.remove(r1)
            org.androidannotations.api.BackgroundExecutor$Task r4 = (org.androidannotations.api.BackgroundExecutor.Task) r4
            return r4
        L22:
            int r1 = r1 + 1
            goto L7
        L25:
            r4 = 0
            return r4
    }
}
