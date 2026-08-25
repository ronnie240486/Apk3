package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class MapCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    private final org.bson.codecs.BsonTypeClassMap bsonTypeClassMap;
    private final org.bson.Transformer valueTransformer;

    public MapCodecProvider() {
            r1 = this;
            org.bson.codecs.BsonTypeClassMap r0 = new org.bson.codecs.BsonTypeClassMap
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public MapCodecProvider(org.bson.Transformer r2) {
            r1 = this;
            org.bson.codecs.BsonTypeClassMap r0 = new org.bson.codecs.BsonTypeClassMap
            r0.<init>()
            r1.<init>(r0, r2)
            return
    }

    public MapCodecProvider(org.bson.codecs.BsonTypeClassMap r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MapCodecProvider(org.bson.codecs.BsonTypeClassMap r2, org.bson.Transformer r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "bsonTypeClassMap"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.BsonTypeClassMap r2 = (org.bson.codecs.BsonTypeClassMap) r2
            r1.bsonTypeClassMap = r2
            r1.valueTransformer = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L30
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L30
        L12:
            org.bson.codecs.MapCodecProvider r5 = (org.bson.codecs.MapCodecProvider) r5
            org.bson.codecs.BsonTypeClassMap r2 = r4.bsonTypeClassMap
            org.bson.codecs.BsonTypeClassMap r3 = r5.bsonTypeClassMap
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            org.bson.Transformer r2 = r4.valueTransformer
            org.bson.Transformer r5 = r5.valueTransformer
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2f
            goto L2e
        L2c:
            if (r5 == 0) goto L2f
        L2e:
            return r1
        L2f:
            return r0
        L30:
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r3, org.bson.codecs.configuration.CodecRegistry r4) {
            r2 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L12
            org.bson.codecs.MapCodec r3 = new org.bson.codecs.MapCodec
            org.bson.codecs.BsonTypeClassMap r0 = r2.bsonTypeClassMap
            org.bson.Transformer r1 = r2.valueTransformer
            r3.<init>(r4, r0, r1)
            return r3
        L12:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            org.bson.codecs.BsonTypeClassMap r0 = r2.bsonTypeClassMap
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.bson.Transformer r1 = r2.valueTransformer
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }
}
