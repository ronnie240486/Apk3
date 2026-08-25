package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes3.dex */
public class FlatBufferBuilder {
    public java.nio.ByteBuffer bb;
    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory bb_factory;
    public boolean finished;
    public boolean force_defaults;
    public int minalign;
    public boolean nested;
    public int num_vtables;
    public int object_start;
    public int space;
    public final androidx.emoji2.text.flatbuffer.Utf8 utf8;
    public int vector_num_elems;
    public int[] vtable;
    public int vtable_in_use;
    public int[] vtables;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ByteBufferBackedInputStream extends java.io.InputStream {
        public java.nio.ByteBuffer buf;

        public ByteBufferBackedInputStream(java.nio.ByteBuffer r1) {
                r0 = this;
                r0.<init>()
                r0.buf = r1
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buf     // Catch: java.nio.BufferUnderflowException -> L9
                byte r0 = r0.get()     // Catch: java.nio.BufferUnderflowException -> L9
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L9:
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ByteBufferFactory {
        public ByteBufferFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.nio.ByteBuffer newByteBuffer(int r1);

        public void releaseByteBuffer(java.nio.ByteBuffer r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class HeapByteBufferFactory extends androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory {
        public static final androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory INSTANCE = null;

        static {
                androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory
                r0.<init>()
                androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE = r0
                return
        }

        public HeapByteBufferFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public java.nio.ByteBuffer newByteBuffer(int r2) {
                r1 = this;
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                return r2
        }
    }

    public FlatBufferBuilder() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public FlatBufferBuilder(int r4) {
            r3 = this;
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE
            androidx.emoji2.text.flatbuffer.Utf8 r1 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r2 = 0
            r3.<init>(r4, r0, r2, r1)
            return
    }

    public FlatBufferBuilder(int r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4) {
            r2 = this;
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1 = 0
            r2.<init>(r3, r4, r1, r0)
            return
    }

    public FlatBufferBuilder(int r4, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r5, java.nio.ByteBuffer r6, androidx.emoji2.text.flatbuffer.Utf8 r7) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.minalign = r0
            r1 = 0
            r3.vtable = r1
            r1 = 0
            r3.vtable_in_use = r1
            r3.nested = r1
            r3.finished = r1
            r2 = 16
            int[] r2 = new int[r2]
            r3.vtables = r2
            r3.num_vtables = r1
            r3.vector_num_elems = r1
            r3.force_defaults = r1
            if (r4 > 0) goto L1f
            r4 = 1
        L1f:
            r3.bb_factory = r5
            if (r6 == 0) goto L30
            r3.bb = r6
            r6.clear()
            java.nio.ByteBuffer r4 = r3.bb
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r5)
            goto L36
        L30:
            java.nio.ByteBuffer r4 = r5.newByteBuffer(r4)
            r3.bb = r4
        L36:
            r3.utf8 = r7
            java.nio.ByteBuffer r4 = r3.bb
            int r4 = r4.capacity()
            r3.space = r4
            return
    }

    public FlatBufferBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public FlatBufferBuilder(java.nio.ByteBuffer r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4) {
            r2 = this;
            int r0 = r3.capacity()
            androidx.emoji2.text.flatbuffer.Utf8 r1 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r2.<init>(r0, r4, r3, r1)
            return
    }

    @java.lang.Deprecated
    private int dataStart() {
            r1 = this;
            r1.finished()
            int r0 = r1.space
            return r0
    }

    public static boolean isFieldPresent(androidx.emoji2.text.flatbuffer.Table r0, int r1) {
            int r0 = r0.__offset(r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void Nested(int r2) {
            r1 = this;
            int r0 = r1.offset()
            if (r2 != r0) goto L7
            return
        L7:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: struct must be serialized inline."
            r2.<init>(r0)
            throw r2
    }

    public void addBoolean(int r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addBoolean(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addBoolean(boolean r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.prep(r0, r1)
            r2.putBoolean(r3)
            return
    }

    public void addByte(byte r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.prep(r0, r1)
            r2.putByte(r3)
            return
    }

    public void addByte(int r2, byte r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addByte(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addDouble(double r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.prep(r0, r1)
            r2.putDouble(r3)
            return
    }

    public void addDouble(int r2, double r3, double r5) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Le
        L8:
            r1.addDouble(r3)
            r1.slot(r2)
        Le:
            return
    }

    public void addFloat(float r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.prep(r0, r1)
            r2.putFloat(r3)
            return
    }

    public void addFloat(int r4, float r5, double r6) {
            r3 = this;
            boolean r0 = r3.force_defaults
            if (r0 != 0) goto L9
            double r0 = (double) r5
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto Lf
        L9:
            r3.addFloat(r5)
            r3.slot(r4)
        Lf:
            return
    }

    public void addInt(int r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.prep(r0, r1)
            r2.putInt(r3)
            return
    }

    public void addInt(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addInt(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addLong(int r2, long r3, long r5) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Le
        L8:
            r1.addLong(r3)
            r1.slot(r2)
        Le:
            return
    }

    public void addLong(long r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.prep(r0, r1)
            r2.putLong(r3)
            return
    }

    public void addOffset(int r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.prep(r0, r1)
            int r1 = r2.offset()
            int r1 = r1 - r3
            int r1 = r1 + r0
            r2.putInt(r1)
            return
    }

    public void addOffset(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addOffset(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addShort(int r2, short r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addShort(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addShort(short r3) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.prep(r0, r1)
            r2.putShort(r3)
            return
    }

    public void addStruct(int r1, int r2, int r3) {
            r0 = this;
            if (r2 == r3) goto L8
            r0.Nested(r2)
            r0.slot(r1)
        L8:
            return
    }

    public void clear() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.bb
            int r0 = r0.capacity()
            r3.space = r0
            java.nio.ByteBuffer r0 = r3.bb
            r0.clear()
            r0 = 1
            r3.minalign = r0
        L10:
            int r0 = r3.vtable_in_use
            r1 = 0
            if (r0 <= 0) goto L1e
            int[] r2 = r3.vtable
            int r0 = r0 + (-1)
            r3.vtable_in_use = r0
            r2[r0] = r1
            goto L10
        L1e:
            r3.vtable_in_use = r1
            r3.nested = r1
            r3.finished = r1
            r3.object_start = r1
            r3.num_vtables = r1
            r3.vector_num_elems = r1
            return
    }

    public int createByteVector(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.bb
            r0.put(r4)
            int r4 = r3.endVector()
            return r4
    }

    public int createByteVector(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.bb
            r0.put(r4)
            int r4 = r3.endVector()
            return r4
    }

    public int createByteVector(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            r2.startVector(r0, r5, r0)
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 - r5
            r2.space = r1
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.bb
            r0.put(r3, r4, r5)
            int r3 = r2.endVector()
            return r3
    }

    public <T extends androidx.emoji2.text.flatbuffer.Table> int createSortedVectorOfTables(T r6, int[] r7) {
            r5 = this;
            java.nio.ByteBuffer r0 = r5.bb
            java.util.Objects.requireNonNull(r6)
            int r1 = r7.length
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r2 = 0
            r3 = 0
        La:
            int r4 = r7.length
            if (r3 >= r4) goto L18
            r4 = r7[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto La
        L18:
            androidx.emoji2.text.flatbuffer.Table$1 r3 = new androidx.emoji2.text.flatbuffer.Table$1
            r3.<init>(r6, r0)
            java.util.Arrays.sort(r1, r3)
        L20:
            int r6 = r7.length
            if (r2 >= r6) goto L2e
            r6 = r1[r2]
            int r6 = r6.intValue()
            r7[r2] = r6
            int r2 = r2 + 1
            goto L20
        L2e:
            int r6 = r5.createVectorOfTables(r7)
            return r6
    }

    public int createString(java.lang.CharSequence r4) {
            r3 = this;
            androidx.emoji2.text.flatbuffer.Utf8 r0 = r3.utf8
            int r0 = r0.encodedLength(r4)
            r1 = 0
            r3.addByte(r1)
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            androidx.emoji2.text.flatbuffer.Utf8 r0 = r3.utf8
            java.nio.ByteBuffer r1 = r3.bb
            r0.encodeUtf8(r4, r1)
            int r4 = r3.endVector()
            return r4
    }

    public int createString(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 0
            r3.addByte(r1)
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.bb
            r0.put(r4)
            int r4 = r3.endVector()
            return r4
    }

    public java.nio.ByteBuffer createUnintializedVector(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r2 * r3
            r1.startVector(r2, r3, r4)
            java.nio.ByteBuffer r2 = r1.bb
            int r3 = r1.space
            int r3 = r3 - r0
            r1.space = r3
            r2.position(r3)
            java.nio.ByteBuffer r2 = r1.bb
            java.nio.ByteBuffer r2 = r2.slice()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            r2.limit(r0)
            return r2
    }

    public int createVectorOfTables(int[] r3) {
            r2 = this;
            r2.notNested()
            int r0 = r3.length
            r1 = 4
            r2.startVector(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L15
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto Lb
        L15:
            int r3 = r2.endVector()
            return r3
    }

    public java.nio.ByteBuffer dataBuffer() {
            r1 = this;
            r1.finished()
            java.nio.ByteBuffer r0 = r1.bb
            return r0
    }

    public int endTable() {
            r11 = this;
            int[] r0 = r11.vtable
            if (r0 == 0) goto Lc9
            boolean r0 = r11.nested
            if (r0 == 0) goto Lc9
            r0 = 0
            r11.addInt(r0)
            int r1 = r11.offset()
            int r2 = r11.vtable_in_use
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L1f
            int[] r3 = r11.vtable
            r3 = r3[r2]
            if (r3 != 0) goto L1f
            int r2 = r2 + (-1)
            goto L14
        L1f:
            int r3 = r2 + 1
        L21:
            if (r2 < 0) goto L36
            int[] r4 = r11.vtable
            r5 = r4[r2]
            if (r5 == 0) goto L2e
            r4 = r4[r2]
            int r4 = r1 - r4
            goto L2f
        L2e:
            r4 = 0
        L2f:
            short r4 = (short) r4
            r11.addShort(r4)
            int r2 = r2 + (-1)
            goto L21
        L36:
            int r2 = r11.object_start
            int r2 = r1 - r2
            short r2 = (short) r2
            r11.addShort(r2)
            r2 = 2
            int r3 = r3 + r2
            int r3 = r3 * 2
            short r3 = (short) r3
            r11.addShort(r3)
            r3 = 0
        L47:
            int r4 = r11.num_vtables
            if (r3 >= r4) goto L87
            java.nio.ByteBuffer r4 = r11.bb
            int r4 = r4.capacity()
            int[] r5 = r11.vtables
            r5 = r5[r3]
            int r4 = r4 - r5
            int r5 = r11.space
            java.nio.ByteBuffer r6 = r11.bb
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.bb
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L84
            r7 = 2
        L67:
            if (r7 >= r6) goto L7f
            java.nio.ByteBuffer r8 = r11.bb
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.bb
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L7c
            goto L84
        L7c:
            int r7 = r7 + 2
            goto L67
        L7f:
            int[] r4 = r11.vtables
            r3 = r4[r3]
            goto L88
        L84:
            int r3 = r3 + 1
            goto L47
        L87:
            r3 = 0
        L88:
            if (r3 == 0) goto L9a
            java.nio.ByteBuffer r2 = r11.bb
            int r2 = r2.capacity()
            int r2 = r2 - r1
            r11.space = r2
            java.nio.ByteBuffer r4 = r11.bb
            int r3 = r3 - r1
            r4.putInt(r2, r3)
            goto Lc6
        L9a:
            int r3 = r11.num_vtables
            int[] r4 = r11.vtables
            int r5 = r4.length
            if (r3 != r5) goto La9
            int r3 = r3 * 2
            int[] r2 = java.util.Arrays.copyOf(r4, r3)
            r11.vtables = r2
        La9:
            int[] r2 = r11.vtables
            int r3 = r11.num_vtables
            int r4 = r3 + 1
            r11.num_vtables = r4
            int r4 = r11.offset()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.bb
            int r3 = r2.capacity()
            int r3 = r3 - r1
            int r4 = r11.offset()
            int r4 = r4 - r1
            r2.putInt(r3, r4)
        Lc6:
            r11.nested = r0
            return r1
        Lc9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endTable called without startTable"
            r0.<init>(r1)
            throw r0
    }

    public int endVector() {
            r2 = this;
            boolean r0 = r2.nested
            if (r0 == 0) goto L11
            r0 = 0
            r2.nested = r0
            int r0 = r2.vector_num_elems
            r2.putInt(r0)
            int r0 = r2.offset()
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endVector called without startVector"
            r0.<init>(r1)
            throw r0
    }

    public void finish(int r2) {
            r1 = this;
            r0 = 0
            r1.finish(r2, r0)
            return
    }

    public void finish(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.finish(r2, r3, r0)
            return
    }

    public final void finish(int r4, java.lang.String r5, boolean r6) {
            r3 = this;
            int r0 = r3.minalign
            r1 = 4
            if (r6 == 0) goto L7
            r2 = 4
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + 8
            r3.prep(r0, r2)
            int r0 = r5.length()
            if (r0 != r1) goto L25
            r0 = 3
        L14:
            if (r0 < 0) goto L21
            char r1 = r5.charAt(r0)
            byte r1 = (byte) r1
            r3.addByte(r1)
            int r0 = r0 + (-1)
            goto L14
        L21:
            r3.finish(r4, r6)
            return
        L25:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "FlatBuffers: file identifier must be length 4"
            r4.<init>(r5)
            throw r4
    }

    public final void finish(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.minalign
            r1 = 4
            if (r5 == 0) goto L7
            r2 = 4
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + r1
            r3.prep(r0, r2)
            r3.addOffset(r4)
            if (r5 == 0) goto L1d
            java.nio.ByteBuffer r4 = r3.bb
            int r4 = r4.capacity()
            int r5 = r3.space
            int r4 = r4 - r5
            r3.addInt(r4)
        L1d:
            java.nio.ByteBuffer r4 = r3.bb
            int r5 = r3.space
            r4.position(r5)
            r4 = 1
            r3.finished = r4
            return
    }

    public void finishSizePrefixed(int r2) {
            r1 = this;
            r0 = 1
            r1.finish(r2, r0)
            return
    }

    public void finishSizePrefixed(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.finish(r2, r3, r0)
            return
    }

    public void finished() {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r0.<init>(r1)
            throw r0
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder forceDefaults(boolean r1) {
            r0 = this;
            r0.force_defaults = r1
            return r0
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder init(java.nio.ByteBuffer r1, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r2) {
            r0 = this;
            r0.bb_factory = r2
            r0.bb = r1
            r1.clear()
            java.nio.ByteBuffer r1 = r0.bb
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            r1 = 1
            r0.minalign = r1
            java.nio.ByteBuffer r1 = r0.bb
            int r1 = r1.capacity()
            r0.space = r1
            r1 = 0
            r0.vtable_in_use = r1
            r0.nested = r1
            r0.finished = r1
            r0.object_start = r1
            r0.num_vtables = r1
            r0.vector_num_elems = r1
            return r0
    }

    public void notNested() {
            r2 = this;
            boolean r0 = r2.nested
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: object serialization must not be nested."
            r0.<init>(r1)
            throw r0
    }

    public int offset() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.capacity()
            int r1 = r2.space
            int r0 = r0 - r1
            return r0
    }

    public void pad(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto L12
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.space
            int r3 = r3 + (-1)
            r4.space = r3
            r2.put(r3, r0)
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    public void prep(int r9, int r10) {
            r8 = this;
            int r0 = r8.minalign
            if (r9 <= r0) goto L6
            r8.minalign = r9
        L6:
            java.nio.ByteBuffer r0 = r8.bb
            int r0 = r0.capacity()
            int r1 = r8.space
            int r0 = r0 - r1
            int r0 = r0 + r10
            int r0 = ~r0
            r1 = 1
            int r0 = r0 + r1
            int r2 = r9 + (-1)
            r0 = r0 & r2
        L16:
            int r2 = r8.space
            int r3 = r0 + r9
            int r3 = r3 + r10
            if (r2 >= r3) goto L6b
            java.nio.ByteBuffer r2 = r8.bb
            int r2 = r2.capacity()
            java.nio.ByteBuffer r3 = r8.bb
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory r4 = r8.bb_factory
            int r5 = r3.capacity()
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = r6 & r5
            if (r6 != 0) goto L63
            if (r5 != 0) goto L34
            r6 = 1
            goto L36
        L34:
            int r6 = r5 << 1
        L36:
            r7 = 0
            r3.position(r7)
            java.nio.ByteBuffer r4 = r4.newByteBuffer(r6)
            java.nio.Buffer r6 = r4.clear()
            int r6 = r6.capacity()
            int r6 = r6 - r5
            r4.position(r6)
            r4.put(r3)
            r8.bb = r4
            if (r3 == r4) goto L56
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory r4 = r8.bb_factory
            r4.releaseByteBuffer(r3)
        L56:
            int r3 = r8.space
            java.nio.ByteBuffer r4 = r8.bb
            int r4 = r4.capacity()
            int r4 = r4 - r2
            int r4 = r4 + r3
            r8.space = r4
            goto L16
        L63:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r9.<init>(r10)
            throw r9
        L6b:
            r8.pad(r0)
            return
    }

    public void putBoolean(boolean r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-1)
            r2.space = r1
            byte r3 = (byte) r3
            r0.put(r1, r3)
            return
    }

    public void putByte(byte r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-1)
            r2.space = r1
            r0.put(r1, r3)
            return
    }

    public void putDouble(double r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-8)
            r2.space = r1
            r0.putDouble(r1, r3)
            return
    }

    public void putFloat(float r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-4)
            r2.space = r1
            r0.putFloat(r1, r3)
            return
    }

    public void putInt(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-4)
            r2.space = r1
            r0.putInt(r1, r3)
            return
    }

    public void putLong(long r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-8)
            r2.space = r1
            r0.putLong(r1, r3)
            return
    }

    public void putShort(short r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-2)
            r2.space = r1
            r0.putShort(r1, r3)
            return
    }

    public void required(int r3, int r4) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.capacity()
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r2.bb
            int r3 = r3.getInt(r0)
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r2.bb
            int r0 = r0 + r4
            short r3 = r3.getShort(r0)
            if (r3 == 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            if (r3 == 0) goto L1d
            return
        L1d:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: field "
            java.lang.String r1 = " must be set"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r3.<init>(r4)
            throw r3
    }

    public byte[] sizedByteArray() {
            r3 = this;
            int r0 = r3.space
            java.nio.ByteBuffer r1 = r3.bb
            int r1 = r1.capacity()
            int r2 = r3.space
            int r1 = r1 - r2
            byte[] r0 = r3.sizedByteArray(r0, r1)
            return r0
    }

    public byte[] sizedByteArray(int r2, int r3) {
            r1 = this;
            r1.finished()
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r0 = r1.bb
            r0.position(r2)
            java.nio.ByteBuffer r2 = r1.bb
            r2.get(r3)
            return r3
    }

    public java.io.InputStream sizedInputStream() {
            r2 = this;
            r2.finished()
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteBuffer r0 = r0.duplicate()
            int r1 = r2.space
            r0.position(r1)
            java.nio.ByteBuffer r1 = r2.bb
            int r1 = r1.capacity()
            r0.limit(r1)
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferBackedInputStream r1 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferBackedInputStream
            r1.<init>(r0)
            return r1
    }

    public void slot(int r3) {
            r2 = this;
            int[] r0 = r2.vtable
            int r1 = r2.offset()
            r0[r3] = r1
            return
    }

    public void startTable(int r3) {
            r2 = this;
            r2.notNested()
            int[] r0 = r2.vtable
            if (r0 == 0) goto La
            int r0 = r0.length
            if (r0 >= r3) goto Le
        La:
            int[] r0 = new int[r3]
            r2.vtable = r0
        Le:
            r2.vtable_in_use = r3
            int[] r0 = r2.vtable
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.nested = r3
            int r3 = r2.offset()
            r2.object_start = r3
            return
    }

    public void startVector(int r1, int r2, int r3) {
            r0 = this;
            r0.notNested()
            r0.vector_num_elems = r2
            int r1 = r1 * r2
            r2 = 4
            r0.prep(r2, r1)
            r0.prep(r3, r1)
            r1 = 1
            r0.nested = r1
            return
    }
}
