package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class CreatorExecutable<T> {
    private final java.lang.Class<T> clazz;
    private final java.lang.reflect.Constructor<T> constructor;
    private final java.lang.Integer idPropertyIndex;
    private final java.lang.reflect.Method method;
    private final java.util.List<java.lang.reflect.Type> parameterGenericTypes;
    private final java.util.List<java.lang.Class<?>> parameterTypes;
    private final java.util.List<org.bson.codecs.pojo.annotations.BsonProperty> properties;

    public CreatorExecutable(java.lang.Class<T> r2, java.lang.reflect.Constructor<T> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private CreatorExecutable(java.lang.Class<T> r9, java.lang.reflect.Constructor<T> r10, java.lang.reflect.Method r11) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.properties = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.parameterTypes = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.parameterGenericTypes = r1
            r8.clazz = r9
            r8.constructor = r10
            r8.method = r11
            r9 = 0
            if (r10 != 0) goto L23
            if (r11 == 0) goto L91
        L23:
            if (r10 == 0) goto L2a
            java.lang.Class[] r2 = r10.getParameterTypes()
            goto L2e
        L2a:
            java.lang.Class[] r2 = r11.getParameterTypes()
        L2e:
            if (r10 == 0) goto L35
            java.lang.reflect.Type[] r3 = r10.getGenericParameterTypes()
            goto L39
        L35:
            java.lang.reflect.Type[] r3 = r11.getGenericParameterTypes()
        L39:
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            java.util.List r0 = java.util.Arrays.asList(r3)
            r1.addAll(r0)
            if (r10 == 0) goto L4e
            java.lang.annotation.Annotation[][] r10 = r10.getParameterAnnotations()
            goto L52
        L4e:
            java.lang.annotation.Annotation[][] r10 = r11.getParameterAnnotations()
        L52:
            r11 = 0
            r1 = r9
            r0 = 0
        L55:
            int r2 = r10.length
            if (r0 >= r2) goto L90
            r2 = r10[r0]
            int r3 = r2.length
            r4 = 0
        L5c:
            if (r4 >= r3) goto L8d
            r5 = r2[r4]
            java.lang.Class r6 = r5.annotationType()
            java.lang.Class<org.bson.codecs.pojo.annotations.BsonProperty> r7 = org.bson.codecs.pojo.annotations.BsonProperty.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L74
            java.util.List<org.bson.codecs.pojo.annotations.BsonProperty> r2 = r8.properties
            org.bson.codecs.pojo.annotations.BsonProperty r5 = (org.bson.codecs.pojo.annotations.BsonProperty) r5
            r2.add(r5)
            goto L8d
        L74:
            java.lang.Class r5 = r5.annotationType()
            java.lang.Class<org.bson.codecs.pojo.annotations.BsonId> r6 = org.bson.codecs.pojo.annotations.BsonId.class
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8a
            java.util.List<org.bson.codecs.pojo.annotations.BsonProperty> r1 = r8.properties
            r1.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L8d
        L8a:
            int r4 = r4 + 1
            goto L5c
        L8d:
            int r0 = r0 + 1
            goto L55
        L90:
            r9 = r1
        L91:
            r8.idPropertyIndex = r9
            return
    }

    public CreatorExecutable(java.lang.Class<T> r2, java.lang.reflect.Method r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    private void checkHasAnExecutable() {
            r4 = this;
            java.lang.reflect.Constructor<T> r0 = r4.constructor
            if (r0 != 0) goto L21
            java.lang.reflect.Method r0 = r4.method
            if (r0 == 0) goto L9
            goto L21
        L9:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Class<T> r3 = r4.clazz
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = "Cannot find a public constructor for '%s'."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L21:
            return
    }

    private static org.bson.codecs.configuration.CodecConfigurationException getError(java.lang.Class<?> r3, boolean r4, java.lang.String r5) {
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r4 == 0) goto La
            java.lang.String r4 = "constructor"
            goto Lc
        La:
            java.lang.String r4 = "method"
        Lc:
            r2 = 0
            r1[r2] = r4
            r4 = 1
            java.lang.String r3 = r3.getSimpleName()
            r1[r4] = r3
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "Invalid @BsonCreator %s in %s. %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            return r0
    }

    public final org.bson.codecs.configuration.CodecConfigurationException getError(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            java.lang.reflect.Constructor<T> r0 = r1.constructor
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            org.bson.codecs.configuration.CodecConfigurationException r2 = getError(r2, r0, r3)
            return r2
    }

    public final java.lang.Integer getIdPropertyIndex() {
            r1 = this;
            java.lang.Integer r0 = r1.idPropertyIndex
            return r0
    }

    public final T getInstance() {
            r3 = this;
            r3.checkHasAnExecutable()
            java.lang.reflect.Constructor<T> r0 = r3.constructor     // Catch: java.lang.Exception -> L1a
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1a
            return r0
        Lf:
            java.lang.reflect.Method r0 = r3.method     // Catch: java.lang.Exception -> L1a
            java.lang.Class<T> r2 = r3.clazz     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r0 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    public final T getInstance(java.lang.Object[] r3) {
            r2 = this;
            r2.checkHasAnExecutable()
            java.lang.reflect.Constructor<T> r0 = r2.constructor     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto Lc
            java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.Exception -> L15
            return r3
        Lc:
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L15
            java.lang.Class<T> r1 = r2.clazz     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    public final java.util.List<java.lang.reflect.Type> getParameterGenericTypes() {
            r1 = this;
            java.util.List<java.lang.reflect.Type> r0 = r1.parameterGenericTypes
            return r0
    }

    public final java.util.List<java.lang.Class<?>> getParameterTypes() {
            r1 = this;
            java.util.List<java.lang.Class<?>> r0 = r1.parameterTypes
            return r0
    }

    public final java.util.List<org.bson.codecs.pojo.annotations.BsonProperty> getProperties() {
            r1 = this;
            java.util.List<org.bson.codecs.pojo.annotations.BsonProperty> r0 = r1.properties
            return r0
    }

    public final java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.clazz
            return r0
    }
}
