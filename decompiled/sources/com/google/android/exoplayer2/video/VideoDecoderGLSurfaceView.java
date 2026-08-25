package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends android.opengl.GLSurfaceView implements com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer {
    private static final java.lang.String TAG = "VideoDecoderGLSV";
    private final com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer renderer;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Renderer implements android.opengl.GLSurfaceView.Renderer {
        private static final java.lang.String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        private static final java.lang.String[] TEXTURE_UNIFORMS = null;
        private static final java.nio.FloatBuffer TEXTURE_VERTICES = null;
        private static final java.lang.String VERTEX_SHADER = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        private static final float[] kColorConversion2020 = null;
        private static final float[] kColorConversion601 = null;
        private static final float[] kColorConversion709 = null;
        private int colorMatrixLocation;
        private final java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> pendingOutputBufferReference;
        private final int[] previousStrides;
        private final int[] previousWidths;
        private com.google.android.exoplayer2.util.GlProgram program;
        private com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer renderedOutputBuffer;
        private final android.opengl.GLSurfaceView surfaceView;
        private final int[] texLocations;
        private final java.nio.FloatBuffer[] textureCoords;
        private final int[] yuvTextures;

        static {
                r0 = 9
                float[] r1 = new float[r0]
                r1 = {x0034: FILL_ARRAY_DATA , data: [1066728948, 1066728948, 1066728948, 0, -1094142919, 1073813127, 1070352826, -1085267771, 0} // fill-array
                com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion601 = r1
                float[] r1 = new float[r0]
                r1 = {x004a: FILL_ARRAY_DATA , data: [1066728948, 1066728948, 1066728948, 0, -1101390676, 1074211586, 1072005382, -1089965392, 0} // fill-array
                com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion709 = r1
                float[] r0 = new float[r0]
                r0 = {x0060: FILL_ARRAY_DATA , data: [1066762502, 1066762502, 1066762502, 0, -1103068398, 1074362581, 1071082635, -1087968903, 0} // fill-array
                com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion2020 = r0
                java.lang.String r0 = "y_tex"
                java.lang.String r1 = "u_tex"
                java.lang.String r2 = "v_tex"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
                com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.TEXTURE_UNIFORMS = r0
                r0 = 8
                float[] r0 = new float[r0]
                r0 = {x0076: FILL_ARRAY_DATA , data: [-1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216, -1082130432} // fill-array
                java.nio.FloatBuffer r0 = com.google.android.exoplayer2.util.GlUtil.createBuffer(r0)
                com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.TEXTURE_VERTICES = r0
                return
        }

        public Renderer(android.opengl.GLSurfaceView r5) {
                r4 = this;
                r4.<init>()
                r4.surfaceView = r5
                r5 = 3
                int[] r0 = new int[r5]
                r4.yuvTextures = r0
                int[] r0 = new int[r5]
                r4.texLocations = r0
                int[] r0 = new int[r5]
                r4.previousWidths = r0
                int[] r0 = new int[r5]
                r4.previousStrides = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r4.pendingOutputBufferReference = r0
                java.nio.FloatBuffer[] r0 = new java.nio.FloatBuffer[r5]
                r4.textureCoords = r0
                r0 = 0
            L22:
                if (r0 >= r5) goto L30
                int[] r1 = r4.previousWidths
                int[] r2 = r4.previousStrides
                r3 = -1
                r2[r0] = r3
                r1[r0] = r3
                int r0 = r0 + 1
                goto L22
            L30:
                return
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"program"})
        private void setupTextures() {
                r4 = this;
                int[] r0 = r4.yuvTextures     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                r1 = 0
                r2 = 3
                android.opengl.GLES20.glGenTextures(r2, r0, r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
            L7:
                if (r1 >= r2) goto L29
                com.google.android.exoplayer2.util.GlProgram r0 = r4.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                java.lang.String[] r3 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.TEXTURE_UNIFORMS     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                r3 = r3[r1]     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                int r0 = r0.getUniformLocation(r3)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                android.opengl.GLES20.glUniform1i(r0, r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                r0 = 33984(0x84c0, float:4.7622E-41)
                int r0 = r0 + r1
                android.opengl.GLES20.glActiveTexture(r0)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                r0 = 3553(0xde1, float:4.979E-42)
                int[] r3 = r4.yuvTextures     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                r3 = r3[r1]     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                com.google.android.exoplayer2.util.GlUtil.bindTexture(r0, r3)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                int r1 = r1 + 1
                goto L7
            L29:
                com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2d
                goto L35
            L2d:
                r0 = move-exception
                java.lang.String r1 = "VideoDecoderGLSV"
                java.lang.String r2 = "Failed to set up the textures"
                android.util.Log.e(r1, r2, r0)
            L35:
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r19) {
                r18 = this;
                r1 = r18
                java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> r0 = r1.pendingOutputBufferReference
                r2 = 0
                java.lang.Object r0 = r0.getAndSet(r2)
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = (com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer) r0
                if (r0 != 0) goto L12
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2 = r1.renderedOutputBuffer
                if (r2 != 0) goto L12
                return
            L12:
                if (r0 == 0) goto L1d
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2 = r1.renderedOutputBuffer
                if (r2 == 0) goto L1b
                r2.release()
            L1b:
                r1.renderedOutputBuffer = r0
            L1d:
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r1.renderedOutputBuffer
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = (com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer) r0
                float[] r2 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion709
                int r3 = r0.colorspace
                r4 = 3
                r5 = 1
                if (r3 == r5) goto L33
                if (r3 == r4) goto L30
                goto L35
            L30:
                float[] r2 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion2020
                goto L35
            L33:
                float[] r2 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.kColorConversion601
            L35:
                int r3 = r1.colorMatrixLocation
                r6 = 0
                android.opengl.GLES20.glUniformMatrix3fv(r3, r5, r6, r2, r6)
                int[] r2 = r0.yuvStrides
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                int[] r2 = (int[]) r2
                java.nio.ByteBuffer[] r3 = r0.yuvPlanes
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.nio.ByteBuffer[] r3 = (java.nio.ByteBuffer[]) r3
                r7 = 0
            L4c:
                r8 = 2
                if (r7 >= r4) goto L83
                if (r7 != 0) goto L54
                int r8 = r0.height
                goto L59
            L54:
                int r9 = r0.height
                int r9 = r9 + r5
                int r8 = r9 / 2
            L59:
                r13 = r8
                r8 = 33984(0x84c0, float:4.7622E-41)
                int r8 = r8 + r7
                android.opengl.GLES20.glActiveTexture(r8)
                r8 = 3553(0xde1, float:4.979E-42)
                int[] r9 = r1.yuvTextures
                r9 = r9[r7]
                android.opengl.GLES20.glBindTexture(r8, r9)
                r8 = 3317(0xcf5, float:4.648E-42)
                android.opengl.GLES20.glPixelStorei(r8, r5)
                r9 = 3553(0xde1, float:4.979E-42)
                r10 = 0
                r11 = 6409(0x1909, float:8.981E-42)
                r12 = r2[r7]
                r14 = 0
                r15 = 6409(0x1909, float:8.981E-42)
                r16 = 5121(0x1401, float:7.176E-42)
                r17 = r3[r7]
                android.opengl.GLES20.glTexImage2D(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                int r7 = r7 + 1
                goto L4c
            L83:
                int[] r3 = new int[r4]
                int r0 = r0.width
                r3[r6] = r0
                r0 = r3[r6]
                int r0 = r0 + r5
                int r0 = r0 / r8
                r3[r8] = r0
                r3[r5] = r0
                r0 = 0
            L92:
                r7 = 4
                r9 = 5
                if (r0 >= r4) goto Lf7
                int[] r10 = r1.previousWidths
                r10 = r10[r0]
                r11 = r3[r0]
                if (r10 != r11) goto La6
                int[] r10 = r1.previousStrides
                r10 = r10[r0]
                r11 = r2[r0]
                if (r10 == r11) goto Lf4
            La6:
                r10 = r2[r0]
                if (r10 == 0) goto Lac
                r10 = 1
                goto Lad
            Lac:
                r10 = 0
            Lad:
                com.google.android.exoplayer2.util.Assertions.checkState(r10)
                r10 = r3[r0]
                float r10 = (float) r10
                r11 = r2[r0]
                float r11 = (float) r11
                float r10 = r10 / r11
                java.nio.FloatBuffer[] r11 = r1.textureCoords
                r12 = 8
                float[] r12 = new float[r12]
                r13 = 0
                r12[r6] = r13
                r12[r5] = r13
                r12[r8] = r13
                r14 = 1065353216(0x3f800000, float:1.0)
                r12[r4] = r14
                r12[r7] = r10
                r12[r9] = r13
                r7 = 6
                r12[r7] = r10
                r7 = 7
                r12[r7] = r14
                java.nio.FloatBuffer r7 = com.google.android.exoplayer2.util.GlUtil.createBuffer(r12)
                r11[r0] = r7
                int[] r7 = r1.texLocations
                r9 = r7[r0]
                r10 = 2
                r11 = 5126(0x1406, float:7.183E-42)
                r12 = 0
                r13 = 0
                java.nio.FloatBuffer[] r7 = r1.textureCoords
                r14 = r7[r0]
                android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
                int[] r7 = r1.previousWidths
                r9 = r3[r0]
                r7[r0] = r9
                int[] r7 = r1.previousStrides
                r9 = r2[r0]
                r7[r0] = r9
            Lf4:
                int r0 = r0 + 1
                goto L92
            Lf7:
                r0 = 16384(0x4000, float:2.2959E-41)
                android.opengl.GLES20.glClear(r0)
                android.opengl.GLES20.glDrawArrays(r9, r6, r7)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L103
                goto L10c
            L103:
                r0 = move-exception
                r2 = r0
                java.lang.String r0 = "VideoDecoderGLSV"
                java.lang.String r3 = "Failed to draw a frame"
                android.util.Log.e(r0, r3, r2)
            L10c:
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r1, int r2, int r3) {
                r0 = this;
                r1 = 0
                android.opengl.GLES20.glViewport(r1, r1, r2, r3)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r7, javax.microedition.khronos.egl.EGLConfig r8) {
                r6 = this;
                com.google.android.exoplayer2.util.GlProgram r7 = new com.google.android.exoplayer2.util.GlProgram     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r8 = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n"
                java.lang.String r0 = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n"
                r7.<init>(r8, r0)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r6.program = r7     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r8 = "in_pos"
                int r0 = r7.getAttributeArrayLocationAndEnable(r8)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r1 = 2
                r2 = 5126(0x1406, float:7.183E-42)
                r3 = 0
                r4 = 0
                java.nio.FloatBuffer r5 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.Renderer.TEXTURE_VERTICES     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                int[] r7 = r6.texLocations     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r8 = 0
                com.google.android.exoplayer2.util.GlProgram r0 = r6.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r1 = "in_tc_y"
                int r0 = r0.getAttributeArrayLocationAndEnable(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r7[r8] = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                int[] r7 = r6.texLocations     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r8 = 1
                com.google.android.exoplayer2.util.GlProgram r0 = r6.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r1 = "in_tc_u"
                int r0 = r0.getAttributeArrayLocationAndEnable(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r7[r8] = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                int[] r7 = r6.texLocations     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r8 = 2
                com.google.android.exoplayer2.util.GlProgram r0 = r6.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r1 = "in_tc_v"
                int r0 = r0.getAttributeArrayLocationAndEnable(r1)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r7[r8] = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                com.google.android.exoplayer2.util.GlProgram r7 = r6.program     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                java.lang.String r8 = "mColorConversion"
                int r7 = r7.getUniformLocation(r8)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r6.colorMatrixLocation = r7     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                r6.setupTextures()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L58
                goto L60
            L58:
                r7 = move-exception
                java.lang.String r8 = "VideoDecoderGLSV"
                java.lang.String r0 = "Failed to set up the textures and program"
                android.util.Log.e(r8, r0, r7)
            L60:
                return
        }

        public void setOutputBuffer(com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer> r0 = r1.pendingOutputBufferReference
                java.lang.Object r2 = r0.getAndSet(r2)
                com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2 = (com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer) r2
                if (r2 == 0) goto Ld
                r2.release()
            Ld:
                android.opengl.GLSurfaceView r2 = r1.surfaceView
                r2.requestRender()
                return
        }
    }

    public VideoDecoderGLSurfaceView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public VideoDecoderGLSurfaceView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$Renderer r1 = new com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$Renderer
            r1.<init>(r0)
            r0.renderer = r1
            r2 = 1
            r0.setPreserveEGLContextOnPause(r2)
            r2 = 2
            r0.setEGLContextClientVersion(r2)
            r0.setRenderer(r1)
            r1 = 0
            r0.setRenderMode(r1)
            return
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r2) {
            r1 = this;
            com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$Renderer r0 = r1.renderer
            r0.setOutputBuffer(r2)
            return
    }
}
