package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.MethodInvocation> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long zad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long zae;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    private final java.lang.String zaf;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    private final java.lang.String zag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int zah;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    private final int zai;

    static {
            com.google.android.gms.common.internal.zan r0 = new com.google.android.gms.common.internal.zan
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation.CREATOR = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public MethodInvocation(int r13, int r14, int r15, long r16, long r18, @androidx.annotation.Nullable java.lang.String r20, @androidx.annotation.Nullable java.lang.String r21, int r22) {
            r12 = this;
            r11 = -1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public MethodInvocation(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r6, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r8, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) int r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) int r11) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r6
            r0.zaf = r8
            r0.zag = r9
            r0.zah = r10
            r0.zai = r11
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zaa
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.zab
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.zac
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            long r0 = r3.zad
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zae
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            java.lang.String r0 = r3.zaf
            r1 = 6
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.zag
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.zah
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.zai
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
