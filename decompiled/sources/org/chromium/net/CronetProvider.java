package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CronetProvider {
    private static final java.lang.String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final java.lang.String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final java.lang.String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final java.lang.String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final java.lang.String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final java.lang.String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";
    public final android.content.Context mContext;

    public CronetProvider(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.mContext = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context must not be null"
            r2.<init>(r0)
            throw r2
    }

    private static boolean addCronetProviderFromResourceFile(android.content.Context r4, java.util.Set<org.chromium.net.CronetProvider> r5) {
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r2 = "CronetProviderClassName"
            java.lang.String r3 = "string"
            int r0 = r0.getIdentifier(r2, r3, r1)
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            android.content.res.Resources r3 = r4.getResources()
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L69
            java.lang.String r3 = "com.google.android.gms.net.PlayServicesCronetProvider"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L69
            java.lang.String r3 = "com.google.android.gms.net.GmsCoreCronetProvider"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L69
            java.lang.String r3 = "org.chromium.net.impl.JavaCronetProvider"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L69
            java.lang.String r3 = "org.chromium.net.impl.NativeCronetProvider"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L3f
            goto L69
        L3f:
            r1 = 1
            boolean r4 = addCronetProviderImplByClassName(r4, r0, r5, r1)
            if (r4 != 0) goto L69
            java.lang.String r4 = org.chromium.net.CronetProvider.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "Unable to instantiate Cronet implementation class "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " that is listed as in the app string resource file under "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " key"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r4, r5)
        L69:
            return r1
    }

    private static boolean addCronetProviderImplByClassName(android.content.Context r5, java.lang.String r6, java.util.Set<org.chromium.net.CronetProvider> r7, boolean r8) {
            java.lang.ClassLoader r0 = r5.getClassLoader()
            r1 = 0
            java.lang.Class r0 = r0.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            java.lang.Class<org.chromium.net.CronetProvider> r2 = org.chromium.net.CronetProvider.class
            java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r1] = r4     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            r3[r1] = r5     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            java.lang.Object r5 = r0.newInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            r7.add(r5)     // Catch: java.lang.ClassNotFoundException -> L26 java.lang.IllegalAccessException -> L2b java.lang.NoSuchMethodException -> L30 java.lang.reflect.InvocationTargetException -> L35 java.lang.InstantiationException -> L3a
            return r2
        L26:
            r5 = move-exception
            logReflectiveOperationException(r6, r8, r5)
            goto L3e
        L2b:
            r5 = move-exception
            logReflectiveOperationException(r6, r8, r5)
            goto L3e
        L30:
            r5 = move-exception
            logReflectiveOperationException(r6, r8, r5)
            goto L3e
        L35:
            r5 = move-exception
            logReflectiveOperationException(r6, r8, r5)
            goto L3e
        L3a:
            r5 = move-exception
            logReflectiveOperationException(r6, r8, r5)
        L3e:
            return r1
    }

    public static java.util.List<org.chromium.net.CronetProvider> getAllProviders(android.content.Context r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            addCronetProviderFromResourceFile(r3, r0)
            java.lang.String r1 = "com.google.android.gms.net.PlayServicesCronetProvider"
            r2 = 0
            addCronetProviderImplByClassName(r3, r1, r0, r2)
            java.lang.String r1 = "com.google.android.gms.net.GmsCoreCronetProvider"
            addCronetProviderImplByClassName(r3, r1, r0, r2)
            java.lang.String r1 = "org.chromium.net.impl.NativeCronetProvider"
            addCronetProviderImplByClassName(r3, r1, r0, r2)
            java.lang.String r1 = "org.chromium.net.impl.JavaCronetProvider"
            addCronetProviderImplByClassName(r3, r1, r0, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            return r3
    }

    private static void logReflectiveOperationException(java.lang.String r2, boolean r3, java.lang.Exception r4) {
            if (r3 == 0) goto L19
            java.lang.String r3 = org.chromium.net.CronetProvider.TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to load provider class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.util.Log.e(r3, r2, r4)
            goto L40
        L19:
            java.lang.String r3 = org.chromium.net.CronetProvider.TAG
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r3, r4)
            if (r4 == 0) goto L40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Tried to load "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " provider class but it wasn't"
            r4.append(r2)
            java.lang.String r2 = " included in the app classpath"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r3, r2)
        L40:
            return
    }

    public abstract org.chromium.net.CronetEngine.Builder createBuilder();

    public abstract java.lang.String getName();

    public abstract java.lang.String getVersion();

    public abstract boolean isEnabled();

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "[class="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = "name="
            r0.append(r2)
            java.lang.String r2 = r3.getName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "version="
            r0.append(r2)
            java.lang.String r2 = r3.getVersion()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "enabled="
            r0.append(r1)
            boolean r1 = r3.isEnabled()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
