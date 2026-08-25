package com.google.firebase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class FirebaseExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    public FirebaseExceptionMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @androidx.annotation.NonNull
    public final java.lang.Exception getException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            int r0 = r3.getStatusCode()
            r1 = 8
            if (r0 != r1) goto L12
            com.google.firebase.FirebaseException r0 = new com.google.firebase.FirebaseException
            java.lang.String r3 = r3.zza()
            r0.<init>(r3)
            return r0
        L12:
            com.google.firebase.FirebaseApiNotAvailableException r0 = new com.google.firebase.FirebaseApiNotAvailableException
            java.lang.String r3 = r3.zza()
            r0.<init>(r3)
            return r0
    }
}
