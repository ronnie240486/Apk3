package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public class Hex {
    private static final char[] zza = null;
    private static final char[] zzb = null;

    static {
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.google.android.gms.common.util.Hex.zza = r1
            char[] r0 = new char[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.google.android.gms.common.util.Hex.zzb = r0
            return
    }

    public Hex() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String bytesToStringLowercase(@androidx.annotation.NonNull byte[] r7) {
            int r0 = r7.length
            int r0 = r0 + r0
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.length
            if (r1 >= r3) goto L22
            r3 = r7[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 + 1
            char[] r5 = com.google.android.gms.common.util.Hex.zzb
            int r6 = r3 >>> 4
            char r6 = r5[r6]
            r0[r2] = r6
            int r2 = r4 + 1
            r3 = r3 & 15
            char r3 = r5[r3]
            r0[r4] = r3
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            return r7
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String bytesToStringUppercase(@androidx.annotation.NonNull byte[] r1) {
            r0 = 0
            java.lang.String r1 = bytesToStringUppercase(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String bytesToStringUppercase(@androidx.annotation.NonNull byte[] r5, boolean r6) {
            int r0 = r5.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 + r0
            r1.<init>(r2)
            r2 = 0
        L9:
            if (r2 >= r0) goto L30
            if (r6 == 0) goto L17
            int r3 = r0 + (-1)
            if (r2 != r3) goto L17
            r3 = r5[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L30
        L17:
            char[] r3 = com.google.android.gms.common.util.Hex.zza
            r4 = r5[r2]
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >>> 4
            char r4 = r3[r4]
            r1.append(r4)
            r4 = r5[r2]
            r4 = r4 & 15
            char r3 = r3[r4]
            r1.append(r3)
            int r2 = r2 + 1
            goto L9
        L30:
            java.lang.String r5 = r1.toString()
            return r5
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] stringToBytes(@androidx.annotation.NonNull java.lang.String r6) throws java.lang.IllegalArgumentException {
            int r0 = r6.length()
            int r1 = r0 % 2
            if (r1 != 0) goto L23
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        Ld:
            if (r2 >= r0) goto L22
            int r3 = r2 + 2
            int r4 = r2 / 2
            java.lang.String r2 = r6.substring(r2, r3)
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)
            byte r2 = (byte) r2
            r1[r4] = r2
            r2 = r3
            goto Ld
        L22:
            return r1
        L23:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Hex string has odd number of characters"
            r6.<init>(r0)
            throw r6
    }
}
