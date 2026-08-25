package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class TrackFragment {
    public long atomPosition;
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public boolean nextFragmentDecodeTimeIncludesMoov;
    public int sampleCount;
    public final com.google.android.exoplayer2.util.ParsableByteArray sampleEncryptionData;
    public boolean sampleEncryptionDataNeedsFill;
    public boolean[] sampleHasSubsampleEncryptionTable;
    public boolean[] sampleIsSyncFrameTable;
    public long[] samplePresentationTimesUs;
    public int[] sampleSizeTable;

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition;
    public int[] trunLength;

    public TrackFragment() {
            r2 = this;
            r2.<init>()
            r0 = 0
            long[] r1 = new long[r0]
            r2.trunDataPosition = r1
            int[] r1 = new int[r0]
            r2.trunLength = r1
            int[] r1 = new int[r0]
            r2.sampleSizeTable = r1
            long[] r1 = new long[r0]
            r2.samplePresentationTimesUs = r1
            boolean[] r1 = new boolean[r0]
            r2.sampleIsSyncFrameTable = r1
            boolean[] r0 = new boolean[r0]
            r2.sampleHasSubsampleEncryptionTable = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r2.sampleEncryptionData = r0
            return
    }

    public void fillEncryptionData(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.sampleEncryptionData
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r3.sampleEncryptionData
            int r1 = r1.limit()
            r2 = 0
            r4.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.sampleEncryptionData
            r4.setPosition(r2)
            r3.sampleEncryptionDataNeedsFill = r2
            return
    }

    public void fillEncryptionData(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.sampleEncryptionData
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r3.sampleEncryptionData
            int r1 = r1.limit()
            r2 = 0
            r4.readBytes(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.sampleEncryptionData
            r4.setPosition(r2)
            r3.sampleEncryptionDataNeedsFill = r2
            return
    }

    public long getSamplePresentationTimeUs(int r4) {
            r3 = this;
            long[] r0 = r3.samplePresentationTimesUs
            r1 = r0[r4]
            return r1
    }

    public void initEncryptionData(int r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.sampleEncryptionData
            r0.reset(r2)
            r2 = 1
            r1.definesEncryptionData = r2
            r1.sampleEncryptionDataNeedsFill = r2
            return
    }

    public void initTables(int r2, int r3) {
            r1 = this;
            r1.trunCount = r2
            r1.sampleCount = r3
            int[] r0 = r1.trunLength
            int r0 = r0.length
            if (r0 >= r2) goto L11
            long[] r0 = new long[r2]
            r1.trunDataPosition = r0
            int[] r2 = new int[r2]
            r1.trunLength = r2
        L11:
            int[] r2 = r1.sampleSizeTable
            int r2 = r2.length
            if (r2 >= r3) goto L2a
            int r3 = r3 * 125
            int r3 = r3 / 100
            int[] r2 = new int[r3]
            r1.sampleSizeTable = r2
            long[] r2 = new long[r3]
            r1.samplePresentationTimesUs = r2
            boolean[] r2 = new boolean[r3]
            r1.sampleIsSyncFrameTable = r2
            boolean[] r2 = new boolean[r3]
            r1.sampleHasSubsampleEncryptionTable = r2
        L2a:
            return
    }

    public void reset() {
            r3 = this;
            r0 = 0
            r3.trunCount = r0
            r1 = 0
            r3.nextFragmentDecodeTime = r1
            r3.nextFragmentDecodeTimeIncludesMoov = r0
            r3.definesEncryptionData = r0
            r3.sampleEncryptionDataNeedsFill = r0
            r0 = 0
            r3.trackEncryptionBox = r0
            return
    }

    public boolean sampleHasSubsampleEncryptionTable(int r2) {
            r1 = this;
            boolean r0 = r1.definesEncryptionData
            if (r0 == 0) goto Lc
            boolean[] r0 = r1.sampleHasSubsampleEncryptionTable
            boolean r2 = r0[r2]
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }
}
