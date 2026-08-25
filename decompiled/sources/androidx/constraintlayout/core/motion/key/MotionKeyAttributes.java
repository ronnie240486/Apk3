package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyAttributes extends androidx.constraintlayout.core.motion.key.MotionKey {
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
    private int mVisibility;

    public MotionKeyAttributes() {
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
            r1.mCustom = r0
            return
    }

    private float getFloatValue(int r2) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L34
            switch(r2) {
                case 303: goto L31;
                case 304: goto L2e;
                case 305: goto L2b;
                case 306: goto L28;
                case 307: goto L25;
                case 308: goto L22;
                case 309: goto L1f;
                case 310: goto L1c;
                case 311: goto L19;
                case 312: goto L16;
                case 313: goto L13;
                case 314: goto L10;
                case 315: goto Ld;
                case 316: goto La;
                default: goto L7;
            }
        L7:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
        La:
            float r2 = r1.mTransitionPathRotate
            return r2
        Ld:
            float r2 = r1.mProgress
            return r2
        L10:
            float r2 = r1.mPivotY
            return r2
        L13:
            float r2 = r1.mPivotX
            return r2
        L16:
            float r2 = r1.mScaleY
            return r2
        L19:
            float r2 = r1.mScaleX
            return r2
        L1c:
            float r2 = r1.mRotation
            return r2
        L1f:
            float r2 = r1.mRotationY
            return r2
        L22:
            float r2 = r1.mRotationX
            return r2
        L25:
            float r2 = r1.mElevation
            return r2
        L28:
            float r2 = r1.mTranslationZ
            return r2
        L2b:
            float r2 = r1.mTranslationY
            return r2
        L2e:
            float r2 = r1.mTranslationX
            return r2
        L31:
            float r2 = r1.mAlpha
            return r2
        L34:
            int r2 = r1.mFramePosition
            float r2 = (float) r2
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ff
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r6.mCustom
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r1 = (androidx.constraintlayout.core.motion.CustomVariable) r1
            if (r1 == 0) goto L8
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r2 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r2
            int r3 = r6.mFramePosition
            r2.setPoint(r3, r1)
            goto L8
        L3c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto Lea;
                case -1249320805: goto Ldd;
                case -1249320804: goto Ld0;
                case -1225497657: goto Lc3;
                case -1225497656: goto Lb7;
                case -1225497655: goto Lab;
                case -1001078227: goto L9f;
                case -987906986: goto L96;
                case -987906985: goto L8a;
                case -908189618: goto L7c;
                case -908189617: goto L6e;
                case -4379043: goto L61;
                case 92909918: goto L54;
                case 803192288: goto L47;
                default: goto L44;
            }
        L44:
            r4 = -1
            goto Lf6
        L47:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L50
            goto L44
        L50:
            r4 = 13
            goto Lf6
        L54:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5d
            goto L44
        L5d:
            r4 = 12
            goto Lf6
        L61:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L6a
            goto L44
        L6a:
            r4 = 11
            goto Lf6
        L6e:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L78
            goto L44
        L78:
            r4 = 10
            goto Lf6
        L7c:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L86
            goto L44
        L86:
            r4 = 9
            goto Lf6
        L8a:
            java.lang.String r4 = "pivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L93
            goto L44
        L93:
            r4 = 8
            goto Lf6
        L96:
            java.lang.String r5 = "pivotX"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Lf6
            goto L44
        L9f:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La9
            goto L44
        La9:
            r4 = 6
            goto Lf6
        Lab:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb5
            goto L44
        Lb5:
            r4 = 5
            goto Lf6
        Lb7:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc1
            goto L44
        Lc1:
            r4 = 4
            goto Lf6
        Lc3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lce
            goto L44
        Lce:
            r4 = 3
            goto Lf6
        Ld0:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ldb
            goto L44
        Ldb:
            r4 = 2
            goto Lf6
        Ldd:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Le8
            goto L44
        Le8:
            r4 = 1
            goto Lf6
        Lea:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lf5
            goto L44
        Lf5:
            r4 = 0
        Lf6:
            switch(r4) {
                case 0: goto L1ee;
                case 1: goto L1dd;
                case 2: goto L1cc;
                case 3: goto L1bb;
                case 4: goto L1aa;
                case 5: goto L199;
                case 6: goto L188;
                case 7: goto L177;
                case 8: goto L166;
                case 9: goto L155;
                case 10: goto L144;
                case 11: goto L133;
                case 12: goto L122;
                case 13: goto L111;
                default: goto Lf9;
            }
        Lf9:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not supported by KeyAttributes "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            goto L8
        L111:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L8
        L122:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L8
        L133:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L8
        L144:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L8
        L155:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L8
        L166:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L8
        L177:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L8
        L188:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L8
        L199:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L8
        L1aa:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L8
        L1bb:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L8
        L1cc:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L8
        L1dd:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L8
        L1ee:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L8
        L1ff:
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
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "pivotX"
            r5.add(r0)
        L51:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "pivotY"
            r5.add(r0)
        L5e:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L6c
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L6c:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L7a:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L88
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L88:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = "pathRotate"
            r5.add(r0)
        L95:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La3
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        La3:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        Lb1:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lbf
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lbf:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto Lf2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Ld1
        Lf2:
            return
    }

    public int getCurveFit() {
            r1 = this;
            int r0 = r1.mCurveFit
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.CC.getId(r1)
            return r1
    }

    public void printAttributes() {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.getAttributeNames(r0)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = " ------------- "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = r6.mFramePosition
            r2.append(r3)
            java.lang.String r3 = " -------------"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L2a:
            int r2 = r0.length
            if (r1 >= r2) goto L55
            r2 = r0[r1]
            int r2 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.CC.getId(r2)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r0[r1]
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            float r2 = r6.getFloatValue(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto L2a
        L55:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r4) {
            r3 = this;
            float r0 = r3.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L13
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r4.put(r1, r0)
        L13:
            float r0 = r3.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L26
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r4.put(r1, r0)
        L26:
            float r0 = r3.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3a
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationZ"
            r4.put(r1, r0)
        L3a:
            float r0 = r3.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r4.put(r1, r0)
        L4e:
            float r0 = r3.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L62
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r4.put(r1, r0)
        L62:
            float r0 = r3.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pivotX"
            r4.put(r1, r0)
        L75:
            float r0 = r3.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L88
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pivotY"
            r4.put(r1, r0)
        L88:
            float r0 = r3.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L9c:
            float r0 = r3.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb0
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        Lb0:
            float r0 = r3.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc4
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        Lc4:
            float r0 = r3.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld7
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pathRotate"
            r4.put(r1, r0)
        Ld7:
            float r0 = r3.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Leb
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Leb:
            float r0 = r3.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lff
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Lff:
            float r0 = r3.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L113
            int r0 = r3.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        L113:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r3.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto L141
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r3.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L125:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L141
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            int r2 = r3.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L125
        L141:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L36
            switch(r2) {
                case 303: goto L33;
                case 304: goto L30;
                case 305: goto L2d;
                case 306: goto L2a;
                case 307: goto L27;
                case 308: goto L24;
                case 309: goto L21;
                case 310: goto L1e;
                case 311: goto L1b;
                case 312: goto L18;
                case 313: goto L15;
                case 314: goto L12;
                case 315: goto Lf;
                case 316: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = super.setValue(r2, r3)
            return r2
        Lc:
            r1.mTransitionPathRotate = r3
            goto L38
        Lf:
            r1.mProgress = r3
            goto L38
        L12:
            r1.mPivotY = r3
            goto L38
        L15:
            r1.mPivotX = r3
            goto L38
        L18:
            r1.mScaleY = r3
            goto L38
        L1b:
            r1.mScaleX = r3
            goto L38
        L1e:
            r1.mRotation = r3
            goto L38
        L21:
            r1.mRotationY = r3
            goto L38
        L24:
            r1.mRotationX = r3
            goto L38
        L27:
            r1.mElevation = r3
            goto L38
        L2a:
            r1.mTranslationZ = r3
            goto L38
        L2d:
            r1.mTranslationY = r3
            goto L38
        L30:
            r1.mTranslationX = r3
            goto L38
        L33:
            r1.mAlpha = r3
            goto L38
        L36:
            r1.mTransitionPathRotate = r3
        L38:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L1d
            r0 = 301(0x12d, float:4.22E-43)
            if (r2 == r0) goto L1a
            r0 = 302(0x12e, float:4.23E-43)
            if (r2 == r0) goto L17
            boolean r0 = r1.setValue(r2, r3)
            if (r0 != 0) goto L1f
            boolean r2 = super.setValue(r2, r3)
            return r2
        L17:
            r1.mVisibility = r3
            goto L1f
        L1a:
            r1.mCurveFit = r3
            goto L1f
        L1d:
            r1.mFramePosition = r3
        L1f:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto Lf
            r0 = 317(0x13d, float:4.44E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r1.mTransitionEasing = r3
        Lf:
            r2 = 1
            return r2
    }
}
