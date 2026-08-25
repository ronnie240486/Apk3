package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.targetType = r2
            int r3 = r3 + 3
            byte[] r2 = new byte[r3]
            r1.nalData = r2
            r3 = 2
            r0 = 1
            r2[r3] = r0
            return
    }

    public void appendToNalUnit(byte[] r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r4.isFilling
            if (r0 != 0) goto L5
            return
        L5:
            int r7 = r7 - r6
            byte[] r0 = r4.nalData
            int r1 = r0.length
            int r2 = r4.nalLength
            int r3 = r2 + r7
            if (r1 >= r3) goto L18
            int r2 = r2 + r7
            int r2 = r2 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r4.nalData = r0
        L18:
            byte[] r0 = r4.nalData
            int r1 = r4.nalLength
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            int r5 = r4.nalLength
            int r5 = r5 + r7
            r4.nalLength = r5
            return
    }

    public boolean endNalUnit(int r3) {
            r2 = this;
            boolean r0 = r2.isFilling
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.nalLength
            int r0 = r0 - r3
            r2.nalLength = r0
            r2.isFilling = r1
            r3 = 1
            r2.isCompleted = r3
            return r3
    }

    public boolean isCompleted() {
            r1 = this;
            boolean r0 = r1.isCompleted
            return r0
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.isFilling = r0
            r1.isCompleted = r0
            return
    }

    public void startNalUnit(int r4) {
            r3 = this;
            boolean r0 = r3.isFilling
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r3.targetType
            r2 = 0
            if (r4 != r0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r3.isFilling = r1
            if (r1 == 0) goto L17
            r4 = 3
            r3.nalLength = r4
            r3.isCompleted = r2
        L17:
            return
    }
}
