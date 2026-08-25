package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu implements com.google.android.material.color.utilities.Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    public com.google.android.material.color.utilities.QuantizerWu.Box[] cubes;
    public double[] moments;
    public int[] momentsB;
    public int[] momentsG;
    public int[] momentsR;
    public int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static final class Box {
        public int b0;
        public int b1;
        public int g0;
        public int g1;
        public int r0;
        public int r1;
        public int vol;

        private Box() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.r0 = r0
                r1.r1 = r0
                r1.g0 = r0
                r1.g1 = r0
                r1.b0 = r0
                r1.b1 = r0
                r1.vol = r0
                return
        }

        public /* synthetic */ Box(com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CreateBoxesResult {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum Direction extends java.lang.Enum<com.google.android.material.color.utilities.QuantizerWu.Direction> {
        private static final /* synthetic */ com.google.android.material.color.utilities.QuantizerWu.Direction[] $VALUES = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction BLUE = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction GREEN = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction RED = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction r0 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r1 = "RED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.color.utilities.QuantizerWu.Direction.RED = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r3 = "GREEN"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN = r1
                com.google.android.material.color.utilities.QuantizerWu$Direction r3 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r5 = "BLUE"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE = r3
                r5 = 3
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r5 = new com.google.android.material.color.utilities.QuantizerWu.Direction[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES = r5
                return
        }

        private Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.color.utilities.QuantizerWu$Direction> r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = (com.google.android.material.color.utilities.QuantizerWu.Direction) r1
                return r1
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction[] values() {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = (com.google.android.material.color.utilities.QuantizerWu.Direction[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class MaximizeResult {
        public int cutLocation;
        public double maximum;

        public MaximizeResult(int r1, double r2) {
                r0 = this;
                r0.<init>()
                r0.cutLocation = r1
                r0.maximum = r2
                return
        }
    }

    public QuantizerWu() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int bottom(com.google.android.material.color.utilities.QuantizerWu.Box r3, com.google.android.material.color.utilities.QuantizerWu.Direction r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L91
            r1 = 2
            if (r0 == r1) goto L5d
            r1 = 3
            if (r0 != r1) goto L46
            int r4 = r3.r1
            int r0 = r3.g1
            int r1 = r3.b0
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto Lc4
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "unexpected direction "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L5d:
            int r4 = r3.r1
            int r0 = r3.g0
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto Lc4
        L91:
            int r4 = r3.r0
            int r0 = r3.g1
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r0
            int r1 = r3.g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
        Lc4:
            int r4 = r4 - r3
            return r4
    }

    public static int getIndex(int r2, int r3, int r4) {
            int r0 = r2 << 10
            int r1 = r2 << 6
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r2 = r3 << 5
            int r0 = r0 + r2
            int r0 = r0 + r3
            int r0 = r0 + r4
            return r0
    }

    public static int top(com.google.android.material.color.utilities.QuantizerWu.Box r2, com.google.android.material.color.utilities.QuantizerWu.Direction r3, int r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L7e
            r1 = 2
            if (r0 == r1) goto L53
            r1 = 3
            if (r0 != r1) goto L3c
            int r3 = r2.r1
            int r0 = r2.g1
            int r3 = getIndex(r3, r0, r4)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.g0
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r1 = r2.g1
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r2 = r2.g0
            int r2 = getIndex(r0, r2, r4)
            r2 = r5[r2]
            goto La8
        L3c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unexpected direction "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L53:
            int r3 = r2.r1
            int r0 = r2.b1
            int r3 = getIndex(r3, r4, r0)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.b0
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r1 = r2.b1
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r2 = r2.b0
            int r2 = getIndex(r0, r4, r2)
            r2 = r5[r2]
            goto La8
        L7e:
            int r3 = r2.g1
            int r0 = r2.b1
            int r3 = getIndex(r4, r3, r0)
            r3 = r5[r3]
            int r0 = r2.g1
            int r1 = r2.b0
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r1 = r2.b1
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r2 = r2.b0
            int r2 = getIndex(r4, r0, r2)
            r2 = r5[r2]
        La8:
            int r3 = r3 + r2
            return r3
    }

    public static int volume(com.google.android.material.color.utilities.QuantizerWu.Box r4, int[] r5) {
            int r0 = r4.r1
            int r1 = r4.g1
            int r2 = r4.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r1 = r4.r1
            int r2 = r4.g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g1
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r0
            int r2 = r4.g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g0
            int r4 = r4.b0
            int r4 = getIndex(r1, r2, r4)
            r4 = r5[r4]
            int r0 = r0 - r4
            return r0
    }

    public final com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize(com.google.android.material.color.utilities.QuantizerWu.Box r19, com.google.android.material.color.utilities.QuantizerWu.Direction r20, int r21, int r22, int r23, int r24, int r25, int r26) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int[] r3 = r0.momentsR
            int r3 = bottom(r1, r2, r3)
            int[] r4 = r0.momentsG
            int r4 = bottom(r1, r2, r4)
            int[] r5 = r0.momentsB
            int r5 = bottom(r1, r2, r5)
            int[] r6 = r0.weights
            int r6 = bottom(r1, r2, r6)
            r7 = 0
            r9 = -1
            r11 = r22
            r8 = r7
            r10 = -1
            r7 = r21
        L27:
            if (r7 >= r11) goto L81
            int[] r12 = r0.momentsR
            int r12 = top(r1, r2, r7, r12)
            int r12 = r12 + r3
            int[] r13 = r0.momentsG
            int r13 = top(r1, r2, r7, r13)
            int r13 = r13 + r4
            int[] r14 = r0.momentsB
            int r14 = top(r1, r2, r7, r14)
            int r14 = r14 + r5
            int[] r15 = r0.weights
            int r15 = top(r1, r2, r7, r15)
            int r15 = r15 + r6
            if (r15 != 0) goto L4a
            r16 = r3
            goto L76
        L4a:
            int r16 = r12 * r12
            int r17 = r13 * r13
            int r17 = r17 + r16
            int r16 = r14 * r14
            int r0 = r16 + r17
            double r0 = (double) r0
            r16 = r3
            double r2 = (double) r15
            double r0 = r0 / r2
            int r2 = r23 - r12
            int r3 = r24 - r13
            int r12 = r25 - r14
            int r13 = r26 - r15
            if (r13 != 0) goto L64
            goto L76
        L64:
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r3 = r3 + r2
            int r12 = r12 * r12
            int r12 = r12 + r3
            double r2 = (double) r12
            double r12 = (double) r13
            double r2 = r2 / r12
            double r2 = r2 + r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L76
            r8 = r2
            r10 = r7
        L76:
            int r7 = r7 + 1
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r16
            goto L27
        L81:
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r0 = new com.google.android.material.color.utilities.QuantizerWu$MaximizeResult
            r0.<init>(r10, r8)
            return r0
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public com.google.android.material.color.utilities.QuantizerResult quantize(int[] r29, int r30) {
            r28 = this;
            r9 = r28
            r10 = r30
            com.google.android.material.color.utilities.QuantizerMap r0 = new com.google.android.material.color.utilities.QuantizerMap
            r0.<init>()
            r1 = r29
            com.google.android.material.color.utilities.QuantizerResult r0 = r0.quantize(r1, r10)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.colorToCount
            r1 = 35937(0x8c61, float:5.0358E-41)
            int[] r2 = new int[r1]
            r9.weights = r2
            int[] r2 = new int[r1]
            r9.momentsR = r2
            int[] r2 = new int[r1]
            r9.momentsG = r2
            int[] r2 = new int[r1]
            r9.momentsB = r2
            double[] r1 = new double[r1]
            r9.moments = r1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            r11 = 1
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = com.google.android.material.color.utilities.ColorUtils.redFromArgb(r2)
            int r4 = com.google.android.material.color.utilities.ColorUtils.greenFromArgb(r2)
            int r2 = com.google.android.material.color.utilities.ColorUtils.blueFromArgb(r2)
            int r5 = r3 >> 3
            int r5 = r5 + r11
            int r6 = r4 >> 3
            int r6 = r6 + r11
            int r7 = r2 >> 3
            int r7 = r7 + r11
            int r5 = getIndex(r5, r6, r7)
            int[] r6 = r9.weights
            r7 = r6[r5]
            int r7 = r7 + r1
            r6[r5] = r7
            int[] r6 = r9.momentsR
            r7 = r6[r5]
            int r8 = r3 * r1
            int r8 = r8 + r7
            r6[r5] = r8
            int[] r6 = r9.momentsG
            r7 = r6[r5]
            int r8 = r4 * r1
            int r8 = r8 + r7
            r6[r5] = r8
            int[] r6 = r9.momentsB
            r7 = r6[r5]
            int r8 = r2 * r1
            int r8 = r8 + r7
            r6[r5] = r8
            double[] r6 = r9.moments
            r7 = r6[r5]
            int r3 = r3 * r3
            int r4 = r4 * r4
            int r4 = r4 + r3
            int r2 = r2 * r2
            int r2 = r2 + r4
            int r2 = r2 * r1
            double r1 = (double) r2
            double r7 = r7 + r1
            r6[r5] = r7
            goto L30
        L9f:
            r0 = 1
        La0:
            r1 = 33
            r14 = 0
            if (r0 >= r1) goto L143
            int[] r2 = new int[r1]
            int[] r3 = new int[r1]
            int[] r4 = new int[r1]
            int[] r5 = new int[r1]
            double[] r6 = new double[r1]
            r7 = 1
        Lb0:
            if (r7 >= r1) goto L13f
            r8 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        Lbc:
            if (r8 >= r1) goto L139
            int r21 = getIndex(r0, r7, r8)
            int[] r1 = r9.weights
            r1 = r1[r21]
            int r15 = r15 + r1
            int[] r1 = r9.momentsR
            r1 = r1[r21]
            int r16 = r16 + r1
            int[] r1 = r9.momentsG
            r1 = r1[r21]
            int r17 = r17 + r1
            int[] r1 = r9.momentsB
            r1 = r1[r21]
            int r18 = r18 + r1
            double[] r1 = r9.moments
            r22 = r1[r21]
            double r19 = r19 + r22
            r1 = r2[r8]
            int r1 = r1 + r15
            r2[r8] = r1
            r1 = r3[r8]
            int r1 = r1 + r16
            r3[r8] = r1
            r1 = r4[r8]
            int r1 = r1 + r17
            r4[r8] = r1
            r1 = r5[r8]
            int r1 = r1 + r18
            r5[r8] = r1
            r22 = r6[r8]
            double r22 = r22 + r19
            r6[r8] = r22
            int r1 = r0 + (-1)
            int r1 = getIndex(r1, r7, r8)
            int[] r12 = r9.weights
            r13 = r12[r1]
            r24 = r2[r8]
            int r13 = r13 + r24
            r12[r21] = r13
            int[] r12 = r9.momentsR
            r13 = r12[r1]
            r24 = r3[r8]
            int r13 = r13 + r24
            r12[r21] = r13
            int[] r12 = r9.momentsG
            r13 = r12[r1]
            r24 = r4[r8]
            int r13 = r13 + r24
            r12[r21] = r13
            int[] r12 = r9.momentsB
            r13 = r12[r1]
            r24 = r5[r8]
            int r13 = r13 + r24
            r12[r21] = r13
            double[] r12 = r9.moments
            r24 = r12[r1]
            r26 = r6[r8]
            double r24 = r24 + r26
            r12[r21] = r24
            int r8 = r8 + 1
            r1 = 33
            goto Lbc
        L139:
            int r7 = r7 + 1
            r1 = 33
            goto Lb0
        L13f:
            int r0 = r0 + 1
            goto La0
        L143:
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = new com.google.android.material.color.utilities.QuantizerWu.Box[r10]
            r9.cubes = r0
            r0 = 0
        L148:
            if (r0 >= r10) goto L157
            com.google.android.material.color.utilities.QuantizerWu$Box[] r1 = r9.cubes
            com.google.android.material.color.utilities.QuantizerWu$Box r2 = new com.google.android.material.color.utilities.QuantizerWu$Box
            r3 = 0
            r2.<init>(r3)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L148
        L157:
            double[] r12 = new double[r10]
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = r9.cubes
            r0 = r0[r14]
            r1 = 32
            r0.r1 = r1
            r0.g1 = r1
            r0.b1 = r1
            r13 = 1
            r15 = 0
        L167:
            if (r13 >= r10) goto L2c3
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = r9.cubes
            r8 = r0[r15]
            r7 = r0[r13]
            int[] r0 = r9.momentsR
            int r16 = volume(r8, r0)
            int[] r0 = r9.momentsG
            int r17 = volume(r8, r0)
            int[] r0 = r9.momentsB
            int r18 = volume(r8, r0)
            int[] r0 = r9.weights
            int r19 = volume(r8, r0)
            com.google.android.material.color.utilities.QuantizerWu$Direction r20 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED
            int r0 = r8.r0
            int r3 = r0 + 1
            int r4 = r8.r1
            r0 = r28
            r1 = r8
            r2 = r20
            r5 = r16
            r6 = r17
            r14 = r7
            r7 = r18
            r11 = r8
            r8 = r19
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r8 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.material.color.utilities.QuantizerWu$Direction r24 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN
            int r0 = r11.g0
            r1 = 1
            int r3 = r0 + 1
            int r4 = r11.g1
            r0 = r28
            r1 = r11
            r2 = r24
            r10 = r8
            r8 = r19
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r8 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.material.color.utilities.QuantizerWu$Direction r25 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE
            int r0 = r11.b0
            r1 = 1
            int r3 = r0 + 1
            int r4 = r11.b1
            r0 = r28
            r1 = r11
            r2 = r25
            r16 = r13
            r13 = r8
            r8 = r19
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r0 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            double r1 = r10.maximum
            double r3 = r13.maximum
            double r5 = r0.maximum
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L1e4
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L1e4
            int r1 = r10.cutLocation
            if (r1 >= 0) goto L1f1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L267
        L1e4:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 < 0) goto L1ef
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L1ef
            r20 = r24
            goto L1f1
        L1ef:
            r20 = r25
        L1f1:
            int r1 = r11.r1
            r14.r1 = r1
            int r1 = r11.g1
            r14.g1 = r1
            int r1 = r11.b1
            r14.b1 = r1
            int[] r1 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r2 = r20.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L22d
            r2 = 2
            if (r1 == r2) goto L21e
            r2 = 3
            if (r1 == r2) goto L20f
            goto L23b
        L20f:
            int r0 = r0.cutLocation
            r11.b1 = r0
            int r1 = r11.r0
            r14.r0 = r1
            int r1 = r11.g0
            r14.g0 = r1
            r14.b0 = r0
            goto L23b
        L21e:
            int r0 = r13.cutLocation
            r11.g1 = r0
            int r1 = r11.r0
            r14.r0 = r1
            r14.g0 = r0
            int r0 = r11.b0
            r14.b0 = r0
            goto L23b
        L22d:
            int r0 = r10.cutLocation
            r11.r1 = r0
            r14.r0 = r0
            int r0 = r11.g0
            r14.g0 = r0
            int r0 = r11.b0
            r14.b0 = r0
        L23b:
            int r0 = r11.r1
            int r1 = r11.r0
            int r0 = r0 - r1
            int r1 = r11.g1
            int r2 = r11.g0
            int r1 = r1 - r2
            int r1 = r1 * r0
            int r0 = r11.b1
            int r2 = r11.b0
            int r0 = r0 - r2
            int r0 = r0 * r1
            r11.vol = r0
            int r0 = r14.r1
            int r1 = r14.r0
            int r0 = r0 - r1
            int r1 = r14.g1
            int r2 = r14.g0
            int r1 = r1 - r2
            int r1 = r1 * r0
            int r0 = r14.b1
            int r2 = r14.b0
            int r0 = r0 - r2
            int r0 = r0 * r1
            r14.vol = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L267:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L297
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = r9.cubes
            r1 = r0[r15]
            int r1 = r1.vol
            r2 = 1
            if (r1 <= r2) goto L27d
            r0 = r0[r15]
            double r0 = r9.variance(r0)
            goto L27f
        L27d:
            r0 = 0
        L27f:
            r12[r15] = r0
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = r9.cubes
            r1 = r0[r16]
            int r1 = r1.vol
            if (r1 <= r2) goto L290
            r0 = r0[r16]
            double r0 = r9.variance(r0)
            goto L292
        L290:
            r0 = 0
        L292:
            r12[r16] = r0
            r13 = r16
            goto L29d
        L297:
            r0 = 0
            r12[r15] = r0
            int r13 = r16 + (-1)
        L29d:
            r0 = 0
            r1 = r12[r0]
            r2 = r1
            r1 = 1
            r15 = 0
        L2a3:
            if (r1 > r13) goto L2b1
            r4 = r12[r1]
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2ae
            r2 = r12[r1]
            r15 = r1
        L2ae:
            int r1 = r1 + 1
            goto L2a3
        L2b1:
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 1
            if (r4 > 0) goto L2bb
            int r0 = r13 + 1
            goto L2c5
        L2bb:
            int r13 = r13 + 1
            r10 = r30
            r11 = 1
            r14 = 0
            goto L167
        L2c3:
            r0 = r30
        L2c5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L2cb:
            if (r2 >= r0) goto L307
            com.google.android.material.color.utilities.QuantizerWu$Box[] r3 = r9.cubes
            r3 = r3[r2]
            int[] r4 = r9.weights
            int r4 = volume(r3, r4)
            if (r4 <= 0) goto L304
            int[] r5 = r9.momentsR
            int r5 = volume(r3, r5)
            int r5 = r5 / r4
            int[] r6 = r9.momentsG
            int r6 = volume(r3, r6)
            int r6 = r6 / r4
            int[] r7 = r9.momentsB
            int r3 = volume(r3, r7)
            int r3 = r3 / r4
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        L304:
            int r2 = r2 + 1
            goto L2cb
        L307:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L310:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32d
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r4)
            goto L310
        L32d:
            com.google.android.material.color.utilities.QuantizerResult r1 = new com.google.android.material.color.utilities.QuantizerResult
            r1.<init>(r0)
            return r1
    }

    public final double variance(com.google.android.material.color.utilities.QuantizerWu.Box r10) {
            r9 = this;
            int[] r0 = r9.momentsR
            int r0 = volume(r10, r0)
            int[] r1 = r9.momentsG
            int r1 = volume(r10, r1)
            int[] r2 = r9.momentsB
            int r2 = volume(r10, r2)
            double[] r3 = r9.moments
            int r4 = r10.r1
            int r5 = r10.g1
            int r6 = r10.b1
            int r4 = getIndex(r4, r5, r6)
            r4 = r3[r4]
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g1
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r1 = r1 + r0
            int r2 = r2 * r2
            int r2 = r2 + r1
            int[] r0 = r9.weights
            int r10 = volume(r10, r0)
            double r0 = (double) r2
            double r2 = (double) r10
            double r0 = r0 / r2
            double r4 = r4 - r0
            return r4
    }
}
