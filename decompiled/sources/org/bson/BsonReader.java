package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public interface BsonReader extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    org.bson.BsonType getCurrentBsonType();

    java.lang.String getCurrentName();

    org.bson.BsonReaderMark getMark();

    @java.lang.Deprecated
    void mark();

    int peekBinarySize();

    byte peekBinarySubType();

    org.bson.BsonBinary readBinaryData();

    org.bson.BsonBinary readBinaryData(java.lang.String r1);

    boolean readBoolean();

    boolean readBoolean(java.lang.String r1);

    org.bson.BsonType readBsonType();

    org.bson.BsonDbPointer readDBPointer();

    org.bson.BsonDbPointer readDBPointer(java.lang.String r1);

    long readDateTime();

    long readDateTime(java.lang.String r1);

    org.bson.types.Decimal128 readDecimal128();

    org.bson.types.Decimal128 readDecimal128(java.lang.String r1);

    double readDouble();

    double readDouble(java.lang.String r1);

    void readEndArray();

    void readEndDocument();

    int readInt32();

    int readInt32(java.lang.String r1);

    long readInt64();

    long readInt64(java.lang.String r1);

    java.lang.String readJavaScript();

    java.lang.String readJavaScript(java.lang.String r1);

    java.lang.String readJavaScriptWithScope();

    java.lang.String readJavaScriptWithScope(java.lang.String r1);

    void readMaxKey();

    void readMaxKey(java.lang.String r1);

    void readMinKey();

    void readMinKey(java.lang.String r1);

    java.lang.String readName();

    void readName(java.lang.String r1);

    void readNull();

    void readNull(java.lang.String r1);

    org.bson.types.ObjectId readObjectId();

    org.bson.types.ObjectId readObjectId(java.lang.String r1);

    org.bson.BsonRegularExpression readRegularExpression();

    org.bson.BsonRegularExpression readRegularExpression(java.lang.String r1);

    void readStartArray();

    void readStartDocument();

    java.lang.String readString();

    java.lang.String readString(java.lang.String r1);

    java.lang.String readSymbol();

    java.lang.String readSymbol(java.lang.String r1);

    org.bson.BsonTimestamp readTimestamp();

    org.bson.BsonTimestamp readTimestamp(java.lang.String r1);

    void readUndefined();

    void readUndefined(java.lang.String r1);

    @java.lang.Deprecated
    void reset();

    void skipName();

    void skipValue();
}
