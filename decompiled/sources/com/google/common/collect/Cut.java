package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class Cut<C extends java.lang.Comparable> implements java.lang.Comparable<com.google.common.collect.Cut<C>>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final C endpoint;

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;

        static {
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static final class AboveAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.AboveAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.Cut$AboveAll r0 = new com.google.common.collect.Cut$AboveAll
                r0.<init>()
                com.google.common.collect.Cut.AboveAll.INSTANCE = r0
                return
        }

        private AboveAll() {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r0)
                return
        }

        public static /* synthetic */ com.google.common.collect.Cut.AboveAll access$100() {
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> r1) {
                r0 = this;
                if (r1 != r0) goto L4
                r1 = 0
                goto L5
            L4:
                r1 = 1
            L5:
                return r1
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(java.lang.StringBuilder r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = "+∞)"
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> endpoint() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "range unbounded on this side"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.Comparable r1 = r1.maxValue()
                return r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                int r0 = java.lang.System.identityHashCode(r1)
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(java.lang.Comparable<?> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "+∞"
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsLowerBound() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "this statement should be unreachable"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "this statement should be unreachable"
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }
    }

    public static final class AboveValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        public AboveValue(C r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                java.lang.Comparable r2 = r2.next(r0)
                if (r2 == 0) goto Le
                com.google.common.collect.Cut$BelowValue r0 = new com.google.common.collect.Cut$BelowValue
                r0.<init>(r2)
                goto L12
            Le:
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.access$100()
            L12:
                return r0
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = super.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                r0 = 40
                r2.append(r0)
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                r0 = 93
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        public final C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                C extends java.lang.Comparable r1 = r0.endpoint
                return r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r0 = r0.hashCode()
                int r0 = ~r0
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(C r3) {
                r2 = this;
                C extends java.lang.Comparable r0 = r2.endpoint
                int r1 = com.google.common.collect.Range.$r8$clinit
                int r3 = r0.compareTo(r3)
                if (r3 >= 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                return r3
        }

        @Override // com.google.common.collect.Cut
        @javax.annotation.CheckForNull
        public final C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                java.lang.Comparable r2 = r2.next(r0)
                return r2
        }

        public java.lang.String toString() {
                r4 = this;
                C extends java.lang.Comparable r0 = r4.endpoint
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 2
                java.lang.String r2 = "/"
                java.lang.String r3 = "\\"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L15
                r3 = 2
                if (r2 != r3) goto Lf
                return r1
            Lf:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L15:
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.next(r2)
                if (r2 != 0) goto L22
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                goto L28
            L22:
                com.google.common.collect.Cut$BelowValue r3 = new com.google.common.collect.Cut$BelowValue
                r3.<init>(r2)
                r2 = r3
            L28:
                return r2
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L28
                r0 = 2
                if (r2 != r0) goto L22
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.next(r2)
                if (r2 != 0) goto L1b
                com.google.common.collect.Cut$AboveAll r2 = com.google.common.collect.Cut.AboveAll.access$100()
                goto L21
            L1b:
                com.google.common.collect.Cut$BelowValue r3 = new com.google.common.collect.Cut$BelowValue
                r3.<init>(r2)
                r2 = r3
            L21:
                return r2
            L22:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L28:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class BelowAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.BelowAll INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.Cut$BelowAll r0 = new com.google.common.collect.Cut$BelowAll
                r0.<init>()
                com.google.common.collect.Cut.BelowAll.INSTANCE = r0
                return
        }

        private BelowAll() {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r0)
                return
        }

        public static /* synthetic */ com.google.common.collect.Cut.BelowAll access$000() {
                com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<java.lang.Comparable<?>> canonical(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r1 = this;
                java.lang.Comparable r2 = r2.minValue()     // Catch: java.util.NoSuchElementException -> La
                com.google.common.collect.Cut$BelowValue r0 = new com.google.common.collect.Cut$BelowValue     // Catch: java.util.NoSuchElementException -> La
                r0.<init>(r2)     // Catch: java.util.NoSuchElementException -> La
                return r0
            La:
                return r1
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> r1) {
                r0 = this;
                if (r1 != r0) goto L4
                r1 = 0
                goto L5
            L4:
                r1 = -1
            L5:
                return r1
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = "(-∞"
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(java.lang.StringBuilder r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> endpoint() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "range unbounded on this side"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                int r0 = java.lang.System.identityHashCode(r1)
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(java.lang.Comparable<?> r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r1) {
                r0 = this;
                java.lang.Comparable r1 = r1.minValue()
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "-∞"
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsUpperBound() {
                r2 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "this statement should be unreachable"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "this statement should be unreachable"
                r1.<init>(r2)
                throw r1
        }
    }

    public static final class BelowValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        public BelowValue(C r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                int r1 = super.compareTo(r1)
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(java.lang.StringBuilder r2) {
                r1 = this;
                r0 = 91
                r2.append(r0)
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(java.lang.StringBuilder r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                r2.append(r0)
                r0 = 41
                r2.append(r0)
                return
        }

        @Override // com.google.common.collect.Cut
        @javax.annotation.CheckForNull
        public final C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r2) {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                java.lang.Comparable r2 = r2.previous(r0)
                return r2
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
                r1 = this;
                C extends java.lang.Comparable r0 = r1.endpoint
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(C r3) {
                r2 = this;
                C extends java.lang.Comparable r0 = r2.endpoint
                int r1 = com.google.common.collect.Range.$r8$clinit
                int r3 = r0.compareTo(r3)
                if (r3 > 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                return r3
        }

        @Override // com.google.common.collect.Cut
        public final C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                C extends java.lang.Comparable r1 = r0.endpoint
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                C extends java.lang.Comparable r0 = r4.endpoint
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 2
                java.lang.String r2 = "\\"
                java.lang.String r3 = "/"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsLowerBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.BoundType typeAsUpperBound() {
                r1 = this;
                com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
                return r0
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L28
                r0 = 2
                if (r2 != r0) goto L22
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.previous(r2)
                if (r2 != 0) goto L1b
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                goto L21
            L1b:
                com.google.common.collect.Cut$AboveValue r3 = new com.google.common.collect.Cut$AboveValue
                r3.<init>(r2)
                r2 = r3
            L21:
                return r2
            L22:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L28:
                return r1
        }

        @Override // com.google.common.collect.Cut
        public final com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r2, com.google.common.collect.DiscreteDomain<C> r3) {
                r1 = this;
                int[] r0 = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L15
                r3 = 2
                if (r2 != r3) goto Lf
                return r1
            Lf:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L15:
                C extends java.lang.Comparable r2 = r1.endpoint
                java.lang.Comparable r2 = r3.previous(r2)
                if (r2 != 0) goto L22
                com.google.common.collect.Cut$AboveAll r2 = com.google.common.collect.Cut.AboveAll.access$100()
                goto L28
            L22:
                com.google.common.collect.Cut$AboveValue r3 = new com.google.common.collect.Cut$AboveValue
                r3.<init>(r2)
                r2 = r3
            L28:
                return r2
        }
    }

    public Cut(C r1) {
            r0 = this;
            r0.<init>()
            r0.endpoint = r1
            return
    }

    public com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> r1) {
            r0 = this;
            return r0
    }

    public int compareTo(com.google.common.collect.Cut<C> r4) {
            r3 = this;
            com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.access$000()
            if (r4 != r0) goto L8
            r4 = 1
            return r4
        L8:
            com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.access$100()
            if (r4 != r0) goto L10
            r4 = -1
            return r4
        L10:
            C extends java.lang.Comparable r0 = r3.endpoint
            C extends java.lang.Comparable r1 = r4.endpoint
            int r2 = com.google.common.collect.Range.$r8$clinit
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1d
            return r0
        L1d:
            boolean r0 = r3 instanceof com.google.common.collect.Cut.AboveValue
            boolean r4 = r4 instanceof com.google.common.collect.Cut.AboveValue
            int r4 = com.google.common.primitives.Booleans.compare(r0, r4)
            return r4
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public abstract void describeAsLowerBound(java.lang.StringBuilder r1);

    public abstract void describeAsUpperBound(java.lang.StringBuilder r1);

    public C endpoint() {
            r1 = this;
            C extends java.lang.Comparable r0 = r1.endpoint
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.common.collect.Cut
            r1 = 0
            if (r0 == 0) goto Le
            com.google.common.collect.Cut r3 = (com.google.common.collect.Cut) r3
            int r3 = r2.compareTo(r3)     // Catch: java.lang.ClassCastException -> Le
            if (r3 != 0) goto Le
            r1 = 1
        Le:
            return r1
    }

    @javax.annotation.CheckForNull
    public abstract C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> r1);

    public abstract int hashCode();

    public abstract boolean isLessThan(C r1);

    @javax.annotation.CheckForNull
    public abstract C leastValueAbove(com.google.common.collect.DiscreteDomain<C> r1);

    public abstract com.google.common.collect.BoundType typeAsLowerBound();

    public abstract com.google.common.collect.BoundType typeAsUpperBound();

    public abstract com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<C> r2);

    public abstract com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType r1, com.google.common.collect.DiscreteDomain<C> r2);
}
