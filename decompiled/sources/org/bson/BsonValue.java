package org.bson;

/* JADX INFO: loaded from: classes.dex */
public abstract class BsonValue {
    public BsonValue() {
            r0 = this;
            r0.<init>()
            return
    }

    private void throwIfInvalidType(org.bson.BsonType r4) {
            r3 = this;
            org.bson.BsonType r0 = r3.getBsonType()
            if (r0 != r4) goto L7
            return
        L7:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            org.bson.BsonType r2 = r3.getBsonType()
            r1[r4] = r2
            java.lang.String r4 = "Value expected to be of type %s is of unexpected type %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public org.bson.BsonArray asArray() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonArray r0 = (org.bson.BsonArray) r0
            return r0
    }

    public org.bson.BsonBinary asBinary() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonBinary r0 = (org.bson.BsonBinary) r0
            return r0
    }

    public org.bson.BsonBoolean asBoolean() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BOOLEAN
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonBoolean r0 = (org.bson.BsonBoolean) r0
            return r0
    }

    public org.bson.BsonDbPointer asDBPointer() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonDbPointer r0 = (org.bson.BsonDbPointer) r0
            return r0
    }

    public org.bson.BsonDateTime asDateTime() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonDateTime r0 = (org.bson.BsonDateTime) r0
            return r0
    }

    public org.bson.BsonDecimal128 asDecimal128() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonDecimal128 r0 = (org.bson.BsonDecimal128) r0
            return r0
    }

    public org.bson.BsonDocument asDocument() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonDocument r0 = (org.bson.BsonDocument) r0
            return r0
    }

    public org.bson.BsonDouble asDouble() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonDouble r0 = (org.bson.BsonDouble) r0
            return r0
    }

    public org.bson.BsonInt32 asInt32() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonInt32 r0 = (org.bson.BsonInt32) r0
            return r0
    }

    public org.bson.BsonInt64 asInt64() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonInt64 r0 = (org.bson.BsonInt64) r0
            return r0
    }

    public org.bson.BsonJavaScript asJavaScript() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonJavaScript r0 = (org.bson.BsonJavaScript) r0
            return r0
    }

    public org.bson.BsonJavaScriptWithScope asJavaScriptWithScope() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonJavaScriptWithScope r0 = (org.bson.BsonJavaScriptWithScope) r0
            return r0
    }

    public org.bson.BsonNumber asNumber() {
            r4 = this;
            org.bson.BsonType r0 = r4.getBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.INT32
            if (r0 == r1) goto L2f
            org.bson.BsonType r0 = r4.getBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.INT64
            if (r0 == r1) goto L2f
            org.bson.BsonType r0 = r4.getBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.DOUBLE
            if (r0 != r1) goto L19
            goto L2f
        L19:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            org.bson.BsonType r3 = r4.getBsonType()
            r1[r2] = r3
            java.lang.String r2 = "Value expected to be of a numerical BSON type is of unexpected type %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L2f:
            r0 = r4
            org.bson.BsonNumber r0 = (org.bson.BsonNumber) r0
            return r0
    }

    public org.bson.BsonObjectId asObjectId() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonObjectId r0 = (org.bson.BsonObjectId) r0
            return r0
    }

    public org.bson.BsonRegularExpression asRegularExpression() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonRegularExpression r0 = (org.bson.BsonRegularExpression) r0
            return r0
    }

    public org.bson.BsonString asString() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonString r0 = (org.bson.BsonString) r0
            return r0
    }

    public org.bson.BsonSymbol asSymbol() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.SYMBOL
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonSymbol r0 = (org.bson.BsonSymbol) r0
            return r0
    }

    public org.bson.BsonTimestamp asTimestamp() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            r1.throwIfInvalidType(r0)
            r0 = r1
            org.bson.BsonTimestamp r0 = (org.bson.BsonTimestamp) r0
            return r0
    }

    public abstract org.bson.BsonType getBsonType();

    public boolean isArray() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonArray
            return r0
    }

    public boolean isBinary() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonBinary
            return r0
    }

    public boolean isBoolean() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonBoolean
            return r0
    }

    public boolean isDBPointer() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonDbPointer
            return r0
    }

    public boolean isDateTime() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonDateTime
            return r0
    }

    public boolean isDecimal128() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonDecimal128
            return r0
    }

    public boolean isDocument() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonDocument
            return r0
    }

    public boolean isDouble() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonDouble
            return r0
    }

    public boolean isInt32() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonInt32
            return r0
    }

    public boolean isInt64() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonInt64
            return r0
    }

    public boolean isJavaScript() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonJavaScript
            return r0
    }

    public boolean isJavaScriptWithScope() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonJavaScriptWithScope
            return r0
    }

    public boolean isNull() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonNull
            return r0
    }

    public boolean isNumber() {
            r1 = this;
            boolean r0 = r1.isInt32()
            if (r0 != 0) goto L15
            boolean r0 = r1.isInt64()
            if (r0 != 0) goto L15
            boolean r0 = r1.isDouble()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    public boolean isObjectId() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonObjectId
            return r0
    }

    public boolean isRegularExpression() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonRegularExpression
            return r0
    }

    public boolean isString() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonString
            return r0
    }

    public boolean isSymbol() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonSymbol
            return r0
    }

    public boolean isTimestamp() {
            r1 = this;
            boolean r0 = r1 instanceof org.bson.BsonTimestamp
            return r0
    }
}
