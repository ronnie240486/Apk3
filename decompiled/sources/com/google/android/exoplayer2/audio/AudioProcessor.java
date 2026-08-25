package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {
    public static final java.nio.ByteBuffer EMPTY_BUFFER = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AudioFormat {
        public static final com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat NOT_SET = null;
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        static {
                com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = new com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat
                r1 = -1
                r0.<init>(r1, r1, r1)
                com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET = r0
                return
        }

        public AudioFormat(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.sampleRate = r1
                r0.channelCount = r2
                r0.encoding = r3
                boolean r1 = com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(r3)
                if (r1 == 0) goto L14
                int r1 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r3, r2)
                goto L15
            L14:
                r1 = -1
            L15:
                r0.bytesPerFrame = r1
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r5 = (com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat) r5
                int r1 = r4.sampleRate
                int r3 = r5.sampleRate
                if (r1 != r3) goto L1f
                int r1 = r4.channelCount
                int r3 = r5.channelCount
                if (r1 != r3) goto L1f
                int r1 = r4.encoding
                int r5 = r5.encoding
                if (r1 != r5) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r1 = r3.sampleRate
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                int r1 = r3.channelCount
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.encoding
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "AudioFormat[sampleRate="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r3.sampleRate
                r0.append(r1)
                java.lang.String r1 = ", channelCount="
                r0.append(r1)
                int r1 = r3.channelCount
                r0.append(r1)
                java.lang.String r1 = ", encoding="
                r0.append(r1)
                int r1 = r3.encoding
                r2 = 93
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    public static final class UnhandledAudioFormatException extends java.lang.Exception {
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unhandled format: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    static {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r1) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException;

    void flush();

    java.nio.ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(java.nio.ByteBuffer r1);

    void reset();
}
