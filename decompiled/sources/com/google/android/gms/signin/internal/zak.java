package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zak> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final com.google.android.gms.common.ConnectionResult zab;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    private final com.google.android.gms.common.internal.zav zac;

    static {
            com.google.android.gms.signin.internal.zal r0 = new com.google.android.gms.signin.internal.zal
            r0.<init>()
            com.google.android.gms.signin.internal.zak.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zak(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.ConnectionResult r2, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.internal.zav r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.common.ConnectionResult r1 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.zav r1 = r4.zac
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.ConnectionResult zaa() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r0 = r1.zab
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.internal.zav zab() {
            r1 = this;
            com.google.android.gms.common.internal.zav r0 = r1.zac
            return r0
    }
}
