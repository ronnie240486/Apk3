package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class TableQuery implements io.realm.internal.NativeObject {
    private static final boolean DEBUG = false;
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;
    private boolean queryValidated;
    private final io.realm.RealmAnyNativeFunctionsImpl realmAnyNativeFunctions;
    private final io.realm.internal.Table table;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.TableQuery.nativeFinalizerPtr = r0
            return
    }

    public TableQuery(io.realm.internal.NativeContext r2, io.realm.internal.Table r3, long r4) {
            r1 = this;
            r1.<init>()
            io.realm.RealmAnyNativeFunctionsImpl r0 = new io.realm.RealmAnyNativeFunctionsImpl
            r0.<init>()
            r1.realmAnyNativeFunctions = r0
            r0 = 1
            r1.queryValidated = r0
            r1.table = r3
            r1.nativePtr = r4
            r2.addReference(r1)
            return
    }

    public static java.lang.String buildDistinctDescriptor(java.lang.String[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DISTINCT("
            r0.<init>(r1)
            int r1 = r5.length
            java.lang.String r2 = ""
            r3 = 0
        Lb:
            if (r3 >= r1) goto L1e
            r4 = r5[r3]
            r0.append(r2)
            java.lang.String r2 = escapeFieldName(r4)
            r0.append(r2)
            int r3 = r3 + 1
            java.lang.String r2 = ", "
            goto Lb
        L1e:
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String buildSortDescriptor(java.lang.String[] r4, io.realm.Sort[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SORT("
            r0.<init>(r1)
            java.lang.String r1 = ""
            r2 = 0
        La:
            int r3 = r4.length
            if (r2 >= r3) goto L31
            r3 = r4[r2]
            r0.append(r1)
            java.lang.String r1 = escapeFieldName(r3)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r1 = r5[r2]
            io.realm.Sort r3 = io.realm.Sort.ASCENDING
            if (r1 != r3) goto L27
            java.lang.String r1 = "ASC"
            goto L29
        L27:
            java.lang.String r1 = "DESC"
        L29:
            r0.append(r1)
            int r2 = r2 + 1
            java.lang.String r1 = ", "
            goto La
        L31:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static java.lang.String escapeFieldName(@javax.annotation.Nullable java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = " "
            java.lang.String r1 = "\\ "
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private native long[] nativeAverageDecimal128(long r1, long r3);

    private native double nativeAverageDouble(long r1, long r3);

    private native double nativeAverageFloat(long r1, long r3);

    private native double nativeAverageInt(long r1, long r3);

    private native long[] nativeAverageRealmAny(long r1, long r3);

    private native void nativeBeginGroup(long r1);

    private native long nativeCount(long r1);

    private native void nativeEndGroup(long r1);

    private native long nativeFind(long r1);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long r1, long r3);

    private native java.lang.Double nativeMaximumDouble(long r1, long r3);

    private native java.lang.Float nativeMaximumFloat(long r1, long r3);

    private native java.lang.Long nativeMaximumInt(long r1, long r3);

    private native io.realm.internal.core.NativeRealmAny nativeMaximumRealmAny(long r1, long r3);

    private native java.lang.Long nativeMaximumTimestamp(long r1, long r3);

    private native long[] nativeMinimumDecimal128(long r1, long r3);

    private native java.lang.Double nativeMinimumDouble(long r1, long r3);

    private native java.lang.Float nativeMinimumFloat(long r1, long r3);

    private native java.lang.Long nativeMinimumInt(long r1, long r3);

    private native io.realm.internal.core.NativeRealmAny nativeMinimumRealmAny(long r1, long r3);

    private native java.lang.Long nativeMinimumTimestamp(long r1, long r3);

    private native void nativeNot(long r1);

    private native void nativeOr(long r1);

    private native void nativeRawDescriptor(long r1, java.lang.String r3, long r4);

    private native void nativeRawPredicate(long r1, java.lang.String r3, long[] r4, long r5);

    private native long nativeRemove(long r1);

    private native long[] nativeSumDecimal128(long r1, long r3);

    private native double nativeSumDouble(long r1, long r3);

    private native double nativeSumFloat(long r1, long r3);

    private native long nativeSumInt(long r1, long r3);

    private native long[] nativeSumRealmAny(long r1, long r3);

    private native java.lang.String nativeValidateQuery(long r1);

    private void rawDescriptor(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r7, java.lang.String r8) {
            r6 = this;
            long r1 = r6.nativePtr
            if (r7 == 0) goto L9
            long r3 = r7.getNativePtr()
            goto Lb
        L9:
            r3 = 0
        Lb:
            r4 = r3
            r0 = r6
            r3 = r8
            r0.nativeRawDescriptor(r1, r3, r4)
            return
    }

    private void throwImmutable() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Mutable method call during read transaction."
            r0.<init>(r1)
            throw r0
    }

    public io.realm.internal.TableQuery alwaysFalse() {
            r4 = this;
            r0 = 0
            long[] r1 = new long[r0]
            r2 = 0
            java.lang.String r3 = "FALSEPREDICATE"
            r4.rawPredicateWithPointers(r2, r3, r1)
            r4.queryValidated = r0
            return r4
    }

    public io.realm.internal.TableQuery alwaysTrue() {
            r4 = this;
            r0 = 0
            long[] r1 = new long[r0]
            r2 = 0
            java.lang.String r3 = "TRUEPREDICATE"
            r4.rawPredicateWithPointers(r2, r3, r1)
            r4.queryValidated = r0
            return r4
    }

    public org.bson.types.Decimal128 averageDecimal128(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeAverageDecimal128(r0, r5)
            if (r5 == 0) goto L16
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
        L16:
            r5 = 0
            return r5
    }

    public double averageDouble(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            double r3 = r2.nativeAverageDouble(r0, r3)
            return r3
    }

    public double averageFloat(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            double r3 = r2.nativeAverageFloat(r0, r3)
            return r3
    }

    public double averageInt(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            double r3 = r2.nativeAverageInt(r0, r3)
            return r3
    }

    public org.bson.types.Decimal128 averageRealmAny(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeAverageRealmAny(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
    }

    public io.realm.internal.TableQuery beginGroup() {
            r2 = this;
            long r0 = r2.nativePtr
            r2.nativeBeginGroup(r0)
            r0 = 0
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery beginsWith(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " BEGINSWITH $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery beginsWithInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " BEGINSWITH[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery between(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6, io.realm.RealmAny r7) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.String r1 = "("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = escapeFieldName(r5)
            r1.append(r2)
            java.lang.String r2 = " >= $0 AND "
            r1.append(r2)
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " <= $1)"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 2
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery contains(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " CONTAINS $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery containsEntry(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6, io.realm.RealmAny r7) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = "[$0] == $1"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 2
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery containsInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " CONTAINS[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery containsKey(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.String r1 = "ANY "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = ".@keys == $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery containsValue(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.String r1 = "ANY "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = ".@values == $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    @java.lang.Deprecated
    public long count() {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            long r0 = r2.nativeCount(r0)
            return r0
    }

    public io.realm.internal.TableQuery distinct(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r1, java.lang.String[] r2) {
            r0 = this;
            java.lang.String r2 = buildDistinctDescriptor(r2)
            r0.rawDescriptor(r1, r2)
            return r0
    }

    public io.realm.internal.TableQuery endGroup() {
            r2 = this;
            long r0 = r2.nativePtr
            r2.nativeEndGroup(r0)
            r0 = 0
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery endsWith(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " ENDSWITH $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery endsWithInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " ENDSWITH[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery equalTo(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " = $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery equalToInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " =[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public long find() {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            long r0 = r2.nativeFind(r0)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.TableQuery.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.internal.Table getTable() {
            r1 = this;
            io.realm.internal.Table r0 = r1.table
            return r0
    }

    public io.realm.internal.TableQuery greaterThan(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " > $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery greaterThanOrEqual(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " >= $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery in(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r6, java.lang.String r7, io.realm.RealmAny[] r8) {
            r5 = this;
            java.lang.String r7 = escapeFieldName(r7)
            r5.beginGroup()
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L21
            r4 = r8[r3]
            if (r1 != 0) goto L14
            r5.or()
        L14:
            if (r4 != 0) goto L1a
            r5.isNull(r6, r7)
            goto L1d
        L1a:
            r5.equalTo(r6, r7, r4)
        L1d:
            int r3 = r3 + 1
            r1 = 0
            goto Lb
        L21:
            r5.endGroup()
            r5.queryValidated = r2
            return r5
    }

    public io.realm.internal.TableQuery inInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r6, java.lang.String r7, io.realm.RealmAny[] r8) {
            r5 = this;
            java.lang.String r7 = escapeFieldName(r7)
            r5.beginGroup()
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L21
            r4 = r8[r3]
            if (r1 != 0) goto L14
            r5.or()
        L14:
            if (r4 != 0) goto L1a
            r5.isNull(r6, r7)
            goto L1d
        L1a:
            r5.equalToInsensitive(r6, r7, r4)
        L1d:
            int r3 = r3 + 1
            r1 = 0
            goto Lb
        L21:
            r5.endGroup()
            r5.queryValidated = r2
            return r5
    }

    public io.realm.internal.TableQuery isEmpty(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = escapeFieldName(r4)
            java.lang.String r1 = ".@count = 0"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r0 = 0
            long[] r1 = new long[r0]
            r2.rawPredicateWithPointers(r3, r4, r1)
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery isNotEmpty(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = escapeFieldName(r4)
            java.lang.String r1 = ".@count != 0"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r0 = 0
            long[] r1 = new long[r0]
            r2.rawPredicateWithPointers(r3, r4, r1)
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery isNotNull(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = escapeFieldName(r4)
            java.lang.String r1 = " != NULL"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r0 = 0
            long[] r1 = new long[r0]
            r2.rawPredicateWithPointers(r3, r4, r1)
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery isNull(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = escapeFieldName(r4)
            java.lang.String r1 = " = NULL"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r0 = 0
            long[] r1 = new long[r0]
            r2.rawPredicateWithPointers(r3, r4, r1)
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery lessThan(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " < $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery lessThanOrEqual(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " <= $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery like(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " LIKE $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery likeInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " LIKE[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery limit(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LIMIT("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2.rawDescriptor(r4, r3)
            return r2
    }

    public java.util.Date maximumDate(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Long r3 = r2.nativeMaximumTimestamp(r0, r3)
            if (r3 == 0) goto L15
            java.util.Date r4 = new java.util.Date
            long r0 = r3.longValue()
            r4.<init>(r0)
            return r4
        L15:
            r3 = 0
            return r3
    }

    public org.bson.types.Decimal128 maximumDecimal128(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeMaximumDecimal128(r0, r5)
            if (r5 == 0) goto L16
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
        L16:
            r5 = 0
            return r5
    }

    public java.lang.Double maximumDouble(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Double r3 = r2.nativeMaximumDouble(r0, r3)
            return r3
    }

    public java.lang.Float maximumFloat(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Float r3 = r2.nativeMaximumFloat(r0, r3)
            return r3
    }

    public java.lang.Long maximumInt(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Long r3 = r2.nativeMaximumInt(r0, r3)
            return r3
    }

    public io.realm.internal.core.NativeRealmAny maximumRealmAny(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            io.realm.internal.core.NativeRealmAny r3 = r2.nativeMaximumRealmAny(r0, r3)
            return r3
    }

    public java.util.Date minimumDate(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Long r3 = r2.nativeMinimumTimestamp(r0, r3)
            if (r3 == 0) goto L15
            java.util.Date r4 = new java.util.Date
            long r0 = r3.longValue()
            r4.<init>(r0)
            return r4
        L15:
            r3 = 0
            return r3
    }

    public org.bson.types.Decimal128 minimumDecimal128(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeMinimumDecimal128(r0, r5)
            if (r5 == 0) goto L16
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
        L16:
            r5 = 0
            return r5
    }

    public java.lang.Double minimumDouble(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Double r3 = r2.nativeMinimumDouble(r0, r3)
            return r3
    }

    public java.lang.Float minimumFloat(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Float r3 = r2.nativeMinimumFloat(r0, r3)
            return r3
    }

    public java.lang.Long minimumInt(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            java.lang.Long r3 = r2.nativeMinimumInt(r0, r3)
            return r3
    }

    public io.realm.internal.core.NativeRealmAny minimumRealmAny(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            io.realm.internal.core.NativeRealmAny r3 = r2.nativeMinimumRealmAny(r0, r3)
            return r3
    }

    public io.realm.internal.TableQuery not() {
            r2 = this;
            long r0 = r2.nativePtr
            r2.nativeNot(r0)
            r0 = 0
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery notEqualTo(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " != $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery notEqualToInsensitive(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r4, java.lang.String r5, io.realm.RealmAny r6) {
            r3 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r3.realmAnyNativeFunctions
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = escapeFieldName(r5)
            java.lang.String r2 = " !=[c] $0"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r1 = 1
            io.realm.RealmAny[] r1 = new io.realm.RealmAny[r1]
            r2 = 0
            r1[r2] = r6
            r0.callRawPredicate(r3, r4, r5, r1)
            r3.queryValidated = r2
            return r3
    }

    public io.realm.internal.TableQuery or() {
            r2 = this;
            long r0 = r2.nativePtr
            r2.nativeOr(r0)
            r0 = 0
            r2.queryValidated = r0
            return r2
    }

    public io.realm.internal.TableQuery rawPredicate(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r2, java.lang.String r3, io.realm.RealmAny... r4) {
            r1 = this;
            io.realm.RealmAnyNativeFunctionsImpl r0 = r1.realmAnyNativeFunctions
            r0.callRawPredicate(r1, r2, r3, r4)
            return r1
    }

    public void rawPredicateWithPointers(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r8, java.lang.String r9, long... r10) {
            r7 = this;
            long r1 = r7.nativePtr
            if (r8 == 0) goto L9
            long r3 = r8.getNativePtr()
            goto Lb
        L9:
            r3 = 0
        Lb:
            r5 = r3
            r0 = r7
            r3 = r9
            r4 = r10
            r0.nativeRawPredicate(r1, r3, r4, r5)
            return
    }

    public long remove() {
            r2 = this;
            r2.validateQuery()
            io.realm.internal.Table r0 = r2.table
            boolean r0 = r0.isImmutable()
            if (r0 == 0) goto Le
            r2.throwImmutable()
        Le:
            long r0 = r2.nativePtr
            long r0 = r2.nativeRemove(r0)
            return r0
    }

    public io.realm.internal.TableQuery sort(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r1, java.lang.String[] r2, io.realm.Sort[] r3) {
            r0 = this;
            java.lang.String r2 = buildSortDescriptor(r2, r3)
            r0.rawDescriptor(r1, r2)
            return r0
    }

    public org.bson.types.Decimal128 sumDecimal128(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeSumDecimal128(r0, r5)
            if (r5 == 0) goto L16
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
        L16:
            r5 = 0
            return r5
    }

    public double sumDouble(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            double r3 = r2.nativeSumDouble(r0, r3)
            return r3
    }

    public double sumFloat(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            double r3 = r2.nativeSumFloat(r0, r3)
            return r3
    }

    public long sumInt(long r3) {
            r2 = this;
            r2.validateQuery()
            long r0 = r2.nativePtr
            long r3 = r2.nativeSumInt(r0, r3)
            return r3
    }

    public org.bson.types.Decimal128 sumRealmAny(long r5) {
            r4 = this;
            r4.validateQuery()
            long r0 = r4.nativePtr
            long[] r5 = r4.nativeSumRealmAny(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r6 = 0
            r2 = r5[r6]
            org.bson.types.Decimal128 r5 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r0, r2)
            return r5
    }

    public void validateQuery() {
            r2 = this;
            boolean r0 = r2.queryValidated
            if (r0 != 0) goto L1c
            long r0 = r2.nativePtr
            java.lang.String r0 = r2.nativeValidateQuery(r0)
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            r0 = 1
            r2.queryValidated = r0
            goto L1c
        L16:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L1c:
            return
    }
}
