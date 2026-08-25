package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionConstrainedPoint> {
    public static final boolean DEBUG = false;
    public static final java.lang.String TAG = "MotionPaths";
    private float alpha;
    private boolean applyElevation;
    public java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes;
    private float elevation;
    private float height;
    private int mAnimateRelativeTo;
    private int mDrawPath;
    private androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    private float mPathRotate;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    public int mVisibilityMode;
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
            r3.mVisibilityMode = r1
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
            r3.attributes = r0
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

    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L230
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.motion.utils.ViewSpline r2 = (androidx.constraintlayout.motion.utils.ViewSpline) r2
            java.util.Objects.requireNonNull(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto Ld4;
                case -1249320805: goto Lc8;
                case -1225497657: goto Lbc;
                case -1225497656: goto Lb0;
                case -1225497655: goto La4;
                case -1001078227: goto L98;
                case -908189618: goto L8c;
                case -908189617: goto L80;
                case -760884510: goto L71;
                case -760884509: goto L62;
                case -40300674: goto L53;
                case -4379043: goto L45;
                case 37232917: goto L36;
                case 92909918: goto L28;
                default: goto L26;
            }
        L26:
            goto Ldf
        L28:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L32
            goto Ldf
        L32:
            r3 = 13
            goto Ldf
        L36:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L41
            goto Ldf
        L41:
            r3 = 12
            goto Ldf
        L45:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L4f
            goto Ldf
        L4f:
            r3 = 11
            goto Ldf
        L53:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            goto Ldf
        L5e:
            r3 = 10
            goto Ldf
        L62:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L6d
            goto Ldf
        L6d:
            r3 = 9
            goto Ldf
        L71:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L7c
            goto Ldf
        L7c:
            r3 = 8
            goto Ldf
        L80:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L8a
            goto Ldf
        L8a:
            r3 = 7
            goto Ldf
        L8c:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L96
            goto Ldf
        L96:
            r3 = 6
            goto Ldf
        L98:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La2
            goto Ldf
        La2:
            r3 = 5
            goto Ldf
        La4:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lae
            goto Ldf
        Lae:
            r3 = 4
            goto Ldf
        Lb0:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lba
            goto Ldf
        Lba:
            r3 = 3
            goto Ldf
        Lbc:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc6
            goto Ldf
        Lc6:
            r3 = 2
            goto Ldf
        Lc8:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ld2
            goto Ldf
        Ld2:
            r3 = 1
            goto Ldf
        Ld4:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lde
            goto Ldf
        Lde:
            r3 = 0
        Ldf:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L220;
                case 1: goto L210;
                case 2: goto L200;
                case 3: goto L1f0;
                case 4: goto L1e0;
                case 5: goto L1d0;
                case 6: goto L1c0;
                case 7: goto L1b0;
                case 8: goto L1a0;
                case 9: goto L190;
                case 10: goto L180;
                case 11: goto L170;
                case 12: goto L160;
                case 13: goto L150;
                default: goto Le5;
            }
        Le5:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L13a
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r7.attributes
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L8
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r7.attributes
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            boolean r5 = r2 instanceof androidx.constraintlayout.motion.utils.ViewSpline.CustomSet
            if (r5 == 0) goto L112
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            r2.setPoint(r9, r3)
            goto L8
        L112:
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
            android.util.Log.e(r4, r1)
            goto L8
        L13a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r4, r1)
            goto L8
        L150:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L159
            goto L15b
        L159:
            float r4 = r7.alpha
        L15b:
            r2.setPoint(r9, r4)
            goto L8
        L160:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L169
            goto L16b
        L169:
            float r6 = r7.mPathRotate
        L16b:
            r2.setPoint(r9, r6)
            goto L8
        L170:
            float r1 = r7.elevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L179
            goto L17b
        L179:
            float r6 = r7.elevation
        L17b:
            r2.setPoint(r9, r6)
            goto L8
        L180:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L189
            goto L18b
        L189:
            float r6 = r7.rotation
        L18b:
            r2.setPoint(r9, r6)
            goto L8
        L190:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L199
            goto L19b
        L199:
            float r6 = r7.mPivotY
        L19b:
            r2.setPoint(r9, r6)
            goto L8
        L1a0:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a9
            goto L1ab
        L1a9:
            float r6 = r7.mPivotX
        L1ab:
            r2.setPoint(r9, r6)
            goto L8
        L1b0:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b9
            goto L1bb
        L1b9:
            float r4 = r7.scaleY
        L1bb:
            r2.setPoint(r9, r4)
            goto L8
        L1c0:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1c9
            goto L1cb
        L1c9:
            float r4 = r7.scaleX
        L1cb:
            r2.setPoint(r9, r4)
            goto L8
        L1d0:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1d9
            goto L1db
        L1d9:
            float r6 = r7.mProgress
        L1db:
            r2.setPoint(r9, r6)
            goto L8
        L1e0:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1e9
            goto L1eb
        L1e9:
            float r6 = r7.translationZ
        L1eb:
            r2.setPoint(r9, r6)
            goto L8
        L1f0:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1f9
            goto L1fb
        L1f9:
            float r6 = r7.translationY
        L1fb:
            r2.setPoint(r9, r6)
            goto L8
        L200:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L209
            goto L20b
        L209:
            float r6 = r7.translationX
        L20b:
            r2.setPoint(r9, r6)
            goto L8
        L210:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L219
            goto L21b
        L219:
            float r6 = r7.rotationY
        L21b:
            r2.setPoint(r9, r6)
            goto L8
        L220:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L229
            goto L22b
        L229:
            float r6 = r7.rotationX
        L22b:
            r2.setPoint(r9, r6)
            goto L8
        L230:
            return
    }

    public void applyParameters(android.view.View r2) {
            r1 = this;
            int r0 = r2.getVisibility()
            r1.visibility = r0
            int r0 = r2.getVisibility()
            if (r0 == 0) goto Le
            r0 = 0
            goto L12
        Le:
            float r0 = r2.getAlpha()
        L12:
            r1.alpha = r0
            r0 = 0
            r1.applyElevation = r0
            float r0 = r2.getElevation()
            r1.elevation = r0
            float r0 = r2.getRotation()
            r1.rotation = r0
            float r0 = r2.getRotationX()
            r1.rotationX = r0
            float r0 = r2.getRotationY()
            r1.rotationY = r0
            float r0 = r2.getScaleX()
            r1.scaleX = r0
            float r0 = r2.getScaleY()
            r1.scaleY = r0
            float r0 = r2.getPivotX()
            r1.mPivotX = r0
            float r0 = r2.getPivotY()
            r1.mPivotY = r0
            float r0 = r2.getTranslationX()
            r1.translationX = r0
            float r0 = r2.getTranslationY()
            r1.translationY = r0
            float r2 = r2.getTranslationZ()
            r1.translationZ = r2
            return
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r5) {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            int r1 = r0.mVisibilityMode
            r4.mVisibilityMode = r1
            int r2 = r0.visibility
            r4.visibility = r2
            if (r2 == 0) goto L10
            if (r1 != 0) goto L10
            r0 = 0
            goto L12
        L10:
            float r0 = r0.alpha
        L12:
            r4.alpha = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            boolean r1 = r0.applyElevation
            r4.applyElevation = r1
            float r1 = r0.elevation
            r4.elevation = r1
            float r1 = r0.rotation
            r4.rotation = r1
            float r1 = r0.rotationX
            r4.rotationX = r1
            float r1 = r0.rotationY
            r4.rotationY = r1
            float r1 = r0.scaleX
            r4.scaleX = r1
            float r1 = r0.scaleY
            r4.scaleY = r1
            float r1 = r0.transformPivotX
            r4.mPivotX = r1
            float r1 = r0.transformPivotY
            r4.mPivotY = r1
            float r1 = r0.translationX
            r4.translationX = r1
            float r1 = r0.translationY
            r4.translationY = r1
            float r0 = r0.translationZ
            r4.translationZ = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            java.lang.String r0 = r0.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            r4.mKeyFrameEasing = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            float r1 = r0.mPathRotate
            r4.mPathRotate = r1
            int r1 = r0.mDrawPath
            r4.mDrawPath = r1
            int r0 = r0.mAnimateRelativeTo
            r4.mAnimateRelativeTo = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            float r0 = r0.mProgress
            r4.mProgress = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r5.mCustomConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L6e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.attributes
            r3.put(r1, r2)
            goto L6e
        L8e:
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = (androidx.constraintlayout.motion.widget.MotionConstrainedPoint) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public final void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r5, java.util.HashSet<java.lang.String> r6) {
            r4 = this;
            float r0 = r4.alpha
            float r1 = r5.alpha
            boolean r0 = r4.diff(r0, r1)
            java.lang.String r1 = "alpha"
            if (r0 == 0) goto Lf
            r6.add(r1)
        Lf:
            float r0 = r4.elevation
            float r2 = r5.elevation
            boolean r0 = r4.diff(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "elevation"
            r6.add(r0)
        L1e:
            int r0 = r4.visibility
            int r2 = r5.visibility
            if (r0 == r2) goto L2f
            int r3 = r4.mVisibilityMode
            if (r3 != 0) goto L2f
            if (r0 == 0) goto L2c
            if (r2 != 0) goto L2f
        L2c:
            r6.add(r1)
        L2f:
            float r0 = r4.rotation
            float r1 = r5.rotation
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L3f
            java.lang.String r0 = "rotation"
            r6.add(r0)
        L3f:
            float r0 = r4.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4f
            float r0 = r5.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L55
        L4f:
            java.lang.String r0 = "transitionPathRotate"
            r6.add(r0)
        L55:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L65
            float r0 = r5.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L6b
        L65:
            java.lang.String r0 = "progress"
            r6.add(r0)
        L6b:
            float r0 = r4.rotationX
            float r1 = r5.rotationX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L7b
            java.lang.String r0 = "rotationX"
            r6.add(r0)
        L7b:
            float r0 = r4.rotationY
            float r1 = r5.rotationY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L8b
            java.lang.String r0 = "rotationY"
            r6.add(r0)
        L8b:
            float r0 = r4.mPivotX
            float r1 = r5.mPivotX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L9b
            java.lang.String r0 = "transformPivotX"
            r6.add(r0)
        L9b:
            float r0 = r4.mPivotY
            float r1 = r5.mPivotY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Lab
            java.lang.String r0 = "transformPivotY"
            r6.add(r0)
        Lab:
            float r0 = r4.scaleX
            float r1 = r5.scaleX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Lbb
            java.lang.String r0 = "scaleX"
            r6.add(r0)
        Lbb:
            float r0 = r4.scaleY
            float r1 = r5.scaleY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Lcb
            java.lang.String r0 = "scaleY"
            r6.add(r0)
        Lcb:
            float r0 = r4.translationX
            float r1 = r5.translationX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Ldb
            java.lang.String r0 = "translationX"
            r6.add(r0)
        Ldb:
            float r0 = r4.translationY
            float r1 = r5.translationY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Leb
            java.lang.String r0 = "translationY"
            r6.add(r0)
        Leb:
            float r0 = r4.translationZ
            float r5 = r5.translationZ
            boolean r5 = r4.diff(r0, r5)
            if (r5 == 0) goto Lfb
            java.lang.String r5 = "translationZ"
            r6.add(r5)
        Lfb:
            return
    }

    public final void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public void setState(android.graphics.Rect r4, android.view.View r5, int r6, float r7) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.width()
            float r2 = (float) r2
            int r4 = r4.height()
            float r4 = (float) r4
            r3.setBounds(r0, r1, r2, r4)
            r3.applyParameters(r5)
            r4 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r4
            r3.mPivotY = r4
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto L29
            r4 = 2
            if (r6 == r4) goto L25
            goto L2c
        L25:
            float r7 = r7 + r5
            r3.rotation = r7
            goto L2c
        L29:
            float r7 = r7 - r5
            r3.rotation = r7
        L2c:
            return
    }

    public void setState(android.graphics.Rect r4, androidx.constraintlayout.widget.ConstraintSet r5, int r6, int r7) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.width()
            float r2 = (float) r2
            int r4 = r4.height()
            float r4 = (float) r4
            r3.setBounds(r0, r1, r2, r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = r5.getParameters(r7)
            r3.applyParameters(r4)
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto L3a
            r4 = 2
            if (r6 == r4) goto L29
            r4 = 3
            if (r6 == r4) goto L3a
            r4 = 4
            if (r6 == r4) goto L29
            goto L3f
        L29:
            float r4 = r3.rotation
            float r4 = r4 + r5
            r3.rotation = r4
            r5 = 1127481344(0x43340000, float:180.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3f
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 - r5
            r3.rotation = r4
            goto L3f
        L3a:
            float r4 = r3.rotation
            float r4 = r4 - r5
            r3.rotation = r4
        L3f:
            return
    }

    public void setState(android.view.View r5) {
            r4 = this;
            float r0 = r5.getX()
            float r1 = r5.getY()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r4.setBounds(r0, r1, r2, r3)
            r4.applyParameters(r5)
            return
    }
}
