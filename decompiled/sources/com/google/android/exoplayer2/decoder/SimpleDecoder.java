package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleDecoder<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer, O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer, E extends com.google.android.exoplayer2.decoder.DecoderException> implements com.google.android.exoplayer2.decoder.Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final java.lang.Thread decodeThread;

    @androidx.annotation.Nullable
    private I dequeuedInputBuffer;

    @androidx.annotation.Nullable
    private E exception;
    private boolean flushed;
    private final java.lang.Object lock;
    private final java.util.ArrayDeque<I> queuedInputBuffers;
    private final java.util.ArrayDeque<O> queuedOutputBuffers;
    private boolean released;
    private int skippedOutputBufferCount;


    public SimpleDecoder(I[] r4, O[] r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.lock = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.queuedInputBuffers = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.queuedOutputBuffers = r0
            r3.availableInputBuffers = r4
            int r4 = r4.length
            r3.availableInputBufferCount = r4
            r4 = 0
            r0 = 0
        L1f:
            int r1 = r3.availableInputBufferCount
            if (r0 >= r1) goto L2e
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r1 = r3.availableInputBuffers
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r2 = r3.createInputBuffer()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1f
        L2e:
            r3.availableOutputBuffers = r5
            int r5 = r5.length
            r3.availableOutputBufferCount = r5
        L33:
            int r5 = r3.availableOutputBufferCount
            if (r4 >= r5) goto L42
            O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer[] r5 = r3.availableOutputBuffers
            com.google.android.exoplayer2.decoder.DecoderOutputBuffer r0 = r3.createOutputBuffer()
            r5[r4] = r0
            int r4 = r4 + 1
            goto L33
        L42:
            com.google.android.exoplayer2.decoder.SimpleDecoder$1 r4 = new com.google.android.exoplayer2.decoder.SimpleDecoder$1
            r4.<init>(r3)
            r3.decodeThread = r4
            r4.start()
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.decoder.SimpleDecoder r0) {
            r0.run()
            return
    }

    private boolean canDecodeBuffer() {
            r1 = this;
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r0 = r1.queuedInputBuffers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            int r0 = r1.availableOutputBufferCount
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean decode() throws java.lang.InterruptedException {
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
        L3:
            boolean r1 = r6.released     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L13
            boolean r1 = r6.canDecodeBuffer()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L13
            java.lang.Object r1 = r6.lock     // Catch: java.lang.Throwable -> L9b
            r1.wait()     // Catch: java.lang.Throwable -> L9b
            goto L3
        L13:
            boolean r1 = r6.released     // Catch: java.lang.Throwable -> L9b
            r2 = 0
            if (r1 == 0) goto L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r2
        L1a:
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r6.queuedInputBuffers     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L9b
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch: java.lang.Throwable -> L9b
            O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer[] r3 = r6.availableOutputBuffers     // Catch: java.lang.Throwable -> L9b
            int r4 = r6.availableOutputBufferCount     // Catch: java.lang.Throwable -> L9b
            r5 = 1
            int r4 = r4 - r5
            r6.availableOutputBufferCount = r4     // Catch: java.lang.Throwable -> L9b
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L9b
            boolean r4 = r6.flushed     // Catch: java.lang.Throwable -> L9b
            r6.flushed = r2     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r1.isEndOfStream()
            if (r0 == 0) goto L3c
            r0 = 4
            r3.addFlag(r0)
            goto L6e
        L3c:
            boolean r0 = r1.isDecodeOnly()
            if (r0 == 0) goto L47
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlag(r0)
        L47:
            boolean r0 = r1.isFirstSample()
            if (r0 == 0) goto L52
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.addFlag(r0)
        L52:
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.decode(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L57 java.lang.RuntimeException -> L5d
            goto L62
        L57:
            r0 = move-exception
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.createUnexpectedDecodeException(r0)
            goto L62
        L5d:
            r0 = move-exception
            com.google.android.exoplayer2.decoder.DecoderException r0 = r6.createUnexpectedDecodeException(r0)
        L62:
            if (r0 == 0) goto L6e
            java.lang.Object r4 = r6.lock
            monitor-enter(r4)
            r6.exception = r0     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            return r2
        L6b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            java.lang.Object r4 = r6.lock
            monitor-enter(r4)
            boolean r0 = r6.flushed     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L79
            r3.release()     // Catch: java.lang.Throwable -> L98
            goto L93
        L79:
            boolean r0 = r3.isDecodeOnly()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L88
            int r0 = r6.skippedOutputBufferCount     // Catch: java.lang.Throwable -> L98
            int r0 = r0 + r5
            r6.skippedOutputBufferCount = r0     // Catch: java.lang.Throwable -> L98
            r3.release()     // Catch: java.lang.Throwable -> L98
            goto L93
        L88:
            int r0 = r6.skippedOutputBufferCount     // Catch: java.lang.Throwable -> L98
            r3.skippedOutputBufferCount = r0     // Catch: java.lang.Throwable -> L98
            r6.skippedOutputBufferCount = r2     // Catch: java.lang.Throwable -> L98
            java.util.ArrayDeque<O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> r0 = r6.queuedOutputBuffers     // Catch: java.lang.Throwable -> L98
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L98
        L93:
            r6.releaseInputBufferInternal(r1)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L98
            return r5
        L98:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L98
            throw r0
        L9b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r1
    }

    private void maybeNotifyDecodeLoop() {
            r1 = this;
            boolean r0 = r1.canDecodeBuffer()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.lock
            r0.notify()
        Lb:
            return
    }

    private void maybeThrowException() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            E extends com.google.android.exoplayer2.decoder.DecoderException r0 = r1.exception
            if (r0 != 0) goto L5
            return
        L5:
            throw r0
    }

    private void releaseInputBufferInternal(I r4) {
            r3 = this;
            r4.clear()
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r0 = r3.availableInputBuffers
            int r1 = r3.availableInputBufferCount
            int r2 = r1 + 1
            r3.availableInputBufferCount = r2
            r0[r1] = r4
            return
    }

    private void releaseOutputBufferInternal(O r4) {
            r3 = this;
            r4.clear()
            O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer[] r0 = r3.availableOutputBuffers
            int r1 = r3.availableOutputBufferCount
            int r2 = r1 + 1
            r3.availableOutputBufferCount = r2
            r0[r1] = r4
            return
    }

    private void run() {
            r2 = this;
        L0:
            boolean r0 = r2.decode()     // Catch: java.lang.InterruptedException -> L8
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
        L8:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(java.lang.Throwable r1);

    @androidx.annotation.Nullable
    public abstract E decode(I r1, O r2, boolean r3);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public final I dequeueInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            r4.maybeThrowException()     // Catch: java.lang.Throwable -> L22
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r4.dequeuedInputBuffer     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)     // Catch: java.lang.Throwable -> L22
            int r1 = r4.availableInputBufferCount     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L17
            r1 = 0
            goto L1e
        L17:
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r3 = r4.availableInputBuffers     // Catch: java.lang.Throwable -> L22
            int r1 = r1 - r2
            r4.availableInputBufferCount = r1     // Catch: java.lang.Throwable -> L22
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L22
        L1e:
            r4.dequeuedInputBuffer = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object dequeueInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = r1.dequeueInputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public final O dequeueOutputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r2.maybeThrowException()     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayDeque<O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> r1 = r2.queuedOutputBuffers     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L11
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L11:
            java.util.ArrayDeque<O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> r1 = r2.queuedOutputBuffers     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L1b
            com.google.android.exoplayer2.decoder.DecoderOutputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderOutputBuffer) r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object dequeueOutputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            com.google.android.exoplayer2.decoder.DecoderOutputBuffer r0 = r1.dequeueOutputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r1 = 1
            r2.flushed = r1     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            r2.skippedOutputBufferCount = r1     // Catch: java.lang.Throwable -> L3d
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r2.dequeuedInputBuffer     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L13
            r2.releaseInputBufferInternal(r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            r2.dequeuedInputBuffer = r1     // Catch: java.lang.Throwable -> L3d
        L13:
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r2.queuedInputBuffers     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L27
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r2.queuedInputBuffers     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L3d
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch: java.lang.Throwable -> L3d
            r2.releaseInputBufferInternal(r1)     // Catch: java.lang.Throwable -> L3d
            goto L13
        L27:
            java.util.ArrayDeque<O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> r1 = r2.queuedOutputBuffers     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            java.util.ArrayDeque<O extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> r1 = r2.queuedOutputBuffers     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L3d
            com.google.android.exoplayer2.decoder.DecoderOutputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderOutputBuffer) r1     // Catch: java.lang.Throwable -> L3d
            r1.release()     // Catch: java.lang.Throwable -> L3d
            goto L27
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1
    }

    public final void queueInputBuffer(I r3) throws com.google.android.exoplayer2.decoder.DecoderException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r2.maybeThrowException()     // Catch: java.lang.Throwable -> L1d
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = r2.dequeuedInputBuffer     // Catch: java.lang.Throwable -> L1d
            if (r3 != r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r2.queuedInputBuffers     // Catch: java.lang.Throwable -> L1d
            r1.addLast(r3)     // Catch: java.lang.Throwable -> L1d
            r2.maybeNotifyDecodeLoop()     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.dequeuedInputBuffer = r3     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(java.lang.Object r1) throws com.google.android.exoplayer2.decoder.DecoderException {
            r0 = this;
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1
            r0.queueInputBuffer(r1)
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.CallSuper
    public void release() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r1 = 1
            r2.released = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> L1a
            r1.notify()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Thread r0 = r2.decodeThread     // Catch: java.lang.InterruptedException -> L12
            r0.join()     // Catch: java.lang.InterruptedException -> L12
            goto L19
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    @androidx.annotation.CallSuper
    public final void releaseOutputBuffer(O r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            r1.releaseOutputBufferInternal(r2)     // Catch: java.lang.Throwable -> Lb
            r1.maybeNotifyDecodeLoop()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final void setInitialInputBufferSize(int r5) {
            r4 = this;
            int r0 = r4.availableInputBufferCount
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r1 = r4.availableInputBuffers
            int r1 = r1.length
            r2 = 0
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer[] r0 = r4.availableInputBuffers
            int r1 = r0.length
        L11:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            r3.ensureSpaceForWrite(r5)
            int r2 = r2 + 1
            goto L11
        L1b:
            return
    }
}
