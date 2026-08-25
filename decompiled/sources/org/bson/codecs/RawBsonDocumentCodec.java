package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class RawBsonDocumentCodec implements org.bson.codecs.Codec<org.bson.RawBsonDocument> {
    public RawBsonDocumentCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.RawBsonDocument r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.RawBsonDocument decode(org.bson.BsonReader r5, org.bson.codecs.DecoderContext r6) {
            r4 = this;
            org.bson.io.BasicOutputBuffer r6 = new org.bson.io.BasicOutputBuffer
            r0 = 0
            r6.<init>(r0)
            org.bson.BsonBinaryWriter r1 = new org.bson.BsonBinaryWriter
            r1.<init>(r6)
            r1.pipe(r5)     // Catch: java.lang.Throwable -> L22
            org.bson.RawBsonDocument r5 = new org.bson.RawBsonDocument     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r6.getInternalBuffer()     // Catch: java.lang.Throwable -> L22
            int r3 = r6.getPosition()     // Catch: java.lang.Throwable -> L22
            r5.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L22
            r1.close()
            r6.close()
            return r5
        L22:
            r5 = move-exception
            r1.close()
            r6.close()
            throw r5
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.RawBsonDocument r2 = (org.bson.RawBsonDocument) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, org.bson.RawBsonDocument r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.BsonBinaryReader r4 = new org.bson.BsonBinaryReader
            org.bson.io.ByteBufferBsonInput r0 = new org.bson.io.ByteBufferBsonInput
            org.bson.ByteBuf r3 = r3.getByteBuffer()
            r0.<init>(r3)
            r4.<init>(r0)
            r2.pipe(r4)     // Catch: java.lang.Throwable -> L15
            r4.close()
            return
        L15:
            r2 = move-exception
            r4.close()
            throw r2
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.RawBsonDocument> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.RawBsonDocument> r0 = org.bson.RawBsonDocument.class
            return r0
    }
}
