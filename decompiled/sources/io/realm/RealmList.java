package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class RealmList<E> extends java.util.AbstractList<E> implements io.realm.OrderedRealmCollection<E> {
    private static final java.lang.String ONLY_IN_MANAGED_MODE_MESSAGE = "This method is only available in managed mode.";
    private static final java.lang.String REMOVE_OUTSIDE_TRANSACTION_ERROR = "Objects can only be removed from inside a write transaction.";
    public final io.realm.BaseRealm baseRealm;

    @javax.annotation.Nullable
    public java.lang.String className;

    @javax.annotation.Nullable
    public java.lang.Class<E> clazz;
    private final io.realm.ManagedListOperator<E> osListOperator;
    private java.util.List<E> unmanagedList;

    /* JADX INFO: renamed from: io.realm.RealmList$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class RealmItr implements java.util.Iterator<E> {
        public int cursor;
        public int expectedModCount;
        public int lastRet;
        public final /* synthetic */ io.realm.RealmList this$0;

        private RealmItr(io.realm.RealmList r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.cursor = r0
                r0 = -1
                r1.lastRet = r0
                int r2 = io.realm.RealmList.access$100(r2)
                r1.expectedModCount = r2
                return
        }

        public /* synthetic */ RealmItr(io.realm.RealmList r1, io.realm.RealmList.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void checkConcurrentModification() {
                r2 = this;
                io.realm.RealmList r0 = r2.this$0
                int r0 = io.realm.RealmList.access$400(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                io.realm.RealmList r0 = r2.this$0
                io.realm.RealmList.access$200(r0)
                r2.checkConcurrentModification()
                int r0 = r2.cursor
                io.realm.RealmList r1 = r2.this$0
                int r1 = r1.size()
                if (r0 == r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // java.util.Iterator
        @javax.annotation.Nullable
        public E next() {
                r4 = this;
                io.realm.RealmList r0 = r4.this$0
                io.realm.RealmList.access$200(r0)
                r4.checkConcurrentModification()
                int r0 = r4.cursor
                io.realm.RealmList r1 = r4.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L17
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L17
                r4.lastRet = r0     // Catch: java.lang.IndexOutOfBoundsException -> L17
                int r2 = r0 + 1
                r4.cursor = r2     // Catch: java.lang.IndexOutOfBoundsException -> L17
                return r1
            L17:
                r4.checkConcurrentModification()
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Cannot access index "
                java.lang.String r3 = " when size is "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r0, r3)
                io.realm.RealmList r2 = r4.this$0
                int r2 = r2.size()
                r0.append(r2)
                java.lang.String r2 = ". Remember to check hasNext() before using next()."
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                io.realm.RealmList r0 = r2.this$0
                io.realm.RealmList.access$200(r0)
                int r0 = r2.lastRet
                if (r0 < 0) goto L2f
                r2.checkConcurrentModification()
                io.realm.RealmList r0 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L29
                int r1 = r2.lastRet     // Catch: java.lang.IndexOutOfBoundsException -> L29
                r0.remove(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L29
                int r0 = r2.lastRet     // Catch: java.lang.IndexOutOfBoundsException -> L29
                int r1 = r2.cursor     // Catch: java.lang.IndexOutOfBoundsException -> L29
                if (r0 >= r1) goto L1d
                int r1 = r1 + (-1)
                r2.cursor = r1     // Catch: java.lang.IndexOutOfBoundsException -> L29
            L1d:
                r0 = -1
                r2.lastRet = r0     // Catch: java.lang.IndexOutOfBoundsException -> L29
                io.realm.RealmList r0 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L29
                int r0 = io.realm.RealmList.access$300(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L29
                r2.expectedModCount = r0     // Catch: java.lang.IndexOutOfBoundsException -> L29
                return
            L29:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L2f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot call remove() twice. Must call next() in between."
                r0.<init>(r1)
                throw r0
        }
    }

    public class RealmListItr extends io.realm.RealmList<E>.RealmItr implements java.util.ListIterator<E> {
        public final /* synthetic */ io.realm.RealmList this$0;

        public RealmListItr(io.realm.RealmList r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                r2.<init>(r3, r0)
                if (r4 < 0) goto L11
                int r0 = r3.size()
                if (r4 > r0) goto L11
                r2.cursor = r4
                return
            L11:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Starting location must be a valid index: [0, "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r3 = r3.size()
                int r3 = r3 + (-1)
                r1.append(r3)
                java.lang.String r3 = "]. Index was "
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // java.util.ListIterator
        public void add(@javax.annotation.Nullable E r3) {
                r2 = this;
                io.realm.RealmList r0 = r2.this$0
                io.realm.BaseRealm r0 = r0.baseRealm
                r0.checkIfValid()
                r2.checkConcurrentModification()
                int r0 = r2.cursor     // Catch: java.lang.IndexOutOfBoundsException -> L21
                io.realm.RealmList r1 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L21
                r1.add(r0, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L21
                r3 = -1
                r2.lastRet = r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
                int r0 = r0 + 1
                r2.cursor = r0     // Catch: java.lang.IndexOutOfBoundsException -> L21
                io.realm.RealmList r3 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L21
                int r3 = io.realm.RealmList.access$600(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L21
                r2.expectedModCount = r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
                return
            L21:
                java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
                r3.<init>()
                throw r3
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.cursor
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.cursor
                return r0
        }

        @Override // java.util.ListIterator
        @javax.annotation.Nullable
        public E previous() {
                r4 = this;
                r4.checkConcurrentModification()
                int r0 = r4.cursor
                int r0 = r0 + (-1)
                io.realm.RealmList r1 = r4.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L12
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L12
                r4.cursor = r0     // Catch: java.lang.IndexOutOfBoundsException -> L12
                r4.lastRet = r0     // Catch: java.lang.IndexOutOfBoundsException -> L12
                return r1
            L12:
                r4.checkConcurrentModification()
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Cannot access index less than zero. This was "
                java.lang.String r3 = ". Remember to check hasPrevious() before using previous()."
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0, r3)
                r1.<init>(r0)
                throw r1
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.cursor
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(@javax.annotation.Nullable E r3) {
                r2 = this;
                io.realm.RealmList r0 = r2.this$0
                io.realm.BaseRealm r0 = r0.baseRealm
                r0.checkIfValid()
                int r0 = r2.lastRet
                if (r0 < 0) goto L24
                r2.checkConcurrentModification()
                io.realm.RealmList r0 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                int r1 = r2.lastRet     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                r0.set(r1, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                io.realm.RealmList r3 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                int r3 = io.realm.RealmList.access$500(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                r2.expectedModCount = r3     // Catch: java.lang.IndexOutOfBoundsException -> L1e
                return
            L1e:
                java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
                r3.<init>()
                throw r3
            L24:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                r3.<init>()
                throw r3
        }
    }

    public RealmList() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.baseRealm = r0
            r1.osListOperator = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.unmanagedList = r0
            return
    }

    public RealmList(java.lang.Class<E> r2, io.realm.internal.OsList r3, io.realm.BaseRealm r4) {
            r1 = this;
            r1.<init>()
            r1.clazz = r2
            r0 = 0
            io.realm.ManagedListOperator r2 = r1.getOperator(r4, r3, r2, r0)
            r1.osListOperator = r2
            r1.baseRealm = r4
            return
    }

    public RealmList(java.lang.String r2, io.realm.internal.OsList r3, io.realm.BaseRealm r4) {
            r1 = this;
            r1.<init>()
            r1.baseRealm = r4
            r1.className = r2
            r0 = 0
            io.realm.ManagedListOperator r2 = r1.getOperator(r4, r3, r0, r2)
            r1.osListOperator = r2
            return
    }

    public RealmList(E... r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L16
            r0 = 0
            r2.baseRealm = r0
            r2.osListOperator = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.length
            r0.<init>(r1)
            r2.unmanagedList = r0
            java.util.Collections.addAll(r0, r3)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The objects argument cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public static /* synthetic */ int access$100(io.realm.RealmList r0) {
            int r0 = r0.modCount
            return r0
    }

    public static /* synthetic */ void access$200(io.realm.RealmList r0) {
            r0.checkValidRealm()
            return
    }

    public static /* synthetic */ int access$300(io.realm.RealmList r0) {
            int r0 = r0.modCount
            return r0
    }

    public static /* synthetic */ int access$400(io.realm.RealmList r0) {
            int r0 = r0.modCount
            return r0
    }

    public static /* synthetic */ int access$500(io.realm.RealmList r0) {
            int r0 = r0.modCount
            return r0
    }

    public static /* synthetic */ int access$600(io.realm.RealmList r0) {
            int r0 = r0.modCount
            return r0
    }

    private void checkValidRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            return
    }

    @javax.annotation.Nullable
    private E firstImpl(boolean r3, @javax.annotation.Nullable E r4) {
            r2 = this;
            boolean r0 = r2.isManaged()
            r1 = 0
            if (r0 == 0) goto L17
            r2.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.lang.Object r3 = r2.get(r1)
            return r3
        L17:
            java.util.List<E> r0 = r2.unmanagedList
            if (r0 == 0) goto L28
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.util.List<E> r3 = r2.unmanagedList
            java.lang.Object r3 = r3.get(r1)
            return r3
        L28:
            if (r3 != 0) goto L2b
            return r4
        L2b:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "The list is empty."
            r3.<init>(r4)
            throw r3
    }

    private io.realm.ManagedListOperator<E> getOperator(io.realm.BaseRealm r2, io.realm.internal.OsList r3, @javax.annotation.Nullable java.lang.Class<E> r4, @javax.annotation.Nullable java.lang.String r5) {
            r1 = this;
            if (r4 == 0) goto L9c
            boolean r0 = isClassForRealmModel(r4)
            if (r0 == 0) goto La
            goto L9c
        La:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L14
            io.realm.StringListOperator r5 = new io.realm.StringListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L14:
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            if (r4 == r5) goto L96
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            if (r4 == r5) goto L96
            java.lang.Class<java.lang.Short> r5 = java.lang.Short.class
            if (r4 == r5) goto L96
            java.lang.Class<java.lang.Byte> r5 = java.lang.Byte.class
            if (r4 != r5) goto L25
            goto L96
        L25:
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r4 != r5) goto L2f
            io.realm.BooleanListOperator r5 = new io.realm.BooleanListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L2f:
            java.lang.Class<byte[]> r5 = byte[].class
            if (r4 != r5) goto L39
            io.realm.BinaryListOperator r5 = new io.realm.BinaryListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L39:
            java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
            if (r4 != r5) goto L43
            io.realm.DoubleListOperator r5 = new io.realm.DoubleListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L43:
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            if (r4 != r5) goto L4d
            io.realm.FloatListOperator r5 = new io.realm.FloatListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L4d:
            java.lang.Class<java.util.Date> r5 = java.util.Date.class
            if (r4 != r5) goto L57
            io.realm.DateListOperator r5 = new io.realm.DateListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L57:
            java.lang.Class<org.bson.types.Decimal128> r5 = org.bson.types.Decimal128.class
            if (r4 != r5) goto L61
            io.realm.Decimal128ListOperator r5 = new io.realm.Decimal128ListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L61:
            java.lang.Class<org.bson.types.ObjectId> r5 = org.bson.types.ObjectId.class
            if (r4 != r5) goto L6b
            io.realm.ObjectIdListOperator r5 = new io.realm.ObjectIdListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L6b:
            java.lang.Class<java.util.UUID> r5 = java.util.UUID.class
            if (r4 != r5) goto L75
            io.realm.UUIDListOperator r5 = new io.realm.UUIDListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L75:
            java.lang.Class<io.realm.RealmAny> r5 = io.realm.RealmAny.class
            if (r4 != r5) goto L7f
            io.realm.RealmAnyListOperator r5 = new io.realm.RealmAnyListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L7f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unexpected value class: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L96:
            io.realm.LongListOperator r5 = new io.realm.LongListOperator
            r5.<init>(r2, r3, r4)
            return r5
        L9c:
            io.realm.RealmModelListOperator r0 = new io.realm.RealmModelListOperator
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    private boolean isAttached() {
            r1 = this;
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            if (r0 == 0) goto Lc
            boolean r0 = r0.isValid()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static boolean isClassForRealmModel(java.lang.Class<?> r1) {
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    @javax.annotation.Nullable
    private E lastImpl(boolean r2, @javax.annotation.Nullable E r3) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L1e
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            io.realm.ManagedListOperator<E> r2 = r1.osListOperator
            int r2 = r2.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.get(r2)
            return r2
        L1e:
            java.util.List<E> r0 = r1.unmanagedList
            if (r0 == 0) goto L35
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            java.util.List<E> r2 = r1.unmanagedList
            int r3 = r2.size()
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)
            return r2
        L35:
            if (r2 != 0) goto L38
            return r3
        L38:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "The list is empty."
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r2, @javax.annotation.Nullable E r3) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto Lf
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            r0.insert(r2, r3)
            goto L14
        Lf:
            java.util.List<E> r0 = r1.unmanagedList
            r0.add(r2, r3)
        L14:
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(@javax.annotation.Nullable E r2) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto Lf
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            r0.append(r2)
            goto L14
        Lf:
            java.util.List<E> r0 = r1.unmanagedList
            r0.add(r2)
        L14:
            int r2 = r1.modCount
            r0 = 1
            int r2 = r2 + r0
            r1.modCount = r2
            return r0
    }

    public void addChangeListener(io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmList<E>> r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r3, r1)
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            r0.addListener(r2, r3)
            return
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.RealmList<E>> r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r3, r1)
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            r0.addListener(r2, r3)
            return
    }

    public io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmList<E>>> asChangesetObservable() {
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

    public io.reactivex.Flowable<io.realm.RealmList<E>> asFlowable() {
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
            if (r1 == 0) goto L28
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.reactivex.Flowable r0 = r0.from(r1, r3)
            return r0
        L28:
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

    @Override // io.realm.RealmCollection
    public double average(java.lang.String r3) {
            r2 = this;
            io.realm.RealmQuery r0 = r2.where()
            double r0 = r0.average(r3)
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L11
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            io.realm.internal.OsList r0 = r0.osList
            r0.removeAll()
            goto L16
        L11:
            java.util.List<E> r0 = r1.unmanagedList
            r0.clear()
        L16:
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L25
            io.realm.BaseRealm r0 = r2.baseRealm
            r0.checkIfValid()
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L20
            r0 = r3
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.InvalidRow r1 = io.realm.internal.InvalidRow.INSTANCE
            if (r0 != r1) goto L20
            r3 = 0
            return r3
        L20:
            boolean r3 = super.contains(r3)
            return r3
        L25:
            java.util.List<E> r0 = r2.unmanagedList
            boolean r3 = r0.contains(r3)
            return r3
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.OrderedRealmCollectionSnapshot<E> createSnapshot() {
            r4 = this;
            boolean r0 = r4.isManaged()
            if (r0 == 0) goto L51
            r4.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r4.osListOperator
            boolean r0 = r0.forRealmModel()
            if (r0 == 0) goto L49
            java.lang.String r0 = r4.className
            if (r0 == 0) goto L2f
            io.realm.OrderedRealmCollectionSnapshot r0 = new io.realm.OrderedRealmCollectionSnapshot
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsSharedRealm r2 = r1.sharedRealm
            io.realm.ManagedListOperator<E> r3 = r4.osListOperator
            io.realm.internal.OsList r3 = r3.getOsList()
            io.realm.internal.TableQuery r3 = r3.getQuery()
            io.realm.internal.OsResults r2 = io.realm.internal.OsResults.createFromQuery(r2, r3)
            java.lang.String r3 = r4.className
            r0.<init>(r1, r2, r3)
            return r0
        L2f:
            io.realm.OrderedRealmCollectionSnapshot r0 = new io.realm.OrderedRealmCollectionSnapshot
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsSharedRealm r2 = r1.sharedRealm
            io.realm.ManagedListOperator<E> r3 = r4.osListOperator
            io.realm.internal.OsList r3 = r3.getOsList()
            io.realm.internal.TableQuery r3 = r3.getQuery()
            io.realm.internal.OsResults r2 = io.realm.internal.OsResults.createFromQuery(r2, r3)
            java.lang.Class<E> r3 = r4.clazz
            r0.<init>(r1, r2, r3)
            return r0
        L49:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This feature is available only when the element type is implementing RealmModel."
            r0.<init>(r1)
            throw r0
        L51:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L21
            r2.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            io.realm.internal.OsList r0 = r0.osList
            r0.deleteAll()
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            return r1
        L1f:
            r0 = 0
            return r0
        L21:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L19
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L18
            r2.deleteFromRealm(r1)
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
        L18:
            return r1
        L19:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int r4) {
            r3 = this;
            boolean r0 = r3.isManaged()
            if (r0 == 0) goto L18
            r3.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r3.osListOperator
            io.realm.internal.OsList r0 = r0.osList
            long r1 = (long) r4
            r0.delete(r1)
            int r4 = r3.modCount
            int r4 = r4 + 1
            r3.modCount = r4
            return
        L18:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is only available in managed mode."
            r4.<init>(r0)
            throw r4
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
            r5 = this;
            boolean r0 = r5.isManaged()
            if (r0 == 0) goto L25
            io.realm.ManagedListOperator<E> r0 = r5.osListOperator
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            io.realm.ManagedListOperator<E> r0 = r5.osListOperator
            io.realm.internal.OsList r0 = r0.osList
            long r1 = r0.size()
            r3 = 1
            long r1 = r1 - r3
            r0.delete(r1)
            int r0 = r5.modCount
            r1 = 1
            int r0 = r0 + r1
            r5.modCount = r0
            return r1
        L23:
            r0 = 0
            return r0
        L25:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E first() {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r0 = r2.firstImpl(r0, r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E first(@javax.annotation.Nullable E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.firstImpl(r0, r2)
            return r2
    }

    @Override // io.realm.internal.Freezable
    public io.realm.RealmList<E> freeze() {
            r4 = this;
            boolean r0 = r4.isManaged()
            if (r0 == 0) goto L36
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L2e
            io.realm.BaseRealm r0 = r4.baseRealm
            io.realm.BaseRealm r0 = r0.freeze()
            io.realm.internal.OsList r1 = r4.getOsList()
            io.realm.internal.OsSharedRealm r2 = r0.sharedRealm
            io.realm.internal.OsList r1 = r1.freeze(r2)
            java.lang.String r2 = r4.className
            if (r2 == 0) goto L26
            io.realm.RealmList r3 = new io.realm.RealmList
            r3.<init>(r2, r1, r0)
            return r3
        L26:
            io.realm.RealmList r2 = new io.realm.RealmList
            java.lang.Class<E> r3 = r4.clazz
            r2.<init>(r3, r1, r0)
            return r2
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only valid, managed RealmLists can be frozen."
            r0.<init>(r1)
            throw r0
        L36:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.RealmList r0 = r1.freeze()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @javax.annotation.Nullable
    public E get(int r2) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L10
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            java.lang.Object r2 = r0.get(r2)
            return r2
        L10:
            java.util.List<E> r0 = r1.unmanagedList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final io.realm.internal.OsList getOsList() {
            r1 = this;
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            return r0
    }

    public io.realm.Realm getRealm() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.baseRealm
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
            r0 = 1
            return r0
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            boolean r0 = r1.isAttached()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @javax.annotation.Nonnull
    public java.util.Iterator<E> iterator() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto Ld
            io.realm.RealmList$RealmItr r0 = new io.realm.RealmList$RealmItr
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Ld:
            java.util.Iterator r0 = super.iterator()
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E last() {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r0 = r2.lastImpl(r0, r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E last(@javax.annotation.Nullable E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.lastImpl(r0, r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    @javax.annotation.Nonnull
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @javax.annotation.Nonnull
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto Lc
            io.realm.RealmList$RealmListItr r0 = new io.realm.RealmList$RealmListItr
            r0.<init>(r1, r2)
            return r0
        Lc:
            java.util.ListIterator r2 = super.listIterator(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.lang.Number max(java.lang.String r2) {
            r1 = this;
            io.realm.RealmQuery r0 = r1.where()
            java.lang.Number r2 = r0.max(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.util.Date maxDate(java.lang.String r2) {
            r1 = this;
            io.realm.RealmQuery r0 = r1.where()
            java.util.Date r2 = r0.maximumDate(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.lang.Number min(java.lang.String r2) {
            r1 = this;
            io.realm.RealmQuery r0 = r1.where()
            java.lang.Number r2 = r0.min(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.util.Date minDate(java.lang.String r2) {
            r1 = this;
            io.realm.RealmQuery r0 = r1.where()
            java.util.Date r2 = r0.minimumDate(r2)
            return r2
    }

    public void move(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.isManaged()
            if (r0 == 0) goto L13
            r3.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r3.osListOperator
            io.realm.internal.OsList r0 = r0.osList
            long r1 = (long) r4
            long r4 = (long) r5
            r0.move(r1, r4)
            goto L30
        L13:
            java.util.List<E> r0 = r3.unmanagedList
            int r0 = r0.size()
            java.lang.String r1 = ", size is "
            java.lang.String r2 = "Invalid index "
            if (r4 < 0) goto L3b
            if (r0 <= r4) goto L3b
            if (r5 < 0) goto L31
            if (r0 <= r5) goto L31
            java.util.List<E> r0 = r3.unmanagedList
            java.lang.Object r4 = r0.remove(r4)
            java.util.List<E> r0 = r3.unmanagedList
            r0.add(r5, r4)
        L30:
            return
        L31:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L3b:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r4, r1, r0)
            r5.<init>(r4)
            throw r5
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r5) {
            r4 = this;
            boolean r0 = r4.isManaged()
            if (r0 == 0) goto L16
            r4.checkValidRealm()
            java.lang.Object r0 = r4.get(r5)
            io.realm.ManagedListOperator<E> r1 = r4.osListOperator
            io.realm.internal.OsList r1 = r1.osList
            long r2 = (long) r5
            r1.remove(r2)
            goto L1c
        L16:
            java.util.List<E> r0 = r4.unmanagedList
            java.lang.Object r0 = r0.remove(r5)
        L1c:
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L17
            io.realm.BaseRealm r0 = r1.baseRealm
            boolean r0 = r0.isInTransaction()
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Objects can only be removed from inside a write transaction."
            r2.<init>(r0)
            throw r2
        L17:
            boolean r2 = super.remove(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L17
            io.realm.BaseRealm r0 = r1.baseRealm
            boolean r0 = r0.isInTransaction()
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Objects can only be removed from inside a write transaction."
            r2.<init>(r0)
            throw r2
        L17:
            boolean r2 = super.removeAll(r2)
            return r2
    }

    public void removeAllChangeListeners() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r1 = 0
            r2 = 0
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r1, r2)
            io.realm.ManagedListOperator<E> r0 = r3.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            r0.removeAllListeners()
            return
    }

    public void removeChangeListener(io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmList<E>> r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r3, r1)
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            r0.removeListener(r2, r3)
            return
    }

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.RealmList<E>> r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r3, r1)
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            io.realm.internal.OsList r0 = r0.getOsList()
            r0.removeListener(r2, r3)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r2, @javax.annotation.Nullable E r3) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L10
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            java.lang.Object r2 = r0.set(r2, r3)
            goto L16
        L10:
            java.util.List<E> r0 = r1.unmanagedList
            java.lang.Object r2 = r0.set(r2, r3)
        L16:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L10
            r1.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r1.osListOperator
            int r0 = r0.size()
            return r0
        L10:
            java.util.List<E> r0 = r1.unmanagedList
            int r0 = r0.size()
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r2) {
            r1 = this;
            io.realm.Sort r0 = io.realm.Sort.ASCENDING
            io.realm.RealmResults r2 = r1.sort(r2, r0)
            return r2
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r2, io.realm.Sort r3) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L13
            io.realm.RealmQuery r0 = r1.where()
            io.realm.RealmQuery r2 = r0.sort(r2, r3)
            io.realm.RealmResults r2 = r2.findAll()
            return r2
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "This method is only available in managed mode."
            r2.<init>(r3)
            throw r2
    }

    @Override // io.realm.OrderedRealmCollection
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

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String[] r2, io.realm.Sort[] r3) {
            r1 = this;
            boolean r0 = r1.isManaged()
            if (r0 == 0) goto L13
            io.realm.RealmQuery r0 = r1.where()
            io.realm.RealmQuery r2 = r0.sort(r2, r3)
            io.realm.RealmResults r2 = r2.findAll()
            return r2
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "This method is only available in managed mode."
            r2.<init>(r3)
            throw r2
    }

    @Override // io.realm.RealmCollection
    public java.lang.Number sum(java.lang.String r2) {
            r1 = this;
            io.realm.RealmQuery r0 = r1.where()
            java.lang.Number r2 = r0.sum(r2)
            return r2
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r8.isManaged()
            java.lang.String r2 = "byte["
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r5 = "]"
            if (r1 != 0) goto L5b
            java.lang.String r1 = "RealmList<?>@["
            r0.append(r1)
            int r1 = r8.size()
        L1b:
            if (r4 >= r1) goto L47
            java.lang.Object r6 = r8.get(r4)
            boolean r7 = r6 instanceof io.realm.RealmModel
            if (r7 == 0) goto L2d
            int r6 = java.lang.System.identityHashCode(r6)
            r0.append(r6)
            goto L41
        L2d:
            boolean r7 = r6 instanceof byte[]
            if (r7 == 0) goto L3e
            r0.append(r2)
            byte[] r6 = (byte[]) r6
            int r6 = r6.length
            r0.append(r6)
            r0.append(r5)
            goto L41
        L3e:
            r0.append(r6)
        L41:
            r0.append(r3)
            int r4 = r4 + 1
            goto L1b
        L47:
            int r1 = r8.size()
            if (r1 <= 0) goto L56
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        L56:
            r0.append(r5)
            goto L119
        L5b:
            java.lang.String r1 = "RealmList<"
            r0.append(r1)
            java.lang.String r1 = r8.className
            if (r1 == 0) goto L68
            r0.append(r1)
            goto L99
        L68:
            java.lang.Class<E> r1 = r8.clazz
            boolean r1 = isClassForRealmModel(r1)
            if (r1 == 0) goto L84
            io.realm.BaseRealm r1 = r8.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            java.lang.Class<E> r6 = r8.clazz
            io.realm.RealmObjectSchema r1 = r1.getSchemaForClass(r6)
            java.lang.String r1 = r1.getClassName()
            r0.append(r1)
            goto L99
        L84:
            java.lang.Class<E> r1 = r8.clazz
            java.lang.Class<byte[]> r6 = byte[].class
            if (r1 != r6) goto L92
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L99
        L92:
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L99:
            java.lang.String r1 = ">@["
            r0.append(r1)
            boolean r1 = r8.isAttached()
            if (r1 != 0) goto Laa
            java.lang.String r1 = "invalid"
            r0.append(r1)
            goto L116
        Laa:
            java.lang.Class<E> r1 = r8.clazz
            boolean r1 = isClassForRealmModel(r1)
            if (r1 == 0) goto Le3
        Lb2:
            int r1 = r8.size()
            if (r4 >= r1) goto Ld3
            java.lang.Object r1 = r8.get(r4)
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.internal.Row r1 = r1.getRow$realm()
            long r1 = r1.getObjectKey()
            r0.append(r1)
            r0.append(r3)
            int r4 = r4 + 1
            goto Lb2
        Ld3:
            int r1 = r8.size()
            if (r1 <= 0) goto L116
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
            goto L116
        Le3:
            int r1 = r8.size()
            if (r4 >= r1) goto L107
            java.lang.Object r1 = r8.get(r4)
            boolean r6 = r1 instanceof byte[]
            if (r6 == 0) goto Lfe
            r0.append(r2)
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            r0.append(r1)
            r0.append(r5)
            goto L101
        Lfe:
            r0.append(r1)
        L101:
            r0.append(r3)
            int r4 = r4 + 1
            goto Le3
        L107:
            int r1 = r8.size()
            if (r1 <= 0) goto L116
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        L116:
            r0.append(r5)
        L119:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.realm.RealmCollection
    public io.realm.RealmQuery<E> where() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L1e
            r2.checkValidRealm()
            io.realm.ManagedListOperator<E> r0 = r2.osListOperator
            boolean r0 = r0.forRealmModel()
            if (r0 == 0) goto L16
            io.realm.RealmQuery r0 = io.realm.RealmQuery.createQueryFromList(r2)
            return r0
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This feature is available only when the element type is implementing RealmModel."
            r0.<init>(r1)
            throw r0
        L1e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only available in managed mode."
            r0.<init>(r1)
            throw r0
    }
}
