package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(23)
final class AsynchronousMediaCodecCallback extends android.media.MediaCodec.Callback {

    @androidx.annotation.GuardedBy("lock")
    private final com.google.android.exoplayer2.mediacodec.IntArrayQueue availableInputBuffers;

    @androidx.annotation.GuardedBy("lock")
    private final com.google.android.exoplayer2.mediacodec.IntArrayQueue availableOutputBuffers;

    @androidx.annotation.GuardedBy("lock")
    private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> bufferInfos;
    private final android.os.HandlerThread callbackThread;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private android.media.MediaFormat currentFormat;

    @androidx.annotation.GuardedBy("lock")
    private final java.util.ArrayDeque<android.media.MediaFormat> formats;
    private android.os.Handler handler;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private java.lang.IllegalStateException internalException;
    private final java.lang.Object lock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private android.media.MediaCodec.CodecException mediaCodecException;

    @androidx.annotation.GuardedBy("lock")
    private long pendingFlushCount;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private android.media.MediaFormat pendingOutputFormat;

    @androidx.annotation.GuardedBy("lock")
    private boolean shutDown;

    public static /* synthetic */ void $r8$lambda$JX54gLuqdiTOvaBAbzLwCkY2H90(com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback r0) {
            r0.onFlushCompleted()
            return
    }

    public AsynchronousMediaCodecCallback(android.os.HandlerThread r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            r1.callbackThread = r2
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r2 = new com.google.android.exoplayer2.mediacodec.IntArrayQueue
            r2.<init>()
            r1.availableInputBuffers = r2
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r2 = new com.google.android.exoplayer2.mediacodec.IntArrayQueue
            r2.<init>()
            r1.availableOutputBuffers = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.bufferInfos = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.formats = r2
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private void addOutputFormat(android.media.MediaFormat r3) {
            r2 = this;
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r0 = r2.availableOutputBuffers
            r1 = -2
            r0.add(r1)
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r2.formats
            r0.add(r3)
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private void flushInternal() {
            r1 = this;
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r1.formats
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r1.formats
            java.lang.Object r0 = r0.getLast()
            android.media.MediaFormat r0 = (android.media.MediaFormat) r0
            r1.pendingOutputFormat = r0
        L12:
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r0 = r1.availableInputBuffers
            r0.clear()
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r0 = r1.availableOutputBuffers
            r0.clear()
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r1.bufferInfos
            r0.clear()
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r1.formats
            r0.clear()
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private boolean isFlushingOrShutdown() {
            r5 = this;
            long r0 = r5.pendingFlushCount
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            boolean r0 = r5.shutDown
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @androidx.annotation.GuardedBy("lock")
    private void maybeThrowException() {
            r0 = this;
            r0.maybeThrowInternalException()
            r0.maybeThrowMediaCodecException()
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private void maybeThrowInternalException() {
            r2 = this;
            java.lang.IllegalStateException r0 = r2.internalException
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2.internalException = r1
            throw r0
    }

    @androidx.annotation.GuardedBy("lock")
    private void maybeThrowMediaCodecException() {
            r2 = this;
            android.media.MediaCodec$CodecException r0 = r2.mediaCodecException
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2.mediaCodecException = r1
            throw r0
    }

    private void onFlushCompleted() {
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            boolean r1 = r6.shutDown     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L9:
            long r1 = r6.pendingFlushCount     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            long r1 = r1 - r3
            r6.pendingFlushCount = r1     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L18:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L26
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            r6.setInternalException(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L26:
            r6.flushInternal()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    private void setInternalException(java.lang.IllegalStateException r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            r1.internalException = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public int dequeueInputBufferIndex() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            boolean r1 = r3.isFlushingOrShutdown()     // Catch: java.lang.Throwable -> L20
            r2 = -1
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        Lc:
            r3.maybeThrowException()     // Catch: java.lang.Throwable -> L20
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r1 = r3.availableInputBuffers     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L18
            goto L1e
        L18:
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r1 = r3.availableInputBuffers     // Catch: java.lang.Throwable -> L20
            int r2 = r1.remove()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo r10) {
            r9 = this;
            java.lang.Object r0 = r9.lock
            monitor-enter(r0)
            boolean r1 = r9.isFlushingOrShutdown()     // Catch: java.lang.Throwable -> L4a
            r2 = -1
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r2
        Lc:
            r9.maybeThrowException()     // Catch: java.lang.Throwable -> L4a
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r1 = r9.availableOutputBuffers     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r2
        L19:
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r1 = r9.availableOutputBuffers     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.remove()     // Catch: java.lang.Throwable -> L4a
            if (r1 < 0) goto L3b
            android.media.MediaFormat r2 = r9.currentFormat     // Catch: java.lang.Throwable -> L4a
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r2)     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.bufferInfos     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L4a
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch: java.lang.Throwable -> L4a
            int r4 = r2.offset     // Catch: java.lang.Throwable -> L4a
            int r5 = r2.size     // Catch: java.lang.Throwable -> L4a
            long r6 = r2.presentationTimeUs     // Catch: java.lang.Throwable -> L4a
            int r8 = r2.flags     // Catch: java.lang.Throwable -> L4a
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4a
            goto L48
        L3b:
            r10 = -2
            if (r1 != r10) goto L48
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.formats     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L4a
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L4a
            r9.currentFormat = r10     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L4a:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r10
    }

    public void flush() {
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            long r1 = r5.pendingFlushCount     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            long r1 = r1 + r3
            r5.pendingFlushCount = r1     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r1 = r5.handler     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r1 = (android.os.Handler) r1     // Catch: java.lang.Throwable -> L1c
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L1c
            r1.post(r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public android.media.MediaFormat getOutputFormat() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            android.media.MediaFormat r1 = r2.currentFormat     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void initialize(android.media.MediaCodec r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            android.os.HandlerThread r0 = r2.callbackThread
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r2.callbackThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r3.setCallback(r2, r0)
            r2.handler = r0
            return
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec r1, android.media.MediaCodec.CodecException r2) {
            r0 = this;
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            r0.mediaCodecException = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.lock
            monitor-enter(r2)
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r0 = r1.availableInputBuffers     // Catch: java.lang.Throwable -> La
            r0.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec r2, int r3, android.media.MediaCodec.BufferInfo r4) {
            r1 = this;
            java.lang.Object r2 = r1.lock
            monitor-enter(r2)
            android.media.MediaFormat r0 = r1.pendingOutputFormat     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Ld
            r1.addOutputFormat(r0)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            r1.pendingOutputFormat = r0     // Catch: java.lang.Throwable -> L19
        Ld:
            com.google.android.exoplayer2.mediacodec.IntArrayQueue r0 = r1.availableOutputBuffers     // Catch: java.lang.Throwable -> L19
            r0.add(r3)     // Catch: java.lang.Throwable -> L19
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r3 = r1.bufferInfos     // Catch: java.lang.Throwable -> L19
            r3.add(r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec r1, android.media.MediaFormat r2) {
            r0 = this;
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            r0.addOutputFormat(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            r0.pendingOutputFormat = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public void shutdown() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r1 = 1
            r2.shutDown = r1     // Catch: java.lang.Throwable -> L10
            android.os.HandlerThread r1 = r2.callbackThread     // Catch: java.lang.Throwable -> L10
            r1.quit()     // Catch: java.lang.Throwable -> L10
            r2.flushInternal()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
