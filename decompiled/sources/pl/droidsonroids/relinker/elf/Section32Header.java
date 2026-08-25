package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes2.dex */
public class Section32Header extends pl.droidsonroids.relinker.elf.Elf.SectionHeader {
    public Section32Header(pl.droidsonroids.relinker.elf.ElfParser r4, pl.droidsonroids.relinker.elf.Elf.Header r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r5.bigEndian
            if (r1 == 0) goto Lf
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L11
        Lf:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L11:
            r0.order(r1)
            long r1 = r5.shoff
            int r5 = r5.shentsize
            int r6 = r6 * r5
            long r5 = (long) r6
            long r1 = r1 + r5
            r5 = 28
            long r1 = r1 + r5
            long r4 = r4.readWord(r0, r1)
            r3.info = r4
            return
    }
}
