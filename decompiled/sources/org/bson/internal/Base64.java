package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class Base64 {
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int[] DECODE_TABLE = null;
    private static final byte[] ENCODE_TABLE = null;
    private static final byte PAD = 61;
    private static final int SIX_BIT_MASK = 63;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            org.bson.internal.Base64.ENCODE_TABLE = r0
            r0 = 128(0x80, float:1.8E-43)
            int[] r0 = new int[r0]
            org.bson.internal.Base64.DECODE_TABLE = r0
            r0 = 0
        L10:
            byte[] r1 = org.bson.internal.Base64.ENCODE_TABLE
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            int[] r2 = org.bson.internal.Base64.DECODE_TABLE
            r1 = r1[r0]
            r2[r1] = r0
            int r0 = r0 + 1
            goto L10
        L1e:
            return
    }

    private Base64() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String byteArrayToString(byte[] r3) {
            java.lang.String r0 = new java.lang.String
            int r1 = r3.length
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            return r0
    }

    public static byte[] decode(java.lang.String r10) {
            java.lang.String r0 = "=="
            boolean r0 = r10.endsWith(r0)
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lc
            r0 = 2
            goto L17
        Lc:
            java.lang.String r0 = "="
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            int r3 = r10.length()
            int r3 = r3 * 3
            int r3 = r3 / 4
            int r3 = r3 - r0
            byte[] r0 = new byte[r3]
            r4 = 0
        L23:
            int r5 = r10.length()
            if (r1 >= r5) goto L74
            int[] r5 = org.bson.internal.Base64.DECODE_TABLE
            char r6 = r10.charAt(r1)
            r6 = r5[r6]
            int r7 = r1 + 1
            char r7 = r10.charAt(r7)
            r7 = r5[r7]
            int r8 = r4 + 1
            int r6 = r6 << r2
            int r9 = r7 >> 4
            r6 = r6 | r9
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r0[r4] = r6
            if (r8 < r3) goto L47
            return r0
        L47:
            int r4 = r1 + 2
            char r4 = r10.charAt(r4)
            r4 = r5[r4]
            int r6 = r8 + 1
            int r7 = r7 << 4
            int r9 = r4 >> 2
            r7 = r7 | r9
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r0[r8] = r7
            if (r6 < r3) goto L5e
            return r0
        L5e:
            int r7 = r1 + 3
            char r7 = r10.charAt(r7)
            r5 = r5[r7]
            int r7 = r6 + 1
            int r4 = r4 << 6
            r4 = r4 | r5
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r6] = r4
            int r1 = r1 + 4
            r4 = r7
            goto L23
        L74:
            return r0
    }

    public static java.lang.String encode(byte[] r10) {
            int r0 = r10.length
            int r0 = r0 / 3
            r1 = 4
            int r0 = r0 * 4
            int r2 = r10.length
            int r2 = r2 % 3
            r3 = 0
            if (r2 != 0) goto Le
            r2 = 0
            goto Lf
        Le:
            r2 = 4
        Lf:
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            int r2 = r10.length
            r4 = 0
            r5 = 0
            r6 = 0
        L16:
            if (r3 >= r2) goto L52
            r7 = r10[r3]
            int r4 = r4 + 1
            int r4 = r4 % 3
            if (r7 >= 0) goto L22
            int r7 = r7 + 256
        L22:
            int r6 = r6 << 8
            int r6 = r6 + r7
            if (r4 != 0) goto L4f
            int r7 = r5 + 1
            byte[] r8 = org.bson.internal.Base64.ENCODE_TABLE
            int r9 = r6 >> 18
            r9 = r9 & 63
            r9 = r8[r9]
            r0[r5] = r9
            int r5 = r7 + 1
            int r9 = r6 >> 12
            r9 = r9 & 63
            r9 = r8[r9]
            r0[r7] = r9
            int r7 = r5 + 1
            int r9 = r6 >> 6
            r9 = r9 & 63
            r9 = r8[r9]
            r0[r5] = r9
            int r5 = r7 + 1
            r9 = r6 & 63
            r8 = r8[r9]
            r0[r7] = r8
        L4f:
            int r3 = r3 + 1
            goto L16
        L52:
            r10 = 61
            r2 = 1
            if (r4 == r2) goto L7e
            r1 = 2
            if (r4 == r1) goto L5b
            goto L9a
        L5b:
            int r2 = r5 + 1
            byte[] r3 = org.bson.internal.Base64.ENCODE_TABLE
            int r4 = r6 >> 10
            r4 = r4 & 63
            r4 = r3[r4]
            r0[r5] = r4
            int r4 = r2 + 1
            int r5 = r6 >> 4
            r5 = r5 & 63
            r5 = r3[r5]
            r0[r2] = r5
            int r2 = r4 + 1
            int r1 = r6 << 2
            r1 = r1 & 63
            r1 = r3[r1]
            r0[r4] = r1
            r0[r2] = r10
            goto L9a
        L7e:
            int r2 = r5 + 1
            byte[] r3 = org.bson.internal.Base64.ENCODE_TABLE
            int r4 = r6 >> 2
            r4 = r4 & 63
            r4 = r3[r4]
            r0[r5] = r4
            int r4 = r2 + 1
            int r1 = r6 << 4
            r1 = r1 & 63
            r1 = r3[r1]
            r0[r2] = r1
            int r1 = r4 + 1
            r0[r4] = r10
            r0[r1] = r10
        L9a:
            java.lang.String r10 = byteArrayToString(r0)
            return r10
    }
}
