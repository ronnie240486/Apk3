package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AssetPackLocation {
    private static final com.google.android.play.core.assetpacks.AssetPackLocation zza = null;

    static {
            com.google.android.play.core.assetpacks.zzbm r0 = new com.google.android.play.core.assetpacks.zzbm
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.play.core.assetpacks.AssetPackLocation.zza = r0
            return
    }

    public AssetPackLocation() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.assetpacks.AssetPackLocation zza() {
            com.google.android.play.core.assetpacks.AssetPackLocation r0 = com.google.android.play.core.assetpacks.AssetPackLocation.zza
            return r0
    }

    @androidx.annotation.Nullable
    public abstract java.lang.String assetsPath();

    @com.google.android.play.core.assetpacks.model.AssetPackStorageMethod
    public abstract int packStorageMethod();

    @androidx.annotation.Nullable
    public abstract java.lang.String path();
}
