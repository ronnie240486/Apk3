package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: classes.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.core.motion.MotionConstrainedPoint> {
    public static final boolean DEBUG = false;
    public static final java.lang.String TAG = "MotionPaths";
    private float alpha;
    private boolean applyElevation;
    private float elevation;
    private float height;
    private int mAnimateRelativeTo;
    public java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustomVariable;
    private int mDrawPath;
    private androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    private float mPathRotate;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    private float position;
    private float rotation;
    private float rotationX;
    public float rotationY;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;
    private float translationZ;
    public int visibility;
    private float width;
    private float x;
    private float y;

    public MotionConstrainedPoint() {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.alpha = r0
            r1 = 0
            r3.applyElevation = r1
            r2 = 0
            r3.elevation = r2
            r3.rotation = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.scaleX = r0
            r3.scaleY = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r0
            r3.mPivotY = r0
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.mDrawPath = r1
            r3.mPathRotate = r0
            r3.mProgress = r0
            r0 = -1
            r3.mAnimateRelativeTo = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.mCustomVariable = r0
            return
    }

    private boolean diff(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            java.util.Objects.requireNonNull(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto Lc3;
                case -1249320805: goto Lb7;
                case -1249320804: goto Lab;
                case -1225497657: goto L9f;
                case -1225497656: goto L93;
                case -1225497655: goto L87;
                case -1001078227: goto L7b;
                case -987906986: goto L70;
                case -987906985: goto L62;
                case -908189618: goto L53;
                case -908189617: goto L44;
                case 92909918: goto L36;
                case 803192288: goto L28;
                default: goto L26;
            }
        L26:
            goto Lce
        L28:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L32
            goto Lce
        L32:
            r3 = 12
            goto Lce
        L36:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L40
            goto Lce
        L40:
            r3 = 11
            goto Lce
        L44:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L4f
            goto Lce
        L4f:
            r3 = 10
            goto Lce
        L53:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            goto Lce
        L5e:
            r3 = 9
            goto Lce
        L62:
            java.lang.String r4 = "pivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L6c
            goto Lce
        L6c:
            r3 = 8
            goto Lce
        L70:
            java.lang.String r4 = "pivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L79
            goto Lce
        L79:
            r3 = 7
            goto Lce
        L7b:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L85
            goto Lce
        L85:
            r3 = 6
            goto Lce
        L87:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L91
            goto Lce
        L91:
            r3 = 5
            goto Lce
        L93:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L9d
            goto Lce
        L9d:
            r3 = 4
            goto Lce
        L9f:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La9
            goto Lce
        La9:
            r3 = 3
            goto Lce
        Lab:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb5
            goto Lce
        Lb5:
            r3 = 2
            goto Lce
        Lb7:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc1
            goto Lce
        Lc1:
            r3 = 1
            goto Lce
        Lc3:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lcd
            goto Lce
        Lcd:
            r3 = 0
        Lce:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L1ff;
                case 1: goto L1ef;
                case 2: goto L1df;
                case 3: goto L1cf;
                case 4: goto L1bf;
                case 5: goto L1af;
                case 6: goto L19f;
                case 7: goto L18f;
                case 8: goto L17f;
                case 9: goto L16f;
                case 10: goto L15f;
                case 11: goto L14f;
                case 12: goto L13f;
                default: goto Ld4;
            }
        Ld4:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L129
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r7.mCustomVariable
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L8
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r7.mCustomVariable
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            boolean r5 = r2 instanceof androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline
            if (r5 == 0) goto L101
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r2 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r2
            r2.setPoint(r9, r3)
            goto L8
        L101:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", value"
            r5.append(r1)
            float r1 = r3.getValueToInterpolate()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            androidx.constraintlayout.core.motion.utils.Utils.loge(r4, r1)
            goto L8
        L129:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            androidx.constraintlayout.core.motion.utils.Utils.loge(r4, r1)
            goto L8
        L13f:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L148
            goto L14a
        L148:
            float r6 = r7.mPathRotate
        L14a:
            r2.setPoint(r9, r6)
            goto L8
        L14f:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L158
            goto L15a
        L158:
            float r4 = r7.alpha
        L15a:
            r2.setPoint(r9, r4)
            goto L8
        L15f:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L168
            goto L16a
        L168:
            float r4 = r7.scaleY
        L16a:
            r2.setPoint(r9, r4)
            goto L8
        L16f:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L178
            goto L17a
        L178:
            float r4 = r7.scaleX
        L17a:
            r2.setPoint(r9, r4)
            goto L8
        L17f:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L188
            goto L18a
        L188:
            float r6 = r7.mPivotY
        L18a:
            r2.setPoint(r9, r6)
            goto L8
        L18f:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L198
            goto L19a
        L198:
            float r6 = r7.mPivotX
        L19a:
            r2.setPoint(r9, r6)
            goto L8
        L19f:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a8
            goto L1aa
        L1a8:
            float r6 = r7.mProgress
        L1aa:
            r2.setPoint(r9, r6)
            goto L8
        L1af:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b8
            goto L1ba
        L1b8:
            float r6 = r7.translationZ
        L1ba:
            r2.setPoint(r9, r6)
            goto L8
        L1bf:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1c8
            goto L1ca
        L1c8:
            float r6 = r7.translationY
        L1ca:
            r2.setPoint(r9, r6)
            goto L8
        L1cf:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1d8
            goto L1da
        L1d8:
            float r6 = r7.translationX
        L1da:
            r2.setPoint(r9, r6)
            goto L8
        L1df:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1e8
            goto L1ea
        L1e8:
            float r6 = r7.rotation
        L1ea:
            r2.setPoint(r9, r6)
            goto L8
        L1ef:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1f8
            goto L1fa
        L1f8:
            float r6 = r7.rotationY
        L1fa:
            r2.setPoint(r9, r6)
            goto L8
        L1ff:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L208
            goto L20a
        L208:
            float r6 = r7.rotationX
        L20a:
            r2.setPoint(r9, r6)
            goto L8
        L20f:
            return
    }

    public void applyParameters(androidx.constraintlayout.core.motion.MotionWidget r5) {
            r4 = this;
            int r0 = r5.getVisibility()
            r4.visibility = r0
            int r0 = r5.getVisibility()
            r1 = 4
            if (r0 == r1) goto Lf
            r0 = 0
            goto L13
        Lf:
            float r0 = r5.getAlpha()
        L13:
            r4.alpha = r0
            r0 = 0
            r4.applyElevation = r0
            float r0 = r5.getRotationZ()
            r4.rotation = r0
            float r0 = r5.getRotationX()
            r4.rotationX = r0
            float r0 = r5.getRotationY()
            r4.rotationY = r0
            float r0 = r5.getScaleX()
            r4.scaleX = r0
            float r0 = r5.getScaleY()
            r4.scaleY = r0
            float r0 = r5.getPivotX()
            r4.mPivotX = r0
            float r0 = r5.getPivotY()
            r4.mPivotY = r0
            float r0 = r5.getTranslationX()
            r4.translationX = r0
            float r0 = r5.getTranslationY()
            r4.translationY = r0
            float r0 = r5.getTranslationZ()
            r4.translationZ = r0
            java.util.Set r0 = r5.getCustomAttributeNames()
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.constraintlayout.core.motion.CustomVariable r2 = r5.getCustomAttribute(r1)
            if (r2 == 0) goto L5c
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L5c
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r4.mCustomVariable
            r3.put(r1, r2)
            goto L5c
        L7a:
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.core.motion.MotionConstrainedPoint r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.core.motion.MotionConstrainedPoint r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = (androidx.constraintlayout.core.motion.MotionConstrainedPoint) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public final void different(androidx.constraintlayout.core.motion.MotionConstrainedPoint r6, java.util.HashSet<java.lang.String> r7) {
            r5 = this;
            float r0 = r5.alpha
            float r1 = r6.alpha
            boolean r0 = r5.diff(r0, r1)
            java.lang.String r1 = "alpha"
            if (r0 == 0) goto Lf
            r7.add(r1)
        Lf:
            float r0 = r5.elevation
            float r2 = r6.elevation
            boolean r0 = r5.diff(r0, r2)
            java.lang.String r2 = "translationZ"
            if (r0 == 0) goto L1f
            r7.add(r2)
        L1f:
            int r0 = r5.visibility
            int r3 = r6.visibility
            if (r0 == r3) goto L2d
            r4 = 4
            if (r0 == r4) goto L2a
            if (r3 != r4) goto L2d
        L2a:
            r7.add(r1)
        L2d:
            float r0 = r5.rotation
            float r1 = r6.rotation
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L3d
            java.lang.String r0 = "rotationZ"
            r7.add(r0)
        L3d:
            float r0 = r5.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4d
            float r0 = r6.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
        L4d:
            java.lang.String r0 = "pathRotate"
            r7.add(r0)
        L52:
            float r0 = r5.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L62
            float r0 = r6.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
        L62:
            java.lang.String r0 = "progress"
            r7.add(r0)
        L68:
            float r0 = r5.rotationX
            float r1 = r6.rotationX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L78
            java.lang.String r0 = "rotationX"
            r7.add(r0)
        L78:
            float r0 = r5.rotationY
            float r1 = r6.rotationY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L88
            java.lang.String r0 = "rotationY"
            r7.add(r0)
        L88:
            float r0 = r5.mPivotX
            float r1 = r6.mPivotX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L97
            java.lang.String r0 = "pivotX"
            r7.add(r0)
        L97:
            float r0 = r5.mPivotY
            float r1 = r6.mPivotY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto La6
            java.lang.String r0 = "pivotY"
            r7.add(r0)
        La6:
            float r0 = r5.scaleX
            float r1 = r6.scaleX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "scaleX"
            r7.add(r0)
        Lb6:
            float r0 = r5.scaleY
            float r1 = r6.scaleY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lc6
            java.lang.String r0 = "scaleY"
            r7.add(r0)
        Lc6:
            float r0 = r5.translationX
            float r1 = r6.translationX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Ld6
            java.lang.String r0 = "translationX"
            r7.add(r0)
        Ld6:
            float r0 = r5.translationY
            float r1 = r6.translationY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Le6
            java.lang.String r0 = "translationY"
            r7.add(r0)
        Le6:
            float r0 = r5.translationZ
            float r1 = r6.translationZ
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lf3
            r7.add(r2)
        Lf3:
            float r0 = r5.elevation
            float r6 = r6.elevation
            boolean r6 = r5.diff(r0, r6)
            if (r6 == 0) goto L102
            java.lang.String r6 = "elevation"
            r7.add(r6)
        L102:
            return
    }

    public void setState(androidx.constraintlayout.core.motion.MotionWidget r5) {
            r4 = this;
            int r0 = r5.getX()
            float r0 = (float) r0
            int r1 = r5.getY()
            float r1 = (float) r1
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r4.x = r0
            r4.y = r1
            r4.width = r2
            r4.height = r3
            r4.applyParameters(r5)
            return
    }

    public void setState(androidx.constraintlayout.core.motion.utils.Rect r4, androidx.constraintlayout.core.motion.MotionWidget r5, int r6, float r7) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.width()
            float r2 = (float) r2
            int r4 = r4.height()
            float r4 = (float) r4
            r3.x = r0
            r3.y = r1
            r3.width = r2
            r3.height = r4
            r3.applyParameters(r5)
            r4 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r4
            r3.mPivotY = r4
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto L2e
            r4 = 2
            if (r6 == r4) goto L2a
            goto L31
        L2a:
            float r7 = r7 + r5
            r3.rotation = r7
            goto L31
        L2e:
            float r7 = r7 - r5
            r3.rotation = r7
        L31:
            return
    }
}
