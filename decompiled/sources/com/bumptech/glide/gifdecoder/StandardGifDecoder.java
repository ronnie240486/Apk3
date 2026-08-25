package com.bumptech.glide.gifdecoder;

/* JADX INFO: loaded from: classes2.dex */
public class StandardGifDecoder implements com.bumptech.glide.gifdecoder.GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;

    @androidx.annotation.ColorInt
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final java.lang.String TAG = "StandardGifDecoder";

    @androidx.annotation.ColorInt
    private int[] act;

    @androidx.annotation.NonNull
    private android.graphics.Bitmap.Config bitmapConfig;
    private final com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private com.bumptech.glide.gifdecoder.GifHeader header;

    @androidx.annotation.Nullable
    private java.lang.Boolean isFirstFrameTransparent;
    private byte[] mainPixels;

    @androidx.annotation.ColorInt
    private int[] mainScratch;
    private com.bumptech.glide.gifdecoder.GifHeaderParser parser;

    @androidx.annotation.ColorInt
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private android.graphics.Bitmap previousImage;
    private java.nio.ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider r2) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1.pct = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.bitmapConfig = r0
            r1.bitmapProvider = r2
            com.bumptech.glide.gifdecoder.GifHeader r2 = new com.bumptech.glide.gifdecoder.GifHeader
            r2.<init>()
            r1.header = r2
            return
    }

    public StandardGifDecoder(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider r2, com.bumptech.glide.gifdecoder.GifHeader r3, java.nio.ByteBuffer r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public StandardGifDecoder(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider r1, com.bumptech.glide.gifdecoder.GifHeader r2, java.nio.ByteBuffer r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.setData(r2, r3, r4)
            return
    }

    @androidx.annotation.ColorInt
    private int averageColorsNear(int r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            r1 = r10
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L7:
            int r7 = r9.sampleSize
            int r7 = r7 + r10
            if (r1 >= r7) goto L34
            byte[] r7 = r9.mainPixels
            int r8 = r7.length
            if (r1 >= r8) goto L34
            if (r1 >= r11) goto L34
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int[] r8 = r9.act
            r7 = r8[r7]
            if (r7 == 0) goto L31
            int r8 = r7 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r8
            int r8 = r7 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r8
            int r8 = r7 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r7
            int r6 = r6 + 1
        L31:
            int r1 = r1 + 1
            goto L7
        L34:
            int r10 = r10 + r12
            r12 = r10
        L36:
            int r1 = r9.sampleSize
            int r1 = r1 + r10
            if (r12 >= r1) goto L63
            byte[] r1 = r9.mainPixels
            int r7 = r1.length
            if (r12 >= r7) goto L63
            if (r12 >= r11) goto L63
            r1 = r1[r12]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r7 = r9.act
            r1 = r7[r1]
            if (r1 == 0) goto L60
            int r7 = r1 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r7
            int r7 = r1 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r7
            int r7 = r1 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r7
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r1
            int r6 = r6 + 1
        L60:
            int r12 = r12 + 1
            goto L36
        L63:
            if (r6 != 0) goto L66
            return r0
        L66:
            int r2 = r2 / r6
            int r10 = r2 << 24
            int r3 = r3 / r6
            int r11 = r3 << 16
            r10 = r10 | r11
            int r4 = r4 / r6
            int r11 = r4 << 8
            r10 = r10 | r11
            int r5 = r5 / r6
            r10 = r10 | r5
            return r10
    }

    private void copyCopyIntoScratchRobust(com.bumptech.glide.gifdecoder.GifFrame r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int[] r2 = r0.mainScratch
            int r3 = r1.ih
            int r4 = r0.sampleSize
            int r3 = r3 / r4
            int r5 = r1.iy
            int r5 = r5 / r4
            int r6 = r1.iw
            int r6 = r6 / r4
            int r7 = r1.ix
            int r7 = r7 / r4
            int r8 = r0.framePointer
            if (r8 != 0) goto L1a
            r8 = 1
            goto L1b
        L1a:
            r8 = 0
        L1b:
            int r11 = r0.downsampledWidth
            int r12 = r0.downsampledHeight
            byte[] r13 = r0.mainPixels
            int[] r14 = r0.act
            java.lang.Boolean r15 = r0.isFirstFrameTransparent
            r16 = 8
            r9 = 0
            r10 = 0
            r18 = 1
        L2b:
            if (r9 >= r3) goto Ld8
            r19 = r15
            boolean r15 = r1.interlace
            if (r15 == 0) goto L5c
            r15 = 2
            if (r10 < r3) goto L57
            r21 = r3
            int r3 = r18 + 1
            if (r3 == r15) goto L52
            r15 = 3
            if (r3 == r15) goto L4b
            r15 = 4
            if (r3 == r15) goto L45
            r18 = r3
            goto L59
        L45:
            r18 = r3
            r10 = 1
            r16 = 2
            goto L59
        L4b:
            r15 = 4
            r18 = r3
            r10 = 2
            r16 = 4
            goto L59
        L52:
            r15 = 4
            r18 = r3
            r10 = 4
            goto L59
        L57:
            r21 = r3
        L59:
            int r3 = r10 + r16
            goto L60
        L5c:
            r21 = r3
            r3 = r10
            r10 = r9
        L60:
            int r10 = r10 + r5
            r15 = 1
            if (r4 != r15) goto L67
            r17 = 1
            goto L69
        L67:
            r17 = 0
        L69:
            if (r10 >= r12) goto Lc4
            int r10 = r10 * r11
            int r20 = r10 + r7
            int r15 = r20 + r6
            int r10 = r10 + r11
            if (r10 >= r15) goto L75
            r15 = r10
        L75:
            int r10 = r9 * r4
            r22 = r3
            int r3 = r1.iw
            int r10 = r10 * r3
            if (r17 == 0) goto L9e
            r3 = r20
        L81:
            if (r3 >= r15) goto Lc6
            r17 = r5
            r5 = r13[r10]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r14[r5]
            if (r5 == 0) goto L90
            r2[r3] = r5
            goto L98
        L90:
            if (r8 == 0) goto L98
            if (r19 != 0) goto L98
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r19 = r5
        L98:
            int r10 = r10 + r4
            int r3 = r3 + 1
            r5 = r17
            goto L81
        L9e:
            r17 = r5
            int r3 = r15 - r20
            int r3 = r3 * r4
            int r3 = r3 + r10
            r5 = r20
        La7:
            r20 = r6
            if (r5 >= r15) goto Lca
            int r6 = r1.iw
            int r6 = r0.averageColorsNear(r10, r3, r6)
            if (r6 == 0) goto Lb6
            r2[r5] = r6
            goto Lbe
        Lb6:
            if (r8 == 0) goto Lbe
            if (r19 != 0) goto Lbe
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r19 = r6
        Lbe:
            int r10 = r10 + r4
            int r5 = r5 + 1
            r6 = r20
            goto La7
        Lc4:
            r22 = r3
        Lc6:
            r17 = r5
            r20 = r6
        Lca:
            r15 = r19
            int r9 = r9 + 1
            r5 = r17
            r6 = r20
            r3 = r21
            r10 = r22
            goto L2b
        Ld8:
            r19 = r15
            java.lang.Boolean r1 = r0.isFirstFrameTransparent
            if (r1 != 0) goto Lec
            if (r19 != 0) goto Le2
            r9 = 0
            goto Le6
        Le2:
            boolean r9 = r19.booleanValue()
        Le6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0.isFirstFrameTransparent = r1
        Lec:
            return
    }

    private void copyIntoScratchFast(com.bumptech.glide.gifdecoder.GifFrame r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int[] r2 = r0.mainScratch
            int r3 = r1.ih
            int r4 = r1.iy
            int r5 = r1.iw
            int r6 = r1.ix
            int r7 = r0.framePointer
            if (r7 != 0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            int r10 = r0.downsampledWidth
            byte[] r11 = r0.mainPixels
            int[] r12 = r0.act
            r14 = 0
            r15 = -1
        L1d:
            if (r14 >= r3) goto L54
            int r16 = r14 + r4
            int r16 = r16 * r10
            int r17 = r16 + r6
            int r8 = r17 + r5
            int r9 = r16 + r10
            if (r9 >= r8) goto L2c
            r8 = r9
        L2c:
            int r9 = r1.iw
            int r9 = r9 * r14
            r13 = r17
        L32:
            if (r13 >= r8) goto L4d
            r1 = r11[r9]
            r17 = r3
            r3 = r1 & 255(0xff, float:3.57E-43)
            if (r3 == r15) goto L44
            r3 = r12[r3]
            if (r3 == 0) goto L43
            r2[r13] = r3
            goto L44
        L43:
            r15 = r1
        L44:
            int r9 = r9 + 1
            int r13 = r13 + 1
            r1 = r19
            r3 = r17
            goto L32
        L4d:
            r17 = r3
            int r14 = r14 + 1
            r1 = r19
            goto L1d
        L54:
            java.lang.Boolean r1 = r0.isFirstFrameTransparent
            if (r1 == 0) goto L5e
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L67
        L5e:
            java.lang.Boolean r1 = r0.isFirstFrameTransparent
            if (r1 != 0) goto L69
            if (r7 == 0) goto L69
            r1 = -1
            if (r15 == r1) goto L69
        L67:
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0.isFirstFrameTransparent = r1
            return
    }

    private void decodeBitmapData(com.bumptech.glide.gifdecoder.GifFrame r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto Ld
            java.nio.ByteBuffer r2 = r0.rawData
            int r3 = r1.bufferFrameStart
            r2.position(r3)
        Ld:
            if (r1 != 0) goto L16
            com.bumptech.glide.gifdecoder.GifHeader r1 = r0.header
            int r2 = r1.width
            int r1 = r1.height
            goto L1a
        L16:
            int r2 = r1.iw
            int r1 = r1.ih
        L1a:
            int r2 = r2 * r1
            byte[] r1 = r0.mainPixels
            if (r1 == 0) goto L23
            int r1 = r1.length
            if (r1 >= r2) goto L2b
        L23:
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r1 = r0.bitmapProvider
            byte[] r1 = r1.obtainByteArray(r2)
            r0.mainPixels = r1
        L2b:
            byte[] r1 = r0.mainPixels
            short[] r3 = r0.prefix
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L37
            short[] r3 = new short[r4]
            r0.prefix = r3
        L37:
            short[] r3 = r0.prefix
            byte[] r5 = r0.suffix
            if (r5 != 0) goto L41
            byte[] r5 = new byte[r4]
            r0.suffix = r5
        L41:
            byte[] r5 = r0.suffix
            byte[] r6 = r0.pixelStack
            if (r6 != 0) goto L4d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.pixelStack = r6
        L4d:
            byte[] r6 = r0.pixelStack
            int r7 = r28.readByte()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L60:
            if (r14 >= r9) goto L6a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L60
        L6a:
            byte[] r14 = r0.block
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L83:
            if (r13 >= r2) goto L14c
            if (r16 != 0) goto L94
            int r16 = r28.readBlock()
            if (r16 > 0) goto L92
            r3 = 3
            r0.status = r3
            goto L14c
        L92:
            r17 = 0
        L94:
            r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + (-1)
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        Lae:
            if (r4 < r15) goto L136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto Lc2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto Lae
        Lc2:
            if (r11 != r10) goto Ld9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L83
        Ld9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto Led
            r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto Lae
        Led:
            if (r11 < r8) goto Lf6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto Lf7
        Lf6:
            r7 = r11
        Lf7:
            if (r7 < r9) goto L102
            r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto Lf7
        L102:
            r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L116
            int r26 = r26 + (-1)
            r27 = r6[r26]
            r1[r20] = r27
            goto L109
        L116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L12d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L12d
            if (r8 >= r6) goto L12d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L12d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto Lae
        L136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L83
        L14c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.gifdecoder.GifHeaderParser getHeaderParser() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r1.parser
            if (r0 != 0) goto Lb
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = new com.bumptech.glide.gifdecoder.GifHeaderParser
            r0.<init>()
            r1.parser = r0
        Lb:
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r1.parser
            return r0
    }

    private android.graphics.Bitmap getNextBitmap() {
            r4 = this;
            java.lang.Boolean r0 = r4.isFirstFrameTransparent
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            android.graphics.Bitmap$Config r0 = r4.bitmapConfig
            goto L10
        Le:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L10:
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r1 = r4.bitmapProvider
            int r2 = r4.downsampledWidth
            int r3 = r4.downsampledHeight
            android.graphics.Bitmap r0 = r1.obtain(r2, r3, r0)
            r1 = 1
            r0.setHasAlpha(r1)
            return r0
    }

    private int readBlock() {
            r5 = this;
            int r0 = r5.readByte()
            if (r0 > 0) goto L7
            return r0
        L7:
            java.nio.ByteBuffer r1 = r5.rawData
            byte[] r2 = r5.block
            r3 = 0
            int r4 = r1.remaining()
            int r4 = java.lang.Math.min(r0, r4)
            r1.get(r2, r3, r4)
            return r0
    }

    private int readByte() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.rawData
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private android.graphics.Bitmap setPixels(com.bumptech.glide.gifdecoder.GifFrame r10, com.bumptech.glide.gifdecoder.GifFrame r11) {
            r9 = this;
            int[] r8 = r9.mainScratch
            r0 = 0
            if (r11 != 0) goto L14
            android.graphics.Bitmap r1 = r9.previousImage
            if (r1 == 0) goto Le
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r9.bitmapProvider
            r2.release(r1)
        Le:
            r1 = 0
            r9.previousImage = r1
            java.util.Arrays.fill(r8, r0)
        L14:
            r1 = 3
            if (r11 == 0) goto L22
            int r2 = r11.dispose
            if (r2 != r1) goto L22
            android.graphics.Bitmap r2 = r9.previousImage
            if (r2 != 0) goto L22
            java.util.Arrays.fill(r8, r0)
        L22:
            if (r11 == 0) goto L77
            int r2 = r11.dispose
            if (r2 <= 0) goto L77
            r3 = 2
            if (r2 != r3) goto L65
            boolean r1 = r10.transparency
            if (r1 != 0) goto L3f
            com.bumptech.glide.gifdecoder.GifHeader r1 = r9.header
            int r2 = r1.bgColor
            int[] r3 = r10.lct
            if (r3 == 0) goto L3e
            int r1 = r1.bgIndex
            int r3 = r10.transIndex
            if (r1 != r3) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            int r1 = r11.ih
            int r2 = r9.sampleSize
            int r1 = r1 / r2
            int r3 = r11.iy
            int r3 = r3 / r2
            int r4 = r11.iw
            int r4 = r4 / r2
            int r11 = r11.ix
            int r11 = r11 / r2
            int r2 = r9.downsampledWidth
            int r3 = r3 * r2
            int r3 = r3 + r11
            int r1 = r1 * r2
            int r1 = r1 + r3
        L55:
            if (r3 >= r1) goto L77
            int r11 = r3 + r4
            r2 = r3
        L5a:
            if (r2 >= r11) goto L61
            r8[r2] = r0
            int r2 = r2 + 1
            goto L5a
        L61:
            int r11 = r9.downsampledWidth
            int r3 = r3 + r11
            goto L55
        L65:
            if (r2 != r1) goto L77
            android.graphics.Bitmap r0 = r9.previousImage
            if (r0 == 0) goto L77
            r2 = 0
            int r6 = r9.downsampledWidth
            r4 = 0
            r5 = 0
            int r7 = r9.downsampledHeight
            r1 = r8
            r3 = r6
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
        L77:
            r9.decodeBitmapData(r10)
            boolean r11 = r10.interlace
            r0 = 1
            if (r11 != 0) goto L88
            int r11 = r9.sampleSize
            if (r11 == r0) goto L84
            goto L88
        L84:
            r9.copyIntoScratchFast(r10)
            goto L8b
        L88:
            r9.copyCopyIntoScratchRobust(r10)
        L8b:
            boolean r11 = r9.savePrevious
            if (r11 == 0) goto Lad
            int r10 = r10.dispose
            if (r10 == 0) goto L95
            if (r10 != r0) goto Lad
        L95:
            android.graphics.Bitmap r10 = r9.previousImage
            if (r10 != 0) goto L9f
            android.graphics.Bitmap r10 = r9.getNextBitmap()
            r9.previousImage = r10
        L9f:
            android.graphics.Bitmap r0 = r9.previousImage
            r2 = 0
            int r6 = r9.downsampledWidth
            r4 = 0
            r5 = 0
            int r7 = r9.downsampledHeight
            r1 = r8
            r3 = r6
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
        Lad:
            android.graphics.Bitmap r10 = r9.getNextBitmap()
            r2 = 0
            int r6 = r9.downsampledWidth
            r4 = 0
            r5 = 0
            int r7 = r9.downsampledHeight
            r0 = r10
            r1 = r8
            r3 = r6
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
            return r10
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
            r2 = this;
            int r0 = r2.framePointer
            int r0 = r0 + 1
            com.bumptech.glide.gifdecoder.GifHeader r1 = r2.header
            int r1 = r1.frameCount
            int r0 = r0 % r1
            r2.framePointer = r0
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
            r3 = this;
            r0 = 0
            r3.header = r0
            byte[] r1 = r3.mainPixels
            if (r1 == 0) goto Lc
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r3.bitmapProvider
            r2.release(r1)
        Lc:
            int[] r1 = r3.mainScratch
            if (r1 == 0) goto L15
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r3.bitmapProvider
            r2.release(r1)
        L15:
            android.graphics.Bitmap r1 = r3.previousImage
            if (r1 == 0) goto L1e
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r3.bitmapProvider
            r2.release(r1)
        L1e:
            r3.previousImage = r0
            r3.rawData = r0
            r3.isFirstFrameTransparent = r0
            byte[] r0 = r3.block
            if (r0 == 0) goto L2d
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r1 = r3.bitmapProvider
            r1.release(r0)
        L2d:
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.rawData
            int r0 = r0.limit()
            byte[] r1 = r2.mainPixels
            int r1 = r1.length
            int r0 = r0 + r1
            int[] r1 = r2.mainScratch
            int r1 = r1.length
            int r1 = r1 * 4
            int r1 = r1 + r0
            return r1
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
            r1 = this;
            int r0 = r1.framePointer
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @androidx.annotation.NonNull
    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.rawData
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            int r1 = r0.frameCount
            if (r3 >= r1) goto L13
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r0 = r0.frames
            java.lang.Object r3 = r0.get(r3)
            com.bumptech.glide.gifdecoder.GifFrame r3 = (com.bumptech.glide.gifdecoder.GifFrame) r3
            int r3 = r3.delay
            goto L14
        L13:
            r3 = -1
        L14:
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.frameCount
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.height
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @java.lang.Deprecated
    public int getLoopCount() {
            r2 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r2.header
            int r0 = r0.loopCount
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 1
        L8:
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.loopCount
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.frameCount
            if (r0 <= 0) goto L10
            int r0 = r1.framePointer
            if (r0 >= 0) goto Lb
            goto L10
        Lb:
            int r0 = r1.getDelay(r0)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @androidx.annotation.Nullable
    public synchronized android.graphics.Bitmap getNextFrame() {
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.gifdecoder.GifHeader r0 = r8.header     // Catch: java.lang.Throwable -> Le4
            int r0 = r0.frameCount     // Catch: java.lang.Throwable -> Le4
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto Ld
            int r0 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            if (r0 >= 0) goto L39
        Ld:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.StandardGifDecoder.TAG     // Catch: java.lang.Throwable -> Le4
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le4
            if (r3 == 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            r3.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            com.bumptech.glide.gifdecoder.GifHeader r4 = r8.header     // Catch: java.lang.Throwable -> Le4
            int r4 = r4.frameCount     // Catch: java.lang.Throwable -> Le4
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            int r4 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le4
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Le4
        L37:
            r8.status = r2     // Catch: java.lang.Throwable -> Le4
        L39:
            int r0 = r8.status     // Catch: java.lang.Throwable -> Le4
            r3 = 0
            if (r0 == r2) goto Lc4
            r4 = 2
            if (r0 != r4) goto L43
            goto Lc4
        L43:
            r0 = 0
            r8.status = r0     // Catch: java.lang.Throwable -> Le4
            byte[] r5 = r8.block     // Catch: java.lang.Throwable -> Le4
            if (r5 != 0) goto L54
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r5 = r8.bitmapProvider     // Catch: java.lang.Throwable -> Le4
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.obtainByteArray(r6)     // Catch: java.lang.Throwable -> Le4
            r8.block = r5     // Catch: java.lang.Throwable -> Le4
        L54:
            com.bumptech.glide.gifdecoder.GifHeader r5 = r8.header     // Catch: java.lang.Throwable -> Le4
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r5 = r5.frames     // Catch: java.lang.Throwable -> Le4
            int r6 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Le4
            com.bumptech.glide.gifdecoder.GifFrame r5 = (com.bumptech.glide.gifdecoder.GifFrame) r5     // Catch: java.lang.Throwable -> Le4
            int r6 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            int r6 = r6 - r2
            if (r6 < 0) goto L70
            com.bumptech.glide.gifdecoder.GifHeader r7 = r8.header     // Catch: java.lang.Throwable -> Le4
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r7 = r7.frames     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Le4
            com.bumptech.glide.gifdecoder.GifFrame r6 = (com.bumptech.glide.gifdecoder.GifFrame) r6     // Catch: java.lang.Throwable -> Le4
            goto L71
        L70:
            r6 = r3
        L71:
            int[] r7 = r5.lct     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto L76
            goto L7a
        L76:
            com.bumptech.glide.gifdecoder.GifHeader r7 = r8.header     // Catch: java.lang.Throwable -> Le4
            int[] r7 = r7.gct     // Catch: java.lang.Throwable -> Le4
        L7a:
            r8.act = r7     // Catch: java.lang.Throwable -> Le4
            if (r7 != 0) goto La0
            java.lang.String r0 = com.bumptech.glide.gifdecoder.StandardGifDecoder.TAG     // Catch: java.lang.Throwable -> Le4
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L9c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            r1.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch: java.lang.Throwable -> Le4
            int r4 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            r1.append(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le4
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Le4
        L9c:
            r8.status = r2     // Catch: java.lang.Throwable -> Le4
            monitor-exit(r8)
            return r3
        La0:
            boolean r1 = r5.transparency     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto Lbe
            int[] r1 = r8.pct     // Catch: java.lang.Throwable -> Le4
            int r2 = r7.length     // Catch: java.lang.Throwable -> Le4
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Le4
            int[] r1 = r8.pct     // Catch: java.lang.Throwable -> Le4
            r8.act = r1     // Catch: java.lang.Throwable -> Le4
            int r2 = r5.transIndex     // Catch: java.lang.Throwable -> Le4
            r1[r2] = r0     // Catch: java.lang.Throwable -> Le4
            int r0 = r5.dispose     // Catch: java.lang.Throwable -> Le4
            if (r0 != r4) goto Lbe
            int r0 = r8.framePointer     // Catch: java.lang.Throwable -> Le4
            if (r0 != 0) goto Lbe
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le4
            r8.isFirstFrameTransparent = r0     // Catch: java.lang.Throwable -> Le4
        Lbe:
            android.graphics.Bitmap r0 = r8.setPixels(r5, r6)     // Catch: java.lang.Throwable -> Le4
            monitor-exit(r8)
            return r0
        Lc4:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.StandardGifDecoder.TAG     // Catch: java.lang.Throwable -> Le4
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            r1.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch: java.lang.Throwable -> Le4
            int r2 = r8.status     // Catch: java.lang.Throwable -> Le4
            r1.append(r2)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le4
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Le4
        Le2:
            monitor-exit(r8)
            return r3
        Le4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
            r1 = this;
            int r0 = r1.status
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
            r3 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r3.header
            int r0 = r0.loopCount
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L9
            return r1
        L9:
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            int r0 = r0 + r1
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifHeader r0 = r1.header
            int r0 = r0.width
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@androidx.annotation.Nullable java.io.InputStream r6, int r7) {
            r5 = this;
            if (r6 == 0) goto L32
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r7 <= 0) goto L9
            int r7 = r7 + 4096
            goto Lb
        L9:
            r7 = 16384(0x4000, float:2.2959E-41)
        Lb:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L29
            r1.<init>(r7)     // Catch: java.io.IOException -> L29
            byte[] r7 = new byte[r0]     // Catch: java.io.IOException -> L29
        L12:
            r2 = 0
            int r3 = r6.read(r7, r2, r0)     // Catch: java.io.IOException -> L29
            r4 = -1
            if (r3 == r4) goto L1e
            r1.write(r7, r2, r3)     // Catch: java.io.IOException -> L29
            goto L12
        L1e:
            r1.flush()     // Catch: java.io.IOException -> L29
            byte[] r7 = r1.toByteArray()     // Catch: java.io.IOException -> L29
            r5.read(r7)     // Catch: java.io.IOException -> L29
            goto L35
        L29:
            r7 = move-exception
            java.lang.String r0 = com.bumptech.glide.gifdecoder.StandardGifDecoder.TAG
            java.lang.String r1 = "Error reading data from stream"
            android.util.Log.w(r0, r1, r7)
            goto L35
        L32:
            r7 = 2
            r5.status = r7
        L35:
            if (r6 == 0) goto L43
            r6.close()     // Catch: java.io.IOException -> L3b
            goto L43
        L3b:
            r6 = move-exception
            java.lang.String r7 = com.bumptech.glide.gifdecoder.StandardGifDecoder.TAG
            java.lang.String r0 = "Error closing stream"
            android.util.Log.w(r7, r0, r6)
        L43:
            int r6 = r5.status
            return r6
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r1.getHeaderParser()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r0.setData(r2)     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.gifdecoder.GifHeader r0 = r0.parseHeader()     // Catch: java.lang.Throwable -> L18
            r1.header = r0     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L14
            r1.setData(r0, r2)     // Catch: java.lang.Throwable -> L18
        L14:
            int r2 = r1.status     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return r2
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
            r1 = this;
            r0 = -1
            r1.framePointer = r0
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r2, @androidx.annotation.NonNull java.nio.ByteBuffer r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.setData(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5) {
            r2 = this;
            monitor-enter(r2)
            if (r5 <= 0) goto L63
            int r5 = java.lang.Integer.highestOneBit(r5)     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            r2.status = r0     // Catch: java.lang.Throwable -> L7a
            r2.header = r3     // Catch: java.lang.Throwable -> L7a
            r1 = -1
            r2.framePointer = r1     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L7a
            r2.rawData = r4     // Catch: java.lang.Throwable -> L7a
            r4.position(r0)     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteBuffer r4 = r2.rawData     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L7a
            r4.order(r1)     // Catch: java.lang.Throwable -> L7a
            r2.savePrevious = r0     // Catch: java.lang.Throwable -> L7a
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r4 = r3.frames     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L7a
        L27:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.gifdecoder.GifFrame r0 = (com.bumptech.glide.gifdecoder.GifFrame) r0     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.dispose     // Catch: java.lang.Throwable -> L7a
            r1 = 3
            if (r0 != r1) goto L27
            r4 = 1
            r2.savePrevious = r4     // Catch: java.lang.Throwable -> L7a
        L3b:
            r2.sampleSize = r5     // Catch: java.lang.Throwable -> L7a
            int r4 = r3.width     // Catch: java.lang.Throwable -> L7a
            int r0 = r4 / r5
            r2.downsampledWidth = r0     // Catch: java.lang.Throwable -> L7a
            int r3 = r3.height     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 / r5
            r2.downsampledHeight = r5     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r5 = r2.bitmapProvider     // Catch: java.lang.Throwable -> L7a
            int r4 = r4 * r3
            byte[] r3 = r5.obtainByteArray(r4)     // Catch: java.lang.Throwable -> L7a
            r2.mainPixels = r3     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r3 = r2.bitmapProvider     // Catch: java.lang.Throwable -> L7a
            int r4 = r2.downsampledWidth     // Catch: java.lang.Throwable -> L7a
            int r5 = r2.downsampledHeight     // Catch: java.lang.Throwable -> L7a
            int r4 = r4 * r5
            int[] r3 = r3.obtainIntArray(r4)     // Catch: java.lang.Throwable -> L7a
            r2.mainScratch = r3     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)
            return
        L63:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "Sample size must be >=0, not: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L7a
            r4.append(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L7a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifHeader r1, @androidx.annotation.NonNull byte[] r2) {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.lang.Throwable -> La
            r0.setData(r1, r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@androidx.annotation.NonNull android.graphics.Bitmap.Config r4) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r4 == r0) goto L34
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            if (r4 != r0) goto L9
            goto L34
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported format: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", must be one of "
            r1.append(r4)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            r1.append(r4)
            java.lang.String r4 = " or "
            r1.append(r4)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            r3.bitmapConfig = r4
            return
    }
}
