package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbg {
    public static boolean zza(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r2) {
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 7
            if (r2 == r1) goto Lf
            r1 = 2
            if (r2 != r1) goto La
            goto Lf
        La:
            r1 = 3
            if (r2 == r1) goto Lf
            r2 = 0
            return r2
        Lf:
            return r0
    }

    public static boolean zzb(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r1) {
            r0 = 2
            if (r1 == r0) goto Lc
            r0 = 7
            if (r1 == r0) goto Lc
            r0 = 3
            if (r1 != r0) goto La
            goto Lc
        La:
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
    }

    public static boolean zzc(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r4, @com.google.android.play.core.assetpacks.model.AssetPackStatus int r5) {
            r0 = 5
            r1 = 1
            if (r4 != r0) goto L9
            if (r5 != r0) goto L8
            r4 = 5
            goto L9
        L8:
            return r1
        L9:
            r2 = 6
            if (r4 != r2) goto L13
            if (r5 == r2) goto L12
            if (r5 != r0) goto L11
            goto L12
        L11:
            return r1
        L12:
            r4 = 6
        L13:
            r0 = 4
            if (r4 != r0) goto L1a
            if (r5 != r0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r0 = 3
            r2 = 8
            r3 = 2
            if (r4 != r0) goto L2b
            if (r5 == r3) goto L2a
            r0 = 7
            if (r5 == r0) goto L2a
            if (r5 == r1) goto L2a
            if (r5 == r2) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            if (r4 != r3) goto L32
            if (r5 == r1) goto L31
            if (r5 != r2) goto L32
        L31:
            return r1
        L32:
            r4 = 0
            return r4
    }

    public static boolean zzd(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r1) {
            r0 = 5
            if (r1 == r0) goto Lc
            r0 = 6
            if (r1 == r0) goto Lc
            r0 = 4
            if (r1 != r0) goto La
            goto Lc
        La:
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
    }
}
