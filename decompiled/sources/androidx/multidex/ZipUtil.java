package androidx.multidex;

/* JADX INFO: loaded from: classes2.dex */
final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    public static class CentralDirectory {
        public long offset;
        public long size;

        public CentralDirectory() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ZipUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.multidex.ZipUtil.CentralDirectory findCentralDirectory(java.io.RandomAccessFile r7) throws java.io.IOException, java.util.zip.ZipException {
            long r0 = r7.length()
            r2 = 22
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L68
            r4 = 65536(0x10000, double:3.2379E-319)
            long r4 = r0 - r4
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L17
            goto L18
        L17:
            r2 = r4
        L18:
            r4 = 101010256(0x6054b50, float:2.506985E-35)
            int r4 = java.lang.Integer.reverseBytes(r4)
        L1f:
            r7.seek(r0)
            int r5 = r7.readInt()
            if (r5 != r4) goto L58
            r0 = 2
            r7.skipBytes(r0)
            r7.skipBytes(r0)
            r7.skipBytes(r0)
            r7.skipBytes(r0)
            androidx.multidex.ZipUtil$CentralDirectory r0 = new androidx.multidex.ZipUtil$CentralDirectory
            r0.<init>()
            int r1 = r7.readInt()
            int r1 = java.lang.Integer.reverseBytes(r1)
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.size = r1
            int r7 = r7.readInt()
            int r7 = java.lang.Integer.reverseBytes(r7)
            long r1 = (long) r7
            long r1 = r1 & r3
            r0.offset = r1
            return r0
        L58:
            r5 = 1
            long r0 = r0 - r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L60
            goto L1f
        L60:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.String r0 = "End Of Central Directory signature not found"
            r7.<init>(r0)
            throw r7
        L68:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "File too short to be a zip file: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r2 = r7.length()
            r1.append(r2)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }
}
