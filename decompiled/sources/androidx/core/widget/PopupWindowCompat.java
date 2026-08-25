package androidx.core.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void showAsDropDown(android.widget.PopupWindow r0, android.view.View r1, int r2, int r3, int r4) {
                r0.showAsDropDown(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean getOverlapAnchor(android.widget.PopupWindow r0) {
                boolean r0 = r0.getOverlapAnchor()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getWindowLayoutType(android.widget.PopupWindow r0) {
                int r0 = r0.getWindowLayoutType()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setOverlapAnchor(android.widget.PopupWindow r0, boolean r1) {
                r0.setOverlapAnchor(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setWindowLayoutType(android.widget.PopupWindow r0, int r1) {
                r0.setWindowLayoutType(r1)
                return
        }
    }

    private PopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean getOverlapAnchor(@androidx.annotation.NonNull android.widget.PopupWindow r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r4 = androidx.core.widget.PopupWindowCompat.Api23Impl.getOverlapAnchor(r4)
            return r4
        Lb:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted
            java.lang.String r1 = "PopupWindowCompatApi21"
            if (r0 != 0) goto L28
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "mOverlapAnchor"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L20
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorField = r2     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Could not fetch mOverlapAnchor field from PopupWindow"
            android.util.Log.i(r1, r3, r2)
        L26:
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted = r0
        L28:
            java.lang.reflect.Field r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorField
            if (r0 == 0) goto L3d
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L37
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.IllegalAccessException -> L37
            boolean r4 = r4.booleanValue()     // Catch: java.lang.IllegalAccessException -> L37
            return r4
        L37:
            r4 = move-exception
            java.lang.String r0 = "Could not get overlap anchor field in PopupWindow"
            android.util.Log.i(r1, r0, r4)
        L3d:
            r4 = 0
            return r4
    }

    public static int getWindowLayoutType(@androidx.annotation.NonNull android.widget.PopupWindow r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r5 = androidx.core.widget.PopupWindowCompat.Api23Impl.getWindowLayoutType(r5)
            return r5
        Lb:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted
            r1 = 0
            if (r0 != 0) goto L22
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "getWindowLayoutType"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L20
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L20
            androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethod = r2     // Catch: java.lang.Exception -> L20
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L20
        L20:
            androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethodAttempted = r0
        L22:
            java.lang.reflect.Method r0 = androidx.core.widget.PopupWindowCompat.sGetWindowLayoutTypeMethod
            if (r0 == 0) goto L33
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L33
            java.lang.Object r5 = r0.invoke(r5, r2)     // Catch: java.lang.Exception -> L33
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L33
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L33
            return r5
        L33:
            return r1
    }

    public static void setOverlapAnchor(@androidx.annotation.NonNull android.widget.PopupWindow r4, boolean r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.widget.PopupWindowCompat.Api23Impl.setOverlapAnchor(r4, r5)
            goto L39
        La:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted
            java.lang.String r1 = "PopupWindowCompatApi21"
            if (r0 != 0) goto L27
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "mOverlapAnchor"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L1f
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorField = r2     // Catch: java.lang.NoSuchFieldException -> L1f
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1f
            goto L25
        L1f:
            r2 = move-exception
            java.lang.String r3 = "Could not fetch mOverlapAnchor field from PopupWindow"
            android.util.Log.i(r1, r3, r2)
        L25:
            androidx.core.widget.PopupWindowCompat.sOverlapAnchorFieldAttempted = r0
        L27:
            java.lang.reflect.Field r0 = androidx.core.widget.PopupWindowCompat.sOverlapAnchorField
            if (r0 == 0) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.IllegalAccessException -> L33
            r0.set(r4, r5)     // Catch: java.lang.IllegalAccessException -> L33
            goto L39
        L33:
            r4 = move-exception
            java.lang.String r5 = "Could not set overlap anchor field in PopupWindow"
            android.util.Log.i(r1, r5, r4)
        L39:
            return
    }

    public static void setWindowLayoutType(@androidx.annotation.NonNull android.widget.PopupWindow r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.widget.PopupWindowCompat.Api23Impl.setWindowLayoutType(r6, r7)
            goto L35
        La:
            boolean r0 = androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r3 = "setWindowLayoutType"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L24
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L24
            r4[r1] = r5     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L24
            androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethod = r0     // Catch: java.lang.Exception -> L24
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L24
        L24:
            androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethodAttempted = r2
        L26:
            java.lang.reflect.Method r0 = androidx.core.widget.PopupWindowCompat.sSetWindowLayoutTypeMethod
            if (r0 == 0) goto L35
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L35
            r2[r1] = r7     // Catch: java.lang.Exception -> L35
            r0.invoke(r6, r2)     // Catch: java.lang.Exception -> L35
        L35:
            return
    }

    public static void showAsDropDown(@androidx.annotation.NonNull android.widget.PopupWindow r0, @androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4) {
            androidx.core.widget.PopupWindowCompat.Api19Impl.showAsDropDown(r0, r1, r2, r3, r4)
            return
    }
}
