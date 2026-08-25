package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class RequestExecutor {

    public static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private int mPriority;
        private java.lang.String mThreadName;

        /* JADX INFO: loaded from: classes3.dex */
        public static class ProcessPriorityThread extends java.lang.Thread {
            private final int mPriority;

            public ProcessPriorityThread(java.lang.Runnable r1, java.lang.String r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.mPriority = r3
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r1 = this;
                    int r0 = r1.mPriority
                    android.os.Process.setThreadPriority(r0)
                    super.run()
                    return
            }
        }

        public DefaultThreadFactory() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "fonts-androidx"
                r1.mThreadName = r0
                r0 = 10
                r1.mPriority = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread r0 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
                java.lang.String r1 = r3.mThreadName
                int r2 = r3.mPriority
                r0.<init>(r4, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        public HandlerExecutor(@androidx.annotation.NonNull android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto Lf
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    public static class ReplyRunnable<T> implements java.lang.Runnable {

        @androidx.annotation.NonNull
        private java.util.concurrent.Callable<T> mCallable;

        @androidx.annotation.NonNull
        private androidx.core.util.Consumer<T> mConsumer;

        @androidx.annotation.NonNull
        private android.os.Handler mHandler;


        public ReplyRunnable(@androidx.annotation.NonNull android.os.Handler r1, @androidx.annotation.NonNull java.util.concurrent.Callable<T> r2, @androidx.annotation.NonNull androidx.core.util.Consumer<T> r3) {
                r0 = this;
                r0.<init>()
                r0.mCallable = r2
                r0.mConsumer = r3
                r0.mHandler = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.concurrent.Callable<T> r0 = r4.mCallable     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.core.util.Consumer<T> r1 = r4.mConsumer
                android.os.Handler r2 = r4.mHandler
                androidx.core.provider.RequestExecutor$ReplyRunnable$1 r3 = new androidx.core.provider.RequestExecutor$ReplyRunnable$1
                r3.<init>(r1, r0)
                r2.post(r3)
                return
        }
    }

    private RequestExecutor() {
            r0 = this;
            r0.<init>()
            return
    }
}
