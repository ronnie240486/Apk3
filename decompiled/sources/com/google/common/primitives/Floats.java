package com.google.common.primitives;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class Floats extends com.google.common.primitives.FloatsMethodsForWeb {
    public static final int BYTES = 4;

    @com.google.common.annotations.GwtCompatible
    public static class FloatArrayAsList extends java.util.AbstractList<java.lang.Float> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final float[] array;
        public final int end;
        public final int start;

        public FloatArrayAsList(float[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.array = r2
                r2 = 0
                r1.start = r2
                r1.end = r0
                return
        }

        public FloatArrayAsList(float[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                r0.start = r2
                r0.end = r3
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Float
                if (r0 == 0) goto L19
                float[] r0 = r3.array
                java.lang.Float r4 = (java.lang.Float) r4
                float r4 = r4.floatValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Floats.access$000(r0, r4, r1, r2)
                r0 = -1
                if (r4 == r0) goto L19
                r4 = 1
                goto L1a
            L19:
                r4 = 0
            L1a:
                return r4
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.common.primitives.Floats.FloatArrayAsList
                if (r1 == 0) goto L30
                com.google.common.primitives.Floats$FloatArrayAsList r8 = (com.google.common.primitives.Floats.FloatArrayAsList) r8
                int r1 = r7.size()
                int r2 = r8.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2f
                float[] r4 = r7.array
                int r5 = r7.start
                int r5 = r5 + r2
                r4 = r4[r5]
                float[] r5 = r8.array
                int r6 = r8.start
                int r6 = r6 + r2
                r5 = r5[r6]
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 == 0) goto L2c
                return r3
            L2c:
                int r2 = r2 + 1
                goto L17
            L2f:
                return r0
            L30:
                boolean r8 = super.equals(r8)
                return r8
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Float get(int r3) {
                r2 = this;
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                float[] r0 = r2.array
                int r1 = r2.start
                int r1 = r1 + r3
                r3 = r0[r1]
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Float r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r3 = this;
                int r0 = r3.start
                r1 = 1
            L3:
                int r2 = r3.end
                if (r0 >= r2) goto L15
                int r1 = r1 * 31
                float[] r2 = r3.array
                r2 = r2[r0]
                int r2 = com.google.common.primitives.Floats.hashCode(r2)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L15:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Float
                if (r0 == 0) goto L1a
                float[] r0 = r3.array
                java.lang.Float r4 = (java.lang.Float) r4
                float r4 = r4.floatValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Floats.access$000(r0, r4, r1, r2)
                if (r4 < 0) goto L1a
                int r0 = r3.start
                int r4 = r4 - r0
                return r4
            L1a:
                r4 = -1
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Float
                if (r0 == 0) goto L1a
                float[] r0 = r3.array
                java.lang.Float r4 = (java.lang.Float) r4
                float r4 = r4.floatValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Floats.access$100(r0, r4, r1, r2)
                if (r4 < 0) goto L1a
                int r0 = r3.start
                int r4 = r4 - r0
                return r4
            L1a:
                r4 = -1
                return r4
        }

        public java.lang.Float set(int r4, java.lang.Float r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                float[] r0 = r3.array
                int r1 = r3.start
                int r2 = r1 + r4
                r2 = r0[r2]
                int r1 = r1 + r4
                java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.Float r4 = (java.lang.Float) r4
                float r4 = r4.floatValue()
                r0[r1] = r4
                java.lang.Float r4 = java.lang.Float.valueOf(r2)
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Float r2 = (java.lang.Float) r2
                java.lang.Float r1 = r0.set(r1, r2)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Float> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                com.google.common.primitives.Floats$FloatArrayAsList r0 = new com.google.common.primitives.Floats$FloatArrayAsList
                float[] r1 = r3.array
                int r2 = r3.start
                int r4 = r4 + r2
                int r2 = r2 + r5
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.size()
                int r1 = r1 * 12
                r0.<init>(r1)
                r1 = 91
                r0.append(r1)
                float[] r1 = r3.array
                int r2 = r3.start
                r1 = r1[r2]
                r0.append(r1)
                int r1 = r3.start
            L1b:
                int r1 = r1 + 1
                int r2 = r3.end
                if (r1 >= r2) goto L2e
                java.lang.String r2 = ", "
                r0.append(r2)
                float[] r2 = r3.array
                r2 = r2[r1]
                r0.append(r2)
                goto L1b
            L2e:
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class FloatConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Float> implements java.io.Serializable {
        public static final com.google.common.primitives.Floats.FloatConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
                com.google.common.primitives.Floats$FloatConverter r0 = new com.google.common.primitives.Floats$FloatConverter
                r0.<init>()
                com.google.common.primitives.Floats.FloatConverter.INSTANCE = r0
                return
        }

        private FloatConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.primitives.Floats$FloatConverter r0 = com.google.common.primitives.Floats.FloatConverter.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Float r1) {
                r0 = this;
                java.lang.Float r1 = (java.lang.Float) r1
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.Converter
        public final java.lang.Float doForward(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Floats.stringConverter()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.Floats.LexicographicalComparator> implements java.util.Comparator<float[]> {
        private static final /* synthetic */ com.google.common.primitives.Floats.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.Floats.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.Floats.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.Floats$LexicographicalComparator[] r0 = new com.google.common.primitives.Floats.LexicographicalComparator[r0]
                com.google.common.primitives.Floats$LexicographicalComparator r1 = com.google.common.primitives.Floats.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.Floats$LexicographicalComparator r0 = new com.google.common.primitives.Floats$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.Floats.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.Floats$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.Floats.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.Floats.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.Floats$LexicographicalComparator> r0 = com.google.common.primitives.Floats.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.Floats$LexicographicalComparator r1 = (com.google.common.primitives.Floats.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.Floats.LexicographicalComparator[] values() {
                com.google.common.primitives.Floats$LexicographicalComparator[] r0 = com.google.common.primitives.Floats.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.Floats$LexicographicalComparator[] r0 = (com.google.common.primitives.Floats.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(float[] r1, float[] r2) {
                r0 = this;
                float[] r1 = (float[]) r1
                float[] r2 = (float[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(float[] r5, float[] r6) {
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r5[r1]
                r3 = r6[r1]
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 == 0) goto L14
                return r2
            L14:
                int r1 = r1 + 1
                goto L7
            L17:
                int r5 = r5.length
                int r6 = r6.length
                int r5 = r5 - r6
                return r5
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Floats.lexicographicalComparator()"
                return r0
        }
    }

    private Floats() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$000(float[] r0, float r1, int r2, int r3) {
            int r0 = indexOf(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$100(float[] r0, float r1, int r2, int r3) {
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.Float> asList(float... r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L8:
            com.google.common.primitives.Floats$FloatArrayAsList r0 = new com.google.common.primitives.Floats$FloatArrayAsList
            r0.<init>(r1)
            return r0
    }

    public static int compare(float r0, float r1) {
            int r0 = java.lang.Float.compare(r0, r1)
            return r0
    }

    public static float[] concat(float[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            float[] r0 = new float[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L1f
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L12
        L1f:
            return r0
    }

    @com.google.common.annotations.Beta
    public static float constrainToRange(float r2, float r3, float r4) {
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto Ld
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = java.lang.Math.min(r2, r4)
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r1] = r3
            r3 = 1
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "min (%s) must be less than or equal to max (%s)"
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    public static boolean contains(float[] r4, float r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L10
            r3 = r4[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Ld
            r4 = 1
            return r4
        Ld:
            int r2 = r2 + 1
            goto L3
        L10:
            return r1
    }

    public static float[] ensureCapacity(float[] r4, int r5, int r6) {
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Invalid minLength: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r5)
            if (r6 < 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "Invalid padding: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            int r0 = r4.length
            if (r0 >= r5) goto L1d
            int r5 = r5 + r6
            float[] r4 = java.util.Arrays.copyOf(r4, r5)
        L1d:
            return r4
    }

    public static int hashCode(float r0) {
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public static int indexOf(float[] r2, float r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = indexOf(r2, r3, r1, r0)
            return r2
    }

    private static int indexOf(float[] r1, float r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto Lc
            r0 = r1[r3]
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return r3
        L9:
            int r3 = r3 + 1
            goto L0
        Lc:
            r1 = -1
            return r1
    }

    public static int indexOf(float[] r5, float[] r6) {
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r0 = 0
        L11:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2d
            r2 = 0
        L19:
            int r3 = r6.length
            if (r2 >= r3) goto L2c
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L29
            int r0 = r0 + 1
            goto L11
        L29:
            int r2 = r2 + 1
            goto L19
        L2c:
            return r0
        L2d:
            r5 = -1
            return r5
    }

    public static boolean isFinite(float r1) {
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static java.lang.String join(java.lang.String r3, float... r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r4.length
            if (r0 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 12
            r0.<init>(r1)
            r1 = 0
            r1 = r4[r1]
            r0.append(r1)
            r1 = 1
        L18:
            int r2 = r4.length
            if (r1 >= r2) goto L26
            r0.append(r3)
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static int lastIndexOf(float[] r2, float r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = lastIndexOf(r2, r3, r1, r0)
            return r2
    }

    private static int lastIndexOf(float[] r1, float r2, int r3, int r4) {
            int r4 = r4 + (-1)
        L2:
            if (r4 < r3) goto Le
            r0 = r1[r4]
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r4
        Lb:
            int r4 = r4 + (-1)
            goto L2
        Le:
            r1 = -1
            return r1
    }

    public static java.util.Comparator<float[]> lexicographicalComparator() {
            com.google.common.primitives.Floats$LexicographicalComparator r0 = com.google.common.primitives.Floats.LexicographicalComparator.INSTANCE
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
        Ld:
            int r1 = r3.length
            if (r2 >= r1) goto L19
            r1 = r3[r2]
            float r0 = java.lang.Math.max(r0, r1)
            int r2 = r2 + 1
            goto Ld
        L19:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
        Ld:
            int r1 = r3.length
            if (r2 >= r1) goto L19
            r1 = r3[r2]
            float r0 = java.lang.Math.min(r0, r1)
            int r2 = r2 + 1
            goto Ld
        L19:
            return r0
    }

    public static void reverse(float[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            reverse(r2, r1, r0)
            return
    }

    public static void reverse(float[] r2, int r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            int r4 = r4 + (-1)
        L9:
            if (r3 >= r4) goto L18
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L9
        L18:
            return
    }

    public static void sortDescending(float[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(float[] r1, int r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            int r0 = r1.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
            java.util.Arrays.sort(r1, r2, r3)
            reverse(r1, r2, r3)
            return
    }

    @com.google.common.annotations.Beta
    public static com.google.common.base.Converter<java.lang.String, java.lang.Float> stringConverter() {
            com.google.common.primitives.Floats$FloatConverter r0 = com.google.common.primitives.Floats.FloatConverter.INSTANCE
            return r0
    }

    public static float[] toArray(java.util.Collection<? extends java.lang.Number> r4) {
            boolean r0 = r4 instanceof com.google.common.primitives.Floats.FloatArrayAsList
            if (r0 == 0) goto L11
            com.google.common.primitives.Floats$FloatArrayAsList r4 = (com.google.common.primitives.Floats.FloatArrayAsList) r4
            float[] r0 = r4.array
            int r1 = r4.start
            int r4 = r4.end
            float[] r4 = java.util.Arrays.copyOfRange(r0, r1, r4)
            return r4
        L11:
            java.lang.Object[] r4 = r4.toArray()
            int r0 = r4.length
            float[] r1 = new float[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2c
            r3 = r4[r2]
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            return r1
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    public static java.lang.Float tryParse(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.google.common.primitives.Doubles.FLOATING_POINT_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L15
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L15
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L15
            return r1
        L15:
            r1 = 0
            return r1
    }
}
