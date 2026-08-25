package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 4;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
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
    private float mWavePhase;
    private int mWaveShape;
    private int mWaveVariesBy;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_PHASE = 21;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_motionTarget
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_framePosition
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_curveFit
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveShape
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePeriod
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveOffset
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveVariesBy
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_alpha
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_elevation
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotation
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationX
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationY
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionPathRotate
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationX
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationY
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationZ
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_motionProgress
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePhase
                r2 = 21
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void access$000(androidx.constraintlayout.motion.widget.KeyCycle r0, android.content.res.TypedArray r1) {
                read(r0, r1)
                return
        }

        private static void read(androidx.constraintlayout.motion.widget.KeyCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L192
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                r4 = 3
                switch(r3) {
                    case 1: goto L161;
                    case 2: goto L158;
                    case 3: goto L150;
                    case 4: goto L144;
                    case 5: goto L124;
                    case 6: goto L118;
                    case 7: goto Lf5;
                    case 8: goto Le8;
                    case 9: goto Ldb;
                    case 10: goto Lce;
                    case 11: goto Lc1;
                    case 12: goto Lb4;
                    case 13: goto La7;
                    case 14: goto L9a;
                    case 15: goto L8d;
                    case 16: goto L80;
                    case 17: goto L73;
                    case 18: goto L66;
                    case 19: goto L59;
                    case 20: goto L4c;
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
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r2 = r4.get(r2)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "KeyCycle"
                android.util.Log.e(r3, r2)
                goto L18e
            L3c:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$2000(r5)
                float r2 = r6.getFloat(r2, r3)
                r3 = 1135869952(0x43b40000, float:360.0)
                float r2 = r2 / r3
                androidx.constraintlayout.motion.widget.KeyCycle.access$2002(r5, r2)
                goto L18e
            L4c:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1902(r5, r2)
                goto L18e
            L59:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1802(r5, r2)
                goto L18e
            L66:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1702(r5, r2)
                goto L18e
            L73:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1602(r5, r2)
                goto L18e
            L80:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1502(r5, r2)
                goto L18e
            L8d:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1402(r5, r2)
                goto L18e
            L9a:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1300(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1302(r5, r2)
                goto L18e
            La7:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1202(r5, r2)
                goto L18e
            Lb4:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1102(r5, r2)
                goto L18e
            Lc1:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1002(r5, r2)
                goto L18e
            Lce:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$900(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$902(r5, r2)
                goto L18e
            Ldb:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$802(r5, r2)
                goto L18e
            Le8:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$700(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$702(r5, r2)
                goto L18e
            Lf5:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto L10b
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$602(r5, r2)
                goto L18e
            L10b:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$602(r5, r2)
                goto L18e
            L118:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$502(r5, r2)
                goto L18e
            L124:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L138
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyCycle.access$302(r5, r2)
                r2 = 7
                androidx.constraintlayout.motion.widget.KeyCycle.access$402(r5, r2)
                goto L18e
            L138:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$400(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$402(r5, r2)
                goto L18e
            L144:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$200(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$202(r5, r2)
                goto L18e
            L150:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyCycle.access$102(r5, r2)
                goto L18e
            L158:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L18e
            L161:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto L177
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L18e
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L18e
            L177:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L186
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L18e
            L186:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
            L18e:
                int r1 = r1 + 1
                goto L5
            L192:
                return
        }
    }

    public KeyCycle() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mTransitionEasing = r0
            r1 = 0
            r3.mCurveFit = r1
            r1 = -1
            r3.mWaveShape = r1
            r3.mCustomWaveShape = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.mWavePeriod = r0
            r2 = 0
            r3.mWaveOffset = r2
            r3.mWavePhase = r2
            r3.mProgress = r0
            r3.mWaveVariesBy = r1
            r3.mAlpha = r0
            r3.mElevation = r0
            r3.mRotation = r0
            r3.mTransitionPathRotate = r0
            r3.mRotationX = r0
            r3.mRotationY = r0
            r3.mScaleX = r0
            r3.mScaleY = r0
            r3.mTranslationX = r0
            r3.mTranslationY = r0
            r3.mTranslationZ = r0
            r0 = 4
            r3.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mCustomConstraints = r0
            return
    }

    public static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    public static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$102(androidx.constraintlayout.motion.widget.KeyCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    public static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    public static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    public static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    public static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    public static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    public static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    public static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    public static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    public static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    public static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    public static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    public static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    public static /* synthetic */ float access$1700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    public static /* synthetic */ float access$1702(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    public static /* synthetic */ float access$1800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    public static /* synthetic */ float access$1802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    public static /* synthetic */ float access$1900(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    public static /* synthetic */ float access$1902(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    public static /* synthetic */ int access$200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    public static /* synthetic */ float access$2000(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWavePhase
            return r0
    }

    public static /* synthetic */ float access$2002(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWavePhase = r1
            return r1
    }

    public static /* synthetic */ int access$202(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$302(androidx.constraintlayout.motion.widget.KeyCycle r0, java.lang.String r1) {
            r0.mCustomWaveShape = r1
            return r1
    }

    public static /* synthetic */ int access$400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    public static /* synthetic */ int access$402(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    public static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    public static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    public static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    public static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    public static /* synthetic */ int access$700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveVariesBy
            return r0
    }

    public static /* synthetic */ int access$702(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveVariesBy = r1
            return r1
    }

    public static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    public static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    public static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    public static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            java.util.Set r2 = r25.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L59
            r4 = 7
            java.lang.String r4 = r3.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r0.mCustomConstraints
            java.lang.Object r4 = r5.get(r4)
            r14 = r4
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto Lc
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = r14.getType()
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r4 == r5) goto L39
            goto Lc
        L39:
            java.lang.Object r3 = r1.get(r3)
            r5 = r3
            androidx.constraintlayout.motion.utils.ViewOscillator r5 = (androidx.constraintlayout.motion.utils.ViewOscillator) r5
            if (r5 != 0) goto L43
            goto Lc
        L43:
            int r6 = r0.mFramePosition
            int r7 = r0.mWaveShape
            java.lang.String r8 = r0.mCustomWaveShape
            int r9 = r0.mWaveVariesBy
            float r10 = r0.mWavePeriod
            float r11 = r0.mWaveOffset
            float r12 = r0.mWavePhase
            float r13 = r14.getValueToInterpolate()
            r5.setPoint(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lc
        L59:
            float r23 = r0.getValue(r3)
            boolean r4 = java.lang.Float.isNaN(r23)
            if (r4 == 0) goto L64
            goto Lc
        L64:
            java.lang.Object r3 = r1.get(r3)
            r15 = r3
            androidx.constraintlayout.motion.utils.ViewOscillator r15 = (androidx.constraintlayout.motion.utils.ViewOscillator) r15
            if (r15 != 0) goto L6e
            goto Lc
        L6e:
            int r3 = r0.mFramePosition
            int r4 = r0.mWaveShape
            java.lang.String r5 = r0.mCustomWaveShape
            int r6 = r0.mWaveVariesBy
            float r7 = r0.mWavePeriod
            float r8 = r0.mWaveOffset
            float r9 = r0.mWavePhase
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r15.setPoint(r16, r17, r18, r19, r20, r21, r22, r23)
            goto Lc
        L8f:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r6) {
            r5 = this;
            java.lang.String r0 = "add "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r1 = " values"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KeyCycle"
            r2 = 2
            androidx.constraintlayout.motion.widget.Debug.logStack(r1, r0, r2)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L39
            goto L24
        L39:
            java.util.Objects.requireNonNull(r1)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1249320806: goto Lf5;
                case -1249320805: goto Le9;
                case -1225497657: goto Ldd;
                case -1225497656: goto Ld1;
                case -1225497655: goto Lc5;
                case -1001078227: goto Lb9;
                case -908189618: goto Lad;
                case -908189617: goto La1;
                case -40300674: goto L92;
                case -4379043: goto L84;
                case 37232917: goto L75;
                case 92909918: goto L67;
                case 156108012: goto L58;
                case 1530034690: goto L49;
                default: goto L47;
            }
        L47:
            goto L100
        L49:
            java.lang.String r4 = "wavePhase"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L54
            goto L100
        L54:
            r3 = 13
            goto L100
        L58:
            java.lang.String r4 = "waveOffset"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L63
            goto L100
        L63:
            r3 = 12
            goto L100
        L67:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L71
            goto L100
        L71:
            r3 = 11
            goto L100
        L75:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
            goto L100
        L80:
            r3 = 10
            goto L100
        L84:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L8e
            goto L100
        L8e:
            r3 = 9
            goto L100
        L92:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L9d
            goto L100
        L9d:
            r3 = 8
            goto L100
        La1:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lab
            goto L100
        Lab:
            r3 = 7
            goto L100
        Lad:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb7
            goto L100
        Lb7:
            r3 = 6
            goto L100
        Lb9:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc3
            goto L100
        Lc3:
            r3 = 5
            goto L100
        Lc5:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lcf
            goto L100
        Lcf:
            r3 = 4
            goto L100
        Ld1:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ldb
            goto L100
        Ldb:
            r3 = 3
            goto L100
        Ldd:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Le7
            goto L100
        Le7:
            r3 = 2
            goto L100
        Le9:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lf3
            goto L100
        Lf3:
            r3 = 1
            goto L100
        Lf5:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lff
            goto L100
        Lff:
            r3 = 0
        L100:
            switch(r3) {
                case 0: goto L198;
                case 1: goto L18f;
                case 2: goto L186;
                case 3: goto L17d;
                case 4: goto L174;
                case 5: goto L16b;
                case 6: goto L162;
                case 7: goto L159;
                case 8: goto L150;
                case 9: goto L147;
                case 10: goto L13e;
                case 11: goto L135;
                case 12: goto L12c;
                case 13: goto L123;
                default: goto L103;
            }
        L103:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  UNKNOWN  "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "WARNING KeyCycle"
            android.util.Log.v(r2, r1)
            goto L24
        L123:
            int r1 = r5.mFramePosition
            float r3 = r5.mWavePhase
            r2.setPoint(r1, r3)
            goto L24
        L12c:
            int r1 = r5.mFramePosition
            float r3 = r5.mWaveOffset
            r2.setPoint(r1, r3)
            goto L24
        L135:
            int r1 = r5.mFramePosition
            float r3 = r5.mAlpha
            r2.setPoint(r1, r3)
            goto L24
        L13e:
            int r1 = r5.mFramePosition
            float r3 = r5.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L24
        L147:
            int r1 = r5.mFramePosition
            float r3 = r5.mElevation
            r2.setPoint(r1, r3)
            goto L24
        L150:
            int r1 = r5.mFramePosition
            float r3 = r5.mRotation
            r2.setPoint(r1, r3)
            goto L24
        L159:
            int r1 = r5.mFramePosition
            float r3 = r5.mScaleY
            r2.setPoint(r1, r3)
            goto L24
        L162:
            int r1 = r5.mFramePosition
            float r3 = r5.mScaleX
            r2.setPoint(r1, r3)
            goto L24
        L16b:
            int r1 = r5.mFramePosition
            float r3 = r5.mProgress
            r2.setPoint(r1, r3)
            goto L24
        L174:
            int r1 = r5.mFramePosition
            float r3 = r5.mTranslationZ
            r2.setPoint(r1, r3)
            goto L24
        L17d:
            int r1 = r5.mFramePosition
            float r3 = r5.mTranslationY
            r2.setPoint(r1, r3)
            goto L24
        L186:
            int r1 = r5.mFramePosition
            float r3 = r5.mTranslationX
            r2.setPoint(r1, r3)
            goto L24
        L18f:
            int r1 = r5.mFramePosition
            float r3 = r5.mRotationY
            r2.setPoint(r1, r3)
            goto L24
        L198:
            int r1 = r5.mFramePosition
            float r3 = r5.mRotationX
            r2.setPoint(r1, r3)
            goto L24
        L1a1:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyCycle r0 = new androidx.constraintlayout.motion.widget.KeyCycle
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
            androidx.constraintlayout.motion.widget.KeyCycle r2 = (androidx.constraintlayout.motion.widget.KeyCycle) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            int r0 = r2.mWaveShape
            r1.mWaveShape = r0
            java.lang.String r0 = r2.mCustomWaveShape
            r1.mCustomWaveShape = r0
            float r0 = r2.mWavePeriod
            r1.mWavePeriod = r0
            float r0 = r2.mWaveOffset
            r1.mWaveOffset = r0
            float r0 = r2.mWavePhase
            r1.mWavePhase = r0
            float r0 = r2.mProgress
            r1.mProgress = r0
            int r0 = r2.mWaveVariesBy
            r1.mWaveVariesBy = r0
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
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L52:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L60:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L6e:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L7c:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L8a:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L98:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lcb
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Laa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Laa
        Lcb:
            return
    }

    public float getValue(java.lang.String r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lb9;
                case -1249320805: goto Lad;
                case -1225497657: goto La1;
                case -1225497656: goto L95;
                case -1225497655: goto L89;
                case -1001078227: goto L7d;
                case -908189618: goto L71;
                case -908189617: goto L65;
                case -40300674: goto L56;
                case -4379043: goto L48;
                case 37232917: goto L39;
                case 92909918: goto L2b;
                case 156108012: goto L1c;
                case 1530034690: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lc4
        Ld:
            java.lang.String r0 = "wavePhase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            goto Lc4
        L18:
            r1 = 13
            goto Lc4
        L1c:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto Lc4
        L27:
            r1 = 12
            goto Lc4
        L2b:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L35
            goto Lc4
        L35:
            r1 = 11
            goto Lc4
        L39:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L44
            goto Lc4
        L44:
            r1 = 10
            goto Lc4
        L48:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L52
            goto Lc4
        L52:
            r1 = 9
            goto Lc4
        L56:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L61
            goto Lc4
        L61:
            r1 = 8
            goto Lc4
        L65:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6f
            goto Lc4
        L6f:
            r1 = 7
            goto Lc4
        L71:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L7b
            goto Lc4
        L7b:
            r1 = 6
            goto Lc4
        L7d:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L87
            goto Lc4
        L87:
            r1 = 5
            goto Lc4
        L89:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L93
            goto Lc4
        L93:
            r1 = 4
            goto Lc4
        L95:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9f
            goto Lc4
        L9f:
            r1 = 3
            goto Lc4
        La1:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lab
            goto Lc4
        Lab:
            r1 = 2
            goto Lc4
        Lad:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb7
            goto Lc4
        Lb7:
            r1 = 1
            goto Lc4
        Lb9:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lc3
            goto Lc4
        Lc3:
            r1 = 0
        Lc4:
            switch(r1) {
                case 0: goto L10f;
                case 1: goto L10c;
                case 2: goto L109;
                case 3: goto L106;
                case 4: goto L103;
                case 5: goto L100;
                case 6: goto Lfd;
                case 7: goto Lfa;
                case 8: goto Lf7;
                case 9: goto Lf4;
                case 10: goto Lf1;
                case 11: goto Lee;
                case 12: goto Leb;
                case 13: goto Le8;
                default: goto Lc7;
            }
        Lc7:
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto Le5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  UNKNOWN  "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WARNING! KeyCycle"
            android.util.Log.v(r0, r3)
        Le5:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        Le8:
            float r3 = r2.mWavePhase
            return r3
        Leb:
            float r3 = r2.mWaveOffset
            return r3
        Lee:
            float r3 = r2.mAlpha
            return r3
        Lf1:
            float r3 = r2.mTransitionPathRotate
            return r3
        Lf4:
            float r3 = r2.mElevation
            return r3
        Lf7:
            float r3 = r2.mRotation
            return r3
        Lfa:
            float r3 = r2.mScaleY
            return r3
        Lfd:
            float r3 = r2.mScaleX
            return r3
        L100:
            float r3 = r2.mProgress
            return r3
        L103:
            float r3 = r2.mTranslationZ
            return r3
        L106:
            float r3 = r2.mTranslationY
            return r3
        L109:
            float r3 = r2.mTranslationX
            return r3
        L10c:
            float r3 = r2.mRotationY
            return r3
        L10f:
            float r3 = r2.mRotationX
            return r3
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyCycle.Loader.access$000(r1, r2)
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
                case -1913008125: goto Lf5;
                case -1812823328: goto Le9;
                case -1249320806: goto Ldd;
                case -1249320805: goto Ld1;
                case -1225497657: goto Lc5;
                case -1225497656: goto Lb9;
                case -1225497655: goto Lad;
                case -908189618: goto La1;
                case -908189617: goto L92;
                case -40300674: goto L83;
                case -4379043: goto L75;
                case 37232917: goto L66;
                case 92909918: goto L58;
                case 156108012: goto L49;
                case 184161818: goto L3a;
                case 579057826: goto L2c;
                case 1530034690: goto L1d;
                case 1532805160: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lff
        Le:
            java.lang.String r0 = "waveShape"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L19
            goto Lff
        L19:
            r2 = 17
            goto Lff
        L1d:
            java.lang.String r0 = "wavePhase"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L28
            goto Lff
        L28:
            r2 = 16
            goto Lff
        L2c:
            java.lang.String r0 = "curveFit"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L36
            goto Lff
        L36:
            r2 = 15
            goto Lff
        L3a:
            java.lang.String r0 = "wavePeriod"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L45
            goto Lff
        L45:
            r2 = 14
            goto Lff
        L49:
            java.lang.String r0 = "waveOffset"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L54
            goto Lff
        L54:
            r2 = 13
            goto Lff
        L58:
            java.lang.String r0 = "alpha"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L62
            goto Lff
        L62:
            r2 = 12
            goto Lff
        L66:
            java.lang.String r0 = "transitionPathRotate"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L71
            goto Lff
        L71:
            r2 = 11
            goto Lff
        L75:
            java.lang.String r0 = "elevation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7f
            goto Lff
        L7f:
            r2 = 10
            goto Lff
        L83:
            java.lang.String r0 = "rotation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L8e
            goto Lff
        L8e:
            r2 = 9
            goto Lff
        L92:
            java.lang.String r0 = "scaleY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L9d
            goto Lff
        L9d:
            r2 = 8
            goto Lff
        La1:
            java.lang.String r0 = "scaleX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lab
            goto Lff
        Lab:
            r2 = 7
            goto Lff
        Lad:
            java.lang.String r0 = "translationZ"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb7
            goto Lff
        Lb7:
            r2 = 6
            goto Lff
        Lb9:
            java.lang.String r0 = "translationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc3
            goto Lff
        Lc3:
            r2 = 5
            goto Lff
        Lc5:
            java.lang.String r0 = "translationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcf
            goto Lff
        Lcf:
            r2 = 4
            goto Lff
        Ld1:
            java.lang.String r0 = "rotationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ldb
            goto Lff
        Ldb:
            r2 = 3
            goto Lff
        Ldd:
            java.lang.String r0 = "rotationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Le7
            goto Lff
        Le7:
            r2 = 2
            goto Lff
        Le9:
            java.lang.String r0 = "transitionEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lf3
            goto Lff
        Lf3:
            r2 = 1
            goto Lff
        Lf5:
            java.lang.String r0 = "motionProgress"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lfe
            goto Lff
        Lfe:
            r2 = 0
        Lff:
            switch(r2) {
                case 0: goto L18c;
                case 1: goto L185;
                case 2: goto L17e;
                case 3: goto L177;
                case 4: goto L170;
                case 5: goto L169;
                case 6: goto L162;
                case 7: goto L15b;
                case 8: goto L154;
                case 9: goto L14d;
                case 10: goto L146;
                case 11: goto L13f;
                case 12: goto L138;
                case 13: goto L131;
                case 14: goto L12a;
                case 15: goto L122;
                case 16: goto L11a;
                case 17: goto L104;
                default: goto L102;
            }
        L102:
            goto L192
        L104:
            boolean r4 = r5 instanceof java.lang.Integer
            if (r4 == 0) goto L110
            int r4 = r3.toInt(r5)
            r3.mWaveShape = r4
            goto L192
        L110:
            r3.mWaveShape = r1
            java.lang.String r4 = r5.toString()
            r3.mCustomWaveShape = r4
            goto L192
        L11a:
            float r4 = r3.toFloat(r5)
            r3.mWavePhase = r4
            goto L192
        L122:
            int r4 = r3.toInt(r5)
            r3.mCurveFit = r4
            goto L192
        L12a:
            float r4 = r3.toFloat(r5)
            r3.mWavePeriod = r4
            goto L192
        L131:
            float r4 = r3.toFloat(r5)
            r3.mWaveOffset = r4
            goto L192
        L138:
            float r4 = r3.toFloat(r5)
            r3.mAlpha = r4
            goto L192
        L13f:
            float r4 = r3.toFloat(r5)
            r3.mTransitionPathRotate = r4
            goto L192
        L146:
            float r4 = r3.toFloat(r5)
            r3.mElevation = r4
            goto L192
        L14d:
            float r4 = r3.toFloat(r5)
            r3.mRotation = r4
            goto L192
        L154:
            float r4 = r3.toFloat(r5)
            r3.mScaleY = r4
            goto L192
        L15b:
            float r4 = r3.toFloat(r5)
            r3.mScaleX = r4
            goto L192
        L162:
            float r4 = r3.toFloat(r5)
            r3.mTranslationZ = r4
            goto L192
        L169:
            float r4 = r3.toFloat(r5)
            r3.mTranslationY = r4
            goto L192
        L170:
            float r4 = r3.toFloat(r5)
            r3.mTranslationX = r4
            goto L192
        L177:
            float r4 = r3.toFloat(r5)
            r3.mRotationY = r4
            goto L192
        L17e:
            float r4 = r3.toFloat(r5)
            r3.mRotationX = r4
            goto L192
        L185:
            java.lang.String r4 = r5.toString()
            r3.mTransitionEasing = r4
            goto L192
        L18c:
            float r4 = r3.toFloat(r5)
            r3.mProgress = r4
        L192:
            return
    }
}
