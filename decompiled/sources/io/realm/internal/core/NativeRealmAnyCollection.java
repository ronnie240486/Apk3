package io.realm.internal.core;

/* JADX INFO: loaded from: classes.dex */
public final class NativeRealmAnyCollection implements io.realm.internal.NativeObject {
    private final long nativePtr;

    private NativeRealmAnyCollection(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    private static native long nativeCreateBinaryCollection(byte[][] r0, boolean[] r1);

    private static native long nativeCreateBooleanCollection(boolean[] r0, boolean[] r1);

    private static native long nativeCreateDateCollection(long[] r0, boolean[] r1);

    private static native long nativeCreateDecimal128Collection(long[] r0, long[] r1, boolean[] r2);

    private static native long nativeCreateDoubleCollection(double[] r0, boolean[] r1);

    private static native long nativeCreateFloatCollection(float[] r0, boolean[] r1);

    private static native long nativeCreateIntegerCollection(long[] r0, boolean[] r1);

    private static native long nativeCreateObjectCollection(long[] r0, boolean[] r1);

    private static native long nativeCreateObjectIdCollection(java.lang.String[] r0, boolean[] r1);

    private static native long nativeCreateRealmAnyCollection(long[] r0, boolean[] r1);

    private static native long nativeCreateStringCollection(java.lang.String[] r0, boolean[] r1);

    private static native long nativeCreateUUIDCollection(java.lang.String[] r0, boolean[] r1);

    private static native long nativeGetCollectionItem(long r0, int r2);

    private static native int nativeGetCollectionSize(long r0);

    private static native long nativeGetFinalizerPtr();

    public static io.realm.internal.core.NativeRealmAnyCollection newBinaryCollection(java.util.Collection<? extends byte[]> r4) {
            int r0 = r4.size()
            byte[][] r0 = new byte[r0][]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r4.next()
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L24
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L24:
            int r2 = r2 + 1
            goto L11
        L27:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateBinaryCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newBooleanCollection(java.util.Collection<java.lang.Boolean> r4) {
            int r0 = r4.size()
            boolean[] r0 = new boolean[r0]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r4.next()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L28
            boolean r3 = r3.booleanValue()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateBooleanCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newDateCollection(java.util.Collection<? extends java.util.Date> r5) {
            int r0 = r5.size()
            long[] r0 = new long[r0]
            int r1 = r5.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r5.next()
            java.util.Date r3 = (java.util.Date) r3
            if (r3 == 0) goto L28
            long r3 = r3.getTime()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r5 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateDateCollection(r0, r1)
            r5.<init>(r0)
            return r5
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newDecimal128Collection(java.util.Collection<? extends org.bson.types.Decimal128> r7) {
            int r0 = r7.size()
            long[] r0 = new long[r0]
            int r1 = r7.size()
            long[] r1 = new long[r1]
            int r2 = r7.size()
            boolean[] r2 = new boolean[r2]
            java.util.Iterator r7 = r7.iterator()
            r3 = 0
        L17:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r7.next()
            org.bson.types.Decimal128 r4 = (org.bson.types.Decimal128) r4
            if (r4 == 0) goto L34
            long r5 = r4.getLow()
            r0[r3] = r5
            long r4 = r4.getHigh()
            r1[r3] = r4
            r4 = 1
            r2[r3] = r4
        L34:
            int r3 = r3 + 1
            goto L17
        L37:
            io.realm.internal.core.NativeRealmAnyCollection r7 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateDecimal128Collection(r0, r1, r2)
            r7.<init>(r0)
            return r7
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newDoubleCollection(java.util.Collection<? extends java.lang.Double> r5) {
            int r0 = r5.size()
            double[] r0 = new double[r0]
            int r1 = r5.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r5.next()
            java.lang.Double r3 = (java.lang.Double) r3
            if (r3 == 0) goto L28
            double r3 = r3.doubleValue()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r5 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateDoubleCollection(r0, r1)
            r5.<init>(r0)
            return r5
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newFloatCollection(java.util.Collection<? extends java.lang.Float> r4) {
            int r0 = r4.size()
            float[] r0 = new float[r0]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r4.next()
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L28
            float r3 = r3.floatValue()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateFloatCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newIntegerCollection(java.util.Collection<? extends java.lang.Number> r5) {
            int r0 = r5.size()
            long[] r0 = new long[r0]
            int r1 = r5.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L28
            long r3 = r3.longValue()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r5 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateIntegerCollection(r0, r1)
            r5.<init>(r0)
            return r5
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newObjectIdCollection(java.util.Collection<? extends org.bson.types.ObjectId> r4) {
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r4.next()
            org.bson.types.ObjectId r3 = (org.bson.types.ObjectId) r3
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateObjectIdCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newRealmAnyCollection(long[] r1, boolean[] r2) {
            io.realm.internal.core.NativeRealmAnyCollection r0 = new io.realm.internal.core.NativeRealmAnyCollection
            long r1 = nativeCreateRealmAnyCollection(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newRealmModelCollection(java.util.Collection<? extends io.realm.RealmModel> r5) {
            int r0 = r5.size()
            long[] r0 = new long[r0]
            int r1 = r5.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r5.next()
            io.realm.RealmModel r3 = (io.realm.RealmModel) r3
            if (r3 == 0) goto L34
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.internal.Row r3 = r3.getRow$realm()
            io.realm.internal.UncheckedRow r3 = (io.realm.internal.UncheckedRow) r3
            long r3 = r3.getNativePtr()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L34:
            int r2 = r2 + 1
            goto L11
        L37:
            io.realm.internal.core.NativeRealmAnyCollection r5 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateObjectCollection(r0, r1)
            r5.<init>(r0)
            return r5
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newStringCollection(java.util.Collection<java.lang.String> r4) {
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L24
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L24:
            int r2 = r2 + 1
            goto L11
        L27:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateStringCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public static io.realm.internal.core.NativeRealmAnyCollection newUUIDCollection(java.util.Collection<? extends java.util.UUID> r4) {
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r4.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L11:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r4.next()
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L28:
            int r2 = r2 + 1
            goto L11
        L2b:
            io.realm.internal.core.NativeRealmAnyCollection r4 = new io.realm.internal.core.NativeRealmAnyCollection
            long r0 = nativeCreateUUIDCollection(r0, r1)
            r4.<init>(r0)
            return r4
    }

    public io.realm.internal.core.NativeRealmAny getItem(int r4) {
            r3 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            long r1 = r3.nativePtr
            long r1 = nativeGetCollectionItem(r1, r4)
            r0.<init>(r1)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = nativeGetFinalizerPtr()
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public int getSize() {
            r2 = this;
            long r0 = r2.nativePtr
            int r0 = nativeGetCollectionSize(r0)
            return r0
    }
}
