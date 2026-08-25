package org.bson;

/* JADX INFO: loaded from: classes.dex */
public interface BSONEncoder {
    void done();

    byte[] encode(org.bson.BSONObject r1);

    int putObject(org.bson.BSONObject r1);

    void set(org.bson.io.OutputBuffer r1);
}
