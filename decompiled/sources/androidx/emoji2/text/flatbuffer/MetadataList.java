package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataList extends androidx.emoji2.text.flatbuffer.Table {

    public static final class Vector extends androidx.emoji2.text.flatbuffer.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.emoji2.text.flatbuffer.MetadataList.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(int r2) {
                r1 = this;
                androidx.emoji2.text.flatbuffer.MetadataList r0 = new androidx.emoji2.text.flatbuffer.MetadataList
                r0.<init>()
                androidx.emoji2.text.flatbuffer.MetadataList r2 = r1.get(r0, r2)
                return r2
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(androidx.emoji2.text.flatbuffer.MetadataList r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r0 = r0.getInt(r3)
                int r0 = r0 + r3
                java.nio.ByteBuffer r3 = r1.bb
                androidx.emoji2.text.flatbuffer.MetadataList r2 = r2.__assign(r0, r3)
                return r2
        }
    }

    public MetadataList() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            androidx.emoji2.text.flatbuffer.Constants.FLATBUFFERS_1_12_0()
            return
    }

    public static void addList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addSourceSha(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int r3) {
            r0 = 2
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addVersion(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 0
            r1.addInt(r0, r2, r0)
            return
    }

    public static int createListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int[] r3) {
            int r0 = r3.length
            r1 = 4
            r2.startVector(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r2 = r2.endVector()
            return r2
    }

    public static int createMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2, int r3, int r4) {
            r0 = 3
            r1.startTable(r0)
            addSourceSha(r1, r4)
            addList(r1, r3)
            addVersion(r1, r2)
            int r1 = endMetadataList(r1)
            return r1
    }

    public static int endMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0) {
            int r0 = r0.endTable()
            return r0
    }

    public static void finishMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0, int r1) {
            r0.finish(r1)
            return
    }

    public static void finishSizePrefixedMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0, int r1) {
            r0.finishSizePrefixed(r1)
            return
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer r1) {
            androidx.emoji2.text.flatbuffer.MetadataList r0 = new androidx.emoji2.text.flatbuffer.MetadataList
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataList r1 = getRootAsMetadataList(r1, r0)
            return r1
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer r2, androidx.emoji2.text.flatbuffer.MetadataList r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r1 = r1 + r0
            androidx.emoji2.text.flatbuffer.MetadataList r2 = r3.__assign(r1, r2)
            return r2
    }

    public static void startListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1) {
            r0 = 3
            r1.startTable(r0)
            return
    }

    public androidx.emoji2.text.flatbuffer.MetadataList __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(int r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = new androidx.emoji2.text.flatbuffer.MetadataItem
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataItem r2 = r1.list(r0, r2)
            return r2
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(androidx.emoji2.text.flatbuffer.MetadataItem r2, int r3) {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L1c
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r3)
            int r0 = r0 + r3
            java.nio.ByteBuffer r3 = r1.bb
            androidx.emoji2.text.flatbuffer.MetadataItem r2 = r2.__assign(r0, r3)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    public int listLength() {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r0 = r1.__vector_len(r0)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r0 = new androidx.emoji2.text.flatbuffer.MetadataItem$Vector
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r0 = r1.listVector(r0)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector(androidx.emoji2.text.flatbuffer.MetadataItem.Vector r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r3.__vector(r0)
            r1 = 4
            java.nio.ByteBuffer r2 = r3.bb
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r4 = r4.__assign(r0, r1, r2)
            goto L14
        L13:
            r4 = 0
        L14:
            return r4
    }

    public java.lang.String sourceSha() {
            r4 = this;
            r0 = 8
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L1f
            int r1 = r4.bb_pos
            int r0 = r0 + r1
            java.nio.ByteBuffer r1 = r4.bb
            androidx.emoji2.text.flatbuffer.Utf8 r2 = r4.utf8
            int r3 = r1.getInt(r0)
            int r3 = r3 + r0
            int r0 = r1.getInt(r3)
            int r3 = r3 + 4
            java.lang.String r0 = r2.decodeUtf8(r1, r3, r0)
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public java.nio.ByteBuffer sourceShaAsByteBuffer() {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer sourceShaInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r3
    }

    public int version() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            int r0 = r1.getInt(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }
}
