package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonElement {
    private final java.lang.String name;
    private final org.bson.BsonValue value;

    public BsonElement(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.value = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L4d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L4d
        L12:
            org.bson.BsonElement r5 = (org.bson.BsonElement) r5
            java.lang.String r2 = r4.getName()
            if (r2 == 0) goto L29
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L30
            goto L2f
        L29:
            java.lang.String r2 = r5.getName()
            if (r2 == 0) goto L30
        L2f:
            return r1
        L30:
            org.bson.BsonValue r2 = r4.getValue()
            if (r2 == 0) goto L45
            org.bson.BsonValue r2 = r4.getValue()
            org.bson.BsonValue r5 = r5.getValue()
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L4c
            goto L4b
        L45:
            org.bson.BsonValue r5 = r5.getValue()
            if (r5 == 0) goto L4c
        L4b:
            return r1
        L4c:
            return r0
        L4d:
            return r1
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.bson.BsonValue getValue() {
            r1 = this;
            org.bson.BsonValue r0 = r1.value
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.getName()
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.getName()
            int r0 = r0.hashCode()
            goto L11
        L10:
            r0 = 0
        L11:
            int r0 = r0 * 31
            org.bson.BsonValue r2 = r3.getValue()
            if (r2 == 0) goto L21
            org.bson.BsonValue r1 = r3.getValue()
            int r1 = r1.hashCode()
        L21:
            int r0 = r0 + r1
            return r0
    }
}
