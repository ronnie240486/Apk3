package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbl extends com.google.android.play.core.assetpacks.AssetLocation {
    private final java.lang.String zza;
    private final long zzb;
    private final long zzc;

    public zzbl(java.lang.String r2, long r3, long r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null path"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.AssetLocation
            r2 = 0
            if (r1 == 0) goto L2c
            com.google.android.play.core.assetpacks.AssetLocation r8 = (com.google.android.play.core.assetpacks.AssetLocation) r8
            java.lang.String r1 = r7.zza
            java.lang.String r3 = r8.path()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            long r3 = r7.zzb
            long r5 = r8.offset()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.zzc
            long r5 = r8.size()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2c
            return r0
        L2c:
            return r2
    }

    public final int hashCode() {
            r9 = this;
            java.lang.String r0 = r9.zza
            int r0 = r0.hashCode()
            long r1 = r9.zzb
            long r3 = r9.zzc
            r5 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r5
            int r0 = r0 * r5
            r6 = 32
            long r7 = r1 >>> r6
            long r1 = r1 ^ r7
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r5
            long r1 = r3 >>> r6
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long offset() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long size() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.zza
            long r1 = r7.zzb
            long r3 = r7.zzc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r0.length()
            int r6 = r6 + 76
            r5.<init>(r6)
            java.lang.String r6 = "AssetLocation{path="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ", offset="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", size="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = "}"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
    }
}
