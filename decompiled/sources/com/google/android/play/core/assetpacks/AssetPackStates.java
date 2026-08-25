package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackStates {
    public AssetPackStates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.assetpacks.AssetPackStates zza(android.os.Bundle r2, com.google.android.play.core.assetpacks.zzco r3, com.google.android.play.core.assetpacks.zzeb r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.play.core.assetpacks.zzbf r1 = com.google.android.play.core.assetpacks.zzbf.zza
            com.google.android.play.core.assetpacks.AssetPackStates r2 = zzd(r2, r3, r4, r0, r1)
            return r2
    }

    public static com.google.android.play.core.assetpacks.AssetPackStates zzb(android.os.Bundle r1, com.google.android.play.core.assetpacks.zzco r2, com.google.android.play.core.assetpacks.zzeb r3, com.google.android.play.core.assetpacks.zzbe r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.play.core.assetpacks.AssetPackStates r1 = zzd(r1, r2, r3, r0, r4)
            return r1
    }

    public static com.google.android.play.core.assetpacks.AssetPackStates zzc(android.os.Bundle r1, com.google.android.play.core.assetpacks.zzco r2, com.google.android.play.core.assetpacks.zzeb r3, java.util.List r4) {
            com.google.android.play.core.assetpacks.zzbf r0 = com.google.android.play.core.assetpacks.zzbf.zza
            com.google.android.play.core.assetpacks.AssetPackStates r1 = zzd(r1, r2, r3, r4, r0)
            return r1
    }

    private static com.google.android.play.core.assetpacks.AssetPackStates zzd(android.os.Bundle r16, com.google.android.play.core.assetpacks.zzco r17, com.google.android.play.core.assetpacks.zzeb r18, java.util.List r19, com.google.android.play.core.assetpacks.zzbe r20) {
            r0 = r16
            java.lang.String r1 = "pack_names"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r1.size()
            r4 = 0
        L12:
            if (r4 >= r3) goto L2a
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r6 = r17
            r7 = r18
            r8 = r20
            com.google.android.play.core.assetpacks.AssetPackState r9 = com.google.android.play.core.assetpacks.AssetPackState.zzc(r0, r5, r6, r7, r8)
            r2.put(r5, r9)
            int r4 = r4 + 1
            goto L12
        L2a:
            java.util.Iterator r1 = r19.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r5 = 4
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 1
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            r4 = r3
            com.google.android.play.core.assetpacks.AssetPackState r4 = com.google.android.play.core.assetpacks.AssetPackState.zzb(r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r2.put(r3, r4)
            goto L2e
        L50:
            java.lang.String r1 = "total_bytes_to_download"
            long r0 = r0.getLong(r1)
            com.google.android.play.core.assetpacks.zzbo r3 = new com.google.android.play.core.assetpacks.zzbo
            r3.<init>(r0, r2)
            return r3
    }

    public abstract java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> packStates();

    public abstract long totalBytes();
}
