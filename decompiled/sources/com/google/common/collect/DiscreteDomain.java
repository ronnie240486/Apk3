package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends java.lang.Comparable> {
    public final boolean supportsFastOffset;

    /* JADX INFO: renamed from: com.google.common.collect.DiscreteDomain$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class BigIntegerDomain extends com.google.common.collect.DiscreteDomain<java.math.BigInteger> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.BigIntegerDomain INSTANCE = null;
        private static final java.math.BigInteger MAX_LONG = null;
        private static final java.math.BigInteger MIN_LONG = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = new com.google.common.collect.DiscreteDomain$BigIntegerDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE = r0
                r0 = -9223372036854775808
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.MIN_LONG = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                com.google.common.collect.DiscreteDomain.BigIntegerDomain.MAX_LONG = r0
                return
        }

        public BigIntegerDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public static /* synthetic */ com.google.common.collect.DiscreteDomain.BigIntegerDomain access$300() {
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.lang.Comparable r1, java.lang.Comparable r2) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r2 = (java.math.BigInteger) r2
                long r1 = r0.distance(r1, r2)
                return r1
        }

        public long distance(java.math.BigInteger r1, java.math.BigInteger r2) {
                r0 = this;
                java.math.BigInteger r1 = r2.subtract(r1)
                java.math.BigInteger r2 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.MIN_LONG
                java.math.BigInteger r1 = r1.max(r2)
                java.math.BigInteger r2 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.MAX_LONG
                java.math.BigInteger r1 = r1.min(r2)
                long r1 = r1.longValue()
                return r1
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable next(java.lang.Comparable r1) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r1 = r0.next(r1)
                return r1
        }

        public java.math.BigInteger next(java.math.BigInteger r2) {
                r1 = this;
                java.math.BigInteger r0 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = r2.add(r0)
                return r2
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Comparable offset(java.lang.Comparable r1, long r2) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2)
                java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
                java.math.BigInteger r1 = r1.add(r2)
                return r1
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable previous(java.lang.Comparable r1) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r1 = r0.previous(r1)
                return r1
        }

        public java.math.BigInteger previous(java.math.BigInteger r2) {
                r1 = this;
                java.math.BigInteger r0 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = r2.subtract(r0)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.bigIntegers()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class IntegerDomain extends com.google.common.collect.DiscreteDomain<java.lang.Integer> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.IntegerDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = new com.google.common.collect.DiscreteDomain$IntegerDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE = r0
                return
        }

        public IntegerDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public static /* synthetic */ com.google.common.collect.DiscreteDomain.IntegerDomain access$000() {
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.lang.Comparable r1, java.lang.Comparable r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                long r1 = r0.distance(r1, r2)
                return r1
        }

        public long distance(java.lang.Integer r3, java.lang.Integer r4) {
                r2 = this;
                int r4 = r4.intValue()
                long r0 = (long) r4
                int r3 = r3.intValue()
                long r3 = (long) r3
                long r0 = r0 - r3
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable maxValue() {
                r1 = this;
                java.lang.Integer r0 = r1.maxValue()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer maxValue() {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable minValue() {
                r1 = this;
                java.lang.Integer r0 = r1.minValue()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer minValue() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Comparable next(java.lang.Comparable r1) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r1 = r0.next(r1)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.lang.Integer next(java.lang.Integer r2) {
                r1 = this;
                int r2 = r2.intValue()
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r2 != r0) goto Lb
                r2 = 0
                goto L11
            Lb:
                int r2 = r2 + 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L11:
                return r2
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Comparable offset(java.lang.Comparable r3, long r4) {
                r2 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                com.google.common.collect.CollectPreconditions.checkNonnegative(r4)
                long r0 = r3.longValue()
                long r0 = r0 + r4
                int r3 = com.google.common.primitives.Ints.checkedCast(r0)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Comparable previous(java.lang.Comparable r1) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r1 = r0.previous(r1)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.lang.Integer previous(java.lang.Integer r2) {
                r1 = this;
                int r2 = r2.intValue()
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto La
                r2 = 0
                goto L10
            La:
                int r2 = r2 + (-1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L10:
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.integers()"
                return r0
        }
    }

    public static final class LongDomain extends com.google.common.collect.DiscreteDomain<java.lang.Long> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.LongDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.collect.DiscreteDomain$LongDomain r0 = new com.google.common.collect.DiscreteDomain$LongDomain
                r0.<init>()
                com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE = r0
                return
        }

        public LongDomain() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public static /* synthetic */ com.google.common.collect.DiscreteDomain.LongDomain access$200() {
                com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(java.lang.Comparable r1, java.lang.Comparable r2) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r2 = (java.lang.Long) r2
                long r1 = r0.distance(r1, r2)
                return r1
        }

        public long distance(java.lang.Long r10, java.lang.Long r11) {
                r9 = this;
                long r0 = r11.longValue()
                long r2 = r10.longValue()
                long r0 = r0 - r2
                long r2 = r11.longValue()
                long r4 = r10.longValue()
                r6 = 0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 <= 0) goto L21
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 >= 0) goto L21
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                return r10
            L21:
                long r2 = r11.longValue()
                long r10 = r10.longValue()
                int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r4 >= 0) goto L34
                int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r10 <= 0) goto L34
                r10 = -9223372036854775808
                return r10
            L34:
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable maxValue() {
                r1 = this;
                java.lang.Long r0 = r1.maxValue()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long maxValue() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ java.lang.Comparable minValue() {
                r1 = this;
                java.lang.Long r0 = r1.minValue()
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long minValue() {
                r2 = this;
                r0 = -9223372036854775808
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Comparable next(java.lang.Comparable r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r1 = r0.next(r1)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.lang.Long next(java.lang.Long r5) {
                r4 = this;
                long r0 = r5.longValue()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Lf
                r5 = 0
                goto L16
            Lf:
                r2 = 1
                long r0 = r0 + r2
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
            L16:
                return r5
        }

        @Override // com.google.common.collect.DiscreteDomain
        public final java.lang.Comparable offset(java.lang.Comparable r5, long r6) {
                r4 = this;
                java.lang.Long r5 = (java.lang.Long) r5
                com.google.common.collect.CollectPreconditions.checkNonnegative(r6)
                long r0 = r5.longValue()
                long r0 = r0 + r6
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 >= 0) goto L20
                long r2 = r5.longValue()
                int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r5 >= 0) goto L1a
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                java.lang.String r6 = "overflow"
                com.google.common.base.Preconditions.checkArgument(r5, r6)
            L20:
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                return r5
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Comparable previous(java.lang.Comparable r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r1 = r0.previous(r1)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.lang.Long previous(java.lang.Long r5) {
                r4 = this;
                long r0 = r5.longValue()
                r2 = -9223372036854775808
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Lc
                r5 = 0
                goto L13
            Lc:
                r2 = 1
                long r0 = r0 - r2
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
            L13:
                return r5
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "DiscreteDomain.longs()"
                return r0
        }
    }

    public DiscreteDomain() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private DiscreteDomain(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.supportsFastOffset = r1
            return
    }

    public /* synthetic */ DiscreteDomain(boolean r1, com.google.common.collect.DiscreteDomain.AnonymousClass1 r2) {
            r0 = this;
            r1 = 1
            r0.<init>(r1)
            return
    }

    public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers() {
            com.google.common.collect.DiscreteDomain$BigIntegerDomain r0 = com.google.common.collect.DiscreteDomain.BigIntegerDomain.access$300()
            return r0
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers() {
            com.google.common.collect.DiscreteDomain$IntegerDomain r0 = com.google.common.collect.DiscreteDomain.IntegerDomain.access$000()
            return r0
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs() {
            com.google.common.collect.DiscreteDomain$LongDomain r0 = com.google.common.collect.DiscreteDomain.LongDomain.access$200()
            return r0
    }

    public abstract long distance(C r1, C r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public C maxValue() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public C minValue() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @javax.annotation.CheckForNull
    public abstract C next(C r1);

    public C offset(C r6, long r7) {
            r5 = this;
            com.google.common.collect.CollectPreconditions.checkNonnegative(r7)
            r0 = 0
            r2 = r6
        L6:
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L42
            java.lang.Comparable r2 = r5.next(r2)
            if (r2 == 0) goto L14
            r3 = 1
            long r0 = r0 + r3
            goto L6
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r1 = r6.length()
            int r1 = r1 + 51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "overflowed computing offset("
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = ", "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = ")"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
        L42:
            return r2
    }

    @javax.annotation.CheckForNull
    public abstract C previous(C r1);
}
