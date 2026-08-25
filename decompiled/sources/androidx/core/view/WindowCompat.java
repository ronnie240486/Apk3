package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setDecorFitsSystemWindows(@androidx.annotation.NonNull android.view.Window r1, boolean r2) {
                android.view.View r1 = r1.getDecorView()
                int r0 = r1.getSystemUiVisibility()
                if (r2 == 0) goto Ld
                r2 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
                goto Lf
            Ld:
                r2 = r0 | 1792(0x700, float:2.511E-42)
            Lf:
                r1.setSystemUiVisibility(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static <T> T requireViewById(android.view.Window r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setDecorFitsSystemWindows(@androidx.annotation.NonNull android.view.Window r0, boolean r1) {
                r0.setDecorFitsSystemWindows(r1)
                return
        }
    }

    private WindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsControllerCompat getInsetsController(@androidx.annotation.NonNull android.view.Window r1, @androidx.annotation.NonNull android.view.View r2) {
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T extends android.view.View> T requireViewById(@androidx.annotation.NonNull android.view.Window r2, @androidx.annotation.IdRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.view.WindowCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Window"
            r2.<init>(r3)
            throw r2
    }

    public static void setDecorFitsSystemWindows(@androidx.annotation.NonNull android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.view.WindowCompat.Api30Impl.setDecorFitsSystemWindows(r2, r3)
            goto Ld
        La:
            androidx.core.view.WindowCompat.Api16Impl.setDecorFitsSystemWindows(r2, r3)
        Ld:
            return
    }
}
