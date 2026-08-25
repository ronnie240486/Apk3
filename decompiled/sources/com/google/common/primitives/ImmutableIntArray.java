package com.google.common.primitives;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class ImmutableIntArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableIntArray EMPTY = null;
    private final int[] array;
    private final int end;
    private final transient int start;

    /* JADX INFO: renamed from: com.google.common.primitives.ImmutableIntArray$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class AsList extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableIntArray parent;

        private AsList(com.google.common.primitives.ImmutableIntArray r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public /* synthetic */ AsList(com.google.common.primitives.ImmutableIntArray r1, com.google.common.primitives.ImmutableIntArray.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                int r1 = r0.indexOf(r1)
                if (r1 < 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r6) {
                r5 = this;
                boolean r0 = r6 instanceof com.google.common.primitives.ImmutableIntArray.AsList
                if (r0 == 0) goto Lf
                com.google.common.primitives.ImmutableIntArray$AsList r6 = (com.google.common.primitives.ImmutableIntArray.AsList) r6
                com.google.common.primitives.ImmutableIntArray r0 = r5.parent
                com.google.common.primitives.ImmutableIntArray r6 = r6.parent
                boolean r6 = r0.equals(r6)
                return r6
            Lf:
                boolean r0 = r6 instanceof java.util.List
                r1 = 0
                if (r0 != 0) goto L15
                return r1
            L15:
                java.util.List r6 = (java.util.List) r6
                int r0 = r5.size()
                int r2 = r6.size()
                if (r0 == r2) goto L22
                return r1
            L22:
                com.google.common.primitives.ImmutableIntArray r0 = r5.parent
                int r0 = com.google.common.primitives.ImmutableIntArray.access$100(r0)
                java.util.Iterator r6 = r6.iterator()
            L2c:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L50
                java.lang.Object r2 = r6.next()
                boolean r3 = r2 instanceof java.lang.Integer
                if (r3 == 0) goto L4f
                com.google.common.primitives.ImmutableIntArray r3 = r5.parent
                int[] r3 = com.google.common.primitives.ImmutableIntArray.access$000(r3)
                int r4 = r0 + 1
                r0 = r3[r0]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                if (r0 == r2) goto L4d
                goto L4f
            L4d:
                r0 = r4
                goto L2c
            L4f:
                return r1
            L50:
                r6 = 1
                return r6
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer get(int r2) {
                r1 = this;
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                int r2 = r0.get(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Integer r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r1 = this;
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 == 0) goto L11
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r2 = r0.indexOf(r2)
                goto L12
            L11:
                r2 = -1
            L12:
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 == 0) goto L11
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r2 = r0.lastIndexOf(r2)
                goto L12
            L11:
                r2 = -1
            L12:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                int r0 = r0.length()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Integer> subList(int r2, int r3) {
                r1 = this;
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                com.google.common.primitives.ImmutableIntArray r2 = r0.subArray(r2, r3)
                java.util.List r2 = r2.asList()
                return r2
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r1 = this;
                com.google.common.primitives.ImmutableIntArray r0 = r1.parent
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static final class Builder {
        private int[] array;
        private int count;

        public Builder(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.count = r0
                int[] r2 = new int[r2]
                r1.array = r2
                return
        }

        private void ensureRoomFor(int r3) {
                r2 = this;
                int r0 = r2.count
                int r0 = r0 + r3
                int[] r3 = r2.array
                int r1 = r3.length
                if (r0 <= r1) goto L13
                int r1 = r3.length
                int r0 = expandedCapacity(r1, r0)
                int[] r3 = java.util.Arrays.copyOf(r3, r0)
                r2.array = r3
            L13:
                return
        }

        private static int expandedCapacity(int r1, int r2) {
                if (r2 < 0) goto L17
                int r0 = r1 >> 1
                int r1 = r1 + r0
                int r1 = r1 + 1
                if (r1 >= r2) goto L11
                int r2 = r2 + (-1)
                int r1 = java.lang.Integer.highestOneBit(r2)
                int r1 = r1 << 1
            L11:
                if (r1 >= 0) goto L16
                r1 = 2147483647(0x7fffffff, float:NaN)
            L16:
                return r1
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "cannot store more than MAX_VALUE elements"
                r1.<init>(r2)
                throw r1
        }

        public com.google.common.primitives.ImmutableIntArray.Builder add(int r4) {
                r3 = this;
                r0 = 1
                r3.ensureRoomFor(r0)
                int[] r1 = r3.array
                int r2 = r3.count
                r1[r2] = r4
                int r2 = r2 + r0
                r3.count = r2
                return r3
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(com.google.common.primitives.ImmutableIntArray r6) {
                r5 = this;
                int r0 = r6.length()
                r5.ensureRoomFor(r0)
                int[] r0 = com.google.common.primitives.ImmutableIntArray.access$000(r6)
                int r1 = com.google.common.primitives.ImmutableIntArray.access$100(r6)
                int[] r2 = r5.array
                int r3 = r5.count
                int r4 = r6.length()
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                int r0 = r5.count
                int r6 = r6.length()
                int r6 = r6 + r0
                r5.count = r6
                return r5
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(java.lang.Iterable<java.lang.Integer> r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.Collection
                if (r0 == 0) goto Lb
                java.util.Collection r2 = (java.util.Collection) r2
                com.google.common.primitives.ImmutableIntArray$Builder r2 = r1.addAll(r2)
                return r2
            Lb:
                java.util.Iterator r2 = r2.iterator()
            Lf:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L23
                java.lang.Object r0 = r2.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1.add(r0)
                goto Lf
            L23:
                return r1
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(java.util.Collection<java.lang.Integer> r5) {
                r4 = this;
                int r0 = r5.size()
                r4.ensureRoomFor(r0)
                java.util.Iterator r5 = r5.iterator()
            Lb:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r5.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int[] r1 = r4.array
                int r2 = r4.count
                int r3 = r2 + 1
                r4.count = r3
                int r0 = r0.intValue()
                r1[r2] = r0
                goto Lb
            L26:
                return r4
        }

        public com.google.common.primitives.ImmutableIntArray.Builder addAll(int[] r5) {
                r4 = this;
                int r0 = r5.length
                r4.ensureRoomFor(r0)
                int[] r0 = r4.array
                int r1 = r4.count
                int r2 = r5.length
                r3 = 0
                java.lang.System.arraycopy(r5, r3, r0, r1, r2)
                int r0 = r4.count
                int r5 = r5.length
                int r0 = r0 + r5
                r4.count = r0
                return r4
        }

        @com.google.errorprone.annotations.CheckReturnValue
        public com.google.common.primitives.ImmutableIntArray build() {
                r3 = this;
                int r0 = r3.count
                if (r0 != 0) goto L9
                com.google.common.primitives.ImmutableIntArray r0 = com.google.common.primitives.ImmutableIntArray.access$200()
                goto L12
            L9:
                com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
                int[] r1 = r3.array
                int r2 = r3.count
                r0.<init>(r1, r2)
            L12:
                return r0
        }
    }

    static {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 0
            int[] r1 = new int[r1]
            r0.<init>(r1)
            com.google.common.primitives.ImmutableIntArray.EMPTY = r0
            return
    }

    private ImmutableIntArray(int[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public /* synthetic */ ImmutableIntArray(int[] r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    private ImmutableIntArray(int[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.start = r2
            r0.end = r3
            return
    }

    public static /* synthetic */ int[] access$000(com.google.common.primitives.ImmutableIntArray r0) {
            int[] r0 = r0.array
            return r0
    }

    public static /* synthetic */ int access$100(com.google.common.primitives.ImmutableIntArray r0) {
            int r0 = r0.start
            return r0
    }

    public static /* synthetic */ com.google.common.primitives.ImmutableIntArray access$200() {
            com.google.common.primitives.ImmutableIntArray r0 = com.google.common.primitives.ImmutableIntArray.EMPTY
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder() {
            com.google.common.primitives.ImmutableIntArray$Builder r0 = new com.google.common.primitives.ImmutableIntArray$Builder
            r1 = 10
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray.Builder builder(int r2) {
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Invalid initialCapacity: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            com.google.common.primitives.ImmutableIntArray$Builder r0 = new com.google.common.primitives.ImmutableIntArray$Builder
            r0.<init>(r2)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.lang.Iterable<java.lang.Integer> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.common.primitives.ImmutableIntArray r1 = copyOf(r1)
            return r1
        Lb:
            com.google.common.primitives.ImmutableIntArray$Builder r0 = builder()
            com.google.common.primitives.ImmutableIntArray$Builder r1 = r0.addAll(r1)
            com.google.common.primitives.ImmutableIntArray r1 = r1.build()
            return r1
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(java.util.Collection<java.lang.Integer> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            com.google.common.primitives.ImmutableIntArray r1 = com.google.common.primitives.ImmutableIntArray.EMPTY
            goto L13
        L9:
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            int[] r1 = com.google.common.primitives.Ints.toArray(r1)
            r0.<init>(r1)
            r1 = r0
        L13:
            return r1
    }

    public static com.google.common.primitives.ImmutableIntArray copyOf(int[] r2) {
            int r0 = r2.length
            if (r0 != 0) goto L6
            com.google.common.primitives.ImmutableIntArray r2 = com.google.common.primitives.ImmutableIntArray.EMPTY
            goto L11
        L6:
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            int r1 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r0.<init>(r2)
            r2 = r0
        L11:
            return r2
    }

    private boolean isPartialView() {
            r2 = this;
            int r0 = r2.start
            if (r0 > 0) goto Le
            int r0 = r2.end
            int[] r1 = r2.array
            int r1 = r1.length
            if (r0 >= r1) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of() {
            com.google.common.primitives.ImmutableIntArray r0 = com.google.common.primitives.ImmutableIntArray.EMPTY
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3, int r4) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3, int r4, int r5) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 3
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3, int r4, int r5, int r6) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 4
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3, int r4, int r5, int r6, int r7) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 5
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r3, int r4, int r5, int r6, int r7, int r8) {
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            r1 = 6
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.ImmutableIntArray of(int r4, int... r5) {
            int r0 = r5.length
            r1 = 1
            r2 = 0
            r3 = 2147483646(0x7ffffffe, float:NaN)
            if (r0 > r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "the total number of elements must fit in an int"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = r5.length
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r0[r2] = r4
            int r4 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r1, r4)
            com.google.common.primitives.ImmutableIntArray r4 = new com.google.common.primitives.ImmutableIntArray
            r4.<init>(r0)
            return r4
    }

    public java.util.List<java.lang.Integer> asList() {
            r2 = this;
            com.google.common.primitives.ImmutableIntArray$AsList r0 = new com.google.common.primitives.ImmutableIntArray$AsList
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean contains(int r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.common.primitives.ImmutableIntArray
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.primitives.ImmutableIntArray r6 = (com.google.common.primitives.ImmutableIntArray) r6
            int r1 = r5.length()
            int r3 = r6.length()
            if (r1 == r3) goto L17
            return r2
        L17:
            r1 = 0
        L18:
            int r3 = r5.length()
            if (r1 >= r3) goto L2c
            int r3 = r5.get(r1)
            int r4 = r6.get(r1)
            if (r3 == r4) goto L29
            return r2
        L29:
            int r1 = r1 + 1
            goto L18
        L2c:
            return r0
    }

    public int get(int r3) {
            r2 = this;
            int r0 = r2.length()
            com.google.common.base.Preconditions.checkElementIndex(r3, r0)
            int[] r0 = r2.array
            int r1 = r2.start
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.start
            r1 = 1
        L3:
            int r2 = r3.end
            if (r0 >= r2) goto L15
            int r1 = r1 * 31
            int[] r2 = r3.array
            r2 = r2[r0]
            int r2 = com.google.common.primitives.Ints.hashCode(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L3
        L15:
            return r1
    }

    public int indexOf(int r3) {
            r2 = this;
            int r0 = r2.start
        L2:
            int r1 = r2.end
            if (r0 >= r1) goto L13
            int[] r1 = r2.array
            r1 = r1[r0]
            if (r1 != r3) goto L10
            int r3 = r2.start
            int r0 = r0 - r3
            return r0
        L10:
            int r0 = r0 + 1
            goto L2
        L13:
            r3 = -1
            return r3
    }

    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.end
            int r1 = r2.start
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int lastIndexOf(int r4) {
            r3 = this;
            int r0 = r3.end
            int r0 = r0 + (-1)
        L4:
            int r1 = r3.start
            if (r0 < r1) goto L13
            int[] r2 = r3.array
            r2 = r2[r0]
            if (r2 != r4) goto L10
            int r0 = r0 - r1
            return r0
        L10:
            int r0 = r0 + (-1)
            goto L4
        L13:
            r4 = -1
            return r4
    }

    public int length() {
            r2 = this;
            int r0 = r2.end
            int r1 = r2.start
            int r0 = r0 - r1
            return r0
    }

    public com.google.common.primitives.ImmutableIntArray subArray(int r4, int r5) {
            r3 = this;
            int r0 = r3.length()
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
            if (r4 != r5) goto Lc
            com.google.common.primitives.ImmutableIntArray r4 = com.google.common.primitives.ImmutableIntArray.EMPTY
            goto L18
        Lc:
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            int[] r1 = r3.array
            int r2 = r3.start
            int r4 = r4 + r2
            int r2 = r2 + r5
            r0.<init>(r1, r4, r2)
            r4 = r0
        L18:
            return r4
    }

    public int[] toArray() {
            r3 = this;
            int[] r0 = r3.array
            int r1 = r3.start
            int r2 = r3.end
            int[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "[]"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 * 5
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r3.array
            int r2 = r3.start
            r1 = r1[r2]
            r0.append(r1)
            int r1 = r3.start
        L24:
            int r1 = r1 + 1
            int r2 = r3.end
            if (r1 >= r2) goto L37
            java.lang.String r2 = ", "
            r0.append(r2)
            int[] r2 = r3.array
            r2 = r2[r1]
            r0.append(r2)
            goto L24
        L37:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.common.primitives.ImmutableIntArray trimmed() {
            r2 = this;
            boolean r0 = r2.isPartialView()
            if (r0 == 0) goto L10
            com.google.common.primitives.ImmutableIntArray r0 = new com.google.common.primitives.ImmutableIntArray
            int[] r1 = r2.toArray()
            r0.<init>(r1)
            goto L11
        L10:
            r0 = r2
        L11:
            return r0
    }
}
