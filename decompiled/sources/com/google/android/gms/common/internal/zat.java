package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public final class zat extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zat> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccount", id = 2)
    private final android.accounts.Account zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final int zac;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zad;

    static {
            com.google.android.gms.common.internal.zau r0 = new com.google.android.gms.common.internal.zau
            r0.<init>()
            com.google.android.gms.common.internal.zat.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zat(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.accounts.Account r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    public zat(android.accounts.Account r2, int r3, @androidx.annotation.Nullable com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            r1.zad = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            android.accounts.Account r1 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r1 = r4.zac
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r4.zad
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
