package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
@io.realm.internal.Keep
public class OsObject implements io.realm.internal.NativeObject {
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;
    private io.realm.internal.ObserverPairList<io.realm.internal.OsObject.ObjectObserverPair> observerPairs;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Callback implements io.realm.internal.ObserverPairList.Callback<io.realm.internal.OsObject.ObjectObserverPair> {
        private final java.lang.String[] changedFields;

        public Callback(java.lang.String[] r1) {
                r0 = this;
                r0.<init>()
                r0.changedFields = r1
                return
        }

        private io.realm.ObjectChangeSet createChangeSet() {
                r4 = this;
                java.lang.String[] r0 = r4.changedFields
                r1 = 0
                if (r0 != 0) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                io.realm.internal.OsObject$OsObjectChangeSet r3 = new io.realm.internal.OsObject$OsObjectChangeSet
                if (r2 == 0) goto Le
                java.lang.String[] r0 = new java.lang.String[r1]
            Le:
                r3.<init>(r0, r2)
                return r3
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(io.realm.internal.ObserverPairList.ObserverPair r1, java.lang.Object r2) {
                r0 = this;
                io.realm.internal.OsObject$ObjectObserverPair r1 = (io.realm.internal.OsObject.ObjectObserverPair) r1
                r0.onCalled(r1, r2)
                return
        }

        public void onCalled(io.realm.internal.OsObject.ObjectObserverPair r2, java.lang.Object r3) {
                r1 = this;
                io.realm.RealmModel r3 = (io.realm.RealmModel) r3
                io.realm.ObjectChangeSet r0 = r1.createChangeSet()
                r2.onChange(r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ObjectObserverPair<T extends io.realm.RealmModel> extends io.realm.internal.ObserverPairList.ObserverPair<T, io.realm.RealmObjectChangeListener<T>> {
        public ObjectObserverPair(T r1, io.realm.RealmObjectChangeListener<T> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public void onChange(T r2, @javax.annotation.Nullable io.realm.ObjectChangeSet r3) {
                r1 = this;
                S r0 = r1.listener
                io.realm.RealmObjectChangeListener r0 = (io.realm.RealmObjectChangeListener) r0
                r0.onChange(r2, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class OsObjectChangeSet implements io.realm.ObjectChangeSet {
        public final java.lang.String[] changedFields;
        public final boolean deleted;

        public OsObjectChangeSet(java.lang.String[] r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.changedFields = r1
                r0.deleted = r2
                return
        }

        @Override // io.realm.ObjectChangeSet
        public java.lang.String[] getChangedFields() {
                r1 = this;
                java.lang.String[] r0 = r1.changedFields
                return r0
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isDeleted() {
                r1 = this;
                boolean r0 = r1.deleted
                return r0
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isFieldChanged(java.lang.String r6) {
                r5 = this;
                java.lang.String[] r0 = r5.changedFields
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L11
                r6 = 1
                return r6
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsObject.nativeFinalizerPtr = r0
            return
    }

    public OsObject(io.realm.internal.OsSharedRealm r5, io.realm.internal.UncheckedRow r6) {
            r4 = this;
            r4.<init>()
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r4.observerPairs = r0
            long r0 = r5.getNativePtr()
            long r2 = r6.getNativePtr()
            long r0 = nativeCreate(r0, r2)
            r4.nativePtr = r0
            io.realm.internal.NativeContext r5 = r5.context
            r5.addReference(r4)
            return
    }

    public static io.realm.internal.UncheckedRow create(io.realm.internal.Table r4) {
            io.realm.internal.OsSharedRealm r0 = r4.getSharedRealm()
            io.realm.internal.UncheckedRow r1 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r0 = r0.context
            long r2 = r4.getNativePtr()
            long r2 = nativeCreateNewObject(r2)
            r1.<init>(r0, r4, r2)
            return r1
    }

    public static long createEmbeddedObject(io.realm.internal.Table r6, long r7, long r9) {
            long r0 = r6.getNativePtr()
            r2 = r7
            r4 = r9
            long r6 = nativeCreateEmbeddedObject(r0, r2, r4)
            return r6
    }

    public static long createRow(io.realm.internal.Table r2) {
            long r0 = r2.getNativePtr()
            long r0 = nativeCreateRow(r0)
            return r0
    }

    public static long createRowWithPrimaryKey(io.realm.internal.Table r14, long r15, @javax.annotation.Nullable java.lang.Object r17) {
            r0 = r17
            io.realm.RealmFieldType r1 = r14.getColumnType(r15)
            io.realm.internal.OsSharedRealm r2 = r14.getSharedRealm()
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING
            if (r1 != r3) goto L3d
            if (r0 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L15
            goto L2c
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Primary key value is not a String: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L2c:
            long r2 = r2.getNativePtr()
            long r4 = r14.getNativePtr()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r6 = r15
            long r0 = nativeCreateRowWithStringPrimaryKey(r2, r4, r6, r8)
            return r0
        L3d:
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER
            if (r1 != r3) goto L64
            if (r0 != 0) goto L46
            r3 = 0
            goto L4e
        L46:
            java.lang.String r1 = r17.toString()
            long r3 = java.lang.Long.parseLong(r1)
        L4e:
            r11 = r3
            long r5 = r2.getNativePtr()
            long r7 = r14.getNativePtr()
            if (r0 != 0) goto L5c
            r0 = 1
            r13 = 1
            goto L5e
        L5c:
            r0 = 0
            r13 = 0
        L5e:
            r9 = r15
            long r0 = nativeCreateRowWithLongPrimaryKey(r5, r7, r9, r11, r13)
            return r0
        L64:
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.OBJECT_ID
            r4 = 0
            if (r1 != r3) goto L9d
            if (r0 == 0) goto L87
            boolean r1 = r0 instanceof org.bson.types.ObjectId
            if (r1 == 0) goto L70
            goto L87
        L70:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Primary key value is not an ObjectId: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L87:
            if (r0 != 0) goto L8a
            goto L8e
        L8a:
            java.lang.String r4 = r17.toString()
        L8e:
            r11 = r4
            long r5 = r2.getNativePtr()
            long r7 = r14.getNativePtr()
            r9 = r15
            long r0 = nativeCreateRowWithObjectIdPrimaryKey(r5, r7, r9, r11)
            return r0
        L9d:
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.UUID
            if (r1 != r3) goto Ld5
            if (r0 == 0) goto Lbf
            boolean r1 = r0 instanceof java.util.UUID
            if (r1 == 0) goto La8
            goto Lbf
        La8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Primary key value is not an UUID: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lbf:
            if (r0 != 0) goto Lc2
            goto Lc6
        Lc2:
            java.lang.String r4 = r17.toString()
        Lc6:
            r11 = r4
            long r5 = r2.getNativePtr()
            long r7 = r14.getNativePtr()
            r9 = r15
            long r0 = nativeCreateRowWithUUIDPrimaryKey(r5, r7, r9, r11)
            return r0
        Ld5:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot check for duplicate rows for unsupported primary key type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public static io.realm.internal.UncheckedRow createWithPrimaryKey(io.realm.internal.Table r11, @javax.annotation.Nullable java.lang.Object r12) {
            long r4 = getAndVerifyPrimaryKeyColumnIndex(r11)
            io.realm.RealmFieldType r0 = r11.getColumnType(r4)
            io.realm.internal.OsSharedRealm r1 = r11.getSharedRealm()
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.STRING
            if (r0 != r2) goto L45
            if (r12 == 0) goto L2e
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L17
            goto L2e
        L17:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Primary key value is not a String: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L2e:
            io.realm.internal.UncheckedRow r7 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r8 = r1.context
            long r0 = r1.getNativePtr()
            long r2 = r11.getNativePtr()
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            long r0 = nativeCreateNewObjectWithStringPrimaryKey(r0, r2, r4, r6)
            r7.<init>(r8, r11, r0)
            return r7
        L45:
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.INTEGER
            if (r0 != r2) goto L72
            if (r12 != 0) goto L4e
            r2 = 0
            goto L56
        L4e:
            java.lang.String r0 = r12.toString()
            long r2 = java.lang.Long.parseLong(r0)
        L56:
            r6 = r2
            io.realm.internal.UncheckedRow r9 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r10 = r1.context
            long r0 = r1.getNativePtr()
            long r2 = r11.getNativePtr()
            if (r12 != 0) goto L68
            r12 = 1
            r8 = 1
            goto L6a
        L68:
            r12 = 0
            r8 = 0
        L6a:
            long r0 = nativeCreateNewObjectWithLongPrimaryKey(r0, r2, r4, r6, r8)
            r9.<init>(r10, r11, r0)
            return r9
        L72:
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.OBJECT_ID
            r3 = 0
            if (r0 != r2) goto L94
            if (r12 != 0) goto L7b
            r6 = r3
            goto L80
        L7b:
            java.lang.String r12 = r12.toString()
            r6 = r12
        L80:
            io.realm.internal.UncheckedRow r12 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r7 = r1.context
            long r0 = r1.getNativePtr()
            long r2 = r11.getNativePtr()
            long r0 = nativeCreateNewObjectWithObjectIdPrimaryKey(r0, r2, r4, r6)
            r12.<init>(r7, r11, r0)
            return r12
        L94:
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.UUID
            if (r0 != r2) goto Lb5
            if (r12 != 0) goto L9c
            r6 = r3
            goto La1
        L9c:
            java.lang.String r12 = r12.toString()
            r6 = r12
        La1:
            io.realm.internal.UncheckedRow r12 = new io.realm.internal.UncheckedRow
            io.realm.internal.NativeContext r7 = r1.context
            long r0 = r1.getNativePtr()
            long r2 = r11.getNativePtr()
            long r0 = nativeCreateNewObjectWithUUIDPrimaryKey(r0, r2, r4, r6)
            r12.<init>(r7, r11, r0)
            return r12
        Lb5:
            io.realm.exceptions.RealmException r11 = new io.realm.exceptions.RealmException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Cannot check for duplicate rows for unsupported primary key type: "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(io.realm.internal.Table r2) {
            io.realm.internal.OsSharedRealm r0 = r2.getSharedRealm()
            java.lang.String r1 = r2.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            if (r0 == 0) goto L13
            long r0 = r2.getColumnKey(r0)
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " has no primary key defined."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    private static native long nativeCreate(long r0, long r2);

    private static native long nativeCreateEmbeddedObject(long r0, long r2, long r4);

    private static native long nativeCreateNewObject(long r0);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long r0, long r2, long r4, long r6, boolean r8);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeCreateRow(long r0);

    private static native long nativeCreateRowWithLongPrimaryKey(long r0, long r2, long r4, long r6, boolean r8);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeCreateRowWithStringPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long r0, long r2, long r4, @javax.annotation.Nullable java.lang.String r6);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long r1);

    private native void nativeStopListening(long r1);

    private void notifyChangeListeners(java.lang.String[] r3) {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            io.realm.internal.OsObject$Callback r1 = new io.realm.internal.OsObject$Callback
            r1.<init>(r3)
            r0.foreach(r1)
            return
    }

    public <T extends io.realm.RealmModel> void addListener(T r3, io.realm.RealmObjectChangeListener<T> r4) {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            long r0 = r2.nativePtr
            r2.nativeStartListening(r0)
        Ld:
            io.realm.internal.OsObject$ObjectObserverPair r0 = new io.realm.internal.OsObject$ObjectObserverPair
            r0.<init>(r3, r4)
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r3 = r2.observerPairs
            r3.add(r0)
            return
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsObject.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public <T extends io.realm.RealmModel> void removeListener(T r3) {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            r0.removeByObserver(r3)
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r3 = r2.observerPairs
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12
            long r0 = r2.nativePtr
            r2.nativeStopListening(r0)
        L12:
            return
    }

    public <T extends io.realm.RealmModel> void removeListener(T r2, io.realm.RealmObjectChangeListener<T> r3) {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r1.observerPairs
            r0.remove(r2, r3)
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r2 = r1.observerPairs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L12
            long r2 = r1.nativePtr
            r1.nativeStopListening(r2)
        L12:
            return
    }

    public void setObserverPairs(io.realm.internal.ObserverPairList<io.realm.internal.OsObject.ObjectObserverPair> r3) {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            r2.observerPairs = r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L15
            long r0 = r2.nativePtr
            r2.nativeStartListening(r0)
        L15:
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "'observerPairs' is not empty. Listeners have been added before."
            r3.<init>(r0)
            throw r3
    }
}
