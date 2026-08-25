package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDbPointer extends org.bson.BsonValue {
    private final org.bson.types.ObjectId id;
    private final java.lang.String namespace;

    public BsonDbPointer(java.lang.String r1, org.bson.types.ObjectId r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.namespace = r1
            r0.id = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "id can not be null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "namespace can not be null"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2b
        L12:
            org.bson.BsonDbPointer r5 = (org.bson.BsonDbPointer) r5
            org.bson.types.ObjectId r2 = r4.id
            org.bson.types.ObjectId r3 = r5.id
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.String r2 = r4.namespace
            java.lang.String r5 = r5.namespace
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2a
            return r1
        L2a:
            return r0
        L2b:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            return r0
    }

    public org.bson.types.ObjectId getId() {
            r1 = this;
            org.bson.types.ObjectId r0 = r1.id
            return r0
    }

    public java.lang.String getNamespace() {
            r1 = this;
            java.lang.String r0 = r1.namespace
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.namespace
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.bson.types.ObjectId r1 = r2.id
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "BsonDbPointer{namespace='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.namespace
            r2 = 39
            java.lang.String r3 = ", id="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            org.bson.types.ObjectId r1 = r4.id
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
