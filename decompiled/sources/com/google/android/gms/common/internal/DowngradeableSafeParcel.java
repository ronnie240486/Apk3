package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final java.lang.Object zza = null;
    private boolean zzb;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.DowngradeableSafeParcel.zza = r0
            return
    }

    public DowngradeableSafeParcel() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setShouldDowngrade(boolean r1) {
            r0 = this;
            r0.zzb = r1
            return
    }
}
