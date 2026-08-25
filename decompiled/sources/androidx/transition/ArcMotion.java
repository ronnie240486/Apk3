package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class ArcMotion extends androidx.transition.PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = 0.0f;
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    static {
            r0 = 4630122629401935872(0x4041800000000000, double:35.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r0 = (float) r0
            androidx.transition.ArcMotion.DEFAULT_MAX_TANGENT = r0
            return
    }

    public ArcMotion() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mMinimumHorizontalAngle = r0
            r2.mMinimumVerticalAngle = r0
            r1 = 1116471296(0x428c0000, float:70.0)
            r2.mMaximumAngle = r1
            r2.mMinimumHorizontalTangent = r0
            r2.mMinimumVerticalTangent = r0
            float r0 = androidx.transition.ArcMotion.DEFAULT_MAX_TANGENT
            r2.mMaximumTangent = r0
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public ArcMotion(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 0
            r4.mMinimumHorizontalAngle = r0
            r4.mMinimumVerticalAngle = r0
            r1 = 1116471296(0x428c0000, float:70.0)
            r4.mMaximumAngle = r1
            r4.mMinimumHorizontalTangent = r0
            r4.mMinimumVerticalTangent = r0
            float r2 = androidx.transition.ArcMotion.DEFAULT_MAX_TANGENT
            r4.mMaximumTangent = r2
            int[] r2 = androidx.transition.Styleable.ARC_MOTION
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2)
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6
            java.lang.String r2 = "minimumVerticalAngle"
            r3 = 1
            float r2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r5, r6, r2, r3, r0)
            r4.setMinimumVerticalAngle(r2)
            java.lang.String r2 = "minimumHorizontalAngle"
            r3 = 0
            float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r5, r6, r2, r3, r0)
            r4.setMinimumHorizontalAngle(r0)
            java.lang.String r0 = "maximumAngle"
            r2 = 2
            float r6 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r5, r6, r0, r2, r1)
            r4.setMaximumAngle(r6)
            r5.recycle()
            return
    }

    private static float toTangent(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L19
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L19
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r2 = (float) r0
            return r2
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Arc must be between 0 and 90 degrees"
            r2.<init>(r0)
            throw r2
    }

    public float getMaximumAngle() {
            r1 = this;
            float r0 = r1.mMaximumAngle
            return r0
    }

    public float getMinimumHorizontalAngle() {
            r1 = this;
            float r0 = r1.mMinimumHorizontalAngle
            return r0
    }

    public float getMinimumVerticalAngle() {
            r1 = this;
            float r0 = r1.mMinimumVerticalAngle
            return r0
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path getPath(float r12, float r13, float r14, float r15) {
            r11 = this;
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r7.moveTo(r12, r13)
            float r0 = r14 - r12
            float r1 = r15 - r13
            float r2 = r0 * r0
            float r3 = r1 * r1
            float r3 = r3 + r2
            float r2 = r12 + r14
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r5 = r13 + r15
            float r5 = r5 / r4
            r6 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r3
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L23
            r8 = 1
            goto L24
        L23:
            r8 = 0
        L24:
            float r9 = java.lang.Math.abs(r0)
            float r10 = java.lang.Math.abs(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L41
            float r1 = r1 * r4
            float r3 = r3 / r1
            float r0 = java.lang.Math.abs(r3)
            if (r8 == 0) goto L3c
            float r0 = r0 + r15
            r1 = r14
            goto L3e
        L3c:
            float r0 = r0 + r13
            r1 = r12
        L3e:
            float r3 = r11.mMinimumVerticalTangent
            goto L50
        L41:
            float r0 = r0 * r4
            float r3 = r3 / r0
            if (r8 == 0) goto L4a
            float r3 = r3 + r12
            r0 = r13
            r1 = r3
            goto L4e
        L4a:
            float r0 = r14 - r3
            r1 = r0
            r0 = r15
        L4e:
            float r3 = r11.mMinimumHorizontalTangent
        L50:
            float r8 = r6 * r3
            float r8 = r8 * r3
            float r3 = r2 - r1
            float r9 = r5 - r0
            float r3 = r3 * r3
            float r9 = r9 * r9
            float r9 = r9 + r3
            float r3 = r11.mMaximumTangent
            float r6 = r6 * r3
            float r6 = r6 * r3
            r3 = 0
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 >= 0) goto L69
            goto L70
        L69:
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 <= 0) goto L6f
            r8 = r6
            goto L70
        L6f:
            r8 = 0
        L70:
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L83
            float r8 = r8 / r9
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r3 = (float) r8
            float r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r2)
            float r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r3, r5)
        L83:
            float r12 = r12 + r1
            float r12 = r12 / r4
            float r13 = r13 + r0
            float r2 = r13 / r4
            float r1 = r1 + r14
            float r3 = r1 / r4
            float r0 = r0 + r15
            float r4 = r0 / r4
            r0 = r7
            r1 = r12
            r5 = r14
            r6 = r15
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public void setMaximumAngle(float r1) {
            r0 = this;
            r0.mMaximumAngle = r1
            float r1 = toTangent(r1)
            r0.mMaximumTangent = r1
            return
    }

    public void setMinimumHorizontalAngle(float r1) {
            r0 = this;
            r0.mMinimumHorizontalAngle = r1
            float r1 = toTangent(r1)
            r0.mMinimumHorizontalTangent = r1
            return
    }

    public void setMinimumVerticalAngle(float r1) {
            r0 = this;
            r0.mMinimumVerticalAngle = r1
            float r1 = toTangent(r1)
            r0.mMinimumVerticalTangent = r1
            return
    }
}
