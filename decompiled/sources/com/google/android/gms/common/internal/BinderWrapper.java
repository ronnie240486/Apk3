package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.annotation.KeepName
public final class BinderWrapper implements android.os.Parcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = null;
    private android.os.IBinder zza;

    static {
            com.google.android.gms.common.internal.zzh r0 = new com.google.android.gms.common.internal.zzh
            r0.<init>()
            com.google.android.gms.common.internal.BinderWrapper.CREATOR = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public BinderWrapper(@androidx.annotation.NonNull android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public /* synthetic */ BinderWrapper(android.os.Parcel r1) {
            r0 = this;
            r0.<init>()
            android.os.IBinder r1 = r1.readStrongBinder()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r2 = r0.zza
            r1.writeStrongBinder(r2)
            return
    }
}
