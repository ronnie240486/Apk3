package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ByteVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public ByteVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.ByteVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 1
            r1.__reset(r2, r0, r3)
            return r1
    }

    public byte get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            byte r2 = r0.get(r2)
            return r2
    }

    public int getAsUnsigned(int r1) {
            r0 = this;
            byte r1 = r0.get(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }
}
