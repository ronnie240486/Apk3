package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class ElfParser implements java.io.Closeable, pl.droidsonroids.relinker.elf.Elf {
    private final int MAGIC;
    private final java.nio.channels.FileChannel channel;

    public ElfParser(java.io.File r2) throws java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            r0 = 1179403647(0x464c457f, float:13073.374)
            r1.MAGIC = r0
            if (r2 == 0) goto L1c
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1c
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.nio.channels.FileChannel r2 = r0.getChannel()
            r1.channel = r2
            return
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File is null or does not exist"
            r2.<init>(r0)
            throw r2
    }

    private long offsetFromVma(pl.droidsonroids.relinker.elf.Elf.Header r11, long r12, long r14) throws java.io.IOException {
            r10 = this;
            r0 = 0
        L2:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L26
            pl.droidsonroids.relinker.elf.Elf$ProgramHeader r2 = r11.getProgramHeader(r0)
            long r3 = r2.type
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            long r3 = r2.vaddr
            int r7 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r7 > 0) goto L24
            long r7 = r2.memsz
            long r7 = r7 + r3
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L24
            long r14 = r14 - r3
            long r11 = r2.offset
            long r14 = r14 + r11
            return r14
        L24:
            long r0 = r0 + r5
            goto L2
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Could not map vma to file offset!"
            r11.<init>(r12)
            throw r11
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.channel
            r0.close()
            return
    }

    public pl.droidsonroids.relinker.elf.Elf.Header parseHeader() throws java.io.IOException {
            r6 = this;
            java.nio.channels.FileChannel r0 = r6.channel
            r1 = 0
            r0.position(r1)
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            long r1 = r6.readWord(r0, r1)
            r3 = 1179403647(0x464c457f, double:5.827028246E-315)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L48
            r1 = 4
            short r1 = r6.readByte(r0, r1)
            r2 = 5
            short r0 = r6.readByte(r0, r2)
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r1 != r2) goto L38
            pl.droidsonroids.relinker.elf.Elf32Header r1 = new pl.droidsonroids.relinker.elf.Elf32Header
            r1.<init>(r0, r6)
            return r1
        L38:
            if (r1 != r3) goto L40
            pl.droidsonroids.relinker.elf.Elf64Header r1 = new pl.droidsonroids.relinker.elf.Elf64Header
            r1.<init>(r0, r6)
            return r1
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid class type!"
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid ELF Magic!"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List<java.lang.String> parseNeededDependencies() throws java.io.IOException {
            r22 = this;
            r6 = r22
            java.nio.channels.FileChannel r0 = r6.channel
            r1 = 0
            r0.position(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            pl.droidsonroids.relinker.elf.Elf$Header r3 = r22.parseHeader()
            r0 = 8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r0)
            boolean r0 = r3.bigEndian
            if (r0 == 0) goto L1f
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            goto L21
        L1f:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
        L21:
            r8.order(r0)
            int r0 = r3.phnum
            long r4 = (long) r0
            r9 = 65535(0xffff, double:3.23786E-319)
            r0 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L35
            pl.droidsonroids.relinker.elf.Elf$SectionHeader r4 = r3.getSectionHeader(r0)
            long r4 = r4.info
        L35:
            r9 = r1
        L36:
            r11 = 1
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 >= 0) goto L4d
            pl.droidsonroids.relinker.elf.Elf$ProgramHeader r13 = r3.getProgramHeader(r9)
            long r14 = r13.type
            r16 = 2
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L4b
            long r9 = r13.offset
            goto L4e
        L4b:
            long r9 = r9 + r11
            goto L36
        L4d:
            r9 = r1
        L4e:
            int r13 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r13 != 0) goto L57
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            return r0
        L57:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r14 = r1
        L5d:
            pl.droidsonroids.relinker.elf.Elf$DynamicStructure r1 = r3.getDynamicStructure(r9, r0)
            r18 = r9
            long r9 = r1.tag
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L73
            long r9 = r1.val
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r13.add(r2)
            goto L7c
        L73:
            r20 = 5
            int r2 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r2 != 0) goto L7c
            long r9 = r1.val
            r14 = r9
        L7c:
            int r0 = r0 + 1
            long r1 = r1.tag
            r9 = 0
            int r16 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r16 != 0) goto Lcc
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 == 0) goto Lc4
            r0 = r22
            r1 = r3
            r2 = r4
            r4 = r14
            long r0 = r0.offsetFromVma(r1, r2, r4)
            java.util.Iterator r2 = r13.iterator()
        L97:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = r3 + r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        Lad:
            long r9 = r3 + r11
            short r3 = r6.readByte(r8, r3)
            if (r3 == 0) goto Lbb
            char r3 = (char) r3
            r5.append(r3)
            r3 = r9
            goto Lad
        Lbb:
            java.lang.String r3 = r5.toString()
            r7.add(r3)
            goto L97
        Lc3:
            return r7
        Lc4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "String table offset not found!"
            r0.<init>(r1)
            throw r0
        Lcc:
            r9 = r18
            goto L5d
    }

    public final void read(java.nio.ByteBuffer r7, long r8, int r10) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r7.position(r0)
            r7.limit(r10)
            r1 = 0
        L9:
            long r3 = (long) r10
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            java.nio.channels.FileChannel r3 = r6.channel
            long r4 = r8 + r1
            int r3 = r3.read(r7, r4)
            r4 = -1
            if (r3 == r4) goto L1c
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L9
        L1c:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L22:
            r7.position(r0)
            return
    }

    public final short readByte(java.nio.ByteBuffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.read(r2, r3, r0)
            byte r2 = r2.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            return r2
    }

    public final int readHalf(java.nio.ByteBuffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.read(r2, r3, r0)
            short r2 = r2.getShort()
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            return r2
    }

    public final long readWord(java.nio.ByteBuffer r3, long r4) throws java.io.IOException {
            r2 = this;
            r0 = 4
            r2.read(r3, r4, r0)
            int r3 = r3.getInt()
            long r3 = (long) r3
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            return r3
    }
}
