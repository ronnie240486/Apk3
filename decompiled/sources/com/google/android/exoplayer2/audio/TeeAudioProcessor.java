package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public final class TeeAudioProcessor extends com.google.android.exoplayer2.audio.BaseAudioProcessor {
    private final com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink audioBufferSink;

    public interface AudioBufferSink {
        void flush(int r1, int r2, int r3);

        void handleBuffer(java.nio.ByteBuffer r1);
    }

    public static final class WavFileAudioBufferSink implements com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink {
        private static final int FILE_SIZE_MINUS_44_OFFSET = 40;
        private static final int FILE_SIZE_MINUS_8_OFFSET = 4;
        private static final int HEADER_LENGTH = 44;
        private static final java.lang.String TAG = "WaveFileAudioBufferSink";
        private int bytesWritten;
        private int channelCount;
        private int counter;
        private int encoding;
        private final java.lang.String outputFileNamePrefix;

        @androidx.annotation.Nullable
        private java.io.RandomAccessFile randomAccessFile;
        private int sampleRateHz;
        private final byte[] scratchBuffer;
        private final java.nio.ByteBuffer scratchByteBuffer;

        public WavFileAudioBufferSink(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r1.outputFileNamePrefix = r2
                r2 = 1024(0x400, float:1.435E-42)
                byte[] r2 = new byte[r2]
                r1.scratchBuffer = r2
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                r1.scratchByteBuffer = r2
                return
        }

        private java.lang.String getNextOutputFileName() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.outputFileNamePrefix
                r2 = 0
                r0[r2] = r1
                int r1 = r3.counter
                int r2 = r1 + 1
                r3.counter = r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = "%s-%04d.wav"
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
                return r0
        }

        private void maybePrepareFile() throws java.io.IOException {
                r3 = this;
                java.io.RandomAccessFile r0 = r3.randomAccessFile
                if (r0 == 0) goto L5
                return
            L5:
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
                java.lang.String r1 = r3.getNextOutputFileName()
                java.lang.String r2 = "rw"
                r0.<init>(r1, r2)
                r3.writeFileHeader(r0)
                r3.randomAccessFile = r0
                r0 = 44
                r3.bytesWritten = r0
                return
        }

        private void reset() throws java.io.IOException {
                r6 = this;
                java.io.RandomAccessFile r0 = r6.randomAccessFile
                if (r0 != 0) goto L5
                return
            L5:
                java.nio.ByteBuffer r1 = r6.scratchByteBuffer     // Catch: java.io.IOException -> L38
                r1.clear()     // Catch: java.io.IOException -> L38
                java.nio.ByteBuffer r1 = r6.scratchByteBuffer     // Catch: java.io.IOException -> L38
                int r2 = r6.bytesWritten     // Catch: java.io.IOException -> L38
                int r2 = r2 + (-8)
                r1.putInt(r2)     // Catch: java.io.IOException -> L38
                r1 = 4
                r0.seek(r1)     // Catch: java.io.IOException -> L38
                byte[] r1 = r6.scratchBuffer     // Catch: java.io.IOException -> L38
                r2 = 4
                r3 = 0
                r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L38
                java.nio.ByteBuffer r1 = r6.scratchByteBuffer     // Catch: java.io.IOException -> L38
                r1.clear()     // Catch: java.io.IOException -> L38
                java.nio.ByteBuffer r1 = r6.scratchByteBuffer     // Catch: java.io.IOException -> L38
                int r4 = r6.bytesWritten     // Catch: java.io.IOException -> L38
                int r4 = r4 + (-44)
                r1.putInt(r4)     // Catch: java.io.IOException -> L38
                r4 = 40
                r0.seek(r4)     // Catch: java.io.IOException -> L38
                byte[] r1 = r6.scratchBuffer     // Catch: java.io.IOException -> L38
                r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L38
                goto L40
            L38:
                r1 = move-exception
                java.lang.String r2 = "WaveFileAudioBufferSink"
                java.lang.String r3 = "Error updating file size"
                com.google.android.exoplayer2.util.Log.w(r2, r3, r1)
            L40:
                r1 = 0
                r0.close()     // Catch: java.lang.Throwable -> L47
                r6.randomAccessFile = r1
                return
            L47:
                r0 = move-exception
                r6.randomAccessFile = r1
                throw r0
        }

        private void writeBuffer(java.nio.ByteBuffer r5) throws java.io.IOException {
                r4 = this;
                java.io.RandomAccessFile r0 = r4.randomAccessFile
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.io.RandomAccessFile r0 = (java.io.RandomAccessFile) r0
            L8:
                boolean r1 = r5.hasRemaining()
                if (r1 == 0) goto L2a
                int r1 = r5.remaining()
                byte[] r2 = r4.scratchBuffer
                int r2 = r2.length
                int r1 = java.lang.Math.min(r1, r2)
                byte[] r2 = r4.scratchBuffer
                r3 = 0
                r5.get(r2, r3, r1)
                byte[] r2 = r4.scratchBuffer
                r0.write(r2, r3, r1)
                int r2 = r4.bytesWritten
                int r2 = r2 + r1
                r4.bytesWritten = r2
                goto L8
            L2a:
                return
        }

        private void writeFileHeader(java.io.RandomAccessFile r5) throws java.io.IOException {
                r4 = this;
                r0 = 1380533830(0x52494646, float:2.1611685E11)
                r5.writeInt(r0)
                r0 = -1
                r5.writeInt(r0)
                r1 = 1463899717(0x57415645, float:2.1257627E14)
                r5.writeInt(r1)
                r1 = 1718449184(0x666d7420, float:2.8033575E23)
                r5.writeInt(r1)
                java.nio.ByteBuffer r1 = r4.scratchByteBuffer
                r1.clear()
                java.nio.ByteBuffer r1 = r4.scratchByteBuffer
                r2 = 16
                r1.putInt(r2)
                java.nio.ByteBuffer r1 = r4.scratchByteBuffer
                int r2 = r4.encoding
                int r2 = com.google.android.exoplayer2.audio.WavUtil.getTypeForPcmEncoding(r2)
                short r2 = (short) r2
                r1.putShort(r2)
                java.nio.ByteBuffer r1 = r4.scratchByteBuffer
                int r2 = r4.channelCount
                short r2 = (short) r2
                r1.putShort(r2)
                java.nio.ByteBuffer r1 = r4.scratchByteBuffer
                int r2 = r4.sampleRateHz
                r1.putInt(r2)
                int r1 = r4.encoding
                int r2 = r4.channelCount
                int r1 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r1, r2)
                java.nio.ByteBuffer r2 = r4.scratchByteBuffer
                int r3 = r4.sampleRateHz
                int r3 = r3 * r1
                r2.putInt(r3)
                java.nio.ByteBuffer r2 = r4.scratchByteBuffer
                short r3 = (short) r1
                r2.putShort(r3)
                java.nio.ByteBuffer r2 = r4.scratchByteBuffer
                int r1 = r1 * 8
                int r3 = r4.channelCount
                int r1 = r1 / r3
                short r1 = (short) r1
                r2.putShort(r1)
                byte[] r1 = r4.scratchBuffer
                java.nio.ByteBuffer r2 = r4.scratchByteBuffer
                int r2 = r2.position()
                r3 = 0
                r5.write(r1, r3, r2)
                r1 = 1684108385(0x64617461, float:1.6635614E22)
                r5.writeInt(r1)
                r5.writeInt(r0)
                return
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void flush(int r4, int r5, int r6) {
                r3 = this;
                r3.reset()     // Catch: java.io.IOException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "WaveFileAudioBufferSink"
                java.lang.String r2 = "Error resetting"
                com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
            Lc:
                r3.sampleRateHz = r4
                r3.channelCount = r5
                r3.encoding = r6
                return
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void handleBuffer(java.nio.ByteBuffer r3) {
                r2 = this;
                r2.maybePrepareFile()     // Catch: java.io.IOException -> L7
                r2.writeBuffer(r3)     // Catch: java.io.IOException -> L7
                goto Lf
            L7:
                r3 = move-exception
                java.lang.String r0 = "WaveFileAudioBufferSink"
                java.lang.String r1 = "Error writing data"
                com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
            Lf:
                return
        }
    }

    public TeeAudioProcessor(com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.audio.TeeAudioProcessor$AudioBufferSink r1 = (com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink) r1
            r0.audioBufferSink = r1
            return
    }

    private void flushSinkIfActive() {
            r4 = this;
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.audio.TeeAudioProcessor$AudioBufferSink r0 = r4.audioBufferSink
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r4.inputAudioFormat
            int r2 = r1.sampleRate
            int r3 = r1.channelCount
            int r1 = r1.encoding
            r0.flush(r2, r3, r1)
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r1) {
            r0 = this;
            return r1
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onFlush() {
            r0 = this;
            r0.flushSinkIfActive()
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
            r0 = this;
            r0.flushSinkIfActive()
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onReset() {
            r0 = this;
            r0.flushSinkIfActive()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.audio.TeeAudioProcessor$AudioBufferSink r1 = r3.audioBufferSink
            java.nio.ByteBuffer r2 = r4.asReadOnlyBuffer()
            r1.handleBuffer(r2)
            java.nio.ByteBuffer r0 = r3.replaceOutputBuffer(r0)
            java.nio.ByteBuffer r4 = r0.put(r4)
            r4.flip()
            return
    }
}
