package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ColumnInfo {
    private final java.util.Map<java.lang.String, io.realm.internal.ColumnInfo.ColumnDetails> columnKeysFromColumnNames;
    private final java.util.Map<java.lang.String, io.realm.internal.ColumnInfo.ColumnDetails> columnkeysFromJavaFieldNames;
    private final java.util.Map<java.lang.String, java.lang.String> javaFieldNameToInternalNames;
    private final boolean mutable;

    /* JADX INFO: renamed from: io.realm.internal.ColumnInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ColumnDetails {
        public final long columnKey;
        public final io.realm.RealmFieldType columnType;
        public final java.lang.String linkedClassName;

        private ColumnDetails(long r1, io.realm.RealmFieldType r3, @javax.annotation.Nullable java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.columnKey = r1
                r0.columnType = r3
                r0.linkedClassName = r4
                return
        }

        public ColumnDetails(io.realm.internal.Property r4) {
                r3 = this;
                long r0 = r4.getColumnKey()
                io.realm.RealmFieldType r2 = r4.getType()
                java.lang.String r4 = r4.getLinkedObjectName()
                r3.<init>(r0, r2, r4)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ColumnDetails["
                r0.<init>(r1)
                long r1 = r3.columnKey
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                io.realm.RealmFieldType r2 = r3.columnType
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = r3.linkedClassName
                java.lang.String r2 = "]"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    public ColumnInfo() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public ColumnInfo(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private ColumnInfo(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.columnkeysFromJavaFieldNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.columnKeysFromColumnNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.javaFieldNameToInternalNames = r0
            r1.mutable = r3
            return
    }

    public final long addColumnDetails(java.lang.String r3, java.lang.String r4, io.realm.internal.OsObjectSchemaInfo r5) {
            r2 = this;
            io.realm.internal.Property r5 = r5.getProperty(r4)
            io.realm.internal.ColumnInfo$ColumnDetails r0 = new io.realm.internal.ColumnInfo$ColumnDetails
            r0.<init>(r5)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r1 = r2.columnkeysFromJavaFieldNames
            r1.put(r3, r0)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r1 = r2.columnKeysFromColumnNames
            r1.put(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.javaFieldNameToInternalNames
            r0.put(r3, r4)
            long r3 = r5.getColumnKey()
            return r3
    }

    public abstract void copy(io.realm.internal.ColumnInfo r1, io.realm.internal.ColumnInfo r2);

    public void copyFrom(io.realm.internal.ColumnInfo r3) {
            r2 = this;
            boolean r0 = r2.mutable
            if (r0 == 0) goto L31
            java.lang.String r0 = "Attempt to copy null ColumnInfo"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r2.columnkeysFromJavaFieldNames
            r0.clear()
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r2.columnkeysFromJavaFieldNames
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r1 = r3.columnkeysFromJavaFieldNames
            r0.putAll(r1)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r2.columnKeysFromColumnNames
            r0.clear()
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r2.columnKeysFromColumnNames
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r1 = r3.columnKeysFromColumnNames
            r0.putAll(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.javaFieldNameToInternalNames
            r0.clear()
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.javaFieldNameToInternalNames
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.javaFieldNameToInternalNames
            r0.putAll(r1)
            r2.copy(r3, r2)
            return
        L31:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Attempt to modify an immutable ColumnInfo"
            r3.<init>(r0)
            throw r3
    }

    @javax.annotation.Nullable
    public io.realm.internal.ColumnInfo.ColumnDetails getColumnDetails(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r1.columnkeysFromJavaFieldNames
            java.lang.Object r2 = r0.get(r2)
            io.realm.internal.ColumnInfo$ColumnDetails r2 = (io.realm.internal.ColumnInfo.ColumnDetails) r2
            return r2
    }

    public long getColumnKey(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r2.columnkeysFromJavaFieldNames
            java.lang.Object r3 = r0.get(r3)
            io.realm.internal.ColumnInfo$ColumnDetails r3 = (io.realm.internal.ColumnInfo.ColumnDetails) r3
            if (r3 != 0) goto Ld
            r0 = -1
            goto Lf
        Ld:
            long r0 = r3.columnKey
        Lf:
            return r0
    }

    public java.util.Map<java.lang.String, io.realm.internal.ColumnInfo.ColumnDetails> getColumnKeysMap() {
            r1 = this;
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r0 = r1.columnkeysFromJavaFieldNames
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String getInternalFieldName(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.javaFieldNameToInternalNames
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final boolean isMutable() {
            r1 = this;
            boolean r0 = r1.mutable
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColumnInfo["
            r0.<init>(r1)
            java.lang.String r1 = "mutable="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            boolean r2 = r8.mutable
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r2 = r8.columnkeysFromJavaFieldNames
            java.lang.String r3 = "->"
            r4 = 0
            java.lang.String r5 = "]"
            if (r2 == 0) goto L60
            java.lang.String r2 = "JavaFieldNames=["
            r0.append(r2)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r2 = r8.columnkeysFromJavaFieldNames
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L37:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r6 == 0) goto L48
            r0.append(r1)
        L48:
            java.lang.Object r6 = r7.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
            r0.append(r3)
            java.lang.Object r6 = r7.getValue()
            r0.append(r6)
            r6 = 1
            goto L37
        L5d:
            r0.append(r5)
        L60:
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r2 = r8.columnKeysFromColumnNames
            if (r2 == 0) goto L9c
            java.lang.String r2 = ", InternalFieldNames=["
            r0.append(r2)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo$ColumnDetails> r2 = r8.columnKeysFromColumnNames
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L73:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L99
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r4 == 0) goto L84
            r0.append(r1)
        L84:
            java.lang.Object r4 = r6.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            r0.append(r3)
            java.lang.Object r4 = r6.getValue()
            r0.append(r4)
            r4 = 1
            goto L73
        L99:
            r0.append(r5)
        L9c:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
