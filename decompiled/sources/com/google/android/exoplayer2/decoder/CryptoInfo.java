package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;

    @androidx.annotation.Nullable
    public byte[] iv;

    @androidx.annotation.Nullable
    public byte[] key;
    public int mode;

    @androidx.annotation.Nullable
    public int[] numBytesOfClearData;

    @androidx.annotation.Nullable
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.decoder.CryptoInfo.PatternHolderV24 patternHolder;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.CryptoInfo$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(24)
    public static final class PatternHolderV24 {
        private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final android.media.MediaCodec.CryptoInfo.Pattern pattern;

        private PatternHolderV24(android.media.MediaCodec.CryptoInfo r2) {
                r1 = this;
                r1.<init>()
                r1.frameworkCryptoInfo = r2
                android.media.MediaCodec$CryptoInfo$Pattern r2 = new android.media.MediaCodec$CryptoInfo$Pattern
                r0 = 0
                r2.<init>(r0, r0)
                r1.pattern = r2
                return
        }

        public /* synthetic */ PatternHolderV24(android.media.MediaCodec.CryptoInfo r1, com.google.android.exoplayer2.decoder.CryptoInfo.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void access$100(com.google.android.exoplayer2.decoder.CryptoInfo.PatternHolderV24 r0, int r1, int r2) {
                r0.set(r1, r2)
                return
        }

        private void set(int r2, int r3) {
                r1 = this;
                android.media.MediaCodec$CryptoInfo$Pattern r0 = r1.pattern
                r0.set(r2, r3)
                android.media.MediaCodec$CryptoInfo r2 = r1.frameworkCryptoInfo
                android.media.MediaCodec$CryptoInfo$Pattern r3 = r1.pattern
                r2.setPattern(r3)
                return
        }
    }

    public CryptoInfo() {
            r4 = this;
            r4.<init>()
            android.media.MediaCodec$CryptoInfo r0 = new android.media.MediaCodec$CryptoInfo
            r0.<init>()
            r4.frameworkCryptoInfo = r0
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 0
            r3 = 24
            if (r1 < r3) goto L17
            com.google.android.exoplayer2.decoder.CryptoInfo$PatternHolderV24 r1 = new com.google.android.exoplayer2.decoder.CryptoInfo$PatternHolderV24
            r1.<init>(r0, r2)
            r2 = r1
        L17:
            r4.patternHolder = r2
            return
    }

    public android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
            r1 = this;
            android.media.MediaCodec$CryptoInfo r0 = r1.frameworkCryptoInfo
            return r0
    }

    public void increaseClearDataFirstSubSampleBy(int r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int[] r0 = r3.numBytesOfClearData
            if (r0 != 0) goto L10
            r0 = 1
            int[] r0 = new int[r0]
            r3.numBytesOfClearData = r0
            android.media.MediaCodec$CryptoInfo r1 = r3.frameworkCryptoInfo
            r1.numBytesOfClearData = r0
        L10:
            int[] r0 = r3.numBytesOfClearData
            r1 = 0
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            return
    }

    public void set(int r2, int[] r3, int[] r4, byte[] r5, byte[] r6, int r7, int r8, int r9) {
            r1 = this;
            r1.numSubSamples = r2
            r1.numBytesOfClearData = r3
            r1.numBytesOfEncryptedData = r4
            r1.key = r5
            r1.iv = r6
            r1.mode = r7
            r1.encryptedBlocks = r8
            r1.clearBlocks = r9
            android.media.MediaCodec$CryptoInfo r0 = r1.frameworkCryptoInfo
            r0.numSubSamples = r2
            r0.numBytesOfClearData = r3
            r0.numBytesOfEncryptedData = r4
            r0.key = r5
            r0.iv = r6
            r0.mode = r7
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 24
            if (r2 < r3) goto L2f
            com.google.android.exoplayer2.decoder.CryptoInfo$PatternHolderV24 r2 = r1.patternHolder
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.decoder.CryptoInfo$PatternHolderV24 r2 = (com.google.android.exoplayer2.decoder.CryptoInfo.PatternHolderV24) r2
            com.google.android.exoplayer2.decoder.CryptoInfo.PatternHolderV24.access$100(r2, r8, r9)
        L2f:
            return
    }
}
