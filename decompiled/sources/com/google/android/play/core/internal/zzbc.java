package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbc implements com.google.android.play.core.internal.zzbd {
    public zzbc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzbd
    public final boolean zza(java.lang.Object r8, java.io.File r9, java.io.File r10) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<java.io.File> r3 = java.io.File.class
            java.lang.Class<java.io.File> r5 = java.io.File.class
            java.lang.String r1 = "optimizedPathFor"
            r4 = r9
            r6 = r10
            java.lang.Object r8 = com.google.android.play.core.internal.zzbw.zzg(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = (java.lang.String) r8
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            boolean r8 = r9.exists()
            return r8
    }
}
