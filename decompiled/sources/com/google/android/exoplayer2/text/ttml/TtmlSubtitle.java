package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final long[] eventTimesUs;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> globalStyles;
    private final java.util.Map<java.lang.String, java.lang.String> imageMap;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> regionMap;
    private final com.google.android.exoplayer2.text.ttml.TtmlNode root;

    public TtmlSubtitle(com.google.android.exoplayer2.text.ttml.TtmlNode r1, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r2, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r0 = this;
            r0.<init>()
            r0.root = r1
            r0.regionMap = r3
            r0.imageMap = r4
            if (r2 == 0) goto L10
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            goto L14
        L10:
            java.util.Map r2 = java.util.Collections.emptyMap()
        L14:
            r0.globalStyles = r2
            long[] r1 = r1.getEventTimesUs()
            r0.eventTimesUs = r1
            return
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r7) {
            r6 = this;
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = r6.root
            java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r3 = r6.globalStyles
            java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r4 = r6.regionMap
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.imageMap
            r1 = r7
            java.util.List r7 = r0.getCues(r1, r3, r4, r5)
            return r7
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int r4) {
            r3 = this;
            long[] r0 = r3.eventTimesUs
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
            r1 = this;
            long[] r0 = r1.eventTimesUs
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long r3) {
            r2 = this;
            long[] r0 = r2.eventTimesUs
            r1 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r0, r3, r1, r1)
            long[] r4 = r2.eventTimesUs
            int r4 = r4.length
            if (r3 >= r4) goto Ld
            goto Le
        Ld:
            r3 = -1
        Le:
            return r3
    }
}
