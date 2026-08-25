package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.reflect.ReflectionAccessor accessor;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;


    /* JADX INFO: loaded from: classes2.dex */
    public static final class Adapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        public Adapter(com.google.gson.internal.ObjectConstructor<T> r1, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>()
                r0.constructor = r1
                r0.boundFields = r2
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
                r3 = this;
                com.google.gson.stream.JsonToken r0 = r4.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r4.nextNull()
                r4 = 0
                return r4
            Ld:
                com.google.gson.internal.ObjectConstructor<T> r0 = r3.constructor
                java.lang.Object r0 = r0.construct()
                r4.beginObject()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
            L16:
                boolean r1 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r1 == 0) goto L37
                java.lang.String r1 = r4.nextName()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r2 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r1 == 0) goto L33
                boolean r2 = r1.deserialized     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                if (r2 != 0) goto L2f
                goto L33
            L2f:
                r1.read(r4, r0)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                goto L16
            L33:
                r4.skipValue()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L42
                goto L16
            L37:
                r4.endObject()
                return r0
            L3b:
                r4 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r4)
                throw r0
            L42:
                r4 = move-exception
                com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                r0.<init>(r4)
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L6
                r4.nullValue()
                return
            L6:
                r4.beginObject()
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L32
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L32
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L32
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L32
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L32
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L32
                boolean r2 = r1.writeField(r5)     // Catch: java.lang.IllegalAccessException -> L32
                if (r2 == 0) goto L13
                java.lang.String r2 = r1.name     // Catch: java.lang.IllegalAccessException -> L32
                r4.name(r2)     // Catch: java.lang.IllegalAccessException -> L32
                r1.write(r4, r5)     // Catch: java.lang.IllegalAccessException -> L32
                goto L13
            L2e:
                r4.endObject()
                return
            L32:
                r4 = move-exception
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>(r4)
                throw r5
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class BoundField {
        public final boolean deserialized;
        public final java.lang.String name;
        public final boolean serialized;

        public BoundField(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.serialized = r2
                r0.deserialized = r3
                return
        }

        public abstract void read(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        public abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        public abstract boolean writeField(java.lang.Object r1) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r2, com.google.gson.FieldNamingStrategy r3, com.google.gson.internal.Excluder r4, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5) {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.reflect.ReflectionAccessor r0 = com.google.gson.internal.reflect.ReflectionAccessor.getInstance()
            r1.accessor = r0
            r1.constructorConstructor = r2
            r1.fieldNamingPolicy = r3
            r1.excluder = r4
            r1.jsonAdapterFactory = r5
            return
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r13, java.lang.reflect.Field r14, java.lang.String r15, com.google.gson.reflect.TypeToken<?> r16, boolean r17, boolean r18) {
            r12 = this;
            r0 = r12
            r8 = r13
            r9 = r16
            java.lang.Class r1 = r16.getRawType()
            boolean r10 = com.google.gson.internal.Primitives.isPrimitive(r1)
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r1 = com.google.gson.annotations.JsonAdapter.class
            r5 = r14
            java.lang.annotation.Annotation r1 = r14.getAnnotation(r1)
            com.google.gson.annotations.JsonAdapter r1 = (com.google.gson.annotations.JsonAdapter) r1
            if (r1 == 0) goto L20
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r2 = r0.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r3 = r0.constructorConstructor
            com.google.gson.TypeAdapter r1 = r2.getTypeAdapter(r3, r13, r9, r1)
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L26
            r2 = 1
            r6 = 1
            goto L28
        L26:
            r2 = 0
            r6 = 0
        L28:
            if (r1 != 0) goto L2e
            com.google.gson.TypeAdapter r1 = r13.getAdapter(r9)
        L2e:
            r7 = r1
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r1 = r11
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r14
            r8 = r13
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson r24, com.google.gson.reflect.TypeToken<?> r25, java.lang.Class<?> r26) {
            r23 = this;
            r7 = r23
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            boolean r0 = r26.isInterface()
            if (r0 == 0) goto Le
            return r8
        Le:
            java.lang.reflect.Type r9 = r25.getType()
            r10 = r25
            r11 = r26
        L16:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r11 == r0) goto Ld1
            java.lang.reflect.Field[] r12 = r11.getDeclaredFields()
            int r13 = r12.length
            r14 = 0
            r15 = 0
        L21:
            if (r15 >= r13) goto Lbb
            r6 = r12[r15]
            r0 = 1
            boolean r0 = r7.excludeField(r6, r0)
            boolean r16 = r7.excludeField(r6, r14)
            if (r0 != 0) goto L34
            if (r16 != 0) goto L34
            goto L9b
        L34:
            com.google.gson.internal.reflect.ReflectionAccessor r1 = r7.accessor
            r1.makeAccessible(r6)
            java.lang.reflect.Type r1 = r10.getType()
            java.lang.reflect.Type r2 = r6.getGenericType()
            java.lang.reflect.Type r17 = com.google.gson.internal.C$Gson$Types.resolve(r1, r11, r2)
            java.util.List r5 = r7.getFieldNames(r6)
            r1 = 0
            int r4 = r5.size()
            r3 = r1
            r2 = 0
        L50:
            if (r2 >= r4) goto L98
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r2 == 0) goto L5d
            r18 = 0
            goto L5f
        L5d:
            r18 = r0
        L5f:
            com.google.gson.reflect.TypeToken r19 = com.google.gson.reflect.TypeToken.get(r17)
            r0 = r23
            r25 = r1
            r1 = r24
            r20 = r2
            r2 = r6
            r14 = r3
            r3 = r25
            r21 = r4
            r4 = r19
            r19 = r5
            r5 = r18
            r22 = r6
            r6 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = r0.createBoundField(r1, r2, r3, r4, r5, r6)
            r1 = r25
            java.lang.Object r0 = r8.put(r1, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r0
            if (r14 != 0) goto L8b
            r3 = r0
            goto L8c
        L8b:
            r3 = r14
        L8c:
            int r2 = r20 + 1
            r0 = r18
            r5 = r19
            r4 = r21
            r6 = r22
            r14 = 0
            goto L50
        L98:
            r14 = r3
            if (r14 != 0) goto L9f
        L9b:
            int r15 = r15 + 1
            r14 = 0
            goto L21
        L9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r14.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lbb:
            java.lang.reflect.Type r0 = r10.getType()
            java.lang.reflect.Type r1 = r11.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r11, r1)
            com.google.gson.reflect.TypeToken r10 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r11 = r10.getRawType()
            goto L16
        Ld1:
            return r8
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r5) {
            r4 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L15
            com.google.gson.FieldNamingStrategy r0 = r4.fieldNamingPolicy
            java.lang.String r5 = r0.translateName(r5)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L15:
            java.lang.String r5 = r0.value()
            java.lang.String[] r0 = r0.alternate()
            int r1 = r0.length
            if (r1 != 0) goto L25
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L25:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            int r2 = r2 + 1
            r1.<init>(r2)
            r1.add(r5)
            int r5 = r0.length
            r2 = 0
        L32:
            if (r2 >= r5) goto L3c
            r3 = r0[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto L32
        L3c:
            return r1
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.Class r0 = r5.getRawType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Le
            r4 = 0
            return r4
        Le:
            com.google.gson.internal.ConstructorConstructor r1 = r3.constructorConstructor
            com.google.gson.internal.ObjectConstructor r1 = r1.get(r5)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.Map r4 = r3.getBoundFields(r4, r5, r0)
            r2.<init>(r1, r4)
            return r2
    }

    public boolean excludeField(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            com.google.gson.internal.Excluder r0 = r2.excluder
            java.lang.Class r1 = r3.getType()
            boolean r1 = r0.excludeClass(r1, r4)
            if (r1 != 0) goto L14
            boolean r3 = r0.excludeField(r3, r4)
            if (r3 != 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }
}
