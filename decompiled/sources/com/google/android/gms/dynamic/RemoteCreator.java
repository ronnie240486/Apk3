package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class RemoteCreator<T> {
    private final java.lang.String zza;
    private T zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class RemoteCreatorException extends java.lang.Exception {
        @com.google.android.gms.common.annotation.KeepForSdk
        public RemoteCreatorException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public RemoteCreatorException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public RemoteCreator() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "com.google.android.gms.common.ui.SignInButtonCreatorImpl"
            r1.zza = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract T getRemoteCreator(@androidx.annotation.NonNull android.os.IBinder r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T getRemoteCreatorInstance(@androidx.annotation.NonNull android.content.Context r3) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
            r2 = this;
            T r0 = r2.zzb
            if (r0 != 0) goto L47
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r3)
            if (r3 == 0) goto L3f
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.String r0 = r2.zza     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r3 = r2.getRemoteCreator(r3)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            r2.zzb = r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            goto L47
        L24:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not access creator."
            r0.<init>(r1, r3)
            throw r0
        L2d:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not instantiate creator."
            r0.<init>(r1, r3)
            throw r0
        L36:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not load creator class."
            r0.<init>(r1, r3)
            throw r0
        L3f:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r3 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r0 = "Could not get remote context."
            r3.<init>(r0)
            throw r3
        L47:
            T r3 = r2.zzb
            return r3
    }
}
