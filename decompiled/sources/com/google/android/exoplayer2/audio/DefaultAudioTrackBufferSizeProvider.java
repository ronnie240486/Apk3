package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAudioTrackBufferSizeProvider implements com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    public final int maxPcmBufferDurationUs;
    public final int minPcmBufferDurationUs;
    public final int offloadBufferDurationUs;
    public final int passthroughBufferDurationUs;
    public final int pcmBufferMultiplicationFactor;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private int ac3BufferMultiplicationFactor;
        private int maxPcmBufferDurationUs;
        private int minPcmBufferDurationUs;
        private int offloadBufferDurationUs;
        private int passthroughBufferDurationUs;
        private int pcmBufferMultiplicationFactor;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 250000(0x3d090, float:3.50325E-40)
                r2.minPcmBufferDurationUs = r0
                r1 = 750000(0xb71b0, float:1.050974E-39)
                r2.maxPcmBufferDurationUs = r1
                r1 = 4
                r2.pcmBufferMultiplicationFactor = r1
                r2.passthroughBufferDurationUs = r0
                r0 = 50000000(0x2faf080, float:3.6872239E-37)
                r2.offloadBufferDurationUs = r0
                r0 = 2
                r2.ac3BufferMultiplicationFactor = r0
                return
        }

        public static /* synthetic */ int access$000(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.minPcmBufferDurationUs
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.maxPcmBufferDurationUs
                return r0
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.pcmBufferMultiplicationFactor
                return r0
        }

        public static /* synthetic */ int access$300(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.passthroughBufferDurationUs
                return r0
        }

        public static /* synthetic */ int access$400(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.offloadBufferDurationUs
                return r0
        }

        public static /* synthetic */ int access$500(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r0) {
                int r0 = r0.ac3BufferMultiplicationFactor
                return r0
        }

        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider build() {
                r1 = this;
                com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider r0 = new com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider
                r0.<init>(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setAc3BufferMultiplicationFactor(int r1) {
                r0 = this;
                r0.ac3BufferMultiplicationFactor = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setMaxPcmBufferDurationUs(int r1) {
                r0 = this;
                r0.maxPcmBufferDurationUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setMinPcmBufferDurationUs(int r1) {
                r0 = this;
                r0.minPcmBufferDurationUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setOffloadBufferDurationUs(int r1) {
                r0 = this;
                r0.offloadBufferDurationUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setPassthroughBufferDurationUs(int r1) {
                r0 = this;
                r0.passthroughBufferDurationUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder setPcmBufferMultiplicationFactor(int r1) {
                r0 = this;
                r0.pcmBufferMultiplicationFactor = r1
                return r0
        }
    }

    public DefaultAudioTrackBufferSizeProvider(com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$000(r2)
            r1.minPcmBufferDurationUs = r0
            int r0 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$100(r2)
            r1.maxPcmBufferDurationUs = r0
            int r0 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$200(r2)
            r1.pcmBufferMultiplicationFactor = r0
            int r0 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$300(r2)
            r1.passthroughBufferDurationUs = r0
            int r0 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$400(r2)
            r1.offloadBufferDurationUs = r0
            int r2 = com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder.access$500(r2)
            r1.ac3BufferMultiplicationFactor = r2
            return
    }

    public static int getMaximumEncodedRateBytesPerSecond(int r0) {
            switch(r0) {
                case 5: goto L36;
                case 6: goto L32;
                case 7: goto L2e;
                case 8: goto L2a;
                case 9: goto L26;
                case 10: goto L22;
                case 11: goto L1f;
                case 12: goto L1c;
                case 13: goto L3;
                case 14: goto L18;
                case 15: goto L15;
                case 16: goto L11;
                case 17: goto Ld;
                case 18: goto L32;
                case 19: goto L3;
                case 20: goto L9;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L9:
            r0 = 63750(0xf906, float:8.9333E-41)
            return r0
        Ld:
            r0 = 336000(0x52080, float:4.70836E-40)
            return r0
        L11:
            r0 = 256000(0x3e800, float:3.58732E-40)
            return r0
        L15:
            r0 = 8000(0x1f40, float:1.121E-41)
            return r0
        L18:
            r0 = 3062500(0x2ebae4, float:4.291477E-39)
            return r0
        L1c:
            r0 = 7000(0x1b58, float:9.809E-42)
            return r0
        L1f:
            r0 = 16000(0x3e80, float:2.2421E-41)
            return r0
        L22:
            r0 = 100000(0x186a0, float:1.4013E-40)
            return r0
        L26:
            r0 = 40000(0x9c40, float:5.6052E-41)
            return r0
        L2a:
            r0 = 2250000(0x225510, float:3.152922E-39)
            return r0
        L2e:
            r0 = 192000(0x2ee00, float:2.6905E-40)
            return r0
        L32:
            r0 = 768000(0xbb800, float:1.076197E-39)
            return r0
        L36:
            r0 = 80000(0x13880, float:1.12104E-40)
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int r8, int r9, int r10, int r11, int r12, int r13, double r14) {
            r7 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r2 = 1
            if (r10 == 0) goto L44
            if (r10 == r2) goto L34
            r12 = 2
            if (r10 != r12) goto L2e
            int r10 = r7.passthroughBufferDurationUs
            r12 = 5
            if (r9 != r12) goto L14
            int r12 = r7.ac3BufferMultiplicationFactor
            int r10 = r10 * r12
        L14:
            r12 = -1
            if (r13 == r12) goto L20
            r9 = 8
            java.math.RoundingMode r12 = java.math.RoundingMode.CEILING
            int r9 = com.google.common.math.IntMath.divide(r13, r9, r12)
            goto L24
        L20:
            int r9 = getMaximumEncodedRateBytesPerSecond(r9)
        L24:
            long r12 = (long) r10
            long r9 = (long) r9
            long r12 = r12 * r9
            long r12 = r12 / r0
            int r9 = com.google.common.primitives.Ints.checkedCast(r12)
            goto L66
        L2e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L34:
            int r9 = getMaximumEncodedRateBytesPerSecond(r9)
            int r10 = r7.offloadBufferDurationUs
            long r12 = (long) r10
            long r9 = (long) r9
            long r12 = r12 * r9
            long r12 = r12 / r0
            int r9 = com.google.common.primitives.Ints.checkedCast(r12)
            goto L66
        L44:
            int r9 = r7.pcmBufferMultiplicationFactor
            int r9 = r9 * r8
            int r10 = r7.minPcmBufferDurationUs
            long r3 = (long) r10
            long r12 = (long) r12
            long r3 = r3 * r12
            long r5 = (long) r11
            long r3 = r3 * r5
            long r3 = r3 / r0
            int r10 = com.google.common.primitives.Ints.checkedCast(r3)
            int r3 = r7.maxPcmBufferDurationUs
            long r3 = (long) r3
            long r3 = r3 * r12
            long r3 = r3 * r5
            long r3 = r3 / r0
            int r12 = com.google.common.primitives.Ints.checkedCast(r3)
            int r9 = com.google.android.exoplayer2.util.Util.constrainValue(r9, r10, r12)
        L66:
            double r9 = (double) r9
            double r9 = r9 * r14
            int r9 = (int) r9
            int r8 = java.lang.Math.max(r8, r9)
            int r8 = r8 + r11
            int r8 = r8 - r2
            int r8 = r8 / r11
            int r8 = r8 * r11
            return r8
    }
}
