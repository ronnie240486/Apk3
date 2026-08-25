package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public interface AssetPackManager {
    com.google.android.play.core.assetpacks.AssetPackStates cancel(@androidx.annotation.NonNull java.util.List<java.lang.String> r1);

    void clearListeners();

    com.google.android.play.core.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> fetch(java.util.List<java.lang.String> r1);

    @androidx.annotation.Nullable
    com.google.android.play.core.assetpacks.AssetLocation getAssetLocation(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2);

    @androidx.annotation.Nullable
    com.google.android.play.core.assetpacks.AssetPackLocation getPackLocation(@androidx.annotation.NonNull java.lang.String r1);

    java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackLocation> getPackLocations();

    com.google.android.play.core.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> getPackStates(java.util.List<java.lang.String> r1);

    void registerListener(@androidx.annotation.NonNull com.google.android.play.core.assetpacks.AssetPackStateUpdateListener r1);

    com.google.android.play.core.tasks.Task<java.lang.Void> removePack(@androidx.annotation.NonNull java.lang.String r1);

    com.google.android.play.core.tasks.Task<java.lang.Integer> showCellularDataConfirmation(@androidx.annotation.NonNull android.app.Activity r1);

    void unregisterListener(@androidx.annotation.NonNull com.google.android.play.core.assetpacks.AssetPackStateUpdateListener r1);
}
