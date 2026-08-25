package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface Types {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public StatsEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r8 = this;
            long r0 = r8.zzc()
            int r2 = r8.zza()
            long r3 = r8.zzb()
            java.lang.String r5 = r8.zzd()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r7 = r5.length()
            int r7 = r7 + 53
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = "\t"
            r6.append(r0)
            r6.append(r2)
            r6.append(r0)
            r6.append(r3)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            return r0
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    @androidx.annotation.NonNull
    public abstract java.lang.String zzd();
}
