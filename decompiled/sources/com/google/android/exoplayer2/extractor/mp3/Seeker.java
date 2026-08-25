package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
interface Seeker extends com.google.android.exoplayer2.extractor.SeekMap {

    /* JADX INFO: loaded from: classes3.dex */
    public static class UnseekableSeeker extends com.google.android.exoplayer2.extractor.SeekMap.Unseekable implements com.google.android.exoplayer2.extractor.mp3.Seeker {
        public UnseekableSeeker() {
                r2 = this;
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.<init>(r0)
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
                r1 = 0
                return r1
        }
    }

    long getDataEndPosition();

    long getTimeUs(long r1);
}
