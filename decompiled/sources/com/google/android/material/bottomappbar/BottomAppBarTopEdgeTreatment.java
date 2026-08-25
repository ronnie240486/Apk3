package com.google.android.material.bottomappbar;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends com.google.android.material.shape.EdgeTreatment implements java.lang.Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float r2, float r3, float r4) {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.fabCornerSize = r0
            r1.fabMargin = r2
            r1.roundedCornerRadius = r3
            r1.setCradleVerticalOffset(r4)
            r2 = 0
            r1.horizontalOffset = r2
            return
    }

    public final float getCradleVerticalOffset() {
            r1 = this;
            float r0 = r1.cradleVerticalOffset
            return r0
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r24, float r25, float r26, @androidx.annotation.NonNull com.google.android.material.shape.ShapePath r27) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            r9 = r27
            float r3 = r0.fabDiameter
            r10 = 0
            int r4 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r4 != 0) goto L13
            r9.lineTo(r1, r10)
            return
        L13:
            float r4 = r0.fabMargin
            r11 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r11
            float r4 = r4 + r3
            float r12 = r4 / r11
            float r4 = r0.roundedCornerRadius
            float r13 = r2 * r4
            float r4 = r0.horizontalOffset
            float r14 = r25 + r4
            float r4 = r0.cradleVerticalOffset
            float r4 = r4 * r2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r2, r12, r4)
            float r6 = r4 / r12
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L38
            r9.lineTo(r1, r10)
            return
        L38:
            float r5 = r0.fabCornerSize
            float r15 = r5 * r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L55
            float r5 = r5 * r11
            float r5 = r5 - r3
            float r2 = java.lang.Math.abs(r5)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L51
            goto L55
        L51:
            r2 = 0
            r16 = 0
            goto L58
        L55:
            r2 = 1
            r16 = 1
        L58:
            if (r16 != 0) goto L60
            r2 = 1071644672(0x3fe00000, float:1.75)
            r4 = 0
            r17 = 0
            goto L63
        L60:
            r2 = 0
            r17 = r4
        L63:
            float r3 = r12 + r13
            float r3 = r3 * r3
            float r4 = r17 + r13
            float r5 = r4 * r4
            float r3 = r3 - r5
            double r5 = (double) r3
            double r5 = java.lang.Math.sqrt(r5)
            float r3 = (float) r5
            float r5 = r14 - r3
            float r18 = r14 + r3
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.atan(r3)
            double r3 = java.lang.Math.toDegrees(r3)
            float r8 = (float) r3
            r3 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 - r8
            float r19 = r3 + r2
            r9.lineTo(r5, r10)
            float r3 = r5 - r13
            r4 = 0
            float r5 = r5 + r13
            float r20 = r13 * r11
            r7 = 1132920832(0x43870000, float:270.0)
            r2 = r27
            r6 = r20
            r21 = r8
            r2.addArc(r3, r4, r5, r6, r7, r8)
            r2 = 1127481344(0x43340000, float:180.0)
            if (r16 == 0) goto Lb3
            float r3 = r14 - r12
            float r4 = -r12
            float r4 = r4 - r17
            float r5 = r14 + r12
            float r6 = r12 - r17
            float r7 = r2 - r19
            float r19 = r19 * r11
            float r8 = r19 - r2
            r2 = r27
            r2.addArc(r3, r4, r5, r6, r7, r8)
            goto Lf9
        Lb3:
            float r3 = r0.fabMargin
            float r16 = r15 * r11
            float r4 = r3 + r16
            float r5 = r14 - r12
            float r6 = r15 + r3
            float r6 = -r6
            float r7 = r5 + r4
            float r8 = r3 + r15
            float r17 = r2 - r19
            float r3 = r19 * r11
            float r3 = r3 - r2
            float r22 = r3 / r11
            r2 = r27
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r17
            r8 = r22
            r2.addArc(r3, r4, r5, r6, r7, r8)
            float r5 = r14 + r12
            float r2 = r0.fabMargin
            float r3 = r2 / r11
            float r3 = r3 + r15
            float r3 = r5 - r3
            float r2 = r2 + r15
            r9.lineTo(r3, r2)
            float r2 = r0.fabMargin
            float r16 = r16 + r2
            float r3 = r5 - r16
            float r4 = r15 + r2
            float r4 = -r4
            float r6 = r2 + r15
            r7 = 1119092736(0x42b40000, float:90.0)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r8 = r19 + r2
            r2 = r27
            r2.addArc(r3, r4, r5, r6, r7, r8)
        Lf9:
            float r3 = r18 - r13
            r4 = 0
            float r5 = r18 + r13
            r2 = 1132920832(0x43870000, float:270.0)
            float r7 = r2 - r21
            r2 = r27
            r6 = r20
            r8 = r21
            r2.addArc(r3, r4, r5, r6, r7, r8)
            r9.lineTo(r1, r10)
            return
    }

    public float getFabCornerRadius() {
            r1 = this;
            float r0 = r1.fabCornerSize
            return r0
    }

    public final float getFabCradleMargin() {
            r1 = this;
            float r0 = r1.fabMargin
            return r0
    }

    public final float getFabCradleRoundedCornerRadius() {
            r1 = this;
            float r0 = r1.roundedCornerRadius
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
            r1 = this;
            float r0 = r1.fabDiameter
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
            r1 = this;
            float r0 = r1.horizontalOffset
            return r0
    }

    public final void setCradleVerticalOffset(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L8
            r1.cradleVerticalOffset = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cradleVerticalOffset must be positive."
            r2.<init>(r0)
            throw r2
    }

    public void setFabCornerSize(float r1) {
            r0 = this;
            r0.fabCornerSize = r1
            return
    }

    public final void setFabCradleMargin(float r1) {
            r0 = this;
            r0.fabMargin = r1
            return
    }

    public final void setFabCradleRoundedCornerRadius(float r1) {
            r0 = this;
            r0.roundedCornerRadius = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float r1) {
            r0 = this;
            r0.fabDiameter = r1
            return
    }

    public final void setHorizontalOffset(float r1) {
            r0 = this;
            r0.horizontalOffset = r1
            return
    }
}
