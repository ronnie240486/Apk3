package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataItem extends androidx.emoji2.text.flatbuffer.Table {

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Vector extends androidx.emoji2.text.flatbuffer.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.emoji2.text.flatbuffer.MetadataItem.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.MetadataItem get(int r2) {
                r1 = this;
                androidx.emoji2.text.flatbuffer.MetadataItem r0 = new androidx.emoji2.text.flatbuffer.MetadataItem
                r0.<init>()
                androidx.emoji2.text.flatbuffer.MetadataItem r2 = r1.get(r0, r2)
                return r2
        }

        public androidx.emoji2.text.flatbuffer.MetadataItem get(androidx.emoji2.text.flatbuffer.MetadataItem r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r0 = r0.getInt(r3)
                int r0 = r0 + r3
                java.nio.ByteBuffer r3 = r1.bb
                androidx.emoji2.text.flatbuffer.MetadataItem r2 = r2.__assign(r0, r3)
                return r2
        }
    }

    public MetadataItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            androidx.emoji2.text.flatbuffer.Constants.FLATBUFFERS_1_12_0()
            return
    }

    public static void addCodepoints(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int r3) {
            r0 = 6
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addCompatAdded(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, short r3) {
            r0 = 3
            r1 = 0
            r2.addShort(r0, r3, r1)
            return
    }

    public static void addEmojiStyle(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, boolean r3) {
            r0 = 1
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addHeight(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, short r3) {
            r0 = 5
            r1 = 0
            r2.addShort(r0, r3, r1)
            return
    }

    public static void addId(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 0
            r1.addInt(r0, r2, r0)
            return
    }

    public static void addSdkAdded(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, short r3) {
            r0 = 2
            r1 = 0
            r2.addShort(r0, r3, r1)
            return
    }

    public static void addWidth(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, short r3) {
            r0 = 4
            r1 = 0
            r2.addShort(r0, r3, r1)
            return
    }

    public static int createCodepointsVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int[] r3) {
            int r0 = r3.length
            r1 = 4
            r2.startVector(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addInt(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r2 = r2.endVector()
            return r2
    }

    public static int createMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2, boolean r3, short r4, short r5, short r6, short r7, int r8) {
            r0 = 7
            r1.startTable(r0)
            addCodepoints(r1, r8)
            addId(r1, r2)
            addHeight(r1, r7)
            addWidth(r1, r6)
            addCompatAdded(r1, r5)
            addSdkAdded(r1, r4)
            addEmojiStyle(r1, r3)
            int r1 = endMetadataItem(r1)
            return r1
    }

    public static int endMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0) {
            int r0 = r0.endTable()
            return r0
    }

    public static androidx.emoji2.text.flatbuffer.MetadataItem getRootAsMetadataItem(java.nio.ByteBuffer r1) {
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = new androidx.emoji2.text.flatbuffer.MetadataItem
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataItem r1 = getRootAsMetadataItem(r1, r0)
            return r1
    }

    public static androidx.emoji2.text.flatbuffer.MetadataItem getRootAsMetadataItem(java.nio.ByteBuffer r2, androidx.emoji2.text.flatbuffer.MetadataItem r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r1 = r1 + r0
            androidx.emoji2.text.flatbuffer.MetadataItem r2 = r3.__assign(r1, r2)
            return r2
    }

    public static void startCodepointsVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1) {
            r0 = 7
            r1.startTable(r0)
            return
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public int codepoints(int r3) {
            r2 = this;
            r0 = 16
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r2.bb
            int r0 = r2.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.getInt(r3)
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    public java.nio.ByteBuffer codepointsAsByteBuffer() {
            r2 = this;
            r0 = 16
            r1 = 4
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer codepointsInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 16
            r1 = 4
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r3
    }

    public int codepointsLength() {
            r1 = this;
            r0 = 16
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public androidx.emoji2.text.flatbuffer.IntVector codepointsVector() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.IntVector r0 = new androidx.emoji2.text.flatbuffer.IntVector
            r0.<init>()
            androidx.emoji2.text.flatbuffer.IntVector r0 = r1.codepointsVector(r0)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.IntVector codepointsVector(androidx.emoji2.text.flatbuffer.IntVector r3) {
            r2 = this;
            r0 = 16
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r2.__vector(r0)
            java.nio.ByteBuffer r1 = r2.bb
            androidx.emoji2.text.flatbuffer.IntVector r3 = r3.__assign(r0, r1)
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    public short compatAdded() {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean emojiStyle() {
            r4 = this;
            r0 = 6
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L14
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L14
            r1 = 1
        L14:
            return r1
    }

    public short height() {
            r3 = this;
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public int id() {
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

    public short sdkAdded() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public short width() {
            r3 = this;
            r0 = 12
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }
}
