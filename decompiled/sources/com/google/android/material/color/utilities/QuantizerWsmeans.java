package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Distance implements java.lang.Comparable<com.google.android.material.color.utilities.QuantizerWsmeans.Distance> {
        public double distance;
        public int index;

        public Distance() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.index = r0
                r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r2.distance = r0
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r4) {
                r3 = this;
                double r0 = r3.distance
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r1 = r4.distance
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                int r4 = r0.compareTo(r4)
                return r4
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r1) {
                r0 = this;
                com.google.android.material.color.utilities.QuantizerWsmeans$Distance r1 = (com.google.android.material.color.utilities.QuantizerWsmeans.Distance) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    private QuantizerWsmeans() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] r26, int[] r27, int r28) {
            r0 = r26
            r1 = r27
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r0.length
            double[][] r3 = new double[r3][]
            int r4 = r0.length
            int[] r4 = new int[r4]
            com.google.android.material.color.utilities.PointProviderLab r5 = new com.google.android.material.color.utilities.PointProviderLab
            r5.<init>()
            r7 = 0
            r8 = 0
        L16:
            int r9 = r0.length
            r10 = 1
            if (r7 >= r9) goto L51
            r9 = r0[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r11 = r2.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L3e
            double[] r11 = r5.fromInt(r9)
            r3[r8] = r11
            r4[r8] = r9
            int r8 = r8 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.put(r9, r10)
            goto L4e
        L3e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r11 = r11.intValue()
            int r11 = r11 + r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r2.put(r9, r10)
        L4e:
            int r7 = r7 + 1
            goto L16
        L51:
            int[] r0 = new int[r8]
            r7 = 0
        L54:
            if (r7 >= r8) goto L6b
            r9 = r4[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r2.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0[r7] = r9
            int r7 = r7 + 1
            goto L54
        L6b:
            r7 = r28
            int r2 = java.lang.Math.min(r7, r8)
            int r4 = r1.length
            if (r4 == 0) goto L79
            int r4 = r1.length
            int r2 = java.lang.Math.min(r2, r4)
        L79:
            double[][] r4 = new double[r2][]
            r7 = 0
            r9 = 0
        L7d:
            int r11 = r1.length
            if (r7 >= r11) goto L8d
            r11 = r1[r7]
            double[] r11 = r5.fromInt(r11)
            r4[r7] = r11
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L7d
        L8d:
            int r1 = r2 - r9
            if (r1 <= 0) goto L97
            r7 = 0
        L92:
            if (r7 >= r1) goto L97
            int r7 = r7 + 1
            goto L92
        L97:
            int[] r1 = new int[r8]
            r7 = 0
        L9a:
            if (r7 >= r8) goto Lad
            double r11 = java.lang.Math.random()
            double r13 = (double) r2
            double r11 = r11 * r13
            double r11 = java.lang.Math.floor(r11)
            int r9 = (int) r11
            r1[r7] = r9
            int r7 = r7 + 1
            goto L9a
        Lad:
            int[][] r7 = new int[r2][]
            r9 = 0
        Lb0:
            if (r9 >= r2) goto Lb9
            int[] r11 = new int[r2]
            r7[r9] = r11
            int r9 = r9 + 1
            goto Lb0
        Lb9:
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[][] r9 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r2][]
            r11 = 0
        Lbc:
            if (r11 >= r2) goto Ld4
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[] r12 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r2]
            r9[r11] = r12
            r12 = 0
        Lc3:
            if (r12 >= r2) goto Ld1
            r13 = r9[r11]
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance r14 = new com.google.android.material.color.utilities.QuantizerWsmeans$Distance
            r14.<init>()
            r13[r12] = r14
            int r12 = r12 + 1
            goto Lc3
        Ld1:
            int r11 = r11 + 1
            goto Lbc
        Ld4:
            int[] r11 = new int[r2]
            r12 = 0
        Ld7:
            r13 = 10
            if (r12 >= r13) goto L22c
            r13 = 0
        Ldc:
            if (r13 >= r2) goto L127
            int r14 = r13 + 1
            r15 = r14
        Le1:
            if (r15 >= r2) goto L10b
            r10 = r4[r13]
            r6 = r4[r15]
            r26 = r11
            double r10 = r5.distance(r10, r6)
            r6 = r9[r15]
            r6 = r6[r13]
            r6.distance = r10
            r6 = r9[r15]
            r6 = r6[r13]
            r6.index = r13
            r6 = r9[r13]
            r6 = r6[r15]
            r6.distance = r10
            r6 = r9[r13]
            r6 = r6[r15]
            r6.index = r15
            int r15 = r15 + 1
            r11 = r26
            r10 = 1
            goto Le1
        L10b:
            r26 = r11
            r6 = r9[r13]
            java.util.Arrays.sort(r6)
            r6 = 0
        L113:
            if (r6 >= r2) goto L122
            r10 = r7[r13]
            r11 = r9[r13]
            r11 = r11[r6]
            int r11 = r11.index
            r10[r6] = r11
            int r6 = r6 + 1
            goto L113
        L122:
            r10 = 1
            r11 = r26
            r13 = r14
            goto Ldc
        L127:
            r26 = r11
            r6 = 0
            r10 = 0
        L12b:
            if (r6 >= r8) goto L191
            r11 = r3[r6]
            r13 = r1[r6]
            r14 = r4[r13]
            double r14 = r5.distance(r11, r14)
            r27 = r7
            r18 = r0
            r19 = r14
            r0 = -1
            r7 = 0
        L13f:
            if (r7 >= r2) goto L168
            r21 = r9[r13]
            r22 = r9
            r9 = r21[r7]
            r21 = r8
            double r8 = r9.distance
            r23 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r23 = r23 * r14
            int r25 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r25 < 0) goto L154
            goto L161
        L154:
            r8 = r4[r7]
            double r8 = r5.distance(r11, r8)
            int r23 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r23 >= 0) goto L161
            r0 = r7
            r19 = r8
        L161:
            int r7 = r7 + 1
            r8 = r21
            r9 = r22
            goto L13f
        L168:
            r21 = r8
            r22 = r9
            r7 = -1
            if (r0 == r7) goto L186
            double r7 = java.lang.Math.sqrt(r19)
            double r13 = java.lang.Math.sqrt(r14)
            double r7 = r7 - r13
            double r7 = java.lang.Math.abs(r7)
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 <= 0) goto L186
            int r10 = r10 + 1
            r1[r6] = r0
        L186:
            int r6 = r6 + 1
            r7 = r27
            r0 = r18
            r8 = r21
            r9 = r22
            goto L12b
        L191:
            r18 = r0
            r27 = r7
            r21 = r8
            r22 = r9
            if (r10 != 0) goto L1a2
            if (r12 == 0) goto L1a2
            r12 = 0
            r9 = r26
            goto L22e
        L1a2:
            double[] r0 = new double[r2]
            double[] r6 = new double[r2]
            double[] r7 = new double[r2]
            r9 = r26
            r8 = 0
            java.util.Arrays.fill(r9, r8)
            r10 = 0
        L1af:
            r13 = r21
            if (r10 >= r13) goto L1ea
            r14 = r1[r10]
            r15 = r3[r10]
            r11 = r18[r10]
            r17 = r9[r14]
            int r17 = r17 + r11
            r9[r14] = r17
            r19 = r0[r14]
            r23 = r15[r8]
            r8 = r12
            double r11 = (double) r11
            double r23 = r23 * r11
            double r23 = r23 + r19
            r0[r14] = r23
            r19 = r6[r14]
            r16 = 1
            r23 = r15[r16]
            double r23 = r23 * r11
            double r23 = r23 + r19
            r6[r14] = r23
            r19 = r7[r14]
            r21 = 2
            r23 = r15[r21]
            double r23 = r23 * r11
            double r23 = r23 + r19
            r7[r14] = r23
            int r10 = r10 + 1
            r12 = r8
            r21 = r13
            r8 = 0
            goto L1af
        L1ea:
            r8 = r12
            r10 = 0
        L1ec:
            if (r10 >= r2) goto L21c
            r11 = r9[r10]
            if (r11 != 0) goto L1fe
            r11 = 3
            double[] r11 = new double[r11]
            r11 = {x025c: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            r4[r10] = r11
            r12 = 0
            r14 = 1
            r15 = 2
            goto L219
        L1fe:
            r14 = r0[r10]
            double r11 = (double) r11
            double r14 = r14 / r11
            r19 = r6[r10]
            double r19 = r19 / r11
            r23 = r7[r10]
            double r23 = r23 / r11
            r11 = r4[r10]
            r12 = 0
            r11[r12] = r14
            r11 = r4[r10]
            r14 = 1
            r11[r14] = r19
            r11 = r4[r10]
            r15 = 2
            r11[r15] = r23
        L219:
            int r10 = r10 + 1
            goto L1ec
        L21c:
            r12 = 0
            r14 = 1
            int r0 = r8 + 1
            r7 = r27
            r12 = r0
            r11 = r9
            r8 = r13
            r0 = r18
            r9 = r22
            r10 = 1
            goto Ld7
        L22c:
            r9 = r11
            r12 = 0
        L22e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6 = 0
        L234:
            if (r6 >= r2) goto L25a
            r1 = r9[r6]
            if (r1 != 0) goto L23b
            goto L257
        L23b:
            r3 = r4[r6]
            int r3 = r5.toInt(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L24c
            goto L257
        L24c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
        L257:
            int r6 = r6 + 1
            goto L234
        L25a:
            return r0
    }
}
