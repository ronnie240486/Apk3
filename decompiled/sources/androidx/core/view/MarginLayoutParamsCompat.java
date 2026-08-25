package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MarginLayoutParamsCompat {

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams r0) {
                int r0 = r0.getMarginEnd()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams r0) {
                int r0 = r0.getMarginStart()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams r0) {
                boolean r0 = r0.isMarginRelative()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.resolveLayoutDirection(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setLayoutDirection(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setMarginEnd(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
                r0.setMarginStart(r1)
                return
        }
    }

    private MarginLayoutParamsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r1) {
            int r1 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getLayoutDirection(r1)
            if (r1 == 0) goto La
            r0 = 1
            if (r1 == r0) goto La
            r1 = 0
        La:
            return r1
    }

    public static int getMarginEnd(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginEnd(r0)
            return r0
    }

    public static int getMarginStart(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.getMarginStart(r0)
            return r0
    }

    public static boolean isMarginRelative(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            boolean r0 = androidx.core.view.MarginLayoutParamsCompat.Api17Impl.isMarginRelative(r0)
            return r0
    }

    public static void resolveLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.resolveLayoutDirection(r0, r1)
            return
    }

    public static void setLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setLayoutDirection(r0, r1)
            return
    }

    public static void setMarginEnd(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginEnd(r0, r1)
            return
    }

    public static void setMarginStart(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            androidx.core.view.MarginLayoutParamsCompat.Api17Impl.setMarginStart(r0, r1)
            return
    }
}
