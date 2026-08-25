package androidx.core.graphics;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(24)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TypefaceCompatApi24Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi24Impl";
    private static final java.lang.reflect.Method sAddFontWeightStyle = null;
    private static final java.lang.reflect.Method sCreateFromFamiliesWithDefault = null;
    private static final java.lang.Class<?> sFontFamily = null;
    private static final java.lang.reflect.Constructor<?> sFontFamilyCtor = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r8 = 2
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r5[r8] = r9     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r8 = 3
            r5[r8] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r6 = 4
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r5[r6] = r8     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r7)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r7[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Method r0 = r6.getMethod(r8, r7)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r2 = r0
            r0 = r3
            goto L57
        L44:
            r1 = move-exception
            goto L47
        L46:
            r1 = move-exception
        L47:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r4 = r2
        L57:
            androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamilyCtor = r0
            androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamily = r1
            androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle = r4
            androidx.core.graphics.TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault = r2
            return
    }

    public TypefaceCompatApi24Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean addFontWeightStyle(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, boolean r7) {
            r0 = 0
            java.lang.reflect.Method r1 = androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle     // Catch: java.lang.Throwable -> L2c
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r4     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            r5 = 0
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r3
        L2c:
            return r0
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r4) {
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamily     // Catch: java.lang.Throwable -> L19
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.reflect.Array.set(r1, r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r4 = androidx.core.graphics.TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r2[r3] = r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r4.invoke(r0, r2)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            return r0
    }

    public static boolean isUsable() {
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private static java.lang.Object newFamily() {
            java.lang.reflect.Constructor<?> r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamilyCtor     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r8, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = newFamily()
            r0 = 0
            if (r11 != 0) goto L8
            return r0
        L8:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r9 = r9.getEntries()
            int r1 = r9.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L33
            r3 = r9[r2]
            int r4 = r3.getResourceId()
            java.nio.ByteBuffer r4 = androidx.core.graphics.TypefaceCompatUtil.copyToDirectBuffer(r8, r10, r4)
            if (r4 != 0) goto L1d
            return r0
        L1d:
            int r5 = r3.getTtcIndex()
            int r6 = r3.getWeight()
            boolean r3 = r3.isItalic()
            boolean r3 = addFontWeightStyle(r11, r4, r5, r6, r3)
            if (r3 != 0) goto L30
            return r0
        L30:
            int r2 = r2 + 1
            goto Le
        L33:
            android.graphics.Typeface r8 = createFromFamiliesWithDefault(r11)
            return r8
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontInfo(android.content.Context r10, @androidx.annotation.Nullable android.os.CancellationSignal r11, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r12, int r13) {
            r9 = this;
            java.lang.Object r0 = newFamily()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.collection.SimpleArrayMap r2 = new androidx.collection.SimpleArrayMap
            r2.<init>()
            int r3 = r12.length
            r4 = 0
        Lf:
            if (r4 >= r3) goto L3f
            r5 = r12[r4]
            android.net.Uri r6 = r5.getUri()
            java.lang.Object r7 = r2.get(r6)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L26
            java.nio.ByteBuffer r7 = androidx.core.graphics.TypefaceCompatUtil.mmap(r10, r11, r6)
            r2.put(r6, r7)
        L26:
            if (r7 != 0) goto L29
            return r1
        L29:
            int r6 = r5.getTtcIndex()
            int r8 = r5.getWeight()
            boolean r5 = r5.isItalic()
            boolean r5 = addFontWeightStyle(r0, r7, r6, r8, r5)
            if (r5 != 0) goto L3c
            return r1
        L3c:
            int r4 = r4 + 1
            goto Lf
        L3f:
            android.graphics.Typeface r10 = createFromFamiliesWithDefault(r0)
            if (r10 != 0) goto L46
            return r1
        L46:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.NonNull
    public final android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = androidx.core.graphics.WeightTypefaceApi21.createWeightStyle(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto Lc
            android.graphics.Typeface r0 = super.createWeightStyle(r2, r3, r4, r5)
        Lc:
            return r0
    }
}
