package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends android.view.View implements com.google.android.exoplayer2.ui.SubtitleView.Output {
    private float bottomPaddingFraction;
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private final java.util.List<com.google.android.exoplayer2.ui.SubtitlePainter> painters;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CanvasSubtitleOutput(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.painters = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.cues = r1
            r1 = 0
            r0.textSizeType = r1
            r1 = 1029329178(0x3d5a511a, float:0.0533)
            r0.textSize = r1
            com.google.android.exoplayer2.ui.CaptionStyleCompat r1 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            r0.style = r1
            r1 = 1034147594(0x3da3d70a, float:0.08)
            r0.bottomPaddingFraction = r1
            return
    }

    private static com.google.android.exoplayer2.text.Cue repositionVerticalCue(com.google.android.exoplayer2.text.Cue r4) {
            com.google.android.exoplayer2.text.Cue$Builder r0 = r4.buildUpon()
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPosition(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPositionAnchor(r1)
            r1 = 0
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setTextAlignment(r1)
            int r1 = r4.lineType
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L24
            float r1 = r4.line
            float r3 = r3 - r1
            r0.setLine(r3, r2)
            goto L2c
        L24:
            float r1 = r4.line
            float r1 = -r1
            float r1 = r1 - r3
            r3 = 1
            r0.setLine(r1, r3)
        L2c:
            int r4 = r4.lineAnchor
            r1 = 2
            if (r4 == 0) goto L38
            if (r4 == r1) goto L34
            goto L3b
        L34:
            r0.setLineAnchor(r2)
            goto L3b
        L38:
            r0.setLineAnchor(r1)
        L3b:
            com.google.android.exoplayer2.text.Cue r4 = r0.build()
            return r4
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas r23) {
            r22 = this;
            r0 = r22
            java.util.List<com.google.android.exoplayer2.text.Cue> r1 = r0.cues
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lb
            return
        Lb:
            int r2 = r22.getHeight()
            int r14 = r22.getPaddingLeft()
            int r15 = r22.getPaddingTop()
            int r3 = r22.getWidth()
            int r4 = r22.getPaddingRight()
            int r13 = r3 - r4
            int r3 = r22.getPaddingBottom()
            int r12 = r2 - r3
            if (r12 <= r15) goto L8a
            if (r13 > r14) goto L2c
            goto L8a
        L2c:
            int r11 = r12 - r15
            int r3 = r0.textSizeType
            float r4 = r0.textSize
            float r16 = com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(r3, r4, r2, r11)
            r3 = 0
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 > 0) goto L3c
            return
        L3c:
            int r10 = r1.size()
            r3 = 0
            r9 = 0
        L42:
            if (r9 >= r10) goto L8a
            java.lang.Object r3 = r1.get(r9)
            com.google.android.exoplayer2.text.Cue r3 = (com.google.android.exoplayer2.text.Cue) r3
            int r4 = r3.verticalType
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r5) goto L54
            com.google.android.exoplayer2.text.Cue r3 = repositionVerticalCue(r3)
        L54:
            r4 = r3
            int r3 = r4.textSizeType
            float r5 = r4.textSize
            float r7 = com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(r3, r5, r2, r11)
            java.util.List<com.google.android.exoplayer2.ui.SubtitlePainter> r3 = r0.painters
            java.lang.Object r3 = r3.get(r9)
            com.google.android.exoplayer2.ui.SubtitlePainter r3 = (com.google.android.exoplayer2.ui.SubtitlePainter) r3
            com.google.android.exoplayer2.ui.CaptionStyleCompat r5 = r0.style
            float r8 = r0.bottomPaddingFraction
            r6 = r16
            r17 = r9
            r9 = r23
            r18 = r10
            r10 = r14
            r19 = r11
            r11 = r15
            r20 = r12
            r12 = r13
            r21 = r13
            r13 = r20
            r3.draw(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r9 = r17 + 1
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            goto L42
        L8a:
            return
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(java.util.List<com.google.android.exoplayer2.text.Cue> r1, com.google.android.exoplayer2.ui.CaptionStyleCompat r2, float r3, int r4, float r5) {
            r0 = this;
            r0.cues = r1
            r0.style = r2
            r0.textSize = r3
            r0.textSizeType = r4
            r0.bottomPaddingFraction = r5
        La:
            java.util.List<com.google.android.exoplayer2.ui.SubtitlePainter> r2 = r0.painters
            int r2 = r2.size()
            int r3 = r1.size()
            if (r2 >= r3) goto L25
            java.util.List<com.google.android.exoplayer2.ui.SubtitlePainter> r2 = r0.painters
            com.google.android.exoplayer2.ui.SubtitlePainter r3 = new com.google.android.exoplayer2.ui.SubtitlePainter
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4)
            r2.add(r3)
            goto La
        L25:
            r0.invalidate()
            return
    }
}
