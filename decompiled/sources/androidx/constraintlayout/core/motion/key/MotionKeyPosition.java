package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyPosition extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public java.lang.String mTransitionEasing;

    public MotionKeyPosition() {
            r2 = this;
            r2.<init>()
            int r0 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            r2.mCurveFit = r0
            r1 = 0
            r2.mTransitionEasing = r1
            r2.mPathMotionArc = r0
            r0 = 0
            r2.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.mPercentWidth = r1
            r2.mPercentHeight = r1
            r2.mPercentX = r1
            r2.mPercentY = r1
            r2.mAltPercentX = r1
            r2.mAltPercentY = r1
            r2.mPositionType = r0
            r2.mCalculatedPositionX = r1
            r2.mCalculatedPositionY = r1
            r0 = 2
            r2.mType = r0
            return
    }

    private void calcCartesianPosition(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r8 = r8 - r6
            float r9 = r9 - r7
            float r0 = r5.mPercentX
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            float r0 = r5.mPercentX
        Lf:
            float r2 = r5.mAltPercentY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L19
            r2 = 0
            goto L1b
        L19:
            float r2 = r5.mAltPercentY
        L1b:
            float r3 = r5.mPercentY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L25
            r3 = 0
            goto L27
        L25:
            float r3 = r5.mPercentY
        L27:
            float r4 = r5.mAltPercentX
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L30
            goto L32
        L30:
            float r1 = r5.mAltPercentX
        L32:
            float r0 = r0 * r8
            float r0 = r0 + r6
            float r1 = r1 * r9
            float r1 = r1 + r0
            int r6 = (int) r1
            float r6 = (float) r6
            r5.mCalculatedPositionX = r6
            float r8 = r8 * r2
            float r8 = r8 + r7
            float r9 = r9 * r3
            float r9 = r9 + r8
            int r6 = (int) r9
            float r6 = (float) r6
            r5.mCalculatedPositionY = r6
            return
    }

    private void calcPathPosition(float r4, float r5, float r6, float r7) {
            r3 = this;
            float r6 = r6 - r4
            float r7 = r7 - r5
            float r0 = -r7
            float r1 = r3.mPercentX
            float r2 = r6 * r1
            float r2 = r2 + r4
            float r4 = r3.mPercentY
            float r0 = r0 * r4
            float r0 = r0 + r2
            r3.mCalculatedPositionX = r0
            float r7 = r7 * r1
            float r7 = r7 + r5
            float r6 = r6 * r4
            float r6 = r6 + r7
            r3.mCalculatedPositionY = r6
            return
    }

    private void calcScreenPosition(int r4, int r5) {
            r3 = this;
            r0 = 0
            int r4 = r4 - r0
            float r4 = (float) r4
            float r1 = r3.mPercentX
            float r4 = r4 * r1
            float r2 = (float) r0
            float r4 = r4 + r2
            r3.mCalculatedPositionX = r4
            int r5 = r5 - r0
            float r4 = (float) r5
            float r4 = r4 * r1
            float r4 = r4 + r2
            r3.mCalculatedPositionY = r4
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey clone() {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r0 = new androidx.constraintlayout.core.motion.key.MotionKeyPosition
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo4clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r2 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mPathMotionArc
            r1.mPathMotionArc = r0
            int r0 = r2.mDrawPath
            r1.mDrawPath = r0
            float r0 = r2.mPercentWidth
            r1.mPercentWidth = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mPercentHeight = r0
            float r0 = r2.mPercentX
            r1.mPercentX = r0
            float r0 = r2.mPercentY
            r1.mPercentY = r0
            float r0 = r2.mAltPercentX
            r1.mAltPercentX = r0
            float r0 = r2.mAltPercentY
            r1.mAltPercentY = r0
            float r0 = r2.mCalculatedPositionX
            r1.mCalculatedPositionX = r0
            float r2 = r2.mCalculatedPositionY
            r1.mCalculatedPositionY = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.CC.getId(r1)
            return r1
    }

    public boolean intersects(int r6, int r7, androidx.constraintlayout.core.motion.utils.FloatRect r8, androidx.constraintlayout.core.motion.utils.FloatRect r9, float r10, float r11) {
            r5 = this;
            float r0 = r8.centerX()
            float r8 = r8.centerY()
            float r1 = r9.centerX()
            float r9 = r9.centerY()
            int r2 = r5.mPositionType
            r3 = 1
            if (r2 == r3) goto L20
            r4 = 2
            if (r2 == r4) goto L1c
            r5.calcCartesianPosition(r0, r8, r1, r9)
            goto L23
        L1c:
            r5.calcScreenPosition(r6, r7)
            goto L23
        L20:
            r5.calcPathPosition(r0, r8, r1, r9)
        L23:
            float r6 = r5.mCalculatedPositionX
            float r10 = r10 - r6
            float r6 = java.lang.Math.abs(r10)
            r7 = 1101004800(0x41a00000, float:20.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L3c
            float r6 = r5.mCalculatedPositionY
            float r11 = r11 - r6
            float r6 = java.lang.Math.abs(r11)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L3c
            return r3
        L3c:
            r6 = 0
            return r6
    }

    public void positionAttributes(androidx.constraintlayout.core.motion.MotionWidget r16, androidx.constraintlayout.core.motion.utils.FloatRect r17, androidx.constraintlayout.core.motion.utils.FloatRect r18, float r19, float r20, java.lang.String[] r21, float[] r22) {
            r15 = this;
            r0 = r15
            int r1 = r0.mPositionType
            java.lang.String r2 = "percentY"
            java.lang.String r3 = "percentX"
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L9a
            r6 = 2
            if (r1 == r6) goto L51
            float r1 = r17.centerX()
            float r6 = r17.centerY()
            float r7 = r18.centerX()
            float r8 = r18.centerY()
            float r7 = r7 - r1
            float r8 = r8 - r6
            r9 = r21[r4]
            if (r9 == 0) goto L42
            r2 = r21[r4]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L37
            float r1 = r19 - r1
            float r1 = r1 / r7
            r22[r4] = r1
            float r1 = r20 - r6
            float r1 = r1 / r8
            r22[r5] = r1
            goto L50
        L37:
            float r1 = r19 - r1
            float r1 = r1 / r7
            r22[r5] = r1
            float r1 = r20 - r6
            float r1 = r1 / r8
            r22[r4] = r1
            goto L50
        L42:
            r21[r4] = r3
            float r1 = r19 - r1
            float r1 = r1 / r7
            r22[r4] = r1
            r21[r5] = r2
            float r1 = r20 - r6
            float r1 = r1 / r8
            r22[r5] = r1
        L50:
            return
        L51:
            r17.centerX()
            r17.centerY()
            r18.centerX()
            r18.centerY()
            androidx.constraintlayout.core.motion.MotionWidget r1 = r16.getParent()
            int r6 = r1.getWidth()
            int r1 = r1.getHeight()
            r7 = r21[r4]
            if (r7 == 0) goto L8b
            r2 = r21[r4]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
            float r2 = (float) r6
            float r2 = r19 / r2
            r22[r4] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r5] = r1
            goto L99
        L80:
            float r2 = (float) r6
            float r2 = r19 / r2
            r22[r5] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r4] = r1
            goto L99
        L8b:
            r21[r4] = r3
            float r3 = (float) r6
            float r3 = r19 / r3
            r22[r4] = r3
            r21[r5] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r5] = r1
        L99:
            return
        L9a:
            float r1 = r17.centerX()
            float r6 = r17.centerY()
            float r7 = r18.centerX()
            float r8 = r18.centerY()
            float r7 = r7 - r1
            float r8 = r8 - r6
            double r9 = (double) r7
            double r11 = (double) r8
            double r9 = java.lang.Math.hypot(r9, r11)
            float r9 = (float) r9
            double r10 = (double) r9
            r12 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto Lca
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "distance ~ 0"
            r1.println(r2)
            r1 = 0
            r22[r4] = r1
            r22[r5] = r1
            goto Lf5
        Lca:
            float r7 = r7 / r9
            float r8 = r8 / r9
            float r6 = r20 - r6
            float r10 = r7 * r6
            float r1 = r19 - r1
            float r11 = r1 * r8
            float r10 = r10 - r11
            float r10 = r10 / r9
            float r7 = r7 * r1
            float r8 = r8 * r6
            float r8 = r8 + r7
            float r8 = r8 / r9
            r1 = r21[r4]
            if (r1 == 0) goto Led
            r1 = r21[r4]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lf5
            r22[r4] = r8
            r22[r5] = r10
            goto Lf5
        Led:
            r21[r4] = r3
            r21[r5] = r2
            r22[r4] = r8
            r22[r5] = r10
        Lf5:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, float r2) {
            r0 = this;
            switch(r1) {
                case 503: goto L16;
                case 504: goto L13;
                case 505: goto Le;
                case 506: goto Lb;
                case 507: goto L8;
                default: goto L3;
            }
        L3:
            boolean r1 = super.setValue(r1, r2)
            return r1
        L8:
            r0.mPercentY = r2
            goto L18
        Lb:
            r0.mPercentX = r2
            goto L18
        Le:
            r0.mPercentWidth = r2
            r0.mPercentHeight = r2
            goto L18
        L13:
            r0.mPercentHeight = r2
            goto L18
        L16:
            r0.mPercentWidth = r2
        L18:
            r1 = 1
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L17
            r0 = 508(0x1fc, float:7.12E-43)
            if (r2 == r0) goto L14
            r0 = 510(0x1fe, float:7.15E-43)
            if (r2 == r0) goto L11
            boolean r2 = super.setValue(r2, r3)
            return r2
        L11:
            r1.mPositionType = r3
            goto L19
        L14:
            r1.mCurveFit = r3
            goto L19
        L17:
            r1.mFramePosition = r3
        L19:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 501(0x1f5, float:7.02E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            java.lang.String r2 = r3.toString()
            r1.mTransitionEasing = r2
            r2 = 1
            return r2
    }
}
