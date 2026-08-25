package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.video.spherical.Projection decode(byte[] r5, int r6) {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r5)
            r5 = 0
            boolean r1 = isProj(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
            if (r1 == 0) goto L11
            java.util.ArrayList r0 = parseProj(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
            goto L17
        L11:
            java.util.ArrayList r0 = parseMshp(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
            goto L17
        L16:
            r0 = r5
        L17:
            if (r0 != 0) goto L1a
            return r5
        L1a:
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L38
            r4 = 2
            if (r1 == r4) goto L26
            return r5
        L26:
            com.google.android.exoplayer2.video.spherical.Projection r5 = new com.google.android.exoplayer2.video.spherical.Projection
            java.lang.Object r1 = r0.get(r2)
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r1 = (com.google.android.exoplayer2.video.spherical.Projection.Mesh) r1
            java.lang.Object r0 = r0.get(r3)
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r0 = (com.google.android.exoplayer2.video.spherical.Projection.Mesh) r0
            r5.<init>(r1, r0, r6)
            return r5
        L38:
            com.google.android.exoplayer2.video.spherical.Projection r5 = new com.google.android.exoplayer2.video.spherical.Projection
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r0 = (com.google.android.exoplayer2.video.spherical.Projection.Mesh) r0
            r5.<init>(r0, r6)
            return r5
    }

    private static int decodeZigZag(int r1) {
            int r0 = r1 >> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    private static boolean isProj(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 4
            r2.skipBytes(r0)
            int r0 = r2.readInt()
            r1 = 0
            r2.setPosition(r1)
            r2 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r0 != r2) goto L12
            r1 = 1
        L12:
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.video.spherical.Projection.Mesh parseMesh(com.google.android.exoplayer2.util.ParsableByteArray r23) {
            int r0 = r23.readInt()
            r1 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r2) goto La
            return r1
        La:
            float[] r2 = new float[r0]
            r4 = 0
        Ld:
            if (r4 >= r0) goto L18
            float r5 = r23.readFloat()
            r2[r4] = r5
            int r4 = r4 + 1
            goto Ld
        L18:
            int r4 = r23.readInt()
            r5 = 32000(0x7d00, float:4.4842E-41)
            if (r4 <= r5) goto L21
            return r1
        L21:
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.log(r5)
            double r9 = (double) r0
            double r9 = r9 * r5
            double r9 = java.lang.Math.log(r9)
            double r9 = r9 / r7
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            com.google.android.exoplayer2.util.ParsableBitArray r10 = new com.google.android.exoplayer2.util.ParsableBitArray
            byte[] r11 = r23.getData()
            r10.<init>(r11)
            int r11 = r23.getPosition()
            r12 = 8
            int r11 = r11 * 8
            r10.setPosition(r11)
            int r11 = r4 * 5
            float[] r11 = new float[r11]
            r13 = 5
            int[] r14 = new int[r13]
            r15 = 0
            r16 = 0
        L52:
            if (r15 >= r4) goto L7b
            r3 = 0
        L55:
            if (r3 >= r13) goto L77
            r17 = r14[r3]
            int r18 = r10.readBits(r9)
            int r18 = decodeZigZag(r18)
            int r13 = r17 + r18
            if (r13 >= r0) goto L76
            if (r13 >= 0) goto L68
            goto L76
        L68:
            int r17 = r16 + 1
            r18 = r2[r13]
            r11[r16] = r18
            r14[r3] = r13
            int r3 = r3 + 1
            r16 = r17
            r13 = 5
            goto L55
        L76:
            return r1
        L77:
            int r15 = r15 + 1
            r13 = 5
            goto L52
        L7b:
            int r0 = r10.getPosition()
            int r0 = r0 + 7
            r0 = r0 & (-8)
            r10.setPosition(r0)
            r0 = 32
            int r2 = r10.readBits(r0)
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh[] r3 = new com.google.android.exoplayer2.video.spherical.Projection.SubMesh[r2]
            r9 = 0
        L8f:
            if (r9 >= r2) goto L10b
            int r13 = r10.readBits(r12)
            int r14 = r10.readBits(r12)
            int r15 = r10.readBits(r0)
            r0 = 128000(0x1f400, float:1.79366E-40)
            if (r15 <= r0) goto La3
            return r1
        La3:
            r16 = r13
            double r12 = (double) r4
            double r12 = r12 * r5
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 / r7
            double r12 = java.lang.Math.ceil(r12)
            int r12 = (int) r12
            int r13 = r15 * 3
            float[] r13 = new float[r13]
            int r0 = r15 * 2
            float[] r0 = new float[r0]
            r5 = 0
            r6 = 0
        Lbc:
            if (r5 >= r15) goto Lf9
            int r19 = r10.readBits(r12)
            int r19 = decodeZigZag(r19)
            int r6 = r6 + r19
            if (r6 < 0) goto Lf8
            if (r6 < r4) goto Lcd
            goto Lf8
        Lcd:
            int r19 = r5 * 3
            int r20 = r6 * 5
            r21 = r11[r20]
            r13[r19] = r21
            int r21 = r19 + 1
            int r22 = r20 + 1
            r22 = r11[r22]
            r13[r21] = r22
            int r19 = r19 + 2
            int r21 = r20 + 2
            r21 = r11[r21]
            r13[r19] = r21
            int r19 = r5 * 2
            int r21 = r20 + 3
            r21 = r11[r21]
            r0[r19] = r21
            int r19 = r19 + 1
            int r20 = r20 + 4
            r20 = r11[r20]
            r0[r19] = r20
            int r5 = r5 + 1
            goto Lbc
        Lf8:
            return r1
        Lf9:
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r5 = new com.google.android.exoplayer2.video.spherical.Projection$SubMesh
            r6 = r16
            r5.<init>(r6, r13, r0, r14)
            r3[r9] = r5
            int r9 = r9 + 1
            r0 = 32
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = 8
            goto L8f
        L10b:
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r0 = new com.google.android.exoplayer2.video.spherical.Projection$Mesh
            r0.<init>(r3)
            return r0
    }

    @androidx.annotation.Nullable
    private static java.util.ArrayList<com.google.android.exoplayer2.video.spherical.Projection.Mesh> parseMshp(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            int r0 = r4.readUnsignedByte()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 7
            r4.skipBytes(r0)
            int r0 = r4.readInt()
            r2 = 1684433976(0x64666c38, float:1.7002196E22)
            if (r0 != r2) goto L34
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r3 = 1
            r2.<init>(r3)
            boolean r4 = com.google.android.exoplayer2.util.Util.inflate(r4, r0, r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L2a
            r2.end()
            return r1
        L2a:
            r2.end()
            r4 = r0
            goto L3a
        L2f:
            r4 = move-exception
            r2.end()
            throw r4
        L34:
            r2 = 1918990112(0x72617720, float:4.465801E30)
            if (r0 == r2) goto L3a
            return r1
        L3a:
            java.util.ArrayList r4 = parseRawMshpData(r4)
            return r4
    }

    @androidx.annotation.Nullable
    private static java.util.ArrayList<com.google.android.exoplayer2.video.spherical.Projection.Mesh> parseProj(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r0 = 8
            r4.skipBytes(r0)
            int r0 = r4.getPosition()
            int r1 = r4.limit()
        Ld:
            r2 = 0
            if (r0 >= r1) goto L36
            int r3 = r4.readInt()
            int r3 = r3 + r0
            if (r3 <= r0) goto L36
            if (r3 <= r1) goto L1a
            goto L36
        L1a:
            int r0 = r4.readInt()
            r2 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r0 == r2) goto L2e
            r2 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r0 != r2) goto L29
            goto L2e
        L29:
            r4.setPosition(r3)
            r0 = r3
            goto Ld
        L2e:
            r4.setLimit(r3)
            java.util.ArrayList r4 = parseMshp(r4)
            return r4
        L36:
            return r2
    }

    @androidx.annotation.Nullable
    private static java.util.ArrayList<com.google.android.exoplayer2.video.spherical.Projection.Mesh> parseRawMshpData(com.google.android.exoplayer2.util.ParsableByteArray r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.getPosition()
            int r2 = r6.limit()
        Ld:
            if (r1 >= r2) goto L33
            int r3 = r6.readInt()
            int r3 = r3 + r1
            r4 = 0
            if (r3 <= r1) goto L32
            if (r3 <= r2) goto L1a
            goto L32
        L1a:
            int r1 = r6.readInt()
            r5 = 1835365224(0x6d657368, float:4.438224E27)
            if (r1 != r5) goto L2d
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r1 = parseMesh(r6)
            if (r1 != 0) goto L2a
            return r4
        L2a:
            r0.add(r1)
        L2d:
            r6.setPosition(r3)
            r1 = r3
            goto Ld
        L32:
            return r4
        L33:
            return r0
    }
}
