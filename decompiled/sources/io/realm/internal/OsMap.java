package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class OsMap implements io.realm.internal.NativeObject {
    public static final int NOT_FOUND = -1;
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.internal.NativeContext context;
    private final long nativePtr;
    private final io.realm.internal.Table targetTable;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsMap.nativeFinalizerPtr = r0
            return
    }

    private OsMap(io.realm.internal.OsSharedRealm r1, long r2, io.realm.internal.Table r4) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r2
            r0.targetTable = r4
            io.realm.internal.NativeContext r1 = r1.context
            r0.context = r1
            r1.addReference(r0)
            return
    }

    public OsMap(io.realm.internal.UncheckedRow r8, long r9) {
            r7 = this;
            r7.<init>()
            io.realm.internal.Table r0 = r8.getTable()
            io.realm.internal.OsSharedRealm r0 = r0.getSharedRealm()
            long r1 = r0.getNativePtr()
            long r3 = r8.getNativePtr()
            r5 = r9
            long[] r8 = nativeCreate(r1, r3, r5)
            r9 = 0
            r9 = r8[r9]
            r7.nativePtr = r9
            r9 = 1
            r1 = r8[r9]
            r3 = -1
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 == 0) goto L30
            io.realm.internal.Table r10 = new io.realm.internal.Table
            r1 = r8[r9]
            r10.<init>(r0, r1)
            r7.targetTable = r10
            goto L33
        L30:
            r8 = 0
            r7.targetTable = r8
        L33:
            io.realm.internal.NativeContext r8 = r0.context
            r7.context = r8
            r8.addReference(r7)
            return
    }

    private static native void nativeClear(long r0);

    private static native boolean nativeContainsBinary(long r0, byte[] r2);

    private static native boolean nativeContainsBoolean(long r0, boolean r2);

    private static native boolean nativeContainsDate(long r0, long r2);

    private static native boolean nativeContainsDecimal128(long r0, long r2, long r4);

    private static native boolean nativeContainsFloat(long r0, float r2);

    private static native boolean nativeContainsKey(long r0, java.lang.String r2);

    private static native boolean nativeContainsLong(long r0, long r2);

    private static native boolean nativeContainsNull(long r0);

    private static native boolean nativeContainsObjectId(long r0, java.lang.String r2);

    private static native boolean nativeContainsRealmAny(long r0, long r2);

    private static native boolean nativeContainsRealmModel(long r0, long r2, long r4);

    private static native boolean nativeContainsString(long r0, java.lang.String r2);

    private static native boolean nativeContainsUUID(long r0, java.lang.String r2);

    private static native long[] nativeCreate(long r0, long r2, long r4);

    private static native long nativeCreateAndPutEmbeddedObject(long r0, java.lang.String r2);

    private static native long nativeFreeze(long r0, long r2);

    private static native java.lang.Object[] nativeGetEntryForModel(long r0, int r2);

    private static native java.lang.Object[] nativeGetEntryForPrimitive(long r0, int r2);

    private static native java.lang.Object[] nativeGetEntryForRealmAny(long r0, int r2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long r0, java.lang.String r2);

    private static native long nativeGetRow(long r0, java.lang.String r2);

    private static native java.lang.Object nativeGetValue(long r0, java.lang.String r2);

    private static native boolean nativeIsValid(long r0);

    private static native long nativeKeys(long r0);

    private static native void nativePutBinary(long r0, java.lang.String r2, byte[] r3);

    private static native void nativePutBoolean(long r0, java.lang.String r2, boolean r3);

    private static native void nativePutDate(long r0, java.lang.String r2, long r3);

    private static native void nativePutDecimal128(long r0, java.lang.String r2, long r3, long r5);

    private static native void nativePutDouble(long r0, java.lang.String r2, double r3);

    private static native void nativePutFloat(long r0, java.lang.String r2, float r3);

    private static native void nativePutLong(long r0, java.lang.String r2, long r3);

    private static native void nativePutNull(long r0, java.lang.String r2);

    private static native void nativePutObjectId(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativePutRealmAny(long r0, java.lang.String r2, long r3);

    private static native void nativePutRow(long r0, java.lang.String r2, long r3);

    private static native void nativePutString(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativePutUUID(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeRemove(long r0, java.lang.String r2);

    private static native long nativeSize(long r0);

    private static native void nativeStartListening(long r0, io.realm.internal.ObservableMap r2);

    private static native void nativeStopListening(long r0);

    private static native long nativeValues(long r0);

    public void clear() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeClear(r0)
            return
    }

    public boolean containsKey(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = nativeContainsKey(r0, r3)
            return r3
    }

    public boolean containsPrimitiveValue(@javax.annotation.Nullable java.lang.Object r7) {
            r6 = this;
            if (r7 != 0) goto L9
            long r0 = r6.nativePtr
            boolean r7 = nativeContainsNull(r0)
            return r7
        L9:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L1a
            long r0 = r6.nativePtr
            java.lang.Integer r7 = (java.lang.Integer) r7
            long r2 = r7.longValue()
            boolean r7 = nativeContainsLong(r0, r2)
            return r7
        L1a:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L2b
            long r0 = r6.nativePtr
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = r7.longValue()
            boolean r7 = nativeContainsLong(r0, r2)
            return r7
        L2b:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L3c
            long r0 = r6.nativePtr
            java.lang.Double r7 = (java.lang.Double) r7
            long r2 = r7.longValue()
            boolean r7 = nativeContainsLong(r0, r2)
            return r7
        L3c:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L4d
            long r0 = r6.nativePtr
            java.lang.Short r7 = (java.lang.Short) r7
            long r2 = r7.longValue()
            boolean r7 = nativeContainsLong(r0, r2)
            return r7
        L4d:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L5e
            long r0 = r6.nativePtr
            java.lang.Byte r7 = (java.lang.Byte) r7
            long r2 = r7.longValue()
            boolean r7 = nativeContainsLong(r0, r2)
            return r7
        L5e:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L6f
            long r0 = r6.nativePtr
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r7 = nativeContainsBoolean(r0, r7)
            return r7
        L6f:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L7c
            long r0 = r6.nativePtr
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = nativeContainsString(r0, r7)
            return r7
        L7c:
            boolean r0 = r7 instanceof java.lang.Byte[]
            if (r0 == 0) goto L8d
            long r0 = r6.nativePtr
            java.lang.Byte[] r7 = (java.lang.Byte[]) r7
            byte[] r7 = io.realm.internal.android.TypeUtils.convertNonPrimitiveBinaryToPrimitive(r7)
            boolean r7 = nativeContainsBinary(r0, r7)
            return r7
        L8d:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L9a
            long r0 = r6.nativePtr
            byte[] r7 = (byte[]) r7
            boolean r7 = nativeContainsBinary(r0, r7)
            return r7
        L9a:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto Lab
            long r0 = r6.nativePtr
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = nativeContainsFloat(r0, r7)
            return r7
        Lab:
            boolean r0 = r7 instanceof java.util.UUID
            if (r0 == 0) goto Lba
            long r0 = r6.nativePtr
            java.lang.String r7 = r7.toString()
            boolean r7 = nativeContainsUUID(r0, r7)
            return r7
        Lba:
            boolean r0 = r7 instanceof org.bson.types.ObjectId
            if (r0 == 0) goto Lcb
            long r0 = r6.nativePtr
            org.bson.types.ObjectId r7 = (org.bson.types.ObjectId) r7
            java.lang.String r7 = r7.toString()
            boolean r7 = nativeContainsObjectId(r0, r7)
            return r7
        Lcb:
            boolean r0 = r7 instanceof java.util.Date
            if (r0 == 0) goto Ldc
            long r0 = r6.nativePtr
            java.util.Date r7 = (java.util.Date) r7
            long r2 = r7.getTime()
            boolean r7 = nativeContainsDate(r0, r2)
            return r7
        Ldc:
            boolean r0 = r7 instanceof org.bson.types.Decimal128
            if (r0 == 0) goto Lf1
            org.bson.types.Decimal128 r7 = (org.bson.types.Decimal128) r7
            long r0 = r6.nativePtr
            long r2 = r7.getHigh()
            long r4 = r7.getLow()
            boolean r7 = nativeContainsDecimal128(r0, r2, r4)
            return r7
        Lf1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid object type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getCanonicalName()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public boolean containsRealmAnyValue(long r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = nativeContainsRealmAny(r0, r3)
            return r3
    }

    public boolean containsRealmModel(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativePtr
            r2 = r7
            r4 = r9
            boolean r7 = nativeContainsRealmModel(r0, r2, r4)
            return r7
    }

    public long createAndPutEmbeddedObject(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            long r0 = nativeCreateAndPutEmbeddedObject(r0, r3)
            return r0
    }

    public io.realm.internal.OsMap freeze(io.realm.internal.OsSharedRealm r6) {
            r5 = this;
            io.realm.internal.OsMap r0 = new io.realm.internal.OsMap
            long r1 = r5.nativePtr
            long r3 = r6.getNativePtr()
            long r1 = nativeFreeze(r1, r3)
            io.realm.internal.Table r3 = r5.targetTable
            r0.<init>(r6, r1, r3)
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = nativeGetValue(r0, r3)
            return r3
    }

    public <K> io.realm.internal.util.Pair<K, java.lang.Object> getEntryForPrimitive(int r4) {
            r3 = this;
            long r0 = r3.nativePtr
            java.lang.Object[] r4 = nativeGetEntryForPrimitive(r0, r4)
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = (java.lang.String) r0
            io.realm.internal.util.Pair r1 = new io.realm.internal.util.Pair
            r2 = 1
            r4 = r4[r2]
            r1.<init>(r0, r4)
            return r1
    }

    public <K> io.realm.internal.util.Pair<K, java.lang.Long> getKeyObjRowPair(int r6) {
            r5 = this;
            long r0 = r5.nativePtr
            java.lang.Object[] r6 = nativeGetEntryForModel(r0, r6)
            r0 = 0
            r0 = r6[r0]
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            r6 = r6[r1]
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L24
            io.realm.internal.util.Pair r6 = new io.realm.internal.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.<init>(r0, r1)
            return r6
        L24:
            io.realm.internal.util.Pair r6 = new io.realm.internal.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.<init>(r0, r1)
            return r6
    }

    public <K> io.realm.internal.util.Pair<K, io.realm.internal.core.NativeRealmAny> getKeyRealmAnyPair(int r5) {
            r4 = this;
            long r0 = r4.nativePtr
            java.lang.Object[] r5 = nativeGetEntryForRealmAny(r0, r5)
            r0 = 0
            r0 = r5[r0]
            java.lang.String r0 = (java.lang.String) r0
            io.realm.internal.core.NativeRealmAny r1 = new io.realm.internal.core.NativeRealmAny
            r2 = 1
            r5 = r5[r2]
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            r1.<init>(r2)
            io.realm.internal.util.Pair r5 = new io.realm.internal.util.Pair
            r5.<init>(r0, r1)
            return r5
    }

    public long getModelRowKey(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            long r0 = nativeGetRow(r0, r3)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsMap.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public long getRealmAnyPtr(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            long r0 = nativeGetRealmAnyPtr(r0, r3)
            return r0
    }

    public io.realm.internal.Table getTargetTable() {
            r1 = this;
            io.realm.internal.Table r0 = r1.targetTable
            return r0
    }

    public boolean isValid() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsValid(r0)
            return r0
    }

    public void put(java.lang.Object r8, @javax.annotation.Nullable java.lang.Object r9) {
            r7 = this;
            if (r9 != 0) goto Lb
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            nativePutNull(r0, r8)
            goto L185
        Lb:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2e
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Long r9 = (java.lang.Long) r9
            long r2 = r9.longValue()
            nativePutLong(r0, r8, r2)
            goto L185
        L2e:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r2 = (long) r9
            nativePutLong(r0, r8, r2)
            goto L185
        L4a:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L66
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Short r9 = (java.lang.Short) r9
            short r9 = r9.shortValue()
            long r2 = (long) r9
            nativePutLong(r0, r8, r2)
            goto L185
        L66:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L82
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r9 = r9.byteValue()
            long r2 = (long) r9
            nativePutLong(r0, r8, r2)
            goto L185
        L82:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L9d
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            nativePutFloat(r0, r8, r9)
            goto L185
        L9d:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb8
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Double r9 = (java.lang.Double) r9
            double r2 = r9.doubleValue()
            nativePutDouble(r0, r8, r2)
            goto L185
        Lb8:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lcf
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            nativePutString(r0, r8, r9)
            goto L185
        Lcf:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lea
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            nativePutBoolean(r0, r8, r9)
            goto L185
        Lea:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L105
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.util.Date r9 = (java.util.Date) r9
            long r2 = r9.getTime()
            nativePutDate(r0, r8, r2)
            goto L185
        L105:
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L124
            org.bson.types.Decimal128 r9 = (org.bson.types.Decimal128) r9
            long r0 = r7.nativePtr
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            long r3 = r9.getHigh()
            long r5 = r9.getLow()
            nativePutDecimal128(r0, r2, r3, r5)
            goto L185
        L124:
            java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13e
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Byte[] r9 = (java.lang.Byte[]) r9
            byte[] r9 = io.realm.internal.android.TypeUtils.convertNonPrimitiveBinaryToPrimitive(r9)
            nativePutBinary(r0, r8, r9)
            goto L185
        L13e:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L154
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            byte[] r9 = (byte[]) r9
            nativePutBinary(r0, r8, r9)
            goto L185
        L154:
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16e
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            org.bson.types.ObjectId r9 = (org.bson.types.ObjectId) r9
            java.lang.String r9 = r9.toString()
            nativePutObjectId(r0, r8, r9)
            goto L185
        L16e:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L186
            long r0 = r7.nativePtr
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r9.toString()
            nativePutUUID(r0, r8, r9)
        L185:
            return
        L186:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "Class '"
            java.lang.String r1 = "' not supported."
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r0, r1)
            r8.<init>(r9)
            throw r8
    }

    public void putRealmAny(java.lang.Object r3, long r4) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            nativePutRealmAny(r0, r3, r4)
            return
    }

    public void putRow(java.lang.Object r3, long r4) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            nativePutRow(r0, r3, r4)
            return
    }

    public void remove(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r3 = (java.lang.String) r3
            nativeRemove(r0, r3)
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            return r0
    }

    public void startListening(io.realm.internal.ObservableMap r3) {
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

    public io.realm.internal.util.Pair<io.realm.internal.Table, java.lang.Long> tableAndKeyPtrs() {
            r4 = this;
            io.realm.internal.util.Pair r0 = new io.realm.internal.util.Pair
            io.realm.internal.Table r1 = r4.targetTable
            long r2 = r4.nativePtr
            long r2 = nativeKeys(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public io.realm.internal.util.Pair<io.realm.internal.Table, java.lang.Long> tableAndValuePtrs() {
            r4 = this;
            io.realm.internal.util.Pair r0 = new io.realm.internal.util.Pair
            io.realm.internal.Table r1 = r4.targetTable
            long r2 = r4.nativePtr
            long r2 = nativeValues(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
    }
}
