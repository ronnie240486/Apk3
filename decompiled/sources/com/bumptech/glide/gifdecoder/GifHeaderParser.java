package com.bumptech.glide.gifdecoder;

/* JADX INFO: loaded from: classes.dex */
public class GifHeaderParser {
    private static final int DESCRIPTOR_MASK_INTERLACE_FLAG = 64;
    private static final int DESCRIPTOR_MASK_LCT_FLAG = 128;
    private static final int DESCRIPTOR_MASK_LCT_SIZE = 7;
    private static final int EXTENSION_INTRODUCER = 33;
    private static final int GCE_DISPOSAL_METHOD_SHIFT = 2;
    private static final int GCE_MASK_DISPOSAL_METHOD = 28;
    private static final int GCE_MASK_TRANSPARENT_COLOR_FLAG = 1;
    private static final int IMAGE_SEPARATOR = 44;
    private static final int LABEL_APPLICATION_EXTENSION = 255;
    private static final int LABEL_COMMENT_EXTENSION = 254;
    private static final int LABEL_GRAPHIC_CONTROL_EXTENSION = 249;
    private static final int LABEL_PLAIN_TEXT_EXTENSION = 1;
    private static final int LSD_MASK_GCT_FLAG = 128;
    private static final int LSD_MASK_GCT_SIZE = 7;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_BLOCK_SIZE = 256;
    private static final java.lang.String TAG = "GifHeaderParser";
    private static final int TRAILER = 59;
    private final byte[] block;
    private int blockSize;
    private com.bumptech.glide.gifdecoder.GifHeader header;
    private java.nio.ByteBuffer rawData;

    public GifHeaderParser() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.block = r0
            r0 = 0
            r1.blockSize = r0
            return
    }

    private boolean err() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.status
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private int read() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.rawData     // Catch: java.lang.Exception -> L9
            byte r0 = r0.get()     // Catch: java.lang.Exception -> L9
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto Lf
        L9:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            r1 = 1
            r0.status = r1
            r0 = 0
        Lf:
            return r0
    }

    private void readBitmap() {
            r8 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            int r1 = r8.readShort()
            r0.ix = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            int r1 = r8.readShort()
            r0.iy = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            int r1 = r8.readShort()
            r0.iw = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            int r1 = r8.readShort()
            r0.ih = r1
            int r0 = r8.read()
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = r0 & 7
            int r6 = r6 + r3
            double r6 = (double) r6
            double r4 = java.lang.Math.pow(r4, r6)
            int r4 = (int) r4
            com.bumptech.glide.gifdecoder.GifHeader r5 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r5 = r5.currentFrame
            r0 = r0 & 64
            if (r0 == 0) goto L49
            r2 = 1
        L49:
            r5.interlace = r2
            if (r1 == 0) goto L54
            int[] r0 = r8.readColorTable(r4)
            r5.lct = r0
            goto L57
        L54:
            r0 = 0
            r5.lct = r0
        L57:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            java.nio.ByteBuffer r1 = r8.rawData
            int r1 = r1.position()
            r0.bufferFrameStart = r1
            r8.skipImageData()
            boolean r0 = r8.err()
            if (r0 == 0) goto L6d
            return
        L6d:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header
            int r1 = r0.frameCount
            int r1 = r1 + r3
            r0.frameCount = r1
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r1 = r0.frames
            com.bumptech.glide.gifdecoder.GifFrame r0 = r0.currentFrame
            r1.add(r0)
            return
    }

    private void readBlock() {
            r7 = this;
            int r0 = r7.read()
            r7.blockSize = r0
            if (r0 <= 0) goto L3d
            r0 = 0
            r1 = 0
        La:
            int r1 = r7.blockSize     // Catch: java.lang.Exception -> L18
            if (r0 >= r1) goto L3d
            int r1 = r1 - r0
            java.nio.ByteBuffer r2 = r7.rawData     // Catch: java.lang.Exception -> L18
            byte[] r3 = r7.block     // Catch: java.lang.Exception -> L18
            r2.get(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            int r0 = r0 + r1
            goto La
        L18:
            r2 = move-exception
            r3 = 3
            java.lang.String r4 = "GifHeaderParser"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L38
            java.lang.String r3 = "Error Reading Block n: "
            java.lang.String r5 = " count: "
            java.lang.String r6 = " blockSize: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r5, r1, r6)
            int r1 = r7.blockSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0, r2)
        L38:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r7.header
            r1 = 1
            r0.status = r1
        L3d:
            return
    }

    @androidx.annotation.Nullable
    private int[] readColorTable(int r10) {
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.ByteBuffer r2 = r9.rawData     // Catch: java.nio.BufferUnderflowException -> L34
            r2.get(r0)     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r2]     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 0
            r3 = 0
        L10:
            if (r2 >= r10) goto L48
            int r4 = r3 + 1
            r3 = r0[r3]     // Catch: java.nio.BufferUnderflowException -> L34
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            r4 = r0[r4]     // Catch: java.nio.BufferUnderflowException -> L34
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 1
            r5 = r0[r5]     // Catch: java.nio.BufferUnderflowException -> L34
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r2 + 1
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r3 << 16
            r3 = r3 | r8
            int r4 = r4 << 8
            r3 = r3 | r4
            r3 = r3 | r5
            r1[r2] = r3     // Catch: java.nio.BufferUnderflowException -> L34
            r3 = r6
            r2 = r7
            goto L10
        L34:
            r10 = move-exception
            java.lang.String r0 = "GifHeaderParser"
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L43
            java.lang.String r2 = "Format Error Reading Color Table"
            android.util.Log.d(r0, r2, r10)
        L43:
            com.bumptech.glide.gifdecoder.GifHeader r10 = r9.header
            r0 = 1
            r10.status = r0
        L48:
            return r1
    }

    private void readContents() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.readContents(r0)
            return
    }

    private void readContents(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 != 0) goto L92
            boolean r2 = r5.err()
            if (r2 != 0) goto L92
            com.bumptech.glide.gifdecoder.GifHeader r2 = r5.header
            int r2 = r2.frameCount
            if (r2 > r6) goto L92
            int r2 = r5.read()
            r3 = 33
            r4 = 1
            if (r2 == r3) goto L39
            r3 = 44
            if (r2 == r3) goto L28
            r3 = 59
            if (r2 == r3) goto L26
            com.bumptech.glide.gifdecoder.GifHeader r2 = r5.header
            r2.status = r4
            goto L2
        L26:
            r1 = 1
            goto L2
        L28:
            com.bumptech.glide.gifdecoder.GifHeader r2 = r5.header
            com.bumptech.glide.gifdecoder.GifFrame r3 = r2.currentFrame
            if (r3 != 0) goto L35
            com.bumptech.glide.gifdecoder.GifFrame r3 = new com.bumptech.glide.gifdecoder.GifFrame
            r3.<init>()
            r2.currentFrame = r3
        L35:
            r5.readBitmap()
            goto L2
        L39:
            int r2 = r5.read()
            if (r2 == r4) goto L8d
            r3 = 249(0xf9, float:3.49E-43)
            if (r2 == r3) goto L7f
            r3 = 254(0xfe, float:3.56E-43)
            if (r2 == r3) goto L7b
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L4f
            r5.skip()
            goto L2
        L4f:
            r5.readBlock()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L58:
            r4 = 11
            if (r3 >= r4) goto L67
            byte[] r4 = r5.block
            r4 = r4[r3]
            char r4 = (char) r4
            r2.append(r4)
            int r3 = r3 + 1
            goto L58
        L67:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NETSCAPE2.0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L77
            r5.readNetscapeExt()
            goto L2
        L77:
            r5.skip()
            goto L2
        L7b:
            r5.skip()
            goto L2
        L7f:
            com.bumptech.glide.gifdecoder.GifHeader r2 = r5.header
            com.bumptech.glide.gifdecoder.GifFrame r3 = new com.bumptech.glide.gifdecoder.GifFrame
            r3.<init>()
            r2.currentFrame = r3
            r5.readGraphicControlExt()
            goto L2
        L8d:
            r5.skip()
            goto L2
        L92:
            return
    }

    private void readGraphicControlExt() {
            r5 = this;
            r5.read()
            int r0 = r5.read()
            com.bumptech.glide.gifdecoder.GifHeader r1 = r5.header
            com.bumptech.glide.gifdecoder.GifFrame r1 = r1.currentFrame
            r2 = r0 & 28
            r3 = 2
            int r2 = r2 >> r3
            r1.dispose = r2
            r4 = 1
            if (r2 != 0) goto L16
            r1.dispose = r4
        L16:
            r0 = r0 & r4
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r4 = 0
        L1b:
            r1.transparency = r4
            int r0 = r5.readShort()
            r1 = 10
            if (r0 >= r3) goto L27
            r0 = 10
        L27:
            com.bumptech.glide.gifdecoder.GifHeader r2 = r5.header
            com.bumptech.glide.gifdecoder.GifFrame r2 = r2.currentFrame
            int r0 = r0 * 10
            r2.delay = r0
            int r0 = r5.read()
            r2.transIndex = r0
            r5.read()
            return
    }

    private void readHeader() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            r2 = 6
            if (r1 >= r2) goto L14
            int r2 = r3.read()
            char r2 = (char) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GIF"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L26
            com.bumptech.glide.gifdecoder.GifHeader r0 = r3.header
            r1 = 1
            r0.status = r1
            return
        L26:
            r3.readLSD()
            com.bumptech.glide.gifdecoder.GifHeader r0 = r3.header
            boolean r0 = r0.gctFlag
            if (r0 == 0) goto L49
            boolean r0 = r3.err()
            if (r0 != 0) goto L49
            com.bumptech.glide.gifdecoder.GifHeader r0 = r3.header
            int r1 = r0.gctSize
            int[] r1 = r3.readColorTable(r1)
            r0.gct = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r3.header
            int[] r1 = r0.gct
            int r2 = r0.bgIndex
            r1 = r1[r2]
            r0.bgColor = r1
        L49:
            return
    }

    private void readLSD() {
            r6 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r6.header
            int r1 = r6.readShort()
            r0.width = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r6.header
            int r1 = r6.readShort()
            r0.height = r1
            int r0 = r6.read()
            com.bumptech.glide.gifdecoder.GifHeader r1 = r6.header
            r2 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r1.gctFlag = r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r0 & 7
            int r0 = r0 + r3
            double r2 = (double) r0
            double r2 = java.lang.Math.pow(r4, r2)
            int r0 = (int) r2
            r1.gctSize = r0
            com.bumptech.glide.gifdecoder.GifHeader r0 = r6.header
            int r1 = r6.read()
            r0.bgIndex = r1
            com.bumptech.glide.gifdecoder.GifHeader r0 = r6.header
            r6.read()
            java.util.Objects.requireNonNull(r0)
            return
    }

    private void readNetscapeExt() {
            r3 = this;
        L0:
            r3.readBlock()
            byte[] r0 = r3.block
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L1b
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.gifdecoder.GifHeader r2 = r3.header
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.loopCount = r0
        L1b:
            int r0 = r3.blockSize
            if (r0 <= 0) goto L25
            boolean r0 = r3.err()
            if (r0 == 0) goto L0
        L25:
            return
    }

    private int readShort() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.rawData
            short r0 = r0.getShort()
            return r0
    }

    private void reset() {
            r2 = this;
            r0 = 0
            r2.rawData = r0
            byte[] r0 = r2.block
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            com.bumptech.glide.gifdecoder.GifHeader r0 = new com.bumptech.glide.gifdecoder.GifHeader
            r0.<init>()
            r2.header = r0
            r2.blockSize = r1
            return
    }

    private void skip() {
            r3 = this;
        L0:
            int r0 = r3.read()
            java.nio.ByteBuffer r1 = r3.rawData
            int r1 = r1.position()
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = r3.rawData
            int r2 = r2.limit()
            int r1 = java.lang.Math.min(r1, r2)
            java.nio.ByteBuffer r2 = r3.rawData
            r2.position(r1)
            if (r0 > 0) goto L0
            return
    }

    private void skipImageData() {
            r0 = this;
            r0.read()
            r0.skip()
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.rawData = r0
            r1.header = r0
            return
    }

    public boolean isAnimated() {
            r2 = this;
            r2.readHeader()
            boolean r0 = r2.err()
            if (r0 != 0) goto Ld
            r0 = 2
            r2.readContents(r0)
        Ld:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            int r0 = r0.frameCount
            r1 = 1
            if (r0 <= r1) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.gifdecoder.GifHeader parseHeader() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.rawData
            if (r0 == 0) goto L25
            boolean r0 = r2.err()
            if (r0 == 0) goto Ld
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            return r0
        Ld:
            r2.readHeader()
            boolean r0 = r2.err()
            if (r0 != 0) goto L22
            r2.readContents()
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            int r1 = r0.frameCount
            if (r1 >= 0) goto L22
            r1 = 1
            r0.status = r1
        L22:
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setData() before parseHeader()"
            r0.<init>(r1)
            throw r0
    }

    public com.bumptech.glide.gifdecoder.GifHeaderParser setData(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
            r1 = this;
            r1.reset()
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r1.rawData = r2
            r0 = 0
            r2.position(r0)
            java.nio.ByteBuffer r2 = r1.rawData
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return r1
    }

    public com.bumptech.glide.gifdecoder.GifHeaderParser setData(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r1.setData(r2)
            goto L12
        La:
            r2 = 0
            r1.rawData = r2
            com.bumptech.glide.gifdecoder.GifHeader r2 = r1.header
            r0 = 2
            r2.status = r0
        L12:
            return r1
    }
}
