package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
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

    public MotionKeyCycle() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mTransitionEasing = r0
            r1 = 0
            r2.mCurveFit = r1
            r1 = -1
            r2.mWaveShape = r1
            r2.mCustomWaveShape = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mWavePeriod = r0
            r1 = 0
            r2.mWaveOffset = r1
            r2.mWavePhase = r1
            r2.mProgress = r0
            r2.mAlpha = r0
            r2.mElevation = r0
            r2.mRotation = r0
            r2.mTransitionPathRotate = r0
            r2.mRotationX = r0
            r2.mRotationY = r0
            r2.mScaleX = r0
            r2.mScaleY = r0
            r2.mTranslationX = r0
            r2.mTranslationY = r0
            r2.mTranslationZ = r0
            r0 = 4
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustom = r0
            return
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            java.util.Set r2 = r25.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L58
            r4 = 7
            java.lang.String r4 = r3.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r0.mCustom
            java.lang.Object r4 = r5.get(r4)
            r14 = r4
            androidx.constraintlayout.core.motion.CustomVariable r14 = (androidx.constraintlayout.core.motion.CustomVariable) r14
            if (r14 == 0) goto Lc
            int r4 = r14.getType()
            r5 = 901(0x385, float:1.263E-42)
            if (r4 == r5) goto L39
            goto Lc
        L39:
            java.lang.Object r3 = r1.get(r3)
            r5 = r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r5 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r5
            if (r5 != 0) goto L43
            goto Lc
        L43:
            int r6 = r0.mFramePosition
            int r7 = r0.mWaveShape
            java.lang.String r8 = r0.mCustomWaveShape
            r9 = -1
            float r10 = r0.mWavePeriod
            float r11 = r0.mWaveOffset
            float r12 = r0.mWavePhase
            float r13 = r14.getValueToInterpolate()
            r5.setPoint(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lc
        L58:
            float r23 = r0.getValue(r3)
            boolean r4 = java.lang.Float.isNaN(r23)
            if (r4 == 0) goto L63
            goto Lc
        L63:
            java.lang.Object r3 = r1.get(r3)
            r15 = r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r15 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r15
            if (r15 != 0) goto L6d
            goto Lc
        L6d:
            int r3 = r0.mFramePosition
            int r4 = r0.mWaveShape
            java.lang.String r5 = r0.mCustomWaveShape
            r19 = -1
            float r6 = r0.mWavePeriod
            float r7 = r0.mWaveOffset
            float r8 = r0.mWavePhase
            r16 = r3
            r17 = r4
            r18 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r15.setPoint(r16, r17, r18, r19, r20, r21, r22, r23)
            goto Lc
        L8b:
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
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo4clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    public void dump() {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "MotionKeyCycle{mWaveShape="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mWaveShape
            r1.append(r2)
            java.lang.String r2 = ", mWavePeriod="
            r1.append(r2)
            float r2 = r3.mWavePeriod
            r1.append(r2)
            java.lang.String r2 = ", mWaveOffset="
            r1.append(r2)
            float r2 = r3.mWaveOffset
            r1.append(r2)
            java.lang.String r2 = ", mWavePhase="
            r1.append(r2)
            float r2 = r3.mWavePhase
            r1.append(r2)
            java.lang.String r2 = ", mRotation="
            r1.append(r2)
            float r2 = r3.mRotation
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
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
            java.lang.String r0 = "rotationZ"
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
            if (r0 != 0) goto L6d
            java.lang.String r0 = "pathRotate"
            r5.add(r0)
        L6d:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L7b:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L89
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L89:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L97
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L97:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto Lca
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto La9
        Lca:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1581616630: goto L11a;
                case -1310311125: goto L10e;
                case -1249320806: goto L101;
                case -1249320805: goto Lf4;
                case -1249320804: goto Le7;
                case -1225497657: goto Lda;
                case -1225497656: goto Lcd;
                case -1225497655: goto Lc0;
                case -1019779949: goto Lb2;
                case -1001078227: goto La3;
                case -991726143: goto L95;
                case -987906986: goto L87;
                case -987906985: goto L7a;
                case -908189618: goto L6c;
                case -908189617: goto L5e;
                case 92909918: goto L51;
                case 106629499: goto L44;
                case 579057826: goto L37;
                case 803192288: goto L2a;
                case 1532805160: goto L1c;
                case 1941332754: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = -1
            goto L125
        Le:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lb
        L18:
            r3 = 20
            goto L125
        L1c:
            java.lang.String r0 = "waveShape"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Lb
        L26:
            r3 = 19
            goto L125
        L2a:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Lb
        L33:
            r3 = 18
            goto L125
        L37:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto Lb
        L40:
            r3 = 17
            goto L125
        L44:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4d
            goto Lb
        L4d:
            r3 = 16
            goto L125
        L51:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto Lb
        L5a:
            r3 = 15
            goto L125
        L5e:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L68
            goto Lb
        L68:
            r3 = 14
            goto L125
        L6c:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L76
            goto Lb
        L76:
            r3 = 13
            goto L125
        L7a:
            java.lang.String r0 = "pivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L83
            goto Lb
        L83:
            r3 = 12
            goto L125
        L87:
            java.lang.String r0 = "pivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L91
            goto Lb
        L91:
            r3 = 11
            goto L125
        L95:
            java.lang.String r0 = "period"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9f
            goto Lb
        L9f:
            r3 = 10
            goto L125
        La3:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lae
            goto Lb
        Lae:
            r3 = 9
            goto L125
        Lb2:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbc
            goto Lb
        Lbc:
            r3 = 8
            goto L125
        Lc0:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcb
            goto Lb
        Lcb:
            r3 = 7
            goto L125
        Lcd:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld8
            goto Lb
        Ld8:
            r3 = 6
            goto L125
        Lda:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le5
            goto Lb
        Le5:
            r3 = 5
            goto L125
        Le7:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lf2
            goto Lb
        Lf2:
            r3 = 4
            goto L125
        Lf4:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lff
            goto Lb
        Lff:
            r3 = 3
            goto L125
        L101:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L10c
            goto Lb
        L10c:
            r3 = 2
            goto L125
        L10e:
            java.lang.String r0 = "easing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L118
            goto Lb
        L118:
            r3 = 1
            goto L125
        L11a:
            java.lang.String r0 = "customWave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L124
            goto Lb
        L124:
            r3 = 0
        L125:
            switch(r3) {
                case 0: goto L165;
                case 1: goto L162;
                case 2: goto L15f;
                case 3: goto L15c;
                case 4: goto L159;
                case 5: goto L156;
                case 6: goto L153;
                case 7: goto L150;
                case 8: goto L14d;
                case 9: goto L14a;
                case 10: goto L147;
                case 11: goto L144;
                case 12: goto L141;
                case 13: goto L13e;
                case 14: goto L13b;
                case 15: goto L138;
                case 16: goto L135;
                case 17: goto L132;
                case 18: goto L12f;
                case 19: goto L12c;
                case 20: goto L129;
                default: goto L128;
            }
        L128:
            return r1
        L129:
            r3 = 402(0x192, float:5.63E-43)
            return r3
        L12c:
            r3 = 421(0x1a5, float:5.9E-43)
            return r3
        L12f:
            r3 = 416(0x1a0, float:5.83E-43)
            return r3
        L132:
            r3 = 401(0x191, float:5.62E-43)
            return r3
        L135:
            r3 = 425(0x1a9, float:5.96E-43)
            return r3
        L138:
            r3 = 403(0x193, float:5.65E-43)
            return r3
        L13b:
            r3 = 312(0x138, float:4.37E-43)
            return r3
        L13e:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L141:
            r3 = 314(0x13a, float:4.4E-43)
            return r3
        L144:
            r3 = 313(0x139, float:4.39E-43)
            return r3
        L147:
            r3 = 423(0x1a7, float:5.93E-43)
            return r3
        L14a:
            r3 = 315(0x13b, float:4.41E-43)
            return r3
        L14d:
            r3 = 424(0x1a8, float:5.94E-43)
            return r3
        L150:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L153:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L156:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L159:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L15c:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        L15f:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L162:
            r3 = 420(0x1a4, float:5.89E-43)
            return r3
        L165:
            r3 = 422(0x1a6, float:5.91E-43)
            return r3
    }

    public float getValue(java.lang.String r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lb6;
                case -1249320805: goto Laa;
                case -1249320804: goto L9e;
                case -1225497657: goto L92;
                case -1225497656: goto L86;
                case -1225497655: goto L7a;
                case -1019779949: goto L6f;
                case -1001078227: goto L63;
                case -908189618: goto L54;
                case -908189617: goto L45;
                case -4379043: goto L37;
                case 92909918: goto L29;
                case 106629499: goto L1b;
                case 803192288: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lc1
        Ld:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lc1
        L17:
            r1 = 13
            goto Lc1
        L1b:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Lc1
        L25:
            r1 = 12
            goto Lc1
        L29:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Lc1
        L33:
            r1 = 11
            goto Lc1
        L37:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto Lc1
        L41:
            r1 = 10
            goto Lc1
        L45:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L50
            goto Lc1
        L50:
            r1 = 9
            goto Lc1
        L54:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5f
            goto Lc1
        L5f:
            r1 = 8
            goto Lc1
        L63:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6d
            goto Lc1
        L6d:
            r1 = 7
            goto Lc1
        L6f:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L78
            goto Lc1
        L78:
            r1 = 6
            goto Lc1
        L7a:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L84
            goto Lc1
        L84:
            r1 = 5
            goto Lc1
        L86:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L90
            goto Lc1
        L90:
            r1 = 4
            goto Lc1
        L92:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9c
            goto Lc1
        L9c:
            r1 = 3
            goto Lc1
        L9e:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La8
            goto Lc1
        La8:
            r1 = 2
            goto Lc1
        Laa:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb4
            goto Lc1
        Lb4:
            r1 = 1
            goto Lc1
        Lb6:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc0
            goto Lc1
        Lc0:
            r1 = 0
        Lc1:
            switch(r1) {
                case 0: goto Lee;
                case 1: goto Leb;
                case 2: goto Le8;
                case 3: goto Le5;
                case 4: goto Le2;
                case 5: goto Ldf;
                case 6: goto Ldc;
                case 7: goto Ld9;
                case 8: goto Ld6;
                case 9: goto Ld3;
                case 10: goto Ld0;
                case 11: goto Lcd;
                case 12: goto Lca;
                case 13: goto Lc7;
                default: goto Lc4;
            }
        Lc4:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        Lc7:
            float r3 = r2.mTransitionPathRotate
            return r3
        Lca:
            float r3 = r2.mWavePhase
            return r3
        Lcd:
            float r3 = r2.mAlpha
            return r3
        Ld0:
            float r3 = r2.mElevation
            return r3
        Ld3:
            float r3 = r2.mScaleY
            return r3
        Ld6:
            float r3 = r2.mScaleX
            return r3
        Ld9:
            float r3 = r2.mProgress
            return r3
        Ldc:
            float r3 = r2.mWaveOffset
            return r3
        Ldf:
            float r3 = r2.mTranslationZ
            return r3
        Le2:
            float r3 = r2.mTranslationY
            return r3
        Le5:
            float r3 = r2.mTranslationX
            return r3
        Le8:
            float r3 = r2.mRotation
            return r3
        Leb:
            float r3 = r2.mRotationY
            return r3
        Lee:
            float r3 = r2.mRotationX
            return r3
    }

    public void printAttributes() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.getAttributeNames(r0)
            java.lang.String r1 = " ------------- "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r4.mFramePosition
            r1.append(r2)
            java.lang.String r2 = " -------------"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MotionKeyCycle{Shape="
            r1.append(r2)
            int r2 = r4.mWaveShape
            r1.append(r2)
            java.lang.String r2 = ", Period="
            r1.append(r2)
            float r2 = r4.mWavePeriod
            r1.append(r2)
            java.lang.String r2 = ", Offset="
            r1.append(r2)
            float r2 = r4.mWaveOffset
            r1.append(r2)
            java.lang.String r2 = ", Phase="
            r1.append(r2)
            float r2 = r4.mWavePhase
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r1)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L61:
            int r2 = r0.length
            if (r1 >= r2) goto L8b
            r2 = r0[r1]
            androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.CC.getId(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r0[r1]
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r3 = r0[r1]
            float r3 = r4.getValue(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r2)
            int r1 = r1 + 1
            goto L61
        L8b:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 315(0x13b, float:4.41E-43)
            if (r2 == r0) goto L41
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L3e
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 == r0) goto L3b
            switch(r2) {
                case 304: goto L38;
                case 305: goto L35;
                case 306: goto L32;
                case 307: goto L2f;
                case 308: goto L2c;
                case 309: goto L29;
                case 310: goto L26;
                case 311: goto L23;
                case 312: goto L20;
                default: goto Lf;
            }
        Lf:
            switch(r2) {
                case 423: goto L1d;
                case 424: goto L1a;
                case 425: goto L17;
                default: goto L12;
            }
        L12:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L17:
            r1.mWavePhase = r3
            goto L43
        L1a:
            r1.mWaveOffset = r3
            goto L43
        L1d:
            r1.mWavePeriod = r3
            goto L43
        L20:
            r1.mScaleY = r3
            goto L43
        L23:
            r1.mScaleX = r3
            goto L43
        L26:
            r1.mRotation = r3
            goto L43
        L29:
            r1.mRotationY = r3
            goto L43
        L2c:
            r1.mRotationX = r3
            goto L43
        L2f:
            r1.mElevation = r3
            goto L43
        L32:
            r1.mTranslationZ = r3
            goto L43
        L35:
            r1.mTranslationY = r3
            goto L43
        L38:
            r1.mTranslationX = r3
            goto L43
        L3b:
            r1.mTransitionPathRotate = r3
            goto L43
        L3e:
            r1.mAlpha = r3
            goto L43
        L41:
            r1.mProgress = r3
        L43:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, int r4) {
            r2 = this;
            r0 = 401(0x191, float:5.62E-43)
            r1 = 1
            if (r3 == r0) goto L19
            r0 = 421(0x1a5, float:5.9E-43)
            if (r3 == r0) goto L16
            float r0 = (float) r4
            boolean r0 = r2.setValue(r3, r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            boolean r3 = super.setValue(r3, r4)
            return r3
        L16:
            r2.mWaveShape = r4
            return r1
        L19:
            r2.mCurveFit = r4
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 420(0x1a4, float:5.89E-43)
            r1 = 1
            if (r3 == r0) goto L11
            r0 = 422(0x1a6, float:5.91E-43)
            if (r3 == r0) goto Le
            boolean r3 = super.setValue(r3, r4)
            return r3
        Le:
            r2.mCustomWaveShape = r4
            return r1
        L11:
            r2.mTransitionEasing = r4
            return r1
    }
}
