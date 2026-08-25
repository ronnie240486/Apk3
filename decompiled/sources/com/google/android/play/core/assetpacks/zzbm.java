package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbm extends com.google.android.play.core.assetpacks.AssetPackLocation {
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public zzbm(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @androidx.annotation.Nullable
    public final java.lang.String assetsPath() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.assetpacks.AssetPackLocation
            r2 = 0
            if (r1 == 0) goto L3f
            com.google.android.play.core.assetpacks.AssetPackLocation r5 = (com.google.android.play.core.assetpacks.AssetPackLocation) r5
            int r1 = r4.zza
            int r3 = r5.packStorageMethod()
            if (r1 != r3) goto L3f
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L1e
            java.lang.String r1 = r5.path()
            if (r1 != 0) goto L3f
            goto L28
        L1e:
            java.lang.String r3 = r5.path()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
        L28:
            java.lang.String r1 = r4.zzc
            if (r1 != 0) goto L33
            java.lang.String r5 = r5.assetsPath()
            if (r5 != 0) goto L3f
            goto L3e
        L33:
            java.lang.String r5 = r5.assetsPath()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3e
            goto L3f
        L3e:
            return r0
        L3f:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.zza
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.zzb
            r3 = 0
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r4.zzc
            if (r1 != 0) goto L1b
            goto L1f
        L1b:
            int r3 = r1.hashCode()
        L1f:
            r0 = r0 ^ r3
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @com.google.android.play.core.assetpacks.model.AssetPackStorageMethod
    public final int packStorageMethod() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @androidx.annotation.Nullable
    public final java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.zza
            java.lang.String r1 = r6.zzb
            java.lang.String r2 = r6.zzc
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 68
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "AssetPackLocation{packStorageMethod="
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = ", path="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", assetsPath="
            java.lang.String r1 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0, r2, r1)
            return r0
    }
}
