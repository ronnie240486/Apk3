package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes2.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final com.google.android.exoplayer2.video.spherical.Projection.Mesh leftMesh;
    public final com.google.android.exoplayer2.video.spherical.Projection.Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Mesh {
        private final com.google.android.exoplayer2.video.spherical.Projection.SubMesh[] subMeshes;

        public Mesh(com.google.android.exoplayer2.video.spherical.Projection.SubMesh... r1) {
                r0 = this;
                r0.<init>()
                r0.subMeshes = r1
                return
        }

        public com.google.android.exoplayer2.video.spherical.Projection.SubMesh getSubMesh(int r2) {
                r1 = this;
                com.google.android.exoplayer2.video.spherical.Projection$SubMesh[] r0 = r1.subMeshes
                r2 = r0[r2]
                return r2
        }

        public int getSubMeshCount() {
                r1 = this;
                com.google.android.exoplayer2.video.spherical.Projection$SubMesh[] r0 = r1.subMeshes
                int r0 = r0.length
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int r7, float[] r8, float[] r9, int r10) {
                r6 = this;
                r6.<init>()
                r6.textureId = r7
                int r7 = r8.length
                long r0 = (long) r7
                r2 = 2
                long r0 = r0 * r2
                int r7 = r9.length
                long r2 = (long) r7
                r4 = 3
                long r2 = r2 * r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L17
                r7 = 1
                goto L18
            L17:
                r7 = 0
            L18:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
                r6.vertices = r8
                r6.textureCoords = r9
                r6.mode = r10
                return
        }

        public int getVertexCount() {
                r1 = this;
                float[] r0 = r1.vertices
                int r0 = r0.length
                int r0 = r0 / 3
                return r0
        }
    }

    public Projection(com.google.android.exoplayer2.video.spherical.Projection.Mesh r1, int r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    public Projection(com.google.android.exoplayer2.video.spherical.Projection.Mesh r1, com.google.android.exoplayer2.video.spherical.Projection.Mesh r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.leftMesh = r1
            r0.rightMesh = r2
            r0.stereoMode = r3
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.singleMesh = r1
            return
    }

    public static com.google.android.exoplayer2.video.spherical.Projection createEquirectangular(float r31, int r32, int r33, float r34, float r35, int r36) {
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = 0
            r7 = 1
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L12
            r8 = 1
            goto L13
        L12:
            r8 = 0
        L13:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
            if (r1 < r7) goto L1a
            r8 = 1
            goto L1b
        L1a:
            r8 = 0
        L1b:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
            if (r2 < r7) goto L22
            r8 = 1
            goto L23
        L22:
            r8 = 0
        L23:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L32
            r8 = 1127481344(0x43340000, float:180.0)
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 > 0) goto L32
            r8 = 1
            goto L33
        L32:
            r8 = 0
        L33:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L42
            r5 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L42
            r5 = 1
            goto L43
        L42:
            r5 = 0
        L43:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r5)
            double r8 = (double) r3
            double r8 = java.lang.Math.toRadians(r8)
            float r3 = (float) r8
            double r4 = (double) r4
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            float r5 = (float) r1
            float r5 = r3 / r5
            float r8 = (float) r2
            float r8 = r4 / r8
            int r9 = r2 + 1
            int r10 = r9 * 2
            r11 = 2
            int r10 = r10 + r11
            int r10 = r10 * r1
            int r12 = r10 * 3
            float[] r12 = new float[r12]
            int r10 = r10 * 2
            float[] r10 = new float[r10]
            r13 = 0
            r14 = 0
            r15 = 0
        L6b:
            if (r13 >= r1) goto L156
            float r6 = (float) r13
            float r6 = r6 * r5
            r16 = 1073741824(0x40000000, float:2.0)
            float r17 = r3 / r16
            float r6 = r6 - r17
            int r7 = r13 + 1
            float r11 = (float) r7
            float r11 = r11 * r5
            float r11 = r11 - r17
            r1 = 0
        L7e:
            if (r1 >= r9) goto L14c
            r35 = r6
            r17 = r7
            r6 = 0
        L85:
            r7 = 2
            if (r6 >= r7) goto L12a
            if (r6 != 0) goto L8f
            r7 = r35
            r18 = r9
            goto L92
        L8f:
            r18 = r9
            r7 = r11
        L92:
            float r9 = (float) r1
            float r9 = r9 * r8
            r19 = 1078530011(0x40490fdb, float:3.1415927)
            float r19 = r9 + r19
            float r20 = r4 / r16
            r21 = r8
            float r8 = r19 - r20
            int r19 = r14 + 1
            r20 = r1
            double r1 = (double) r0
            r22 = r5
            r23 = r6
            double r5 = (double) r8
            double r24 = java.lang.Math.sin(r5)
            double r24 = r24 * r1
            double r7 = (double) r7
            double r26 = java.lang.Math.cos(r7)
            r28 = r10
            r29 = r11
            double r10 = r26 * r24
            float r10 = (float) r10
            float r10 = -r10
            r12[r14] = r10
            int r10 = r19 + 1
            double r24 = java.lang.Math.sin(r7)
            r11 = r13
            double r13 = r24 * r1
            float r13 = (float) r13
            r12[r19] = r13
            int r13 = r10 + 1
            double r5 = java.lang.Math.cos(r5)
            double r5 = r5 * r1
            double r1 = java.lang.Math.cos(r7)
            double r1 = r1 * r5
            float r1 = (float) r1
            r12[r10] = r1
            int r1 = r15 + 1
            float r9 = r9 / r4
            r28[r15] = r9
            int r2 = r1 + 1
            int r5 = r11 + r23
            float r5 = (float) r5
            float r5 = r5 * r22
            float r5 = r5 / r3
            r28[r1] = r5
            if (r20 != 0) goto Lf7
            if (r23 == 0) goto Lf0
            goto Lf7
        Lf0:
            r1 = r33
            r5 = r20
            r6 = r23
            goto L102
        Lf7:
            r1 = r33
            r5 = r20
            r6 = r23
            if (r5 != r1) goto L115
            r7 = 1
            if (r6 != r7) goto L115
        L102:
            int r7 = r13 + (-3)
            r8 = 3
            java.lang.System.arraycopy(r12, r7, r12, r13, r8)
            int r13 = r13 + 3
            int r7 = r2 + (-2)
            r8 = r28
            r9 = 2
            java.lang.System.arraycopy(r8, r7, r8, r2, r9)
            int r2 = r2 + 2
            goto L118
        L115:
            r8 = r28
            r9 = 2
        L118:
            r15 = r2
            r14 = r13
            int r6 = r6 + 1
            r2 = r1
            r1 = r5
            r10 = r8
            r13 = r11
            r9 = r18
            r8 = r21
            r5 = r22
            r11 = r29
            goto L85
        L12a:
            r22 = r5
            r21 = r8
            r18 = r9
            r8 = r10
            r29 = r11
            r11 = r13
            r9 = 2
            r5 = r1
            r1 = r2
            int r2 = r5 + 1
            r6 = r35
            r7 = r17
            r9 = r18
            r8 = r21
            r5 = r22
            r11 = r29
            r30 = r2
            r2 = r1
            r1 = r30
            goto L7e
        L14c:
            r17 = r7
            r1 = r32
            r13 = r17
            r7 = 1
            r11 = 2
            goto L6b
        L156:
            r8 = r10
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r0 = new com.google.android.exoplayer2.video.spherical.Projection$SubMesh
            r1 = 0
            r2 = 1
            r0.<init>(r1, r12, r8, r2)
            com.google.android.exoplayer2.video.spherical.Projection r3 = new com.google.android.exoplayer2.video.spherical.Projection
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r4 = new com.google.android.exoplayer2.video.spherical.Projection$Mesh
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh[] r2 = new com.google.android.exoplayer2.video.spherical.Projection.SubMesh[r2]
            r2[r1] = r0
            r4.<init>(r2)
            r0 = r36
            r3.<init>(r4, r0)
            return r3
    }

    public static com.google.android.exoplayer2.video.spherical.Projection createEquirectangular(int r6) {
            r0 = 1112014848(0x42480000, float:50.0)
            r1 = 36
            r2 = 72
            r3 = 1127481344(0x43340000, float:180.0)
            r4 = 1135869952(0x43b40000, float:360.0)
            r5 = r6
            com.google.android.exoplayer2.video.spherical.Projection r6 = createEquirectangular(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
