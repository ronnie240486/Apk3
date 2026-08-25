package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class CheckedRow extends io.realm.internal.UncheckedRow {
    private io.realm.internal.UncheckedRow originalRow;

    private CheckedRow(io.realm.internal.NativeContext r1, io.realm.internal.Table r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public CheckedRow(io.realm.internal.UncheckedRow r1) {
            r0 = this;
            r0.<init>(r1)
            r0.originalRow = r1
            return
    }

    public static io.realm.internal.CheckedRow get(io.realm.internal.NativeContext r2, io.realm.internal.Table r3, long r4) {
            long r0 = r3.getNativePtr()
            long r4 = r3.nativeGetRowPtr(r0, r4)
            io.realm.internal.CheckedRow r0 = new io.realm.internal.CheckedRow
            r0.<init>(r2, r3, r4)
            return r0
    }

    public static io.realm.internal.CheckedRow getFromRow(io.realm.internal.UncheckedRow r1) {
            io.realm.internal.CheckedRow r0 = new io.realm.internal.CheckedRow
            r0.<init>(r1)
            return r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.Row freeze(io.realm.internal.OsSharedRealm r8) {
            r7 = this;
            boolean r0 = r7.isValid()
            if (r0 != 0) goto L9
            io.realm.internal.InvalidRow r8 = io.realm.internal.InvalidRow.INSTANCE
            return r8
        L9:
            io.realm.internal.CheckedRow r0 = new io.realm.internal.CheckedRow
            io.realm.internal.NativeContext r1 = r7.context
            io.realm.internal.Table r2 = r7.parent
            io.realm.internal.Table r2 = r2.freeze(r8)
            long r3 = r7.getNativePtr()
            long r5 = r8.getNativePtr()
            long r3 = r7.nativeFreeze(r3, r5)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsList getModelList(long r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST
            if (r0 != r1) goto L11
            io.realm.internal.OsList r6 = super.getModelList(r6)
            return r6
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            java.lang.String r6 = "Field '%s' is not a 'RealmList'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsMap getModelMap(long r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP
            if (r0 != r1) goto L11
            io.realm.internal.OsMap r6 = super.getRealmAnyMap(r6)
            return r6
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            java.lang.String r6 = "Field '%s' is not a 'RealmDictionary'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsSet getModelSet(long r1) {
            r0 = this;
            io.realm.internal.OsSet r1 = super.getModelSet(r1)
            return r1
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsMap getRealmAnyMap(long r6) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP
            if (r0 != r1) goto L11
            io.realm.internal.OsMap r6 = super.getRealmAnyMap(r6)
            return r6
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            java.lang.String r6 = "Field '%s' is not a 'RealmDictionary'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsSet getRealmAnySet(long r1) {
            r0 = this;
            io.realm.internal.OsSet r1 = super.getModelSet(r1)
            return r1
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsList getValueList(long r6, io.realm.RealmFieldType r8) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            if (r8 != r0) goto Lf
            io.realm.internal.OsList r6 = super.getValueList(r6, r8)
            return r6
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            r6 = 1
            java.lang.String r7 = r8.name()
            r2[r6] = r7
            java.lang.String r6 = "The type of field '%1$s' is not 'RealmFieldType.%2$s'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsMap getValueMap(long r6, io.realm.RealmFieldType r8) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            if (r8 != r0) goto Lf
            io.realm.internal.OsMap r6 = super.getValueMap(r6, r8)
            return r6
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            r6 = 1
            java.lang.String r7 = r8.name()
            r2[r6] = r7
            java.lang.String r6 = "The type of field '%1$s' is not 'RealmFieldType.%2$s'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public io.realm.internal.OsSet getValueSet(long r6, io.realm.RealmFieldType r8) {
            r5 = this;
            io.realm.internal.Table r0 = r5.getTable()
            io.realm.RealmFieldType r0 = r0.getColumnType(r6)
            if (r8 != r0) goto Lf
            io.realm.internal.OsSet r6 = super.getValueSet(r6, r8)
            return r6
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.internal.Table r4 = r5.getTable()
            java.lang.String r6 = r4.getColumnName(r6)
            r2[r3] = r6
            r6 = 1
            java.lang.String r7 = r8.name()
            r2[r6] = r7
            java.lang.String r6 = "The type of field '%1$s' is not 'RealmFieldType.%2$s'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public boolean isNull(long r1) {
            r0 = this;
            boolean r1 = super.isNull(r1)
            return r1
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public boolean isNullLink(long r3) {
            r2 = this;
            io.realm.RealmFieldType r0 = r2.getColumnType(r3)
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT
            if (r0 == r1) goto Lf
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r3 = 0
            return r3
        Lf:
            boolean r3 = super.isNullLink(r3)
            return r3
    }

    @Override // io.realm.internal.UncheckedRow
    public native boolean nativeGetBoolean(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native byte[] nativeGetByteArray(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetColumnCount(long r1);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetColumnKey(long r1, java.lang.String r3);

    @Override // io.realm.internal.UncheckedRow
    public native int nativeGetColumnType(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native long[] nativeGetDecimal128(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native double nativeGetDouble(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native float nativeGetFloat(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetLink(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetLong(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native java.lang.String nativeGetObjectId(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native java.lang.String nativeGetString(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetTimestamp(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native boolean nativeIsNullLink(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeNullifyLink(long r1, long r3);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetBoolean(long r1, long r3, boolean r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetByteArray(long r1, long r3, byte[] r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetDecimal128(long r1, long r3, long r5, long r7);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetDouble(long r1, long r3, double r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetFloat(long r1, long r3, float r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetLink(long r1, long r3, long r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetLong(long r1, long r3, long r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetObjectId(long r1, long r3, java.lang.String r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetString(long r1, long r3, java.lang.String r5);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetTimestamp(long r1, long r3, long r5);

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public void setNull(long r3) {
            r2 = this;
            io.realm.RealmFieldType r0 = r2.getColumnType(r3)
            io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY
            if (r0 != r1) goto Ld
            r0 = 0
            super.setBinaryByteArray(r3, r0)
            goto L10
        Ld:
            super.setNull(r3)
        L10:
            return
    }
}
