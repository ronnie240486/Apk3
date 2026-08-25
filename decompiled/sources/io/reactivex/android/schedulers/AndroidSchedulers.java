package io.reactivex.android.schedulers;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidSchedulers {
    private static final io.reactivex.Scheduler MAIN_THREAD = null;


    /* JADX INFO: loaded from: classes3.dex */
    public static final class MainHolder {
        public static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.android.schedulers.HandlerScheduler r0 = new io.reactivex.android.schedulers.HandlerScheduler
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.android.schedulers.AndroidSchedulers.MainHolder.DEFAULT = r0
                return
        }

        private MainHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            io.reactivex.android.schedulers.AndroidSchedulers$1 r0 = new io.reactivex.android.schedulers.AndroidSchedulers$1
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.android.plugins.RxAndroidPlugins.initMainThreadScheduler(r0)
            io.reactivex.android.schedulers.AndroidSchedulers.MAIN_THREAD = r0
            return
    }

    private AndroidSchedulers() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances."
            r0.<init>(r1)
            throw r0
    }

    public static io.reactivex.Scheduler from(android.os.Looper r1) {
            r0 = 0
            io.reactivex.Scheduler r1 = from(r1, r0)
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static io.reactivex.Scheduler from(android.os.Looper r2, boolean r3) {
            java.lang.String r0 = "looper == null"
            java.util.Objects.requireNonNull(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r3 == 0) goto L1a
            r1 = 22
            if (r0 >= r1) goto L1a
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 1
            r0.setAsynchronous(r1)     // Catch: java.lang.NoSuchMethodError -> L16
            goto L17
        L16:
            r3 = 0
        L17:
            r0.recycle()
        L1a:
            io.reactivex.android.schedulers.HandlerScheduler r0 = new io.reactivex.android.schedulers.HandlerScheduler
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static io.reactivex.Scheduler mainThread() {
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.MAIN_THREAD
            io.reactivex.Scheduler r0 = io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadScheduler(r0)
            return r0
    }
}
