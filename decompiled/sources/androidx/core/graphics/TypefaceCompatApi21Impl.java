package androidx.core.graphics;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TypefaceCompatApi21Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi21Impl";
    private static java.lang.reflect.Method sAddFontWeightStyle;
    private static java.lang.reflect.Method sCreateFromFamiliesWithDefault;
    private static java.lang.Class<?> sFontFamily;
    private static java.lang.reflect.Constructor<?> sFontFamilyCtor;
    private static boolean sHasInitBeenCalled;

    public TypefaceCompatApi21Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean addFontWeightStyle(java.lang.Object r3, java.lang.String r4, int r5, boolean r6) {
            init()
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r4 = 2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            boolean r3 = r3.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r3
        L24:
            r3 = move-exception
            goto L27
        L26:
            r3 = move-exception
        L27:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r4) {
            init()
            java.lang.Class<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.reflect.Method r4 = androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object r4 = r4.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r4
        L1c:
            r4 = move-exception
            goto L1f
        L1e:
            r4 = move-exception
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    private java.io.File getFile(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r4) {
            r3 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L2c
            r1.<init>()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r2 = "/proc/self/fd/"
            r1.append(r2)     // Catch: android.system.ErrnoException -> L2c
            int r4 = r4.getFd()     // Catch: android.system.ErrnoException -> L2c
            r1.append(r4)     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r4 = r1.toString()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: android.system.ErrnoException -> L2c
            android.system.StructStat r1 = android.system.Os.stat(r4)     // Catch: android.system.ErrnoException -> L2c
            int r1 = r1.st_mode     // Catch: android.system.ErrnoException -> L2c
            boolean r1 = android.system.OsConstants.S_ISREG(r1)     // Catch: android.system.ErrnoException -> L2c
            if (r1 == 0) goto L2c
            java.io.File r1 = new java.io.File     // Catch: android.system.ErrnoException -> L2c
            r1.<init>(r4)     // Catch: android.system.ErrnoException -> L2c
            return r1
        L2c:
            return r0
    }

    private static void init() {
            boolean r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.String r5 = "addFontWeightStyle"
            r6 = 3
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r6[r0] = r7     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r7 = 2
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r6[r7] = r8     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Method r5 = r2.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class<android.graphics.Typeface> r7 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r0[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Method r1 = r7.getMethod(r8, r0)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r0 = r1
            r1 = r4
            goto L56
        L43:
            r0 = move-exception
            goto L46
        L45:
            r0 = move-exception
        L46:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r5 = r2
        L56:
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor = r1
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily = r2
            androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle = r5
            androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault = r0
            return
    }

    private static java.lang.Object newFamily() {
            init()
            java.lang.reflect.Constructor<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            return r0
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = move-exception
            goto L12
        L11:
            r0 = move-exception
        L12:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r8, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = newFamily()
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r9 = r9.getEntries()
            int r0 = r9.length
            r1 = 0
        La:
            if (r1 >= r0) goto L49
            r2 = r9[r1]
            java.io.File r3 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r8)
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            int r5 = r2.getResourceId()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r5 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r3, r10, r5)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r5 != 0) goto L24
            r3.delete()
            return r4
        L24:
            java.lang.String r5 = r3.getPath()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            int r6 = r2.getWeight()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = r2.isItalic()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = addFontWeightStyle(r11, r5, r6, r2)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r2 != 0) goto L3a
            r3.delete()
            return r4
        L3a:
            r3.delete()
            int r1 = r1 + 1
            goto La
        L40:
            r8 = move-exception
            r3.delete()
            throw r8
        L45:
            r3.delete()
            return r4
        L49:
            android.graphics.Typeface r8 = createFromFamiliesWithDefault(r11)
            return r8
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r4, android.os.CancellationSignal r5, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            androidx.core.provider.FontsContractCompat$FontInfo r6 = r3.findBestInfo(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.getUri()     // Catch: java.io.IOException -> L5e
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L5e
            if (r5 != 0) goto L21
            if (r5 == 0) goto L20
            r5.close()     // Catch: java.io.IOException -> L5e
        L20:
            return r1
        L21:
            java.io.File r6 = r3.getFile(r5)     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L36
            boolean r7 = r6.canRead()     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L2e
            goto L36
        L2e:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L54
            r5.close()     // Catch: java.io.IOException -> L5e
            return r4
        L36:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L54
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface r4 = r3.createFromInputStream(r4, r6)     // Catch: java.lang.Throwable -> L4a
            r6.close()     // Catch: java.lang.Throwable -> L54
            r5.close()     // Catch: java.io.IOException -> L5e
            return r4
        L4a:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L54
        L53:
            throw r4     // Catch: java.lang.Throwable -> L54
        L54:
            r4 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L5e
        L5d:
            throw r4     // Catch: java.io.IOException -> L5e
        L5e:
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.NonNull
    public android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.graphics.Typeface r3, int r4, boolean r5) {
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
