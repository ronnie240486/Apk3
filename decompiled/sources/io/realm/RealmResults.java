package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class RealmResults<E> extends io.realm.OrderedRealmCollectionImpl<E> {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX INFO: renamed from: io.realm.RealmResults$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L49
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L54
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L60
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L78
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L84
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L90
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> La8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Le4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                return
        }
    }

    public RealmResults(io.realm.BaseRealm r3, io.realm.internal.OsResults r4, java.lang.Class<E> r5) {
            r2 = this;
            r0 = 0
            r1 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r0 = io.realm.OrderedRealmCollectionImpl.getCollectionOperator(r1, r3, r4, r5, r0)
            r2.<init>(r3, r4, r5, r0)
            return
    }

    public RealmResults(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, java.lang.Class<E> r4, boolean r5) {
            r1 = this;
            r0 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r5 = io.realm.OrderedRealmCollectionImpl.getCollectionOperator(r5, r2, r3, r4, r0)
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public RealmResults(io.realm.BaseRealm r3, io.realm.internal.OsResults r4, java.lang.String r5) {
            r2 = this;
            r0 = 0
            r1 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r0 = io.realm.OrderedRealmCollectionImpl.getCollectionOperator(r1, r3, r4, r0, r5)
            r2.<init>(r3, r4, r5, r0)
            return
    }

    public RealmResults(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, java.lang.String r4, boolean r5) {
            r1 = this;
            r5 = 0
            r0 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r5 = io.realm.OrderedRealmCollectionImpl.getCollectionOperator(r5, r2, r3, r0, r4)
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private void checkForAddListener(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L13
            io.realm.BaseRealm r2 = r1.baseRealm
            r2.checkIfValid()
            io.realm.BaseRealm r2 = r1.baseRealm
            io.realm.internal.OsSharedRealm r2 = r2.sharedRealm
            io.realm.internal.Capabilities r2 = r2.capabilities
            java.lang.String r0 = "Listeners cannot be used on current thread."
            r2.checkCanDeliverNotification(r0)
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener should not be null"
            r2.<init>(r0)
            throw r2
    }

    private void checkForRemoveListener(@javax.annotation.Nullable java.lang.Object r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            if (r2 == 0) goto L5
            goto Ld
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Listener should not be null"
            r2.<init>(r3)
            throw r2
        Ld:
            io.realm.BaseRealm r2 = r1.baseRealm
            boolean r2 = r2.isClosed()
            if (r2 == 0) goto L28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            io.realm.BaseRealm r0 = r1.baseRealm
            io.realm.RealmConfiguration r0 = r0.configuration
            java.lang.String r0 = r0.getPath()
            r2[r3] = r0
            java.lang.String r3 = "Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm."
            io.realm.log.RealmLog.warn(r3, r2)
        L28:
            return
    }

    private void checkNonEmptyFieldName(java.lang.String r2) {
            r1 = this;
            boolean r2 = io.realm.internal.Util.isEmptyString(r2)
            if (r2 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-empty 'fieldname' required."
            r2.<init>(r0)
            throw r2
    }

    private void checkNotNull(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-null 'value' required. Use 'setNull(fieldName)' instead."
            r2.<init>(r0)
            throw r2
    }

    private io.realm.internal.Row checkRealmObjectConstraints(java.lang.String r5, @javax.annotation.Nullable io.realm.RealmModel r6) {
            r4 = this;
            if (r6 == 0) goto L78
            boolean r0 = io.realm.RealmObject.isManaged(r6)
            if (r0 == 0) goto L70
            boolean r0 = io.realm.RealmObject.isValid(r6)
            if (r0 == 0) goto L70
            io.realm.internal.RealmObjectProxy r6 = (io.realm.internal.RealmObjectProxy) r6
            io.realm.ProxyState r6 = r6.realmGet$proxyState()
            io.realm.BaseRealm r0 = r6.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.BaseRealm r1 = r4.baseRealm
            java.lang.String r1 = r1.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            io.realm.internal.OsResults r0 = r4.osResults
            io.realm.internal.Table r0 = r0.getTable()
            long r1 = r0.getColumnKey(r5)
            io.realm.internal.Table r5 = r0.getLinkTarget(r1)
            io.realm.internal.Row r0 = r6.getRow$realm()
            io.realm.internal.Table r0 = r0.getTable()
            boolean r1 = r5.hasSameSchema(r0)
            if (r1 == 0) goto L49
            io.realm.internal.Row r5 = r6.getRow$realm()
            return r5
        L49:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = r0.getClassName()
            r2[r3] = r0
            r0 = 1
            java.lang.String r5 = r5.getClassName()
            r2[r0] = r5
            java.lang.String r5 = "Type of object is wrong. Was '%s', expected '%s'"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r6.<init>(r5)
            throw r6
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "'value' does not belong to the same Realm as the RealmResults."
            r5.<init>(r6)
            throw r5
        L70:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "'value' is not a valid, managed Realm object."
            r5.<init>(r6)
            throw r5
        L78:
            r5 = 0
            return r5
    }

    private void checkType(java.lang.String r6, io.realm.RealmFieldType r7) {
            r5 = this;
            io.realm.internal.OsResults r0 = r5.osResults
            io.realm.internal.Table r0 = r0.getTable()
            java.lang.String r0 = r0.getClassName()
            io.realm.BaseRealm r1 = r5.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.RealmObjectSchema r1 = r1.get(r0)
            io.realm.RealmFieldType r1 = r1.getFieldType(r6)
            if (r1 != r7) goto L1b
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r1
            r6 = 3
            r3[r6] = r7
            java.lang.String r6 = "The field '%s.%s' is not of the expected type. Actual: %s, Expected: %s"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r2.<init>(r6)
            throw r2
    }

    private <T> void checkTypeOfListElements(io.realm.RealmList<T> r4, java.lang.Class<?> r5) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L2a
            java.lang.Object r4 = r4.first()
            java.lang.Class r4 = r4.getClass()
            boolean r0 = r5.isAssignableFrom(r4)
            if (r0 == 0) goto L15
            goto L2a
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r4
            java.lang.String r4 = "List contained the wrong type of elements. Elements of type '%s' was expected, but the actual type is '%s'"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L2a:
            return
    }

    private java.lang.Class<?> getListType(io.realm.RealmList r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lf
            java.lang.Object r2 = r2.first()
            java.lang.Class r2 = r2.getClass()
            return r2
        Lf:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
    }

    private java.lang.String mapFieldNameToInternalName(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            boolean r0 = r0 instanceof io.realm.Realm
            if (r0 == 0) goto L34
            io.realm.internal.OsResults r0 = r3.osResults
            io.realm.internal.Table r0 = r0.getTable()
            java.lang.String r0 = r0.getClassName()
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.ColumnInfo r0 = r1.getColumnInfo(r0)
            java.lang.String r0 = r0.getInternalFieldName(r4)
            if (r0 == 0) goto L22
            r4 = r0
            goto L34
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Field '%s' does not exists."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L34:
            return r4
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            super.add(r1, r2)
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            boolean r1 = super.addAll(r1, r2)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.addAll(r1)
            return r1
    }

    public void addChangeListener(io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmResults<E>> r2) {
            r1 = this;
            r1.checkForAddListener(r2)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.addListener(r1, r2)
            return
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.RealmResults<E>> r2) {
            r1 = this;
            r1.checkForAddListener(r2)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.addListener(r1, r2)
            return
    }

    public io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmResults<E>>> asChangesetObservable() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto L15
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.reactivex.Observable r0 = r0.changesetsFrom(r1, r3)
            return r0
        L15:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L27
            r1 = r0
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.reactivex.Observable r0 = r0.changesetsFrom(r1, r3)
            return r0
        L27:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.realm.BaseRealm r2 = r3.baseRealm
            java.lang.Class r2 = r2.getClass()
            r1.append(r2)
            java.lang.String r2 = " does not support RxJava2."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public io.reactivex.Flowable<io.realm.RealmResults<E>> asFlowable() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto L15
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.reactivex.Flowable r0 = r0.from(r1, r3)
            return r0
        L15:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L27
            r1 = r0
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.reactivex.Flowable r0 = r0.from(r1, r3)
            return r0
        L27:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.realm.BaseRealm r2 = r3.baseRealm
            java.lang.Class r2 = r2.getClass()
            r1.append(r2)
            java.lang.String r2 = " does not support RxJava2."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String asJSON() {
            r2 = this;
            io.realm.internal.OsResults r0 = r2.osResults
            r1 = -1
            java.lang.String r0 = r0.toJSON(r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(java.lang.String r3) {
            r2 = this;
            double r0 = super.average(r3)
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ io.realm.OrderedRealmCollectionSnapshot createSnapshot() {
            r1 = this;
            io.realm.OrderedRealmCollectionSnapshot r0 = super.createSnapshot()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean deleteAllFromRealm() {
            r1 = this;
            boolean r0 = super.deleteAllFromRealm()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteFirstFromRealm() {
            r1 = this;
            boolean r0 = super.deleteFirstFromRealm()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ void deleteFromRealm(int r1) {
            r0 = this;
            super.deleteFromRealm(r1)
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteLastFromRealm() {
            r1 = this;
            boolean r0 = super.deleteLastFromRealm()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object first() {
            r1 = this;
            java.lang.Object r0 = super.first()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object first(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.first(r1)
            return r1
    }

    @Override // io.realm.internal.Freezable
    public io.realm.RealmResults<E> freeze() {
            r4 = this;
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L26
            io.realm.BaseRealm r0 = r4.baseRealm
            io.realm.BaseRealm r0 = r0.freeze()
            io.realm.internal.OsResults r1 = r4.osResults
            io.realm.internal.OsSharedRealm r2 = r0.sharedRealm
            io.realm.internal.OsResults r1 = r1.freeze(r2)
            java.lang.String r2 = r4.className
            if (r2 == 0) goto L1e
            io.realm.RealmResults r3 = new io.realm.RealmResults
            r3.<init>(r0, r1, r2)
            return r3
        L1e:
            io.realm.RealmResults r2 = new io.realm.RealmResults
            java.lang.Class<E> r3 = r4.classSpec
            r2.<init>(r0, r1, r3)
            return r2
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only valid, managed RealmResults can be frozen."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.RealmResults r0 = r1.freeze()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl
    public /* bridge */ /* synthetic */ io.realm.Realm getRealm() {
            r1 = this;
            io.realm.Realm r0 = super.getRealm()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            if (r0 == 0) goto Lc
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.isLoaded()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
            r1 = this;
            boolean r0 = super.isManaged()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
            r1 = this;
            boolean r0 = super.isValid()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            java.util.Iterator r0 = super.iterator()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object last() {
            r1 = this;
            java.lang.Object r0 = super.last()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object last(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.last(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            java.util.ListIterator r0 = super.listIterator()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            java.util.ListIterator r1 = super.listIterator(r1)
            return r1
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            io.realm.internal.OsResults r0 = r1.osResults
            r0.load()
            r0 = 1
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number max(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.max(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.util.Date maxDate(java.lang.String r1) {
            r0 = this;
            java.util.Date r1 = super.maxDate(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number min(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.min(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.util.Date minDate(java.lang.String r1) {
            r0 = this;
            java.util.Date r1 = super.minDate(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    public void removeAllChangeListeners() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.checkForRemoveListener(r0, r1)
            io.realm.internal.OsResults r0 = r2.osResults
            r0.removeAllListeners()
            return
    }

    public void removeChangeListener(io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmResults<E>> r2) {
            r1 = this;
            r0 = 1
            r1.checkForRemoveListener(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.removeListener(r1, r2)
            return
    }

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.RealmResults<E>> r2) {
            r1 = this;
            r0 = 1
            r1.checkForRemoveListener(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.removeListener(r1, r2)
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.set(r1, r2)
            return r1
    }

    public void setBlob(java.lang.String r2, @javax.annotation.Nullable byte[] r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.BINARY
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setBlob(r2, r3)
            return
    }

    public void setBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.BOOLEAN
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setBoolean(r2, r3)
            return
    }

    public void setByte(java.lang.String r4, byte r5) {
            r3 = this;
            r3.checkNonEmptyFieldName(r4)
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r4 = r3.mapFieldNameToInternalName(r4)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.INTEGER
            r3.checkType(r4, r0)
            io.realm.internal.OsResults r0 = r3.osResults
            long r1 = (long) r5
            r0.setInt(r4, r1)
            return
    }

    public void setDate(java.lang.String r2, @javax.annotation.Nullable java.util.Date r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DATE
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setDate(r2, r3)
            return
    }

    public void setDecimal128(java.lang.String r2, @javax.annotation.Nullable org.bson.types.Decimal128 r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DECIMAL128
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setDecimal128(r2, r3)
            return
    }

    public void setDouble(java.lang.String r2, double r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DOUBLE
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setDouble(r2, r3)
            return
    }

    public void setFloat(java.lang.String r2, float r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.FLOAT
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setFloat(r2, r3)
            return
    }

    public void setInt(java.lang.String r4, int r5) {
            r3 = this;
            r3.checkNonEmptyFieldName(r4)
            java.lang.String r4 = r3.mapFieldNameToInternalName(r4)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.INTEGER
            r3.checkType(r4, r0)
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r3.osResults
            long r1 = (long) r5
            r0.setInt(r4, r1)
            return
    }

    public <T> void setList(java.lang.String r5, io.realm.RealmList<T> r6) {
            r4 = this;
            r4.checkNonEmptyFieldName(r5)
            java.lang.String r5 = r4.mapFieldNameToInternalName(r5)
            io.realm.BaseRealm r0 = r4.baseRealm
            r0.checkIfValidAndInTransaction()
            if (r6 == 0) goto L111
            io.realm.BaseRealm r0 = r4.baseRealm
            io.realm.RealmSchema r0 = r0.getSchema()
            io.realm.internal.OsResults r1 = r4.osResults
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getClassName()
            io.realm.RealmObjectSchema r0 = r0.getSchemaForClass(r1)
            io.realm.RealmFieldType r0 = r0.getFieldType(r5)
            int[] r1 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 0
            switch(r1) {
                case 9: goto Lfc;
                case 10: goto Lb0;
                case 11: goto La5;
                case 12: goto L9a;
                case 13: goto L8e;
                case 14: goto L82;
                case 15: goto L76;
                case 16: goto L6a;
                case 17: goto L5e;
                case 18: goto L52;
                case 19: goto L46;
                default: goto L33;
            }
        L33:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r0
            java.lang.String r5 = "Field '%s' is not a list but a %s"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r6.<init>(r5)
            throw r6
        L46:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setDoubleList(r5, r6)
            goto L110
        L52:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setFloatList(r5, r6)
            goto L110
        L5e:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setUUIDList(r5, r6)
            goto L110
        L6a:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setObjectIdList(r5, r6)
            goto L110
        L76:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setDecimal128List(r5, r6)
            goto L110
        L82:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setDateList(r5, r6)
            goto L110
        L8e:
            java.lang.Class<byte[]> r0 = byte[].class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setByteArrayList(r5, r6)
            goto L110
        L9a:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setStringList(r5, r6)
            goto L110
        La5:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r4.checkTypeOfListElements(r6, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setBooleanList(r5, r6)
            goto L110
        Lb0:
            java.lang.Class r0 = r4.getListType(r6)
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lc2
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setIntegerList(r5, r6)
            goto L110
        Lc2:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld0
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setLongList(r5, r6)
            goto L110
        Ld0:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lde
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setShortList(r5, r6)
            goto L110
        Lde:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lec
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setByteList(r5, r6)
            goto L110
        Lec:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r0
            java.lang.String r0 = "List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is '%s'"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.<init>(r6)
            throw r5
        Lfc:
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            r4.checkTypeOfListElements(r6, r0)
            r0 = 0
            java.lang.Object r0 = r6.first(r0)
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            r4.checkRealmObjectConstraints(r5, r0)
            io.realm.internal.OsResults r0 = r4.osResults
            r0.setModelList(r5, r6)
        L110:
            return
        L111:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Non-null 'list' required"
            r5.<init>(r6)
            throw r5
    }

    public void setLong(java.lang.String r2, long r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.INTEGER
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setInt(r2, r3)
            return
    }

    public void setNull(java.lang.String r2) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setNull(r2)
            return
    }

    public void setObject(java.lang.String r2, @javax.annotation.Nullable io.realm.RealmModel r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.OBJECT
            r1.checkType(r2, r0)
            io.realm.internal.Row r3 = r1.checkRealmObjectConstraints(r2, r3)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setObject(r2, r3)
            return
    }

    public void setObjectId(java.lang.String r2, @javax.annotation.Nullable org.bson.types.ObjectId r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.OBJECT_ID
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setObjectId(r2, r3)
            return
    }

    public void setShort(java.lang.String r4, short r5) {
            r3 = this;
            r3.checkNonEmptyFieldName(r4)
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r4 = r3.mapFieldNameToInternalName(r4)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.INTEGER
            r3.checkType(r4, r0)
            io.realm.internal.OsResults r0 = r3.osResults
            long r1 = (long) r5
            r0.setInt(r4, r1)
            return
    }

    public void setString(java.lang.String r2, @javax.annotation.Nullable java.lang.String r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.STRING
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setString(r2, r3)
            return
    }

    public void setUUID(java.lang.String r2, @javax.annotation.Nullable java.util.UUID r3) {
            r1 = this;
            r1.checkNonEmptyFieldName(r2)
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r2 = r1.mapFieldNameToInternalName(r2)
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.UUID
            r1.checkType(r2, r0)
            io.realm.internal.OsResults r0 = r1.osResults
            r0.setUUID(r2, r3)
            return
    }

    public void setValue(java.lang.String r9, @javax.annotation.Nullable java.lang.Object r10) {
            r8 = this;
            r8.checkNonEmptyFieldName(r9)
            io.realm.BaseRealm r0 = r8.baseRealm
            r0.checkIfValidAndInTransaction()
            java.lang.String r9 = r8.mapFieldNameToInternalName(r9)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L14
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            goto L15
        L14:
            r1 = 0
        L15:
            io.realm.internal.OsResults r2 = r8.osResults
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getClassName()
            io.realm.Realm r3 = r8.getRealm()
            io.realm.RealmSchema r3 = r3.getSchema()
            io.realm.RealmObjectSchema r3 = r3.get(r2)
            boolean r4 = r3.hasField(r9)
            r5 = 1
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L16f
            if (r10 != 0) goto L3c
            io.realm.internal.OsResults r10 = r8.osResults
            r10.setNull(r9)
            return
        L3c:
            io.realm.RealmFieldType r2 = r3.getFieldType(r9)
            if (r0 == 0) goto L9d
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.STRING
            if (r2 == r0) goto L9d
            int[] r0 = io.realm.RealmResults.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L95;
                case 2: goto L8c;
                case 3: goto L83;
                case 4: goto L7a;
                case 5: goto L75;
                case 6: goto L70;
                case 7: goto L6a;
                case 8: goto L65;
                default: goto L51;
            }
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r9
            r2[r5] = r10
            java.lang.String r9 = "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead"
            java.lang.String r9 = java.lang.String.format(r1, r9, r2)
            r0.<init>(r9)
            throw r0
        L65:
            java.util.UUID r10 = java.util.UUID.fromString(r1)
            goto L9d
        L6a:
            org.bson.types.ObjectId r10 = new org.bson.types.ObjectId
            r10.<init>(r1)
            goto L9d
        L70:
            org.bson.types.Decimal128 r10 = org.bson.types.Decimal128.parse(r1)
            goto L9d
        L75:
            java.util.Date r10 = io.realm.internal.android.JsonUtils.stringToDate(r1)
            goto L9d
        L7a:
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            goto L9d
        L83:
            float r10 = java.lang.Float.parseFloat(r1)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            goto L9d
        L8c:
            long r0 = java.lang.Long.parseLong(r1)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            goto L9d
        L95:
            boolean r10 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
        L9d:
            java.lang.Class r0 = r10.getClass()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto Lb0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r8.setBoolean(r9, r10)
            goto L157
        Lb0:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto Lbf
            java.lang.Short r10 = (java.lang.Short) r10
            short r10 = r10.shortValue()
            r8.setShort(r9, r10)
            goto L157
        Lbf:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto Lce
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setInt(r9, r10)
            goto L157
        Lce:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto Ldd
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r8.setLong(r9, r0)
            goto L157
        Ldd:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto Lec
            java.lang.Byte r10 = (java.lang.Byte) r10
            byte r10 = r10.byteValue()
            r8.setByte(r9, r10)
            goto L157
        Lec:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto Lfa
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            r8.setFloat(r9, r10)
            goto L157
        Lfa:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L108
            java.lang.Double r10 = (java.lang.Double) r10
            double r0 = r10.doubleValue()
            r8.setDouble(r9, r0)
            goto L157
        L108:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L112
            java.lang.String r10 = (java.lang.String) r10
            r8.setString(r9, r10)
            goto L157
        L112:
            boolean r1 = r10 instanceof java.util.Date
            if (r1 == 0) goto L11c
            java.util.Date r10 = (java.util.Date) r10
            r8.setDate(r9, r10)
            goto L157
        L11c:
            boolean r1 = r10 instanceof org.bson.types.Decimal128
            if (r1 == 0) goto L126
            org.bson.types.Decimal128 r10 = (org.bson.types.Decimal128) r10
            r8.setDecimal128(r9, r10)
            goto L157
        L126:
            boolean r1 = r10 instanceof org.bson.types.ObjectId
            if (r1 == 0) goto L130
            org.bson.types.ObjectId r10 = (org.bson.types.ObjectId) r10
            r8.setObjectId(r9, r10)
            goto L157
        L130:
            boolean r1 = r10 instanceof java.util.UUID
            if (r1 == 0) goto L13a
            java.util.UUID r10 = (java.util.UUID) r10
            r8.setUUID(r9, r10)
            goto L157
        L13a:
            boolean r1 = r10 instanceof byte[]
            if (r1 == 0) goto L144
            byte[] r10 = (byte[]) r10
            r8.setBlob(r9, r10)
            goto L157
        L144:
            boolean r1 = r10 instanceof io.realm.RealmModel
            if (r1 == 0) goto L14e
            io.realm.RealmModel r10 = (io.realm.RealmModel) r10
            r8.setObject(r9, r10)
            goto L157
        L14e:
            java.lang.Class<io.realm.RealmList> r1 = io.realm.RealmList.class
            if (r0 != r1) goto L158
            io.realm.RealmList r10 = (io.realm.RealmList) r10
            r8.setList(r9, r10)
        L157:
            return
        L158:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Value is of a type not supported: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r10 = r10.getClass()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L16f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r9
            r0[r5] = r2
            java.lang.String r9 = "Field '%s' could not be found in class '%s'"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r10.<init>(r9)
            throw r10
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ io.realm.RealmResults sort(java.lang.String r1) {
            r0 = this;
            io.realm.RealmResults r1 = super.sort(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ io.realm.RealmResults sort(java.lang.String r1, io.realm.Sort r2) {
            r0 = this;
            io.realm.RealmResults r1 = super.sort(r1, r2)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r4, io.realm.Sort r5, java.lang.String r6, io.realm.Sort r7) {
            r3 = this;
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r6
            io.realm.Sort[] r6 = new io.realm.Sort[r0]
            r6[r2] = r5
            r6[r4] = r7
            io.realm.RealmResults r4 = r3.sort(r1, r6)
            return r4
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ io.realm.RealmResults sort(java.lang.String[] r1, io.realm.Sort[] r2) {
            r0 = this;
            io.realm.RealmResults r1 = super.sort(r1, r2)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number sum(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.sum(r1)
            return r1
    }

    @Override // io.realm.RealmCollection
    public io.realm.RealmQuery<E> where() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            io.realm.RealmQuery r0 = io.realm.RealmQuery.createQueryFromResult(r1)
            return r0
    }
}
