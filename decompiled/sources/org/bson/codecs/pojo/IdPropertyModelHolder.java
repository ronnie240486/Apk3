package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
final class IdPropertyModelHolder<I> {
    private final org.bson.codecs.pojo.IdGenerator<I> idGenerator;
    private final org.bson.codecs.pojo.PropertyModel<I> propertyModel;

    private IdPropertyModelHolder(org.bson.codecs.pojo.PropertyModel<I> r1, org.bson.codecs.pojo.IdGenerator<I> r2) {
            r0 = this;
            r0.<init>()
            r0.propertyModel = r1
            r0.idGenerator = r2
            return
    }

    public static <T, I, V> org.bson.codecs.pojo.IdPropertyModelHolder<I> create(java.lang.Class<T> r3, org.bson.codecs.pojo.PropertyModel<I> r4, org.bson.codecs.pojo.IdGenerator<V> r5) {
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L17
            if (r5 != 0) goto L7
            goto L17
        L7:
            org.bson.codecs.configuration.CodecConfigurationException r4 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r3
            java.lang.String r3 = "Invalid IdGenerator. There is no IdProperty set for: %s"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
        L17:
            if (r5 == 0) goto L4b
            org.bson.codecs.pojo.TypeData r3 = r4.getTypeData()
            java.lang.Class r3 = r3.getType()
            java.lang.Class r2 = r5.getType()
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L2c
            goto L4b
        L2c:
            org.bson.codecs.configuration.CodecConfigurationException r3 = new org.bson.codecs.configuration.CodecConfigurationException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.bson.codecs.pojo.TypeData r4 = r4.getTypeData()
            java.lang.Class r4 = r4.getType()
            r2[r0] = r4
            java.lang.Class r4 = r5.getType()
            r2[r1] = r4
            java.lang.String r4 = "Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r3.<init>(r4)
            throw r3
        L4b:
            org.bson.codecs.pojo.IdPropertyModelHolder r3 = new org.bson.codecs.pojo.IdPropertyModelHolder
            r3.<init>(r4, r5)
            return r3
    }

    public static <T, I> org.bson.codecs.pojo.IdPropertyModelHolder<I> create(org.bson.codecs.pojo.ClassModel<T> r1, org.bson.codecs.pojo.PropertyModel<I> r2) {
            java.lang.Class r0 = r1.getType()
            org.bson.codecs.pojo.IdPropertyModelHolder r1 = r1.getIdPropertyModelHolder()
            org.bson.codecs.pojo.IdGenerator<I> r1 = r1.idGenerator
            org.bson.codecs.pojo.IdPropertyModelHolder r1 = create(r0, r2, r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L34
            java.lang.Class<org.bson.codecs.pojo.IdPropertyModelHolder> r2 = org.bson.codecs.pojo.IdPropertyModelHolder.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L34
        L10:
            org.bson.codecs.pojo.IdPropertyModelHolder r5 = (org.bson.codecs.pojo.IdPropertyModelHolder) r5
            org.bson.codecs.pojo.PropertyModel<I> r2 = r4.propertyModel
            if (r2 == 0) goto L1f
            org.bson.codecs.pojo.PropertyModel<I> r3 = r5.propertyModel
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            goto L23
        L1f:
            org.bson.codecs.pojo.PropertyModel<I> r2 = r5.propertyModel
            if (r2 == 0) goto L24
        L23:
            return r1
        L24:
            org.bson.codecs.pojo.IdGenerator<I> r2 = r4.idGenerator
            org.bson.codecs.pojo.IdGenerator<I> r5 = r5.idGenerator
            if (r2 == 0) goto L2f
            boolean r0 = r2.equals(r5)
            goto L33
        L2f:
            if (r5 != 0) goto L32
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
        L34:
            return r1
    }

    public final org.bson.codecs.pojo.IdGenerator<I> getIdGenerator() {
            r1 = this;
            org.bson.codecs.pojo.IdGenerator<I> r0 = r1.idGenerator
            return r0
    }

    public final org.bson.codecs.pojo.PropertyModel<I> getPropertyModel() {
            r1 = this;
            org.bson.codecs.pojo.PropertyModel<I> r0 = r1.propertyModel
            return r0
    }

    public int hashCode() {
            r3 = this;
            org.bson.codecs.pojo.PropertyModel<I> r0 = r3.propertyModel
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            org.bson.codecs.pojo.IdGenerator<I> r2 = r3.idGenerator
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }
}
