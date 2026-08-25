package com.google.android.gms.net;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.Keep
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    @com.google.android.apps.common.proguard.UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void tryToInstallCronetProvider() {
            r3 = this;
            java.lang.String r0 = "PlayServicesCronet"
            r1 = 4
            android.content.Context r2 = r3.mContext     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L9 com.google.android.gms.common.GooglePlayServicesRepairableException -> L16
            com.google.android.gms.net.CronetProviderInstaller.zzc(r2)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L9 com.google.android.gms.common.GooglePlayServicesRepairableException -> L16
            return
        L9:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L22
            java.lang.String r1 = "Google-Play-Services-Cronet-Provider is unavailable."
            android.util.Log.i(r0, r1)
            return
        L16:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L22
            java.lang.String r1 = "Google-Play-Services-Cronet-Provider is not installed yet."
            android.util.Log.i(r0, r1)
        L22:
            return
    }

    @Override // org.chromium.net.CronetProvider
    @androidx.annotation.NonNull
    @androidx.annotation.Keep
    public org.chromium.net.CronetEngine.Builder createBuilder() {
            r6 = this;
            android.content.Context r0 = r6.mContext     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L63 com.google.android.gms.common.GooglePlayServicesRepairableException -> L6c
            com.google.android.gms.net.CronetProviderInstaller.zzc(r0)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L63 com.google.android.gms.common.GooglePlayServicesRepairableException -> L6c
            r0 = 0
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.net.CronetProviderInstaller.zza()     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            com.google.android.gms.dynamite.DynamiteModule r1 = (com.google.android.gms.dynamite.DynamiteModule) r1     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            android.content.Context r1 = r1.getModuleContext()     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.String r2 = "org.chromium.net.impl.NativeCronetEngineBuilderImpl"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Class<org.chromium.net.ICronetEngineBuilder> r2 = org.chromium.net.ICronetEngineBuilder.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            android.content.Context r3 = r6.mContext     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            org.chromium.net.ICronetEngineBuilder r1 = (org.chromium.net.ICronetEngineBuilder) r1     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            org.chromium.net.ExperimentalCronetEngine$Builder r2 = new org.chromium.net.ExperimentalCronetEngine$Builder     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            r2.<init>(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            goto L53
        L48:
            r1 = move-exception
            goto L51
        L4a:
            r1 = move-exception
            goto L51
        L4c:
            r1 = move-exception
            goto L51
        L4e:
            r1 = move-exception
            goto L51
        L50:
            r1 = move-exception
        L51:
            r2 = r0
            r0 = r1
        L53:
            if (r0 != 0) goto L5b
            java.lang.String r0 = "The value of the constructed builder should never be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            return r2
        L5b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl"
            r1.<init>(r2, r0)
            throw r1
        L63:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Google Play Services Cronet provider is unavailable on this device."
            r1.<init>(r2, r0)
            throw r1
        L6c:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it."
            r1.<init>(r2, r0)
            throw r1
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r3) goto L16
            boolean r2 = r4 instanceof com.google.android.gms.net.PlayServicesCronetProvider
            if (r2 == 0) goto L17
            android.content.Context r2 = r3.mContext
            com.google.android.gms.net.PlayServicesCronetProvider r4 = (com.google.android.gms.net.PlayServicesCronetProvider) r4
            android.content.Context r4 = r4.mContext
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L15
            goto L16
        L15:
            return r0
        L16:
            r0 = 1
        L17:
            return r0
    }

    @Override // org.chromium.net.CronetProvider
    @androidx.annotation.NonNull
    @androidx.annotation.Keep
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "Google-Play-Services-Cronet-Provider"
            return r0
    }

    @Override // org.chromium.net.CronetProvider
    @androidx.annotation.NonNull
    @androidx.annotation.Keep
    public java.lang.String getVersion() {
            r1 = this;
            r1.tryToInstallCronetProvider()
            java.lang.String r0 = com.google.android.gms.net.CronetProviderInstaller.zzb()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Class<com.google.android.gms.net.PlayServicesCronetProvider> r2 = com.google.android.gms.net.PlayServicesCronetProvider.class
            r0[r1] = r2
            android.content.Context r1 = r3.mContext
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // org.chromium.net.CronetProvider
    @androidx.annotation.Keep
    public boolean isEnabled() {
            r1 = this;
            r1.tryToInstallCronetProvider()
            boolean r0 = com.google.android.gms.net.CronetProviderInstaller.isInstalled()
            return r0
    }
}
