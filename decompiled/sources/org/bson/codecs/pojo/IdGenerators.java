package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
public final class IdGenerators {
    public static final org.bson.codecs.pojo.IdGenerator<org.bson.BsonObjectId> BSON_OBJECT_ID_GENERATOR = null;
    public static final org.bson.codecs.pojo.IdGenerator<org.bson.types.ObjectId> OBJECT_ID_GENERATOR = null;



    static {
            org.bson.codecs.pojo.IdGenerators$1 r0 = new org.bson.codecs.pojo.IdGenerators$1
            r0.<init>()
            org.bson.codecs.pojo.IdGenerators.OBJECT_ID_GENERATOR = r0
            org.bson.codecs.pojo.IdGenerators$2 r0 = new org.bson.codecs.pojo.IdGenerators$2
            r0.<init>()
            org.bson.codecs.pojo.IdGenerators.BSON_OBJECT_ID_GENERATOR = r0
            return
    }

    private IdGenerators() {
            r0 = this;
            r0.<init>()
            return
    }
}
