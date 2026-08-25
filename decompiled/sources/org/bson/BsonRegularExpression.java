package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class BsonRegularExpression extends org.bson.BsonValue {
    private final java.lang.String options;
    private final java.lang.String pattern;

    public BsonRegularExpression(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BsonRegularExpression(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "pattern"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.pattern = r2
            if (r3 != 0) goto L12
            java.lang.String r2 = ""
            goto L16
        L12:
            java.lang.String r2 = r1.sortOptionCharacters(r3)
        L16:
            r1.options = r2
            return
    }

    private java.lang.String sortOptionCharacters(java.lang.String r2) {
            r1 = this;
            char[] r2 = r2.toCharArray()
            java.util.Arrays.sort(r2)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<org.bson.BsonRegularExpression> r2 = org.bson.BsonRegularExpression.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            org.bson.BsonRegularExpression r5 = (org.bson.BsonRegularExpression) r5
            java.lang.String r2 = r4.options
            java.lang.String r3 = r5.options
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
            return r1
        L1d:
            java.lang.String r2 = r4.pattern
            java.lang.String r5 = r5.pattern
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L28
            return r1
        L28:
            return r0
        L29:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            return r0
    }

    public java.lang.String getOptions() {
            r1 = this;
            java.lang.String r0 = r1.options
            return r0
    }

    public java.lang.String getPattern() {
            r1 = this;
            java.lang.String r0 = r1.pattern
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.pattern
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.options
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "BsonRegularExpression{pattern='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.pattern
            r2 = 39
            java.lang.String r3 = ", options='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.options
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
