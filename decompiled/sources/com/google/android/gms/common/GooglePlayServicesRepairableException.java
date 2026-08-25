package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.content.Intent r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.zza = r1
            return
    }

    public int getConnectionStatusCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
