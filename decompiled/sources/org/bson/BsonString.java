package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonString extends org.bson.BsonValue implements java.lang.Comparable<org.bson.BsonString> {
    private final java.lang.String value;

    public BsonString(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.value = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Value can not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonString r1) {
            r0 = this;
            org.bson.BsonString r1 = (org.bson.BsonString) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonString r2) {
            r1 = this;
            java.lang.String r0 = r1.value
            java.lang.String r2 = r2.value
            int r2 = r0.compareTo(r2)
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
            org.bson.BsonString r5 = (org.bson.BsonString) r5
            java.lang.String r2 = r4.value
            java.lang.String r5 = r5.value
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
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            return r0
    }

    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonString{value='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.value
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
