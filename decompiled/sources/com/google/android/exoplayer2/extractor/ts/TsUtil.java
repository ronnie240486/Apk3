package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class TsUtil {
    private TsUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int findSyncBytePosition(byte[] r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto Lb
            r0 = r2[r3]
            r1 = 71
            if (r0 == r1) goto Lb
            int r3 = r3 + 1
            goto L0
        Lb:
            return r3
    }

    public static boolean isStartOfTsPacket(byte[] r5, int r6, int r7, int r8) {
            r0 = 0
            r1 = -4
            r2 = 0
        L3:
            r3 = 4
            if (r1 > r3) goto L1e
            int r3 = r1 * 188
            int r3 = r3 + r8
            if (r3 < r6) goto L1a
            if (r3 >= r7) goto L1a
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L14
            goto L1a
        L14:
            r3 = 1
            int r2 = r2 + r3
            r4 = 5
            if (r2 != r4) goto L1b
            return r3
        L1a:
            r2 = 0
        L1b:
            int r1 = r1 + 1
            goto L3
        L1e:
            return r0
    }

    public static long readPcrFromPacket(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5, int r6) {
            r4.setPosition(r5)
            int r5 = r4.bytesLeft()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 5
            if (r5 >= r2) goto L10
            return r0
        L10:
            int r5 = r4.readInt()
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 & r5
            if (r2 == 0) goto L1a
            return r0
        L1a:
            r2 = 2096896(0x1fff00, float:2.938377E-39)
            r2 = r2 & r5
            int r2 = r2 >> 8
            if (r2 == r6) goto L23
            return r0
        L23:
            r5 = r5 & 32
            r6 = 1
            r2 = 0
            if (r5 == 0) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            if (r5 != 0) goto L2f
            return r0
        L2f:
            int r5 = r4.readUnsignedByte()
            r3 = 7
            if (r5 < r3) goto L54
            int r5 = r4.bytesLeft()
            if (r5 < r3) goto L54
            int r5 = r4.readUnsignedByte()
            r3 = 16
            r5 = r5 & r3
            if (r5 != r3) goto L46
            goto L47
        L46:
            r6 = 0
        L47:
            if (r6 == 0) goto L54
            r5 = 6
            byte[] r6 = new byte[r5]
            r4.readBytes(r6, r2, r5)
            long r4 = readPcrValueFromPcrBytes(r6)
            return r4
        L54:
            return r0
    }

    private static long readPcrValueFromPcrBytes(byte[] r8) {
            r0 = 0
            r0 = r8[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 25
            long r0 = r0 << r4
            r4 = 1
            r5 = r8[r4]
            long r5 = (long) r5
            long r5 = r5 & r2
            r7 = 17
            long r5 = r5 << r7
            long r0 = r0 | r5
            r5 = 2
            r5 = r8[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            r7 = 9
            long r5 = r5 << r7
            long r0 = r0 | r5
            r5 = 3
            r5 = r8[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            long r4 = r5 << r4
            long r0 = r0 | r4
            r4 = 4
            r8 = r8[r4]
            long r4 = (long) r8
            long r2 = r2 & r4
            r8 = 7
            long r2 = r2 >> r8
            long r0 = r0 | r2
            return r0
    }
}
