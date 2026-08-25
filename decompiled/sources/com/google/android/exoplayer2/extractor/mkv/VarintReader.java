package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = null;
    private int length;
    private final byte[] scratch;
    private int state;

    static {
            r0 = 8
            long[] r0 = new long[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [128, 64, 32, 16, 8, 4, 2, 1} // fill-array
            com.google.android.exoplayer2.extractor.mkv.VarintReader.VARINT_LENGTH_MASKS = r0
            return
    }

    public VarintReader() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.scratch = r0
            return
    }

    public static long assembleVarint(byte[] r6, int r7, boolean r8) {
            r0 = 0
            r0 = r6[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            if (r8 == 0) goto L11
            long[] r8 = com.google.android.exoplayer2.extractor.mkv.VarintReader.VARINT_LENGTH_MASKS
            int r4 = r7 + (-1)
            r4 = r8[r4]
            long r4 = ~r4
            long r0 = r0 & r4
        L11:
            r8 = 1
        L12:
            if (r8 >= r7) goto L1f
            r4 = 8
            long r0 = r0 << r4
            r4 = r6[r8]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 | r4
            int r8 = r8 + 1
            goto L12
        L1f:
            return r0
    }

    public static int parseUnsignedVarintLength(int r6) {
            r0 = 0
        L1:
            long[] r1 = com.google.android.exoplayer2.extractor.mkv.VarintReader.VARINT_LENGTH_MASKS
            int r2 = r1.length
            if (r0 >= r2) goto L17
            r2 = r1[r0]
            long r4 = (long) r6
            long r1 = r2 & r4
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L14
            int r0 = r0 + 1
            goto L18
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r0 = -1
        L18:
            return r0
    }

    public int getLastLength() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public long readUnsignedVarint(com.google.android.exoplayer2.extractor.ExtractorInput r4, boolean r5, boolean r6, int r7) throws java.io.IOException {
            r3 = this;
            int r0 = r3.state
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2b
            byte[] r0 = r3.scratch
            boolean r5 = r4.readFully(r0, r1, r2, r5)
            if (r5 != 0) goto L11
            r4 = -1
            return r4
        L11:
            byte[] r5 = r3.scratch
            r5 = r5[r1]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = parseUnsignedVarintLength(r5)
            r3.length = r5
            r0 = -1
            if (r5 == r0) goto L23
            r3.state = r2
            goto L2b
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No valid varint length mask found"
            r4.<init>(r5)
            throw r4
        L2b:
            int r5 = r3.length
            if (r5 <= r7) goto L34
            r3.state = r1
            r4 = -2
            return r4
        L34:
            if (r5 == r2) goto L3c
            byte[] r7 = r3.scratch
            int r5 = r5 - r2
            r4.readFully(r7, r2, r5)
        L3c:
            r3.state = r1
            byte[] r4 = r3.scratch
            int r5 = r3.length
            long r4 = assembleVarint(r4, r5, r6)
            return r4
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.state = r0
            r1.length = r0
            return
    }
}
