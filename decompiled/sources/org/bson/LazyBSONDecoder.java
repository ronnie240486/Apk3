package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class LazyBSONDecoder implements org.bson.BSONDecoder {
    private static final int BYTES_IN_INTEGER = 4;

    public LazyBSONDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.BSONDecoder
    public int decode(java.io.InputStream r5, org.bson.BSONCallback r6) throws java.io.IOException {
            r4 = this;
            r0 = 4
            byte[] r1 = new byte[r0]
            int r2 = org.bson.io.Bits.readInt(r5, r1)
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            int r3 = r2 + (-4)
            org.bson.io.Bits.readFully(r5, r1, r0, r3)
            r5 = 0
            r0 = 0
            r6.gotBinary(r5, r0, r1)
            return r2
    }

    @Override // org.bson.BSONDecoder
    public int decode(byte[] r2, org.bson.BSONCallback r3) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> La
            r0.<init>(r2)     // Catch: java.io.IOException -> La
            int r2 = r1.decode(r0, r3)     // Catch: java.io.IOException -> La
            return r2
        La:
            r2 = move-exception
            org.bson.BSONException r3 = new org.bson.BSONException
            java.lang.String r0 = "Invalid bytes received"
            r3.<init>(r0, r2)
            throw r3
    }

    @Override // org.bson.BSONDecoder
    public org.bson.BSONObject readObject(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            org.bson.LazyBSONCallback r0 = new org.bson.LazyBSONCallback
            r0.<init>()
            r1.decode(r2, r0)
            java.lang.Object r2 = r0.get()
            org.bson.BSONObject r2 = (org.bson.BSONObject) r2
            return r2
    }

    @Override // org.bson.BSONDecoder
    public org.bson.BSONObject readObject(byte[] r2) {
            r1 = this;
            org.bson.LazyBSONCallback r0 = new org.bson.LazyBSONCallback
            r0.<init>()
            r1.decode(r2, r0)
            java.lang.Object r2 = r0.get()
            org.bson.BSONObject r2 = (org.bson.BSONObject) r2
            return r2
    }
}
