package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes2.dex */
public class MotionKeyTimeCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 3;
    private static final java.lang.String TAG = "KeyTimeCycle";
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

    public MotionKeyTimeCycle() {
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
            r2.mCustom = r0
            return
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r11) {
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L217
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet r3 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet) r3
            if (r3 != 0) goto L1e
            goto L8
        L1e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L45
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r10.mCustom
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.core.motion.CustomVariable r6 = (androidx.constraintlayout.core.motion.CustomVariable) r6
            if (r6 == 0) goto L8
            r4 = r3
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet$CustomVarSet r4 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet) r4
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
                case -1249320806: goto Ld7;
                case -1249320805: goto Lca;
                case -1249320804: goto Lbe;
                case -1225497657: goto Lb2;
                case -1225497656: goto La6;
                case -1225497655: goto L9a;
                case -1001078227: goto L8e;
                case -908189618: goto L84;
                case -908189617: goto L77;
                case -4379043: goto L6a;
                case 92909918: goto L5d;
                case 803192288: goto L50;
                default: goto L4d;
            }
        L4d:
            r4 = -1
            goto Le3
        L50:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L59
            goto L4d
        L59:
            r4 = 11
            goto Le3
        L5d:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L66
            goto L4d
        L66:
            r4 = 10
            goto Le3
        L6a:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L73
            goto L4d
        L73:
            r4 = 9
            goto Le3
        L77:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L81
            goto L4d
        L81:
            r4 = 8
            goto Le3
        L84:
            java.lang.String r5 = "scaleX"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Le3
            goto L4d
        L8e:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L98
            goto L4d
        L98:
            r4 = 6
            goto Le3
        L9a:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La4
            goto L4d
        La4:
            r4 = 5
            goto Le3
        La6:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb0
            goto L4d
        Lb0:
            r4 = 4
            goto Le3
        Lb2:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lbc
            goto L4d
        Lbc:
            r4 = 3
            goto Le3
        Lbe:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc8
            goto L4d
        Lc8:
            r4 = 2
            goto Le3
        Lca:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ld5
            goto L4d
        Ld5:
            r4 = 1
            goto Le3
        Ld7:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Le2
            goto L4d
        Le2:
            r4 = 0
        Le3:
            switch(r4) {
                case 0: goto L200;
                case 1: goto L1e9;
                case 2: goto L1d2;
                case 3: goto L1bb;
                case 4: goto L1a4;
                case 5: goto L18d;
                case 6: goto L176;
                case 7: goto L15f;
                case 8: goto L148;
                case 9: goto L131;
                case 10: goto L11a;
                case 11: goto L103;
                default: goto Le6;
            }
        Le6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            androidx.constraintlayout.core.motion.utils.Utils.loge(r2, r1)
            goto L8
        L103:
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
        L11a:
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
        L131:
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
        L148:
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
        L15f:
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
        L176:
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
        L18d:
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
        L1a4:
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
        L1bb:
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
        L1d2:
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
        L1e9:
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
        L200:
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
        L217:
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
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r0 = new androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r0 = r0.copy(r1)
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
    public /* bridge */ /* synthetic */ androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r1 = r0.copy(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) r2
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
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.CC.getId(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 315(0x13b, float:4.41E-43)
            if (r2 == r0) goto Lc6
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto Lac
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto La9
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 == r0) goto L9e
            r0 = 423(0x1a7, float:5.93E-43)
            if (r2 == r0) goto L93
            r0 = 424(0x1a8, float:5.94E-43)
            if (r2 == r0) goto L88
            switch(r2) {
                case 304: goto L7d;
                case 305: goto L72;
                case 306: goto L67;
                case 307: goto L5c;
                case 308: goto L50;
                case 309: goto L44;
                case 310: goto L38;
                case 311: goto L2c;
                case 312: goto L20;
                default: goto L1b;
            }
        L1b:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L20:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mScaleY = r2
            goto Ld0
        L2c:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mScaleX = r2
            goto Ld0
        L38:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotation = r2
            goto Ld0
        L44:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotationY = r2
            goto Ld0
        L50:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotationX = r2
            goto Ld0
        L5c:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mElevation = r2
            goto Ld0
        L67:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationZ = r2
            goto Ld0
        L72:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationY = r2
            goto Ld0
        L7d:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationX = r2
            goto Ld0
        L88:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mWaveOffset = r2
            goto Ld0
        L93:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mWavePeriod = r2
            goto Ld0
        L9e:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTransitionPathRotate = r2
            goto Ld0
        La9:
            r1.mAlpha = r3
            goto Ld0
        Lac:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto Lbb
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto Lc3
        Lbb:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        Lc3:
            r1.mCurveFit = r2
            goto Ld0
        Lc6:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mProgress = r2
        Ld0:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L10
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r1.mWaveShape = r3
            goto L12
        L10:
            r1.mFramePosition = r3
        L12:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 420(0x1a4, float:5.89E-43)
            if (r2 == r0) goto L13
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r2 = 7
            r1.mWaveShape = r2
            r1.mCustomWaveShape = r3
            goto L15
        L13:
            r1.mTransitionEasing = r3
        L15:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            boolean r1 = super.setValue(r1, r2)
            return r1
    }
}
