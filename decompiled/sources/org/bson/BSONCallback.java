package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public interface BSONCallback {
    java.lang.Object arrayDone();

    void arrayStart();

    void arrayStart(java.lang.String r1);

    org.bson.BSONCallback createBSONCallback();

    java.lang.Object get();

    void gotBinary(java.lang.String r1, byte r2, byte[] r3);

    @java.lang.Deprecated
    void gotBinaryArray(java.lang.String r1, byte[] r2);

    void gotBoolean(java.lang.String r1, boolean r2);

    void gotCode(java.lang.String r1, java.lang.String r2);

    void gotCodeWScope(java.lang.String r1, java.lang.String r2, java.lang.Object r3);

    void gotDBRef(java.lang.String r1, java.lang.String r2, org.bson.types.ObjectId r3);

    void gotDate(java.lang.String r1, long r2);

    void gotDecimal128(java.lang.String r1, org.bson.types.Decimal128 r2);

    void gotDouble(java.lang.String r1, double r2);

    void gotInt(java.lang.String r1, int r2);

    void gotLong(java.lang.String r1, long r2);

    void gotMaxKey(java.lang.String r1);

    void gotMinKey(java.lang.String r1);

    void gotNull(java.lang.String r1);

    void gotObjectId(java.lang.String r1, org.bson.types.ObjectId r2);

    void gotRegex(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    void gotString(java.lang.String r1, java.lang.String r2);

    void gotSymbol(java.lang.String r1, java.lang.String r2);

    void gotTimestamp(java.lang.String r1, int r2, int r3);

    void gotUUID(java.lang.String r1, long r2, long r4);

    void gotUndefined(java.lang.String r1);

    java.lang.Object objectDone();

    void objectStart();

    void objectStart(java.lang.String r1);

    void reset();
}
