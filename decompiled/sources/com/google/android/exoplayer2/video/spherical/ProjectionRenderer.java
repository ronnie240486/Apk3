package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes2.dex */
final class ProjectionRenderer {
    private static final java.lang.String FRAGMENT_SHADER = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    private static final java.lang.String TAG = "ProjectionRenderer";
    private static final float[] TEX_MATRIX_BOTTOM = null;
    private static final float[] TEX_MATRIX_LEFT = null;
    private static final float[] TEX_MATRIX_RIGHT = null;
    private static final float[] TEX_MATRIX_TOP = null;
    private static final float[] TEX_MATRIX_WHOLE = null;
    private static final java.lang.String VERTEX_SHADER = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData leftMeshData;
    private int mvpMatrixHandle;
    private int positionHandle;
    private com.google.android.exoplayer2.util.GlProgram program;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData rightMeshData;
    private int stereoMode;
    private int texCoordsHandle;
    private int textureHandle;
    private int uTexMatrixHandle;

    public static class MeshData {
        private final int drawMode;
        private final java.nio.FloatBuffer textureBuffer;
        private final java.nio.FloatBuffer vertexBuffer;
        private final int vertexCount;

        public MeshData(com.google.android.exoplayer2.video.spherical.Projection.SubMesh r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.getVertexCount()
                r1.vertexCount = r0
                float[] r0 = r2.vertices
                java.nio.FloatBuffer r0 = com.google.android.exoplayer2.util.GlUtil.createBuffer(r0)
                r1.vertexBuffer = r0
                float[] r0 = r2.textureCoords
                java.nio.FloatBuffer r0 = com.google.android.exoplayer2.util.GlUtil.createBuffer(r0)
                r1.textureBuffer = r0
                int r2 = r2.mode
                r0 = 1
                if (r2 == r0) goto L29
                r0 = 2
                if (r2 == r0) goto L25
                r2 = 4
                r1.drawMode = r2
                goto L2c
            L25:
                r2 = 6
                r1.drawMode = r2
                goto L2c
            L29:
                r2 = 5
                r1.drawMode = r2
            L2c:
                return
        }

        public static /* synthetic */ java.nio.FloatBuffer access$000(com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData r0) {
                java.nio.FloatBuffer r0 = r0.vertexBuffer
                return r0
        }

        public static /* synthetic */ java.nio.FloatBuffer access$100(com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData r0) {
                java.nio.FloatBuffer r0 = r0.textureBuffer
                return r0
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData r0) {
                int r0 = r0.drawMode
                return r0
        }

        public static /* synthetic */ int access$300(com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData r0) {
                int r0 = r0.vertexCount
                return r0
        }
    }

    static {
            r0 = 9
            float[] r1 = new float[r0]
            r1 = {x0026: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1082130432, 0, 0, 1065353216, 1065353216} // fill-array
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_WHOLE = r1
            float[] r1 = new float[r0]
            r1 = {x003c: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1090519040, 0, 0, 1056964608, 1065353216} // fill-array
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_TOP = r1
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1090519040, 0, 0, 1065353216, 1065353216} // fill-array
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_BOTTOM = r1
            float[] r1 = new float[r0]
            r1 = {x0068: FILL_ARRAY_DATA , data: [1056964608, 0, 0, 0, -1082130432, 0, 0, 1065353216, 1065353216} // fill-array
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_LEFT = r1
            float[] r0 = new float[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [1056964608, 0, 0, 0, -1082130432, 0, 1056964608, 1065353216, 1065353216} // fill-array
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_RIGHT = r0
            return
    }

    public ProjectionRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isSupported(com.google.android.exoplayer2.video.spherical.Projection r4) {
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r0 = r4.leftMesh
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r4 = r4.rightMesh
            int r1 = r0.getSubMeshCount()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L23
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r0 = r0.getSubMesh(r2)
            int r0 = r0.textureId
            if (r0 != 0) goto L23
            int r0 = r4.getSubMeshCount()
            if (r0 != r3) goto L23
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r4 = r4.getSubMesh(r2)
            int r4 = r4.textureId
            if (r4 != 0) goto L23
            r2 = 1
        L23:
            return r2
    }

    public void draw(int r12, float[] r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = "ProjectionRenderer"
            if (r14 == 0) goto L7
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData r1 = r11.rightMeshData
            goto L9
        L7:
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData r1 = r11.leftMeshData
        L9:
            if (r1 != 0) goto Lc
            return
        Lc:
            int r2 = r11.stereoMode
            r3 = 1
            if (r2 != r3) goto L19
            if (r14 == 0) goto L16
            float[] r14 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_BOTTOM
            goto L26
        L16:
            float[] r14 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_TOP
            goto L26
        L19:
            r4 = 2
            if (r2 != r4) goto L24
            if (r14 == 0) goto L21
            float[] r14 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_RIGHT
            goto L26
        L21:
            float[] r14 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_LEFT
            goto L26
        L24:
            float[] r14 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.TEX_MATRIX_WHOLE
        L26:
            int r2 = r11.uTexMatrixHandle
            r4 = 0
            android.opengl.GLES20.glUniformMatrix3fv(r2, r3, r4, r14, r4)
            int r14 = r11.mvpMatrixHandle
            android.opengl.GLES20.glUniformMatrix4fv(r14, r3, r4, r13, r4)
            r13 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r13)
            r13 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r13, r12)
            int r12 = r11.textureHandle
            android.opengl.GLES20.glUniform1i(r12, r4)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L46
            goto L4c
        L46:
            r12 = move-exception
            java.lang.String r13 = "Failed to bind uniforms"
            android.util.Log.e(r0, r13, r12)
        L4c:
            int r5 = r11.positionHandle
            r6 = 3
            r7 = 5126(0x1406, float:7.183E-42)
            r8 = 0
            r9 = 12
            java.nio.FloatBuffer r10 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData.access$000(r1)
            android.opengl.GLES20.glVertexAttribPointer(r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L5f
            goto L65
        L5f:
            r12 = move-exception
            java.lang.String r13 = "Failed to load position data"
            android.util.Log.e(r0, r13, r12)
        L65:
            int r5 = r11.texCoordsHandle
            r6 = 2
            r7 = 5126(0x1406, float:7.183E-42)
            r8 = 0
            r9 = 8
            java.nio.FloatBuffer r10 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData.access$100(r1)
            android.opengl.GLES20.glVertexAttribPointer(r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L78
            goto L7e
        L78:
            r12 = move-exception
            java.lang.String r13 = "Failed to load texture data"
            android.util.Log.e(r0, r13, r12)
        L7e:
            int r12 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData.access$200(r1)
            int r13 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData.access$300(r1)
            android.opengl.GLES20.glDrawArrays(r12, r4, r13)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L8d
            goto L93
        L8d:
            r12 = move-exception
            java.lang.String r13 = "Failed to render"
            android.util.Log.e(r0, r13, r12)
        L93:
            return
    }

    public void init() {
            r3 = this;
            com.google.android.exoplayer2.util.GlProgram r0 = new com.google.android.exoplayer2.util.GlProgram     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"
            java.lang.String r2 = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"
            r0.<init>(r1, r2)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.program = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "uMvpMatrix"
            int r0 = r0.getUniformLocation(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.mvpMatrixHandle = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            com.google.android.exoplayer2.util.GlProgram r0 = r3.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "uTexMatrix"
            int r0 = r0.getUniformLocation(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.uTexMatrixHandle = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            com.google.android.exoplayer2.util.GlProgram r0 = r3.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "aPosition"
            int r0 = r0.getAttributeArrayLocationAndEnable(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.positionHandle = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            com.google.android.exoplayer2.util.GlProgram r0 = r3.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "aTexCoords"
            int r0 = r0.getAttributeArrayLocationAndEnable(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.texCoordsHandle = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            com.google.android.exoplayer2.util.GlProgram r0 = r3.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            java.lang.String r1 = "uTexture"
            int r0 = r0.getUniformLocation(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            r3.textureHandle = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L40
            goto L48
        L40:
            r0 = move-exception
            java.lang.String r1 = "ProjectionRenderer"
            java.lang.String r2 = "Failed to initialize the program"
            android.util.Log.e(r1, r2, r0)
        L48:
            return
    }

    public void setProjection(com.google.android.exoplayer2.video.spherical.Projection r4) {
            r3 = this;
            boolean r0 = isSupported(r4)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r4.stereoMode
            r3.stereoMode = r0
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData r0 = new com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r1 = r4.leftMesh
            r2 = 0
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r1 = r1.getSubMesh(r2)
            r0.<init>(r1)
            r3.leftMeshData = r0
            boolean r1 = r4.singleMesh
            if (r1 == 0) goto L1e
            goto L29
        L1e:
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData r0 = new com.google.android.exoplayer2.video.spherical.ProjectionRenderer$MeshData
            com.google.android.exoplayer2.video.spherical.Projection$Mesh r4 = r4.rightMesh
            com.google.android.exoplayer2.video.spherical.Projection$SubMesh r4 = r4.getSubMesh(r2)
            r0.<init>(r4)
        L29:
            r3.rightMeshData = r0
            return
    }

    public void shutdown() {
            r3 = this;
            com.google.android.exoplayer2.util.GlProgram r0 = r3.program
            if (r0 == 0) goto L10
            r0.delete()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L8
            goto L10
        L8:
            r0 = move-exception
            java.lang.String r1 = "ProjectionRenderer"
            java.lang.String r2 = "Failed to delete the shader program"
            android.util.Log.e(r1, r2, r0)
        L10:
            return
    }
}
