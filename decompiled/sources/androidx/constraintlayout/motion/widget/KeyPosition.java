package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
public class KeyPosition extends androidx.constraintlayout.motion.widget.KeyPositionBase {
    public static final java.lang.String DRAWPATH = "drawPath";
    public static final java.lang.String PERCENT_HEIGHT = "percentHeight";
    public static final java.lang.String PERCENT_WIDTH = "percentWidth";
    public static final java.lang.String PERCENT_X = "percentX";
    public static final java.lang.String PERCENT_Y = "percentY";
    public static final java.lang.String SIZE_PERCENT = "sizePercent";
    private static final java.lang.String TAG = "KeyPosition";
    public static final java.lang.String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public java.lang.String mTransitionEasing;

    public static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_motionTarget
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_framePosition
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_curveFit
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_drawPath
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_percentX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_percentY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_keyPositionType
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_sizePercent
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_percentWidth
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_percentHeight
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyPosition_pathMotionArc
                r2 = 10
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void access$000(androidx.constraintlayout.motion.widget.KeyPosition r0, android.content.res.TypedArray r1) {
                read(r0, r1)
                return
        }

        private static void read(androidx.constraintlayout.motion.widget.KeyPosition r8, android.content.res.TypedArray r9) {
                int r0 = r9.getIndexCount()
                r1 = 0
                r2 = 0
            L6:
                java.lang.String r3 = "KeyPosition"
                r4 = -1
                if (r2 >= r0) goto Lea
                int r5 = r9.getIndex(r2)
                android.util.SparseIntArray r6 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r6 = r6.get(r5)
                r7 = 3
                switch(r6) {
                    case 1: goto Lba;
                    case 2: goto Lb1;
                    case 3: goto L97;
                    case 4: goto L8e;
                    case 5: goto L85;
                    case 6: goto L7c;
                    case 7: goto L72;
                    case 8: goto L66;
                    case 9: goto L5c;
                    case 10: goto L52;
                    case 11: goto L48;
                    case 12: goto L3e;
                    default: goto L19;
                }
            L19:
                java.lang.String r4 = "unused attribute 0x"
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                java.lang.String r6 = java.lang.Integer.toHexString(r5)
                r4.append(r6)
                java.lang.String r6 = "   "
                r4.append(r6)
                android.util.SparseIntArray r6 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r5 = r6.get(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.e(r3, r4)
                goto Le6
            L3e:
                float r3 = r8.mPercentHeight
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentHeight = r3
                goto Le6
            L48:
                float r3 = r8.mPercentWidth
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentWidth = r3
                goto Le6
            L52:
                int r3 = r8.mPathMotionArc
                int r3 = r9.getInt(r5, r3)
                r8.mPathMotionArc = r3
                goto Le6
            L5c:
                int r3 = r8.mPositionType
                int r3 = r9.getInt(r5, r3)
                r8.mPositionType = r3
                goto Le6
            L66:
                float r3 = r8.mPercentHeight
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentWidth = r3
                r8.mPercentHeight = r3
                goto Le6
            L72:
                float r3 = r8.mPercentY
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentY = r3
                goto Le6
            L7c:
                float r3 = r8.mPercentX
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentX = r3
                goto Le6
            L85:
                int r3 = r8.mDrawPath
                int r3 = r9.getInt(r5, r3)
                r8.mDrawPath = r3
                goto Le6
            L8e:
                int r3 = r8.mCurveFit
                int r3 = r9.getInteger(r5, r3)
                r8.mCurveFit = r3
                goto Le6
            L97:
                android.util.TypedValue r3 = r9.peekValue(r5)
                int r3 = r3.type
                if (r3 != r7) goto La6
                java.lang.String r3 = r9.getString(r5)
                r8.mTransitionEasing = r3
                goto Le6
            La6:
                java.lang.String[] r3 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
                int r4 = r9.getInteger(r5, r1)
                r3 = r3[r4]
                r8.mTransitionEasing = r3
                goto Le6
            Lb1:
                int r3 = r8.mFramePosition
                int r3 = r9.getInt(r5, r3)
                r8.mFramePosition = r3
                goto Le6
            Lba:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Lcf
                int r3 = r8.mTargetId
                int r3 = r9.getResourceId(r5, r3)
                r8.mTargetId = r3
                if (r3 != r4) goto Le6
                java.lang.String r3 = r9.getString(r5)
                r8.mTargetString = r3
                goto Le6
            Lcf:
                android.util.TypedValue r3 = r9.peekValue(r5)
                int r3 = r3.type
                if (r3 != r7) goto Lde
                java.lang.String r3 = r9.getString(r5)
                r8.mTargetString = r3
                goto Le6
            Lde:
                int r3 = r8.mTargetId
                int r3 = r9.getResourceId(r5, r3)
                r8.mTargetId = r3
            Le6:
                int r2 = r2 + 1
                goto L6
            Lea:
                int r8 = r8.mFramePosition
                if (r8 != r4) goto Lf3
                java.lang.String r8 = "no frame position"
                android.util.Log.e(r3, r8)
            Lf3:
                return
        }
    }

    public KeyPosition() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mTransitionEasing = r0
            int r0 = androidx.constraintlayout.motion.widget.Key.UNSET
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyPosition r0 = new androidx.constraintlayout.motion.widget.KeyPosition
            r0.<init>()
            androidx.constraintlayout.motion.widget.Key r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo7clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.motion.widget.Key r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.motion.widget.KeyPosition r2 = (androidx.constraintlayout.motion.widget.KeyPosition) r2
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

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int r6, int r7, android.graphics.RectF r8, android.graphics.RectF r9, float r10, float r11) {
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyPosition
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyPosition.Loader.access$000(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(android.view.View r16, android.graphics.RectF r17, android.graphics.RectF r18, float r19, float r20, java.lang.String[] r21, float[] r22) {
            r15 = this;
            r0 = r15
            int r1 = r0.mPositionType
            java.lang.String r2 = "percentY"
            java.lang.String r3 = "percentX"
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L9c
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
            android.view.ViewParent r1 = r16.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r6 = r1.getWidth()
            int r1 = r1.getHeight()
            r7 = r21[r4]
            if (r7 == 0) goto L8d
            r2 = r21[r4]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L82
            float r2 = (float) r6
            float r2 = r19 / r2
            r22[r4] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r5] = r1
            goto L9b
        L82:
            float r2 = (float) r6
            float r2 = r19 / r2
            r22[r5] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r4] = r1
            goto L9b
        L8d:
            r21[r4] = r3
            float r3 = (float) r6
            float r3 = r19 / r3
            r22[r4] = r3
            r21[r5] = r2
            float r1 = (float) r1
            float r1 = r20 / r1
            r22[r5] = r1
        L9b:
            return
        L9c:
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
            if (r14 >= 0) goto Lcc
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "distance ~ 0"
            r1.println(r2)
            r1 = 0
            r22[r4] = r1
            r22[r5] = r1
            goto Lf7
        Lcc:
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
            if (r1 == 0) goto Lef
            r1 = r21[r4]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lf7
            r22[r4] = r8
            r22[r5] = r10
            goto Lf7
        Lef:
            r21[r4] = r3
            r21[r5] = r2
            r22[r4] = r8
            r22[r5] = r10
        Lf7:
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.mPositionType = r1
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1812823328: goto L4f;
                case -1127236479: goto L44;
                case -1017587252: goto L39;
                case -827014263: goto L2e;
                case -200259324: goto L22;
                case 428090547: goto L17;
                case 428090548: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L5a
        Lc:
            java.lang.String r0 = "percentY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L15
            goto L5a
        L15:
            r1 = 6
            goto L5a
        L17:
            java.lang.String r0 = "percentX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L20
            goto L5a
        L20:
            r1 = 5
            goto L5a
        L22:
            java.lang.String r0 = "sizePercent"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c
            goto L5a
        L2c:
            r1 = 4
            goto L5a
        L2e:
            java.lang.String r0 = "drawPath"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37
            goto L5a
        L37:
            r1 = 3
            goto L5a
        L39:
            java.lang.String r0 = "percentHeight"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto L5a
        L42:
            r1 = 2
            goto L5a
        L44:
            java.lang.String r0 = "percentWidth"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4d
            goto L5a
        L4d:
            r1 = 1
            goto L5a
        L4f:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L59
            goto L5a
        L59:
            r1 = 0
        L5a:
            switch(r1) {
                case 0: goto L8a;
                case 1: goto L83;
                case 2: goto L7c;
                case 3: goto L75;
                case 4: goto L6c;
                case 5: goto L65;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L90
        L5e:
            float r3 = r2.toFloat(r4)
            r2.mPercentY = r3
            goto L90
        L65:
            float r3 = r2.toFloat(r4)
            r2.mPercentX = r3
            goto L90
        L6c:
            float r3 = r2.toFloat(r4)
            r2.mPercentWidth = r3
            r2.mPercentHeight = r3
            goto L90
        L75:
            int r3 = r2.toInt(r4)
            r2.mDrawPath = r3
            goto L90
        L7c:
            float r3 = r2.toFloat(r4)
            r2.mPercentHeight = r3
            goto L90
        L83:
            float r3 = r2.toFloat(r4)
            r2.mPercentWidth = r3
            goto L90
        L8a:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
        L90:
            return
    }
}
