package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes2.dex */
public interface Elf {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class DynamicStructure {
        public static final int DT_NEEDED = 1;
        public static final int DT_NULL = 0;
        public static final int DT_STRTAB = 5;
        public long tag;
        public long val;

        public DynamicStructure() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static abstract class Header {
        public static final int ELFCLASS32 = 1;
        public static final int ELFCLASS64 = 2;
        public static final int ELFDATA2MSB = 2;
        public boolean bigEndian;
        public int phentsize;
        public int phnum;
        public long phoff;
        public int shentsize;
        public int shnum;
        public long shoff;
        public int shstrndx;
        public int type;

        public Header() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract pl.droidsonroids.relinker.elf.Elf.DynamicStructure getDynamicStructure(long r1, int r3) throws java.io.IOException;

        public abstract pl.droidsonroids.relinker.elf.Elf.ProgramHeader getProgramHeader(long r1) throws java.io.IOException;

        public abstract pl.droidsonroids.relinker.elf.Elf.SectionHeader getSectionHeader(int r1) throws java.io.IOException;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class ProgramHeader {
        public static final int PT_DYNAMIC = 2;
        public static final int PT_LOAD = 1;
        public long memsz;
        public long offset;
        public long type;
        public long vaddr;

        public ProgramHeader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class SectionHeader {
        public long info;

        public SectionHeader() {
                r0 = this;
                r0.<init>()
                return
        }
    }
}
