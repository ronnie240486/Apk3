package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BsonJavaScript extends org.bson.BsonValue {
    private final java.lang.String code;

    public BsonJavaScript(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            return
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
            org.bson.BsonJavaScript r5 = (org.bson.BsonJavaScript) r5
            java.lang.String r2 = r4.code
            java.lang.String r5 = r5.code
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
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT
            return r0
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonJavaScript{code='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.code
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
