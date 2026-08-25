package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;

    @androidx.annotation.Nullable
    public java.nio.ByteBuffer data;
    public int decoderPrivate;

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format format;
    public int height;
    public int mode;
    private final com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> owner;

    @androidx.annotation.Nullable
    public java.nio.ByteBuffer supplementalData;
    public int width;

    @androidx.annotation.Nullable
    public java.nio.ByteBuffer[] yuvPlanes;

    @androidx.annotation.Nullable
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> r1) {
            r0 = this;
            r0.<init>()
            r0.owner = r1
            return
    }

    private static boolean isSafeToMultiply(int r1, int r2) {
            if (r1 < 0) goto Le
            if (r2 < 0) goto Le
            if (r2 <= 0) goto Lc
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0 / r2
            if (r1 >= r0) goto Le
        Lc:
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public void init(long r1, int r3, @androidx.annotation.Nullable java.nio.ByteBuffer r4) {
            r0 = this;
            r0.timeUs = r1
            r0.mode = r3
            if (r4 == 0) goto L3b
            boolean r1 = r4.hasRemaining()
            if (r1 == 0) goto L3b
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlag(r1)
            int r1 = r4.limit()
            java.nio.ByteBuffer r2 = r0.supplementalData
            if (r2 == 0) goto L26
            int r2 = r2.capacity()
            if (r2 >= r1) goto L20
            goto L26
        L20:
            java.nio.ByteBuffer r1 = r0.supplementalData
            r1.clear()
            goto L2c
        L26:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.supplementalData = r1
        L2c:
            java.nio.ByteBuffer r1 = r0.supplementalData
            r1.put(r4)
            java.nio.ByteBuffer r1 = r0.supplementalData
            r1.flip()
            r1 = 0
            r4.position(r1)
            goto L3e
        L3b:
            r1 = 0
            r0.supplementalData = r1
        L3e:
            return
    }

    public void initForPrivateFrame(int r1, int r2) {
            r0 = this;
            r0.width = r1
            r0.height = r2
            return
    }

    public boolean initForYuvFrame(int r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            r6.width = r7
            r6.height = r8
            r6.colorspace = r11
            long r0 = (long) r8
            r2 = 1
            long r0 = r0 + r2
            r2 = 2
            long r0 = r0 / r2
            int r7 = (int) r0
            boolean r11 = isSafeToMultiply(r9, r8)
            r0 = 0
            if (r11 == 0) goto L91
            boolean r11 = isSafeToMultiply(r10, r7)
            if (r11 != 0) goto L1d
            goto L91
        L1d:
            int r8 = r8 * r9
            int r7 = r7 * r10
            int r11 = r7 * 2
            int r11 = r11 + r8
            r1 = 2
            boolean r2 = isSafeToMultiply(r7, r1)
            if (r2 == 0) goto L91
            if (r11 >= r8) goto L2e
            goto L91
        L2e:
            java.nio.ByteBuffer r2 = r6.data
            if (r2 == 0) goto L44
            int r2 = r2.capacity()
            if (r2 >= r11) goto L39
            goto L44
        L39:
            java.nio.ByteBuffer r2 = r6.data
            r2.position(r0)
            java.nio.ByteBuffer r2 = r6.data
            r2.limit(r11)
            goto L4a
        L44:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)
            r6.data = r11
        L4a:
            java.nio.ByteBuffer[] r11 = r6.yuvPlanes
            r2 = 3
            if (r11 != 0) goto L53
            java.nio.ByteBuffer[] r11 = new java.nio.ByteBuffer[r2]
            r6.yuvPlanes = r11
        L53:
            java.nio.ByteBuffer r11 = r6.data
            java.nio.ByteBuffer[] r3 = r6.yuvPlanes
            java.nio.ByteBuffer r4 = r11.slice()
            r3[r0] = r4
            r4 = r3[r0]
            r4.limit(r8)
            r11.position(r8)
            java.nio.ByteBuffer r4 = r11.slice()
            r5 = 1
            r3[r5] = r4
            r4 = r3[r5]
            r4.limit(r7)
            int r8 = r8 + r7
            r11.position(r8)
            java.nio.ByteBuffer r8 = r11.slice()
            r3[r1] = r8
            r8 = r3[r1]
            r8.limit(r7)
            int[] r7 = r6.yuvStrides
            if (r7 != 0) goto L88
            int[] r7 = new int[r2]
            r6.yuvStrides = r7
        L88:
            int[] r7 = r6.yuvStrides
            r7[r0] = r9
            r7[r5] = r10
            r7[r1] = r10
            return r5
        L91:
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
    public void release() {
            r1 = this;
            com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> r0 = r1.owner
            r0.releaseOutputBuffer(r1)
            return
    }
}
