package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
class ChildCodecRegistry<T> implements org.bson.codecs.configuration.CodecRegistry {
    private final java.lang.Class<T> codecClass;
    private final org.bson.internal.ChildCodecRegistry<?> parent;
    private final org.bson.internal.CycleDetectingCodecRegistry registry;

    private ChildCodecRegistry(org.bson.internal.ChildCodecRegistry<?> r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.codecClass = r2
            org.bson.internal.CycleDetectingCodecRegistry r1 = r1.registry
            r0.registry = r1
            return
    }

    public ChildCodecRegistry(org.bson.internal.CycleDetectingCodecRegistry r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.<init>()
            r0.codecClass = r2
            r2 = 0
            r0.parent = r2
            r0.registry = r1
            return
    }

    private <U> java.lang.Boolean hasCycles(java.lang.Class<U> r3) {
            r2 = this;
            r0 = r2
        L1:
            if (r0 == 0) goto L11
            java.lang.Class<T> r1 = r0.codecClass
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Le
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        Le:
            org.bson.internal.ChildCodecRegistry<?> r0 = r0.parent
            goto L1
        L11:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L3d
        L12:
            org.bson.internal.ChildCodecRegistry r5 = (org.bson.internal.ChildCodecRegistry) r5
            java.lang.Class<T> r2 = r4.codecClass
            java.lang.Class<T> r3 = r5.codecClass
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            org.bson.internal.ChildCodecRegistry<?> r2 = r4.parent
            if (r2 == 0) goto L2c
            org.bson.internal.ChildCodecRegistry<?> r3 = r5.parent
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
            goto L30
        L2c:
            org.bson.internal.ChildCodecRegistry<?> r2 = r5.parent
            if (r2 == 0) goto L31
        L30:
            return r1
        L31:
            org.bson.internal.CycleDetectingCodecRegistry r2 = r4.registry
            org.bson.internal.CycleDetectingCodecRegistry r5 = r5.registry
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L3c
            return r1
        L3c:
            return r0
        L3d:
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <U> org.bson.codecs.Codec<U> get(java.lang.Class<U> r3) {
            r2 = this;
            java.lang.Boolean r0 = r2.hasCycles(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12
            org.bson.internal.LazyCodec r0 = new org.bson.internal.LazyCodec
            org.bson.internal.CycleDetectingCodecRegistry r1 = r2.registry
            r0.<init>(r1, r3)
            return r0
        L12:
            org.bson.internal.CycleDetectingCodecRegistry r0 = r2.registry
            org.bson.internal.ChildCodecRegistry r1 = new org.bson.internal.ChildCodecRegistry
            r1.<init>(r2, r3)
            org.bson.codecs.Codec r3 = r0.get(r1)
            return r3
    }

    public java.lang.Class<T> getCodecClass() {
            r1 = this;
            java.lang.Class<T> r0 = r1.codecClass
            return r0
    }

    public int hashCode() {
            r2 = this;
            org.bson.internal.ChildCodecRegistry<?> r0 = r2.parent
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            org.bson.internal.CycleDetectingCodecRegistry r1 = r2.registry
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Class<T> r0 = r2.codecClass
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
