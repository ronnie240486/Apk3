package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class StringVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    private androidx.emoji2.text.flatbuffer.Utf8 utf8;

    public StringVector() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    public androidx.emoji2.text.flatbuffer.StringVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public java.lang.String get(int r4) {
            r3 = this;
            int r4 = r3.__element(r4)
            java.nio.ByteBuffer r0 = r3.bb
            androidx.emoji2.text.flatbuffer.Utf8 r1 = r3.utf8
            int r2 = r0.getInt(r4)
            int r2 = r2 + r4
            int r4 = r0.getInt(r2)
            int r2 = r2 + 4
            java.lang.String r4 = r1.decodeUtf8(r0, r2, r4)
            return r4
    }
}
