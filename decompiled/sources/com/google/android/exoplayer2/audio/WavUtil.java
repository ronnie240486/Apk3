package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
public final class WavUtil {
    public static final int DATA_FOURCC = 1684108385;
    public static final int DS64_FOURCC = 1685272116;
    public static final int FMT_FOURCC = 1718449184;
    public static final int RF64_FOURCC = 1380333108;
    public static final int RIFF_FOURCC = 1380533830;
    public static final int TYPE_ALAW = 6;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_IMA_ADPCM = 17;
    public static final int TYPE_MLAW = 7;
    public static final int TYPE_PCM = 1;
    public static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
    public static final int WAVE_FOURCC = 1463899717;

    private WavUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getPcmEncodingForType(int r2, int r3) {
            r0 = 1
            if (r2 == r0) goto L13
            r0 = 3
            r1 = 0
            if (r2 == r0) goto Ld
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r0) goto L13
            return r1
        Ld:
            r2 = 32
            if (r3 != r2) goto L12
            r1 = 4
        L12:
            return r1
        L13:
            int r2 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r3)
            return r2
    }

    public static int getTypeForPcmEncoding(int r2) {
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L19
            r1 = 4
            if (r2 == r1) goto L18
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == r0) goto L19
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 != r0) goto L12
            goto L19
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L18:
            return r0
        L19:
            r2 = 1
            return r2
    }
}
