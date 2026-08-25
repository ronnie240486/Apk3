package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class BlendModeColorFilterCompat {

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.ColorFilter createBlendModeColorFilter(int r1, java.lang.Object r2) {
                android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
                android.graphics.BlendMode r2 = (android.graphics.BlendMode) r2
                r0.<init>(r1, r2)
                return r0
        }
    }

    private BlendModeColorFilterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int r3, @androidx.annotation.NonNull androidx.core.graphics.BlendModeCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L12
            java.lang.Object r4 = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r4)
            if (r4 == 0) goto L11
            android.graphics.ColorFilter r1 = androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl.createBlendModeColorFilter(r3, r4)
        L11:
            return r1
        L12:
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r4)
            if (r4 == 0) goto L1d
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r3, r4)
        L1d:
            return r1
    }
}
