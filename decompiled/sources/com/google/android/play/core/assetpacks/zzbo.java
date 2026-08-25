package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbo extends com.google.android.play.core.assetpacks.AssetPackStates {
    private final long zza;
    private final java.util.Map zzb;

    public zzbo(long r1, java.util.Map r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.AssetPackStates
            r2 = 0
            if (r1 == 0) goto L22
            com.google.android.play.core.assetpacks.AssetPackStates r8 = (com.google.android.play.core.assetpacks.AssetPackStates) r8
            long r3 = r7.zza
            long r5 = r8.totalBytes()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L22
            java.util.Map r1 = r7.zzb
            java.util.Map r8 = r8.packStates()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L22
            return r0
        L22:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.zza
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.util.Map r0 = r4.zzb
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> packStates() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.zza
            java.util.Map r2 = r5.zzb
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r2.length()
            int r4 = r4 + 61
            r3.<init>(r4)
            java.lang.String r4 = "AssetPackStates{totalBytes="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", packStates="
            r3.append(r0)
            java.lang.String r0 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r0)
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }
}
