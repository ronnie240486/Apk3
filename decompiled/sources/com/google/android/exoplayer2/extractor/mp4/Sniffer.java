package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = null;
    private static final int SEARCH_LENGTH = 4096;

    static {
            r0 = 29
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686} // fill-array
            com.google.android.exoplayer2.extractor.mp4.Sniffer.COMPATIBLE_BRANDS = r0
            return
    }

    private Sniffer() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isCompatibleBrand(int r5, boolean r6) {
            int r0 = r5 >>> 8
            r1 = 1
            r2 = 3368816(0x336770, float:4.720717E-39)
            if (r0 != r2) goto L9
            return r1
        L9:
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 != r0) goto L11
            if (r6 == 0) goto L11
            return r1
        L11:
            int[] r6 = com.google.android.exoplayer2.extractor.mp4.Sniffer.COMPATIBLE_BRANDS
            int r0 = r6.length
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r0) goto L20
            r4 = r6[r3]
            if (r4 != r5) goto L1d
            return r1
        L1d:
            int r3 = r3 + 1
            goto L16
        L20:
            return r2
    }

    public static boolean sniffFragmented(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r0 = 1
            r1 = 0
            boolean r2 = sniffInternal(r2, r0, r1)
            return r2
    }

    private static boolean sniffInternal(com.google.android.exoplayer2.extractor.ExtractorInput r22, boolean r23, boolean r24) throws java.io.IOException {
            r0 = r22
            long r1 = r22.getLength()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L14
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L13
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = (int) r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r8 = 64
            r3.<init>(r8)
            r8 = 0
            r9 = 0
            r10 = 0
        L1f:
            r11 = 1
            if (r9 >= r4) goto Lef
            r12 = 8
            r3.reset(r12)
            byte[] r13 = r3.getData()
            boolean r13 = r0.peekFully(r13, r8, r12, r11)
            if (r13 != 0) goto L33
            goto Lef
        L33:
            long r13 = r3.readUnsignedInt()
            int r15 = r3.readInt()
            r16 = 1
            r11 = 16
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L52
            byte[] r13 = r3.getData()
            r0.peekFully(r13, r12, r12)
            r3.setLimit(r11)
            long r13 = r3.readLong()
            goto L6b
        L52:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L69
            long r16 = r22.getLength()
            int r11 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r11 == 0) goto L69
            long r13 = r22.getPeekPosition()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L69:
            r11 = 8
        L6b:
            long r5 = (long) r11
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L71
            return r8
        L71:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L84
            int r5 = (int) r13
            int r4 = r4 + r5
            if (r7 == 0) goto L81
            long r5 = (long) r4
            int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r11 <= 0) goto L81
            int r4 = (int) r1
        L81:
            r5 = -1
            goto L1f
        L84:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto Leb
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L8f
            goto Leb
        L8f:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r5
            r20 = r9
            long r8 = (long) r4
            int r21 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r21 < 0) goto L9c
            goto Lef
        L9c:
            long r13 = r13 - r5
            int r1 = (int) r13
            int r9 = r20 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto Ldc
            if (r1 >= r12) goto La9
            r2 = 0
            return r2
        La9:
            r2 = 0
            r3.reset(r1)
            byte[] r5 = r3.getData()
            r0.peekFully(r5, r2, r1)
            int r1 = r1 / 4
            r2 = 0
        Lb7:
            if (r2 >= r1) goto Ld4
            r5 = 1
            if (r2 != r5) goto Lc3
            r6 = 4
            r3.skipBytes(r6)
            r8 = r24
            goto Ld1
        Lc3:
            int r6 = r3.readInt()
            r8 = r24
            boolean r6 = isCompatibleBrand(r6, r8)
            if (r6 == 0) goto Ld1
            r10 = 1
            goto Ld6
        Ld1:
            int r2 = r2 + 1
            goto Lb7
        Ld4:
            r8 = r24
        Ld6:
            if (r10 != 0) goto Lda
            r2 = 0
            return r2
        Lda:
            r2 = 0
            goto Le4
        Ldc:
            r8 = r24
            r2 = 0
            if (r1 == 0) goto Le4
            r0.advancePeekPosition(r1)
        Le4:
            r1 = r18
            r5 = -1
            r8 = 0
            goto L1f
        Leb:
            r2 = 0
            r5 = 1
            r0 = 1
            goto Lf2
        Lef:
            r2 = 0
            r5 = 1
            r0 = 0
        Lf2:
            if (r10 == 0) goto Lfa
            r1 = r23
            if (r1 != r0) goto Lfa
            r8 = 1
            goto Lfb
        Lfa:
            r8 = 0
        Lfb:
            return r8
    }

    public static boolean sniffUnfragmented(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = 0
            boolean r1 = sniffInternal(r1, r0, r0)
            return r1
    }

    public static boolean sniffUnfragmented(com.google.android.exoplayer2.extractor.ExtractorInput r1, boolean r2) throws java.io.IOException {
            r0 = 0
            boolean r1 = sniffInternal(r1, r0, r2)
            return r1
    }
}
