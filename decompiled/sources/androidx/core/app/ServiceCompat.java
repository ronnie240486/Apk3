package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void stopForeground(android.app.Service r0, int r1) {
                r0.stopForeground(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void stopForeground(@androidx.annotation.NonNull android.app.Service r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.app.ServiceCompat.Api24Impl.stopForeground(r2, r3)
            goto L13
        La:
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            r2.stopForeground(r0)
        L13:
            return
    }
}
