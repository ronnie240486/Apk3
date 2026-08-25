package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ViewUtils {

    @androidx.annotation.ChecksSdkIntAtLeast(api = 27)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE = false;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 27
            if (r0 < r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE = r0
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "computeFitSystemWindows"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2e
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L2e
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r4[r2] = r1     // Catch: java.lang.NoSuchMethodException -> L2e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2e
            androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod = r0     // Catch: java.lang.NoSuchMethodException -> L2e
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L2e
            if (r0 != 0) goto L35
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L2e
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L2e
            goto L35
        L2e:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
        L35:
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void computeFitSystemWindows(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod
            if (r0 == 0) goto L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L11
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L11
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L11
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L11
            goto L19
        L11:
            r3 = move-exception
            java.lang.String r4 = "ViewUtils"
            java.lang.String r5 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r4, r5, r3)
        L19:
            return
    }

    public static boolean isLayoutRtl(android.view.View r1) {
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            boolean r3 = r2.isAccessible()     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            if (r3 != 0) goto L1b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            r2.invoke(r6, r3)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            goto L30
        L21:
            r6 = move-exception
            android.util.Log.d(r1, r0, r6)
            goto L30
        L26:
            r6 = move-exception
            android.util.Log.d(r1, r0, r6)
            goto L30
        L2b:
            java.lang.String r6 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r6)
        L30:
            return
    }
}
