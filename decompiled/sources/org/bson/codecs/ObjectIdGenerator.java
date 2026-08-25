package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class ObjectIdGenerator implements org.bson.codecs.IdGenerator {
    public ObjectIdGenerator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.IdGenerator
    public java.lang.Object generate() {
            r1 = this;
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            r0.<init>()
            return r0
    }
}
