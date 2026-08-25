package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class GlUtil {
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = null;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = null;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = null;
    private static final java.lang.String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final java.lang.String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final java.lang.String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static final class Api17 {
        private Api17() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay r4, int r5, int[] r6) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r0 = 3
                int[] r0 = new int[r0]
                r1 = 12440(0x3098, float:1.7432E-41)
                r2 = 0
                r0[r2] = r1
                r1 = 1
                r0[r1] = r5
                r1 = 2
                r3 = 12344(0x3038, float:1.7298E-41)
                r0[r1] = r3
                android.opengl.EGLConfig r6 = getEglConfig(r4, r6)
                android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
                android.opengl.EGLContext r6 = android.opengl.EGL14.eglCreateContext(r4, r6, r1, r0, r2)
                if (r6 == 0) goto L20
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                return r6
            L20:
                android.opengl.EGL14.eglTerminate(r4)
                com.google.android.exoplayer2.util.GlUtil$GlException r4 = new com.google.android.exoplayer2.util.GlUtil$GlException
                java.lang.String r6 = "eglCreateContext() failed to create a valid context. The device may not support EGL version "
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5)
                r4.<init>(r5)
                throw r4
        }

        @androidx.annotation.DoNotInline
        public static android.opengl.EGLDisplay createEglDisplay() throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r0 = 0
                android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
                android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r2 = r1.equals(r2)
                r3 = 1
                r2 = r2 ^ r3
                java.lang.String r4 = "No EGL display."
                com.google.android.exoplayer2.util.GlUtil.checkGlException(r2, r4)
                int[] r2 = new int[r3]
                int[] r3 = new int[r3]
                boolean r0 = android.opengl.EGL14.eglInitialize(r1, r2, r0, r3, r0)
                java.lang.String r2 = "Error in eglInitialize."
                com.google.android.exoplayer2.util.GlUtil.checkGlException(r0, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                return r1
        }

        @androidx.annotation.DoNotInline
        public static android.opengl.EGLSurface createEglPbufferSurface(android.opengl.EGLDisplay r1, int[] r2, int[] r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                android.opengl.EGLConfig r2 = getEglConfig(r1, r2)
                r0 = 0
                android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r2, r3, r0)
                java.lang.String r2 = "Error creating surface"
                com.google.android.exoplayer2.util.GlUtil.access$000(r2)
                return r1
        }

        @androidx.annotation.DoNotInline
        public static void destroyEglContext(@androidx.annotation.Nullable android.opengl.EGLDisplay r2, @androidx.annotation.Nullable android.opengl.EGLContext r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                if (r2 != 0) goto L3
                return
            L3:
                android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
                android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
                android.opengl.EGL14.eglMakeCurrent(r2, r0, r0, r1)
                java.lang.String r0 = "Error releasing context"
                com.google.android.exoplayer2.util.GlUtil.access$000(r0)
                if (r3 == 0) goto L19
                android.opengl.EGL14.eglDestroyContext(r2, r3)
                java.lang.String r3 = "Error destroying context"
                com.google.android.exoplayer2.util.GlUtil.access$000(r3)
            L19:
                android.opengl.EGL14.eglReleaseThread()
                java.lang.String r3 = "Error releasing thread"
                com.google.android.exoplayer2.util.GlUtil.access$000(r3)
                android.opengl.EGL14.eglTerminate(r2)
                java.lang.String r2 = "Error terminating display"
                com.google.android.exoplayer2.util.GlUtil.access$000(r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static void focusFramebufferUsingCurrentContext(int r3, int r4, int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
                android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "No current context"
                com.google.android.exoplayer2.util.GlUtil.checkGlException(r0, r2)
                int[] r0 = new int[r1]
                r1 = 36006(0x8ca6, float:5.0455E-41)
                r2 = 0
                android.opengl.GLES20.glGetIntegerv(r1, r0, r2)
                r0 = r0[r2]
                if (r0 == r3) goto L24
                r0 = 36160(0x8d40, float:5.0671E-41)
                android.opengl.GLES20.glBindFramebuffer(r0, r3)
            L24:
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                android.opengl.GLES20.glViewport(r2, r2, r4, r5)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                return
        }

        @androidx.annotation.DoNotInline
        public static void focusRenderTarget(android.opengl.EGLDisplay r0, android.opengl.EGLContext r1, android.opengl.EGLSurface r2, int r3, int r4, int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                android.opengl.EGL14.eglMakeCurrent(r0, r2, r2, r1)
                java.lang.String r0 = "Error making context current"
                com.google.android.exoplayer2.util.GlUtil.access$000(r0)
                focusFramebufferUsingCurrentContext(r3, r4, r5)
                return
        }

        @androidx.annotation.DoNotInline
        private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay r10, int[] r11) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r0 = 1
                android.opengl.EGLConfig[] r9 = new android.opengl.EGLConfig[r0]
                int[] r7 = new int[r0]
                r3 = 0
                r5 = 0
                r6 = 1
                r8 = 0
                r1 = r10
                r2 = r11
                r4 = r9
                boolean r10 = android.opengl.EGL14.eglChooseConfig(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r10 == 0) goto L16
                r10 = 0
                r10 = r9[r10]
                return r10
            L16:
                com.google.android.exoplayer2.util.GlUtil$GlException r10 = new com.google.android.exoplayer2.util.GlUtil$GlException
                java.lang.String r11 = "eglChooseConfig failed."
                r10.<init>(r11)
                throw r10
        }

        @androidx.annotation.DoNotInline
        public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay r1, java.lang.Object r2, int[] r3, int[] r4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                android.opengl.EGLConfig r3 = getEglConfig(r1, r3)
                r0 = 0
                android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreateWindowSurface(r1, r3, r2, r4, r0)
                java.lang.String r2 = "Error creating surface"
                com.google.android.exoplayer2.util.GlUtil.access$000(r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class GlException extends java.lang.Exception {
        public GlException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 15
            int[] r1 = new int[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344} // fill-array
            com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888 = r1
            int[] r0 = new int[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344} // fill-array
            com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 12344(0x3038, float:1.7298E-41)
            r0[r1] = r2
            com.google.android.exoplayer2.util.GlUtil.EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = r0
            return
    }

    private GlUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(java.lang.String r0) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            checkEglException(r0)
            return
    }

    private static void assertValidTextureSize(int r4, int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 3379(0xd33, float:4.735E-42)
            r3 = 0
            android.opengl.GLES20.glGetIntegerv(r2, r1, r3)
            r1 = r1[r3]
            if (r1 <= 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r2 = "Create a OpenGL context first or run the GL methods on an OpenGL thread."
            com.google.android.exoplayer2.util.Assertions.checkState(r0, r2)
            if (r4 < 0) goto L2a
            if (r5 < 0) goto L2a
            if (r4 > r1) goto L1d
            if (r5 > r1) goto L1d
            return
        L1d:
            com.google.android.exoplayer2.util.GlUtil$GlException r4 = new com.google.android.exoplayer2.util.GlUtil$GlException
            java.lang.String r5 = "width or height is greater than GL_MAX_TEXTURE_SIZE "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r1)
            r4.<init>(r5)
            throw r4
        L2a:
            com.google.android.exoplayer2.util.GlUtil$GlException r4 = new com.google.android.exoplayer2.util.GlUtil$GlException
            java.lang.String r5 = "width or height is less than 0"
            r4.<init>(r5)
            throw r4
    }

    public static void bindTexture(int r1, int r2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.GLES20.glBindTexture(r1, r2)
            checkGlError()
            r2 = 10240(0x2800, float:1.4349E-41)
            r0 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r0)
            checkGlError()
            r2 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r0)
            checkGlError()
            r2 = 10242(0x2802, float:1.4352E-41)
            r0 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r0)
            checkGlError()
            r2 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r0)
            checkGlError()
            return
    }

    private static void checkEglException(java.lang.String r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int r0 = android.opengl.EGL14.eglGetError()
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ", error code: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            checkGlException(r1, r3)
            return
    }

    public static void checkGlError() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = android.opengl.GLES20.glGetError()
            if (r2 == 0) goto L21
            if (r1 == 0) goto L13
            r1 = 10
            r0.append(r1)
        L13:
            java.lang.String r1 = "glError: "
            r0.append(r1)
            java.lang.String r1 = android.opengl.GLU.gluErrorString(r2)
            r0.append(r1)
            r1 = 1
            goto L6
        L21:
            if (r1 != 0) goto L24
            return
        L24:
            com.google.android.exoplayer2.util.GlUtil$GlException r1 = new com.google.android.exoplayer2.util.GlUtil$GlException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static void checkGlException(boolean r0, java.lang.String r1) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.android.exoplayer2.util.GlUtil$GlException r0 = new com.google.android.exoplayer2.util.GlUtil$GlException
            r0.<init>(r1)
            throw r0
    }

    public static void clearOutputFrame() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)
            checkGlError()
            return
    }

    public static float[] create4x4IdentityMatrix() {
            r0 = 16
            float[] r0 = new float[r0]
            setToIdentity(r0)
            return r0
    }

    private static java.nio.FloatBuffer createBuffer(int r1) {
            int r1 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r0)
            java.nio.FloatBuffer r1 = r1.asFloatBuffer()
            return r1
    }

    public static java.nio.FloatBuffer createBuffer(float[] r1) {
            int r0 = r1.length
            java.nio.FloatBuffer r0 = createBuffer(r0)
            java.nio.FloatBuffer r1 = r0.put(r1)
            java.nio.Buffer r1 = r1.flip()
            java.nio.FloatBuffer r1 = (java.nio.FloatBuffer) r1
            return r1
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay r1) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888
            android.opengl.EGLContext r1 = createEglContext(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay r1, int[] r2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 != 0) goto L13
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_1010102
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_1010102
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L21
            r0 = 3
            goto L22
        L21:
            r0 = 2
        L22:
            android.opengl.EGLContext r1 = com.google.android.exoplayer2.util.GlUtil.Api17.createEglContext(r1, r0, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLDisplay createEglDisplay() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLDisplay r0 = com.google.android.exoplayer2.util.GlUtil.Api17.createEglDisplay()
            return r0
    }

    public static int createExternalTexture() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int r0 = generateTexture()
            r1 = 36197(0x8d65, float:5.0723E-41)
            bindTexture(r1, r0)
            return r0
    }

    public static int createFboForTexture(int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "No current context"
            checkGlException(r0, r2)
            int[] r0 = new int[r1]
            r2 = 0
            android.opengl.GLES20.glGenFramebuffers(r1, r0, r2)
            checkGlError()
            r1 = r0[r2]
            r3 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r3, r1)
            checkGlError()
            r1 = 36064(0x8ce0, float:5.0536E-41)
            r4 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glFramebufferTexture2D(r3, r1, r4, r5, r2)
            checkGlError()
            r5 = r0[r2]
            return r5
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext r2, android.opengl.EGLDisplay r3, int[] r4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            boolean r0 = isSurfacelessContextExtensionSupported()
            r1 = 1
            if (r0 == 0) goto La
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
            goto Le
        La:
            android.opengl.EGLSurface r4 = createPbufferSurface(r3, r1, r1, r4)
        Le:
            focusEglSurface(r3, r2, r4, r1, r1)
            return r4
    }

    @androidx.annotation.RequiresApi(17)
    private static android.opengl.EGLSurface createPbufferSurface(android.opengl.EGLDisplay r3, int r4, int r5, int[] r6) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 5
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 12375(0x3057, float:1.7341E-41)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            r4 = 2
            r1 = 12374(0x3056, float:1.734E-41)
            r0[r4] = r1
            r4 = 3
            r0[r4] = r5
            r4 = 4
            r5 = 12344(0x3038, float:1.7298E-41)
            r0[r4] = r5
            android.opengl.EGLSurface r3 = com.google.android.exoplayer2.util.GlUtil.Api17.createEglPbufferSurface(r3, r6, r0)
            return r3
    }

    private static int createTexture(int r11, int r12, int r13, int r14) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            assertValidTextureSize(r11, r12)
            int r0 = generateTexture()
            r1 = 3553(0xde1, float:4.979E-42)
            bindTexture(r1, r0)
            int r1 = r11 * r12
            int r1 = r1 * 4
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r1)
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = 0
            r7 = 0
            r8 = 6408(0x1908, float:8.98E-42)
            r4 = r13
            r5 = r11
            r6 = r12
            r9 = r14
            android.opengl.GLES20.glTexImage2D(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            checkGlError()
            return r0
    }

    public static int createTexture(int r1, int r2, boolean r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            if (r3 == 0) goto L1a
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 18
            if (r3 < r0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            java.lang.String r0 = "GLES30 extensions are not supported below API 18."
            com.google.android.exoplayer2.util.Assertions.checkState(r3, r0)
            r3 = 34842(0x881a, float:4.8824E-41)
            r0 = 5131(0x140b, float:7.19E-42)
            int r1 = createTexture(r1, r2, r3, r0)
            return r1
        L1a:
            r3 = 6408(0x1908, float:8.98E-42)
            r0 = 5121(0x1401, float:7.176E-42)
            int r1 = createTexture(r1, r2, r3, r0)
            return r1
    }

    public static float[] createVertexBuffer(java.util.List<float[]> r6) {
            int r0 = r6.size()
            r1 = 4
            int r0 = r0 * 4
            float[] r0 = new float[r0]
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r6.size()
            if (r3 >= r4) goto L1d
            java.lang.Object r4 = r6.get(r3)
            int r5 = r3 * 4
            java.lang.System.arraycopy(r4, r2, r0, r5, r1)
            int r3 = r3 + 1
            goto Lb
        L1d:
            return r0
    }

    public static void deleteTexture(int r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r3
            android.opengl.GLES20.glDeleteTextures(r0, r1, r2)
            checkGlError()
            return
    }

    @androidx.annotation.RequiresApi(17)
    public static void destroyEglContext(@androidx.annotation.Nullable android.opengl.EGLDisplay r0, @androidx.annotation.Nullable android.opengl.EGLContext r1) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            com.google.android.exoplayer2.util.GlUtil.Api17.destroyEglContext(r0, r1)
            return
    }

    @androidx.annotation.RequiresApi(17)
    public static void focusEglSurface(android.opengl.EGLDisplay r6, android.opengl.EGLContext r7, android.opengl.EGLSurface r8, int r9, int r10) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            com.google.android.exoplayer2.util.GlUtil.Api17.focusRenderTarget(r0, r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(17)
    public static void focusFramebuffer(android.opengl.EGLDisplay r0, android.opengl.EGLContext r1, android.opengl.EGLSurface r2, int r3, int r4, int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            com.google.android.exoplayer2.util.GlUtil.Api17.focusRenderTarget(r0, r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(17)
    public static void focusFramebufferUsingCurrentContext(int r0, int r1, int r2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            com.google.android.exoplayer2.util.GlUtil.Api17.focusFramebufferUsingCurrentContext(r0, r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLSurface focusPlaceholderEglSurface(android.opengl.EGLContext r1, android.opengl.EGLDisplay r2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888
            android.opengl.EGLSurface r1 = createFocusedPlaceholderEglSurface(r1, r2, r0)
            return r1
    }

    private static int generateTexture() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "No current context"
            checkGlException(r0, r2)
            int[] r0 = new int[r1]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r1, r0, r2)
            checkGlError()
            r0 = r0[r2]
            return r0
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay r2, java.lang.Object r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888
            int[] r1 = com.google.android.exoplayer2.util.GlUtil.EGL_WINDOW_SURFACE_ATTRIBUTES_NONE
            android.opengl.EGLSurface r2 = com.google.android.exoplayer2.util.GlUtil.Api17.getEglSurface(r2, r3, r0, r1)
            return r2
    }

    @androidx.annotation.RequiresApi(17)
    public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay r1, java.lang.Object r2, int[] r3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int[] r0 = com.google.android.exoplayer2.util.GlUtil.EGL_WINDOW_SURFACE_ATTRIBUTES_NONE
            android.opengl.EGLSurface r1 = com.google.android.exoplayer2.util.GlUtil.Api17.getEglSurface(r1, r2, r3, r0)
            return r1
    }

    public static float[] getNormalizedCoordinateBounds() {
            r0 = 16
            float[] r0 = new float[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 0, 1065353216, 1065353216, -1082130432, 0, 1065353216, -1082130432, 1065353216, 0, 1065353216, 1065353216, 1065353216, 0, 1065353216} // fill-array
            return r0
    }

    public static float[] getTextureCoordinateBounds() {
            r0 = 16
            float[] r0 = new float[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 0, 0, 1065353216, 1065353216, 0, 0, 1065353216, 0, 1065353216, 0, 1065353216, 1065353216, 1065353216, 0, 1065353216} // fill-array
            return r0
    }

    public static boolean isProtectedContentExtensionSupported(android.content.Context r5) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L8
            return r1
        L8:
            r2 = 26
            if (r0 >= r2) goto L22
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r4 = "samsung"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L21
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r4 = "XT1650"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L22
        L21:
            return r1
        L22:
            if (r0 >= r2) goto L31
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r0)
            if (r5 != 0) goto L31
            return r1
        L31:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r1)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r0)
            if (r5 == 0) goto L46
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L46
            r1 = 1
        L46:
            return r1
    }

    public static boolean isSurfacelessContextExtensionSupported() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 >= r2) goto L8
            return r1
        L8:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r1)
            r2 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r2)
            if (r0 == 0) goto L1d
            java.lang.String r2 = "EGL_KHR_surfaceless_context"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public static boolean isYuvTargetExtensionSupported() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 >= r2) goto L8
            return r1
        L8:
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            r2 = 7939(0x1f03, float:1.1125E-41)
            if (r0 == 0) goto L2a
            android.opengl.EGLDisplay r0 = createEglDisplay()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L29
            android.opengl.EGLContext r3 = createEglContext(r0)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L29
            focusPlaceholderEglSurface(r3, r0)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L29
            java.lang.String r2 = android.opengl.GLES20.glGetString(r2)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L29
            destroyEglContext(r0, r3)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L29
            goto L2e
        L29:
            return r1
        L2a:
            java.lang.String r2 = android.opengl.GLES20.glGetString(r2)
        L2e:
            if (r2 == 0) goto L39
            java.lang.String r0 = "GL_EXT_YUV_target"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L39
            r1 = 1
        L39:
            return r1
    }

    public static void setToIdentity(float[] r1) {
            r0 = 0
            android.opengl.Matrix.setIdentityM(r1, r0)
            return
    }
}
