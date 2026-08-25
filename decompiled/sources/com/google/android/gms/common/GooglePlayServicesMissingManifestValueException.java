package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepName
public final class GooglePlayServicesMissingManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    public GooglePlayServicesMissingManifestValueException() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.<init>(r0, r1)
            return
    }
}
