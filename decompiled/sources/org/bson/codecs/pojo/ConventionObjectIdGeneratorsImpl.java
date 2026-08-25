package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class ConventionObjectIdGeneratorsImpl implements org.bson.codecs.pojo.Convention {
    public ConventionObjectIdGeneratorsImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(org.bson.codecs.pojo.ClassModelBuilder<?> r3) {
            r2 = this;
            org.bson.codecs.pojo.IdGenerator r0 = r3.getIdGenerator()
            if (r0 != 0) goto L45
            java.lang.String r0 = r3.getIdPropertyName()
            if (r0 == 0) goto L45
            java.lang.String r0 = r3.getIdPropertyName()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r3.getProperty(r0)
            if (r0 == 0) goto L45
            org.bson.codecs.pojo.TypeData r0 = r0.getTypeData()
            java.lang.Class r0 = r0.getType()
            org.bson.codecs.pojo.IdGenerator r1 = r3.getIdGenerator()
            if (r1 != 0) goto L32
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L32
            org.bson.codecs.pojo.IdGenerator<org.bson.types.ObjectId> r0 = org.bson.codecs.pojo.IdGenerators.OBJECT_ID_GENERATOR
            r3.idGenerator(r0)
            goto L45
        L32:
            org.bson.codecs.pojo.IdGenerator r1 = r3.getIdGenerator()
            if (r1 != 0) goto L45
            java.lang.Class<org.bson.BsonObjectId> r1 = org.bson.BsonObjectId.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            org.bson.codecs.pojo.IdGenerator<org.bson.BsonObjectId> r0 = org.bson.codecs.pojo.IdGenerators.BSON_OBJECT_ID_GENERATOR
            r3.idGenerator(r0)
        L45:
            return
    }
}
