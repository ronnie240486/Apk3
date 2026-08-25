package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class BundleUtil {
    private static final java.lang.String TAG = "BundleUtil";

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method getIBinderMethod;

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method putIBinderMethod;

    private BundleUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.os.IBinder getBinder(android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto Lb
            android.os.IBinder r2 = r2.getBinder(r3)
            return r2
        Lb:
            android.os.IBinder r2 = getBinderByReflection(r2, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.os.IBinder getBinderByReflection(android.os.Bundle r8, @androidx.annotation.Nullable java.lang.String r9) {
            java.lang.reflect.Method r0 = com.google.android.exoplayer2.util.BundleUtil.getIBinderMethod
            r1 = 0
            java.lang.String r2 = "BundleUtil"
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r5 = "getIBinder"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L1f
            com.google.android.exoplayer2.util.BundleUtil.getIBinderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1f
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.reflect.Method r0 = com.google.android.exoplayer2.util.BundleUtil.getIBinderMethod
            goto L26
        L1f:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve getIBinder method"
            com.google.android.exoplayer2.util.Log.i(r2, r9, r8)
            return r1
        L26:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L35
            r4[r3] = r9     // Catch: java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.Object r8 = r0.invoke(r8, r4)     // Catch: java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L35
            android.os.IBinder r8 = (android.os.IBinder) r8     // Catch: java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L35
            return r8
        L31:
            r8 = move-exception
            goto L36
        L33:
            r8 = move-exception
            goto L36
        L35:
            r8 = move-exception
        L36:
            java.lang.String r9 = "Failed to invoke getIBinder via reflection"
            com.google.android.exoplayer2.util.Log.i(r2, r9, r8)
            return r1
    }

    public static void putBinder(android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable android.os.IBinder r4) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto La
            r2.putBinder(r3, r4)
            goto Ld
        La:
            putBinderByReflection(r2, r3, r4)
        Ld:
            return
    }

    private static void putBinderByReflection(android.os.Bundle r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable android.os.IBinder r10) {
            java.lang.reflect.Method r0 = com.google.android.exoplayer2.util.BundleUtil.putIBinderMethod
            java.lang.String r1 = "BundleUtil"
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 != 0) goto L2b
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r5 = "putIBinder"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r6[r4] = r7     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L24
            com.google.android.exoplayer2.util.BundleUtil.putIBinderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L24
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = com.google.android.exoplayer2.util.BundleUtil.putIBinderMethod
            goto L2b
        L24:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve putIBinder method"
            com.google.android.exoplayer2.util.Log.i(r1, r9, r8)
            return
        L2b:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
            r3[r2] = r9     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
            r3[r4] = r10     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
            r0.invoke(r8, r3)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
            goto L3f
        L35:
            r8 = move-exception
            goto L3a
        L37:
            r8 = move-exception
            goto L3a
        L39:
            r8 = move-exception
        L3a:
            java.lang.String r9 = "Failed to invoke putIBinder via reflection"
            com.google.android.exoplayer2.util.Log.i(r1, r9, r8)
        L3f:
            return
    }
}
