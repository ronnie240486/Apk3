package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
public final class PropertyModelBuilder<T> {
    private org.bson.codecs.Codec<T> codec;
    private java.lang.Boolean discriminatorEnabled;
    private java.lang.String error;
    private java.lang.String name;
    private org.bson.codecs.pojo.PropertyAccessor<T> propertyAccessor;
    private org.bson.codecs.pojo.PropertySerialization<T> propertySerialization;
    private java.util.List<java.lang.annotation.Annotation> readAnnotations;
    private java.lang.String readName;
    private org.bson.codecs.pojo.TypeData<T> typeData;
    private java.util.List<java.lang.annotation.Annotation> writeAnnotations;
    private java.lang.String writeName;

    public PropertyModelBuilder() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.readAnnotations = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.writeAnnotations = r0
            return
    }

    public org.bson.codecs.pojo.PropertyModel<T> build() {
            r12 = this;
            boolean r0 = r12.isReadable()
            if (r0 != 0) goto L21
            boolean r0 = r12.isWritable()
            if (r0 == 0) goto Ld
            goto L21
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = r12.name
            r1[r2] = r3
            java.lang.String r2 = "Invalid PropertyModel '%s', neither readable or writable,"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L21:
            org.bson.codecs.pojo.PropertyModel r0 = new org.bson.codecs.pojo.PropertyModel
            java.lang.String r3 = r12.name
            java.lang.String r1 = "propertyName"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r1, r3)
            java.lang.String r4 = r12.readName
            java.lang.String r5 = r12.writeName
            org.bson.codecs.pojo.TypeData<T> r6 = r12.typeData
            java.lang.String r1 = "typeData"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r1, r6)
            org.bson.codecs.Codec<T> r7 = r12.codec
            org.bson.codecs.pojo.PropertySerialization<T> r1 = r12.propertySerialization
            java.lang.String r2 = "propertySerialization"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
            r8 = r1
            org.bson.codecs.pojo.PropertySerialization r8 = (org.bson.codecs.pojo.PropertySerialization) r8
            java.lang.Boolean r9 = r12.discriminatorEnabled
            org.bson.codecs.pojo.PropertyAccessor<T> r1 = r12.propertyAccessor
            java.lang.String r2 = "propertyAccessor"
            org.bson.codecs.pojo.PojoBuilderHelper.stateNotNull(r2, r1)
            r10 = r1
            org.bson.codecs.pojo.PropertyAccessor r10 = (org.bson.codecs.pojo.PropertyAccessor) r10
            java.lang.String r11 = r12.error
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> codec(org.bson.codecs.Codec<T> r1) {
            r0 = this;
            r0.codec = r1
            return r0
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> discriminatorEnabled(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.discriminatorEnabled = r1
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.bson.codecs.pojo.PropertyAccessor<T> getPropertyAccessor() {
            r1 = this;
            org.bson.codecs.pojo.PropertyAccessor<T> r0 = r1.propertyAccessor
            return r0
    }

    public org.bson.codecs.pojo.PropertySerialization<T> getPropertySerialization() {
            r1 = this;
            org.bson.codecs.pojo.PropertySerialization<T> r0 = r1.propertySerialization
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> getReadAnnotations() {
            r1 = this;
            java.util.List<java.lang.annotation.Annotation> r0 = r1.readAnnotations
            return r0
    }

    public java.lang.String getReadName() {
            r1 = this;
            java.lang.String r0 = r1.readName
            return r0
    }

    public final org.bson.codecs.pojo.TypeData<T> getTypeData() {
            r1 = this;
            org.bson.codecs.pojo.TypeData<T> r0 = r1.typeData
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> getWriteAnnotations() {
            r1 = this;
            java.util.List<java.lang.annotation.Annotation> r0 = r1.writeAnnotations
            return r0
    }

    public java.lang.String getWriteName() {
            r1 = this;
            java.lang.String r0 = r1.writeName
            return r0
    }

    public java.lang.Boolean isDiscriminatorEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.discriminatorEnabled
            return r0
    }

    public boolean isReadable() {
            r1 = this;
            java.lang.String r0 = r1.readName
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isWritable() {
            r1 = this;
            java.lang.String r0 = r1.writeName
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> propertyAccessor(org.bson.codecs.pojo.PropertyAccessor<T> r1) {
            r0 = this;
            r0.propertyAccessor = r1
            return r0
    }

    public final org.bson.codecs.pojo.PropertyModelBuilder<T> propertyName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "propertyName"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.name = r2
            return r1
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> propertySerialization(org.bson.codecs.pojo.PropertySerialization<T> r2) {
            r1 = this;
            java.lang.String r0 = "propertySerialization"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.pojo.PropertySerialization r2 = (org.bson.codecs.pojo.PropertySerialization) r2
            r1.propertySerialization = r2
            return r1
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> readAnnotations(java.util.List<java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.readAnnotations = r2
            return r1
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> readName(java.lang.String r1) {
            r0 = this;
            r0.readName = r1
            return r0
    }

    public final org.bson.codecs.pojo.PropertyModelBuilder<T> setError(java.lang.String r1) {
            r0 = this;
            r0.error = r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.name
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.pojo.TypeData<T> r1 = r3.typeData
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "PropertyModelBuilder{propertyName=%s, typeData=%s}"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public final org.bson.codecs.pojo.PropertyModelBuilder<T> typeData(org.bson.codecs.pojo.TypeData<T> r2) {
            r1 = this;
            java.lang.String r0 = "typeData"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.pojo.TypeData r2 = (org.bson.codecs.pojo.TypeData) r2
            r1.typeData = r2
            return r1
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> writeAnnotations(java.util.List<java.lang.annotation.Annotation> r1) {
            r0 = this;
            r0.writeAnnotations = r1
            return r0
    }

    public org.bson.codecs.pojo.PropertyModelBuilder<T> writeName(java.lang.String r1) {
            r0 = this;
            r0.writeName = r1
            return r0
    }
}
