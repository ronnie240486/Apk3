package com.google.android.material.shadow;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private static final int[] cornerColors = null;
    private static final float[] cornerPositions = null;
    private static final int[] edgeColors = null;
    private static final float[] edgePositions = null;

    @androidx.annotation.NonNull
    private final android.graphics.Paint cornerShadowPaint;

    @androidx.annotation.NonNull
    private final android.graphics.Paint edgeShadowPaint;
    private final android.graphics.Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;

    @androidx.annotation.NonNull
    private final android.graphics.Paint shadowPaint;
    private int shadowStartColor;
    private final android.graphics.Paint transparentPaint;

    static {
            r0 = 3
            int[] r1 = new int[r0]
            com.google.android.material.shadow.ShadowRenderer.edgeColors = r1
            float[] r0 = new float[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            com.google.android.material.shadow.ShadowRenderer.edgePositions = r0
            r0 = 4
            int[] r1 = new int[r0]
            com.google.android.material.shadow.ShadowRenderer.cornerColors = r1
            float[] r0 = new float[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 0, 1056964608, 1065353216} // fill-array
            com.google.android.material.shadow.ShadowRenderer.cornerPositions = r0
            return
    }

    public ShadowRenderer() {
            r1 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.<init>(r0)
            return
    }

    public ShadowRenderer(int r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.scratch = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.transparentPaint = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r2.shadowPaint = r1
            r2.setShadowColor(r3)
            r3 = 0
            r0.setColor(r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 4
            r3.<init>(r0)
            r2.cornerShadowPaint = r3
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r3)
            r2.edgeShadowPaint = r0
            return
    }

    public void drawCornerShadow(@androidx.annotation.NonNull android.graphics.Canvas r21, @androidx.annotation.Nullable android.graphics.Matrix r22, @androidx.annotation.NonNull android.graphics.RectF r23, int r24, float r25, float r26) {
            r20 = this;
            r0 = r20
            r7 = r21
            r2 = r23
            r1 = r24
            r4 = r26
            r3 = 0
            r5 = 1
            r6 = 0
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 >= 0) goto L13
            r8 = 1
            goto L14
        L13:
            r8 = 0
        L14:
            android.graphics.Path r9 = r0.scratch
            r10 = 3
            r11 = 2
            if (r8 == 0) goto L2d
            int[] r12 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            r12[r6] = r6
            int r6 = r0.shadowEndColor
            r12[r5] = r6
            int r6 = r0.shadowMiddleColor
            r12[r11] = r6
            int r6 = r0.shadowStartColor
            r12[r10] = r6
            r12 = r25
            goto L58
        L2d:
            r9.rewind()
            float r12 = r23.centerX()
            float r13 = r23.centerY()
            r9.moveTo(r12, r13)
            r12 = r25
            r9.arcTo(r2, r12, r4)
            r9.close()
            int r13 = -r1
            float r13 = (float) r13
            r2.inset(r13, r13)
            int[] r13 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            r13[r6] = r6
            int r6 = r0.shadowStartColor
            r13[r5] = r6
            int r6 = r0.shadowMiddleColor
            r13[r11] = r6
            int r6 = r0.shadowEndColor
            r13[r10] = r6
        L58:
            float r6 = r23.width()
            r10 = 1073741824(0x40000000, float:2.0)
            float r16 = r6 / r10
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 > 0) goto L65
            return
        L65:
            float r1 = (float) r1
            float r1 = r1 / r16
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 - r1
            float r6 = r3 - r1
            float r6 = r6 / r10
            float r6 = r6 + r1
            float[] r18 = com.google.android.material.shadow.ShadowRenderer.cornerPositions
            r18[r5] = r1
            r18[r11] = r6
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            float r14 = r23.centerX()
            float r15 = r23.centerY()
            int[] r17 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            android.graphics.Paint r5 = r0.cornerShadowPaint
            r5.setShader(r1)
            r21.save()
            r21.concat(r22)
            float r1 = r23.height()
            float r5 = r23.width()
            float r1 = r1 / r5
            r7.scale(r3, r1)
            if (r8 != 0) goto Lab
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r7.clipPath(r9, r1)
            android.graphics.Paint r1 = r0.transparentPaint
            r7.drawPath(r9, r1)
        Lab:
            r5 = 1
            android.graphics.Paint r6 = r0.cornerShadowPaint
            r1 = r21
            r2 = r23
            r3 = r25
            r4 = r26
            r1.drawArc(r2, r3, r4, r5, r6)
            r21.restore()
            return
    }

    public void drawEdgeShadow(@androidx.annotation.NonNull android.graphics.Canvas r10, @androidx.annotation.Nullable android.graphics.Matrix r11, @androidx.annotation.NonNull android.graphics.RectF r12, int r13) {
            r9 = this;
            float r0 = r12.bottom
            float r1 = (float) r13
            float r0 = r0 + r1
            r12.bottom = r0
            int r13 = -r13
            float r13 = (float) r13
            r0 = 0
            r12.offset(r0, r13)
            int[] r6 = com.google.android.material.shadow.ShadowRenderer.edgeColors
            int r13 = r9.shadowEndColor
            r0 = 0
            r6[r0] = r13
            int r13 = r9.shadowMiddleColor
            r0 = 1
            r6[r0] = r13
            int r13 = r9.shadowStartColor
            r0 = 2
            r6[r0] = r13
            android.graphics.Paint r13 = r9.edgeShadowPaint
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r4 = r12.left
            float r3 = r12.top
            float r5 = r12.bottom
            float[] r7 = com.google.android.material.shadow.ShadowRenderer.edgePositions
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.setShader(r0)
            r10.save()
            r10.concat(r11)
            android.graphics.Paint r11 = r9.edgeShadowPaint
            r10.drawRect(r12, r11)
            r10.restore()
            return
    }

    public void drawInnerCornerShadow(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.Nullable android.graphics.Matrix r9, @androidx.annotation.NonNull android.graphics.RectF r10, int r11, float r12, float r13, @androidx.annotation.NonNull float[] r14) {
            r7 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7
            float r12 = r12 + r13
            float r13 = -r13
        L7:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.drawCornerShadow(r1, r2, r3, r4, r5, r6)
            android.graphics.Path r11 = r7.scratch
            r11.rewind()
            r0 = 0
            r0 = r14[r0]
            r1 = 1
            r14 = r14[r1]
            r11.moveTo(r0, r14)
            r11.arcTo(r10, r12, r13)
            r11.close()
            r8.save()
            r8.concat(r9)
            r9 = 1065353216(0x3f800000, float:1.0)
            float r12 = r10.height()
            float r10 = r10.width()
            float r12 = r12 / r10
            r8.scale(r9, r12)
            android.graphics.Paint r9 = r7.transparentPaint
            r8.drawPath(r11, r9)
            android.graphics.Paint r9 = r7.shadowPaint
            r8.drawPath(r11, r9)
            r8.restore()
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.Paint getShadowPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.shadowPaint
            return r0
    }

    public void setShadowColor(int r2) {
            r1 = this;
            r0 = 68
            int r0 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowStartColor = r0
            r0 = 20
            int r0 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowMiddleColor = r0
            r0 = 0
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowEndColor = r2
            android.graphics.Paint r2 = r1.shadowPaint
            int r0 = r1.shadowStartColor
            r2.setColor(r0)
            return
    }
}
