package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TelemetryDataCreator")
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.TelemetryData> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int zaa;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    private java.util.List<com.google.android.gms.common.internal.MethodInvocation> zab;

    static {
            com.google.android.gms.common.internal.zaab r0 = new com.google.android.gms.common.internal.zaab
            r0.<init>()
            com.google.android.gms.common.internal.TelemetryData.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public TelemetryData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @javax.annotation.Nullable java.util.List<com.google.android.gms.common.internal.MethodInvocation> r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zaa
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.util.List<com.google.android.gms.common.internal.MethodInvocation> r0 = r3.zab
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final int zaa() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @androidx.annotation.Nullable
    public final java.util.List<com.google.android.gms.common.internal.MethodInvocation> zab() {
            r1 = this;
            java.util.List<com.google.android.gms.common.internal.MethodInvocation> r0 = r1.zab
            return r0
    }

    public final void zac(@androidx.annotation.NonNull com.google.android.gms.common.internal.MethodInvocation r2) {
            r1 = this;
            java.util.List<com.google.android.gms.common.internal.MethodInvocation> r0 = r1.zab
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zab = r0
        Lb:
            java.util.List<com.google.android.gms.common.internal.MethodInvocation> r0 = r1.zab
            r0.add(r2)
            return
    }
}
