package org.androidannotations.api.roboguice;

/* JADX INFO: loaded from: classes3.dex */
public class RoboGuiceHelper {
    public RoboGuiceHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void callInjectViews(java.lang.Object r6) {
            java.lang.String r0 = "roboguice.inject.ViewListener$ViewMembersInjector"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            java.lang.String r1 = "injectViews"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            r0.setAccessible(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            r2[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalArgumentException -> L26 java.lang.IllegalAccessException -> L2b java.lang.SecurityException -> L30 java.lang.NoSuchMethodException -> L35 java.lang.ClassNotFoundException -> L3a
            goto L3e
        L21:
            r6 = move-exception
            propagateRuntimeException(r6)
            goto L3e
        L26:
            r6 = move-exception
            propagateRuntimeException(r6)
            goto L3e
        L2b:
            r6 = move-exception
            propagateRuntimeException(r6)
            goto L3e
        L30:
            r6 = move-exception
            propagateRuntimeException(r6)
            goto L3e
        L35:
            r6 = move-exception
            propagateRuntimeException(r6)
            goto L3e
        L3a:
            r6 = move-exception
            propagateRuntimeException(r6)
        L3e:
            return
    }

    private static void propagateRuntimeException(java.lang.Throwable r2) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not invoke RoboGuice method!"
            r0.<init>(r1, r2)
            throw r0
    }
}
