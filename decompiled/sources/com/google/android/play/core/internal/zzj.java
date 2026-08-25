package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    public static long zza(java.nio.ByteBuffer r2) {
            zzg(r2)
            int r0 = r2.position()
            int r0 = r0 + 16
            long r0 = zze(r2, r0)
            return r0
    }

    public static long zzb(java.nio.ByteBuffer r2) {
            zzg(r2)
            int r0 = r2.position()
            int r0 = r0 + 12
            long r0 = zze(r2, r0)
            return r0
    }

    public static android.util.Pair zzc(java.io.RandomAccessFile r5) throws java.io.IOException {
            long r0 = r5.length()
            r2 = 22
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r5 = 0
            return r5
        Lc:
            r0 = 0
            android.util.Pair r0 = zzf(r5, r0)
            if (r0 == 0) goto L14
            return r0
        L14:
            r0 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r5 = zzf(r5, r0)
            return r5
    }

    public static void zzd(java.nio.ByteBuffer r4, long r5) {
            zzg(r4)
            int r0 = r4.position()
            int r0 = r0 + 16
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L22
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L22
            int r1 = r4.position()
            int r1 = r1 + r0
            int r6 = (int) r5
            r4.putInt(r1, r6)
            return
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 47
            r0.<init>(r1)
            java.lang.String r1 = "uint32 value of out range: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private static long zze(java.nio.ByteBuffer r2, int r3) {
            int r2 = r2.getInt(r3)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    private static android.util.Pair zzf(java.io.RandomAccessFile r9, int r10) throws java.io.IOException {
            long r0 = r9.length()
            r2 = 0
            r3 = 22
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
            return r2
        Lc:
            long r3 = (long) r10
            r5 = -22
            long r5 = r5 + r0
            long r3 = java.lang.Math.min(r3, r5)
            int r10 = (int) r3
            r3 = 22
            int r10 = r10 + r3
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r4)
            int r4 = r10.capacity()
            long r4 = (long) r4
            long r0 = r0 - r4
            r9.seek(r0)
            byte[] r4 = r10.array()
            int r5 = r10.arrayOffset()
            int r6 = r10.capacity()
            r9.readFully(r4, r5, r6)
            zzg(r10)
            int r9 = r10.capacity()
            r4 = -1
            if (r9 >= r3) goto L45
        L43:
            r6 = -1
            goto L69
        L45:
            int r9 = r9 + (-22)
            r3 = 65535(0xffff, float:9.1834E-41)
            int r3 = java.lang.Math.min(r9, r3)
            r5 = 0
        L4f:
            if (r5 >= r3) goto L43
            int r6 = r9 - r5
            int r7 = r10.getInt(r6)
            r8 = 101010256(0x6054b50, float:2.506985E-35)
            if (r7 != r8) goto L66
            int r7 = r6 + 20
            short r7 = r10.getShort(r7)
            char r7 = (char) r7
            if (r7 != r5) goto L66
            goto L69
        L66:
            int r5 = r5 + 1
            goto L4f
        L69:
            if (r6 != r4) goto L6c
            return r2
        L6c:
            r10.position(r6)
            java.nio.ByteBuffer r9 = r10.slice()
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            r9.order(r10)
            long r2 = (long) r6
            long r0 = r0 + r2
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            android.util.Pair r9 = android.util.Pair.create(r9, r10)
            return r9
    }

    private static void zzg(java.nio.ByteBuffer r1) {
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r1 != r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ByteBuffer byte order must be little endian"
            r1.<init>(r0)
            throw r1
    }
}
