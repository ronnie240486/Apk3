package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzh implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            r1 = 0
            int r3 = r5.zzb(r3, r4, r1)
            r0.remoteVersion = r3
            if (r3 != 0) goto L11
            r0.selection = r1
            goto L14
        L11:
            r3 = 1
            r0.selection = r3
        L14:
            return r0
    }
}
