package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @androidx.annotation.NonNull
    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r2.zza
            r0.<init>(r1)
            return r0
    }
}
