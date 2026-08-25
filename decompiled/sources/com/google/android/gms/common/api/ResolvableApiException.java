package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    public android.app.PendingIntent getResolution() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.getStatus()
            android.app.PendingIntent r0 = r0.getResolution()
            return r0
    }

    public void startResolutionForResult(@androidx.annotation.NonNull android.app.Activity r2, int r3) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.getStatus()
            r0.startResolutionForResult(r2, r3)
            return
    }
}
