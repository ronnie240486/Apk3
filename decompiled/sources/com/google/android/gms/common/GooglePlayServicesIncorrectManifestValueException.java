package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int r4) {
            r3 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 320(0x140, float:4.48E-43)
            r1.<init>(r2)
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r4, r0)
            return
    }
}
