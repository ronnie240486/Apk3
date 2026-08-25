package org.bson;

/* JADX INFO: loaded from: classes.dex */
public interface BsonWriter {
    void flush();

    void pipe(org.bson.BsonReader r1);

    void writeBinaryData(java.lang.String r1, org.bson.BsonBinary r2);

    void writeBinaryData(org.bson.BsonBinary r1);

    void writeBoolean(java.lang.String r1, boolean r2);

    void writeBoolean(boolean r1);

    void writeDBPointer(java.lang.String r1, org.bson.BsonDbPointer r2);

    void writeDBPointer(org.bson.BsonDbPointer r1);

    void writeDateTime(long r1);

    void writeDateTime(java.lang.String r1, long r2);

    void writeDecimal128(java.lang.String r1, org.bson.types.Decimal128 r2);

    void writeDecimal128(org.bson.types.Decimal128 r1);

    void writeDouble(double r1);

    void writeDouble(java.lang.String r1, double r2);

    void writeEndArray();

    void writeEndDocument();

    void writeInt32(int r1);

    void writeInt32(java.lang.String r1, int r2);

    void writeInt64(long r1);

    void writeInt64(java.lang.String r1, long r2);

    void writeJavaScript(java.lang.String r1);

    void writeJavaScript(java.lang.String r1, java.lang.String r2);

    void writeJavaScriptWithScope(java.lang.String r1);

    void writeJavaScriptWithScope(java.lang.String r1, java.lang.String r2);

    void writeMaxKey();

    void writeMaxKey(java.lang.String r1);

    void writeMinKey();

    void writeMinKey(java.lang.String r1);

    void writeName(java.lang.String r1);

    void writeNull();

    void writeNull(java.lang.String r1);

    void writeObjectId(java.lang.String r1, org.bson.types.ObjectId r2);

    void writeObjectId(org.bson.types.ObjectId r1);

    void writeRegularExpression(java.lang.String r1, org.bson.BsonRegularExpression r2);

    void writeRegularExpression(org.bson.BsonRegularExpression r1);

    void writeStartArray();

    void writeStartArray(java.lang.String r1);

    void writeStartDocument();

    void writeStartDocument(java.lang.String r1);

    void writeString(java.lang.String r1);

    void writeString(java.lang.String r1, java.lang.String r2);

    void writeSymbol(java.lang.String r1);

    void writeSymbol(java.lang.String r1, java.lang.String r2);

    void writeTimestamp(java.lang.String r1, org.bson.BsonTimestamp r2);

    void writeTimestamp(org.bson.BsonTimestamp r1);

    void writeUndefined();

    void writeUndefined(java.lang.String r1);
}
