package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class UnionVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public UnionVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.UnionVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.Table get(androidx.emoji2.text.flatbuffer.Table r3, int r4) {
            r2 = this;
            int r4 = r2.__element(r4)
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r0.getInt(r4)
            int r1 = r1 + r4
            r3.__reset(r1, r0)
            return r3
    }
}
