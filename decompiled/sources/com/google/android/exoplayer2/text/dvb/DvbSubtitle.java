package com.google.android.exoplayer2.text.dvb;

/* JADX INFO: loaded from: classes2.dex */
final class DvbSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<com.google.android.exoplayer2.text.Cue> cues;

    public DvbSubtitle(java.util.List<com.google.android.exoplayer2.text.Cue> r1) {
            r0 = this;
            r0.<init>()
            r0.cues = r1
            return
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r1) {
            r0 = this;
            java.util.List<com.google.android.exoplayer2.text.Cue> r1 = r0.cues
            return r1
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long r1) {
            r0 = this;
            r1 = -1
            return r1
    }
}
