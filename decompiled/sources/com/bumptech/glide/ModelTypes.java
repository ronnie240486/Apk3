package com.bumptech.glide;

/* JADX INFO: loaded from: classes3.dex */
interface ModelTypes<T> {
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable android.graphics.Bitmap r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable android.net.Uri r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable java.io.File r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable java.lang.Object r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable java.lang.String r1);

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    T load(@androidx.annotation.Nullable java.net.URL r1);

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    T load(@androidx.annotation.Nullable byte[] r1);
}
