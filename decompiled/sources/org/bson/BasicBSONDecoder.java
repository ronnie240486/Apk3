package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BasicBSONDecoder implements org.bson.BSONDecoder {
    public BasicBSONDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private byte[] readFully(java.io.InputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 4
            byte[] r1 = new byte[r0]
            org.bson.io.Bits.readFully(r6, r1)
            int r2 = org.bson.io.Bits.readInt(r1)
            byte[] r3 = new byte[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r0)
            int r2 = r2 - r0
            org.bson.io.Bits.readFully(r6, r3, r0, r2)
            return r3
    }

    @Override // org.bson.BSONDecoder
    public int decode(java.io.InputStream r1, org.bson.BSONCallback r2) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.readFully(r1)
            int r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.BSONDecoder
    public int decode(byte[] r4, org.bson.BSONCallback r5) {
            r3 = this;
            org.bson.BsonBinaryReader r0 = new org.bson.BsonBinaryReader
            org.bson.io.ByteBufferBsonInput r1 = new org.bson.io.ByteBufferBsonInput
            org.bson.ByteBufNIO r2 = new org.bson.ByteBufNIO
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r2.<init>(r4)
            r1.<init>(r2)
            r0.<init>(r1)
            org.bson.BSONCallbackAdapter r4 = new org.bson.BSONCallbackAdapter     // Catch: java.lang.Throwable -> L2c
            org.bson.BsonWriterSettings r1 = new org.bson.BsonWriterSettings     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2c
            r4.pipe(r0)     // Catch: java.lang.Throwable -> L2c
            org.bson.io.BsonInput r4 = r0.getBsonInput()     // Catch: java.lang.Throwable -> L2c
            int r4 = r4.getPosition()     // Catch: java.lang.Throwable -> L2c
            r0.close()
            return r4
        L2c:
            r4 = move-exception
            r0.close()
            throw r4
    }

    @Override // org.bson.BSONDecoder
    public org.bson.BSONObject readObject(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.readFully(r1)
            org.bson.BSONObject r1 = r0.readObject(r1)
            return r1
    }

    @Override // org.bson.BSONDecoder
    public org.bson.BSONObject readObject(byte[] r2) {
            r1 = this;
            org.bson.BasicBSONCallback r0 = new org.bson.BasicBSONCallback
            r0.<init>()
            r1.decode(r2, r0)
            java.lang.Object r2 = r0.get()
            org.bson.BSONObject r2 = (org.bson.BSONObject) r2
            return r2
    }
}
