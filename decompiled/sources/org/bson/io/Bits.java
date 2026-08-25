package org.bson.io;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class Bits {
    public Bits() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void readFully(java.io.InputStream r1, byte[] r2) throws java.io.IOException {
            int r0 = r2.length
            readFully(r1, r2, r0)
            return
    }

    public static void readFully(java.io.InputStream r1, byte[] r2, int r3) throws java.io.IOException {
            r0 = 0
            readFully(r1, r2, r0, r3)
            return
    }

    public static void readFully(java.io.InputStream r2, byte[] r3, int r4, int r5) throws java.io.IOException {
            int r0 = r3.length
            int r1 = r5 + r4
            if (r0 < r1) goto L17
        L5:
            if (r5 <= 0) goto L16
            int r0 = r2.read(r3, r4, r5)
            if (r0 < 0) goto L10
            int r5 = r5 - r0
            int r4 = r4 + r0
            goto L5
        L10:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L16:
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Buffer is too small"
            r2.<init>(r3)
            throw r2
    }

    public static int readInt(java.io.InputStream r1) throws java.io.IOException {
            r0 = 4
            byte[] r0 = new byte[r0]
            int r1 = readInt(r1, r0)
            return r1
    }

    public static int readInt(java.io.InputStream r1, byte[] r2) throws java.io.IOException {
            r0 = 4
            readFully(r1, r2, r0)
            int r1 = readInt(r2)
            return r1
    }

    public static int readInt(byte[] r1) {
            r0 = 0
            int r1 = readInt(r1, r0)
            return r1
    }

    public static int readInt(byte[] r2, int r3) {
            int r0 = r3 + 0
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 0
            r0 = r0 | 0
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static int readIntBE(byte[] r2, int r3) {
            int r0 = r3 + 0
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | 0
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 0
            r2 = r2 | r0
            return r2
    }

    public static long readLong(java.io.InputStream r2) throws java.io.IOException {
            r0 = 8
            byte[] r0 = new byte[r0]
            long r0 = readLong(r2, r0)
            return r0
    }

    public static long readLong(java.io.InputStream r1, byte[] r2) throws java.io.IOException {
            r0 = 8
            readFully(r1, r2, r0)
            long r1 = readLong(r2)
            return r1
    }

    public static long readLong(byte[] r2) {
            r0 = 0
            long r0 = readLong(r2, r0)
            return r0
    }

    public static long readLong(byte[] r7, int r8) {
            int r0 = r8 + 0
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 0
            long r0 = r0 << r4
            r4 = 0
            long r0 = r0 | r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }
}
