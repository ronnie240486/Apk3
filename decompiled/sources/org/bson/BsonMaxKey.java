package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final class BsonMaxKey extends org.bson.BsonValue {
    public BsonMaxKey() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof org.bson.BsonMaxKey
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "BsonMaxKey"
            return r0
    }
}
