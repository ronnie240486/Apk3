package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface zaca {
    com.google.android.gms.common.ConnectionResult zab();

    com.google.android.gms.common.ConnectionResult zac(long r1, java.util.concurrent.TimeUnit r3);

    @androidx.annotation.Nullable
    com.google.android.gms.common.ConnectionResult zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r1);

    <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T zae(@androidx.annotation.NonNull T r1);

    <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zaf(@androidx.annotation.NonNull T r1);

    void zaq();

    void zar();

    void zas(java.lang.String r1, @androidx.annotation.Nullable java.io.FileDescriptor r2, java.io.PrintWriter r3, @androidx.annotation.Nullable java.lang.String[] r4);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener r1);
}
