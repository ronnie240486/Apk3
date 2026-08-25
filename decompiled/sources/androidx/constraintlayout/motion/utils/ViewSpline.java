package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
    private static final java.lang.String TAG = "ViewSpline";

    /* JADX INFO: loaded from: classes.dex */
    public static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        public AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        public android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r2, androidx.constraintlayout.widget.ConstraintAttribute r3) {
                r1 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mConstraintAttributeList
                r0.append(r2, r3)
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r4, float r5) {
                r3 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
                double r1 = (double) r5
                float[] r5 = r3.mTempValues
                r0.getPos(r1, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r3.mConstraintAttributeList
                r0 = 0
                java.lang.Object r5 = r5.valueAt(r0)
                androidx.constraintlayout.widget.ConstraintAttribute r5 = (androidx.constraintlayout.widget.ConstraintAttribute) r5
                float[] r0 = r3.mTempValues
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r5, r4, r0)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int r12) {
                r11 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r11.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r11.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.mTempValues = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class<double> r1 = double.class
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = 0
            L2a:
                if (r4 >= r0) goto L5c
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r11.mConstraintAttributeList
                int r5 = r5.keyAt(r4)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r6 = r11.mConstraintAttributeList
                java.lang.Object r6 = r6.valueAt(r4)
                androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.mTempValues
                r6.getValuesToInterpolate(r5)
                r5 = 0
            L4a:
                float[] r6 = r11.mTempValues
                int r7 = r6.length
                if (r5 >= r7) goto L59
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L4a
            L59:
                int r4 = r4 + 1
                goto L2a
            L5c:
                androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r3, r1)
                r11.mCurveFit = r12
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        public ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewSpline {
        public PathRotate() {
                r0 = this;
                r0.<init>()
                return
        }

        public void setPathRotate(android.view.View r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.get(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotation(r2)
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PivotXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public PivotXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PivotYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public PivotYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotY(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        public boolean mNoMethod;

        public ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r10, float r11) {
                r9 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "ViewSpline"
                boolean r2 = r10 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r2 == 0) goto L13
                androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
                float r11 = r9.get(r11)
                r10.setProgress(r11)
                goto L4a
            L13:
                boolean r2 = r9.mNoMethod
                if (r2 == 0) goto L18
                return
            L18:
                r2 = 0
                r3 = 0
                r4 = 1
                java.lang.Class r5 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.String r6 = "setProgress"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2d
                r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Method r2 = r5.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L2d
                goto L2f
            L2d:
                r9.mNoMethod = r4
            L2f:
                if (r2 == 0) goto L4a
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                float r11 = r9.get(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r4[r3] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r2.invoke(r10, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                goto L4a
            L41:
                r10 = move-exception
                android.util.Log.e(r1, r0, r10)
                goto L4a
            L46:
                r10 = move-exception
                android.util.Log.e(r1, r0, r10)
            L4a:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RotationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        public RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    public static class RotationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RotationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    public static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewSpline {
        public TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public ViewSpline() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewSpline makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r0 = new androidx.constraintlayout.motion.utils.ViewSpline$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.motion.utils.ViewSpline makeSpline(java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Ld7;
                case -1249320805: goto Lcb;
                case -1225497657: goto Lbf;
                case -1225497656: goto Lb3;
                case -1225497655: goto La7;
                case -1001078227: goto L9b;
                case -908189618: goto L8f;
                case -908189617: goto L83;
                case -797520672: goto L74;
                case -760884510: goto L65;
                case -760884509: goto L56;
                case -40300674: goto L47;
                case -4379043: goto L39;
                case 37232917: goto L2a;
                case 92909918: goto L1c;
                case 156108012: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Le2
        Ld:
            java.lang.String r0 = "waveOffset"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L18
            goto Le2
        L18:
            r1 = 15
            goto Le2
        L1c:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L26
            goto Le2
        L26:
            r1 = 14
            goto Le2
        L2a:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L35
            goto Le2
        L35:
            r1 = 13
            goto Le2
        L39:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto Le2
        L43:
            r1 = 12
            goto Le2
        L47:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L52
            goto Le2
        L52:
            r1 = 11
            goto Le2
        L56:
            java.lang.String r0 = "transformPivotY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L61
            goto Le2
        L61:
            r1 = 10
            goto Le2
        L65:
            java.lang.String r0 = "transformPivotX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L70
            goto Le2
        L70:
            r1 = 9
            goto Le2
        L74:
            java.lang.String r0 = "waveVariesBy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7f
            goto Le2
        L7f:
            r1 = 8
            goto Le2
        L83:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L8d
            goto Le2
        L8d:
            r1 = 7
            goto Le2
        L8f:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L99
            goto Le2
        L99:
            r1 = 6
            goto Le2
        L9b:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La5
            goto Le2
        La5:
            r1 = 5
            goto Le2
        La7:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb1
            goto Le2
        Lb1:
            r1 = 4
            goto Le2
        Lb3:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lbd
            goto Le2
        Lbd:
            r1 = 3
            goto Le2
        Lbf:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc9
            goto Le2
        Lc9:
            r1 = 2
            goto Le2
        Lcb:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld5
            goto Le2
        Ld5:
            r1 = 1
            goto Le2
        Ld7:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Le1
            goto Le2
        Le1:
            r1 = 0
        Le2:
            switch(r1) {
                case 0: goto L141;
                case 1: goto L13b;
                case 2: goto L135;
                case 3: goto L12f;
                case 4: goto L129;
                case 5: goto L123;
                case 6: goto L11d;
                case 7: goto L117;
                case 8: goto L111;
                case 9: goto L10b;
                case 10: goto L105;
                case 11: goto Lff;
                case 12: goto Lf9;
                case 13: goto Lf3;
                case 14: goto Led;
                case 15: goto Le7;
                default: goto Le5;
            }
        Le5:
            r2 = 0
            return r2
        Le7:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        Led:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        Lf3:
            androidx.constraintlayout.motion.utils.ViewSpline$PathRotate r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PathRotate
            r2.<init>()
            return r2
        Lf9:
            androidx.constraintlayout.motion.utils.ViewSpline$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ElevationSet
            r2.<init>()
            return r2
        Lff:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationSet
            r2.<init>()
            return r2
        L105:
            androidx.constraintlayout.motion.utils.ViewSpline$PivotYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PivotYset
            r2.<init>()
            return r2
        L10b:
            androidx.constraintlayout.motion.utils.ViewSpline$PivotXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PivotXset
            r2.<init>()
            return r2
        L111:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        L117:
            androidx.constraintlayout.motion.utils.ViewSpline$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ScaleYset
            r2.<init>()
            return r2
        L11d:
            androidx.constraintlayout.motion.utils.ViewSpline$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ScaleXset
            r2.<init>()
            return r2
        L123:
            androidx.constraintlayout.motion.utils.ViewSpline$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ProgressSet
            r2.<init>()
            return r2
        L129:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationZset
            r2.<init>()
            return r2
        L12f:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationYset
            r2.<init>()
            return r2
        L135:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationXset
            r2.<init>()
            return r2
        L13b:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationYset
            r2.<init>()
            return r2
        L141:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationXset
            r2.<init>()
            return r2
    }

    public abstract void setProperty(android.view.View r1, float r2);
}
