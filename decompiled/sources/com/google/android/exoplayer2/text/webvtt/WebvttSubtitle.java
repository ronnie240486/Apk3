package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public static /* synthetic */ int $r8$lambda$6TuP2ixuvA2bH4nhA1WV45ZOrAo(com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r0, com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r1) {
            int r0 = lambda$getCues$0(r0, r1)
            return r0
    }

    public WebvttSubtitle(java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> r7) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.cueInfos = r0
            int r0 = r7.size()
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r6.cueTimesUs = r0
            r0 = 0
        L19:
            int r1 = r7.size()
            if (r0 >= r1) goto L36
            java.lang.Object r1 = r7.get(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r1 = (com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) r1
            int r2 = r0 * 2
            long[] r3 = r6.cueTimesUs
            long r4 = r1.startTimeUs
            r3[r2] = r4
            int r2 = r2 + 1
            long r4 = r1.endTimeUs
            r3[r2] = r4
            int r0 = r0 + 1
            goto L19
        L36:
            long[] r7 = r6.cueTimesUs
            int r0 = r7.length
            long[] r7 = java.util.Arrays.copyOf(r7, r0)
            r6.sortedCueTimesUs = r7
            java.util.Arrays.sort(r7)
            return
    }

    private static /* synthetic */ int lambda$getCues$0(com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r2, com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r3) {
            long r0 = r2.startTimeUs
            long r2 = r3.startTimeUs
            int r2 = java.lang.Long.compare(r0, r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Lc:
            java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> r4 = r9.cueInfos
            int r4 = r4.size()
            if (r3 >= r4) goto L43
            long[] r4 = r9.cueTimesUs
            int r5 = r3 * 2
            r6 = r4[r5]
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 > 0) goto L40
            int r5 = r5 + 1
            r5 = r4[r5]
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L40
            java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> r4 = r9.cueInfos
            java.lang.Object r4 = r4.get(r3)
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r4 = (com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) r4
            com.google.android.exoplayer2.text.Cue r5 = r4.cue
            float r6 = r5.line
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r1.add(r4)
            goto L40
        L3d:
            r0.add(r5)
        L40:
            int r3 = r3 + 1
            goto Lc
        L43:
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 r10 = com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0.INSTANCE
            java.util.Collections.sort(r1, r10)
        L48:
            int r10 = r1.size()
            if (r2 >= r10) goto L6c
            java.lang.Object r10 = r1.get(r2)
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r10 = (com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) r10
            com.google.android.exoplayer2.text.Cue r10 = r10.cue
            com.google.android.exoplayer2.text.Cue$Builder r10 = r10.buildUpon()
            int r11 = (-1) - r2
            float r11 = (float) r11
            r3 = 1
            com.google.android.exoplayer2.text.Cue$Builder r10 = r10.setLine(r11, r3)
            com.google.android.exoplayer2.text.Cue r10 = r10.build()
            r0.add(r10)
            int r2 = r2 + 1
            goto L48
        L6c:
            return r0
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
            long[] r2 = r3.sortedCueTimesUs
            int r2 = r2.length
            if (r4 >= r2) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            long[] r0 = r3.sortedCueTimesUs
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
            r1 = this;
            long[] r0 = r1.sortedCueTimesUs
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long r3) {
            r2 = this;
            long[] r0 = r2.sortedCueTimesUs
            r1 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r0, r3, r1, r1)
            long[] r4 = r2.sortedCueTimesUs
            int r4 = r4.length
            if (r3 >= r4) goto Ld
            goto Le
        Ld:
            r3 = -1
        Le:
            return r3
    }
}
