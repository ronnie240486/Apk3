package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzg implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r1 = r5.zza(r3, r4)
            r0.localVersion = r1
            if (r1 == 0) goto L11
            r3 = -1
            r0.selection = r3
            goto L1c
        L11:
            r1 = 1
            int r3 = r5.zzb(r3, r4, r1)
            r0.remoteVersion = r3
            if (r3 == 0) goto L1c
            r0.selection = r1
        L1c:
            return r0
    }
}
