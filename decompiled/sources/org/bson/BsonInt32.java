package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonInt32 extends org.bson.BsonNumber implements java.lang.Comparable<org.bson.BsonInt32> {
    private final int value;

    public BsonInt32(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonInt32 r1) {
            r0 = this;
            org.bson.BsonInt32 r1 = (org.bson.BsonInt32) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonInt32 r2) {
            r1 = this;
            int r0 = r1.value
            int r2 = r2.value
            if (r0 >= r2) goto L8
            r2 = -1
            goto Ld
        L8:
            if (r0 != r2) goto Lc
            r2 = 0
            goto Ld
        Lc:
            r2 = 1
        Ld:
            return r2
    }

    @Override // org.bson.BsonNumber
    public org.bson.types.Decimal128 decimal128Value() {
            r3 = this;
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128
            int r1 = r3.value
            long r1 = (long) r1
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
            r2 = this;
            int r0 = r2.value
            double r0 = (double) r0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1a
            java.lang.Class<org.bson.BsonInt32> r2 = org.bson.BsonInt32.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1a
        L10:
            org.bson.BsonInt32 r5 = (org.bson.BsonInt32) r5
            int r2 = r4.value
            int r5 = r5.value
            if (r2 == r5) goto L19
            return r1
        L19:
            return r0
        L1a:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
            r2 = this;
            int r0 = r2.value
            long r0 = (long) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BsonInt32{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.value
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
