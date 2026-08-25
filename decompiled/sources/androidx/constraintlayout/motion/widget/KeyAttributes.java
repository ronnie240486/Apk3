package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    private static final java.lang.String TAG = "KeyAttributes";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    private float mRotation;
    private float mRotationX;
    private float mRotationY;
    private float mScaleX;
    private float mScaleY;
    private java.lang.String mTransitionEasing;
    private float mTransitionPathRotate;
    private float mTranslationX;
    private float mTranslationY;
    private float mTranslationZ;
    private boolean mVisibility;

    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotX
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotY
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionProgress
                r2 = 18
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyAttributes r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L13c
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L12d;
                    case 2: goto L121;
                    case 3: goto L14;
                    case 4: goto L115;
                    case 5: goto L109;
                    case 6: goto Lfd;
                    case 7: goto Lf1;
                    case 8: goto Le5;
                    case 9: goto Ldd;
                    case 10: goto Lad;
                    case 11: goto L14;
                    case 12: goto La3;
                    case 13: goto L96;
                    case 14: goto L89;
                    case 15: goto L7c;
                    case 16: goto L6f;
                    case 17: goto L62;
                    case 18: goto L55;
                    case 19: goto L48;
                    case 20: goto L3b;
                    default: goto L14;
                }
            L14:
                java.lang.String r3 = "unused attribute 0x"
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                java.lang.String r4 = java.lang.Integer.toHexString(r2)
                r3.append(r4)
                java.lang.String r4 = "   "
                r3.append(r4)
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r2 = r4.get(r2)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "KeyAttribute"
                android.util.Log.e(r3, r2)
                goto L138
            L3b:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$802(r5, r2)
                goto L138
            L48:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$702(r5, r2)
                goto L138
            L55:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1502(r5, r2)
                goto L138
            L62:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1402(r5, r2)
                goto L138
            L6f:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1300(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1302(r5, r2)
                goto L138
            L7c:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1200(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1202(r5, r2)
                goto L138
            L89:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1002(r5, r2)
                goto L138
            L96:
                int r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$302(r5, r2)
                goto L138
            La3:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L138
            Lad:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Lc4
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L138
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L138
            Lc4:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto Ld4
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L138
            Ld4:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L138
            Ldd:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$902(r5, r2)
                goto L138
            Le5:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1102(r5, r2)
                goto L138
            Lf1:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$402(r5, r2)
                goto L138
            Lfd:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$602(r5, r2)
                goto L138
            L109:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$502(r5, r2)
                goto L138
            L115:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$202(r5, r2)
                goto L138
            L121:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$102(r5, r2)
                goto L138
            L12d:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$002(r5, r2)
            L138:
                int r1 = r1 + 1
                goto L5
            L13c:
                return
        }
    }

    public KeyAttributes() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurveFit = r0
            r0 = 0
            r1.mVisibility = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mAlpha = r0
            r1.mElevation = r0
            r1.mRotation = r0
            r1.mRotationX = r0
            r1.mRotationY = r0
            r1.mPivotX = r0
            r1.mPivotY = r0
            r1.mTransitionPathRotate = r0
            r1.mScaleX = r0
            r1.mScaleY = r0
            r1.mTranslationX = r0
            r1.mTranslationY = r0
            r1.mTranslationZ = r0
            r1.mProgress = r0
            r0 = 1
            r1.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCustomConstraints = r0
            return
    }

    public static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mAlpha
            return r0
    }

    public static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    public static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mElevation
            return r0
    }

    public static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleY
            return r0
    }

    public static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    public static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    public static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    public static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    public static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    public static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    public static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    public static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    public static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    public static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    public static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mProgress
            return r0
    }

    public static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    public static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotation
            return r0
    }

    public static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    public static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    public static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyAttributes r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    public static /* synthetic */ float access$400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleX
            return r0
    }

    public static /* synthetic */ float access$402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    public static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationX
            return r0
    }

    public static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    public static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationY
            return r0
    }

    public static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    public static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotX
            return r0
    }

    public static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotX = r1
            return r1
    }

    public static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotY
            return r0
    }

    public static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotY = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$902(androidx.constraintlayout.motion.widget.KeyAttributes r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ec
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L3c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.mCustomConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L8
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            int r3 = r6.mFramePosition
            r2.setPoint(r3, r1)
            goto L8
        L3c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto Led;
                case -1249320805: goto Le0;
                case -1225497657: goto Ld3;
                case -1225497656: goto Lc6;
                case -1225497655: goto Lba;
                case -1001078227: goto Lae;
                case -908189618: goto La2;
                case -908189617: goto L98;
                case -760884510: goto L8b;
                case -760884509: goto L7d;
                case -40300674: goto L6f;
                case -4379043: goto L62;
                case 37232917: goto L54;
                case 92909918: goto L47;
                default: goto L44;
            }
        L44:
            r4 = -1
            goto Lf9
        L47:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L50
            goto L44
        L50:
            r4 = 13
            goto Lf9
        L54:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L5e
            goto L44
        L5e:
            r4 = 12
            goto Lf9
        L62:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L6b
            goto L44
        L6b:
            r4 = 11
            goto Lf9
        L6f:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L79
            goto L44
        L79:
            r4 = 10
            goto Lf9
        L7d:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L87
            goto L44
        L87:
            r4 = 9
            goto Lf9
        L8b:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L95
            goto L44
        L95:
            r4 = 8
            goto Lf9
        L98:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lf9
            goto L44
        La2:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lac
            goto L44
        Lac:
            r4 = 6
            goto Lf9
        Lae:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lb8
            goto L44
        Lb8:
            r4 = 5
            goto Lf9
        Lba:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lc4
            goto L44
        Lc4:
            r4 = 4
            goto Lf9
        Lc6:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Ld1
            goto L44
        Ld1:
            r4 = 3
            goto Lf9
        Ld3:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lde
            goto L44
        Lde:
            r4 = 2
            goto Lf9
        Le0:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Leb
            goto L44
        Leb:
            r4 = 1
            goto Lf9
        Led:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lf8
            goto L44
        Lf8:
            r4 = 0
        Lf9:
            switch(r4) {
                case 0: goto L1db;
                case 1: goto L1ca;
                case 2: goto L1b9;
                case 3: goto L1a8;
                case 4: goto L197;
                case 5: goto L186;
                case 6: goto L175;
                case 7: goto L164;
                case 8: goto L153;
                case 9: goto L142;
                case 10: goto L131;
                case 11: goto L120;
                case 12: goto L10f;
                case 13: goto Lfe;
                default: goto Lfc;
            }
        Lfc:
            goto L8
        Lfe:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L8
        L10f:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L8
        L120:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L8
        L131:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L8
        L142:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L8
        L153:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L8
        L164:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L8
        L175:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L8
        L186:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L8
        L197:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L8
        L1a8:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L8
        L1b9:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L8
        L1ca:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L8
        L1db:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L8
        L1ec:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyAttributes r0 = new androidx.constraintlayout.motion.widget.KeyAttributes
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
            androidx.constraintlayout.motion.widget.KeyAttributes r2 = (androidx.constraintlayout.motion.widget.KeyAttributes) r2
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            boolean r0 = r2.mVisibility
            r1.mVisibility = r0
            float r0 = r2.mAlpha
            r1.mAlpha = r0
            float r0 = r2.mElevation
            r1.mElevation = r0
            float r0 = r2.mRotation
            r1.mRotation = r0
            float r0 = r2.mRotationX
            r1.mRotationX = r0
            float r0 = r2.mRotationY
            r1.mRotationY = r0
            float r0 = r2.mPivotX
            r1.mPivotX = r0
            float r0 = r2.mPivotY
            r1.mPivotY = r0
            float r0 = r2.mTransitionPathRotate
            r1.mTransitionPathRotate = r0
            float r0 = r2.mScaleX
            r1.mScaleX = r0
            float r0 = r2.mScaleY
            r1.mScaleY = r0
            float r0 = r2.mTranslationX
            r1.mTranslationX = r0
            float r0 = r2.mTranslationY
            r1.mTranslationY = r0
            float r0 = r2.mTranslationZ
            r1.mTranslationZ = r0
            float r2 = r2.mProgress
            r1.mProgress = r2
            return r1
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = "rotation"
            r5.add(r0)
        L28:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L36:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L44:
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "transformPivotX"
            r5.add(r0)
        L52:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "transformPivotY"
            r5.add(r0)
        L60:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L6e:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L7c:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L8a:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L98:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        La6:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb4
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        Lb4:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc2
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lc2:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lf5
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Ld4
        Lf5:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyAttribute
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyAttributes.Loader.read(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r4) {
            r3 = this;
            int r0 = r3.mCurveFit
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            float r0 = r3.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L19
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r4.put(r1, r0)
        L19:
            float r0 = r3.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2c
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r4.put(r1, r0)
        L2c:
            float r0 = r3.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L40
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r4.put(r1, r0)
        L40:
            float r0 = r3.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L54
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r4.put(r1, r0)
        L54:
            float r0 = r3.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r4.put(r1, r0)
        L68:
            float r0 = r3.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7c
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotX"
            r4.put(r1, r0)
        L7c:
            float r0 = r3.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L90
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotY"
            r4.put(r1, r0)
        L90:
            float r0 = r3.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La4
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        La4:
            float r0 = r3.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb8
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        Lb8:
            float r0 = r3.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lcc
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        Lcc:
            float r0 = r3.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Le0
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Le0:
            float r0 = r3.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lf4
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Lf4:
            float r0 = r3.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L108
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        L108:
            float r0 = r3.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L11c
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        L11c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r3.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L14a
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r3.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L12e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            int r2 = r3.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L12e
        L14a:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1913008125: goto Le5;
                case -1812823328: goto Ld9;
                case -1249320806: goto Lcd;
                case -1249320805: goto Lc1;
                case -1225497657: goto Lb5;
                case -1225497656: goto La9;
                case -1225497655: goto L9d;
                case -908189618: goto L91;
                case -908189617: goto L82;
                case -760884510: goto L73;
                case -760884509: goto L64;
                case -40300674: goto L55;
                case -4379043: goto L47;
                case 37232917: goto L38;
                case 92909918: goto L2a;
                case 579057826: goto L1c;
                case 1941332754: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lef
        Ld:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lef
        L18:
            r1 = 16
            goto Lef
        L1c:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Lef
        L26:
            r1 = 15
            goto Lef
        L2a:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Lef
        L34:
            r1 = 14
            goto Lef
        L38:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L43
            goto Lef
        L43:
            r1 = 13
            goto Lef
        L47:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L51
            goto Lef
        L51:
            r1 = 12
            goto Lef
        L55:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto Lef
        L60:
            r1 = 11
            goto Lef
        L64:
            java.lang.String r0 = "transformPivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6f
            goto Lef
        L6f:
            r1 = 10
            goto Lef
        L73:
            java.lang.String r0 = "transformPivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7e
            goto Lef
        L7e:
            r1 = 9
            goto Lef
        L82:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8d
            goto Lef
        L8d:
            r1 = 8
            goto Lef
        L91:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9b
            goto Lef
        L9b:
            r1 = 7
            goto Lef
        L9d:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La7
            goto Lef
        La7:
            r1 = 6
            goto Lef
        La9:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb3
            goto Lef
        Lb3:
            r1 = 5
            goto Lef
        Lb5:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbf
            goto Lef
        Lbf:
            r1 = 4
            goto Lef
        Lc1:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcb
            goto Lef
        Lcb:
            r1 = 3
            goto Lef
        Lcd:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld7
            goto Lef
        Ld7:
            r1 = 2
            goto Lef
        Ld9:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le3
            goto Lef
        Le3:
            r1 = 1
            goto Lef
        Le5:
            java.lang.String r0 = "motionProgress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lee
            goto Lef
        Lee:
            r1 = 0
        Lef:
            switch(r1) {
                case 0: goto L175;
                case 1: goto L16e;
                case 2: goto L167;
                case 3: goto L160;
                case 4: goto L159;
                case 5: goto L152;
                case 6: goto L14b;
                case 7: goto L144;
                case 8: goto L13d;
                case 9: goto L136;
                case 10: goto L12f;
                case 11: goto L128;
                case 12: goto L121;
                case 13: goto L11a;
                case 14: goto L113;
                case 15: goto L10b;
                case 16: goto Lf4;
                default: goto Lf2;
            }
        Lf2:
            goto L17b
        Lf4:
            boolean r3 = r4 instanceof java.lang.Boolean
            if (r3 == 0) goto Lff
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            goto L107
        Lff:
            java.lang.String r3 = r4.toString()
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
        L107:
            r2.mVisibility = r3
            goto L17b
        L10b:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            goto L17b
        L113:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
            goto L17b
        L11a:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            goto L17b
        L121:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            goto L17b
        L128:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            goto L17b
        L12f:
            float r3 = r2.toFloat(r4)
            r2.mPivotY = r3
            goto L17b
        L136:
            float r3 = r2.toFloat(r4)
            r2.mPivotX = r3
            goto L17b
        L13d:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            goto L17b
        L144:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            goto L17b
        L14b:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            goto L17b
        L152:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            goto L17b
        L159:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            goto L17b
        L160:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            goto L17b
        L167:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            goto L17b
        L16e:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            goto L17b
        L175:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
        L17b:
            return
    }
}
