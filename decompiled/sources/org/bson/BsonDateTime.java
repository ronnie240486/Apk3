package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDateTime extends org.bson.BsonValue implements java.lang.Comparable<org.bson.BsonDateTime> {
    private final long value;

    public BsonDateTime(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonDateTime r1) {
            r0 = this;
            org.bson.BsonDateTime r1 = (org.bson.BsonDateTime) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonDateTime r4) {
            r3 = this;
            long r0 = r3.value
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r4.value
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            int r4 = r0.compareTo(r4)
            return r4
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L1e
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L1e
        L12:
            org.bson.BsonDateTime r7 = (org.bson.BsonDateTime) r7
            long r2 = r6.value
            long r4 = r7.value
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
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

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BsonDateTime{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
