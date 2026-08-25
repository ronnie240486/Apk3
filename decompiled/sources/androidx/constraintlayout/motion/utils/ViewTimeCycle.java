package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewTimeCycle extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
    private static final java.lang.String TAG = "ViewTimeCycle";

    /* JADX INFO: loaded from: classes2.dex */
    public static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setAlpha(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public java.lang.String mAttributeName;
        public float[] mCache;
        public android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;
        public android.util.SparseArray<float[]> mWaveProperties;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mWaveProperties = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r3, androidx.constraintlayout.widget.ConstraintAttribute r4, float r5, int r6, float r7) {
                r2 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                android.util.SparseArray<float[]> r4 = r2.mWaveProperties
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r7
                r4.append(r3, r0)
                int r3 = r2.mWaveShape
                int r3 = java.lang.Math.max(r3, r6)
                r2.mWaveShape = r3
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r18, float r19, long r20, androidx.constraintlayout.core.motion.utils.KeyCache r22) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r20
                androidx.constraintlayout.core.motion.utils.CurveFit r4 = r0.mCurveFit
                r5 = r19
                double r5 = (double) r5
                float[] r7 = r0.mTempValues
                r4.getPos(r5, r7)
                float[] r4 = r0.mTempValues
                int r5 = r4.length
                int r5 = r5 + (-2)
                r5 = r4[r5]
                int r6 = r4.length
                r7 = 1
                int r6 = r6 - r7
                r4 = r4[r6]
                long r8 = r0.last_time
                long r8 = r2 - r8
                float r6 = r0.last_cycle
                boolean r6 = java.lang.Float.isNaN(r6)
                r10 = 0
                r11 = 0
                if (r6 == 0) goto L3c
                java.lang.String r6 = r0.mAttributeName
                r12 = r22
                float r6 = r12.getFloatValue(r1, r6, r11)
                r0.last_cycle = r6
                boolean r6 = java.lang.Float.isNaN(r6)
                if (r6 == 0) goto L3c
                r0.last_cycle = r10
            L3c:
                float r6 = r0.last_cycle
                double r12 = (double) r6
                double r8 = (double) r8
                r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r8 = r8 * r14
                double r14 = (double) r5
                double r8 = r8 * r14
                double r8 = r8 + r12
                r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r8 = r8 % r12
                float r6 = (float) r8
                r0.last_cycle = r6
                r0.last_time = r2
                float r2 = r0.calcWave(r6)
                r0.mContinue = r11
                r3 = 0
            L5a:
                float[] r6 = r0.mCache
                int r8 = r6.length
                if (r3 >= r8) goto L7c
                boolean r8 = r0.mContinue
                float[] r9 = r0.mTempValues
                r12 = r9[r3]
                double r12 = (double) r12
                r14 = 0
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 == 0) goto L6e
                r12 = 1
                goto L6f
            L6e:
                r12 = 0
            L6f:
                r8 = r8 | r12
                r0.mContinue = r8
                r8 = r9[r3]
                float r8 = r8 * r2
                float r8 = r8 + r4
                r6[r3] = r8
                int r3 = r3 + 1
                goto L5a
            L7c:
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r0.mConstraintAttributeList
                java.lang.Object r2 = r2.valueAt(r11)
                androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
                float[] r3 = r0.mCache
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r2, r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L8f
                r0.mContinue = r7
            L8f:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r14.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.mTempValues = r5
                float[] r5 = new float[r1]
                r14.mCache = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class<double> r4 = double.class
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = 0
            L30:
                if (r5 >= r0) goto L7a
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r8 = r14.mConstraintAttributeList
                java.lang.Object r8 = r8.valueAt(r5)
                androidx.constraintlayout.widget.ConstraintAttribute r8 = (androidx.constraintlayout.widget.ConstraintAttribute) r8
                android.util.SparseArray<float[]> r9 = r14.mWaveProperties
                java.lang.Object r9 = r9.valueAt(r5)
                float[] r9 = (float[]) r9
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = 0
            L58:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L67
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L58
            L67:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                r7 = r4[r5]
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L30
            L7a:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setElevation(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public PathRotate() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean setPathRotate(android.view.View r7, androidx.constraintlayout.core.motion.utils.KeyCache r8, float r9, long r10, double r12, double r14) {
                r6 = this;
                r0 = r6
                r1 = r9
                r2 = r10
                r4 = r7
                r5 = r8
                float r8 = r0.get(r1, r2, r4, r5)
                double r9 = java.lang.Math.atan2(r14, r12)
                double r9 = java.lang.Math.toDegrees(r9)
                float r9 = (float) r9
                float r8 = r8 + r9
                r7.setRotation(r8)
                boolean r7 = r6.mContinue
                return r7
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.core.motion.utils.KeyCache r5) {
                r0 = this;
                boolean r1 = r0.mContinue
                return r1
        }
    }

    public static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public boolean mNoMethod;

        public ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r14, float r15, long r16, androidx.constraintlayout.core.motion.utils.KeyCache r18) {
                r13 = this;
                r7 = r13
                r0 = r14
                java.lang.String r8 = "unable to setProgress"
                java.lang.String r9 = "ViewTimeCycle"
                boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r1 == 0) goto L1d
                r8 = r0
                androidx.constraintlayout.motion.widget.MotionLayout r8 = (androidx.constraintlayout.motion.widget.MotionLayout) r8
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r0 = r1.get(r2, r3, r5, r6)
                r8.setProgress(r0)
                goto L5c
            L1d:
                boolean r1 = r7.mNoMethod
                r10 = 0
                if (r1 == 0) goto L23
                return r10
            L23:
                r1 = 0
                r2 = 1
                java.lang.Class r3 = r14.getClass()     // Catch: java.lang.NoSuchMethodException -> L37
                java.lang.String r4 = "setProgress"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L37
                java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L37
                r5[r10] = r6     // Catch: java.lang.NoSuchMethodException -> L37
                java.lang.reflect.Method r1 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L37
                goto L39
            L37:
                r7.mNoMethod = r2
            L39:
                r11 = r1
                if (r11 == 0) goto L5c
                java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L58
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r1 = r1.get(r2, r3, r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L58
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L58
                r12[r10] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L58
                r11.invoke(r14, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L58
                goto L5c
            L53:
                r0 = move-exception
                android.util.Log.e(r9, r8, r0)
                goto L5c
            L58:
                r0 = move-exception
                android.util.Log.e(r9, r8, r0)
            L5c:
                boolean r0 = r7.mContinue
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RotationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotation(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RotationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotationX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class RotationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotationY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setScaleX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setScaleY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationZ(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public ViewTimeCycle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet r0 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline(java.lang.String r2, long r3) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto L9b;
                case -1249320805: goto L8f;
                case -1225497657: goto L83;
                case -1225497656: goto L77;
                case -1225497655: goto L6b;
                case -1001078227: goto L5f;
                case -908189618: goto L53;
                case -908189617: goto L47;
                case -40300674: goto L38;
                case -4379043: goto L2a;
                case 37232917: goto L1b;
                case 92909918: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto La6
        Ld:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto La6
        L17:
            r1 = 11
            goto La6
        L1b:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L26
            goto La6
        L26:
            r1 = 10
            goto La6
        L2a:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L34
            goto La6
        L34:
            r1 = 9
            goto La6
        L38:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto La6
        L43:
            r1 = 8
            goto La6
        L47:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L51
            goto La6
        L51:
            r1 = 7
            goto La6
        L53:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            goto La6
        L5d:
            r1 = 6
            goto La6
        L5f:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L69
            goto La6
        L69:
            r1 = 5
            goto La6
        L6b:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L75
            goto La6
        L75:
            r1 = 4
            goto La6
        L77:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L81
            goto La6
        L81:
            r1 = 3
            goto La6
        L83:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L8d
            goto La6
        L8d:
            r1 = 2
            goto La6
        L8f:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L99
            goto La6
        L99:
            r1 = 1
            goto La6
        L9b:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La5
            goto La6
        La5:
            r1 = 0
        La6:
            switch(r1) {
                case 0: goto Led;
                case 1: goto Le7;
                case 2: goto Le1;
                case 3: goto Ldb;
                case 4: goto Ld5;
                case 5: goto Lcf;
                case 6: goto Lc9;
                case 7: goto Lc3;
                case 8: goto Lbd;
                case 9: goto Lb7;
                case 10: goto Lb1;
                case 11: goto Lab;
                default: goto La9;
            }
        La9:
            r2 = 0
            return r2
        Lab:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$AlphaSet
            r2.<init>()
            goto Lf2
        Lb1:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate
            r2.<init>()
            goto Lf2
        Lb7:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ElevationSet
            r2.<init>()
            goto Lf2
        Lbd:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationSet
            r2.<init>()
            goto Lf2
        Lc3:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleYset
            r2.<init>()
            goto Lf2
        Lc9:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleXset
            r2.<init>()
            goto Lf2
        Lcf:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ProgressSet
            r2.<init>()
            goto Lf2
        Ld5:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationZset
            r2.<init>()
            goto Lf2
        Ldb:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationYset
            r2.<init>()
            goto Lf2
        Le1:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationXset
            r2.<init>()
            goto Lf2
        Le7:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationYset
            r2.<init>()
            goto Lf2
        Led:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationXset
            r2.<init>()
        Lf2:
            r2.last_time = r3
            return r2
    }

    public float get(float r19, long r20, android.view.View r22, androidx.constraintlayout.core.motion.utils.KeyCache r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            androidx.constraintlayout.core.motion.utils.CurveFit r5 = r0.mCurveFit
            r6 = r19
            double r6 = (double) r6
            float[] r8 = r0.mCache
            r5.getPos(r6, r8)
            float[] r5 = r0.mCache
            r6 = 1
            r7 = r5[r6]
            r8 = 2
            r9 = 0
            r10 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L23
            r0.mContinue = r10
            r1 = r5[r8]
            return r1
        L23:
            float r5 = r0.last_cycle
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            java.lang.String r5 = r0.mType
            float r5 = r4.getFloatValue(r3, r5, r10)
            r0.last_cycle = r5
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            r0.last_cycle = r9
        L3b:
            long r12 = r0.last_time
            long r12 = r1 - r12
            float r5 = r0.last_cycle
            double r14 = (double) r5
            double r12 = (double) r12
            r16 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r16
            double r6 = (double) r7
            double r12 = r12 * r6
            double r12 = r12 + r14
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 % r5
            float r5 = (float) r12
            r0.last_cycle = r5
            java.lang.String r6 = r0.mType
            r4.setFloatValue(r3, r6, r10, r5)
            r0.last_time = r1
            float[] r1 = r0.mCache
            r1 = r1[r10]
            float r2 = r0.last_cycle
            float r2 = r0.calcWave(r2)
            float[] r3 = r0.mCache
            r3 = r3[r8]
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L75
            if (r11 == 0) goto L73
            goto L75
        L73:
            r6 = 0
            goto L76
        L75:
            r6 = 1
        L76:
            r0.mContinue = r6
            return r2
    }

    public abstract boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.core.motion.utils.KeyCache r5);
}
