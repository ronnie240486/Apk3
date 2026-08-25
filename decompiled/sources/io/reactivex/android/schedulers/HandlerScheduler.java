package io.reactivex.android.schedulers;

/* JADX INFO: loaded from: classes3.dex */
final class HandlerScheduler extends io.reactivex.Scheduler {
    private final boolean async;
    private final android.os.Handler handler;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class HandlerWorker extends io.reactivex.Scheduler.Worker {
        private final boolean async;
        private volatile boolean disposed;
        private final android.os.Handler handler;

        public HandlerWorker(android.os.Handler r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                r0.async = r2
                return
        }

        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                android.os.Handler r0 = r1.handler
                r0.removeCallbacksAndMessages(r1)
                return
        }

        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.lang.String r0 = "run == null"
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.String r0 = "unit == null"
                java.util.Objects.requireNonNull(r6, r0)
                boolean r0 = r2.disposed
                if (r0 == 0) goto L15
                io.reactivex.disposables.Disposable r3 = io.reactivex.disposables.Disposables.disposed()
                return r3
            L15:
                java.lang.Runnable r3 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r3)
                io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable r0 = new io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable
                android.os.Handler r1 = r2.handler
                r0.<init>(r1, r3)
                android.os.Message r3 = android.os.Message.obtain(r1, r0)
                r3.obj = r2
                boolean r1 = r2.async
                if (r1 == 0) goto L2e
                r1 = 1
                r3.setAsynchronous(r1)
            L2e:
                android.os.Handler r1 = r2.handler
                long r4 = r6.toMillis(r4)
                r1.sendMessageDelayed(r3, r4)
                boolean r3 = r2.disposed
                if (r3 == 0) goto L45
                android.os.Handler r3 = r2.handler
                r3.removeCallbacks(r0)
                io.reactivex.disposables.Disposable r3 = io.reactivex.disposables.Disposables.disposed()
                return r3
            L45:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ScheduledRunnable implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private final java.lang.Runnable delegate;
        private volatile boolean disposed;
        private final android.os.Handler handler;

        public ScheduledRunnable(android.os.Handler r1, java.lang.Runnable r2) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                r0.delegate = r2
                return
        }

        public void dispose() {
                r1 = this;
                android.os.Handler r0 = r1.handler
                r0.removeCallbacks(r1)
                r0 = 1
                r1.disposed = r0
                return
        }

        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.delegate     // Catch: java.lang.Throwable -> L6
                r0.run()     // Catch: java.lang.Throwable -> L6
                goto La
            L6:
                r0 = move-exception
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            La:
                return
        }
    }

    public HandlerScheduler(android.os.Handler r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            r0.async = r2
            return
    }

    public io.reactivex.Scheduler.Worker createWorker() {
            r3 = this;
            io.reactivex.android.schedulers.HandlerScheduler$HandlerWorker r0 = new io.reactivex.android.schedulers.HandlerScheduler$HandlerWorker
            android.os.Handler r1 = r3.handler
            boolean r2 = r3.async
            r0.<init>(r1, r2)
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            java.lang.String r0 = "run == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "unit == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.Runnable r3 = io.reactivex.plugins.RxJavaPlugins.onSchedule(r3)
            io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable r0 = new io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable
            android.os.Handler r1 = r2.handler
            r0.<init>(r1, r3)
            android.os.Message r3 = android.os.Message.obtain(r1, r0)
            boolean r1 = r2.async
            if (r1 == 0) goto L21
            r1 = 1
            r3.setAsynchronous(r1)
        L21:
            android.os.Handler r1 = r2.handler
            long r4 = r6.toMillis(r4)
            r1.sendMessageDelayed(r3, r4)
            return r0
    }
}
