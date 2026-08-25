package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    private static final java.lang.String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    private static final java.lang.String INCLUDE_TAG = "include";
    private static final java.lang.String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final java.lang.String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    private static final int MIN_DURATION = 8;
    private static final java.lang.String MOTIONSCENE_TAG = "MotionScene";
    private static final java.lang.String ONCLICK_TAG = "OnClick";
    private static final java.lang.String ONSWIPE_TAG = "OnSwipe";
    private static final int SPLINE_STRING = -1;
    private static final java.lang.String STATESET_TAG = "StateSet";
    private static final java.lang.String TAG = "MotionScene";
    private static final java.lang.String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final java.lang.String VIEW_TRANSITION = "ViewTransition";
    private boolean DEBUG_DESKTOP;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mAbstractTransitionList;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mConstraintSetIdMap;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    public androidx.constraintlayout.motion.widget.MotionScene.Transition mCurrentTransition;
    private int mDefaultDuration;
    private androidx.constraintlayout.motion.widget.MotionScene.Transition mDefaultTransition;
    private android.util.SparseIntArray mDeriveMap;
    private boolean mDisableAutoTransition;
    private boolean mIgnoreTouch;
    private android.view.MotionEvent mLastTouchDown;
    public float mLastTouchX;
    public float mLastTouchY;
    private int mLayoutDuringTransition;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mMotionOutsideRegion;
    private boolean mRtl;
    public androidx.constraintlayout.widget.StateSet mStateSet;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mTransitionList;
    private androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker mVelocityTracker;
    public final androidx.constraintlayout.motion.widget.ViewTransitionController mViewTransitionController;


    /* JADX INFO: loaded from: classes2.dex */
    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private java.lang.String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final androidx.constraintlayout.motion.widget.MotionScene mMotionScene;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private androidx.constraintlayout.motion.widget.TouchResponse mTouchResponse;
        private int mTransitionFlags;

        public static class TransitionOnClick implements android.view.View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            public int mMode;
            public int mTargetId;
            private final androidx.constraintlayout.motion.widget.MotionScene.Transition mTransition;

            public TransitionOnClick(android.content.Context r3, androidx.constraintlayout.motion.widget.MotionScene.Transition r4, org.xmlpull.v1.XmlPullParser r5) {
                    r2 = this;
                    r2.<init>()
                    r0 = -1
                    r2.mTargetId = r0
                    r0 = 17
                    r2.mMode = r0
                    r2.mTransition = r4
                    android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
                    int[] r5 = androidx.constraintlayout.widget.R.styleable.OnClick
                    android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
                    int r4 = r3.getIndexCount()
                    r5 = 0
                L1b:
                    if (r5 >= r4) goto L3d
                    int r0 = r3.getIndex(r5)
                    int r1 = androidx.constraintlayout.widget.R.styleable.OnClick_targetId
                    if (r0 != r1) goto L2e
                    int r1 = r2.mTargetId
                    int r0 = r3.getResourceId(r0, r1)
                    r2.mTargetId = r0
                    goto L3a
                L2e:
                    int r1 = androidx.constraintlayout.widget.R.styleable.OnClick_clickAction
                    if (r0 != r1) goto L3a
                    int r1 = r2.mMode
                    int r0 = r3.getInt(r0, r1)
                    r2.mMode = r0
                L3a:
                    int r5 = r5 + 1
                    goto L1b
                L3d:
                    r3.recycle()
                    return
            }

            public TransitionOnClick(androidx.constraintlayout.motion.widget.MotionScene.Transition r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.mTransition = r1
                    r0.mTargetId = r2
                    r0.mMode = r3
                    return
            }

            public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r6, int r7, androidx.constraintlayout.motion.widget.MotionScene.Transition r8) {
                    r5 = this;
                    int r0 = r5.mTargetId
                    r1 = -1
                    if (r0 != r1) goto L6
                    goto La
                L6:
                    android.view.View r6 = r6.findViewById(r0)
                La:
                    if (r6 != 0) goto L21
                    java.lang.String r6 = "OnClick could not find id "
                    java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
                    int r7 = r5.mTargetId
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    java.lang.String r7 = "MotionScene"
                    android.util.Log.e(r7, r6)
                    return
                L21:
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r8)
                    int r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r8)
                    if (r0 != r1) goto L2f
                    r6.setOnClickListener(r5)
                    return
                L2f:
                    int r1 = r5.mMode
                    r2 = r1 & 1
                    r3 = 0
                    if (r2 == 0) goto L3a
                    if (r7 != r0) goto L3a
                    r2 = 1
                    goto L3b
                L3a:
                    r2 = 0
                L3b:
                    r4 = r1 & 256(0x100, float:3.59E-43)
                    if (r4 == 0) goto L43
                    if (r7 != r0) goto L43
                    r4 = 1
                    goto L44
                L43:
                    r4 = 0
                L44:
                    r2 = r2 | r4
                    r4 = r1 & 1
                    if (r4 == 0) goto L4d
                    if (r7 != r0) goto L4d
                    r0 = 1
                    goto L4e
                L4d:
                    r0 = 0
                L4e:
                    r0 = r0 | r2
                    r2 = r1 & 16
                    if (r2 == 0) goto L57
                    if (r7 != r8) goto L57
                    r2 = 1
                    goto L58
                L57:
                    r2 = 0
                L58:
                    r0 = r0 | r2
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L60
                    if (r7 != r8) goto L60
                    r3 = 1
                L60:
                    r7 = r0 | r3
                    if (r7 == 0) goto L67
                    r6.setOnClickListener(r5)
                L67:
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r9) {
                    r8 = this;
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r9 = r8.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$800(r9)
                    androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionScene.access$700(r9)
                    boolean r0 = r9.isInteractionEnabled()
                    if (r0 != 0) goto L11
                    return
                L11:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
                    r1 = -1
                    if (r0 != r1) goto L4a
                    int r0 = r9.getCurrentState()
                    if (r0 != r1) goto L2a
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
                    r9.transitionToState(r0)
                    return
                L2a:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r8.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$800(r2)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r8.mTransition
                    r1.<init>(r2, r3)
                    androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r1, r0)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
                    androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r1, r0)
                    r9.setTransition(r1)
                    r9.transitionToEnd()
                    return
                L4a:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$800(r0)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
                    int r2 = r8.mMode
                    r3 = r2 & 1
                    r4 = 1
                    r5 = 0
                    if (r3 != 0) goto L61
                    r3 = r2 & 256(0x100, float:3.59E-43)
                    if (r3 == 0) goto L5f
                    goto L61
                L5f:
                    r3 = 0
                    goto L62
                L61:
                    r3 = 1
                L62:
                    r6 = r2 & 16
                    if (r6 != 0) goto L6d
                    r2 = r2 & 4096(0x1000, float:5.74E-42)
                    if (r2 == 0) goto L6b
                    goto L6d
                L6b:
                    r2 = 0
                    goto L6e
                L6d:
                    r2 = 1
                L6e:
                    if (r3 == 0) goto L74
                    if (r2 == 0) goto L74
                    r6 = 1
                    goto L75
                L74:
                    r6 = 0
                L75:
                    if (r6 == 0) goto L9e
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = r8.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r6 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$800(r6)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = r6.mCurrentTransition
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r8.mTransition
                    if (r6 == r7) goto L86
                    r9.setTransition(r7)
                L86:
                    int r6 = r9.getCurrentState()
                    int r7 = r9.getEndState()
                    if (r6 == r7) goto L9d
                    float r6 = r9.getProgress()
                    r7 = 1056964608(0x3f000000, float:0.5)
                    int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                    if (r6 <= 0) goto L9b
                    goto L9d
                L9b:
                    r2 = 0
                    goto L9e
                L9d:
                    r3 = 0
                L9e:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = r8.mTransition
                    if (r6 != r0) goto La3
                    goto Lb3
                La3:
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r6)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = r8.mTransition
                    int r6 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r6)
                    if (r6 != r1) goto Lb5
                    int r1 = r9.mCurrentState
                    if (r1 == r0) goto Lbc
                Lb3:
                    r5 = 1
                    goto Lbc
                Lb5:
                    int r1 = r9.mCurrentState
                    if (r1 == r6) goto Lb3
                    if (r1 != r0) goto Lbc
                    goto Lb3
                Lbc:
                    if (r5 == 0) goto L103
                    if (r3 == 0) goto Lce
                    int r0 = r8.mMode
                    r0 = r0 & r4
                    if (r0 == 0) goto Lce
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    r9.setTransition(r0)
                    r9.transitionToEnd()
                    goto L103
                Lce:
                    if (r2 == 0) goto Ldf
                    int r0 = r8.mMode
                    r0 = r0 & 16
                    if (r0 == 0) goto Ldf
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    r9.setTransition(r0)
                    r9.transitionToStart()
                    goto L103
                Ldf:
                    if (r3 == 0) goto Lf2
                    int r0 = r8.mMode
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto Lf2
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    r9.setTransition(r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r9.setProgress(r0)
                    goto L103
                Lf2:
                    if (r2 == 0) goto L103
                    int r0 = r8.mMode
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L103
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r8.mTransition
                    r9.setTransition(r0)
                    r0 = 0
                    r9.setProgress(r0)
                L103:
                    return
            }

            public void removeOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r3) {
                    r2 = this;
                    int r0 = r2.mTargetId
                    r1 = -1
                    if (r0 != r1) goto L6
                    return
                L6:
                    android.view.View r3 = r3.findViewById(r0)
                    if (r3 != 0) goto L21
                    java.lang.String r3 = " (*)  could not find id "
                    java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                    int r0 = r2.mTargetId
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r0 = "MotionScene"
                    android.util.Log.e(r0, r3)
                    return
                L21:
                    r0 = 0
                    r3.setOnClickListener(r0)
                    return
            }
        }

        public Transition(int r5, androidx.constraintlayout.motion.widget.MotionScene r6, int r7, int r8) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                r4.mId = r5
                r4.mMotionScene = r6
                r4.mConstraintSetStart = r7
                r4.mConstraintSetEnd = r8
                int r5 = androidx.constraintlayout.motion.widget.MotionScene.access$900(r6)
                r4.mDuration = r5
                int r5 = androidx.constraintlayout.motion.widget.MotionScene.access$1000(r6)
                r4.mLayoutDuringTransition = r5
                return
        }

        public Transition(androidx.constraintlayout.motion.widget.MotionScene r5, android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                int r0 = androidx.constraintlayout.motion.widget.MotionScene.access$900(r5)
                r4.mDuration = r0
                int r0 = androidx.constraintlayout.motion.widget.MotionScene.access$1000(r5)
                r4.mLayoutDuringTransition = r0
                r4.mMotionScene = r5
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                r4.fillFromAttributeList(r5, r6, r7)
                return
        }

        public Transition(androidx.constraintlayout.motion.widget.MotionScene r5, androidx.constraintlayout.motion.widget.MotionScene.Transition r6) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                r4.mMotionScene = r5
                int r5 = androidx.constraintlayout.motion.widget.MotionScene.access$900(r5)
                r4.mDuration = r5
                if (r6 == 0) goto L5f
                int r5 = r6.mPathMotionArc
                r4.mPathMotionArc = r5
                int r5 = r6.mDefaultInterpolator
                r4.mDefaultInterpolator = r5
                java.lang.String r5 = r6.mDefaultInterpolatorString
                r4.mDefaultInterpolatorString = r5
                int r5 = r6.mDefaultInterpolatorID
                r4.mDefaultInterpolatorID = r5
                int r5 = r6.mDuration
                r4.mDuration = r5
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r5 = r6.mKeyFramesList
                r4.mKeyFramesList = r5
                float r5 = r6.mStagger
                r4.mStagger = r5
                int r5 = r6.mLayoutDuringTransition
                r4.mLayoutDuringTransition = r5
            L5f:
                return
        }

        public static /* synthetic */ int access$000(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mConstraintSetEnd
                return r0
        }

        public static /* synthetic */ int access$002(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, int r1) {
                r0.mConstraintSetEnd = r1
                return r1
        }

        public static /* synthetic */ int access$100(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mConstraintSetStart
                return r0
        }

        public static /* synthetic */ int access$102(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, int r1) {
                r0.mConstraintSetStart = r1
                return r1
        }

        public static /* synthetic */ boolean access$1300(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                boolean r0 = r0.mIsAbstract
                return r0
        }

        public static /* synthetic */ java.util.ArrayList access$1400(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r0 = r0.mKeyFramesList
                return r0
        }

        public static /* synthetic */ int access$1500(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDefaultInterpolator
                return r0
        }

        public static /* synthetic */ java.lang.String access$1600(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.lang.String r0 = r0.mDefaultInterpolatorString
                return r0
        }

        public static /* synthetic */ int access$1700(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDefaultInterpolatorID
                return r0
        }

        public static /* synthetic */ int access$1800(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDuration
                return r0
        }

        public static /* synthetic */ int access$1900(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mPathMotionArc
                return r0
        }

        public static /* synthetic */ androidx.constraintlayout.motion.widget.TouchResponse access$200(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                androidx.constraintlayout.motion.widget.TouchResponse r0 = r0.mTouchResponse
                return r0
        }

        public static /* synthetic */ float access$2000(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                float r0 = r0.mStagger
                return r0
        }

        public static /* synthetic */ androidx.constraintlayout.motion.widget.TouchResponse access$202(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, androidx.constraintlayout.motion.widget.TouchResponse r1) {
                r0.mTouchResponse = r1
                return r1
        }

        public static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mId
                return r0
        }

        public static /* synthetic */ java.util.ArrayList access$400(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r0.mOnClicks
                return r0
        }

        public static /* synthetic */ boolean access$500(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                boolean r0 = r0.mDisable
                return r0
        }

        public static /* synthetic */ int access$600(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mAutoTransition
                return r0
        }

        public static /* synthetic */ androidx.constraintlayout.motion.widget.MotionScene access$800(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mMotionScene
                return r0
        }

        private void fill(androidx.constraintlayout.motion.widget.MotionScene r10, android.content.Context r11, android.content.res.TypedArray r12) {
                r9 = this;
                int r0 = r12.getIndexCount()
                r1 = 0
                r2 = 0
            L6:
                r3 = 1
                r4 = -1
                if (r2 >= r0) goto L142
                int r5 = r12.getIndex(r2)
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_constraintSetEnd
                java.lang.String r7 = "xml"
                java.lang.String r8 = "layout"
                if (r5 != r6) goto L52
                int r3 = r12.getResourceId(r5, r4)
                r9.mConstraintSetEnd = r3
                android.content.res.Resources r3 = r11.getResources()
                int r4 = r9.mConstraintSetEnd
                java.lang.String r3 = r3.getResourceTypeName(r4)
                boolean r4 = r8.equals(r3)
                if (r4 == 0) goto L42
                androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet
                r3.<init>()
                int r4 = r9.mConstraintSetEnd
                r3.load(r11, r4)
                android.util.SparseArray r4 = androidx.constraintlayout.motion.widget.MotionScene.access$1100(r10)
                int r5 = r9.mConstraintSetEnd
                r4.append(r5, r3)
                goto L13e
            L42:
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L13e
                int r3 = r9.mConstraintSetEnd
                int r3 = androidx.constraintlayout.motion.widget.MotionScene.access$1200(r10, r11, r3)
                r9.mConstraintSetEnd = r3
                goto L13e
            L52:
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_constraintSetStart
                if (r5 != r6) goto L93
                int r3 = r9.mConstraintSetStart
                int r3 = r12.getResourceId(r5, r3)
                r9.mConstraintSetStart = r3
                android.content.res.Resources r3 = r11.getResources()
                int r4 = r9.mConstraintSetStart
                java.lang.String r3 = r3.getResourceTypeName(r4)
                boolean r4 = r8.equals(r3)
                if (r4 == 0) goto L83
                androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet
                r3.<init>()
                int r4 = r9.mConstraintSetStart
                r3.load(r11, r4)
                android.util.SparseArray r4 = androidx.constraintlayout.motion.widget.MotionScene.access$1100(r10)
                int r5 = r9.mConstraintSetStart
                r4.append(r5, r3)
                goto L13e
            L83:
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L13e
                int r3 = r9.mConstraintSetStart
                int r3 = androidx.constraintlayout.motion.widget.MotionScene.access$1200(r10, r11, r3)
                r9.mConstraintSetStart = r3
                goto L13e
            L93:
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_motionInterpolator
                if (r5 != r6) goto Ld7
                android.util.TypedValue r6 = r12.peekValue(r5)
                int r6 = r6.type
                r7 = -2
                if (r6 != r3) goto Lac
                int r3 = r12.getResourceId(r5, r4)
                r9.mDefaultInterpolatorID = r3
                if (r3 == r4) goto L13e
                r9.mDefaultInterpolator = r7
                goto L13e
            Lac:
                r3 = 3
                if (r6 != r3) goto Lcd
                java.lang.String r3 = r12.getString(r5)
                r9.mDefaultInterpolatorString = r3
                if (r3 == 0) goto L13e
                java.lang.String r6 = "/"
                int r3 = r3.indexOf(r6)
                if (r3 <= 0) goto Lc9
                int r3 = r12.getResourceId(r5, r4)
                r9.mDefaultInterpolatorID = r3
                r9.mDefaultInterpolator = r7
                goto L13e
            Lc9:
                r9.mDefaultInterpolator = r4
                goto L13e
            Lcd:
                int r3 = r9.mDefaultInterpolator
                int r3 = r12.getInteger(r5, r3)
                r9.mDefaultInterpolator = r3
                goto L13e
            Ld7:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_duration
                if (r5 != r3) goto Lea
                int r3 = r9.mDuration
                int r3 = r12.getInt(r5, r3)
                r9.mDuration = r3
                r4 = 8
                if (r3 >= r4) goto L13e
                r9.mDuration = r4
                goto L13e
            Lea:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_staggered
                if (r5 != r3) goto Lf7
                float r3 = r9.mStagger
                float r3 = r12.getFloat(r5, r3)
                r9.mStagger = r3
                goto L13e
            Lf7:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_autoTransition
                if (r5 != r3) goto L104
                int r3 = r9.mAutoTransition
                int r3 = r12.getInteger(r5, r3)
                r9.mAutoTransition = r3
                goto L13e
            L104:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_android_id
                if (r5 != r3) goto L111
                int r3 = r9.mId
                int r3 = r12.getResourceId(r5, r3)
                r9.mId = r3
                goto L13e
            L111:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_transitionDisable
                if (r5 != r3) goto L11e
                boolean r3 = r9.mDisable
                boolean r3 = r12.getBoolean(r5, r3)
                r9.mDisable = r3
                goto L13e
            L11e:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_pathMotionArc
                if (r5 != r3) goto L129
                int r3 = r12.getInteger(r5, r4)
                r9.mPathMotionArc = r3
                goto L13e
            L129:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_layoutDuringTransition
                if (r5 != r3) goto L134
                int r3 = r12.getInteger(r5, r1)
                r9.mLayoutDuringTransition = r3
                goto L13e
            L134:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_transitionFlags
                if (r5 != r3) goto L13e
                int r3 = r12.getInteger(r5, r1)
                r9.mTransitionFlags = r3
            L13e:
                int r2 = r2 + 1
                goto L6
            L142:
                int r10 = r9.mConstraintSetStart
                if (r10 != r4) goto L148
                r9.mIsAbstract = r3
            L148:
                return
        }

        private void fillFromAttributeList(androidx.constraintlayout.motion.widget.MotionScene r2, android.content.Context r3, android.util.AttributeSet r4) {
                r1 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Transition
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                r1.fill(r2, r3, r4)
                r4.recycle()
                return
        }

        public void addKeyFrame(androidx.constraintlayout.motion.widget.KeyFrames r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r0 = r1.mKeyFramesList
                r0.add(r2)
                return
        }

        public void addOnClick(int r4, int r5) {
                r3 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r3.mOnClicks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r1
                int r2 = r1.mTargetId
                if (r2 != r4) goto L6
                r1.mMode = r5
                return
            L19:
                androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r0 = new androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick
                r0.<init>(r3, r4, r5)
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r4 = r3.mOnClicks
                r4.add(r0)
                return
        }

        public void addOnClick(android.content.Context r3, org.xmlpull.v1.XmlPullParser r4) {
                r2 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r2.mOnClicks
                androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r1 = new androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick
                r1.<init>(r3, r2, r4)
                r0.add(r1)
                return
        }

        public java.lang.String debugString(android.content.Context r4) {
                r3 = this;
                int r0 = r3.mConstraintSetStart
                r1 = -1
                if (r0 != r1) goto L8
                java.lang.String r0 = "null"
                goto L12
            L8:
                android.content.res.Resources r0 = r4.getResources()
                int r2 = r3.mConstraintSetStart
                java.lang.String r0 = r0.getResourceEntryName(r2)
            L12:
                int r2 = r3.mConstraintSetEnd
                if (r2 != r1) goto L1d
                java.lang.String r4 = " -> null"
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
                goto L34
            L1d:
                java.lang.String r1 = " -> "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
                android.content.res.Resources r4 = r4.getResources()
                int r1 = r3.mConstraintSetEnd
                java.lang.String r4 = r4.getResourceEntryName(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L34:
                return r4
        }

        public int getAutoTransition() {
                r1 = this;
                int r0 = r1.mAutoTransition
                return r0
        }

        public int getDuration() {
                r1 = this;
                int r0 = r1.mDuration
                return r0
        }

        public int getEndConstraintSetId() {
                r1 = this;
                int r0 = r1.mConstraintSetEnd
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }

        public java.util.List<androidx.constraintlayout.motion.widget.KeyFrames> getKeyFrameList() {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r0 = r1.mKeyFramesList
                return r0
        }

        public int getLayoutDuringTransition() {
                r1 = this;
                int r0 = r1.mLayoutDuringTransition
                return r0
        }

        public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOnClickList() {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r1.mOnClicks
                return r0
        }

        public int getPathMotionArc() {
                r1 = this;
                int r0 = r1.mPathMotionArc
                return r0
        }

        public float getStagger() {
                r1 = this;
                float r0 = r1.mStagger
                return r0
        }

        public int getStartConstraintSetId() {
                r1 = this;
                int r0 = r1.mConstraintSetStart
                return r0
        }

        public androidx.constraintlayout.motion.widget.TouchResponse getTouchResponse() {
                r1 = this;
                androidx.constraintlayout.motion.widget.TouchResponse r0 = r1.mTouchResponse
                return r0
        }

        public boolean isEnabled() {
                r1 = this;
                boolean r0 = r1.mDisable
                r0 = r0 ^ 1
                return r0
        }

        public boolean isTransitionFlag(int r2) {
                r1 = this;
                int r0 = r1.mTransitionFlags
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                return r2
        }

        public void removeOnClick(int r4) {
                r3 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r3.mOnClicks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r1
                int r2 = r1.mTargetId
                if (r2 != r4) goto L6
                goto L18
            L17:
                r1 = 0
            L18:
                if (r1 == 0) goto L1f
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r4 = r3.mOnClicks
                r4.remove(r1)
            L1f:
                return
        }

        public void setAutoTransition(int r1) {
                r0 = this;
                r0.mAutoTransition = r1
                return
        }

        public void setDuration(int r2) {
                r1 = this;
                r0 = 8
                int r2 = java.lang.Math.max(r2, r0)
                r1.mDuration = r2
                return
        }

        public void setEnable(boolean r1) {
                r0 = this;
                r0.setEnabled(r1)
                return
        }

        public void setEnabled(boolean r1) {
                r0 = this;
                r1 = r1 ^ 1
                r0.mDisable = r1
                return
        }

        public void setInterpolatorInfo(int r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.mDefaultInterpolator = r1
                r0.mDefaultInterpolatorString = r2
                r0.mDefaultInterpolatorID = r3
                return
        }

        public void setLayoutDuringTransition(int r1) {
                r0 = this;
                r0.mLayoutDuringTransition = r1
                return
        }

        public void setOnSwipe(androidx.constraintlayout.motion.widget.OnSwipe r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto L10
            L4:
                androidx.constraintlayout.motion.widget.TouchResponse r0 = new androidx.constraintlayout.motion.widget.TouchResponse
                androidx.constraintlayout.motion.widget.MotionScene r1 = r2.mMotionScene
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionScene.access$700(r1)
                r0.<init>(r1, r3)
                r3 = r0
            L10:
                r2.mTouchResponse = r3
                return
        }

        public void setOnTouchUp(int r2) {
                r1 = this;
                androidx.constraintlayout.motion.widget.TouchResponse r0 = r1.getTouchResponse()
                if (r0 == 0) goto L9
                r0.setTouchUpMode(r2)
            L9:
                return
        }

        public void setPathMotionArc(int r1) {
                r0 = this;
                r0.mPathMotionArc = r1
                return
        }

        public void setStagger(float r1) {
                r0 = this;
                r0.mStagger = r1
                return
        }

        public void setTransitionFlag(int r1) {
                r0 = this;
                r0.mTransitionFlags = r1
                return
        }
    }

    public MotionScene(android.content.Context r4, androidx.constraintlayout.motion.widget.MotionLayout r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mStateSet = r0
            r3.mCurrentTransition = r0
            r1 = 0
            r3.mDisableAutoTransition = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mTransitionList = r2
            r3.mDefaultTransition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAbstractTransitionList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.mConstraintSetMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mConstraintSetIdMap = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.mDeriveMap = r0
            r3.DEBUG_DESKTOP = r1
            r0 = 400(0x190, float:5.6E-43)
            r3.mDefaultDuration = r0
            r3.mLayoutDuringTransition = r1
            r3.mIgnoreTouch = r1
            r3.mMotionOutsideRegion = r1
            r3.mMotionLayout = r5
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = new androidx.constraintlayout.motion.widget.ViewTransitionController
            r0.<init>(r5)
            r3.mViewTransitionController = r0
            r3.load(r4, r6)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r4 = r3.mConstraintSetMap
            int r5 = androidx.constraintlayout.widget.R.id.motion_base
            androidx.constraintlayout.widget.ConstraintSet r6 = new androidx.constraintlayout.widget.ConstraintSet
            r6.<init>()
            r4.put(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.mConstraintSetIdMap
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "motion_base"
            r4.put(r6, r5)
            return
    }

    public MotionScene(androidx.constraintlayout.motion.widget.MotionLayout r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mStateSet = r0
            r3.mCurrentTransition = r0
            r1 = 0
            r3.mDisableAutoTransition = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mTransitionList = r2
            r3.mDefaultTransition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAbstractTransitionList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.mConstraintSetMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mConstraintSetIdMap = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.mDeriveMap = r0
            r3.DEBUG_DESKTOP = r1
            r0 = 400(0x190, float:5.6E-43)
            r3.mDefaultDuration = r0
            r3.mLayoutDuringTransition = r1
            r3.mIgnoreTouch = r1
            r3.mMotionOutsideRegion = r1
            r3.mMotionLayout = r4
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = new androidx.constraintlayout.motion.widget.ViewTransitionController
            r0.<init>(r4)
            r3.mViewTransitionController = r0
            return
    }

    public static /* synthetic */ int access$1000(androidx.constraintlayout.motion.widget.MotionScene r0) {
            int r0 = r0.mLayoutDuringTransition
            return r0
    }

    public static /* synthetic */ android.util.SparseArray access$1100(androidx.constraintlayout.motion.widget.MotionScene r0) {
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r0.mConstraintSetMap
            return r0
    }

    public static /* synthetic */ int access$1200(androidx.constraintlayout.motion.widget.MotionScene r0, android.content.Context r1, int r2) {
            int r0 = r0.parseInclude(r1, r2)
            return r0
    }

    public static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout access$700(androidx.constraintlayout.motion.widget.MotionScene r0) {
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r0.mMotionLayout
            return r0
    }

    public static /* synthetic */ int access$900(androidx.constraintlayout.motion.widget.MotionScene r0) {
            int r0 = r0.mDefaultDuration
            return r0
    }

    private int getId(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "/"
            boolean r0 = r7.contains(r0)
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L3e
            r0 = 47
            int r0 = r7.indexOf(r0)
            int r0 = r0 + r2
            java.lang.String r0 = r7.substring(r0)
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r4 = "id"
            int r6 = r3.getIdentifier(r0, r4, r6)
            boolean r0 = r5.DEBUG_DESKTOP
            if (r0 == 0) goto L3f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "id getMap res = "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.println(r3)
            goto L3f
        L3e:
            r6 = -1
        L3f:
            if (r6 != r1) goto L57
            int r0 = r7.length()
            if (r0 <= r2) goto L50
            java.lang.String r6 = r7.substring(r2)
            int r6 = java.lang.Integer.parseInt(r6)
            goto L57
        L50:
            java.lang.String r7 = "MotionScene"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r7, r0)
        L57:
            return r6
    }

    private int getIndex(androidx.constraintlayout.motion.widget.MotionScene.Transition r4) {
            r3 = this;
            int r4 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r4)
            r0 = -1
            if (r4 == r0) goto L23
            r1 = 0
        L8:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r2 = r3.mTransitionList
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r2 = r3.mTransitionList
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r2)
            if (r2 != r4) goto L1f
            return r1
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            return r0
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The transition must have an id"
            r4.<init>(r0)
            throw r4
    }

    private int getRealID(int r3) {
            r2 = this;
            androidx.constraintlayout.widget.StateSet r0 = r2.mStateSet
            if (r0 == 0) goto Lc
            r1 = -1
            int r0 = r0.stateGetConstraintID(r3, r1, r1)
            if (r0 == r1) goto Lc
            return r0
        Lc:
            return r3
    }

    private boolean hasCycleDependency(int r5) {
            r4 = this;
            android.util.SparseIntArray r0 = r4.mDeriveMap
            int r0 = r0.get(r5)
            android.util.SparseIntArray r1 = r4.mDeriveMap
            int r1 = r1.size()
        Lc:
            if (r0 <= 0) goto L1f
            r2 = 1
            if (r0 != r5) goto L12
            return r2
        L12:
            int r3 = r1 + (-1)
            if (r1 >= 0) goto L17
            return r2
        L17:
            android.util.SparseIntArray r1 = r4.mDeriveMap
            int r0 = r1.get(r0)
            r1 = r3
            goto Lc
        L1f:
            r5 = 0
            return r5
    }

    private boolean isProcessingTouch() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private void load(android.content.Context r9, int r10) {
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        Ld:
            r3 = 1
            if (r2 == r3) goto L174
            if (r2 == 0) goto L162
            r4 = 2
            if (r2 == r4) goto L17
            goto L165
        L17:
            java.lang.String r2 = r0.getName()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            boolean r5 = r8.DEBUG_DESKTOP     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r5 == 0) goto L35
            java.io.PrintStream r5 = java.lang.System.out     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r6.<init>()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r6.append(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r5.println(r6)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L35:
            int r5 = r2.hashCode()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r6 = "MotionScene"
            r7 = -1
            switch(r5) {
                case -1349929691: goto L9a;
                case -1239391468: goto L8f;
                case -687739768: goto L85;
                case 61998586: goto L7a;
                case 269306229: goto L71;
                case 312750793: goto L67;
                case 327855227: goto L5d;
                case 793277014: goto L55;
                case 1382829617: goto L4b;
                case 1942574248: goto L41;
                default: goto L3f;
            }
        L3f:
            goto La4
        L41:
            java.lang.String r3 = "include"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 6
            goto La5
        L4b:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 4
            goto La5
        L55:
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 0
            goto La5
        L5d:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 2
            goto La5
        L67:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 3
            goto La5
        L71:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            goto La5
        L7a:
            java.lang.String r3 = "ViewTransition"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 9
            goto La5
        L85:
            java.lang.String r3 = "Include"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 7
            goto La5
        L8f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 8
            goto La5
        L9a:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r2 == 0) goto La4
            r3 = 5
            goto La5
        La4:
            r3 = -1
        La5:
            switch(r3) {
                case 0: goto L15e;
                case 1: goto L11c;
                case 2: goto Le0;
                case 3: goto Ld9;
                case 4: goto Ld0;
                case 5: goto Lcb;
                case 6: goto Lc6;
                case 7: goto Lc6;
                case 8: goto Lb6;
                case 9: goto Laa;
                default: goto La8;
            }     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        La8:
            goto L165
        Laa:
            androidx.constraintlayout.motion.widget.ViewTransition r2 = new androidx.constraintlayout.motion.widget.ViewTransition     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r2.<init>(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.ViewTransitionController r3 = r8.mViewTransitionController     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r3.add(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Lb6:
            androidx.constraintlayout.motion.widget.KeyFrames r2 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r2.<init>(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 == 0) goto L165
            java.util.ArrayList r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r1)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r3.add(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Lc6:
            r8.parseInclude(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Lcb:
            r8.parseConstraintSet(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Ld0:
            androidx.constraintlayout.widget.StateSet r2 = new androidx.constraintlayout.widget.StateSet     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r2.<init>(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r8.mStateSet = r2     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Ld9:
            if (r1 == 0) goto L165
            r1.addOnClick(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        Le0:
            if (r1 != 0) goto L10f
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            int r3 = r0.getLineNumber()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r4.<init>()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r4.append(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r4.append(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            java.lang.String r2 = r4.toString()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            android.util.Log.v(r6, r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L10f:
            if (r1 == 0) goto L165
            androidx.constraintlayout.motion.widget.TouchResponse r2 = new androidx.constraintlayout.motion.widget.TouchResponse     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.mMotionLayout     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r2.<init>(r9, r3, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$202(r1, r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        L11c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r8.mTransitionList     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = new androidx.constraintlayout.motion.widget.MotionScene$Transition     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r2.<init>(r8, r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r1.add(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r8.mCurrentTransition     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 != 0) goto L143
            boolean r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 != 0) goto L143
            r8.mCurrentTransition = r2     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 == 0) goto L143
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r8.mCurrentTransition     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r1)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            boolean r3 = r8.mRtl     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r1.setRTL(r3)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L143:
            boolean r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 == 0) goto L15c
            int r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            if (r1 != r7) goto L152
            r8.mDefaultTransition = r2     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L157
        L152:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r8.mAbstractTransitionList     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r1.add(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L157:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r8.mTransitionList     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            r1.remove(r2)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L15c:
            r1 = r2
            goto L165
        L15e:
            r8.parseMotionSceneTags(r9, r0)     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto L165
        L162:
            r0.getName()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
        L165:
            int r2 = r0.next()     // Catch: java.io.IOException -> L16b org.xmlpull.v1.XmlPullParserException -> L170
            goto Ld
        L16b:
            r9 = move-exception
            r9.printStackTrace()
            goto L174
        L170:
            r9 = move-exception
            r9.printStackTrace()
        L174:
            return
    }

    private int parseConstraintSet(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
            r13 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r1 = 0
            r0.setForceId(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L11:
            r7 = 1
            if (r4 >= r2) goto Lec
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.DEBUG_DESKTOP
            if (r10 == 0) goto L36
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L36:
            java.util.Objects.requireNonNull(r8)
            int r10 = r8.hashCode()
            r11 = 2
            switch(r10) {
                case -1496482599: goto L59;
                case -1153153640: goto L4e;
                case 3355: goto L43;
                default: goto L41;
            }
        L41:
            r8 = -1
            goto L63
        L43:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L4c
            goto L41
        L4c:
            r8 = 2
            goto L63
        L4e:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L57
            goto L41
        L57:
            r8 = 1
            goto L63
        L59:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L62
            goto L41
        L62:
            r8 = 0
        L63:
            switch(r8) {
                case 0: goto Le4;
                case 1: goto L81;
                case 2: goto L68;
                default: goto L66;
            }
        L66:
            goto Le8
        L68:
            int r5 = r13.getId(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.mConstraintSetIdMap
            java.lang.String r8 = stripID(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getName(r14, r5)
            r0.mIdString = r7
            goto Le8
        L81:
            int r8 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L89
            r0.mRotate = r8     // Catch: java.lang.NumberFormatException -> L89
            goto Le8
        L89:
            java.util.Objects.requireNonNull(r9)
            int r8 = r9.hashCode()
            r10 = 4
            r12 = 3
            switch(r8) {
                case -768416914: goto Lc6;
                case 3317767: goto Lbb;
                case 3387192: goto Lb0;
                case 108511772: goto La4;
                case 1954540437: goto L98;
                default: goto L96;
            }
        L96:
            r8 = -1
            goto Ld1
        L98:
            java.lang.String r8 = "x_right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto La2
            goto L96
        La2:
            r8 = 4
            goto Ld1
        La4:
            java.lang.String r8 = "right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Lae
            goto L96
        Lae:
            r8 = 3
            goto Ld1
        Lb0:
            java.lang.String r8 = "none"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Lb9
            goto L96
        Lb9:
            r8 = 2
            goto Ld1
        Lbb:
            java.lang.String r8 = "left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Lc4
            goto L96
        Lc4:
            r8 = 1
            goto Ld1
        Lc6:
            java.lang.String r8 = "x_left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Ld0
            goto L96
        Ld0:
            r8 = 0
        Ld1:
            switch(r8) {
                case 0: goto Le1;
                case 1: goto Lde;
                case 2: goto Ldb;
                case 3: goto Ld8;
                case 4: goto Ld5;
                default: goto Ld4;
            }
        Ld4:
            goto Le8
        Ld5:
            r0.mRotate = r12
            goto Le8
        Ld8:
            r0.mRotate = r7
            goto Le8
        Ldb:
            r0.mRotate = r1
            goto Le8
        Lde:
            r0.mRotate = r11
            goto Le8
        Le1:
            r0.mRotate = r10
            goto Le8
        Le4:
            int r6 = r13.getId(r14, r9)
        Le8:
            int r4 = r4 + 1
            goto L11
        Lec:
            if (r5 == r3) goto L106
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.mMotionLayout
            int r1 = r1.mDebugPath
            if (r1 == 0) goto Lf7
            r0.setValidateOnParse(r7)
        Lf7:
            r0.load(r14, r15)
            if (r6 == r3) goto L101
            android.util.SparseIntArray r14 = r13.mDeriveMap
            r14.put(r5, r6)
        L101:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r14 = r13.mConstraintSetMap
            r14.put(r5, r0)
        L106:
            return r5
    }

    private int parseInclude(android.content.Context r4, int r5) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            int r0 = r5.getEventType()     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2d
        Lc:
            r1 = 1
            if (r0 == r1) goto L31
            java.lang.String r1 = r5.getName()     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2d
            r2 = 2
            if (r2 != r0) goto L23
            java.lang.String r0 = "ConstraintSet"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2d
            if (r0 == 0) goto L23
            int r4 = r3.parseConstraintSet(r4, r5)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2d
            return r4
        L23:
            int r0 = r5.next()     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2d
            goto Lc
        L28:
            r4 = move-exception
            r4.printStackTrace()
            goto L31
        L2d:
            r4 = move-exception
            r4.printStackTrace()
        L31:
            r4 = -1
            return r4
    }

    private void parseInclude(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.include
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            int r0 = r6.getIndexCount()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L24
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.include_constraintSet
            if (r2 != r3) goto L21
            r3 = -1
            int r2 = r6.getResourceId(r2, r3)
            r4.parseInclude(r5, r2)
        L21:
            int r1 = r1 + 1
            goto Lf
        L24:
            r6.recycle()
            return
    }

    private void parseMotionSceneTags(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.MotionScene
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            int r6 = r5.getIndexCount()
            r0 = 0
            r1 = 0
        L10:
            if (r1 >= r6) goto L36
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration
            if (r2 != r3) goto L29
            int r3 = r4.mDefaultDuration
            int r2 = r5.getInt(r2, r3)
            r4.mDefaultDuration = r2
            r3 = 8
            if (r2 >= r3) goto L33
            r4.mDefaultDuration = r3
            goto L33
        L29:
            int r3 = androidx.constraintlayout.widget.R.styleable.MotionScene_layoutDuringTransition
            if (r2 != r3) goto L33
            int r2 = r5.getInteger(r2, r0)
            r4.mLayoutDuringTransition = r2
        L33:
            int r1 = r1 + 1
            goto L10
        L36:
            r5.recycle()
            return
    }

    private void readConstraintChain(int r4, androidx.constraintlayout.motion.widget.MotionLayout r5) {
            r3 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r3.mConstraintSetMap
            java.lang.Object r0 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintSet r0 = (androidx.constraintlayout.widget.ConstraintSet) r0
            java.lang.String r1 = r0.mIdString
            r0.derivedState = r1
            android.util.SparseIntArray r1 = r3.mDeriveMap
            int r4 = r1.get(r4)
            if (r4 <= 0) goto L5c
            r3.readConstraintChain(r4, r5)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r5 = r3.mConstraintSetMap
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.widget.ConstraintSet r5 = (androidx.constraintlayout.widget.ConstraintSet) r5
            if (r5 != 0) goto L3e
            java.lang.String r5 = "ERROR! invalid deriveConstraintsFrom: @id/"
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            android.content.Context r0 = r0.getContext()
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MotionScene"
            android.util.Log.e(r5, r4)
            return
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r0.derivedState
            r4.append(r1)
            java.lang.String r1 = "/"
            r4.append(r1)
            java.lang.String r1 = r5.derivedState
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.derivedState = r4
            r0.readFallback(r5)
            goto L6e
        L5c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r0.derivedState
            java.lang.String r2 = "  layout"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r1, r2)
            r0.derivedState = r4
            r0.readFallback(r5)
        L6e:
            r0.applyDeltaFrom(r0)
            return
    }

    public static java.lang.String stripID(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            r0 = 47
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto Le
            return r1
        Le:
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r5, int r6) {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L6
            java.util.ArrayList r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r2
            r2.removeOnClickListeners(r5)
            goto L24
        L34:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mAbstractTransitionList
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L3a
            java.util.ArrayList r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r2
            r2.removeOnClickListeners(r5)
            goto L58
        L68:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L6e
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r2 = r2.iterator()
        L8c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r3 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r3
            r3.addOnClickListeners(r5, r6, r1)
            goto L8c
        L9c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mAbstractTransitionList
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto La2
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r2 = r2.iterator()
        Lc0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r3 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r3
            r3.addOnClickListeners(r5, r6, r1)
            goto Lc0
        Ld0:
            return
    }

    public void addTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r3) {
            r2 = this;
            int r0 = r2.getIndex(r3)
            r1 = -1
            if (r0 != r1) goto Ld
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r2.mTransitionList
            r0.add(r3)
            goto L12
        Ld:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r2.mTransitionList
            r1.set(r0, r3)
        L12:
            return
    }

    public boolean applyViewTransition(int r2, androidx.constraintlayout.motion.widget.MotionController r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r1.mViewTransitionController
            boolean r2 = r0.applyViewTransition(r2, r3)
            return r2
    }

    public final boolean autoTransition(androidx.constraintlayout.motion.widget.MotionLayout r8, int r9) {
            r7 = this;
            boolean r0 = r7.isProcessingTouch()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.mDisableAutoTransition
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r7.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r3 != 0) goto L26
            goto L13
        L26:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r7.mCurrentTransition
            r4 = 2
            if (r3 != r2) goto L32
            boolean r3 = r3.isTransitionFlag(r4)
            if (r3 == 0) goto L32
            goto L13
        L32:
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r2)
            r5 = 1
            if (r9 != r3) goto L7b
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            r6 = 4
            if (r3 == r6) goto L46
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r3 != r4) goto L7b
        L46:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r8.setState(r9)
            r8.setTransition(r2)
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r0 != r6) goto L62
            r8.transitionToEnd()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r9)
            goto L7a
        L62:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setProgress(r0)
            r8.evaluate(r5)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r0)
            r8.setState(r9)
            r8.onNewStateAttachHandlers()
        L7a:
            return r5
        L7b:
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)
            if (r9 != r3) goto L13
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            r4 = 3
            if (r3 == r4) goto L8e
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r3 != r5) goto L13
        L8e:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r8.setState(r9)
            r8.setTransition(r2)
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r0 != r4) goto Laa
            r8.transitionToStart()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r9)
            goto Lc1
        Laa:
            r0 = 0
            r8.setProgress(r0)
            r8.evaluate(r5)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r0)
            r8.setState(r9)
            r8.onNewStateAttachHandlers()
        Lc1:
            return r5
        Lc2:
            return r1
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor(int r17, float r18, float r19, android.view.MotionEvent r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = -1
            if (r1 == r4) goto Lcb
            java.util.List r4 = r16.getTransitionsWithState(r17)
            r5 = 0
            r6 = 0
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lca
            java.lang.Object r8 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r8
            boolean r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$500(r8)
            if (r9 == 0) goto L2d
            goto L1a
        L2d:
            androidx.constraintlayout.motion.widget.TouchResponse r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            if (r9 == 0) goto L1a
            androidx.constraintlayout.motion.widget.TouchResponse r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            boolean r10 = r0.mRtl
            r9.setRTL(r10)
            androidx.constraintlayout.motion.widget.TouchResponse r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r0.mMotionLayout
            android.graphics.RectF r9 = r9.getTouchRegion(r10, r7)
            if (r9 == 0) goto L59
            if (r20 == 0) goto L59
            float r10 = r20.getX()
            float r11 = r20.getY()
            boolean r9 = r9.contains(r10, r11)
            if (r9 != 0) goto L59
            goto L1a
        L59:
            androidx.constraintlayout.motion.widget.TouchResponse r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r0.mMotionLayout
            android.graphics.RectF r9 = r9.getLimitBoundsTo(r10, r7)
            if (r9 == 0) goto L76
            if (r20 == 0) goto L76
            float r10 = r20.getX()
            float r11 = r20.getY()
            boolean r9 = r9.contains(r10, r11)
            if (r9 != 0) goto L76
            goto L1a
        L76:
            androidx.constraintlayout.motion.widget.TouchResponse r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            float r9 = r9.dot(r2, r3)
            androidx.constraintlayout.motion.widget.TouchResponse r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            boolean r10 = r10.mIsRotateMode
            if (r10 == 0) goto Lb4
            if (r20 == 0) goto Lb4
            float r9 = r20.getX()
            androidx.constraintlayout.motion.widget.TouchResponse r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            float r10 = r10.mRotateCenterX
            float r9 = r9 - r10
            float r10 = r20.getY()
            androidx.constraintlayout.motion.widget.TouchResponse r11 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r8)
            float r11 = r11.mRotateCenterY
            float r10 = r10 - r11
            float r11 = r2 + r9
            float r12 = r3 + r10
            double r12 = (double) r12
            double r14 = (double) r11
            double r11 = java.lang.Math.atan2(r12, r14)
            double r13 = (double) r9
            double r9 = (double) r10
            double r9 = java.lang.Math.atan2(r13, r9)
            double r11 = r11 - r9
            float r9 = (float) r11
            r10 = 1092616192(0x41200000, float:10.0)
            float r9 = r9 * r10
        Lb4:
            int r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r8)
            if (r10 != r1) goto Lbd
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto Lc0
        Lbd:
            r10 = 1066192077(0x3f8ccccd, float:1.1)
        Lc0:
            float r9 = r9 * r10
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L1a
            r6 = r8
            r5 = r9
            goto L1a
        Lca:
            return r6
        Lcb:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r0.mCurrentTransition
            return r1
    }

    public void disableAutoTransition(boolean r1) {
            r0 = this;
            r0.mDisableAutoTransition = r1
            return
    }

    public void enableViewTransition(int r2, boolean r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r1.mViewTransitionController
            r0.enableViewTransition(r2, r3)
            return
    }

    public int gatPathMotionArc() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1900(r0)
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    public final androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int r4) {
            r3 = this;
            boolean r0 = r3.DEBUG_DESKTOP
            if (r0 == 0) goto L33
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "size "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r2 = r3.mConstraintSetMap
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L33:
            androidx.constraintlayout.widget.StateSet r0 = r3.mStateSet
            if (r0 == 0) goto L3f
            r1 = -1
            int r0 = r0.stateGetConstraintID(r4, r1, r1)
            if (r0 == r1) goto L3f
            r4 = r0
        L3f:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r3.mConstraintSetMap
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto L76
            java.lang.String r0 = "Warning could not find ConstraintSet id/"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r3.mMotionLayout
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r1, r4)
            r0.append(r4)
            java.lang.String r4 = " In MotionScene"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MotionScene"
            android.util.Log.e(r0, r4)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r4 = r3.mConstraintSetMap
            r0 = 0
            int r0 = r4.keyAt(r0)
            java.lang.Object r4 = r4.get(r0)
            androidx.constraintlayout.widget.ConstraintSet r4 = (androidx.constraintlayout.widget.ConstraintSet) r4
            goto L7e
        L76:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r3.mConstraintSetMap
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintSet r4 = (androidx.constraintlayout.widget.ConstraintSet) r4
        L7e:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(android.content.Context r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = r6.DEBUG_DESKTOP
            if (r0 == 0) goto L33
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "size "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r2 = r6.mConstraintSetMap
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L33:
            r0 = 0
        L34:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r6.mConstraintSetMap
            int r1 = r1.size()
            if (r0 >= r1) goto L8b
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r6.mConstraintSetMap
            int r1 = r1.keyAt(r0)
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r2 = r2.getResourceName(r1)
            boolean r3 = r6.DEBUG_DESKTOP
            if (r3 == 0) goto L79
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Id for <"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = "> is <"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = "> looking for <"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = ">"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
        L79:
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L88
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r7 = r6.mConstraintSetMap
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.widget.ConstraintSet r7 = (androidx.constraintlayout.widget.ConstraintSet) r7
            return r7
        L88:
            int r0 = r0 + 1
            goto L34
        L8b:
            r7 = 0
            return r7
    }

    public int[] getConstraintSetIds() {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r4.mConstraintSetMap
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L16
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r3 = r4.mConstraintSetMap
            int r3 = r3.keyAt(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L16:
            return r1
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r1.mTransitionList
            return r0
    }

    public int getDuration() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1800(r0)
            return r0
        L9:
            int r0 = r1.mDefaultDuration
            return r0
    }

    public final int getEndId() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1500(r0)
            r1 = -2
            if (r0 == r1) goto L53
            r1 = -1
            if (r0 == r1) goto L43
            if (r0 == 0) goto L3d
            r1 = 1
            if (r0 == r1) goto L37
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L2b
            r1 = 5
            if (r0 == r1) goto L25
            r1 = 6
            if (r0 == r1) goto L1f
            r0 = 0
            return r0
        L1f:
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>()
            return r0
        L25:
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            return r0
        L2b:
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            return r0
        L31:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return r0
        L37:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            return r0
        L3d:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            return r0
        L43:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            java.lang.String r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1600(r0)
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            androidx.constraintlayout.motion.widget.MotionScene$1 r1 = new androidx.constraintlayout.motion.widget.MotionScene$1
            r1.<init>(r0)
            return r1
        L53:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            android.content.Context r0 = r0.getContext()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r2.mCurrentTransition
            int r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1700(r1)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r1)
            return r0
    }

    public final androidx.constraintlayout.motion.widget.Key getKeyFrame(int r8, int r9, int r10) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mCurrentTransition
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r0)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r2 = (androidx.constraintlayout.motion.widget.KeyFrames) r2
            java.util.Set r3 = r2.getKeys()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            if (r9 != r5) goto L22
            int r4 = r4.intValue()
            java.util.ArrayList r4 = r2.getKeyFramesForView(r4)
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.Key r5 = (androidx.constraintlayout.motion.widget.Key) r5
            int r6 = r5.mFramePosition
            if (r6 != r10) goto L40
            int r6 = r5.mType
            if (r6 != r8) goto L40
            return r5
        L55:
            return r1
    }

    public void getKeyFrames(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            if (r0 != 0) goto L21
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mDefaultTransition
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            r1.addFrames(r3)
            goto L10
        L20:
            return
        L21:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r0)
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            r1.addFrames(r3)
            goto L29
        L39:
            return
    }

    public final float getMaxAcceleration() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getMaxAcceleration()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final float getMaxVelocity() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getMaxVelocity()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public float getPathPercent(android.view.View r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final int getSpringBoundary() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            int r0 = r0.getSpringBoundary()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final float getSpringDamping() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getSpringDamping()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final float getSpringMass() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getSpringMass()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final float getSpringStiffiness() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getSpringStiffness()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final float getSpringStopThreshold() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getSpringStopThreshold()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public float getStaggered() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            float r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$2000(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int getStartId() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
            return r0
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransitionById(int r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r3.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            int r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r1)
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> getTransitionsWithState(int r5) {
            r4 = this;
            int r5 = r4.getRealID(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r4.mTransitionList
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r2)
            if (r3 == r5) goto L27
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)
            if (r3 != r5) goto Lf
        L27:
            r0.add(r2)
            goto Lf
        L2b:
            return r0
    }

    public boolean isViewTransitionEnabled(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r1.mViewTransitionController
            boolean r2 = r0.isViewTransitionEnabled(r2)
            return r2
    }

    public int lookUpConstraintId(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mConstraintSetIdMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = r2.intValue()
            return r2
    }

    public java.lang.String lookUpConstraintName(int r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.mConstraintSetIdMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L1f
            goto La
        L1f:
            int r2 = r2.intValue()
            if (r2 != r4) goto La
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L2c:
            r4 = 0
            return r4
    }

    public final void processTouchEvent(android.view.MotionEvent r13, int r14, androidx.constraintlayout.motion.widget.MotionLayout r15) {
            r12 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r1 = r12.mVelocityTracker
            if (r1 != 0) goto L14
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r12.mMotionLayout
            java.util.Objects.requireNonNull(r1)
            androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r1 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.obtain()
            r12.mVelocityTracker = r1
        L14:
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r1 = r12.mVelocityTracker
            r1.addMovement(r13)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r14 == r2) goto Lf9
            int r4 = r13.getAction()
            r5 = 0
            if (r4 == 0) goto L89
            r6 = 2
            if (r4 == r6) goto L2a
            goto Lf9
        L2a:
            boolean r4 = r12.mIgnoreTouch
            if (r4 == 0) goto L30
            goto Lf9
        L30:
            float r4 = r13.getRawY()
            float r6 = r12.mLastTouchY
            float r4 = r4 - r6
            float r6 = r13.getRawX()
            float r7 = r12.mLastTouchX
            float r6 = r6 - r7
            double r7 = (double) r6
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L4a
            double r7 = (double) r4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L4e
        L4a:
            android.view.MotionEvent r7 = r12.mLastTouchDown
            if (r7 != 0) goto L4f
        L4e:
            return
        L4f:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r12.bestTransitionFor(r14, r6, r4, r7)
            if (r14 == 0) goto Lf9
            r15.setTransition(r14)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r14 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r14)
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r12.mMotionLayout
            android.graphics.RectF r14 = r14.getTouchRegion(r4, r0)
            if (r14 == 0) goto L79
            android.view.MotionEvent r0 = r12.mLastTouchDown
            float r0 = r0.getX()
            android.view.MotionEvent r4 = r12.mLastTouchDown
            float r4 = r4.getY()
            boolean r14 = r14.contains(r0, r4)
            if (r14 != 0) goto L79
            r5 = 1
        L79:
            r12.mMotionOutsideRegion = r5
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r14 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r14)
            float r0 = r12.mLastTouchX
            float r4 = r12.mLastTouchY
            r14.setUpTouchEvent(r0, r4)
            goto Lf9
        L89:
            float r14 = r13.getRawX()
            r12.mLastTouchX = r14
            float r14 = r13.getRawY()
            r12.mLastTouchY = r14
            r12.mLastTouchDown = r13
            r12.mIgnoreTouch = r5
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            if (r13 == 0) goto Lf8
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r12.mMotionLayout
            android.graphics.RectF r13 = r13.getLimitBoundsTo(r14, r0)
            if (r13 == 0) goto Lc6
            android.view.MotionEvent r14 = r12.mLastTouchDown
            float r14 = r14.getX()
            android.view.MotionEvent r15 = r12.mLastTouchDown
            float r15 = r15.getY()
            boolean r13 = r13.contains(r14, r15)
            if (r13 != 0) goto Lc6
            r12.mLastTouchDown = r1
            r12.mIgnoreTouch = r3
            return
        Lc6:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r12.mMotionLayout
            android.graphics.RectF r13 = r13.getTouchRegion(r14, r0)
            if (r13 == 0) goto Le9
            android.view.MotionEvent r14 = r12.mLastTouchDown
            float r14 = r14.getX()
            android.view.MotionEvent r15 = r12.mLastTouchDown
            float r15 = r15.getY()
            boolean r13 = r13.contains(r14, r15)
            if (r13 != 0) goto Le9
            r12.mMotionOutsideRegion = r3
            goto Leb
        Le9:
            r12.mMotionOutsideRegion = r5
        Leb:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            float r14 = r12.mLastTouchX
            float r15 = r12.mLastTouchY
            r13.setDown(r14, r15)
        Lf8:
            return
        Lf9:
            boolean r14 = r12.mIgnoreTouch
            if (r14 == 0) goto Lfe
            return
        Lfe:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r12.mCurrentTransition
            if (r14 == 0) goto L117
            androidx.constraintlayout.motion.widget.TouchResponse r14 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r14)
            if (r14 == 0) goto L117
            boolean r14 = r12.mMotionOutsideRegion
            if (r14 != 0) goto L117
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r14 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r14)
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r0 = r12.mVelocityTracker
            r14.processTouchEvent(r13, r0)
        L117:
            float r14 = r13.getRawX()
            r12.mLastTouchX = r14
            float r14 = r13.getRawY()
            r12.mLastTouchY = r14
            int r13 = r13.getAction()
            if (r13 != r3) goto L139
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r13 = r12.mVelocityTracker
            if (r13 == 0) goto L139
            r13.recycle()
            r12.mVelocityTracker = r1
            int r13 = r15.mCurrentState
            if (r13 == r2) goto L139
            r12.autoTransition(r15, r13)
        L139:
            return
    }

    public final void readFallback(androidx.constraintlayout.motion.widget.MotionLayout r4) {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r3.mConstraintSetMap
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r3.mConstraintSetMap
            int r1 = r1.keyAt(r0)
            boolean r2 = r3.hasCycleDependency(r1)
            if (r2 == 0) goto L1d
            java.lang.String r4 = "MotionScene"
            java.lang.String r0 = "Cannot be derived from yourself"
            android.util.Log.e(r4, r0)
            return
        L1d:
            r3.readConstraintChain(r1, r4)
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    public void removeTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            int r2 = r1.getIndex(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r1.mTransitionList
            r0.remove(r2)
        Lc:
            return
    }

    public void setConstraintSet(int r2, androidx.constraintlayout.widget.ConstraintSet r3) {
            r1 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r1.mConstraintSetMap
            r0.put(r2, r3)
            return
    }

    public void setDuration(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L8
            r0.setDuration(r2)
            goto La
        L8:
            r1.mDefaultDuration = r2
        La:
            return
    }

    public void setKeyframe(android.view.View r4, int r5, java.lang.String r6, java.lang.Object r7) {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r3.mCurrentTransition
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            int r2 = r4.getId()
            java.util.ArrayList r1 = r1.getKeyFramesForView(r2)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.Key r2 = (androidx.constraintlayout.motion.widget.Key) r2
            int r2 = r2.mFramePosition
            if (r2 != r5) goto L25
            if (r7 == 0) goto L3d
            r2 = r7
            java.lang.Float r2 = (java.lang.Float) r2
            r2.floatValue()
        L3d:
            java.lang.String r2 = "app:PerpendicularPath_percent"
            r6.equalsIgnoreCase(r2)
            goto L25
        L43:
            return
    }

    public void setRtl(boolean r2) {
            r1 = this;
            r1.mRtl = r2
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            if (r2 == 0) goto L17
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            if (r2 == 0) goto L17
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            boolean r0 = r1.mRtl
            r2.setRTL(r0)
        L17:
            return
    }

    public final void setTransition(int r7, int r8) {
            r6 = this;
            androidx.constraintlayout.widget.StateSet r0 = r6.mStateSet
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r6.mStateSet
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            if (r3 == 0) goto L2b
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r3)
            if (r3 != r8) goto L2b
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r3)
            if (r3 != r7) goto L2b
            return
        L2b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mTransitionList
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r2) goto L49
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 == r0) goto L55
        L49:
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L31
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 != r7) goto L31
        L55:
            r6.mCurrentTransition = r4
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            if (r7 == 0) goto L68
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r7)
            boolean r8 = r6.mRtl
            r7.setRTL(r8)
        L68:
            return
        L69:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mAbstractTransitionList
            java.util.Iterator r3 = r3.iterator()
        L71:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L71
            r7 = r4
            goto L71
        L85:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r8, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r8, r2)
            if (r0 == r1) goto L97
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r7 = r6.mTransitionList
            r7.add(r8)
        L97:
            r6.mCurrentTransition = r8
            return
    }

    public void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            r1.mCurrentTransition = r2
            if (r2 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            if (r2 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            boolean r0 = r1.mRtl
            r2.setRTL(r0)
        L15:
            return
    }

    public final boolean supportTouch() {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r3.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r1)
            if (r1 == 0) goto L6
            return r2
        L1a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r3.mCurrentTransition
            if (r0 == 0) goto L25
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            return r2
    }

    public boolean validateLayout(androidx.constraintlayout.motion.widget.MotionLayout r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            if (r2 != r0) goto La
            androidx.constraintlayout.motion.widget.MotionScene r2 = r2.mScene
            if (r2 != r1) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public void viewTransition(int r2, android.view.View... r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r1.mViewTransitionController
            r0.viewTransition(r2, r3)
            return
    }
}
