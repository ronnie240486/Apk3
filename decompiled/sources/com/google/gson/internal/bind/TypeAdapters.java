package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> ATOMIC_BOOLEAN = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> ATOMIC_INTEGER = null;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> ATOMIC_INTEGER_ARRAY = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.math.BigDecimal> BIG_DECIMAL = null;
    public static final com.google.gson.TypeAdapter<java.math.BigInteger> BIG_INTEGER = null;
    public static final com.google.gson.TypeAdapter<java.util.BitSet> BIT_SET = null;
    public static final com.google.gson.TypeAdapterFactory BIT_SET_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN = null;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN_AS_STRING = null;
    public static final com.google.gson.TypeAdapterFactory BOOLEAN_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> BYTE = null;
    public static final com.google.gson.TypeAdapterFactory BYTE_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Calendar> CALENDAR = null;
    public static final com.google.gson.TypeAdapterFactory CALENDAR_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Character> CHARACTER = null;
    public static final com.google.gson.TypeAdapterFactory CHARACTER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Class> CLASS = null;
    public static final com.google.gson.TypeAdapterFactory CLASS_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Currency> CURRENCY = null;
    public static final com.google.gson.TypeAdapterFactory CURRENCY_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> DOUBLE = null;
    public static final com.google.gson.TypeAdapterFactory ENUM_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> FLOAT = null;
    public static final com.google.gson.TypeAdapter<java.net.InetAddress> INET_ADDRESS = null;
    public static final com.google.gson.TypeAdapterFactory INET_ADDRESS_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> INTEGER = null;
    public static final com.google.gson.TypeAdapterFactory INTEGER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<com.google.gson.JsonElement> JSON_ELEMENT = null;
    public static final com.google.gson.TypeAdapterFactory JSON_ELEMENT_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.Locale> LOCALE = null;
    public static final com.google.gson.TypeAdapterFactory LOCALE_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> LONG = null;
    public static final com.google.gson.TypeAdapter<java.lang.Number> SHORT = null;
    public static final com.google.gson.TypeAdapterFactory SHORT_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.String> STRING = null;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuffer> STRING_BUFFER = null;
    public static final com.google.gson.TypeAdapterFactory STRING_BUFFER_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuilder> STRING_BUILDER = null;
    public static final com.google.gson.TypeAdapterFactory STRING_BUILDER_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory STRING_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.net.URI> URI = null;
    public static final com.google.gson.TypeAdapterFactory URI_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.net.URL> URL = null;
    public static final com.google.gson.TypeAdapterFactory URL_FACTORY = null;
    public static final com.google.gson.TypeAdapter<java.util.UUID> UUID = null;
    public static final com.google.gson.TypeAdapterFactory UUID_FACTORY = null;




























    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass34 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                return
        }
    }







    public static final class EnumTypeAdapter<T extends java.lang.Enum<T>> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<T, java.lang.String> constantToName;
        private final java.util.Map<java.lang.String, T> nameToConstant;


        public EnumTypeAdapter(java.lang.Class<T> r11) {
                r10 = this;
                r10.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.nameToConstant = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.constantToName = r0
                java.lang.reflect.Field[] r11 = r11.getDeclaredFields()     // Catch: java.lang.IllegalAccessException -> L64
                int r0 = r11.length     // Catch: java.lang.IllegalAccessException -> L64
                r1 = 0
                r2 = 0
            L18:
                if (r2 >= r0) goto L63
                r3 = r11[r2]     // Catch: java.lang.IllegalAccessException -> L64
                boolean r4 = r3.isEnumConstant()     // Catch: java.lang.IllegalAccessException -> L64
                if (r4 != 0) goto L23
                goto L60
            L23:
                com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter$1 r4 = new com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter$1     // Catch: java.lang.IllegalAccessException -> L64
                r4.<init>(r3)     // Catch: java.lang.IllegalAccessException -> L64
                java.security.AccessController.doPrivileged(r4)     // Catch: java.lang.IllegalAccessException -> L64
                r4 = 0
                java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.IllegalAccessException -> L64
                java.lang.Enum r4 = (java.lang.Enum) r4     // Catch: java.lang.IllegalAccessException -> L64
                java.lang.String r5 = r4.name()     // Catch: java.lang.IllegalAccessException -> L64
                java.lang.Class<com.google.gson.annotations.SerializedName> r6 = com.google.gson.annotations.SerializedName.class
                java.lang.annotation.Annotation r3 = r3.getAnnotation(r6)     // Catch: java.lang.IllegalAccessException -> L64
                com.google.gson.annotations.SerializedName r3 = (com.google.gson.annotations.SerializedName) r3     // Catch: java.lang.IllegalAccessException -> L64
                if (r3 == 0) goto L56
                java.lang.String r5 = r3.value()     // Catch: java.lang.IllegalAccessException -> L64
                java.lang.String[] r3 = r3.alternate()     // Catch: java.lang.IllegalAccessException -> L64
                int r6 = r3.length     // Catch: java.lang.IllegalAccessException -> L64
                r7 = 0
            L4a:
                if (r7 >= r6) goto L56
                r8 = r3[r7]     // Catch: java.lang.IllegalAccessException -> L64
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r9 = r10.nameToConstant     // Catch: java.lang.IllegalAccessException -> L64
                r9.put(r8, r4)     // Catch: java.lang.IllegalAccessException -> L64
                int r7 = r7 + 1
                goto L4a
            L56:
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r3 = r10.nameToConstant     // Catch: java.lang.IllegalAccessException -> L64
                r3.put(r5, r4)     // Catch: java.lang.IllegalAccessException -> L64
                java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r3 = r10.constantToName     // Catch: java.lang.IllegalAccessException -> L64
                r3.put(r4, r5)     // Catch: java.lang.IllegalAccessException -> L64
            L60:
                int r2 = r2 + 1
                goto L18
            L63:
                return
            L64:
                r11 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r11)
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
                r2 = this;
                com.google.gson.stream.JsonToken r0 = r3.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r3.nextNull()
                r3 = 0
                return r3
            Ld:
                java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r0 = r2.nameToConstant
                java.lang.String r3 = r3.nextString()
                java.lang.Object r3 = r0.get(r3)
                java.lang.Enum r3 = (java.lang.Enum) r3
                return r3
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.lang.Enum r1 = r0.read(r1)
                return r1
        }

        public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
                r1 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto Lc
            L4:
                java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r0 = r1.constantToName
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
            Lc:
                r2.value(r3)
                return
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.lang.Enum r2 = (java.lang.Enum) r2
                r0.write(r1, r2)
                return
        }
    }

    static {
            com.google.gson.internal.bind.TypeAdapters$1 r0 = new com.google.gson.internal.bind.TypeAdapters$1
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.CLASS = r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$2 r0 = new com.google.gson.internal.bind.TypeAdapters$2
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.BIT_SET = r0
            java.lang.Class<java.util.BitSet> r1 = java.util.BitSet.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$3 r0 = new com.google.gson.internal.bind.TypeAdapters$3
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN = r0
            com.google.gson.internal.bind.TypeAdapters$4 r1 = new com.google.gson.internal.bind.TypeAdapters$4
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$5 r0 = new com.google.gson.internal.bind.TypeAdapters$5
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.BYTE = r0
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$6 r0 = new com.google.gson.internal.bind.TypeAdapters$6
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.SHORT = r0
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$7 r0 = new com.google.gson.internal.bind.TypeAdapters$7
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.INTEGER = r0
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$8 r0 = new com.google.gson.internal.bind.TypeAdapters$8
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$9 r0 = new com.google.gson.internal.bind.TypeAdapters$9
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r1 = java.util.concurrent.atomic.AtomicBoolean.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$10 r0 = new com.google.gson.internal.bind.TypeAdapters$10
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r1 = java.util.concurrent.atomic.AtomicIntegerArray.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$11 r0 = new com.google.gson.internal.bind.TypeAdapters$11
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.LONG = r0
            com.google.gson.internal.bind.TypeAdapters$12 r0 = new com.google.gson.internal.bind.TypeAdapters$12
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.FLOAT = r0
            com.google.gson.internal.bind.TypeAdapters$13 r0 = new com.google.gson.internal.bind.TypeAdapters$13
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.DOUBLE = r0
            com.google.gson.internal.bind.TypeAdapters$14 r0 = new com.google.gson.internal.bind.TypeAdapters$14
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.CHARACTER = r0
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$15 r0 = new com.google.gson.internal.bind.TypeAdapters$15
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING = r0
            com.google.gson.internal.bind.TypeAdapters$16 r1 = new com.google.gson.internal.bind.TypeAdapters$16
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL = r1
            com.google.gson.internal.bind.TypeAdapters$17 r1 = new com.google.gson.internal.bind.TypeAdapters$17
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$18 r0 = new com.google.gson.internal.bind.TypeAdapters$18
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER = r0
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$19 r0 = new com.google.gson.internal.bind.TypeAdapters$19
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER = r0
            java.lang.Class<java.lang.StringBuffer> r1 = java.lang.StringBuffer.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$20 r0 = new com.google.gson.internal.bind.TypeAdapters$20
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.URL = r0
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.URL_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$21 r0 = new com.google.gson.internal.bind.TypeAdapters$21
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.URI = r0
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.URI_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$22 r0 = new com.google.gson.internal.bind.TypeAdapters$22
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS = r0
            java.lang.Class<java.net.InetAddress> r1 = java.net.InetAddress.class
            com.google.gson.TypeAdapterFactory r0 = newTypeHierarchyFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$23 r0 = new com.google.gson.internal.bind.TypeAdapters$23
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.UUID = r0
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$24 r0 = new com.google.gson.internal.bind.TypeAdapters$24
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.TypeAdapters.CURRENCY = r0
            java.lang.Class<java.util.Currency> r1 = java.util.Currency.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$25 r0 = new com.google.gson.internal.bind.TypeAdapters$25
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.CALENDAR = r0
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.Class<java.util.GregorianCalendar> r2 = java.util.GregorianCalendar.class
            com.google.gson.TypeAdapterFactory r0 = newFactoryForMultipleTypes(r1, r2, r0)
            com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$26 r0 = new com.google.gson.internal.bind.TypeAdapters$26
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.LOCALE = r0
            java.lang.Class<java.util.Locale> r1 = java.util.Locale.class
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$27 r0 = new com.google.gson.internal.bind.TypeAdapters$27
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT = r0
            java.lang.Class<com.google.gson.JsonElement> r1 = com.google.gson.JsonElement.class
            com.google.gson.TypeAdapterFactory r0 = newTypeHierarchyFactory(r1, r0)
            com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY = r0
            com.google.gson.internal.bind.TypeAdapters$28 r0 = new com.google.gson.internal.bind.TypeAdapters$28
            r0.<init>()
            com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY = r0
            return
    }

    private TypeAdapters() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(com.google.gson.reflect.TypeToken<TT> r1, com.google.gson.TypeAdapter<TT> r2) {
            com.google.gson.internal.bind.TypeAdapters$29 r0 = new com.google.gson.internal.bind.TypeAdapters$29
            r0.<init>(r1, r2)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(java.lang.Class<TT> r1, com.google.gson.TypeAdapter<TT> r2) {
            com.google.gson.internal.bind.TypeAdapters$30 r0 = new com.google.gson.internal.bind.TypeAdapters$30
            r0.<init>(r1, r2)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(java.lang.Class<TT> r1, java.lang.Class<TT> r2, com.google.gson.TypeAdapter<? super TT> r3) {
            com.google.gson.internal.bind.TypeAdapters$31 r0 = new com.google.gson.internal.bind.TypeAdapters$31
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactoryForMultipleTypes(java.lang.Class<TT> r1, java.lang.Class<? extends TT> r2, com.google.gson.TypeAdapter<? super TT> r3) {
            com.google.gson.internal.bind.TypeAdapters$32 r0 = new com.google.gson.internal.bind.TypeAdapters$32
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T1> com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(java.lang.Class<T1> r1, com.google.gson.TypeAdapter<T1> r2) {
            com.google.gson.internal.bind.TypeAdapters$33 r0 = new com.google.gson.internal.bind.TypeAdapters$33
            r0.<init>(r1, r2)
            return r0
    }
}
