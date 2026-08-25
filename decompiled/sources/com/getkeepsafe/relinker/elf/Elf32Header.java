package com.getkeepsafe.relinker.elf;

/* JADX INFO: loaded from: classes2.dex */
public class Elf32Header extends com.getkeepsafe.relinker.elf.Elf.Header {
    private final com.getkeepsafe.relinker.elf.ElfParser parser;

    public Elf32Header(boolean r4, com.getkeepsafe.relinker.elf.ElfParser r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r3.bigEndian = r4
            r3.parser = r5
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            if (r4 == 0) goto L11
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            goto L13
        L11:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
        L13:
            r0.order(r4)
            r1 = 16
            int r4 = r5.readHalf(r0, r1)
            r3.type = r4
            r1 = 28
            long r1 = r5.readWord(r0, r1)
            r3.phoff = r1
            r1 = 32
            long r1 = r5.readWord(r0, r1)
            r3.shoff = r1
            r1 = 42
            int r4 = r5.readHalf(r0, r1)
            r3.phentsize = r4
            r1 = 44
            int r4 = r5.readHalf(r0, r1)
            r3.phnum = r4
            r1 = 46
            int r4 = r5.readHalf(r0, r1)
            r3.shentsize = r4
            r1 = 48
            int r4 = r5.readHalf(r0, r1)
            r3.shnum = r4
            r1 = 50
            int r4 = r5.readHalf(r0, r1)
            r3.shstrndx = r4
            return
    }

    @Override // com.getkeepsafe.relinker.elf.Elf.Header
    public com.getkeepsafe.relinker.elf.Elf.DynamicStructure getDynamicStructure(long r8, int r10) throws java.io.IOException {
            r7 = this;
            com.getkeepsafe.relinker.elf.Dynamic32Structure r6 = new com.getkeepsafe.relinker.elf.Dynamic32Structure
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
            com.getkeepsafe.relinker.elf.Program32Header r0 = new com.getkeepsafe.relinker.elf.Program32Header
            com.getkeepsafe.relinker.elf.ElfParser r1 = r2.parser
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.getkeepsafe.relinker.elf.Elf.Header
    public com.getkeepsafe.relinker.elf.Elf.SectionHeader getSectionHeader(int r3) throws java.io.IOException {
            r2 = this;
            com.getkeepsafe.relinker.elf.Section32Header r0 = new com.getkeepsafe.relinker.elf.Section32Header
            com.getkeepsafe.relinker.elf.ElfParser r1 = r2.parser
            r0.<init>(r1, r2, r3)
            return r0
    }
}
