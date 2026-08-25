package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public transient java.lang.Object[] elements;

    @javax.annotation.CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient java.lang.Object table;


    public CompactHashSet() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.init(r0)
            return
    }

    public CompactHashSet(int r1) {
            r0 = this;
            r0.<init>()
            r0.init(r1)
            return
    }

    public static /* synthetic */ int access$000(com.google.common.collect.CompactHashSet r0) {
            int r0 = r0.metadata
            return r0
    }

    public static /* synthetic */ java.lang.Object access$100(com.google.common.collect.CompactHashSet r0, int r1) {
            java.lang.Object r0 = r0.element(r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create() {
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create(java.util.Collection<? extends E> r1) {
            int r0 = r1.size()
            com.google.common.collect.CompactHashSet r0 = createWithExpectedSize(r0)
            r0.addAll(r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.CompactHashSet<E> create(E... r1) {
            int r0 = r1.length
            com.google.common.collect.CompactHashSet r0 = createWithExpectedSize(r0)
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    private java.util.Set<E> createHashFloodingResistantDelegate(int r3) {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r3, r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactHashSet<E> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>(r1)
            return r0
    }

    private E element(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireElements()
            r2 = r0[r2]
            return r2
    }

    private int entry(int r2) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            r2 = r0[r2]
            return r2
    }

    private int hashTableMask() {
            r2 = this;
            int r0 = r2.metadata
            r0 = r0 & 31
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            return r0
    }

    private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            r4.defaultReadObject()
            int r0 = r4.readInt()
            if (r0 < 0) goto L1a
            r3.init(r0)
            r1 = 0
        Ld:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.readObject()
            r3.add(r2)
            int r1 = r1 + 1
            goto Ld
        L19:
            return
        L1a:
            java.io.InvalidObjectException r4 = new java.io.InvalidObjectException
            r1 = 25
            java.lang.String r2 = "Invalid size: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r4.<init>(r0)
            throw r4
    }

    private java.lang.Object[] requireElements() {
            r1 = this;
            java.lang.Object[] r0 = r1.elements
            java.util.Objects.requireNonNull(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private int[] requireEntries() {
            r1 = this;
            int[] r0 = r1.entries
            java.util.Objects.requireNonNull(r0)
            int[] r0 = (int[]) r0
            return r0
    }

    private java.lang.Object requireTable() {
            r1 = this;
            java.lang.Object r0 = r1.table
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    private void resizeMeMaybe(int r4) {
            r3 = this;
            int[] r0 = r3.requireEntries()
            int r0 = r0.length
            if (r4 <= r0) goto L1c
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            int r1 = r0 >>> 1
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = r1 + r0
            r1 = r1 | r2
            int r4 = java.lang.Math.min(r4, r1)
            if (r4 == r0) goto L1c
            r3.resizeEntries(r4)
        L1c:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private int resizeTable(int r9, int r10, int r11, int r12) {
            r8 = this;
            java.lang.Object r0 = com.google.common.collect.CompactHashing.createTable(r10)
            int r10 = r10 + (-1)
            if (r12 == 0) goto Le
            r11 = r11 & r10
            int r12 = r12 + 1
            com.google.common.collect.CompactHashing.tableSet(r0, r11, r12)
        Le:
            java.lang.Object r11 = r8.requireTable()
            int[] r12 = r8.requireEntries()
            r1 = 0
        L17:
            if (r1 > r9) goto L3c
            int r2 = com.google.common.collect.CompactHashing.tableGet(r11, r1)
        L1d:
            if (r2 == 0) goto L39
            int r3 = r2 + (-1)
            r4 = r12[r3]
            int r5 = ~r9
            r5 = r5 & r4
            r5 = r5 | r1
            r6 = r5 & r10
            int r7 = com.google.common.collect.CompactHashing.tableGet(r0, r6)
            com.google.common.collect.CompactHashing.tableSet(r0, r6, r2)
            int r2 = ~r10
            r2 = r2 & r5
            r5 = r7 & r10
            r2 = r2 | r5
            r12[r3] = r2
            r2 = r4 & r9
            goto L1d
        L39:
            int r1 = r1 + 1
            goto L17
        L3c:
            r8.table = r0
            r8.setHashTableMask(r10)
            return r10
    }

    private void setElement(int r2, E r3) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireElements()
            r0[r2] = r3
            return
    }

    private void setEntry(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            r0[r2] = r3
            return
    }

    private void setHashTableMask(int r2) {
            r1 = this;
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r2 = 32 - r2
            int r0 = r1.metadata
            r0 = r0 & (-32)
            r2 = r2 & 31
            r2 = r2 | r0
            r1.metadata = r2
            return
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            int r0 = r2.size()
            r3.writeInt(r0)
            java.util.Iterator r0 = r2.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto Le
        L1c:
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(@com.google.common.collect.ParametricNullness E r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.needsAllocArrays()
            if (r2 == 0) goto Ld
            r16.allocArrays()
        Ld:
            java.util.Set r2 = r16.delegateOrNull()
            if (r2 == 0) goto L18
            boolean r1 = r2.add(r1)
            return r1
        L18:
            int[] r2 = r16.requireEntries()
            java.lang.Object[] r3 = r16.requireElements()
            int r4 = r0.size
            int r5 = r4 + 1
            int r6 = com.google.common.collect.Hashing.smearedHash(r17)
            int r7 = r16.hashTableMask()
            r8 = r6 & r7
            java.lang.Object r9 = r16.requireTable()
            int r9 = com.google.common.collect.CompactHashing.tableGet(r9, r8)
            r10 = 1
            if (r9 != 0) goto L4c
            if (r5 <= r7) goto L44
            int r2 = com.google.common.collect.CompactHashing.newCapacity(r7)
            int r7 = r0.resizeTable(r7, r2, r6, r4)
            goto L84
        L44:
            java.lang.Object r2 = r16.requireTable()
            com.google.common.collect.CompactHashing.tableSet(r2, r8, r5)
            goto L84
        L4c:
            int r8 = ~r7
            r11 = r6 & r8
            r12 = 0
            r13 = 0
        L51:
            int r9 = r9 - r10
            r14 = r2[r9]
            r15 = r14 & r8
            if (r15 != r11) goto L61
            r10 = r3[r9]
            boolean r10 = com.google.common.base.Objects.equal(r1, r10)
            if (r10 == 0) goto L61
            return r12
        L61:
            r10 = r14 & r7
            r14 = 1
            int r13 = r13 + r14
            if (r10 != 0) goto L91
            r3 = 9
            if (r13 < r3) goto L74
            java.util.Set r2 = r16.convertToHashFloodingResistantImplementation()
            boolean r1 = r2.add(r1)
            return r1
        L74:
            if (r5 <= r7) goto L7f
            int r2 = com.google.common.collect.CompactHashing.newCapacity(r7)
            int r7 = r0.resizeTable(r7, r2, r6, r4)
            goto L84
        L7f:
            r3 = r5 & r7
            r3 = r3 | r15
            r2[r9] = r3
        L84:
            r0.resizeMeMaybe(r5)
            r0.insertEntry(r4, r1, r6, r7)
            r0.size = r5
            r16.incrementModCount()
            r9 = 1
            return r9
        L91:
            r9 = r10
            r10 = 1
            goto L51
    }

    public int adjustAfterRemove(int r1, int r2) {
            r0 = this;
            int r1 = r1 + (-1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int allocArrays() {
            r3 = this;
            boolean r0 = r3.needsAllocArrays()
            java.lang.String r1 = "Arrays already allocated"
            com.google.common.base.Preconditions.checkState(r0, r1)
            int r0 = r3.metadata
            int r1 = com.google.common.collect.CompactHashing.tableSize(r0)
            java.lang.Object r2 = com.google.common.collect.CompactHashing.createTable(r1)
            r3.table = r2
            int r1 = r1 + (-1)
            r3.setHashTableMask(r1)
            int[] r1 = new int[r0]
            r3.entries = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3.elements = r1
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r6 = this;
            boolean r0 = r6.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            r6.incrementModCount()
            java.util.Set r0 = r6.delegateOrNull()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L28
            int r3 = r6.size()
            r4 = 3
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r3 = com.google.common.primitives.Ints.constrainToRange(r3, r4, r5)
            r6.metadata = r3
            r0.clear()
            r6.table = r1
            r6.size = r2
            goto L43
        L28:
            java.lang.Object[] r0 = r6.requireElements()
            int r3 = r6.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            java.lang.Object r0 = r6.requireTable()
            com.google.common.collect.CompactHashing.tableClear(r0)
            int[] r0 = r6.requireEntries()
            int r1 = r6.size
            java.util.Arrays.fill(r0, r2, r1, r2)
            r6.size = r2
        L43:
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r9) {
            r8 = this;
            boolean r0 = r8.needsAllocArrays()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r8.delegateOrNull()
            if (r0 == 0) goto L13
            boolean r9 = r0.contains(r9)
            return r9
        L13:
            int r0 = com.google.common.collect.Hashing.smearedHash(r9)
            int r2 = r8.hashTableMask()
            java.lang.Object r3 = r8.requireTable()
            r4 = r0 & r2
            int r3 = com.google.common.collect.CompactHashing.tableGet(r3, r4)
            if (r3 != 0) goto L28
            return r1
        L28:
            int r4 = ~r2
            r0 = r0 & r4
        L2a:
            r5 = 1
            int r3 = r3 - r5
            int r6 = r8.entry(r3)
            r7 = r6 & r4
            if (r7 != r0) goto L3f
            java.lang.Object r3 = r8.element(r3)
            boolean r3 = com.google.common.base.Objects.equal(r9, r3)
            if (r3 == 0) goto L3f
            return r5
        L3f:
            r3 = r6 & r2
            if (r3 != 0) goto L2a
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Set<E> convertToHashFloodingResistantImplementation() {
            r3 = this;
            int r0 = r3.hashTableMask()
            int r0 = r0 + 1
            java.util.Set r0 = r3.createHashFloodingResistantDelegate(r0)
            int r1 = r3.firstEntryIndex()
        Le:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r3.element(r1)
            r0.add(r2)
            int r1 = r3.getSuccessor(r1)
            goto Le
        L1c:
            r3.table = r0
            r1 = 0
            r3.entries = r1
            r3.elements = r1
            r3.incrementModCount()
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public final java.util.Set<E> delegateOrNull() {
            r2 = this;
            java.lang.Object r0 = r2.table
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L9
            java.util.Set r0 = (java.util.Set) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int firstEntryIndex() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int getSuccessor(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.size
            if (r2 >= r0) goto L7
            goto L8
        L7:
            r2 = -1
        L8:
            return r2
    }

    public final void incrementModCount() {
            r1 = this;
            int r0 = r1.metadata
            int r0 = r0 + 32
            r1.metadata = r0
            return
    }

    public void init(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r2 = "Expected size must be >= 0"
            com.google.common.base.Preconditions.checkArgument(r1, r2)
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r4 = com.google.common.primitives.Ints.constrainToRange(r4, r0, r1)
            r3.metadata = r4
            return
    }

    public void insertEntry(int r2, @com.google.common.collect.ParametricNullness E r3, int r4, int r5) {
            r1 = this;
            int r0 = ~r5
            r4 = r4 & r0
            r0 = 0
            r5 = r5 & r0
            r4 = r4 | r5
            r1.setEntry(r2, r4)
            r1.setElement(r2, r3)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Set r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            java.util.Iterator r0 = r0.iterator()
            return r0
        Lb:
            com.google.common.collect.CompactHashSet$1 r0 = new com.google.common.collect.CompactHashSet$1
            r0.<init>(r1)
            return r0
    }

    public void moveLastEntry(int r8, int r9) {
            r7 = this;
            java.lang.Object r0 = r7.requireTable()
            int[] r1 = r7.requireEntries()
            java.lang.Object[] r2 = r7.requireElements()
            int r3 = r7.size()
            int r3 = r3 + (-1)
            r4 = 0
            r5 = 0
            if (r8 >= r3) goto L48
            r6 = r2[r3]
            r2[r8] = r6
            r2[r3] = r5
            r2 = r1[r3]
            r1[r8] = r2
            r1[r3] = r4
            int r2 = com.google.common.collect.Hashing.smearedHash(r6)
            r2 = r2 & r9
            int r4 = com.google.common.collect.CompactHashing.tableGet(r0, r2)
            int r3 = r3 + 1
            if (r4 != r3) goto L35
            int r8 = r8 + 1
            com.google.common.collect.CompactHashing.tableSet(r0, r2, r8)
            goto L4c
        L35:
            int r4 = r4 + (-1)
            r0 = r1[r4]
            r2 = r0 & r9
            if (r2 != r3) goto L46
            int r8 = r8 + 1
            int r2 = ~r9
            r0 = r0 & r2
            r8 = r8 & r9
            r8 = r8 | r0
            r1[r4] = r8
            goto L4c
        L46:
            r4 = r2
            goto L35
        L48:
            r2[r8] = r5
            r1[r8] = r4
        L4c:
            return
    }

    @com.google.common.annotations.VisibleForTesting
    public final boolean needsAllocArrays() {
            r1 = this;
            java.lang.Object r0 = r1.table
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r10) {
            r9 = this;
            boolean r0 = r9.needsAllocArrays()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r9.delegateOrNull()
            if (r0 == 0) goto L13
            boolean r10 = r0.remove(r10)
            return r10
        L13:
            int r0 = r9.hashTableMask()
            r3 = 0
            java.lang.Object r5 = r9.requireTable()
            int[] r6 = r9.requireEntries()
            java.lang.Object[] r7 = r9.requireElements()
            r8 = 0
            r2 = r10
            r4 = r0
            int r10 = com.google.common.collect.CompactHashing.remove(r2, r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L2f
            return r1
        L2f:
            r9.moveLastEntry(r10, r0)
            int r10 = r9.size
            r0 = 1
            int r10 = r10 - r0
            r9.size = r10
            r9.incrementModCount()
            return r0
    }

    public void resizeEntries(int r2) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r1.entries = r0
            java.lang.Object[] r0 = r1.requireElements()
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.elements = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.util.Set r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            goto Ld
        Lb:
            int r0 = r1.size
        Ld:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r2 = this;
            boolean r0 = r2.needsAllocArrays()
            if (r0 == 0) goto La
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        La:
            java.util.Set r0 = r2.delegateOrNull()
            if (r0 == 0) goto L15
            java.lang.Object[] r0 = r0.toArray()
            goto L1f
        L15:
            java.lang.Object[] r0 = r2.requireElements()
            int r1 = r2.size
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L1f:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T[] toArray(T[] r7) {
            r6 = this;
            boolean r0 = r6.needsAllocArrays()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Le
            int r0 = r7.length
            if (r0 <= 0) goto Ld
            r7[r2] = r1
        Ld:
            return r7
        Le:
            java.util.Set r0 = r6.delegateOrNull()
            if (r0 == 0) goto L19
            java.lang.Object[] r7 = r0.toArray(r7)
            goto L35
        L19:
            java.lang.Object[] r0 = r6.requireElements()
            int r3 = r6.size
            int r4 = r2 + r3
            int r5 = r0.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r4, r5)
            int r4 = r7.length
            if (r4 >= r3) goto L2d
            java.lang.Object[] r7 = com.google.common.collect.ObjectArrays.newArray(r7, r3)
            goto L32
        L2d:
            int r4 = r7.length
            if (r4 <= r3) goto L32
            r7[r3] = r1
        L32:
            java.lang.System.arraycopy(r0, r2, r7, r2, r3)
        L35:
            return r7
    }

    public void trimToSize() {
            r3 = this;
            boolean r0 = r3.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Set r0 = r3.delegateOrNull()
            if (r0 == 0) goto L1b
            int r1 = r3.size()
            java.util.Set r1 = r3.createHashFloodingResistantDelegate(r1)
            r1.addAll(r0)
            r3.table = r1
            return
        L1b:
            int r0 = r3.size
            int[] r1 = r3.requireEntries()
            int r1 = r1.length
            if (r0 >= r1) goto L27
            r3.resizeEntries(r0)
        L27:
            int r0 = com.google.common.collect.CompactHashing.tableSize(r0)
            int r1 = r3.hashTableMask()
            if (r0 >= r1) goto L35
            r2 = 0
            r3.resizeTable(r1, r0, r2, r2)
        L35:
            return
    }
}
