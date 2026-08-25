package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class OsResults implements io.realm.internal.NativeObject, io.realm.internal.ObservableCollection {
    public static final byte AGGREGATE_FUNCTION_AVERAGE = 3;
    public static final byte AGGREGATE_FUNCTION_MAXIMUM = 2;
    public static final byte AGGREGATE_FUNCTION_MINIMUM = 1;
    public static final byte AGGREGATE_FUNCTION_SUM = 4;
    private static final java.lang.String CLOSED_REALM_MESSAGE = "This Realm instance has already been closed, making it unusable.";
    public static final byte MODE_EMPTY = 0;
    public static final byte MODE_LIST = 2;
    public static final byte MODE_QUERY = 3;
    public static final byte MODE_TABLE = 1;
    public static final byte MODE_TABLEVIEW = 4;
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.internal.NativeContext context;
    private boolean isSnapshot;
    public boolean loaded;
    private final long nativePtr;
    public final io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection.CollectionObserverPair> observerPairs;
    private final io.realm.internal.OsSharedRealm sharedRealm;
    private final io.realm.internal.Table table;















    /* JADX INFO: loaded from: classes2.dex */
    public interface AddListTypeDelegate<T> {
        void addList(io.realm.internal.objectstore.OsObjectBuilder r1, io.realm.RealmList<T> r2);
    }

    public static final enum Aggregate extends java.lang.Enum<io.realm.internal.OsResults.Aggregate> {
        private static final /* synthetic */ io.realm.internal.OsResults.Aggregate[] $VALUES = null;
        public static final io.realm.internal.OsResults.Aggregate AVERAGE = null;
        public static final io.realm.internal.OsResults.Aggregate MAXIMUM = null;
        public static final io.realm.internal.OsResults.Aggregate MINIMUM = null;
        public static final io.realm.internal.OsResults.Aggregate SUM = null;
        private final byte value;

        static {
                io.realm.internal.OsResults$Aggregate r0 = new io.realm.internal.OsResults$Aggregate
                java.lang.String r1 = "MINIMUM"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                io.realm.internal.OsResults.Aggregate.MINIMUM = r0
                io.realm.internal.OsResults$Aggregate r1 = new io.realm.internal.OsResults$Aggregate
                java.lang.String r4 = "MAXIMUM"
                r5 = 2
                r1.<init>(r4, r3, r5)
                io.realm.internal.OsResults.Aggregate.MAXIMUM = r1
                io.realm.internal.OsResults$Aggregate r4 = new io.realm.internal.OsResults$Aggregate
                java.lang.String r6 = "AVERAGE"
                r7 = 3
                r4.<init>(r6, r5, r7)
                io.realm.internal.OsResults.Aggregate.AVERAGE = r4
                io.realm.internal.OsResults$Aggregate r6 = new io.realm.internal.OsResults$Aggregate
                java.lang.String r8 = "SUM"
                r9 = 4
                r6.<init>(r8, r7, r9)
                io.realm.internal.OsResults.Aggregate.SUM = r6
                io.realm.internal.OsResults$Aggregate[] r8 = new io.realm.internal.OsResults.Aggregate[r9]
                r8[r2] = r0
                r8[r3] = r1
                r8[r5] = r4
                r8[r7] = r6
                io.realm.internal.OsResults.Aggregate.$VALUES = r8
                return
        }

        private Aggregate(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.realm.internal.OsResults.Aggregate valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsResults$Aggregate> r0 = io.realm.internal.OsResults.Aggregate.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsResults$Aggregate r1 = (io.realm.internal.OsResults.Aggregate) r1
                return r1
        }

        public static io.realm.internal.OsResults.Aggregate[] values() {
                io.realm.internal.OsResults$Aggregate[] r0 = io.realm.internal.OsResults.Aggregate.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsResults$Aggregate[] r0 = (io.realm.internal.OsResults.Aggregate[]) r0
                return r0
        }

        public byte getValue() {
                r1 = this;
                byte r0 = r1.value
                return r0
        }
    }

    public static abstract class Iterator<T> implements java.util.Iterator<T> {
        public io.realm.internal.OsResults iteratorOsResults;
        public int pos;

        public Iterator(io.realm.internal.OsResults r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.pos = r0
                io.realm.internal.OsSharedRealm r0 = io.realm.internal.OsResults.access$000(r2)
                boolean r0 = r0.isClosed()
                if (r0 != 0) goto L36
                r1.iteratorOsResults = r2
                boolean r0 = io.realm.internal.OsResults.access$100(r2)
                if (r0 == 0) goto L19
                return
            L19:
                io.realm.internal.OsSharedRealm r2 = io.realm.internal.OsResults.access$000(r2)
                boolean r2 = r2.isInTransaction()
                if (r2 == 0) goto L2c
                io.realm.internal.OsResults r2 = r1.iteratorOsResults
                io.realm.internal.OsResults r2 = r2.createSnapshot()
                r1.iteratorOsResults = r2
                goto L35
            L2c:
                io.realm.internal.OsResults r2 = r1.iteratorOsResults
                io.realm.internal.OsSharedRealm r2 = io.realm.internal.OsResults.access$000(r2)
                r2.addIterator(r1)
            L35:
                return
            L36:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "This Realm instance has already been closed, making it unusable."
                r2.<init>(r0)
                throw r2
        }

        public final void checkValid() {
                r2 = this;
                io.realm.internal.OsResults r0 = r2.iteratorOsResults
                if (r0 == 0) goto L5
                return
            L5:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                java.lang.String r1 = "No outside changes to a Realm is allowed while iterating a living Realm collection."
                r0.<init>(r1)
                throw r0
        }

        public abstract T getInternal(int r1, io.realm.internal.OsResults r2);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r6 = this;
                r6.checkValid()
                int r0 = r6.pos
                r1 = 1
                int r0 = r0 + r1
                long r2 = (long) r0
                io.realm.internal.OsResults r0 = r6.iteratorOsResults
                long r4 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L13
                goto L14
            L13:
                r1 = 0
            L14:
                return r1
        }

        @Override // java.util.Iterator
        @javax.annotation.Nullable
        public T next() {
                r5 = this;
                r5.checkValid()
                int r0 = r5.pos
                int r0 = r0 + 1
                r5.pos = r0
                long r0 = (long) r0
                io.realm.internal.OsResults r2 = r5.iteratorOsResults
                long r2 = r2.size()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L1d
                int r0 = r5.pos
                io.realm.internal.OsResults r1 = r5.iteratorOsResults
                java.lang.Object r0 = r5.getInternal(r0, r1)
                return r0
            L1d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Cannot access index "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r5.pos
                r1.append(r2)
                java.lang.String r2 = " when size is "
                r1.append(r2)
                io.realm.internal.OsResults r2 = r5.iteratorOsResults
                long r2 = r2.size()
                r1.append(r2)
                java.lang.String r2 = ". Remember to check hasNext() before using next()."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        @java.lang.Deprecated
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "remove() is not supported by RealmResults iterators."
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ListIterator<T> extends io.realm.internal.OsResults.Iterator<T> implements java.util.ListIterator<T> {
        public ListIterator(io.realm.internal.OsResults r6, int r7) {
                r5 = this;
                r5.<init>(r6)
                if (r7 < 0) goto L15
                long r0 = (long) r7
                io.realm.internal.OsResults r6 = r5.iteratorOsResults
                long r2 = r6.size()
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 > 0) goto L15
                int r7 = r7 + (-1)
                r5.pos = r7
                return
            L15:
                java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
                java.lang.String r0 = "Starting location must be a valid index: [0, "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                io.realm.internal.OsResults r1 = r5.iteratorOsResults
                long r1 = r1.size()
                r3 = 1
                long r1 = r1 - r3
                r0.append(r1)
                java.lang.String r1 = "]. Yours was "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
        }

        @Override // java.util.ListIterator
        @java.lang.Deprecated
        public void add(@javax.annotation.Nullable T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Adding an element is not supported. Use Realm.createObject() instead."
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                r1.checkValid()
                int r0 = r1.pos
                if (r0 < 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                r1.checkValid()
                int r0 = r1.pos
                int r0 = r0 + 1
                return r0
        }

        @Override // java.util.ListIterator
        @javax.annotation.Nullable
        public T previous() {
                r4 = this;
                r4.checkValid()
                int r0 = r4.pos     // Catch: java.lang.IndexOutOfBoundsException -> L12
                io.realm.internal.OsResults r1 = r4.iteratorOsResults     // Catch: java.lang.IndexOutOfBoundsException -> L12
                java.lang.Object r0 = r4.getInternal(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L12
                int r1 = r4.pos     // Catch: java.lang.IndexOutOfBoundsException -> L12
                int r1 = r1 + (-1)
                r4.pos = r1     // Catch: java.lang.IndexOutOfBoundsException -> L12
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Cannot access index less than zero. This was "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.pos
                java.lang.String r3 = ". Remember to check hasPrevious() before using previous()."
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                r1.checkValid()
                int r0 = r1.pos
                return r0
        }

        @Override // java.util.ListIterator
        @java.lang.Deprecated
        public void set(@javax.annotation.Nullable T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Replacing an element is not supported."
                r2.<init>(r0)
                throw r2
        }
    }

    public static final enum Mode extends java.lang.Enum<io.realm.internal.OsResults.Mode> {
        private static final /* synthetic */ io.realm.internal.OsResults.Mode[] $VALUES = null;
        public static final io.realm.internal.OsResults.Mode EMPTY = null;
        public static final io.realm.internal.OsResults.Mode PRIMITIVE_LIST = null;
        public static final io.realm.internal.OsResults.Mode QUERY = null;
        public static final io.realm.internal.OsResults.Mode TABLE = null;
        public static final io.realm.internal.OsResults.Mode TABLEVIEW = null;

        static {
                io.realm.internal.OsResults$Mode r0 = new io.realm.internal.OsResults$Mode
                java.lang.String r1 = "EMPTY"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.internal.OsResults.Mode.EMPTY = r0
                io.realm.internal.OsResults$Mode r1 = new io.realm.internal.OsResults$Mode
                java.lang.String r3 = "TABLE"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.internal.OsResults.Mode.TABLE = r1
                io.realm.internal.OsResults$Mode r3 = new io.realm.internal.OsResults$Mode
                java.lang.String r5 = "PRIMITIVE_LIST"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.internal.OsResults.Mode.PRIMITIVE_LIST = r3
                io.realm.internal.OsResults$Mode r5 = new io.realm.internal.OsResults$Mode
                java.lang.String r7 = "QUERY"
                r8 = 3
                r5.<init>(r7, r8)
                io.realm.internal.OsResults.Mode.QUERY = r5
                io.realm.internal.OsResults$Mode r7 = new io.realm.internal.OsResults$Mode
                java.lang.String r9 = "TABLEVIEW"
                r10 = 4
                r7.<init>(r9, r10)
                io.realm.internal.OsResults.Mode.TABLEVIEW = r7
                r9 = 5
                io.realm.internal.OsResults$Mode[] r9 = new io.realm.internal.OsResults.Mode[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.realm.internal.OsResults.Mode.$VALUES = r9
                return
        }

        private Mode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.internal.OsResults.Mode valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsResults$Mode> r0 = io.realm.internal.OsResults.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsResults$Mode r1 = (io.realm.internal.OsResults.Mode) r1
                return r1
        }

        public static io.realm.internal.OsResults.Mode[] values() {
                io.realm.internal.OsResults$Mode[] r0 = io.realm.internal.OsResults.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsResults$Mode[] r0 = (io.realm.internal.OsResults.Mode[]) r0
                return r0
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsResults.nativeFinalizerPtr = r0
            return
    }

    public OsResults(io.realm.internal.OsSharedRealm r4, long r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.isSnapshot = r0
            io.realm.internal.ObserverPairList r1 = new io.realm.internal.ObserverPairList
            r1.<init>()
            r3.observerPairs = r1
            r3.sharedRealm = r4
            io.realm.internal.NativeContext r1 = r4.context
            r3.context = r1
            r3.nativePtr = r5
            r1.addReference(r3)
            io.realm.internal.OsResults$Mode r1 = r3.getMode()
            io.realm.internal.OsResults$Mode r2 = io.realm.internal.OsResults.Mode.QUERY
            if (r1 == r2) goto L21
            r0 = 1
        L21:
            r3.loaded = r0
            io.realm.internal.Table r0 = new io.realm.internal.Table
            long r5 = nativeGetTable(r5)
            r0.<init>(r4, r5)
            r3.table = r0
            return
    }

    public OsResults(io.realm.internal.OsSharedRealm r3, io.realm.internal.Table r4, long r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isSnapshot = r0
            io.realm.internal.ObserverPairList r1 = new io.realm.internal.ObserverPairList
            r1.<init>()
            r2.observerPairs = r1
            r2.sharedRealm = r3
            io.realm.internal.NativeContext r3 = r3.context
            r2.context = r3
            r2.table = r4
            r2.nativePtr = r5
            r3.addReference(r2)
            io.realm.internal.OsResults$Mode r3 = r2.getMode()
            io.realm.internal.OsResults$Mode r4 = io.realm.internal.OsResults.Mode.QUERY
            if (r3 == r4) goto L23
            r0 = 1
        L23:
            r2.loaded = r0
            return
    }

    public static /* synthetic */ io.realm.internal.OsSharedRealm access$000(io.realm.internal.OsResults r0) {
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            return r0
    }

    public static /* synthetic */ boolean access$100(io.realm.internal.OsResults r0) {
            boolean r0 = r0.isSnapshot
            return r0
    }

    private <T> void addTypeSpecificList(java.lang.String r4, io.realm.RealmList<T> r5, io.realm.internal.OsResults.AddListTypeDelegate<T> r6) {
            r3 = this;
            io.realm.internal.objectstore.OsObjectBuilder r0 = new io.realm.internal.objectstore.OsObjectBuilder
            io.realm.internal.Table r1 = r3.getTable()
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            r0.<init>(r1, r2)
            r6.addList(r0, r5)
            long r5 = r3.nativePtr     // Catch: java.lang.Throwable -> L1b
            long r1 = r0.getNativePtr()     // Catch: java.lang.Throwable -> L1b
            nativeSetList(r5, r4, r1)     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r4 = move-exception
            r0.close()
            throw r4
    }

    public static io.realm.internal.OsResults createForBacklinks(io.realm.internal.OsSharedRealm r8, io.realm.internal.UncheckedRow r9, io.realm.internal.Table r10, java.lang.String r11) {
            long r0 = r8.getNativePtr()
            long r2 = r9.getNativePtr()
            long r4 = r10.getNativePtr()
            long r6 = r10.getColumnKey(r11)
            long r0 = nativeCreateResultsFromBacklinks(r0, r2, r4, r6)
            io.realm.internal.OsResults r9 = new io.realm.internal.OsResults
            r9.<init>(r8, r10, r0)
            return r9
    }

    public static io.realm.internal.OsResults createFromMap(io.realm.internal.OsSharedRealm r1, long r2) {
            io.realm.internal.OsResults r0 = new io.realm.internal.OsResults
            r0.<init>(r1, r2)
            return r0
    }

    public static io.realm.internal.OsResults createFromQuery(io.realm.internal.OsSharedRealm r4, io.realm.internal.TableQuery r5) {
            r5.validateQuery()
            long r0 = r4.getNativePtr()
            long r2 = r5.getNativePtr()
            long r0 = nativeCreateResults(r0, r2)
            io.realm.internal.OsResults r2 = new io.realm.internal.OsResults
            io.realm.internal.Table r5 = r5.getTable()
            r2.<init>(r4, r5, r0)
            return r2
    }

    private static native java.lang.Object nativeAggregate(long r0, long r2, byte r4);

    private static native void nativeClear(long r0);

    private static native boolean nativeContains(long r0, long r2);

    public static native long nativeCreateResults(long r0, long r2);

    private static native long nativeCreateResultsFromBacklinks(long r0, long r2, long r4, long r6);

    private static native long nativeCreateSnapshot(long r0);

    private static native void nativeDelete(long r0, long r2);

    private static native boolean nativeDeleteFirst(long r0);

    private static native boolean nativeDeleteLast(long r0);

    private static native void nativeEvaluateQueryIfNeeded(long r0, boolean r2);

    private static native long nativeFirstRow(long r0);

    private static native long nativeFreeze(long r0, long r2);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long r0);

    private static native long nativeGetRow(long r0, int r2);

    private static native long nativeGetTable(long r0);

    private static native java.lang.Object nativeGetValue(long r0, int r2);

    private static native long nativeIndexOf(long r0, long r2);

    private static native boolean nativeIsValid(long r0);

    private static native long nativeLastRow(long r0);

    private static native void nativeSetBinary(long r0, java.lang.String r2, @javax.annotation.Nullable byte[] r3);

    private static native void nativeSetBoolean(long r0, java.lang.String r2, boolean r3);

    private static native void nativeSetDecimal128(long r0, java.lang.String r2, long r3, long r5);

    private static native void nativeSetDouble(long r0, java.lang.String r2, double r3);

    private static native void nativeSetFloat(long r0, java.lang.String r2, float r3);

    private static native void nativeSetInt(long r0, java.lang.String r2, long r3);

    private static native void nativeSetList(long r0, java.lang.String r2, long r3);

    private static native void nativeSetNull(long r0, java.lang.String r2);

    private static native void nativeSetObject(long r0, java.lang.String r2, long r3);

    private static native void nativeSetObjectId(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeSetString(long r0, java.lang.String r2, @javax.annotation.Nullable java.lang.String r3);

    private static native void nativeSetTimestamp(long r0, java.lang.String r2, long r3);

    private static native void nativeSetUUID(long r0, java.lang.String r2, java.lang.String r3);

    private static native long nativeSize(long r0);

    private native void nativeStartListening(long r1);

    private native void nativeStopListening(long r1);

    private static native long nativeStringDescriptor(long r0, java.lang.String r2, long r3);

    private static native long nativeWhere(long r0);

    private static native java.lang.String toJSON(long r0, int r2);

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

    public java.util.Date aggregateDate(io.realm.internal.OsResults.Aggregate r3, long r4) {
            r2 = this;
            long r0 = r2.nativePtr
            byte r3 = r3.getValue()
            java.lang.Object r3 = nativeAggregate(r0, r4, r3)
            java.util.Date r3 = (java.util.Date) r3
            return r3
    }

    public java.lang.Number aggregateNumber(io.realm.internal.OsResults.Aggregate r3, long r4) {
            r2 = this;
            long r0 = r2.nativePtr
            byte r3 = r3.getValue()
            java.lang.Object r3 = nativeAggregate(r0, r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            return r3
    }

    public void clear() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeClear(r0)
            return
    }

    public boolean contains(io.realm.internal.UncheckedRow r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            boolean r5 = nativeContains(r0, r2)
            return r5
    }

    public io.realm.internal.OsResults createSnapshot() {
            r5 = this;
            boolean r0 = r5.isSnapshot
            if (r0 == 0) goto L5
            return r5
        L5:
            io.realm.internal.OsResults r0 = new io.realm.internal.OsResults
            io.realm.internal.OsSharedRealm r1 = r5.sharedRealm
            io.realm.internal.Table r2 = r5.table
            long r3 = r5.nativePtr
            long r3 = nativeCreateSnapshot(r3)
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.isSnapshot = r1
            return r0
    }

    public void delete(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeDelete(r0, r3)
            return
    }

    public boolean deleteFirst() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeDeleteFirst(r0)
            return r0
    }

    public boolean deleteLast() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeDeleteLast(r0)
            return r0
    }

    public io.realm.internal.OsResults distinct(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r8, java.lang.String[] r9) {
            r7 = this;
            java.lang.String r9 = io.realm.internal.TableQuery.buildDistinctDescriptor(r9)
            io.realm.internal.OsResults r0 = new io.realm.internal.OsResults
            io.realm.internal.OsSharedRealm r1 = r7.sharedRealm
            io.realm.internal.Table r2 = r7.table
            long r3 = r7.nativePtr
            if (r8 == 0) goto L13
            long r5 = r8.getNativePtr()
            goto L15
        L13:
            r5 = 0
        L15:
            long r8 = nativeStringDescriptor(r3, r9, r5)
            r0.<init>(r1, r2, r8)
            return r0
    }

    public io.realm.internal.UncheckedRow firstUncheckedRow() {
            r5 = this;
            long r0 = r5.nativePtr
            long r0 = nativeFirstRow(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            io.realm.internal.Table r2 = r5.table
            io.realm.internal.UncheckedRow r0 = r2.getUncheckedRowByPointer(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public io.realm.internal.OsResults freeze(io.realm.internal.OsSharedRealm r7) {
            r6 = this;
            io.realm.internal.OsResults r0 = new io.realm.internal.OsResults
            io.realm.internal.Table r1 = r6.table
            io.realm.internal.Table r1 = r1.freeze(r7)
            long r2 = r6.nativePtr
            long r4 = r7.getNativePtr()
            long r2 = nativeFreeze(r2, r4)
            r0.<init>(r7, r1, r2)
            boolean r7 = r6.isLoaded()
            if (r7 == 0) goto L1e
            r0.load()
        L1e:
            return r0
    }

    public io.realm.internal.OsResults.Mode getMode() {
            r3 = this;
            long r0 = r3.nativePtr
            byte r0 = nativeGetMode(r0)
            io.realm.internal.OsResults$Mode r1 = io.realm.internal.OsResults.Mode.EMPTY
            if (r0 == 0) goto L2e
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 != r1) goto L19
            io.realm.internal.OsResults$Mode r0 = io.realm.internal.OsResults.Mode.TABLEVIEW
            goto L30
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid value: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
        L25:
            io.realm.internal.OsResults$Mode r0 = io.realm.internal.OsResults.Mode.QUERY
            goto L30
        L28:
            io.realm.internal.OsResults$Mode r0 = io.realm.internal.OsResults.Mode.PRIMITIVE_LIST
            goto L30
        L2b:
            io.realm.internal.OsResults$Mode r0 = io.realm.internal.OsResults.Mode.TABLE
            goto L30
        L2e:
            io.realm.internal.OsResults$Mode r0 = io.realm.internal.OsResults.Mode.EMPTY
        L30:
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsResults.nativeFinalizerPtr
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

    public io.realm.internal.UncheckedRow getUncheckedRow(int r4) {
            r3 = this;
            io.realm.internal.Table r0 = r3.table
            long r1 = r3.nativePtr
            long r1 = nativeGetRow(r1, r4)
            io.realm.internal.UncheckedRow r4 = r0.getUncheckedRowByPointer(r1)
            return r4
    }

    public java.lang.Object getValue(int r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.Object r3 = nativeGetValue(r0, r3)
            return r3
    }

    public int indexOf(io.realm.internal.UncheckedRow r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            long r0 = nativeIndexOf(r0, r2)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L16
        L15:
            int r5 = (int) r0
        L16:
            return r5
    }

    public boolean isLoaded() {
            r1 = this;
            boolean r0 = r1.loaded
            return r0
    }

    public boolean isValid() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsValid(r0)
            return r0
    }

    public io.realm.internal.UncheckedRow lastUncheckedRow() {
            r5 = this;
            long r0 = r5.nativePtr
            long r0 = nativeLastRow(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            io.realm.internal.Table r2 = r5.table
            io.realm.internal.UncheckedRow r0 = r2.getUncheckedRowByPointer(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public void load() {
            r3 = this;
            boolean r0 = r3.loaded
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r3.nativePtr
            r2 = 0
            nativeEvaluateQueryIfNeeded(r0, r2)
            r0 = 0
            r3.notifyChangeListeners(r0)
            return
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            io.realm.internal.EmptyLoadChangeSet r5 = new io.realm.internal.EmptyLoadChangeSet
            r5.<init>()
            goto L18
        Ld:
            io.realm.internal.OsCollectionChangeSet r1 = new io.realm.internal.OsCollectionChangeSet
            boolean r2 = r4.isLoaded()
            r2 = r2 ^ r0
            r1.<init>(r5, r2)
            r5 = r1
        L18:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L25
            boolean r6 = r4.isLoaded()
            if (r6 == 0) goto L25
            return
        L25:
            r4.loaded = r0
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableCollection$CollectionObserverPair> r6 = r4.observerPairs
            io.realm.internal.ObservableCollection$Callback r0 = new io.realm.internal.ObservableCollection$Callback
            r0.<init>(r5)
            r6.foreach(r0)
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

    public void setBlob(java.lang.String r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetBinary(r0, r3, r4)
            return
    }

    public void setBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetBoolean(r0, r3, r4)
            return
    }

    public void setBooleanList(java.lang.String r2, io.realm.RealmList<java.lang.Boolean> r3) {
            r1 = this;
            io.realm.internal.OsResults$6 r0 = new io.realm.internal.OsResults$6
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setByteArrayList(java.lang.String r2, io.realm.RealmList<byte[]> r3) {
            r1 = this;
            io.realm.internal.OsResults$7 r0 = new io.realm.internal.OsResults$7
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setByteList(java.lang.String r2, io.realm.RealmList<java.lang.Byte> r3) {
            r1 = this;
            io.realm.internal.OsResults$2 r0 = new io.realm.internal.OsResults$2
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setDate(java.lang.String r5, @javax.annotation.Nullable java.util.Date r6) {
            r4 = this;
            if (r6 != 0) goto L8
            long r0 = r4.nativePtr
            nativeSetNull(r0, r5)
            goto L11
        L8:
            long r0 = r4.nativePtr
            long r2 = r6.getTime()
            nativeSetTimestamp(r0, r5, r2)
        L11:
            return
    }

    public void setDateList(java.lang.String r2, io.realm.RealmList<java.util.Date> r3) {
            r1 = this;
            io.realm.internal.OsResults$8 r0 = new io.realm.internal.OsResults$8
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setDecimal128(java.lang.String r10, @javax.annotation.Nullable org.bson.types.Decimal128 r11) {
            r9 = this;
            if (r11 != 0) goto L8
            long r0 = r9.nativePtr
            nativeSetNull(r0, r10)
            goto L16
        L8:
            long r2 = r9.nativePtr
            long r5 = r11.getLow()
            long r7 = r11.getHigh()
            r4 = r10
            nativeSetDecimal128(r2, r4, r5, r7)
        L16:
            return
    }

    public void setDecimal128List(java.lang.String r2, io.realm.RealmList<org.bson.types.Decimal128> r3) {
            r1 = this;
            io.realm.internal.OsResults$12 r0 = new io.realm.internal.OsResults$12
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setDouble(java.lang.String r3, double r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetDouble(r0, r3, r4)
            return
    }

    public void setDoubleList(java.lang.String r2, io.realm.RealmList<java.lang.Double> r3) {
            r1 = this;
            io.realm.internal.OsResults$10 r0 = new io.realm.internal.OsResults$10
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetFloat(r0, r3, r4)
            return
    }

    public void setFloatList(java.lang.String r2, io.realm.RealmList<java.lang.Float> r3) {
            r1 = this;
            io.realm.internal.OsResults$9 r0 = new io.realm.internal.OsResults$9
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setInt(java.lang.String r3, long r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetInt(r0, r3, r4)
            return
    }

    public void setIntegerList(java.lang.String r2, io.realm.RealmList<java.lang.Integer> r3) {
            r1 = this;
            io.realm.internal.OsResults$4 r0 = new io.realm.internal.OsResults$4
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setLongList(java.lang.String r2, io.realm.RealmList<java.lang.Long> r3) {
            r1 = this;
            io.realm.internal.OsResults$5 r0 = new io.realm.internal.OsResults$5
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setModelList(java.lang.String r2, io.realm.RealmList<io.realm.RealmModel> r3) {
            r1 = this;
            io.realm.internal.OsResults$11 r0 = new io.realm.internal.OsResults$11
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setNull(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            return
    }

    public void setObject(java.lang.String r5, @javax.annotation.Nullable io.realm.internal.Row r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r4.setNull(r5)
            goto L20
        L6:
            boolean r0 = r6 instanceof io.realm.internal.UncheckedRow
            if (r0 == 0) goto L11
            io.realm.internal.UncheckedRow r6 = (io.realm.internal.UncheckedRow) r6
            long r0 = r6.getNativePtr()
            goto L1b
        L11:
            boolean r0 = r6 instanceof io.realm.internal.CheckedRow
            if (r0 == 0) goto L21
            io.realm.internal.CheckedRow r6 = (io.realm.internal.CheckedRow) r6
            long r0 = r6.getNativePtr()
        L1b:
            long r2 = r4.nativePtr
            nativeSetObject(r2, r5, r0)
        L20:
            return
        L21:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unsupported Row type: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    public void setObjectId(java.lang.String r3, @javax.annotation.Nullable org.bson.types.ObjectId r4) {
            r2 = this;
            if (r4 != 0) goto L8
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r4 = r4.toString()
            nativeSetObjectId(r0, r3, r4)
        L11:
            return
    }

    public void setObjectIdList(java.lang.String r2, io.realm.RealmList<org.bson.types.ObjectId> r3) {
            r1 = this;
            io.realm.internal.OsResults$13 r0 = new io.realm.internal.OsResults$13
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setShortList(java.lang.String r2, io.realm.RealmList<java.lang.Short> r3) {
            r1 = this;
            io.realm.internal.OsResults$3 r0 = new io.realm.internal.OsResults$3
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setString(java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeSetString(r0, r3, r4)
            return
    }

    public void setStringList(java.lang.String r2, io.realm.RealmList<java.lang.String> r3) {
            r1 = this;
            io.realm.internal.OsResults$1 r0 = new io.realm.internal.OsResults$1
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public void setUUID(java.lang.String r3, @javax.annotation.Nullable java.util.UUID r4) {
            r2 = this;
            if (r4 != 0) goto L8
            long r0 = r2.nativePtr
            nativeSetNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.nativePtr
            java.lang.String r4 = r4.toString()
            nativeSetUUID(r0, r3, r4)
        L11:
            return
    }

    public void setUUIDList(java.lang.String r2, io.realm.RealmList<java.util.UUID> r3) {
            r1 = this;
            io.realm.internal.OsResults$14 r0 = new io.realm.internal.OsResults$14
            r0.<init>()
            r1.addTypeSpecificList(r2, r3, r0)
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            return r0
    }

    public io.realm.internal.OsResults sort(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r7, java.lang.String r8, io.realm.Sort r9) {
            r6 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r8
            io.realm.Sort[] r8 = new io.realm.Sort[r0]
            r8[r2] = r9
            java.lang.String r8 = io.realm.internal.TableQuery.buildSortDescriptor(r1, r8)
            io.realm.internal.OsResults r9 = new io.realm.internal.OsResults
            io.realm.internal.OsSharedRealm r0 = r6.sharedRealm
            io.realm.internal.Table r1 = r6.table
            long r2 = r6.nativePtr
            if (r7 == 0) goto L1d
            long r4 = r7.getNativePtr()
            goto L1f
        L1d:
            r4 = 0
        L1f:
            long r7 = nativeStringDescriptor(r2, r8, r4)
            r9.<init>(r0, r1, r7)
            return r9
    }

    public io.realm.internal.OsResults sort(@javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r7, java.lang.String[] r8, io.realm.Sort[] r9) {
            r6 = this;
            if (r9 == 0) goto L2e
            int r0 = r9.length
            if (r0 == 0) goto L2e
            int r0 = r8.length
            int r1 = r9.length
            if (r0 != r1) goto L26
            java.lang.String r8 = io.realm.internal.TableQuery.buildSortDescriptor(r8, r9)
            io.realm.internal.OsResults r9 = new io.realm.internal.OsResults
            io.realm.internal.OsSharedRealm r0 = r6.sharedRealm
            io.realm.internal.Table r1 = r6.table
            long r2 = r6.nativePtr
            if (r7 == 0) goto L1c
            long r4 = r7.getNativePtr()
            goto L1e
        L1c:
            r4 = 0
        L1e:
            long r7 = nativeStringDescriptor(r2, r8, r4)
            r9.<init>(r0, r1, r7)
            return r9
        L26:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Number of fields and sort orders do not match."
            r7.<init>(r8)
            throw r7
        L2e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "You must provide at least one sort order."
            r7.<init>(r8)
            throw r7
    }

    public java.lang.String toJSON(int r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = toJSON(r0, r3)
            return r3
    }

    public io.realm.internal.TableQuery where() {
            r5 = this;
            long r0 = r5.nativePtr
            long r0 = nativeWhere(r0)
            io.realm.internal.TableQuery r2 = new io.realm.internal.TableQuery
            io.realm.internal.NativeContext r3 = r5.context
            io.realm.internal.Table r4 = r5.table
            r2.<init>(r3, r4, r0)
            return r2
    }
}
