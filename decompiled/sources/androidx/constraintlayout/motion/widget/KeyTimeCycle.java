package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 3;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyTimeCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private float mAlpha;
    private int mCurveFit;
    private java.lang.String mCustomWaveShape;
    private float mElevation;
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
    private float mWaveOffset;
    private float mWavePeriod;
    private int mWaveShape;

    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
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
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionProgress
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_wavePeriod
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveOffset
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveShape
                r2 = 19
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTimeCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L174
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                r4 = 3
                switch(r3) {
                    case 1: goto L165;
                    case 2: goto L159;
                    case 3: goto L15;
                    case 4: goto L14d;
                    case 5: goto L141;
                    case 6: goto L135;
                    case 7: goto L129;
                    case 8: goto L11d;
                    case 9: goto L115;
                    case 10: goto Le6;
                    case 11: goto L15;
                    case 12: goto Ldc;
                    case 13: goto Lcf;
                    case 14: goto Lc2;
                    case 15: goto Lb5;
                    case 16: goto La8;
                    case 17: goto L9b;
                    case 18: goto L8e;
                    case 19: goto L6c;
                    case 20: goto L5f;
                    case 21: goto L3c;
                    default: goto L15;
                }
            L15:
                java.lang.String r3 = "unused attribute 0x"
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                java.lang.String r4 = java.lang.Integer.toHexString(r2)
                r3.append(r4)
                java.lang.String r4 = "   "
                r3.append(r4)
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r2 = r4.get(r2)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "KeyTimeCycle"
                android.util.Log.e(r3, r2)
                goto L170
            L3c:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto L52
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$702(r5, r2)
                goto L170
            L52:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$702(r5, r2)
                goto L170
            L5f:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$602(r5, r2)
                goto L170
            L6c:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L81
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$402(r5, r2)
                r2 = 7
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$502(r5, r2)
                goto L170
            L81:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$500(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$502(r5, r2)
                goto L170
            L8e:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1702(r5, r2)
                goto L170
            L9b:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1602(r5, r2)
                goto L170
            La8:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1500(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1502(r5, r2)
                goto L170
            Lb5:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1402(r5, r2)
                goto L170
            Lc2:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1202(r5, r2)
                goto L170
            Lcf:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$302(r5, r2)
                goto L170
            Ldc:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L170
            Le6:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Lfd
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L170
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L170
            Lfd:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L10c
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L170
            L10c:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L170
            L115:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1102(r5, r2)
                goto L170
            L11d:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1300(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1302(r5, r2)
                goto L170
            L129:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$802(r5, r2)
                goto L170
            L135:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1002(r5, r2)
                goto L170
            L141:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$902(r5, r2)
                goto L170
            L14d:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$202(r5, r2)
                goto L170
            L159:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$102(r5, r2)
                goto L170
            L165:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$002(r5, r2)
            L170:
                int r1 = r1 + 1
                goto L5
            L174:
                return
        }
    }

    public KeyTimeCycle() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mAlpha = r0
            r2.mElevation = r0
            r2.mRotation = r0
            r2.mRotationX = r0
            r2.mRotationY = r0
            r2.mTransitionPathRotate = r0
            r2.mScaleX = r0
            r2.mScaleY = r0
            r2.mTranslationX = r0
            r2.mTranslationY = r0
            r2.mTranslationZ = r0
            r2.mProgress = r0
            r1 = 0
            r2.mWaveShape = r1
            r1 = 0
            r2.mCustomWaveShape = r1
            r2.mWavePeriod = r0
            r0 = 0
            r2.mWaveOffset = r0
            r0 = 3
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustomConstraints = r0
            return
    }

    public static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    public static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    public static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    public static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    public static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    public static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$1102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    public static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    public static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    public static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    public static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    public static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    public static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    public static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    public static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    public static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    public static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    public static /* synthetic */ float access$1700(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    public static /* synthetic */ float access$1702(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    public static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    public static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    public static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    public static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, java.lang.String r1) {
            r0.mCustomWaveShape = r1
            return r1
    }

    public static /* synthetic */ int access$500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    public static /* synthetic */ int access$502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    public static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    public static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    public static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    public static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    public static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    public static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    public static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    public static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r11) {
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L218
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.utils.ViewTimeCycle r3 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r3
            if (r3 != 0) goto L1e
            goto L8
        L1e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L45
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.mCustomConstraints
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L8
            r4 = r3
            androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet r4 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet) r4
            int r5 = r10.mFramePosition
            float r7 = r10.mWavePeriod
            int r8 = r10.mWaveShape
            float r9 = r10.mWaveOffset
            r4.setPoint(r5, r6, r7, r8, r9)
            goto L8
        L45:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto Ld8;
                case -1249320805: goto Lcb;
                case -1225497657: goto Lbf;
                case -1225497656: goto Lb3;
                case -1225497655: goto La7;
                case -1001078227: goto L9b;
                case -908189618: goto L8f;
                case -908189617: goto L85;
                case -40300674: goto L78;
                case -4379043: goto L6b;
                case 37232917: goto L5d;
                case 92909918: goto L50;
                default: goto L4d;
            }
        L4d:
            r4 = -1
            goto Le4
        L50:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L59
            goto L4d
        L59:
            r4 = 11
            goto Le4
        L5d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L67
            goto L4d
        L67:
            r4 = 10
            goto Le4
        L6b:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L74
            goto L4d
        L74:
            r4 = 9
            goto Le4
        L78:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L82
            goto L4d
        L82:
            r4 = 8
            goto Le4
        L85:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Le4
            goto L4d
        L8f:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L99
            goto L4d
        L99:
            r4 = 6
            goto Le4
        L9b:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La5
            goto L4d
        La5:
            r4 = 5
            goto Le4
        La7:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb1
            goto L4d
        Lb1:
            r4 = 4
            goto Le4
        Lb3:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lbd
            goto L4d
        Lbd:
            r4 = 3
            goto Le4
        Lbf:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc9
            goto L4d
        Lc9:
            r4 = 2
            goto Le4
        Lcb:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ld6
            goto L4d
        Ld6:
            r4 = 1
            goto Le4
        Ld8:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Le3
            goto L4d
        Le3:
            r4 = 0
        Le4:
            switch(r4) {
                case 0: goto L201;
                case 1: goto L1ea;
                case 2: goto L1d3;
                case 3: goto L1bc;
                case 4: goto L1a5;
                case 5: goto L18e;
                case 6: goto L177;
                case 7: goto L160;
                case 8: goto L149;
                case 9: goto L132;
                case 10: goto L11b;
                case 11: goto L104;
                default: goto Le7;
            }
        Le7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L8
        L104:
            float r1 = r10.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mAlpha
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L11b:
            float r1 = r10.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTransitionPathRotate
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L132:
            float r1 = r10.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mElevation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L149:
            float r1 = r10.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L160:
            float r1 = r10.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L177:
            float r1 = r10.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L18e:
            float r1 = r10.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mProgress
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1a5:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1bc:
            float r1 = r10.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1d3:
            float r1 = r10.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1ea:
            float r1 = r10.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L201:
            float r1 = r10.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L218:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = " KeyTimeCycles do not support SplineSet"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyTimeCycle r0 = new androidx.constraintlayout.motion.widget.KeyTimeCycle
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
            androidx.constraintlayout.motion.widget.KeyTimeCycle r2 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            int r0 = r2.mWaveShape
            r1.mWaveShape = r0
            float r0 = r2.mWavePeriod
            r1.mWavePeriod = r0
            float r0 = r2.mWaveOffset
            r1.mWaveOffset = r0
            float r0 = r2.mProgress
            r1.mProgress = r0
            float r0 = r2.mAlpha
            r1.mAlpha = r0
            float r0 = r2.mElevation
            r1.mElevation = r0
            float r0 = r2.mRotation
            r1.mRotation = r0
            float r0 = r2.mTransitionPathRotate
            r1.mTransitionPathRotate = r0
            float r0 = r2.mRotationX
            r1.mRotationX = r0
            float r0 = r2.mRotationY
            r1.mRotationY = r0
            float r0 = r2.mScaleX
            r1.mScaleX = r0
            float r0 = r2.mScaleY
            r1.mScaleY = r0
            float r0 = r2.mTranslationX
            r1.mTranslationX = r0
            float r0 = r2.mTranslationY
            r1.mTranslationY = r0
            float r2 = r2.mTranslationZ
            r1.mTranslationZ = r2
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
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L52:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L60:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L6e:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L7c:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L8a:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L98:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "progress"
            r5.add(r0)
        La6:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Ld9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Lb8
        Ld9:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.read(r1, r2)
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
            float r0 = r3.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7c
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L7c:
            float r0 = r3.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L90
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        L90:
            float r0 = r3.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La4
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        La4:
            float r0 = r3.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb8
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Lb8:
            float r0 = r3.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lcc
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Lcc:
            float r0 = r3.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Le0
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Le0:
            float r0 = r3.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lf4
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        Lf4:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r3.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L122
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r3.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L106:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L122
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            int r2 = r3.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L106
        L122:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r4.hashCode()
            r1 = 7
            r2 = -1
            switch(r0) {
                case -1913008125: goto Le6;
                case -1812823328: goto Lda;
                case -1249320806: goto Lce;
                case -1249320805: goto Lc2;
                case -1225497657: goto Lb6;
                case -1225497656: goto Laa;
                case -1225497655: goto L9e;
                case -908189618: goto L92;
                case -908189617: goto L83;
                case -40300674: goto L74;
                case -4379043: goto L66;
                case 37232917: goto L57;
                case 92909918: goto L49;
                case 156108012: goto L3a;
                case 184161818: goto L2b;
                case 579057826: goto L1d;
                case 1532805160: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lf0
        Le:
            java.lang.String r0 = "waveShape"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L19
            goto Lf0
        L19:
            r2 = 16
            goto Lf0
        L1d:
            java.lang.String r0 = "curveFit"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L27
            goto Lf0
        L27:
            r2 = 15
            goto Lf0
        L2b:
            java.lang.String r0 = "wavePeriod"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L36
            goto Lf0
        L36:
            r2 = 14
            goto Lf0
        L3a:
            java.lang.String r0 = "waveOffset"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L45
            goto Lf0
        L45:
            r2 = 13
            goto Lf0
        L49:
            java.lang.String r0 = "alpha"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L53
            goto Lf0
        L53:
            r2 = 12
            goto Lf0
        L57:
            java.lang.String r0 = "transitionPathRotate"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L62
            goto Lf0
        L62:
            r2 = 11
            goto Lf0
        L66:
            java.lang.String r0 = "elevation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L70
            goto Lf0
        L70:
            r2 = 10
            goto Lf0
        L74:
            java.lang.String r0 = "rotation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7f
            goto Lf0
        L7f:
            r2 = 9
            goto Lf0
        L83:
            java.lang.String r0 = "scaleY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L8e
            goto Lf0
        L8e:
            r2 = 8
            goto Lf0
        L92:
            java.lang.String r0 = "scaleX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L9c
            goto Lf0
        L9c:
            r2 = 7
            goto Lf0
        L9e:
            java.lang.String r0 = "translationZ"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La8
            goto Lf0
        La8:
            r2 = 6
            goto Lf0
        Laa:
            java.lang.String r0 = "translationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb4
            goto Lf0
        Lb4:
            r2 = 5
            goto Lf0
        Lb6:
            java.lang.String r0 = "translationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc0
            goto Lf0
        Lc0:
            r2 = 4
            goto Lf0
        Lc2:
            java.lang.String r0 = "rotationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcc
            goto Lf0
        Lcc:
            r2 = 3
            goto Lf0
        Lce:
            java.lang.String r0 = "rotationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld8
            goto Lf0
        Ld8:
            r2 = 2
            goto Lf0
        Lda:
            java.lang.String r0 = "transitionEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Le4
            goto Lf0
        Le4:
            r2 = 1
            goto Lf0
        Le6:
            java.lang.String r0 = "motionProgress"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lef
            goto Lf0
        Lef:
            r2 = 0
        Lf0:
            switch(r2) {
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
                case 16: goto Lf5;
                default: goto Lf3;
            }
        Lf3:
            goto L17b
        Lf5:
            boolean r4 = r5 instanceof java.lang.Integer
            if (r4 == 0) goto L101
            int r4 = r3.toInt(r5)
            r3.mWaveShape = r4
            goto L17b
        L101:
            r3.mWaveShape = r1
            java.lang.String r4 = r5.toString()
            r3.mCustomWaveShape = r4
            goto L17b
        L10b:
            int r4 = r3.toInt(r5)
            r3.mCurveFit = r4
            goto L17b
        L113:
            float r4 = r3.toFloat(r5)
            r3.mWavePeriod = r4
            goto L17b
        L11a:
            float r4 = r3.toFloat(r5)
            r3.mWaveOffset = r4
            goto L17b
        L121:
            float r4 = r3.toFloat(r5)
            r3.mAlpha = r4
            goto L17b
        L128:
            float r4 = r3.toFloat(r5)
            r3.mTransitionPathRotate = r4
            goto L17b
        L12f:
            float r4 = r3.toFloat(r5)
            r3.mElevation = r4
            goto L17b
        L136:
            float r4 = r3.toFloat(r5)
            r3.mRotation = r4
            goto L17b
        L13d:
            float r4 = r3.toFloat(r5)
            r3.mScaleY = r4
            goto L17b
        L144:
            float r4 = r3.toFloat(r5)
            r3.mScaleX = r4
            goto L17b
        L14b:
            float r4 = r3.toFloat(r5)
            r3.mTranslationZ = r4
            goto L17b
        L152:
            float r4 = r3.toFloat(r5)
            r3.mTranslationY = r4
            goto L17b
        L159:
            float r4 = r3.toFloat(r5)
            r3.mTranslationX = r4
            goto L17b
        L160:
            float r4 = r3.toFloat(r5)
            r3.mRotationY = r4
            goto L17b
        L167:
            float r4 = r3.toFloat(r5)
            r3.mRotationX = r4
            goto L17b
        L16e:
            java.lang.String r4 = r5.toString()
            r3.mTransitionEasing = r4
            goto L17b
        L175:
            float r4 = r3.toFloat(r5)
            r3.mProgress = r4
        L17b:
            return
    }
}
