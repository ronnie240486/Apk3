package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
class MotionPaths implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionPaths> {
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final java.lang.String TAG = "MotionPaths";
    public static java.lang.String[] names;
    public java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes;
    public float height;
    public int mAnimateRelativeTo;
    public int mDrawPath;
    public androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mProgress;
    public float mRelativeAngle;
    public androidx.constraintlayout.motion.widget.MotionController mRelativeToController;
    public double[] mTempDelta;
    public double[] mTempValue;
    public float position;
    public float time;
    public float width;
    public float x;
    public float y;

    static {
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.constraintlayout.motion.widget.MotionPaths.names = r0
            return
    }

    public MotionPaths() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mPathRotate = r1
            r3.mProgress = r1
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r3.mPathMotionArc = r2
            r3.mAnimateRelativeTo = r2
            r3.mRelativeAngle = r1
            r1 = 0
            r3.mRelativeToController = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.attributes = r1
            r3.mMode = r0
            r0 = 18
            double[] r1 = new double[r0]
            r3.mTempValue = r1
            double[] r0 = new double[r0]
            r3.mTempDelta = r0
            return
    }

    public MotionPaths(int r18, int r19, androidx.constraintlayout.motion.widget.KeyPosition r20, androidx.constraintlayout.motion.widget.MotionPaths r21, androidx.constraintlayout.motion.widget.MotionPaths r22) {
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r17.<init>()
            r4 = 0
            r0.mDrawPath = r4
            r5 = 2143289344(0x7fc00000, float:NaN)
            r0.mPathRotate = r5
            r0.mProgress = r5
            int r6 = androidx.constraintlayout.motion.widget.Key.UNSET
            r0.mPathMotionArc = r6
            r0.mAnimateRelativeTo = r6
            r0.mRelativeAngle = r5
            r5 = 0
            r0.mRelativeToController = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r0.attributes = r5
            r0.mMode = r4
            r4 = 18
            double[] r5 = new double[r4]
            r0.mTempValue = r5
            double[] r4 = new double[r4]
            r0.mTempDelta = r4
            int r4 = r2.mAnimateRelativeTo
            int r5 = androidx.constraintlayout.motion.widget.Key.UNSET
            r6 = 2
            r7 = 1
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r4 == r5) goto L11d
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            float r4 = r4 / r8
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            int r5 = r1.mPositionType
            r0.mMode = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L54
            r5 = r4
            goto L56
        L54:
            float r5 = r1.mPercentWidth
        L56:
            float r8 = r1.mPercentHeight
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L60
            r8 = r4
            goto L62
        L60:
            float r8 = r1.mPercentHeight
        L62:
            float r9 = r3.width
            float r10 = r2.width
            float r9 = r9 - r10
            float r11 = r3.height
            float r12 = r2.height
            float r11 = r11 - r12
            float r13 = r0.time
            r0.position = r13
            float r9 = r9 * r5
            float r9 = r9 + r10
            int r9 = (int) r9
            float r9 = (float) r9
            r0.width = r9
            float r11 = r11 * r8
            float r11 = r11 + r12
            int r9 = (int) r11
            float r9 = (float) r9
            r0.height = r9
            int r9 = r1.mPositionType
            if (r9 == r7) goto Le1
            if (r9 == r6) goto Lb0
            float r5 = r1.mPercentX
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L8e
            r5 = r4
            goto L90
        L8e:
            float r5 = r1.mPercentX
        L90:
            float r6 = r3.x
            float r7 = r2.x
            float r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7, r5, r7)
            r0.x = r5
            float r5 = r1.mPercentY
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto La3
            goto La5
        La3:
            float r4 = r1.mPercentY
        La5:
            float r3 = r3.y
            float r5 = r2.y
            float r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r4, r5)
            r0.y = r3
            goto L10c
        Lb0:
            float r6 = r1.mPercentX
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto Lc1
            float r5 = r3.x
            float r6 = r2.x
            float r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6, r4, r6)
            goto Lc9
        Lc1:
            float r6 = r1.mPercentX
            float r5 = java.lang.Math.min(r8, r5)
            float r5 = r5 * r6
        Lc9:
            r0.x = r5
            float r5 = r1.mPercentY
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto Ldc
            float r3 = r3.y
            float r5 = r2.y
            float r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r4, r5)
            goto Lde
        Ldc:
            float r3 = r1.mPercentY
        Lde:
            r0.y = r3
            goto L10c
        Le1:
            float r5 = r1.mPercentX
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto Leb
            r5 = r4
            goto Led
        Leb:
            float r5 = r1.mPercentX
        Led:
            float r6 = r3.x
            float r7 = r2.x
            float r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7, r5, r7)
            r0.x = r5
            float r5 = r1.mPercentY
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L100
            goto L102
        L100:
            float r4 = r1.mPercentY
        L102:
            float r3 = r3.y
            float r5 = r2.y
            float r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r4, r5)
            r0.y = r3
        L10c:
            int r2 = r2.mAnimateRelativeTo
            r0.mAnimateRelativeTo = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
        L11d:
            int r4 = r1.mPositionType
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 == r7) goto L29f
            if (r4 == r6) goto L1ed
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            float r4 = r4 / r8
            r0.time = r4
            int r6 = r1.mDrawPath
            r0.mDrawPath = r6
            float r6 = r1.mPercentWidth
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L139
            r6 = r4
            goto L13b
        L139:
            float r6 = r1.mPercentWidth
        L13b:
            float r7 = r1.mPercentHeight
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L145
            r7 = r4
            goto L147
        L145:
            float r7 = r1.mPercentHeight
        L147:
            float r8 = r3.width
            float r9 = r2.width
            float r10 = r8 - r9
            float r11 = r3.height
            float r12 = r2.height
            float r13 = r11 - r12
            float r14 = r0.time
            r0.position = r14
            float r14 = r2.x
            float r15 = r9 / r5
            float r15 = r15 + r14
            float r1 = r2.y
            float r16 = r12 / r5
            float r16 = r16 + r1
            float r2 = r3.x
            float r8 = r8 / r5
            float r8 = r8 + r2
            float r2 = r3.y
            float r11 = r11 / r5
            float r11 = r11 + r2
            float r8 = r8 - r15
            float r11 = r11 - r16
            float r2 = r8 * r4
            float r2 = r2 + r14
            float r10 = r10 * r6
            float r3 = r10 / r5
            float r2 = r2 - r3
            int r2 = (int) r2
            float r2 = (float) r2
            r0.x = r2
            float r2 = r11 * r4
            float r2 = r2 + r1
            float r13 = r13 * r7
            float r1 = r13 / r5
            float r2 = r2 - r1
            int r2 = (int) r2
            float r2 = (float) r2
            r0.y = r2
            float r9 = r9 + r10
            int r2 = (int) r9
            float r2 = (float) r2
            r0.width = r2
            float r12 = r12 + r13
            int r2 = (int) r12
            float r2 = (float) r2
            r0.height = r2
            r2 = r20
            float r5 = r2.mPercentX
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L19b
            r5 = r4
            goto L19d
        L19b:
            float r5 = r2.mPercentX
        L19d:
            float r6 = r2.mAltPercentY
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L1a7
            r6 = 0
            goto L1a9
        L1a7:
            float r6 = r2.mAltPercentY
        L1a9:
            float r7 = r2.mPercentY
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L1b2
            goto L1b4
        L1b2:
            float r4 = r2.mPercentY
        L1b4:
            float r7 = r2.mAltPercentX
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L1bf
            r7 = 0
            r9 = 0
            goto L1c2
        L1bf:
            float r9 = r2.mAltPercentX
            r7 = 0
        L1c2:
            r0.mMode = r7
            r7 = r21
            float r10 = r7.x
            float r5 = r5 * r8
            float r5 = r5 + r10
            float r9 = r9 * r11
            float r9 = r9 + r5
            float r9 = r9 - r3
            int r3 = (int) r9
            float r3 = (float) r3
            r0.x = r3
            float r3 = r7.y
            float r8 = r8 * r6
            float r8 = r8 + r3
            float r11 = r11 * r4
            float r11 = r11 + r8
            float r11 = r11 - r1
            int r1 = (int) r11
            float r1 = (float) r1
            r0.y = r1
            java.lang.String r1 = r2.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            r0.mKeyFrameEasing = r1
            int r1 = r2.mPathMotionArc
            r0.mPathMotionArc = r1
            return
        L1ed:
            r7 = r2
            r2 = r1
            int r1 = r2.mFramePosition
            float r1 = (float) r1
            float r1 = r1 / r8
            r0.time = r1
            int r4 = r2.mDrawPath
            r0.mDrawPath = r4
            float r4 = r2.mPercentWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L203
            r4 = r1
            goto L205
        L203:
            float r4 = r2.mPercentWidth
        L205:
            float r6 = r2.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L20f
            r6 = r1
            goto L211
        L20f:
            float r6 = r2.mPercentHeight
        L211:
            float r8 = r3.width
            float r9 = r7.width
            float r10 = r8 - r9
            float r11 = r3.height
            float r12 = r7.height
            float r13 = r11 - r12
            float r14 = r0.time
            r0.position = r14
            float r14 = r7.x
            float r15 = r9 / r5
            float r15 = r15 + r14
            float r7 = r7.y
            float r16 = r12 / r5
            float r16 = r16 + r7
            float r2 = r3.x
            float r8 = r8 / r5
            float r8 = r8 + r2
            float r2 = r3.y
            float r11 = r11 / r5
            float r11 = r11 + r2
            float r8 = r8 - r15
            float r11 = r11 - r16
            float r8 = r8 * r1
            float r8 = r8 + r14
            float r10 = r10 * r4
            float r2 = r10 / r5
            float r8 = r8 - r2
            int r2 = (int) r8
            float r2 = (float) r2
            r0.x = r2
            float r11 = r11 * r1
            float r11 = r11 + r7
            float r13 = r13 * r6
            float r1 = r13 / r5
            float r11 = r11 - r1
            int r1 = (int) r11
            float r1 = (float) r1
            r0.y = r1
            float r9 = r9 + r10
            int r1 = (int) r9
            float r1 = (float) r1
            r0.width = r1
            float r12 = r12 + r13
            int r1 = (int) r12
            float r1 = (float) r1
            r0.height = r1
            r1 = 2
            r0.mMode = r1
            r1 = r20
            float r2 = r1.mPercentX
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L276
            r2 = r18
            float r2 = (float) r2
            float r3 = r0.width
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentX
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.x = r2
        L276:
            float r2 = r1.mPercentY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L28e
            r2 = r19
            float r2 = (float) r2
            float r3 = r0.height
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentY
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.y = r2
        L28e:
            int r2 = r0.mAnimateRelativeTo
            r0.mAnimateRelativeTo = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
        L29f:
            r7 = r2
            int r2 = r1.mFramePosition
            float r2 = (float) r2
            float r2 = r2 / r8
            r0.time = r2
            int r4 = r1.mDrawPath
            r0.mDrawPath = r4
            float r4 = r1.mPercentWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2b4
            r4 = r2
            goto L2b6
        L2b4:
            float r4 = r1.mPercentWidth
        L2b6:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2c0
            r6 = r2
            goto L2c2
        L2c0:
            float r6 = r1.mPercentHeight
        L2c2:
            float r8 = r3.width
            float r9 = r7.width
            float r8 = r8 - r9
            float r9 = r3.height
            float r10 = r7.height
            float r9 = r9 - r10
            float r10 = r0.time
            r0.position = r10
            float r10 = r1.mPercentX
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L2d9
            goto L2db
        L2d9:
            float r2 = r1.mPercentX
        L2db:
            float r10 = r7.x
            float r11 = r7.width
            float r12 = r11 / r5
            float r12 = r12 + r10
            float r13 = r7.y
            float r14 = r7.height
            float r15 = r14 / r5
            float r15 = r15 + r13
            float r7 = r3.x
            float r1 = r3.width
            float r1 = r1 / r5
            float r1 = r1 + r7
            float r7 = r3.y
            float r3 = r3.height
            float r3 = r3 / r5
            float r3 = r3 + r7
            float r1 = r1 - r12
            float r3 = r3 - r15
            float r7 = r1 * r2
            float r10 = r10 + r7
            float r8 = r8 * r4
            float r4 = r8 / r5
            float r10 = r10 - r4
            int r10 = (int) r10
            float r10 = (float) r10
            r0.x = r10
            float r2 = r2 * r3
            float r13 = r13 + r2
            float r9 = r9 * r6
            float r5 = r9 / r5
            float r13 = r13 - r5
            int r6 = (int) r13
            float r6 = (float) r6
            r0.y = r6
            float r11 = r11 + r8
            int r6 = (int) r11
            float r6 = (float) r6
            r0.width = r6
            float r14 = r14 + r9
            int r6 = (int) r14
            float r6 = (float) r6
            r0.height = r6
            r6 = r20
            float r8 = r6.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L325
            r8 = 0
            goto L327
        L325:
            float r8 = r6.mPercentY
        L327:
            float r3 = -r3
            float r3 = r3 * r8
            float r1 = r1 * r8
            r8 = 1
            r0.mMode = r8
            r8 = r21
            float r9 = r8.x
            float r9 = r9 + r7
            float r9 = r9 - r4
            int r4 = (int) r9
            float r4 = (float) r4
            float r7 = r8.y
            float r7 = r7 + r2
            float r7 = r7 - r5
            int r2 = (int) r7
            float r2 = (float) r2
            float r4 = r4 + r3
            r0.x = r4
            float r2 = r2 + r1
            r0.y = r2
            int r1 = r0.mAnimateRelativeTo
            r0.mAnimateRelativeTo = r1
            java.lang.String r1 = r6.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            r0.mKeyFrameEasing = r1
            int r1 = r6.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    private boolean diff(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    private static final float xRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r4 = r4 - r5
            float r4 = r4 + r2
            return r4
    }

    private static final float yRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r0
            float r5 = r5 * r1
            float r5 = r5 + r4
            float r5 = r5 + r3
            return r5
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r5) {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            java.lang.String r0 = r0.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            r4.mKeyFrameEasing = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r1 = r0.mPathMotionArc
            r4.mPathMotionArc = r1
            int r1 = r0.mAnimateRelativeTo
            r4.mAnimateRelativeTo = r1
            float r1 = r0.mPathRotate
            r4.mPathRotate = r1
            int r1 = r0.mDrawPath
            r4.mDrawPath = r1
            int r0 = r0.mAnimateCircleAngleTo
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            float r0 = r0.mProgress
            r4.mProgress = r0
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r5.layout
            float r0 = r0.circleAngle
            r4.mRelativeAngle = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r5.mCustomConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            if (r2 == 0) goto L34
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L34
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.attributes
            r3.put(r1, r2)
            goto L34
        L56:
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@androidx.annotation.NonNull androidx.constraintlayout.motion.widget.MotionPaths r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull androidx.constraintlayout.motion.widget.MotionPaths r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r1 = (androidx.constraintlayout.motion.widget.MotionPaths) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public void configureRelativeTo(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            float r0 = r2.mProgress
            double r0 = (double) r0
            r3.getPos(r0)
            return
    }

    public final void different(androidx.constraintlayout.motion.widget.MotionPaths r7, boolean[] r8, boolean r9) {
            r6 = this;
            float r0 = r6.x
            float r1 = r7.x
            boolean r0 = r6.diff(r0, r1)
            float r1 = r6.y
            float r2 = r7.y
            boolean r1 = r6.diff(r1, r2)
            r2 = 0
            boolean r3 = r8[r2]
            float r4 = r6.position
            float r5 = r7.position
            boolean r4 = r6.diff(r4, r5)
            r3 = r3 | r4
            r8[r2] = r3
            r2 = 1
            boolean r3 = r8[r2]
            r0 = r0 | r1
            r9 = r9 | r0
            r0 = r3 | r9
            r8[r2] = r0
            r0 = 2
            boolean r1 = r8[r0]
            r9 = r9 | r1
            r8[r0] = r9
            r9 = 3
            boolean r0 = r8[r9]
            float r1 = r6.width
            float r2 = r7.width
            boolean r1 = r6.diff(r1, r2)
            r0 = r0 | r1
            r8[r9] = r0
            r9 = 4
            boolean r0 = r8[r9]
            float r1 = r6.height
            float r7 = r7.height
            boolean r7 = r6.diff(r1, r7)
            r7 = r7 | r0
            r8[r9] = r7
            return
    }

    public final void getCenter(double r16, int[] r18, double[] r19, float[] r20, int r21) {
            r15 = this;
            r0 = r15
            r1 = r18
            float r2 = r0.x
            float r3 = r0.y
            float r4 = r0.width
            float r5 = r0.height
            r6 = 0
            r7 = 0
        Ld:
            int r8 = r1.length
            r9 = 2
            r10 = 1
            if (r7 >= r8) goto L2c
            r11 = r19[r7]
            float r8 = (float) r11
            r11 = r1[r7]
            if (r11 == r10) goto L28
            if (r11 == r9) goto L26
            r9 = 3
            if (r11 == r9) goto L24
            r9 = 4
            if (r11 == r9) goto L22
            goto L29
        L22:
            r5 = r8
            goto L29
        L24:
            r4 = r8
            goto L29
        L26:
            r3 = r8
            goto L29
        L28:
            r2 = r8
        L29:
            int r7 = r7 + 1
            goto Ld
        L2c:
            androidx.constraintlayout.motion.widget.MotionController r1 = r0.mRelativeToController
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L5d
            float[] r8 = new float[r9]
            float[] r9 = new float[r9]
            r11 = r16
            r1.getCenter(r11, r8, r9)
            r1 = r8[r6]
            r6 = r8[r10]
            double r8 = (double) r1
            double r1 = (double) r2
            double r11 = (double) r3
            double r13 = java.lang.Math.sin(r11)
            double r13 = r13 * r1
            double r13 = r13 + r8
            float r3 = r4 / r7
            double r8 = (double) r3
            double r13 = r13 - r8
            float r3 = (float) r13
            double r8 = (double) r6
            double r11 = java.lang.Math.cos(r11)
            double r11 = r11 * r1
            double r8 = r8 - r11
            float r1 = r5 / r7
            double r1 = (double) r1
            double r8 = r8 - r1
            float r1 = (float) r8
            r2 = r3
            r3 = r1
        L5d:
            float r4 = r4 / r7
            float r4 = r4 + r2
            r1 = 0
            float r4 = r4 + r1
            r20[r21] = r4
            int r2 = r21 + 1
            float r5 = r5 / r7
            float r5 = r5 + r3
            float r5 = r5 + r1
            r20[r2] = r5
            return
    }

    public final void getRect(int[] r11, double[] r12, float[] r13, int r14) {
            r10 = this;
            float r0 = r10.x
            float r1 = r10.y
            float r2 = r10.width
            float r3 = r10.height
            r4 = 0
        L9:
            int r5 = r11.length
            if (r4 >= r5) goto L28
            r5 = r12[r4]
            float r5 = (float) r5
            r6 = r11[r4]
            r7 = 1
            if (r6 == r7) goto L24
            r7 = 2
            if (r6 == r7) goto L22
            r7 = 3
            if (r6 == r7) goto L20
            r7 = 4
            if (r6 == r7) goto L1e
            goto L25
        L1e:
            r3 = r5
            goto L25
        L20:
            r2 = r5
            goto L25
        L22:
            r1 = r5
            goto L25
        L24:
            r0 = r5
        L25:
            int r4 = r4 + 1
            goto L9
        L28:
            androidx.constraintlayout.motion.widget.MotionController r11 = r10.mRelativeToController
            if (r11 == 0) goto L55
            float r11 = r11.getCenterX()
            androidx.constraintlayout.motion.widget.MotionController r12 = r10.mRelativeToController
            float r12 = r12.getCenterY()
            double r4 = (double) r11
            double r6 = (double) r0
            double r0 = (double) r1
            double r8 = java.lang.Math.sin(r0)
            double r8 = r8 * r6
            double r8 = r8 + r4
            r11 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r11
            double r4 = (double) r4
            double r8 = r8 - r4
            float r4 = (float) r8
            double r8 = (double) r12
            double r0 = java.lang.Math.cos(r0)
            double r0 = r0 * r6
            double r8 = r8 - r0
            float r11 = r3 / r11
            double r11 = (double) r11
            double r8 = r8 - r11
            float r1 = (float) r8
            r0 = r4
        L55:
            float r2 = r2 + r0
            float r3 = r3 + r1
            r11 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r11)
            java.lang.Float.isNaN(r11)
            r11 = 0
            float r12 = r0 + r11
            float r4 = r1 + r11
            float r5 = r2 + r11
            float r1 = r1 + r11
            float r2 = r2 + r11
            float r6 = r3 + r11
            float r0 = r0 + r11
            float r3 = r3 + r11
            int r11 = r14 + 1
            r13[r14] = r12
            int r12 = r11 + 1
            r13[r11] = r4
            int r11 = r12 + 1
            r13[r12] = r5
            int r12 = r11 + 1
            r13[r11] = r1
            int r11 = r12 + 1
            r13[r12] = r2
            int r12 = r11 + 1
            r13[r11] = r6
            int r11 = r12 + 1
            r13[r12] = r0
            r13[r11] = r3
            return
    }

    public final void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public final void setDpDt(float r13, float r14, float[] r15, int[] r16, double[] r17, double[] r18) {
            r12 = this;
            r0 = r16
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L9:
            int r8 = r0.length
            r9 = 1
            if (r3 >= r8) goto L2a
            r10 = r17[r3]
            float r8 = (float) r10
            r10 = r18[r3]
            r10 = r0[r3]
            if (r10 == r9) goto L26
            r9 = 2
            if (r10 == r9) goto L24
            r9 = 3
            if (r10 == r9) goto L22
            r9 = 4
            if (r10 == r9) goto L20
            goto L27
        L20:
            r7 = r8
            goto L27
        L22:
            r5 = r8
            goto L27
        L24:
            r6 = r8
            goto L27
        L26:
            r4 = r8
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            float r0 = r2 * r5
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r4 = r4 - r0
            float r0 = r2 * r7
            float r0 = r0 / r3
            float r6 = r6 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r7 = r7 * r0
            float r5 = r5 + r4
            float r7 = r7 + r6
            float r3 = r0 - r13
            float r3 = r3 * r4
            float r5 = r5 * r13
            float r5 = r5 + r3
            float r5 = r5 + r2
            r15[r1] = r5
            float r0 = r0 - r14
            float r0 = r0 * r6
            float r7 = r7 * r14
            float r7 = r7 + r0
            float r7 = r7 + r2
            r15[r9] = r7
            return
    }

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController r6, androidx.constraintlayout.motion.widget.MotionPaths r7) {
            r5 = this;
            float r0 = r5.x
            float r1 = r5.width
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r0
            float r0 = r7.x
            float r1 = r1 - r0
            float r0 = r7.width
            float r0 = r0 / r2
            float r1 = r1 - r0
            double r0 = (double) r1
            float r3 = r5.y
            float r4 = r5.height
            float r4 = r4 / r2
            float r4 = r4 + r3
            float r3 = r7.y
            float r4 = r4 - r3
            float r7 = r7.height
            float r7 = r7 / r2
            float r4 = r4 - r7
            double r2 = (double) r4
            r5.mRelativeToController = r6
            double r6 = java.lang.Math.hypot(r2, r0)
            float r6 = (float) r6
            r5.x = r6
            float r6 = r5.mRelativeAngle
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L3d
            double r6 = java.lang.Math.atan2(r2, r0)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 + r0
            float r6 = (float) r6
            r5.y = r6
            goto L47
        L3d:
            float r6 = r5.mRelativeAngle
            double r6 = (double) r6
            double r6 = java.lang.Math.toRadians(r6)
            float r6 = (float) r6
            r5.y = r6
        L47:
            return
    }
}
