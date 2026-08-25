package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonTypeClassMap {
    private final java.util.Map<org.bson.BsonType, java.lang.Class<?>> map;

    public BsonTypeClassMap() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.<init>(r0)
            return
    }

    public BsonTypeClassMap(java.util.Map<org.bson.BsonType, java.lang.Class<?>> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            r1.addDefaults()
            r0.putAll(r2)
            return
    }

    private void addDefaults() {
            r3 = this;
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.ARRAY
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.BINARY
            java.lang.Class<org.bson.types.Binary> r2 = org.bson.types.Binary.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER
            java.lang.Class<org.bson.BsonDbPointer> r2 = org.bson.BsonDbPointer.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT
            java.lang.Class<org.bson.Document> r2 = org.bson.Document.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.DOUBLE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.INT32
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.INT64
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128
            java.lang.Class<org.bson.types.Decimal128> r2 = org.bson.types.Decimal128.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY
            java.lang.Class<org.bson.types.MaxKey> r2 = org.bson.types.MaxKey.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY
            java.lang.Class<org.bson.types.MinKey> r2 = org.bson.types.MinKey.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT
            java.lang.Class<org.bson.types.Code> r2 = org.bson.types.Code.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            java.lang.Class<org.bson.types.CodeWithScope> r2 = org.bson.types.CodeWithScope.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID
            java.lang.Class<org.bson.types.ObjectId> r2 = org.bson.types.ObjectId.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION
            java.lang.Class<org.bson.BsonRegularExpression> r2 = org.bson.BsonRegularExpression.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.STRING
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.SYMBOL
            java.lang.Class<org.bson.types.Symbol> r2 = org.bson.types.Symbol.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP
            java.lang.Class<org.bson.BsonTimestamp> r2 = org.bson.BsonTimestamp.class
            r0.put(r1, r2)
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r3.map
            org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED
            java.lang.Class<org.bson.BsonUndefined> r2 = org.bson.BsonUndefined.class
            r0.put(r1, r2)
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
            org.bson.codecs.BsonTypeClassMap r5 = (org.bson.codecs.BsonTypeClassMap) r5
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r2 = r4.map
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r5 = r5.map
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    public java.lang.Class<?> get(org.bson.BsonType r2) {
            r1 = this;
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r1.map
            int r0 = r0.hashCode()
            return r0
    }

    public final java.util.Set<org.bson.BsonType> keys() {
            r1 = this;
            java.util.Map<org.bson.BsonType, java.lang.Class<?>> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
