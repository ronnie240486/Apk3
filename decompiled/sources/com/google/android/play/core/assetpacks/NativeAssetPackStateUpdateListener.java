package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class NativeAssetPackStateUpdateListener implements com.google.android.play.core.assetpacks.AssetPackStateUpdateListener {
    public NativeAssetPackStateUpdateListener() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: onStateUpdate, reason: avoid collision after fix types in other method */
    public native void onStateUpdate2(com.google.android.play.core.assetpacks.AssetPackState r1);

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final /* bridge */ /* synthetic */ void onStateUpdate(com.google.android.play.core.assetpacks.AssetPackState r1) {
            r0 = this;
            com.google.android.play.core.assetpacks.AssetPackState r1 = (com.google.android.play.core.assetpacks.AssetPackState) r1
            r0.onStateUpdate2(r1)
            return
    }
}
