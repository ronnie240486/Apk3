package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonJavaScriptWithScope extends org.bson.BsonValue {
    private final java.lang.String code;
    private final org.bson.BsonDocument scope;

    public BsonJavaScriptWithScope(java.lang.String r1, org.bson.BsonDocument r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L15
            if (r2 == 0) goto Lc
            r0.code = r1
            r0.scope = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "scope can not be null"
            r1.<init>(r2)
            throw r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "code can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static org.bson.BsonJavaScriptWithScope clone(org.bson.BsonJavaScriptWithScope r2) {
            org.bson.BsonJavaScriptWithScope r0 = new org.bson.BsonJavaScriptWithScope
            java.lang.String r1 = r2.code
            org.bson.BsonDocument r2 = r2.scope
            org.bson.BsonDocument r2 = r2.mo2036clone()
            r0.<init>(r1, r2)
            return r0
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
            org.bson.BsonJavaScriptWithScope r5 = (org.bson.BsonJavaScriptWithScope) r5
            java.lang.String r2 = r4.code
            java.lang.String r3 = r5.code
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            org.bson.BsonDocument r2 = r4.scope
            org.bson.BsonDocument r5 = r5.scope
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
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            return r0
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public org.bson.BsonDocument getScope() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.scope
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.code
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.bson.BsonDocument r1 = r2.scope
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonJavaScriptWithScope{code="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getCode()
            r0.append(r1)
            java.lang.String r1 = "scope="
            r0.append(r1)
            org.bson.BsonDocument r1 = r2.scope
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
