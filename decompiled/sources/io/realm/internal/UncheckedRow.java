package io.realm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class UncheckedRow implements io.realm.internal.NativeObject, io.realm.internal.Row {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final long nativeFinalizerPtr = 0;
    public final io.realm.internal.NativeContext context;
    private final long nativePtr;
    public final io.realm.internal.Table parent;

    /* JADX INFO: renamed from: io.realm.internal.UncheckedRow$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.internal.UncheckedRow.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.internal.UncheckedRow.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.UncheckedRow.nativeFinalizerPtr = r0
            return
    }

    public UncheckedRow(io.realm.internal.NativeContext r1, io.realm.internal.Table r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.parent = r2
            r0.nativePtr = r3
            r1.addReference(r0)
            return
    }

    public UncheckedRow(io.realm.internal.UncheckedRow r3) {
            r2 = this;
            r2.<init>()
            io.realm.internal.NativeContext r0 = r3.context
            r2.context = r0
            io.realm.internal.Table r0 = r3.parent
            r2.parent = r0
            long r0 = r3.nativePtr
            r2.nativePtr = r0
            return
    }

    private static native long nativeGetFinalizerPtr();

    @Override // io.realm.internal.Row
    public void checkIfAttached() {
            r2 = this;
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Object is no longer managed by Realm. Has it been deleted?"
            r0.<init>(r1)
            throw r0
    }

    public io.realm.internal.CheckedRow convertToChecked() {
            r1 = this;
            io.realm.internal.CheckedRow r0 = io.realm.internal.CheckedRow.getFromRow(r1)
            return r0
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long r3, io.realm.RealmFieldType r5) {
            r2 = this;
            int[] r0 = io.realm.internal.UncheckedRow.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 != r1) goto L17
            io.realm.internal.OsList r3 = r2.getModelList(r3)
            long r3 = r3.createAndAddEmbeddedObject()
            return r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Wrong parentPropertyType, expected OBJECT or LIST but received "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            io.realm.internal.Table r5 = r2.parent
            r5.checkImmutable()
            long r0 = r2.nativePtr
            long r3 = r2.nativeCreateEmbeddedObject(r0, r3)
            return r3
    }

    public io.realm.internal.Row freeze(io.realm.internal.OsSharedRealm r8) {
            r7 = this;
            boolean r0 = r7.isValid()
            if (r0 != 0) goto L9
            io.realm.internal.InvalidRow r8 = io.realm.internal.InvalidRow.INSTANCE
            return r8
        L9:
            io.realm.internal.UncheckedRow r0 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r1 = r7.context
            io.realm.internal.Table r2 = r7.parent
            io.realm.internal.Table r2 = r2.freeze(r8)
            long r3 = r7.nativePtr
            long r5 = r8.getNativePtr()
            long r3 = r7.nativeFreeze(r3, r5)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            byte[] r3 = r2.nativeGetByteArray(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = r2.nativeGetBoolean(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public long getColumnCount() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = r2.nativeGetColumnCount(r0)
            return r0
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            long r0 = r2.nativePtr
            long r0 = r2.nativeGetColumnKey(r0, r3)
            return r0
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Column name can not be null."
            r3.<init>(r0)
            throw r3
    }

    @Override // io.realm.internal.Row
    public java.lang.String[] getColumnNames() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String[] r0 = r2.nativeGetColumnNames(r0)
            return r0
    }

    @Override // io.realm.internal.Row
    public io.realm.RealmFieldType getColumnType(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            int r3 = r2.nativeGetColumnType(r0, r3)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.fromNativeValue(r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public java.util.Date getDate(long r4) {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r3.nativePtr
            long r4 = r3.nativeGetTimestamp(r1, r4)
            r0.<init>(r4)
            return r0
    }

    @Override // io.realm.internal.Row
    public org.bson.types.Decimal128 getDecimal128(long r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeGetDecimal128(r0, r5)
            if (r5 == 0) goto L13
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
        L13:
            r5 = 0
            return r5
    }

    @Override // io.realm.internal.Row
    public double getDouble(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            double r3 = r2.nativeGetDouble(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public float getFloat(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            float r3 = r2.nativeGetFloat(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public long getLink(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r3 = r2.nativeGetLink(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public long getLong(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r3 = r2.nativeGetLong(r0, r3)
            return r3
    }

    public io.realm.internal.OsList getModelList(long r2) {
            r1 = this;
            io.realm.internal.OsList r0 = new io.realm.internal.OsList
            r0.<init>(r1, r2)
            return r0
    }

    public io.realm.internal.OsMap getModelMap(long r2) {
            r1 = this;
            io.realm.internal.OsMap r0 = new io.realm.internal.OsMap
            r0.<init>(r1, r2)
            return r0
    }

    public io.realm.internal.OsSet getModelSet(long r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = new io.realm.internal.OsSet
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.UncheckedRow.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.core.NativeRealmAny getNativeRealmAny(long r4) {
            r3 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            long r1 = r3.nativePtr
            long r4 = r3.nativeGetRealmAny(r1, r4)
            r0.<init>(r4)
            return r0
    }

    @Override // io.realm.internal.Row
    public org.bson.types.ObjectId getObjectId(long r4) {
            r3 = this;
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            long r1 = r3.nativePtr
            java.lang.String r4 = r3.nativeGetObjectId(r1, r4)
            r0.<init>(r4)
            return r0
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = r2.nativeGetObjectKey(r0)
            return r0
    }

    public io.realm.internal.OsMap getRealmAnyMap(long r2) {
            r1 = this;
            io.realm.internal.OsMap r0 = new io.realm.internal.OsMap
            r0.<init>(r1, r2)
            return r0
    }

    public io.realm.internal.OsSet getRealmAnySet(long r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = new io.realm.internal.OsSet
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.realm.internal.Row
    public java.lang.String getString(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = r2.nativeGetString(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public io.realm.internal.Table getTable() {
            r1 = this;
            io.realm.internal.Table r0 = r1.parent
            return r0
    }

    @Override // io.realm.internal.Row
    public java.util.UUID getUUID(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = r2.nativeGetUUID(r0, r3)
            java.util.UUID r3 = java.util.UUID.fromString(r3)
            return r3
    }

    public io.realm.internal.OsList getValueList(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            io.realm.internal.OsList r3 = new io.realm.internal.OsList
            r3.<init>(r0, r1)
            return r3
    }

    public io.realm.internal.OsMap getValueMap(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            io.realm.internal.OsMap r3 = new io.realm.internal.OsMap
            r3.<init>(r0, r1)
            return r3
    }

    public io.realm.internal.OsSet getValueSet(long r1, io.realm.RealmFieldType r3) {
            r0 = this;
            io.realm.internal.OsSet r3 = new io.realm.internal.OsSet
            r3.<init>(r0, r1)
            return r3
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = r2.nativeHasColumn(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isNull(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = r2.nativeIsNull(r0, r3)
            return r3
    }

    public boolean isNullLink(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = r2.nativeIsNullLink(r0, r3)
            return r3
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
            r5 = this;
            long r0 = r5.nativePtr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            boolean r0 = r5.nativeIsValid(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public native long nativeCreateEmbeddedObject(long r1, long r3);

    public native long nativeFreeze(long r1, long r3);

    public native boolean nativeGetBoolean(long r1, long r3);

    public native byte[] nativeGetByteArray(long r1, long r3);

    public native long nativeGetColumnCount(long r1);

    public native long nativeGetColumnKey(long r1, java.lang.String r3);

    public native java.lang.String[] nativeGetColumnNames(long r1);

    public native int nativeGetColumnType(long r1, long r3);

    public native long[] nativeGetDecimal128(long r1, long r3);

    public native double nativeGetDouble(long r1, long r3);

    public native float nativeGetFloat(long r1, long r3);

    public native long nativeGetLink(long r1, long r3);

    public native long nativeGetLong(long r1, long r3);

    public native java.lang.String nativeGetObjectId(long r1, long r3);

    public native long nativeGetObjectKey(long r1);

    public native long nativeGetRealmAny(long r1, long r3);

    public native java.lang.String nativeGetString(long r1, long r3);

    public native long nativeGetTimestamp(long r1, long r3);

    public native java.lang.String nativeGetUUID(long r1, long r3);

    public native boolean nativeHasColumn(long r1, java.lang.String r3);

    public native boolean nativeIsNull(long r1, long r3);

    public native boolean nativeIsNullLink(long r1, long r3);

    public native boolean nativeIsValid(long r1);

    public native void nativeNullifyLink(long r1, long r3);

    public native void nativeSetBoolean(long r1, long r3, boolean r5);

    public native void nativeSetByteArray(long r1, long r3, @javax.annotation.Nullable byte[] r5);

    public native void nativeSetDecimal128(long r1, long r3, long r5, long r7);

    public native void nativeSetDouble(long r1, long r3, double r5);

    public native void nativeSetFloat(long r1, long r3, float r5);

    public native void nativeSetLink(long r1, long r3, long r5);

    public native void nativeSetLong(long r1, long r3, long r5);

    public native void nativeSetNull(long r1, long r3);

    public native void nativeSetObjectId(long r1, long r3, java.lang.String r5);

    public native void nativeSetRealmAny(long r1, long r3, long r5);

    public native void nativeSetString(long r1, long r3, java.lang.String r5);

    public native void nativeSetTimestamp(long r1, long r3, long r5);

    public native void nativeSetUUID(long r1, long r3, java.lang.String r5);

    @Override // io.realm.internal.Row
    public void nullifyLink(long r3) {
            r2 = this;
            io.realm.internal.Table r0 = r2.parent
            r0.checkImmutable()
            long r0 = r2.nativePtr
            r2.nativeNullifyLink(r0, r3)
            return
    }

    @Override // io.realm.internal.Row
    public void setBinaryByteArray(long r8, @javax.annotation.Nullable byte[] r10) {
            r7 = this;
            io.realm.internal.Table r0 = r7.parent
            r0.checkImmutable()
            long r2 = r7.nativePtr
            r1 = r7
            r4 = r8
            r6 = r10
            r1.nativeSetByteArray(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long r8, boolean r10) {
            r7 = this;
            io.realm.internal.Table r0 = r7.parent
            r0.checkImmutable()
            long r2 = r7.nativePtr
            r1 = r7
            r4 = r8
            r6 = r10
            r1.nativeSetBoolean(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setDate(long r9, java.util.Date r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            if (r11 == 0) goto L13
            long r6 = r11.getTime()
            long r2 = r8.nativePtr
            r1 = r8
            r4 = r9
            r1.nativeSetTimestamp(r2, r4, r6)
            return
        L13:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Null Date is not allowed."
            r9.<init>(r10)
            throw r9
    }

    @Override // io.realm.internal.Row
    public void setDecimal128(long r12, @javax.annotation.Nullable org.bson.types.Decimal128 r14) {
            r11 = this;
            io.realm.internal.Table r0 = r11.parent
            r0.checkImmutable()
            if (r14 != 0) goto Ld
            long r0 = r11.nativePtr
            r11.nativeSetNull(r0, r12)
            goto L1c
        Ld:
            long r3 = r11.nativePtr
            long r7 = r14.getLow()
            long r9 = r14.getHigh()
            r2 = r11
            r5 = r12
            r2.nativeSetDecimal128(r3, r5, r7, r9)
        L1c:
            return
    }

    @Override // io.realm.internal.Row
    public void setDouble(long r9, double r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            long r2 = r8.nativePtr
            r1 = r8
            r4 = r9
            r6 = r11
            r1.nativeSetDouble(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setFloat(long r8, float r10) {
            r7 = this;
            io.realm.internal.Table r0 = r7.parent
            r0.checkImmutable()
            long r2 = r7.nativePtr
            r1 = r7
            r4 = r8
            r6 = r10
            r1.nativeSetFloat(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setLink(long r9, long r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            long r2 = r8.nativePtr
            r1 = r8
            r4 = r9
            r6 = r11
            r1.nativeSetLink(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setLong(long r9, long r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            long r2 = r8.nativePtr
            r1 = r8
            r4 = r9
            r6 = r11
            r1.nativeSetLong(r2, r4, r6)
            return
    }

    public void setNull(long r3) {
            r2 = this;
            io.realm.internal.Table r0 = r2.parent
            r0.checkImmutable()
            long r0 = r2.nativePtr
            r2.nativeSetNull(r0, r3)
            return
    }

    @Override // io.realm.internal.Row
    public void setObjectId(long r9, @javax.annotation.Nullable org.bson.types.ObjectId r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            if (r11 != 0) goto Ld
            long r0 = r8.nativePtr
            r8.nativeSetNull(r0, r9)
            goto L18
        Ld:
            long r3 = r8.nativePtr
            java.lang.String r7 = r11.toString()
            r2 = r8
            r5 = r9
            r2.nativeSetObjectId(r3, r5, r7)
        L18:
            return
    }

    @Override // io.realm.internal.Row
    public void setRealmAny(long r9, long r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            long r2 = r8.nativePtr
            r1 = r8
            r4 = r9
            r6 = r11
            r1.nativeSetRealmAny(r2, r4, r6)
            return
    }

    @Override // io.realm.internal.Row
    public void setString(long r9, @javax.annotation.Nullable java.lang.String r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            if (r11 != 0) goto Ld
            long r0 = r8.nativePtr
            r8.nativeSetNull(r0, r9)
            goto L15
        Ld:
            long r3 = r8.nativePtr
            r2 = r8
            r5 = r9
            r7 = r11
            r2.nativeSetString(r3, r5, r7)
        L15:
            return
    }

    @Override // io.realm.internal.Row
    public void setUUID(long r9, @javax.annotation.Nullable java.util.UUID r11) {
            r8 = this;
            io.realm.internal.Table r0 = r8.parent
            r0.checkImmutable()
            if (r11 != 0) goto Ld
            long r0 = r8.nativePtr
            r8.nativeSetNull(r0, r9)
            goto L18
        Ld:
            long r3 = r8.nativePtr
            java.lang.String r7 = r11.toString()
            r2 = r8
            r5 = r9
            r2.nativeSetUUID(r3, r5, r7)
        L18:
            return
    }
}
