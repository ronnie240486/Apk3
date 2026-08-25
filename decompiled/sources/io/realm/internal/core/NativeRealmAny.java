package io.realm.internal.core;

/* JADX INFO: loaded from: classes.dex */
@io.realm.internal.Keep
public class NativeRealmAny implements io.realm.internal.NativeObject {
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.core.NativeRealmAny.nativeFinalizerPtr = r0
            return
    }

    public NativeRealmAny() {
            r2 = this;
            long r0 = nativeCreateNull()
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    public NativeRealmAny(io.realm.internal.RealmObjectProxy r3) {
            r2 = this;
            long r0 = createRealmAnyLink(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.lang.Boolean r3) {
            r2 = this;
            boolean r3 = r3.booleanValue()
            long r0 = nativeCreateBoolean(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.lang.Double r3) {
            r2 = this;
            double r0 = r3.doubleValue()
            long r0 = nativeCreateDouble(r0)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.lang.Float r3) {
            r2 = this;
            float r3 = r3.floatValue()
            long r0 = nativeCreateFloat(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.lang.Number r3) {
            r2 = this;
            long r0 = r3.longValue()
            long r0 = nativeCreateLong(r0)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.lang.String r3) {
            r2 = this;
            long r0 = nativeCreateString(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.util.Date r3) {
            r2 = this;
            long r0 = r3.getTime()
            long r0 = nativeCreateDate(r0)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(java.util.UUID r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            long r0 = nativeCreateUUID(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(org.bson.types.Decimal128 r5) {
            r4 = this;
            long r0 = r5.getLow()
            long r2 = r5.getHigh()
            long r0 = nativeCreateDecimal128(r0, r2)
            r4.<init>(r0)
            return
    }

    public NativeRealmAny(org.bson.types.ObjectId r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            long r0 = nativeCreateObjectId(r3)
            r2.<init>(r0)
            return
    }

    public NativeRealmAny(byte[] r3) {
            r2 = this;
            long r0 = nativeCreateBinary(r3)
            r2.<init>(r0)
            return
    }

    private static long createRealmAnyLink(io.realm.internal.RealmObjectProxy r4) {
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.internal.Table r0 = r4.getTable()
            long r0 = r0.getNativePtr()
            long r2 = r4.getObjectKey()
            long r0 = nativeCreateLink(r0, r2)
            return r0
    }

    private static native byte[] nativeAsBinary(long r0);

    private static native boolean nativeAsBoolean(long r0);

    private static native long nativeAsDate(long r0);

    private static native long[] nativeAsDecimal128(long r0);

    private static native double nativeAsDouble(long r0);

    private static native float nativeAsFloat(long r0);

    private static native long nativeAsLong(long r0);

    private static native java.lang.String nativeAsObjectId(long r0);

    private static native java.lang.String nativeAsString(long r0);

    private static native java.lang.String nativeAsUUID(long r0);

    private static native long nativeCreateBinary(byte[] r0);

    private static native long nativeCreateBoolean(boolean r0);

    private static native long nativeCreateDate(long r0);

    private static native long nativeCreateDecimal128(long r0, long r2);

    private static native long nativeCreateDouble(double r0);

    private static native long nativeCreateFloat(float r0);

    private static native long nativeCreateLink(long r0, long r2);

    private static native long nativeCreateLong(long r0);

    private static native long nativeCreateNull();

    private static native long nativeCreateObjectId(java.lang.String r0);

    private static native long nativeCreateString(java.lang.String r0);

    private static native long nativeCreateUUID(java.lang.String r0);

    private static native boolean nativeEquals(long r0, long r2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmModelRowKey(long r0);

    private static native java.lang.String nativeGetRealmModelTableName(long r0, long r2);

    private static native int nativeGetType(long r0);

    public byte[] asBinary() {
            r2 = this;
            long r0 = r2.nativePtr
            byte[] r0 = nativeAsBinary(r0)
            return r0
    }

    public boolean asBoolean() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeAsBoolean(r0)
            return r0
    }

    public java.util.Date asDate() {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r3.nativePtr
            long r1 = nativeAsDate(r1)
            r0.<init>(r1)
            return r0
    }

    public org.bson.types.Decimal128 asDecimal128() {
            r5 = this;
            long r0 = r5.nativePtr
            long[] r0 = nativeAsDecimal128(r0)
            r1 = 1
            r1 = r0[r1]
            r3 = 0
            r3 = r0[r3]
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r1, r3)
            return r0
    }

    public double asDouble() {
            r2 = this;
            long r0 = r2.nativePtr
            double r0 = nativeAsDouble(r0)
            return r0
    }

    public float asFloat() {
            r2 = this;
            long r0 = r2.nativePtr
            float r0 = nativeAsFloat(r0)
            return r0
    }

    public long asLong() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeAsLong(r0)
            return r0
    }

    public org.bson.types.ObjectId asObjectId() {
            r3 = this;
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            long r1 = r3.nativePtr
            java.lang.String r1 = nativeAsObjectId(r1)
            r0.<init>(r1)
            return r0
    }

    public java.lang.String asString() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeAsString(r0)
            return r0
    }

    public java.util.UUID asUUID() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeAsUUID(r0)
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            return r0
    }

    public boolean coercedEquals(io.realm.internal.core.NativeRealmAny r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.nativePtr
            boolean r5 = nativeEquals(r0, r2)
            return r5
    }

    public <T extends io.realm.RealmModel> java.lang.Class<T> getModelClass(io.realm.internal.OsSharedRealm r5, io.realm.internal.RealmProxyMediator r6) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            java.lang.String r5 = nativeGetRealmModelTableName(r0, r2)
            java.lang.String r5 = io.realm.internal.Table.getClassNameForTable(r5)
            java.lang.Class r5 = r6.getClazz(r5)
            return r5
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.core.NativeRealmAny.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public long getRealmModelRowKey() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeGetRealmModelRowKey(r0)
            return r0
    }

    public java.lang.String getRealmModelTableName(io.realm.internal.OsSharedRealm r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getNativePtr()
            java.lang.String r5 = nativeGetRealmModelTableName(r0, r2)
            return r5
    }

    public io.realm.RealmAny.Type getType() {
            r2 = this;
            long r0 = r2.nativePtr
            int r0 = nativeGetType(r0)
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.fromNativeValue(r0)
            return r0
    }
}
