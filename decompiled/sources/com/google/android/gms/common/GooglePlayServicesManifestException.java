package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepName
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    public int getActualVersion() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int getExpectedVersion() {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }
}
