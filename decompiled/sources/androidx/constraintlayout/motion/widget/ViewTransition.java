package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransition {
    public static final java.lang.String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final java.lang.String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    private static final int SPLINE_STRING = -1;
    private static java.lang.String TAG = "ViewTransition";
    private static final int UNSET = -1;
    public static final java.lang.String VIEW_TRANSITION_TAG = "ViewTransition";
    private int mClearsTag;
    public androidx.constraintlayout.widget.ConstraintSet.Constraint mConstraintDelta;
    public android.content.Context mContext;
    private int mDefaultInterpolator;
    private int mDefaultInterpolatorID;
    private java.lang.String mDefaultInterpolatorString;
    private boolean mDisabled;
    private int mDuration;
    private int mId;
    private int mIfTagNotSet;
    private int mIfTagSet;
    public androidx.constraintlayout.motion.widget.KeyFrames mKeyFrames;
    private int mOnStateTransition;
    private int mPathMotionArc;
    private int mSetsTag;
    private int mSharedValueCurrent;
    private int mSharedValueID;
    private int mSharedValueTarget;
    private int mTargetId;
    private java.lang.String mTargetString;
    private int mUpDuration;
    public int mViewTransitionMode;


    public static class Animate {
        public boolean hold_at_100;
        public androidx.constraintlayout.core.motion.utils.KeyCache mCache;
        private final int mClearsTag;
        public float mDpositionDt;
        public android.view.animation.Interpolator mInterpolator;
        public long mLastRender;
        public androidx.constraintlayout.motion.widget.MotionController mMC;
        public float mPosition;
        private final int mSetsTag;
        public android.graphics.Rect mTempRec;
        public int mUpDuration;
        public androidx.constraintlayout.motion.widget.ViewTransitionController mVtController;
        public boolean reverse;

        public Animate(androidx.constraintlayout.motion.widget.ViewTransitionController r3, androidx.constraintlayout.motion.widget.MotionController r4, int r5, int r6, int r7, android.view.animation.Interpolator r8, int r9, int r10) {
                r2 = this;
                r2.<init>()
                androidx.constraintlayout.core.motion.utils.KeyCache r0 = new androidx.constraintlayout.core.motion.utils.KeyCache
                r0.<init>()
                r2.mCache = r0
                r0 = 0
                r2.reverse = r0
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r2.mTempRec = r1
                r2.hold_at_100 = r0
                r2.mVtController = r3
                r2.mMC = r4
                r2.mUpDuration = r6
                long r3 = java.lang.System.nanoTime()
                r2.mLastRender = r3
                androidx.constraintlayout.motion.widget.ViewTransitionController r3 = r2.mVtController
                java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r4 = r3.animations
                if (r4 != 0) goto L2f
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3.animations = r4
            L2f:
                java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r3 = r3.animations
                r3.add(r2)
                r2.mInterpolator = r8
                r2.mSetsTag = r9
                r2.mClearsTag = r10
                r3 = 3
                if (r7 != r3) goto L40
                r3 = 1
                r2.hold_at_100 = r3
            L40:
                if (r5 != 0) goto L46
                r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L4a
            L46:
                r3 = 1065353216(0x3f800000, float:1.0)
                float r4 = (float) r5
                float r3 = r3 / r4
            L4a:
                r2.mDpositionDt = r3
                r2.mutate()
                return
        }

        public final void mutate() {
                r11 = this;
                boolean r0 = r11.reverse
                r1 = 0
                r2 = -1
                r3 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
                if (r0 == 0) goto L83
                long r8 = java.lang.System.nanoTime()
                long r5 = r11.mLastRender
                long r5 = r8 - r5
                r11.mLastRender = r8
                float r0 = r11.mPosition
                double r5 = (double) r5
                double r5 = r5 * r3
                float r3 = (float) r5
                float r4 = r11.mDpositionDt
                float r3 = r3 * r4
                float r0 = r0 - r3
                r11.mPosition = r0
                r3 = 0
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 >= 0) goto L29
                r11.mPosition = r3
            L29:
                android.view.animation.Interpolator r0 = r11.mInterpolator
                if (r0 != 0) goto L30
                float r0 = r11.mPosition
                goto L36
            L30:
                float r4 = r11.mPosition
                float r0 = r0.getInterpolation(r4)
            L36:
                r7 = r0
                androidx.constraintlayout.motion.widget.MotionController r5 = r11.mMC
                android.view.View r6 = r5.mView
                androidx.constraintlayout.core.motion.utils.KeyCache r10 = r11.mCache
                boolean r0 = r5.interpolate(r6, r7, r8, r10)
                float r4 = r11.mPosition
                int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r4 > 0) goto L74
                int r4 = r11.mSetsTag
                if (r4 == r2) goto L5e
                androidx.constraintlayout.motion.widget.MotionController r4 = r11.mMC
                android.view.View r4 = r4.getView()
                int r5 = r11.mSetsTag
                long r6 = java.lang.System.nanoTime()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r4.setTag(r5, r6)
            L5e:
                int r4 = r11.mClearsTag
                if (r4 == r2) goto L6d
                androidx.constraintlayout.motion.widget.MotionController r2 = r11.mMC
                android.view.View r2 = r2.getView()
                int r4 = r11.mClearsTag
                r2.setTag(r4, r1)
            L6d:
                androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r11.mVtController
                java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r1 = r1.removeList
                r1.add(r11)
            L74:
                float r1 = r11.mPosition
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L7c
                if (r0 == 0) goto Lfe
            L7c:
                androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r11.mVtController
                r0.invalidate()
                goto Lfe
            L83:
                long r6 = java.lang.System.nanoTime()
                long r8 = r11.mLastRender
                long r8 = r6 - r8
                r11.mLastRender = r6
                float r0 = r11.mPosition
                double r8 = (double) r8
                double r8 = r8 * r3
                float r3 = (float) r8
                float r4 = r11.mDpositionDt
                float r3 = r3 * r4
                float r3 = r3 + r0
                r11.mPosition = r3
                r0 = 1065353216(0x3f800000, float:1.0)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto La2
                r11.mPosition = r0
            La2:
                android.view.animation.Interpolator r3 = r11.mInterpolator
                if (r3 != 0) goto La9
                float r3 = r11.mPosition
                goto Laf
            La9:
                float r4 = r11.mPosition
                float r3 = r3.getInterpolation(r4)
            Laf:
                r5 = r3
                androidx.constraintlayout.motion.widget.MotionController r3 = r11.mMC
                android.view.View r4 = r3.mView
                androidx.constraintlayout.core.motion.utils.KeyCache r8 = r11.mCache
                boolean r3 = r3.interpolate(r4, r5, r6, r8)
                float r4 = r11.mPosition
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto Lf1
                int r4 = r11.mSetsTag
                if (r4 == r2) goto Ld7
                androidx.constraintlayout.motion.widget.MotionController r4 = r11.mMC
                android.view.View r4 = r4.getView()
                int r5 = r11.mSetsTag
                long r6 = java.lang.System.nanoTime()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r4.setTag(r5, r6)
            Ld7:
                int r4 = r11.mClearsTag
                if (r4 == r2) goto Le6
                androidx.constraintlayout.motion.widget.MotionController r2 = r11.mMC
                android.view.View r2 = r2.getView()
                int r4 = r11.mClearsTag
                r2.setTag(r4, r1)
            Le6:
                boolean r1 = r11.hold_at_100
                if (r1 != 0) goto Lf1
                androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r11.mVtController
                java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r1 = r1.removeList
                r1.add(r11)
            Lf1:
                float r1 = r11.mPosition
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 < 0) goto Lf9
                if (r3 == 0) goto Lfe
            Lf9:
                androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r11.mVtController
                r0.invalidate()
            Lfe:
                return
        }

        public void reactTo(int r2, float r3, float r4) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L24
                r0 = 2
                if (r2 == r0) goto L7
                goto L23
            L7:
                androidx.constraintlayout.motion.widget.MotionController r2 = r1.mMC
                android.view.View r2 = r2.getView()
                android.graphics.Rect r0 = r1.mTempRec
                r2.getHitRect(r0)
                android.graphics.Rect r2 = r1.mTempRec
                int r3 = (int) r3
                int r4 = (int) r4
                boolean r2 = r2.contains(r3, r4)
                if (r2 != 0) goto L23
                boolean r2 = r1.reverse
                if (r2 != 0) goto L23
                r1.reverse()
            L23:
                return
            L24:
                boolean r2 = r1.reverse
                if (r2 != 0) goto L2b
                r1.reverse()
            L2b:
                return
        }

        public final void reverse() {
                r2 = this;
                r0 = 1
                r2.reverse = r0
                int r0 = r2.mUpDuration
                r1 = -1
                if (r0 == r1) goto L15
                if (r0 != 0) goto Le
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L13
            Le:
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = (float) r0
                float r0 = r1 / r0
            L13:
                r2.mDpositionDt = r0
            L15:
                androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r2.mVtController
                r0.invalidate()
                long r0 = java.lang.System.nanoTime()
                r2.mLastRender = r0
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$R5MnrVoAl7eqn8MpswIds-XSqNs, reason: not valid java name */
    public static /* synthetic */ void m8$r8$lambda$R5MnrVoAl7eqn8MpswIdsXSqNs(androidx.constraintlayout.motion.widget.ViewTransition r0, android.view.View[] r1) {
            r0.lambda$applyTransition$0(r1)
            return
    }

    public ViewTransition(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.mOnStateTransition = r0
            r1 = 0
            r9.mDisabled = r1
            r9.mPathMotionArc = r1
            r9.mDuration = r0
            r9.mUpDuration = r0
            r9.mDefaultInterpolator = r1
            r2 = 0
            r9.mDefaultInterpolatorString = r2
            r9.mDefaultInterpolatorID = r0
            r9.mSetsTag = r0
            r9.mClearsTag = r0
            r9.mIfTagSet = r0
            r9.mIfTagNotSet = r0
            r9.mSharedValueTarget = r0
            r9.mSharedValueID = r0
            r9.mSharedValueCurrent = r0
            r9.mContext = r10
            int r2 = r11.getEventType()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
        L2a:
            r3 = 1
            if (r2 == r3) goto Leb
            java.lang.String r4 = "ViewTransition"
            r5 = 2
            r6 = 3
            if (r2 == r5) goto L42
            if (r2 == r6) goto L37
            goto Ldc
        L37:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            boolean r2 = r4.equals(r2)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r2 == 0) goto Ldc
            return
        L42:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            int r7 = r2.hashCode()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r8 = 4
            switch(r7) {
                case -1962203927: goto L75;
                case -1239391468: goto L6b;
                case 61998586: goto L63;
                case 366511058: goto L59;
                case 1791837707: goto L4f;
                default: goto L4e;
            }     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
        L4e:
            goto L7f
        L4f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r4 == 0) goto L7f
            r4 = 3
            goto L80
        L59:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r4 == 0) goto L7f
            r4 = 4
            goto L80
        L63:
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r4 == 0) goto L7f
            r4 = 0
            goto L80
        L6b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r4 == 0) goto L7f
            r4 = 1
            goto L80
        L75:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            if (r4 == 0) goto L7f
            r4 = 2
            goto L80
        L7f:
            r4 = -1
        L80:
            if (r4 == 0) goto Ld9
            if (r4 == r3) goto Ld1
            if (r4 == r5) goto Lca
            if (r4 == r6) goto Lc2
            if (r4 == r8) goto Lc2
            java.lang.String r3 = androidx.constraintlayout.motion.widget.ViewTransition.TAG     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r4.<init>()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getLoc()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r4.append(r5)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r5 = " unknown tag "
            r4.append(r5)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r4.append(r2)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r2 = r4.toString()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            android.util.Log.e(r3, r2)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r2 = androidx.constraintlayout.motion.widget.ViewTransition.TAG     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r3.<init>()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r4 = ".xml:"
            r3.append(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            int r4 = r11.getLineNumber()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r3.append(r4)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            android.util.Log.e(r2, r3)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            goto Ldc
        Lc2:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r9.mConstraintDelta     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.mCustomConstraints     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r10, r11, r2)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            goto Ldc
        Lca:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = androidx.constraintlayout.widget.ConstraintSet.buildDelta(r10, r11)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r9.mConstraintDelta = r2     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            goto Ldc
        Ld1:
            androidx.constraintlayout.motion.widget.KeyFrames r2 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r2.<init>(r10, r11)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            r9.mKeyFrames = r2     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            goto Ldc
        Ld9:
            r9.parseViewTransitionTags(r10, r11)     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
        Ldc:
            int r2 = r11.next()     // Catch: java.io.IOException -> Le2 org.xmlpull.v1.XmlPullParserException -> Le7
            goto L2a
        Le2:
            r10 = move-exception
            r10.printStackTrace()
            goto Leb
        Le7:
            r10 = move-exception
            r10.printStackTrace()
        Leb:
            return
    }

    private /* synthetic */ void lambda$applyTransition$0(android.view.View[] r9) {
            r8 = this;
            int r0 = r8.mSetsTag
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L1c
            int r0 = r9.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L1c
            r4 = r9[r3]
            int r5 = r8.mSetsTag
            long r6 = java.lang.System.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.setTag(r5, r6)
            int r3 = r3 + 1
            goto L8
        L1c:
            int r0 = r8.mClearsTag
            if (r0 == r2) goto L2e
            int r0 = r9.length
        L21:
            if (r1 >= r0) goto L2e
            r2 = r9[r1]
            int r3 = r8.mClearsTag
            r4 = 0
            r2.setTag(r3, r4)
            int r1 = r1 + 1
            goto L21
        L2e:
            return
    }

    private void parseViewTransitionTags(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
            r7 = this;
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r9)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.ViewTransition
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            int r9 = r8.getIndexCount()
            r0 = 0
        Lf:
            if (r0 >= r9) goto L13f
            int r1 = r8.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_android_id
            if (r1 != r2) goto L23
            int r2 = r7.mId
            int r1 = r8.getResourceId(r1, r2)
            r7.mId = r1
            goto L13b
        L23:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_motionTarget
            r3 = 3
            r4 = -1
            if (r1 != r2) goto L59
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
            if (r2 == 0) goto L3f
            int r2 = r7.mTargetId
            int r2 = r8.getResourceId(r1, r2)
            r7.mTargetId = r2
            if (r2 != r4) goto L13b
            java.lang.String r1 = r8.getString(r1)
            r7.mTargetString = r1
            goto L13b
        L3f:
            android.util.TypedValue r2 = r8.peekValue(r1)
            int r2 = r2.type
            if (r2 != r3) goto L4f
            java.lang.String r1 = r8.getString(r1)
            r7.mTargetString = r1
            goto L13b
        L4f:
            int r2 = r7.mTargetId
            int r1 = r8.getResourceId(r1, r2)
            r7.mTargetId = r1
            goto L13b
        L59:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_onStateTransition
            if (r1 != r2) goto L67
            int r2 = r7.mOnStateTransition
            int r1 = r8.getInt(r1, r2)
            r7.mOnStateTransition = r1
            goto L13b
        L67:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_transitionDisable
            if (r1 != r2) goto L75
            boolean r2 = r7.mDisabled
            boolean r1 = r8.getBoolean(r1, r2)
            r7.mDisabled = r1
            goto L13b
        L75:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_pathMotionArc
            if (r1 != r2) goto L83
            int r2 = r7.mPathMotionArc
            int r1 = r8.getInt(r1, r2)
            r7.mPathMotionArc = r1
            goto L13b
        L83:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_duration
            if (r1 != r2) goto L91
            int r2 = r7.mDuration
            int r1 = r8.getInt(r1, r2)
            r7.mDuration = r1
            goto L13b
        L91:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_upDuration
            if (r1 != r2) goto L9f
            int r2 = r7.mUpDuration
            int r1 = r8.getInt(r1, r2)
            r7.mUpDuration = r1
            goto L13b
        L9f:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_viewTransitionMode
            if (r1 != r2) goto Lad
            int r2 = r7.mViewTransitionMode
            int r1 = r8.getInt(r1, r2)
            r7.mViewTransitionMode = r1
            goto L13b
        Lad:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_motionInterpolator
            if (r1 != r2) goto Lee
            android.util.TypedValue r2 = r8.peekValue(r1)
            int r2 = r2.type
            r5 = -2
            r6 = 1
            if (r2 != r6) goto Lc7
            int r1 = r8.getResourceId(r1, r4)
            r7.mDefaultInterpolatorID = r1
            if (r1 == r4) goto L13b
            r7.mDefaultInterpolator = r5
            goto L13b
        Lc7:
            if (r2 != r3) goto Le5
            java.lang.String r2 = r8.getString(r1)
            r7.mDefaultInterpolatorString = r2
            if (r2 == 0) goto Le2
            java.lang.String r3 = "/"
            int r2 = r2.indexOf(r3)
            if (r2 <= 0) goto Le2
            int r1 = r8.getResourceId(r1, r4)
            r7.mDefaultInterpolatorID = r1
            r7.mDefaultInterpolator = r5
            goto L13b
        Le2:
            r7.mDefaultInterpolator = r4
            goto L13b
        Le5:
            int r2 = r7.mDefaultInterpolator
            int r1 = r8.getInteger(r1, r2)
            r7.mDefaultInterpolator = r1
            goto L13b
        Lee:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_setsTag
            if (r1 != r2) goto Lfb
            int r2 = r7.mSetsTag
            int r1 = r8.getResourceId(r1, r2)
            r7.mSetsTag = r1
            goto L13b
        Lfb:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_clearsTag
            if (r1 != r2) goto L108
            int r2 = r7.mClearsTag
            int r1 = r8.getResourceId(r1, r2)
            r7.mClearsTag = r1
            goto L13b
        L108:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagSet
            if (r1 != r2) goto L115
            int r2 = r7.mIfTagSet
            int r1 = r8.getResourceId(r1, r2)
            r7.mIfTagSet = r1
            goto L13b
        L115:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagNotSet
            if (r1 != r2) goto L122
            int r2 = r7.mIfTagNotSet
            int r1 = r8.getResourceId(r1, r2)
            r7.mIfTagNotSet = r1
            goto L13b
        L122:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValueId
            if (r1 != r2) goto L12f
            int r2 = r7.mSharedValueID
            int r1 = r8.getResourceId(r1, r2)
            r7.mSharedValueID = r1
            goto L13b
        L12f:
            int r2 = androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValue
            if (r1 != r2) goto L13b
            int r2 = r7.mSharedValueTarget
            int r1 = r8.getInteger(r1, r2)
            r7.mSharedValueTarget = r1
        L13b:
            int r0 = r0 + 1
            goto Lf
        L13f:
            r8.recycle()
            return
    }

    private void updateTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r5, android.view.View r6) {
            r4 = this;
            int r0 = r4.mDuration
            r1 = -1
            if (r0 == r1) goto L8
            r5.setDuration(r0)
        L8:
            int r0 = r4.mPathMotionArc
            r5.setPathMotionArc(r0)
            int r0 = r4.mDefaultInterpolator
            java.lang.String r2 = r4.mDefaultInterpolatorString
            int r3 = r4.mDefaultInterpolatorID
            r5.setInterpolatorInfo(r0, r2, r3)
            int r6 = r6.getId()
            androidx.constraintlayout.motion.widget.KeyFrames r0 = r4.mKeyFrames
            if (r0 == 0) goto L46
            java.util.ArrayList r0 = r0.getKeyFramesForView(r1)
            androidx.constraintlayout.motion.widget.KeyFrames r1 = new androidx.constraintlayout.motion.widget.KeyFrames
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.Key r2 = (androidx.constraintlayout.motion.widget.Key) r2
            androidx.constraintlayout.motion.widget.Key r2 = r2.clone()
            androidx.constraintlayout.motion.widget.Key r2 = r2.setViewId(r6)
            r1.addKey(r2)
            goto L2b
        L43:
            r5.addKeyFrame(r1)
        L46:
            return
    }

    public final void applyTransition(androidx.constraintlayout.motion.widget.ViewTransitionController r20, androidx.constraintlayout.motion.widget.MotionLayout r21, int r22, androidx.constraintlayout.widget.ConstraintSet r23, android.view.View... r24) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            boolean r5 = r0.mDisabled
            if (r5 == 0) goto Lf
            return
        Lf:
            int r5 = r0.mViewTransitionMode
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r5 != r6) goto La6
            r2 = r4[r8]
            androidx.constraintlayout.motion.widget.MotionController r3 = new androidx.constraintlayout.motion.widget.MotionController
            r3.<init>(r2)
            r3.setBothStates(r2)
            androidx.constraintlayout.motion.widget.KeyFrames r2 = r0.mKeyFrames
            r2.addAllFrames(r3)
            int r11 = r21.getWidth()
            int r12 = r21.getHeight()
            int r2 = r0.mDuration
            float r13 = (float) r2
            long r14 = java.lang.System.nanoTime()
            r10 = r3
            r10.setup(r11, r12, r13, r14)
            androidx.constraintlayout.motion.widget.ViewTransition$Animate r10 = new androidx.constraintlayout.motion.widget.ViewTransition$Animate
            int r13 = r0.mDuration
            int r14 = r0.mUpDuration
            int r15 = r0.mOnStateTransition
            android.content.Context r1 = r21.getContext()
            int r2 = r0.mDefaultInterpolator
            r4 = -2
            if (r2 == r4) goto L8f
            if (r2 == r7) goto L81
            if (r2 == 0) goto L7b
            if (r2 == r9) goto L75
            if (r2 == r6) goto L6f
            r1 = 4
            if (r2 == r1) goto L69
            r1 = 5
            if (r2 == r1) goto L63
            r1 = 6
            if (r2 == r1) goto L5d
            r1 = 0
            goto L95
        L5d:
            android.view.animation.AnticipateInterpolator r1 = new android.view.animation.AnticipateInterpolator
            r1.<init>()
            goto L95
        L63:
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            goto L95
        L69:
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto L95
        L6f:
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            goto L95
        L75:
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            goto L95
        L7b:
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            goto L95
        L81:
            java.lang.String r1 = r0.mDefaultInterpolatorString
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            androidx.constraintlayout.motion.widget.ViewTransition$1 r2 = new androidx.constraintlayout.motion.widget.ViewTransition$1
            r2.<init>(r1)
            r16 = r2
            goto L97
        L8f:
            int r2 = r0.mDefaultInterpolatorID
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
        L95:
            r16 = r1
        L97:
            int r1 = r0.mSetsTag
            int r2 = r0.mClearsTag
            r11 = r20
            r12 = r3
            r17 = r1
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        La6:
            if (r5 != r9) goto Ldd
            int[] r5 = r21.getConstraintSetIds()
            r6 = 0
        Lad:
            int r10 = r5.length
            if (r6 >= r10) goto Ldd
            r10 = r5[r6]
            if (r10 != r2) goto Lb5
            goto Lda
        Lb5:
            androidx.constraintlayout.widget.ConstraintSet r10 = r1.getConstraintSet(r10)
            int r11 = r4.length
            r12 = 0
        Lbb:
            if (r12 >= r11) goto Lda
            r13 = r4[r12]
            int r13 = r13.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r13 = r10.getConstraint(r13)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r14 = r0.mConstraintDelta
            if (r14 == 0) goto Ld7
            r14.applyDelta(r13)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r14 = r0.mConstraintDelta
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.mCustomConstraints
            r13.putAll(r14)
        Ld7:
            int r12 = r12 + 1
            goto Lbb
        Lda:
            int r6 = r6 + 1
            goto Lad
        Ldd:
            androidx.constraintlayout.widget.ConstraintSet r5 = new androidx.constraintlayout.widget.ConstraintSet
            r5.<init>()
            r5.clone(r3)
            int r6 = r4.length
            r10 = 0
        Le7:
            if (r10 >= r6) goto L106
            r11 = r4[r10]
            int r11 = r11.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r11 = r5.getConstraint(r11)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r12 = r0.mConstraintDelta
            if (r12 == 0) goto L103
            r12.applyDelta(r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r12 = r0.mConstraintDelta
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r12.mCustomConstraints
            r11.putAll(r12)
        L103:
            int r10 = r10 + 1
            goto Le7
        L106:
            r1.updateState(r2, r5)
            int r5 = androidx.constraintlayout.widget.R.id.view_transition
            r1.updateState(r5, r3)
            r1.setState(r5, r7, r7)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            androidx.constraintlayout.motion.widget.MotionScene r6 = r1.mScene
            r3.<init>(r7, r6, r5, r2)
            int r2 = r4.length
        L119:
            if (r8 >= r2) goto L123
            r5 = r4[r8]
            r0.updateTransition(r3, r5)
            int r8 = r8 + 1
            goto L119
        L123:
            r1.setTransition(r3)
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
            r2.<init>(r0, r4, r9)
            r1.transitionToEnd(r2)
            return
    }

    public final boolean checkTags(android.view.View r6) {
            r5 = this;
            int r0 = r5.mIfTagSet
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L9
        L7:
            r0 = 1
            goto L11
        L9:
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 == 0) goto L10
            goto L7
        L10:
            r0 = 0
        L11:
            int r4 = r5.mIfTagNotSet
            if (r4 != r1) goto L17
        L15:
            r6 = 1
            goto L1f
        L17:
            java.lang.Object r6 = r6.getTag(r4)
            if (r6 != 0) goto L1e
            goto L15
        L1e:
            r6 = 0
        L1f:
            if (r0 == 0) goto L24
            if (r6 == 0) goto L24
            r2 = 1
        L24:
            return r2
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    public int getSharedValue() {
            r1 = this;
            int r0 = r1.mSharedValueTarget
            return r0
    }

    public int getSharedValueCurrent() {
            r1 = this;
            int r0 = r1.mSharedValueCurrent
            return r0
    }

    public int getSharedValueID() {
            r1 = this;
            int r0 = r1.mSharedValueID
            return r0
    }

    public int getStateTransition() {
            r1 = this;
            int r0 = r1.mOnStateTransition
            return r0
    }

    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mDisabled
            r0 = r0 ^ 1
            return r0
    }

    public final boolean matchesView(android.view.View r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.mTargetId
            r2 = -1
            if (r1 != r2) goto Le
            java.lang.String r1 = r4.mTargetString
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = r4.checkTags(r5)
            if (r1 != 0) goto L15
            return r0
        L15:
            int r1 = r5.getId()
            int r2 = r4.mTargetId
            r3 = 1
            if (r1 != r2) goto L1f
            return r3
        L1f:
            java.lang.String r1 = r4.mTargetString
            if (r1 != 0) goto L24
            return r0
        L24:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            java.lang.String r5 = r5.constraintTag
            if (r5 == 0) goto L3f
            java.lang.String r1 = r4.mTargetString
            boolean r5 = r5.matches(r1)
            if (r5 == 0) goto L3f
            return r3
        L3f:
            return r0
    }

    public final void setEnabled(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.mDisabled = r1
            return
    }

    public void setSharedValue(int r1) {
            r0 = this;
            r0.mSharedValueTarget = r1
            return
    }

    public void setSharedValueCurrent(int r1) {
            r0 = this;
            r0.mSharedValueCurrent = r1
            return
    }

    public void setSharedValueID(int r1) {
            r0 = this;
            r0.mSharedValueID = r1
            return
    }

    public void setStateTransition(int r1) {
            r0 = this;
            r0.mOnStateTransition = r1
            return
    }

    public final boolean supports(int r5) {
            r4 = this;
            int r0 = r4.mOnStateTransition
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            if (r5 != 0) goto L9
            r1 = 1
        L9:
            return r1
        La:
            r3 = 2
            if (r0 != r3) goto L11
            if (r5 != r2) goto L10
            r1 = 1
        L10:
            return r1
        L11:
            r3 = 3
            if (r0 != r3) goto L17
            if (r5 != 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ViewTransition("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            android.content.Context r1 = r3.mContext
            int r2 = r3.mId
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
