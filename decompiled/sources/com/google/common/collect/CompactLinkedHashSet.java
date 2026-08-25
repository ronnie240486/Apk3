package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends com.google.common.collect.CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @javax.annotation.CheckForNull
    private transient int[] predecessor;

    @javax.annotation.CheckForNull
    private transient int[] successor;

    public CompactLinkedHashSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public CompactLinkedHashSet(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create() {
            com.google.common.collect.CompactLinkedHashSet r0 = new com.google.common.collect.CompactLinkedHashSet
            r0.<init>()
            return r0
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create(java.util.Collection<? extends E> r1) {
            int r0 = r1.size()
            com.google.common.collect.CompactLinkedHashSet r0 = createWithExpectedSize(r0)
            r0.addAll(r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.CompactLinkedHashSet<E> create(E... r1) {
            int r0 = r1.length
            com.google.common.collect.CompactLinkedHashSet r0 = createWithExpectedSize(r0)
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.CompactLinkedHashSet<E> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactLinkedHashSet r0 = new com.google.common.collect.CompactLinkedHashSet
            r0.<init>(r1)
            return r0
    }

    private int getPredecessor(int r2) {
            r1 = this;
            int[] r0 = r1.requirePredecessors()
            r2 = r0[r2]
            int r2 = r2 + (-1)
            return r2
    }

    private int[] requirePredecessors() {
            r1 = this;
            int[] r0 = r1.predecessor
            java.util.Objects.requireNonNull(r0)
            int[] r0 = (int[]) r0
            return r0
    }

    private int[] requireSuccessors() {
            r1 = this;
            int[] r0 = r1.successor
            java.util.Objects.requireNonNull(r0)
            int[] r0 = (int[]) r0
            return r0
    }

    private void setPredecessor(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.requirePredecessors()
            int r3 = r3 + 1
            r0[r2] = r3
            return
    }

    private void setSucceeds(int r2, int r3) {
            r1 = this;
            r0 = -2
            if (r2 != r0) goto L6
            r1.firstEntry = r3
            goto L9
        L6:
            r1.setSuccessor(r2, r3)
        L9:
            if (r3 != r0) goto Le
            r1.lastEntry = r2
            goto L11
        Le:
            r1.setPredecessor(r3, r2)
        L11:
            return
    }

    private void setSuccessor(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.requireSuccessors()
            int r3 = r3 + 1
            r0[r2] = r3
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int adjustAfterRemove(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L7
            r2 = r3
        L7:
            return r2
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int allocArrays() {
            r2 = this;
            int r0 = super.allocArrays()
            int[] r1 = new int[r0]
            r2.predecessor = r1
            int[] r1 = new int[r0]
            r2.successor = r1
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            boolean r0 = r3.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = -2
            r3.firstEntry = r0
            r3.lastEntry = r0
            int[] r0 = r3.predecessor
            if (r0 == 0) goto L25
            int[] r1 = r3.successor
            if (r1 == 0) goto L25
            int r1 = r3.size()
            r2 = 0
            java.util.Arrays.fill(r0, r2, r1, r2)
            int[] r0 = r3.successor
            int r1 = r3.size()
            java.util.Arrays.fill(r0, r2, r1, r2)
        L25:
            super.clear()
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.util.Set<E> convertToHashFloodingResistantImplementation() {
            r2 = this;
            java.util.Set r0 = super.convertToHashFloodingResistantImplementation()
            r1 = 0
            r2.predecessor = r1
            r2.successor = r1
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int firstEntryIndex() {
            r1 = this;
            int r0 = r1.firstEntry
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int getSuccessor(int r2) {
            r1 = this;
            int[] r0 = r1.requireSuccessors()
            r2 = r0[r2]
            int r2 = r2 + (-1)
            return r2
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void init(int r1) {
            r0 = this;
            super.init(r1)
            r1 = -2
            r0.firstEntry = r1
            r0.lastEntry = r1
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void insertEntry(int r1, @com.google.common.collect.ParametricNullness E r2, int r3, int r4) {
            r0 = this;
            super.insertEntry(r1, r2, r3, r4)
            int r2 = r0.lastEntry
            r0.setSucceeds(r2, r1)
            r2 = -2
            r0.setSucceeds(r1, r2)
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void moveLastEntry(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 + (-1)
            super.moveLastEntry(r3, r4)
            int r4 = r2.getPredecessor(r3)
            int r1 = r2.getSuccessor(r3)
            r2.setSucceeds(r4, r1)
            if (r3 >= r0) goto L24
            int r4 = r2.getPredecessor(r0)
            r2.setSucceeds(r4, r3)
            int r4 = r2.getSuccessor(r0)
            r2.setSucceeds(r3, r4)
        L24:
            int[] r3 = r2.requirePredecessors()
            r4 = 0
            r3[r0] = r4
            int[] r3 = r2.requireSuccessors()
            r3[r0] = r4
            return
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void resizeEntries(int r2) {
            r1 = this;
            super.resizeEntries(r2)
            int[] r0 = r1.requirePredecessors()
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r1.predecessor = r0
            int[] r0 = r1.requireSuccessors()
            int[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.successor = r2
            return
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.common.collect.ObjectArrays.toArrayImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r1) {
            r0 = this;
            java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1)
            return r1
    }
}
