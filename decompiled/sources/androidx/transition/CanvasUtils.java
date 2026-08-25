package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
class CanvasUtils {
    private static java.lang.reflect.Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static java.lang.reflect.Method sReorderBarrierMethod;

    private CanvasUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public static void enableZ(@androidx.annotation.NonNull android.graphics.Canvas r5, boolean r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            if (r6 == 0) goto Lc
            r5.enableZ()
            goto L5e
        Lc:
            r5.disableZ()
            goto L5e
        L10:
            r1 = 28
            if (r0 == r1) goto L5f
            boolean r0 = androidx.transition.CanvasUtils.sOrderMethodsFetched
            r1 = 0
            if (r0 != 0) goto L3a
            r0 = 1
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            java.lang.String r3 = "insertReorderBarrier"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L38
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L38
            androidx.transition.CanvasUtils.sReorderBarrierMethod = r2     // Catch: java.lang.NoSuchMethodException -> L38
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L38
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            java.lang.String r3 = "insertInorderBarrier"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L38
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L38
            androidx.transition.CanvasUtils.sInorderBarrierMethod = r2     // Catch: java.lang.NoSuchMethodException -> L38
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L38
        L38:
            androidx.transition.CanvasUtils.sOrderMethodsFetched = r0
        L3a:
            if (r6 == 0) goto L48
            java.lang.reflect.Method r0 = androidx.transition.CanvasUtils.sReorderBarrierMethod     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            if (r0 == 0) goto L48
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            r0.invoke(r5, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            goto L48
        L46:
            r5 = move-exception
            goto L54
        L48:
            if (r6 != 0) goto L5e
            java.lang.reflect.Method r6 = androidx.transition.CanvasUtils.sInorderBarrierMethod     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            if (r6 == 0) goto L5e
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            r6.invoke(r5, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L5e
            goto L5e
        L54:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.Throwable r5 = r5.getCause()
            r6.<init>(r5)
            throw r6
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This method doesn't work on Pie!"
            r5.<init>(r6)
            throw r5
    }
}
