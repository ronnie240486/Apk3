package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> {
    public zzh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper createFromParcel(android.os.Parcel r2) {
            r1 = this;
            com.google.android.gms.common.internal.BinderWrapper r0 = new com.google.android.gms.common.internal.BinderWrapper
            r0.<init>(r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.BinderWrapper[] r1 = new com.google.android.gms.common.internal.BinderWrapper[r1]
            return r1
    }
}
