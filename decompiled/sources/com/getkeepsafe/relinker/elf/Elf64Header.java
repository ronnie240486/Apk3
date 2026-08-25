package com.getkeepsafe.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class Elf64Header extends com.getkeepsafe.relinker.elf.Elf.Header {
    private final com.getkeepsafe.relinker.elf.ElfParser parser;

    public Elf64Header(boolean r5, com.getkeepsafe.relinker.elf.ElfParser r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r4.bigEndian = r5
            r4.parser = r6
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            if (r5 == 0) goto L12
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            goto L14
        L12:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
        L14:
            r1.order(r5)
            r2 = 16
            int r5 = r6.readHalf(r1, r2)
            r4.type = r5
            r2 = 32
            r6.read(r1, r2, r0)
            long r2 = r1.getLong()
            r4.phoff = r2
            r2 = 40
            r6.read(r1, r2, r0)
            long r2 = r1.getLong()
            r4.shoff = r2
            r2 = 54
            int r5 = r6.readHalf(r1, r2)
            r4.phentsize = r5
            r2 = 56
            int r5 = r6.readHalf(r1, r2)
            r4.phnum = r5
            r2 = 58
            int r5 = r6.readHalf(r1, r2)
            r4.shentsize = r5
            r2 = 60
            int r5 = r6.readHalf(r1, r2)
            r4.shnum = r5
            r2 = 62
            int r5 = r6.readHalf(r1, r2)
            r4.shstrndx = r5
            return
    }

    @Override // com.getkeepsafe.relinker.elf.Elf.Header
    public com.getkeepsafe.relinker.elf.Elf.DynamicStructure getDynamicStructure(long r8, int r10) throws java.io.IOException {
            r7 = this;
            com.getkeepsafe.relinker.elf.Dynamic64Structure r6 = new com.getkeepsafe.relinker.elf.Dynamic64Structure
            com.getkeepsafe.relinker.elf.ElfParser r1 = r7.parser
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            return r6
    }

    @Override // com.getkeepsafe.relinker.elf.Elf.Header
    public com.getkeepsafe.relinker.elf.Elf.ProgramHeader getProgramHeader(long r3) throws java.io.IOException {
            r2 = this;
            com.getkeepsafe.relinker.elf.Program64Header r0 = new com.getkeepsafe.relinker.elf.Program64Header
            com.getkeepsafe.relinker.elf.ElfParser r1 = r2.parser
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.getkeepsafe.relinker.elf.Elf.Header
    public com.getkeepsafe.relinker.elf.Elf.SectionHeader getSectionHeader(int r3) throws java.io.IOException {
            r2 = this;
            com.getkeepsafe.relinker.elf.Section64Header r0 = new com.getkeepsafe.relinker.elf.Section64Header
            com.getkeepsafe.relinker.elf.ElfParser r1 = r2.parser
            r0.<init>(r1, r2, r3)
            return r0
    }
}
