package org.bson.types;

/* JADX INFO: loaded from: classes2.dex */
public class CodeWithScope extends org.bson.types.Code {
    private static final long serialVersionUID = -6284832275113680002L;
    private final org.bson.Document scope;

    public CodeWithScope(java.lang.String r1, org.bson.Document r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scope = r2
            return
    }

    @Override // org.bson.types.Code
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2c
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2c
        L12:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L19
            return r1
        L19:
            org.bson.types.CodeWithScope r5 = (org.bson.types.CodeWithScope) r5
            org.bson.Document r2 = r4.scope
            org.bson.Document r5 = r5.scope
            if (r2 == 0) goto L28
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2b
            goto L2a
        L28:
            if (r5 == 0) goto L2b
        L2a:
            return r1
        L2b:
            return r0
        L2c:
            return r1
    }

    public org.bson.Document getScope() {
            r1 = this;
            org.bson.Document r0 = r1.scope
            return r0
    }

    @Override // org.bson.types.Code
    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getCode()
            int r0 = r0.hashCode()
            org.bson.Document r1 = r2.scope
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
