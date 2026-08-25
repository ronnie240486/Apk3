package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(23)
class AsynchronousMediaCodecBufferEnqueuer {

    @androidx.annotation.GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = null;
    private static final int MSG_OPEN_CV = 2;
    private static final int MSG_QUEUE_INPUT_BUFFER = 0;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 1;
    private static final java.lang.Object QUEUE_SECURE_LOCK = null;
    private final android.media.MediaCodec codec;
    private final com.google.android.exoplayer2.util.ConditionVariable conditionVariable;
    private android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> pendingRuntimeException;
    private boolean started;


    /* JADX INFO: loaded from: classes3.dex */
    public static class MessageParams {
        public final android.media.MediaCodec.CryptoInfo cryptoInfo;
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public MessageParams() {
                r1 = this;
                r1.<init>()
                android.media.MediaCodec$CryptoInfo r0 = new android.media.MediaCodec$CryptoInfo
                r0.<init>()
                r1.cryptoInfo = r0
                return
        }

        public void setQueueParams(int r1, int r2, int r3, long r4, int r6) {
                r0 = this;
                r0.index = r1
                r0.offset = r2
                r0.size = r3
                r0.presentationTimeUs = r4
                r0.flags = r6
                return
        }
    }

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MESSAGE_PARAMS_INSTANCE_POOL = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.QUEUE_SECURE_LOCK = r0
            return
    }

    public AsynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec r2, android.os.HandlerThread r3) {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = new com.google.android.exoplayer2.util.ConditionVariable
            r0.<init>()
            r1.<init>()
            r1.codec = r2
            r1.handlerThread = r3
            r1.conditionVariable = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.pendingRuntimeException = r2
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0, android.os.Message r1) {
            r0.doHandleMessage(r1)
            return
    }

    private void blockUntilHandlerThreadIsIdle() throws java.lang.InterruptedException {
            r2 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r2.conditionVariable
            r0.close()
            android.os.Handler r0 = r2.handler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            r1 = 2
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            com.google.android.exoplayer2.util.ConditionVariable r0 = r2.conditionVariable
            r0.block()
            return
    }

    private static void copy(com.google.android.exoplayer2.decoder.CryptoInfo r2, android.media.MediaCodec.CryptoInfo r3) {
            int r0 = r2.numSubSamples
            r3.numSubSamples = r0
            int[] r0 = r2.numBytesOfClearData
            int[] r1 = r3.numBytesOfClearData
            int[] r0 = copy(r0, r1)
            r3.numBytesOfClearData = r0
            int[] r0 = r2.numBytesOfEncryptedData
            int[] r1 = r3.numBytesOfEncryptedData
            int[] r0 = copy(r0, r1)
            r3.numBytesOfEncryptedData = r0
            byte[] r0 = r2.key
            byte[] r1 = r3.key
            byte[] r0 = copy(r0, r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            byte[] r0 = (byte[]) r0
            r3.key = r0
            byte[] r0 = r2.iv
            byte[] r1 = r3.iv
            byte[] r0 = copy(r0, r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            byte[] r0 = (byte[]) r0
            r3.iv = r0
            int r0 = r2.mode
            r3.mode = r0
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 < r1) goto L4e
            android.media.MediaCodec$CryptoInfo$Pattern r0 = new android.media.MediaCodec$CryptoInfo$Pattern
            int r1 = r2.encryptedBlocks
            int r2 = r2.clearBlocks
            r0.<init>(r1, r2)
            r3.setPattern(r0)
        L4e:
            return
    }

    @androidx.annotation.Nullable
    private static byte[] copy(@androidx.annotation.Nullable byte[] r2, @androidx.annotation.Nullable byte[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto L10
            int r0 = r3.length
            int r1 = r2.length
            if (r0 >= r1) goto La
            goto L10
        La:
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            int r3 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    @androidx.annotation.Nullable
    private static int[] copy(@androidx.annotation.Nullable int[] r2, @androidx.annotation.Nullable int[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto L10
            int r0 = r3.length
            int r1 = r2.length
            if (r0 >= r1) goto La
            goto L10
        La:
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            int r3 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    private void doHandleMessage(android.os.Message r10) {
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L36
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r9.pendingRuntimeException
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            r0.compareAndSet(r1, r2)
            goto L49
        L1c:
            com.google.android.exoplayer2.util.ConditionVariable r10 = r9.conditionVariable
            r10.open()
            goto L49
        L22:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r1 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r1
            int r3 = r1.index
            int r4 = r1.offset
            android.media.MediaCodec$CryptoInfo r5 = r1.cryptoInfo
            long r6 = r1.presentationTimeUs
            int r8 = r1.flags
            r2 = r9
            r2.doQueueSecureInputBuffer(r3, r4, r5, r6, r8)
            goto L49
        L36:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r1 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r1
            int r3 = r1.index
            int r4 = r1.offset
            int r5 = r1.size
            long r6 = r1.presentationTimeUs
            int r8 = r1.flags
            r2 = r9
            r2.doQueueInputBuffer(r3, r4, r5, r6, r8)
        L49:
            if (r1 == 0) goto L4e
            recycleMessageParams(r1)
        L4e:
            return
    }

    private void doQueueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.codec     // Catch: java.lang.RuntimeException -> Lb
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> Lb
            goto L12
        Lb:
            r8 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r7.pendingRuntimeException
            r10 = 0
            r9.compareAndSet(r10, r8)
        L12:
            return
    }

    private void doQueueSecureInputBuffer(int r9, int r10, android.media.MediaCodec.CryptoInfo r11, long r12, int r14) {
            r8 = this;
            java.lang.Object r0 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.QUEUE_SECURE_LOCK     // Catch: java.lang.RuntimeException -> L12
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L12
            android.media.MediaCodec r1 = r8.codec     // Catch: java.lang.Throwable -> Lf
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r1.queueSecureInputBuffer(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            goto L19
        Lf:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r9     // Catch: java.lang.RuntimeException -> L12
        L12:
            r9 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r10 = r8.pendingRuntimeException
            r11 = 0
            r10.compareAndSet(r11, r9)
        L19:
            return
    }

    private void flushHandlerThread() throws java.lang.InterruptedException {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.blockUntilHandlerThreadIsIdle()
            return
    }

    private static com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams getMessageParams() {
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams> r0 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MESSAGE_PARAMS_INSTANCE_POOL
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L10
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r1 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.lang.Throwable -> L18
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r1 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private static void recycleMessageParams(com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams r1) {
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams> r0 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MESSAGE_PARAMS_INSTANCE_POOL
            monitor-enter(r0)
            r0.add(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public void flush() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 == 0) goto L16
            r2.flushHandlerThread()     // Catch: java.lang.InterruptedException -> L8
            goto L16
        L8:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L16:
            return
    }

    public void maybeThrowException() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r2.pendingRuntimeException
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            throw r0
    }

    public void queueInputBuffer(int r9, int r10, int r11, long r12, int r14) {
            r8 = this;
            r8.maybeThrowException()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = getMessageParams()
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r0.setQueueParams(r1, r2, r3, r4, r6)
            android.os.Handler r9 = r8.handler
            java.lang.Object r9 = com.google.android.exoplayer2.util.Util.castNonNull(r9)
            android.os.Handler r9 = (android.os.Handler) r9
            r10 = 0
            android.os.Message r9 = r9.obtainMessage(r10, r7)
            r9.sendToTarget()
            return
    }

    public void queueSecureInputBuffer(int r9, int r10, com.google.android.exoplayer2.decoder.CryptoInfo r11, long r12, int r14) {
            r8 = this;
            r8.maybeThrowException()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = getMessageParams()
            r3 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r0.setQueueParams(r1, r2, r3, r4, r6)
            android.media.MediaCodec$CryptoInfo r9 = r7.cryptoInfo
            copy(r11, r9)
            android.os.Handler r9 = r8.handler
            java.lang.Object r9 = com.google.android.exoplayer2.util.Util.castNonNull(r9)
            android.os.Handler r9 = (android.os.Handler) r9
            r10 = 1
            android.os.Message r9 = r9.obtainMessage(r10, r7)
            r9.sendToTarget()
            return
    }

    public void shutdown() {
            r1 = this;
            boolean r0 = r1.started
            if (r0 == 0) goto Lc
            r1.flush()
            android.os.HandlerThread r0 = r1.handlerThread
            r0.quit()
        Lc:
            r0 = 0
            r1.started = r0
            return
    }

    public void start() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 != 0) goto L19
            android.os.HandlerThread r0 = r2.handlerThread
            r0.start()
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1 r0 = new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1
            android.os.HandlerThread r1 = r2.handlerThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r2, r1)
            r2.handler = r0
            r0 = 1
            r2.started = r0
        L19:
            return
    }

    public void waitUntilQueueingComplete() throws java.lang.InterruptedException {
            r0 = this;
            r0.blockUntilHandlerThreadIsIdle()
            return
    }
}
