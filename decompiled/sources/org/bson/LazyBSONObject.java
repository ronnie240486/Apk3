package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class LazyBSONObject implements org.bson.BSONObject {
    private final byte[] bytes;
    private final org.bson.LazyBSONCallback callback;
    private final int offset;


    /* JADX INFO: renamed from: org.bson.LazyBSONObject$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r1 = org.bson.BsonType.STRING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L3e
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L49
                org.bson.BsonType r1 = org.bson.BsonType.NULL     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L54
                org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L60
                org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L6c
                org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L78
                org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L84
                org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L90
                org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L9c
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> La8
                org.bson.BsonType r1 = org.bson.BsonType.SYMBOL     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Le4
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lf0
                org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lfc
                org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                return
        }
    }

    public LazyBSONObject(byte[] r1, int r2, org.bson.LazyBSONCallback r3) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            r0.callback = r3
            r0.offset = r2
            return
    }

    public LazyBSONObject(byte[] r2, org.bson.LazyBSONCallback r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    private java.nio.ByteBuffer getBufferForInternalBytes() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            int r2 = r0.length
            int r2 = r2 - r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = r0.slice()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            int r1 = r0.getInt()
            r0.limit(r1)
            r0.rewind()
            return r0
    }

    private java.lang.Object readArray(org.bson.BsonBinaryReader r4) {
            r3 = this;
            org.bson.io.BsonInput r0 = r4.getBsonInput()
            int r0 = r0.getPosition()
            r4.skipValue()
            org.bson.LazyBSONCallback r4 = r3.callback
            byte[] r1 = r3.bytes
            int r2 = r3.offset
            int r2 = r2 + r0
            java.util.List r4 = r4.createArray(r1, r2)
            return r4
    }

    private java.lang.Object readDocument(org.bson.BsonBinaryReader r4) {
            r3 = this;
            org.bson.io.BsonInput r0 = r4.getBsonInput()
            int r0 = r0.getPosition()
            r4.skipValue()
            org.bson.LazyBSONCallback r4 = r3.callback
            byte[] r1 = r3.bytes
            int r2 = r3.offset
            int r2 = r2 + r0
            java.lang.Object r4 = r4.createObject(r1, r2)
            return r4
    }

    private java.lang.Object readJavaScriptWithScopeDocument(org.bson.BsonBinaryReader r4) {
            r3 = this;
            org.bson.io.BsonInput r0 = r4.getBsonInput()
            int r0 = r0.getPosition()
            r4.readStartDocument()
        Lb:
            org.bson.BsonType r1 = r4.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L1a
            r4.skipName()
            r4.skipValue()
            goto Lb
        L1a:
            r4.readEndDocument()
            org.bson.LazyBSONCallback r4 = r3.callback
            byte[] r1 = r3.bytes
            int r2 = r3.offset
            int r2 = r2 + r0
            java.lang.Object r4 = r4.createObject(r1, r2)
            return r4
    }

    @Override // org.bson.BSONObject
    public boolean containsField(java.lang.String r4) {
            r3 = this;
            org.bson.BsonBinaryReader r0 = r3.getBsonReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L27
        L7:
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L27
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L27
            if (r1 == r2) goto L22
            java.lang.String r1 = r0.readName()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1e
            r4 = 1
            r0.close()
            return r4
        L1e:
            r0.skipValue()     // Catch: java.lang.Throwable -> L27
            goto L7
        L22:
            r0.close()
            r4 = 0
            return r4
        L27:
            r4 = move-exception
            r0.close()
            throw r4
    }

    @Override // org.bson.BSONObject
    @java.lang.Deprecated
    public boolean containsKey(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.containsField(r1)
            return r1
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.bson.BsonBinaryReader r1 = r5.getBsonReader()
            r1.readStartDocument()     // Catch: java.lang.Throwable -> L31
        Lc:
            org.bson.BsonType r2 = r1.readBsonType()     // Catch: java.lang.Throwable -> L31
            org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L31
            if (r2 == r3) goto L25
            java.util.AbstractMap$SimpleImmutableEntry r2 = new java.util.AbstractMap$SimpleImmutableEntry     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.readName()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r5.readValue(r1)     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L31
            r0.add(r2)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L25:
            r1.readEndDocument()     // Catch: java.lang.Throwable -> L31
            r1.close()
            org.bson.LazyBSONObject$1 r1 = new org.bson.LazyBSONObject$1
            r1.<init>(r0)
            return r1
        L31:
            r0 = move-exception
            r1.close()
            throw r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L50
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L12
            goto L50
        L12:
            org.bson.LazyBSONObject r8 = (org.bson.LazyBSONObject) r8
            byte[] r2 = r7.bytes
            byte[] r3 = r8.bytes
            if (r2 != r3) goto L21
            int r4 = r7.offset
            int r5 = r8.offset
            if (r4 != r5) goto L21
            return r0
        L21:
            if (r2 == 0) goto L50
            if (r3 != 0) goto L26
            goto L50
        L26:
            int r4 = r2.length
            if (r4 == 0) goto L50
            int r4 = r3.length
            if (r4 != 0) goto L2d
            goto L50
        L2d:
            int r4 = r7.offset
            r2 = r2[r4]
            int r4 = r8.offset
            r3 = r3[r4]
            if (r3 == r2) goto L38
            return r1
        L38:
            r3 = 0
        L39:
            if (r3 >= r2) goto L4f
            byte[] r4 = r7.bytes
            int r5 = r7.offset
            int r5 = r5 + r3
            r4 = r4[r5]
            byte[] r5 = r8.bytes
            int r6 = r8.offset
            int r6 = r6 + r3
            r5 = r5[r6]
            if (r4 == r5) goto L4c
            return r1
        L4c:
            int r3 = r3 + 1
            goto L39
        L4f:
            return r0
        L50:
            return r1
    }

    @Override // org.bson.BSONObject
    public java.lang.Object get(java.lang.String r5) {
            r4 = this;
            org.bson.BsonBinaryReader r0 = r4.getBsonReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L27
            r1 = 0
        L8:
            org.bson.BsonType r2 = r0.readBsonType()     // Catch: java.lang.Throwable -> L27
            org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L27
            if (r2 == r3) goto L23
            java.lang.String r2 = r0.readName()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L1f
            java.lang.Object r1 = r4.readValue(r0)     // Catch: java.lang.Throwable -> L27
            goto L23
        L1f:
            r0.skipValue()     // Catch: java.lang.Throwable -> L27
            goto L8
        L23:
            r0.close()
            return r1
        L27:
            r5 = move-exception
            r0.close()
            throw r5
    }

    public int getBSONSize() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.getBufferForInternalBytes()
            int r0 = r0.getInt()
            return r0
    }

    public final org.bson.BsonBinaryReader getBsonReader() {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.getBufferForInternalBytes()
            org.bson.BsonBinaryReader r1 = new org.bson.BsonBinaryReader
            org.bson.io.ByteBufferBsonInput r2 = new org.bson.io.ByteBufferBsonInput
            org.bson.ByteBufNIO r3 = new org.bson.ByteBufNIO
            r3.<init>(r0)
            r2.<init>(r3)
            r1.<init>(r2)
            return r1
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.getBSONSize()
            int r1 = r4.offset
            r2 = 1
        L7:
            int r3 = r4.offset
            int r3 = r3 + r0
            if (r1 >= r3) goto L16
            int r2 = r2 * 31
            byte[] r3 = r4.bytes
            r3 = r3[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L7
        L16:
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // org.bson.BSONObject
    public java.util.Set<java.lang.String> keySet() {
            r4 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            org.bson.BsonBinaryReader r1 = r4.getBsonReader()
            r1.readStartDocument()     // Catch: java.lang.Throwable -> L2a
        Lc:
            org.bson.BsonType r2 = r1.readBsonType()     // Catch: java.lang.Throwable -> L2a
            org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L2a
            if (r2 == r3) goto L1f
            java.lang.String r2 = r1.readName()     // Catch: java.lang.Throwable -> L2a
            r0.add(r2)     // Catch: java.lang.Throwable -> L2a
            r1.skipValue()     // Catch: java.lang.Throwable -> L2a
            goto Lc
        L1f:
            r1.readEndDocument()     // Catch: java.lang.Throwable -> L2a
            r1.close()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L2a:
            r0 = move-exception
            r1.close()
            throw r0
    }

    public int pipe(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.WritableByteChannel r2 = java.nio.channels.Channels.newChannel(r2)
            java.nio.ByteBuffer r0 = r1.getBufferForInternalBytes()
            int r2 = r2.write(r0)
            return r2
    }

    @Override // org.bson.BSONObject
    public java.lang.Object put(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Object is read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.BSONObject, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BSONObject
    public void putAll(org.bson.BSONObject r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.Object readValue(org.bson.BsonBinaryReader r4) {
            r3 = this;
            int[] r0 = org.bson.LazyBSONObject.AnonymousClass2.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r1 = r4.getCurrentBsonType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L12f;
                case 2: goto L12a;
                case 3: goto L121;
                case 4: goto L11c;
                case 5: goto Lce;
                case 6: goto Lca;
                case 7: goto Lc6;
                case 8: goto Lc1;
                case 9: goto Lb8;
                case 10: goto Lae;
                case 11: goto L99;
                case 12: goto L86;
                case 13: goto L7c;
                case 14: goto L72;
                case 15: goto L62;
                case 16: goto L59;
                case 17: goto L47;
                case 18: goto L3e;
                case 19: goto L39;
                case 20: goto L30;
                case 21: goto L27;
                default: goto L10;
            }
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unhandled BSON type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.BsonType r4 = r4.getCurrentBsonType()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L27:
            r4.readMaxKey()
            org.bson.types.MaxKey r4 = new org.bson.types.MaxKey
            r4.<init>()
            return r4
        L30:
            r4.readMinKey()
            org.bson.types.MinKey r4 = new org.bson.types.MinKey
            r4.<init>()
            return r4
        L39:
            org.bson.types.Decimal128 r4 = r4.readDecimal128()
            return r4
        L3e:
            long r0 = r4.readInt64()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L47:
            org.bson.BsonTimestamp r4 = r4.readTimestamp()
            org.bson.types.BSONTimestamp r0 = new org.bson.types.BSONTimestamp
            int r1 = r4.getTime()
            int r4 = r4.getInc()
            r0.<init>(r1, r4)
            return r0
        L59:
            int r4 = r4.readInt32()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L62:
            org.bson.types.CodeWScope r0 = new org.bson.types.CodeWScope
            java.lang.String r1 = r4.readJavaScriptWithScope()
            java.lang.Object r4 = r3.readJavaScriptWithScopeDocument(r4)
            org.bson.BSONObject r4 = (org.bson.BSONObject) r4
            r0.<init>(r1, r4)
            return r0
        L72:
            org.bson.types.Symbol r0 = new org.bson.types.Symbol
            java.lang.String r4 = r4.readSymbol()
            r0.<init>(r4)
            return r0
        L7c:
            org.bson.types.Code r0 = new org.bson.types.Code
            java.lang.String r4 = r4.readJavaScript()
            r0.<init>(r4)
            return r0
        L86:
            org.bson.BsonDbPointer r4 = r4.readDBPointer()
            org.bson.LazyBSONCallback r0 = r3.callback
            java.lang.String r1 = r4.getNamespace()
            org.bson.types.ObjectId r4 = r4.getId()
            java.lang.Object r4 = r0.createDBRef(r1, r4)
            return r4
        L99:
            org.bson.BsonRegularExpression r4 = r4.readRegularExpression()
            java.lang.String r0 = r4.getPattern()
            java.lang.String r4 = r4.getOptions()
            int r4 = org.bson.BSON.regexFlags(r4)
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r0, r4)
            return r4
        Lae:
            java.util.Date r0 = new java.util.Date
            long r1 = r4.readDateTime()
            r0.<init>(r1)
            return r0
        Lb8:
            boolean r4 = r4.readBoolean()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        Lc1:
            org.bson.types.ObjectId r4 = r4.readObjectId()
            return r4
        Lc6:
            r4.readUndefined()
            return r1
        Lca:
            r4.readNull()
            return r1
        Lce:
            byte r0 = r4.peekBinarySubType()
            boolean r1 = org.bson.BsonBinarySubType.isUuid(r0)
            if (r1 == 0) goto Lf4
            int r1 = r4.peekBinarySize()
            r2 = 16
            if (r1 != r2) goto Lf4
            org.bson.codecs.UuidCodec r0 = new org.bson.codecs.UuidCodec
            org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.JAVA_LEGACY
            r0.<init>(r1)
            org.bson.codecs.DecoderContext$Builder r1 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r1 = r1.build()
            java.util.UUID r4 = r0.decode(r4, r1)
            return r4
        Lf4:
            org.bson.BsonBinary r4 = r4.readBinaryData()
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.BINARY
            byte r1 = r1.getValue()
            if (r0 == r1) goto L117
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.OLD_BINARY
            byte r1 = r1.getValue()
            if (r0 != r1) goto L109
            goto L117
        L109:
            org.bson.types.Binary r0 = new org.bson.types.Binary
            byte r1 = r4.getType()
            byte[] r4 = r4.getData()
            r0.<init>(r1, r4)
            return r0
        L117:
            byte[] r4 = r4.getData()
            return r4
        L11c:
            java.lang.String r4 = r4.readString()
            return r4
        L121:
            double r0 = r4.readDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
        L12a:
            java.lang.Object r4 = r3.readArray(r4)
            return r4
        L12f:
            java.lang.Object r4 = r3.readDocument(r4)
            return r4
    }

    @Override // org.bson.BSONObject
    public java.lang.Object removeField(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BSONObject
    public java.util.Map toMap() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto Ld
        L25:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
