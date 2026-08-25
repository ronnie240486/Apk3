package com.google.android.exoplayer2.text.pgs;

/* JADX INFO: loaded from: classes.dex */
public final class PgsDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final com.google.android.exoplayer2.util.ParsableByteArray buffer;
    private final com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder cueBuilder;
    private final com.google.android.exoplayer2.util.ParsableByteArray inflatedBuffer;

    @androidx.annotation.Nullable
    private java.util.zip.Inflater inflater;

    public static final class CueBuilder {
        private final com.google.android.exoplayer2.util.ParsableByteArray bitmapData;
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private final int[] colors;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;

        public CueBuilder() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
                r0.<init>()
                r1.bitmapData = r0
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r1.colors = r0
                return
        }

        public static /* synthetic */ void access$000(com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder r0, com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0.parsePaletteSection(r1, r2)
                return
        }

        public static /* synthetic */ void access$100(com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder r0, com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0.parseBitmapSection(r1, r2)
                return
        }

        public static /* synthetic */ void access$200(com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder r0, com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0.parseIdentifierSection(r1, r2)
                return
        }

        private void parseBitmapSection(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
                r3 = this;
                r0 = 4
                if (r5 >= r0) goto L4
                return
            L4:
                r1 = 3
                r4.skipBytes(r1)
                int r1 = r4.readUnsignedByte()
                r1 = r1 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                int r5 = r5 + (-4)
                if (r1 == 0) goto L36
                r1 = 7
                if (r5 >= r1) goto L1b
                return
            L1b:
                int r1 = r4.readUnsignedInt24()
                if (r1 >= r0) goto L22
                return
            L22:
                int r2 = r4.readUnsignedShort()
                r3.bitmapWidth = r2
                int r2 = r4.readUnsignedShort()
                r3.bitmapHeight = r2
                com.google.android.exoplayer2.util.ParsableByteArray r2 = r3.bitmapData
                int r1 = r1 - r0
                r2.reset(r1)
                int r5 = r5 + (-7)
            L36:
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.bitmapData
                int r0 = r0.getPosition()
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r3.bitmapData
                int r1 = r1.limit()
                if (r0 >= r1) goto L5a
                if (r5 <= 0) goto L5a
                int r1 = r1 - r0
                int r5 = java.lang.Math.min(r5, r1)
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r3.bitmapData
                byte[] r1 = r1.getData()
                r4.readBytes(r1, r0, r5)
                com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.bitmapData
                int r0 = r0 + r5
                r4.setPosition(r0)
            L5a:
                return
        }

        private void parseIdentifierSection(com.google.android.exoplayer2.util.ParsableByteArray r2, int r3) {
                r1 = this;
                r0 = 19
                if (r3 >= r0) goto L5
                return
            L5:
                int r3 = r2.readUnsignedShort()
                r1.planeWidth = r3
                int r3 = r2.readUnsignedShort()
                r1.planeHeight = r3
                r3 = 11
                r2.skipBytes(r3)
                int r3 = r2.readUnsignedShort()
                r1.bitmapX = r3
                int r2 = r2.readUnsignedShort()
                r1.bitmapY = r2
                return
        }

        private void parsePaletteSection(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19) {
                r17 = this;
                r0 = r17
                int r1 = r19 % 5
                r2 = 2
                if (r1 == r2) goto L8
                return
            L8:
                r1 = r18
                r1.skipBytes(r2)
                int[] r2 = r0.colors
                r3 = 0
                java.util.Arrays.fill(r2, r3)
                int r2 = r19 / 5
                r4 = 0
            L16:
                if (r4 >= r2) goto L79
                int r5 = r18.readUnsignedByte()
                int r6 = r18.readUnsignedByte()
                int r7 = r18.readUnsignedByte()
                int r8 = r18.readUnsignedByte()
                int r9 = r18.readUnsignedByte()
                double r10 = (double) r6
                r12 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
                int r7 = r7 + (-128)
                double r6 = (double) r7
                double r12 = r12 * r6
                double r12 = r12 + r10
                int r12 = (int) r12
                r13 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
                int r8 = r8 + (-128)
                r19 = r4
                double r3 = (double) r8
                double r13 = r13 * r3
                double r13 = r10 - r13
                r15 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
                double r6 = r6 * r15
                double r13 = r13 - r6
                int r6 = (int) r13
                r7 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
                double r3 = r3 * r7
                double r3 = r3 + r10
                int r3 = (int) r3
                int[] r4 = r0.colors
                int r7 = r9 << 24
                r8 = 255(0xff, float:3.57E-43)
                r9 = 0
                int r10 = com.google.android.exoplayer2.util.Util.constrainValue(r12, r9, r8)
                int r10 = r10 << 16
                r7 = r7 | r10
                int r6 = com.google.android.exoplayer2.util.Util.constrainValue(r6, r9, r8)
                int r6 = r6 << 8
                r6 = r6 | r7
                int r3 = com.google.android.exoplayer2.util.Util.constrainValue(r3, r9, r8)
                r3 = r3 | r6
                r4[r5] = r3
                int r4 = r19 + 1
                r3 = 0
                goto L16
            L79:
                r1 = 1
                r0.colorsSet = r1
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.text.Cue build() {
                r7 = this;
                int r0 = r7.planeWidth
                if (r0 == 0) goto Lca
                int r0 = r7.planeHeight
                if (r0 == 0) goto Lca
                int r0 = r7.bitmapWidth
                if (r0 == 0) goto Lca
                int r0 = r7.bitmapHeight
                if (r0 == 0) goto Lca
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.bitmapData
                int r0 = r0.limit()
                if (r0 == 0) goto Lca
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.bitmapData
                int r0 = r0.getPosition()
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.bitmapData
                int r1 = r1.limit()
                if (r0 != r1) goto Lca
                boolean r0 = r7.colorsSet
                if (r0 != 0) goto L2c
                goto Lca
            L2c:
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.bitmapData
                r1 = 0
                r0.setPosition(r1)
                int r0 = r7.bitmapWidth
                int r2 = r7.bitmapHeight
                int r0 = r0 * r2
                int[] r2 = new int[r0]
                r3 = 0
            L3b:
                if (r3 >= r0) goto L7e
                com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.bitmapData
                int r4 = r4.readUnsignedByte()
                if (r4 == 0) goto L4f
                int r5 = r3 + 1
                int[] r6 = r7.colors
                r4 = r6[r4]
                r2[r3] = r4
            L4d:
                r3 = r5
                goto L3b
            L4f:
                com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.bitmapData
                int r4 = r4.readUnsignedByte()
                if (r4 == 0) goto L3b
                r5 = r4 & 64
                if (r5 != 0) goto L5e
                r5 = r4 & 63
                goto L69
            L5e:
                r5 = r4 & 63
                int r5 = r5 << 8
                com.google.android.exoplayer2.util.ParsableByteArray r6 = r7.bitmapData
                int r6 = r6.readUnsignedByte()
                r5 = r5 | r6
            L69:
                r4 = r4 & 128(0x80, float:1.8E-43)
                if (r4 != 0) goto L6f
                r4 = 0
                goto L79
            L6f:
                int[] r4 = r7.colors
                com.google.android.exoplayer2.util.ParsableByteArray r6 = r7.bitmapData
                int r6 = r6.readUnsignedByte()
                r4 = r4[r6]
            L79:
                int r5 = r5 + r3
                java.util.Arrays.fill(r2, r3, r5, r4)
                goto L4d
            L7e:
                int r0 = r7.bitmapWidth
                int r3 = r7.bitmapHeight
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r0, r3, r4)
                com.google.android.exoplayer2.text.Cue$Builder r2 = new com.google.android.exoplayer2.text.Cue$Builder
                r2.<init>()
                com.google.android.exoplayer2.text.Cue$Builder r0 = r2.setBitmap(r0)
                int r2 = r7.bitmapX
                float r2 = (float) r2
                int r3 = r7.planeWidth
                float r3 = (float) r3
                float r2 = r2 / r3
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPosition(r2)
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPositionAnchor(r1)
                int r2 = r7.bitmapY
                float r2 = (float) r2
                int r3 = r7.planeHeight
                float r3 = (float) r3
                float r2 = r2 / r3
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setLine(r2, r1)
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setLineAnchor(r1)
                int r1 = r7.bitmapWidth
                float r1 = (float) r1
                int r2 = r7.planeWidth
                float r2 = (float) r2
                float r1 = r1 / r2
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setSize(r1)
                int r1 = r7.bitmapHeight
                float r1 = (float) r1
                int r2 = r7.planeHeight
                float r2 = (float) r2
                float r1 = r1 / r2
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setBitmapHeight(r1)
                com.google.android.exoplayer2.text.Cue r0 = r0.build()
                return r0
            Lca:
                r0 = 0
                return r0
        }

        public void reset() {
                r2 = this;
                r0 = 0
                r2.planeWidth = r0
                r2.planeHeight = r0
                r2.bitmapX = r0
                r2.bitmapY = r0
                r2.bitmapWidth = r0
                r2.bitmapHeight = r0
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.bitmapData
                r1.reset(r0)
                r2.colorsSet = r0
                return
        }
    }

    public PgsDecoder() {
            r1 = this;
            java.lang.String r0 = "PgsDecoder"
            r1.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.buffer = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.inflatedBuffer = r0
            com.google.android.exoplayer2.text.pgs.PgsDecoder$CueBuilder r0 = new com.google.android.exoplayer2.text.pgs.PgsDecoder$CueBuilder
            r0.<init>()
            r1.cueBuilder = r0
            return
    }

    private void maybeInflateData(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
            int r0 = r3.bytesLeft()
            if (r0 <= 0) goto L32
            int r0 = r3.peekUnsignedByte()
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L32
            java.util.zip.Inflater r0 = r2.inflater
            if (r0 != 0) goto L19
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r2.inflater = r0
        L19:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.inflatedBuffer
            java.util.zip.Inflater r1 = r2.inflater
            boolean r0 = com.google.android.exoplayer2.util.Util.inflate(r3, r0, r1)
            if (r0 == 0) goto L32
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.inflatedBuffer
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.inflatedBuffer
            int r1 = r1.limit()
            r3.reset(r0, r1)
        L32:
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.Cue readNextSection(com.google.android.exoplayer2.util.ParsableByteArray r5, com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder r6) {
            int r0 = r5.limit()
            int r1 = r5.readUnsignedByte()
            int r2 = r5.readUnsignedShort()
            int r3 = r5.getPosition()
            int r3 = r3 + r2
            r4 = 0
            if (r3 <= r0) goto L18
            r5.setPosition(r0)
            return r4
        L18:
            r0 = 128(0x80, float:1.8E-43)
            if (r1 == r0) goto L2c
            switch(r1) {
                case 20: goto L28;
                case 21: goto L24;
                case 22: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L33
        L20:
            com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder.access$200(r6, r5, r2)
            goto L33
        L24:
            com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder.access$100(r6, r5, r2)
            goto L33
        L28:
            com.google.android.exoplayer2.text.pgs.PgsDecoder.CueBuilder.access$000(r6, r5, r2)
            goto L33
        L2c:
            com.google.android.exoplayer2.text.Cue r4 = r6.build()
            r6.reset()
        L33:
            r5.setPosition(r3)
            return r4
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r1, int r2, boolean r3) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r0 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.buffer
            r3.reset(r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r0.buffer
            r0.maybeInflateData(r1)
            com.google.android.exoplayer2.text.pgs.PgsDecoder$CueBuilder r1 = r0.cueBuilder
            r1.reset()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L14:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.buffer
            int r2 = r2.bytesLeft()
            r3 = 3
            if (r2 < r3) goto L2b
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.buffer
            com.google.android.exoplayer2.text.pgs.PgsDecoder$CueBuilder r3 = r0.cueBuilder
            com.google.android.exoplayer2.text.Cue r2 = readNextSection(r2, r3)
            if (r2 == 0) goto L14
            r1.add(r2)
            goto L14
        L2b:
            com.google.android.exoplayer2.text.pgs.PgsSubtitle r2 = new com.google.android.exoplayer2.text.pgs.PgsSubtitle
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2.<init>(r1)
            return r2
    }
}
