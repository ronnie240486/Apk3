package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class PropertyAccessorImpl<T> implements org.bson.codecs.pojo.PropertyAccessor<T> {
    private final org.bson.codecs.pojo.PropertyMetadata<T> propertyMetadata;

    public PropertyAccessorImpl(org.bson.codecs.pojo.PropertyMetadata<T> r1) {
            r0 = this;
            r0.<init>()
            r0.propertyMetadata = r1
            return
    }

    private org.bson.codecs.configuration.CodecConfigurationException getError(java.lang.Exception r5) {
            r4 = this;
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.bson.codecs.pojo.PropertyMetadata<T> r2 = r4.propertyMetadata
            java.lang.String r2 = r2.getName()
            r3 = 0
            r1[r3] = r2
            org.bson.codecs.pojo.PropertyMetadata<T> r2 = r4.propertyMetadata
            java.lang.String r2 = r2.getDeclaringClassName()
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Unable to get value for property '%s' in %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            return r0
    }

    private org.bson.codecs.configuration.CodecConfigurationException setError(java.lang.Exception r5) {
            r4 = this;
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.bson.codecs.pojo.PropertyMetadata<T> r2 = r4.propertyMetadata
            java.lang.String r2 = r2.getName()
            r3 = 0
            r1[r3] = r2
            org.bson.codecs.pojo.PropertyMetadata<T> r2 = r4.propertyMetadata
            java.lang.String r2 = r2.getDeclaringClassName()
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Unable to set value for property '%s' in %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            return r0
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public <S> T get(S r3) {
            r2 = this;
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r2.propertyMetadata     // Catch: java.lang.Exception -> L2f
            boolean r0 = r0.isSerializable()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L29
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r2.propertyMetadata     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Method r0 = r0.getGetter()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L1e
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r2.propertyMetadata     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Method r0 = r0.getGetter()     // Catch: java.lang.Exception -> L2f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L2f
            return r3
        L1e:
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r2.propertyMetadata     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Field r0 = r0.getField()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L2f
            return r3
        L29:
            r3 = 0
            org.bson.codecs.configuration.CodecConfigurationException r3 = r2.getError(r3)     // Catch: java.lang.Exception -> L2f
            throw r3     // Catch: java.lang.Exception -> L2f
        L2f:
            r3 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r3 = r2.getError(r3)
            throw r3
    }

    public final org.bson.codecs.pojo.PropertyMetadata<T> getPropertyMetadata() {
            r1 = this;
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r1.propertyMetadata
            return r0
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public <S> void set(S r4, T r5) {
            r3 = this;
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r3.propertyMetadata     // Catch: java.lang.Exception -> L2a
            boolean r0 = r0.isDeserializable()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L29
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r3.propertyMetadata     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r0.getSetter()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L20
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r3.propertyMetadata     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r0.getSetter()     // Catch: java.lang.Exception -> L2a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Exception -> L2a
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2a
            goto L29
        L20:
            org.bson.codecs.pojo.PropertyMetadata<T> r0 = r3.propertyMetadata     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Field r0 = r0.getField()     // Catch: java.lang.Exception -> L2a
            r0.set(r4, r5)     // Catch: java.lang.Exception -> L2a
        L29:
            return
        L2a:
            r4 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r4 = r3.setError(r4)
            throw r4
    }
}
