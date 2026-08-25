package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes2.dex */
final class SceneRenderer implements com.google.android.exoplayer2.video.VideoFrameMetadataListener, com.google.android.exoplayer2.video.spherical.CameraMotionListener {
    private static final java.lang.String TAG = "SceneRenderer";
    private volatile int defaultStereoMode;
    private final java.util.concurrent.atomic.AtomicBoolean frameAvailable;
    private final com.google.android.exoplayer2.video.spherical.FrameRotationQueue frameRotationQueue;

    @androidx.annotation.Nullable
    private byte[] lastProjectionData;
    private int lastStereoMode;
    private final com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.video.spherical.Projection> projectionQueue;
    private final com.google.android.exoplayer2.video.spherical.ProjectionRenderer projectionRenderer;
    private final java.util.concurrent.atomic.AtomicBoolean resetRotationAtNextFrame;
    private final float[] rotationMatrix;
    private final com.google.android.exoplayer2.util.TimedValueQueue<java.lang.Long> sampleTimestampQueue;
    private android.graphics.SurfaceTexture surfaceTexture;
    private final float[] tempMatrix;
    private int textureId;

    public static /* synthetic */ void $r8$lambda$_DXYx5AUskH1JbhOOBU0nDoBYVw(com.google.android.exoplayer2.video.spherical.SceneRenderer r0, android.graphics.SurfaceTexture r1) {
            r0.lambda$init$0(r1)
            return
    }

    public SceneRenderer() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.frameAvailable = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.resetRotationAtNextFrame = r0
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer r0 = new com.google.android.exoplayer2.video.spherical.ProjectionRenderer
            r0.<init>()
            r2.projectionRenderer = r0
            com.google.android.exoplayer2.video.spherical.FrameRotationQueue r0 = new com.google.android.exoplayer2.video.spherical.FrameRotationQueue
            r0.<init>()
            r2.frameRotationQueue = r0
            com.google.android.exoplayer2.util.TimedValueQueue r0 = new com.google.android.exoplayer2.util.TimedValueQueue
            r0.<init>()
            r2.sampleTimestampQueue = r0
            com.google.android.exoplayer2.util.TimedValueQueue r0 = new com.google.android.exoplayer2.util.TimedValueQueue
            r0.<init>()
            r2.projectionQueue = r0
            r0 = 16
            float[] r1 = new float[r0]
            r2.rotationMatrix = r1
            float[] r0 = new float[r0]
            r2.tempMatrix = r0
            r0 = 0
            r2.defaultStereoMode = r0
            r0 = -1
            r2.lastStereoMode = r0
            return
    }

    private /* synthetic */ void lambda$init$0(android.graphics.SurfaceTexture r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.frameAvailable
            r0 = 1
            r2.set(r0)
            return
    }

    private void setProjection(@androidx.annotation.Nullable byte[] r3, int r4, long r5) {
            r2 = this;
            byte[] r0 = r2.lastProjectionData
            int r1 = r2.lastStereoMode
            r2.lastProjectionData = r3
            r3 = -1
            if (r4 != r3) goto Lb
            int r4 = r2.defaultStereoMode
        Lb:
            r2.lastStereoMode = r4
            if (r1 != r4) goto L18
            byte[] r3 = r2.lastProjectionData
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L18
            return
        L18:
            r3 = 0
            byte[] r4 = r2.lastProjectionData
            if (r4 == 0) goto L23
            int r3 = r2.lastStereoMode
            com.google.android.exoplayer2.video.spherical.Projection r3 = com.google.android.exoplayer2.video.spherical.ProjectionDecoder.decode(r4, r3)
        L23:
            if (r3 == 0) goto L2c
            boolean r4 = com.google.android.exoplayer2.video.spherical.ProjectionRenderer.isSupported(r3)
            if (r4 == 0) goto L2c
            goto L32
        L2c:
            int r3 = r2.lastStereoMode
            com.google.android.exoplayer2.video.spherical.Projection r3 = com.google.android.exoplayer2.video.spherical.Projection.createEquirectangular(r3)
        L32:
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.video.spherical.Projection> r4 = r2.projectionQueue
            r4.add(r5, r3)
            return
    }

    public void drawFrame(float[] r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "Failed to draw a frame"
            java.lang.String r1 = "SceneRenderer"
            r2 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r2)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> Ld
            goto L11
        Ld:
            r2 = move-exception
            com.google.android.exoplayer2.util.Log.e(r1, r0, r2)
        L11:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.frameAvailable
            r3 = 1
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L65
            android.graphics.SurfaceTexture r2 = r8.surfaceTexture
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.graphics.SurfaceTexture r2 = (android.graphics.SurfaceTexture) r2
            r2.updateTexImage()
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            com.google.android.exoplayer2.util.Log.e(r1, r0, r2)
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.resetRotationAtNextFrame
            boolean r0 = r0.compareAndSet(r3, r4)
            if (r0 == 0) goto L3b
            float[] r0 = r8.rotationMatrix
            com.google.android.exoplayer2.util.GlUtil.setToIdentity(r0)
        L3b:
            android.graphics.SurfaceTexture r0 = r8.surfaceTexture
            long r0 = r0.getTimestamp()
            com.google.android.exoplayer2.util.TimedValueQueue<java.lang.Long> r2 = r8.sampleTimestampQueue
            java.lang.Object r2 = r2.poll(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L56
            com.google.android.exoplayer2.video.spherical.FrameRotationQueue r3 = r8.frameRotationQueue
            float[] r4 = r8.rotationMatrix
            long r5 = r2.longValue()
            r3.pollRotationMatrix(r4, r5)
        L56:
            com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.video.spherical.Projection> r2 = r8.projectionQueue
            java.lang.Object r0 = r2.pollFloor(r0)
            com.google.android.exoplayer2.video.spherical.Projection r0 = (com.google.android.exoplayer2.video.spherical.Projection) r0
            if (r0 == 0) goto L65
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer r1 = r8.projectionRenderer
            r1.setProjection(r0)
        L65:
            float[] r2 = r8.tempMatrix
            r3 = 0
            r5 = 0
            float[] r6 = r8.rotationMatrix
            r7 = 0
            r4 = r9
            android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7)
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer r9 = r8.projectionRenderer
            int r0 = r8.textureId
            float[] r1 = r8.tempMatrix
            r9.draw(r0, r1, r10)
            return
    }

    public android.graphics.SurfaceTexture init() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            android.opengl.GLES20.glClearColor(r1, r1, r1, r0)     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer r0 = r3.projectionRenderer     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            r0.init()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            com.google.android.exoplayer2.util.GlUtil.checkGlError()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            int r0 = com.google.android.exoplayer2.util.GlUtil.createExternalTexture()     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            r3.textureId = r0     // Catch: com.google.android.exoplayer2.util.GlUtil.GlException -> L19
            goto L21
        L19:
            r0 = move-exception
            java.lang.String r1 = "SceneRenderer"
            java.lang.String r2 = "Failed to initialize the renderer"
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
        L21:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            int r1 = r3.textureId
            r0.<init>(r1)
            r3.surfaceTexture = r0
            com.google.android.exoplayer2.video.spherical.SceneRenderer$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.video.spherical.SceneRenderer$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.setOnFrameAvailableListener(r1)
            android.graphics.SurfaceTexture r0 = r3.surfaceTexture
            return r0
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long r2, float[] r4) {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.FrameRotationQueue r0 = r1.frameRotationQueue
            r0.setRotation(r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
            r2 = this;
            com.google.android.exoplayer2.util.TimedValueQueue<java.lang.Long> r0 = r2.sampleTimestampQueue
            r0.clear()
            com.google.android.exoplayer2.video.spherical.FrameRotationQueue r0 = r2.frameRotationQueue
            r0.reset()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.resetRotationAtNextFrame
            r1 = 1
            r0.set(r1)
            return
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long r1, long r3, com.google.android.exoplayer2.Format r5, @androidx.annotation.Nullable android.media.MediaFormat r6) {
            r0 = this;
            com.google.android.exoplayer2.util.TimedValueQueue<java.lang.Long> r6 = r0.sampleTimestampQueue
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r3, r1)
            byte[] r1 = r5.projectionData
            int r2 = r5.stereoMode
            r0.setProjection(r1, r2, r3)
            return
    }

    public void setDefaultStereoMode(int r1) {
            r0 = this;
            r0.defaultStereoMode = r1
            return
    }

    public void shutdown() {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.ProjectionRenderer r0 = r1.projectionRenderer
            r0.shutdown()
            return
    }
}
