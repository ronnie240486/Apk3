package org.bson;

/* JADX INFO: loaded from: classes.dex */
public interface BSONDecoder {
    int decode(java.io.InputStream r1, org.bson.BSONCallback r2) throws java.io.IOException;

    int decode(byte[] r1, org.bson.BSONCallback r2);

    org.bson.BSONObject readObject(java.io.InputStream r1) throws java.io.IOException;

    org.bson.BSONObject readObject(byte[] r1);
}
