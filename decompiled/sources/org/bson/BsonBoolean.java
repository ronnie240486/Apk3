package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonBoolean extends org.bson.BsonValue implements java.lang.Comparable<org.bson.BsonBoolean> {
    public static final org.bson.BsonBoolean FALSE = null;
    public static final org.bson.BsonBoolean TRUE = null;
    private final boolean value;

    static {
            org.bson.BsonBoolean r0 = new org.bson.BsonBoolean
            r1 = 1
            r0.<init>(r1)
            org.bson.BsonBoolean.TRUE = r0
            org.bson.BsonBoolean r0 = new org.bson.BsonBoolean
            r1 = 0
            r0.<init>(r1)
            org.bson.BsonBoolean.FALSE = r0
            return
    }

    public BsonBoolean(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static org.bson.BsonBoolean valueOf(boolean r0) {
            if (r0 == 0) goto L5
            org.bson.BsonBoolean r0 = org.bson.BsonBoolean.TRUE
            goto L7
        L5:
            org.bson.BsonBoolean r0 = org.bson.BsonBoolean.FALSE
        L7:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.BsonBoolean r1) {
            r0 = this;
            org.bson.BsonBoolean r1 = (org.bson.BsonBoolean) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.BsonBoolean r2) {
            r1 = this;
            boolean r0 = r1.value
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r2.value
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
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
            if (r5 == 0) goto L1a
            java.lang.Class<org.bson.BsonBoolean> r2 = org.bson.BsonBoolean.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1a
        L10:
            org.bson.BsonBoolean r5 = (org.bson.BsonBoolean) r5
            boolean r2 = r4.value
            boolean r5 = r5.value
            if (r2 == r5) goto L19
            return r1
        L19:
            return r0
        L1a:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BOOLEAN
            return r0
    }

    public boolean getValue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonBoolean{value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            boolean r1 = r2.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
