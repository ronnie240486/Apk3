package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends android.opengl.GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final android.os.Handler mainHandler;
    private final com.google.android.exoplayer2.video.spherical.OrientationListener orientationListener;

    @androidx.annotation.Nullable
    private final android.hardware.Sensor orientationSensor;
    private final com.google.android.exoplayer2.video.spherical.SceneRenderer scene;
    private final android.hardware.SensorManager sensorManager;

    @androidx.annotation.Nullable
    private android.view.Surface surface;

    @androidx.annotation.Nullable
    private android.graphics.SurfaceTexture surfaceTexture;
    private final com.google.android.exoplayer2.video.spherical.TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> videoSurfaceListeners;

    @androidx.annotation.VisibleForTesting
    public final class Renderer implements android.opengl.GLSurfaceView.Renderer, com.google.android.exoplayer2.video.spherical.TouchTracker.Listener, com.google.android.exoplayer2.video.spherical.OrientationListener.Listener {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final float[] projectionMatrix;
        private final com.google.android.exoplayer2.video.spherical.SceneRenderer scene;
        private final float[] tempMatrix;
        public final /* synthetic */ com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView this$0;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] viewMatrix;
        private final float[] viewProjectionMatrix;

        public Renderer(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r5, com.google.android.exoplayer2.video.spherical.SceneRenderer r6) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                r5 = 16
                float[] r0 = new float[r5]
                r4.projectionMatrix = r0
                float[] r0 = new float[r5]
                r4.viewProjectionMatrix = r0
                float[] r0 = new float[r5]
                r4.deviceOrientationMatrix = r0
                float[] r1 = new float[r5]
                r4.touchPitchMatrix = r1
                float[] r2 = new float[r5]
                r4.touchYawMatrix = r2
                float[] r3 = new float[r5]
                r4.viewMatrix = r3
                float[] r5 = new float[r5]
                r4.tempMatrix = r5
                r4.scene = r6
                com.google.android.exoplayer2.util.GlUtil.setToIdentity(r0)
                com.google.android.exoplayer2.util.GlUtil.setToIdentity(r1)
                com.google.android.exoplayer2.util.GlUtil.setToIdentity(r2)
                r5 = 1078530011(0x40490fdb, float:3.1415927)
                r4.deviceRoll = r5
                return
        }

        private float calculateFieldOfViewInYDirection(float r5) {
                r4 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto L28
                r0 = 4631530004285489152(0x4046800000000000, double:45.0)
                double r0 = java.lang.Math.toRadians(r0)
                double r0 = java.lang.Math.tan(r0)
                double r2 = (double) r5
                double r0 = r0 / r2
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 * r2
                float r5 = (float) r0
                return r5
            L28:
                r5 = 1119092736(0x42b40000, float:90.0)
                return r5
        }

        @androidx.annotation.AnyThread
        private void updatePitchMatrix() {
                r6 = this;
                float[] r0 = r6.touchPitchMatrix
                float r1 = r6.touchPitch
                float r2 = -r1
                float r1 = r6.deviceRoll
                double r3 = (double) r1
                double r3 = java.lang.Math.cos(r3)
                float r3 = (float) r3
                float r1 = r6.deviceRoll
                double r4 = (double) r1
                double r4 = java.lang.Math.sin(r4)
                float r4 = (float) r4
                r1 = 0
                r5 = 0
                android.opengl.Matrix.setRotateM(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r13) {
                r12 = this;
                monitor-enter(r12)
                float[] r0 = r12.tempMatrix     // Catch: java.lang.Throwable -> L2e
                r1 = 0
                float[] r2 = r12.deviceOrientationMatrix     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                float[] r4 = r12.touchYawMatrix     // Catch: java.lang.Throwable -> L2e
                r5 = 0
                android.opengl.Matrix.multiplyMM(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2e
                float[] r6 = r12.viewMatrix     // Catch: java.lang.Throwable -> L2e
                r7 = 0
                float[] r8 = r12.touchPitchMatrix     // Catch: java.lang.Throwable -> L2e
                r9 = 0
                float[] r10 = r12.tempMatrix     // Catch: java.lang.Throwable -> L2e
                r11 = 0
                android.opengl.Matrix.multiplyMM(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L2e
                float[] r0 = r12.viewProjectionMatrix
                r1 = 0
                float[] r2 = r12.projectionMatrix
                r3 = 0
                float[] r4 = r12.viewMatrix
                r5 = 0
                android.opengl.Matrix.multiplyMM(r0, r1, r2, r3, r4, r5)
                com.google.android.exoplayer2.video.spherical.SceneRenderer r13 = r12.scene
                float[] r0 = r12.viewProjectionMatrix
                r13.drawFrame(r0, r1)
                return
            L2e:
                r13 = move-exception
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L2e
                throw r13
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        @androidx.annotation.BinderThread
        public synchronized void onOrientationChange(float[] r4, float r5) {
                r3 = this;
                monitor-enter(r3)
                float[] r0 = r3.deviceOrientationMatrix     // Catch: java.lang.Throwable -> L10
                int r1 = r0.length     // Catch: java.lang.Throwable -> L10
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)     // Catch: java.lang.Throwable -> L10
                float r4 = -r5
                r3.deviceRoll = r4     // Catch: java.lang.Throwable -> L10
                r3.updatePitchMatrix()     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)
                return
            L10:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @androidx.annotation.UiThread
        public synchronized void onScrollChange(android.graphics.PointF r8) {
                r7 = this;
                monitor-enter(r7)
                float r0 = r8.y     // Catch: java.lang.Throwable -> L17
                r7.touchPitch = r0     // Catch: java.lang.Throwable -> L17
                r7.updatePitchMatrix()     // Catch: java.lang.Throwable -> L17
                float[] r1 = r7.touchYawMatrix     // Catch: java.lang.Throwable -> L17
                r2 = 0
                float r8 = r8.x     // Catch: java.lang.Throwable -> L17
                float r3 = -r8
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                android.opengl.Matrix.setRotateM(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L17
                monitor-exit(r7)
                return
            L17:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @androidx.annotation.UiThread
        public boolean onSingleTapUp(android.view.MotionEvent r1) {
                r0 = this;
                com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r1 = r0.this$0
                boolean r1 = r1.performClick()
                return r1
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r7, int r8, int r9) {
                r6 = this;
                r7 = 0
                android.opengl.GLES20.glViewport(r7, r7, r8, r9)
                float r7 = (float) r8
                float r8 = (float) r9
                float r3 = r7 / r8
                float r2 = r6.calculateFieldOfViewInYDirection(r3)
                float[] r0 = r6.projectionMatrix
                r1 = 0
                r4 = 1036831949(0x3dcccccd, float:0.1)
                r5 = 1120403456(0x42c80000, float:100.0)
                android.opengl.Matrix.perspectiveM(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r1, javax.microedition.khronos.egl.EGLConfig r2) {
                r0 = this;
                monitor-enter(r0)
                com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r1 = r0.this$0     // Catch: java.lang.Throwable -> Le
                com.google.android.exoplayer2.video.spherical.SceneRenderer r2 = r0.scene     // Catch: java.lang.Throwable -> Le
                android.graphics.SurfaceTexture r2 = r2.init()     // Catch: java.lang.Throwable -> Le
                com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.access$000(r1, r2)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)
                return
            Le:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(android.view.Surface r1);

        void onVideoSurfaceDestroyed(android.view.Surface r1);
    }

    public static /* synthetic */ void $r8$lambda$UBzzr65Zo1XPkIEBcqr2dbWk4y4(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0, android.graphics.SurfaceTexture r1) {
            r0.lambda$onSurfaceTextureAvailable$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$UfBR3e5C5rYBioPdx5p65nBUCbA(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0) {
            r0.lambda$onDetachedFromWindow$0()
            return
    }

    public SphericalGLSurfaceView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SphericalGLSurfaceView(android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>()
            r5.videoSurfaceListeners = r7
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            r5.mainHandler = r7
            java.lang.String r7 = "sensor"
            java.lang.Object r7 = r6.getSystemService(r7)
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            android.hardware.SensorManager r7 = (android.hardware.SensorManager) r7
            r5.sensorManager = r7
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto L31
            r0 = 15
            android.hardware.Sensor r0 = r7.getDefaultSensor(r0)
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 != 0) goto L3a
            r0 = 11
            android.hardware.Sensor r0 = r7.getDefaultSensor(r0)
        L3a:
            r5.orientationSensor = r0
            com.google.android.exoplayer2.video.spherical.SceneRenderer r7 = new com.google.android.exoplayer2.video.spherical.SceneRenderer
            r7.<init>()
            r5.scene = r7
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$Renderer r0 = new com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$Renderer
            r0.<init>(r5, r7)
            com.google.android.exoplayer2.video.spherical.TouchTracker r7 = new com.google.android.exoplayer2.video.spherical.TouchTracker
            r1 = 1103626240(0x41c80000, float:25.0)
            r7.<init>(r6, r0, r1)
            r5.touchTracker = r7
            java.lang.String r1 = "window"
            java.lang.Object r6 = r6.getSystemService(r1)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            com.google.android.exoplayer2.video.spherical.OrientationListener r1 = new com.google.android.exoplayer2.video.spherical.OrientationListener
            r2 = 2
            com.google.android.exoplayer2.video.spherical.OrientationListener$Listener[] r3 = new com.google.android.exoplayer2.video.spherical.OrientationListener.Listener[r2]
            r4 = 0
            r3[r4] = r7
            r4 = 1
            r3[r4] = r0
            r1.<init>(r6, r3)
            r5.orientationListener = r1
            r5.useSensorRotation = r4
            r5.setEGLContextClientVersion(r2)
            r5.setRenderer(r0)
            r5.setOnTouchListener(r7)
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0, android.graphics.SurfaceTexture r1) {
            r0.onSurfaceTextureAvailable(r1)
            return
    }

    private /* synthetic */ void lambda$onDetachedFromWindow$0() {
            r3 = this;
            android.view.Surface r0 = r3.surface
            if (r0 == 0) goto L1a
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener> r1 = r3.videoSurfaceListeners
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener r2 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener) r2
            r2.onVideoSurfaceDestroyed(r0)
            goto La
        L1a:
            android.graphics.SurfaceTexture r1 = r3.surfaceTexture
            releaseSurface(r1, r0)
            r0 = 0
            r3.surfaceTexture = r0
            r3.surface = r0
            return
    }

    private /* synthetic */ void lambda$onSurfaceTextureAvailable$1(android.graphics.SurfaceTexture r5) {
            r4 = this;
            android.graphics.SurfaceTexture r0 = r4.surfaceTexture
            android.view.Surface r1 = r4.surface
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r5)
            r4.surfaceTexture = r5
            r4.surface = r2
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener> r5 = r4.videoSurfaceListeners
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r5.next()
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener r3 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener) r3
            r3.onVideoSurfaceCreated(r2)
            goto L13
        L23:
            releaseSurface(r0, r1)
            return
    }

    private void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4) {
            r3 = this;
            android.os.Handler r0 = r3.mainHandler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
            r2 = 13
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    private static void releaseSurface(@androidx.annotation.Nullable android.graphics.SurfaceTexture r0, @androidx.annotation.Nullable android.view.Surface r1) {
            if (r0 == 0) goto L5
            r0.release()
        L5:
            if (r1 == 0) goto La
            r1.release()
        La:
            return
    }

    private void updateOrientationListenerRegistration() {
            r5 = this;
            boolean r0 = r5.useSensorRotation
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r0 = r5.isStarted
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.hardware.Sensor r2 = r5.orientationSensor
            if (r2 == 0) goto L28
            boolean r3 = r5.isOrientationListenerRegistered
            if (r0 != r3) goto L15
            goto L28
        L15:
            if (r0 == 0) goto L1f
            android.hardware.SensorManager r3 = r5.sensorManager
            com.google.android.exoplayer2.video.spherical.OrientationListener r4 = r5.orientationListener
            r3.registerListener(r4, r2, r1)
            goto L26
        L1f:
            android.hardware.SensorManager r1 = r5.sensorManager
            com.google.android.exoplayer2.video.spherical.OrientationListener r2 = r5.orientationListener
            r1.unregisterListener(r2)
        L26:
            r5.isOrientationListenerRegistered = r0
        L28:
            return
    }

    public void addVideoSurfaceListener(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener> r0 = r1.videoSurfaceListeners
            r0.add(r2)
            return
    }

    public com.google.android.exoplayer2.video.spherical.CameraMotionListener getCameraMotionListener() {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.SceneRenderer r0 = r1.scene
            return r0
    }

    public com.google.android.exoplayer2.video.VideoFrameMetadataListener getVideoFrameMetadataListener() {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.SceneRenderer r0 = r1.scene
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.Surface getVideoSurface() {
            r1 = this;
            android.view.Surface r0 = r1.surface
            return r0
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.os.Handler r0 = r2.mainHandler
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
            r1 = this;
            r0 = 0
            r1.isStarted = r0
            r1.updateOrientationListenerRegistration()
            super.onPause()
            return
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
            r1 = this;
            super.onResume()
            r0 = 1
            r1.isStarted = r0
            r1.updateOrientationListenerRegistration()
            return
    }

    public void removeVideoSurfaceListener(com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$VideoSurfaceListener> r0 = r1.videoSurfaceListeners
            r0.remove(r2)
            return
    }

    public void setDefaultStereoMode(int r2) {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.SceneRenderer r0 = r1.scene
            r0.setDefaultStereoMode(r2)
            return
    }

    public void setUseSensorRotation(boolean r1) {
            r0 = this;
            r0.useSensorRotation = r1
            r0.updateOrientationListenerRegistration()
            return
    }
}
