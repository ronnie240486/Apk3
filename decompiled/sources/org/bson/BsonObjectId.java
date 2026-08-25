package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonObjectId extends org.bson.BsonValue implements java.lang.Comparable<org.bson.BsonObjectId> {
    private final org.bson.types.ObjectId value;

    public BsonObjectId() {
            r1 = this;
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public BsonObjectId(org.bson.types.ObjectId r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.value = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value may not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonObjectId r1) {
            r0 = this;
            org.bson.BsonObjectId r1 = (org.bson.BsonObjectId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonObjectId r2) {
            r1 = this;
            org.bson.types.ObjectId r0 = r1.value
            org.bson.types.ObjectId r2 = r2.value
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L20
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            org.bson.BsonObjectId r5 = (org.bson.BsonObjectId) r5
            org.bson.types.ObjectId r2 = r4.value
            org.bson.types.ObjectId r5 = r5.value
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            return r0
    }

    public org.bson.types.ObjectId getValue() {
            r1 = this;
            org.bson.types.ObjectId r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            org.bson.types.ObjectId r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonObjectId{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            org.bson.types.ObjectId r1 = r2.value
            java.lang.String r1 = r1.toHexString()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
