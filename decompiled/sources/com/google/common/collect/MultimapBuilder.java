package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;





    /* JADX INFO: loaded from: classes3.dex */
    public static final class ArrayListSupplier<V> implements com.google.common.base.Supplier<java.util.List<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                r1.expectedValuesPerKey = r2
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.List r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.List<V> get() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.expectedValuesPerKey
                r0.<init>(r1)
                return r0
        }
    }

    public static final class EnumSetSupplier<V extends java.lang.Enum<V>> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final java.lang.Class<V> clazz;

        public EnumSetSupplier(java.lang.Class<V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                r0.clazz = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.Set r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
                r1 = this;
                java.lang.Class<V extends java.lang.Enum<V>> r0 = r1.clazz
                java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class HashSetSupplier<V> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                r1.expectedValuesPerKey = r2
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.Set r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
                r1 = this;
                int r0 = r1.expectedValuesPerKey
                com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.createWithExpectedSize(r0)
                return r0
        }
    }

    public static final class LinkedHashSetSupplier<V> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                r1.expectedValuesPerKey = r2
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.Set r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
                r1 = this;
                int r0 = r1.expectedValuesPerKey
                com.google.common.collect.CompactLinkedHashSet r0 = com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum LinkedListSupplier extends java.lang.Enum<com.google.common.collect.MultimapBuilder.LinkedListSupplier> implements com.google.common.base.Supplier<java.util.List<?>> {
        private static final /* synthetic */ com.google.common.collect.MultimapBuilder.LinkedListSupplier[] $VALUES = null;
        public static final com.google.common.collect.MultimapBuilder.LinkedListSupplier INSTANCE = null;

        private static /* synthetic */ com.google.common.collect.MultimapBuilder.LinkedListSupplier[] $values() {
                r0 = 1
                com.google.common.collect.MultimapBuilder$LinkedListSupplier[] r0 = new com.google.common.collect.MultimapBuilder.LinkedListSupplier[r0]
                com.google.common.collect.MultimapBuilder$LinkedListSupplier r1 = com.google.common.collect.MultimapBuilder.LinkedListSupplier.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.MultimapBuilder$LinkedListSupplier r0 = new com.google.common.collect.MultimapBuilder$LinkedListSupplier
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.MultimapBuilder.LinkedListSupplier.INSTANCE = r0
                com.google.common.collect.MultimapBuilder$LinkedListSupplier[] r0 = $values()
                com.google.common.collect.MultimapBuilder.LinkedListSupplier.$VALUES = r0
                return
        }

        private LinkedListSupplier(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static <V> com.google.common.base.Supplier<java.util.List<V>> instance() {
                com.google.common.collect.MultimapBuilder$LinkedListSupplier r0 = com.google.common.collect.MultimapBuilder.LinkedListSupplier.INSTANCE
                return r0
        }

        public static com.google.common.collect.MultimapBuilder.LinkedListSupplier valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.MultimapBuilder$LinkedListSupplier> r0 = com.google.common.collect.MultimapBuilder.LinkedListSupplier.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.MultimapBuilder$LinkedListSupplier r1 = (com.google.common.collect.MultimapBuilder.LinkedListSupplier) r1
                return r1
        }

        public static com.google.common.collect.MultimapBuilder.LinkedListSupplier[] values() {
                com.google.common.collect.MultimapBuilder$LinkedListSupplier[] r0 = com.google.common.collect.MultimapBuilder.LinkedListSupplier.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.MultimapBuilder$LinkedListSupplier[] r0 = (com.google.common.collect.MultimapBuilder.LinkedListSupplier[]) r0
                return r0
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.util.List<?> get() {
                r1 = this;
                java.util.List r0 = r1.get2()
                return r0
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public java.util.List<?> get2() {
                r1 = this;
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                return r0
        }
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder<K0, V0> {
        public ListMultimapBuilder() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.ListMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                com.google.common.collect.Multimap r1 = super.build(r1)
                com.google.common.collect.ListMultimap r1 = (com.google.common.collect.ListMultimap) r1
                return r1
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build() {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.ListMultimap r1 = r0.build(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;







        public MultimapBuilderWithKeys() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> arrayListValues() {
                r1 = this;
                r0 = 2
                com.google.common.collect.MultimapBuilder$ListMultimapBuilder r0 = r1.arrayListValues(r0)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> arrayListValues(int r2) {
                r1 = this;
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1
                r0.<init>(r1, r2)
                return r0
        }

        public abstract <K extends K0, V> java.util.Map<K, java.util.Collection<V>> createMap();

        public <V0 extends java.lang.Enum<V0>> com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, V0> enumSetValues(java.lang.Class<V0> r2) {
                r1 = this;
                java.lang.String r0 = "valueClass"
                com.google.common.base.Preconditions.checkNotNull(r2, r0)
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6
                r0.<init>(r1, r2)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> hashSetValues() {
                r1 = this;
                r0 = 2
                com.google.common.collect.MultimapBuilder$SetMultimapBuilder r0 = r1.hashSetValues(r0)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> hashSetValues(int r2) {
                r1 = this;
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3
                r0.<init>(r1, r2)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> linkedHashSetValues() {
                r1 = this;
                r0 = 2
                com.google.common.collect.MultimapBuilder$SetMultimapBuilder r0 = r1.linkedHashSetValues(r0)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> linkedHashSetValues(int r2) {
                r1 = this;
                java.lang.String r0 = "expectedValuesPerKey"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4
                r0.<init>(r1, r2)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> linkedListValues() {
                r1 = this;
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2
                r0.<init>(r1)
                return r0
        }

        public com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder<K0, java.lang.Comparable> treeSetValues() {
                r1 = this;
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.MultimapBuilder$SortedSetMultimapBuilder r0 = r1.treeSetValues(r0)
                return r0
        }

        public <V0> com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder<K0, V0> treeSetValues(java.util.Comparator<V0> r2) {
                r1 = this;
                java.lang.String r0 = "comparator"
                com.google.common.base.Preconditions.checkNotNull(r2, r0)
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5 r0 = new com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class SetMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder<K0, V0> {
        public SetMultimapBuilder() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.SetMultimap r1 = r0.build(r1)
                return r1
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.SetMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                com.google.common.collect.Multimap r1 = super.build(r1)
                com.google.common.collect.SetMultimap r1 = (com.google.common.collect.SetMultimap) r1
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class SortedSetMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, V0> {
        public SortedSetMultimapBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.Multimap build(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.SortedSetMultimap r1 = r0.build(r1)
                return r1
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.SetMultimap build() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ com.google.common.collect.SetMultimap build(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.SortedSetMultimap r1 = r0.build(r1)
                return r1
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.SortedSetMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                com.google.common.collect.SetMultimap r1 = super.build(r1)
                com.google.common.collect.SortedSetMultimap r1 = (com.google.common.collect.SortedSetMultimap) r1
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TreeSetSupplier<V> implements com.google.common.base.Supplier<java.util.SortedSet<V>>, java.io.Serializable {
        private final java.util.Comparator<? super V> comparator;

        public TreeSetSupplier(java.util.Comparator<? super V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.comparator = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.SortedSet r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.SortedSet<V> get() {
                r2 = this;
                java.util.TreeSet r0 = new java.util.TreeSet
                java.util.Comparator<? super V> r1 = r2.comparator
                r0.<init>(r1)
                return r0
        }
    }

    private MultimapBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ MultimapBuilder(com.google.common.collect.MultimapBuilder.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K0 extends java.lang.Enum<K0>> com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0> enumKeys(java.lang.Class<K0> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.MultimapBuilder$4 r0 = new com.google.common.collect.MultimapBuilder$4
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> hashKeys() {
            r0 = 8
            com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = hashKeys(r0)
            return r0
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> hashKeys(int r1) {
            java.lang.String r0 = "expectedKeys"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.MultimapBuilder$1 r0 = new com.google.common.collect.MultimapBuilder$1
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys() {
            r0 = 8
            com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = linkedHashKeys(r0)
            return r0
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys(int r1) {
            java.lang.String r0 = "expectedKeys"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.MultimapBuilder$2 r0 = new com.google.common.collect.MultimapBuilder$2
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Comparable> treeKeys() {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = treeKeys(r0)
            return r0
    }

    public static <K0> com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0> treeKeys(java.util.Comparator<K0> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.MultimapBuilder$3 r0 = new com.google.common.collect.MultimapBuilder$3
            r0.<init>(r1)
            return r0
    }

    public abstract <K extends K0, V extends V0> com.google.common.collect.Multimap<K, V> build();

    public <K extends K0, V extends V0> com.google.common.collect.Multimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.build()
            r0.putAll(r2)
            return r0
    }
}
