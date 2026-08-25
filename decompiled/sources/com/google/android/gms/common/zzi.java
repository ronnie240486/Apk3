package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzi extends com.google.android.gms.common.internal.zzy {
    private final int zza;

    public zzi(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 25
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r3 = java.util.Arrays.hashCode(r3)
            r2.zza = r3
            return
    }

    public static byte[] zze(java.lang.String r1) {
            java.lang.String r0 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L31
            boolean r1 = r4 instanceof com.google.android.gms.common.internal.zzz
            if (r1 != 0) goto L8
            goto L31
        L8:
            com.google.android.gms.common.internal.zzz r4 = (com.google.android.gms.common.internal.zzz) r4     // Catch: android.os.RemoteException -> L29
            int r1 = r4.zzc()     // Catch: android.os.RemoteException -> L29
            int r2 = r3.zza     // Catch: android.os.RemoteException -> L29
            if (r1 == r2) goto L13
            return r0
        L13:
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zzd()     // Catch: android.os.RemoteException -> L29
            if (r4 != 0) goto L1a
            return r0
        L1a:
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: android.os.RemoteException -> L29
            byte[] r4 = (byte[]) r4     // Catch: android.os.RemoteException -> L29
            byte[] r1 = r3.zzf()     // Catch: android.os.RemoteException -> L29
            boolean r4 = java.util.Arrays.equals(r1, r4)     // Catch: android.os.RemoteException -> L29
            return r4
        L29:
            r4 = move-exception
            java.lang.String r1 = "GoogleCertificates"
            java.lang.String r2 = "Failed to get Google certificates from remote"
            android.util.Log.e(r1, r2, r4)
        L31:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
            r1 = this;
            byte[] r0 = r1.zzf()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    public abstract byte[] zzf();
}
