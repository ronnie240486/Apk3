package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.TrackOutput$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static int $default$sampleData(com.google.android.exoplayer2.extractor.TrackOutput r1, com.google.android.exoplayer2.upstream.DataReader r2, int r3, boolean r4) throws java.io.IOException {
                r0 = 0
                int r1 = r1.sampleData(r2, r3, r4, r0)
                return r1
        }

        public static void $default$sampleData(com.google.android.exoplayer2.extractor.TrackOutput r1, com.google.android.exoplayer2.util.ParsableByteArray r2, int r3) {
                r0 = 0
                r1.sampleData(r2, r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int r1, byte[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.cryptoMode = r1
                r0.encryptionKey = r2
                r0.encryptedBlocks = r3
                r0.clearBlocks = r4
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L31
                java.lang.Class<com.google.android.exoplayer2.extractor.TrackOutput$CryptoData> r2 = com.google.android.exoplayer2.extractor.TrackOutput.CryptoData.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L31
            L10:
                com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r5 = (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) r5
                int r2 = r4.cryptoMode
                int r3 = r5.cryptoMode
                if (r2 != r3) goto L2f
                int r2 = r4.encryptedBlocks
                int r3 = r5.encryptedBlocks
                if (r2 != r3) goto L2f
                int r2 = r4.clearBlocks
                int r3 = r5.clearBlocks
                if (r2 != r3) goto L2f
                byte[] r2 = r4.encryptionKey
                byte[] r5 = r5.encryptionKey
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L2f
                goto L30
            L2f:
                r0 = 0
            L30:
                return r0
            L31:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.cryptoMode
                int r0 = r0 * 31
                byte[] r1 = r2.encryptionKey
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.encryptedBlocks
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.clearBlocks
                int r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void format(com.google.android.exoplayer2.Format r1);

    int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) throws java.io.IOException;

    int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3, int r4) throws java.io.IOException;

    void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2);

    void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2, int r3);

    void sampleMetadata(long r1, int r3, int r4, int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r6);
}
