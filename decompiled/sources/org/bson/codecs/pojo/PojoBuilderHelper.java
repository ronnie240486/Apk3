package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
final class PojoBuilderHelper {
    private PojoBuilderHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <T, S> void cachePropertyTypeData(org.bson.codecs.pojo.PropertyMetadata<T> r0, java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r1, org.bson.codecs.pojo.TypeData<S> r2, java.util.List<java.lang.String> r3, java.lang.reflect.Type r4) {
            org.bson.codecs.pojo.TypeParameterMap r3 = getTypeParameterMap(r3, r4)
            java.lang.String r4 = r0.getName()
            r1.put(r4, r3)
            r0.typeParameterInfo(r3, r2)
            return
    }

    public static <T> void configureClassModelBuilder(org.bson.codecs.pojo.ClassModelBuilder<T> r23, java.lang.Class<T> r24) {
            r0 = r23
            r1 = r24
            java.lang.String r2 = "clazz"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r2, r1)
            java.lang.Class r2 = (java.lang.Class) r2
            r0.type(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r13 = r24.getSimpleName()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            r11 = r1
            r16 = 0
        L2a:
            boolean r4 = r11.isEnum()
            r17 = 0
            if (r4 != 0) goto L1e0
            java.lang.Class r4 = r11.getSuperclass()
            if (r4 == 0) goto L1e0
            java.lang.annotation.Annotation[] r4 = r11.getDeclaredAnnotations()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.addAll(r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.reflect.TypeVariable[] r4 = r11.getTypeParameters()
            int r6 = r4.length
            r7 = 0
        L4e:
            if (r7 >= r6) goto L5c
            r8 = r4[r7]
            java.lang.String r8 = r8.getName()
            r10.add(r8)
            int r7 = r7 + 1
            goto L4e
        L5c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.reflect.Method[] r7 = r11.getDeclaredMethods()
            int r8 = r7.length
            r9 = 0
        L6c:
            if (r9 >= r8) goto Lc8
            r15 = r7[r9]
            int r18 = r15.getModifiers()
            boolean r18 = java.lang.reflect.Modifier.isPublic(r18)
            if (r18 == 0) goto Lc1
            boolean r18 = r15.isBridge()
            if (r18 != 0) goto Lc1
            boolean r18 = org.bson.codecs.pojo.PropertyReflectionUtils.isGetter(r15)
            if (r18 == 0) goto L8a
            r6.add(r15)
            goto Lc1
        L8a:
            java.lang.String r5 = r15.getName()
            r19 = r7
            java.lang.String r7 = "set"
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto Lba
            java.lang.String r5 = r15.getName()
            int r5 = r5.length()
            r7 = 3
            if (r5 <= r7) goto Lba
            java.lang.Class[] r5 = r15.getParameterTypes()
            int r5 = r5.length
            r7 = 1
            if (r5 != r7) goto Lba
            java.lang.String r5 = r15.getName()
            r7 = 3
            char r5 = r5.charAt(r7)
            boolean r5 = java.lang.Character.isUpperCase(r5)
            goto Lbb
        Lba:
            r5 = 0
        Lbb:
            if (r5 == 0) goto Lc3
            r4.add(r15)
            goto Lc3
        Lc1:
            r19 = r7
        Lc3:
            int r9 = r9 + 1
            r7 = r19
            goto L6c
        Lc8:
            org.bson.codecs.pojo.PropertyReflectionUtils$PropertyMethods r15 = new org.bson.codecs.pojo.PropertyReflectionUtils$PropertyMethods
            r15.<init>(r6, r4)
            java.util.Collection r4 = r15.getSetterMethods()
            java.util.Iterator r18 = r4.iterator()
        Ld5:
            boolean r4 = r18.hasNext()
            if (r4 == 0) goto L121
            java.lang.Object r4 = r18.next()
            r9 = r4
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r4 = org.bson.codecs.pojo.PropertyReflectionUtils.toPropertyName(r9)
            r3.add(r4)
            org.bson.codecs.pojo.TypeData r7 = org.bson.codecs.pojo.TypeData.newInstance(r9)
            java.lang.reflect.Type r19 = getGenericType(r9)
            r5 = r13
            r6 = r14
            r8 = r12
            r1 = r9
            r9 = r16
            r20 = r10
            r21 = r11
            r11 = r19
            org.bson.codecs.pojo.PropertyMetadata r4 = getOrCreateMethodPropertyMetadata(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.reflect.Method r5 = r4.getSetter()
            if (r5 != 0) goto L11a
            r4.setSetter(r1)
            java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
            int r5 = r1.length
            r6 = 0
        L110:
            if (r6 >= r5) goto L11a
            r7 = r1[r6]
            r4.addWriteAnnotation(r7)
            int r6 = r6 + 1
            goto L110
        L11a:
            r1 = r24
            r10 = r20
            r11 = r21
            goto Ld5
        L121:
            r20 = r10
            r21 = r11
            java.util.Collection r1 = r15.getGetterMethods()
            java.util.Iterator r1 = r1.iterator()
        L12d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L17c
            java.lang.Object r4 = r1.next()
            r15 = r4
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.String r4 = org.bson.codecs.pojo.PropertyReflectionUtils.toPropertyName(r15)
            r3.add(r4)
            java.lang.Object r5 = r14.get(r4)
            org.bson.codecs.pojo.PropertyMetadata r5 = (org.bson.codecs.pojo.PropertyMetadata) r5
            if (r5 == 0) goto L150
            java.lang.reflect.Method r5 = r5.getGetter()
            if (r5 == 0) goto L150
            goto L12d
        L150:
            org.bson.codecs.pojo.TypeData r7 = org.bson.codecs.pojo.TypeData.newInstance(r15)
            java.lang.reflect.Type r11 = getGenericType(r15)
            r5 = r13
            r6 = r14
            r8 = r12
            r9 = r16
            r10 = r20
            org.bson.codecs.pojo.PropertyMetadata r4 = getOrCreateMethodPropertyMetadata(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.reflect.Method r5 = r4.getGetter()
            if (r5 != 0) goto L12d
            r4.setGetter(r15)
            java.lang.annotation.Annotation[] r5 = r15.getDeclaredAnnotations()
            int r6 = r5.length
            r7 = 0
        L172:
            if (r7 >= r6) goto L12d
            r8 = r5[r7]
            r4.addReadAnnotation(r8)
            int r7 = r7 + 1
            goto L172
        L17c:
            java.lang.reflect.Field[] r1 = r21.getDeclaredFields()
            int r15 = r1.length
            r11 = 0
        L182:
            if (r11 >= r15) goto L1ce
            r10 = r1[r11]
            java.lang.String r4 = r10.getName()
            r3.add(r4)
            java.lang.String r4 = r10.getName()
            org.bson.codecs.pojo.TypeData r7 = org.bson.codecs.pojo.TypeData.newInstance(r10)
            java.lang.reflect.Type r18 = r10.getGenericType()
            r5 = r13
            r6 = r14
            r8 = r12
            r9 = r16
            r19 = r1
            r1 = r10
            r10 = r20
            r22 = r11
            r11 = r18
            org.bson.codecs.pojo.PropertyMetadata r4 = getOrCreateFieldPropertyMetadata(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L1c9
            java.lang.reflect.Field r5 = r4.getField()
            if (r5 != 0) goto L1c9
            r4.field(r1)
            java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
            int r5 = r1.length
            r6 = 0
        L1bc:
            if (r6 >= r5) goto L1c9
            r7 = r1[r6]
            r4.addReadAnnotation(r7)
            r4.addWriteAnnotation(r7)
            int r6 = r6 + 1
            goto L1bc
        L1c9:
            int r11 = r22 + 1
            r1 = r19
            goto L182
        L1ce:
            java.lang.reflect.Type r1 = r21.getGenericSuperclass()
            r4 = r21
            org.bson.codecs.pojo.TypeData r16 = org.bson.codecs.pojo.TypeData.newInstance(r1, r4)
            java.lang.Class r11 = r4.getSuperclass()
            r1 = r24
            goto L2a
        L1e0:
            r4 = r11
            boolean r1 = r4.isInterface()
            if (r1 == 0) goto L1f2
            java.lang.annotation.Annotation[] r1 = r4.getDeclaredAnnotations()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.addAll(r1)
        L1f2:
            java.util.Iterator r1 = r3.iterator()
        L1f6:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L21c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r14.get(r3)
            org.bson.codecs.pojo.PropertyMetadata r3 = (org.bson.codecs.pojo.PropertyMetadata) r3
            boolean r4 = r3.isSerializable()
            if (r4 != 0) goto L214
            boolean r4 = r3.isDeserializable()
            if (r4 == 0) goto L1f6
        L214:
            org.bson.codecs.pojo.PropertyModelBuilder r3 = createPropertyModelBuilder(r3)
            r0.addProperty(r3)
            goto L1f6
        L21c:
            java.util.Collections.reverse(r2)
            r0.annotations(r2)
            r0.propertyNameToTypeParameterMap(r12)
            java.lang.reflect.Constructor[] r1 = r24.getDeclaredConstructors()
            int r2 = r1.length
            r3 = 0
            r15 = 0
        L22c:
            if (r3 >= r2) goto L255
            r4 = r1[r3]
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 != 0) goto L251
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 != 0) goto L24b
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isProtected(r5)
            if (r5 == 0) goto L251
        L24b:
            r5 = 1
            r4.setAccessible(r5)
            r15 = r4
            goto L252
        L251:
            r5 = 1
        L252:
            int r3 = r3 + 1
            goto L22c
        L255:
            org.bson.codecs.pojo.InstanceCreatorFactoryImpl r1 = new org.bson.codecs.pojo.InstanceCreatorFactoryImpl
            org.bson.codecs.pojo.CreatorExecutable r2 = new org.bson.codecs.pojo.CreatorExecutable
            r3 = r24
            r2.<init>(r3, r15)
            r1.<init>(r2)
            r0.instanceCreatorFactory(r1)
            return
    }

    public static <T> org.bson.codecs.pojo.PropertyModelBuilder<T> createPropertyModelBuilder(org.bson.codecs.pojo.PropertyMetadata<T> r2) {
            org.bson.codecs.pojo.PropertyModelBuilder r0 = org.bson.codecs.pojo.PropertyModel.builder()
            java.lang.String r1 = r2.getName()
            r0.propertyName(r1)
            java.lang.String r1 = r2.getName()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.readName(r1)
            java.lang.String r1 = r2.getName()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.writeName(r1)
            org.bson.codecs.pojo.TypeData r1 = r2.getTypeData()
            r0.typeData(r1)
            java.util.List r1 = r2.getReadAnnotations()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.readAnnotations(r1)
            java.util.List r1 = r2.getWriteAnnotations()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.writeAnnotations(r1)
            org.bson.codecs.pojo.PropertyModelSerializationImpl r1 = new org.bson.codecs.pojo.PropertyModelSerializationImpl
            r1.<init>()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.propertySerialization(r1)
            org.bson.codecs.pojo.PropertyAccessorImpl r1 = new org.bson.codecs.pojo.PropertyAccessorImpl
            r1.<init>(r2)
            org.bson.codecs.pojo.PropertyModelBuilder r0 = r0.propertyAccessor(r1)
            java.lang.String r1 = r2.getError()
            r0.setError(r1)
            java.util.List r1 = r2.getTypeParameters()
            if (r1 == 0) goto L54
            specializePropertyModelBuilder(r0, r2)
        L54:
            return r0
    }

    private static java.lang.reflect.Type getGenericType(java.lang.reflect.Method r1) {
            boolean r0 = org.bson.codecs.pojo.PropertyReflectionUtils.isGetter(r1)
            if (r0 == 0) goto Lb
            java.lang.reflect.Type r1 = r1.getGenericReturnType()
            goto L12
        Lb:
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            r0 = 0
            r1 = r1[r0]
        L12:
            return r1
    }

    private static <T, S> org.bson.codecs.pojo.PropertyMetadata<T> getOrCreateFieldPropertyMetadata(java.lang.String r0, java.lang.String r1, java.util.Map<java.lang.String, org.bson.codecs.pojo.PropertyMetadata<?>> r2, org.bson.codecs.pojo.TypeData<T> r3, java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r4, org.bson.codecs.pojo.TypeData<S> r5, java.util.List<java.lang.String> r6, java.lang.reflect.Type r7) {
            org.bson.codecs.pojo.PropertyMetadata r0 = getOrCreatePropertyMetadata(r0, r1, r2, r3)
            org.bson.codecs.pojo.TypeData r1 = r0.getTypeData()
            java.lang.Class r1 = r1.getType()
            java.lang.Class r2 = r3.getType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L18
            r0 = 0
            return r0
        L18:
            cachePropertyTypeData(r0, r4, r5, r6, r7)
            return r0
    }

    private static <T, S> org.bson.codecs.pojo.PropertyMetadata<T> getOrCreateMethodPropertyMetadata(java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, org.bson.codecs.pojo.PropertyMetadata<?>> r4, org.bson.codecs.pojo.TypeData<T> r5, java.util.Map<java.lang.String, org.bson.codecs.pojo.TypeParameterMap> r6, org.bson.codecs.pojo.TypeData<S> r7, java.util.List<java.lang.String> r8, java.lang.reflect.Type r9) {
            org.bson.codecs.pojo.PropertyMetadata r4 = getOrCreatePropertyMetadata(r2, r3, r4, r5)
            org.bson.codecs.pojo.TypeData r0 = r4.getTypeData()
            java.lang.Class r0 = r0.getType()
            java.lang.Class r1 = r5.getType()
            boolean r0 = isAssignableClass(r0, r1)
            if (r0 != 0) goto L32
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            org.bson.codecs.pojo.TypeData r3 = r4.getTypeData()
            r0[r2] = r3
            r2 = 3
            r0[r2] = r5
            java.lang.String r2 = "Property '%s' in %s, has differing data types: %s and %s."
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r4.setError(r2)
        L32:
            cachePropertyTypeData(r4, r6, r7, r8, r9)
            return r4
    }

    private static <T> org.bson.codecs.pojo.PropertyMetadata<T> getOrCreatePropertyMetadata(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, org.bson.codecs.pojo.PropertyMetadata<?>> r3, org.bson.codecs.pojo.TypeData<T> r4) {
            java.lang.Object r0 = r3.get(r1)
            org.bson.codecs.pojo.PropertyMetadata r0 = (org.bson.codecs.pojo.PropertyMetadata) r0
            if (r0 != 0) goto L10
            org.bson.codecs.pojo.PropertyMetadata r0 = new org.bson.codecs.pojo.PropertyMetadata
            r0.<init>(r1, r2, r4)
            r3.put(r1, r0)
        L10:
            return r0
    }

    private static org.bson.codecs.pojo.TypeParameterMap getTypeParameterMap(java.util.List<java.lang.String> r4, java.lang.reflect.Type r5) {
            java.lang.String r0 = r5.toString()
            int r0 = r4.indexOf(r0)
            org.bson.codecs.pojo.TypeParameterMap$Builder r1 = new org.bson.codecs.pojo.TypeParameterMap$Builder
            r2 = 0
            r1.<init>(r2)
            r2 = -1
            if (r0 == r2) goto L15
            r1.addIndex(r0)
            goto L39
        L15:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L39
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            r0 = 0
        L1c:
            java.lang.reflect.Type[] r3 = r5.getActualTypeArguments()
            int r3 = r3.length
            if (r0 >= r3) goto L39
            java.lang.reflect.Type[] r3 = r5.getActualTypeArguments()
            r3 = r3[r0]
            java.lang.String r3 = r3.toString()
            int r3 = r4.indexOf(r3)
            if (r3 == r2) goto L36
            r1.addIndex(r0, r3)
        L36:
            int r0 = r0 + 1
            goto L1c
        L39:
            org.bson.codecs.pojo.TypeParameterMap r4 = r1.build()
            return r4
    }

    private static boolean isAssignableClass(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 != 0) goto Lf
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private static <V> void specializePropertyModelBuilder(org.bson.codecs.pojo.PropertyModelBuilder<V> r8, org.bson.codecs.pojo.PropertyMetadata<V> r9) {
            org.bson.codecs.pojo.TypeParameterMap r0 = r9.getTypeParameterMap()
            boolean r0 = r0.hasTypeParameters()
            if (r0 == 0) goto L9f
            java.util.List r0 = r9.getTypeParameters()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9f
            org.bson.codecs.pojo.TypeParameterMap r0 = r9.getTypeParameterMap()
            java.util.Map r0 = r0.getPropertyToClassParamIndexMap()
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L38
            java.util.List r9 = r9.getTypeParameters()
            int r0 = r1.intValue()
            java.lang.Object r9 = r9.get(r0)
            org.bson.codecs.pojo.TypeData r9 = (org.bson.codecs.pojo.TypeData) r9
            goto L9c
        L38:
            org.bson.codecs.pojo.TypeData r1 = r8.getTypeData()
            java.lang.Class r1 = r1.getType()
            org.bson.codecs.pojo.TypeData$Builder r1 = org.bson.codecs.pojo.TypeData.builder(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            org.bson.codecs.pojo.TypeData r3 = r8.getTypeData()
            java.util.List r3 = r3.getTypeParameters()
            r2.<init>(r3)
            r3 = 0
        L52:
            int r4 = r2.size()
            if (r3 >= r4) goto L95
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L60:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L92
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            java.util.List r6 = r9.getTypeParameters()
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r5 = r6.get(r5)
            r2.set(r3, r5)
            goto L60
        L92:
            int r3 = r3 + 1
            goto L52
        L95:
            r1.addTypeParameters(r2)
            org.bson.codecs.pojo.TypeData r9 = r1.build()
        L9c:
            r8.typeData(r9)
        L9f:
            return
    }

    public static <V> V stateNotNull(java.lang.String r2, V r3) {
            if (r3 == 0) goto L3
            return r3
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "%s cannot be null"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r3.<init>(r2)
            throw r3
    }
}
