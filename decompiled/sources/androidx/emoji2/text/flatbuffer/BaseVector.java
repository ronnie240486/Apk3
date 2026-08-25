package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BaseVector {
    public java.nio.ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public BaseVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public final int __element(int r3) {
            r2 = this;
            int r0 = r2.vector
            int r1 = r2.element_size
            int r3 = r3 * r1
            int r3 = r3 + r0
            return r3
    }

    public final void __reset(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.bb = r3
            if (r3 == 0) goto L11
            r0.vector = r1
            int r1 = r1 + (-4)
            int r1 = r3.getInt(r1)
            r0.length = r1
            r0.element_size = r2
            goto L18
        L11:
            r1 = 0
            r0.vector = r1
            r0.length = r1
            r0.element_size = r1
        L18:
            return
    }

    public int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r0, r1)
            return
    }
}
