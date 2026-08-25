package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
@android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class WeightTypefaceApi21 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final java.lang.String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypeface = null;
    private static final java.lang.reflect.Method sNativeCreateWeightAlias = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;

    @androidx.annotation.GuardedBy("sWeightCacheLock")
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            r0 = 0
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "native_instance"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "nativeCreateFromTypeface"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r9 = 1
            r5[r9] = r8     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r2.setAccessible(r9)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r5 = "nativeCreateWeightAlias"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r4[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r4[r9] = r8     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r4)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r3.setAccessible(r9)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.Class<android.graphics.Typeface> r4 = android.graphics.Typeface.class
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r4.setAccessible(r9)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.NoSuchFieldException -> L43
            r0 = r1
            goto L54
        L41:
            r1 = move-exception
            goto L44
        L43:
            r1 = move-exception
        L44:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "WeightTypeface"
            android.util.Log.e(r3, r2, r1)
            r2 = r0
            r3 = r2
            r4 = r3
        L54:
            androidx.core.graphics.WeightTypefaceApi21.sNativeInstance = r0
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface = r2
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias = r3
            androidx.core.graphics.WeightTypefaceApi21.sConstructor = r4
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static android.graphics.Typeface create(long r4) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi21.sConstructor     // Catch: java.lang.Throwable -> L14
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r3 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L14
            r2[r3] = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L14
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.graphics.Typeface r7, int r8, boolean r9) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r8 << 1
            r0 = r0 | r9
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r7)     // Catch: java.lang.Throwable -> L4c
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L4c
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L26
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L4c
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L4c
            goto L30
        L26:
            java.lang.Object r4 = r5.get(r0)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r4
        L30:
            boolean r7 = r7.isItalic()     // Catch: java.lang.Throwable -> L4c
            if (r9 != r7) goto L3f
            long r7 = nativeCreateWeightAlias(r2, r8)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L3f:
            long r7 = nativeCreateFromTypefaceWithExactStyle(r2, r8, r9)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L4c
        L47:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r7
        L4c:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r7
    }

    private static long getNativeInstance(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long r4, int r6, boolean r7) {
            r0 = 2
            r1 = 0
            if (r7 == 0) goto L6
            r7 = 2
            goto L7
        L6:
            r7 = 0
        L7:
            java.lang.reflect.Method r2 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            r3[r1] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            r4 = 0
            java.lang.Object r7 = r2.invoke(r4, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            long r2 = r7.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.reflect.Method r7 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            r0[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            r0[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Object r4 = r7.invoke(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            long r4 = r4.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L45
            return r4
        L3e:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L45:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long r4, int r6) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r3 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r2[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            java.lang.Object r4 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            long r4 = r4.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            return r4
        L1f:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L26:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }
}
