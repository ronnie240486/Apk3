package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(23)
final class AsynchronousMediaCodecAdapter implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer bufferEnqueuer;
    private final android.media.MediaCodec codec;
    private boolean codecReleased;
    private int state;
    private final boolean synchronizeCodecInteractionsWithQueueing;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory {
        private final com.google.common.base.Supplier<android.os.HandlerThread> callbackThreadSupplier;
        private final com.google.common.base.Supplier<android.os.HandlerThread> queueingThreadSupplier;
        private final boolean synchronizeCodecInteractionsWithQueueing;

        public static /* synthetic */ android.os.HandlerThread $r8$lambda$_sfoxALAydTODW5vGEGXx4zjENI(int r0) {
                android.os.HandlerThread r0 = lambda$new$0(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$zNxUJHIE2b-XogkQb8GUDzkjdG0, reason: not valid java name */
        public static /* synthetic */ android.os.HandlerThread m227$r8$lambda$zNxUJHIE2bXogkQb8GUDzkjdG0(int r0) {
                android.os.HandlerThread r0 = lambda$new$1(r0)
                return r0
        }

        public Factory(int r4, boolean r5) {
                r3 = this;
                com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r4, r1)
                com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r4, r2)
                r3.<init>()
                r3.callbackThreadSupplier = r0
                r3.queueingThreadSupplier = r1
                r3.synchronizeCodecInteractionsWithQueueing = r5
                return
        }

        private static /* synthetic */ android.os.HandlerThread lambda$new$0(int r1) {
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.access$300(r1)
                r0.<init>(r1)
                return r0
        }

        private static /* synthetic */ android.os.HandlerThread lambda$new$1(int r1) {
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.access$200(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r10) throws java.io.IOException {
                r9 = this;
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = r10.codecInfo
                java.lang.String r0 = r0.name
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
                r2.<init>()     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch: java.lang.Exception -> L4d
                r2.append(r0)     // Catch: java.lang.Exception -> L4d
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4d
                com.google.android.exoplayer2.util.TraceUtil.beginSection(r2)     // Catch: java.lang.Exception -> L4d
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L4d
                com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r2 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter     // Catch: java.lang.Exception -> L4b
                com.google.common.base.Supplier<android.os.HandlerThread> r3 = r9.callbackThreadSupplier     // Catch: java.lang.Exception -> L4b
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L4b
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch: java.lang.Exception -> L4b
                com.google.common.base.Supplier<android.os.HandlerThread> r3 = r9.queueingThreadSupplier     // Catch: java.lang.Exception -> L4b
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L4b
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch: java.lang.Exception -> L4b
                boolean r7 = r9.synchronizeCodecInteractionsWithQueueing     // Catch: java.lang.Exception -> L4b
                r8 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4b
                com.google.android.exoplayer2.util.TraceUtil.endSection()     // Catch: java.lang.Exception -> L48
                android.media.MediaFormat r1 = r10.mediaFormat     // Catch: java.lang.Exception -> L48
                android.view.Surface r3 = r10.surface     // Catch: java.lang.Exception -> L48
                android.media.MediaCrypto r4 = r10.crypto     // Catch: java.lang.Exception -> L48
                int r10 = r10.flags     // Catch: java.lang.Exception -> L48
                com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.access$100(r2, r1, r3, r4, r10)     // Catch: java.lang.Exception -> L48
                return r2
            L48:
                r10 = move-exception
                r1 = r2
                goto L4f
            L4b:
                r10 = move-exception
                goto L4f
            L4d:
                r10 = move-exception
                r0 = r1
            L4f:
                if (r1 != 0) goto L57
                if (r0 == 0) goto L5a
                r0.release()
                goto L5a
            L57:
                r1.release()
            L5a:
                throw r10
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration r1) throws java.io.IOException {
                r0 = this;
                com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r1 = r0.createAdapter(r1)
                return r1
        }
    }

    public static /* synthetic */ void $r8$lambda$IJnLA9QP9osm5ZMSm9y9AUj01V0(com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r0, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r1, android.media.MediaCodec r2, long r3, long r5) {
            r0.lambda$setOnFrameRenderedListener$0(r1, r2, r3, r5)
            return
    }

    private AsynchronousMediaCodecAdapter(android.media.MediaCodec r2, android.os.HandlerThread r3, android.os.HandlerThread r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r1.codec = r2
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback
            r0.<init>(r3)
            r1.asynchronousMediaCodecCallback = r0
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r3 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer
            r3.<init>(r2, r4)
            r1.bufferEnqueuer = r3
            r1.synchronizeCodecInteractionsWithQueueing = r5
            r2 = 0
            r1.state = r2
            return
    }

    public /* synthetic */ AsynchronousMediaCodecAdapter(android.media.MediaCodec r1, android.os.HandlerThread r2, android.os.HandlerThread r3, boolean r4, com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter r0, android.media.MediaFormat r1, android.view.Surface r2, android.media.MediaCrypto r3, int r4) {
            r0.initialize(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ java.lang.String access$200(int r0) {
            java.lang.String r0 = createQueueingThreadLabel(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String access$300(int r0) {
            java.lang.String r0 = createCallbackThreadLabel(r0)
            return r0
    }

    private static java.lang.String createCallbackThreadLabel(int r1) {
            java.lang.String r0 = "ExoPlayer:MediaCodecAsyncAdapter:"
            java.lang.String r1 = createThreadLabel(r1, r0)
            return r1
    }

    private static java.lang.String createQueueingThreadLabel(int r1) {
            java.lang.String r0 = "ExoPlayer:MediaCodecQueueingThread:"
            java.lang.String r1 = createThreadLabel(r1, r0)
            return r1
    }

    private static java.lang.String createThreadLabel(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r2 = 1
            if (r1 != r2) goto Le
            java.lang.String r1 = "Audio"
            r0.append(r1)
            goto L24
        Le:
            r2 = 2
            if (r1 != r2) goto L17
            java.lang.String r1 = "Video"
            r0.append(r1)
            goto L24
        L17:
            java.lang.String r2 = "Unknown("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
        L24:
            java.lang.String r1 = r0.toString()
            return r1
    }

    private void initialize(@androidx.annotation.Nullable android.media.MediaFormat r3, @androidx.annotation.Nullable android.view.Surface r4, @androidx.annotation.Nullable android.media.MediaCrypto r5, int r6) {
            r2 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = r2.asynchronousMediaCodecCallback
            android.media.MediaCodec r1 = r2.codec
            r0.initialize(r1)
            java.lang.String r0 = "configureCodec"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r0)
            android.media.MediaCodec r0 = r2.codec
            r0.configure(r3, r4, r5, r6)
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r3 = r2.bufferEnqueuer
            r3.start()
            java.lang.String r3 = "startCodec"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r3)
            android.media.MediaCodec r3 = r2.codec
            r3.start()
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            r3 = 1
            r2.state = r3
            return
    }

    private /* synthetic */ void lambda$setOnFrameRenderedListener$0(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r7, android.media.MediaCodec r8, long r9, long r11) {
            r6 = this;
            r0 = r7
            r1 = r6
            r2 = r9
            r4 = r11
            r0.onFrameRendered(r1, r2, r4)
            return
    }

    private void maybeBlockOnQueueing() {
            r2 = this;
            boolean r0 = r2.synchronizeCodecInteractionsWithQueueing
            if (r0 == 0) goto L18
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r2.bufferEnqueuer     // Catch: java.lang.InterruptedException -> La
            r0.waitUntilQueueingComplete()     // Catch: java.lang.InterruptedException -> La
            goto L18
        La:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L18:
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r1.bufferEnqueuer
            r0.maybeThrowException()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = r1.asynchronousMediaCodecCallback
            int r0 = r0.dequeueInputBufferIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo r2) {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r1.bufferEnqueuer
            r0.maybeThrowException()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = r1.asynchronousMediaCodecCallback
            int r2 = r0.dequeueOutputBufferIndex(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r1.bufferEnqueuer
            r0.flush()
            android.media.MediaCodec r0 = r1.codec
            r0.flush()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = r1.asynchronousMediaCodecCallback
            r0.flush()
            android.media.MediaCodec r0 = r1.codec
            r0.start()
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.Nullable
    public java.nio.ByteBuffer getInputBuffer(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            java.nio.ByteBuffer r2 = r0.getInputBuffer(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.RequiresApi(26)
    public android.os.PersistableBundle getMetrics() {
            r1 = this;
            r1.maybeBlockOnQueueing()
            android.media.MediaCodec r0 = r1.codec
            android.os.PersistableBundle r0 = r0.getMetrics()
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @androidx.annotation.Nullable
    public java.nio.ByteBuffer getOutputBuffer(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            java.nio.ByteBuffer r2 = r0.getOutputBuffer(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0 = r1.asynchronousMediaCodecCallback
            android.media.MediaFormat r0 = r0.getOutputFormat()
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r7.bufferEnqueuer
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int r8, int r9, com.google.android.exoplayer2.decoder.CryptoInfo r10, long r11, int r13) {
            r7 = this;
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = r7.bufferEnqueuer
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueSecureInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
            r3 = this;
            r0 = 1
            int r1 = r3.state     // Catch: java.lang.Throwable -> L1e
            if (r1 != r0) goto Lf
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r1 = r3.bufferEnqueuer     // Catch: java.lang.Throwable -> L1e
            r1.shutdown()     // Catch: java.lang.Throwable -> L1e
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r1 = r3.asynchronousMediaCodecCallback     // Catch: java.lang.Throwable -> L1e
            r1.shutdown()     // Catch: java.lang.Throwable -> L1e
        Lf:
            r1 = 2
            r3.state = r1     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r3.codecReleased
            if (r1 != 0) goto L1d
            android.media.MediaCodec r1 = r3.codec
            r1.release()
            r3.codecReleased = r0
        L1d:
            return
        L1e:
            r1 = move-exception
            boolean r2 = r3.codecReleased
            if (r2 != 0) goto L2a
            android.media.MediaCodec r2 = r3.codec
            r2.release()
            r3.codecReleased = r0
        L2a:
            throw r1
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int r2, boolean r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.codec
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener r4, android.os.Handler r5) {
            r3 = this;
            r3.maybeBlockOnQueueing()
            android.media.MediaCodec r0 = r3.codec
            com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.setOnFrameRenderedListener(r1, r5)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface r2) {
            r1 = this;
            r1.maybeBlockOnQueueing()
            android.media.MediaCodec r0 = r1.codec
            r0.setOutputSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle r2) {
            r1 = this;
            r1.maybeBlockOnQueueing()
            android.media.MediaCodec r0 = r1.codec
            r0.setParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int r2) {
            r1 = this;
            r1.maybeBlockOnQueueing()
            android.media.MediaCodec r0 = r1.codec
            r0.setVideoScalingMode(r2)
            return
    }
}
