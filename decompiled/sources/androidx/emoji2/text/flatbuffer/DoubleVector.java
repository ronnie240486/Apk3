package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public DoubleVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.DoubleVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 8
            r1.__reset(r2, r0, r3)
            return r1
    }

    public double get(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r3 = r2.__element(r3)
            double r0 = r0.getDouble(r3)
            return r0
    }
}
