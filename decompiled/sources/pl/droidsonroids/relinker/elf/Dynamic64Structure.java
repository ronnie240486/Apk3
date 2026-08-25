package pl.droidsonroids.relinker.elf;

/* JADX INFO: loaded from: classes3.dex */
public class Dynamic64Structure extends pl.droidsonroids.relinker.elf.Elf.DynamicStructure {
    public Dynamic64Structure(pl.droidsonroids.relinker.elf.ElfParser r5, pl.droidsonroids.relinker.elf.Elf.Header r6, long r7, int r9) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            boolean r6 = r6.bigEndian
            if (r6 == 0) goto L10
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r1.order(r6)
            int r9 = r9 * 16
            long r2 = (long) r9
            long r7 = r7 + r2
            r5.read(r1, r7, r0)
            long r2 = r1.getLong()
            r4.tag = r2
            r2 = 8
            long r7 = r7 + r2
            r5.read(r1, r7, r0)
            long r5 = r1.getLong()
            r4.val = r5
            return
    }
}
