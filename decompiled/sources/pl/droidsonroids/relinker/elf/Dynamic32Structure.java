package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class Dynamic32Structure extends pl.droidsonroids.relinker.elf.Elf.DynamicStructure {
    public Dynamic32Structure(pl.droidsonroids.relinker.elf.ElfParser r4, pl.droidsonroids.relinker.elf.Elf.Header r5, long r6, int r8) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r5 = r5.bigEndian
            if (r5 == 0) goto Lf
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            goto L11
        Lf:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
        L11:
            r0.order(r5)
            int r8 = r8 * 8
            long r1 = (long) r8
            long r6 = r6 + r1
            long r1 = r4.readWord(r0, r6)
            r3.tag = r1
            r1 = 4
            long r6 = r6 + r1
            long r4 = r4.readWord(r0, r6)
            r3.val = r4
            return
    }
}
