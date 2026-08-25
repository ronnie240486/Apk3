package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zaa> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConnectionResultCode", id = 2)
    private int zab;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRawAuthResolutionIntent", id = 3)
    private android.content.Intent zac;

    static {
            com.google.android.gms.signin.internal.zab r0 = new com.google.android.gms.signin.internal.zab
            r0.<init>()
            com.google.android.gms.signin.internal.zaa.CREATOR = r0
            return
    }

    public zaa() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zaa = r0
            r0 = 0
            r1.zab = r0
            r0 = 0
            r1.zac = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zaa(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.content.Intent r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            int r0 = r1.zab
            if (r0 != 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            int r1 = r4.zab
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            android.content.Intent r1 = r4.zac
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
