package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OverridableUuidRepresentationCodecRegistry implements org.bson.internal.CycleDetectingCodecRegistry {
    private final org.bson.internal.CodecCache codecCache;
    private final org.bson.UuidRepresentation uuidRepresentation;
    private final org.bson.codecs.configuration.CodecProvider wrapped;

    public OverridableUuidRepresentationCodecRegistry(org.bson.codecs.configuration.CodecProvider r2, org.bson.UuidRepresentation r3) {
            r1 = this;
            r1.<init>()
            org.bson.internal.CodecCache r0 = new org.bson.internal.CodecCache
            r0.<init>()
            r1.codecCache = r0
            java.lang.String r0 = "uuidRepresentation"
            java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r0, r3)
            org.bson.UuidRepresentation r3 = (org.bson.UuidRepresentation) r3
            r1.uuidRepresentation = r3
            java.lang.String r3 = "wrapped"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r3, r2)
            org.bson.codecs.configuration.CodecProvider r2 = (org.bson.codecs.configuration.CodecProvider) r2
            r1.wrapped = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L28
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L28
        L12:
            org.bson.internal.OverridableUuidRepresentationCodecRegistry r5 = (org.bson.internal.OverridableUuidRepresentationCodecRegistry) r5
            org.bson.codecs.configuration.CodecProvider r2 = r4.wrapped
            org.bson.codecs.configuration.CodecProvider r3 = r5.wrapped
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            org.bson.UuidRepresentation r2 = r4.uuidRepresentation
            org.bson.UuidRepresentation r5 = r5.uuidRepresentation
            if (r2 != r5) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        L28:
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r2) {
            r1 = this;
            org.bson.internal.ChildCodecRegistry r0 = new org.bson.internal.ChildCodecRegistry
            r0.<init>(r1, r2)
            org.bson.codecs.Codec r2 = r1.get(r0)
            return r2
    }

    @Override // org.bson.internal.CycleDetectingCodecRegistry
    public <T> org.bson.codecs.Codec<T> get(org.bson.internal.ChildCodecRegistry<T> r4) {
            r3 = this;
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r1 = r4.getCodecClass()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L2b
            org.bson.codecs.configuration.CodecProvider r0 = r3.wrapped
            java.lang.Class r1 = r4.getCodecClass()
            org.bson.codecs.Codec r0 = r0.get(r1, r4)
            boolean r1 = r0 instanceof org.bson.codecs.OverridableUuidRepresentationCodec
            if (r1 == 0) goto L22
            org.bson.codecs.OverridableUuidRepresentationCodec r0 = (org.bson.codecs.OverridableUuidRepresentationCodec) r0
            org.bson.UuidRepresentation r1 = r3.uuidRepresentation
            org.bson.codecs.Codec r0 = r0.withUuidRepresentation(r1)
        L22:
            org.bson.internal.CodecCache r1 = r3.codecCache
            java.lang.Class r2 = r4.getCodecClass()
            r1.put(r2, r0)
        L2b:
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r4 = r4.getCodecClass()
            org.bson.codecs.Codec r4 = r0.getOrThrow(r4)
            return r4
    }

    public org.bson.UuidRepresentation getUuidRepresentation() {
            r1 = this;
            org.bson.UuidRepresentation r0 = r1.uuidRepresentation
            return r0
    }

    public org.bson.codecs.configuration.CodecProvider getWrapped() {
            r1 = this;
            org.bson.codecs.configuration.CodecProvider r0 = r1.wrapped
            return r0
    }

    public int hashCode() {
            r2 = this;
            org.bson.codecs.configuration.CodecProvider r0 = r2.wrapped
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.bson.UuidRepresentation r1 = r2.uuidRepresentation
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
