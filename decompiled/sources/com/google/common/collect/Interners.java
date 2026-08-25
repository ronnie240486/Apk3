package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Interners {

    /* JADX INFO: renamed from: com.google.common.collect.Interners$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class InternerBuilder {
        private final com.google.common.collect.MapMaker mapMaker;
        private boolean strong;

        private InternerBuilder() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
                r0.<init>()
                r1.mapMaker = r0
                r0 = 1
                r1.strong = r0
                return
        }

        public /* synthetic */ InternerBuilder(com.google.common.collect.Interners.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public <E> com.google.common.collect.Interner<E> build() {
                r3 = this;
                boolean r0 = r3.strong
                if (r0 != 0) goto L9
                com.google.common.collect.MapMaker r0 = r3.mapMaker
                r0.weakKeys()
            L9:
                com.google.common.collect.Interners$InternerImpl r0 = new com.google.common.collect.Interners$InternerImpl
                com.google.common.collect.MapMaker r1 = r3.mapMaker
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        public com.google.common.collect.Interners.InternerBuilder concurrencyLevel(int r2) {
                r1 = this;
                com.google.common.collect.MapMaker r0 = r1.mapMaker
                r0.concurrencyLevel(r2)
                return r1
        }

        public com.google.common.collect.Interners.InternerBuilder strong() {
                r1 = this;
                r0 = 1
                r1.strong = r0
                return r1
        }

        @com.google.common.annotations.GwtIncompatible("java.lang.ref.WeakReference")
        public com.google.common.collect.Interners.InternerBuilder weak() {
                r1 = this;
                r0 = 0
                r1.strong = r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class InternerFunction<E> implements com.google.common.base.Function<E, E> {
        private final com.google.common.collect.Interner<E> interner;

        public InternerFunction(com.google.common.collect.Interner<E> r1) {
                r0 = this;
                r0.<init>()
                r0.interner = r1
                return
        }

        @Override // com.google.common.base.Function
        public E apply(E r2) {
                r1 = this;
                com.google.common.collect.Interner<E> r0 = r1.interner
                java.lang.Object r2 = r0.intern(r2)
                return r2
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.collect.Interners.InternerFunction
                if (r0 == 0) goto Lf
                com.google.common.collect.Interners$InternerFunction r2 = (com.google.common.collect.Interners.InternerFunction) r2
                com.google.common.collect.Interner<E> r0 = r1.interner
                com.google.common.collect.Interner<E> r2 = r2.interner
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.collect.Interner<E> r0 = r1.interner
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static final class InternerImpl<E> implements com.google.common.collect.Interner<E> {

        @com.google.common.annotations.VisibleForTesting
        public final com.google.common.collect.MapMakerInternalMap<E, com.google.common.collect.MapMaker.Dummy, ?, ?> map;

        private InternerImpl(com.google.common.collect.MapMaker r2) {
                r1 = this;
                r1.<init>()
                com.google.common.base.Equivalence r0 = com.google.common.base.Equivalence.equals()
                r2.keyEquivalence(r0)
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.createWithDummyValues(r2)
                r1.map = r2
                return
        }

        public /* synthetic */ InternerImpl(com.google.common.collect.MapMaker r1, com.google.common.collect.Interners.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Interner
        public E intern(E r3) {
                r2 = this;
            L0:
                com.google.common.collect.MapMakerInternalMap<E, com.google.common.collect.MapMaker$Dummy, ?, ?> r0 = r2.map
                java.util.Objects.requireNonNull(r0)
                if (r3 != 0) goto L9
                r0 = 0
                goto L15
            L9:
                int r1 = r0.hash(r3)
                com.google.common.collect.MapMakerInternalMap$Segment r0 = r0.segmentFor(r1)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r0.getEntry(r3, r1)
            L15:
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r0.getKey()
                if (r0 == 0) goto L1e
                return r0
            L1e:
                com.google.common.collect.MapMakerInternalMap<E, com.google.common.collect.MapMaker$Dummy, ?, ?> r0 = r2.map
                com.google.common.collect.MapMaker$Dummy r1 = com.google.common.collect.MapMaker.Dummy.VALUE
                java.lang.Object r0 = r0.putIfAbsent(r3, r1)
                com.google.common.collect.MapMaker$Dummy r0 = (com.google.common.collect.MapMaker.Dummy) r0
                if (r0 != 0) goto L0
                return r3
        }
    }

    private Interners() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> com.google.common.base.Function<E, E> asFunction(com.google.common.collect.Interner<E> r1) {
            com.google.common.collect.Interners$InternerFunction r0 = new com.google.common.collect.Interners$InternerFunction
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Interner r1 = (com.google.common.collect.Interner) r1
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.collect.Interners.InternerBuilder newBuilder() {
            com.google.common.collect.Interners$InternerBuilder r0 = new com.google.common.collect.Interners$InternerBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.Interner<E> newStrongInterner() {
            com.google.common.collect.Interners$InternerBuilder r0 = newBuilder()
            com.google.common.collect.Interners$InternerBuilder r0 = r0.strong()
            com.google.common.collect.Interner r0 = r0.build()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> com.google.common.collect.Interner<E> newWeakInterner() {
            com.google.common.collect.Interners$InternerBuilder r0 = newBuilder()
            com.google.common.collect.Interners$InternerBuilder r0 = r0.weak()
            com.google.common.collect.Interner r0 = r0.build()
            return r0
    }
}
