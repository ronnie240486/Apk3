package com.google.firebase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    public FirebaseException() {
            r0 = this;
            r0.<init>()
            return
    }

    public FirebaseException(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2)
            return
    }

    public FirebaseException(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2, r3)
            return
    }
}
