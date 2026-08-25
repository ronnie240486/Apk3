package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(17)
public final class EGLSurfaceTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = null;
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    private static final int EGL_SURFACE_HEIGHT = 1;
    private static final int EGL_SURFACE_WIDTH = 1;
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.util.EGLSurfaceTexture.TextureImageListener callback;

    @androidx.annotation.Nullable
    private android.opengl.EGLContext context;

    @androidx.annotation.Nullable
    private android.opengl.EGLDisplay display;
    private final android.os.Handler handler;

    @androidx.annotation.Nullable
    private android.opengl.EGLSurface surface;

    @androidx.annotation.Nullable
    private android.graphics.SurfaceTexture texture;
    private final int[] textureIdHolder;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface TextureImageListener {
        void onFrameAvailable();
    }

    static {
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344} // fill-array
            com.google.android.exoplayer2.util.EGLSurfaceTexture.EGL_CONFIG_ATTRIBUTES = r0
            return
    }

    public EGLSurfaceTexture(android.os.Handler r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public EGLSurfaceTexture(android.os.Handler r1, @androidx.annotation.Nullable com.google.android.exoplayer2.util.EGLSurfaceTexture.TextureImageListener r2) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            r0.callback = r2
            r1 = 1
            int[] r1 = new int[r1]
            r0.textureIdHolder = r1
            return
    }

    private static android.opengl.EGLConfig chooseEGLConfig(android.opengl.EGLDisplay r11) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 1
            android.opengl.EGLConfig[] r9 = new android.opengl.EGLConfig[r0]
            int[] r10 = new int[r0]
            int[] r2 = com.google.android.exoplayer2.util.EGLSurfaceTexture.EGL_CONFIG_ATTRIBUTES
            r3 = 0
            r5 = 0
            r6 = 1
            r8 = 0
            r1 = r11
            r4 = r9
            r7 = r10
            boolean r11 = android.opengl.EGL14.eglChooseConfig(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            if (r11 == 0) goto L1f
            r2 = r10[r1]
            if (r2 <= 0) goto L1f
            r2 = r9[r1]
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r3[r1] = r11
            r11 = r10[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r0] = r11
            r11 = 2
            r0 = r9[r1]
            r3[r11] = r0
            java.lang.String r11 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"
            java.lang.String r11 = com.google.android.exoplayer2.util.Util.formatInvariant(r11, r3)
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r2, r11)
            r11 = r9[r1]
            return r11
    }

    private static android.opengl.EGLContext createEGLContext(android.opengl.EGLDisplay r2, android.opengl.EGLConfig r3, int r4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            if (r4 != 0) goto L9
            r4 = 3
            int[] r4 = new int[r4]
            r4 = {x0020: FILL_ARRAY_DATA , data: [12440, 2, 12344} // fill-array
            goto Lf
        L9:
            r4 = 5
            int[] r4 = new int[r4]
            r4 = {x002a: FILL_ARRAY_DATA , data: [12440, 2, 12992, 1, 12344} // fill-array
        Lf:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r1 = 0
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglCreateContext(r2, r3, r0, r4, r1)
            if (r2 == 0) goto L19
            r1 = 1
        L19:
            java.lang.String r3 = "eglCreateContext failed"
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r1, r3)
            return r2
    }

    private static android.opengl.EGLSurface createEGLSurface(android.opengl.EGLDisplay r2, android.opengl.EGLConfig r3, android.opengl.EGLContext r4, int r5) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 1
            if (r5 != r0) goto L6
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            goto L24
        L6:
            r1 = 2
            if (r5 != r1) goto L10
            r5 = 7
            int[] r5 = new int[r5]
            r5 = {x002e: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12992, 1, 12344} // fill-array
            goto L16
        L10:
            r5 = 5
            int[] r5 = new int[r5]
            r5 = {x0040: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12344} // fill-array
        L16:
            r1 = 0
            android.opengl.EGLSurface r3 = android.opengl.EGL14.eglCreatePbufferSurface(r2, r3, r5, r1)
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.String r5 = "eglCreatePbufferSurface failed"
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r0, r5)
        L24:
            boolean r2 = android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4)
            java.lang.String r4 = "eglMakeCurrent failed"
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r2, r4)
            return r3
    }

    private void dispatchOnFrameAvailable() {
            r1 = this;
            com.google.android.exoplayer2.util.EGLSurfaceTexture$TextureImageListener r0 = r1.callback
            if (r0 == 0) goto L7
            r0.onFrameAvailable()
        L7:
            return
    }

    private static void generateTextureIds(int[] r2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r2, r1)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return
    }

    private static android.opengl.EGLDisplay getDefaultDisplay() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r2 = 1
            if (r1 == 0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            java.lang.String r4 = "eglGetDisplay failed"
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r3, r4)
            r3 = 2
            int[] r3 = new int[r3]
            boolean r0 = android.opengl.EGL14.eglInitialize(r1, r3, r0, r3, r2)
            java.lang.String r2 = "eglInitialize failed"
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r0, r2)
            return r1
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.texture
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            return r0
    }

    public void init(int r4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r3 = this;
            android.opengl.EGLDisplay r0 = getDefaultDisplay()
            r3.display = r0
            android.opengl.EGLConfig r0 = chooseEGLConfig(r0)
            android.opengl.EGLDisplay r1 = r3.display
            android.opengl.EGLContext r1 = createEGLContext(r1, r0, r4)
            r3.context = r1
            android.opengl.EGLDisplay r2 = r3.display
            android.opengl.EGLSurface r4 = createEGLSurface(r2, r0, r1, r4)
            r3.surface = r4
            int[] r4 = r3.textureIdHolder
            generateTextureIds(r4)
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            int[] r0 = r3.textureIdHolder
            r1 = 0
            r0 = r0[r1]
            r4.<init>(r0)
            r3.texture = r4
            r4.setOnFrameAvailableListener(r3)
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture r1) {
            r0 = this;
            android.os.Handler r1 = r0.handler
            r1.post(r0)
            return
    }

    public void release() {
            r6 = this;
            android.os.Handler r0 = r6.handler
            r0.removeCallbacks(r6)
            r0 = 19
            r1 = 0
            android.graphics.SurfaceTexture r2 = r6.texture     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L16
            r2.release()     // Catch: java.lang.Throwable -> L68
            r2 = 1
            int[] r3 = r6.textureIdHolder     // Catch: java.lang.Throwable -> L68
            r4 = 0
            android.opengl.GLES20.glDeleteTextures(r2, r3, r4)     // Catch: java.lang.Throwable -> L68
        L16:
            android.opengl.EGLDisplay r2 = r6.display
            if (r2 == 0) goto L2b
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            android.opengl.EGLDisplay r2 = r6.display
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r4 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4)
        L2b:
            android.opengl.EGLSurface r2 = r6.surface
            if (r2 == 0) goto L3e
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
            android.opengl.EGLDisplay r2 = r6.display
            android.opengl.EGLSurface r3 = r6.surface
            android.opengl.EGL14.eglDestroySurface(r2, r3)
        L3e:
            android.opengl.EGLContext r2 = r6.context
            if (r2 == 0) goto L47
            android.opengl.EGLDisplay r3 = r6.display
            android.opengl.EGL14.eglDestroyContext(r3, r2)
        L47:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r2 < r0) goto L4e
            android.opengl.EGL14.eglReleaseThread()
        L4e:
            android.opengl.EGLDisplay r0 = r6.display
            if (r0 == 0) goto L5f
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            android.opengl.EGLDisplay r0 = r6.display
            android.opengl.EGL14.eglTerminate(r0)
        L5f:
            r6.display = r1
            r6.context = r1
            r6.surface = r1
            r6.texture = r1
            return
        L68:
            r2 = move-exception
            android.opengl.EGLDisplay r3 = r6.display
            if (r3 == 0) goto L7e
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7e
            android.opengl.EGLDisplay r3 = r6.display
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r3, r4, r4, r5)
        L7e:
            android.opengl.EGLSurface r3 = r6.surface
            if (r3 == 0) goto L91
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L91
            android.opengl.EGLDisplay r3 = r6.display
            android.opengl.EGLSurface r4 = r6.surface
            android.opengl.EGL14.eglDestroySurface(r3, r4)
        L91:
            android.opengl.EGLContext r3 = r6.context
            if (r3 == 0) goto L9a
            android.opengl.EGLDisplay r4 = r6.display
            android.opengl.EGL14.eglDestroyContext(r4, r3)
        L9a:
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r3 < r0) goto La1
            android.opengl.EGL14.eglReleaseThread()
        La1:
            android.opengl.EGLDisplay r0 = r6.display
            if (r0 == 0) goto Lb2
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lb2
            android.opengl.EGLDisplay r0 = r6.display
            android.opengl.EGL14.eglTerminate(r0)
        Lb2:
            r6.display = r1
            r6.context = r1
            r6.surface = r1
            r6.texture = r1
            throw r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            r1.dispatchOnFrameAvailable()
            android.graphics.SurfaceTexture r0 = r1.texture
            if (r0 == 0) goto La
            r0.updateTexImage()     // Catch: java.lang.RuntimeException -> La
        La:
            return
    }
}
