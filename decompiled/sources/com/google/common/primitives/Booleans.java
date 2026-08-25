package com.google.common.primitives;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class Booleans {

    @com.google.common.annotations.GwtCompatible
    public static class BooleanArrayAsList extends java.util.AbstractList<java.lang.Boolean> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final boolean[] array;
        public final int end;
        public final int start;

        public BooleanArrayAsList(boolean[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.array = r2
                r2 = 0
                r1.start = r2
                r1.end = r0
                return
        }

        public BooleanArrayAsList(boolean[] r1, int r2, int r3) {
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
                boolean r0 = r4 instanceof java.lang.Boolean
                if (r0 == 0) goto L19
                boolean[] r0 = r3.array
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Booleans.access$000(r0, r4, r1, r2)
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
                boolean r1 = r8 instanceof com.google.common.primitives.Booleans.BooleanArrayAsList
                if (r1 == 0) goto L2e
                com.google.common.primitives.Booleans$BooleanArrayAsList r8 = (com.google.common.primitives.Booleans.BooleanArrayAsList) r8
                int r1 = r7.size()
                int r2 = r8.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                boolean[] r4 = r7.array
                int r5 = r7.start
                int r5 = r5 + r2
                boolean r4 = r4[r5]
                boolean[] r5 = r8.array
                int r6 = r8.start
                int r6 = r6 + r2
                boolean r5 = r5[r6]
                if (r4 == r5) goto L2a
                return r3
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                return r0
            L2e:
                boolean r8 = super.equals(r8)
                return r8
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Boolean get(int r3) {
                r2 = this;
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                boolean[] r0 = r2.array
                int r1 = r2.start
                int r1 = r1 + r3
                boolean r3 = r0[r1]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.get(r1)
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
                boolean[] r2 = r3.array
                boolean r2 = r2[r0]
                int r2 = com.google.common.primitives.Booleans.hashCode(r2)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L15:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.Boolean
                if (r0 == 0) goto L1a
                boolean[] r0 = r3.array
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Booleans.access$000(r0, r4, r1, r2)
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
                boolean r0 = r4 instanceof java.lang.Boolean
                if (r0 == 0) goto L1a
                boolean[] r0 = r3.array
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                int r1 = r3.start
                int r2 = r3.end
                int r4 = com.google.common.primitives.Booleans.access$100(r0, r4, r1, r2)
                if (r4 < 0) goto L1a
                int r0 = r3.start
                int r4 = r4 - r0
                return r4
            L1a:
                r4 = -1
                return r4
        }

        public java.lang.Boolean set(int r4, java.lang.Boolean r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                boolean[] r0 = r3.array
                int r1 = r3.start
                int r2 = r1 + r4
                boolean r2 = r0[r2]
                int r1 = r1 + r4
                java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r0[r1] = r4
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                java.lang.Boolean r1 = r0.set(r1, r2)
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
        public java.util.List<java.lang.Boolean> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                com.google.common.primitives.Booleans$BooleanArrayAsList r0 = new com.google.common.primitives.Booleans$BooleanArrayAsList
                boolean[] r1 = r3.array
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
                int r1 = r1 * 7
                r0.<init>(r1)
                boolean[] r1 = r3.array
                int r2 = r3.start
                boolean r1 = r1[r2]
                if (r1 == 0) goto L16
                java.lang.String r1 = "[true"
                goto L18
            L16:
                java.lang.String r1 = "[false"
            L18:
                r0.append(r1)
                int r1 = r3.start
            L1d:
                int r1 = r1 + 1
                int r2 = r3.end
                if (r1 >= r2) goto L32
                boolean[] r2 = r3.array
                boolean r2 = r2[r1]
                if (r2 == 0) goto L2c
                java.lang.String r2 = ", true"
                goto L2e
            L2c:
                java.lang.String r2 = ", false"
            L2e:
                r0.append(r2)
                goto L1d
            L32:
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum BooleanComparator extends java.lang.Enum<com.google.common.primitives.Booleans.BooleanComparator> implements java.util.Comparator<java.lang.Boolean> {
        private static final /* synthetic */ com.google.common.primitives.Booleans.BooleanComparator[] $VALUES = null;
        public static final com.google.common.primitives.Booleans.BooleanComparator FALSE_FIRST = null;
        public static final com.google.common.primitives.Booleans.BooleanComparator TRUE_FIRST = null;
        private final java.lang.String toString;
        private final int trueValue;

        private static /* synthetic */ com.google.common.primitives.Booleans.BooleanComparator[] $values() {
                r0 = 2
                com.google.common.primitives.Booleans$BooleanComparator[] r0 = new com.google.common.primitives.Booleans.BooleanComparator[r0]
                com.google.common.primitives.Booleans$BooleanComparator r1 = com.google.common.primitives.Booleans.BooleanComparator.TRUE_FIRST
                r2 = 0
                r0[r2] = r1
                com.google.common.primitives.Booleans$BooleanComparator r1 = com.google.common.primitives.Booleans.BooleanComparator.FALSE_FIRST
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.Booleans$BooleanComparator r0 = new com.google.common.primitives.Booleans$BooleanComparator
                java.lang.String r1 = "TRUE_FIRST"
                r2 = 0
                r3 = 1
                java.lang.String r4 = "Booleans.trueFirst()"
                r0.<init>(r1, r2, r3, r4)
                com.google.common.primitives.Booleans.BooleanComparator.TRUE_FIRST = r0
                com.google.common.primitives.Booleans$BooleanComparator r0 = new com.google.common.primitives.Booleans$BooleanComparator
                java.lang.String r1 = "FALSE_FIRST"
                r2 = -1
                java.lang.String r4 = "Booleans.falseFirst()"
                r0.<init>(r1, r3, r2, r4)
                com.google.common.primitives.Booleans.BooleanComparator.FALSE_FIRST = r0
                com.google.common.primitives.Booleans$BooleanComparator[] r0 = $values()
                com.google.common.primitives.Booleans.BooleanComparator.$VALUES = r0
                return
        }

        private BooleanComparator(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.trueValue = r3
                r0.toString = r4
                return
        }

        public static com.google.common.primitives.Booleans.BooleanComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.Booleans$BooleanComparator> r0 = com.google.common.primitives.Booleans.BooleanComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.Booleans$BooleanComparator r1 = (com.google.common.primitives.Booleans.BooleanComparator) r1
                return r1
        }

        public static com.google.common.primitives.Booleans.BooleanComparator[] values() {
                com.google.common.primitives.Booleans$BooleanComparator[] r0 = com.google.common.primitives.Booleans.BooleanComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.Booleans$BooleanComparator[] r0 = (com.google.common.primitives.Booleans.BooleanComparator[]) r0
                return r0
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.lang.Boolean r2, java.lang.Boolean r3) {
                r1 = this;
                boolean r2 = r2.booleanValue()
                r0 = 0
                if (r2 == 0) goto La
                int r2 = r1.trueValue
                goto Lb
            La:
                r2 = 0
            Lb:
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L13
                int r0 = r1.trueValue
            L13:
                int r0 = r0 - r2
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Boolean r1, java.lang.Boolean r2) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.toString
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.Booleans.LexicographicalComparator> implements java.util.Comparator<boolean[]> {
        private static final /* synthetic */ com.google.common.primitives.Booleans.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.Booleans.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.Booleans.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.Booleans$LexicographicalComparator[] r0 = new com.google.common.primitives.Booleans.LexicographicalComparator[r0]
                com.google.common.primitives.Booleans$LexicographicalComparator r1 = com.google.common.primitives.Booleans.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.Booleans$LexicographicalComparator r0 = new com.google.common.primitives.Booleans$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.Booleans.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.Booleans$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.Booleans.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.Booleans.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.Booleans$LexicographicalComparator> r0 = com.google.common.primitives.Booleans.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.Booleans$LexicographicalComparator r1 = (com.google.common.primitives.Booleans.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.Booleans.LexicographicalComparator[] values() {
                com.google.common.primitives.Booleans$LexicographicalComparator[] r0 = com.google.common.primitives.Booleans.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.Booleans$LexicographicalComparator[] r0 = (com.google.common.primitives.Booleans.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(boolean[] r1, boolean[] r2) {
                r0 = this;
                boolean[] r1 = (boolean[]) r1
                boolean[] r2 = (boolean[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(boolean[] r5, boolean[] r6) {
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                boolean r2 = r5[r1]
                boolean r3 = r6[r1]
                int r2 = com.google.common.primitives.Booleans.compare(r2, r3)
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
                java.lang.String r0 = "Booleans.lexicographicalComparator()"
                return r0
        }
    }

    private Booleans() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$000(boolean[] r0, boolean r1, int r2, int r3) {
            int r0 = indexOf(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$100(boolean[] r0, boolean r1, int r2, int r3) {
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.Boolean> asList(boolean... r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L8:
            com.google.common.primitives.Booleans$BooleanArrayAsList r0 = new com.google.common.primitives.Booleans$BooleanArrayAsList
            r0.<init>(r1)
            return r0
    }

    public static int compare(boolean r0, boolean r1) {
            if (r0 != r1) goto L4
            r0 = 0
            goto L9
        L4:
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = -1
        L9:
            return r0
    }

    public static boolean[] concat(boolean[]... r7) {
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
            boolean[] r0 = new boolean[r3]
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

    public static boolean contains(boolean[] r4, boolean r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            boolean r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    @com.google.common.annotations.Beta
    public static int countTrue(boolean... r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r0) goto Le
            boolean r3 = r4[r1]
            if (r3 == 0) goto Lb
            int r2 = r2 + 1
        Lb:
            int r1 = r1 + 1
            goto L3
        Le:
            return r2
    }

    public static boolean[] ensureCapacity(boolean[] r4, int r5, int r6) {
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
            boolean[] r4 = java.util.Arrays.copyOf(r4, r5)
        L1d:
            return r4
    }

    @com.google.common.annotations.Beta
    public static java.util.Comparator<java.lang.Boolean> falseFirst() {
            com.google.common.primitives.Booleans$BooleanComparator r0 = com.google.common.primitives.Booleans.BooleanComparator.FALSE_FIRST
            return r0
    }

    public static int hashCode(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L7
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
        L7:
            return r0
    }

    public static int indexOf(boolean[] r2, boolean r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = indexOf(r2, r3, r1, r0)
            return r2
    }

    private static int indexOf(boolean[] r1, boolean r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            boolean r0 = r1[r3]
            if (r0 != r2) goto L7
            return r3
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r1 = -1
            return r1
    }

    public static int indexOf(boolean[] r5, boolean[] r6) {
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
            if (r0 >= r2) goto L2b
            r2 = 0
        L19:
            int r3 = r6.length
            if (r2 >= r3) goto L2a
            int r3 = r0 + r2
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
            if (r3 == r4) goto L27
            int r0 = r0 + 1
            goto L11
        L27:
            int r2 = r2 + 1
            goto L19
        L2a:
            return r0
        L2b:
            r5 = -1
            return r5
    }

    public static java.lang.String join(java.lang.String r3, boolean... r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r4.length
            if (r0 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 7
            r0.<init>(r1)
            r1 = 0
            boolean r1 = r4[r1]
            r0.append(r1)
            r1 = 1
        L18:
            int r2 = r4.length
            if (r1 >= r2) goto L26
            r0.append(r3)
            boolean r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static int lastIndexOf(boolean[] r2, boolean r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = lastIndexOf(r2, r3, r1, r0)
            return r2
    }

    private static int lastIndexOf(boolean[] r1, boolean r2, int r3, int r4) {
            int r4 = r4 + (-1)
        L2:
            if (r4 < r3) goto Lc
            boolean r0 = r1[r4]
            if (r0 != r2) goto L9
            return r4
        L9:
            int r4 = r4 + (-1)
            goto L2
        Lc:
            r1 = -1
            return r1
    }

    public static java.util.Comparator<boolean[]> lexicographicalComparator() {
            com.google.common.primitives.Booleans$LexicographicalComparator r0 = com.google.common.primitives.Booleans.LexicographicalComparator.INSTANCE
            return r0
    }

    public static void reverse(boolean[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            reverse(r2, r1, r0)
            return
    }

    public static void reverse(boolean[] r2, int r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            int r4 = r4 + (-1)
        L9:
            if (r3 >= r4) goto L18
            boolean r0 = r2[r3]
            boolean r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L9
        L18:
            return
    }

    public static boolean[] toArray(java.util.Collection<java.lang.Boolean> r4) {
            boolean r0 = r4 instanceof com.google.common.primitives.Booleans.BooleanArrayAsList
            if (r0 == 0) goto L11
            com.google.common.primitives.Booleans$BooleanArrayAsList r4 = (com.google.common.primitives.Booleans.BooleanArrayAsList) r4
            boolean[] r0 = r4.array
            int r1 = r4.start
            int r4 = r4.end
            boolean[] r4 = java.util.Arrays.copyOfRange(r0, r1, r4)
            return r4
        L11:
            java.lang.Object[] r4 = r4.toArray()
            int r0 = r4.length
            boolean[] r1 = new boolean[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2c
            r3 = r4[r2]
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.util.Comparator<java.lang.Boolean> trueFirst() {
            com.google.common.primitives.Booleans$BooleanComparator r0 = com.google.common.primitives.Booleans.BooleanComparator.TRUE_FIRST
            return r0
    }
}
