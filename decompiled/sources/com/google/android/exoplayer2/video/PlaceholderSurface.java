package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(17)
public final class PlaceholderSurface extends android.view.Surface {
    private static final java.lang.String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final com.google.android.exoplayer2.video.PlaceholderSurface.PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.PlaceholderSurface$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class PlaceholderSurfaceThread extends android.os.HandlerThread implements android.os.Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private com.google.android.exoplayer2.util.EGLSurfaceTexture eglSurfaceTexture;
        private android.os.Handler handler;

        @androidx.annotation.Nullable
        private java.lang.Error initError;

        @androidx.annotation.Nullable
        private java.lang.RuntimeException initException;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.PlaceholderSurface surface;

        public PlaceholderSurfaceThread() {
                r1 = this;
                java.lang.String r0 = "ExoPlayer:PlaceholderSurface"
                r1.<init>(r0)
                return
        }

        private void initInternal(int r4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r3 = this;
                com.google.android.exoplayer2.util.EGLSurfaceTexture r0 = r3.eglSurfaceTexture
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.util.EGLSurfaceTexture r0 = r3.eglSurfaceTexture
                r0.init(r4)
                com.google.android.exoplayer2.video.PlaceholderSurface r0 = new com.google.android.exoplayer2.video.PlaceholderSurface
                com.google.android.exoplayer2.util.EGLSurfaceTexture r1 = r3.eglSurfaceTexture
                android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()
                if (r4 == 0) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                r2 = 0
                r0.<init>(r3, r1, r4, r2)
                r3.surface = r0
                return
        }

        private void releaseInternal() {
                r1 = this;
                com.google.android.exoplayer2.util.EGLSurfaceTexture r0 = r1.eglSurfaceTexture
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.util.EGLSurfaceTexture r0 = r1.eglSurfaceTexture
                r0.release()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L1f
                r4 = 2
                if (r0 == r4) goto L9
                return r1
            L9:
                r3.releaseInternal()     // Catch: java.lang.Throwable -> L10
            Lc:
                r3.quit()
                goto L19
            L10:
                r4 = move-exception
                java.lang.String r0 = "PlaceholderSurface"
                java.lang.String r2 = "Failed to release placeholder surface"
                com.google.android.exoplayer2.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L1a
                goto Lc
            L19:
                return r1
            L1a:
                r4 = move-exception
                r3.quit()
                throw r4
            L1f:
                int r4 = r4.arg1     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f com.google.android.exoplayer2.util.GlUtil.GlException -> L42 java.lang.RuntimeException -> L5a
                r3.initInternal(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f com.google.android.exoplayer2.util.GlUtil.GlException -> L42 java.lang.RuntimeException -> L5a
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                goto L69
            L2a:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                throw r4
            L2d:
                r4 = move-exception
                goto L6d
            L2f:
                r4 = move-exception
                java.lang.String r0 = "PlaceholderSurface"
                java.lang.String r2 = "Failed to initialize placeholder surface"
                com.google.android.exoplayer2.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.initError = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
                goto L69
            L3f:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
                throw r4
            L42:
                r4 = move-exception
                java.lang.String r0 = "PlaceholderSurface"
                java.lang.String r2 = "Failed to initialize placeholder surface"
                com.google.android.exoplayer2.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L2d
                r3.initException = r0     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L57
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
                goto L69
            L57:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
                throw r4
            L5a:
                r4 = move-exception
                java.lang.String r0 = "PlaceholderSurface"
                java.lang.String r2 = "Failed to initialize placeholder surface"
                com.google.android.exoplayer2.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.initException = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L6a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            L69:
                return r1
            L6a:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
                throw r4
            L6d:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L73
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
                throw r4
            L73:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
                throw r4
        }

        public com.google.android.exoplayer2.video.PlaceholderSurface init(int r4) {
                r3 = this;
                r3.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = r3.getLooper()
                r0.<init>(r1, r3)
                r3.handler = r0
                com.google.android.exoplayer2.util.EGLSurfaceTexture r1 = new com.google.android.exoplayer2.util.EGLSurfaceTexture
                r1.<init>(r0)
                r3.eglSurfaceTexture = r1
                monitor-enter(r3)
                android.os.Handler r0 = r3.handler     // Catch: java.lang.Throwable -> L50
                r1 = 1
                r2 = 0
                android.os.Message r4 = r0.obtainMessage(r1, r4, r2)     // Catch: java.lang.Throwable -> L50
                r4.sendToTarget()     // Catch: java.lang.Throwable -> L50
            L21:
                com.google.android.exoplayer2.video.PlaceholderSurface r4 = r3.surface     // Catch: java.lang.Throwable -> L50
                if (r4 != 0) goto L33
                java.lang.RuntimeException r4 = r3.initException     // Catch: java.lang.Throwable -> L50
                if (r4 != 0) goto L33
                java.lang.Error r4 = r3.initError     // Catch: java.lang.Throwable -> L50
                if (r4 != 0) goto L33
                r3.wait()     // Catch: java.lang.InterruptedException -> L31 java.lang.Throwable -> L50
                goto L21
            L31:
                r2 = 1
                goto L21
            L33:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
                if (r2 == 0) goto L3d
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                r4.interrupt()
            L3d:
                java.lang.RuntimeException r4 = r3.initException
                if (r4 != 0) goto L4f
                java.lang.Error r4 = r3.initError
                if (r4 != 0) goto L4e
                com.google.android.exoplayer2.video.PlaceholderSurface r4 = r3.surface
                java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                com.google.android.exoplayer2.video.PlaceholderSurface r4 = (com.google.android.exoplayer2.video.PlaceholderSurface) r4
                return r4
            L4e:
                throw r4
            L4f:
                throw r4
            L50:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
                throw r4
        }

        public void release() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                android.os.Handler r0 = r2.handler
                r1 = 2
                r0.sendEmptyMessage(r1)
                return
        }
    }

    private PlaceholderSurface(com.google.android.exoplayer2.video.PlaceholderSurface.PlaceholderSurfaceThread r1, android.graphics.SurfaceTexture r2, boolean r3) {
            r0 = this;
            r0.<init>(r2)
            r0.thread = r1
            r0.secure = r3
            return
    }

    public /* synthetic */ PlaceholderSurface(com.google.android.exoplayer2.video.PlaceholderSurface.PlaceholderSurfaceThread r1, android.graphics.SurfaceTexture r2, boolean r3, com.google.android.exoplayer2.video.PlaceholderSurface.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static int getSecureMode(android.content.Context r0) {
            boolean r0 = com.google.android.exoplayer2.util.GlUtil.isProtectedContentExtensionSupported(r0)
            if (r0 == 0) goto L10
            boolean r0 = com.google.android.exoplayer2.util.GlUtil.isSurfacelessContextExtensionSupported()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 2
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static synchronized boolean isSecureSupported(android.content.Context r3) {
            java.lang.Class<com.google.android.exoplayer2.video.PlaceholderSurface> r0 = com.google.android.exoplayer2.video.PlaceholderSurface.class
            monitor-enter(r0)
            boolean r1 = com.google.android.exoplayer2.video.PlaceholderSurface.secureModeInitialized     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r1 != 0) goto L10
            int r3 = getSecureMode(r3)     // Catch: java.lang.Throwable -> L18
            com.google.android.exoplayer2.video.PlaceholderSurface.secureMode = r3     // Catch: java.lang.Throwable -> L18
            com.google.android.exoplayer2.video.PlaceholderSurface.secureModeInitialized = r2     // Catch: java.lang.Throwable -> L18
        L10:
            int r3 = com.google.android.exoplayer2.video.PlaceholderSurface.secureMode     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            monitor-exit(r0)
            return r2
        L18:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static com.google.android.exoplayer2.video.PlaceholderSurface newInstanceV17(android.content.Context r1, boolean r2) {
            r0 = 0
            if (r2 == 0) goto Lc
            boolean r1 = isSecureSupported(r1)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            com.google.android.exoplayer2.video.PlaceholderSurface$PlaceholderSurfaceThread r1 = new com.google.android.exoplayer2.video.PlaceholderSurface$PlaceholderSurfaceThread
            r1.<init>()
            if (r2 == 0) goto L19
            int r0 = com.google.android.exoplayer2.video.PlaceholderSurface.secureMode
        L19:
            com.google.android.exoplayer2.video.PlaceholderSurface r1 = r1.init(r0)
            return r1
    }

    @Override // android.view.Surface
    public void release() {
            r2 = this;
            super.release()
            com.google.android.exoplayer2.video.PlaceholderSurface$PlaceholderSurfaceThread r0 = r2.thread
            monitor-enter(r0)
            boolean r1 = r2.threadReleased     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.google.android.exoplayer2.video.PlaceholderSurface$PlaceholderSurfaceThread r1 = r2.thread     // Catch: java.lang.Throwable -> L14
            r1.release()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2.threadReleased = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }
}
