package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    private static final java.lang.String TAG = "SplineSet";
    public int count;
    public float last_cycle;
    public long last_time;
    public float[] mCache;
    public boolean mContinue;
    public androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    public int[] mTimePoints;
    public java.lang.String mType;
    public float[][] mValues;
    public int mWaveShape;

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        public java.lang.String mAttributeName;
        public float[] mCache;
        public androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray mConstraintAttributeList;
        public float[] mTempValues;
        public androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties;

        public CustomSet(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray r3) {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r0 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray
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

        public void setPoint(int r3, androidx.constraintlayout.core.motion.CustomAttribute r4, float r5, int r6, float r7) {
                r2 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r4 = r2.mWaveProperties
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

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget r18, float r19, long r20, androidx.constraintlayout.core.motion.utils.KeyCache r22) {
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
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r2 = r0.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomAttribute r2 = r2.valueAt(r11)
                float[] r3 = r0.mCache
                r1.setInterpolatedValue(r2, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L8d
                r0.mContinue = r7
            L8d:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r1 = r14.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomAttribute r1 = r1.valueAt(r2)
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
            L2e:
                if (r5 >= r0) goto L74
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r8 = r14.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomAttribute r8 = r8.valueAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r9 = r14.mWaveProperties
                float[] r9 = r9.valueAt(r5)
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = 0
            L52:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L61
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L52
            L61:
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
                goto L2e
            L74:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    public static class CustomVarSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        public java.lang.String mAttributeName;
        public float[] mCache;
        public androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar mConstraintAttributeList;
        public float[] mTempValues;
        public androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties;

        public CustomVarSet(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar r3) {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r0 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray
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

        public void setPoint(int r3, androidx.constraintlayout.core.motion.CustomVariable r4, float r5, int r6, float r7) {
                r2 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r4 = r2.mWaveProperties
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

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget r18, float r19, long r20, androidx.constraintlayout.core.motion.utils.KeyCache r22) {
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
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r2 = r0.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomVariable r2 = r2.valueAt(r11)
                float[] r3 = r0.mCache
                r2.setInterpolatedValue(r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L8d
                r0.mContinue = r7
            L8d:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r1 = r14.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomVariable r1 = r1.valueAt(r2)
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
            L2e:
                if (r5 >= r0) goto L74
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r8 = r14.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomVariable r8 = r8.valueAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r9 = r14.mWaveProperties
                float[] r9 = r9.valueAt(r5)
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = 0
            L52:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L61
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L52
            L61:
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
                goto L2e
            L74:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Sort {
        public Sort() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void doubleQuickSort(int[] r7, float[][] r8, int r9) {
                int r0 = r7.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r9
                r9 = 1
                r0[r9] = r1
                r1 = 2
            Lc:
                if (r1 <= 0) goto L30
                int r1 = r1 + (-1)
                r2 = r0[r1]
                int r1 = r1 + (-1)
                r3 = r0[r1]
                if (r2 >= r3) goto Lc
                int r4 = partition(r7, r8, r2, r3)
                int r5 = r1 + 1
                int r6 = r4 + (-1)
                r0[r1] = r6
                int r1 = r5 + 1
                r0[r5] = r2
                int r2 = r1 + 1
                r0[r1] = r3
                int r1 = r2 + 1
                int r4 = r4 + r9
                r0[r2] = r4
                goto Lc
            L30:
                return
        }

        private static int partition(int[] r3, float[][] r4, int r5, int r6) {
                r0 = r3[r6]
                r1 = r5
            L3:
                if (r5 >= r6) goto L11
                r2 = r3[r5]
                if (r2 > r0) goto Le
                swap(r3, r4, r1, r5)
                int r1 = r1 + 1
            Le:
                int r5 = r5 + 1
                goto L3
            L11:
                swap(r3, r4, r1, r6)
                return r1
        }

        private static void swap(int[] r2, float[][] r3, int r4, int r5) {
                r0 = r2[r4]
                r1 = r2[r5]
                r2[r4] = r1
                r2[r5] = r0
                r2 = r3[r4]
                r0 = r3[r5]
                r3[r4] = r0
                r3[r5] = r2
                return
        }
    }

    public TimeCycleSplineSet() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mWaveShape = r0
            r1 = 10
            int[] r1 = new int[r1]
            r3.mTimePoints = r1
            r1 = 2
            int[] r1 = new int[r1]
            r1 = {x0028: FILL_ARRAY_DATA , data: [10, 3} // fill-array
            java.lang.Class<float> r2 = float.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            float[][] r1 = (float[][]) r1
            r3.mValues = r1
            r1 = 3
            float[] r1 = new float[r1]
            r3.mCache = r1
            r3.mContinue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.last_cycle = r0
            return
    }

    public final float calcWave(float r5) {
            r4 = this;
            int r0 = r4.mWaveShape
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L25;
                case 6: goto L15;
                default: goto Lc;
            }
        Lc:
            float r5 = r5 * r1
            double r0 = (double) r5
            double r0 = java.lang.Math.sin(r0)
            float r5 = (float) r0
            return r5
        L15:
            r0 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 * r0
            float r5 = r5 % r0
            float r5 = r5 - r2
            float r5 = java.lang.Math.abs(r5)
            float r5 = r3 - r5
            float r5 = r5 * r5
        L23:
            float r3 = r3 - r5
            return r3
        L25:
            float r5 = r5 * r1
            double r0 = (double) r5
            double r0 = java.lang.Math.cos(r0)
            float r5 = (float) r0
            return r5
        L2e:
            float r5 = r5 * r2
            float r5 = r5 + r3
            float r5 = r5 % r2
            goto L23
        L33:
            float r5 = r5 * r2
            float r5 = r5 + r3
            float r5 = r5 % r2
            float r5 = r5 - r3
            return r5
        L39:
            float r5 = java.lang.Math.abs(r5)
            goto L23
        L3e:
            float r5 = r5 * r1
            float r5 = java.lang.Math.signum(r5)
            return r5
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public void setPoint(int r4, float r5, float r6, int r7, float r8) {
            r3 = this;
            int[] r0 = r3.mTimePoints
            int r1 = r3.count
            r0[r1] = r4
            float[][] r4 = r3.mValues
            r0 = r4[r1]
            r2 = 0
            r0[r2] = r5
            r5 = r4[r1]
            r0 = 1
            r5[r0] = r6
            r4 = r4[r1]
            r5 = 2
            r4[r5] = r8
            int r4 = r3.mWaveShape
            int r4 = java.lang.Math.max(r4, r7)
            r3.mWaveShape = r4
            int r4 = r3.count
            int r4 = r4 + r0
            r3.count = r4
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(int r12) {
            r11 = this;
            int r0 = r11.count
            if (r0 != 0) goto L19
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.String r0 = "Error no points added to "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r11.mType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L19:
            int[] r1 = r11.mTimePoints
            float[][] r2 = r11.mValues
            r3 = 1
            int r0 = r0 - r3
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort.doubleQuickSort(r1, r2, r0)
            r0 = 0
            r1 = 1
            r2 = 0
        L25:
            int[] r4 = r11.mTimePoints
            int r5 = r4.length
            if (r1 >= r5) goto L37
            r5 = r4[r1]
            int r6 = r1 + (-1)
            r4 = r4[r6]
            if (r5 == r4) goto L34
            int r2 = r2 + 1
        L34:
            int r1 = r1 + 1
            goto L25
        L37:
            if (r2 != 0) goto L3a
            r2 = 1
        L3a:
            double[] r1 = new double[r2]
            r4 = 3
            r5 = 2
            int[] r6 = new int[r5]
            r6[r3] = r4
            r6[r0] = r2
            java.lang.Class<double> r2 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r6)
            double[][] r2 = (double[][]) r2
            r4 = 0
            r6 = 0
        L4e:
            int r7 = r11.count
            if (r4 >= r7) goto L8f
            if (r4 <= 0) goto L5f
            int[] r7 = r11.mTimePoints
            r8 = r7[r4]
            int r9 = r4 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L5f
            goto L8c
        L5f:
            int[] r7 = r11.mTimePoints
            r7 = r7[r4]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r1[r6] = r7
            r7 = r2[r6]
            float[][] r8 = r11.mValues
            r9 = r8[r4]
            r9 = r9[r0]
            double r9 = (double) r9
            r7[r0] = r9
            r7 = r2[r6]
            r9 = r8[r4]
            r9 = r9[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r7 = r2[r6]
            r8 = r8[r4]
            r8 = r8[r5]
            double r8 = (double) r8
            r7[r5] = r8
            int r6 = r6 + 1
        L8c:
            int r4 = r4 + 1
            goto L4e
        L8f:
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r1, r2)
            r11.mCurveFit = r12
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.count
            if (r2 >= r3) goto L37
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r3)
            int[] r3 = r4.mTimePoints
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float[][] r3 = r4.mValues
            r3 = r3[r2]
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L37:
            return r0
    }
}
