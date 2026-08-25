package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OsSet implements io.realm.internal.NativeObject, io.realm.internal.OsCollection {
    public static final int NOT_FOUND = -1;
    private static final int VALUE_FOUND = 1;
    private static final int VALUE_NOT_FOUND = 0;
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.internal.NativeContext context;
    private final long nativePtr;
    private final io.realm.internal.OsSharedRealm osSharedRealm;
    private final io.realm.internal.Table targetTable;

    /* JADX INFO: renamed from: io.realm.internal.OsSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = null;

        static {
                io.realm.internal.OsSet$ExternalCollectionOperation[] r0 = io.realm.internal.OsSet.ExternalCollectionOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.internal.OsSet.AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = r0
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.internal.OsSet.AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.internal.OsSet.AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.internal.OsSet.AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static final enum ExternalCollectionOperation extends java.lang.Enum<io.realm.internal.OsSet.ExternalCollectionOperation> {
        private static final /* synthetic */ io.realm.internal.OsSet.ExternalCollectionOperation[] $VALUES = null;
        public static final io.realm.internal.OsSet.ExternalCollectionOperation ADD_ALL = null;
        public static final io.realm.internal.OsSet.ExternalCollectionOperation CONTAINS_ALL = null;
        public static final io.realm.internal.OsSet.ExternalCollectionOperation REMOVE_ALL = null;
        public static final io.realm.internal.OsSet.ExternalCollectionOperation RETAIN_ALL = null;

        static {
                io.realm.internal.OsSet$ExternalCollectionOperation r0 = new io.realm.internal.OsSet$ExternalCollectionOperation
                java.lang.String r1 = "CONTAINS_ALL"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL = r0
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = new io.realm.internal.OsSet$ExternalCollectionOperation
                java.lang.String r3 = "ADD_ALL"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL = r1
                io.realm.internal.OsSet$ExternalCollectionOperation r3 = new io.realm.internal.OsSet$ExternalCollectionOperation
                java.lang.String r5 = "REMOVE_ALL"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL = r3
                io.realm.internal.OsSet$ExternalCollectionOperation r5 = new io.realm.internal.OsSet$ExternalCollectionOperation
                java.lang.String r7 = "RETAIN_ALL"
                r8 = 3
                r5.<init>(r7, r8)
                io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL = r5
                r7 = 4
                io.realm.internal.OsSet$ExternalCollectionOperation[] r7 = new io.realm.internal.OsSet.ExternalCollectionOperation[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.realm.internal.OsSet.ExternalCollectionOperation.$VALUES = r7
                return
        }

        private ExternalCollectionOperation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.internal.OsSet.ExternalCollectionOperation valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsSet$ExternalCollectionOperation> r0 = io.realm.internal.OsSet.ExternalCollectionOperation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = (io.realm.internal.OsSet.ExternalCollectionOperation) r1
                return r1
        }

        public static io.realm.internal.OsSet.ExternalCollectionOperation[] values() {
                io.realm.internal.OsSet$ExternalCollectionOperation[] r0 = io.realm.internal.OsSet.ExternalCollectionOperation.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsSet$ExternalCollectionOperation[] r0 = (io.realm.internal.OsSet.ExternalCollectionOperation[]) r0
                return r0
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsSet.nativeFinalizerPtr = r0
            return
    }

    private OsSet(io.realm.internal.OsSharedRealm r1, long r2, @javax.annotation.Nullable io.realm.internal.Table r4) {
            r0 = this;
            r0.<init>()
            r0.osSharedRealm = r1
            r0.nativePtr = r2
            io.realm.internal.NativeContext r1 = r1.context
            r0.context = r1
            r0.targetTable = r4
            r1.addReference(r0)
            return
    }

    public OsSet(io.realm.internal.UncheckedRow r8, long r9) {
            r7 = this;
            r7.<init>()
            io.realm.internal.Table r0 = r8.getTable()
            io.realm.internal.OsSharedRealm r0 = r0.getSharedRealm()
            r7.osSharedRealm = r0
            long r1 = r0.getNativePtr()
            long r3 = r8.getNativePtr()
            r5 = r9
            long[] r8 = nativeCreate(r1, r3, r5)
            r9 = 0
            r9 = r8[r9]
            r7.nativePtr = r9
            io.realm.internal.NativeContext r9 = r0.context
            r7.context = r9
            r9.addReference(r7)
            r9 = 1
            r1 = r8[r9]
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 == 0) goto L39
            io.realm.internal.Table r10 = new io.realm.internal.Table
            r1 = r8[r9]
            r10.<init>(r0, r1)
            r7.targetTable = r10
            goto L3c
        L39:
            r8 = 0
            r7.targetTable = r8
        L3c:
            return
    }

    private static native boolean nativeAddAllRealmAnyCollection(long r0, long r2);

    private static native long[] nativeAddBinary(long r0, byte[] r2);

    private static native long[] nativeAddBoolean(long r0, boolean r2);

    private static native long[] nativeAddDate(long r0, long r2);

    private static native long[] nativeAddDecimal128(long r0, long r2, long r4);

    private static native long[] nativeAddDouble(long r0, double r2);

    private static native long[] nativeAddFloat(long r0, float r2);

    private static native long[] nativeAddLong(long r0, long r2);

    private static native long[] nativeAddNull(long r0);

    private static native long[] nativeAddObjectId(long r0, java.lang.String r2);

    private static native long[] nativeAddRealmAny(long r0, long r2);

    private static native long[] nativeAddRow(long r0, long r2);

    private static native long[] nativeAddString(long r0, java.lang.String r2);

    private static native long[] nativeAddUUID(long r0, java.lang.String r2);

    private static native boolean nativeAsymmetricDifference(long r0, long r2);

    private static native void nativeClear(long r0);

    private static native boolean nativeContainsAll(long r0, long r2);

    private static native boolean nativeContainsAllRealmAnyCollection(long r0, long r2);

    private static native boolean nativeContainsBinary(long r0, byte[] r2);

    private static native boolean nativeContainsBoolean(long r0, boolean r2);

    private static native boolean nativeContainsDate(long r0, long r2);

    private static native boolean nativeContainsDecimal128(long r0, long r2, long r4);

    private static native boolean nativeContainsDouble(long r0, double r2);

    private static native boolean nativeContainsFloat(long r0, float r2);

    private static native boolean nativeContainsLong(long r0, long r2);

    private static native boolean nativeContainsNull(long r0);

    private static native boolean nativeContainsObjectId(long r0, java.lang.String r2);

    private static native boolean nativeContainsRealmAny(long r0, long r2);

    private static native boolean nativeContainsRow(long r0, long r2);

    private static native boolean nativeContainsString(long r0, java.lang.String r2);

    private static native boolean nativeContainsUUID(long r0, java.lang.String r2);

    private static native long[] nativeCreate(long r0, long r2, long r4);

    private static native void nativeDeleteAll(long r0);

    private static native long nativeFreeze(long r0, long r2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long r0);

    private static native long nativeGetRealmAny(long r0, int r2);

    private static native long nativeGetRow(long r0, int r2);

    private static native java.lang.Object nativeGetValueAtIndex(long r0, int r2);

    private static native boolean nativeIntersect(long r0, long r2);

    private static native boolean nativeIsValid(long r0);

    private static native boolean nativeRemoveAllRealmAnyCollection(long r0, long r2);

    private static native long[] nativeRemoveBinary(long r0, byte[] r2);

    private static native long[] nativeRemoveBoolean(long r0, boolean r2);

    private static native long[] nativeRemoveDate(long r0, long r2);

    private static native long[] nativeRemoveDecimal128(long r0, long r2, long r4);

    private static native long[] nativeRemoveDouble(long r0, double r2);

    private static native long[] nativeRemoveFloat(long r0, float r2);

    private static native long[] nativeRemoveLong(long r0, long r2);

    private static native long[] nativeRemoveNull(long r0);

    private static native long[] nativeRemoveObjectId(long r0, java.lang.String r2);

    private static native long[] nativeRemoveRealmAny(long r0, long r2);

    private static native long[] nativeRemoveRow(long r0, long r2);

    private static native long[] nativeRemoveString(long r0, java.lang.String r2);

    private static native long[] nativeRemoveUUID(long r0, java.lang.String r2);

    private static native boolean nativeRetainAllRealmAnyCollection(long r0, long r2);

    private static native long nativeSize(long r0);

    private static native void nativeStartListening(long r0, io.realm.internal.ObservableSet r2);

    private static native void nativeStopListening(long r0);

    private static native boolean nativeUnion(long r0, long r2);

    private boolean retainAllInternal(io.realm.internal.core.NativeRealmAnyCollection r6) {
            r5 = this;
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            int r0 = r6.getSize()
            if (r0 != 0) goto L17
            r5.clear()
            r6 = 1
            return r6
        L17:
            long r0 = r5.nativePtr
            long r2 = r6.getNativePtr()
            boolean r6 = nativeRetainAllRealmAnyCollection(r0, r2)
            return r6
    }

    public boolean add(@javax.annotation.Nullable java.lang.Boolean r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            boolean r6 = r6.booleanValue()
            long[] r6 = nativeAddBoolean(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Byte r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeAddLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Double r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            double r2 = r6.doubleValue()
            long[] r6 = nativeAddDouble(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Float r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            float r6 = r6.floatValue()
            long[] r6 = nativeAddFloat(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Integer r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeAddLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Long r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeAddLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.Short r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeAddLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto Lf
        L9:
            long r0 = r5.nativePtr
            long[] r6 = nativeAddString(r0, r6)
        Lf:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.util.Date r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.getTime()
            long[] r6 = nativeAddDate(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable java.util.UUID r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            java.lang.String r6 = r6.toString()
            long[] r6 = nativeAddUUID(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable org.bson.types.Decimal128 r7) {
            r6 = this;
            if (r7 != 0) goto L9
            long r0 = r6.nativePtr
            long[] r7 = nativeAddNull(r0)
            goto L17
        L9:
            long r0 = r6.nativePtr
            long r2 = r7.getLow()
            long r4 = r7.getHigh()
            long[] r7 = nativeAddDecimal128(r0, r2, r4)
        L17:
            r0 = 1
            r1 = r7[r0]
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public boolean add(@javax.annotation.Nullable org.bson.types.ObjectId r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            java.lang.String r6 = r6.toString()
            long[] r6 = nativeAddObjectId(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean add(@javax.annotation.Nullable byte[] r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeAddNull(r0)
            goto Lf
        L9:
            long r0 = r5.nativePtr
            long[] r6 = nativeAddBinary(r0, r6)
        Lf:
            r0 = 1
            r1 = r6[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public boolean addRealmAny(long r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long[] r5 = nativeAddRealmAny(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L10
            goto L11
        L10:
            r6 = 0
        L11:
            return r6
    }

    public boolean addRow(long r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long[] r5 = nativeAddRow(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L10
            goto L11
        L10:
            r6 = 0
        L11:
            return r6
    }

    public boolean asymmetricDifference(io.realm.internal.OsSet r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            boolean r5 = nativeAsymmetricDifference(r0, r2)
            return r5
    }

    public void clear() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeClear(r0)
            return
    }

    public boolean collectionFunnel(io.realm.internal.core.NativeRealmAnyCollection r3, io.realm.internal.OsSet.ExternalCollectionOperation r4) {
            r2 = this;
            int[] r0 = io.realm.internal.OsSet.AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L46
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L19
            boolean r3 = r2.retainAllInternal(r3)
            return r3
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected value: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L30:
            long r0 = r2.nativePtr
            long r3 = r3.getNativePtr()
            boolean r3 = nativeRemoveAllRealmAnyCollection(r0, r3)
            return r3
        L3b:
            long r0 = r2.nativePtr
            long r3 = r3.getNativePtr()
            boolean r3 = nativeAddAllRealmAnyCollection(r0, r3)
            return r3
        L46:
            long r0 = r2.nativePtr
            long r3 = r3.getNativePtr()
            boolean r3 = nativeContainsAllRealmAnyCollection(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable java.lang.Boolean r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            boolean r3 = r3.booleanValue()
            boolean r3 = nativeContainsBoolean(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable java.lang.Double r5) {
            r4 = this;
            if (r5 != 0) goto L9
            long r0 = r4.nativePtr
            boolean r5 = nativeContainsNull(r0)
            return r5
        L9:
            long r0 = r4.nativePtr
            double r2 = r5.doubleValue()
            boolean r5 = nativeContainsDouble(r0, r2)
            return r5
    }

    public boolean contains(@javax.annotation.Nullable java.lang.Float r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            float r3 = r3.floatValue()
            boolean r3 = nativeContainsFloat(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable java.lang.Long r5) {
            r4 = this;
            if (r5 != 0) goto L9
            long r0 = r4.nativePtr
            boolean r5 = nativeContainsNull(r0)
            return r5
        L9:
            long r0 = r4.nativePtr
            long r2 = r5.longValue()
            boolean r5 = nativeContainsLong(r0, r2)
            return r5
    }

    public boolean contains(@javax.annotation.Nullable java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsString(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable java.util.Date r5) {
            r4 = this;
            if (r5 != 0) goto L9
            long r0 = r4.nativePtr
            boolean r5 = nativeContainsNull(r0)
            return r5
        L9:
            long r0 = r4.nativePtr
            long r2 = r5.getTime()
            boolean r5 = nativeContainsDate(r0, r2)
            return r5
    }

    public boolean contains(@javax.annotation.Nullable java.util.UUID r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            java.lang.String r3 = r3.toString()
            boolean r3 = nativeContainsUUID(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable org.bson.types.Decimal128 r7) {
            r6 = this;
            if (r7 != 0) goto L9
            long r0 = r6.nativePtr
            boolean r7 = nativeContainsNull(r0)
            return r7
        L9:
            long r0 = r6.nativePtr
            long r2 = r7.getLow()
            long r4 = r7.getHigh()
            boolean r7 = nativeContainsDecimal128(r0, r2, r4)
            return r7
    }

    public boolean contains(@javax.annotation.Nullable org.bson.types.ObjectId r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            java.lang.String r3 = r3.toString()
            boolean r3 = nativeContainsObjectId(r0, r3)
            return r3
    }

    public boolean contains(@javax.annotation.Nullable byte[] r3) {
            r2 = this;
            if (r3 != 0) goto L9
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsNull(r0)
            return r3
        L9:
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsBinary(r0, r3)
            return r3
    }

    public boolean containsAll(io.realm.internal.OsSet r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            boolean r5 = nativeContainsAll(r0, r2)
            return r5
    }

    public boolean containsRealmAny(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsRealmAny(r0, r3)
            return r3
    }

    public boolean containsRow(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsRow(r0, r3)
            return r3
    }

    public void deleteAll() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeDeleteAll(r0)
            return
    }

    public io.realm.internal.OsSet freeze(io.realm.internal.OsSharedRealm r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            long r0 = nativeFreeze(r0, r2)
            io.realm.internal.OsSet r2 = new io.realm.internal.OsSet
            io.realm.internal.Table r3 = r4.targetTable
            r2.<init>(r5, r0, r3)
            return r2
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsSet.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.internal.TableQuery getQuery() {
            r5 = this;
            io.realm.internal.TableQuery r0 = new io.realm.internal.TableQuery
            io.realm.internal.NativeContext r1 = r5.context
            io.realm.internal.Table r2 = r5.targetTable
            long r3 = r5.nativePtr
            long r3 = nativeGetQuery(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public long getRealmAny(int r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeGetRealmAny(r0, r3)
            return r0
    }

    public long getRow(int r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeGetRow(r0, r3)
            return r0
    }

    public io.realm.internal.Table getTargetTable() {
            r1 = this;
            io.realm.internal.Table r0 = r1.targetTable
            return r0
    }

    public java.lang.Object getValueAtIndex(int r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.Object r3 = nativeGetValueAtIndex(r0, r3)
            return r3
    }

    public boolean intersect(io.realm.internal.OsSet r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            boolean r5 = nativeIntersect(r0, r2)
            return r5
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsValid(r0)
            return r0
    }

    public <T> void notifyChangeListeners(long r3, io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet.SetObserverPair<T>> r5) {
            r2 = this;
            io.realm.internal.OsCollectionChangeSet r0 = new io.realm.internal.OsCollectionChangeSet
            r1 = 0
            r0.<init>(r3, r1)
            io.realm.SetChangeSet r3 = new io.realm.SetChangeSet
            r3.<init>(r0)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L12
            return
        L12:
            io.realm.internal.ObservableSet$Callback r4 = new io.realm.internal.ObservableSet$Callback
            r4.<init>(r3)
            r5.foreach(r4)
            return
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Boolean r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            boolean r6 = r6.booleanValue()
            long[] r6 = nativeRemoveBoolean(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Byte r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeRemoveLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Double r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            double r2 = r6.doubleValue()
            long[] r6 = nativeRemoveDouble(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Float r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            float r6 = r6.floatValue()
            long[] r6 = nativeRemoveFloat(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Integer r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeRemoveLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Long r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeRemoveLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.Short r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.longValue()
            long[] r6 = nativeRemoveLong(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto Lf
        L9:
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveString(r0, r6)
        Lf:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.util.Date r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            long r2 = r6.getTime()
            long[] r6 = nativeRemoveDate(r0, r2)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable java.util.UUID r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            java.lang.String r6 = r6.toString()
            long[] r6 = nativeRemoveUUID(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable org.bson.types.Decimal128 r7) {
            r6 = this;
            if (r7 != 0) goto L9
            long r0 = r6.nativePtr
            long[] r7 = nativeRemoveNull(r0)
            goto L17
        L9:
            long r0 = r6.nativePtr
            long r2 = r7.getLow()
            long r4 = r7.getHigh()
            long[] r7 = nativeRemoveDecimal128(r0, r2, r4)
        L17:
            r0 = 1
            r1 = r7[r0]
            r3 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable org.bson.types.ObjectId r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto L13
        L9:
            long r0 = r5.nativePtr
            java.lang.String r6 = r6.toString()
            long[] r6 = nativeRemoveObjectId(r0, r6)
        L13:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public boolean remove(@javax.annotation.Nullable byte[] r6) {
            r5 = this;
            if (r6 != 0) goto L9
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveNull(r0)
            goto Lf
        L9:
            long r0 = r5.nativePtr
            long[] r6 = nativeRemoveBinary(r0, r6)
        Lf:
            r0 = 1
            r1 = r6[r0]
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public boolean removeRealmAny(long r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long[] r5 = nativeRemoveRealmAny(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L10
            goto L11
        L10:
            r6 = 0
        L11:
            return r6
    }

    public boolean removeRow(long r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long[] r5 = nativeRemoveRow(r0, r5)
            r6 = 1
            r0 = r5[r6]
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L10
            goto L11
        L10:
            r6 = 0
        L11:
            return r6
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            return r0
    }

    public void startListening(io.realm.internal.ObservableSet r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeStartListening(r0, r3)
            return
    }

    public void stopListening() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeStopListening(r0)
            return
    }

    public boolean union(io.realm.internal.OsSet r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            boolean r5 = nativeUnion(r0, r2)
            return r5
    }
}
