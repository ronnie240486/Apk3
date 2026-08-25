package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
final class TypeData<T> implements org.bson.codecs.pojo.TypeWithTypeParameters<T> {
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> PRIMITIVE_CLASS_MAP = null;
    private final java.lang.Class<T> type;
    private final java.util.List<org.bson.codecs.pojo.TypeData<?>> typeParameters;

    /* JADX INFO: renamed from: org.bson.codecs.pojo.TypeData$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder<T> {
        private final java.lang.Class<T> type;
        private final java.util.List<org.bson.codecs.pojo.TypeData<?>> typeParameters;

        private Builder(java.lang.Class<T> r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.typeParameters = r0
                r1.type = r2
                return
        }

        public /* synthetic */ Builder(java.lang.Class r1, org.bson.codecs.pojo.TypeData.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public <S> org.bson.codecs.pojo.TypeData.Builder<T> addTypeParameter(org.bson.codecs.pojo.TypeData<S> r3) {
                r2 = this;
                java.util.List<org.bson.codecs.pojo.TypeData<?>> r0 = r2.typeParameters
                java.lang.String r1 = "typeParameter"
                java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r1, r3)
                r0.add(r3)
                return r2
        }

        public org.bson.codecs.pojo.TypeData.Builder<T> addTypeParameters(java.util.List<org.bson.codecs.pojo.TypeData<?>> r2) {
                r1 = this;
                java.lang.String r0 = "typeParameters"
                org.bson.assertions.Assertions.notNull(r0, r2)
                java.util.Iterator r2 = r2.iterator()
            La:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1a
                java.lang.Object r0 = r2.next()
                org.bson.codecs.pojo.TypeData r0 = (org.bson.codecs.pojo.TypeData) r0
                r1.addTypeParameter(r0)
                goto La
            L1a:
                return r1
        }

        public org.bson.codecs.pojo.TypeData<T> build() {
                r4 = this;
                org.bson.codecs.pojo.TypeData r0 = new org.bson.codecs.pojo.TypeData
                java.lang.Class<T> r1 = r4.type
                java.util.List<org.bson.codecs.pojo.TypeData<?>> r2 = r4.typeParameters
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            org.bson.codecs.pojo.TypeData.PRIMITIVE_CLASS_MAP = r0
            return
    }

    private TypeData(java.lang.Class<T> r1, java.util.List<org.bson.codecs.pojo.TypeData<?>> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Class r1 = r0.boxType(r1)
            r0.type = r1
            r0.typeParameters = r2
            return
    }

    public /* synthetic */ TypeData(java.lang.Class r1, java.util.List r2, org.bson.codecs.pojo.TypeData.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private <S> java.lang.Class<S> boxType(java.lang.Class<S> r2) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto Le
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.bson.codecs.pojo.TypeData.PRIMITIVE_CLASS_MAP
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
        Le:
            return r2
    }

    public static <T> org.bson.codecs.pojo.TypeData.Builder<T> builder(java.lang.Class<T> r2) {
            org.bson.codecs.pojo.TypeData$Builder r0 = new org.bson.codecs.pojo.TypeData$Builder
            java.lang.String r1 = "type"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r1, r2)
            java.lang.Class r2 = (java.lang.Class) r2
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static <T> void getNestedTypeData(org.bson.codecs.pojo.TypeData.Builder<T> r4, java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            org.bson.codecs.pojo.TypeData$Builder r0 = builder(r0)
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r2 = r5.length
        L16:
            if (r1 >= r2) goto L20
            r3 = r5[r1]
            getNestedTypeData(r0, r3)
            int r1 = r1 + 1
            goto L16
        L20:
            org.bson.codecs.pojo.TypeData r5 = r0.build()
            r4.addTypeParameter(r5)
            goto L65
        L28:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L42
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            r5 = r5[r1]
            java.lang.Class r5 = (java.lang.Class) r5
            org.bson.codecs.pojo.TypeData$Builder r5 = builder(r5)
            org.bson.codecs.pojo.TypeData r5 = r5.build()
            r4.addTypeParameter(r5)
            goto L65
        L42:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L54
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            org.bson.codecs.pojo.TypeData$Builder r5 = builder(r5)
            org.bson.codecs.pojo.TypeData r5 = r5.build()
            r4.addTypeParameter(r5)
            goto L65
        L54:
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L65
            java.lang.Class r5 = (java.lang.Class) r5
            org.bson.codecs.pojo.TypeData$Builder r5 = builder(r5)
            org.bson.codecs.pojo.TypeData r5 = r5.build()
            r4.addTypeParameter(r5)
        L65:
            return
    }

    private static java.lang.String nestedTypeParameters(java.util.List<org.bson.codecs.pojo.TypeData<?>> r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r7.size()
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r3 = 0
        Lf:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r7.next()
            org.bson.codecs.pojo.TypeData r4 = (org.bson.codecs.pojo.TypeData) r4
            r5 = 1
            int r3 = r3 + r5
            java.lang.Class r6 = r4.getType()
            java.lang.String r6 = r6.getSimpleName()
            r0.append(r6)
            java.util.List r6 = r4.getTypeParameters()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L47
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.List r4 = r4.getTypeParameters()
            java.lang.String r4 = nestedTypeParameters(r4)
            r5[r2] = r4
            java.lang.String r4 = "<%s>"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
        L47:
            if (r3 >= r1) goto Lf
            java.lang.String r4 = ", "
            r0.append(r4)
            goto Lf
        L4f:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static org.bson.codecs.pojo.TypeData<?> newInstance(java.lang.reflect.Field r1) {
            java.lang.reflect.Type r0 = r1.getGenericType()
            java.lang.Class r1 = r1.getType()
            org.bson.codecs.pojo.TypeData r1 = newInstance(r0, r1)
            return r1
    }

    public static org.bson.codecs.pojo.TypeData<?> newInstance(java.lang.reflect.Method r2) {
            boolean r0 = org.bson.codecs.pojo.PropertyReflectionUtils.isGetter(r2)
            if (r0 == 0) goto L13
            java.lang.reflect.Type r0 = r2.getGenericReturnType()
            java.lang.Class r2 = r2.getReturnType()
            org.bson.codecs.pojo.TypeData r2 = newInstance(r0, r2)
            return r2
        L13:
            java.lang.reflect.Type[] r0 = r2.getGenericParameterTypes()
            r1 = 0
            r0 = r0[r1]
            java.lang.Class[] r2 = r2.getParameterTypes()
            r2 = r2[r1]
            org.bson.codecs.pojo.TypeData r2 = newInstance(r0, r2)
            return r2
    }

    public static <T> org.bson.codecs.pojo.TypeData<T> newInstance(java.lang.reflect.Type r3, java.lang.Class<T> r4) {
            org.bson.codecs.pojo.TypeData$Builder r4 = builder(r4)
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r0 = r3.length
            r1 = 0
        L10:
            if (r1 >= r0) goto L1a
            r2 = r3[r1]
            getNestedTypeData(r4, r2)
            int r1 = r1 + 1
            goto L10
        L1a:
            org.bson.codecs.pojo.TypeData r3 = r4.build()
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.bson.codecs.pojo.TypeData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            org.bson.codecs.pojo.TypeData r5 = (org.bson.codecs.pojo.TypeData) r5
            java.lang.Class r1 = r4.getType()
            java.lang.Class r3 = r5.getType()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            java.util.List r1 = r4.getTypeParameters()
            java.util.List r5 = r5.getTypeParameters()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L2a
            return r2
        L2a:
            return r0
    }

    @Override // org.bson.codecs.pojo.TypeWithTypeParameters
    public java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            return r0
    }

    @Override // org.bson.codecs.pojo.TypeWithTypeParameters
    public java.util.List<org.bson.codecs.pojo.TypeData<?>> getTypeParameters() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.TypeData<?>> r0 = r1.typeParameters
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getType()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.getTypeParameters()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final boolean isAssignableFrom(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            java.lang.Class r2 = r1.boxType(r2)
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.util.List<org.bson.codecs.pojo.TypeData<?>> r0 = r3.typeParameters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = ""
            goto L1d
        Lb:
            java.lang.String r0 = ", typeParameters=["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<org.bson.codecs.pojo.TypeData<?>> r1 = r3.typeParameters
            java.lang.String r1 = nestedTypeParameters(r1)
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
        L1d:
            java.lang.String r1 = "TypeData{type="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class<T> r2 = r3.type
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
