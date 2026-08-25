package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public class CodeWScope extends org.bson.types.Code {
    private static final long serialVersionUID = -6284832275113680002L;
    private final org.bson.BSONObject scope;

    public CodeWScope(java.lang.String r1, org.bson.BSONObject r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scope = r2
            return
    }

    @Override // org.bson.types.Code
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            org.bson.types.CodeWScope r4 = (org.bson.types.CodeWScope) r4
            java.lang.String r1 = r3.getCode()
            java.lang.String r2 = r4.getCode()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2a
            org.bson.BSONObject r1 = r3.scope
            org.bson.BSONObject r4 = r4.scope
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L2a
            r0 = 1
        L2a:
            return r0
    }

    public org.bson.BSONObject getScope() {
            r1 = this;
            org.bson.BSONObject r0 = r1.scope
            return r0
    }

    @Override // org.bson.types.Code
    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getCode()
            int r0 = r0.hashCode()
            org.bson.BSONObject r1 = r2.scope
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
