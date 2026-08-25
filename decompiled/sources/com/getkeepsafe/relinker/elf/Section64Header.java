package com.getkeepsafe.relinker.elf;

/* JADX INFO: loaded from: classes.dex */
public class Section64Header extends com.getkeepsafe.relinker.elf.Elf.SectionHeader {
    public Section64Header(com.getkeepsafe.relinker.elf.ElfParser r4, com.getkeepsafe.relinker.elf.Elf.Header r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r5.bigEndian
            if (r1 == 0) goto L10
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r0.order(r1)
            long r1 = r5.shoff
            int r5 = r5.shentsize
            int r6 = r6 * r5
            long r5 = (long) r6
            long r1 = r1 + r5
            r5 = 44
            long r1 = r1 + r5
            long r4 = r4.readWord(r0, r1)
            r3.info = r4
            return
    }
}
