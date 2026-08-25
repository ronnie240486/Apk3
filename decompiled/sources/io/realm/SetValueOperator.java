package io.realm;

/* JADX INFO: loaded from: classes2.dex */
abstract class SetValueOperator<E> implements io.realm.internal.ObservableSet {
    public final io.realm.BaseRealm baseRealm;
    public final java.lang.String className;
    public final io.realm.internal.OsSet osSet;
    public final io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet.SetObserverPair<E>> setObserverPairs;
    public final java.lang.Class<E> valueClass;



    /* JADX INFO: renamed from: io.realm.SetValueOperator$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = null;

        static {
                io.realm.internal.OsSet$ExternalCollectionOperation[] r0 = io.realm.internal.OsSet.ExternalCollectionOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = r0
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public SetValueOperator(io.realm.BaseRealm r3, io.realm.internal.OsSet r4, java.lang.Class<E> r5) {
            r2 = this;
            java.lang.String r0 = r5.getSimpleName()
            r2.<init>()
            io.realm.internal.ObserverPairList r1 = new io.realm.internal.ObserverPairList
            r1.<init>()
            r2.setObserverPairs = r1
            r2.baseRealm = r3
            r2.osSet = r4
            r2.valueClass = r5
            r2.className = r0
            return
    }

    public SetValueOperator(io.realm.BaseRealm r3, io.realm.internal.OsSet r4, java.lang.String r5) {
            r2 = this;
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            r2.<init>()
            io.realm.internal.ObserverPairList r1 = new io.realm.internal.ObserverPairList
            r1.<init>()
            r2.setObserverPairs = r1
            r2.baseRealm = r3
            r2.osSet = r4
            r2.valueClass = r0
            r2.className = r5
            return
    }

    private boolean isCollectionSameType(java.util.Collection<?> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L24
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto La
            java.lang.Class<E> r1 = r2.valueClass
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    private boolean isObjectSameType(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            java.lang.Class<E> r0 = r1.valueClass
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
        Ld:
            r2 = 1
            return r2
    }

    private boolean isUpperBoundCollectionSameType(java.util.Collection<? extends E> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L24
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto La
            java.lang.Class<E> r1 = r2.valueClass
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    private static <T> io.realm.SetIterator<T> iteratorFactory(java.lang.Class<T> r1, io.realm.internal.OsSet r2, io.realm.BaseRealm r3, java.lang.String r4) {
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto La
            io.realm.BooleanSetIterator r1 = new io.realm.BooleanSetIterator
            r1.<init>(r2, r3)
            return r1
        La:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L14
            io.realm.StringSetIterator r1 = new io.realm.StringSetIterator
            r1.<init>(r2, r3)
            return r1
        L14:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L1e
            io.realm.IntegerSetIterator r1 = new io.realm.IntegerSetIterator
            r1.<init>(r2, r3)
            return r1
        L1e:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L28
            io.realm.LongSetIterator r1 = new io.realm.LongSetIterator
            r1.<init>(r2, r3)
            return r1
        L28:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 != r0) goto L32
            io.realm.ShortSetIterator r1 = new io.realm.ShortSetIterator
            r1.<init>(r2, r3)
            return r1
        L32:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 != r0) goto L3c
            io.realm.ByteSetIterator r1 = new io.realm.ByteSetIterator
            r1.<init>(r2, r3)
            return r1
        L3c:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 != r0) goto L46
            io.realm.FloatSetIterator r1 = new io.realm.FloatSetIterator
            r1.<init>(r2, r3)
            return r1
        L46:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 != r0) goto L50
            io.realm.DoubleSetIterator r1 = new io.realm.DoubleSetIterator
            r1.<init>(r2, r3)
            return r1
        L50:
            java.lang.Class<byte[]> r0 = byte[].class
            if (r1 != r0) goto L5a
            io.realm.BinarySetIterator r1 = new io.realm.BinarySetIterator
            r1.<init>(r2, r3)
            return r1
        L5a:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r1 != r0) goto L64
            io.realm.DateSetIterator r1 = new io.realm.DateSetIterator
            r1.<init>(r2, r3)
            return r1
        L64:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            if (r1 != r0) goto L6e
            io.realm.Decimal128SetIterator r1 = new io.realm.Decimal128SetIterator
            r1.<init>(r2, r3)
            return r1
        L6e:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            if (r1 != r0) goto L78
            io.realm.ObjectIdSetIterator r1 = new io.realm.ObjectIdSetIterator
            r1.<init>(r2, r3)
            return r1
        L78:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            if (r1 != r0) goto L82
            io.realm.UUIDSetIterator r1 = new io.realm.UUIDSetIterator
            r1.<init>(r2, r3)
            return r1
        L82:
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            if (r1 != r0) goto L8c
            io.realm.RealmAnySetIterator r1 = new io.realm.RealmAnySetIterator
            r1.<init>(r2, r3)
            return r1
        L8c:
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            if (r1 != r0) goto L96
            io.realm.DynamicSetIterator r1 = new io.realm.DynamicSetIterator
            r1.<init>(r2, r3, r4)
            return r1
        L96:
            boolean r4 = io.realm.CollectionUtils.isClassForRealmModel(r1)
            if (r4 == 0) goto La2
            io.realm.RealmModelSetIterator r4 = new io.realm.RealmModelSetIterator
            r4.<init>(r2, r3, r1)
            return r4
        La2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unknown class for iterator: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r1 = r1.getSimpleName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public abstract boolean add(@javax.annotation.Nullable E r1);

    public final boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            boolean r0 = r1.isRealmCollection(r2)
            if (r0 == 0) goto L13
            io.realm.RealmSet r2 = (io.realm.RealmSet) r2
            io.realm.internal.OsSet r2 = r2.getOsSet()
            io.realm.internal.OsSet$ExternalCollectionOperation r0 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL
            boolean r2 = r1.funnelCollection(r2, r0)
            return r2
        L13:
            boolean r0 = r1.isUpperBoundCollectionSameType(r2)
            if (r0 == 0) goto L1e
            boolean r2 = r1.addAllInternal(r2)
            return r2
        L1e:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and collection must be the same type when calling 'addAll'."
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean addAllInternal(java.util.Collection<? extends E> r1);

    public final void addChangeListener(io.realm.RealmSet<E> r3, io.realm.SetChangeListener<E> r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r4, r1)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r0 = r2.setObserverPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            io.realm.internal.OsSet r0 = r2.osSet
            r0.startListening(r2)
        L13:
            io.realm.internal.ObservableSet$SetObserverPair r0 = new io.realm.internal.ObservableSet$SetObserverPair
            r0.<init>(r3, r4)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r3 = r2.setObserverPairs
            r3.add(r0)
            return
    }

    public final boolean contains(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isObjectSameType(r2)
            if (r0 == 0) goto Lb
            boolean r2 = r1.containsInternal(r2)
            return r2
        Lb:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and object must be the same type when calling 'contains'."
            r2.<init>(r0)
            throw r2
    }

    public final boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r1.isRealmCollection(r2)
            if (r0 == 0) goto L13
            io.realm.RealmSet r2 = (io.realm.RealmSet) r2
            io.realm.internal.OsSet r2 = r2.getOsSet()
            io.realm.internal.OsSet$ExternalCollectionOperation r0 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL
            boolean r2 = r1.funnelCollection(r2, r0)
            return r2
        L13:
            boolean r0 = r1.isCollectionSameType(r2)
            if (r0 == 0) goto L1e
            boolean r2 = r1.containsAllInternal(r2)
            return r2
        L1e:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and collection must be the same type when calling 'containsAll'."
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean containsAllInternal(java.util.Collection<?> r1);

    public abstract boolean containsInternal(@javax.annotation.Nullable java.lang.Object r1);

    public final boolean funnelCollection(io.realm.internal.OsSet r11, io.realm.internal.OsSet.ExternalCollectionOperation r12) {
            r10 = this;
            io.realm.internal.OsSet r0 = r10.osSet
            long r0 = r0.getNativePtr()
            long r2 = r11.getNativePtr()
            java.lang.String r4 = "Unexpected value: "
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L43
            int[] r11 = io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation
            int r0 = r12.ordinal()
            r11 = r11[r0]
            if (r11 == r8) goto L42
            r0 = 0
            if (r11 == r7) goto L41
            if (r11 == r6) goto L3b
            if (r11 != r5) goto L26
            return r0
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L3b:
            io.realm.internal.OsSet r11 = r10.osSet
            r11.clear()
            return r8
        L41:
            return r0
        L42:
            return r8
        L43:
            int[] r0 = io.realm.SetValueOperator.AnonymousClass3.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation
            int r1 = r12.ordinal()
            r0 = r0[r1]
            if (r0 == r8) goto L7d
            if (r0 == r7) goto L76
            if (r0 == r6) goto L6f
            if (r0 != r5) goto L5a
            io.realm.internal.OsSet r12 = r10.osSet
            boolean r11 = r12.intersect(r11)
            return r11
        L5a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L6f:
            io.realm.internal.OsSet r12 = r10.osSet
            boolean r11 = r12.asymmetricDifference(r11)
            return r11
        L76:
            io.realm.internal.OsSet r12 = r10.osSet
            boolean r11 = r12.union(r11)
            return r11
        L7d:
            io.realm.internal.OsSet r12 = r10.osSet
            boolean r11 = r12.containsAll(r11)
            return r11
    }

    public java.lang.Class<E> getValueClass() {
            r1 = this;
            java.lang.Class<E> r0 = r1.valueClass
            return r0
    }

    public java.lang.String getValueClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public final boolean isRealmCollection(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.realm.RealmSet
            if (r0 == 0) goto Le
            io.realm.RealmSet r2 = (io.realm.RealmSet) r2
            boolean r2 = r2.isManaged()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public final java.util.Iterator<E> iterator() {
            r4 = this;
            java.lang.Class<E> r0 = r4.valueClass
            io.realm.internal.OsSet r1 = r4.osSet
            io.realm.BaseRealm r2 = r4.baseRealm
            java.lang.String r3 = r4.className
            io.realm.SetIterator r0 = iteratorFactory(r0, r1, r2, r3)
            return r0
    }

    @Override // io.realm.internal.ObservableSet
    public void notifyChangeListeners(long r3) {
            r2 = this;
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r1 = r2.setObserverPairs
            r0.notifyChangeListeners(r3, r1)
            return
    }

    public final boolean remove(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isObjectSameType(r2)
            if (r0 == 0) goto Lb
            boolean r2 = r1.removeInternal(r2)
            return r2
        Lb:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and object must be the same type when calling 'remove'."
            r2.<init>(r0)
            throw r2
    }

    public final boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r1.isRealmCollection(r2)
            if (r0 == 0) goto L13
            io.realm.RealmSet r2 = (io.realm.RealmSet) r2
            io.realm.internal.OsSet r2 = r2.getOsSet()
            io.realm.internal.OsSet$ExternalCollectionOperation r0 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL
            boolean r2 = r1.funnelCollection(r2, r0)
            return r2
        L13:
            boolean r0 = r1.isCollectionSameType(r2)
            if (r0 == 0) goto L1e
            boolean r2 = r1.removeAllInternal(r2)
            return r2
        L1e:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and collection must be the same type when calling 'removeAll'."
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean removeAllInternal(java.util.Collection<?> r1);

    public abstract boolean removeInternal(@javax.annotation.Nullable java.lang.Object r1);

    public final boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r1.isRealmCollection(r2)
            if (r0 == 0) goto L13
            io.realm.RealmSet r2 = (io.realm.RealmSet) r2
            io.realm.internal.OsSet r2 = r2.getOsSet()
            io.realm.internal.OsSet$ExternalCollectionOperation r0 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL
            boolean r2 = r1.funnelCollection(r2, r0)
            return r2
        L13:
            boolean r0 = r1.isCollectionSameType(r2)
            if (r0 == 0) goto L1e
            boolean r2 = r1.retainAllInternal(r2)
            return r2
        L1e:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r0 = "Set contents and collection must be the same type when calling 'retainAll'."
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean retainAllInternal(java.util.Collection<?> r1);

    public io.realm.RealmQuery<E> where() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This feature is available only when the element type is implementing RealmModel."
            r0.<init>(r1)
            throw r0
    }
}
