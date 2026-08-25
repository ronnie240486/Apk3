package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface GoogleSignInOptionsExtension {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int FITNESS = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GAMES = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    int getExtensionType();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    android.os.Bundle toBundle();
}
