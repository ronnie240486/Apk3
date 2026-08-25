package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class JsonToken {
    private final org.bson.json.JsonTokenType type;
    private final java.lang.Object value;

    public JsonToken(org.bson.json.JsonTokenType r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.value = r2
            r0.type = r1
            return
    }

    public org.bson.json.JsonTokenType getType() {
            r1 = this;
            org.bson.json.JsonTokenType r0 = r1.type
            return r0
    }

    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    public <T> T getValue(java.lang.Class<T> r6) {
            r5 = this;
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r0 != r6) goto L28
            java.lang.Object r0 = r5.value     // Catch: java.lang.Exception -> Lb3
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto L19
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> Lb3
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> Lb3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L19:
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto Lac
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L28:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r0 != r6) goto L3d
            java.lang.Object r0 = r5.value     // Catch: java.lang.Exception -> Lb3
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto Lac
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L3d:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r0 != r6) goto L52
            java.lang.Object r0 = r5.value     // Catch: java.lang.Exception -> Lb3
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto Lac
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L52:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            if (r0 != r6) goto Lac
            java.lang.Object r0 = r5.value     // Catch: java.lang.Exception -> Lb3
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto L6f
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r1 = r5.value     // Catch: java.lang.Exception -> Lb3
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lb3
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lb3
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L6f:
            boolean r1 = r0 instanceof java.lang.Long     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto L85
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r1 = r5.value     // Catch: java.lang.Exception -> Lb3
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> Lb3
            long r1 = r1.longValue()     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L85:
            boolean r1 = r0 instanceof java.lang.Double     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto L9d
            org.bson.BsonDouble r1 = new org.bson.BsonDouble     // Catch: java.lang.Exception -> Lb3
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Exception -> Lb3
            double r2 = r0.doubleValue()     // Catch: java.lang.Exception -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lb3
            org.bson.types.Decimal128 r0 = r1.decimal128Value()     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        L9d:
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto Lac
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb3
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.parse(r0)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        Lac:
            java.lang.Object r0 = r5.value     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Exception -> Lb3
            return r6
        Lb3:
            r0 = move-exception
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r3 = r5.value
            r4 = 0
            r2[r4] = r3
            java.lang.String r6 = r6.getName()
            r3 = 1
            r2[r3] = r6
            java.lang.String r6 = "Exception converting value '%s' to type %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r0
            r1.<init>(r6, r2)
            throw r1
    }
}
