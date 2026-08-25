package com.google.android.exoplayer2.text.dvb;

/* JADX INFO: loaded from: classes2.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final java.lang.String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = null;
    private static final byte[] defaultMap2To8 = null;
    private static final byte[] defaultMap4To8 = null;
    private android.graphics.Bitmap bitmap;
    private final android.graphics.Canvas canvas;
    private final com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition defaultClutDefinition;
    private final com.google.android.exoplayer2.text.dvb.DvbParser.DisplayDefinition defaultDisplayDefinition;
    private final android.graphics.Paint defaultPaint;
    private final android.graphics.Paint fillRegionPaint;
    private final com.google.android.exoplayer2.text.dvb.DvbParser.SubtitleService subtitleService;

    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int r1, int[] r2, int[] r3, int[] r4) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.clutEntries2Bit = r2
                r0.clutEntries4Bit = r3
                r0.clutEntries8Bit = r4
                return
        }
    }

    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.horizontalPositionMinimum = r3
                r0.horizontalPositionMaximum = r4
                r0.verticalPositionMinimum = r5
                r0.verticalPositionMaximum = r6
                return
        }
    }

    public static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int r1, boolean r2, byte[] r3, byte[] r4) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.nonModifyingColorFlag = r2
                r0.topFieldData = r3
                r0.bottomFieldData = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PageComposition {
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int r1, int r2, int r3, android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.PageRegion> r4) {
                r0 = this;
                r0.<init>()
                r0.timeOutSecs = r1
                r0.version = r2
                r0.state = r3
                r0.regions = r4
                return
        }
    }

    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.horizontalAddress = r1
                r0.verticalAddress = r2
                return
        }
    }

    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int r1, boolean r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.RegionObject> r11) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.fillFlag = r2
                r0.width = r3
                r0.height = r4
                r0.levelOfCompatibility = r5
                r0.depth = r6
                r0.clutId = r7
                r0.pixelCode8Bit = r8
                r0.pixelCode4Bit = r9
                r0.pixelCode2Bit = r10
                r0.regionObjects = r11
                return
        }

        public void mergeFrom(com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition r5) {
                r4 = this;
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject> r5 = r5.regionObjects
                r0 = 0
            L3:
                int r1 = r5.size()
                if (r0 >= r1) goto L1b
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject> r1 = r4.regionObjects
                int r2 = r5.keyAt(r0)
                java.lang.Object r3 = r5.valueAt(r0)
                com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject r3 = (com.google.android.exoplayer2.text.dvb.DvbParser.RegionObject) r3
                r1.put(r2, r3)
                int r0 = r0 + 1
                goto L3
            L1b:
                return
        }
    }

    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.provider = r2
                r0.horizontalPosition = r3
                r0.verticalPosition = r4
                r0.foregroundPixelCode = r5
                r0.backgroundPixelCode = r6
                return
        }
    }

    public static final class SubtitleService {
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition> ancillaryCluts;
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData> ancillaryObjects;
        public final int ancillaryPageId;
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition> cluts;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.text.dvb.DvbParser.DisplayDefinition displayDefinition;
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData> objects;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.text.dvb.DvbParser.PageComposition pageComposition;
        public final android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition> regions;
        public final int subtitlePageId;

        public SubtitleService(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.subtitlePageId = r1
                r0.ancillaryPageId = r2
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.regions = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.cluts = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.objects = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.ancillaryCluts = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.ancillaryObjects = r1
                return
        }

        public void reset() {
                r1 = this;
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition> r0 = r1.regions
                r0.clear()
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r0 = r1.cluts
                r0.clear()
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r0 = r1.objects
                r0.clear()
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r0 = r1.ancillaryCluts
                r0.clear()
                android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r0 = r1.ancillaryObjects
                r0.clear()
                r0 = 0
                r1.displayDefinition = r0
                r1.pageComposition = r0
                return
        }
    }

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [0, 7, 8, 15} // fill-array
            com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap2To4 = r1
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 119, -120, -1} // fill-array
            com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap2To8 = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1} // fill-array
            com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap4To8 = r0
            return
    }

    public DvbParser(int r9, int r10) {
            r8 = this;
            r8.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r8.defaultPaint = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC
            r1.<init>(r2)
            r0.setXfermode(r1)
            r1 = 0
            r0.setPathEffect(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r8.fillRegionPaint = r0
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.DST_OVER
            r2.<init>(r3)
            r0.setXfermode(r2)
            r0.setPathEffect(r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r8.canvas = r0
            com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition r0 = new com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition
            r2 = 719(0x2cf, float:1.008E-42)
            r3 = 575(0x23f, float:8.06E-43)
            r4 = 0
            r5 = 719(0x2cf, float:1.008E-42)
            r6 = 0
            r7 = 575(0x23f, float:8.06E-43)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.defaultDisplayDefinition = r0
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r0 = new com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition
            int[] r1 = generateDefault2BitClutEntries()
            int[] r2 = generateDefault4BitClutEntries()
            int[] r3 = generateDefault8BitClutEntries()
            r0.<init>(r4, r1, r2, r3)
            r8.defaultClutDefinition = r0
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r0 = new com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService
            r0.<init>(r9, r10)
            r8.subtitleService = r0
            return
    }

    private static byte[] buildClutMapTable(int r3, int r4, com.google.android.exoplayer2.util.ParsableBitArray r5) {
            byte[] r0 = new byte[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto Lf
            int r2 = r5.readBits(r4)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Lf:
            return r0
    }

    private static int[] generateDefault2BitClutEntries() {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, -1, -16777216, -8421505} // fill-array
            return r0
    }

    private static int[] generateDefault4BitClutEntries() {
            r0 = 16
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r2
            r3 = 1
        L8:
            if (r3 >= r0) goto L50
            r4 = 8
            r5 = 255(0xff, float:3.57E-43)
            if (r3 >= r4) goto L2f
            r4 = r3 & 1
            if (r4 == 0) goto L17
            r4 = 255(0xff, float:3.57E-43)
            goto L18
        L17:
            r4 = 0
        L18:
            r6 = r3 & 2
            if (r6 == 0) goto L1f
            r6 = 255(0xff, float:3.57E-43)
            goto L20
        L1f:
            r6 = 0
        L20:
            r7 = r3 & 4
            if (r7 == 0) goto L27
            r7 = 255(0xff, float:3.57E-43)
            goto L28
        L27:
            r7 = 0
        L28:
            int r4 = getColor(r5, r4, r6, r7)
            r1[r3] = r4
            goto L4d
        L2f:
            r4 = r3 & 1
            r6 = 127(0x7f, float:1.78E-43)
            if (r4 == 0) goto L38
            r4 = 127(0x7f, float:1.78E-43)
            goto L39
        L38:
            r4 = 0
        L39:
            r7 = r3 & 2
            if (r7 == 0) goto L40
            r7 = 127(0x7f, float:1.78E-43)
            goto L41
        L40:
            r7 = 0
        L41:
            r8 = r3 & 4
            if (r8 == 0) goto L46
            goto L47
        L46:
            r6 = 0
        L47:
            int r4 = getColor(r5, r4, r7, r6)
            r1[r3] = r4
        L4d:
            int r3 = r3 + 1
            goto L8
        L50:
            return r1
    }

    private static int[] generateDefault8BitClutEntries() {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto L128
            r4 = 8
            r5 = 255(0xff, float:3.57E-43)
            if (r3 >= r4) goto L30
            r4 = 63
            r6 = r3 & 1
            if (r6 == 0) goto L19
            r6 = 255(0xff, float:3.57E-43)
            goto L1a
        L19:
            r6 = 0
        L1a:
            r7 = r3 & 2
            if (r7 == 0) goto L21
            r7 = 255(0xff, float:3.57E-43)
            goto L22
        L21:
            r7 = 0
        L22:
            r8 = r3 & 4
            if (r8 == 0) goto L27
            goto L28
        L27:
            r5 = 0
        L28:
            int r4 = getColor(r4, r6, r7, r5)
            r1[r3] = r4
            goto L124
        L30:
            r6 = r3 & 136(0x88, float:1.9E-43)
            r7 = 170(0xaa, float:2.38E-43)
            r8 = 85
            if (r6 == 0) goto Lef
            r9 = 127(0x7f, float:1.78E-43)
            if (r6 == r4) goto Lb9
            r4 = 128(0x80, float:1.8E-43)
            r7 = 43
            if (r6 == r4) goto L7f
            r4 = 136(0x88, float:1.9E-43)
            if (r6 == r4) goto L48
            goto L124
        L48:
            r4 = r3 & 1
            if (r4 == 0) goto L4f
            r4 = 43
            goto L50
        L4f:
            r4 = 0
        L50:
            r6 = r3 & 16
            if (r6 == 0) goto L57
            r6 = 85
            goto L58
        L57:
            r6 = 0
        L58:
            int r4 = r4 + r6
            r6 = r3 & 2
            if (r6 == 0) goto L60
            r6 = 43
            goto L61
        L60:
            r6 = 0
        L61:
            r9 = r3 & 32
            if (r9 == 0) goto L68
            r9 = 85
            goto L69
        L68:
            r9 = 0
        L69:
            int r6 = r6 + r9
            r9 = r3 & 4
            if (r9 == 0) goto L6f
            goto L70
        L6f:
            r7 = 0
        L70:
            r9 = r3 & 64
            if (r9 == 0) goto L75
            goto L76
        L75:
            r8 = 0
        L76:
            int r7 = r7 + r8
            int r4 = getColor(r5, r4, r6, r7)
            r1[r3] = r4
            goto L124
        L7f:
            r4 = r3 & 1
            if (r4 == 0) goto L86
            r4 = 43
            goto L87
        L86:
            r4 = 0
        L87:
            int r4 = r4 + r9
            r6 = r3 & 16
            if (r6 == 0) goto L8f
            r6 = 85
            goto L90
        L8f:
            r6 = 0
        L90:
            int r4 = r4 + r6
            r6 = r3 & 2
            if (r6 == 0) goto L98
            r6 = 43
            goto L99
        L98:
            r6 = 0
        L99:
            int r6 = r6 + r9
            r10 = r3 & 32
            if (r10 == 0) goto La1
            r10 = 85
            goto La2
        La1:
            r10 = 0
        La2:
            int r6 = r6 + r10
            r10 = r3 & 4
            if (r10 == 0) goto La8
            goto La9
        La8:
            r7 = 0
        La9:
            int r7 = r7 + r9
            r9 = r3 & 64
            if (r9 == 0) goto Laf
            goto Lb0
        Laf:
            r8 = 0
        Lb0:
            int r7 = r7 + r8
            int r4 = getColor(r5, r4, r6, r7)
            r1[r3] = r4
            goto L124
        Lb9:
            r4 = r3 & 1
            if (r4 == 0) goto Lc0
            r4 = 85
            goto Lc1
        Lc0:
            r4 = 0
        Lc1:
            r5 = r3 & 16
            if (r5 == 0) goto Lc8
            r5 = 170(0xaa, float:2.38E-43)
            goto Lc9
        Lc8:
            r5 = 0
        Lc9:
            int r4 = r4 + r5
            r5 = r3 & 2
            if (r5 == 0) goto Ld1
            r5 = 85
            goto Ld2
        Ld1:
            r5 = 0
        Ld2:
            r6 = r3 & 32
            if (r6 == 0) goto Ld9
            r6 = 170(0xaa, float:2.38E-43)
            goto Lda
        Ld9:
            r6 = 0
        Lda:
            int r5 = r5 + r6
            r6 = r3 & 4
            if (r6 == 0) goto Le0
            goto Le1
        Le0:
            r8 = 0
        Le1:
            r6 = r3 & 64
            if (r6 == 0) goto Le6
            goto Le7
        Le6:
            r7 = 0
        Le7:
            int r8 = r8 + r7
            int r4 = getColor(r9, r4, r5, r8)
            r1[r3] = r4
            goto L124
        Lef:
            r4 = r3 & 1
            if (r4 == 0) goto Lf6
            r4 = 85
            goto Lf7
        Lf6:
            r4 = 0
        Lf7:
            r6 = r3 & 16
            if (r6 == 0) goto Lfe
            r6 = 170(0xaa, float:2.38E-43)
            goto Lff
        Lfe:
            r6 = 0
        Lff:
            int r4 = r4 + r6
            r6 = r3 & 2
            if (r6 == 0) goto L107
            r6 = 85
            goto L108
        L107:
            r6 = 0
        L108:
            r9 = r3 & 32
            if (r9 == 0) goto L10f
            r9 = 170(0xaa, float:2.38E-43)
            goto L110
        L10f:
            r9 = 0
        L110:
            int r6 = r6 + r9
            r9 = r3 & 4
            if (r9 == 0) goto L116
            goto L117
        L116:
            r8 = 0
        L117:
            r9 = r3 & 64
            if (r9 == 0) goto L11c
            goto L11d
        L11c:
            r7 = 0
        L11d:
            int r8 = r8 + r7
            int r4 = getColor(r5, r4, r6, r8)
            r1[r3] = r4
        L124:
            int r3 = r3 + 1
            goto L8
        L128:
            return r1
    }

    private static int getColor(int r0, int r1, int r2, int r3) {
            int r0 = r0 << 24
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r2 << 8
            r0 = r0 | r1
            r0 = r0 | r3
            return r0
    }

    private static int paint2BitPixelCodeString(com.google.android.exoplayer2.util.ParsableBitArray r13, int[] r14, @androidx.annotation.Nullable byte[] r15, int r16, int r17, @androidx.annotation.Nullable android.graphics.Paint r18, android.graphics.Canvas r19) {
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.readBits(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.readBit()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.readBits(r6)
            int r4 = r4 + r6
            int r3 = r13.readBits(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.readBit()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.readBits(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.readBits(r4)
            int r4 = r4 + 29
            int r3 = r13.readBits(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.readBits(r4)
            int r4 = r4 + 12
            int r3 = r13.readBits(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
    }

    private static int paint4BitPixelCodeString(com.google.android.exoplayer2.util.ParsableBitArray r13, int[] r14, @androidx.annotation.Nullable byte[] r15, int r16, int r17, @androidx.annotation.Nullable android.graphics.Paint r18, android.graphics.Canvas r19) {
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.readBits(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L16
            r11 = r2
        L13:
            r12 = 1
            goto L6e
        L16:
            boolean r4 = r13.readBit()
            r7 = 3
            if (r4 != 0) goto L2c
            int r3 = r13.readBits(r7)
            if (r3 == 0) goto L29
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L6e
        L29:
            r4 = 0
            r11 = 1
            goto L4d
        L2c:
            boolean r4 = r13.readBit()
            if (r4 != 0) goto L3f
            int r4 = r13.readBits(r5)
            int r5 = r4 + 4
            int r4 = r13.readBits(r3)
        L3c:
            r11 = r2
            r12 = r5
            goto L6e
        L3f:
            int r4 = r13.readBits(r5)
            if (r4 == 0) goto L6b
            if (r4 == r6) goto L67
            if (r4 == r5) goto L5c
            if (r4 == r7) goto L4f
            r11 = r2
            r4 = 0
        L4d:
            r12 = 0
            goto L6e
        L4f:
            r4 = 8
            int r4 = r13.readBits(r4)
            int r5 = r4 + 25
            int r4 = r13.readBits(r3)
            goto L3c
        L5c:
            int r4 = r13.readBits(r3)
            int r5 = r4 + 9
            int r4 = r13.readBits(r3)
            goto L3c
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L13
        L6e:
            if (r12 == 0) goto L8a
            if (r8 == 0) goto L8a
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8a:
            int r10 = r10 + r12
            if (r11 == 0) goto L8e
            return r10
        L8e:
            r2 = r11
            goto L9
    }

    private static int paint8BitPixelCodeString(com.google.android.exoplayer2.util.ParsableBitArray r13, int[] r14, @androidx.annotation.Nullable byte[] r15, int r16, int r17, @androidx.annotation.Nullable android.graphics.Paint r18, android.graphics.Canvas r19) {
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 8
            int r4 = r13.readBits(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r11 = r2
            r12 = 1
            goto L35
        L15:
            boolean r4 = r13.readBit()
            r6 = 7
            if (r4 != 0) goto L2a
            int r3 = r13.readBits(r6)
            if (r3 == 0) goto L26
            r11 = r2
            r12 = r3
            r4 = 0
            goto L35
        L26:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L35
        L2a:
            int r4 = r13.readBits(r6)
            int r3 = r13.readBits(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L35:
            if (r12 == 0) goto L53
            if (r8 == 0) goto L53
            if (r15 == 0) goto L3d
            r4 = r15[r4]
        L3d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L53:
            int r10 = r10 + r12
            if (r11 == 0) goto L57
            return r10
        L57:
            r2 = r11
            goto L9
    }

    private static void paintPixelDataSubBlock(byte[] r14, int[] r15, int r16, int r17, int r18, @androidx.annotation.Nullable android.graphics.Paint r19, android.graphics.Canvas r20) {
            r0 = r16
            com.google.android.exoplayer2.util.ParsableBitArray r8 = new com.google.android.exoplayer2.util.ParsableBitArray
            r1 = r14
            r8.<init>(r14)
            r9 = 0
            r4 = r17
            r10 = r18
            r11 = r9
            r12 = r11
            r13 = r12
        L10:
            int r1 = r8.bitsLeft()
            if (r1 == 0) goto L8a
            r1 = 8
            int r2 = r8.readBits(r1)
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 == r3) goto L85
            r3 = 3
            switch(r2) {
                case 16: goto L61;
                case 17: goto L47;
                case 18: goto L3a;
                default: goto L24;
            }
        L24:
            r3 = 4
            switch(r2) {
                case 32: goto L35;
                case 33: goto L30;
                case 34: goto L29;
                default: goto L28;
            }
        L28:
            goto L10
        L29:
            r2 = 16
            byte[] r12 = buildClutMapTable(r2, r1, r8)
            goto L10
        L30:
            byte[] r11 = buildClutMapTable(r3, r1, r8)
            goto L10
        L35:
            byte[] r13 = buildClutMapTable(r3, r3, r8)
            goto L10
        L3a:
            r3 = 0
            r1 = r8
            r2 = r15
            r5 = r10
            r6 = r19
            r7 = r20
            int r4 = paint8BitPixelCodeString(r1, r2, r3, r4, r5, r6, r7)
            goto L10
        L47:
            if (r0 != r3) goto L51
            if (r12 != 0) goto L4e
            byte[] r1 = com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap4To8
            goto L4f
        L4e:
            r1 = r12
        L4f:
            r3 = r1
            goto L52
        L51:
            r3 = r9
        L52:
            r1 = r8
            r2 = r15
            r5 = r10
            r6 = r19
            r7 = r20
            int r4 = paint4BitPixelCodeString(r1, r2, r3, r4, r5, r6, r7)
            r8.byteAlign()
            goto L10
        L61:
            if (r0 != r3) goto L6b
            if (r11 != 0) goto L68
            byte[] r1 = com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap2To8
            goto L69
        L68:
            r1 = r11
        L69:
            r3 = r1
            goto L76
        L6b:
            r1 = 2
            if (r0 != r1) goto L75
            if (r13 != 0) goto L73
            byte[] r1 = com.google.android.exoplayer2.text.dvb.DvbParser.defaultMap2To4
            goto L69
        L73:
            r1 = r13
            goto L69
        L75:
            r3 = r9
        L76:
            r1 = r8
            r2 = r15
            r5 = r10
            r6 = r19
            r7 = r20
            int r4 = paint2BitPixelCodeString(r1, r2, r3, r4, r5, r6, r7)
            r8.byteAlign()
            goto L10
        L85:
            int r10 = r10 + 2
            r4 = r17
            goto L10
        L8a:
            return
    }

    private static void paintPixelDataSubBlocks(com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData r7, com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition r8, int r9, int r10, int r11, @androidx.annotation.Nullable android.graphics.Paint r12, android.graphics.Canvas r13) {
            r0 = 3
            if (r9 != r0) goto L6
            int[] r8 = r8.clutEntries8Bit
            goto Le
        L6:
            r0 = 2
            if (r9 != r0) goto Lc
            int[] r8 = r8.clutEntries4Bit
            goto Le
        Lc:
            int[] r8 = r8.clutEntries2Bit
        Le:
            byte[] r0 = r7.topFieldData
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            paintPixelDataSubBlock(r0, r1, r2, r3, r4, r5, r6)
            byte[] r0 = r7.bottomFieldData
            int r4 = r11 + 1
            paintPixelDataSubBlock(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    private static com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition parseClutDefinition(com.google.android.exoplayer2.util.ParsableBitArray r22, int r23) {
            r0 = r22
            r1 = 8
            int r2 = r0.readBits(r1)
            r0.skipBits(r1)
            r3 = 2
            int r4 = r23 + (-2)
            int[] r5 = generateDefault2BitClutEntries()
            int[] r6 = generateDefault4BitClutEntries()
            int[] r7 = generateDefault8BitClutEntries()
        L1a:
            if (r4 <= 0) goto Lc6
            int r8 = r0.readBits(r1)
            int r9 = r0.readBits(r1)
            int r4 = r4 + (-2)
            r10 = r9 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L2c
            r10 = r5
            goto L33
        L2c:
            r10 = r9 & 64
            if (r10 == 0) goto L32
            r10 = r6
            goto L33
        L32:
            r10 = r7
        L33:
            r9 = r9 & 1
            if (r9 == 0) goto L4a
            int r9 = r0.readBits(r1)
            int r11 = r0.readBits(r1)
            int r12 = r0.readBits(r1)
            int r13 = r0.readBits(r1)
            int r4 = r4 + (-4)
            goto L6a
        L4a:
            r9 = 6
            int r11 = r0.readBits(r9)
            int r11 = r11 << r3
            r12 = 4
            int r13 = r0.readBits(r12)
            int r13 = r13 << r12
            int r14 = r0.readBits(r12)
            int r12 = r14 << 4
            int r14 = r0.readBits(r3)
            int r9 = r14 << 6
            int r4 = r4 + (-2)
            r21 = r13
            r13 = r9
            r9 = r11
            r11 = r21
        L6a:
            r15 = 255(0xff, float:3.57E-43)
            if (r9 != 0) goto L72
            r11 = 0
            r12 = 0
            r13 = 255(0xff, float:3.57E-43)
        L72:
            r13 = r13 & r15
            int r13 = 255 - r13
            byte r13 = (byte) r13
            r23 = r4
            double r3 = (double) r9
            r16 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r11 = r11 + (-128)
            r18 = r2
            double r1 = (double) r11
            double r16 = r16 * r1
            r11 = r10
            double r9 = r16 + r3
            int r9 = (int) r9
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r12 = r12 + (-128)
            double r14 = (double) r12
            double r16 = r16 * r14
            double r16 = r3 - r16
            r19 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r1 = r1 * r19
            double r1 = r16 - r1
            int r1 = (int) r1
            r16 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r14 = r14 * r16
            double r14 = r14 + r3
            int r2 = (int) r14
            r3 = 0
            r4 = 255(0xff, float:3.57E-43)
            int r9 = com.google.android.exoplayer2.util.Util.constrainValue(r9, r3, r4)
            int r1 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r3, r4)
            int r2 = com.google.android.exoplayer2.util.Util.constrainValue(r2, r3, r4)
            int r1 = getColor(r13, r9, r1, r2)
            r11[r8] = r1
            r4 = r23
            r2 = r18
            r1 = 8
            r3 = 2
            goto L1a
        Lc6:
            r18 = r2
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r0 = new com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition
            r1 = r18
            r0.<init>(r1, r5, r6, r7)
            return r0
    }

    private static com.google.android.exoplayer2.text.dvb.DvbParser.DisplayDefinition parseDisplayDefinition(com.google.android.exoplayer2.util.ParsableBitArray r9) {
            r0 = 4
            r9.skipBits(r0)
            boolean r0 = r9.readBit()
            r1 = 3
            r9.skipBits(r1)
            r1 = 16
            int r3 = r9.readBits(r1)
            int r4 = r9.readBits(r1)
            r2 = 0
            if (r0 == 0) goto L2e
            int r0 = r9.readBits(r1)
            int r2 = r9.readBits(r1)
            int r5 = r9.readBits(r1)
            int r9 = r9.readBits(r1)
            r8 = r9
            r6 = r2
            r7 = r5
            r5 = r0
            goto L32
        L2e:
            r6 = r3
            r8 = r4
            r5 = 0
            r7 = 0
        L32:
            com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition r9 = new com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData parseObjectData(com.google.android.exoplayer2.util.ParsableBitArray r6) {
            r0 = 16
            int r1 = r6.readBits(r0)
            r2 = 4
            r6.skipBits(r2)
            r2 = 2
            int r2 = r6.readBits(r2)
            boolean r3 = r6.readBit()
            r4 = 1
            r6.skipBits(r4)
            byte[] r5 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            if (r2 != r4) goto L27
            r2 = 8
            int r2 = r6.readBits(r2)
            int r2 = r2 * 16
            r6.skipBits(r2)
            goto L41
        L27:
            if (r2 != 0) goto L41
            int r2 = r6.readBits(r0)
            int r0 = r6.readBits(r0)
            r4 = 0
            if (r2 <= 0) goto L39
            byte[] r5 = new byte[r2]
            r6.readBytes(r5, r4, r2)
        L39:
            if (r0 <= 0) goto L41
            byte[] r2 = new byte[r0]
            r6.readBytes(r2, r4, r0)
            goto L42
        L41:
            r2 = r5
        L42:
            com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData r6 = new com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData
            r6.<init>(r1, r3, r5, r2)
            return r6
    }

    private static com.google.android.exoplayer2.text.dvb.DvbParser.PageComposition parsePageComposition(com.google.android.exoplayer2.util.ParsableBitArray r9, int r10) {
            r0 = 8
            int r1 = r9.readBits(r0)
            r2 = 4
            int r2 = r9.readBits(r2)
            r3 = 2
            int r4 = r9.readBits(r3)
            r9.skipBits(r3)
            int r10 = r10 - r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
        L19:
            if (r10 <= 0) goto L37
            int r5 = r9.readBits(r0)
            r9.skipBits(r0)
            r6 = 16
            int r7 = r9.readBits(r6)
            int r6 = r9.readBits(r6)
            int r10 = r10 + (-6)
            com.google.android.exoplayer2.text.dvb.DvbParser$PageRegion r8 = new com.google.android.exoplayer2.text.dvb.DvbParser$PageRegion
            r8.<init>(r7, r6)
            r3.put(r5, r8)
            goto L19
        L37:
            com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition r9 = new com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition
            r9.<init>(r1, r2, r4, r3)
            return r9
    }

    private static com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition parseRegionComposition(com.google.android.exoplayer2.util.ParsableBitArray r26, int r27) {
            r0 = r26
            r1 = 8
            int r3 = r0.readBits(r1)
            r2 = 4
            r0.skipBits(r2)
            boolean r4 = r26.readBit()
            r5 = 3
            r0.skipBits(r5)
            r6 = 16
            int r7 = r0.readBits(r6)
            int r8 = r0.readBits(r6)
            int r9 = r0.readBits(r5)
            int r10 = r0.readBits(r5)
            r5 = 2
            r0.skipBits(r5)
            int r11 = r0.readBits(r1)
            int r12 = r0.readBits(r1)
            int r13 = r0.readBits(r2)
            int r14 = r0.readBits(r5)
            r0.skipBits(r5)
            int r15 = r27 + (-10)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L44:
            if (r15 <= 0) goto L95
            int r2 = r0.readBits(r6)
            int r6 = r0.readBits(r5)
            int r20 = r0.readBits(r5)
            r5 = 12
            int r21 = r0.readBits(r5)
            r25 = r14
            r14 = 4
            r0.skipBits(r14)
            int r22 = r0.readBits(r5)
            int r15 = r15 + (-6)
            r5 = 1
            r17 = 0
            if (r6 == r5) goto L72
            r5 = 2
            if (r6 != r5) goto L6d
            goto L72
        L6d:
            r23 = 0
            r24 = 0
            goto L82
        L72:
            r5 = 8
            int r16 = r0.readBits(r5)
            int r17 = r0.readBits(r5)
            int r15 = r15 + (-2)
            r23 = r16
            r24 = r17
        L82:
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject r5 = new com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject
            r18 = r5
            r19 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1.put(r2, r5)
            r14 = r25
            r2 = 4
            r5 = 2
            r6 = 16
            goto L44
        L95:
            r25 = r14
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition r0 = new com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition
            r2 = r0
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r25
            r13 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    private static void parseSubtitlingSegment(com.google.android.exoplayer2.util.ParsableBitArray r6, com.google.android.exoplayer2.text.dvb.DvbParser.SubtitleService r7) {
            r0 = 8
            int r0 = r6.readBits(r0)
            r1 = 16
            int r2 = r6.readBits(r1)
            int r1 = r6.readBits(r1)
            int r3 = r6.getBytePosition()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.bitsLeft()
            if (r4 <= r5) goto L2c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            com.google.android.exoplayer2.util.Log.w(r7, r0)
            int r7 = r6.bitsLeft()
            r6.skipBits(r7)
            return
        L2c:
            switch(r0) {
                case 16: goto La6;
                case 17: goto L7f;
                case 18: goto L5f;
                case 19: goto L3d;
                case 20: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Ld0
        L31:
            int r0 = r7.subtitlePageId
            if (r2 != r0) goto Ld0
            com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition r0 = parseDisplayDefinition(r6)
            r7.displayDefinition = r0
            goto Ld0
        L3d:
            int r0 = r7.subtitlePageId
            if (r2 != r0) goto L4e
            com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData r0 = parseObjectData(r6)
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r7 = r7.objects
            int r1 = r0.id
            r7.put(r1, r0)
            goto Ld0
        L4e:
            int r0 = r7.ancillaryPageId
            if (r2 != r0) goto Ld0
            com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData r0 = parseObjectData(r6)
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r7 = r7.ancillaryObjects
            int r1 = r0.id
            r7.put(r1, r0)
            goto Ld0
        L5f:
            int r0 = r7.subtitlePageId
            if (r2 != r0) goto L6f
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r0 = parseClutDefinition(r6, r1)
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r7 = r7.cluts
            int r1 = r0.id
            r7.put(r1, r0)
            goto Ld0
        L6f:
            int r0 = r7.ancillaryPageId
            if (r2 != r0) goto Ld0
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r0 = parseClutDefinition(r6, r1)
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r7 = r7.ancillaryCluts
            int r1 = r0.id
            r7.put(r1, r0)
            goto Ld0
        L7f:
            com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition r0 = r7.pageComposition
            int r4 = r7.subtitlePageId
            if (r2 != r4) goto Ld0
            if (r0 == 0) goto Ld0
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition r1 = parseRegionComposition(r6, r1)
            int r0 = r0.state
            if (r0 != 0) goto L9e
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition> r0 = r7.regions
            int r2 = r1.id
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition r0 = (com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition) r0
            if (r0 == 0) goto L9e
            r1.mergeFrom(r0)
        L9e:
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition> r7 = r7.regions
            int r0 = r1.id
            r7.put(r0, r1)
            goto Ld0
        La6:
            int r0 = r7.subtitlePageId
            if (r2 != r0) goto Ld0
            com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition r0 = r7.pageComposition
            com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition r1 = parsePageComposition(r6, r1)
            int r2 = r1.state
            if (r2 == 0) goto Lc6
            r7.pageComposition = r1
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition> r0 = r7.regions
            r0.clear()
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r0 = r7.cluts
            r0.clear()
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r7 = r7.objects
            r7.clear()
            goto Ld0
        Lc6:
            if (r0 == 0) goto Ld0
            int r0 = r0.version
            int r2 = r1.version
            if (r0 == r2) goto Ld0
            r7.pageComposition = r1
        Ld0:
            int r7 = r6.getBytePosition()
            int r3 = r3 - r7
            r6.skipBytes(r3)
            return
    }

    public java.util.List<com.google.android.exoplayer2.text.Cue> decode(byte[] r21, int r22) {
            r20 = this;
            r0 = r20
            com.google.android.exoplayer2.util.ParsableBitArray r1 = new com.google.android.exoplayer2.util.ParsableBitArray
            r2 = r21
            r3 = r22
            r1.<init>(r2, r3)
        Lb:
            int r2 = r1.bitsLeft()
            r3 = 48
            if (r2 < r3) goto L23
            r2 = 8
            int r2 = r1.readBits(r2)
            r3 = 15
            if (r2 != r3) goto L23
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r2 = r0.subtitleService
            parseSubtitlingSegment(r1, r2)
            goto Lb
        L23:
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r1 = r0.subtitleService
            com.google.android.exoplayer2.text.dvb.DvbParser$PageComposition r2 = r1.pageComposition
            if (r2 != 0) goto L2e
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L2e:
            com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition r1 = r1.displayDefinition
            if (r1 == 0) goto L33
            goto L35
        L33:
            com.google.android.exoplayer2.text.dvb.DvbParser$DisplayDefinition r1 = r0.defaultDisplayDefinition
        L35:
            android.graphics.Bitmap r3 = r0.bitmap
            if (r3 == 0) goto L4f
            int r4 = r1.width
            int r4 = r4 + 1
            int r3 = r3.getWidth()
            if (r4 != r3) goto L4f
            int r3 = r1.height
            int r3 = r3 + 1
            android.graphics.Bitmap r4 = r0.bitmap
            int r4 = r4.getHeight()
            if (r3 == r4) goto L64
        L4f:
            int r3 = r1.width
            int r3 = r3 + 1
            int r4 = r1.height
            int r4 = r4 + 1
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            r0.bitmap = r3
            android.graphics.Canvas r4 = r0.canvas
            r4.setBitmap(r3)
        L64:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$PageRegion> r2 = r2.regions
            r4 = 0
            r5 = 0
        L6d:
            int r6 = r2.size()
            if (r5 >= r6) goto L1b9
            android.graphics.Canvas r6 = r0.canvas
            r6.save()
            java.lang.Object r6 = r2.valueAt(r5)
            com.google.android.exoplayer2.text.dvb.DvbParser$PageRegion r6 = (com.google.android.exoplayer2.text.dvb.DvbParser.PageRegion) r6
            int r7 = r2.keyAt(r5)
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r8 = r0.subtitleService
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition> r8 = r8.regions
            java.lang.Object r7 = r8.get(r7)
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionComposition r7 = (com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition) r7
            int r8 = r6.horizontalAddress
            int r9 = r1.horizontalPositionMinimum
            int r8 = r8 + r9
            int r6 = r6.verticalAddress
            int r9 = r1.verticalPositionMinimum
            int r6 = r6 + r9
            int r9 = r7.width
            int r9 = r9 + r8
            int r10 = r1.horizontalPositionMaximum
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r7.height
            int r10 = r10 + r6
            int r11 = r1.verticalPositionMaximum
            int r10 = java.lang.Math.min(r10, r11)
            android.graphics.Canvas r11 = r0.canvas
            r11.clipRect(r8, r6, r9, r10)
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r9 = r0.subtitleService
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r9 = r9.cluts
            int r10 = r7.clutId
            java.lang.Object r9 = r9.get(r10)
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r9 = (com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition) r9
            if (r9 != 0) goto Lcb
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r9 = r0.subtitleService
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition> r9 = r9.ancillaryCluts
            int r10 = r7.clutId
            java.lang.Object r9 = r9.get(r10)
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r9 = (com.google.android.exoplayer2.text.dvb.DvbParser.ClutDefinition) r9
            if (r9 != 0) goto Lcb
            com.google.android.exoplayer2.text.dvb.DvbParser$ClutDefinition r9 = r0.defaultClutDefinition
        Lcb:
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject> r15 = r7.regionObjects
            r14 = 0
        Lce:
            int r10 = r15.size()
            if (r14 >= r10) goto L127
            int r10 = r15.keyAt(r14)
            java.lang.Object r11 = r15.valueAt(r14)
            com.google.android.exoplayer2.text.dvb.DvbParser$RegionObject r11 = (com.google.android.exoplayer2.text.dvb.DvbParser.RegionObject) r11
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r12 = r0.subtitleService
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r12 = r12.objects
            java.lang.Object r12 = r12.get(r10)
            com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData r12 = (com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData) r12
            if (r12 != 0) goto Lf5
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r12 = r0.subtitleService
            android.util.SparseArray<com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData> r12 = r12.ancillaryObjects
            java.lang.Object r10 = r12.get(r10)
            com.google.android.exoplayer2.text.dvb.DvbParser$ObjectData r10 = (com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData) r10
            goto Lf6
        Lf5:
            r10 = r12
        Lf6:
            if (r10 == 0) goto L11e
            boolean r12 = r10.nonModifyingColorFlag
            if (r12 == 0) goto Lfe
            r12 = 0
            goto L100
        Lfe:
            android.graphics.Paint r12 = r0.defaultPaint
        L100:
            r16 = r12
            int r12 = r7.depth
            int r13 = r11.horizontalPosition
            int r13 = r13 + r8
            int r11 = r11.verticalPosition
            int r17 = r6 + r11
            android.graphics.Canvas r11 = r0.canvas
            r18 = r11
            r11 = r9
            r19 = r14
            r14 = r17
            r17 = r15
            r15 = r16
            r16 = r18
            paintPixelDataSubBlocks(r10, r11, r12, r13, r14, r15, r16)
            goto L122
        L11e:
            r19 = r14
            r17 = r15
        L122:
            int r14 = r19 + 1
            r15 = r17
            goto Lce
        L127:
            boolean r10 = r7.fillFlag
            if (r10 == 0) goto L15f
            int r10 = r7.depth
            r11 = 3
            if (r10 != r11) goto L137
            int[] r9 = r9.clutEntries8Bit
            int r10 = r7.pixelCode8Bit
            r9 = r9[r10]
            goto L147
        L137:
            r11 = 2
            if (r10 != r11) goto L141
            int[] r9 = r9.clutEntries4Bit
            int r10 = r7.pixelCode4Bit
            r9 = r9[r10]
            goto L147
        L141:
            int[] r9 = r9.clutEntries2Bit
            int r10 = r7.pixelCode2Bit
            r9 = r9[r10]
        L147:
            android.graphics.Paint r10 = r0.fillRegionPaint
            r10.setColor(r9)
            android.graphics.Canvas r11 = r0.canvas
            float r12 = (float) r8
            float r13 = (float) r6
            int r9 = r7.width
            int r9 = r9 + r8
            float r14 = (float) r9
            int r9 = r7.height
            int r9 = r9 + r6
            float r15 = (float) r9
            android.graphics.Paint r9 = r0.fillRegionPaint
            r16 = r9
            r11.drawRect(r12, r13, r14, r15, r16)
        L15f:
            com.google.android.exoplayer2.text.Cue$Builder r9 = new com.google.android.exoplayer2.text.Cue$Builder
            r9.<init>()
            android.graphics.Bitmap r10 = r0.bitmap
            int r11 = r7.width
            int r12 = r7.height
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r8, r6, r11, r12)
            com.google.android.exoplayer2.text.Cue$Builder r9 = r9.setBitmap(r10)
            float r8 = (float) r8
            int r10 = r1.width
            float r10 = (float) r10
            float r8 = r8 / r10
            com.google.android.exoplayer2.text.Cue$Builder r8 = r9.setPosition(r8)
            com.google.android.exoplayer2.text.Cue$Builder r8 = r8.setPositionAnchor(r4)
            float r6 = (float) r6
            int r9 = r1.height
            float r9 = (float) r9
            float r6 = r6 / r9
            com.google.android.exoplayer2.text.Cue$Builder r6 = r8.setLine(r6, r4)
            com.google.android.exoplayer2.text.Cue$Builder r6 = r6.setLineAnchor(r4)
            int r8 = r7.width
            float r8 = (float) r8
            int r9 = r1.width
            float r9 = (float) r9
            float r8 = r8 / r9
            com.google.android.exoplayer2.text.Cue$Builder r6 = r6.setSize(r8)
            int r7 = r7.height
            float r7 = (float) r7
            int r8 = r1.height
            float r8 = (float) r8
            float r7 = r7 / r8
            com.google.android.exoplayer2.text.Cue$Builder r6 = r6.setBitmapHeight(r7)
            com.google.android.exoplayer2.text.Cue r6 = r6.build()
            r3.add(r6)
            android.graphics.Canvas r6 = r0.canvas
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR
            r6.drawColor(r4, r7)
            android.graphics.Canvas r6 = r0.canvas
            r6.restore()
            int r5 = r5 + 1
            goto L6d
        L1b9:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            return r1
    }

    public void reset() {
            r1 = this;
            com.google.android.exoplayer2.text.dvb.DvbParser$SubtitleService r0 = r1.subtitleService
            r0.reset()
            return
    }
}
