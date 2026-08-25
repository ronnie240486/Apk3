package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "WakeLockEventCreator")
@java.lang.Deprecated
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEventType", id = 11)
    private int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int zzg;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    private final java.util.List<java.lang.String> zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final java.lang.String zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private int zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final java.lang.String zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;
    private long zzp;

    static {
            com.google.android.gms.common.stats.zza r0 = new com.google.android.gms.common.stats.zza
            r0.<init>()
            com.google.android.gms.common.stats.WakeLockEvent.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public WakeLockEvent(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) @javax.annotation.Nullable java.util.List<java.lang.String> r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) long r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) int r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.String r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) java.lang.String r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) float r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) long r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 17) java.lang.String r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 18) boolean r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r7
            r0.zzc = r1
            r1 = r8
            r0.zzd = r1
            r1 = r15
            r0.zze = r1
            r1 = r20
            r0.zzf = r1
            r1 = r9
            r0.zzg = r1
            r1 = -1
            r0.zzp = r1
            r1 = r10
            r0.zzh = r1
            r1 = r11
            r0.zzi = r1
            r1 = r12
            r0.zzj = r1
            r1 = r14
            r0.zzk = r1
            r1 = r16
            r0.zzl = r1
            r1 = r17
            r0.zzm = r1
            r1 = r18
            r0.zzn = r1
            r1 = r21
            r0.zzo = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r0 = r4.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            long r0 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r2, r0)
            java.lang.String r0 = r4.zzd
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            int r0 = r4.zzg
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            java.util.List<java.lang.String> r0 = r4.zzh
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r1, r0, r2)
            long r0 = r4.zzj
            r3 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r0)
            java.lang.String r0 = r4.zze
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            int r0 = r4.zzc
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            java.lang.String r0 = r4.zzi
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            java.lang.String r0 = r4.zzl
            r1 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            int r0 = r4.zzk
            r1 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            float r0 = r4.zzm
            r1 = 15
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r1, r0)
            long r0 = r4.zzn
            r3 = 16
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r0)
            java.lang.String r0 = r4.zzf
            r1 = 17
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            boolean r0 = r4.zzo
            r1 = 18
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r6)
            return
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
            r2 = this;
            long r0 = r2.zzp
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @androidx.annotation.NonNull
    public final java.lang.String zzd() {
            r12 = this;
            java.util.List<java.lang.String> r0 = r12.zzh
            java.lang.String r1 = r12.zzd
            int r2 = r12.zzg
            java.lang.String r3 = ""
            if (r0 != 0) goto Lc
            r0 = r3
            goto L12
        Lc:
            java.lang.String r4 = ","
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)
        L12:
            int r4 = r12.zzk
            java.lang.String r5 = r12.zze
            if (r5 != 0) goto L19
            r5 = r3
        L19:
            java.lang.String r6 = r12.zzl
            if (r6 != 0) goto L1e
            r6 = r3
        L1e:
            float r7 = r12.zzm
            java.lang.String r8 = r12.zzf
            if (r8 != 0) goto L25
            goto L26
        L25:
            r3 = r8
        L26:
            boolean r8 = r12.zzo
            java.lang.String r9 = java.lang.String.valueOf(r1)
            int r9 = r9.length()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r9 = r9 + 51
            int r9 = r9 + r10
            int r10 = r5.length()
            int r10 = r10 + r9
            int r9 = r6.length()
            int r9 = r9 + r10
            int r10 = r3.length()
            int r10 = r10 + r9
            r11.<init>(r10)
            java.lang.String r9 = "\t"
            r11.append(r9)
            r11.append(r1)
            r11.append(r9)
            r11.append(r2)
            r11.append(r9)
            r11.append(r0)
            r11.append(r9)
            r11.append(r4)
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r11, r9, r5, r9, r6)
            r11.append(r9)
            r11.append(r7)
            r11.append(r9)
            r11.append(r3)
            r11.append(r9)
            r11.append(r8)
            java.lang.String r0 = r11.toString()
            return r0
    }
}
