package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
public class ClassModelBuilder<T> {
    private java.util.List<java.lang.annotation.Annotation> annotations;
    private java.util.List<org.bson.codecs.pojo.Convention> conventions;
    private java.lang.String discriminator;
    private boolean discriminatorEnabled;
    private java.lang.String discriminatorKey;
    private org.bson.codecs.pojo.IdGenerator<?> idGenerator;
    private java.lang.String idPropertyName;
    private org.bson.codecs.pojo.InstanceCreatorFactory<T> instanceCreatorFactory;
    private final java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> propertyModelBuilders;
    private java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> propertyNameToTypeParameterMap;
    private java.lang.Class<T> type;

    public ClassModelBuilder(java.lang.Class<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.propertyModelBuilders = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.propertyNameToTypeParameterMap = r0
            java.util.List<org.bson.codecs.pojo.Convention> r0 = org.bson.codecs.pojo.Conventions.DEFAULT_CONVENTIONS
            r1.conventions = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.annotations = r0
            java.lang.String r0 = "type"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.Class r2 = (java.lang.Class) r2
            org.bson.codecs.pojo.PojoBuilderHelper.configureClassModelBuilder(r1, r2)
            return
    }

    private void checkForDuplicates(java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.Integer> r6, java.lang.String r7) {
            r3 = this;
            boolean r0 = r6.containsKey(r5)
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6.put(r5, r4)
            return
        Lf:
            org.bson.codecs.configuration.CodecConfigurationException r6 = new org.bson.codecs.configuration.CodecConfigurationException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            r0[r1] = r5
            r4 = 2
            r0[r4] = r7
            java.lang.String r4 = "Duplicate %s named '%s' found in %s."
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r6.<init>(r4)
            throw r6
    }

    private void validatePropertyModels(java.lang.String r7, java.util.List<org.bson.codecs.pojo.PropertyModel<?>> r8) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L13:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r8.next()
            org.bson.codecs.pojo.PropertyModel r3 = (org.bson.codecs.pojo.PropertyModel) r3
            boolean r4 = r3.hasError()
            if (r4 != 0) goto L4d
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "property"
            r6.checkForDuplicates(r5, r4, r0, r7)
            boolean r4 = r3.isReadable()
            if (r4 == 0) goto L3d
            java.lang.String r4 = r3.getReadName()
            java.lang.String r5 = "read property"
            r6.checkForDuplicates(r5, r4, r1, r7)
        L3d:
            boolean r4 = r3.isWritable()
            if (r4 == 0) goto L13
            java.lang.String r3 = r3.getWriteName()
            java.lang.String r4 = "write property"
            r6.checkForDuplicates(r4, r3, r2, r7)
            goto L13
        L4d:
            org.bson.codecs.configuration.CodecConfigurationException r7 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r8 = r3.getError()
            r7.<init>(r8)
            throw r7
        L57:
            java.lang.String r7 = r6.idPropertyName
            if (r7 == 0) goto L76
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L62
            goto L76
        L62:
            org.bson.codecs.configuration.CodecConfigurationException r7 = new org.bson.codecs.configuration.CodecConfigurationException
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r0 = 0
            java.lang.String r1 = r6.idPropertyName
            r8[r0] = r1
            java.lang.String r0 = "Invalid id property, property named '%s' can not be found."
            java.lang.String r8 = java.lang.String.format(r0, r8)
            r7.<init>(r8)
            throw r7
        L76:
            return
    }

    public final org.bson.codecs.pojo.ClassModelBuilder<T> addProperty(org.bson.codecs.pojo.PropertyModelBuilder<?> r3) {
            r2 = this;
            java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> r0 = r2.propertyModelBuilders
            java.lang.String r1 = "propertyModelBuilder"
            java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r1, r3)
            r0.add(r3)
            return r2
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> annotations(java.util.List<java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.List r2 = (java.util.List) r2
            r1.annotations = r2
            return r1
    }

    public org.bson.codecs.pojo.ClassModel<T> build() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<T> r1 = r12.type
            java.lang.String r2 = "type"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
            java.util.List<org.bson.codecs.pojo.Convention> r1 = r12.conventions
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            org.bson.codecs.pojo.Convention r2 = (org.bson.codecs.pojo.Convention) r2
            r2.apply(r12)
            goto L12
        L22:
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r1 = r12.instanceCreatorFactory
            java.lang.String r2 = "instanceCreatorFactory"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
            boolean r1 = r12.discriminatorEnabled
            if (r1 == 0) goto L3b
            java.lang.String r1 = r12.discriminatorKey
            java.lang.String r2 = "discriminatorKey"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
            java.lang.String r1 = r12.discriminator
            java.lang.String r2 = "discriminator"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
        L3b:
            java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> r1 = r12.propertyModelBuilders
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r1.next()
            org.bson.codecs.pojo.PropertyModelBuilder r3 = (org.bson.codecs.pojo.PropertyModelBuilder) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = r12.idPropertyName
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L63
            java.lang.String r5 = "_id"
            org.bson.codecs.pojo.PropertyModelBuilder r6 = r3.readName(r5)
            r6.writeName(r5)
        L63:
            org.bson.codecs.pojo.PropertyModel r3 = r3.build()
            r0.add(r3)
            if (r4 == 0) goto L42
            r2 = r3
            goto L42
        L6e:
            java.lang.Class<T> r1 = r12.type
            java.lang.String r1 = r1.getSimpleName()
            r12.validatePropertyModels(r1, r0)
            org.bson.codecs.pojo.ClassModel r1 = new org.bson.codecs.pojo.ClassModel
            java.lang.Class<T> r4 = r12.type
            java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r5 = r12.propertyNameToTypeParameterMap
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r6 = r12.instanceCreatorFactory
            boolean r3 = r12.discriminatorEnabled
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            java.lang.String r8 = r12.discriminatorKey
            java.lang.String r9 = r12.discriminator
            java.lang.Class<T> r3 = r12.type
            org.bson.codecs.pojo.IdGenerator<?> r10 = r12.idGenerator
            org.bson.codecs.pojo.IdPropertyModelHolder r10 = org.bson.codecs.pojo.IdPropertyModelHolder.create(r3, r2, r10)
            java.util.List r11 = java.util.Collections.unmodifiableList(r0)
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> conventions(java.util.List<org.bson.codecs.pojo.Convention> r2) {
            r1 = this;
            java.lang.String r0 = "conventions"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.List r2 = (java.util.List) r2
            r1.conventions = r2
            return r1
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> discriminator(java.lang.String r1) {
            r0 = this;
            r0.discriminator = r1
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> discriminatorKey(java.lang.String r1) {
            r0 = this;
            r0.discriminatorKey = r1
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> enableDiscriminator(boolean r1) {
            r0 = this;
            r0.discriminatorEnabled = r1
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.util.List<java.lang.annotation.Annotation> r0 = r1.annotations
            return r0
    }

    public java.util.List<org.bson.codecs.pojo.Convention> getConventions() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.Convention> r0 = r1.conventions
            return r0
    }

    public java.lang.String getDiscriminator() {
            r1 = this;
            java.lang.String r0 = r1.discriminator
            return r0
    }

    public java.lang.String getDiscriminatorKey() {
            r1 = this;
            java.lang.String r0 = r1.discriminatorKey
            return r0
    }

    public org.bson.codecs.pojo.IdGenerator<?> getIdGenerator() {
            r1 = this;
            org.bson.codecs.pojo.IdGenerator<?> r0 = r1.idGenerator
            return r0
    }

    public java.lang.String getIdPropertyName() {
            r1 = this;
            java.lang.String r0 = r1.idPropertyName
            return r0
    }

    public org.bson.codecs.pojo.InstanceCreatorFactory<T> getInstanceCreatorFactory() {
            r1 = this;
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r0 = r1.instanceCreatorFactory
            return r0
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<?> getProperty(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "propertyName"
            org.bson.assertions.Assertions.notNull(r0, r4)
            java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> r0 = r3.propertyModelBuilders
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModelBuilder r1 = (org.bson.codecs.pojo.PropertyModelBuilder) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Lb
            return r1
        L22:
            r4 = 0
            return r4
    }

    public java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> getPropertyModelBuilders() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> r0 = r1.propertyModelBuilders
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> idGenerator(org.bson.codecs.pojo.IdGenerator<?> r1) {
            r0 = this;
            r0.idGenerator = r1
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> idPropertyName(java.lang.String r1) {
            r0 = this;
            r0.idPropertyName = r1
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> instanceCreatorFactory(org.bson.codecs.pojo.InstanceCreatorFactory<T> r2) {
            r1 = this;
            java.lang.String r0 = "instanceCreatorFactory"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.pojo.InstanceCreatorFactory r2 = (org.bson.codecs.pojo.InstanceCreatorFactory) r2
            r1.instanceCreatorFactory = r2
            return r1
    }

    public final org.bson.codecs.pojo.ClassModelBuilder<T> propertyNameToTypeParameterMap(java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r2) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            r1.propertyNameToTypeParameterMap = r2
            return r1
    }

    public boolean removeProperty(java.lang.String r3) {
            r2 = this;
            java.util.List<org.bson.codecs.pojo.PropertyModelBuilder<?>> r0 = r2.propertyModelBuilders
            java.lang.String r1 = "propertyName"
            java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r1, r3)
            java.lang.String r3 = (java.lang.String) r3
            org.bson.codecs.pojo.PropertyModelBuilder r3 = r2.getProperty(r3)
            boolean r3 = r0.remove(r3)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<T> r1 = r3.type
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "ClassModelBuilder{type=%s}"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public org.bson.codecs.pojo.ClassModelBuilder<T> type(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.type = r2
            return r1
    }

    public java.lang.Boolean useDiscriminator() {
            r1 = this;
            boolean r0 = r1.discriminatorEnabled
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
