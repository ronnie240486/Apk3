package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final java.lang.String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final android.graphics.Paint bitmapPaint;
    private android.graphics.Rect bitmapRect;
    private float bottomPaddingFraction;

    @androidx.annotation.Nullable
    private android.graphics.Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @androidx.annotation.Nullable
    private java.lang.CharSequence cueText;

    @androidx.annotation.Nullable
    private android.text.Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private android.text.StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private android.text.StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final android.text.TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final android.graphics.Paint windowPaint;

    public SubtitlePainter(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [16843287, 16843288} // fill-array
            r1 = 0
            r2 = 0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r1, r0, r2, r2)
            int r1 = r0.getDimensionPixelSize(r2, r2)
            float r1 = (float) r1
            r3.spacingAdd = r1
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0.getFloat(r1, r2)
            r3.spacingMult = r2
            r0.recycle()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.densityDpi
            float r4 = (float) r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r4 = r4 / r0
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            r3.outlineWidth = r4
            r3.shadowRadius = r4
            r3.shadowOffset = r4
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r3.textPaint = r4
            r4.setAntiAlias(r1)
            r4.setSubpixelText(r1)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.windowPaint = r4
            r4.setAntiAlias(r1)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r4.setStyle(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.bitmapPaint = r4
            r4.setAntiAlias(r1)
            r4.setFilterBitmap(r1)
            return
    }

    private static boolean areCharSequencesEqual(@androidx.annotation.Nullable java.lang.CharSequence r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.cueBitmap
            android.graphics.Rect r1 = r4.bitmapRect
            android.graphics.Paint r2 = r4.bitmapPaint
            r3 = 0
            r5.drawBitmap(r0, r3, r1, r2)
            return
    }

    private void drawLayout(android.graphics.Canvas r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.drawTextLayout(r1)
            goto L13
        L6:
            android.graphics.Rect r2 = r0.bitmapRect
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.graphics.Bitmap r2 = r0.cueBitmap
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            r0.drawBitmapLayout(r1)
        L13:
            return
    }

    private void drawTextLayout(android.graphics.Canvas r11) {
            r10 = this;
            android.text.StaticLayout r0 = r10.textLayout
            android.text.StaticLayout r1 = r10.edgeLayout
            if (r0 == 0) goto Lc7
            if (r1 != 0) goto La
            goto Lc7
        La:
            int r2 = r11.save()
            int r3 = r10.textLeft
            float r3 = (float) r3
            int r4 = r10.textTop
            float r4 = (float) r4
            r11.translate(r3, r4)
            int r3 = r10.windowColor
            int r3 = android.graphics.Color.alpha(r3)
            if (r3 <= 0) goto L3e
            android.graphics.Paint r3 = r10.windowPaint
            int r4 = r10.windowColor
            r3.setColor(r4)
            int r3 = r10.textPaddingX
            int r3 = -r3
            float r5 = (float) r3
            r6 = 0
            int r3 = r0.getWidth()
            int r4 = r10.textPaddingX
            int r3 = r3 + r4
            float r7 = (float) r3
            int r3 = r0.getHeight()
            float r8 = (float) r3
            android.graphics.Paint r9 = r10.windowPaint
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
        L3e:
            int r3 = r10.edgeType
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L64
            android.text.TextPaint r3 = r10.textPaint
            android.graphics.Paint$Join r5 = android.graphics.Paint.Join.ROUND
            r3.setStrokeJoin(r5)
            android.text.TextPaint r3 = r10.textPaint
            float r5 = r10.outlineWidth
            r3.setStrokeWidth(r5)
            android.text.TextPaint r3 = r10.textPaint
            int r5 = r10.edgeColor
            r3.setColor(r5)
            android.text.TextPaint r3 = r10.textPaint
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            r3.setStyle(r5)
            r1.draw(r11)
            goto Lad
        L64:
            r6 = 2
            if (r3 != r6) goto L73
            android.text.TextPaint r1 = r10.textPaint
            float r3 = r10.shadowRadius
            float r5 = r10.shadowOffset
            int r6 = r10.edgeColor
            r1.setShadowLayer(r3, r5, r5, r6)
            goto Lad
        L73:
            r6 = 3
            if (r3 == r6) goto L79
            r7 = 4
            if (r3 != r7) goto Lad
        L79:
            if (r3 != r6) goto L7c
            goto L7d
        L7c:
            r5 = 0
        L7d:
            r3 = -1
            if (r5 == 0) goto L82
            r6 = -1
            goto L84
        L82:
            int r6 = r10.edgeColor
        L84:
            if (r5 == 0) goto L88
            int r3 = r10.edgeColor
        L88:
            float r5 = r10.shadowRadius
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            android.text.TextPaint r7 = r10.textPaint
            int r8 = r10.foregroundColor
            r7.setColor(r8)
            android.text.TextPaint r7 = r10.textPaint
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r7.setStyle(r8)
            android.text.TextPaint r7 = r10.textPaint
            float r8 = r10.shadowRadius
            float r9 = -r5
            r7.setShadowLayer(r8, r9, r9, r6)
            r1.draw(r11)
            android.text.TextPaint r1 = r10.textPaint
            float r6 = r10.shadowRadius
            r1.setShadowLayer(r6, r5, r5, r3)
        Lad:
            android.text.TextPaint r1 = r10.textPaint
            int r3 = r10.foregroundColor
            r1.setColor(r3)
            android.text.TextPaint r1 = r10.textPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r1.setStyle(r3)
            r0.draw(r11)
            android.text.TextPaint r0 = r10.textPaint
            r1 = 0
            r0.setShadowLayer(r1, r1, r1, r4)
            r11.restoreToCount(r2)
        Lc7:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    private void setupBitmapLayout() {
            r7 = this;
            android.graphics.Bitmap r0 = r7.cueBitmap
            int r1 = r7.parentRight
            int r2 = r7.parentLeft
            int r1 = r1 - r2
            int r3 = r7.parentBottom
            int r4 = r7.parentTop
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.cuePosition
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r7.cueLine
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r7.cueSize
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.cueBitmapHeight
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L32
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            goto L44
        L32:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
        L44:
            int r2 = r7.cuePositionAnchor
            r3 = 1
            r6 = 2
            if (r2 != r6) goto L4d
            float r2 = (float) r1
        L4b:
            float r5 = r5 - r2
            goto L53
        L4d:
            if (r2 != r3) goto L53
            int r2 = r1 / 2
            float r2 = (float) r2
            goto L4b
        L53:
            int r2 = java.lang.Math.round(r5)
            int r5 = r7.cueLineAnchor
            if (r5 != r6) goto L5e
            float r3 = (float) r0
        L5c:
            float r4 = r4 - r3
            goto L64
        L5e:
            if (r5 != r3) goto L64
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L5c
        L64:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.bitmapRect = r4
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    private void setupTextLayout() {
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.cueText
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto Lb
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L12
        Lb:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.cueText
            r1.<init>(r2)
        L12:
            int r2 = r0.parentRight
            int r3 = r0.parentLeft
            int r2 = r2 - r3
            int r3 = r0.parentBottom
            int r4 = r0.parentTop
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.textPaint
            float r4 = r0.defaultTextSizePx
            r3.setTextSize(r4)
            float r3 = r0.defaultTextSizePx
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.cueSize
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L3f
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L3f:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L4a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            com.google.android.exoplayer2.util.Log.w(r10, r1)
            return
        L4a:
            float r3 = r0.cueTextSizePx
            r16 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L64
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.cueTextSizePx
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L64:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.edgeType
            r7 = 1
            if (r3 != r7) goto L87
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = 0
        L7c:
            if (r6 >= r5) goto L87
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L7c
        L87:
            int r3 = r0.backgroundColor
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto Lb4
            int r3 = r0.edgeType
            if (r3 == 0) goto La6
            if (r3 != r7) goto L97
            goto La6
        L97:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.backgroundColor
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto Lb4
        La6:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.backgroundColor
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        Lb4:
            android.text.Layout$Alignment r3 = r0.cueTextAlignment
            if (r3 != 0) goto Lba
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        Lba:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.textPaint
            float r4 = r0.spacingMult
            float r3 = r0.spacingAdd
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = 0
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.textLayout = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.textLayout
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        Led:
            if (r9 >= r4) goto L102
            android.text.StaticLayout r6 = r0.textLayout
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto Led
        L102:
            float r4 = r0.cueSize
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L10e
            if (r5 >= r15) goto L10e
            goto L10f
        L10e:
            r15 = r5
        L10f:
            int r15 = r15 + r13
            float r4 = r0.cuePosition
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L13c
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.parentLeft
            int r2 = r2 + r4
            int r5 = r0.cuePositionAnchor
            r6 = 1
            if (r5 == r6) goto L12b
            r7 = 2
            if (r5 == r7) goto L129
            goto L130
        L129:
            int r2 = r2 - r15
            goto L130
        L12b:
            r7 = 2
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L130:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.parentRight
            int r4 = java.lang.Math.min(r15, r4)
            goto L145
        L13c:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.parentLeft
            int r2 = r2 + r4
            int r4 = r2 + r15
        L145:
            int r20 = r4 - r2
            if (r20 > 0) goto L14f
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            com.google.android.exoplayer2.util.Log.w(r12, r1)
            return
        L14f:
            float r4 = r0.cueLine
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L1ae
            int r5 = r0.cueLineType
            if (r5 != 0) goto L172
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.parentTop
            int r4 = r4 + r5
            int r5 = r0.cueLineAnchor
            if (r5 != r7) goto L16b
            goto L19e
        L16b:
            if (r5 != r6) goto L19f
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L19f
        L172:
            android.text.StaticLayout r4 = r0.textLayout
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.textLayout
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.cueLine
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L191
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.parentTop
            int r4 = r4 + r5
            goto L19f
        L191:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.parentBottom
            int r4 = r4 + r5
        L19e:
            int r4 = r4 - r3
        L19f:
            int r5 = r4 + r3
            int r6 = r0.parentBottom
            if (r5 <= r6) goto L1a8
            int r4 = r6 - r3
            goto L1b8
        L1a8:
            int r3 = r0.parentTop
            if (r4 >= r3) goto L1b8
            r11 = r3
            goto L1b9
        L1ae:
            int r4 = r0.parentBottom
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.bottomPaddingFraction
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L1b8:
            r11 = r4
        L1b9:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.textPaint
            float r8 = r0.spacingMult
            float r9 = r0.spacingAdd
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.textLayout = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.textPaint
            float r4 = r0.spacingMult
            float r5 = r0.spacingAdd
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.edgeLayout = r1
            r0.textLeft = r2
            r0.textTop = r11
            r1 = r25
            r0.textPaddingX = r1
            return
    }

    public void draw(com.google.android.exoplayer2.text.Cue r5, com.google.android.exoplayer2.ui.CaptionStyleCompat r6, float r7, float r8, float r9, android.graphics.Canvas r10, int r11, int r12, int r13, int r14) {
            r4 = this;
            android.graphics.Bitmap r0 = r5.bitmap
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L1d
            java.lang.CharSequence r1 = r5.text
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            return
        L14:
            boolean r1 = r5.windowColorSet
            if (r1 == 0) goto L1b
            int r1 = r5.windowColor
            goto L1d
        L1b:
            int r1 = r6.windowColor
        L1d:
            java.lang.CharSequence r2 = r4.cueText
            java.lang.CharSequence r3 = r5.text
            boolean r2 = areCharSequencesEqual(r2, r3)
            if (r2 == 0) goto Ld1
            android.text.Layout$Alignment r2 = r4.cueTextAlignment
            android.text.Layout$Alignment r3 = r5.textAlignment
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto Ld1
            android.graphics.Bitmap r2 = r4.cueBitmap
            android.graphics.Bitmap r3 = r5.bitmap
            if (r2 != r3) goto Ld1
            float r2 = r4.cueLine
            float r3 = r5.line
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Ld1
            int r2 = r4.cueLineType
            int r3 = r5.lineType
            if (r2 != r3) goto Ld1
            int r2 = r4.cueLineAnchor
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.lineAnchor
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto Ld1
            float r2 = r4.cuePosition
            float r3 = r5.position
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Ld1
            int r2 = r4.cuePositionAnchor
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.positionAnchor
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto Ld1
            float r2 = r4.cueSize
            float r3 = r5.size
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Ld1
            float r2 = r4.cueBitmapHeight
            float r3 = r5.bitmapHeight
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Ld1
            int r2 = r4.foregroundColor
            int r3 = r6.foregroundColor
            if (r2 != r3) goto Ld1
            int r2 = r4.backgroundColor
            int r3 = r6.backgroundColor
            if (r2 != r3) goto Ld1
            int r2 = r4.windowColor
            if (r2 != r1) goto Ld1
            int r2 = r4.edgeType
            int r3 = r6.edgeType
            if (r2 != r3) goto Ld1
            int r2 = r4.edgeColor
            int r3 = r6.edgeColor
            if (r2 != r3) goto Ld1
            android.text.TextPaint r2 = r4.textPaint
            android.graphics.Typeface r2 = r2.getTypeface()
            android.graphics.Typeface r3 = r6.typeface
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto Ld1
            float r2 = r4.defaultTextSizePx
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ld1
            float r2 = r4.cueTextSizePx
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto Ld1
            float r2 = r4.bottomPaddingFraction
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto Ld1
            int r2 = r4.parentLeft
            if (r2 != r11) goto Ld1
            int r2 = r4.parentTop
            if (r2 != r12) goto Ld1
            int r2 = r4.parentRight
            if (r2 != r13) goto Ld1
            int r2 = r4.parentBottom
            if (r2 != r14) goto Ld1
            r4.drawLayout(r10, r0)
            return
        Ld1:
            java.lang.CharSequence r2 = r5.text
            r4.cueText = r2
            android.text.Layout$Alignment r2 = r5.textAlignment
            r4.cueTextAlignment = r2
            android.graphics.Bitmap r2 = r5.bitmap
            r4.cueBitmap = r2
            float r2 = r5.line
            r4.cueLine = r2
            int r2 = r5.lineType
            r4.cueLineType = r2
            int r2 = r5.lineAnchor
            r4.cueLineAnchor = r2
            float r2 = r5.position
            r4.cuePosition = r2
            int r2 = r5.positionAnchor
            r4.cuePositionAnchor = r2
            float r2 = r5.size
            r4.cueSize = r2
            float r5 = r5.bitmapHeight
            r4.cueBitmapHeight = r5
            int r5 = r6.foregroundColor
            r4.foregroundColor = r5
            int r5 = r6.backgroundColor
            r4.backgroundColor = r5
            r4.windowColor = r1
            int r5 = r6.edgeType
            r4.edgeType = r5
            int r5 = r6.edgeColor
            r4.edgeColor = r5
            android.text.TextPaint r5 = r4.textPaint
            android.graphics.Typeface r6 = r6.typeface
            r5.setTypeface(r6)
            r4.defaultTextSizePx = r7
            r4.cueTextSizePx = r8
            r4.bottomPaddingFraction = r9
            r4.parentLeft = r11
            r4.parentTop = r12
            r4.parentRight = r13
            r4.parentBottom = r14
            if (r0 == 0) goto L12b
            java.lang.CharSequence r5 = r4.cueText
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            r4.setupTextLayout()
            goto L133
        L12b:
            android.graphics.Bitmap r5 = r4.cueBitmap
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            r4.setupBitmapLayout()
        L133:
            r4.drawLayout(r10, r0)
            return
    }
}
