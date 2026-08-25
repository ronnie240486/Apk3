package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonDecimal128 extends org.bson.BsonNumber {
    private final org.bson.types.Decimal128 value;

    public BsonDecimal128(org.bson.types.Decimal128 r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "value"
            org.bson.assertions.Assertions.notNull(r0, r2)
            r1.value = r2
            return
    }

    @Override // org.bson.BsonNumber
    public org.bson.types.Decimal128 decimal128Value() {
            r1 = this;
            org.bson.types.Decimal128 r0 = r1.value
            return r0
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
            r2 = this;
            org.bson.types.Decimal128 r0 = r2.value
            java.math.BigDecimal r0 = r0.bigDecimalValue()
            double r0 = r0.doubleValue()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<org.bson.BsonDecimal128> r2 = org.bson.BsonDecimal128.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1e
        L10:
            org.bson.BsonDecimal128 r5 = (org.bson.BsonDecimal128) r5
            org.bson.types.Decimal128 r2 = r4.value
            org.bson.types.Decimal128 r5 = r5.value
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            return r0
    }

    public org.bson.types.Decimal128 getValue() {
            r1 = this;
            org.bson.types.Decimal128 r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            org.bson.types.Decimal128 r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
            r1 = this;
            org.bson.types.Decimal128 r0 = r1.value
            java.math.BigDecimal r0 = r0.bigDecimalValue()
            int r0 = r0.intValue()
            return r0
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
            r2 = this;
            org.bson.types.Decimal128 r0 = r2.value
            java.math.BigDecimal r0 = r0.bigDecimalValue()
            long r0 = r0.longValue()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonDecimal128{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            org.bson.types.Decimal128 r1 = r2.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
