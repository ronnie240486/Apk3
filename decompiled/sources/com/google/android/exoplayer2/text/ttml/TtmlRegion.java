package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlRegion {
    public final float height;
    public final java.lang.String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(java.lang.String r12) {
            r11 = this;
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public TtmlRegion(java.lang.String r1, float r2, float r3, int r4, int r5, float r6, float r7, int r8, float r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.position = r2
            r0.line = r3
            r0.lineType = r4
            r0.lineAnchor = r5
            r0.width = r6
            r0.height = r7
            r0.textSizeType = r8
            r0.textSize = r9
            r0.verticalType = r10
            return
    }
}
