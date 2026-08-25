package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Table {
    public java.nio.ByteBuffer bb;
    public int bb_pos;
    public androidx.emoji2.text.flatbuffer.Utf8 utf8;
    private int vtable_size;
    private int vtable_start;


    public Table() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    public final int __offset(int r3) {
            r2 = this;
            int r0 = r2.vtable_size
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.vtable_start
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    public final void __reset(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.bb = r2
            if (r2 == 0) goto L16
            r0.bb_pos = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.vtable_start = r1
            java.nio.ByteBuffer r2 = r0.bb
            short r1 = r2.getShort(r1)
            r0.vtable_size = r1
            goto L1d
        L16:
            r1 = 0
            r0.bb_pos = r1
            r0.vtable_start = r1
            r0.vtable_size = r1
        L1d:
            return
    }

    public final int __vector(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            int r0 = r0 + 4
            return r0
    }

    public final java.nio.ByteBuffer __vector_as_bytebuffer(int r3, int r4) {
            r2 = this;
            int r3 = r2.__offset(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            int r1 = r2.__vector(r3)
            r0.position(r1)
            int r3 = r2.__vector_len(r3)
            int r3 = r3 * r4
            int r3 = r3 + r1
            r0.limit(r3)
            return r0
    }

    public final java.nio.ByteBuffer __vector_in_bytebuffer(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            int r3 = r1.__offset(r3)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = r1.__vector(r3)
            r2.rewind()
            int r3 = r1.__vector_len(r3)
            int r3 = r3 * r4
            int r3 = r3 + r0
            r2.limit(r3)
            r2.position(r0)
            return r2
    }

    public final int __vector_len(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            java.nio.ByteBuffer r2 = r1.bb
            int r2 = r2.getInt(r0)
            return r2
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            return r0
    }
}
