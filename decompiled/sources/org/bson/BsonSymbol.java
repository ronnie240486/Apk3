package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonSymbol extends org.bson.BsonValue {
    private final java.lang.String symbol;

    public BsonSymbol(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.symbol = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Value can not be null"
            r2.<init>(r0)
            throw r2
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
            org.bson.BsonSymbol r5 = (org.bson.BsonSymbol) r5
            java.lang.String r2 = r4.symbol
            java.lang.String r5 = r5.symbol
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
            org.bson.BsonType r0 = org.bson.BsonType.SYMBOL
            return r0
    }

    public java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }
}
