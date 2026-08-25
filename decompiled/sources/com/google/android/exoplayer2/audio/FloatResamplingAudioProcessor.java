package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
final class FloatResamplingAudioProcessor extends com.google.android.exoplayer2.audio.BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = 0;
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    static {
            r0 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.floatToIntBits(r0)
            com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor.FLOAT_NAN_AS_INT = r0
            return
    }

    public FloatResamplingAudioProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void writePcm32BitFloat(int r4, java.nio.ByteBuffer r5) {
            double r0 = (double) r4
            r2 = 4467570830353629184(0x3e00000000200000, double:4.656612875245797E-10)
            double r0 = r0 * r2
            float r4 = (float) r0
            int r4 = java.lang.Float.floatToIntBits(r4)
            int r0 = com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor.FLOAT_NAN_AS_INT
            if (r4 != r0) goto L16
            r4 = 0
            int r4 = java.lang.Float.floatToIntBits(r4)
        L16:
            r5.putInt(r4)
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r4) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r3 = this;
            int r0 = r4.encoding
            boolean r1 = com.google.android.exoplayer2.util.Util.isEncodingHighResolutionPcm(r0)
            if (r1 == 0) goto L18
            r1 = 4
            if (r0 == r1) goto L15
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = new com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat
            int r2 = r4.sampleRate
            int r4 = r4.channelCount
            r0.<init>(r2, r4, r1)
            goto L17
        L15:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
        L17:
            return r0
        L18:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r6) {
            r5 = this;
            int r0 = r6.position()
            int r1 = r6.limit()
            int r2 = r1 - r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r3 = r5.inputAudioFormat
            int r3 = r3.encoding
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 == r4) goto L4f
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 != r4) goto L49
            java.nio.ByteBuffer r2 = r5.replaceOutputBuffer(r2)
        L1a:
            if (r0 >= r1) goto L7d
            byte r3 = r6.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 1
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            int r4 = r0 + 2
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            int r4 = r0 + 3
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r3 = r3 | r4
            writePcm32BitFloat(r3, r2)
            int r0 = r0 + 4
            goto L1a
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L4f:
            int r2 = r2 / 3
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = r5.replaceOutputBuffer(r2)
        L57:
            if (r0 >= r1) goto L7d
            byte r3 = r6.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r4 = r0 + 1
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            int r4 = r0 + 2
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r3 = r3 | r4
            writePcm32BitFloat(r3, r2)
            int r0 = r0 + 3
            goto L57
        L7d:
            int r0 = r6.limit()
            r6.position(r0)
            r2.flip()
            return
    }
}
