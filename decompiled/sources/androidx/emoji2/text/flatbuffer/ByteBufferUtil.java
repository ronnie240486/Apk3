package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferUtil {
    public ByteBufferUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSizePrefix(java.nio.ByteBuffer r1) {
            int r0 = r1.position()
            int r1 = r1.getInt(r0)
            return r1
    }

    public static java.nio.ByteBuffer removeSizePrefix(java.nio.ByteBuffer r1) {
            java.nio.ByteBuffer r1 = r1.duplicate()
            int r0 = r1.position()
            int r0 = r0 + 4
            r1.position(r0)
            return r1
    }
}
