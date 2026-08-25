package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class InstanceCreatorImpl<T> implements org.bson.codecs.pojo.InstanceCreator<T> {
    private final java.util.Map<org.bson.codecs.pojo.PropertyModel<?>, java.lang.Object> cachedValues;
    private final org.bson.codecs.pojo.CreatorExecutable<T> creatorExecutable;
    private T newInstance;
    private final java.lang.Object[] params;
    private final java.util.Map<java.lang.String, java.lang.Integer> properties;

    public InstanceCreatorImpl(org.bson.codecs.pojo.CreatorExecutable<T> r5) {
            r4 = this;
            r4.<init>()
            r4.creatorExecutable = r5
            java.util.List r0 = r5.getProperties()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            r0 = 0
            r4.cachedValues = r0
            r4.properties = r0
            r4.params = r0
            java.lang.Object r5 = r5.getInstance()
            r4.newInstance = r5
            goto L76
        L1d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.cachedValues = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.properties = r0
            r0 = 0
        L2c:
            java.util.List r1 = r5.getProperties()
            int r1 = r1.size()
            if (r0 >= r1) goto L6c
            java.lang.Integer r1 = r5.getIdPropertyIndex()
            if (r1 == 0) goto L52
            java.lang.Integer r1 = r5.getIdPropertyIndex()
            int r1 = r1.intValue()
            if (r1 != r0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.properties
            java.lang.Integer r2 = r5.getIdPropertyIndex()
            java.lang.String r3 = "_id"
            r1.put(r3, r2)
            goto L69
        L52:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.properties
            java.util.List r2 = r5.getProperties()
            java.lang.Object r2 = r2.get(r0)
            org.bson.codecs.pojo.annotations.BsonProperty r2 = (org.bson.codecs.pojo.annotations.BsonProperty) r2
            java.lang.String r2 = r2.value()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r3)
        L69:
            int r0 = r0 + 1
            goto L2c
        L6c:
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r4.properties
            int r5 = r5.size()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.params = r5
        L76:
            return
    }

    private void constructInstanceAndProcessCachedValues() {
            r3 = this;
            org.bson.codecs.pojo.CreatorExecutable<T> r0 = r3.creatorExecutable     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r1 = r3.params     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = r0.getInstance(r1)     // Catch: java.lang.Exception -> L2f
            r3.newInstance = r0     // Catch: java.lang.Exception -> L2f
            java.util.Map<org.bson.codecs.pojo.PropertyModel<?>, java.lang.Object> r0 = r3.cachedValues
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            org.bson.codecs.pojo.PropertyModel r2 = (org.bson.codecs.pojo.PropertyModel) r2
            java.lang.Object r1 = r1.getValue()
            r3.setPropertyValue(r2, r1)
            goto L14
        L2e:
            return
        L2f:
            r0 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    private <S> void setPropertyValue(org.bson.codecs.pojo.PropertyModel<S> r1, java.lang.Object r2) {
            r0 = this;
            r0.set(r2, r1)
            return
    }

    @Override // org.bson.codecs.pojo.InstanceCreator
    public T getInstance() {
            r5 = this;
            T r0 = r5.newInstance
            if (r0 != 0) goto L54
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.properties     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.util.Set r0 = r0.entrySet()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
        Le:
            boolean r1 = r0.hasNext()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.lang.Object[] r2 = r5.params     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.lang.Object r1 = r1.getValue()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            int r1 = r1.intValue()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            r3 = 0
            r2[r1] = r3     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            goto Le
        L2a:
            r5.constructInstanceAndProcessCachedValues()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L2e
            goto L54
        L2e:
            r0 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            org.bson.codecs.pojo.CreatorExecutable<T> r4 = r5.creatorExecutable
            java.lang.Class r4 = r4.getType()
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            r3 = 1
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r5.properties
            java.util.Set r4 = r4.keySet()
            r2[r3] = r4
            java.lang.String r3 = "Could not construct new instance of: %s. Missing the following properties: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2, r0)
            throw r1
        L54:
            T r0 = r5.newInstance
            return r0
    }

    @Override // org.bson.codecs.pojo.InstanceCreator
    public <S> void set(S r4, org.bson.codecs.pojo.PropertyModel<S> r5) {
            r3 = this;
            T r0 = r3.newInstance
            if (r0 == 0) goto Le
            org.bson.codecs.pojo.PropertyAccessor r5 = r5.getPropertyAccessor()
            T r0 = r3.newInstance
            r5.set(r0, r4)
            goto L4e
        Le:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.properties
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            java.lang.String r0 = r5.getWriteName()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.properties
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L26
            java.lang.String r0 = r5.getName()
        L26:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.properties
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L38
            java.lang.Object[] r2 = r3.params
            int r1 = r1.intValue()
            r2[r1] = r4
        L38:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.properties
            r1.remove(r0)
        L3d:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.properties
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L49
            r3.constructInstanceAndProcessCachedValues()
            goto L4e
        L49:
            java.util.Map<org.bson.codecs.pojo.PropertyModel<?>, java.lang.Object> r0 = r3.cachedValues
            r0.put(r5, r4)
        L4e:
            return
    }
}
