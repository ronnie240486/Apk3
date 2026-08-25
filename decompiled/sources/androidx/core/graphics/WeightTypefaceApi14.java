package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class WeightTypefaceApi14 {
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;

    @androidx.annotation.GuardedBy("sWeightCacheLock")
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Ld
            goto L1c
        Ld:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
        L1c:
            androidx.core.graphics.WeightTypefaceApi14.sNativeInstance = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi14.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi14.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi14() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull androidx.core.graphics.TypefaceCompatBaseImpl r7, @androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull android.graphics.Typeface r9, int r10, boolean r11) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r10 << 1
            r0 = r0 | r11
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi14.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r9)     // Catch: java.lang.Throwable -> L3f
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi14.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L3f
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L26
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L3f
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L3f
            goto L30
        L26:
            java.lang.Object r2 = r5.get(r0)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            return r2
        L30:
            android.graphics.Typeface r7 = getBestFontFromFamily(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3f
            if (r7 != 0) goto L3a
            android.graphics.Typeface r7 = platformTypefaceCreate(r9, r10, r11)     // Catch: java.lang.Throwable -> L3f
        L3a:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            return r7
        L3f:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r7
    }

    @androidx.annotation.Nullable
    private static android.graphics.Typeface getBestFontFromFamily(@androidx.annotation.NonNull androidx.core.graphics.TypefaceCompatBaseImpl r6, @androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull android.graphics.Typeface r8, int r9, boolean r10) {
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r2 = r6.getFontFamily(r8)
            if (r2 != 0) goto L8
            r6 = 0
            return r6
        L8:
            android.content.res.Resources r3 = r7.getResources()
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.createFromFontFamilyFilesResourceEntry(r1, r2, r3, r4, r5)
            return r6
    }

    private static long getNativeInstance(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi14.sNativeInstance     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> Ld
            long r0 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> Ld
            return r0
        Ld:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi14.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static android.graphics.Typeface platformTypefaceCreate(android.graphics.Typeface r3, int r4, boolean r5) {
            r0 = 1
            r1 = 0
            r2 = 600(0x258, float:8.41E-43)
            if (r4 < r2) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            if (r4 != 0) goto Lf
            if (r5 != 0) goto Lf
            r0 = 0
            goto L17
        Lf:
            if (r4 != 0) goto L13
            r0 = 2
            goto L17
        L13:
            if (r5 != 0) goto L16
            goto L17
        L16:
            r0 = 3
        L17:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)
            return r3
    }
}
