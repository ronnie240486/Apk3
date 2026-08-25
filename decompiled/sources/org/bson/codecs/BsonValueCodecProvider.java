package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonValueCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    private static final org.bson.codecs.BsonTypeClassMap DEFAULT_BSON_TYPE_CLASS_MAP = null;
    private final java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> codecs;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.bson.BsonType r1 = org.bson.BsonType.NULL
            java.lang.Class<org.bson.BsonNull> r2 = org.bson.BsonNull.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.ARRAY
            java.lang.Class<org.bson.BsonArray> r2 = org.bson.BsonArray.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.BINARY
            java.lang.Class<org.bson.BsonBinary> r2 = org.bson.BsonBinary.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN
            java.lang.Class<org.bson.BsonBoolean> r2 = org.bson.BsonBoolean.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME
            java.lang.Class<org.bson.BsonDateTime> r2 = org.bson.BsonDateTime.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER
            java.lang.Class<org.bson.BsonDbPointer> r2 = org.bson.BsonDbPointer.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT
            java.lang.Class<org.bson.BsonDocument> r2 = org.bson.BsonDocument.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.DOUBLE
            java.lang.Class<org.bson.BsonDouble> r2 = org.bson.BsonDouble.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.INT32
            java.lang.Class<org.bson.BsonInt32> r2 = org.bson.BsonInt32.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.INT64
            java.lang.Class<org.bson.BsonInt64> r2 = org.bson.BsonInt64.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128
            java.lang.Class<org.bson.BsonDecimal128> r2 = org.bson.BsonDecimal128.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY
            java.lang.Class<org.bson.BsonMaxKey> r2 = org.bson.BsonMaxKey.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY
            java.lang.Class<org.bson.BsonMinKey> r2 = org.bson.BsonMinKey.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT
            java.lang.Class<org.bson.BsonJavaScript> r2 = org.bson.BsonJavaScript.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            java.lang.Class<org.bson.BsonJavaScriptWithScope> r2 = org.bson.BsonJavaScriptWithScope.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID
            java.lang.Class<org.bson.BsonObjectId> r2 = org.bson.BsonObjectId.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION
            java.lang.Class<org.bson.BsonRegularExpression> r2 = org.bson.BsonRegularExpression.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.STRING
            java.lang.Class<org.bson.BsonString> r2 = org.bson.BsonString.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.SYMBOL
            java.lang.Class<org.bson.BsonSymbol> r2 = org.bson.BsonSymbol.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP
            java.lang.Class<org.bson.BsonTimestamp> r2 = org.bson.BsonTimestamp.class
            r0.put(r1, r2)
            org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED
            java.lang.Class<org.bson.BsonUndefined> r2 = org.bson.BsonUndefined.class
            r0.put(r1, r2)
            org.bson.codecs.BsonTypeClassMap r1 = new org.bson.codecs.BsonTypeClassMap
            r1.<init>(r0)
            org.bson.codecs.BsonValueCodecProvider.DEFAULT_BSON_TYPE_CLASS_MAP = r1
            return
    }

    public BsonValueCodecProvider() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.codecs = r0
            r1.addCodecs()
            return
    }

    private <T extends org.bson.BsonValue> void addCodec(org.bson.codecs.Codec<T> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r0 = r2.codecs
            java.lang.Class r1 = r3.getEncoderClass()
            r0.put(r1, r3)
            return
    }

    private void addCodecs() {
            r1 = this;
            org.bson.codecs.BsonNullCodec r0 = new org.bson.codecs.BsonNullCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonBinaryCodec r0 = new org.bson.codecs.BsonBinaryCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonBooleanCodec r0 = new org.bson.codecs.BsonBooleanCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonDateTimeCodec r0 = new org.bson.codecs.BsonDateTimeCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonDBPointerCodec r0 = new org.bson.codecs.BsonDBPointerCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonDoubleCodec r0 = new org.bson.codecs.BsonDoubleCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonInt32Codec r0 = new org.bson.codecs.BsonInt32Codec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonInt64Codec r0 = new org.bson.codecs.BsonInt64Codec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonDecimal128Codec r0 = new org.bson.codecs.BsonDecimal128Codec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonMinKeyCodec r0 = new org.bson.codecs.BsonMinKeyCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonMaxKeyCodec r0 = new org.bson.codecs.BsonMaxKeyCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonJavaScriptCodec r0 = new org.bson.codecs.BsonJavaScriptCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonObjectIdCodec r0 = new org.bson.codecs.BsonObjectIdCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonRegularExpressionCodec r0 = new org.bson.codecs.BsonRegularExpressionCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonStringCodec r0 = new org.bson.codecs.BsonStringCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonSymbolCodec r0 = new org.bson.codecs.BsonSymbolCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonTimestampCodec r0 = new org.bson.codecs.BsonTimestampCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BsonUndefinedCodec r0 = new org.bson.codecs.BsonUndefinedCodec
            r0.<init>()
            r1.addCodec(r0)
            return
    }

    public static org.bson.codecs.BsonTypeClassMap getBsonTypeClassMap() {
            org.bson.codecs.BsonTypeClassMap r0 = org.bson.codecs.BsonValueCodecProvider.DEFAULT_BSON_TYPE_CLASS_MAP
            return r0
    }

    public static java.lang.Class<? extends org.bson.BsonValue> getClassForBsonType(org.bson.BsonType r1) {
            org.bson.codecs.BsonTypeClassMap r0 = org.bson.codecs.BsonValueCodecProvider.DEFAULT_BSON_TYPE_CLASS_MAP
            java.lang.Class r1 = r0.get(r1)
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r2, org.bson.codecs.configuration.CodecRegistry r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r0 = r1.codecs
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r3 = r1.codecs
            java.lang.Object r2 = r3.get(r2)
            org.bson.codecs.Codec r2 = (org.bson.codecs.Codec) r2
            return r2
        L11:
            java.lang.Class<org.bson.BsonJavaScriptWithScope> r0 = org.bson.BsonJavaScriptWithScope.class
            if (r2 != r0) goto L21
            org.bson.codecs.BsonJavaScriptWithScopeCodec r2 = new org.bson.codecs.BsonJavaScriptWithScopeCodec
            java.lang.Class<org.bson.BsonDocument> r0 = org.bson.BsonDocument.class
            org.bson.codecs.Codec r3 = r3.get(r0)
            r2.<init>(r3)
            return r2
        L21:
            java.lang.Class<org.bson.BsonValue> r0 = org.bson.BsonValue.class
            if (r2 != r0) goto L2b
            org.bson.codecs.BsonValueCodec r2 = new org.bson.codecs.BsonValueCodec
            r2.<init>(r3)
            return r2
        L2b:
            java.lang.Class<org.bson.BsonDocumentWrapper> r0 = org.bson.BsonDocumentWrapper.class
            if (r2 != r0) goto L3b
            org.bson.codecs.BsonDocumentWrapperCodec r2 = new org.bson.codecs.BsonDocumentWrapperCodec
            java.lang.Class<org.bson.BsonDocument> r0 = org.bson.BsonDocument.class
            org.bson.codecs.Codec r3 = r3.get(r0)
            r2.<init>(r3)
            return r2
        L3b:
            java.lang.Class<org.bson.RawBsonDocument> r0 = org.bson.RawBsonDocument.class
            if (r2 != r0) goto L45
            org.bson.codecs.RawBsonDocumentCodec r2 = new org.bson.codecs.RawBsonDocumentCodec
            r2.<init>()
            return r2
        L45:
            java.lang.Class<org.bson.BsonDocument> r0 = org.bson.BsonDocument.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L53
            org.bson.codecs.BsonDocumentCodec r2 = new org.bson.codecs.BsonDocumentCodec
            r2.<init>(r3)
            return r2
        L53:
            java.lang.Class<org.bson.BsonArray> r0 = org.bson.BsonArray.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L61
            org.bson.codecs.BsonArrayCodec r2 = new org.bson.codecs.BsonArrayCodec
            r2.<init>(r3)
            return r2
        L61:
            r2 = 0
            return r2
    }
}
