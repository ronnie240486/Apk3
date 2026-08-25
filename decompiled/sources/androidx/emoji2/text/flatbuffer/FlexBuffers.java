package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {
    private static final androidx.emoji2.text.flatbuffer.ReadBuf EMPTY_BB = null;
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        public static final androidx.emoji2.text.flatbuffer.FlexBuffers.Blob EMPTY = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Blob
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.EMPTY = r0
                return
        }

        public Blob(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Blob empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.EMPTY
                return r0
        }

        public java.nio.ByteBuffer data() {
                r3 = this;
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                byte[] r0 = r0.data()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                int r1 = r3.end
                r0.position(r1)
                int r1 = r3.end
                int r2 = r3.size()
                int r2 = r2 + r1
                r0.limit(r2)
                java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
                java.nio.ByteBuffer r0 = r0.slice()
                return r0
        }

        public byte get(int r3) {
                r2 = this;
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r2.bb
                int r1 = r2.end
                int r1 = r1 + r3
                byte r3 = r0.get(r1)
                return r3
        }

        public byte[] getBytes() {
                r5 = this;
                int r0 = r5.size()
                byte[] r1 = new byte[r0]
                r2 = 0
            L7:
                if (r2 >= r0) goto L17
                androidx.emoji2.text.flatbuffer.ReadBuf r3 = r5.bb
                int r4 = r5.end
                int r4 = r4 + r2
                byte r3 = r3.get(r4)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L7
            L17:
                return r1
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.size()
                java.lang.String r0 = r0.getString(r1, r2)
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r5) {
                r4 = this;
                r0 = 34
                r5.append(r0)
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.size()
                java.lang.String r1 = r1.getString(r2, r3)
                r5.append(r1)
                r5.append(r0)
                return r5
        }
    }

    public static class FlexBufferException extends java.lang.RuntimeException {
        public FlexBufferException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class Key extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Key EMPTY = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY = r0
                return
        }

        public Key(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ androidx.emoji2.text.flatbuffer.FlexBuffers.Key access$700() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY
                return r0
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Key empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.emoji2.text.flatbuffer.FlexBuffers.Key
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r4 = (androidx.emoji2.text.flatbuffer.FlexBuffers.Key) r4
                int r0 = r4.end
                int r2 = r3.end
                if (r0 != r2) goto L15
                int r4 = r4.byteWidth
                int r0 = r3.byteWidth
                if (r4 != r0) goto L15
                r1 = 1
            L15:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.byteWidth
                r0 = r0 ^ r1
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.end
            L2:
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r3.bb
                byte r1 = r1.get(r0)
                if (r1 != 0) goto L14
                int r1 = r3.end
                int r0 = r0 - r1
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r3.bb
                java.lang.String r0 = r2.getString(r1, r0)
                return r0
            L14:
                int r0 = r0 + 1
                goto L2
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = r1.toString()
                r2.append(r0)
                return r2
        }
    }

    public static class KeyVector {
        private final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector vec;

        public KeyVector(androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector r1) {
                r0 = this;
                r0.<init>()
                r0.vec = r1
                return
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key get(int r4) {
                r3 = this;
                int r0 = r3.size()
                if (r4 < r0) goto Lb
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.access$700()
                return r4
            Lb:
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = r3.vec
                int r1 = r0.end
                int r0 = r0.byteWidth
                int r4 = r4 * r0
                int r4 = r4 + r1
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r1 = r3.vec
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r1.bb
                int r1 = r1.byteWidth
                int r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r4, r1)
                r1 = 1
                r0.<init>(r2, r4, r1)
                return r0
        }

        public int size() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = r1.vec
                int r0 = r0.size()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 91
                r0.append(r1)
                r1 = 0
            Lb:
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                if (r1 >= r2) goto L2e
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = r2.get(r1)
                r2.toString(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r1 == r2) goto L2b
                java.lang.String r2 = ", "
                r0.append(r2)
            L2b:
                int r1 = r1 + 1
                goto Lb
            L2e:
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Map extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Map EMPTY_MAP = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Map
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Map.EMPTY_MAP = r0
                return
        }

        public Map(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private int binarySearch(androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector r11, byte[] r12) {
                r10 = this;
                int r0 = r11.size()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = 0
            L8:
                if (r2 > r0) goto L38
                int r3 = r2 + r0
                int r3 = r3 >>> 1
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r4 = r11.get(r3)
                int r5 = r4.end
                r6 = 0
            L15:
                androidx.emoji2.text.flatbuffer.ReadBuf r7 = r4.bb
                byte r7 = r7.get(r5)
                r8 = r12[r6]
                if (r7 != 0) goto L21
            L1f:
                int r7 = r7 - r8
                goto L2c
            L21:
                int r5 = r5 + 1
                int r6 = r6 + 1
                int r9 = r12.length
                if (r6 != r9) goto L29
                goto L1f
            L29:
                if (r7 == r8) goto L15
                goto L1f
            L2c:
                if (r7 >= 0) goto L31
                int r2 = r3 + 1
                goto L8
            L31:
                if (r7 <= 0) goto L37
                int r3 = r3 + (-1)
                r0 = r3
                goto L8
            L37:
                return r3
            L38:
                int r2 = r2 + 1
                int r11 = -r2
                return r11
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Map empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Map.EMPTY_MAP
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(java.lang.String r2) {
                r1 = this;
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = r1.get(r2)
                return r2
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(byte[] r3) {
                r2 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r0 = r2.keys()
                int r1 = r0.size()
                int r3 = r2.binarySearch(r0, r3)
                if (r3 < 0) goto L15
                if (r3 >= r1) goto L15
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = r2.get(r3)
                return r3
            L15:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r3
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys() {
                r7 = this;
                int r0 = r7.end
                int r1 = r7.byteWidth
                int r1 = r1 * 3
                int r0 = r0 - r1
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r1 = new androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r3 = r7.bb
                int r4 = r7.byteWidth
                int r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r3, r0, r4)
                androidx.emoji2.text.flatbuffer.ReadBuf r5 = r7.bb
                int r6 = r7.byteWidth
                int r0 = r0 + r6
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r5, r0, r6)
                r5 = 4
                r2.<init>(r3, r4, r0, r5)
                r1.<init>(r2)
                return r1
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r6) {
                r5 = this;
                java.lang.String r0 = "{ "
                r6.append(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r0 = r5.keys()
                int r1 = r5.size()
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r2 = r5.values()
                r3 = 0
            L13:
                if (r3 >= r1) goto L41
                r4 = 34
                r6.append(r4)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r4 = r0.get(r3)
                java.lang.String r4 = r4.toString()
                r6.append(r4)
                java.lang.String r4 = "\" : "
                r6.append(r4)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r4 = r2.get(r3)
                java.lang.String r4 = r4.toString()
                r6.append(r4)
                int r4 = r1 + (-1)
                if (r3 == r4) goto L3e
                java.lang.String r4 = ", "
                r6.append(r4)
            L3e:
                int r3 = r3 + 1
                goto L13
            L41:
                java.lang.String r0 = " }"
                r6.append(r0)
                return r6
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector values() {
                r4 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    public static abstract class Object {
        public androidx.emoji2.text.flatbuffer.ReadBuf bb;
        public int byteWidth;
        public int end;

        public Object(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.bb = r1
                r0.end = r2
                r0.byteWidth = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder r1);
    }

    public static class Reference {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Reference NULL_REFERENCE = null;
        private androidx.emoji2.text.flatbuffer.ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE = r0
                return
        }

        public Reference(androidx.emoji2.text.flatbuffer.ReadBuf r3, int r4, int r5, int r6) {
                r2 = this;
                r0 = r6 & 3
                r1 = 1
                int r0 = r1 << r0
                int r6 = r6 >> 2
                r2.<init>()
                r2.bb = r3
                r2.end = r4
                r2.parentWidth = r5
                r2.byteWidth = r0
                r2.type = r6
                return
        }

        public Reference(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.bb = r1
                r0.end = r2
                r0.parentWidth = r3
                r1 = 1
                r0.byteWidth = r1
                r0.type = r5
                return
        }

        public static /* synthetic */ androidx.emoji2.text.flatbuffer.FlexBuffers.Reference access$600() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Blob asBlob() {
                r4 = this;
                boolean r0 = r4.isBlob()
                if (r0 != 0) goto L12
                boolean r0 = r4.isString()
                if (r0 == 0) goto Ld
                goto L12
            Ld:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.empty()
                return r0
            L12:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Blob
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }

        public boolean asBoolean() {
                r7 = this;
                boolean r0 = r7.isBoolean()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L15
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r7.bb
                int r3 = r7.end
                byte r0 = r0.get(r3)
                if (r0 == 0) goto L13
                goto L14
            L13:
                r1 = 0
            L14:
                return r1
            L15:
                long r3 = r7.asUInt()
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L20
                goto L21
            L20:
                r1 = 0
            L21:
                return r1
        }

        public double asFloat() {
                r3 = this;
                int r0 = r3.type
                r1 = 3
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L10:
                r1 = 1
                if (r0 == r1) goto L82
                r1 = 2
                if (r0 == r1) goto L76
                r1 = 5
                if (r0 == r1) goto L6d
                r1 = 6
                if (r0 == r1) goto L5b
                r1 = 7
                if (r0 == r1) goto L49
                r1 = 8
                if (r0 == r1) goto L38
                r1 = 10
                if (r0 == r1) goto L2e
                r1 = 26
                if (r0 == r1) goto L76
                r0 = 0
                return r0
            L2e:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r3.asVector()
                int r0 = r0.size()
                double r0 = (double) r0
                return r0
            L38:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L49:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L5b:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L6d:
                java.lang.String r0 = r3.asString()
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
            L76:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L82:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
        }

        public int asInt() {
                r3 = this;
                int r0 = r3.type
                r1 = 1
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L10:
                r1 = 2
                if (r0 == r1) goto L8b
                r1 = 3
                if (r0 == r1) goto L7f
                r1 = 5
                if (r0 == r1) goto L76
                r1 = 6
                if (r0 == r1) goto L65
                r1 = 7
                if (r0 == r1) goto L53
                r1 = 8
                if (r0 == r1) goto L41
                r1 = 10
                if (r0 == r1) goto L38
                r1 = 26
                if (r0 == r1) goto L2d
                r0 = 0
                return r0
            L2d:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L38:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r3.asVector()
                int r0 = r0.size()
                return r0
            L41:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L53:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
            L63:
                int r1 = (int) r0
                return r1
            L65:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L76:
                java.lang.String r0 = r3.asString()
                int r0 = java.lang.Integer.parseInt(r0)
                return r0
            L7f:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L8b:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                goto L63
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key asKey() {
                r4 = this;
                boolean r0 = r4.isKey()
                if (r0 == 0) goto L18
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L18:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.empty()
                return r0
        }

        public long asLong() {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L10:
                r1 = 2
                if (r0 == r1) goto L8e
                r1 = 3
                if (r0 == r1) goto L82
                r1 = 5
                r2 = 0
                if (r0 == r1) goto L78
                r1 = 6
                if (r0 == r1) goto L67
                r1 = 7
                if (r0 == r1) goto L56
                r1 = 8
                if (r0 == r1) goto L44
                r1 = 10
                if (r0 == r1) goto L3a
                r1 = 26
                if (r0 == r1) goto L2e
                return r2
            L2e:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L3a:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L44:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r4.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L56:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L67:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r4.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L78:
                java.lang.String r0 = r4.asString()     // Catch: java.lang.NumberFormatException -> L81
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L81
                return r0
            L81:
                return r2
            L82:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L8e:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Map asMap() {
                r4 = this;
                boolean r0 = r4.isMap()
                if (r0 == 0) goto L18
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Map
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L18:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Map.empty()
                return r0
        }

        public java.lang.String asString() {
                r4 = this;
                boolean r0 = r4.isString()
                if (r0 == 0) goto L22
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.byteWidth
                int r3 = r0 - r2
                long r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r1, r3, r2)
                int r2 = (int) r1
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                java.lang.String r0 = r1.getString(r0, r2)
                return r0
            L22:
                boolean r0 = r4.isKey()
                if (r0 == 0) goto L46
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                r1 = r0
            L33:
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r4.bb
                byte r2 = r2.get(r1)
                if (r2 != 0) goto L43
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r4.bb
                int r1 = r1 - r0
                java.lang.String r0 = r2.getString(r0, r1)
                return r0
            L43:
                int r1 = r1 + 1
                goto L33
            L46:
                java.lang.String r0 = ""
                return r0
        }

        public long asUInt() {
                r3 = this;
                int r0 = r3.type
                r1 = 2
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L10:
                r1 = 1
                if (r0 == r1) goto L8d
                r1 = 3
                if (r0 == r1) goto L81
                r1 = 10
                if (r0 == r1) goto L77
                r1 = 26
                if (r0 == r1) goto L6b
                r1 = 5
                if (r0 == r1) goto L62
                r1 = 6
                if (r0 == r1) goto L51
                r1 = 7
                if (r0 == r1) goto L40
                r1 = 8
                if (r0 == r1) goto L2e
                r0 = 0
                return r0
            L2e:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L40:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L51:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                int r2 = r3.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L62:
                java.lang.String r0 = r3.asString()
                long r0 = java.lang.Long.parseLong(r0)
                return r0
            L6b:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L77:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r3.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L81:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L8d:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector asVector() {
                r6 = this;
                boolean r0 = r6.isVector()
                if (r0 == 0) goto L18
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r6.bb
                int r2 = r6.end
                int r3 = r6.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r3 = r6.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L18:
                int r0 = r6.type
                r1 = 15
                if (r0 != r1) goto L31
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r6.bb
                int r2 = r6.end
                int r3 = r6.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r3 = r6.byteWidth
                r4 = 4
                r0.<init>(r1, r2, r3, r4)
                return r0
            L31:
                r2 = 11
                r3 = 1
                if (r0 < r2) goto L38
                if (r0 <= r1) goto L3c
            L38:
                r1 = 36
                if (r0 != r1) goto L3e
            L3c:
                r0 = 1
                goto L3f
            L3e:
                r0 = 0
            L3f:
                if (r0 == 0) goto L58
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r6.bb
                int r2 = r6.end
                int r4 = r6.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r4)
                int r4 = r6.byteWidth
                int r5 = r6.type
                int r5 = r5 + (-11)
                int r5 = r5 + r3
                r0.<init>(r1, r2, r4, r5)
                return r0
            L58:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.empty()
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public boolean isBlob() {
                r2 = this;
                int r0 = r2.type
                r1 = 25
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isBoolean() {
                r2 = this;
                int r0 = r2.type
                r1 = 26
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isFloat() {
                r2 = this;
                int r0 = r2.type
                r1 = 3
                if (r0 == r1) goto Lc
                r1 = 8
                if (r0 != r1) goto La
                goto Lc
            La:
                r0 = 0
                goto Ld
            Lc:
                r0 = 1
            Ld:
                return r0
        }

        public boolean isInt() {
                r3 = this;
                int r0 = r3.type
                r1 = 1
                if (r0 == r1) goto La
                r2 = 6
                if (r0 != r2) goto L9
                goto La
            L9:
                r1 = 0
            La:
                return r1
        }

        public boolean isIntOrUInt() {
                r1 = this;
                boolean r0 = r1.isInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isUInt()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isKey() {
                r2 = this;
                int r0 = r2.type
                r1 = 4
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isMap() {
                r2 = this;
                int r0 = r2.type
                r1 = 9
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isNull() {
                r1 = this;
                int r0 = r1.type
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isNumeric() {
                r1 = this;
                boolean r0 = r1.isIntOrUInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isFloat()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isString() {
                r2 = this;
                int r0 = r2.type
                r1 = 5
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isTypedVector() {
                r2 = this;
                int r0 = r2.type
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.FBT_NULL
                r1 = 11
                if (r0 < r1) goto Lc
                r1 = 15
                if (r0 <= r1) goto L10
            Lc:
                r1 = 36
                if (r0 != r1) goto L12
            L10:
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        public boolean isUInt() {
                r2 = this;
                int r0 = r2.type
                r1 = 2
                if (r0 == r1) goto Lb
                r1 = 7
                if (r0 != r1) goto L9
                goto Lb
            L9:
                r0 = 0
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        public boolean isVector() {
                r2 = this;
                int r0 = r2.type
                r1 = 10
                if (r0 == r1) goto Ld
                r1 = 9
                if (r0 != r1) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final java.lang.StringBuilder toString(java.lang.StringBuilder r3) {
                r2 = this;
                int r0 = r2.type
                r1 = 36
                if (r0 == r1) goto L7f
                r1 = 34
                switch(r0) {
                    case 0: goto L79;
                    case 1: goto L71;
                    case 2: goto L69;
                    case 3: goto L61;
                    case 4: goto L52;
                    case 5: goto L44;
                    case 6: goto L71;
                    case 7: goto L69;
                    case 8: goto L61;
                    case 9: goto L3b;
                    case 10: goto L32;
                    case 11: goto L7f;
                    case 12: goto L7f;
                    case 13: goto L7f;
                    case 14: goto L7f;
                    case 15: goto L7f;
                    case 16: goto L1d;
                    case 17: goto L1d;
                    case 18: goto L1d;
                    case 19: goto L1d;
                    case 20: goto L1d;
                    case 21: goto L1d;
                    case 22: goto L1d;
                    case 23: goto L1d;
                    case 24: goto L1d;
                    case 25: goto L14;
                    case 26: goto Lc;
                    default: goto Lb;
                }
            Lb:
                return r3
            Lc:
                boolean r0 = r2.asBoolean()
                r3.append(r0)
                return r3
            L14:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = r2.asBlob()
                java.lang.StringBuilder r3 = r0.toString(r3)
                return r3
            L1d:
                androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException
                java.lang.String r0 = "not_implemented:"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r2.type
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L32:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r2.asVector()
                java.lang.StringBuilder r3 = r0.toString(r3)
                return r3
            L3b:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = r2.asMap()
                java.lang.StringBuilder r3 = r0.toString(r3)
                return r3
            L44:
                r3.append(r1)
                java.lang.String r0 = r2.asString()
                r3.append(r0)
                r3.append(r1)
                return r3
            L52:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = r2.asKey()
                r3.append(r1)
                java.lang.StringBuilder r3 = r0.toString(r3)
                r3.append(r1)
                return r3
            L61:
                double r0 = r2.asFloat()
                r3.append(r0)
                return r3
            L69:
                long r0 = r2.asUInt()
                r3.append(r0)
                return r3
            L71:
                long r0 = r2.asLong()
                r3.append(r0)
                return r3
            L79:
                java.lang.String r0 = "null"
                r3.append(r0)
                return r3
            L7f:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r2.asVector()
                r3.append(r0)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Sized extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        public final int size;

        public Sized(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                int r2 = r2 - r3
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r1, r2, r3)
                r0.size = r1
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class TypedVector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector EMPTY_VECTOR = null;
        private final int elemType;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR = r0
                return
        }

        public TypedVector(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.elemType = r4
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int r8) {
                r7 = this;
                int r0 = r7.size()
                if (r8 < r0) goto Lb
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r8 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r8
            Lb:
                int r0 = r7.end
                int r1 = r7.byteWidth
                int r8 = r8 * r1
                int r3 = r8 + r0
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r8 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r7.bb
                int r4 = r7.byteWidth
                r5 = 1
                int r6 = r7.elemType
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
        }

        public int getElemType() {
                r1 = this;
                int r0 = r1.elemType
                return r0
        }

        public boolean isEmptyVector() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Unsigned {
        public Unsigned() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class Vector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Vector EMPTY_VECTOR = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR = r0
                return
        }

        public Vector(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Vector empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int r10) {
                r9 = this;
                int r0 = r9.size()
                long r0 = (long) r0
                long r2 = (long) r10
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 < 0) goto Lf
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r10 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r10
            Lf:
                androidx.emoji2.text.flatbuffer.ReadBuf r4 = r9.bb
                int r5 = r9.end
                long r5 = (long) r5
                int r7 = r9.byteWidth
                long r7 = (long) r7
                long r0 = r0 * r7
                long r0 = r0 + r5
                long r0 = r0 + r2
                int r1 = (int) r0
                byte r0 = r4.get(r1)
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r1 = r9.end
                int r2 = r9.byteWidth
                int r10 = r10 * r2
                int r10 = r10 + r1
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r1 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r9.bb
                int r3 = r9.byteWidth
                r1.<init>(r2, r10, r3, r0)
                return r1
        }

        public boolean isEmpty() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = super.toString()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "[ "
                r4.append(r0)
                int r0 = r3.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1f
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = r3.get(r1)
                r2.toString(r4)
                int r2 = r0 + (-1)
                if (r1 == r2) goto L1c
                java.lang.String r2 = ", "
                r4.append(r2)
            L1c:
                int r1 = r1 + 1
                goto La
            L1f:
                java.lang.String r0 = " ]"
                r4.append(r0)
                return r4
        }
    }

    static {
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            r1 = 1
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            r0.<init>(r2, r1)
            androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB = r0
            return
    }

    public FlexBuffers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.emoji2.text.flatbuffer.ReadBuf access$000() {
            androidx.emoji2.text.flatbuffer.ReadBuf r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB
            return r0
    }

    public static /* synthetic */ int access$100(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            int r0 = readInt(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int access$200(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            int r0 = indirect(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ long access$300(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            long r0 = readUInt(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ double access$400(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            double r0 = readDouble(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ long access$500(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            long r0 = readLong(r0, r1, r2)
            return r0
    }

    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(androidx.emoji2.text.flatbuffer.ReadBuf r4) {
            int r0 = r4.limit()
            int r0 = r0 + (-1)
            byte r1 = r4.get(r0)
            int r0 = r0 + (-1)
            byte r2 = r4.get(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r1
            androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
            r3.<init>(r4, r0, r1, r2)
            return r3
    }

    @java.lang.Deprecated
    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(java.nio.ByteBuffer r2) {
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L14
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            byte[] r1 = r2.array()
            int r2 = r2.limit()
            r0.<init>(r1, r2)
            goto L19
        L14:
            androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf
            r0.<init>(r2)
        L19:
            androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = getRoot(r0)
            return r2
    }

    private static int indirect(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            long r0 = (long) r3
            long r2 = readUInt(r2, r3, r4)
            long r0 = r0 - r2
            int r2 = (int) r0
            return r2
    }

    public static boolean isTypedVectorElementType(int r2) {
            r0 = 1
            if (r2 < r0) goto L6
            r1 = 4
            if (r2 <= r1) goto Lc
        L6:
            r1 = 26
            if (r2 != r1) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private static double readDouble(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
            r0 = 4
            if (r3 == r0) goto Lf
            r0 = 8
            if (r3 == r0) goto La
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r1
        La:
            double r1 = r1.getDouble(r2)
            return r1
        Lf:
            float r1 = r1.getFloat(r2)
            double r1 = (double) r1
            return r1
    }

    private static int readInt(androidx.emoji2.text.flatbuffer.ReadBuf r0, int r1, int r2) {
            long r0 = readLong(r0, r1, r2)
            int r1 = (int) r0
            return r1
    }

    private static long readLong(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
            r0 = 1
            if (r3 == r0) goto L20
            r0 = 2
            if (r3 == r0) goto L1b
            r0 = 4
            if (r3 == r0) goto L15
            r0 = 8
            if (r3 == r0) goto L10
            r1 = -1
            return r1
        L10:
            long r1 = r1.getLong(r2)
            return r1
        L15:
            int r1 = r1.getInt(r2)
        L19:
            long r1 = (long) r1
            return r1
        L1b:
            short r1 = r1.getShort(r2)
            goto L19
        L20:
            byte r1 = r1.get(r2)
            goto L19
    }

    private static long readUInt(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            r0 = 1
            if (r4 == r0) goto L2b
            r0 = 2
            if (r4 == r0) goto L21
            r0 = 4
            if (r4 == r0) goto L15
            r0 = 8
            if (r4 == r0) goto L10
            r2 = -1
            return r2
        L10:
            long r2 = r2.getLong(r3)
            return r2
        L15:
            int r2 = r2.getInt(r3)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
        L21:
            short r2 = r2.getShort(r3)
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            long r2 = (long) r2
            return r2
        L2b:
            byte r2 = r2.get(r3)
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            return r2
    }

    public static int toTypedVector(int r1, int r2) {
            if (r2 == 0) goto L1c
            r0 = 2
            if (r2 == r0) goto L17
            r0 = 3
            if (r2 == r0) goto L12
            r0 = 4
            if (r2 == r0) goto Ld
            r1 = 0
            return r1
        Ld:
            int r1 = r1 + (-1)
            int r1 = r1 + 22
            return r1
        L12:
            int r1 = r1 + (-1)
            int r1 = r1 + 19
            return r1
        L17:
            int r1 = r1 + (-1)
            int r1 = r1 + 16
            return r1
        L1c:
            int r1 = r1 + (-1)
            int r1 = r1 + 11
            return r1
    }
}
