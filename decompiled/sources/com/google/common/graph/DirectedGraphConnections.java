package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private static final java.lang.Object PRED = null;
    private final java.util.Map<N, java.lang.Object> adjacentNodeValues;

    @javax.annotation.CheckForNull
    private final java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;








    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$8, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass8 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;

        static {
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.graph.DirectedGraphConnections.AnonymousClass8.$SwitchMap$com$google$common$graph$ElementOrder$Type = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.graph.DirectedGraphConnections.AnonymousClass8.$SwitchMap$com$google$common$graph$ElementOrder$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class NodeConnection<N> {
        public final N node;

        /* JADX INFO: loaded from: classes.dex */
        public static final class Pred<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            public Pred(N r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred
                    if (r0 == 0) goto Lf
                    N r0 = r1.node
                    com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred r2 = (com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) r2
                    N r2 = r2.node
                    boolean r2 = r0.equals(r2)
                    return r2
                Lf:
                    r2 = 0
                    return r2
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class<com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred> r0 = com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred.class
                    int r0 = r0.hashCode()
                    N r1 = r2.node
                    int r1 = r1.hashCode()
                    int r1 = r1 + r0
                    return r1
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public static final class Succ<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            public Succ(N r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ
                    if (r0 == 0) goto Lf
                    N r0 = r1.node
                    com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r2 = (com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) r2
                    N r2 = r2.node
                    boolean r2 = r0.equals(r2)
                    return r2
                Lf:
                    r2 = 0
                    return r2
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class<com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ> r0 = com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ.class
                    int r0 = r0.hashCode()
                    N r1 = r2.node
                    int r1 = r1.hashCode()
                    int r1 = r1 + r0
                    return r1
            }
        }

        public NodeConnection(N r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                r0.node = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PredAndSucc {
        private final java.lang.Object successorValue;

        public PredAndSucc(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.successorValue = r1
                return
        }

        public static /* synthetic */ java.lang.Object access$600(com.google.common.graph.DirectedGraphConnections.PredAndSucc r0) {
                java.lang.Object r0 = r0.successorValue
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.common.graph.DirectedGraphConnections.PRED = r0
            return
    }

    private DirectedGraphConnections(java.util.Map<N, java.lang.Object> r2, @javax.annotation.CheckForNull java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map r0 = (java.util.Map) r0
            r1.adjacentNodeValues = r0
            r1.orderedNodeConnections = r3
            com.google.common.graph.Graphs.checkNonNegative(r4)
            r1.predecessorCount = r4
            com.google.common.graph.Graphs.checkNonNegative(r5)
            r1.successorCount = r5
            int r3 = r2.size()
            if (r4 > r3) goto L25
            int r2 = r2.size()
            if (r5 > r2) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            com.google.common.base.Preconditions.checkState(r2)
            return
    }

    public static /* synthetic */ java.util.List access$000(com.google.common.graph.DirectedGraphConnections r0) {
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r0 = r0.orderedNodeConnections
            return r0
    }

    public static /* synthetic */ java.util.Map access$100(com.google.common.graph.DirectedGraphConnections r0) {
            java.util.Map<N, java.lang.Object> r0 = r0.adjacentNodeValues
            return r0
    }

    public static /* synthetic */ boolean access$200(java.lang.Object r0) {
            boolean r0 = isPredecessor(r0)
            return r0
    }

    public static /* synthetic */ int access$300(com.google.common.graph.DirectedGraphConnections r0) {
            int r0 = r0.predecessorCount
            return r0
    }

    public static /* synthetic */ boolean access$400(java.lang.Object r0) {
            boolean r0 = isSuccessor(r0)
            return r0
    }

    public static /* synthetic */ int access$500(com.google.common.graph.DirectedGraphConnections r0) {
            int r0 = r0.successorCount
            return r0
    }

    private static boolean isPredecessor(@javax.annotation.CheckForNull java.lang.Object r1) {
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r1 == r0) goto Lb
            boolean r1 = r1 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private static boolean isSuccessor(@javax.annotation.CheckForNull java.lang.Object r1) {
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r1 == r0) goto L8
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> r4) {
            int[] r0 = com.google.common.graph.DirectedGraphConnections.AnonymousClass8.$SwitchMap$com$google$common$graph$ElementOrder$Type
            com.google.common.graph.ElementOrder$Type r1 = r4.type()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 != r1) goto L18
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L23
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            com.google.common.graph.ElementOrder$Type r4 = r4.type()
            r0.<init>(r4)
            throw r0
        L22:
            r4 = 0
        L23:
            com.google.common.graph.DirectedGraphConnections r0 = new com.google.common.graph.DirectedGraphConnections
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 4
            r1.<init>(r3, r2)
            r2 = 0
            r0.<init>(r1, r4, r2, r2)
            return r0
    }

    public static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> ofImmutable(N r9, java.lang.Iterable<com.google.common.graph.EndpointPair<N>> r10, com.google.common.base.Function<N, V> r11) {
            com.google.common.base.Preconditions.checkNotNull(r9)
            com.google.common.base.Preconditions.checkNotNull(r11)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r10 = r10.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
        L16:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r10.next()
            com.google.common.graph.EndpointPair r5 = (com.google.common.graph.EndpointPair) r5
            java.lang.Object r6 = r5.nodeU()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.nodeV()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L57
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r5 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            java.lang.Object r6 = r11.apply(r9)
            r5.<init>(r6)
            r0.put(r9, r5)
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred r5 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred
            r5.<init>(r9)
            r1.add(r5)
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r5 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ
            r5.<init>(r9)
            r1.add(r5)
            int r3 = r3 + 1
        L54:
            int r4 = r4 + 1
            goto L16
        L57:
            java.lang.Object r6 = r5.nodeV()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L80
            java.lang.Object r5 = r5.nodeU()
            java.lang.Object r6 = com.google.common.graph.DirectedGraphConnections.PRED
            java.lang.Object r6 = r0.put(r5, r6)
            if (r6 == 0) goto L75
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r7 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r7.<init>(r6)
            r0.put(r5, r7)
        L75:
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred r6 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred
            r6.<init>(r5)
            r1.add(r6)
            int r3 = r3 + 1
            goto L16
        L80:
            java.lang.Object r6 = r5.nodeU()
            boolean r6 = r6.equals(r9)
            com.google.common.base.Preconditions.checkArgument(r6)
            java.lang.Object r5 = r5.nodeV()
            java.lang.Object r6 = r11.apply(r5)
            java.lang.Object r7 = r0.put(r5, r6)
            if (r7 == 0) goto Lab
            java.lang.Object r8 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r7 != r8) goto L9f
            r7 = 1
            goto La0
        L9f:
            r7 = 0
        La0:
            com.google.common.base.Preconditions.checkArgument(r7)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r7 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r7.<init>(r6)
            r0.put(r5, r7)
        Lab:
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r6 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ
            r6.<init>(r5)
            r1.add(r6)
            goto L54
        Lb4:
            com.google.common.graph.DirectedGraphConnections r9 = new com.google.common.graph.DirectedGraphConnections
            com.google.common.collect.ImmutableList r10 = r1.build()
            r9.<init>(r0, r10, r3, r4)
            return r9
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N r5, V r6) {
            r4 = this;
            java.util.Map<N, java.lang.Object> r6 = r4.adjacentNodeValues
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            java.lang.Object r6 = r6.put(r5, r0)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto Le
        Lc:
            r1 = 1
            goto L25
        Le:
            boolean r3 = r6 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r3 == 0) goto L18
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            r0.put(r5, r6)
            goto L25
        L18:
            if (r6 == r0) goto L25
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r1 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r1.<init>(r6)
            r0.put(r5, r1)
            goto Lc
        L25:
            if (r1 == 0) goto L3b
            int r6 = r4.predecessorCount
            int r6 = r6 + r2
            r4.predecessorCount = r6
            com.google.common.graph.Graphs.checkPositive(r6)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r6 = r4.orderedNodeConnections
            if (r6 == 0) goto L3b
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred r0 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred
            r0.<init>(r5)
            r6.add(r0)
        L3b:
            return
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V addSuccessor(N r5, V r6) {
            r4 = this;
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            java.lang.Object r0 = r0.put(r5, r6)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L2f
        Lb:
            boolean r2 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r2 == 0) goto L20
            java.util.Map<N, java.lang.Object> r2 = r4.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r3 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r3.<init>(r6)
            r2.put(r5, r3)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$600(r0)
            goto L2f
        L20:
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r2) goto L2f
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r2.<init>(r6)
            r0.put(r5, r2)
            goto L9
        L2f:
            if (r0 != 0) goto L46
            int r6 = r4.successorCount
            int r6 = r6 + 1
            r4.successorCount = r6
            com.google.common.graph.Graphs.checkPositive(r6)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r6 = r4.orderedNodeConnections
            if (r6 == 0) goto L46
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r2 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ
            r2.<init>(r5)
            r6.add(r2)
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r0
        L4a:
            return r1
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
            r1 = this;
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r0 = r1.orderedNodeConnections
            if (r0 != 0) goto Lf
            java.util.Map<N, java.lang.Object> r0 = r1.adjacentNodeValues
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        Lf:
            com.google.common.graph.DirectedGraphConnections$1 r0 = new com.google.common.graph.DirectedGraphConnections$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(N r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r0 = r3.orderedNodeConnections
            if (r0 != 0) goto L2e
            java.util.Set r0 = r3.predecessors()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.graph.DirectedGraphConnections$4 r1 = new com.google.common.graph.DirectedGraphConnections$4
            r1.<init>(r4)
            java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
            java.util.Set r1 = r3.successors()
            java.util.Iterator r1 = r1.iterator()
            com.google.common.graph.DirectedGraphConnections$5 r2 = new com.google.common.graph.DirectedGraphConnections$5
            r2.<init>(r4)
            java.util.Iterator r4 = com.google.common.collect.Iterators.transform(r1, r2)
            java.util.Iterator r4 = com.google.common.collect.Iterators.concat(r0, r4)
            goto L3b
        L2e:
            java.util.Iterator r0 = r0.iterator()
            com.google.common.graph.DirectedGraphConnections$6 r1 = new com.google.common.graph.DirectedGraphConnections$6
            r1.<init>(r4)
            java.util.Iterator r4 = com.google.common.collect.Iterators.transform(r0, r1)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.google.common.graph.DirectedGraphConnections$7 r1 = new com.google.common.graph.DirectedGraphConnections$7
            r1.<init>(r4, r0)
            return r1
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            com.google.common.graph.DirectedGraphConnections$2 r0 = new com.google.common.graph.DirectedGraphConnections$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.Map<N, java.lang.Object> r0 = r3.adjacentNodeValues
            java.lang.Object r0 = r0.get(r4)
            java.lang.Object r1 = com.google.common.graph.DirectedGraphConnections.PRED
            r2 = 1
            if (r0 != r1) goto L15
            java.util.Map<N, java.lang.Object> r0 = r3.adjacentNodeValues
            r0.remove(r4)
        L13:
            r0 = 1
            goto L26
        L15:
            boolean r1 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r1 == 0) goto L25
            java.util.Map<N, java.lang.Object> r1 = r3.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$600(r0)
            r1.put(r4, r0)
            goto L13
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L3c
            int r0 = r3.predecessorCount
            int r0 = r0 - r2
            r3.predecessorCount = r0
            com.google.common.graph.Graphs.checkNonNegative(r0)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r0 = r3.orderedNodeConnections
            if (r0 == 0) goto L3c
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred r1 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred
            r1.<init>(r4)
            r0.remove(r1)
        L3c:
            return
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V removeSuccessor(java.lang.Object r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            java.lang.Object r0 = r0.get(r5)
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r2) goto L11
            goto L27
        L11:
            boolean r3 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r3 == 0) goto L21
            java.util.Map<N, java.lang.Object> r3 = r4.adjacentNodeValues
            r3.put(r5, r2)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$600(r0)
            goto L28
        L21:
            java.util.Map<N, java.lang.Object> r2 = r4.adjacentNodeValues
            r2.remove(r5)
            goto L28
        L27:
            r0 = r1
        L28:
            if (r0 == 0) goto L3f
            int r2 = r4.successorCount
            int r2 = r2 + (-1)
            r4.successorCount = r2
            com.google.common.graph.Graphs.checkNonNegative(r2)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r2 = r4.orderedNodeConnections
            if (r2 == 0) goto L3f
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r3 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ
            r3.<init>(r5)
            r2.remove(r3)
        L3f:
            if (r0 != 0) goto L42
            goto L43
        L42:
            r1 = r0
        L43:
            return r1
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
            r1 = this;
            com.google.common.graph.DirectedGraphConnections$3 r0 = new com.google.common.graph.DirectedGraphConnections$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V value(N r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map<N, java.lang.Object> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r2 != r0) goto Lf
            r2 = 0
            return r2
        Lf:
            boolean r0 = r2 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r0 == 0) goto L19
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r2
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$600(r2)
        L19:
            return r2
    }
}
