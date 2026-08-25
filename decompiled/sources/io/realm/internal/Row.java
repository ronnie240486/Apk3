package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public interface Row {
    void checkIfAttached();

    long createEmbeddedObject(long r1, io.realm.RealmFieldType r3);

    io.realm.internal.Row freeze(io.realm.internal.OsSharedRealm r1);

    byte[] getBinaryByteArray(long r1);

    boolean getBoolean(long r1);

    long getColumnCount();

    long getColumnKey(java.lang.String r1);

    java.lang.String[] getColumnNames();

    io.realm.RealmFieldType getColumnType(long r1);

    java.util.Date getDate(long r1);

    org.bson.types.Decimal128 getDecimal128(long r1);

    double getDouble(long r1);

    float getFloat(long r1);

    long getLink(long r1);

    long getLong(long r1);

    io.realm.internal.OsList getModelList(long r1);

    io.realm.internal.OsMap getModelMap(long r1);

    io.realm.internal.OsSet getModelSet(long r1);

    io.realm.internal.core.NativeRealmAny getNativeRealmAny(long r1);

    org.bson.types.ObjectId getObjectId(long r1);

    long getObjectKey();

    io.realm.internal.OsMap getRealmAnyMap(long r1);

    io.realm.internal.OsSet getRealmAnySet(long r1);

    java.lang.String getString(long r1);

    io.realm.internal.Table getTable();

    java.util.UUID getUUID(long r1);

    io.realm.internal.OsList getValueList(long r1, io.realm.RealmFieldType r3);

    io.realm.internal.OsMap getValueMap(long r1, io.realm.RealmFieldType r3);

    io.realm.internal.OsSet getValueSet(long r1, io.realm.RealmFieldType r3);

    boolean hasColumn(java.lang.String r1);

    boolean isLoaded();

    boolean isNull(long r1);

    boolean isNullLink(long r1);

    boolean isValid();

    void nullifyLink(long r1);

    void setBinaryByteArray(long r1, @javax.annotation.Nullable byte[] r3);

    void setBoolean(long r1, boolean r3);

    void setDate(long r1, java.util.Date r3);

    void setDecimal128(long r1, org.bson.types.Decimal128 r3);

    void setDouble(long r1, double r3);

    void setFloat(long r1, float r3);

    void setLink(long r1, long r3);

    void setLong(long r1, long r3);

    void setNull(long r1);

    void setObjectId(long r1, org.bson.types.ObjectId r3);

    void setRealmAny(long r1, long r3);

    void setString(long r1, @javax.annotation.Nullable java.lang.String r3);

    void setUUID(long r1, java.util.UUID r3);
}
