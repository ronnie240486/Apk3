package com.google.android.exoplayer2.text.cea;

/* JADX INFO: loaded from: classes2.dex */
final class CeaSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<com.google.android.exoplayer2.text.Cue> cues;

    public CeaSubtitle(java.util.List<com.google.android.exoplayer2.text.Cue> r1) {
            r0 = this;
            r0.<init>()
            r0.cues = r1
            return
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            java.util.List<com.google.android.exoplayer2.text.Cue> r4 = r3.cues
            goto Ld
        L9:
            java.util.List r4 = java.util.Collections.emptyList()
        Ld:
            return r4
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 1
            goto L5
        L4:
            r3 = 0
        L5:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
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
    public int getNextEventTimeIndex(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r4 = 0
            goto L9
        L8:
            r4 = -1
        L9:
            return r4
    }
}
