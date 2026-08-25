package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class PropertyMetadata<T> {
    private final java.lang.String declaringClassName;
    private java.lang.String error;
    private java.lang.reflect.Field field;
    private java.lang.reflect.Method getter;
    private final java.lang.String name;
    private final java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> readAnnotations;
    private java.lang.reflect.Method setter;
    private final org.bson.codecs.pojo.TypeData<T> typeData;
    private org.bson.codecs.pojo.TypeParameterMap typeParameterMap;
    private java.util.List<org.bson.codecs.pojo.TypeData<?>> typeParameters;
    private final java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> writeAnnotations;

    public PropertyMetadata(java.lang.String r2, java.lang.String r3, org.bson.codecs.pojo.TypeData<T> r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.readAnnotations = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.writeAnnotations = r0
            r1.name = r2
            r1.declaringClassName = r3
            r1.typeData = r4
            return
    }

    private boolean isPublicAndNotStaticOrTransient(int r2) {
            r1 = this;
            boolean r0 = java.lang.reflect.Modifier.isPublic(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.notStaticOrTransient(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private boolean notStaticOrTransient(int r2) {
            r1 = this;
            boolean r0 = java.lang.reflect.Modifier.isTransient(r2)
            if (r0 != 0) goto Le
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public org.bson.codecs.pojo.PropertyMetadata<T> addReadAnnotation(java.lang.annotation.Annotation r4) {
            r3 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.readAnnotations
            java.lang.Class r1 = r4.annotationType()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3d
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.readAnnotations
            java.lang.Class r1 = r4.annotationType()
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1d
            return r3
        L1d:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Class r4 = r4.annotationType()
            r1[r2] = r4
            r4 = 1
            java.lang.String r2 = r3.name
            r1[r4] = r2
            r4 = 2
            java.lang.String r2 = r3.declaringClassName
            r1[r4] = r2
            java.lang.String r4 = "Read annotation %s for '%s' already exists in %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L3d:
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.readAnnotations
            java.lang.Class r1 = r4.annotationType()
            r0.put(r1, r4)
            return r3
    }

    public org.bson.codecs.pojo.PropertyMetadata<T> addWriteAnnotation(java.lang.annotation.Annotation r4) {
            r3 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.writeAnnotations
            java.lang.Class r1 = r4.annotationType()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3d
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.writeAnnotations
            java.lang.Class r1 = r4.annotationType()
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1d
            return r3
        L1d:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Class r4 = r4.annotationType()
            r1[r2] = r4
            r4 = 1
            java.lang.String r2 = r3.name
            r1[r4] = r2
            r4 = 2
            java.lang.String r2 = r3.declaringClassName
            r1[r4] = r2
            java.lang.String r4 = "Write annotation %s for '%s' already exists in %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L3d:
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r0 = r3.writeAnnotations
            java.lang.Class r1 = r4.annotationType()
            r0.put(r1, r4)
            return r3
    }

    public org.bson.codecs.pojo.PropertyMetadata<T> field(java.lang.reflect.Field r1) {
            r0 = this;
            r0.field = r1
            return r0
    }

    public java.lang.String getDeclaringClassName() {
            r1 = this;
            java.lang.String r0 = r1.declaringClassName
            return r0
    }

    public final java.lang.String getError() {
            r1 = this;
            java.lang.String r0 = r1.error
            return r0
    }

    public java.lang.reflect.Field getField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            return r0
    }

    public java.lang.reflect.Method getGetter() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.getter
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> getReadAnnotations() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r1 = r2.readAnnotations
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    public java.lang.reflect.Method getSetter() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.setter
            return r0
    }

    public org.bson.codecs.pojo.TypeData<T> getTypeData() {
            r1 = this;
            org.bson.codecs.pojo.TypeData<T> r0 = r1.typeData
            return r0
    }

    public org.bson.codecs.pojo.TypeParameterMap getTypeParameterMap() {
            r1 = this;
            org.bson.codecs.pojo.TypeParameterMap r0 = r1.typeParameterMap
            return r0
    }

    public java.util.List<org.bson.codecs.pojo.TypeData<?>> getTypeParameters() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.TypeData<?>> r0 = r1.typeParameters
            return r0
    }

    public java.util.List<java.lang.annotation.Annotation> getWriteAnnotations() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> r1 = r2.writeAnnotations
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    public boolean isDeserializable() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.setter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            java.lang.reflect.Field r0 = r3.field
            if (r0 == 0) goto L22
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L21
            java.lang.reflect.Field r0 = r3.field
            int r0 = r0.getModifiers()
            boolean r0 = r3.notStaticOrTransient(r0)
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
        L23:
            java.lang.reflect.Field r0 = r3.field
            if (r0 == 0) goto L3e
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L3e
            java.lang.reflect.Field r0 = r3.field
            int r0 = r0.getModifiers()
            boolean r0 = r3.isPublicAndNotStaticOrTransient(r0)
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            return r1
    }

    public boolean isSerializable() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.getter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Field r0 = r3.field
            if (r0 == 0) goto L16
            int r0 = r0.getModifiers()
            boolean r0 = r3.notStaticOrTransient(r0)
            if (r0 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            java.lang.reflect.Field r0 = r3.field
            if (r0 == 0) goto L26
            int r0 = r0.getModifiers()
            boolean r0 = r3.isPublicAndNotStaticOrTransient(r0)
            if (r0 == 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    public final void setError(java.lang.String r1) {
            r0 = this;
            r0.error = r1
            return
    }

    public void setGetter(java.lang.reflect.Method r1) {
            r0 = this;
            r0.getter = r1
            return
    }

    public void setSetter(java.lang.reflect.Method r1) {
            r0 = this;
            r0.setter = r1
            return
    }

    public <S> org.bson.codecs.pojo.PropertyMetadata<T> typeParameterInfo(org.bson.codecs.pojo.TypeParameterMap r1, org.bson.codecs.pojo.TypeData<S> r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            r0.typeParameterMap = r1
            java.util.List r1 = r2.getTypeParameters()
            r0.typeParameters = r1
        Lc:
            return r0
    }
}
