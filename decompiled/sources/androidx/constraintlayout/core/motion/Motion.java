package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: classes2.dex */
public class Motion implements androidx.constraintlayout.core.motion.utils.TypedValues {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final java.lang.String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION;
    private androidx.constraintlayout.core.motion.utils.CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private java.lang.String[] mAttributeNames;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> mAttributesMap;
    private int mCurveFitType;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> mCycleMap;
    private androidx.constraintlayout.core.motion.MotionPaths mEndMotionPath;
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mEndPoint;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> mKeyList;
    private androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] mKeyTriggers;
    private java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> mMotionPaths;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private androidx.constraintlayout.core.motion.utils.DifferentialInterpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    public float mStaggerScale;
    private androidx.constraintlayout.core.motion.MotionPaths mStartMotionPath;
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mStartPoint;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private androidx.constraintlayout.core.motion.MotionWidget mTransformPivotView;
    private float[] mValuesBuff;
    private float[] mVelocity;
    public androidx.constraintlayout.core.motion.MotionWidget mView;


    public Motion(androidx.constraintlayout.core.motion.MotionWidget r3) {
            r2 = this;
            r2.<init>()
            androidx.constraintlayout.core.motion.utils.Rect r0 = new androidx.constraintlayout.core.motion.utils.Rect
            r0.<init>()
            r0 = -1
            r2.mCurveFitType = r0
            androidx.constraintlayout.core.motion.MotionPaths r1 = new androidx.constraintlayout.core.motion.MotionPaths
            r1.<init>()
            r2.mStartMotionPath = r1
            androidx.constraintlayout.core.motion.MotionPaths r1 = new androidx.constraintlayout.core.motion.MotionPaths
            r1.<init>()
            r2.mEndMotionPath = r1
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = new androidx.constraintlayout.core.motion.MotionConstrainedPoint
            r1.<init>()
            r2.mStartPoint = r1
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = new androidx.constraintlayout.core.motion.MotionConstrainedPoint
            r1.<init>()
            r2.mEndPoint = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.mStaggerScale = r1
            r1 = 4
            r2.MAX_DIMENSION = r1
            float[] r1 = new float[r1]
            r2.mValuesBuff = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mMotionPaths = r1
            r1 = 1
            float[] r1 = new float[r1]
            r2.mVelocity = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mKeyList = r1
            r2.mPathMotionArc = r0
            r2.mTransformPivotTarget = r0
            r1 = 0
            r2.mTransformPivotView = r1
            r2.mQuantizeMotionSteps = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mQuantizeMotionPhase = r0
            r2.mQuantizeMotionInterpolator = r1
            r0 = 0
            r2.mNoMovement = r0
            r2.setView(r3)
            return
    }

    private float getAdjustedPosition(float r11, float[] r12) {
            r10 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r12 == 0) goto L9
            r12[r0] = r1
            goto L27
        L9:
            float r3 = r10.mStaggerScale
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L27
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            r11 = 0
        L17:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 <= 0) goto L27
            double r4 = (double) r11
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L27
            float r11 = r11 - r2
            float r11 = r11 * r3
            float r11 = java.lang.Math.min(r11, r1)
        L27:
            androidx.constraintlayout.core.motion.MotionPaths r3 = r10.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r5 = r10.mMotionPaths
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.core.motion.MotionPaths r6 = (androidx.constraintlayout.core.motion.MotionPaths) r6
            androidx.constraintlayout.core.motion.utils.Easing r7 = r6.mKeyFrameEasing
            if (r7 == 0) goto L33
            float r8 = r6.time
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4c
            r3 = r7
            r2 = r8
            goto L33
        L4c:
            boolean r7 = java.lang.Float.isNaN(r4)
            if (r7 == 0) goto L33
            float r4 = r6.time
            goto L33
        L55:
            if (r3 == 0) goto L74
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            r1 = r4
        L5f:
            float r11 = r11 - r2
            float r1 = r1 - r2
            float r11 = r11 / r1
            double r4 = (double) r11
            double r6 = r3.get(r4)
            float r11 = (float) r6
            float r11 = r11 * r1
            float r11 = r11 + r2
            if (r12 == 0) goto L74
            double r1 = r3.getDiff(r4)
            float r1 = (float) r1
            r12[r0] = r1
        L74:
            return r11
    }

    private static androidx.constraintlayout.core.motion.utils.DifferentialInterpolator getInterpolator(int r0, java.lang.String r1, int r2) {
            r2 = -1
            if (r0 == r2) goto L5
            r0 = 0
            return r0
        L5:
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            androidx.constraintlayout.core.motion.Motion$1 r1 = new androidx.constraintlayout.core.motion.Motion$1
            r1.<init>(r0)
            return r1
    }

    private float getPreCycleDistance() {
            r21 = this;
            r0 = r21
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 99
            float r2 = (float) r2
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r2
            r2 = 0
            r13 = r2
            r15 = r13
            r7 = 0
            r8 = 0
        L12:
            r2 = 100
            if (r8 >= r2) goto Laa
            float r2 = (float) r8
            float r2 = r2 * r10
            double r3 = (double) r2
            androidx.constraintlayout.core.motion.MotionPaths r5 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r5 = r5.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r6 = r0.mMotionPaths
            java.util.Iterator r6 = r6.iterator()
            r17 = 2143289344(0x7fc00000, float:NaN)
            r18 = 0
        L28:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L51
            java.lang.Object r19 = r6.next()
            r9 = r19
            androidx.constraintlayout.core.motion.MotionPaths r9 = (androidx.constraintlayout.core.motion.MotionPaths) r9
            androidx.constraintlayout.core.motion.utils.Easing r11 = r9.mKeyFrameEasing
            if (r11 == 0) goto L4e
            float r12 = r9.time
            int r20 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r20 >= 0) goto L44
            r5 = r11
            r18 = r12
            goto L4e
        L44:
            boolean r11 = java.lang.Float.isNaN(r17)
            if (r11 == 0) goto L4e
            float r9 = r9.time
            r17 = r9
        L4e:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L28
        L51:
            if (r5 == 0) goto L6d
            boolean r3 = java.lang.Float.isNaN(r17)
            if (r3 == 0) goto L5b
            r17 = 1065353216(0x3f800000, float:1.0)
        L5b:
            float r2 = r2 - r18
            float r17 = r17 - r18
            float r2 = r2 / r17
            double r2 = (double) r2
            double r2 = r5.get(r2)
            float r2 = (float) r2
            float r2 = r2 * r17
            float r2 = r2 + r18
            double r2 = (double) r2
            r3 = r2
        L6d:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            r5 = 0
            r2 = r2[r5]
            double[] r5 = r0.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r6 = r0.mInterpolateData
            r9 = 0
            r11 = r7
            r7 = r1
            r12 = r8
            r8 = r9
            r2.getCenter(r3, r5, r6, r7, r8)
            r2 = 1
            if (r12 <= 0) goto L9a
            double r3 = (double) r11
            r5 = r1[r2]
            double r5 = (double) r5
            double r5 = r15 - r5
            r7 = 0
            r8 = r1[r7]
            double r8 = (double) r8
            double r13 = r13 - r8
            double r5 = java.lang.Math.hypot(r5, r13)
            double r5 = r5 + r3
            float r3 = (float) r5
            goto L9c
        L9a:
            r7 = 0
            r3 = r11
        L9c:
            r4 = r1[r7]
            double r13 = (double) r4
            r2 = r1[r2]
            double r4 = (double) r2
            int r8 = r12 + 1
            r7 = r3
            r15 = r4
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L12
        Laa:
            r11 = r7
            return r11
    }

    private void insertKey(androidx.constraintlayout.core.motion.MotionPaths r6) {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            float r3 = r6.position
            float r4 = r2.position
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7
            r1 = r2
            goto L7
        L1d:
            if (r1 == 0) goto L24
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            r0.remove(r1)
        L24:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            int r0 = java.util.Collections.binarySearch(r0, r6)
            if (r0 != 0) goto L45
            java.lang.String r1 = " KeyPath position \""
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            float r2 = r6.position
            r1.append(r2)
            java.lang.String r2 = "\" outside of range"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MotionController"
            androidx.constraintlayout.core.motion.utils.Utils.loge(r2, r1)
        L45:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r5.mMotionPaths
            int r0 = -r0
            int r0 = r0 + (-1)
            r1.add(r0, r6)
            return
    }

    private void readView(androidx.constraintlayout.core.motion.MotionPaths r5) {
            r4 = this;
            androidx.constraintlayout.core.motion.MotionWidget r0 = r4.mView
            int r0 = r0.getX()
            float r0 = (float) r0
            androidx.constraintlayout.core.motion.MotionWidget r1 = r4.mView
            int r1 = r1.getY()
            float r1 = (float) r1
            androidx.constraintlayout.core.motion.MotionWidget r2 = r4.mView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            androidx.constraintlayout.core.motion.MotionWidget r3 = r4.mView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.setBounds(r0, r1, r2, r3)
            return
    }

    public void addKey(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r1.mKeyList
            r0.add(r2)
            return
    }

    public int buildKeyFrames(float[] r10, int[] r11, int[] r12) {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L6f
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r9.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r11 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r2 = r9.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.motion.MotionPaths r4 = (androidx.constraintlayout.core.motion.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r11[r3] = r4
            r3 = r5
            goto L14
        L28:
            if (r12 == 0) goto L4a
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r11 = r9.mMotionPaths
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
        L31:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r11.next()
            androidx.constraintlayout.core.motion.MotionPaths r3 = (androidx.constraintlayout.core.motion.MotionPaths) r3
            int r4 = r2 + 1
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3.position
            float r3 = r3 * r5
            int r3 = (int) r3
            r12[r2] = r3
            r2 = r4
            goto L31
        L4a:
            r11 = 0
            r12 = 0
        L4c:
            int r2 = r1.length
            if (r11 >= r2) goto L6c
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r9.mSpline
            r2 = r2[r0]
            r3 = r1[r11]
            double[] r5 = r9.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r9.mStartMotionPath
            r3 = r1[r11]
            int[] r5 = r9.mInterpolateVariables
            double[] r6 = r9.mInterpolateData
            r7 = r10
            r8 = r12
            r2.getCenter(r3, r5, r6, r7, r8)
            int r12 = r12 + 2
            int r11 = r11 + 1
            goto L4c
        L6c:
            int r12 = r12 / 2
            return r12
        L6f:
            return r0
    }

    public void buildPath(float[] r21, int r22) {
            r20 = this;
            r0 = r20
            r8 = r22
            int r1 = r8 + (-1)
            float r1 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            java.lang.String r2 = "translationX"
            r3 = 0
            if (r1 != 0) goto L15
            r11 = r3
            goto L1c
        L15:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r11 = r1
        L1c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            java.lang.String r4 = "translationY"
            if (r1 != 0) goto L25
            r12 = r3
            goto L2c
        L25:
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r12 = r1
        L2c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L32
            r13 = r3
            goto L39
        L32:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r1
            r13 = r1
        L39:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L3e
            goto L45
        L3e:
            java.lang.Object r1 = r1.get(r4)
            r3 = r1
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r3
        L45:
            r14 = r3
            r7 = 0
        L47:
            if (r7 >= r8) goto L125
            float r1 = (float) r7
            float r1 = r1 * r10
            float r2 = r0.mStaggerScale
            r3 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L6a
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L58
            r1 = 0
        L58:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L6a
            double r4 = (double) r1
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 >= 0) goto L6a
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r1 = java.lang.Math.min(r1, r9)
        L6a:
            r6 = r1
            double r1 = (double) r6
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r4 = r4.mKeyFrameEasing
            r5 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r3 = r0.mMotionPaths
            java.util.Iterator r3 = r3.iterator()
            r16 = 0
        L7a:
            boolean r17 = r3.hasNext()
            if (r17 == 0) goto La6
            java.lang.Object r17 = r3.next()
            r9 = r17
            androidx.constraintlayout.core.motion.MotionPaths r9 = (androidx.constraintlayout.core.motion.MotionPaths) r9
            androidx.constraintlayout.core.motion.utils.Easing r15 = r9.mKeyFrameEasing
            r18 = r1
            if (r15 == 0) goto La1
            float r1 = r9.time
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L98
            r16 = r1
            r4 = r15
            goto La1
        L98:
            boolean r1 = java.lang.Float.isNaN(r5)
            if (r1 == 0) goto La1
            float r1 = r9.time
            r5 = r1
        La1:
            r1 = r18
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L7a
        La6:
            r18 = r1
            if (r4 == 0) goto Lc4
            boolean r1 = java.lang.Float.isNaN(r5)
            if (r1 == 0) goto Lb2
            r5 = 1065353216(0x3f800000, float:1.0)
        Lb2:
            float r1 = r6 - r16
            float r5 = r5 - r16
            float r1 = r1 / r5
            double r1 = (double) r1
            double r1 = r4.get(r1)
            float r1 = (float) r1
            float r1 = r1 * r5
            float r1 = r1 + r16
            double r1 = (double) r1
            r2 = r1
            goto Lc6
        Lc4:
            r2 = r18
        Lc6:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r9 = 0
            r1 = r1[r9]
            double[] r4 = r0.mInterpolateData
            r1.getPos(r2, r4)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto Ldc
            double[] r4 = r0.mInterpolateData
            int r5 = r4.length
            if (r5 <= 0) goto Ldc
            r1.getPos(r2, r4)
        Ldc:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            int r15 = r7 * 2
            r9 = r6
            r6 = r21
            r16 = r7
            r7 = r15
            r1.getCenter(r2, r4, r5, r6, r7)
            if (r13 == 0) goto Lf9
            r1 = r21[r15]
            float r2 = r13.get(r9)
            float r2 = r2 + r1
            r21[r15] = r2
            goto L104
        Lf9:
            if (r11 == 0) goto L104
            r1 = r21[r15]
            float r2 = r11.get(r9)
            float r2 = r2 + r1
            r21[r15] = r2
        L104:
            if (r14 == 0) goto L112
            int r15 = r15 + 1
            r1 = r21[r15]
            float r2 = r14.get(r9)
            float r2 = r2 + r1
            r21[r15] = r2
            goto L11f
        L112:
            if (r12 == 0) goto L11f
            int r15 = r15 + 1
            r1 = r21[r15]
            float r2 = r12.get(r9)
            float r2 = r2 + r1
            r21[r15] = r2
        L11f:
            int r7 = r16 + 1
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L47
        L125:
            return
    }

    public void buildRect(float r16, float[] r17, int r18) {
            r15 = this;
            r0 = r15
            r1 = 0
            r2 = r16
            float r1 = r15.getAdjustedPosition(r2, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            r3 = 0
            r2 = r2[r3]
            double r4 = (double) r1
            double[] r1 = r0.mInterpolateData
            r2.getPos(r4, r1)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r2 = r0.mInterpolateVariables
            double[] r4 = r0.mInterpolateData
            float r5 = r1.x
            float r6 = r1.y
            float r7 = r1.width
            float r8 = r1.height
        L21:
            int r9 = r2.length
            if (r3 >= r9) goto L40
            r9 = r4[r3]
            float r9 = (float) r9
            r10 = r2[r3]
            r11 = 1
            if (r10 == r11) goto L3c
            r11 = 2
            if (r10 == r11) goto L3a
            r11 = 3
            if (r10 == r11) goto L38
            r11 = 4
            if (r10 == r11) goto L36
            goto L3d
        L36:
            r8 = r9
            goto L3d
        L38:
            r7 = r9
            goto L3d
        L3a:
            r6 = r9
            goto L3d
        L3c:
            r5 = r9
        L3d:
            int r3 = r3 + 1
            goto L21
        L40:
            androidx.constraintlayout.core.motion.Motion r2 = r1.mRelativeToController
            if (r2 == 0) goto L6d
            float r2 = r2.getCenterX()
            androidx.constraintlayout.core.motion.Motion r1 = r1.mRelativeToController
            float r1 = r1.getCenterY()
            double r2 = (double) r2
            double r4 = (double) r5
            double r9 = (double) r6
            double r11 = java.lang.Math.sin(r9)
            double r11 = r11 * r4
            double r11 = r11 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r7 / r2
            double r13 = (double) r3
            double r11 = r11 - r13
            float r3 = (float) r11
            double r11 = (double) r1
            double r9 = java.lang.Math.cos(r9)
            double r9 = r9 * r4
            double r11 = r11 - r9
            float r1 = r8 / r2
            double r1 = (double) r1
            double r11 = r11 - r1
            float r6 = (float) r11
            r5 = r3
        L6d:
            float r7 = r7 + r5
            float r8 = r8 + r6
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r1)
            java.lang.Float.isNaN(r1)
            r1 = 0
            float r5 = r5 + r1
            float r6 = r6 + r1
            float r7 = r7 + r1
            float r8 = r8 + r1
            int r1 = r18 + 1
            r17[r18] = r5
            int r2 = r1 + 1
            r17[r1] = r6
            int r1 = r2 + 1
            r17[r2] = r7
            int r2 = r1 + 1
            r17[r1] = r6
            int r1 = r2 + 1
            r17[r2] = r7
            int r2 = r1 + 1
            r17[r1] = r8
            int r1 = r2 + 1
            r17[r2] = r5
            r17[r1] = r8
            return
    }

    public int getAnimateRelativeTo() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            int r0 = r0.mAnimateRelativeTo
            return r0
    }

    public void getCenter(double r21, float[] r23, float[] r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r24
            r4 = 4
            double[] r5 = new double[r4]
            double[] r6 = new double[r4]
            androidx.constraintlayout.core.motion.utils.CurveFit[] r7 = r0.mSpline
            r8 = 0
            r7 = r7[r8]
            r7.getPos(r1, r5)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r7 = r0.mSpline
            r7 = r7[r8]
            r7.getSlope(r1, r6)
            r7 = 0
            java.util.Arrays.fill(r3, r7)
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            int[] r10 = r0.mInterpolateVariables
            float r11 = r9.x
            float r12 = r9.y
            float r13 = r9.width
            float r14 = r9.height
            r8 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L30:
            int r4 = r10.length
            if (r15 >= r4) goto L61
            r0 = r5[r15]
            float r0 = (float) r0
            r2 = r6[r15]
            float r2 = (float) r2
            r3 = r10[r15]
            r1 = 1
            if (r3 == r1) goto L55
            r1 = 2
            if (r3 == r1) goto L51
            r1 = 3
            if (r3 == r1) goto L4c
            r1 = 4
            if (r3 == r1) goto L48
            goto L58
        L48:
            r14 = r0
            r17 = r2
            goto L58
        L4c:
            r1 = 4
            r13 = r0
            r16 = r2
            goto L58
        L51:
            r1 = 4
            r12 = r0
            r8 = r2
            goto L58
        L55:
            r1 = 4
            r11 = r0
            r7 = r2
        L58:
            int r15 = r15 + 1
            r0 = r20
            r1 = r21
            r3 = r24
            goto L30
        L61:
            r0 = 1073741824(0x40000000, float:2.0)
            float r16 = r16 / r0
            float r16 = r16 + r7
            float r17 = r17 / r0
            float r17 = r17 + r8
            androidx.constraintlayout.core.motion.Motion r1 = r9.mRelativeToController
            if (r1 == 0) goto Lcf
            r3 = 2
            float[] r4 = new float[r3]
            float[] r3 = new float[r3]
            r5 = r21
            r1.getCenter(r5, r4, r3)
            r1 = 0
            r5 = r4[r1]
            r2 = 1
            r4 = r4[r2]
            r6 = r3[r1]
            r1 = r3[r2]
            double r9 = (double) r5
            double r2 = (double) r11
            double r11 = (double) r12
            double r15 = java.lang.Math.sin(r11)
            double r15 = r15 * r2
            double r15 = r15 + r9
            float r5 = r13 / r0
            double r9 = (double) r5
            double r9 = r15 - r9
            float r5 = (float) r9
            double r9 = (double) r4
            double r15 = java.lang.Math.cos(r11)
            double r15 = r15 * r2
            double r9 = r9 - r15
            float r2 = r14 / r0
            double r2 = (double) r2
            double r9 = r9 - r2
            float r2 = (float) r9
            double r3 = (double) r6
            double r6 = (double) r7
            double r9 = java.lang.Math.sin(r11)
            double r9 = r9 * r6
            double r9 = r9 + r3
            double r3 = java.lang.Math.cos(r11)
            r22 = r1
            double r0 = (double) r8
            double r3 = r3 * r0
            double r3 = r3 + r9
            float r3 = (float) r3
            r4 = r22
            double r8 = (double) r4
            double r18 = java.lang.Math.cos(r11)
            double r18 = r18 * r6
            double r8 = r8 - r18
            double r6 = java.lang.Math.sin(r11)
            double r6 = r6 * r0
            double r6 = r6 + r8
            float r0 = (float) r6
            r17 = r0
            r12 = r2
            r16 = r3
            r11 = r5
            r0 = 1073741824(0x40000000, float:2.0)
        Lcf:
            float r13 = r13 / r0
            float r13 = r13 + r11
            r1 = 0
            float r13 = r13 + r1
            r2 = 0
            r23[r2] = r13
            float r14 = r14 / r0
            float r14 = r14 + r12
            float r14 = r14 + r1
            r0 = 1
            r23[r0] = r14
            r24[r2] = r16
            r24[r0] = r17
            return
    }

    public float getCenterX() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getCenterY() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getDrawPath() {
            r3 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r3.mStartMotionPath
            int r0 = r0.mDrawPath
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r3.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            int r2 = r2.mDrawPath
            int r0 = java.lang.Math.max(r0, r2)
            goto La
        L1d:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            int r1 = r1.mDrawPath
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public float getFinalHeight() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.height
            return r0
    }

    public float getFinalWidth() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.width
            return r0
    }

    public float getFinalX() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.x
            return r0
    }

    public float getFinalY() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.y
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.constraintlayout.core.motion.MotionPaths getKeyFrame(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r1.mMotionPaths
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            return r2
    }

    public int getKeyFrameInfo(int r18, int[] r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            float[] r2 = new float[r2]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            java.util.Iterator r10 = r3.iterator()
            r11 = 0
            r12 = 0
            r13 = 0
        L10:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r10.next()
            r14 = r3
            androidx.constraintlayout.core.motion.key.MotionKey r14 = (androidx.constraintlayout.core.motion.key.MotionKey) r14
            int r3 = r14.mType
            if (r3 == r1) goto L25
            r4 = -1
            if (r1 != r4) goto L25
            goto L10
        L25:
            r19[r13] = r11
            int r4 = r13 + 1
            r19[r4] = r3
            r15 = 1
            int r16 = r4 + 1
            int r3 = r14.mFramePosition
            r19[r16] = r3
            float r3 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r0.mSpline
            r4 = r4[r11]
            double r5 = (double) r3
            double[] r3 = r0.mInterpolateData
            r4.getPos(r5, r3)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mStartMotionPath
            int[] r7 = r0.mInterpolateVariables
            double[] r8 = r0.mInterpolateData
            r9 = 0
            r4 = r5
            r6 = r7
            r7 = r8
            r8 = r2
            r3.getCenter(r4, r6, r7, r8, r9)
            int r16 = r16 + 1
            r3 = r2[r11]
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            int r16 = r16 + 1
            r3 = r2[r15]
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            boolean r3 = r14 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r3 == 0) goto L82
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r14 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r14
            int r16 = r16 + 1
            int r3 = r14.mPositionType
            r19[r16] = r3
            int r16 = r16 + 1
            float r3 = r14.mPercentX
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            int r16 = r16 + 1
            float r3 = r14.mPercentY
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
        L82:
            int r16 = r16 + 1
            int r3 = r16 - r13
            r19[r13] = r3
            int r12 = r12 + 1
            r13 = r16
            goto L10
        L8d:
            return r12
    }

    public int getKeyFramePositions(int[] r13, float[] r14) {
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r12.mKeyList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r10 = 0
        L9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.motion.key.MotionKey r3 = (androidx.constraintlayout.core.motion.key.MotionKey) r3
            int r11 = r2 + 1
            int r4 = r3.mFramePosition
            int r3 = r3.mType
            int r3 = r3 * 1000
            int r3 = r3 + r4
            r13[r2] = r3
            float r2 = (float) r4
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            androidx.constraintlayout.core.motion.utils.CurveFit[] r3 = r12.mSpline
            r3 = r3[r1]
            double r4 = (double) r2
            double[] r2 = r12.mInterpolateData
            r3.getPos(r4, r2)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r12.mStartMotionPath
            int[] r6 = r12.mInterpolateVariables
            double[] r7 = r12.mInterpolateData
            r8 = r14
            r9 = r10
            r3.getCenter(r4, r6, r7, r8, r9)
            int r10 = r10 + 2
            r2 = r11
            goto L9
        L3d:
            return r2
    }

    public final double[] getPos(double r4) {
            r3 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r3.mSpline
            r1 = 0
            r0 = r0[r1]
            double[] r1 = r3.mInterpolateData
            r0.getPos(r4, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mArcSpline
            if (r0 == 0) goto L16
            double[] r1 = r3.mInterpolateData
            int r2 = r1.length
            if (r2 <= 0) goto L16
            r0.getPos(r4, r1)
        L16:
            double[] r4 = r3.mInterpolateData
            return r4
    }

    public float getStartHeight() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.height
            return r0
    }

    public float getStartWidth() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.width
            return r0
    }

    public float getStartX() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.x
            return r0
    }

    public float getStartY() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.y
            return r0
    }

    public int getTransformPivotTarget() {
            r1 = this;
            int r0 = r1.mTransformPivotTarget
            return r0
    }

    public androidx.constraintlayout.core.motion.MotionWidget getView() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget r0 = r1.mView
            return r0
    }

    public boolean interpolate(androidx.constraintlayout.core.motion.MotionWidget r23, float r24, long r25, androidx.constraintlayout.core.motion.utils.KeyCache r27) {
            r22 = this;
            r0 = r22
            r8 = r23
            r1 = 0
            r2 = r24
            float r1 = r0.getAdjustedPosition(r2, r1)
            int r2 = r0.mQuantizeMotionSteps
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r3) goto L44
            float r2 = (float) r2
            float r2 = r4 / r2
            float r3 = r1 / r2
            double r5 = (double) r3
            double r5 = java.lang.Math.floor(r5)
            float r3 = (float) r5
            float r3 = r3 * r2
            float r1 = r1 % r2
            float r1 = r1 / r2
            float r5 = r0.mQuantizeMotionPhase
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L2d
            float r5 = r0.mQuantizeMotionPhase
            float r1 = r1 + r5
            float r1 = r1 % r4
        L2d:
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator r4 = r0.mQuantizeMotionInterpolator
            if (r4 == 0) goto L36
            float r1 = r4.getInterpolation(r1)
            goto L41
        L36:
            double r4 = (double) r1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L40
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L40:
            r1 = 0
        L41:
            float r1 = r1 * r2
            float r1 = r1 + r3
        L44:
            r9 = r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            if (r1 == 0) goto L61
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            r2.setProperty(r8, r9)
            goto L51
        L61:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r2 = 0
            if (r1 == 0) goto L2eb
            r1 = r1[r2]
            double r3 = (double) r9
            double[] r5 = r0.mInterpolateData
            r1.getPos(r3, r5)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r2]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r3, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto L8a
            double[] r2 = r0.mInterpolateData
            int r5 = r2.length
            if (r5 <= 0) goto L8a
            r1.getPos(r3, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r3, r2)
        L8a:
            boolean r1 = r0.mNoMovement
            if (r1 != 0) goto L21a
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r2 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            double[] r6 = r0.mInterpolateVelocity
            float r7 = r1.x
            float r10 = r1.y
            float r11 = r1.width
            float r12 = r1.height
            int r13 = r2.length
            if (r13 == 0) goto Lba
            double[] r13 = r1.mTempValue
            int r13 = r13.length
            int r14 = r2.length
            int r14 = r14 + (-1)
            r14 = r2[r14]
            if (r13 > r14) goto Lba
            int r13 = r2.length
            int r13 = r13 + (-1)
            r13 = r2[r13]
            int r13 = r13 + 1
            double[] r14 = new double[r13]
            r1.mTempValue = r14
            double[] r13 = new double[r13]
            r1.mTempDelta = r13
        Lba:
            double[] r13 = r1.mTempValue
            r14 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r13, r14)
            r13 = 0
        Lc2:
            int r14 = r2.length
            if (r13 >= r14) goto Ld8
            double[] r14 = r1.mTempValue
            r15 = r2[r13]
            r16 = r5[r13]
            r14[r15] = r16
            double[] r14 = r1.mTempDelta
            r15 = r2[r13]
            r16 = r6[r13]
            r14[r15] = r16
            int r13 = r13 + 1
            goto Lc2
        Ld8:
            r2 = 0
            r5 = 0
            r13 = 0
            r14 = 0
            r15 = 2143289344(0x7fc00000, float:NaN)
            r16 = 0
            r17 = r9
        Le2:
            double[] r9 = r1.mTempValue
            int r0 = r9.length
            if (r13 >= r0) goto L146
            r18 = r9[r13]
            boolean r0 = java.lang.Double.isNaN(r18)
            if (r0 == 0) goto Lf4
            r24 = r14
            r25 = r15
            goto L122
        Lf4:
            r18 = 0
            double[] r0 = r1.mTempValue
            r20 = r0[r13]
            boolean r0 = java.lang.Double.isNaN(r20)
            if (r0 == 0) goto L101
            goto L107
        L101:
            double[] r0 = r1.mTempValue
            r20 = r0[r13]
            double r18 = r20 + r18
        L107:
            r8 = r18
            float r0 = (float) r8
            double[] r8 = r1.mTempDelta
            r24 = r14
            r25 = r15
            r14 = r8[r13]
            float r8 = (float) r14
            r9 = 1
            if (r13 == r9) goto L139
            r9 = 2
            if (r13 == r9) goto L134
            r9 = 3
            if (r13 == r9) goto L12c
            r9 = 4
            if (r13 == r9) goto L127
            r8 = 5
            if (r13 == r8) goto L125
        L122:
            r15 = r25
            goto L13d
        L125:
            r15 = r0
            goto L13d
        L127:
            r15 = r25
            r12 = r0
            r14 = r8
            goto L13f
        L12c:
            r14 = r24
            r15 = r25
            r11 = r0
            r16 = r8
            goto L13f
        L134:
            r15 = r25
            r10 = r0
            r5 = r8
            goto L13d
        L139:
            r15 = r25
            r7 = r0
            r2 = r8
        L13d:
            r14 = r24
        L13f:
            int r13 = r13 + 1
            r0 = r22
            r8 = r23
            goto Le2
        L146:
            r24 = r14
            r25 = r15
            androidx.constraintlayout.core.motion.Motion r0 = r1.mRelativeToController
            if (r0 == 0) goto L1de
            r1 = 2
            float[] r8 = new float[r1]
            float[] r1 = new float[r1]
            r0.getCenter(r3, r8, r1)
            r0 = 0
            r9 = r8[r0]
            r13 = 1
            r8 = r8[r13]
            r0 = r1[r0]
            r1 = r1[r13]
            double r13 = (double) r9
            r18 = r3
            double r3 = (double) r7
            double r9 = (double) r10
            double r15 = java.lang.Math.sin(r9)
            double r15 = r15 * r3
            double r15 = r15 + r13
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r11 / r7
            double r13 = (double) r7
            double r13 = r15 - r13
            float r7 = (float) r13
            double r13 = (double) r8
            double r15 = java.lang.Math.cos(r9)
            double r15 = r15 * r3
            double r13 = r13 - r15
            r8 = 1073741824(0x40000000, float:2.0)
            float r8 = r12 / r8
            r15 = r7
            double r7 = (double) r8
            double r13 = r13 - r7
            float r7 = (float) r13
            double r13 = (double) r0
            r0 = r7
            double r7 = (double) r2
            double r20 = java.lang.Math.sin(r9)
            double r20 = r20 * r7
            double r20 = r20 + r13
            double r13 = java.lang.Math.cos(r9)
            double r13 = r13 * r3
            r27 = r11
            r26 = r12
            double r11 = (double) r5
            double r13 = r13 * r11
            double r13 = r13 + r20
            float r2 = (float) r13
            double r13 = (double) r1
            double r20 = java.lang.Math.cos(r9)
            double r20 = r20 * r7
            double r13 = r13 - r20
            double r7 = java.lang.Math.sin(r9)
            double r7 = r7 * r3
            double r7 = r7 * r11
            double r7 = r7 + r13
            float r1 = (float) r7
            int r3 = r6.length
            r4 = 2
            if (r3 < r4) goto L1be
            double r3 = (double) r2
            r5 = 0
            r6[r5] = r3
            double r3 = (double) r1
            r5 = 1
            r6[r5] = r3
        L1be:
            boolean r3 = java.lang.Float.isNaN(r25)
            if (r3 != 0) goto L1d9
            r3 = r25
            double r3 = (double) r3
            double r5 = (double) r1
            double r1 = (double) r2
            double r1 = java.lang.Math.atan2(r5, r1)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 + r3
            float r1 = (float) r1
            r8 = r23
            r8.setRotationZ(r1)
            goto L1db
        L1d9:
            r8 = r23
        L1db:
            r10 = r0
            r7 = r15
            goto L20a
        L1de:
            r8 = r23
            r18 = r3
            r27 = r11
            r26 = r12
            r3 = r25
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L20a
            r0 = 1073741824(0x40000000, float:2.0)
            float r16 = r16 / r0
            float r1 = r16 + r2
            float r14 = r24 / r0
            float r14 = r14 + r5
            r0 = 0
            double r4 = (double) r0
            double r2 = (double) r3
            double r11 = (double) r14
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r11, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            double r0 = r0 + r2
            double r0 = r0 + r4
            float r0 = (float) r0
            r8.setRotationZ(r0)
        L20a:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r1 = (int) r7
            float r10 = r10 + r0
            int r0 = (int) r10
            float r7 = r7 + r27
            int r2 = (int) r7
            float r10 = r10 + r26
            int r3 = (int) r10
            r8.layout(r1, r0, r2, r3)
            goto L21e
        L21a:
            r18 = r3
            r17 = r9
        L21e:
            r0 = r22
            int r1 = r0.mTransformPivotTarget
            r2 = -1
            if (r1 == r2) goto L27f
            androidx.constraintlayout.core.motion.MotionWidget r1 = r0.mTransformPivotView
            if (r1 != 0) goto L235
            androidx.constraintlayout.core.motion.MotionWidget r1 = r23.getParent()
            int r2 = r0.mTransformPivotTarget
            androidx.constraintlayout.core.motion.MotionWidget r1 = r1.findViewById(r2)
            r0.mTransformPivotView = r1
        L235:
            androidx.constraintlayout.core.motion.MotionWidget r1 = r0.mTransformPivotView
            if (r1 == 0) goto L27f
            int r1 = r1.getTop()
            androidx.constraintlayout.core.motion.MotionWidget r2 = r0.mTransformPivotView
            int r2 = r2.getBottom()
            int r2 = r2 + r1
            float r1 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            androidx.constraintlayout.core.motion.MotionWidget r3 = r0.mTransformPivotView
            int r3 = r3.getLeft()
            androidx.constraintlayout.core.motion.MotionWidget r4 = r0.mTransformPivotView
            int r4 = r4.getRight()
            int r4 = r4 + r3
            float r3 = (float) r4
            float r3 = r3 / r2
            int r2 = r23.getRight()
            int r4 = r23.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L27f
            int r2 = r23.getBottom()
            int r4 = r23.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L27f
            int r2 = r23.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r23.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r8.setPivotX(r3)
            r8.setPivotY(r1)
        L27f:
            r1 = 1
        L280:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            int r3 = r2.length
            if (r1 >= r3) goto L2a6
            r2 = r2[r1]
            float[] r3 = r0.mValuesBuff
            r4 = r18
            r2.getPos(r4, r3)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mStartMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r2.customAttributes
            java.lang.String[] r3 = r0.mAttributeNames
            int r6 = r1 + (-1)
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            float[] r3 = r0.mValuesBuff
            r2.setInterpolatedValue(r8, r3)
            int r1 = r1 + 1
            goto L280
        L2a6:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mStartPoint
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r1 > 0) goto L2b8
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mStartPoint
            int r1 = r1.visibility
            r8.setVisibility(r1)
            goto L2d4
        L2b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r1 < 0) goto L2c6
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            r8.setVisibility(r1)
            goto L2d4
        L2c6:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r2 = r0.mStartPoint
            int r2 = r2.visibility
            if (r1 == r2) goto L2d4
            r1 = 4
            r8.setVisibility(r1)
        L2d4:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L2e8
            r1 = 0
        L2d9:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r2 = r0.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L2e8
            r2 = r2[r1]
            r9 = r17
            r2.conditionallyFire(r9, r8)
            int r1 = r1 + 1
            goto L2d9
        L2e8:
            r9 = r17
            goto L31c
        L2eb:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            float r2 = r1.x
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mEndMotionPath
            float r4 = r3.x
            float r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r9, r2)
            float r4 = r1.y
            float r5 = r3.y
            float r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r4, r9, r4)
            float r5 = r1.width
            float r6 = r3.width
            float r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5, r9, r5)
            float r1 = r1.height
            float r3 = r3.height
            float r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r9, r1)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r6 = (int) r2
            float r4 = r4 + r3
            int r3 = (int) r4
            float r2 = r2 + r5
            int r2 = (int) r2
            float r4 = r4 + r1
            int r1 = (int) r4
            r8.layout(r6, r3, r2, r1)
        L31c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L34d
            java.util.Collection r1 = r1.values()
            java.util.Iterator r10 = r1.iterator()
        L328:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L34d
            java.lang.Object r1 = r10.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet
            if (r2 == 0) goto L349
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$PathRotateSet r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) r1
            double[] r2 = r0.mInterpolateVelocity
            r3 = 0
            r4 = r2[r3]
            r3 = 1
            r6 = r2[r3]
            r2 = r23
            r3 = r9
            r1.setPathRotate(r2, r3, r4, r6)
            goto L328
        L349:
            r1.setProperty(r8, r9)
            goto L328
        L34d:
            r1 = 0
            return r1
    }

    public void setDrawPath(int r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            r0.mDrawPath = r2
            return
    }

    public void setEnd(androidx.constraintlayout.core.motion.MotionWidget r6) {
            r5 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.time = r1
            r0.position = r1
            r5.readView(r0)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            int r1 = r6.getLeft()
            float r1 = (float) r1
            int r2 = r6.getTop()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r0.applyParameters(r6)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mEndPoint
            r0.setState(r6)
            return
    }

    public void setPathMotionArc(int r1) {
            r0 = this;
            r0.mPathMotionArc = r1
            return
    }

    public void setStart(androidx.constraintlayout.core.motion.MotionWidget r6) {
            r5 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r0.applyParameters(r6)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            return
    }

    public void setStartState(androidx.constraintlayout.core.motion.utils.ViewState r5, androidx.constraintlayout.core.motion.MotionWidget r6, int r7, int r8, int r9) {
            r4 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r4.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            androidx.constraintlayout.core.motion.utils.Rect r0 = new androidx.constraintlayout.core.motion.utils.Rect
            r0.<init>()
            r1 = 1
            r2 = 2
            if (r7 == r1) goto L41
            if (r7 == r2) goto L13
            goto L6e
        L13:
            int r8 = r5.left
            int r1 = r5.right
            int r8 = r8 + r1
            int r1 = r5.top
            int r3 = r5.bottom
            int r1 = r1 + r3
            int r3 = r5.width()
            int r3 = r3 + r1
            int r3 = r3 / r2
            int r9 = r9 - r3
            r0.left = r9
            int r9 = r5.height()
            int r8 = r8 - r9
            int r8 = r8 / r2
            r0.top = r8
            int r8 = r0.left
            int r9 = r5.width()
            int r9 = r9 + r8
            r0.right = r9
            int r8 = r0.top
            int r9 = r5.height()
            int r9 = r9 + r8
            r0.bottom = r9
            goto L6e
        L41:
            int r9 = r5.left
            int r1 = r5.right
            int r9 = r9 + r1
            int r1 = r5.top
            int r3 = r5.bottom
            int r1 = r1 + r3
            int r3 = r5.width()
            int r1 = r1 - r3
            int r1 = r1 / r2
            r0.left = r1
            int r1 = r5.height()
            int r1 = r1 + r9
            int r1 = r1 / r2
            int r8 = r8 - r1
            r0.top = r8
            int r8 = r0.left
            int r9 = r5.width()
            int r9 = r9 + r8
            r0.right = r9
            int r8 = r0.top
            int r9 = r5.height()
            int r9 = r9 + r8
            r0.bottom = r9
        L6e:
            androidx.constraintlayout.core.motion.MotionPaths r8 = r4.mStartMotionPath
            int r9 = r0.left
            float r9 = (float) r9
            int r1 = r0.top
            float r1 = (float) r1
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r0.height()
            float r3 = (float) r3
            r8.setBounds(r9, r1, r2, r3)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r8 = r4.mStartPoint
            float r5 = r5.rotation
            r8.setState(r0, r6, r7, r5)
            return
    }

    public void setTransformPivotTarget(int r1) {
            r0 = this;
            r0.mTransformPivotTarget = r1
            r1 = 0
            r0.mTransformPivotView = r1
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, int r4) {
            r2 = this;
            r0 = 509(0x1fd, float:7.13E-43)
            r1 = 1
            if (r3 == r0) goto Lc
            r4 = 704(0x2c0, float:9.87E-43)
            if (r3 == r4) goto Lb
            r3 = 0
            return r3
        Lb:
            return r1
        Lc:
            r2.setPathMotionArc(r4)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            r1 = 705(0x2c1, float:9.88E-43)
            if (r1 != r4) goto L22
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_INTERPOLATOR  "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            r4 = -1
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator r4 = getInterpolator(r4, r5, r0)
            r3.mQuantizeMotionInterpolator = r4
        L22:
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setView(androidx.constraintlayout.core.motion.MotionWidget r1) {
            r0 = this;
            r0.mView = r1
            return
    }

    public void setup(int r20, int r21, float r22, long r23) {
            r19 = this;
            r0 = r19
            r1 = r23
            java.lang.Class<double> r3 = double.class
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r8 = r0.mPathMotionArc
            r9 = -1
            if (r8 == r9) goto L28
            androidx.constraintlayout.core.motion.MotionPaths r10 = r0.mStartMotionPath
            r10.mPathMotionArc = r8
        L28:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r8 = r0.mStartPoint
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r10 = r0.mEndPoint
            r8.different(r10, r5)
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r8 = r0.mKeyList
            if (r8 == 0) goto L90
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L38:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L91
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.core.motion.key.MotionKey r11 = (androidx.constraintlayout.core.motion.key.MotionKey) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r12 == 0) goto L68
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r11 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r11
            androidx.constraintlayout.core.motion.MotionPaths r12 = new androidx.constraintlayout.core.motion.MotionPaths
            androidx.constraintlayout.core.motion.MotionPaths r15 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mEndMotionPath
            r13 = r12
            r18 = r14
            r14 = r20
            r17 = r15
            r15 = r21
            r16 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            r0.insertKey(r12)
            int r11 = r11.mCurveFit
            if (r11 == r9) goto L38
            r0.mCurveFitType = r11
            goto L38
        L68:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r12 == 0) goto L70
            r11.getAttributeNames(r6)
            goto L38
        L70:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r12 == 0) goto L78
            r11.getAttributeNames(r4)
            goto L38
        L78:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTrigger
            if (r12 == 0) goto L89
            if (r10 != 0) goto L83
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L83:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r11 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) r11
            r10.add(r11)
            goto L38
        L89:
            r11.setInterpolation(r7)
            r11.getAttributeNames(r5)
            goto L38
        L90:
            r10 = 0
        L91:
            r8 = 0
            if (r10 == 0) goto L9e
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r8 = new androidx.constraintlayout.core.motion.key.MotionKeyTrigger[r8]
            java.lang.Object[] r8 = r10.toArray(r8)
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r8 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger[]) r8
            r0.mKeyTriggers = r8
        L9e:
            boolean r8 = r5.isEmpty()
            java.lang.String r9 = ","
            java.lang.String r10 = "CUSTOM,"
            r11 = 1
            if (r8 != 0) goto L17d
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.mAttributesMap = r8
            java.util.Iterator r8 = r5.iterator()
        Lb4:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L116
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.startsWith(r10)
            if (r13 == 0) goto L101
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r13 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r13.<init>()
            java.lang.String[] r14 = r12.split(r9)
            r11 = r14[r11]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r14 = r0.mKeyList
            java.util.Iterator r14 = r14.iterator()
        Ld7:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lfa
            java.lang.Object r15 = r14.next()
            androidx.constraintlayout.core.motion.key.MotionKey r15 = (androidx.constraintlayout.core.motion.key.MotionKey) r15
            r20 = r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r15.mCustom
            if (r8 != 0) goto Lea
            goto Lf7
        Lea:
            java.lang.Object r8 = r8.get(r11)
            androidx.constraintlayout.core.motion.CustomVariable r8 = (androidx.constraintlayout.core.motion.CustomVariable) r8
            if (r8 == 0) goto Lf7
            int r15 = r15.mFramePosition
            r13.append(r15, r8)
        Lf7:
            r8 = r20
            goto Ld7
        Lfa:
            r20 = r8
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r12, r13)
            goto L107
        L101:
            r20 = r8
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r12, r1)
        L107:
            if (r8 != 0) goto L10a
            goto L112
        L10a:
            r8.setType(r12)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r11 = r0.mAttributesMap
            r11.put(r12, r8)
        L112:
            r11 = 1
            r8 = r20
            goto Lb4
        L116:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r8 = r0.mKeyList
            if (r8 == 0) goto L134
            java.util.Iterator r8 = r8.iterator()
        L11e:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L134
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.core.motion.key.MotionKey r11 = (androidx.constraintlayout.core.motion.key.MotionKey) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyAttributes
            if (r12 == 0) goto L11e
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r12 = r0.mAttributesMap
            r11.addValues(r12)
            goto L11e
        L134:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r8 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r11 = r0.mAttributesMap
            r12 = 0
            r8.addValues(r11, r12)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r8 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r11 = r0.mAttributesMap
            r12 = 100
            r8.addValues(r11, r12)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L14f:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L17d
            java.lang.Object r11 = r8.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r7.containsKey(r11)
            if (r12 == 0) goto L16e
            java.lang.Object r12 = r7.get(r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L16e
            int r12 = r12.intValue()
            goto L16f
        L16e:
            r12 = 0
        L16f:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r13 = r0.mAttributesMap
            java.lang.Object r11 = r13.get(r11)
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = (androidx.constraintlayout.core.motion.utils.SplineSet) r11
            if (r11 == 0) goto L14f
            r11.setup(r12)
            goto L14f
        L17d:
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L242
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r8 = r0.mTimeCycleAttributesMap
            if (r8 != 0) goto L18e
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.mTimeCycleAttributesMap = r8
        L18e:
            java.util.Iterator r4 = r4.iterator()
        L192:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L1ee
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r11 = r0.mTimeCycleAttributesMap
            boolean r11 = r11.containsKey(r8)
            if (r11 == 0) goto L1a7
            goto L192
        L1a7:
            boolean r11 = r8.startsWith(r10)
            if (r11 == 0) goto L1e3
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r11 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r11.<init>()
            java.lang.String[] r12 = r8.split(r9)
            r13 = 1
            r12 = r12[r13]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r13 = r0.mKeyList
            java.util.Iterator r13 = r13.iterator()
        L1bf:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L1de
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.core.motion.key.MotionKey r14 = (androidx.constraintlayout.core.motion.key.MotionKey) r14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r15 = r14.mCustom
            if (r15 != 0) goto L1d0
            goto L1bf
        L1d0:
            java.lang.Object r15 = r15.get(r12)
            androidx.constraintlayout.core.motion.CustomVariable r15 = (androidx.constraintlayout.core.motion.CustomVariable) r15
            if (r15 == 0) goto L1bf
            int r14 = r14.mFramePosition
            r11.append(r14, r15)
            goto L1bf
        L1de:
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r8, r11)
            goto L1e7
        L1e3:
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r8, r1)
        L1e7:
            if (r11 != 0) goto L1ea
            goto L192
        L1ea:
            r11.setType(r8)
            goto L192
        L1ee:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r1 = r0.mKeyList
            if (r1 == 0) goto L20e
            java.util.Iterator r1 = r1.iterator()
        L1f6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20e
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.key.MotionKey r2 = (androidx.constraintlayout.core.motion.key.MotionKey) r2
            boolean r4 = r2 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r4 == 0) goto L1f6
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r4 = r0.mTimeCycleAttributesMap
            r2.addTimeValues(r4)
            goto L1f6
        L20e:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r1 = r0.mTimeCycleAttributesMap
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L218:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L242
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r7.containsKey(r2)
            if (r4 == 0) goto L235
            java.lang.Object r4 = r7.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L236
        L235:
            r4 = 0
        L236:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r8 = r0.mTimeCycleAttributesMap
            java.lang.Object r2 = r8.get(r2)
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet r2 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet) r2
            r2.setup(r4)
            goto L218
        L242:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r0.mMotionPaths
            int r1 = r1.size()
            r2 = 2
            int r1 = r1 + r2
            androidx.constraintlayout.core.motion.MotionPaths[] r4 = new androidx.constraintlayout.core.motion.MotionPaths[r1]
            androidx.constraintlayout.core.motion.MotionPaths r7 = r0.mStartMotionPath
            r8 = 0
            r4[r8] = r7
            int r7 = r1 + (-1)
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mEndMotionPath
            r4[r7] = r9
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r7 = r0.mMotionPaths
            int r7 = r7.size()
            if (r7 <= 0) goto L267
            int r7 = r0.mCurveFitType
            int r9 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            if (r7 != r9) goto L267
            r0.mCurveFitType = r8
        L267:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r7 = r0.mMotionPaths
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L26e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L280
            java.lang.Object r9 = r7.next()
            androidx.constraintlayout.core.motion.MotionPaths r9 = (androidx.constraintlayout.core.motion.MotionPaths) r9
            int r11 = r8 + 1
            r4[r8] = r9
            r8 = r11
            goto L26e
        L280:
            r7 = 18
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mEndMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r9 = r9.customAttributes
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L293:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L2c2
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            androidx.constraintlayout.core.motion.MotionPaths r12 = r0.mStartMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r12 = r12.customAttributes
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L293
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            boolean r12 = r5.contains(r12)
            if (r12 != 0) goto L293
            r8.add(r11)
            goto L293
        L2c2:
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r0.mAttributeNames = r5
            int r5 = r5.length
            int[] r5 = new int[r5]
            r0.mAttributeInterpolatorCount = r5
            r5 = 0
        L2d3:
            java.lang.String[] r8 = r0.mAttributeNames
            int r9 = r8.length
            if (r5 >= r9) goto L30a
            r8 = r8[r5]
            int[] r9 = r0.mAttributeInterpolatorCount
            r10 = 0
            r9[r5] = r10
            r9 = 0
        L2e0:
            if (r9 >= r1) goto L307
            r10 = r4[r9]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r10 = r10.customAttributes
            boolean r10 = r10.containsKey(r8)
            if (r10 == 0) goto L304
            r10 = r4[r9]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r10 = r10.customAttributes
            java.lang.Object r10 = r10.get(r8)
            androidx.constraintlayout.core.motion.CustomVariable r10 = (androidx.constraintlayout.core.motion.CustomVariable) r10
            if (r10 == 0) goto L304
            int[] r8 = r0.mAttributeInterpolatorCount
            r9 = r8[r5]
            int r10 = r10.numberOfInterpolatedValues()
            int r10 = r10 + r9
            r8[r5] = r10
            goto L307
        L304:
            int r9 = r9 + 1
            goto L2e0
        L307:
            int r5 = r5 + 1
            goto L2d3
        L30a:
            r5 = 0
            r5 = r4[r5]
            int r5 = r5.mPathMotionArc
            r9 = -1
            if (r5 == r9) goto L314
            r5 = 1
            goto L315
        L314:
            r5 = 0
        L315:
            int r8 = r8.length
            int r7 = r7 + r8
            boolean[] r8 = new boolean[r7]
            r9 = 1
        L31a:
            if (r9 >= r1) goto L328
            r10 = r4[r9]
            int r11 = r9 + (-1)
            r11 = r4[r11]
            r10.different(r11, r8, r5)
            int r9 = r9 + 1
            goto L31a
        L328:
            r5 = 1
            r9 = 0
        L32a:
            if (r5 >= r7) goto L335
            boolean r10 = r8[r5]
            if (r10 == 0) goto L332
            int r9 = r9 + 1
        L332:
            int r5 = r5 + 1
            goto L32a
        L335:
            int[] r5 = new int[r9]
            r0.mInterpolateVariables = r5
            int r5 = java.lang.Math.max(r2, r9)
            double[] r9 = new double[r5]
            r0.mInterpolateData = r9
            double[] r5 = new double[r5]
            r0.mInterpolateVelocity = r5
            r5 = 1
            r9 = 0
        L347:
            if (r5 >= r7) goto L357
            boolean r10 = r8[r5]
            if (r10 == 0) goto L354
            int[] r10 = r0.mInterpolateVariables
            int r11 = r9 + 1
            r10[r9] = r5
            r9 = r11
        L354:
            int r5 = r5 + 1
            goto L347
        L357:
            int[] r5 = r0.mInterpolateVariables
            int r5 = r5.length
            int[] r7 = new int[r2]
            r8 = 1
            r7[r8] = r5
            r5 = 0
            r7[r5] = r1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r3, r7)
            double[][] r5 = (double[][]) r5
            double[] r7 = new double[r1]
            r8 = 0
        L36b:
            r9 = 6
            if (r8 >= r1) goto L3b5
            r10 = r4[r8]
            r11 = r5[r8]
            int[] r12 = r0.mInterpolateVariables
            float[] r13 = new float[r9]
            float r14 = r10.position
            r15 = 0
            r13[r15] = r14
            float r14 = r10.x
            r15 = 1
            r13[r15] = r14
            float r14 = r10.y
            r13[r2] = r14
            float r2 = r10.width
            r14 = 3
            r13[r14] = r2
            float r2 = r10.height
            r14 = 4
            r13[r14] = r2
            float r2 = r10.mPathRotate
            r10 = 5
            r13[r10] = r2
            r2 = 0
            r10 = 0
        L395:
            int r14 = r12.length
            if (r2 >= r14) goto L3aa
            r14 = r12[r2]
            if (r14 >= r9) goto L3a6
            int r9 = r10 + 1
            r14 = r12[r2]
            r14 = r13[r14]
            double r14 = (double) r14
            r11[r10] = r14
            r10 = r9
        L3a6:
            int r2 = r2 + 1
            r9 = 6
            goto L395
        L3aa:
            r2 = r4[r8]
            float r2 = r2.time
            double r9 = (double) r2
            r7[r8] = r9
            int r8 = r8 + 1
            r2 = 2
            goto L36b
        L3b5:
            r2 = 0
        L3b6:
            int[] r8 = r0.mInterpolateVariables
            int r9 = r8.length
            if (r2 >= r9) goto L3eb
            r8 = r8[r2]
            java.lang.String[] r9 = androidx.constraintlayout.core.motion.MotionPaths.names
            r10 = 6
            if (r8 >= r10) goto L3e8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int[] r10 = r0.mInterpolateVariables
            r10 = r10[r2]
            r9 = r9[r10]
            java.lang.String r10 = " ["
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r9, r10)
            r9 = 0
        L3d4:
            if (r9 >= r1) goto L3e8
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            r10 = r5[r9]
            r11 = r10[r2]
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            int r9 = r9 + 1
            goto L3d4
        L3e8:
            int r2 = r2 + 1
            goto L3b6
        L3eb:
            java.lang.String[] r2 = r0.mAttributeNames
            int r2 = r2.length
            int r2 = r2 + 1
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = new androidx.constraintlayout.core.motion.utils.CurveFit[r2]
            r0.mSpline = r2
            r2 = 0
        L3f5:
            java.lang.String[] r8 = r0.mAttributeNames
            int r9 = r8.length
            if (r2 >= r9) goto L4ca
            r8 = r8[r2]
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L400:
            if (r9 >= r1) goto L4aa
            r13 = r4[r9]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r13 = r13.customAttributes
            boolean r13 = r13.containsKey(r8)
            if (r13 == 0) goto L49a
            if (r12 != 0) goto L431
            double[] r11 = new double[r1]
            r12 = r4[r9]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r12 = r12.customAttributes
            java.lang.Object r12 = r12.get(r8)
            androidx.constraintlayout.core.motion.CustomVariable r12 = (androidx.constraintlayout.core.motion.CustomVariable) r12
            if (r12 != 0) goto L41e
            r12 = 0
            goto L422
        L41e:
            int r12 = r12.numberOfInterpolatedValues()
        L422:
            r13 = 2
            int[] r13 = new int[r13]
            r14 = 1
            r13[r14] = r12
            r12 = 0
            r13[r12] = r1
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r3, r13)
            double[][] r12 = (double[][]) r12
        L431:
            r13 = r4[r9]
            float r13 = r13.time
            double r13 = (double) r13
            r11[r10] = r13
            r13 = r4[r9]
            r14 = r12[r10]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r13 = r13.customAttributes
            java.lang.Object r13 = r13.get(r8)
            androidx.constraintlayout.core.motion.CustomVariable r13 = (androidx.constraintlayout.core.motion.CustomVariable) r13
            if (r13 != 0) goto L451
            r16 = r3
            r17 = r4
            r20 = r8
            r21 = r11
            r22 = r12
            goto L493
        L451:
            int r15 = r13.numberOfInterpolatedValues()
            r20 = r8
            r8 = 1
            if (r15 != r8) goto L46b
            float r8 = r13.getValueToInterpolate()
            r21 = r11
            r22 = r12
            double r11 = (double) r8
            r8 = 0
            r14[r8] = r11
        L466:
            r16 = r3
            r17 = r4
            goto L493
        L46b:
            r21 = r11
            r22 = r12
            int r8 = r13.numberOfInterpolatedValues()
            float[] r11 = new float[r8]
            r13.getValuesToInterpolate(r11)
            r12 = 0
            r13 = 0
        L47a:
            if (r12 >= r8) goto L466
            int r15 = r13 + 1
            r23 = r8
            r8 = r11[r12]
            r16 = r3
            r17 = r4
            double r3 = (double) r8
            r14[r13] = r3
            int r12 = r12 + 1
            r8 = r23
            r13 = r15
            r3 = r16
            r4 = r17
            goto L47a
        L493:
            int r10 = r10 + 1
            r11 = r21
            r12 = r22
            goto L4a0
        L49a:
            r16 = r3
            r17 = r4
            r20 = r8
        L4a0:
            int r9 = r9 + 1
            r8 = r20
            r3 = r16
            r4 = r17
            goto L400
        L4aa:
            r16 = r3
            r17 = r4
            double[] r3 = java.util.Arrays.copyOf(r11, r10)
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r12, r10)
            double[][] r4 = (double[][]) r4
            androidx.constraintlayout.core.motion.utils.CurveFit[] r8 = r0.mSpline
            int r2 = r2 + 1
            int r9 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r3 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r9, r3, r4)
            r8[r2] = r3
            r3 = r16
            r4 = r17
            goto L3f5
        L4ca:
            r16 = r3
            r17 = r4
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            int r3 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r3 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r3, r7, r5)
            r4 = 0
            r2[r4] = r3
            r2 = r17[r4]
            int r2 = r2.mPathMotionArc
            r3 = -1
            if (r2 == r3) goto L521
            int[] r2 = new int[r1]
            double[] r3 = new double[r1]
            r5 = 2
            int[] r7 = new int[r5]
            r8 = 1
            r7[r8] = r5
            r7[r4] = r1
            r4 = r16
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r7)
            double[][] r4 = (double[][]) r4
            r5 = 0
        L4f5:
            if (r5 >= r1) goto L51b
            r7 = r17[r5]
            int r7 = r7.mPathMotionArc
            r2[r5] = r7
            r7 = r17[r5]
            float r7 = r7.time
            double r7 = (double) r7
            r3[r5] = r7
            r7 = r4[r5]
            r8 = r17[r5]
            float r8 = r8.x
            double r8 = (double) r8
            r10 = 0
            r7[r10] = r8
            r7 = r4[r5]
            r8 = r17[r5]
            float r8 = r8.y
            double r8 = (double) r8
            r10 = 1
            r7[r10] = r8
            int r5 = r5 + 1
            goto L4f5
        L51b:
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r2, r3, r4)
            r0.mArcSpline = r1
        L521:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mCycleMap = r2
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r2 = r0.mKeyList
            if (r2 == 0) goto L596
            java.util.Iterator r2 = r6.iterator()
        L532:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r4 = androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.makeWidgetCycle(r3)
            if (r4 != 0) goto L545
            goto L532
        L545:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L555
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L555
            float r1 = r19.getPreCycleDistance()
        L555:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L532
        L55e:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r2 = r0.mKeyList
            java.util.Iterator r2 = r2.iterator()
        L564:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L57c
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.motion.key.MotionKey r3 = (androidx.constraintlayout.core.motion.key.MotionKey) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r4 == 0) goto L564
            androidx.constraintlayout.core.motion.key.MotionKeyCycle r3 = (androidx.constraintlayout.core.motion.key.MotionKeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L564
        L57c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r2 = r0.mCycleMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L586:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L596
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r3
            r3.setup(r1)
            goto L586
        L596:
            return
    }

    public void setupRelative(androidx.constraintlayout.core.motion.Motion r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r2.mStartMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mStartMotionPath
            r0.setupRelative(r3, r1)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r2.mEndMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            r0.setupRelative(r3, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = " start: x: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mStartMotionPath
            float r1 = r1.x
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r3.mStartMotionPath
            float r2 = r2.y
            r0.append(r2)
            java.lang.String r2 = " end: x: "
            r0.append(r2)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r3.mEndMotionPath
            float r2 = r2.x
            r0.append(r2)
            r0.append(r1)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            float r1 = r1.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
