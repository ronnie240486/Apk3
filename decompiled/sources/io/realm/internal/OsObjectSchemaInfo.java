package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OsObjectSchemaInfo implements io.realm.internal.NativeObject {
    private static final long nativeFinalizerPtr = 0;
    private long nativePtr;

    /* JADX INFO: renamed from: io.realm.internal.OsObjectSchemaInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder {
        private final long[] computedPropertyPtrArray;
        private int computedPropertyPtrCurPos;
        private final boolean embedded;
        private final java.lang.String internalClassName;
        private final long[] persistedPropertyPtrArray;
        private int persistedPropertyPtrCurPos;
        private final java.lang.String publicClassName;

        public Builder(java.lang.String r2, java.lang.String r3, boolean r4, int r5, int r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.persistedPropertyPtrCurPos = r0
                r1.computedPropertyPtrCurPos = r0
                r1.publicClassName = r2
                r1.internalClassName = r3
                r1.embedded = r4
                long[] r2 = new long[r5]
                r1.persistedPropertyPtrArray = r2
                long[] r2 = new long[r6]
                r1.computedPropertyPtrArray = r2
                return
        }

        public Builder(java.lang.String r2, boolean r3, int r4, int r5) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.persistedPropertyPtrCurPos = r0
                r1.computedPropertyPtrCurPos = r0
                java.lang.String r0 = ""
                r1.publicClassName = r0
                r1.internalClassName = r2
                r1.embedded = r3
                long[] r2 = new long[r4]
                r1.persistedPropertyPtrArray = r2
                long[] r2 = new long[r5]
                r1.computedPropertyPtrArray = r2
                return
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addComputedLinkProperty(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                long r2 = io.realm.internal.Property.nativeCreateComputedLinkProperty(r2, r3, r4)
                long[] r4 = r1.computedPropertyPtrArray
                int r0 = r1.computedPropertyPtrCurPos
                r4[r0] = r2
                int r0 = r0 + 1
                r1.computedPropertyPtrCurPos = r0
                return r1
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addPersistedLinkProperty(java.lang.String r2, java.lang.String r3, io.realm.RealmFieldType r4, java.lang.String r5) {
                r1 = this;
                r0 = 0
                int r4 = io.realm.internal.Property.convertFromRealmFieldType(r4, r0)
                long r2 = io.realm.internal.Property.nativeCreatePersistedLinkProperty(r3, r2, r4, r5)
                long[] r4 = r1.persistedPropertyPtrArray
                int r5 = r1.persistedPropertyPtrCurPos
                r4[r5] = r2
                int r5 = r5 + 1
                r1.persistedPropertyPtrCurPos = r5
                return r1
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addPersistedMapProperty(java.lang.String r1, java.lang.String r2, io.realm.RealmFieldType r3, boolean r4) {
                r0 = this;
                int r3 = io.realm.internal.Property.convertFromRealmFieldType(r3, r4)
                r4 = 0
                long r1 = io.realm.internal.Property.nativeCreatePersistedProperty(r2, r1, r3, r4, r4)
                long[] r3 = r0.persistedPropertyPtrArray
                int r4 = r0.persistedPropertyPtrCurPos
                r3[r4] = r1
                int r4 = r4 + 1
                r0.persistedPropertyPtrCurPos = r4
                return r0
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addPersistedProperty(java.lang.String r1, java.lang.String r2, io.realm.RealmFieldType r3, boolean r4, boolean r5, boolean r6) {
                r0 = this;
                int r3 = io.realm.internal.Property.convertFromRealmFieldType(r3, r6)
                long r1 = io.realm.internal.Property.nativeCreatePersistedProperty(r2, r1, r3, r4, r5)
                long[] r3 = r0.persistedPropertyPtrArray
                int r4 = r0.persistedPropertyPtrCurPos
                r3[r4] = r1
                int r4 = r4 + 1
                r0.persistedPropertyPtrCurPos = r4
                return r0
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addPersistedSetProperty(java.lang.String r1, java.lang.String r2, io.realm.RealmFieldType r3, boolean r4) {
                r0 = this;
                int r3 = io.realm.internal.Property.convertFromRealmFieldType(r3, r4)
                r4 = 0
                long r1 = io.realm.internal.Property.nativeCreatePersistedProperty(r2, r1, r3, r4, r4)
                long[] r3 = r0.persistedPropertyPtrArray
                int r4 = r0.persistedPropertyPtrCurPos
                r3[r4] = r1
                int r4 = r4 + 1
                r0.persistedPropertyPtrCurPos = r4
                return r0
        }

        public io.realm.internal.OsObjectSchemaInfo.Builder addPersistedValueListProperty(java.lang.String r1, java.lang.String r2, io.realm.RealmFieldType r3, boolean r4) {
                r0 = this;
                int r3 = io.realm.internal.Property.convertFromRealmFieldType(r3, r4)
                r4 = 0
                long r1 = io.realm.internal.Property.nativeCreatePersistedProperty(r2, r1, r3, r4, r4)
                long[] r3 = r0.persistedPropertyPtrArray
                int r4 = r0.persistedPropertyPtrCurPos
                r3[r4] = r1
                int r4 = r4 + 1
                r0.persistedPropertyPtrCurPos = r4
                return r0
        }

        public io.realm.internal.OsObjectSchemaInfo build() {
                r6 = this;
                int r0 = r6.persistedPropertyPtrCurPos
                r1 = -1
                if (r0 == r1) goto L25
                int r0 = r6.computedPropertyPtrCurPos
                if (r0 == r1) goto L25
                io.realm.internal.OsObjectSchemaInfo r0 = new io.realm.internal.OsObjectSchemaInfo
                java.lang.String r2 = r6.publicClassName
                java.lang.String r3 = r6.internalClassName
                boolean r4 = r6.embedded
                r5 = 0
                r0.<init>(r2, r3, r4, r5)
                long r2 = io.realm.internal.OsObjectSchemaInfo.access$100(r0)
                long[] r4 = r6.persistedPropertyPtrArray
                long[] r5 = r6.computedPropertyPtrArray
                io.realm.internal.OsObjectSchemaInfo.access$200(r2, r4, r5)
                r6.persistedPropertyPtrCurPos = r1
                r6.computedPropertyPtrCurPos = r1
                return r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "'OsObjectSchemaInfo.build()' has been called before on this object."
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsObjectSchemaInfo.nativeFinalizerPtr = r0
            return
    }

    public OsObjectSchemaInfo(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    private OsObjectSchemaInfo(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            long r1 = nativeCreateRealmObjectSchema(r1, r2, r3)
            r0.<init>()
            r0.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    public /* synthetic */ OsObjectSchemaInfo(java.lang.String r1, java.lang.String r2, boolean r3, io.realm.internal.OsObjectSchemaInfo.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ long access$100(io.realm.internal.OsObjectSchemaInfo r2) {
            long r0 = r2.nativePtr
            return r0
    }

    public static /* synthetic */ void access$200(long r0, long[] r2, long[] r3) {
            nativeAddProperties(r0, r2, r3)
            return
    }

    private static native void nativeAddProperties(long r0, long[] r2, long[] r3);

    private static native long nativeCreateRealmObjectSchema(java.lang.String r0, java.lang.String r1, boolean r2);

    private static native java.lang.String nativeGetClassName(long r0);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long r0);

    private static native long nativeGetProperty(long r0, java.lang.String r2);

    private static native boolean nativeIsEmbedded(long r0);

    public java.lang.String getClassName() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeGetClassName(r0)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsObjectSchemaInfo.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    @javax.annotation.Nullable
    public io.realm.internal.Property getPrimaryKeyProperty() {
            r5 = this;
            long r0 = r5.nativePtr
            long r0 = nativeGetPrimaryKeyProperty(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 0
            goto L19
        Le:
            io.realm.internal.Property r0 = new io.realm.internal.Property
            long r1 = r5.nativePtr
            long r1 = nativeGetPrimaryKeyProperty(r1)
            r0.<init>(r1)
        L19:
            return r0
    }

    public io.realm.internal.Property getProperty(java.lang.String r4) {
            r3 = this;
            io.realm.internal.Property r0 = new io.realm.internal.Property
            long r1 = r3.nativePtr
            long r1 = nativeGetProperty(r1, r4)
            r0.<init>(r1)
            return r0
    }

    public boolean isEmbedded() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsEmbedded(r0)
            return r0
    }
}
