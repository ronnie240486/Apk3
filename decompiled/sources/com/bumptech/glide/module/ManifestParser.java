package com.bumptech.glide.module;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ManifestParser {
    private static final java.lang.String GLIDE_MODULE_VALUE = "GlideModule";
    private static final java.lang.String TAG = "ManifestParser";
    private final android.content.Context context;

    public ManifestParser(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private static com.bumptech.glide.module.GlideModule parseModule(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L44
            r0 = 0
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.NoSuchMethodException -> L18 java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L22
            java.lang.reflect.Constructor r2 = r3.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.NoSuchMethodException -> L18 java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L22
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.NoSuchMethodException -> L18 java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L22
            java.lang.Object r0 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.NoSuchMethodException -> L18 java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L22
            goto L26
        L13:
            r1 = move-exception
            throwInstantiateGlideModuleException(r3, r1)
            goto L26
        L18:
            r1 = move-exception
            throwInstantiateGlideModuleException(r3, r1)
            goto L26
        L1d:
            r1 = move-exception
            throwInstantiateGlideModuleException(r3, r1)
            goto L26
        L22:
            r1 = move-exception
            throwInstantiateGlideModuleException(r3, r1)
        L26:
            boolean r3 = r0 instanceof com.bumptech.glide.module.GlideModule
            if (r3 == 0) goto L2d
            com.bumptech.glide.module.GlideModule r0 = (com.bumptech.glide.module.GlideModule) r0
            return r0
        L2d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
        L44:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
    }

    private static void throwInstantiateGlideModuleException(java.lang.Class<?> r3, java.lang.Exception r4) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to instantiate GlideModule implementation for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public java.util.List<com.bumptech.glide.module.GlideModule> parse() {
            r8 = this;
            java.lang.String r0 = "ManifestParser"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto Le
            java.lang.String r2 = "Loading Glide modules"
            android.util.Log.d(r0, r2)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Context r3 = r8.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.content.Context r4 = r8.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r4 != 0) goto L35
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r1 == 0) goto L34
            java.lang.String r1 = "Got null app info metadata"
            android.util.Log.d(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
        L34:
            return r2
        L35:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r4 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r5 = "Got app info metadata: "
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.os.Bundle r5 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r4 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.util.Log.v(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
        L52:
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.util.Set r4 = r4.keySet()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.util.Iterator r4 = r4.iterator()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
        L5c:
            boolean r5 = r4.hasNext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.next()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r5 = (java.lang.String) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r6 = "GlideModule"
            android.os.Bundle r7 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.Object r7 = r7.get(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            boolean r6 = r6.equals(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r6 == 0) goto L5c
            com.bumptech.glide.module.GlideModule r6 = parseModule(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r2.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            boolean r6 = android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            if (r6 == 0) goto L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r7 = "Loaded Glide module: "
            r6.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            r6.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            java.lang.String r5 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            android.util.Log.d(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La4
            goto L5c
        L98:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La3
            java.lang.String r1 = "Finished loading Glide modules"
            android.util.Log.d(r0, r1)
        La3:
            return r2
        La4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to find metadata to parse GlideModules"
            r1.<init>(r2, r0)
            throw r1
    }
}
