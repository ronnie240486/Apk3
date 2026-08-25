package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonInt64 extends org.bson.BsonNumber implements java.lang.Comparable<org.bson.BsonInt64> {
    private final long value;

    public BsonInt64(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonInt64 r1) {
            r0 = this;
            org.bson.BsonInt64 r1 = (org.bson.BsonInt64) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonInt64 r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.value
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto La
            r5 = -1
            goto L11
        La:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L10
            r5 = 0
            goto L11
        L10:
            r5 = 1
        L11:
            return r5
    }

    @Override // org.bson.BsonNumber
    public org.bson.types.Decimal128 decimal128Value() {
            r3 = this;
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128
            long r1 = r3.value
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
            r2 = this;
            long r0 = r2.value
            double r0 = (double) r0
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L1c
            java.lang.Class<org.bson.BsonInt64> r2 = org.bson.BsonInt64.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L1c
        L10:
            org.bson.BsonInt64 r7 = (org.bson.BsonInt64) r7
            long r2 = r6.value
            long r4 = r7.value
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            return r0
    }

    public long getValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.value
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
            r2 = this;
            long r0 = r2.value
            int r1 = (int) r0
            return r1
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BsonInt64{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
