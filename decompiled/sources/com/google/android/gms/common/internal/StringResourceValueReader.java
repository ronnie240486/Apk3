package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public StringResourceValueReader(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.res.Resources r2 = r2.getResources()
            r1.zza = r2
            int r0 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r2 = r2.getResourcePackageName(r0)
            r1.zzb = r2
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getString(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            android.content.res.Resources r0 = r3.zza
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "string"
            int r4 = r0.getIdentifier(r4, r2, r1)
            if (r4 != 0) goto Lf
            r4 = 0
            return r4
        Lf:
            android.content.res.Resources r0 = r3.zza
            java.lang.String r4 = r0.getString(r4)
            return r4
    }
}
