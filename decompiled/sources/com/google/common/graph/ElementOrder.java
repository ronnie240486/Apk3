package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class ElementOrder<T> {

    @javax.annotation.CheckForNull
    private final java.util.Comparator<T> comparator;
    private final com.google.common.graph.ElementOrder.Type type;

    /* JADX INFO: renamed from: com.google.common.graph.ElementOrder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;

        static {
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.INSERTION     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.SORTED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static final enum Type extends java.lang.Enum<com.google.common.graph.ElementOrder.Type> {
        private static final /* synthetic */ com.google.common.graph.ElementOrder.Type[] $VALUES = null;
        public static final com.google.common.graph.ElementOrder.Type INSERTION = null;
        public static final com.google.common.graph.ElementOrder.Type SORTED = null;
        public static final com.google.common.graph.ElementOrder.Type STABLE = null;
        public static final com.google.common.graph.ElementOrder.Type UNORDERED = null;

        private static /* synthetic */ com.google.common.graph.ElementOrder.Type[] $values() {
                r0 = 4
                com.google.common.graph.ElementOrder$Type[] r0 = new com.google.common.graph.ElementOrder.Type[r0]
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED
                r2 = 0
                r0[r2] = r1
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE
                r2 = 1
                r0[r2] = r1
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.INSERTION
                r2 = 2
                r0[r2] = r1
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.SORTED
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.graph.ElementOrder$Type r0 = new com.google.common.graph.ElementOrder$Type
                java.lang.String r1 = "UNORDERED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.graph.ElementOrder.Type.UNORDERED = r0
                com.google.common.graph.ElementOrder$Type r0 = new com.google.common.graph.ElementOrder$Type
                java.lang.String r1 = "STABLE"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.graph.ElementOrder.Type.STABLE = r0
                com.google.common.graph.ElementOrder$Type r0 = new com.google.common.graph.ElementOrder$Type
                java.lang.String r1 = "INSERTION"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.graph.ElementOrder.Type.INSERTION = r0
                com.google.common.graph.ElementOrder$Type r0 = new com.google.common.graph.ElementOrder$Type
                java.lang.String r1 = "SORTED"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.common.graph.ElementOrder.Type.SORTED = r0
                com.google.common.graph.ElementOrder$Type[] r0 = $values()
                com.google.common.graph.ElementOrder.Type.$VALUES = r0
                return
        }

        private Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.ElementOrder.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.ElementOrder$Type> r0 = com.google.common.graph.ElementOrder.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.ElementOrder$Type r1 = (com.google.common.graph.ElementOrder.Type) r1
                return r1
        }

        public static com.google.common.graph.ElementOrder.Type[] values() {
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.ElementOrder$Type[] r0 = (com.google.common.graph.ElementOrder.Type[]) r0
                return r0
        }
    }

    private ElementOrder(com.google.common.graph.ElementOrder.Type r4, @javax.annotation.CheckForNull java.util.Comparator<T> r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.graph.ElementOrder$Type r0 = (com.google.common.graph.ElementOrder.Type) r0
            r3.type = r0
            r3.comparator = r5
            com.google.common.graph.ElementOrder$Type r0 = com.google.common.graph.ElementOrder.Type.SORTED
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            if (r5 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r4 != r5) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.google.common.base.Preconditions.checkState(r1)
            return
    }

    public static <S> com.google.common.graph.ElementOrder<S> insertion() {
            com.google.common.graph.ElementOrder r0 = new com.google.common.graph.ElementOrder
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.INSERTION
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <S extends java.lang.Comparable<? super S>> com.google.common.graph.ElementOrder<S> natural() {
            com.google.common.graph.ElementOrder r0 = new com.google.common.graph.ElementOrder
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.SORTED
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2)
            return r0
    }

    public static <S> com.google.common.graph.ElementOrder<S> sorted(java.util.Comparator<S> r2) {
            com.google.common.graph.ElementOrder r0 = new com.google.common.graph.ElementOrder
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.SORTED
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static <S> com.google.common.graph.ElementOrder<S> stable() {
            com.google.common.graph.ElementOrder r0 = new com.google.common.graph.ElementOrder
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <S> com.google.common.graph.ElementOrder<S> unordered() {
            com.google.common.graph.ElementOrder r0 = new com.google.common.graph.ElementOrder
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public java.util.Comparator<T> comparator() {
            r2 = this;
            java.util.Comparator<T> r0 = r2.comparator
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This ordering does not define a comparator."
            r0.<init>(r1)
            throw r0
    }

    public final <K extends T, V> java.util.Map<K, V> createMap(int r3) {
            r2 = this;
            int[] r0 = com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type
            com.google.common.graph.ElementOrder$Type r1 = r2.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L25
            r1 = 3
            if (r0 == r1) goto L25
            r3 = 4
            if (r0 != r3) goto L1f
            java.util.Comparator r3 = r2.comparator()
            java.util.TreeMap r3 = com.google.common.collect.Maps.newTreeMap(r3)
            return r3
        L1f:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L25:
            java.util.LinkedHashMap r3 = com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(r3)
            return r3
        L2a:
            java.util.HashMap r3 = com.google.common.collect.Maps.newHashMapWithExpectedSize(r3)
            return r3
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.graph.ElementOrder
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.graph.ElementOrder r5 = (com.google.common.graph.ElementOrder) r5
            com.google.common.graph.ElementOrder$Type r1 = r4.type
            com.google.common.graph.ElementOrder$Type r3 = r5.type
            if (r1 != r3) goto L1d
            java.util.Comparator<T> r1 = r4.comparator
            java.util.Comparator<T> r5 = r5.comparator
            boolean r5 = com.google.common.base.Objects.equal(r1, r5)
            if (r5 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.graph.ElementOrder$Type r1 = r3.type
            r2 = 0
            r0[r2] = r1
            java.util.Comparator<T> r1 = r3.comparator
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r3)
            com.google.common.graph.ElementOrder$Type r1 = r3.type
            java.lang.String r2 = "type"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.util.Comparator<T> r1 = r3.comparator
            if (r1 == 0) goto L16
            java.lang.String r2 = "comparator"
            r0.add(r2, r1)
        L16:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.common.graph.ElementOrder.Type type() {
            r1 = this;
            com.google.common.graph.ElementOrder$Type r0 = r1.type
            return r0
    }
}
