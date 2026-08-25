package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends com.google.common.collect.ImmutableMultisetGwtSerializationDependencies<E> implements com.google.common.collect.Multiset<E> {
    public static final /* synthetic */ int $r8$clinit = 0;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet;


    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        public boolean buildInvoked;

        @javax.annotation.CheckForNull
        public com.google.common.collect.ObjectCountHashMap<E> contents;
        public boolean isLinkedHash;

        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        public Builder(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.buildInvoked = r0
                r1.isLinkedHash = r0
                com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
                r0.<init>(r2)
                r1.contents = r0
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.buildInvoked = r1
                r0.isLinkedHash = r1
                r1 = 0
                r0.contents = r1
                return
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableMultiset$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E r2) {
                r1 = this;
                r0 = 1
                com.google.common.collect.ImmutableMultiset$Builder r2 = r1.addCopies(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E... r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableMultiset$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> r4) {
                r3 = this;
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                java.util.Objects.requireNonNull(r0)
                boolean r0 = r4 instanceof com.google.common.collect.Multiset
                if (r0 == 0) goto L78
                com.google.common.collect.Multiset r4 = (com.google.common.collect.Multiset) r4
                boolean r0 = r4 instanceof com.google.common.collect.RegularImmutableMultiset
                if (r0 == 0) goto L15
                r0 = r4
                com.google.common.collect.RegularImmutableMultiset r0 = (com.google.common.collect.RegularImmutableMultiset) r0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.contents
                goto L20
            L15:
                boolean r0 = r4 instanceof com.google.common.collect.AbstractMapBasedMultiset
                if (r0 == 0) goto L1f
                r0 = r4
                com.google.common.collect.AbstractMapBasedMultiset r0 = (com.google.common.collect.AbstractMapBasedMultiset) r0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.backingMap
                goto L20
            L1f:
                r0 = 0
            L20:
                if (r0 == 0) goto L45
                com.google.common.collect.ObjectCountHashMap<E> r4 = r3.contents
                int r1 = r4.size
                int r2 = r0.size
                int r1 = java.lang.Math.max(r1, r2)
                r4.ensureCapacity(r1)
                int r4 = r0.firstIndex()
            L33:
                if (r4 < 0) goto L7b
                java.lang.Object r1 = r0.getKey(r4)
                int r2 = r0.getValue(r4)
                r3.addCopies(r1, r2)
                int r4 = r0.nextIndex(r4)
                goto L33
            L45:
                java.util.Set r0 = r4.entrySet()
                com.google.common.collect.ObjectCountHashMap<E> r1 = r3.contents
                int r2 = r1.size
                int r0 = r0.size()
                int r0 = java.lang.Math.max(r2, r0)
                r1.ensureCapacity(r0)
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L60:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L7b
                java.lang.Object r0 = r4.next()
                com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
                java.lang.Object r1 = r0.getElement()
                int r0 = r0.getCount()
                r3.addCopies(r1, r0)
                goto L60
            L78:
                super.addAll(r4)
            L7b:
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.util.Iterator<? extends E> r1) {
                r0 = this;
                super.addAll(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> addCopies(E r4, int r5) {
                r3 = this;
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                java.util.Objects.requireNonNull(r0)
                if (r5 != 0) goto L8
                return r3
            L8:
                boolean r0 = r3.buildInvoked
                r1 = 0
                if (r0 == 0) goto L18
                com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
                com.google.common.collect.ObjectCountHashMap<E> r2 = r3.contents
                r0.<init>(r2)
                r3.contents = r0
                r3.isLinkedHash = r1
            L18:
                r3.buildInvoked = r1
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                int r1 = r0.get(r4)
                int r5 = r5 + r1
                r0.put(r4, r5)
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection build() {
                r1 = this;
                com.google.common.collect.ImmutableMultiset r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset<E> build() {
                r2 = this;
                com.google.common.collect.ObjectCountHashMap<E> r0 = r2.contents
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ObjectCountHashMap<E> r0 = r2.contents
                int r1 = r0.size
                if (r1 != 0) goto L10
                com.google.common.collect.ImmutableMultiset r0 = com.google.common.collect.ImmutableMultiset.of()
                return r0
            L10:
                boolean r1 = r2.isLinkedHash
                if (r1 == 0) goto L1e
                com.google.common.collect.ObjectCountHashMap r1 = new com.google.common.collect.ObjectCountHashMap
                r1.<init>(r0)
                r2.contents = r1
                r0 = 0
                r2.isLinkedHash = r0
            L1e:
                r0 = 1
                r2.buildInvoked = r0
                com.google.common.collect.RegularImmutableMultiset r0 = new com.google.common.collect.RegularImmutableMultiset
                com.google.common.collect.ObjectCountHashMap<E> r1 = r2.contents
                r0.<init>(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMultiset.Builder<E> setCount(E r4, int r5) {
                r3 = this;
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                java.util.Objects.requireNonNull(r0)
                r0 = 0
                if (r5 != 0) goto L19
                boolean r1 = r3.isLinkedHash
                if (r1 != 0) goto L19
                com.google.common.collect.ObjectCountLinkedHashMap r1 = new com.google.common.collect.ObjectCountLinkedHashMap
                com.google.common.collect.ObjectCountHashMap<E> r2 = r3.contents
                r1.<init>(r2)
                r3.contents = r1
                r1 = 1
                r3.isLinkedHash = r1
                goto L28
            L19:
                boolean r1 = r3.buildInvoked
                if (r1 == 0) goto L28
                com.google.common.collect.ObjectCountHashMap r1 = new com.google.common.collect.ObjectCountHashMap
                com.google.common.collect.ObjectCountHashMap<E> r2 = r3.contents
                r1.<init>(r2)
                r3.contents = r1
                r3.isLinkedHash = r0
            L28:
                r3.buildInvoked = r0
                com.google.common.base.Preconditions.checkNotNull(r4)
                if (r5 != 0) goto L35
                com.google.common.collect.ObjectCountHashMap<E> r5 = r3.contents
                r5.remove(r4)
                goto L3e
            L35:
                com.google.common.collect.ObjectCountHashMap<E> r0 = r3.contents
                java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
                r0.put(r4, r5)
            L3e:
                return r3
        }
    }

    public final class EntrySet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;
        public final /* synthetic */ com.google.common.collect.ImmutableMultiset this$0;

        private EntrySet(com.google.common.collect.ImmutableMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ EntrySet(com.google.common.collect.ImmutableMultiset r1, com.google.common.collect.ImmutableMultiset.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Multiset.Entry
                r1 = 0
                if (r0 == 0) goto L1f
                com.google.common.collect.Multiset$Entry r4 = (com.google.common.collect.Multiset.Entry) r4
                int r0 = r4.getCount()
                if (r0 > 0) goto Le
                return r1
            Le:
                com.google.common.collect.ImmutableMultiset r0 = r3.this$0
                java.lang.Object r2 = r4.getElement()
                int r0 = r0.count(r2)
                int r4 = r4.getCount()
                if (r0 != r4) goto L1f
                r1 = 1
            L1f:
                return r1
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final java.lang.Object get(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableMultiset r0 = r1.this$0
                com.google.common.collect.Multiset$Entry r2 = r0.getEntry(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                com.google.common.collect.ImmutableMultiset r0 = r1.this$0
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                com.google.common.collect.ImmutableMultiset r0 = r1.this$0
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMultiset r0 = r1.this$0
                com.google.common.collect.ImmutableSet r0 = r0.elementSet()
                int r0 = r0.size()
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class EntrySetSerializedForm<E> implements java.io.Serializable {
    }

    public ImmutableMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> com.google.common.collect.ImmutableMultiset.Builder<E> builder() {
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            r0.<init>()
            return r0
    }

    private static <E> com.google.common.collect.ImmutableMultiset<E> copyFromElements(E... r1) {
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            r0.<init>()
            com.google.common.collect.ImmutableMultiset$Builder r1 = r0.add(r1)
            com.google.common.collect.ImmutableMultiset r1 = r1.build()
            return r1
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableMultiset
            if (r0 == 0) goto Le
            r0 = r2
            com.google.common.collect.ImmutableMultiset r0 = (com.google.common.collect.ImmutableMultiset) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto Le
            return r0
        Le:
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            int r1 = com.google.common.collect.Multisets.inferDistinctElements(r2)
            r0.<init>(r1)
            r0.addAll(r2)
            com.google.common.collect.ImmutableMultiset r2 = r0.build()
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> r1) {
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            r0.<init>()
            com.google.common.collect.ImmutableMultiset$Builder r1 = r0.addAll(r1)
            com.google.common.collect.ImmutableMultiset r1 = r1.build()
            return r1
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(E[] r0) {
            com.google.common.collect.ImmutableMultiset r0 = copyFromElements(r0)
            return r0
    }

    private com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            goto L11
        Lb:
            com.google.common.collect.ImmutableMultiset$EntrySet r0 = new com.google.common.collect.ImmutableMultiset$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
        L11:
            return r0
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of() {
            com.google.common.collect.RegularImmutableMultiset<java.lang.Object> r0 = com.google.common.collect.RegularImmutableMultiset.EMPTY
            return r0
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            com.google.common.collect.ImmutableMultiset r2 = copyFromElements(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r2, E r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.google.common.collect.ImmutableMultiset r2 = copyFromElements(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r2, E r3, E r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            com.google.common.collect.ImmutableMultiset r2 = copyFromElements(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r2, E r3, E r4, E r5) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            com.google.common.collect.ImmutableMultiset r2 = copyFromElements(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r2, E r3, E r4, E r5, E r6) {
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            com.google.common.collect.ImmutableMultiset r2 = copyFromElements(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E r1, E r2, E r3, E r4, E r5, E r6, E... r7) {
            com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
            r0.<init>()
            com.google.common.collect.ImmutableMultiset$Builder r1 = r0.add(r1)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r2)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r3)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r4)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r5)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r6)
            com.google.common.collect.ImmutableMultiset$Builder r1 = r1.add(r7)
            com.google.common.collect.ImmutableMultiset r1 = r1.build()
            return r1
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final int add(E r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.asList
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableList r0 = super.asList()
            r1.asList = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.count(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    public final int copyIntoArray(java.lang.Object[] r5, int r6) {
            r4 = this;
            com.google.common.collect.ImmutableSet r0 = r4.entrySet()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            int r2 = r1.getCount()
            int r2 = r2 + r6
            java.lang.Object r3 = r1.getElement()
            java.util.Arrays.fill(r5, r6, r2, r3)
            int r1 = r1.getCount()
            int r6 = r6 + r1
            goto L8
        L26:
            return r6
    }

    public abstract com.google.common.collect.ImmutableSet<E> elementSet();

    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entrySet
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSet r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.equalsImpl(r0, r1)
            return r1
    }

    public abstract com.google.common.collect.Multiset.Entry<E> getEntry(int r1);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r2 = this;
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            com.google.common.collect.ImmutableMultiset$1 r1 = new com.google.common.collect.ImmutableMultiset$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final int remove(@javax.annotation.CheckForNull java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final int setCount(E r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean setCount(E r1, int r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public java.lang.String toString() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
