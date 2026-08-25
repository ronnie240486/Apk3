package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zac {
    private static final java.lang.ClassLoader zaa = null;

    static {
            java.lang.Class<com.google.android.gms.internal.base.zac> r0 = com.google.android.gms.internal.base.zac.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.gms.internal.base.zac.zaa = r0
            return
    }

    private zac() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.os.Parcelable> T zaa(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zab(android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }

    public static void zac(android.os.Parcel r2, android.os.Parcelable r3) {
            r0 = 0
            if (r3 != 0) goto L7
            r2.writeInt(r0)
            return
        L7:
            r1 = 1
            r2.writeInt(r1)
            r3.writeToParcel(r2, r0)
            return
    }

    public static void zad(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.writeStrongBinder(r1)
            return
        L7:
            android.os.IBinder r1 = r1.asBinder()
            r0.writeStrongBinder(r1)
            return
    }
}
