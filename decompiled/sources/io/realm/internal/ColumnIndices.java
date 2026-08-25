package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ColumnIndices {
    private final java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.ColumnInfo> classToColumnInfoMap;
    private final io.realm.internal.RealmProxyMediator mediator;
    private final io.realm.internal.OsSchemaInfo osSchemaInfo;
    private final java.util.Map<java.lang.String, io.realm.internal.ColumnInfo> simpleClassNameToColumnInfoMap;

    public ColumnIndices(io.realm.internal.RealmProxyMediator r2, io.realm.internal.OsSchemaInfo r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.classToColumnInfoMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.simpleClassNameToColumnInfoMap = r0
            r1.mediator = r2
            r1.osSchemaInfo = r3
            return
    }

    @javax.annotation.Nonnull
    public io.realm.internal.ColumnInfo getColumnInfo(java.lang.Class<? extends io.realm.RealmModel> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.ColumnInfo> r0 = r2.classToColumnInfoMap
            java.lang.Object r0 = r0.get(r3)
            io.realm.internal.ColumnInfo r0 = (io.realm.internal.ColumnInfo) r0
            if (r0 != 0) goto L17
            io.realm.internal.RealmProxyMediator r0 = r2.mediator
            io.realm.internal.OsSchemaInfo r1 = r2.osSchemaInfo
            io.realm.internal.ColumnInfo r0 = r0.createColumnInfo(r3, r1)
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.ColumnInfo> r1 = r2.classToColumnInfoMap
            r1.put(r3, r0)
        L17:
            return r0
    }

    @javax.annotation.Nonnull
    public io.realm.internal.ColumnInfo getColumnInfo(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo> r0 = r4.simpleClassNameToColumnInfoMap
            java.lang.Object r0 = r0.get(r5)
            io.realm.internal.ColumnInfo r0 = (io.realm.internal.ColumnInfo) r0
            if (r0 != 0) goto L35
            io.realm.internal.RealmProxyMediator r1 = r4.mediator
            java.util.Set r1 = r1.getModelClasses()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            io.realm.internal.RealmProxyMediator r3 = r4.mediator
            java.lang.String r3 = r3.getSimpleClassName(r2)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L14
            io.realm.internal.ColumnInfo r0 = r4.getColumnInfo(r2)
            java.util.Map<java.lang.String, io.realm.internal.ColumnInfo> r1 = r4.simpleClassNameToColumnInfoMap
            r1.put(r5, r0)
        L35:
            if (r0 == 0) goto L38
            return r0
        L38:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "'%s' doesn't exist in current schema."
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            throw r0
    }

    public void refresh() {
            r5 = this;
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.ColumnInfo> r0 = r5.classToColumnInfoMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            io.realm.internal.RealmProxyMediator r2 = r5.mediator
            java.lang.Object r3 = r1.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            io.realm.internal.OsSchemaInfo r4 = r5.osSchemaInfo
            io.realm.internal.ColumnInfo r2 = r2.createColumnInfo(r3, r4)
            java.lang.Object r1 = r1.getValue()
            io.realm.internal.ColumnInfo r1 = (io.realm.internal.ColumnInfo) r1
            r1.copyFrom(r2)
            goto La
        L2e:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColumnIndices["
            r0.<init>(r1)
            java.util.Map<java.lang.Class<? extends io.realm.RealmModel>, io.realm.internal.ColumnInfo> r1 = r4.classToColumnInfoMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r2 == 0) goto L25
            java.lang.String r2 = ","
            r0.append(r2)
        L25:
            java.lang.Object r2 = r3.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "->"
            r0.append(r2)
            java.lang.Object r2 = r3.getValue()
            r0.append(r2)
            r2 = 1
            goto L12
        L40:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
