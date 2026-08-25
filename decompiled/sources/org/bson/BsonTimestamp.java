package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonTimestamp extends org.bson.BsonValue implements java.lang.Comparable<org.bson.BsonTimestamp> {
    private final long value;

    public BsonTimestamp() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.value = r0
            return
    }

    public BsonTimestamp(int r5, int r6) {
            r4 = this;
            r4.<init>()
            long r0 = (long) r5
            r5 = 32
            long r0 = r0 << r5
            long r5 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            long r5 = r5 | r0
            r4.value = r5
            return
    }

    public BsonTimestamp(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonTimestamp r1) {
            r0 = this;
            org.bson.BsonTimestamp r1 = (org.bson.BsonTimestamp) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonTimestamp r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.value
            int r5 = org.bson.internal.UnsignedLongs.compare(r0, r2)
            return r5
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L1c
            java.lang.Class<org.bson.BsonTimestamp> r2 = org.bson.BsonTimestamp.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L1c
        L10:
            org.bson.BsonTimestamp r7 = (org.bson.BsonTimestamp) r7
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
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            return r0
    }

    public int getInc() {
            r2 = this;
            long r0 = r2.value
            int r1 = (int) r0
            return r1
    }

    public int getTime() {
            r3 = this;
            long r0 = r3.value
            r2 = 32
            long r0 = r0 >> r2
            int r1 = (int) r0
            return r1
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

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Timestamp{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.getValue()
            r0.append(r1)
            java.lang.String r1 = ", seconds="
            r0.append(r1)
            int r1 = r3.getTime()
            r0.append(r1)
            java.lang.String r1 = ", inc="
            r0.append(r1)
            int r1 = r3.getInc()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
