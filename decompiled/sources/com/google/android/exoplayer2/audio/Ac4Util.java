package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = null;
    public static final int SAMPLE_HEADER_SIZE = 7;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.Ac4Util$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        public /* synthetic */ SyncFrameInfo(int r7, int r8, int r9, int r10) {
                r6 = this;
                r2 = 2
                r0 = r6
                r1 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private SyncFrameInfo(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.bitstreamVersion = r1
                r0.channelCount = r2
                r0.sampleRate = r3
                r0.frameSize = r4
                r0.sampleCount = r5
                return
        }
    }

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048} // fill-array
            com.google.android.exoplayer2.audio.Ac4Util.SAMPLE_COUNT = r0
            return
    }

    private Ac4Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getAc4SampleHeader(int r2, com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r0 = 7
            r3.reset(r0)
            byte[] r3 = r3.getData()
            r0 = 0
            r1 = -84
            r3[r0] = r1
            r0 = 1
            r1 = 64
            r3[r0] = r1
            r0 = 2
            r1 = -1
            r3[r0] = r1
            r0 = 3
            r3[r0] = r1
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 4
            r3[r1] = r0
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 5
            r3[r1] = r0
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0 = 6
            r3[r0] = r2
            return
    }

    public static com.google.android.exoplayer2.Format parseAc4AnnexEFormat(com.google.android.exoplayer2.util.ParsableByteArray r1, java.lang.String r2, java.lang.String r3, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r4) {
            r0 = 1
            r1.skipBytes(r0)
            int r1 = r1.readUnsignedByte()
            r1 = r1 & 32
            int r1 = r1 >> 5
            if (r1 != r0) goto L12
            r1 = 48000(0xbb80, float:6.7262E-41)
            goto L15
        L12:
            r1 = 44100(0xac44, float:6.1797E-41)
        L15:
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setId(r2)
            java.lang.String r0 = "audio/ac4"
            com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r0)
            r0 = 2
            com.google.android.exoplayer2.Format$Builder r2 = r2.setChannelCount(r0)
            com.google.android.exoplayer2.Format$Builder r1 = r2.setSampleRate(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r3)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    public static int parseAc4SyncframeAudioSampleCount(java.nio.ByteBuffer r2) {
            r0 = 16
            byte[] r0 = new byte[r0]
            int r1 = r2.position()
            r2.get(r0)
            r2.position(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = new com.google.android.exoplayer2.util.ParsableBitArray
            r2.<init>(r0)
            com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo r2 = parseAc4SyncframeInfo(r2)
            int r2 = r2.sampleCount
            return r2
    }

    public static com.google.android.exoplayer2.audio.Ac4Util.SyncFrameInfo parseAc4SyncframeInfo(com.google.android.exoplayer2.util.ParsableBitArray r10) {
            r0 = 16
            int r1 = r10.readBits(r0)
            int r0 = r10.readBits(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.readBits(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r3 = r10.readBits(r1)
            r4 = 3
            if (r3 != r4) goto L2e
            int r5 = readVariableBits(r10, r1)
            int r3 = r3 + r5
        L2e:
            r5 = 10
            int r5 = r10.readBits(r5)
            boolean r6 = r10.readBit()
            if (r6 == 0) goto L43
            int r6 = r10.readBits(r4)
            if (r6 <= 0) goto L43
            r10.skipBits(r1)
        L43:
            boolean r6 = r10.readBit()
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 48000(0xbb80, float:6.7262E-41)
            if (r6 == 0) goto L53
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L56
        L53:
            r6 = 44100(0xac44, float:6.1797E-41)
        L56:
            int r10 = r10.readBits(r2)
            if (r6 != r7) goto L65
            r7 = 13
            if (r10 != r7) goto L65
            int[] r1 = com.google.android.exoplayer2.audio.Ac4Util.SAMPLE_COUNT
            r10 = r1[r10]
            goto L93
        L65:
            if (r6 != r8) goto L92
            int[] r7 = com.google.android.exoplayer2.audio.Ac4Util.SAMPLE_COUNT
            int r8 = r7.length
            if (r10 >= r8) goto L92
            r7 = r7[r10]
            int r5 = r5 % 5
            r8 = 8
            r9 = 1
            if (r5 == r9) goto L8a
            r9 = 11
            if (r5 == r1) goto L85
            if (r5 == r4) goto L8a
            if (r5 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r4) goto L8e
            if (r10 == r8) goto L8e
            if (r10 != r9) goto L90
            goto L8e
        L85:
            if (r10 == r8) goto L8e
            if (r10 != r9) goto L90
            goto L8e
        L8a:
            if (r10 == r4) goto L8e
            if (r10 != r8) goto L90
        L8e:
            int r7 = r7 + 1
        L90:
            r10 = r7
            goto L93
        L92:
            r10 = 0
        L93:
            com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo r1 = new com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo
            r1.<init>(r3, r6, r0, r10)
            return r1
    }

    public static int parseAc4SyncframeSize(byte[] r4, int r5) {
            int r0 = r4.length
            r1 = 7
            if (r0 >= r1) goto L6
            r4 = -1
            return r4
        L6:
            r0 = 2
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = 3
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L2e
            r0 = r4[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r2 = 5
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 | r2
            r2 = 6
            r4 = r4[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0 | r4
            goto L2f
        L2e:
            r1 = 4
        L2f:
            r4 = 44097(0xac41, float:6.1793E-41)
            if (r5 != r4) goto L36
            int r1 = r1 + 2
        L36:
            int r0 = r0 + r1
            return r0
    }

    private static int readVariableBits(com.google.android.exoplayer2.util.ParsableBitArray r2, int r3) {
            r0 = 0
        L1:
            int r1 = r2.readBits(r3)
            int r1 = r1 + r0
            boolean r0 = r2.readBit()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            int r0 = r1 << r3
            goto L1
    }
}
