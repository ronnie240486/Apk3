package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zav> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final android.os.IBinder zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private final com.google.android.gms.common.ConnectionResult zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private final boolean zad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private final boolean zae;

    static {
            com.google.android.gms.common.internal.zaw r0 = new com.google.android.gms.common.internal.zaw
            r0.<init>()
            com.google.android.gms.common.internal.zav.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zav(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.IBinder r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.ConnectionResult r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r5
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.internal.zav
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.common.internal.zav r5 = (com.google.android.gms.common.internal.zav) r5
            com.google.android.gms.common.ConnectionResult r2 = r4.zac
            com.google.android.gms.common.ConnectionResult r3 = r5.zac
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            com.google.android.gms.common.internal.IAccountAccessor r2 = r4.zab()
            com.google.android.gms.common.internal.IAccountAccessor r5 = r5.zab()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r2, r5)
            if (r5 == 0) goto L28
            return r1
        L28:
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            android.os.IBinder r1 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r2, r1, r3)
            com.google.android.gms.common.ConnectionResult r1 = r4.zac
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zad
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.zae
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.ConnectionResult zaa() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r0 = r1.zac
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.internal.IAccountAccessor zab() {
            r1 = this;
            android.os.IBinder r0 = r1.zab
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.internal.IAccountAccessor r0 = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(r0)
            return r0
    }

    public final boolean zac() {
            r1 = this;
            boolean r0 = r1.zad
            return r0
    }

    public final boolean zad() {
            r1 = this;
            boolean r0 = r1.zae
            return r0
    }
}
