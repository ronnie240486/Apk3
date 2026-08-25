package io.realm;

/* JADX INFO: loaded from: classes3.dex */
public class RealmQuery<E> {
    private static final java.lang.String ASYNC_QUERY_WRONG_THREAD_MESSAGE = "Async query cannot be created on current thread.";
    private static final java.lang.String EMPTY_VALUES = "Non-empty 'values' must be provided.";
    private static final java.lang.String PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE = "Queries on primitive lists are not yet supported";
    private static final java.lang.String TYPE_MISMATCH = "Field '%s': type mismatch - %s expected.";
    private java.lang.String className;
    private java.lang.Class<E> clazz;
    private final boolean forValues;
    private final io.realm.internal.OsCollection osCollection;
    private final io.realm.internal.TableQuery query;
    private final io.realm.BaseRealm realm;
    private final io.realm.RealmObjectSchema schema;
    private final io.realm.internal.Table table;

    /* JADX INFO: renamed from: io.realm.RealmQuery$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    private RealmQuery(io.realm.BaseRealm r2, io.realm.internal.OsList r3, java.lang.Class<E> r4) {
            r1 = this;
            r1.<init>()
            r1.realm = r2
            r1.clazz = r4
            boolean r0 = isClassForRealmModel(r4)
            r0 = r0 ^ 1
            r1.forValues = r0
            if (r0 != 0) goto L28
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmObjectSchema r2 = r2.getSchemaForClass(r4)
            r1.schema = r2
            io.realm.internal.Table r2 = r2.table
            r1.table = r2
            r1.osCollection = r3
            io.realm.internal.TableQuery r2 = r3.getQuery()
            r1.query = r2
            return
        L28:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Queries on primitive lists are not yet supported"
            r2.<init>(r3)
            throw r2
    }

    private RealmQuery(io.realm.BaseRealm r2, io.realm.internal.OsList r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r1.realm = r2
            r1.className = r4
            r0 = 0
            r1.forValues = r0
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmObjectSchema r2 = r2.getSchemaForClass(r4)
            r1.schema = r2
            io.realm.internal.Table r2 = r2.table
            r1.table = r2
            io.realm.internal.TableQuery r2 = r3.getQuery()
            r1.query = r2
            r1.osCollection = r3
            return
    }

    public RealmQuery(io.realm.BaseRealm r2, io.realm.internal.OsSet r3, java.lang.Class<E> r4) {
            r1 = this;
            r1.<init>()
            r1.realm = r2
            r1.clazz = r4
            boolean r0 = isClassForRealmModel(r4)
            r0 = r0 ^ 1
            r1.forValues = r0
            if (r0 != 0) goto L28
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmObjectSchema r2 = r2.getSchemaForClass(r4)
            r1.schema = r2
            io.realm.internal.Table r2 = r2.table
            r1.table = r2
            r1.osCollection = r3
            io.realm.internal.TableQuery r2 = r3.getQuery()
            r1.query = r2
            return
        L28:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Queries on primitive lists are not yet supported"
            r2.<init>(r3)
            throw r2
    }

    private RealmQuery(io.realm.BaseRealm r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r1.realm = r2
            r1.className = r3
            r0 = 0
            r1.forValues = r0
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmObjectSchema r2 = r2.getSchemaForClass(r3)
            r1.schema = r2
            io.realm.internal.Table r2 = r2.table
            r1.table = r2
            io.realm.internal.TableQuery r2 = r2.where()
            r1.query = r2
            r2 = 0
            r1.osCollection = r2
            return
    }

    private RealmQuery(io.realm.Realm r2, java.lang.Class<E> r3) {
            r1 = this;
            r1.<init>()
            r1.realm = r2
            r1.clazz = r3
            boolean r0 = isClassForRealmModel(r3)
            r0 = r0 ^ 1
            r1.forValues = r0
            if (r0 != 0) goto L29
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmObjectSchema r2 = r2.getSchemaForClass(r3)
            r1.schema = r2
            io.realm.internal.Table r2 = r2.table
            r1.table = r2
            r3 = 0
            r1.osCollection = r3
            io.realm.internal.TableQuery r2 = r2.where()
            r1.query = r2
            return
        L29:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Queries on primitive lists are not yet supported"
            r2.<init>(r3)
            throw r2
    }

    private RealmQuery(io.realm.RealmResults<E> r3, java.lang.Class<E> r4) {
            r2 = this;
            r2.<init>()
            io.realm.BaseRealm r0 = r3.baseRealm
            r2.realm = r0
            r2.clazz = r4
            boolean r1 = isClassForRealmModel(r4)
            r1 = r1 ^ 1
            r2.forValues = r1
            if (r1 != 0) goto L31
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.RealmObjectSchema r4 = r0.getSchemaForClass(r4)
            r2.schema = r4
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.Table r4 = r4.getTable()
            r2.table = r4
            r4 = 0
            r2.osCollection = r4
            io.realm.internal.OsResults r3 = r3.osResults
            io.realm.internal.TableQuery r3 = r3.where()
            r2.query = r3
            return
        L31:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Queries on primitive lists are not yet supported"
            r3.<init>(r4)
            throw r3
    }

    private RealmQuery(io.realm.RealmResults<io.realm.DynamicRealmObject> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            io.realm.BaseRealm r0 = r3.baseRealm
            r2.realm = r0
            r2.className = r4
            r1 = 0
            r2.forValues = r1
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.RealmObjectSchema r4 = r0.getSchemaForClass(r4)
            r2.schema = r4
            io.realm.internal.Table r4 = r4.table
            r2.table = r4
            io.realm.internal.OsResults r3 = r3.osResults
            io.realm.internal.TableQuery r3 = r3.where()
            r2.query = r3
            r3 = 0
            r2.osCollection = r3
            return
    }

    public static <E extends io.realm.RealmModel> io.realm.RealmQuery<E> createDynamicQuery(io.realm.DynamicRealm r1, java.lang.String r2) {
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            r0.<init>(r1, r2)
            return r0
    }

    public static <E extends io.realm.RealmModel> io.realm.RealmQuery<E> createQuery(io.realm.Realm r1, java.lang.Class<E> r2) {
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> io.realm.RealmQuery<E> createQueryFromList(io.realm.RealmList<E> r3) {
            java.lang.Class<E> r0 = r3.clazz
            if (r0 != 0) goto L12
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.internal.OsList r2 = r3.getOsList()
            java.lang.String r3 = r3.className
            r0.<init>(r1, r2, r3)
            goto L1f
        L12:
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.internal.OsList r2 = r3.getOsList()
            java.lang.Class<E> r3 = r3.clazz
            r0.<init>(r1, r2, r3)
        L1f:
            return r0
    }

    public static <E> io.realm.RealmQuery<E> createQueryFromResult(io.realm.RealmResults<E> r2) {
            java.lang.Class<E> r0 = r2.classSpec
            if (r0 != 0) goto Lc
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            java.lang.String r1 = r2.className
            r0.<init>(r2, r1)
            goto L12
        Lc:
            io.realm.RealmQuery r1 = new io.realm.RealmQuery
            r1.<init>(r2, r0)
            r0 = r1
        L12:
            return r0
    }

    private io.realm.RealmResults<E> createRealmResults(io.realm.internal.TableQuery r4, boolean r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.OsResults r4 = io.realm.internal.OsResults.createFromQuery(r0, r4)
            boolean r0 = r3.isDynamicQuery()
            if (r0 == 0) goto L18
            io.realm.RealmResults r0 = new io.realm.RealmResults
            io.realm.BaseRealm r1 = r3.realm
            java.lang.String r2 = r3.className
            r0.<init>(r1, r4, r2)
            goto L21
        L18:
            io.realm.RealmResults r0 = new io.realm.RealmResults
            io.realm.BaseRealm r1 = r3.realm
            java.lang.Class<E> r2 = r3.clazz
            r0.<init>(r1, r4, r2)
        L21:
            if (r5 == 0) goto L26
            r0.load()
        L26:
            return r0
    }

    private long getSourceRowIndexForFirstObject() {
            r2 = this;
            io.realm.internal.TableQuery r0 = r2.query
            long r0 = r0.find()
            return r0
    }

    private static boolean isClassForRealmModel(java.lang.Class<?> r1) {
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    private boolean isDynamicQuery() {
            r1 = this;
            java.lang.String r0 = r1.className
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private io.realm.internal.OsResults lazyFindAll() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            r1 = 0
            io.realm.RealmResults r0 = r2.createRealmResults(r0, r1)
            io.realm.internal.OsResults r0 = r0.osResults
            return r0
    }

    private static native java.lang.String nativeSerializeQuery(long r0);

    public io.realm.RealmQuery<E> alwaysFalse() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.alwaysFalse()
            return r1
    }

    public io.realm.RealmQuery<E> alwaysTrue() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.alwaysTrue()
            return r1
    }

    public io.realm.RealmQuery<E> and() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            return r1
    }

    public double average(java.lang.String r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r6.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r6.schema
            long r0 = r0.getAndCheckFieldColumnKey(r7)
            int[] r2 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            io.realm.internal.Table r3 = r6.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L4c
            r4 = 2
            if (r2 == r4) goto L45
            r5 = 3
            if (r2 != r5) goto L2e
            io.realm.internal.TableQuery r7 = r6.query
            double r0 = r7.averageDouble(r0)
            return r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r2[r4] = r7
            java.lang.String r7 = "int, float or double. For Decimal128 use `averageDecimal128` method."
            r2[r3] = r7
            java.lang.String r7 = "Field '%s': type mismatch - %s expected."
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            r0.<init>(r7)
            throw r0
        L45:
            io.realm.internal.TableQuery r7 = r6.query
            double r0 = r7.averageFloat(r0)
            return r0
        L4c:
            io.realm.internal.TableQuery r7 = r6.query
            double r0 = r7.averageInt(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.bson.types.Decimal128 averageDecimal128(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r2.schema
            long r0 = r0.getAndCheckFieldColumnKey(r3)
            io.realm.internal.TableQuery r3 = r2.query
            org.bson.types.Decimal128 r3 = r3.averageDecimal128(r0)
            return r3
    }

    @javax.annotation.Nullable
    public org.bson.types.Decimal128 averageRealmAny(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r2.schema
            long r0 = r0.getAndCheckFieldColumnKey(r3)
            io.realm.internal.TableQuery r3 = r2.query
            org.bson.types.Decimal128 r3 = r3.averageRealmAny(r0)
            return r3
    }

    public io.realm.RealmQuery<E> beginGroup() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.beginGroup()
            return r1
    }

    public io.realm.RealmQuery<E> beginsWith(java.lang.String r2, io.realm.RealmAny r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.beginsWith(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> beginsWith(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.beginsWith(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.beginsWithInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> beginsWith(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.beginsWith(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> beginsWith(java.lang.String r2, java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            java.lang.String r0 = "value"
            io.realm.internal.Util.checkNull(r3, r0)
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.beginsWith(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, double r4, double r6) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            java.lang.Double r5 = java.lang.Double.valueOf(r6)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, float r4, float r5) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, int r4, int r5) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, long r4, long r6) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, io.realm.RealmAny r4, io.realm.RealmAny r5) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, java.util.Date r4, java.util.Date r5) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> between(java.lang.String r3, org.bson.types.Decimal128 r4, org.bson.types.Decimal128 r5) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.between(r1, r3, r4, r5)
            return r2
    }

    public io.realm.RealmQuery<E> contains(java.lang.String r2, io.realm.RealmAny r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.contains(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> contains(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.contains(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.containsInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> contains(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.contains(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> contains(java.lang.String r2, java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            java.lang.String r0 = "value"
            io.realm.internal.Util.checkNull(r3, r0)
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.contains(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> containsEntry(java.lang.String r4, java.util.Map.Entry<java.lang.String, ?> r5) {
            r3 = this;
            java.lang.String r0 = "entry"
            io.realm.internal.Util.checkNull(r5, r0)
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Object r2 = r5.getKey()
            java.lang.String r2 = (java.lang.String) r2
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            java.lang.Object r5 = r5.getValue()
            io.realm.RealmAny r5 = io.realm.RealmAny.valueOf(r5)
            r0.containsEntry(r1, r4, r2, r5)
            return r3
    }

    public io.realm.RealmQuery<E> containsKey(java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsKey(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, io.realm.RealmModel r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Boolean r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Byte r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.Short r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> containsValue(java.lang.String r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.containsValue(r1, r3, r4)
            return r2
    }

    public long count() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.internal.OsResults r0 = r2.lazyFindAll()
            long r0 = r0.size()
            return r0
    }

    public io.realm.RealmQuery<E> distinct(java.lang.String r4, java.lang.String... r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            int r0 = r5.length
            int r0 = r0 + 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 0
        Le:
            int r2 = r5.length
            if (r4 >= r2) goto L18
            int r4 = r4 + 1
            r2 = r5[r1]
            r0[r4] = r2
            goto Le
        L18:
            io.realm.internal.TableQuery r4 = r3.query
            io.realm.BaseRealm r5 = r3.realm
            io.realm.RealmSchema r5 = r5.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r5 = r5.getKeyPathMapping()
            r4.distinct(r5, r0)
            return r3
    }

    public io.realm.RealmQuery<E> endGroup() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.endGroup()
            return r1
    }

    public io.realm.RealmQuery<E> endsWith(java.lang.String r2, io.realm.RealmAny r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.endsWith(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> endsWith(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.endsWith(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.endsWithInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> endsWith(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.endsWith(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> endsWith(java.lang.String r2, java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            java.lang.String r0 = "value"
            io.realm.internal.Util.checkNull(r3, r0)
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.endsWith(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.equalTo(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.equalToInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Boolean r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Byte r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Short r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r2, @javax.annotation.Nullable java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.equalTo(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r2, @javax.annotation.Nullable java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.equalTo(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> equalTo(java.lang.String r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.equalTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmResults<E> findAll() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.internal.TableQuery r0 = r2.query
            r1 = 1
            io.realm.RealmResults r0 = r2.createRealmResults(r0, r1)
            return r0
    }

    public io.realm.RealmResults<E> findAllAsync() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Async query cannot be created on current thread."
            r0.checkCanDeliverNotification(r1)
            io.realm.internal.TableQuery r0 = r2.query
            r1 = 0
            io.realm.RealmResults r0 = r2.createRealmResults(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public E findFirst() {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r6.realm
            r0.checkAllowQueriesOnUiThread()
            boolean r0 = r6.forValues
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            long r2 = r6.getSourceRowIndexForFirstObject()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1b
            goto L25
        L1b:
            io.realm.BaseRealm r0 = r6.realm
            java.lang.Class<E> r1 = r6.clazz
            java.lang.String r4 = r6.className
            io.realm.RealmModel r1 = r0.get(r1, r4, r2)
        L25:
            return r1
    }

    public E findFirstAsync() {
            r11 = this;
            io.realm.BaseRealm r0 = r11.realm
            r0.checkIfValid()
            boolean r0 = r11.forValues
            if (r0 != 0) goto L79
            io.realm.BaseRealm r0 = r11.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Async query cannot be created on current thread."
            r0.checkCanDeliverNotification(r1)
            io.realm.BaseRealm r0 = r11.realm
            boolean r0 = r0.isInTransaction()
            if (r0 == 0) goto L2b
            io.realm.BaseRealm r0 = r11.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.TableQuery r1 = r11.query
            io.realm.internal.OsResults r0 = io.realm.internal.OsResults.createFromQuery(r0, r1)
            io.realm.internal.UncheckedRow r0 = r0.firstUncheckedRow()
            goto L3a
        L2b:
            io.realm.internal.PendingRow r0 = new io.realm.internal.PendingRow
            io.realm.BaseRealm r1 = r11.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            io.realm.internal.TableQuery r2 = r11.query
            boolean r3 = r11.isDynamicQuery()
            r0.<init>(r1, r2, r3)
        L3a:
            boolean r1 = r11.isDynamicQuery()
            if (r1 == 0) goto L48
            io.realm.DynamicRealmObject r1 = new io.realm.DynamicRealmObject
            io.realm.BaseRealm r2 = r11.realm
            r1.<init>(r2, r0)
            goto L68
        L48:
            java.lang.Class<E> r5 = r11.clazz
            io.realm.BaseRealm r1 = r11.realm
            io.realm.RealmConfiguration r1 = r1.getConfiguration()
            io.realm.internal.RealmProxyMediator r4 = r1.getSchemaMediator()
            io.realm.BaseRealm r6 = r11.realm
            io.realm.RealmSchema r1 = r6.getSchema()
            io.realm.internal.ColumnInfo r8 = r1.getColumnInfo(r5)
            r9 = 0
            java.util.List r10 = java.util.Collections.emptyList()
            r7 = r0
            io.realm.RealmModel r1 = r4.newInstance(r5, r6, r7, r8, r9, r10)
        L68:
            boolean r2 = r0 instanceof io.realm.internal.PendingRow
            if (r2 == 0) goto L78
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.internal.PendingRow r0 = (io.realm.internal.PendingRow) r0
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            r0.setFrontEnd(r2)
        L78:
            return r1
        L79:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "findFirstAsync() available only when type parameter 'E' is implementing RealmModel."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getDescription() {
            r2 = this;
            io.realm.internal.TableQuery r0 = r2.query
            r0.validateQuery()
            io.realm.internal.TableQuery r0 = r2.query
            long r0 = r0.getNativePtr()
            java.lang.String r0 = nativeSerializeQuery(r0)
            return r0
    }

    public long getQueryPointer() {
            r2 = this;
            io.realm.internal.TableQuery r0 = r2.query
            long r0 = r0.getNativePtr()
            return r0
    }

    public io.realm.Realm getRealm() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto L12
            io.realm.Realm r0 = (io.realm.Realm) r0
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This method is only available for typed Realms"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getTypeQueried() {
            r1 = this;
            io.realm.internal.Table r0 = r1.table
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, int r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThan(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, int r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> greaterThanOrEqualTo(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.greaterThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, io.realm.RealmAny[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L32
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L22
            r2 = r5[r1]
            if (r2 != 0) goto L1b
            io.realm.RealmAny r2 = io.realm.RealmAny.nullValue()
            goto L1d
        L1b:
            r2 = r5[r1]
        L1d:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L22:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L35
        L32:
            r3.alwaysFalse()
        L35:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Boolean[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Byte[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Double[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Float[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Integer[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Long[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.Short[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r2, @javax.annotation.Nullable java.lang.String[] r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.in(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.lang.String[] r5, io.realm.Case r6) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L49
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L49
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L25
            r2 = r5[r1]
            if (r2 == 0) goto L1f
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            goto L22
        L1f:
            r2 = 0
            r0[r1] = r2
        L22:
            int r1 = r1 + 1
            goto Lf
        L25:
            io.realm.Case r5 = io.realm.Case.SENSITIVE
            if (r6 != r5) goto L39
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r6 = r3.realm
            io.realm.RealmSchema r6 = r6.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r6 = r6.getKeyPathMapping()
            r5.in(r6, r4, r0)
            goto L4c
        L39:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r6 = r3.realm
            io.realm.RealmSchema r6 = r6.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r6 = r6.getKeyPathMapping()
            r5.inInsensitive(r6, r4, r0)
            goto L4c
        L49:
            r3.alwaysFalse()
        L4c:
            return r3
    }

    public io.realm.RealmQuery<E> in(java.lang.String r4, @javax.annotation.Nullable java.util.Date[] r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            if (r5 == 0) goto L2d
            int r0 = r5.length
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.in(r1, r4, r0)
            goto L30
        L2d:
            r3.alwaysFalse()
        L30:
            return r3
    }

    public io.realm.RealmQuery<E> isEmpty(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.isEmpty(r1, r3)
            return r2
    }

    public io.realm.RealmQuery<E> isNotEmpty(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.isNotEmpty(r1, r3)
            return r2
    }

    public io.realm.RealmQuery<E> isNotNull(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.isNotNull(r1, r3)
            return r2
    }

    public io.realm.RealmQuery<E> isNull(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.isNull(r1, r3)
            return r2
    }

    public boolean isValid() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto Lc
            goto L20
        Lc:
            io.realm.internal.OsCollection r0 = r2.osCollection
            if (r0 == 0) goto L15
            boolean r0 = r0.isValid()
            return r0
        L15:
            io.realm.internal.Table r0 = r2.table
            if (r0 == 0) goto L20
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L20
            r1 = 1
        L20:
            return r1
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, int r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThan(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThan(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, int r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, io.realm.RealmAny r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> lessThanOrEqualTo(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.lessThanOrEqual(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> like(java.lang.String r2, io.realm.RealmAny r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.like(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> like(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.like(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.likeInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> like(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.like(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> like(java.lang.String r2, java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            java.lang.String r0 = "value"
            io.realm.internal.Util.checkNull(r3, r0)
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.like(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> limit(long r2) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.limit(r2)
            return r1
    }

    @javax.annotation.Nullable
    public java.lang.Number max(java.lang.String r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r6.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r6.schema
            long r0 = r0.getAndCheckFieldColumnKey(r7)
            int[] r2 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            io.realm.internal.Table r3 = r6.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L56
            r4 = 2
            if (r2 == r4) goto L4f
            r5 = 3
            if (r2 == r5) goto L48
            r5 = 4
            if (r2 != r5) goto L31
            io.realm.internal.TableQuery r7 = r6.query
            org.bson.types.Decimal128 r7 = r7.maximumDecimal128(r0)
            return r7
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r2[r4] = r7
            java.lang.String r7 = "int, float or double"
            r2[r3] = r7
            java.lang.String r7 = "Field '%s': type mismatch - %s expected."
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            r0.<init>(r7)
            throw r0
        L48:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Double r7 = r7.maximumDouble(r0)
            return r7
        L4f:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Float r7 = r7.maximumFloat(r0)
            return r7
        L56:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Long r7 = r7.maximumInt(r0)
            return r7
    }

    public io.realm.RealmAny maxRealmAny(java.lang.String r5) {
            r4 = this;
            io.realm.BaseRealm r0 = r4.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r4.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r4.schema
            long r0 = r0.getAndCheckFieldColumnKey(r5)
            io.realm.RealmAny r5 = new io.realm.RealmAny
            io.realm.BaseRealm r2 = r4.realm
            io.realm.internal.TableQuery r3 = r4.query
            io.realm.internal.core.NativeRealmAny r0 = r3.maximumRealmAny(r0)
            io.realm.RealmAnyOperator r0 = io.realm.RealmAnyOperator.fromNativeRealmAny(r2, r0)
            r5.<init>(r0)
            return r5
    }

    @javax.annotation.Nullable
    public java.util.Date maximumDate(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r2.schema
            long r0 = r0.getAndCheckFieldColumnKey(r3)
            io.realm.internal.TableQuery r3 = r2.query
            java.util.Date r3 = r3.maximumDate(r0)
            return r3
    }

    @javax.annotation.Nullable
    public java.lang.Number min(java.lang.String r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r6.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r6.schema
            long r0 = r0.getAndCheckFieldColumnKey(r7)
            int[] r2 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            io.realm.internal.Table r3 = r6.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L56
            r4 = 2
            if (r2 == r4) goto L4f
            r5 = 3
            if (r2 == r5) goto L48
            r5 = 4
            if (r2 != r5) goto L31
            io.realm.internal.TableQuery r7 = r6.query
            org.bson.types.Decimal128 r7 = r7.minimumDecimal128(r0)
            return r7
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r2[r4] = r7
            java.lang.String r7 = "int, float or double"
            r2[r3] = r7
            java.lang.String r7 = "Field '%s': type mismatch - %s expected."
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            r0.<init>(r7)
            throw r0
        L48:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Double r7 = r7.minimumDouble(r0)
            return r7
        L4f:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Float r7 = r7.minimumFloat(r0)
            return r7
        L56:
            io.realm.internal.TableQuery r7 = r6.query
            java.lang.Long r7 = r7.minimumInt(r0)
            return r7
    }

    public io.realm.RealmAny minRealmAny(java.lang.String r5) {
            r4 = this;
            io.realm.BaseRealm r0 = r4.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r4.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r4.schema
            long r0 = r0.getAndCheckFieldColumnKey(r5)
            io.realm.RealmAny r5 = new io.realm.RealmAny
            io.realm.BaseRealm r2 = r4.realm
            io.realm.internal.TableQuery r3 = r4.query
            io.realm.internal.core.NativeRealmAny r0 = r3.minimumRealmAny(r0)
            io.realm.RealmAnyOperator r0 = io.realm.RealmAnyOperator.fromNativeRealmAny(r2, r0)
            r5.<init>(r0)
            return r5
    }

    @javax.annotation.Nullable
    public java.util.Date minimumDate(java.lang.String r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r2.schema
            long r0 = r0.getAndCheckFieldColumnKey(r3)
            io.realm.internal.TableQuery r3 = r2.query
            java.util.Date r3 = r3.minimumDate(r0)
            return r3
    }

    public io.realm.RealmQuery<E> not() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.not()
            return r1
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r2, io.realm.RealmAny r3) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            r1.notEqualTo(r2, r3, r0)
            return r1
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r2, io.realm.RealmAny r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            if (r4 != r0) goto L19
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.notEqualTo(r0, r2, r3)
            goto L28
        L19:
            io.realm.internal.TableQuery r4 = r1.query
            io.realm.BaseRealm r0 = r1.realm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r0 = r0.getKeyPathMapping()
            r4.notEqualToInsensitive(r0, r2, r3)
        L28:
            return r1
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Boolean r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Byte r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Double r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Float r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Long r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.lang.Short r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r2, @javax.annotation.Nullable java.lang.String r3) {
            r1 = this;
            io.realm.Case r0 = io.realm.Case.SENSITIVE
            io.realm.RealmQuery r2 = r1.notEqualTo(r2, r3, r0)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r2, @javax.annotation.Nullable java.lang.String r3, io.realm.Case r4) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.RealmAny r3 = io.realm.RealmAny.valueOf(r3)
            r1.notEqualTo(r2, r3, r4)
            return r1
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable java.util.Date r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, java.util.UUID r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> notEqualTo(java.lang.String r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            r0.notEqualTo(r1, r3, r4)
            return r2
    }

    public io.realm.RealmQuery<E> or() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r1.query
            r0.or()
            return r1
    }

    public io.realm.RealmQuery<E> rawPredicate(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            boolean r0 = io.realm.internal.Util.isEmptyString(r4)
            if (r0 != 0) goto L2d
            int r0 = r5.length
            io.realm.RealmAny[] r0 = new io.realm.RealmAny[r0]
            r1 = 0
        Lf:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            io.realm.RealmAny r2 = io.realm.RealmAny.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1d:
            io.realm.internal.TableQuery r5 = r3.query
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r5.rawPredicate(r1, r4, r0)
            return r3
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Non-null 'predicate' required."
            r4.<init>(r5)
            throw r4
    }

    public io.realm.RealmQuery<E> sort(java.lang.String r2) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            r0.checkIfValid()
            io.realm.Sort r0 = io.realm.Sort.ASCENDING
            io.realm.RealmQuery r2 = r1.sort(r2, r0)
            return r2
    }

    public io.realm.RealmQuery<E> sort(java.lang.String r4, io.realm.Sort r5) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r4
            io.realm.Sort[] r4 = new io.realm.Sort[r0]
            r4[r2] = r5
            io.realm.RealmQuery r4 = r3.sort(r1, r4)
            return r4
    }

    public io.realm.RealmQuery<E> sort(java.lang.String r4, io.realm.Sort r5, java.lang.String r6, io.realm.Sort r7) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            r0.checkIfValid()
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r6
            io.realm.Sort[] r6 = new io.realm.Sort[r0]
            r6[r2] = r5
            r6[r4] = r7
            io.realm.RealmQuery r4 = r3.sort(r1, r6)
            return r4
    }

    public io.realm.RealmQuery<E> sort(java.lang.String[] r3, io.realm.Sort[] r4) {
            r2 = this;
            if (r4 == 0) goto L26
            int r0 = r4.length
            if (r0 == 0) goto L26
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto L1e
            io.realm.BaseRealm r0 = r2.realm
            r0.checkIfValid()
            io.realm.internal.TableQuery r0 = r2.query
            io.realm.BaseRealm r1 = r2.realm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            r0.sort(r1, r3, r4)
            return r2
        L1e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Number of fields and sort orders do not match."
            r3.<init>(r4)
            throw r3
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "You must provide at least one sort order."
            r3.<init>(r4)
            throw r3
    }

    public java.lang.Number sum(java.lang.String r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r6.realm
            r0.checkAllowQueriesOnUiThread()
            io.realm.RealmObjectSchema r0 = r6.schema
            long r0 = r0.getAndCheckFieldColumnKey(r7)
            int[] r2 = io.realm.RealmQuery.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            io.realm.internal.Table r3 = r6.table
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L68
            r4 = 2
            if (r2 == r4) goto L5d
            r5 = 3
            if (r2 == r5) goto L52
            r5 = 4
            if (r2 == r5) goto L4b
            r5 = 5
            if (r2 != r5) goto L34
            io.realm.internal.TableQuery r7 = r6.query
            org.bson.types.Decimal128 r7 = r7.sumRealmAny(r0)
            return r7
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r2[r4] = r7
            java.lang.String r7 = "int, float or double"
            r2[r3] = r7
            java.lang.String r7 = "Field '%s': type mismatch - %s expected."
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            r0.<init>(r7)
            throw r0
        L4b:
            io.realm.internal.TableQuery r7 = r6.query
            org.bson.types.Decimal128 r7 = r7.sumDecimal128(r0)
            return r7
        L52:
            io.realm.internal.TableQuery r7 = r6.query
            double r0 = r7.sumDouble(r0)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            return r7
        L5d:
            io.realm.internal.TableQuery r7 = r6.query
            double r0 = r7.sumFloat(r0)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            return r7
        L68:
            io.realm.internal.TableQuery r7 = r6.query
            long r0 = r7.sumInt(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            return r7
    }
}
