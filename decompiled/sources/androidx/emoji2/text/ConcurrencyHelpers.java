package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Handler28Impl {
        private Handler28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$rm7NN8F9tEuy2Vr8i0fl8_hnx_A(java.lang.String r0, java.lang.Runnable r1) {
            java.lang.Thread r0 = lambda$createBackgroundPriorityExecutor$0(r0, r1)
            return r0
    }

    private ConcurrencyHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ThreadPoolExecutor createBackgroundPriorityExecutor(@androidx.annotation.NonNull java.lang.String r8) {
            androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1 r7 = new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1
            r7.<init>(r8)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r8.allowCoreThreadTimeOut(r0)
            return r8
    }

    private static /* synthetic */ java.lang.Thread lambda$createBackgroundPriorityExecutor$0(java.lang.String r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }

    public static android.os.Handler mainHandlerAsync() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.emoji2.text.ConcurrencyHelpers.Handler28Impl.createAsync(r0)
            return r0
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
    }
}
