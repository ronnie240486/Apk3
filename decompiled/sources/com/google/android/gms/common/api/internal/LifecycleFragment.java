package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public interface LifecycleFragment {
    @com.google.android.gms.common.annotation.KeepForSdk
    void addCallback(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleCallback r2);

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2);

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    android.app.Activity getLifecycleActivity();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isCreated();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isStarted();

    @com.google.android.gms.common.annotation.KeepForSdk
    void startActivityForResult(@androidx.annotation.NonNull android.content.Intent r1, int r2);
}
