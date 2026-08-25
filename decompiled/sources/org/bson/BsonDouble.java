package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BsonDouble extends org.bson.BsonNumber implements java.lang.Comparable<org.bson.BsonDouble> {
    private final double value;

    public BsonDouble(double r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonDouble r1) {
            r0 = this;
            org.bson.BsonDouble r1 = (org.bson.BsonDouble) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonDouble r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.value
            int r5 = java.lang.Double.compare(r0, r2)
            return r5
    }

    @Override // org.bson.BsonNumber
    public org.bson.types.Decimal128 decimal128Value() {
            r5 = this;
            double r0 = r5.value
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto Lb
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.NaN
            return r0
        Lb:
            double r0 = r5.value
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 == 0) goto L21
            double r0 = r5.value
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.POSITIVE_INFINITY
            goto L20
        L1e:
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.NEGATIVE_INFINITY
        L20:
            return r0
        L21:
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128
            java.math.BigDecimal r1 = new java.math.BigDecimal
            double r2 = r5.value
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
            r2 = this;
            double r0 = r2.value
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L20
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            org.bson.BsonDouble r7 = (org.bson.BsonDouble) r7
            double r2 = r7.value
            double r4 = r6.value
            int r7 = java.lang.Double.compare(r2, r4)
            if (r7 == 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            return r0
    }

    public double getValue() {
            r2 = this;
            double r0 = r2.value
            return r0
    }

    public int hashCode() {
            r4 = this;
            double r0 = r4.value
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
            r2 = this;
            double r0 = r2.value
            int r0 = (int) r0
            return r0
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
            r2 = this;
            double r0 = r2.value
            long r0 = (long) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BsonDouble{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            double r1 = r3.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
