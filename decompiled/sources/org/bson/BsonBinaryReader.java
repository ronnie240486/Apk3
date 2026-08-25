package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BsonBinaryReader extends org.bson.AbstractBsonReader {
    private final org.bson.io.BsonInput bsonInput;
    private org.bson.BsonBinaryReader.Mark mark;

    /* JADX INFO: renamed from: org.bson.BsonBinaryReader$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonContextType = null;
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                r1 = 1
                org.bson.BsonType r2 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r3 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r4 = org.bson.BsonType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r4 = org.bson.BsonType.DATE_TIME     // Catch: java.lang.NoSuchFieldError -> L33
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L3e
                org.bson.BsonType r4 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5 = 5
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L49
                org.bson.BsonType r4 = org.bson.BsonType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r5 = 6
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L54
                org.bson.BsonType r4 = org.bson.BsonType.INT32     // Catch: java.lang.NoSuchFieldError -> L54
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r5 = 7
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L60
                org.bson.BsonType r4 = org.bson.BsonType.INT64     // Catch: java.lang.NoSuchFieldError -> L60
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r5 = 8
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L6c
                org.bson.BsonType r4 = org.bson.BsonType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L6c
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r5 = 9
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L78
                org.bson.BsonType r4 = org.bson.BsonType.JAVASCRIPT     // Catch: java.lang.NoSuchFieldError -> L78
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r5 = 10
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L84
                org.bson.BsonType r4 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> L84
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r5 = 11
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L90
                org.bson.BsonType r4 = org.bson.BsonType.MAX_KEY     // Catch: java.lang.NoSuchFieldError -> L90
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r5 = 12
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L9c
                org.bson.BsonType r4 = org.bson.BsonType.MIN_KEY     // Catch: java.lang.NoSuchFieldError -> L9c
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r5 = 13
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> La8
                org.bson.BsonType r4 = org.bson.BsonType.NULL     // Catch: java.lang.NoSuchFieldError -> La8
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r5 = 14
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.bson.BsonType r4 = org.bson.BsonType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r5 = 15
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.bson.BsonType r4 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r5 = 16
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.bson.BsonType r4 = org.bson.BsonType.STRING     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r5 = 17
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.bson.BsonType r4 = org.bson.BsonType.SYMBOL     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r5 = 18
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Le4
                org.bson.BsonType r4 = org.bson.BsonType.TIMESTAMP     // Catch: java.lang.NoSuchFieldError -> Le4
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r5 = 19
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lf0
                org.bson.BsonType r4 = org.bson.BsonType.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r5 = 20
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r3 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> Lfc
                org.bson.BsonType r4 = org.bson.BsonType.DB_POINTER     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r5 = 21
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                org.bson.BsonContextType[] r3 = org.bson.BsonContextType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType = r3
                org.bson.BsonContextType r4 = org.bson.BsonContextType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L10d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10d
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L10d
            L10d:
                int[] r1 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L117
                org.bson.BsonContextType r3 = org.bson.BsonContextType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L117
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L117
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L117
            L117:
                int[] r0 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType     // Catch: java.lang.NoSuchFieldError -> L121
                org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L121
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L121
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L121
            L121:
                return
        }
    }

    public class Context extends org.bson.AbstractBsonReader.Context {
        private final int size;
        private final int startPosition;

        public Context(org.bson.BsonBinaryReader r1, org.bson.BsonBinaryReader.Context r2, org.bson.BsonContextType r3, int r4, int r5) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.startPosition = r4
                r0.size = r5
                return
        }

        public static /* synthetic */ int access$000(org.bson.BsonBinaryReader.Context r0) {
                int r0 = r0.startPosition
                return r0
        }

        public static /* synthetic */ int access$100(org.bson.BsonBinaryReader.Context r0) {
                int r0 = r0.size
                return r0
        }

        public final org.bson.BsonBinaryReader.Context popContext(int r5) {
                r4 = this;
                int r0 = r4.startPosition
                int r5 = r5 - r0
                int r0 = r4.size
                if (r5 != r0) goto Le
                org.bson.AbstractBsonReader$Context r5 = r4.getParentContext()
                org.bson.BsonBinaryReader$Context r5 = (org.bson.BsonBinaryReader.Context) r5
                return r5
            Le:
                org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.size
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                r2 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1[r2] = r5
                java.lang.String r5 = "Expected size to be %d, not %d."
                java.lang.String r5 = java.lang.String.format(r5, r1)
                r0.<init>(r5)
                throw r0
        }
    }

    public class Mark extends org.bson.AbstractBsonReader.Mark {
        private final org.bson.io.BsonInputMark bsonInputMark;
        private final int size;
        private final int startPosition;
        public final /* synthetic */ org.bson.BsonBinaryReader this$0;

        public Mark(org.bson.BsonBinaryReader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                org.bson.BsonBinaryReader$Context r0 = r2.getContext()
                int r0 = org.bson.BsonBinaryReader.Context.access$000(r0)
                r1.startPosition = r0
                org.bson.BsonBinaryReader$Context r0 = r2.getContext()
                int r0 = org.bson.BsonBinaryReader.Context.access$100(r0)
                r1.size = r0
                org.bson.io.BsonInput r2 = org.bson.BsonBinaryReader.access$200(r2)
                r0 = 2147483647(0x7fffffff, float:NaN)
                org.bson.io.BsonInputMark r2 = r2.getMark(r0)
                r1.bsonInputMark = r2
                return
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
                r8 = this;
                super.reset()
                org.bson.io.BsonInputMark r0 = r8.bsonInputMark
                r0.reset()
                org.bson.BsonBinaryReader r0 = r8.this$0
                org.bson.BsonBinaryReader$Context r7 = new org.bson.BsonBinaryReader$Context
                org.bson.AbstractBsonReader$Context r1 = r8.getParentContext()
                r3 = r1
                org.bson.BsonBinaryReader$Context r3 = (org.bson.BsonBinaryReader.Context) r3
                org.bson.BsonContextType r4 = r8.getContextType()
                int r5 = r8.startPosition
                int r6 = r8.size
                r1 = r7
                r2 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r0.setContext(r7)
                return
        }
    }

    public BsonBinaryReader(java.nio.ByteBuffer r4) {
            r3 = this;
            org.bson.io.ByteBufferBsonInput r0 = new org.bson.io.ByteBufferBsonInput
            org.bson.ByteBufNIO r1 = new org.bson.ByteBufNIO
            java.lang.String r2 = "byteBuffer"
            java.lang.Object r4 = org.bson.assertions.Assertions.notNull(r2, r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.<init>(r4)
            r0.<init>(r1)
            r3.<init>(r0)
            return
    }

    public BsonBinaryReader(org.bson.io.BsonInput r7) {
            r6 = this;
            r6.<init>()
            if (r7 == 0) goto L17
            r6.bsonInput = r7
            org.bson.BsonBinaryReader$Context r7 = new org.bson.BsonBinaryReader$Context
            r2 = 0
            org.bson.BsonContextType r3 = org.bson.BsonContextType.TOP_LEVEL
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setContext(r7)
            return
        L17:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bsonInput is null"
            r7.<init>(r0)
            throw r7
    }

    public static /* synthetic */ org.bson.io.BsonInput access$200(org.bson.BsonBinaryReader r0) {
            org.bson.io.BsonInput r0 = r0.bsonInput
            return r0
    }

    private int readSize() {
            r3 = this;
            org.bson.io.BsonInput r0 = r3.bsonInput
            int r0 = r0.readInt32()
            if (r0 < 0) goto L9
            return r0
        L9:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.lang.String r0 = "Size %s is not valid because it is negative."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            org.bson.BsonSerializationException r1 = new org.bson.BsonSerializationException
            r1.<init>(r0)
            throw r1
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            super.close()
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final int doPeekBinarySize() {
            r1 = this;
            r1.mark()
            int r0 = r1.readSize()
            r1.reset()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final byte doPeekBinarySubType() {
            r1 = this;
            r1.mark()
            r1.readSize()
            org.bson.io.BsonInput r0 = r1.bsonInput
            byte r0 = r0.readByte()
            r1.reset()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonBinary doReadBinaryData() {
            r4 = this;
            int r0 = r4.readSize()
            org.bson.io.BsonInput r1 = r4.bsonInput
            byte r1 = r1.readByte()
            org.bson.BsonBinarySubType r2 = org.bson.BsonBinarySubType.OLD_BINARY
            byte r2 = r2.getValue()
            if (r1 != r2) goto L27
            org.bson.io.BsonInput r2 = r4.bsonInput
            int r2 = r2.readInt32()
            int r3 = r0 + (-4)
            if (r2 != r3) goto L1f
            int r0 = r0 + (-4)
            goto L27
        L1f:
            org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
            java.lang.String r1 = "Binary sub type OldBinary has inconsistent sizes"
            r0.<init>(r1)
            throw r0
        L27:
            byte[] r0 = new byte[r0]
            org.bson.io.BsonInput r2 = r4.bsonInput
            r2.readBytes(r0)
            org.bson.BsonBinary r2 = new org.bson.BsonBinary
            r2.<init>(r1, r0)
            return r2
    }

    @Override // org.bson.AbstractBsonReader
    public final boolean doReadBoolean() {
            r4 = this;
            org.bson.io.BsonInput r0 = r4.bsonInput
            byte r0 = r0.readByte()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 != r2) goto Ld
            goto L21
        Ld:
            org.bson.BsonSerializationException r3 = new org.bson.BsonSerializationException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "Expected a boolean value but found %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r3.<init>(r0)
            throw r3
        L21:
            if (r0 != r2) goto L24
            r1 = 1
        L24:
            return r1
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonDbPointer doReadDBPointer() {
            r3 = this;
            org.bson.BsonDbPointer r0 = new org.bson.BsonDbPointer
            org.bson.io.BsonInput r1 = r3.bsonInput
            java.lang.String r1 = r1.readString()
            org.bson.io.BsonInput r2 = r3.bsonInput
            org.bson.types.ObjectId r2 = r2.readObjectId()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadDateTime() {
            r2 = this;
            org.bson.io.BsonInput r0 = r2.bsonInput
            long r0 = r0.readInt64()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public org.bson.types.Decimal128 doReadDecimal128() {
            r4 = this;
            org.bson.io.BsonInput r0 = r4.bsonInput
            long r0 = r0.readInt64()
            org.bson.io.BsonInput r2 = r4.bsonInput
            long r2 = r2.readInt64()
            org.bson.types.Decimal128 r0 = org.bson.types.Decimal128.fromIEEE754BIDEncoding(r2, r0)
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final double doReadDouble() {
            r2 = this;
            org.bson.io.BsonInput r0 = r2.bsonInput
            double r0 = r0.readDouble()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndArray() {
            r2 = this;
            org.bson.BsonBinaryReader$Context r0 = r2.getContext()
            org.bson.io.BsonInput r1 = r2.bsonInput
            int r1 = r1.getPosition()
            org.bson.BsonBinaryReader$Context r0 = r0.popContext(r1)
            r2.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadEndDocument() {
            r2 = this;
            org.bson.BsonBinaryReader$Context r0 = r2.getContext()
            org.bson.io.BsonInput r1 = r2.bsonInput
            int r1 = r1.getPosition()
            org.bson.BsonBinaryReader$Context r0 = r0.popContext(r1)
            r2.setContext(r0)
            org.bson.BsonBinaryReader$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            if (r0 != r1) goto L2e
            org.bson.BsonBinaryReader$Context r0 = r2.getContext()
            org.bson.io.BsonInput r1 = r2.bsonInput
            int r1 = r1.getPosition()
            org.bson.BsonBinaryReader$Context r0 = r0.popContext(r1)
            r2.setContext(r0)
        L2e:
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final int doReadInt32() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            int r0 = r0.readInt32()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final long doReadInt64() {
            r2 = this;
            org.bson.io.BsonInput r0 = r2.bsonInput
            long r0 = r0.readInt64()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScript() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadJavaScriptWithScope() {
            r7 = this;
            org.bson.io.BsonInput r0 = r7.bsonInput
            int r5 = r0.getPosition()
            int r6 = r7.readSize()
            org.bson.BsonBinaryReader$Context r0 = new org.bson.BsonBinaryReader$Context
            org.bson.BsonBinaryReader$Context r3 = r7.getContext()
            org.bson.BsonContextType r4 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setContext(r0)
            org.bson.io.BsonInput r0 = r7.bsonInput
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadMaxKey() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadMinKey() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadNull() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.types.ObjectId doReadObjectId() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            org.bson.types.ObjectId r0 = r0.readObjectId()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonRegularExpression doReadRegularExpression() {
            r3 = this;
            org.bson.BsonRegularExpression r0 = new org.bson.BsonRegularExpression
            org.bson.io.BsonInput r1 = r3.bsonInput
            java.lang.String r1 = r1.readCString()
            org.bson.io.BsonInput r2 = r3.bsonInput
            java.lang.String r2 = r2.readCString()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartArray() {
            r7 = this;
            org.bson.io.BsonInput r0 = r7.bsonInput
            int r5 = r0.getPosition()
            int r6 = r7.readSize()
            org.bson.BsonBinaryReader$Context r0 = new org.bson.BsonBinaryReader$Context
            org.bson.BsonBinaryReader$Context r3 = r7.getContext()
            org.bson.BsonContextType r4 = org.bson.BsonContextType.ARRAY
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadStartDocument() {
            r7 = this;
            org.bson.AbstractBsonReader$State r0 = r7.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r0 != r1) goto Lb
            org.bson.BsonContextType r0 = org.bson.BsonContextType.SCOPE_DOCUMENT
            goto Ld
        Lb:
            org.bson.BsonContextType r0 = org.bson.BsonContextType.DOCUMENT
        Ld:
            r4 = r0
            org.bson.io.BsonInput r0 = r7.bsonInput
            int r5 = r0.getPosition()
            int r6 = r7.readSize()
            org.bson.BsonBinaryReader$Context r0 = new org.bson.BsonBinaryReader$Context
            org.bson.BsonBinaryReader$Context r3 = r7.getContext()
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadString() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final java.lang.String doReadSymbol() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonTimestamp doReadTimestamp() {
            r3 = this;
            org.bson.BsonTimestamp r0 = new org.bson.BsonTimestamp
            org.bson.io.BsonInput r1 = r3.bsonInput
            long r1 = r1.readInt64()
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final void doReadUndefined() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doSkipName() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonReader
    public final void doSkipValue() {
            r4 = this;
            boolean r0 = r4.isClosed()
            if (r0 != 0) goto L91
            org.bson.AbstractBsonReader$State r0 = r4.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.VALUE
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L85
            int[] r0 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r1 = r4.getCurrentBsonType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L74;
                case 2: goto L6e;
                case 3: goto L7a;
                case 4: goto L6b;
                case 5: goto L66;
                case 6: goto L6b;
                case 7: goto L64;
                case 8: goto L6b;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L55;
                case 13: goto L55;
                case 14: goto L55;
                case 15: goto L52;
                case 16: goto L47;
                case 17: goto L42;
                case 18: goto L3d;
                case 19: goto L6b;
                case 20: goto L55;
                case 21: goto L36;
                default: goto L1f;
            }
        L1f:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "Unexpected BSON type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.BsonType r2 = r4.getCurrentBsonType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L36:
            int r0 = r4.readSize()
            int r2 = r0 + 12
            goto L7a
        L3d:
            int r2 = r4.readSize()
            goto L7a
        L42:
            int r2 = r4.readSize()
            goto L7a
        L47:
            org.bson.io.BsonInput r0 = r4.bsonInput
            r0.skipCString()
            org.bson.io.BsonInput r0 = r4.bsonInput
            r0.skipCString()
            goto L55
        L52:
            r2 = 12
            goto L7a
        L55:
            r2 = 0
            goto L7a
        L57:
            int r0 = r4.readSize()
            goto L78
        L5c:
            int r2 = r4.readSize()
            goto L7a
        L61:
            r2 = 16
            goto L7a
        L64:
            r2 = 4
            goto L7a
        L66:
            int r0 = r4.readSize()
            goto L78
        L6b:
            r2 = 8
            goto L7a
        L6e:
            int r0 = r4.readSize()
            int r2 = r2 + r0
            goto L7a
        L74:
            int r0 = r4.readSize()
        L78:
            int r2 = r0 + (-4)
        L7a:
            org.bson.io.BsonInput r0 = r4.bsonInput
            r0.skip(r2)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r4.setState(r0)
            return
        L85:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r2]
            r0[r3] = r1
            java.lang.String r1 = "skipValue"
            r4.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        L91:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
    }

    public org.bson.io.BsonInput getBsonInput() {
            r1 = this;
            org.bson.io.BsonInput r0 = r1.bsonInput
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonReader.Context getContext() {
            r1 = this;
            org.bson.BsonBinaryReader$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonReader
    public final org.bson.BsonBinaryReader.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonReader$Context r0 = super.getContext()
            org.bson.BsonBinaryReader$Context r0 = (org.bson.BsonBinaryReader.Context) r0
            return r0
    }

    @Override // org.bson.BsonReader
    public org.bson.BsonReaderMark getMark() {
            r1 = this;
            org.bson.BsonBinaryReader$Mark r0 = new org.bson.BsonBinaryReader$Mark
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void mark() {
            r2 = this;
            org.bson.BsonBinaryReader$Mark r0 = r2.mark
            if (r0 != 0) goto Lc
            org.bson.BsonBinaryReader$Mark r0 = new org.bson.BsonBinaryReader$Mark
            r0.<init>(r2)
            r2.mark = r0
            return
        Lc:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "A mark already exists; it needs to be reset before creating a new one"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader
    public org.bson.BsonType readBsonType() {
            r7 = this;
            boolean r0 = r7.isClosed()
            if (r0 != 0) goto Lf1
            org.bson.AbstractBsonReader$State r0 = r7.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.INITIAL
            if (r0 == r1) goto Le2
            org.bson.AbstractBsonReader$State r0 = r7.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.DONE
            if (r0 == r1) goto Le2
            org.bson.AbstractBsonReader$State r0 = r7.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r0 != r1) goto L20
            goto Le2
        L20:
            org.bson.AbstractBsonReader$State r0 = r7.getState()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Ld7
            org.bson.io.BsonInput r0 = r7.bsonInput
            byte r0 = r0.readByte()
            org.bson.BsonType r1 = org.bson.BsonType.findByValue(r0)
            r4 = 2
            if (r1 == 0) goto Lbb
            r7.setCurrentBsonType(r1)
            org.bson.BsonType r0 = r7.getCurrentBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
            r5 = 3
            if (r0 != r1) goto L7e
            int[] r0 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.BsonBinaryReader$Context r6 = r7.getContext()
            org.bson.BsonContextType r6 = r6.getContextType()
            int r6 = r6.ordinal()
            r0 = r0[r6]
            if (r0 == r3) goto L78
            if (r0 == r4) goto L72
            if (r0 != r5) goto L5a
            goto L72
        L5a:
            org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            org.bson.BsonBinaryReader$Context r3 = r7.getContext()
            org.bson.BsonContextType r3 = r3.getContextType()
            r1[r2] = r3
            java.lang.String r2 = "BSONType EndOfDocument is not valid when ContextType is %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L72:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_DOCUMENT
            r7.setState(r0)
            return r1
        L78:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_ARRAY
            r7.setState(r0)
            return r1
        L7e:
            int[] r0 = org.bson.BsonBinaryReader.AnonymousClass1.$SwitchMap$org$bson$BsonContextType
            org.bson.BsonBinaryReader$Context r1 = r7.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto Lac
            if (r0 == r4) goto L9d
            if (r0 != r5) goto L95
            goto L9d
        L95:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "Unexpected ContextType."
            r0.<init>(r1)
            throw r0
        L9d:
            org.bson.io.BsonInput r0 = r7.bsonInput
            java.lang.String r0 = r0.readCString()
            r7.setCurrentName(r0)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.NAME
            r7.setState(r0)
            goto Lb6
        Lac:
            org.bson.io.BsonInput r0 = r7.bsonInput
            r0.skipCString()
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r7.setState(r0)
        Lb6:
            org.bson.BsonType r0 = r7.getCurrentBsonType()
            return r0
        Lbb:
            org.bson.io.BsonInput r1 = r7.bsonInput
            java.lang.String r1 = r1.readCString()
            org.bson.BsonSerializationException r5 = new org.bson.BsonSerializationException
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r4[r2] = r0
            r4[r3] = r1
            java.lang.String r0 = "Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r5.<init>(r0)
            throw r5
        Ld7:
            org.bson.AbstractBsonReader$State[] r0 = new org.bson.AbstractBsonReader.State[r3]
            r0[r2] = r1
            java.lang.String r1 = "ReadBSONType"
            r7.throwInvalidState(r1, r0)
            r0 = 0
            throw r0
        Le2:
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            r7.setCurrentBsonType(r0)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r7.setState(r0)
            org.bson.BsonType r0 = r7.getCurrentBsonType()
            return r0
        Lf1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonReader
    @java.lang.Deprecated
    public void reset() {
            r2 = this;
            org.bson.BsonBinaryReader$Mark r0 = r2.mark
            if (r0 == 0) goto Lb
            r0.reset()
            r0 = 0
            r2.mark = r0
            return
        Lb:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.String r1 = "trying to reset a mark before creating it"
            r0.<init>(r1)
            throw r0
    }
}
