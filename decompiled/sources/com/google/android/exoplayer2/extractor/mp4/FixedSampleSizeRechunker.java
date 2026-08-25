package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] r1, int[] r2, int r3, long[] r4, int[] r5, long r6) {
                r0 = this;
                r0.<init>()
                r0.offsets = r1
                r0.sizes = r2
                r0.maximumSize = r3
                r0.timestamps = r4
                r0.flags = r5
                r0.duration = r6
                return
        }

        public /* synthetic */ Results(long[] r1, int[] r2, int r3, long[] r4, int[] r5, long r6, com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.AnonymousClass1 r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    private FixedSampleSizeRechunker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.Results rechunk(int r16, long[] r17, int[] r18, long r19) {
            r0 = r18
            r1 = 8192(0x2000, float:1.148E-41)
            int r1 = r1 / r16
            int r2 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
        La:
            if (r4 >= r2) goto L16
            r6 = r0[r4]
            int r6 = com.google.android.exoplayer2.util.Util.ceilDivide(r6, r1)
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto La
        L16:
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r2 = 0
            r4 = 0
            r9 = 0
        L21:
            int r5 = r0.length
            if (r3 >= r5) goto L4e
            r5 = r0[r3]
            r12 = r17[r3]
        L28:
            if (r5 <= 0) goto L4b
            int r6 = java.lang.Math.min(r1, r5)
            r7[r4] = r12
            int r14 = r16 * r6
            r8[r4] = r14
            r14 = r8[r4]
            int r9 = java.lang.Math.max(r9, r14)
            long r14 = (long) r2
            long r14 = r14 * r19
            r10[r4] = r14
            r14 = 1
            r11[r4] = r14
            r14 = r8[r4]
            long r14 = (long) r14
            long r12 = r12 + r14
            int r2 = r2 + r6
            int r5 = r5 - r6
            int r4 = r4 + 1
            goto L28
        L4b:
            int r3 = r3 + 1
            goto L21
        L4e:
            long r0 = (long) r2
            long r12 = r19 * r0
            com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$Results r0 = new com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$Results
            r14 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)
            return r0
    }
}
