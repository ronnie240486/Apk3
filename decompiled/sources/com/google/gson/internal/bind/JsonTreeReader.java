package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader extends com.google.gson.stream.JsonReader {
    private static final java.lang.Object SENTINEL_CLOSED = null;
    private static final java.io.Reader UNREADABLE_READER = null;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private java.lang.Object[] stack;
    private int stackSize;


    static {
            com.google.gson.internal.bind.JsonTreeReader$1 r0 = new com.google.gson.internal.bind.JsonTreeReader$1
            r0.<init>()
            com.google.gson.internal.bind.JsonTreeReader.UNREADABLE_READER = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED = r0
            return
    }

    public JsonTreeReader(com.google.gson.JsonElement r3) {
            r2 = this;
            java.io.Reader r0 = com.google.gson.internal.bind.JsonTreeReader.UNREADABLE_READER
            r2.<init>(r0)
            r0 = 32
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.stack = r1
            r1 = 0
            r2.stackSize = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.pathNames = r1
            int[] r0 = new int[r0]
            r2.pathIndices = r0
            r2.push(r3)
            return
    }

    private void expect(com.google.gson.stream.JsonToken r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            if (r0 != r4) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " but was "
            r1.append(r4)
            com.google.gson.stream.JsonToken r4 = r3.peek()
            r1.append(r4)
            java.lang.String r4 = r3.locationString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private java.lang.String locationString() {
            r2 = this;
            java.lang.String r0 = " at path "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getPath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.Object peekStack() {
            r2 = this;
            java.lang.Object[] r0 = r2.stack
            int r1 = r2.stackSize
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    private java.lang.Object popStack() {
            r4 = this;
            java.lang.Object[] r0 = r4.stack
            int r1 = r4.stackSize
            int r1 = r1 + (-1)
            r4.stackSize = r1
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            return r2
    }

    private void push(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.stackSize
            java.lang.Object[] r1 = r3.stack
            int r2 = r1.length
            if (r0 != r2) goto L21
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.stack = r1
            int[] r1 = r3.pathIndices
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.pathIndices = r1
            java.lang.String[] r1 = r3.pathNames
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.pathNames = r0
        L21:
            java.lang.Object[] r0 = r3.stack
            int r1 = r3.stackSize
            int r2 = r1 + 1
            r3.stackSize = r2
            r0[r1] = r4
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            r3.expect(r0)
            java.lang.Object r0 = r3.peekStack()
            com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
            java.util.Iterator r0 = r0.iterator()
            r3.push(r0)
            int[] r0 = r3.pathIndices
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws java.io.IOException {
            r1 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            r1.expect(r0)
            java.lang.Object r0 = r1.peekStack()
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.push(r0)
            return
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r2 = com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED
            r3 = 0
            r1[r3] = r2
            r4.stack = r1
            r4.stackSize = r0
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_ARRAY
            r3.expect(r0)
            r3.popStack()
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L19
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L19:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_OBJECT
            r3.expect(r0)
            r3.popStack()
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L19
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L19:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String getPath() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 36
            r0.append(r1)
            r1 = 0
        Lb:
            int r2 = r5.stackSize
            if (r1 >= r2) goto L56
            java.lang.Object[] r3 = r5.stack
            r4 = r3[r1]
            boolean r4 = r4 instanceof com.google.gson.JsonArray
            if (r4 == 0) goto L33
            int r1 = r1 + 1
            if (r1 >= r2) goto L53
            r2 = r3[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L53
            r2 = 91
            r0.append(r2)
            int[] r2 = r5.pathIndices
            r2 = r2[r1]
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            goto L53
        L33:
            r4 = r3[r1]
            boolean r4 = r4 instanceof com.google.gson.JsonObject
            if (r4 == 0) goto L53
            int r1 = r1 + 1
            if (r1 >= r2) goto L53
            r2 = r3[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L53
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r5.pathNames
            r3 = r2[r1]
            if (r3 == 0) goto L53
            r2 = r2[r1]
            r0.append(r2)
        L53:
            int r1 = r1 + 1
            goto Lb
        L56:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r2.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT
            if (r0 == r1) goto Le
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BOOLEAN
            r4.expect(r0)
            java.lang.Object r0 = r4.popStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            boolean r0 = r0.getAsBoolean()
            int r1 = r4.stackSize
            if (r1 <= 0) goto L1d
            int[] r2 = r4.pathIndices
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L1d:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L33
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.locationString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.peekStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            double r0 = r0.getAsDouble()
            boolean r2 = r5.isLenient()
            if (r2 != 0) goto L67
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L50
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 != 0) goto L50
            goto L67
        L50:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L67:
            r5.popStack()
            int r2 = r5.stackSize
            if (r2 <= 0) goto L78
            int[] r3 = r5.pathIndices
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = r4 + 1
            r3[r2] = r4
        L78:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L33
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.locationString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.peekStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            int r0 = r0.getAsInt()
            r5.popStack()
            int r1 = r5.stackSize
            if (r1 <= 0) goto L4e
            int[] r2 = r5.pathIndices
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L4e:
            return r0
    }

    public final com.google.gson.JsonElement nextJsonElement() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT
            if (r0 == r1) goto L1e
            java.lang.Object r0 = r4.peekStack()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            r4.skipValue()
            return r0
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " when reading a JsonElement."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L33
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.locationString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.peekStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            long r0 = r0.getAsLong()
            r5.popStack()
            int r2 = r5.stackSize
            if (r2 <= 0) goto L4e
            int[] r3 = r5.pathIndices
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = r4 + 1
            r3[r2] = r4
        L4e:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextName() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            r4.expect(r0)
            java.lang.Object r0 = r4.peekStack()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r2 = r4.pathNames
            int r3 = r4.stackSize
            int r3 = r3 + (-1)
            r2[r3] = r1
            java.lang.Object r0 = r0.getValue()
            r4.push(r0)
            return r1
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NULL
            r3.expect(r0)
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L16
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L16:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextString() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            if (r0 == r1) goto L33
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.locationString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.popStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            java.lang.String r0 = r0.getAsString()
            int r1 = r5.stackSize
            if (r1 <= 0) goto L4b
            int[] r2 = r5.pathIndices
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L4b:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
            r3 = this;
            int r0 = r3.stackSize
            if (r0 != 0) goto L7
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_DOCUMENT
            return r0
        L7:
            java.lang.Object r0 = r3.peekStack()
            boolean r1 = r0 instanceof java.util.Iterator
            if (r1 == 0) goto L3a
            java.lang.Object[] r1 = r3.stack
            int r2 = r3.stackSize
            int r2 = r2 + (-2)
            r1 = r1[r2]
            boolean r1 = r1 instanceof com.google.gson.JsonObject
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            if (r1 == 0) goto L26
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            return r0
        L26:
            java.lang.Object r0 = r0.next()
            r3.push(r0)
            com.google.gson.stream.JsonToken r0 = r3.peek()
            return r0
        L32:
            if (r1 == 0) goto L37
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_OBJECT
            goto L39
        L37:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_ARRAY
        L39:
            return r0
        L3a:
            boolean r1 = r0 instanceof com.google.gson.JsonObject
            if (r1 == 0) goto L41
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            return r0
        L41:
            boolean r1 = r0 instanceof com.google.gson.JsonArray
            if (r1 == 0) goto L48
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            return r0
        L48:
            boolean r1 = r0 instanceof com.google.gson.JsonPrimitive
            if (r1 == 0) goto L6f
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            boolean r1 = r0.isString()
            if (r1 == 0) goto L57
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.STRING
            return r0
        L57:
            boolean r1 = r0.isBoolean()
            if (r1 == 0) goto L60
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BOOLEAN
            return r0
        L60:
            boolean r0 = r0.isNumber()
            if (r0 == 0) goto L69
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NUMBER
            return r0
        L69:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L6f:
            boolean r1 = r0 instanceof com.google.gson.JsonNull
            if (r1 == 0) goto L76
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NULL
            return r0
        L76:
            java.lang.Object r1 = com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED
            if (r0 != r1) goto L82
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L82:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public void promoteNameToValue() throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            r2.expect(r0)
            java.lang.Object r0 = r2.peekStack()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            r2.push(r1)
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            r2.push(r1)
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME
            java.lang.String r2 = "null"
            if (r0 != r1) goto L16
            r3.nextName()
            java.lang.String[] r0 = r3.pathNames
            int r1 = r3.stackSize
            int r1 = r1 + (-2)
            r0[r1] = r2
            goto L23
        L16:
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L23
            java.lang.String[] r1 = r3.pathNames
            int r0 = r0 + (-1)
            r1[r0] = r2
        L23:
            int r0 = r3.stackSize
            if (r0 <= 0) goto L31
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L31:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String toString() {
            r2 = this;
            java.lang.Class<com.google.gson.internal.bind.JsonTreeReader> r0 = com.google.gson.internal.bind.JsonTreeReader.class
            java.lang.String r0 = "JsonTreeReader"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.locationString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
