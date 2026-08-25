package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class PendingRow implements io.realm.internal.Row {
    private static final java.lang.String PROXY_NOT_SET_MESSAGE = "The 'frontEnd' has not been set.";
    private static final java.lang.String QUERY_EXECUTED_MESSAGE = "The query has been executed. This 'PendingRow' is not valid anymore.";
    private static final java.lang.String QUERY_NOT_RETURNED_MESSAGE = "The pending query has not been executed.";
    private java.lang.ref.WeakReference<io.realm.internal.PendingRow.FrontEnd> frontEndRef;
    private io.realm.RealmChangeListener<io.realm.internal.PendingRow> listener;
    private io.realm.internal.OsResults pendingOsResults;
    private boolean returnCheckedRow;
    private io.realm.internal.OsSharedRealm sharedRealm;


    /* JADX INFO: loaded from: classes2.dex */
    public interface FrontEnd {
        void onQueryFinished(io.realm.internal.Row r1);
    }

    public PendingRow(io.realm.internal.OsSharedRealm r2, io.realm.internal.TableQuery r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.sharedRealm = r2
            io.realm.internal.OsResults r3 = io.realm.internal.OsResults.createFromQuery(r2, r3)
            r1.pendingOsResults = r3
            io.realm.internal.PendingRow$1 r0 = new io.realm.internal.PendingRow$1
            r0.<init>(r1)
            r1.listener = r0
            r3.addListener(r1, r0)
            r1.returnCheckedRow = r4
            r2.addPendingRow(r1)
            return
    }

    public static /* synthetic */ void access$000(io.realm.internal.PendingRow r0) {
            r0.notifyFrontEnd()
            return
    }

    private void clearPendingCollection() {
            r2 = this;
            io.realm.internal.OsResults r0 = r2.pendingOsResults
            io.realm.RealmChangeListener<io.realm.internal.PendingRow> r1 = r2.listener
            r0.removeListener(r2, r1)
            r0 = 0
            r2.pendingOsResults = r0
            r2.listener = r0
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            r0.removePendingRow(r2)
            return
    }

    private void notifyFrontEnd() {
            r3 = this;
            java.lang.ref.WeakReference<io.realm.internal.PendingRow$FrontEnd> r0 = r3.frontEndRef
            if (r0 == 0) goto L39
            java.lang.Object r0 = r0.get()
            io.realm.internal.PendingRow$FrontEnd r0 = (io.realm.internal.PendingRow.FrontEnd) r0
            if (r0 != 0) goto L10
            r3.clearPendingCollection()
            return
        L10:
            io.realm.internal.OsResults r1 = r3.pendingOsResults
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L35
            io.realm.internal.OsResults r1 = r3.pendingOsResults
            io.realm.internal.UncheckedRow r1 = r1.firstUncheckedRow()
            r3.clearPendingCollection()
            if (r1 == 0) goto L2f
            boolean r2 = r3.returnCheckedRow
            if (r2 == 0) goto L2b
            io.realm.internal.CheckedRow r1 = io.realm.internal.CheckedRow.getFromRow(r1)
        L2b:
            r0.onQueryFinished(r1)
            goto L38
        L2f:
            io.realm.internal.InvalidRow r1 = io.realm.internal.InvalidRow.INSTANCE
            r0.onQueryFinished(r1)
            goto L38
        L35:
            r3.clearPendingCollection()
        L38:
            return
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The 'frontEnd' has not been set."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public void checkIfAttached() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The pending query has not been executed."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    public void executeQuery() {
            r2 = this;
            io.realm.internal.OsResults r0 = r2.pendingOsResults
            if (r0 == 0) goto L8
            r2.notifyFrontEnd()
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The query has been executed. This 'PendingRow' is not valid anymore."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.Row freeze(io.realm.internal.OsSharedRealm r1) {
            r0 = this;
            io.realm.FrozenPendingRow r1 = io.realm.FrozenPendingRow.INSTANCE
            return r1
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getColumnCount() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The pending query has not been executed."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(java.lang.String r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The pending query has not been executed."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.internal.Row
    public java.lang.String[] getColumnNames() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The pending query has not been executed."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public io.realm.RealmFieldType getColumnType(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public java.util.Date getDate(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public org.bson.types.Decimal128 getDecimal128(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public double getDouble(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public float getFloat(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getLink(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getLong(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsList getModelList(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getModelMap(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getModelSet(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.core.NativeRealmAny getNativeRealmAny(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public org.bson.types.ObjectId getObjectId(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The pending query has not been executed."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getRealmAnyMap(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getRealmAnySet(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public java.lang.String getString(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.Table getTable() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The pending query has not been executed."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Row
    public java.util.UUID getUUID(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsList getValueList(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsMap getValueMap(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.OsSet getValueSet(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(java.lang.String r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The pending query has not been executed."
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
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public boolean isNullLink(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
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
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setBinaryByteArray(long r1, byte[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long r1, boolean r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDate(long r1, java.util.Date r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDecimal128(long r1, org.bson.types.Decimal128 r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setDouble(long r1, double r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setFloat(long r1, float r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    public void setFrontEnd(io.realm.internal.PendingRow.FrontEnd r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.frontEndRef = r0
            return
    }

    @Override // io.realm.internal.Row
    public void setLink(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setLong(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setNull(long r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setObjectId(long r1, org.bson.types.ObjectId r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setRealmAny(long r1, long r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setString(long r1, java.lang.String r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.internal.Row
    public void setUUID(long r1, java.util.UUID r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The pending query has not been executed."
            r1.<init>(r2)
            throw r1
    }
}
