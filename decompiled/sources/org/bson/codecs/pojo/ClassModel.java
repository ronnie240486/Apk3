package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
public final class ClassModel<T> {
    private final java.lang.String discriminator;
    private final boolean discriminatorEnabled;
    private final java.lang.String discriminatorKey;
    private final boolean hasTypeParameters;
    private final org.bson.codecs.pojo.IdPropertyModelHolder<?> idPropertyModelHolder;
    private final org.bson.codecs.pojo.InstanceCreatorFactory<T> instanceCreatorFactory;
    private final java.lang.String name;
    private final java.util.List<org.bson.codecs.pojo.PropertyModel<?>> propertyModels;
    private final java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> propertyNameToTypeParameterMap;
    private final java.lang.Class<T> type;

    public ClassModel(java.lang.Class<T> r2, java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r3, org.bson.codecs.pojo.InstanceCreatorFactory<T> r4, java.lang.Boolean r5, java.lang.String r6, java.lang.String r7, org.bson.codecs.pojo.IdPropertyModelHolder<?> r8, java.util.List<org.bson.codecs.pojo.PropertyModel<?>> r9) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getSimpleName()
            r1.name = r0
            r1.type = r2
            java.lang.reflect.TypeVariable[] r2 = r2.getTypeParameters()
            int r2 = r2.length
            if (r2 <= 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.hasTypeParameters = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r3)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.propertyNameToTypeParameterMap = r2
            r1.instanceCreatorFactory = r4
            boolean r2 = r5.booleanValue()
            r1.discriminatorEnabled = r2
            r1.discriminatorKey = r6
            r1.discriminator = r7
            r1.idPropertyModelHolder = r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.propertyModels = r2
            return
    }

    public static <S> org.bson.codecs.pojo.ClassModelBuilder<S> builder(java.lang.Class<S> r1) {
            org.bson.codecs.pojo.ClassModelBuilder r0 = new org.bson.codecs.pojo.ClassModelBuilder
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L99
            java.lang.Class<org.bson.codecs.pojo.ClassModel> r2 = org.bson.codecs.pojo.ClassModel.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            goto L99
        L11:
            org.bson.codecs.pojo.ClassModel r5 = (org.bson.codecs.pojo.ClassModel) r5
            boolean r2 = r4.discriminatorEnabled
            boolean r3 = r5.discriminatorEnabled
            if (r2 == r3) goto L1a
            return r1
        L1a:
            java.lang.Class r2 = r4.getType()
            java.lang.Class r3 = r5.getType()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L29
            return r1
        L29:
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r2 = r4.instanceCreatorFactory
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r3 = r5.instanceCreatorFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            return r1
        L34:
            java.lang.String r2 = r4.getDiscriminatorKey()
            if (r2 == 0) goto L49
            java.lang.String r2 = r4.getDiscriminatorKey()
            java.lang.String r3 = r5.getDiscriminatorKey()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
            goto L4f
        L49:
            java.lang.String r2 = r5.getDiscriminatorKey()
            if (r2 == 0) goto L50
        L4f:
            return r1
        L50:
            java.lang.String r2 = r4.getDiscriminator()
            if (r2 == 0) goto L65
            java.lang.String r2 = r4.getDiscriminator()
            java.lang.String r3 = r5.getDiscriminator()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6c
            goto L6b
        L65:
            java.lang.String r2 = r5.getDiscriminator()
            if (r2 == 0) goto L6c
        L6b:
            return r1
        L6c:
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r2 = r4.idPropertyModelHolder
            if (r2 == 0) goto L79
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r3 = r5.idPropertyModelHolder
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7e
            goto L7d
        L79:
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r2 = r5.idPropertyModelHolder
            if (r2 == 0) goto L7e
        L7d:
            return r1
        L7e:
            java.util.List r2 = r4.getPropertyModels()
            java.util.List r3 = r5.getPropertyModels()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8d
            return r1
        L8d:
            java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r2 = r4.propertyNameToTypeParameterMap
            java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r5 = r5.propertyNameToTypeParameterMap
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L98
            return r1
        L98:
            return r0
        L99:
            return r1
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

    public org.bson.codecs.pojo.PropertyModel<?> getIdPropertyModel() {
            r1 = this;
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r0 = r1.idPropertyModelHolder
            if (r0 == 0) goto L9
            org.bson.codecs.pojo.PropertyModel r0 = r0.getPropertyModel()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final org.bson.codecs.pojo.IdPropertyModelHolder<?> getIdPropertyModelHolder() {
            r1 = this;
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r0 = r1.idPropertyModelHolder
            return r0
    }

    public final org.bson.codecs.pojo.InstanceCreator<T> getInstanceCreator() {
            r1 = this;
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r0 = r1.instanceCreatorFactory
            org.bson.codecs.pojo.InstanceCreator r0 = r0.create()
            return r0
    }

    public final org.bson.codecs.pojo.InstanceCreatorFactory<T> getInstanceCreatorFactory() {
            r1 = this;
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r0 = r1.instanceCreatorFactory
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.bson.codecs.pojo.PropertyModel<?> getPropertyModel(java.lang.String r4) {
            r3 = this;
            java.util.List<org.bson.codecs.pojo.PropertyModel<?>> r0 = r3.propertyModels
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModel r1 = (org.bson.codecs.pojo.PropertyModel) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    public java.util.List<org.bson.codecs.pojo.PropertyModel<?>> getPropertyModels() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.PropertyModel<?>> r0 = r1.propertyModels
            return r0
    }

    public final java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> getPropertyNameToTypeParameterMap() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r0 = r1.propertyNameToTypeParameterMap
            return r0
    }

    public java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            return r0
    }

    public boolean hasTypeParameters() {
            r1 = this;
            boolean r0 = r1.hasTypeParameters
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.getType()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.bson.codecs.pojo.InstanceCreatorFactory<T> r1 = r3.instanceCreatorFactory
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.discriminatorEnabled
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.getDiscriminatorKey()
            r2 = 0
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.getDiscriminatorKey()
            int r0 = r0.hashCode()
            goto L29
        L28:
            r0 = 0
        L29:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.getDiscriminator()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.getDiscriminator()
            int r0 = r0.hashCode()
            goto L3c
        L3b:
            r0 = 0
        L3c:
            int r1 = r1 + r0
            int r1 = r1 * 31
            org.bson.codecs.pojo.IdPropertyModelHolder<?> r0 = r3.idPropertyModelHolder
            if (r0 == 0) goto L47
            int r2 = r0.hashCode()
        L47:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List r0 = r3.getPropertyModels()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r1 = r3.propertyNameToTypeParameterMap
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ClassModel{type="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class<T> r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean useDiscriminator() {
            r1 = this;
            boolean r0 = r1.discriminatorEnabled
            return r0
    }
}
