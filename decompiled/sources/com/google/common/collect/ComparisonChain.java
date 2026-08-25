package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final com.google.common.collect.ComparisonChain ACTIVE = null;
    private static final com.google.common.collect.ComparisonChain GREATER = null;
    private static final com.google.common.collect.ComparisonChain LESS = null;


    public static final class InactiveComparisonChain extends com.google.common.collect.ComparisonChain {
        public final int result;

        public InactiveComparisonChain(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.result = r2
                return
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(double r1, double r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(float r1, float r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(int r1, int r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(long r1, long r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> r1, java.lang.Comparable<?> r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> com.google.common.collect.ComparisonChain compare(@com.google.common.collect.ParametricNullness T r1, @com.google.common.collect.ParametricNullness T r2, java.util.Comparator<T> r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareFalseFirst(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareTrueFirst(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
                r1 = this;
                int r0 = r1.result
                return r0
        }
    }

    static {
            com.google.common.collect.ComparisonChain$1 r0 = new com.google.common.collect.ComparisonChain$1
            r0.<init>()
            com.google.common.collect.ComparisonChain.ACTIVE = r0
            com.google.common.collect.ComparisonChain$InactiveComparisonChain r0 = new com.google.common.collect.ComparisonChain$InactiveComparisonChain
            r1 = -1
            r0.<init>(r1)
            com.google.common.collect.ComparisonChain.LESS = r0
            com.google.common.collect.ComparisonChain$InactiveComparisonChain r0 = new com.google.common.collect.ComparisonChain$InactiveComparisonChain
            r1 = 1
            r0.<init>(r1)
            com.google.common.collect.ComparisonChain.GREATER = r0
            return
    }

    private ComparisonChain() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ ComparisonChain(com.google.common.collect.ComparisonChain.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.google.common.collect.ComparisonChain access$100() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.LESS
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ComparisonChain access$200() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.GREATER
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ComparisonChain access$300() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.ACTIVE
            return r0
    }

    public static com.google.common.collect.ComparisonChain start() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.ACTIVE
            return r0
    }

    public abstract com.google.common.collect.ComparisonChain compare(double r1, double r3);

    public abstract com.google.common.collect.ComparisonChain compare(float r1, float r2);

    public abstract com.google.common.collect.ComparisonChain compare(int r1, int r2);

    public abstract com.google.common.collect.ComparisonChain compare(long r1, long r3);

    @java.lang.Deprecated
    public final com.google.common.collect.ComparisonChain compare(java.lang.Boolean r1, java.lang.Boolean r2) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            boolean r2 = r2.booleanValue()
            com.google.common.collect.ComparisonChain r1 = r0.compareFalseFirst(r1, r2)
            return r1
    }

    public abstract com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> r1, java.lang.Comparable<?> r2);

    public abstract <T> com.google.common.collect.ComparisonChain compare(@com.google.common.collect.ParametricNullness T r1, @com.google.common.collect.ParametricNullness T r2, java.util.Comparator<T> r3);

    public abstract com.google.common.collect.ComparisonChain compareFalseFirst(boolean r1, boolean r2);

    public abstract com.google.common.collect.ComparisonChain compareTrueFirst(boolean r1, boolean r2);

    public abstract int result();
}
