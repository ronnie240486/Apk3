package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
abstract class CollectionFuture<V, C> extends com.google.common.util.concurrent.AggregateFuture<V, C> {

    @javax.annotation.CheckForNull
    private java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> values;

    public static final class ListFuture<V> extends com.google.common.util.concurrent.CollectionFuture<V, java.util.List<V>> {
        public ListFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r1, boolean r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.init()
                return
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public /* bridge */ /* synthetic */ java.lang.Object combine(java.util.List r1) {
                r0 = this;
                java.util.List r1 = r0.combine(r1)
                return r1
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public java.util.List<V> combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> r3) {
                r2 = this;
                int r0 = r3.size()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r3.next()
                com.google.common.util.concurrent.CollectionFuture$Present r1 = (com.google.common.util.concurrent.CollectionFuture.Present) r1
                if (r1 == 0) goto L1d
                V r1 = r1.value
                goto L1e
            L1d:
                r1 = 0
            L1e:
                r0.add(r1)
                goto Lc
            L22:
                java.util.List r3 = java.util.Collections.unmodifiableList(r0)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Present<V> {
        public V value;

        public Present(V r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }
    }

    public CollectionFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3, boolean r4) {
            r2 = this;
            r0 = 1
            r2.<init>(r3, r4, r0)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lf
            java.util.List r4 = java.util.Collections.emptyList()
            goto L17
        Lf:
            int r4 = r3.size()
            java.util.ArrayList r4 = com.google.common.collect.Lists.newArrayListWithCapacity(r4)
        L17:
            r0 = 0
        L18:
            int r1 = r3.size()
            if (r0 >= r1) goto L25
            r1 = 0
            r4.add(r1)
            int r0 = r0 + 1
            goto L18
        L25:
            r2.values = r4
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int r3, @com.google.common.util.concurrent.ParametricNullness V r4) {
            r2 = this;
            java.util.List<com.google.common.util.concurrent.CollectionFuture$Present<V>> r0 = r2.values
            if (r0 == 0) goto Lc
            com.google.common.util.concurrent.CollectionFuture$Present r1 = new com.google.common.util.concurrent.CollectionFuture$Present
            r1.<init>(r4)
            r0.set(r3, r1)
        Lc:
            return
    }

    public abstract C combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> r1);

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
            r1 = this;
            java.util.List<com.google.common.util.concurrent.CollectionFuture$Present<V>> r0 = r1.values
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.combine(r0)
            r1.set(r0)
        Lb:
            return
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason r1) {
            r0 = this;
            super.releaseResources(r1)
            r1 = 0
            r0.values = r1
            return
    }
}
