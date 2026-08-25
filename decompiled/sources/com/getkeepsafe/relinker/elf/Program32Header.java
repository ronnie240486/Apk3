package com.getkeepsafe.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class Program32Header extends com.getkeepsafe.relinker.elf.Elf.ProgramHeader {
    public Program32Header(com.getkeepsafe.relinker.elf.ElfParser r6, com.getkeepsafe.relinker.elf.Elf.Header r7, long r8) throws java.io.IOException {
            r5 = this;
            r5.<init>()
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r7.bigEndian
            if (r1 == 0) goto Lf
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L11
        Lf:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L11:
            r0.order(r1)
            long r1 = r7.phoff
            int r7 = r7.phentsize
            long r3 = (long) r7
            long r8 = r8 * r3
            long r8 = r8 + r1
            long r1 = r6.readWord(r0, r8)
            r5.type = r1
            r1 = 4
            long r1 = r1 + r8
            long r1 = r6.readWord(r0, r1)
            r5.offset = r1
            r1 = 8
            long r1 = r1 + r8
            long r1 = r6.readWord(r0, r1)
            r5.vaddr = r1
            r1 = 20
            long r8 = r8 + r1
            long r6 = r6.readWord(r0, r8)
            r5.memsz = r6
            return
    }
}
