package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class OsList implements io.realm.internal.NativeObject, io.realm.internal.ObservableCollection, io.realm.internal.OsCollection {
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.internal.NativeContext context;
    private final long nativePtr;
    private final io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection.CollectionObserverPair> observerPairs;
    private final io.realm.internal.Table targetTable;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsList.nativeFinalizerPtr = r0
            return
    }

    private OsList(io.realm.internal.OsSharedRealm r2, long r3, @javax.annotation.Nullable io.realm.internal.Table r5) {
            r1 = this;
            r1.<init>()
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r1.observerPairs = r0
            r1.nativePtr = r3
            r1.targetTable = r5
            io.realm.internal.NativeContext r2 = r2.context
            r1.context = r2
            r2.addReference(r1)
            return
    }

    public OsList(io.realm.internal.UncheckedRow r8, long r9) {
            r7 = this;
            r7.<init>()
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r7.observerPairs = r0
            io.realm.internal.Table r0 = r8.getTable()
            io.realm.internal.OsSharedRealm r0 = r0.getSharedRealm()
            long r1 = r0.getNativePtr()
            long r3 = r8.getNativePtr()
            r5 = r9
            long[] r8 = nativeCreate(r1, r3, r5)
            r9 = 0
            r9 = r8[r9]
            r7.nativePtr = r9
            io.realm.internal.NativeContext r9 = r0.context
            r7.context = r9
            r9.addReference(r7)
            r9 = 1
            r1 = r8[r9]
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 == 0) goto L3e
            io.realm.internal.Table r10 = new io.realm.internal.Table
            r1 = r8[r9]
            r10.<init>(r0, r1)
            r7.targetTable = r10
            goto L41
        L3e:
            r8 = 0
            r7.targetTable = r8
        L41:
            return
    }

    private static native void nativeAddBinary(long r0, @javax.annotation.Nullable byte[] r2);

    private static native void nativeAddBoolean(long r0, boolean r2);

    private static native void nativeAddDate(long r0, long r2);

    private static native void nativeAddDecimal128(long r0, long r2, long r4);

    private static native void nativeAddDouble(long r0, double r2);

    private static native void nativeAddFloat(long r0, float r2);

    private static native void nativeAddLong(long r0, long r2);

    private static native void nativeAddNull(long r0);

    private static native void nativeAddObjectId(long r0, java.lang.String r2);

    private static native void nativeAddRealmAny(long r0, long r2);

    private static native void nativeAddRow(long r0, long r2);

    private static native void nativeAddString(long r0, @javax.annotation.Nullable java.lang.String r2);

    private static native void nativeAddUUID(long r0, java.lang.String r2);

    private static native long[] nativeCreate(long r0, long r2, long r4);

    private static native long nativeCreateAndAddEmbeddedObject(long r0, long r2);

    private static native long nativeCreateAndSetEmbeddedObject(long r0, long r2);

    private static native void nativeDelete(long r0, long r2);

    private static native void nativeDeleteAll(long r0);

    private static native long nativeFreeze(long r0, long r2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long r0);

    private static native long nativeGetRow(long r0, long r2);

    private static native java.lang.Object nativeGetValue(long r0, long r2);

    private static native void nativeInsertBinary(long r0, long r2, @javax.annotation.Nullable byte[] r4);

    private static native void nativeInsertBoolean(long r0, long r2, boolean r4);

    private static native void nativeInsertDate(long r0, long r2, long r4);

    private static native void nativeInsertDecimal128(long r0, long r2, long r4, long r6);

    private static native void nativeInsertDouble(long r0, long r2, double r4);

    private static native void nativeInsertFloat(long r0, long r2, float r4);

    private static native void nativeInsertLong(long r0, long r2, long r4);

    private static native void nativeInsertNull(long r0, long r2);

    private static native void nativeInsertObjectId(long r0, long r2, java.lang.String r4);

    private static native void nativeInsertRealmAny(long r0, long r2, long r4);

    private static native void nativeInsertRow(long r0, long r2, long r4);

    private static native void nativeInsertString(long r0, long r2, @javax.annotation.Nullable java.lang.String r4);

    private static native void nativeInsertUUID(long r0, long r2, java.lang.String r4);

    private static native boolean nativeIsValid(long r0);

    private static native void nativeMove(long r0, long r2, long r4);

    private static native void nativeRemove(long r0, long r2);

    private static native void nativeRemoveAll(long r0);

    private static native void nativeSetBinary(long r0, long r2, @javax.annotation.Nullable byte[] r4);

    private static native void nativeSetBoolean(long r0, long r2, boolean r4);

    private static native void nativeSetDate(long r0, long r2, long r4);

    private static native void nativeSetDecimal128(long r0, long r2, long r4, long r6);

    private static native void nativeSetDouble(long r0, long r2, double r4);

    private static native void nativeSetFloat(long r0, long r2, float r4);

    private static native void nativeSetLong(long r0, long r2, long r4);

    private static native void nativeSetNull(long r0, long r2);

    private static native void nativeSetObjectId(long r0, long r2, java.lang.String r4);

    private static native void nativeSetRealmAny(long r0, long r2, long r4);

    private static native void nativeSetRow(long r0, long r2, long r4);

    private static native void nativeSetString(long r0, long r2, @javax.annotation.Nullable java.lang.String r4);

    private static native void nativeSetUUID(long r0, long r2, java.lang.String r4);

    private static native long nativeSize(long r0);

    private native void nativeStartListening(long r1);

    private native void nativeStopListening(long r1);

    public void addBinary(@javax.annotation.Nullable byte[] r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddBinary(r0, r3)
            return
    }

    public void addBoolean(boolean r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddBoolean(r0, r3)
            return
    }

    public void addDate(@javax.annotation.Nullable java.util.Date r5) {
            r4 = this;
            if (r5 != 0) goto L8
            long r0 = r4.nativePtr
            nativeAddNull(r0)
            goto L11
        L8:
            long r0 = r4.nativePtr
            long r2 = r5.getTime()
            nativeAddDate(r0, r2)
        L11:
            return
    }

    public void addDecimal128(@javax.annotation.Nullable org.bson.types.Decimal128 r9) {
            r8 = this;
            if (r9 != 0) goto L8
            long r0 = r8.nativePtr
            nativeAddNull(r0)
            goto L15
        L8:
            long r2 = r8.nativePtr
            long r4 = r9.getLow()
            long r6 = r9.getHigh()
            nativeAddDecimal128(r2, r4, r6)
        L15:
            return
    }

    public void addDouble(double r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddDouble(r0, r3)
            return
    }

    public void addFloat(float r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddFloat(r0, r3)
            return
    }

    public <T> void addListener(T r3, io.realm.OrderedRealmCollectionChangeListener<T> r4) {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r0 = r2.observerPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            long r0 = r2.nativePtr
            r2.nativeStartListening(r0)
        Ld:
            io.realm.internal.ObservableCollection$CollectionObserverPair r0 = new io.realm.internal.ObservableCollection$CollectionObserverPair
            r0.<init>(r3, r4)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r3 = r2.observerPairs
            r3.add(r0)
            return
    }

    public <T> void addListener(T r2, io.realm.RealmChangeListener<T> r3) {
            r1 = this;
            io.realm.internal.ObservableCollection$RealmChangeListenerWrapper r0 = new io.realm.internal.ObservableCollection$RealmChangeListenerWrapper
            r0.<init>(r3)
            r1.addListener(r2, r0)
            return
    }

    public void addLong(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddLong(r0, r3)
            return
    }

    public void addNull() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddNull(r0)
            return
    }

    public void addObjectId(@javax.annotation.Nullable org.bson.types.ObjectId r3) {
            r2 = this;
            if (r3 != 0) goto L8
            long r0 = r2.nativePtr
            nativeAddNull(r0)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r3 = r3.toString()
            nativeAddObjectId(r0, r3)
        L11:
            return
    }

    public void addRealmAny(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddRealmAny(r0, r3)
            return
    }

    public void addRow(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddRow(r0, r3)
            return
    }

    public void addString(@javax.annotation.Nullable java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeAddString(r0, r3)
            return
    }

    public void addUUID(@javax.annotation.Nullable java.util.UUID r3) {
            r2 = this;
            if (r3 != 0) goto L8
            long r0 = r2.nativePtr
            nativeAddNull(r0)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r3 = r3.toString()
            nativeAddUUID(r0, r3)
        L11:
            return
    }

    public long createAndAddEmbeddedObject() {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r4.size()
            long r0 = nativeCreateAndAddEmbeddedObject(r0, r2)
            return r0
    }

    public long createAndAddEmbeddedObject(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r3 = nativeCreateAndAddEmbeddedObject(r0, r3)
            return r3
    }

    public long createAndSetEmbeddedObject(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r3 = nativeCreateAndSetEmbeddedObject(r0, r3)
            return r3
    }

    public void delete(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeDelete(r0, r3)
            return
    }

    public void deleteAll() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeDeleteAll(r0)
            return
    }

    public io.realm.internal.OsList freeze(io.realm.internal.OsSharedRealm r6) {
            r5 = this;
            io.realm.internal.OsList r0 = new io.realm.internal.OsList
            long r1 = r5.nativePtr
            long r3 = r6.getNativePtr()
            long r1 = nativeFreeze(r1, r3)
            io.realm.internal.Table r3 = r5.targetTable
            if (r3 == 0) goto L15
            io.realm.internal.Table r3 = r3.freeze(r6)
            goto L16
        L15:
            r3 = 0
        L16:
            r0.<init>(r6, r1, r3)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsList.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.internal.TableQuery getQuery() {
            r5 = this;
            io.realm.internal.TableQuery r0 = new io.realm.internal.TableQuery
            io.realm.internal.NativeContext r1 = r5.context
            io.realm.internal.Table r2 = r5.targetTable
            long r3 = r5.nativePtr
            long r3 = nativeGetQuery(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public io.realm.internal.Table getTargetTable() {
            r1 = this;
            io.realm.internal.Table r0 = r1.targetTable
            return r0
    }

    public io.realm.internal.UncheckedRow getUncheckedRow(long r4) {
            r3 = this;
            io.realm.internal.Table r0 = r3.targetTable
            long r1 = r3.nativePtr
            long r4 = nativeGetRow(r1, r4)
            io.realm.internal.UncheckedRow r4 = r0.getUncheckedRowByPointer(r4)
            return r4
    }

    @javax.annotation.Nullable
    public java.lang.Object getValue(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.Object r3 = nativeGetValue(r0, r3)
            return r3
    }

    public void insertBinary(long r3, @javax.annotation.Nullable byte[] r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeInsertBinary(r0, r3, r5)
            return
    }

    public void insertBoolean(long r3, boolean r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeInsertBoolean(r0, r3, r5)
            return
    }

    public void insertDate(long r9, @javax.annotation.Nullable java.util.Date r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.nativePtr
            nativeInsertNull(r0, r9)
            goto L12
        L8:
            long r2 = r8.nativePtr
            long r6 = r11.getTime()
            r4 = r9
            nativeInsertDate(r2, r4, r6)
        L12:
            return
    }

    public void insertDecimal128(long r11, @javax.annotation.Nullable org.bson.types.Decimal128 r13) {
            r10 = this;
            if (r13 != 0) goto L8
            long r0 = r10.nativePtr
            nativeInsertNull(r0, r11)
            goto L16
        L8:
            long r2 = r10.nativePtr
            long r6 = r13.getLow()
            long r8 = r13.getHigh()
            r4 = r11
            nativeInsertDecimal128(r2, r4, r6, r8)
        L16:
            return
    }

    public void insertDouble(long r7, double r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeInsertDouble(r0, r2, r4)
            return
    }

    public void insertFloat(long r3, float r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeInsertFloat(r0, r3, r5)
            return
    }

    public void insertLong(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeInsertLong(r0, r2, r4)
            return
    }

    public void insertNull(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeInsertNull(r0, r3)
            return
    }

    public void insertObjectId(long r3, @javax.annotation.Nullable org.bson.types.ObjectId r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.nativePtr
            nativeInsertNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r5 = r5.toString()
            nativeInsertObjectId(r0, r3, r5)
        L11:
            return
    }

    public void insertRealmAny(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeInsertRealmAny(r0, r2, r4)
            return
    }

    public void insertRow(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeInsertRow(r0, r2, r4)
            return
    }

    public void insertString(long r3, @javax.annotation.Nullable java.lang.String r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeInsertString(r0, r3, r5)
            return
    }

    public void insertUUID(long r3, @javax.annotation.Nullable java.util.UUID r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.nativePtr
            nativeInsertNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r5 = r5.toString()
            nativeInsertUUID(r0, r3, r5)
        L11:
            return
    }

    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.nativePtr
            long r0 = nativeSize(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsValid(r0)
            return r0
    }

    public void move(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeMove(r0, r2, r4)
            return
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long r3) {
            r2 = this;
            io.realm.internal.OsCollectionChangeSet r0 = new io.realm.internal.OsCollectionChangeSet
            r1 = 0
            r0.<init>(r3, r1)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Ld
            return
        Ld:
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r3 = r2.observerPairs
            io.realm.internal.ObservableCollection$Callback r4 = new io.realm.internal.ObservableCollection$Callback
            r4.<init>(r0)
            r3.foreach(r4)
            return
    }

    public void remove(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeRemove(r0, r3)
            return
    }

    public void removeAll() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeRemoveAll(r0)
            return
    }

    public void removeAllListeners() {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r0 = r2.observerPairs
            r0.clear()
            long r0 = r2.nativePtr
            r2.nativeStopListening(r0)
            return
    }

    public <T> void removeListener(T r2, io.realm.OrderedRealmCollectionChangeListener<T> r3) {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r0 = r1.observerPairs
            r0.remove(r2, r3)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r2 = r1.observerPairs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L12
            long r2 = r1.nativePtr
            r1.nativeStopListening(r2)
        L12:
            return
    }

    public <T> void removeListener(T r2, io.realm.RealmChangeListener<T> r3) {
            r1 = this;
            io.realm.internal.ObservableCollection$RealmChangeListenerWrapper r0 = new io.realm.internal.ObservableCollection$RealmChangeListenerWrapper
            r0.<init>(r3)
            r1.removeListener(r2, r0)
            return
    }

    public void setBinary(long r3, @javax.annotation.Nullable byte[] r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetBinary(r0, r3, r5)
            return
    }

    public void setBoolean(long r3, boolean r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetBoolean(r0, r3, r5)
            return
    }

    public void setDate(long r9, @javax.annotation.Nullable java.util.Date r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.nativePtr
            nativeSetNull(r0, r9)
            goto L12
        L8:
            long r2 = r8.nativePtr
            long r6 = r11.getTime()
            r4 = r9
            nativeSetDate(r2, r4, r6)
        L12:
            return
    }

    public void setDecimal128(long r11, @javax.annotation.Nullable org.bson.types.Decimal128 r13) {
            r10 = this;
            if (r13 != 0) goto L8
            long r0 = r10.nativePtr
            nativeSetNull(r0, r11)
            goto L16
        L8:
            long r2 = r10.nativePtr
            long r6 = r13.getLow()
            long r8 = r13.getHigh()
            r4 = r11
            nativeSetDecimal128(r2, r4, r6, r8)
        L16:
            return
    }

    public void setDouble(long r7, double r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeSetDouble(r0, r2, r4)
            return
    }

    public void setFloat(long r3, float r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetFloat(r0, r3, r5)
            return
    }

    public void setLong(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeSetLong(r0, r2, r4)
            return
    }

    public void setNull(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            return
    }

    public void setObjectId(long r3, @javax.annotation.Nullable org.bson.types.ObjectId r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r5 = r5.toString()
            nativeSetObjectId(r0, r3, r5)
        L11:
            return
    }

    public void setRealmAny(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeSetRealmAny(r0, r2, r4)
            return
    }

    public void setRow(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            nativeSetRow(r0, r2, r4)
            return
    }

    public void setString(long r3, @javax.annotation.Nullable java.lang.String r5) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetString(r0, r3, r5)
            return
    }

    public void setUUID(long r3, @javax.annotation.Nullable java.util.UUID r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r5 = r5.toString()
            nativeSetUUID(r0, r3, r5)
        L11:
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            return r0
    }
}
