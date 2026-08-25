package io.realm;

/* JADX INFO: loaded from: classes.dex */
public final enum FrozenPendingRow extends java.lang.Enum<io.realm.FrozenPendingRow> implements io.realm.internal.Row {
    private static final /* synthetic */ io.realm.FrozenPendingRow[] $VALUES = null;
    public static final io.realm.FrozenPendingRow INSTANCE = null;
    private static final java.lang.String QUERY_NOT_RETURNED_MESSAGE = "This object was frozen while a query for it was still running.";

    static {
            io.realm.FrozenPendingRow r0 = new io.realm.FrozenPendingRow
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.realm.FrozenPendingRow.INSTANCE = r0
            r1 = 1
            io.realm.FrozenPendingRow[] r1 = new io.realm.FrozenPendingRow[r1]
            r1[r2] = r0
            io.realm.FrozenPendingRow.$VALUES = r1
            return
    }

    private FrozenPendingRow(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.realm.FrozenPendingRow valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.FrozenPendingRow> r0 = io.realm.FrozenPendingRow.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.FrozenPendingRow r1 = (io.realm.FrozenPendingRow) r1
            return r1
    }

    public static io.realm.FrozenPendingRow[] values() {
            io.realm.FrozenPendingRow[] r0 = io.realm.FrozenPendingRow.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.FrozenPendingRow[] r0 = (io.realm.FrozenPendingRow[]) r0
            return r0
    }

    @Override // io.realm.internal.Row
    public void checkIfAttached() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object was frozen while a query for it was still running."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.Row freeze(io.realm.internal.OsSharedRealm r1) {
            r0 = this;
            io.realm.internal.InvalidRow r1 = io.realm.internal.InvalidRow.INSTANCE
            return r1
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getColumnCount() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object was frozen while a query for it was still running."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(java.lang.String r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This object was frozen while a query for it was still running."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.internal.Row
    public java.lang.String[] getColumnNames() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object was frozen while a query for it was still running."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public io.realm.RealmFieldType getColumnType(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public java.util.Date getDate(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public org.bson.types.Decimal128 getDecimal128(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public double getDouble(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public float getFloat(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getLink(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getLong(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsList getModelList(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getModelMap(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getModelSet(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.core.NativeRealmAny getNativeRealmAny(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public org.bson.types.ObjectId getObjectId(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object was frozen while a query for it was still running."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getRealmAnyMap(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getRealmAnySet(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public java.lang.String getString(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.Table getTable() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object was frozen while a query for it was still running."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public java.util.UUID getUUID(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsList getValueList(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getValueMap(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getValueSet(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(java.lang.String r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This object was frozen while a query for it was still running."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.realm.internal.Row
    public boolean isNull(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean isNullLink(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.realm.internal.Row
    public void nullifyLink(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setBinaryByteArray(long r1, byte[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long r1, boolean r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDate(long r1, java.util.Date r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDecimal128(long r1, org.bson.types.Decimal128 r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDouble(long r1, double r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setFloat(long r1, float r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setLink(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setLong(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setNull(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setObjectId(long r1, org.bson.types.ObjectId r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setRealmAny(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setString(long r1, java.lang.String r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setUUID(long r1, java.util.UUID r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This object was frozen while a query for it was still running."
            r1.<init>(r2)
            throw r1
    }
}
