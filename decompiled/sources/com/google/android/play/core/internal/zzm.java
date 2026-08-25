package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    private static final java.lang.ClassLoader zza = null;

    static {
            java.lang.Class<com.google.android.play.core.internal.zzm> r0 = com.google.android.play.core.internal.zzm.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.play.core.internal.zzm.zza = r0
            return
    }

    private zzm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Parcelable zza(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zzb(android.os.Parcel r1, android.os.Parcelable r2) {
            r0 = 1
            r1.writeInt(r0)
            r0 = 0
            r2.writeToParcel(r1, r0)
            return
    }

    public static void zzc(android.os.Parcel r0, android.os.IInterface r1) {
            r0.writeStrongBinder(r1)
            return
    }
}
