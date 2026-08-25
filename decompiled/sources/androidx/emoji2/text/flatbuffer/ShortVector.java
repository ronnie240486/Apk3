package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public ShortVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.ShortVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 2
            r1.__reset(r2, r0, r3)
            return r1
    }

    public short get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            short r2 = r0.getShort(r2)
            return r2
    }

    public int getAsUnsigned(int r2) {
            r1 = this;
            short r2 = r1.get(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }
}
