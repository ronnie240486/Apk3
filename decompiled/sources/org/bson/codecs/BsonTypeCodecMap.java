package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonTypeCodecMap {
    private final org.bson.codecs.BsonTypeClassMap bsonTypeClassMap;
    private final org.bson.codecs.Codec<?>[] codecs;

    public BsonTypeCodecMap(org.bson.codecs.BsonTypeClassMap r5, org.bson.codecs.configuration.CodecRegistry r6) {
            r4 = this;
            r4.<init>()
            r0 = 256(0x100, float:3.59E-43)
            org.bson.codecs.Codec[] r0 = new org.bson.codecs.Codec[r0]
            r4.codecs = r0
            java.lang.String r0 = "bsonTypeClassMap"
            java.lang.Object r0 = org.bson.assertions.Assertions.notNull(r0, r5)
            org.bson.codecs.BsonTypeClassMap r0 = (org.bson.codecs.BsonTypeClassMap) r0
            r4.bsonTypeClassMap = r0
            java.lang.String r0 = "codecRegistry"
            org.bson.assertions.Assertions.notNull(r0, r6)
            java.util.Set r0 = r5.keys()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            org.bson.BsonType r1 = (org.bson.BsonType) r1
            java.lang.Class r2 = r5.get(r1)
            if (r2 == 0) goto L20
            org.bson.codecs.Codec<?>[] r3 = r4.codecs     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L3f
            int r1 = r1.getValue()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L3f
            org.bson.codecs.Codec r2 = r6.get(r2)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L3f
            r3[r1] = r2     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L3f
            goto L20
        L3f:
            goto L20
        L41:
            return
    }

    public org.bson.codecs.Codec<?> get(org.bson.BsonType r4) {
            r3 = this;
            org.bson.codecs.Codec<?>[] r0 = r3.codecs
            int r1 = r4.getValue()
            r0 = r0[r1]
            if (r0 != 0) goto L34
            org.bson.codecs.BsonTypeClassMap r0 = r3.bsonTypeClassMap
            java.lang.Class r0 = r0.get(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L24
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            java.lang.String r4 = "No class mapped for BSON type %s."
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        L24:
            org.bson.codecs.configuration.CodecConfigurationException r4 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "Can't find a codec for %s."
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r4.<init>(r0)
            throw r4
        L34:
            return r0
    }
}
