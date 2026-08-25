package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes2.dex */
final class ConstantBitrateSeeker extends com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    public ConstantBitrateSeeker(long r9, long r11, com.google.android.exoplayer2.audio.MpegAudioUtil.Header r13, boolean r14) {
            r8 = this;
            int r5 = r13.bitrate
            int r6 = r13.frameSize
            r0 = r8
            r1 = r9
            r3 = r11
            r7 = r14
            r0.<init>(r1, r3, r5, r6, r7)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long r1) {
            r0 = this;
            long r1 = r0.getTimeUsAtPosition(r1)
            return r1
    }
}
