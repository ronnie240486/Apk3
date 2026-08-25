package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleGestureDetectorCompat {

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector r0) {
                boolean r0 = r0.isQuickScaleEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setQuickScaleEnabled(android.view.ScaleGestureDetector r0, boolean r1) {
                r0.setQuickScaleEnabled(r1)
                return
        }
    }

    private ScaleGestureDetectorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isQuickScaleEnabled(@androidx.annotation.NonNull android.view.ScaleGestureDetector r0) {
            boolean r0 = androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.isQuickScaleEnabled(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object r0) {
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            boolean r0 = isQuickScaleEnabled(r0)
            return r0
    }

    public static void setQuickScaleEnabled(@androidx.annotation.NonNull android.view.ScaleGestureDetector r0, boolean r1) {
            androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.setQuickScaleEnabled(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object r0, boolean r1) {
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            setQuickScaleEnabled(r0, r1)
            return
    }
}
