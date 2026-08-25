package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {

    @javax.annotation.CheckForNull
    private T next;
    private com.google.common.collect.AbstractIterator.State state;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State = null;

        static {
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$collect$AbstractIterator$State = r0
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$collect$AbstractIterator$State     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static final enum State extends java.lang.Enum<com.google.common.collect.AbstractIterator.State> {
        private static final /* synthetic */ com.google.common.collect.AbstractIterator.State[] $VALUES = null;
        public static final com.google.common.collect.AbstractIterator.State DONE = null;
        public static final com.google.common.collect.AbstractIterator.State FAILED = null;
        public static final com.google.common.collect.AbstractIterator.State NOT_READY = null;
        public static final com.google.common.collect.AbstractIterator.State READY = null;

        private static /* synthetic */ com.google.common.collect.AbstractIterator.State[] $values() {
                r0 = 4
                com.google.common.collect.AbstractIterator$State[] r0 = new com.google.common.collect.AbstractIterator.State[r0]
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.NOT_READY
                r2 = 1
                r0[r2] = r1
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE
                r2 = 2
                r0[r2] = r1
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.FAILED
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.AbstractIterator$State r0 = new com.google.common.collect.AbstractIterator$State
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.AbstractIterator.State.READY = r0
                com.google.common.collect.AbstractIterator$State r0 = new com.google.common.collect.AbstractIterator$State
                java.lang.String r1 = "NOT_READY"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.collect.AbstractIterator.State.NOT_READY = r0
                com.google.common.collect.AbstractIterator$State r0 = new com.google.common.collect.AbstractIterator$State
                java.lang.String r1 = "DONE"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.collect.AbstractIterator.State.DONE = r0
                com.google.common.collect.AbstractIterator$State r0 = new com.google.common.collect.AbstractIterator$State
                java.lang.String r1 = "FAILED"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.common.collect.AbstractIterator.State.FAILED = r0
                com.google.common.collect.AbstractIterator$State[] r0 = $values()
                com.google.common.collect.AbstractIterator.State.$VALUES = r0
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.AbstractIterator.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.AbstractIterator$State> r0 = com.google.common.collect.AbstractIterator.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.AbstractIterator$State r1 = (com.google.common.collect.AbstractIterator.State) r1
                return r1
        }

        public static com.google.common.collect.AbstractIterator.State[] values() {
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.AbstractIterator$State[] r0 = (com.google.common.collect.AbstractIterator.State[]) r0
                return r0
        }
    }

    public AbstractIterator() {
            r1 = this;
            r1.<init>()
            com.google.common.collect.AbstractIterator$State r0 = com.google.common.collect.AbstractIterator.State.NOT_READY
            r1.state = r0
            return
    }

    private boolean tryToComputeNext() {
            r2 = this;
            com.google.common.collect.AbstractIterator$State r0 = com.google.common.collect.AbstractIterator.State.FAILED
            r2.state = r0
            java.lang.Object r0 = r2.computeNext()
            r2.next = r0
            com.google.common.collect.AbstractIterator$State r0 = r2.state
            com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE
            if (r0 == r1) goto L16
            com.google.common.collect.AbstractIterator$State r0 = com.google.common.collect.AbstractIterator.State.READY
            r2.state = r0
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @javax.annotation.CheckForNull
    public abstract T computeNext();

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final void endOfData() {
            r1 = this;
            com.google.common.collect.AbstractIterator$State r0 = com.google.common.collect.AbstractIterator.State.DONE
            r1.state = r0
            return
    }

    @Override // java.util.Iterator
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean hasNext() {
            r4 = this;
            com.google.common.collect.AbstractIterator$State r0 = r4.state
            com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.FAILED
            r2 = 0
            r3 = 1
            if (r0 == r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            int[] r0 = com.google.common.collect.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$collect$AbstractIterator$State
            com.google.common.collect.AbstractIterator$State r1 = r4.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L23
            r1 = 2
            if (r0 == r1) goto L22
            boolean r0 = r4.tryToComputeNext()
            return r0
        L22:
            return r3
        L23:
            return r2
    }

    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L10
            com.google.common.collect.AbstractIterator$State r0 = com.google.common.collect.AbstractIterator.State.NOT_READY
            r2.state = r0
            T r0 = r2.next
            r1 = 0
            r2.next = r1
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @com.google.common.collect.ParametricNullness
    public final T peek() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9
            T r0 = r1.next
            return r0
        L9:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
