package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class ConventionAnnotationImpl implements org.bson.codecs.pojo.Convention {
    public ConventionAnnotationImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private <T, S> org.bson.codecs.pojo.PropertyModelBuilder<S> addCreatorPropertyToClassModelBuilder(org.bson.codecs.pojo.ClassModelBuilder<T> r3, java.lang.String r4, java.lang.Class<S> r5) {
            r2 = this;
            org.bson.codecs.pojo.PropertyMetadata r0 = new org.bson.codecs.pojo.PropertyMetadata
            java.lang.Class r1 = r3.getType()
            java.lang.String r1 = r1.getSimpleName()
            org.bson.codecs.pojo.TypeData$Builder r5 = org.bson.codecs.pojo.TypeData.builder(r5)
            org.bson.codecs.pojo.TypeData r5 = r5.build()
            r0.<init>(r4, r1, r5)
            org.bson.codecs.pojo.PropertyModelBuilder r5 = org.bson.codecs.pojo.PojoBuilderHelper.createPropertyModelBuilder(r0)
            r0 = 0
            org.bson.codecs.pojo.PropertyModelBuilder r5 = r5.readName(r0)
            org.bson.codecs.pojo.PropertyModelBuilder r4 = r5.writeName(r4)
            r3.addProperty(r4)
            return r4
    }

    private void cleanPropertyBuilders(org.bson.codecs.pojo.ClassModelBuilder<?> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r5.getPropertyModelBuilders()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            org.bson.codecs.pojo.PropertyModelBuilder r2 = (org.bson.codecs.pojo.PropertyModelBuilder) r2
            boolean r3 = r2.isReadable()
            if (r3 != 0) goto Ld
            boolean r3 = r2.isWritable()
            if (r3 != 0) goto Ld
            java.lang.String r2 = r2.getName()
            r0.add(r2)
            goto Ld
        L2d:
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r5.removeProperty(r1)
            goto L31
        L41:
            return
    }

    private void processClassAnnotation(org.bson.codecs.pojo.ClassModelBuilder<?> r4, java.lang.annotation.Annotation r5) {
            r3 = this;
            boolean r0 = r5 instanceof org.bson.codecs.pojo.annotations.BsonDiscriminator
            if (r0 == 0) goto L26
            org.bson.codecs.pojo.annotations.BsonDiscriminator r5 = (org.bson.codecs.pojo.annotations.BsonDiscriminator) r5
            java.lang.String r0 = r5.key()
            java.lang.String r1 = ""
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L15
            r4.discriminatorKey(r0)
        L15:
            java.lang.String r5 = r5.value()
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L22
            r4.discriminator(r5)
        L22:
            r5 = 1
            r4.enableDiscriminator(r5)
        L26:
            return
    }

    private <T> void processCreatorAnnotation(org.bson.codecs.pojo.ClassModelBuilder<T> r18) {
            r17 = this;
            r0 = r18
            java.lang.Class r1 = r18.getType()
            java.lang.reflect.Constructor[] r2 = r1.getDeclaredConstructors()
            int r3 = r2.length
            r5 = 0
            r6 = 0
            r7 = 0
        Le:
            if (r6 >= r3) goto L4e
            r8 = r2[r6]
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isPublic(r9)
            if (r9 == 0) goto L4b
            boolean r9 = r8.isSynthetic()
            if (r9 != 0) goto L4b
            java.lang.annotation.Annotation[] r9 = r8.getDeclaredAnnotations()
            int r10 = r9.length
            r11 = 0
        L28:
            if (r11 >= r10) goto L4b
            r12 = r9[r11]
            java.lang.Class r12 = r12.annotationType()
            java.lang.Class<org.bson.codecs.pojo.annotations.BsonCreator> r13 = org.bson.codecs.pojo.annotations.BsonCreator.class
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L48
            if (r7 != 0) goto L40
            org.bson.codecs.pojo.CreatorExecutable r7 = new org.bson.codecs.pojo.CreatorExecutable
            r7.<init>(r1, r8)
            goto L48
        L40:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r1 = "Found multiple constructors annotated with @BsonCreator"
            r0.<init>(r1)
            throw r0
        L48:
            int r11 = r11 + 1
            goto L28
        L4b:
            int r6 = r6 + 1
            goto Le
        L4e:
            r2 = r1
            r3 = 0
        L50:
            r6 = 2
            if (r2 == 0) goto Lc8
            if (r3 != 0) goto Lc8
            java.lang.reflect.Method[] r9 = r2.getDeclaredMethods()
            int r10 = r9.length
            r11 = 0
        L5b:
            if (r11 >= r10) goto Lc3
            r12 = r9[r11]
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 == 0) goto Lc0
            boolean r13 = r12.isSynthetic()
            if (r13 != 0) goto Lc0
            boolean r13 = r12.isBridge()
            if (r13 != 0) goto Lc0
            java.lang.annotation.Annotation[] r13 = r12.getDeclaredAnnotations()
            int r14 = r13.length
            r15 = 0
        L7b:
            if (r15 >= r14) goto Lc0
            r16 = r13[r15]
            java.lang.Class r4 = r16.annotationType()
            java.lang.Class<org.bson.codecs.pojo.annotations.BsonCreator> r8 = org.bson.codecs.pojo.annotations.BsonCreator.class
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto Lbd
            if (r7 != 0) goto Lb5
            java.lang.Class r3 = r12.getReturnType()
            boolean r3 = r2.isAssignableFrom(r3)
            if (r3 == 0) goto L9e
            org.bson.codecs.pojo.CreatorExecutable r7 = new org.bson.codecs.pojo.CreatorExecutable
            r7.<init>(r1, r12)
            r3 = 1
            goto Lbd
        L9e:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Class r3 = r12.getReturnType()
            r1[r5] = r3
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Invalid method annotated with @BsonCreator. Returns '%s', expected %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        Lb5:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r1 = "Found multiple constructors / methods annotated with @BsonCreator"
            r0.<init>(r1)
            throw r0
        Lbd:
            int r15 = r15 + 1
            goto L7b
        Lc0:
            int r11 = r11 + 1
            goto L5b
        Lc3:
            java.lang.Class r2 = r2.getSuperclass()
            goto L50
        Lc8:
            if (r7 == 0) goto L1cd
            java.util.List r2 = r7.getProperties()
            java.util.List r3 = r7.getParameterTypes()
            java.util.List r4 = r7.getParameterGenericTypes()
            int r8 = r2.size()
            int r9 = r3.size()
            if (r8 != r9) goto L1c4
            r8 = 0
        Le1:
            int r9 = r2.size()
            if (r8 >= r9) goto L1b9
            java.lang.Integer r9 = r7.getIdPropertyIndex()
            if (r9 == 0) goto Lfd
            java.lang.Integer r9 = r7.getIdPropertyIndex()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lfd
            r9 = 1
            goto Lfe
        Lfd:
            r9 = 0
        Lfe:
            java.lang.Object r10 = r3.get(r8)
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.Object r11 = r4.get(r8)
            java.lang.reflect.Type r11 = (java.lang.reflect.Type) r11
            if (r9 == 0) goto L118
            java.lang.String r9 = r18.getIdPropertyName()
            org.bson.codecs.pojo.PropertyModelBuilder r9 = r0.getProperty(r9)
            r12 = r17
            goto L188
        L118:
            java.lang.Object r9 = r2.get(r8)
            org.bson.codecs.pojo.annotations.BsonProperty r9 = (org.bson.codecs.pojo.annotations.BsonProperty) r9
            java.util.List r12 = r18.getPropertyModelBuilders()
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L127:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L154
            java.lang.Object r14 = r12.next()
            org.bson.codecs.pojo.PropertyModelBuilder r14 = (org.bson.codecs.pojo.PropertyModelBuilder) r14
            java.lang.String r15 = r9.value()
            java.lang.String r6 = r14.getWriteName()
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L143
            r13 = r14
            goto L154
        L143:
            java.lang.String r6 = r9.value()
            java.lang.String r15 = r14.getReadName()
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L152
            r13 = r14
        L152:
            r6 = 2
            goto L127
        L154:
            if (r13 != 0) goto L15f
            java.lang.String r6 = r9.value()
            org.bson.codecs.pojo.PropertyModelBuilder r6 = r0.getProperty(r6)
            goto L160
        L15f:
            r6 = r13
        L160:
            if (r6 != 0) goto L16d
            java.lang.String r6 = r9.value()
            r12 = r17
            org.bson.codecs.pojo.PropertyModelBuilder r9 = r12.addCreatorPropertyToClassModelBuilder(r0, r6, r10)
            goto L188
        L16d:
            r12 = r17
            java.lang.String r13 = r9.value()
            java.lang.String r14 = r6.getName()
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L184
            java.lang.String r9 = r9.value()
            r6.writeName(r9)
        L184:
            tryToExpandToGenericType(r10, r6, r11)
            r9 = r6
        L188:
            org.bson.codecs.pojo.TypeData r6 = r9.getTypeData()
            boolean r6 = r6.isAssignableFrom(r10)
            if (r6 == 0) goto L197
            int r8 = r8 + 1
            r6 = 2
            goto Le1
        L197:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r9.getWriteName()
            r0[r5] = r2
            org.bson.codecs.pojo.TypeData r2 = r9.getTypeData()
            java.lang.Class r2 = r2.getType()
            r3 = 1
            r0[r3] = r2
            r2 = 2
            r0[r2] = r10
            java.lang.String r2 = "Invalid Property type for '%s'. Expected %s, found %s."
            java.lang.String r0 = java.lang.String.format(r2, r0)
            org.bson.codecs.configuration.CodecConfigurationException r0 = r7.getError(r1, r0)
            throw r0
        L1b9:
            r12 = r17
            org.bson.codecs.pojo.InstanceCreatorFactoryImpl r1 = new org.bson.codecs.pojo.InstanceCreatorFactoryImpl
            r1.<init>(r7)
            r0.instanceCreatorFactory(r1)
            goto L1cf
        L1c4:
            r12 = r17
            java.lang.String r0 = "All parameters in the @BsonCreator method / constructor must be annotated with a @BsonProperty."
            org.bson.codecs.configuration.CodecConfigurationException r0 = r7.getError(r1, r0)
            throw r0
        L1cd:
            r12 = r17
        L1cf:
            return
    }

    private void processPropertyAnnotations(org.bson.codecs.pojo.ClassModelBuilder<?> r6, org.bson.codecs.pojo.PropertyModelBuilder<?> r7) {
            r5 = this;
            java.util.List r0 = r7.getReadAnnotations()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            boolean r4 = r1 instanceof org.bson.codecs.pojo.annotations.BsonProperty
            if (r4 == 0) goto L47
            org.bson.codecs.pojo.annotations.BsonProperty r1 = (org.bson.codecs.pojo.annotations.BsonProperty) r1
            java.lang.String r4 = r1.value()
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2e
            java.lang.String r2 = r1.value()
            r7.readName(r2)
        L2e:
            boolean r1 = r1.useDiscriminator()
            r7.discriminatorEnabled(r1)
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = r6.getIdPropertyName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8
            r6.idPropertyName(r3)
            goto L8
        L47:
            boolean r2 = r1 instanceof org.bson.codecs.pojo.annotations.BsonId
            if (r2 == 0) goto L53
            java.lang.String r1 = r7.getName()
            r6.idPropertyName(r1)
            goto L8
        L53:
            boolean r1 = r1 instanceof org.bson.codecs.pojo.annotations.BsonIgnore
            if (r1 == 0) goto L8
            r7.readName(r3)
            goto L8
        L5b:
            java.util.List r6 = r7.getWriteAnnotations()
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            boolean r1 = r0 instanceof org.bson.codecs.pojo.annotations.BsonProperty
            if (r1 == 0) goto L87
            org.bson.codecs.pojo.annotations.BsonProperty r0 = (org.bson.codecs.pojo.annotations.BsonProperty) r0
            java.lang.String r1 = r0.value()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L63
            java.lang.String r0 = r0.value()
            r7.writeName(r0)
            goto L63
        L87:
            boolean r0 = r0 instanceof org.bson.codecs.pojo.annotations.BsonIgnore
            if (r0 == 0) goto L63
            r7.writeName(r3)
            goto L63
        L8f:
            return
    }

    private static <T> void tryToExpandToGenericType(java.lang.Class<?> r1, org.bson.codecs.pojo.PropertyModelBuilder<T> r2, java.lang.reflect.Type r3) {
            org.bson.codecs.pojo.TypeData r0 = r2.getTypeData()
            java.lang.Class r0 = r0.getType()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L15
            org.bson.codecs.pojo.TypeData r1 = org.bson.codecs.pojo.TypeData.newInstance(r3, r1)
            r2.typeData(r1)
        L15:
            return
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(org.bson.codecs.pojo.ClassModelBuilder<?> r3) {
            r2 = this;
            java.util.List r0 = r3.getAnnotations()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            r2.processClassAnnotation(r3, r1)
            goto L8
        L18:
            java.util.List r0 = r3.getPropertyModelBuilders()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModelBuilder r1 = (org.bson.codecs.pojo.PropertyModelBuilder) r1
            r2.processPropertyAnnotations(r3, r1)
            goto L20
        L30:
            r2.processCreatorAnnotation(r3)
            r2.cleanPropertyBuilders(r3)
            return
    }
}
