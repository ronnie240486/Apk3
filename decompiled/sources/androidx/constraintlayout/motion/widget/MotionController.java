package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes3.dex */
public class MotionController {
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
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> mAttributesMap;
    private int mCurveFitType;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> mCycleMap;
    private androidx.constraintlayout.motion.widget.MotionPaths mEndMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mEndPoint;
    public boolean mForceMeasure;
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> mKeyList;
    private androidx.constraintlayout.motion.widget.KeyTrigger[] mKeyTriggers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> mMotionPaths;
    public float mMotionStagger;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private android.view.animation.Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    public float mStaggerOffset;
    public float mStaggerScale;
    private androidx.constraintlayout.motion.widget.MotionPaths mStartMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mStartPoint;
    public android.graphics.Rect mTempRect;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private android.view.View mTransformPivotView;
    private float[] mValuesBuff;
    private float[] mVelocity;
    public android.view.View mView;


    public MotionController(android.view.View r5) {
            r4 = this;
            r4.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.mTempRect = r0
            r0 = 0
            r4.mForceMeasure = r0
            r1 = -1
            r4.mCurveFitType = r1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = new androidx.constraintlayout.motion.widget.MotionPaths
            r1.<init>()
            r4.mStartMotionPath = r1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = new androidx.constraintlayout.motion.widget.MotionPaths
            r1.<init>()
            r4.mEndMotionPath = r1
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r1.<init>()
            r4.mStartPoint = r1
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r1.<init>()
            r4.mEndPoint = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mMotionStagger = r1
            r2 = 0
            r4.mStaggerOffset = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mStaggerScale = r2
            r2 = 4
            r4.MAX_DIMENSION = r2
            float[] r2 = new float[r2]
            r4.mValuesBuff = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.mMotionPaths = r2
            r2 = 1
            float[] r2 = new float[r2]
            r4.mVelocity = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.mKeyList = r2
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r4.mPathMotionArc = r2
            r4.mTransformPivotTarget = r2
            r3 = 0
            r4.mTransformPivotView = r3
            r4.mQuantizeMotionSteps = r2
            r4.mQuantizeMotionPhase = r1
            r4.mQuantizeMotionInterpolator = r3
            r4.mNoMovement = r0
            r4.setView(r5)
            return
    }

    private float getAdjustedPosition(float r11, float[] r12) {
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L9
            r12[r1] = r2
            goto L29
        L9:
            float r3 = r10.mStaggerScale
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L29
            float r4 = r10.mStaggerOffset
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r11 = 0
        L19:
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 <= 0) goto L29
            double r8 = (double) r11
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L29
            float r11 = r11 - r4
            float r11 = r11 * r3
            float r11 = java.lang.Math.min(r11, r2)
        L29:
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r10.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r5 = r10.mMotionPaths
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.motion.widget.MotionPaths r6 = (androidx.constraintlayout.motion.widget.MotionPaths) r6
            androidx.constraintlayout.core.motion.utils.Easing r7 = r6.mKeyFrameEasing
            if (r7 == 0) goto L35
            float r8 = r6.time
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4e
            r3 = r7
            r0 = r8
            goto L35
        L4e:
            boolean r7 = java.lang.Float.isNaN(r4)
            if (r7 == 0) goto L35
            float r4 = r6.time
            goto L35
        L57:
            if (r3 == 0) goto L76
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 == 0) goto L60
            goto L61
        L60:
            r2 = r4
        L61:
            float r11 = r11 - r0
            float r2 = r2 - r0
            float r11 = r11 / r2
            double r4 = (double) r11
            double r6 = r3.get(r4)
            float r11 = (float) r6
            float r11 = r11 * r2
            float r11 = r11 + r0
            if (r12 == 0) goto L76
            double r2 = r3.getDiff(r4)
            float r0 = (float) r2
            r12[r1] = r0
        L76:
            return r11
    }

    private static android.view.animation.Interpolator getInterpolator(android.content.Context r1, int r2, java.lang.String r3, int r4) {
            r0 = -2
            if (r2 == r0) goto L3e
            r1 = -1
            if (r2 == r1) goto L34
            if (r2 == 0) goto L2e
            r1 = 1
            if (r2 == r1) goto L28
            r1 = 2
            if (r2 == r1) goto L22
            r1 = 4
            if (r2 == r1) goto L1c
            r1 = 5
            if (r2 == r1) goto L16
            r1 = 0
            return r1
        L16:
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            return r1
        L1c:
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            return r1
        L22:
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            return r1
        L28:
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            return r1
        L2e:
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            return r1
        L34:
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r3)
            androidx.constraintlayout.motion.widget.MotionController$1 r2 = new androidx.constraintlayout.motion.widget.MotionController$1
            r2.<init>(r1)
            return r2
        L3e:
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r4)
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
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r5 = r5.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r6 = r0.mMotionPaths
            java.util.Iterator r6 = r6.iterator()
            r17 = 2143289344(0x7fc00000, float:NaN)
            r18 = 0
        L28:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L51
            java.lang.Object r19 = r6.next()
            r9 = r19
            androidx.constraintlayout.motion.widget.MotionPaths r9 = (androidx.constraintlayout.motion.widget.MotionPaths) r9
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
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
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

    private void insertKey(androidx.constraintlayout.motion.widget.MotionPaths r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r3.mMotionPaths
            int r0 = java.util.Collections.binarySearch(r0, r4)
            if (r0 != 0) goto L21
            java.lang.String r1 = " KeyPath position \""
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            float r2 = r4.position
            r1.append(r2)
            java.lang.String r2 = "\" outside of range"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MotionController"
            android.util.Log.e(r2, r1)
        L21:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r3.mMotionPaths
            int r0 = -r0
            int r0 = r0 + (-1)
            r1.add(r0, r4)
            return
    }

    private void readView(androidx.constraintlayout.motion.widget.MotionPaths r5) {
            r4 = this;
            android.view.View r0 = r4.mView
            float r0 = r0.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            android.view.View r1 = r4.mView
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            android.view.View r2 = r4.mView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.view.View r3 = r4.mView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.setBounds(r0, r1, r2, r3)
            return
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
            r0.add(r2)
            return
    }

    public final void addKeys(java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
            r0.addAll(r2)
            return
    }

    public final int buildKeyFrames(float[] r11, int[] r12) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L4d
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r10.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r12 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r10.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r12[r3] = r4
            r3 = r5
            goto L14
        L28:
            r12 = 0
            r9 = 0
        L2a:
            int r2 = r1.length
            if (r12 >= r2) goto L4a
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r10.mSpline
            r2 = r2[r0]
            r3 = r1[r12]
            double[] r5 = r10.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r10.mStartMotionPath
            r3 = r1[r12]
            int[] r5 = r10.mInterpolateVariables
            double[] r6 = r10.mInterpolateData
            r7 = r11
            r8 = r9
            r2.getCenter(r3, r5, r6, r7, r8)
            int r9 = r9 + 2
            int r12 = r12 + 1
            goto L2a
        L4a:
            int r9 = r9 / 2
            return r9
        L4d:
            return r0
    }

    public final void buildPath(float[] r22, int r23) {
            r21 = this;
            r0 = r21
            r8 = r23
            int r1 = r8 + (-1)
            float r1 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
            java.lang.String r4 = "translationY"
            if (r1 != 0) goto L25
            r12 = r3
            goto L2c
        L25:
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r12 = r1
        L2c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L32
            r13 = r3
            goto L39
        L32:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.motion.utils.ViewOscillator r1 = (androidx.constraintlayout.motion.utils.ViewOscillator) r1
            r13 = r1
        L39:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L3e
            goto L45
        L3e:
            java.lang.Object r1 = r1.get(r4)
            r3 = r1
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
        L45:
            r14 = r3
            r7 = 0
        L47:
            if (r7 >= r8) goto L126
            float r1 = (float) r7
            float r1 = r1 * r10
            float r2 = r0.mStaggerScale
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L6b
            float r4 = r0.mStaggerOffset
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L59
            r1 = 0
        L59:
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L6b
            double r5 = (double) r1
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r18 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r18 >= 0) goto L6b
            float r1 = r1 - r4
            float r1 = r1 * r2
            float r1 = java.lang.Math.min(r1, r9)
        L6b:
            r6 = r1
            double r1 = (double) r6
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r4 = r4.mKeyFrameEasing
            r5 = 2143289344(0x7fc00000, float:NaN)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r3 = r0.mMotionPaths
            java.util.Iterator r3 = r3.iterator()
            r16 = 0
        L7b:
            boolean r17 = r3.hasNext()
            if (r17 == 0) goto La7
            java.lang.Object r17 = r3.next()
            r9 = r17
            androidx.constraintlayout.motion.widget.MotionPaths r9 = (androidx.constraintlayout.motion.widget.MotionPaths) r9
            androidx.constraintlayout.core.motion.utils.Easing r15 = r9.mKeyFrameEasing
            r19 = r1
            if (r15 == 0) goto La2
            float r1 = r9.time
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L99
            r16 = r1
            r4 = r15
            goto La2
        L99:
            boolean r1 = java.lang.Float.isNaN(r5)
            if (r1 == 0) goto La2
            float r1 = r9.time
            r5 = r1
        La2:
            r1 = r19
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L7b
        La7:
            r19 = r1
            if (r4 == 0) goto Lc5
            boolean r1 = java.lang.Float.isNaN(r5)
            if (r1 == 0) goto Lb3
            r5 = 1065353216(0x3f800000, float:1.0)
        Lb3:
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
            goto Lc7
        Lc5:
            r2 = r19
        Lc7:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r9 = 0
            r1 = r1[r9]
            double[] r4 = r0.mInterpolateData
            r1.getPos(r2, r4)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto Ldd
            double[] r4 = r0.mInterpolateData
            int r5 = r4.length
            if (r5 <= 0) goto Ldd
            r1.getPos(r2, r4)
        Ldd:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            int r15 = r7 * 2
            r9 = r6
            r6 = r22
            r16 = r7
            r7 = r15
            r1.getCenter(r2, r4, r5, r6, r7)
            if (r13 == 0) goto Lfa
            r1 = r22[r15]
            float r2 = r13.get(r9)
            float r2 = r2 + r1
            r22[r15] = r2
            goto L105
        Lfa:
            if (r11 == 0) goto L105
            r1 = r22[r15]
            float r2 = r11.get(r9)
            float r2 = r2 + r1
            r22[r15] = r2
        L105:
            if (r14 == 0) goto L113
            int r15 = r15 + 1
            r1 = r22[r15]
            float r2 = r14.get(r9)
            float r2 = r2 + r1
            r22[r15] = r2
            goto L120
        L113:
            if (r12 == 0) goto L120
            int r15 = r15 + 1
            r1 = r22[r15]
            float r2 = r12.get(r9)
            float r2 = r2 + r1
            r22[r15] = r2
        L120:
            int r7 = r16 + 1
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L47
        L126:
            return
    }

    public final void buildRect(float r5, float[] r6) {
            r4 = this;
            r0 = 0
            float r5 = r4.getAdjustedPosition(r5, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r4.mSpline
            r1 = 0
            r0 = r0[r1]
            double r2 = (double) r5
            double[] r5 = r4.mInterpolateData
            r0.getPos(r2, r5)
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r4.mStartMotionPath
            int[] r0 = r4.mInterpolateVariables
            double[] r2 = r4.mInterpolateData
            r5.getRect(r0, r2, r6, r1)
            return
    }

    public final void buildRectangles(float[] r8, int r9) {
            r7 = this;
            int r0 = r9 + (-1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            r0 = 0
            r2 = 0
        L8:
            if (r2 >= r9) goto L2a
            float r3 = (float) r2
            float r3 = r3 * r1
            r4 = 0
            float r3 = r7.getAdjustedPosition(r3, r4)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r7.mSpline
            r4 = r4[r0]
            double r5 = (double) r3
            double[] r3 = r7.mInterpolateData
            r4.getPos(r5, r3)
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            int r6 = r2 * 8
            r3.getRect(r4, r5, r8, r6)
            int r2 = r2 + 1
            goto L8
        L2a:
            return
    }

    public final void endTrigger(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.mView
            java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getName(r0)
            java.lang.String r1 = "button"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            androidx.constraintlayout.motion.widget.KeyTrigger[] r0 = r4.mKeyTriggers
            if (r0 == 0) goto L29
            r0 = 0
        L13:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r4.mKeyTriggers
            int r2 = r1.length
            if (r0 >= r2) goto L29
            r1 = r1[r0]
            if (r5 == 0) goto L1f
            r2 = -1027080192(0xffffffffc2c80000, float:-100.0)
            goto L21
        L1f:
            r2 = 1120403456(0x42c80000, float:100.0)
        L21:
            android.view.View r3 = r4.mView
            r1.conditionallyFire(r2, r3)
            int r0 = r0 + 1
            goto L13
        L29:
            return
    }

    public int getAnimateRelativeTo() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            int r0 = r0.mAnimateRelativeTo
            return r0
    }

    public final int getAttributeValues(java.lang.String r4, float[] r5) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r0 = r3.mAttributesMap
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.core.motion.utils.SplineSet r4 = (androidx.constraintlayout.core.motion.utils.SplineSet) r4
            r0 = -1
            if (r4 != 0) goto Lc
            return r0
        Lc:
            r1 = 0
        Ld:
            int r2 = r5.length
            if (r1 >= r2) goto L1e
            int r2 = r5.length
            int r2 = r2 + r0
            int r2 = r1 / r2
            float r2 = (float) r2
            float r2 = r4.get(r2)
            r5[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1e:
            int r4 = r5.length
            return r4
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
            androidx.constraintlayout.motion.widget.MotionPaths r9 = r0.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionController r1 = r9.mRelativeToController
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

    public final void getDpDt(float r12, float r13, float r14, float[] r15) {
            r11 = this;
            float[] r0 = r11.mVelocity
            float r12 = r11.getAdjustedPosition(r12, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r11.mSpline
            r1 = 0
            if (r0 == 0) goto L5e
            r0 = r0[r1]
            double r2 = (double) r12
            double[] r12 = r11.mInterpolateVelocity
            r0.getSlope(r2, r12)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r12 = r11.mSpline
            r12 = r12[r1]
            double[] r0 = r11.mInterpolateData
            r12.getPos(r2, r0)
            float[] r12 = r11.mVelocity
            r12 = r12[r1]
        L20:
            double[] r9 = r11.mInterpolateVelocity
            int r0 = r9.length
            if (r1 >= r0) goto L2f
            r4 = r9[r1]
            double r6 = (double) r12
            double r4 = r4 * r6
            r9[r1] = r4
            int r1 = r1 + 1
            goto L20
        L2f:
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = r11.mArcSpline
            if (r12 == 0) goto L51
            double[] r0 = r11.mInterpolateData
            int r1 = r0.length
            if (r1 <= 0) goto L50
            r12.getPos(r2, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = r11.mArcSpline
            double[] r0 = r11.mInterpolateVelocity
            r12.getSlope(r2, r0)
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r9 = r11.mInterpolateVelocity
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
        L50:
            return
        L51:
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
            return
        L5e:
            androidx.constraintlayout.motion.widget.MotionPaths r12 = r11.mEndMotionPath
            float r0 = r12.x
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r11.mStartMotionPath
            float r3 = r2.x
            float r0 = r0 - r3
            float r3 = r12.y
            float r4 = r2.y
            float r3 = r3 - r4
            float r4 = r12.width
            float r5 = r2.width
            float r4 = r4 - r5
            float r12 = r12.height
            float r2 = r2.height
            float r12 = r12 - r2
            float r4 = r4 + r0
            float r12 = r12 + r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r2 - r13
            float r5 = r5 * r0
            float r4 = r4 * r13
            float r4 = r4 + r5
            r15[r1] = r4
            float r2 = r2 - r14
            float r2 = r2 * r3
            float r12 = r12 * r14
            float r12 = r12 + r2
            r13 = 1
            r15[r13] = r12
            return
    }

    public int getDrawPath() {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r3.mStartMotionPath
            int r0 = r0.mDrawPath
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r3.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            int r2 = r2.mDrawPath
            int r0 = java.lang.Math.max(r0, r2)
            goto La
        L1d:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            int r1 = r1.mDrawPath
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public float getFinalHeight() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.height
            return r0
    }

    public float getFinalWidth() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.width
            return r0
    }

    public float getFinalX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.x
            return r0
    }

    public float getFinalY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.y
            return r0
    }

    public final androidx.constraintlayout.motion.widget.MotionPaths getKeyFrame(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r1.mMotionPaths
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            return r2
    }

    public int getKeyFrameInfo(int r18, int[] r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            float[] r2 = new float[r2]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r3 = r0.mKeyList
            java.util.Iterator r10 = r3.iterator()
            r11 = 0
            r12 = 0
            r13 = 0
        L10:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r10.next()
            r14 = r3
            androidx.constraintlayout.motion.widget.Key r14 = (androidx.constraintlayout.motion.widget.Key) r14
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mStartMotionPath
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
            boolean r3 = r14 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r3 == 0) goto L82
            androidx.constraintlayout.motion.widget.KeyPosition r14 = (androidx.constraintlayout.motion.widget.KeyPosition) r14
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

    public final float getKeyFrameParameter(int r11, float r12, float r13) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r10.mEndMotionPath
            float r1 = r0.x
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r10.mStartMotionPath
            float r3 = r2.x
            float r1 = r1 - r3
            float r0 = r0.y
            float r4 = r2.y
            float r0 = r0 - r4
            float r5 = r2.width
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r5 = r5 + r3
            float r2 = r2.height
            float r2 = r2 / r6
            float r2 = r2 + r4
            double r3 = (double) r1
            double r6 = (double) r0
            double r3 = java.lang.Math.hypot(r3, r6)
            float r3 = (float) r3
            double r6 = (double) r3
            r8 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2c
            r11 = 2143289344(0x7fc00000, float:NaN)
            return r11
        L2c:
            float r12 = r12 - r5
            float r13 = r13 - r2
            double r4 = (double) r12
            double r6 = (double) r13
            double r4 = java.lang.Math.hypot(r4, r6)
            float r2 = (float) r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L3b
            return r4
        L3b:
            float r2 = r12 * r1
            float r5 = r13 * r0
            float r5 = r5 + r2
            if (r11 == 0) goto L66
            r2 = 1
            if (r11 == r2) goto L5a
            r2 = 2
            if (r11 == r2) goto L58
            r2 = 3
            if (r11 == r2) goto L56
            r1 = 4
            if (r11 == r1) goto L54
            r12 = 5
            if (r11 == r12) goto L52
            return r4
        L52:
            float r13 = r13 / r0
            return r13
        L54:
            float r12 = r12 / r0
            return r12
        L56:
            float r13 = r13 / r1
            return r13
        L58:
            float r12 = r12 / r1
            return r12
        L5a:
            float r3 = r3 * r3
            float r5 = r5 * r5
            float r3 = r3 - r5
            double r11 = (double) r3
            double r11 = java.lang.Math.sqrt(r11)
            float r11 = (float) r11
            return r11
        L66:
            float r5 = r5 / r3
            return r5
    }

    public int getKeyFramePositions(int[] r13, float[] r14) {
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r12.mKeyList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r10 = 0
        L9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r12.mStartMotionPath
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

    public final androidx.constraintlayout.motion.widget.KeyPositionBase getPositionKeyframe(int r12, int r13, float r14, float r15) {
            r11 = this;
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mStartMotionPath
            float r1 = r0.x
            r7.left = r1
            float r2 = r0.y
            r7.top = r2
            float r3 = r0.width
            float r1 = r1 + r3
            r7.right = r1
            float r0 = r0.height
            float r2 = r2 + r0
            r7.bottom = r2
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mEndMotionPath
            float r1 = r0.x
            r8.left = r1
            float r2 = r0.y
            r8.top = r2
            float r3 = r0.width
            float r1 = r1 + r3
            r8.right = r1
            float r0 = r0.height
            float r2 = r2 + r0
            r8.bottom = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r11.mKeyList
            java.util.Iterator r9 = r0.iterator()
        L38:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r9.next()
            androidx.constraintlayout.motion.widget.Key r0 = (androidx.constraintlayout.motion.widget.Key) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.KeyPositionBase
            if (r1 == 0) goto L38
            r10 = r0
            androidx.constraintlayout.motion.widget.KeyPositionBase r10 = (androidx.constraintlayout.motion.widget.KeyPositionBase) r10
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r7
            r4 = r8
            r5 = r14
            r6 = r15
            boolean r0 = r0.intersects(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L38
            return r10
        L59:
            r12 = 0
            return r12
    }

    public final void getPostLayoutDvDp(float r19, int r20, int r21, float r22, float r23, float[] r24) {
            r18 = this;
            r0 = r18
            float[] r1 = r0.mVelocity
            r2 = r19
            float r1 = r0.getAdjustedPosition(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2 = r0.mAttributesMap
            java.lang.String r3 = "translationX"
            r4 = 0
            if (r2 != 0) goto L14
            r2 = r4
            goto L1a
        L14:
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
        L1a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r5 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r5 != 0) goto L23
            r5 = r4
            goto L29
        L23:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.core.motion.utils.SplineSet r5 = (androidx.constraintlayout.core.motion.utils.SplineSet) r5
        L29:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            java.lang.String r8 = "rotation"
            if (r7 != 0) goto L32
            r7 = r4
            goto L38
        L32:
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = (androidx.constraintlayout.core.motion.utils.SplineSet) r7
        L38:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r9 = r0.mAttributesMap
            java.lang.String r10 = "scaleX"
            if (r9 != 0) goto L41
            r9 = r4
            goto L47
        L41:
            java.lang.Object r9 = r9.get(r10)
            androidx.constraintlayout.core.motion.utils.SplineSet r9 = (androidx.constraintlayout.core.motion.utils.SplineSet) r9
        L47:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            java.lang.String r12 = "scaleY"
            if (r11 != 0) goto L50
            r11 = r4
            goto L56
        L50:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = (androidx.constraintlayout.core.motion.utils.SplineSet) r11
        L56:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L5c
            r3 = r4
            goto L62
        L5c:
            java.lang.Object r3 = r13.get(r3)
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
        L62:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L68
            r6 = r4
            goto L6e
        L68:
            java.lang.Object r6 = r13.get(r6)
            androidx.constraintlayout.motion.utils.ViewOscillator r6 = (androidx.constraintlayout.motion.utils.ViewOscillator) r6
        L6e:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L74
            r8 = r4
            goto L7a
        L74:
            java.lang.Object r8 = r13.get(r8)
            androidx.constraintlayout.motion.utils.ViewOscillator r8 = (androidx.constraintlayout.motion.utils.ViewOscillator) r8
        L7a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L80
            r10 = r4
            goto L86
        L80:
            java.lang.Object r10 = r13.get(r10)
            androidx.constraintlayout.motion.utils.ViewOscillator r10 = (androidx.constraintlayout.motion.utils.ViewOscillator) r10
        L86:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L8b
            goto L91
        L8b:
            java.lang.Object r4 = r13.get(r12)
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = (androidx.constraintlayout.motion.utils.ViewOscillator) r4
        L91:
            androidx.constraintlayout.core.motion.utils.VelocityMatrix r12 = new androidx.constraintlayout.core.motion.utils.VelocityMatrix
            r12.<init>()
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r12.setScaleVelocity(r10, r4, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit r13 = r0.mArcSpline
            if (r13 == 0) goto Ldf
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto Ld0
            double r3 = (double) r1
            r13.getPos(r3, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r3, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r6 = r0.mInterpolateVelocity
            double[] r7 = r0.mInterpolateData
            r2 = r22
            r3 = r23
            r4 = r24
            r1.setDpDt(r2, r3, r4, r5, r6, r7)
        Ld0:
            r1 = r12
            r2 = r22
            r3 = r23
            r4 = r20
            r5 = r21
            r6 = r24
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
        Ldf:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r13 = r0.mSpline
            r14 = 0
            if (r13 == 0) goto L12a
            float[] r2 = r0.mVelocity
            float r1 = r0.getAdjustedPosition(r1, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r14]
            double r3 = (double) r1
            double[] r1 = r0.mInterpolateVelocity
            r2.getSlope(r3, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r14]
            double[] r2 = r0.mInterpolateData
            r1.getPos(r3, r2)
            float[] r1 = r0.mVelocity
            r1 = r1[r14]
        L101:
            double[] r6 = r0.mInterpolateVelocity
            int r2 = r6.length
            if (r14 >= r2) goto L110
            r2 = r6[r14]
            double r4 = (double) r1
            double r2 = r2 * r4
            r6[r14] = r2
            int r14 = r14 + 1
            goto L101
        L110:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r7 = r0.mInterpolateData
            r2 = r22
            r3 = r23
            r4 = r24
            r1.setDpDt(r2, r3, r4, r5, r6, r7)
            r1 = r12
            r4 = r20
            r5 = r21
            r6 = r24
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
        L12a:
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mEndMotionPath
            float r15 = r13.x
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            float r0 = r14.x
            float r15 = r15 - r0
            float r0 = r13.y
            r16 = r4
            float r4 = r14.y
            float r0 = r0 - r4
            float r4 = r13.width
            r17 = r10
            float r10 = r14.width
            float r4 = r4 - r10
            float r10 = r13.height
            float r13 = r14.height
            float r10 = r10 - r13
            float r4 = r4 + r15
            float r10 = r10 + r0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r14 = r13 - r22
            float r14 = r14 * r15
            float r4 = r4 * r22
            float r4 = r4 + r14
            r14 = 0
            r24[r14] = r4
            float r13 = r13 - r23
            float r13 = r13 * r0
            float r10 = r10 * r23
            float r10 = r10 + r13
            r0 = 1
            r24[r0] = r10
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r4 = r16
            r10 = r17
            r12.setScaleVelocity(r10, r4, r1)
            r1 = r12
            r2 = r22
            r3 = r23
            r4 = r20
            r5 = r21
            r6 = r24
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
    }

    public float getStartHeight() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.height
            return r0
    }

    public float getStartWidth() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.width
            return r0
    }

    public float getStartX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.x
            return r0
    }

    public float getStartY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.y
            return r0
    }

    public int getTransformPivotTarget() {
            r1 = this;
            int r0 = r1.mTransformPivotTarget
            return r0
    }

    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.mView
            return r0
    }

    public final boolean interpolate(android.view.View r29, float r30, long r31, androidx.constraintlayout.core.motion.utils.KeyCache r33) {
            r28 = this;
            r0 = r28
            r11 = r29
            r1 = 0
            r2 = r30
            float r2 = r0.getAdjustedPosition(r2, r1)
            int r3 = r0.mQuantizeMotionSteps
            int r4 = androidx.constraintlayout.motion.widget.Key.UNSET
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L45
            float r3 = (float) r3
            float r3 = r5 / r3
            float r4 = r2 / r3
            double r6 = (double) r4
            double r6 = java.lang.Math.floor(r6)
            float r4 = (float) r6
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r6 = r0.mQuantizeMotionPhase
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L2e
            float r6 = r0.mQuantizeMotionPhase
            float r2 = r2 + r6
            float r2 = r2 % r5
        L2e:
            android.view.animation.Interpolator r5 = r0.mQuantizeMotionInterpolator
            if (r5 == 0) goto L37
            float r2 = r5.getInterpolation(r2)
            goto L42
        L37:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L41
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L42
        L41:
            r2 = 0
        L42:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L45:
            r12 = r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2 = r0.mAttributesMap
            if (r2 == 0) goto L62
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.ViewSpline r3 = (androidx.constraintlayout.motion.utils.ViewSpline) r3
            r3.setProperty(r11, r12)
            goto L52
        L62:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r2 = r0.mTimeCycleAttributesMap
            r7 = 0
            if (r2 == 0) goto L95
            java.util.Collection r2 = r2.values()
            java.util.Iterator r8 = r2.iterator()
            r2 = 0
            r9 = r1
            r10 = 0
        L72:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.utils.ViewTimeCycle r1 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate
            if (r2 == 0) goto L86
            r9 = r1
            androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate r9 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) r9
            goto L72
        L86:
            r2 = r29
            r3 = r12
            r4 = r31
            r6 = r33
            boolean r1 = r1.setProperty(r2, r3, r4, r6)
            r10 = r10 | r1
            goto L72
        L93:
            r13 = r10
            goto L98
        L95:
            r10 = 0
            r9 = r1
            r13 = 0
        L98:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            if (r1 == 0) goto L3af
            r1 = r1[r7]
            double r14 = (double) r12
            double[] r2 = r0.mInterpolateData
            r1.getPos(r14, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r7]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r14, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto Lc0
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto Lc0
            r1.getPos(r14, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r14, r2)
        Lc0:
            boolean r1 = r0.mNoMovement
            if (r1 != 0) goto L288
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r2 = r0.mInterpolateVariables
            double[] r3 = r0.mInterpolateData
            double[] r4 = r0.mInterpolateVelocity
            boolean r5 = r0.mForceMeasure
            float r6 = r1.x
            float r7 = r1.y
            float r8 = r1.width
            float r10 = r1.height
            r30 = r6
            int r6 = r2.length
            if (r6 == 0) goto Lf7
            double[] r6 = r1.mTempValue
            int r6 = r6.length
            r16 = r7
            int r7 = r2.length
            int r7 = r7 + (-1)
            r7 = r2[r7]
            if (r6 > r7) goto Lf9
            int r6 = r2.length
            int r6 = r6 + (-1)
            r6 = r2[r6]
            int r6 = r6 + 1
            double[] r7 = new double[r6]
            r1.mTempValue = r7
            double[] r6 = new double[r6]
            r1.mTempDelta = r6
            goto Lf9
        Lf7:
            r16 = r7
        Lf9:
            double[] r6 = r1.mTempValue
            r17 = r8
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r6, r7)
            r6 = 0
        L103:
            int r7 = r2.length
            if (r6 >= r7) goto L119
            double[] r7 = r1.mTempValue
            r8 = r2[r6]
            r18 = r3[r6]
            r7[r8] = r18
            double[] r7 = r1.mTempDelta
            r8 = r2[r6]
            r18 = r4[r6]
            r7[r8] = r18
            int r6 = r6 + 1
            goto L103
        L119:
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r6 = r30
            r19 = r9
            r30 = r13
            r7 = 0
            r8 = 0
            r13 = 0
            r27 = r16
            r16 = r10
            r10 = r27
        L130:
            double[] r9 = r1.mTempValue
            r20 = r12
            int r12 = r9.length
            if (r13 >= r12) goto L187
            r21 = r9[r13]
            boolean r9 = java.lang.Double.isNaN(r21)
            if (r9 == 0) goto L141
            r12 = r8
            goto L181
        L141:
            r21 = 0
            double[] r9 = r1.mTempValue
            r23 = r9[r13]
            boolean r9 = java.lang.Double.isNaN(r23)
            if (r9 == 0) goto L14e
            goto L154
        L14e:
            double[] r9 = r1.mTempValue
            r23 = r9[r13]
            double r21 = r23 + r21
        L154:
            r12 = r8
            r8 = r21
            float r8 = (float) r8
            double[] r9 = r1.mTempDelta
            r21 = r8
            r8 = r9[r13]
            float r8 = (float) r8
            r9 = 1
            if (r13 == r9) goto L17e
            r9 = 2
            if (r13 == r9) goto L17a
            r9 = 3
            if (r13 == r9) goto L177
            r9 = 4
            if (r13 == r9) goto L172
            r8 = 5
            if (r13 == r8) goto L16f
            goto L181
        L16f:
            r2 = r21
            goto L181
        L172:
            r18 = r8
            r16 = r21
            goto L181
        L177:
            r17 = r21
            goto L182
        L17a:
            r7 = r8
            r10 = r21
            goto L181
        L17e:
            r3 = r8
            r6 = r21
        L181:
            r8 = r12
        L182:
            int r13 = r13 + 1
            r12 = r20
            goto L130
        L187:
            r12 = r8
            androidx.constraintlayout.motion.widget.MotionController r1 = r1.mRelativeToController
            if (r1 == 0) goto L219
            r8 = 2
            float[] r9 = new float[r8]
            float[] r8 = new float[r8]
            r1.getCenter(r14, r9, r8)
            r1 = 0
            r12 = r9[r1]
            r13 = 1
            r9 = r9[r13]
            r1 = r8[r1]
            r8 = r8[r13]
            double r12 = (double) r12
            r21 = r14
            double r14 = (double) r6
            r23 = r5
            double r5 = (double) r10
            double r24 = java.lang.Math.sin(r5)
            double r24 = r24 * r14
            double r24 = r24 + r12
            r10 = 1073741824(0x40000000, float:2.0)
            float r10 = r17 / r10
            double r12 = (double) r10
            double r12 = r24 - r12
            float r10 = (float) r12
            double r12 = (double) r9
            double r24 = java.lang.Math.cos(r5)
            double r24 = r24 * r14
            double r12 = r12 - r24
            r9 = 1073741824(0x40000000, float:2.0)
            float r9 = r16 / r9
            r18 = r10
            double r9 = (double) r9
            double r12 = r12 - r9
            float r10 = (float) r12
            double r12 = (double) r1
            r1 = r10
            double r9 = (double) r3
            double r24 = java.lang.Math.sin(r5)
            double r24 = r24 * r9
            double r24 = r24 + r12
            double r12 = java.lang.Math.cos(r5)
            double r12 = r12 * r14
            r26 = r1
            double r0 = (double) r7
            double r12 = r12 * r0
            double r12 = r12 + r24
            float r3 = (float) r12
            double r7 = (double) r8
            double r12 = java.lang.Math.cos(r5)
            double r12 = r12 * r9
            double r7 = r7 - r12
            double r5 = java.lang.Math.sin(r5)
            double r5 = r5 * r14
            double r5 = r5 * r0
            double r5 = r5 + r7
            float r0 = (float) r5
            int r1 = r4.length
            r5 = 2
            if (r1 < r5) goto L1fe
            double r5 = (double) r3
            r1 = 0
            r4[r1] = r5
            double r5 = (double) r0
            r1 = 1
            r4[r1] = r5
        L1fe:
            boolean r1 = java.lang.Float.isNaN(r2)
            if (r1 != 0) goto L214
            double r1 = (double) r2
            double r4 = (double) r0
            double r6 = (double) r3
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = java.lang.Math.toDegrees(r3)
            double r3 = r3 + r1
            float r0 = (float) r3
            r11.setRotation(r0)
        L214:
            r6 = r18
            r10 = r26
            goto L23f
        L219:
            r23 = r5
            r21 = r14
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L23f
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r12 / r0
            float r8 = r8 + r3
            float r18 = r18 / r0
            float r0 = r18 + r7
            r1 = 0
            double r3 = (double) r1
            double r1 = (double) r2
            double r12 = (double) r0
            double r7 = (double) r8
            double r7 = java.lang.Math.atan2(r12, r7)
            double r7 = java.lang.Math.toDegrees(r7)
            double r7 = r7 + r1
            double r7 = r7 + r3
            float r0 = (float) r7
            r11.setRotation(r0)
        L23f:
            boolean r0 = r11 instanceof androidx.constraintlayout.motion.widget.FloatLayout
            if (r0 == 0) goto L24e
            float r0 = r17 + r6
            float r1 = r16 + r10
            r2 = r11
            androidx.constraintlayout.motion.widget.FloatLayout r2 = (androidx.constraintlayout.motion.widget.FloatLayout) r2
            r2.layout(r6, r10, r0, r1)
            goto L282
        L24e:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r1 = (int) r6
            float r10 = r10 + r0
            int r0 = (int) r10
            float r6 = r6 + r17
            int r2 = (int) r6
            float r10 = r10 + r16
            int r3 = (int) r10
            int r4 = r2 - r1
            int r5 = r3 - r0
            int r6 = r29.getMeasuredWidth()
            if (r4 != r6) goto L26d
            int r6 = r29.getMeasuredHeight()
            if (r5 == r6) goto L26b
            goto L26d
        L26b:
            r6 = 0
            goto L26e
        L26d:
            r6 = 1
        L26e:
            if (r6 != 0) goto L272
            if (r23 == 0) goto L27f
        L272:
            r6 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r11.measure(r4, r5)
        L27f:
            r11.layout(r1, r0, r2, r3)
        L282:
            r0 = 0
            r12 = r28
            r12.mForceMeasure = r0
            goto L291
        L288:
            r19 = r9
            r20 = r12
            r30 = r13
            r21 = r14
            r12 = r0
        L291:
            int r0 = r12.mTransformPivotTarget
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r0 == r1) goto L2f3
            android.view.View r0 = r12.mTransformPivotView
            if (r0 != 0) goto L2a9
            android.view.ViewParent r0 = r29.getParent()
            android.view.View r0 = (android.view.View) r0
            int r1 = r12.mTransformPivotTarget
            android.view.View r0 = r0.findViewById(r1)
            r12.mTransformPivotView = r0
        L2a9:
            android.view.View r0 = r12.mTransformPivotView
            if (r0 == 0) goto L2f3
            int r0 = r0.getTop()
            android.view.View r1 = r12.mTransformPivotView
            int r1 = r1.getBottom()
            int r1 = r1 + r0
            float r0 = (float) r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.view.View r2 = r12.mTransformPivotView
            int r2 = r2.getLeft()
            android.view.View r3 = r12.mTransformPivotView
            int r3 = r3.getRight()
            int r3 = r3 + r2
            float r2 = (float) r3
            float r2 = r2 / r1
            int r1 = r29.getRight()
            int r3 = r29.getLeft()
            int r1 = r1 - r3
            if (r1 <= 0) goto L2f3
            int r1 = r29.getBottom()
            int r3 = r29.getTop()
            int r1 = r1 - r3
            if (r1 <= 0) goto L2f3
            int r1 = r29.getLeft()
            float r1 = (float) r1
            float r2 = r2 - r1
            int r1 = r29.getTop()
            float r1 = (float) r1
            float r0 = r0 - r1
            r11.setPivotX(r2)
            r11.setPivotY(r0)
        L2f3:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r0 = r12.mAttributesMap
            if (r0 == 0) goto L326
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2ff:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L326
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate
            if (r2 == 0) goto L2ff
            double[] r2 = r12.mInterpolateVelocity
            int r3 = r2.length
            r4 = 1
            if (r3 <= r4) goto L2ff
            androidx.constraintlayout.motion.utils.ViewSpline$PathRotate r1 = (androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) r1
            r3 = 0
            r5 = r2[r3]
            r7 = r2[r4]
            r2 = r29
            r3 = r20
            r4 = r5
            r6 = r7
            r1.setPathRotate(r2, r3, r4, r6)
            goto L2ff
        L326:
            if (r19 == 0) goto L343
            double[] r0 = r12.mInterpolateVelocity
            r1 = 0
            r7 = r0[r1]
            r1 = 1
            r9 = r0[r1]
            r0 = 1
            r1 = r19
            r2 = r29
            r3 = r33
            r4 = r20
            r5 = r31
            boolean r1 = r1.setPathRotate(r2, r3, r4, r5, r7, r9)
            r1 = r30 | r1
            r13 = r1
            goto L346
        L343:
            r0 = 1
            r13 = r30
        L346:
            r1 = 1
        L347:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r12.mSpline
            int r3 = r2.length
            if (r1 >= r3) goto L36d
            r2 = r2[r1]
            float[] r3 = r12.mValuesBuff
            r4 = r21
            r2.getPos(r4, r3)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r12.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.attributes
            java.lang.String[] r3 = r12.mAttributeNames
            int r6 = r1 + (-1)
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            float[] r3 = r12.mValuesBuff
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r2, r11, r3)
            int r1 = r1 + 1
            goto L347
        L36d:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r12.mStartPoint
            int r2 = r1.mVisibilityMode
            if (r2 != 0) goto L398
            r2 = 0
            int r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r2 > 0) goto L37e
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L398
        L37e:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r2 < 0) goto L38c
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r12.mEndPoint
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L398
        L38c:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2 = r12.mEndPoint
            int r2 = r2.visibility
            int r1 = r1.visibility
            if (r2 == r1) goto L398
            r1 = 0
            r11.setVisibility(r1)
        L398:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r12.mKeyTriggers
            if (r1 == 0) goto L3ac
            r1 = 0
        L39d:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r2 = r12.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L3ac
            r2 = r2[r1]
            r8 = r20
            r2.conditionallyFire(r8, r11)
            int r1 = r1 + 1
            goto L39d
        L3ac:
            r8 = r20
            goto L407
        L3af:
            r8 = r12
            r30 = r13
            r12 = r0
            r0 = 1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r12.mStartMotionPath
            float r2 = r1.x
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r12.mEndMotionPath
            float r4 = r3.x
            float r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r8, r2)
            float r4 = r1.y
            float r5 = r3.y
            float r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r4, r8, r4)
            float r5 = r1.width
            float r6 = r3.width
            float r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5, r8, r5)
            float r1 = r1.height
            float r3 = r3.height
            float r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r8, r1)
            r10 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r10
            int r13 = (int) r2
            float r4 = r4 + r10
            int r10 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r9
            int r4 = (int) r4
            int r7 = r2 - r13
            int r9 = r4 - r10
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L3f2
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L3f2
            boolean r1 = r12.mForceMeasure
            if (r1 == 0) goto L402
        L3f2:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
            r11.measure(r3, r1)
            r1 = 0
            r12.mForceMeasure = r1
        L402:
            r11.layout(r13, r10, r2, r4)
            r13 = r30
        L407:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r12.mCycleMap
            if (r1 == 0) goto L437
            java.util.Collection r1 = r1.values()
            java.util.Iterator r9 = r1.iterator()
        L413:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L437
            java.lang.Object r1 = r9.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r1 = (androidx.constraintlayout.motion.utils.ViewOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet
            if (r2 == 0) goto L433
            androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet r1 = (androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) r1
            double[] r2 = r12.mInterpolateVelocity
            r3 = 0
            r4 = r2[r3]
            r6 = r2[r0]
            r2 = r29
            r3 = r8
            r1.setPathRotate(r2, r3, r4, r6)
            goto L413
        L433:
            r1.setProperty(r11, r8)
            goto L413
        L437:
            return r13
    }

    public final void positionKeyframe(android.view.View r9, androidx.constraintlayout.motion.widget.KeyPositionBase r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r8 = this;
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mStartMotionPath
            float r1 = r0.x
            r2.left = r1
            float r3 = r0.y
            r2.top = r3
            float r4 = r0.width
            float r1 = r1 + r4
            r2.right = r1
            float r0 = r0.height
            float r3 = r3 + r0
            r2.bottom = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mEndMotionPath
            float r1 = r0.x
            r3.left = r1
            float r4 = r0.y
            r3.top = r4
            float r5 = r0.width
            float r1 = r1 + r5
            r3.right = r1
            float r0 = r0.height
            float r4 = r4 + r0
            r3.bottom = r4
            r0 = r10
            r1 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.positionAttributes(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void remeasure() {
            r1 = this;
            r0 = 1
            r1.mForceMeasure = r0
            return
    }

    public final void rotate(android.graphics.Rect r3, android.graphics.Rect r4, int r5, int r6, int r7) {
            r2 = this;
            r0 = 1
            r1 = 2
            if (r5 == r0) goto L99
            if (r5 == r1) goto L6b
            r0 = 3
            if (r5 == r0) goto L3d
            r7 = 4
            if (r5 == r7) goto Le
            goto Lc6
        Le:
            int r5 = r3.left
            int r7 = r3.right
            int r5 = r5 + r7
            int r7 = r3.bottom
            int r0 = r3.top
            int r7 = r7 + r0
            int r0 = r3.width()
            int r0 = r0 + r7
            int r0 = r0 / r1
            int r6 = r6 - r0
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 - r6
            int r5 = r5 / r1
            r4.top = r5
            int r5 = r4.left
            int r6 = r3.width()
            int r6 = r6 + r5
            r4.right = r6
            int r5 = r4.top
            int r3 = r3.height()
            int r3 = r3 + r5
            r4.bottom = r3
            goto Lc6
        L3d:
            int r5 = r3.left
            int r6 = r3.right
            int r5 = r5 + r6
            int r6 = r3.height()
            int r6 = r6 / r1
            int r0 = r3.top
            int r6 = r6 + r0
            int r0 = r5 / 2
            int r6 = r6 - r0
            r4.left = r6
            int r6 = r3.height()
            int r6 = r6 + r5
            int r6 = r6 / r1
            int r7 = r7 - r6
            r4.top = r7
            int r5 = r4.left
            int r6 = r3.width()
            int r6 = r6 + r5
            r4.right = r6
            int r5 = r4.top
            int r3 = r3.height()
            int r3 = r3 + r5
            r4.bottom = r3
            goto Lc6
        L6b:
            int r5 = r3.left
            int r7 = r3.right
            int r5 = r5 + r7
            int r7 = r3.top
            int r0 = r3.bottom
            int r7 = r7 + r0
            int r0 = r3.width()
            int r0 = r0 + r7
            int r0 = r0 / r1
            int r6 = r6 - r0
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 - r6
            int r5 = r5 / r1
            r4.top = r5
            int r5 = r4.left
            int r6 = r3.width()
            int r6 = r6 + r5
            r4.right = r6
            int r5 = r4.top
            int r3 = r3.height()
            int r3 = r3 + r5
            r4.bottom = r3
            goto Lc6
        L99:
            int r5 = r3.left
            int r6 = r3.right
            int r5 = r5 + r6
            int r6 = r3.top
            int r0 = r3.bottom
            int r6 = r6 + r0
            int r0 = r3.width()
            int r6 = r6 - r0
            int r6 = r6 / r1
            r4.left = r6
            int r6 = r3.height()
            int r6 = r6 + r5
            int r6 = r6 / r1
            int r7 = r7 - r6
            r4.top = r7
            int r5 = r4.left
            int r6 = r3.width()
            int r6 = r6 + r5
            r4.right = r6
            int r5 = r4.top
            int r3 = r3.height()
            int r3 = r3 + r5
            r4.bottom = r3
        Lc6:
            return
    }

    public final void setBothStates(android.view.View r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            r1 = 1
            r5.mNoMovement = r1
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mEndMotionPath
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mEndPoint
            r0.setState(r6)
            return
    }

    public void setDrawPath(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            r0.mDrawPath = r2
            return
    }

    public final void setEndState(android.graphics.Rect r8, androidx.constraintlayout.widget.ConstraintSet r9, int r10, int r11) {
            r7 = this;
            int r6 = r9.mRotate
            if (r6 == 0) goto L10
            android.graphics.Rect r2 = r7.mTempRect
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r10
            r5 = r11
            r0.rotate(r1, r2, r3, r4, r5)
            android.graphics.Rect r8 = r7.mTempRect
        L10:
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.time = r11
            r10.position = r11
            r7.readView(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            int r11 = r8.left
            float r11 = (float) r11
            int r0 = r8.top
            float r0 = (float) r0
            int r1 = r8.width()
            float r1 = (float) r1
            int r2 = r8.height()
            float r2 = (float) r2
            r10.setBounds(r11, r0, r1, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            int r11 = r7.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r11 = r9.getParameters(r11)
            r10.applyParameters(r11)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r10 = r7.mEndPoint
            int r11 = r7.mId
            r10.setState(r8, r9, r6, r11)
            return
    }

    public void setPathMotionArc(int r1) {
            r0 = this;
            r0.mPathMotionArc = r1
            return
    }

    public final void setStartCurrentState(android.view.View r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            return
    }

    public final void setStartState(android.graphics.Rect r8, androidx.constraintlayout.widget.ConstraintSet r9, int r10, int r11) {
            r7 = this;
            int r6 = r9.mRotate
            if (r6 == 0) goto Le
            android.graphics.Rect r2 = r7.mTempRect
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r10
            r5 = r11
            r0.rotate(r1, r2, r3, r4, r5)
        Le:
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            r11 = 0
            r10.time = r11
            r10.position = r11
            r7.readView(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            int r11 = r8.left
            float r11 = (float) r11
            int r0 = r8.top
            float r0 = (float) r0
            int r1 = r8.width()
            float r1 = (float) r1
            int r2 = r8.height()
            float r2 = (float) r2
            r10.setBounds(r11, r0, r1, r2)
            int r10 = r7.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = r9.getParameters(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r7.mStartMotionPath
            r11.applyParameters(r10)
            androidx.constraintlayout.widget.ConstraintSet$Motion r11 = r10.motion
            float r11 = r11.mMotionStagger
            r7.mMotionStagger = r11
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r11 = r7.mStartPoint
            int r0 = r7.mId
            r11.setState(r8, r9, r6, r0)
            androidx.constraintlayout.widget.ConstraintSet$Transform r8 = r10.transform
            int r8 = r8.transformPivotTarget
            r7.mTransformPivotTarget = r8
            androidx.constraintlayout.widget.ConstraintSet$Motion r8 = r10.motion
            int r9 = r8.mQuantizeMotionSteps
            r7.mQuantizeMotionSteps = r9
            float r8 = r8.mQuantizeMotionPhase
            r7.mQuantizeMotionPhase = r8
            android.view.View r8 = r7.mView
            android.content.Context r8 = r8.getContext()
            androidx.constraintlayout.widget.ConstraintSet$Motion r9 = r10.motion
            int r10 = r9.mQuantizeInterpolatorType
            java.lang.String r11 = r9.mQuantizeInterpolatorString
            int r9 = r9.mQuantizeInterpolatorID
            android.view.animation.Interpolator r8 = getInterpolator(r8, r10, r11, r9)
            r7.mQuantizeMotionInterpolator = r8
            return
    }

    public void setStartState(androidx.constraintlayout.motion.utils.ViewState r5, android.view.View r6, int r7, int r8, int r9) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r4.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            android.graphics.Rect r0 = new android.graphics.Rect
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
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r4.mStartMotionPath
            int r9 = r0.left
            float r9 = (float) r9
            int r1 = r0.top
            float r1 = (float) r1
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r0.height()
            float r3 = (float) r3
            r8.setBounds(r9, r1, r2, r3)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r8 = r4.mStartPoint
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

    public void setView(android.view.View r2) {
            r1 = this;
            r1.mView = r2
            int r0 = r2.getId()
            r1.mId = r0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r0 == 0) goto L15
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            r2.getConstraintTag()
        L15:
            return
    }

    public void setup(int r18, int r19, float r20, long r21) {
            r17 = this;
            r0 = r17
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.mPathMotionArc
            int r7 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r6 == r7) goto L27
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            r7.mPathMotionArc = r6
        L27:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mStartPoint
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            r6.different(r7, r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r6 = r0.mKeyList
            if (r6 == 0) goto L8c
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L37:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r9 == 0) goto L64
            androidx.constraintlayout.motion.widget.KeyPosition r8 = (androidx.constraintlayout.motion.widget.KeyPosition) r8
            androidx.constraintlayout.motion.widget.MotionPaths r9 = new androidx.constraintlayout.motion.widget.MotionPaths
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mEndMotionPath
            r10 = r9
            r11 = r18
            r12 = r19
            r13 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0.insertKey(r9)
            int r8 = r8.mCurveFit
            int r9 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r8 == r9) goto L37
            r0.mCurveFitType = r8
            goto L37
        L64:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r9 == 0) goto L6c
            r8.getAttributeNames(r4)
            goto L37
        L6c:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r9 == 0) goto L74
            r8.getAttributeNames(r2)
            goto L37
        L74:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTrigger
            if (r9 == 0) goto L85
            if (r7 != 0) goto L7f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L7f:
            androidx.constraintlayout.motion.widget.KeyTrigger r8 = (androidx.constraintlayout.motion.widget.KeyTrigger) r8
            r7.add(r8)
            goto L37
        L85:
            r8.setInterpolation(r5)
            r8.getAttributeNames(r3)
            goto L37
        L8c:
            r7 = 0
        L8d:
            r6 = 0
            if (r7 == 0) goto L9a
            androidx.constraintlayout.motion.widget.KeyTrigger[] r8 = new androidx.constraintlayout.motion.widget.KeyTrigger[r6]
            java.lang.Object[] r7 = r7.toArray(r8)
            androidx.constraintlayout.motion.widget.KeyTrigger[] r7 = (androidx.constraintlayout.motion.widget.KeyTrigger[]) r7
            r0.mKeyTriggers = r7
        L9a:
            boolean r7 = r3.isEmpty()
            java.lang.String r8 = ","
            java.lang.String r9 = "CUSTOM,"
            r10 = 1
            if (r7 != 0) goto L16e
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mAttributesMap = r7
            java.util.Iterator r7 = r3.iterator()
        Lb0:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L108
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r11.startsWith(r9)
            if (r12 == 0) goto Lf7
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r13 = r11.split(r8)
            r10 = r13[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r13 = r0.mKeyList
            java.util.Iterator r13 = r13.iterator()
        Ld3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lf2
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.motion.widget.Key r14 = (androidx.constraintlayout.motion.widget.Key) r14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r14.mCustomConstraints
            if (r15 != 0) goto Le4
            goto Ld3
        Le4:
            java.lang.Object r15 = r15.get(r10)
            androidx.constraintlayout.widget.ConstraintAttribute r15 = (androidx.constraintlayout.widget.ConstraintAttribute) r15
            if (r15 == 0) goto Ld3
            int r14 = r14.mFramePosition
            r12.append(r14, r15)
            goto Ld3
        Lf2:
            androidx.constraintlayout.motion.utils.ViewSpline r10 = androidx.constraintlayout.motion.utils.ViewSpline.makeCustomSpline(r11, r12)
            goto Lfb
        Lf7:
            androidx.constraintlayout.motion.utils.ViewSpline r10 = androidx.constraintlayout.motion.utils.ViewSpline.makeSpline(r11)
        Lfb:
            if (r10 != 0) goto Lfe
            goto L106
        Lfe:
            r10.setType(r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r12 = r0.mAttributesMap
            r12.put(r11, r10)
        L106:
            r10 = 1
            goto Lb0
        L108:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r7 = r0.mKeyList
            if (r7 == 0) goto L126
            java.util.Iterator r7 = r7.iterator()
        L110:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L126
            java.lang.Object r10 = r7.next()
            androidx.constraintlayout.motion.widget.Key r10 = (androidx.constraintlayout.motion.widget.Key) r10
            boolean r11 = r10 instanceof androidx.constraintlayout.motion.widget.KeyAttributes
            if (r11 == 0) goto L110
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            r10.addValues(r11)
            goto L110
        L126:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r10 = r0.mAttributesMap
            r7.addValues(r10, r6)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r10 = r0.mAttributesMap
            r11 = 100
            r7.addValues(r10, r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L140:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L16e
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r5.containsKey(r10)
            if (r11 == 0) goto L15f
            java.lang.Object r11 = r5.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L15f
            int r11 = r11.intValue()
            goto L160
        L15f:
            r11 = 0
        L160:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r12 = r0.mAttributesMap
            java.lang.Object r10 = r12.get(r10)
            androidx.constraintlayout.core.motion.utils.SplineSet r10 = (androidx.constraintlayout.core.motion.utils.SplineSet) r10
            if (r10 == 0) goto L140
            r10.setup(r11)
            goto L140
        L16e:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L23d
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r7 = r0.mTimeCycleAttributesMap
            if (r7 != 0) goto L17f
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mTimeCycleAttributesMap = r7
        L17f:
            java.util.Iterator r2 = r2.iterator()
        L183:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L1e9
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r10 = r0.mTimeCycleAttributesMap
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto L198
            goto L183
        L198:
            boolean r10 = r7.startsWith(r9)
            if (r10 == 0) goto L1d7
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            java.lang.String[] r11 = r7.split(r8)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r12 = r0.mKeyList
            java.util.Iterator r12 = r12.iterator()
        L1b0:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1cf
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.Key r13 = (androidx.constraintlayout.motion.widget.Key) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            if (r14 != 0) goto L1c1
            goto L1b0
        L1c1:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L1b0
            int r13 = r13.mFramePosition
            r10.append(r13, r14)
            goto L1b0
        L1cf:
            androidx.constraintlayout.motion.utils.ViewTimeCycle r10 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeCustomSpline(r7, r10)
            r12 = r10
            r10 = r21
            goto L1dd
        L1d7:
            r10 = r21
            androidx.constraintlayout.motion.utils.ViewTimeCycle r12 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(r7, r10)
        L1dd:
            if (r12 != 0) goto L1e0
            goto L183
        L1e0:
            r12.setType(r7)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r13 = r0.mTimeCycleAttributesMap
            r13.put(r7, r12)
            goto L183
        L1e9:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L209
            java.util.Iterator r2 = r2.iterator()
        L1f1:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L209
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r8 == 0) goto L1f1
            androidx.constraintlayout.motion.widget.KeyTimeCycle r7 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r8 = r0.mTimeCycleAttributesMap
            r7.addTimeValues(r8)
            goto L1f1
        L209:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r2 = r0.mTimeCycleAttributesMap
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L213:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L23d
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L230
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L231
        L230:
            r8 = 0
        L231:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r10 = r0.mTimeCycleAttributesMap
            java.lang.Object r7 = r10.get(r7)
            androidx.constraintlayout.motion.utils.ViewTimeCycle r7 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r7
            r7.setup(r8)
            goto L213
        L23d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r0.mMotionPaths
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            androidx.constraintlayout.motion.widget.MotionPaths[] r7 = new androidx.constraintlayout.motion.widget.MotionPaths[r2]
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mStartMotionPath
            r7[r6] = r8
            int r8 = r2 + (-1)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r0.mEndMotionPath
            r7[r8] = r10
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            int r8 = r8.size()
            if (r8 <= 0) goto L260
            int r8 = r0.mCurveFitType
            r10 = -1
            if (r8 != r10) goto L260
            r0.mCurveFitType = r6
        L260:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            java.util.Iterator r8 = r8.iterator()
            r10 = 1
        L267:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L279
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = (androidx.constraintlayout.motion.widget.MotionPaths) r11
            int r12 = r10 + 1
            r7[r10] = r11
            r10 = r12
            goto L267
        L279:
            r8 = 18
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r0.mEndMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L28c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L2bb
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.attributes
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L28c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L28c
            r10.add(r12)
            goto L28c
        L2bb:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r10.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.mAttributeNames = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.mAttributeInterpolatorCount = r3
            r3 = 0
        L2cb:
            java.lang.String[] r9 = r0.mAttributeNames
            int r10 = r9.length
            if (r3 >= r10) goto L301
            r9 = r9[r3]
            int[] r10 = r0.mAttributeInterpolatorCount
            r10[r3] = r6
            r10 = 0
        L2d7:
            if (r10 >= r2) goto L2fe
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L2fb
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            if (r11 == 0) goto L2fb
            int[] r9 = r0.mAttributeInterpolatorCount
            r10 = r9[r3]
            int r11 = r11.numberOfInterpolatedValues()
            int r11 = r11 + r10
            r9[r3] = r11
            goto L2fe
        L2fb:
            int r10 = r10 + 1
            goto L2d7
        L2fe:
            int r3 = r3 + 1
            goto L2cb
        L301:
            r3 = r7[r6]
            int r3 = r3.mPathMotionArc
            int r10 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r3 == r10) goto L30b
            r3 = 1
            goto L30c
        L30b:
            r3 = 0
        L30c:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L311:
            if (r10 >= r2) goto L31f
            r11 = r7[r10]
            int r12 = r10 + (-1)
            r12 = r7[r12]
            r11.different(r12, r9, r3)
            int r10 = r10 + 1
            goto L311
        L31f:
            r3 = 1
            r10 = 0
        L321:
            if (r3 >= r8) goto L32c
            boolean r11 = r9[r3]
            if (r11 == 0) goto L329
            int r10 = r10 + 1
        L329:
            int r3 = r3 + 1
            goto L321
        L32c:
            int[] r3 = new int[r10]
            r0.mInterpolateVariables = r3
            int r3 = java.lang.Math.max(r5, r10)
            double[] r10 = new double[r3]
            r0.mInterpolateData = r10
            double[] r3 = new double[r3]
            r0.mInterpolateVelocity = r3
            r3 = 1
            r10 = 0
        L33e:
            if (r3 >= r8) goto L34e
            boolean r11 = r9[r3]
            if (r11 == 0) goto L34b
            int[] r11 = r0.mInterpolateVariables
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L34b:
            int r3 = r3 + 1
            goto L33e
        L34e:
            int[] r3 = r0.mInterpolateVariables
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = 0
        L361:
            r10 = 6
            if (r9 >= r2) goto L3ae
            r11 = r7[r9]
            r12 = r3[r9]
            int[] r13 = r0.mInterpolateVariables
            float[] r14 = new float[r10]
            float r15 = r11.position
            r14[r6] = r15
            float r6 = r11.x
            r15 = 1
            r14[r15] = r6
            float r6 = r11.y
            r14[r5] = r6
            float r5 = r11.width
            r6 = 3
            r14[r6] = r5
            float r5 = r11.height
            r6 = 4
            r14[r6] = r5
            float r5 = r11.mPathRotate
            r6 = 5
            r14[r6] = r5
            r5 = 0
            r6 = 0
        L38a:
            int r11 = r13.length
            if (r5 >= r11) goto L3a2
            r11 = r13[r5]
            if (r11 >= r10) goto L39e
            int r10 = r6 + 1
            r11 = r13[r5]
            r11 = r14[r11]
            r18 = r10
            double r10 = (double) r11
            r12[r6] = r10
            r6 = r18
        L39e:
            int r5 = r5 + 1
            r10 = 6
            goto L38a
        L3a2:
            r5 = r7[r9]
            float r5 = r5.time
            double r5 = (double) r5
            r8[r9] = r5
            int r9 = r9 + 1
            r5 = 2
            r6 = 0
            goto L361
        L3ae:
            r5 = 0
        L3af:
            int[] r6 = r0.mInterpolateVariables
            int r9 = r6.length
            if (r5 >= r9) goto L3e4
            r6 = r6[r5]
            java.lang.String[] r9 = androidx.constraintlayout.motion.widget.MotionPaths.names
            r10 = 6
            if (r6 >= r10) goto L3e1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int[] r10 = r0.mInterpolateVariables
            r10 = r10[r5]
            r9 = r9[r10]
            java.lang.String r10 = " ["
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r9, r10)
            r9 = 0
        L3cd:
            if (r9 >= r2) goto L3e1
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            r10 = r3[r9]
            r11 = r10[r5]
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r9 = r9 + 1
            goto L3cd
        L3e1:
            int r5 = r5 + 1
            goto L3af
        L3e4:
            java.lang.String[] r5 = r0.mAttributeNames
            int r5 = r5.length
            int r5 = r5 + 1
            androidx.constraintlayout.core.motion.utils.CurveFit[] r5 = new androidx.constraintlayout.core.motion.utils.CurveFit[r5]
            r0.mSpline = r5
            r5 = 0
        L3ee:
            java.lang.String[] r6 = r0.mAttributeNames
            int r9 = r6.length
            if (r5 >= r9) goto L4c3
            r6 = r6[r5]
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L3f9:
            if (r9 >= r2) goto L4a3
            r13 = r7[r9]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.attributes
            boolean r13 = r13.containsKey(r6)
            if (r13 == 0) goto L493
            if (r12 != 0) goto L42a
            double[] r11 = new double[r2]
            r12 = r7[r9]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r12.attributes
            java.lang.Object r12 = r12.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 != 0) goto L417
            r12 = 0
            goto L41b
        L417:
            int r12 = r12.numberOfInterpolatedValues()
        L41b:
            r13 = 2
            int[] r13 = new int[r13]
            r14 = 1
            r13[r14] = r12
            r12 = 0
            r13[r12] = r2
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r1, r13)
            double[][] r12 = (double[][]) r12
        L42a:
            r13 = r7[r9]
            float r13 = r13.time
            double r13 = (double) r13
            r11[r10] = r13
            r13 = r7[r9]
            r14 = r12[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.attributes
            java.lang.Object r13 = r13.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r13 = (androidx.constraintlayout.widget.ConstraintAttribute) r13
            if (r13 != 0) goto L44a
            r16 = r1
            r22 = r2
            r18 = r6
            r19 = r11
            r20 = r12
            goto L48c
        L44a:
            int r15 = r13.numberOfInterpolatedValues()
            r18 = r6
            r6 = 1
            if (r15 != r6) goto L464
            float r6 = r13.getValueToInterpolate()
            r19 = r11
            r20 = r12
            double r11 = (double) r6
            r6 = 0
            r14[r6] = r11
        L45f:
            r16 = r1
            r22 = r2
            goto L48c
        L464:
            r19 = r11
            r20 = r12
            int r6 = r13.numberOfInterpolatedValues()
            float[] r11 = new float[r6]
            r13.getValuesToInterpolate(r11)
            r12 = 0
            r13 = 0
        L473:
            if (r12 >= r6) goto L45f
            int r15 = r13 + 1
            r21 = r6
            r6 = r11[r12]
            r16 = r1
            r22 = r2
            double r1 = (double) r6
            r14[r13] = r1
            int r12 = r12 + 1
            r6 = r21
            r2 = r22
            r13 = r15
            r1 = r16
            goto L473
        L48c:
            int r10 = r10 + 1
            r11 = r19
            r12 = r20
            goto L499
        L493:
            r16 = r1
            r22 = r2
            r18 = r6
        L499:
            int r9 = r9 + 1
            r6 = r18
            r2 = r22
            r1 = r16
            goto L3f9
        L4a3:
            r16 = r1
            r22 = r2
            double[] r1 = java.util.Arrays.copyOf(r11, r10)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r10)
            double[][] r2 = (double[][]) r2
            androidx.constraintlayout.core.motion.utils.CurveFit[] r6 = r0.mSpline
            int r5 = r5 + 1
            int r9 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r9, r1, r2)
            r6[r5] = r1
            r2 = r22
            r1 = r16
            goto L3ee
        L4c3:
            r16 = r1
            r22 = r2
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            int r2 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r2 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r2, r8, r3)
            r3 = 0
            r1[r3] = r2
            r1 = r7[r3]
            int r1 = r1.mPathMotionArc
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r1 == r2) goto L51d
            r2 = r22
            int[] r1 = new int[r2]
            double[] r5 = new double[r2]
            r6 = 2
            int[] r8 = new int[r6]
            r9 = 1
            r8[r9] = r6
            r8[r3] = r2
            r3 = r16
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r8)
            double[][] r3 = (double[][]) r3
            r6 = 0
        L4f1:
            if (r6 >= r2) goto L517
            r8 = r7[r6]
            int r8 = r8.mPathMotionArc
            r1[r6] = r8
            r8 = r7[r6]
            float r8 = r8.time
            double r8 = (double) r8
            r5[r6] = r8
            r8 = r3[r6]
            r9 = r7[r6]
            float r9 = r9.x
            double r9 = (double) r9
            r11 = 0
            r8[r11] = r9
            r8 = r3[r6]
            r9 = r7[r6]
            float r9 = r9.y
            double r9 = (double) r9
            r11 = 1
            r8[r11] = r9
            int r6 = r6 + 1
            goto L4f1
        L517:
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r1, r5, r3)
            r0.mArcSpline = r1
        L51d:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mCycleMap = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L592
            java.util.Iterator r2 = r4.iterator()
        L52e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = androidx.constraintlayout.motion.utils.ViewOscillator.makeSpline(r3)
            if (r4 != 0) goto L541
            goto L52e
        L541:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L551
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L551
            float r1 = r17.getPreCycleDistance()
        L551:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L52e
        L55a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            java.util.Iterator r2 = r2.iterator()
        L560:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L578
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r4 == 0) goto L560
            androidx.constraintlayout.motion.widget.KeyCycle r3 = (androidx.constraintlayout.motion.widget.KeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L560
        L578:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r2 = r0.mCycleMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L582:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L592
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
            r3.setup(r1)
            goto L582
        L592:
            return
    }

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r2.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mStartMotionPath
            r0.setupRelative(r3, r1)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r2.mEndMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            r0.setupRelative(r3, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = " start: x: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mStartMotionPath
            float r1 = r1.x
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mStartMotionPath
            float r2 = r2.y
            r0.append(r2)
            java.lang.String r2 = " end: x: "
            r0.append(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mEndMotionPath
            float r2 = r2.x
            r0.append(r2)
            r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            float r1 = r1.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
