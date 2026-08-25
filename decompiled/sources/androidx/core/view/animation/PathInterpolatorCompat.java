package androidx.core.view.animation;

/* JADX INFO: loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.animation.PathInterpolator createPathInterpolator(float r1, float r2) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.animation.PathInterpolator createPathInterpolator(float r1, float r2, float r3, float r4) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.animation.PathInterpolator createPathInterpolator(android.graphics.Path r1) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1)
                return r0
        }
    }

    private PathInterpolatorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(float r0, float r1) {
            android.view.animation.PathInterpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(float r0, float r1, float r2, float r3) {
            android.view.animation.PathInterpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(@androidx.annotation.NonNull android.graphics.Path r0) {
            android.view.animation.PathInterpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0)
            return r0
    }
}
