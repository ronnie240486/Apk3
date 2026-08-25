package org.bson;

/* JADX INFO: loaded from: classes3.dex */
final class RawBsonValueHelper {
    private static final org.bson.codecs.configuration.CodecRegistry REGISTRY = null;

    static {
            r0 = 1
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.BsonValueCodecProvider r1 = new org.bson.codecs.BsonValueCodecProvider
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            org.bson.RawBsonValueHelper.REGISTRY = r0
            return
    }

    private RawBsonValueHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.bson.BsonValue decode(byte[] r4, org.bson.BsonBinaryReader r5) {
            org.bson.BsonType r0 = r5.getCurrentBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT
            if (r0 == r1) goto L2e
            org.bson.BsonType r0 = r5.getCurrentBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.ARRAY
            if (r0 != r2) goto L11
            goto L2e
        L11:
            org.bson.codecs.configuration.CodecRegistry r4 = org.bson.RawBsonValueHelper.REGISTRY
            org.bson.BsonType r0 = r5.getCurrentBsonType()
            java.lang.Class r0 = org.bson.codecs.BsonValueCodecProvider.getClassForBsonType(r0)
            org.bson.codecs.Codec r4 = r4.get(r0)
            org.bson.codecs.DecoderContext$Builder r0 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r0 = r0.build()
            java.lang.Object r4 = r4.decode(r5, r0)
            org.bson.BsonValue r4 = (org.bson.BsonValue) r4
            return r4
        L2e:
            org.bson.io.BsonInput r0 = r5.getBsonInput()
            int r0 = r0.getPosition()
            org.bson.io.BsonInput r2 = r5.getBsonInput()
            r3 = 4
            org.bson.io.BsonInputMark r2 = r2.getMark(r3)
            org.bson.io.BsonInput r3 = r5.getBsonInput()
            int r3 = r3.readInt32()
            r2.reset()
            r5.skipValue()
            org.bson.BsonType r5 = r5.getCurrentBsonType()
            if (r5 != r1) goto L59
            org.bson.RawBsonDocument r5 = new org.bson.RawBsonDocument
            r5.<init>(r4, r0, r3)
            return r5
        L59:
            org.bson.RawBsonArray r5 = new org.bson.RawBsonArray
            r5.<init>(r4, r0, r3)
            return r5
    }
}
