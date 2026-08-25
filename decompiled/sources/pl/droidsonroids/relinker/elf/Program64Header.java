package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class Program64Header extends pl.droidsonroids.relinker.elf.Elf.ProgramHeader {
    public Program64Header(pl.droidsonroids.relinker.elf.ElfParser r7, pl.droidsonroids.relinker.elf.Elf.Header r8, long r9) throws java.io.IOException {
            r6 = this;
            r6.<init>()
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            boolean r2 = r8.bigEndian
            if (r2 == 0) goto L10
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r1.order(r2)
            long r2 = r8.phoff
            int r8 = r8.phentsize
            long r4 = (long) r8
            long r9 = r9 * r4
            long r9 = r9 + r2
            long r2 = r7.readWord(r1, r9)
            r6.type = r2
            r2 = 8
            long r2 = r2 + r9
            r7.read(r1, r2, r0)
            long r2 = r1.getLong()
            r6.offset = r2
            r2 = 16
            long r2 = r2 + r9
            r7.read(r1, r2, r0)
            long r2 = r1.getLong()
            r6.vaddr = r2
            r2 = 40
            long r9 = r9 + r2
            r7.read(r1, r9, r0)
            long r7 = r1.getLong()
            r6.memsz = r7
            return
    }
}
