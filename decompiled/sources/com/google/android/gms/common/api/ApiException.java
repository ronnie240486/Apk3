package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ApiException extends java.lang.Exception {

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.Status mStatus;

    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r5) {
            r4 = this;
            int r0 = r5.getStatusCode()
            java.lang.String r1 = r5.getStatusMessage()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r5.getStatusMessage()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.mStatus = r5
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            return r0
    }

    public int getStatusCode() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            int r0 = r0.getStatusCode()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            java.lang.String r0 = r0.getStatusMessage()
            return r0
    }
}
