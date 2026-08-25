package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final class BsonUndefined extends org.bson.BsonValue {
    public BsonUndefined() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            if (r3 == 0) goto L10
            java.lang.Class<org.bson.BsonUndefined> r1 = org.bson.BsonUndefined.class
            java.lang.Class r3 = r3.getClass()
            if (r1 == r3) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r3 = 0
            return r3
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.UNDEFINED
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }
}
