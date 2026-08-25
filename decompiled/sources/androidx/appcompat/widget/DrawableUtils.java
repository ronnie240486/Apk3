package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] EMPTY_STATE_SET = null;
    public static final android.graphics.Rect INSETS_NONE = null;

    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private static final java.lang.reflect.Field sBottom = null;
        private static final java.lang.reflect.Method sGetOpticalInsets = null;
        private static final java.lang.reflect.Field sLeft = null;
        private static final boolean sReflectionSuccessful = false;
        private static final java.lang.reflect.Field sRight = null;
        private static final java.lang.reflect.Field sTop = null;

        static {
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L41 java.lang.NoSuchMethodException -> L45
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L41 java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L41 java.lang.NoSuchMethodException -> L45
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3b
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L31 java.lang.ClassNotFoundException -> L33 java.lang.NoSuchMethodException -> L35
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L49
                r8 = 1
                goto L4b
            L2f:
                r7 = r2
                goto L49
            L31:
                r6 = r2
                goto L48
            L33:
                r6 = r2
                goto L48
            L35:
                r6 = r2
                goto L48
            L37:
                r5 = r2
                goto L3f
            L39:
                r5 = r2
                goto L43
            L3b:
                r5 = r2
                goto L47
            L3d:
                r4 = r2
                r5 = r4
            L3f:
                r6 = r5
                goto L48
            L41:
                r4 = r2
                r5 = r4
            L43:
                r6 = r5
                goto L48
            L45:
                r4 = r2
                r5 = r4
            L47:
                r6 = r5
            L48:
                r7 = r6
            L49:
                r3 = r2
                r8 = 0
            L4b:
                if (r8 == 0) goto L5a
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r0
                goto L66
            L5a:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r1
            L66:
                return
        }

        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static android.graphics.Rect getOpticalInsets(@androidx.annotation.NonNull android.graphics.drawable.Drawable r5) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L33
                boolean r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful
                if (r0 == 0) goto L33
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets     // Catch: java.lang.Throwable -> L33
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L33
                if (r5 == 0) goto L33
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L33
                java.lang.reflect.Field r1 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft     // Catch: java.lang.Throwable -> L33
                int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.reflect.Field r2 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop     // Catch: java.lang.Throwable -> L33
                int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.reflect.Field r3 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight     // Catch: java.lang.Throwable -> L33
                int r3 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.reflect.Field r4 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom     // Catch: java.lang.Throwable -> L33
                int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L33
                r0.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L33
                return r0
            L33:
                android.graphics.Rect r5 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
                return r5
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Insets getOpticalInsets(android.graphics.drawable.Drawable r0) {
                android.graphics.Insets r0 = r0.getOpticalInsets()
                return r0
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r2 = 0
            r0[r2] = r1
            androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET = r0
            int[] r0 = new int[r2]
            androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.DrawableUtils.INSETS_NONE = r0
            return
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canSafelyMutateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            r0 = 1
            return r0
    }

    public static void fixDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 != r2) goto L1a
            java.lang.String r2 = "android.graphics.drawable.VectorDrawable"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            forceDrawableStateChange(r3)
            goto L2d
        L1a:
            r2 = 29
            if (r1 < r2) goto L2d
            r2 = 31
            if (r1 >= r2) goto L2d
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
            forceDrawableStateChange(r3)
        L2d:
            return
    }

    private static void forceDrawableStateChange(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect getOpticalBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            android.graphics.Insets r4 = androidx.appcompat.widget.DrawableUtils.Api29Impl.getOpticalInsets(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.left
            int r2 = r4.top
            int r3 = r4.right
            int r4 = r4.bottom
            r0.<init>(r1, r2, r3, r4)
            return r0
        L18:
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r4)
            android.graphics.Rect r4 = androidx.appcompat.widget.DrawableUtils.Api18Impl.getOpticalInsets(r4)
            return r4
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
