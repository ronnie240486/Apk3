package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;

    public Sniffer() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r0.<init>(r1)
            r2.scratch = r0
            return
    }

    private long readUint(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 1
            r7.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L1a
            r0 = -9223372036854775808
            return r0
        L1a:
            r3 = 128(0x80, float:1.8E-43)
            r4 = 0
        L1d:
            r5 = r0 & r3
            if (r5 != 0) goto L26
            int r3 = r3 >> 1
            int r4 = r4 + 1
            goto L1d
        L26:
            int r3 = ~r3
            r0 = r0 & r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.scratch
            byte[] r3 = r3.getData()
            r7.peekFully(r3, r2, r4)
        L31:
            if (r1 >= r4) goto L43
            int r7 = r0 << 8
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            int r1 = r1 + 1
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r7
            goto L31
        L43:
            int r7 = r6.peekLength
            int r4 = r4 + r2
            int r4 = r4 + r7
            r6.peekLength = r4
            long r0 = (long) r0
            return r0
    }

    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r18) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.getLength()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L16
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L15
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = (int) r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.scratch
            byte[] r4 = r4.getData()
            r6 = 0
            r7 = 4
            r1.peekFully(r4, r6, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.scratch
            long r9 = r4.readUnsignedInt()
            r0.peekLength = r7
        L2a:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L56
            int r7 = r0.peekLength
            int r7 = r7 + r4
            r0.peekLength = r7
            if (r7 != r5) goto L3a
            return r6
        L3a:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r0.scratch
            byte[] r7 = r7.getData()
            r1.peekFully(r7, r6, r4)
            r4 = 8
            long r9 = r9 << r4
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.scratch
            byte[] r4 = r4.getData()
            r4 = r4[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r11 = (long) r4
            long r9 = r9 | r11
            goto L2a
        L56:
            long r9 = r17.readUint(r18)
            int r5 = r0.peekLength
            long r11 = (long) r5
            r13 = -9223372036854775808
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto La3
            if (r8 == 0) goto L6c
            long r7 = r11 + r9
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 < 0) goto L6c
            goto La3
        L6c:
            int r2 = r0.peekLength
            long r7 = (long) r2
            long r15 = r11 + r9
            int r3 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r3 >= 0) goto L9d
            long r2 = r17.readUint(r18)
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 != 0) goto L7e
            return r6
        L7e:
            long r2 = r17.readUint(r18)
            r7 = 0
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 < 0) goto L9c
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 <= 0) goto L90
            goto L9c
        L90:
            if (r5 == 0) goto L6c
            int r3 = (int) r2
            r1.advancePeekPosition(r3)
            int r2 = r0.peekLength
            int r2 = r2 + r3
            r0.peekLength = r2
            goto L6c
        L9c:
            return r6
        L9d:
            long r1 = (long) r2
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto La3
            r6 = 1
        La3:
            return r6
    }
}
