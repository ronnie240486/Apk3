package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class PojoCodecImpl<T> extends org.bson.codecs.pojo.PojoCodec<T> {
    private static final org.bson.diagnostics.Logger LOGGER = null;
    private final org.bson.codecs.pojo.ClassModel<T> classModel;
    private final java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> codecCache;
    private final org.bson.codecs.pojo.DiscriminatorLookup discriminatorLookup;
    private final org.bson.codecs.pojo.PropertyCodecRegistry propertyCodecRegistry;
    private final org.bson.codecs.configuration.CodecRegistry registry;
    private final boolean specialized;

    static {
            java.lang.String r0 = "PojoCodec"
            org.bson.diagnostics.Logger r0 = org.bson.diagnostics.Loggers.getLogger(r0)
            org.bson.codecs.pojo.PojoCodecImpl.LOGGER = r0
            return
    }

    public PojoCodecImpl(org.bson.codecs.pojo.ClassModel<T> r5, org.bson.codecs.configuration.CodecRegistry r6, java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r7, org.bson.codecs.pojo.DiscriminatorLookup r8) {
            r4 = this;
            r4.<init>()
            r4.classModel = r5
            r0 = 2
            org.bson.codecs.configuration.CodecRegistry[] r0 = new org.bson.codecs.configuration.CodecRegistry[r0]
            r1 = 1
            org.bson.codecs.Codec[] r2 = new org.bson.codecs.Codec[r1]
            r3 = 0
            r2[r3] = r4
            org.bson.codecs.configuration.CodecRegistry r2 = org.bson.codecs.configuration.CodecRegistries.fromCodecs(r2)
            r0[r3] = r2
            r0[r1] = r6
            org.bson.codecs.configuration.CodecRegistry r6 = org.bson.codecs.configuration.CodecRegistries.fromRegistries(r0)
            r4.registry = r6
            r4.discriminatorLookup = r8
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r8.<init>()
            r4.codecCache = r8
            org.bson.codecs.pojo.PropertyCodecRegistryImpl r8 = new org.bson.codecs.pojo.PropertyCodecRegistryImpl
            r8.<init>(r4, r6, r7)
            r4.propertyCodecRegistry = r8
            boolean r5 = shouldSpecialize(r5)
            r4.specialized = r5
            r4.specialize()
            return
    }

    public PojoCodecImpl(org.bson.codecs.pojo.ClassModel r4, org.bson.codecs.configuration.CodecRegistry r5, org.bson.codecs.pojo.PropertyCodecRegistry r6, org.bson.codecs.pojo.DiscriminatorLookup r7, java.util.concurrent.ConcurrentMap r8) {
            r3 = this;
            r3.<init>()
            r3.classModel = r4
            r4 = 2
            org.bson.codecs.configuration.CodecRegistry[] r4 = new org.bson.codecs.configuration.CodecRegistry[r4]
            r0 = 1
            org.bson.codecs.Codec[] r1 = new org.bson.codecs.Codec[r0]
            r2 = 0
            r1[r2] = r3
            org.bson.codecs.configuration.CodecRegistry r1 = org.bson.codecs.configuration.CodecRegistries.fromCodecs(r1)
            r4[r2] = r1
            r4[r0] = r5
            org.bson.codecs.configuration.CodecRegistry r4 = org.bson.codecs.configuration.CodecRegistries.fromRegistries(r4)
            r3.registry = r4
            r3.discriminatorLookup = r7
            r3.codecCache = r8
            r3.propertyCodecRegistry = r6
            r3.specialized = r0
            r3.specialize()
            return
    }

    private <S> void addToCache(org.bson.codecs.pojo.PropertyModel<S> r2) {
            r1 = this;
            org.bson.codecs.Codec r0 = r2.getCodec()
            if (r0 == 0) goto Lb
            org.bson.codecs.Codec r0 = r2.getCodec()
            goto Lf
        Lb:
            org.bson.codecs.Codec r0 = r1.specializePojoCodec(r2)
        Lf:
            r2.cachedCodec(r0)
            return
    }

    private <S, V> boolean areEquivalentTypes(java.lang.Class<S> r3, java.lang.Class<V> r4) {
            r2 = this;
            boolean r0 = r3.equals(r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L19
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L19
            return r1
        L19:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L2a
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L2a
            return r1
        L2a:
            r3 = 0
            return r3
    }

    private void decodeProperties(org.bson.BsonReader r9, org.bson.codecs.DecoderContext r10, org.bson.codecs.pojo.InstanceCreator<T> r11) {
            r8 = this;
            r9.readStartDocument()
        L3:
            org.bson.BsonType r0 = r9.readBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            if (r0 == r1) goto L35
            java.lang.String r6 = r9.readName()
            org.bson.codecs.pojo.ClassModel<T> r0 = r8.classModel
            boolean r0 = r0.useDiscriminator()
            if (r0 == 0) goto L27
            org.bson.codecs.pojo.ClassModel<T> r0 = r8.classModel
            java.lang.String r0 = r0.getDiscriminatorKey()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L27
            r9.readString()
            goto L3
        L27:
            org.bson.codecs.pojo.ClassModel<T> r0 = r8.classModel
            org.bson.codecs.pojo.PropertyModel r7 = r8.getPropertyModelByWriteName(r0, r6)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.decodePropertyModel(r3, r4, r5, r6, r7)
            goto L3
        L35:
            r9.readEndDocument()
            return
    }

    private <S> void decodePropertyModel(org.bson.BsonReader r9, org.bson.codecs.DecoderContext r10, org.bson.codecs.pojo.InstanceCreator<T> r11, java.lang.String r12, org.bson.codecs.pojo.PropertyModel<S> r13) {
            r8 = this;
            java.lang.String r0 = "Failed to decode '%s'. Decoding '%s' errored with: %s"
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L61
            r3 = 0
            r4 = 2
            r5 = 3
            org.bson.BsonType r6 = r9.getCurrentBsonType()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            org.bson.BsonType r7 = org.bson.BsonType.NULL     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            if (r6 != r7) goto L15
            r9.readNull()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            goto L1d
        L15:
            org.bson.codecs.Codec r3 = r13.getCachedCodec()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            java.lang.Object r3 = r10.decodeWithChildContext(r3, r9)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
        L1d:
            boolean r9 = r13.isWritable()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            if (r9 == 0) goto L79
            r11.set(r3, r13)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L27 org.bson.BsonInvalidOperationException -> L44
            goto L79
        L27:
            r9 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r10 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r11 = new java.lang.Object[r5]
            org.bson.codecs.pojo.ClassModel<T> r13 = r8.classModel
            java.lang.String r13 = r13.getName()
            r11[r1] = r13
            r11[r2] = r12
            java.lang.String r12 = r9.getMessage()
            r11[r4] = r12
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r10.<init>(r11, r9)
            throw r10
        L44:
            r9 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r10 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r11 = new java.lang.Object[r5]
            org.bson.codecs.pojo.ClassModel<T> r13 = r8.classModel
            java.lang.String r13 = r13.getName()
            r11[r1] = r13
            r11[r2] = r12
            java.lang.String r12 = r9.getMessage()
            r11[r4] = r12
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r10.<init>(r11, r9)
            throw r10
        L61:
            org.bson.diagnostics.Logger r10 = org.bson.codecs.pojo.PojoCodecImpl.LOGGER
            boolean r11 = r10.isTraceEnabled()
            if (r11 == 0) goto L76
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r1] = r12
            java.lang.String r12 = "Found property not present in the ClassModel: %s"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r10.trace(r11)
        L76:
            r9.skipValue()
        L79:
            return
    }

    private <S> void encodeIdProperty(org.bson.BsonWriter r3, T r4, org.bson.codecs.EncoderContext r5, org.bson.codecs.pojo.IdPropertyModelHolder<S> r6) {
            r2 = this;
            org.bson.codecs.pojo.PropertyModel r0 = r6.getPropertyModel()
            if (r0 == 0) goto L42
            org.bson.codecs.pojo.IdGenerator r0 = r6.getIdGenerator()
            if (r0 != 0) goto L14
            org.bson.codecs.pojo.PropertyModel r6 = r6.getPropertyModel()
            r2.encodeProperty(r3, r4, r5, r6)
            goto L42
        L14:
            org.bson.codecs.pojo.PropertyModel r0 = r6.getPropertyModel()
            org.bson.codecs.pojo.PropertyAccessor r0 = r0.getPropertyAccessor()
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto L3b
            boolean r1 = r5.isEncodingCollectibleDocument()
            if (r1 == 0) goto L3b
            org.bson.codecs.pojo.IdGenerator r0 = r6.getIdGenerator()
            java.lang.Object r0 = r0.generate()
            org.bson.codecs.pojo.PropertyModel r1 = r6.getPropertyModel()     // Catch: java.lang.Exception -> L3b
            org.bson.codecs.pojo.PropertyAccessor r1 = r1.getPropertyAccessor()     // Catch: java.lang.Exception -> L3b
            r1.set(r4, r0)     // Catch: java.lang.Exception -> L3b
        L3b:
            org.bson.codecs.pojo.PropertyModel r4 = r6.getPropertyModel()
            r2.encodeValue(r3, r5, r4, r0)
        L42:
            return
    }

    private <S> void encodeProperty(org.bson.BsonWriter r2, T r3, org.bson.codecs.EncoderContext r4, org.bson.codecs.pojo.PropertyModel<S> r5) {
            r1 = this;
            if (r5 == 0) goto L13
            boolean r0 = r5.isReadable()
            if (r0 == 0) goto L13
            org.bson.codecs.pojo.PropertyAccessor r0 = r5.getPropertyAccessor()
            java.lang.Object r3 = r0.get(r3)
            r1.encodeValue(r2, r4, r5, r3)
        L13:
            return
    }

    private <S> void encodeValue(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, org.bson.codecs.pojo.PropertyModel<S> r5, S r6) {
            r2 = this;
            boolean r0 = r5.shouldSerialize(r6)
            if (r0 == 0) goto L42
            java.lang.String r0 = r5.getReadName()
            r3.writeName(r0)
            if (r6 != 0) goto L13
            r3.writeNull()
            goto L42
        L13:
            org.bson.codecs.Codec r0 = r5.getCachedCodec()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L1b
            r4.encodeWithChildContext(r0, r3, r6)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L1b
            goto L42
        L1b:
            r3 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r4 = new org.bson.codecs.configuration.CodecConfigurationException
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r0 = 0
            org.bson.codecs.pojo.ClassModel<T> r1 = r2.classModel
            java.lang.String r1 = r1.getName()
            r6[r0] = r1
            r0 = 1
            java.lang.String r5 = r5.getReadName()
            r6[r0] = r5
            r5 = 2
            java.lang.String r0 = r3.getMessage()
            r6[r5] = r0
            java.lang.String r5 = "Failed to encode '%s'. Encoding '%s' errored with: %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            r4.<init>(r5, r3)
            throw r4
        L42:
            return
    }

    private org.bson.codecs.Codec<T> getCodecFromDocument(org.bson.BsonReader r5, boolean r6, java.lang.String r7, org.bson.codecs.configuration.CodecRegistry r8, org.bson.codecs.pojo.DiscriminatorLookup r9, org.bson.codecs.Codec<T> r10) {
            r4 = this;
            if (r6 == 0) goto L53
            org.bson.BsonReaderMark r6 = r5.getMark()
            r5.readStartDocument()
            r0 = 0
            r1 = 0
        Lb:
            if (r1 != 0) goto L50
            org.bson.BsonType r2 = r5.readBsonType()
            org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT
            if (r2 == r3) goto L50
            java.lang.String r2 = r5.readName()
            boolean r2 = r7.equals(r2)
            r3 = 1
            if (r2 == 0) goto L4c
            java.lang.String r10 = r5.readString()     // Catch: java.lang.Exception -> L2e
            java.lang.Class r10 = r9.lookup(r10)     // Catch: java.lang.Exception -> L2e
            org.bson.codecs.Codec r10 = r8.get(r10)     // Catch: java.lang.Exception -> L2e
            r1 = 1
            goto Lb
        L2e:
            r5 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r6 = new org.bson.codecs.configuration.CodecConfigurationException
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            org.bson.codecs.pojo.ClassModel<T> r8 = r4.classModel
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            java.lang.String r8 = r5.getMessage()
            r7[r3] = r8
            java.lang.String r8 = "Failed to decode '%s'. Decoding errored with: %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r6.<init>(r7, r5)
            throw r6
        L4c:
            r5.skipValue()
            goto Lb
        L50:
            r6.reset()
        L53:
            return r10
    }

    private <S> org.bson.codecs.Codec<S> getCodecFromPropertyRegistry(org.bson.codecs.pojo.PropertyModel<S> r3) {
            r2 = this;
            org.bson.codecs.pojo.PropertyCodecRegistry r0 = r2.propertyCodecRegistry     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> Lb
            org.bson.codecs.pojo.TypeData r1 = r3.getTypeData()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> Lb
            org.bson.codecs.Codec r3 = r0.get(r1)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> Lb
            return r3
        Lb:
            r0 = move-exception
            org.bson.codecs.pojo.LazyMissingCodec r1 = new org.bson.codecs.pojo.LazyMissingCodec
            org.bson.codecs.pojo.TypeData r3 = r3.getTypeData()
            java.lang.Class r3 = r3.getType()
            r1.<init>(r3, r0)
            return r1
    }

    private org.bson.codecs.pojo.PropertyModel<?> getPropertyModelByWriteName(org.bson.codecs.pojo.ClassModel<T> r3, java.lang.String r4) {
            r2 = this;
            java.util.List r3 = r3.getPropertyModels()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            org.bson.codecs.pojo.PropertyModel r0 = (org.bson.codecs.pojo.PropertyModel) r0
            boolean r1 = r0.isWritable()
            if (r1 == 0) goto L8
            java.lang.String r1 = r0.getWriteName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L8
            return r0
        L25:
            r3 = 0
            return r3
    }

    private <S, V> org.bson.codecs.pojo.ClassModel<S> getSpecializedClassModel(org.bson.codecs.pojo.ClassModel<S> r14, org.bson.codecs.pojo.PropertyModel<V> r15) {
            r13 = this;
            java.lang.Boolean r0 = r15.useDiscriminator()
            if (r0 != 0) goto Lb
            boolean r0 = r14.useDiscriminator()
            goto L13
        Lb:
            java.lang.Boolean r0 = r15.useDiscriminator()
            boolean r0 = r0.booleanValue()
        L13:
            java.lang.String r1 = r14.getDiscriminatorKey()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            java.lang.String r1 = r14.getDiscriminator()
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            boolean r4 = r14.useDiscriminator()
            if (r0 == r4) goto L2d
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            org.bson.codecs.pojo.TypeData r0 = r15.getTypeData()
            java.util.List r0 = r0.getTypeParameters()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3f
            if (r2 != 0) goto L3f
            return r14
        L3f:
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r0 = r14.getPropertyModels()
            r12.<init>(r0)
            org.bson.codecs.pojo.PropertyModel r0 = r14.getIdPropertyModel()
            org.bson.codecs.pojo.TypeData r1 = r15.getTypeData()
            java.util.List r1 = r1.getTypeParameters()
        L54:
            int r4 = r12.size()
            if (r3 >= r4) goto L8b
            java.lang.Object r4 = r12.get(r3)
            org.bson.codecs.pojo.PropertyModel r4 = (org.bson.codecs.pojo.PropertyModel) r4
            java.lang.String r5 = r4.getName()
            java.util.Map r6 = r14.getPropertyNameToTypeParameterMap()
            java.lang.Object r6 = r6.get(r5)
            org.bson.codecs.pojo.TypeParameterMap r6 = (org.bson.codecs.pojo.TypeParameterMap) r6
            boolean r7 = r6.hasTypeParameters()
            if (r7 == 0) goto L88
            org.bson.codecs.pojo.PropertyModel r4 = r13.getSpecializedPropertyModel(r4, r6, r1)
            r12.set(r3, r4)
            if (r0 == 0) goto L88
            java.lang.String r6 = r0.getName()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L88
            r0 = r4
        L88:
            int r3 = r3 + 1
            goto L54
        L8b:
            if (r2 == 0) goto L96
            java.lang.Boolean r15 = r15.useDiscriminator()
            boolean r15 = r15.booleanValue()
            goto L9a
        L96:
            boolean r15 = r14.useDiscriminator()
        L9a:
            org.bson.codecs.pojo.ClassModel r1 = new org.bson.codecs.pojo.ClassModel
            java.lang.Class r5 = r14.getType()
            java.util.Map r6 = r14.getPropertyNameToTypeParameterMap()
            org.bson.codecs.pojo.InstanceCreatorFactory r7 = r14.getInstanceCreatorFactory()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r15)
            java.lang.String r9 = r14.getDiscriminatorKey()
            java.lang.String r10 = r14.getDiscriminator()
            org.bson.codecs.pojo.IdPropertyModelHolder r11 = org.bson.codecs.pojo.IdPropertyModelHolder.create(r14, r0)
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    private <V> org.bson.codecs.pojo.PropertyModel<V> getSpecializedPropertyModel(org.bson.codecs.pojo.PropertyModel<V> r11, org.bson.codecs.pojo.TypeParameterMap r12, java.util.List<org.bson.codecs.pojo.TypeData<?>> r13) {
            r10 = this;
            java.util.Map r12 = r12.getPropertyToClassParamIndexMap()
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1d
            int r12 = r0.intValue()
            java.lang.Object r12 = r13.get(r12)
            org.bson.codecs.pojo.TypeData r12 = (org.bson.codecs.pojo.TypeData) r12
        L1b:
            r4 = r12
            goto L7e
        L1d:
            org.bson.codecs.pojo.TypeData r0 = r11.getTypeData()
            java.lang.Class r0 = r0.getType()
            org.bson.codecs.pojo.TypeData$Builder r0 = org.bson.codecs.pojo.TypeData.builder(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            org.bson.codecs.pojo.TypeData r2 = r11.getTypeData()
            java.util.List r2 = r2.getTypeParameters()
            r1.<init>(r2)
            r2 = 0
        L37:
            int r3 = r1.size()
            if (r2 >= r3) goto L76
            java.util.Set r3 = r12.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L45:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L45
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r13.get(r4)
            r1.set(r2, r4)
            goto L45
        L73:
            int r2 = r2 + 1
            goto L37
        L76:
            r0.addTypeParameters(r1)
            org.bson.codecs.pojo.TypeData r12 = r0.build()
            goto L1b
        L7e:
            org.bson.codecs.pojo.TypeData r12 = r11.getTypeData()
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L89
            return r11
        L89:
            org.bson.codecs.pojo.PropertyModel r12 = new org.bson.codecs.pojo.PropertyModel
            java.lang.String r1 = r11.getName()
            java.lang.String r2 = r11.getReadName()
            java.lang.String r3 = r11.getWriteName()
            r5 = 0
            org.bson.codecs.pojo.PropertySerialization r6 = r11.getPropertySerialization()
            java.lang.Boolean r7 = r11.useDiscriminator()
            org.bson.codecs.pojo.PropertyAccessor r8 = r11.getPropertyAccessor()
            java.lang.String r9 = r11.getError()
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
    }

    private static <T> boolean shouldSpecialize(org.bson.codecs.pojo.ClassModel<T> r4) {
            boolean r0 = r4.hasTypeParameters()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.Map r0 = r4.getPropertyNameToTypeParameterMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            org.bson.codecs.pojo.TypeParameterMap r3 = (org.bson.codecs.pojo.TypeParameterMap) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            org.bson.codecs.pojo.PropertyModel r2 = r4.getPropertyModel(r2)
            boolean r3 = r3.hasTypeParameters()
            if (r3 == 0) goto L14
            if (r2 == 0) goto L3e
            org.bson.codecs.Codec r2 = r2.getCodec()
            if (r2 != 0) goto L14
        L3e:
            r4 = 0
            return r4
        L40:
            return r1
    }

    private void specialize() {
            r2 = this;
            boolean r0 = r2.specialized
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r0 = r2.codecCache
            org.bson.codecs.pojo.ClassModel<T> r1 = r2.classModel
            r0.put(r1, r2)
            org.bson.codecs.pojo.ClassModel<T> r0 = r2.classModel
            java.util.List r0 = r0.getPropertyModels()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModel r1 = (org.bson.codecs.pojo.PropertyModel) r1
            r2.addToCache(r1)
            goto L15
        L25:
            return
    }

    private <S> org.bson.codecs.Codec<S> specializePojoCodec(org.bson.codecs.pojo.PropertyModel<S> r8) {
            r7 = this;
            org.bson.codecs.Codec r0 = r7.getCodecFromPropertyRegistry(r8)
            boolean r1 = r0 instanceof org.bson.codecs.pojo.PojoCodec
            if (r1 == 0) goto L32
            org.bson.codecs.pojo.PojoCodec r0 = (org.bson.codecs.pojo.PojoCodec) r0
            org.bson.codecs.pojo.ClassModel r0 = r0.getClassModel()
            org.bson.codecs.pojo.ClassModel r2 = r7.getSpecializedClassModel(r0, r8)
            java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r8 = r7.codecCache
            boolean r8 = r8.containsKey(r2)
            if (r8 == 0) goto L24
            java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r8 = r7.codecCache
            java.lang.Object r8 = r8.get(r2)
            r0 = r8
            org.bson.codecs.Codec r0 = (org.bson.codecs.Codec) r0
            goto L32
        L24:
            org.bson.codecs.pojo.LazyPojoCodec r0 = new org.bson.codecs.pojo.LazyPojoCodec
            org.bson.codecs.configuration.CodecRegistry r3 = r7.registry
            org.bson.codecs.pojo.PropertyCodecRegistry r4 = r7.propertyCodecRegistry
            org.bson.codecs.pojo.DiscriminatorLookup r5 = r7.discriminatorLookup
            java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r6 = r7.codecCache
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L32:
            return r0
    }

    @Override // org.bson.codecs.Decoder
    public T decode(org.bson.BsonReader r10, org.bson.codecs.DecoderContext r11) {
            r9 = this;
            boolean r0 = r11.hasCheckedDiscriminator()
            r1 = 1
            if (r0 == 0) goto L30
            boolean r0 = r9.specialized
            if (r0 == 0) goto L19
            org.bson.codecs.pojo.ClassModel<T> r0 = r9.classModel
            org.bson.codecs.pojo.InstanceCreator r0 = r0.getInstanceCreator()
            r9.decodeProperties(r10, r11, r0)
            java.lang.Object r10 = r0.getInstance()
            return r10
        L19:
            org.bson.codecs.configuration.CodecConfigurationException r10 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r0 = 0
            org.bson.codecs.pojo.ClassModel<T> r1 = r9.classModel
            java.lang.String r1 = r1.getName()
            r11[r0] = r1
            java.lang.String r0 = "%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec."
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r10.<init>(r11)
            throw r10
        L30:
            org.bson.codecs.pojo.ClassModel<T> r11 = r9.classModel
            boolean r4 = r11.useDiscriminator()
            org.bson.codecs.pojo.ClassModel<T> r11 = r9.classModel
            java.lang.String r5 = r11.getDiscriminatorKey()
            org.bson.codecs.configuration.CodecRegistry r6 = r9.registry
            org.bson.codecs.pojo.DiscriminatorLookup r7 = r9.discriminatorLookup
            r2 = r9
            r3 = r10
            r8 = r9
            org.bson.codecs.Codec r11 = r2.getCodecFromDocument(r3, r4, r5, r6, r7, r8)
            org.bson.codecs.DecoderContext$Builder r0 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext$Builder r0 = r0.checkedDiscriminator(r1)
            org.bson.codecs.DecoderContext r0 = r0.build()
            java.lang.Object r10 = r11.decode(r10, r0)
            return r10
    }

    @Override // org.bson.codecs.Encoder
    public void encode(org.bson.BsonWriter r4, T r5, org.bson.codecs.EncoderContext r6) {
            r3 = this;
            boolean r0 = r3.specialized
            if (r0 == 0) goto L70
            java.lang.Class r0 = r5.getClass()
            org.bson.codecs.pojo.ClassModel<T> r1 = r3.classModel
            java.lang.Class r1 = r1.getType()
            boolean r0 = r3.areEquivalentTypes(r0, r1)
            if (r0 == 0) goto L62
            r4.writeStartDocument()
            org.bson.codecs.pojo.ClassModel<T> r0 = r3.classModel
            org.bson.codecs.pojo.IdPropertyModelHolder r0 = r0.getIdPropertyModelHolder()
            r3.encodeIdProperty(r4, r5, r6, r0)
            org.bson.codecs.pojo.ClassModel<T> r0 = r3.classModel
            boolean r0 = r0.useDiscriminator()
            if (r0 == 0) goto L37
            org.bson.codecs.pojo.ClassModel<T> r0 = r3.classModel
            java.lang.String r0 = r0.getDiscriminatorKey()
            org.bson.codecs.pojo.ClassModel<T> r1 = r3.classModel
            java.lang.String r1 = r1.getDiscriminator()
            r4.writeString(r0, r1)
        L37:
            org.bson.codecs.pojo.ClassModel<T> r0 = r3.classModel
            java.util.List r0 = r0.getPropertyModels()
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModel r1 = (org.bson.codecs.pojo.PropertyModel) r1
            org.bson.codecs.pojo.ClassModel<T> r2 = r3.classModel
            org.bson.codecs.pojo.PropertyModel r2 = r2.getIdPropertyModel()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L5a
            goto L41
        L5a:
            r3.encodeProperty(r4, r5, r6, r1)
            goto L41
        L5e:
            r4.writeEndDocument()
            goto L6f
        L62:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class r1 = r5.getClass()
            org.bson.codecs.Codec r0 = r0.get(r1)
            r0.encode(r4, r5, r6)
        L6f:
            return
        L70:
            org.bson.codecs.configuration.CodecConfigurationException r4 = new org.bson.codecs.configuration.CodecConfigurationException
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            org.bson.codecs.pojo.ClassModel<T> r0 = r3.classModel
            java.lang.String r0 = r0.getName()
            r5[r6] = r0
            java.lang.String r6 = "%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec."
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r4.<init>(r5)
            throw r4
    }

    @Override // org.bson.codecs.pojo.PojoCodec
    public final org.bson.codecs.pojo.ClassModel<T> getClassModel() {
            r1 = this;
            org.bson.codecs.pojo.ClassModel<T> r0 = r1.classModel
            return r0
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<T> getEncoderClass() {
            r1 = this;
            org.bson.codecs.pojo.ClassModel<T> r0 = r1.classModel
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.bson.codecs.pojo.ClassModel<T> r1 = r3.classModel
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "PojoCodec<%s>"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
