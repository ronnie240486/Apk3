package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public interface LifecycleDelegate {
    @com.google.android.gms.common.annotation.KeepForSdk
    void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroy();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroyView();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onInflate(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onLowMemory();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onPause();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onResume();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStart();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStop();
}
