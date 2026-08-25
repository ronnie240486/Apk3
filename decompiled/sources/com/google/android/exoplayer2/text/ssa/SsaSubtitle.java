package com.google.android.exoplayer2.text.ssa;

/* JADX INFO: loaded from: classes2.dex */
final class SsaSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<java.lang.Long> cueTimesUs;
    private final java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> cues;

    public SsaSubtitle(java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> r1, java.util.List<java.lang.Long> r2) {
            r0 = this;
            r0.<init>()
            r0.cues = r1
            r0.cueTimesUs = r2
            return
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r3) {
            r2 = this;
            java.util.List<java.lang.Long> r0 = r2.cueTimesUs
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r1 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r4, r1)
            r4 = -1
            if (r3 != r4) goto L14
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
        L14:
            java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> r4 = r2.cues
            java.lang.Object r3 = r4.get(r3)
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            java.util.List<java.lang.Long> r2 = r3.cueTimesUs
            int r2 = r2.size()
            if (r4 >= r2) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.util.List<java.lang.Long> r0 = r3.cueTimesUs
            java.lang.Object r4 = r0.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
            r1 = this;
            java.util.List<java.lang.Long> r0 = r1.cueTimesUs
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long r2) {
            r1 = this;
            java.util.List<java.lang.Long> r0 = r1.cueTimesUs
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            int r2 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r0, r2, r3, r3)
            java.util.List<java.lang.Long> r3 = r1.cueTimesUs
            int r3 = r3.size()
            if (r2 >= r3) goto L14
            goto L15
        L14:
            r2 = -1
        L15:
            return r2
    }
}
