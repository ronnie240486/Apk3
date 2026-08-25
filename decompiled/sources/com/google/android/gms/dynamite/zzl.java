package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzl implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r5, java.lang.String r6, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r7) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r4 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r1 = r7.zza(r5, r6)
            r0.localVersion = r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            int r5 = r7.zzb(r5, r6, r3)
            r0.remoteVersion = r5
            goto L1c
        L16:
            int r5 = r7.zzb(r5, r6, r2)
            r0.remoteVersion = r5
        L1c:
            int r6 = r0.localVersion
            if (r6 != 0) goto L25
            if (r5 != 0) goto L26
            r0.selection = r3
            goto L2e
        L25:
            r3 = r6
        L26:
            if (r5 < r3) goto L2b
            r0.selection = r2
            goto L2e
        L2b:
            r5 = -1
            r0.selection = r5
        L2e:
            return r0
    }
}
