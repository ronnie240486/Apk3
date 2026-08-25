package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zze implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    public zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context r1, java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = this;
            int r1 = com.google.android.gms.dynamite.DynamiteModule.zza(r1, r2, r3)
            return r1
    }
}
