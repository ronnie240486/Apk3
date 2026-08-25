package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements java.lang.Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    /* JADX INFO: renamed from: com.google.common.graph.EndpointPair$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Ordered<N> extends com.google.common.graph.EndpointPair<N> {
        private Ordered(N r2, N r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public /* synthetic */ Ordered(java.lang.Object r1, java.lang.Object r2, com.google.common.graph.EndpointPair.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.common.graph.EndpointPair
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.common.graph.EndpointPair r5 = (com.google.common.graph.EndpointPair) r5
                boolean r1 = r4.isOrdered()
                boolean r3 = r5.isOrdered()
                if (r1 == r3) goto L17
                return r2
            L17:
                java.lang.Object r1 = r4.source()
                java.lang.Object r3 = r5.source()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L34
                java.lang.Object r1 = r4.target()
                java.lang.Object r5 = r5.target()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L34
                goto L35
            L34:
                r0 = 0
            L35:
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Object r1 = r3.source()
                r2 = 0
                r0[r2] = r1
                java.lang.Object r1 = r3.target()
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
                r1 = this;
                java.lang.Object r0 = r1.nodeU()
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
                r1 = this;
                java.lang.Object r0 = r1.nodeV()
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.Object r0 = r5.source()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.Object r1 = r5.target()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 6
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "<"
                java.lang.String r4 = " -> "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ">"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class Unordered<N> extends com.google.common.graph.EndpointPair<N> {
        private Unordered(N r2, N r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public /* synthetic */ Unordered(java.lang.Object r1, java.lang.Object r2, com.google.common.graph.EndpointPair.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.common.graph.EndpointPair
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.common.graph.EndpointPair r5 = (com.google.common.graph.EndpointPair) r5
                boolean r1 = r4.isOrdered()
                boolean r3 = r5.isOrdered()
                if (r1 == r3) goto L17
                return r2
            L17:
                java.lang.Object r1 = r4.nodeU()
                java.lang.Object r3 = r5.nodeU()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L32
                java.lang.Object r0 = r4.nodeV()
                java.lang.Object r5 = r5.nodeV()
                boolean r5 = r0.equals(r5)
                return r5
            L32:
                java.lang.Object r1 = r4.nodeU()
                java.lang.Object r3 = r5.nodeV()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4f
                java.lang.Object r1 = r4.nodeV()
                java.lang.Object r5 = r5.nodeU()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L4f
                goto L50
            L4f:
                r0 = 0
            L50:
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.nodeU()
                int r0 = r0.hashCode()
                java.lang.Object r1 = r2.nodeV()
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't."
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.Object r0 = r5.nodeU()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.Object r1 = r5.nodeV()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 4
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "["
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private EndpointPair(N r1, N r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.nodeU = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.nodeV = r1
            return
    }

    public /* synthetic */ EndpointPair(java.lang.Object r1, java.lang.Object r2, com.google.common.graph.EndpointPair.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <N> com.google.common.graph.EndpointPair<N> of(com.google.common.graph.Network<?, ?> r0, N r1, N r2) {
            boolean r0 = r0.isDirected()
            if (r0 == 0) goto Lb
            com.google.common.graph.EndpointPair r0 = ordered(r1, r2)
            goto Lf
        Lb:
            com.google.common.graph.EndpointPair r0 = unordered(r1, r2)
        Lf:
            return r0
    }

    public static <N> com.google.common.graph.EndpointPair<N> ordered(N r2, N r3) {
            com.google.common.graph.EndpointPair$Ordered r0 = new com.google.common.graph.EndpointPair$Ordered
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <N> com.google.common.graph.EndpointPair<N> unordered(N r2, N r3) {
            com.google.common.graph.EndpointPair$Unordered r0 = new com.google.common.graph.EndpointPair$Unordered
            r1 = 0
            r0.<init>(r3, r2, r1)
            return r0
    }

    public final N adjacentNode(N r6) {
            r5 = this;
            N r0 = r5.nodeU
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            N r6 = r5.nodeV
            return r6
        Lb:
            N r0 = r5.nodeV
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L16
            N r6 = r5.nodeU
            return r6
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r2 = r1.length()
            int r2 = r2 + 36
            int r3 = r6.length()
            int r3 = r3 + r2
            java.lang.String r2 = "EndpointPair "
            java.lang.String r4 = " does not contain node "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2, r1, r4, r6)
            r0.<init>(r6)
            throw r0
    }

    public abstract boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    @Override // java.lang.Iterable
    public final com.google.common.collect.UnmodifiableIterator<N> iterator() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            N r1 = r3.nodeU
            r2 = 0
            r0[r2] = r1
            N r1 = r3.nodeV
            r2 = 1
            r0[r2] = r1
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.forArray(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    public final N nodeU() {
            r1 = this;
            N r0 = r1.nodeU
            return r0
    }

    public final N nodeV() {
            r1 = this;
            N r0 = r1.nodeV
            return r0
    }

    public abstract N source();

    public abstract N target();
}
