package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class SeekParameters {
    public static final com.google.android.exoplayer2.SeekParameters CLOSEST_SYNC = null;
    public static final com.google.android.exoplayer2.SeekParameters DEFAULT = null;
    public static final com.google.android.exoplayer2.SeekParameters EXACT = null;
    public static final com.google.android.exoplayer2.SeekParameters NEXT_SYNC = null;
    public static final com.google.android.exoplayer2.SeekParameters PREVIOUS_SYNC = null;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
            com.google.android.exoplayer2.SeekParameters r0 = new com.google.android.exoplayer2.SeekParameters
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.SeekParameters.EXACT = r0
            com.google.android.exoplayer2.SeekParameters r3 = new com.google.android.exoplayer2.SeekParameters
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r4, r4)
            com.google.android.exoplayer2.SeekParameters.CLOSEST_SYNC = r3
            com.google.android.exoplayer2.SeekParameters r3 = new com.google.android.exoplayer2.SeekParameters
            r3.<init>(r4, r1)
            com.google.android.exoplayer2.SeekParameters.PREVIOUS_SYNC = r3
            com.google.android.exoplayer2.SeekParameters r3 = new com.google.android.exoplayer2.SeekParameters
            r3.<init>(r1, r4)
            com.google.android.exoplayer2.SeekParameters.NEXT_SYNC = r3
            com.google.android.exoplayer2.SeekParameters.DEFAULT = r0
            return
    }

    public SeekParameters(long r6, long r8) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r4)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r5.toleranceBeforeUs = r6
            r5.toleranceAfterUs = r8
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<com.google.android.exoplayer2.SeekParameters> r2 = com.google.android.exoplayer2.SeekParameters.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.exoplayer2.SeekParameters r8 = (com.google.android.exoplayer2.SeekParameters) r8
            long r2 = r7.toleranceBeforeUs
            long r4 = r8.toleranceBeforeUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.toleranceAfterUs
            long r4 = r8.toleranceAfterUs
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.toleranceBeforeUs
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r4.toleranceAfterUs
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public long resolveSeekPositionUs(long r9, long r11, long r13) {
            r8 = this;
            long r2 = r8.toleranceBeforeUs
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.toleranceAfterUs
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r0 = com.google.android.exoplayer2.util.Util.subtractWithOverflowDefault(r0, r2, r4)
            long r4 = r8.toleranceAfterUs
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = r9
            long r2 = com.google.android.exoplayer2.util.Util.addWithOverflowDefault(r2, r4, r6)
            r4 = 1
            r5 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L2e
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 > 0) goto L2e
            r6 = 1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            int r7 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r7 > 0) goto L38
            int r7 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r7 > 0) goto L38
            goto L39
        L38:
            r4 = 0
        L39:
            if (r6 == 0) goto L4f
            if (r4 == 0) goto L4f
            long r0 = r11 - r9
            long r0 = java.lang.Math.abs(r0)
            long r9 = r13 - r9
            long r9 = java.lang.Math.abs(r9)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L4e
            return r11
        L4e:
            return r13
        L4f:
            if (r6 == 0) goto L52
            return r11
        L52:
            if (r4 == 0) goto L55
            return r13
        L55:
            return r0
    }
}
