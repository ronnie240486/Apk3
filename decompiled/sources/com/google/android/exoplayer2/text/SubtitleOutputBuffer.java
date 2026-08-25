package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer implements com.google.android.exoplayer2.text.Subtitle {
    private long subsampleOffsetUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.Subtitle subtitle;

    public SubtitleOutputBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
            r1 = this;
            super.clear()
            r0 = 0
            r1.subtitle = r0
            return
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r4) {
            r3 = this;
            com.google.android.exoplayer2.text.Subtitle r0 = r3.subtitle
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.Subtitle r0 = (com.google.android.exoplayer2.text.Subtitle) r0
            long r1 = r3.subsampleOffsetUs
            long r4 = r4 - r1
            java.util.List r4 = r0.getCues(r4)
            return r4
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int r5) {
            r4 = this;
            com.google.android.exoplayer2.text.Subtitle r0 = r4.subtitle
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.Subtitle r0 = (com.google.android.exoplayer2.text.Subtitle) r0
            long r0 = r0.getEventTime(r5)
            long r2 = r4.subsampleOffsetUs
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
            r1 = this;
            com.google.android.exoplayer2.text.Subtitle r0 = r1.subtitle
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.Subtitle r0 = (com.google.android.exoplayer2.text.Subtitle) r0
            int r0 = r0.getEventTimeCount()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long r4) {
            r3 = this;
            com.google.android.exoplayer2.text.Subtitle r0 = r3.subtitle
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.Subtitle r0 = (com.google.android.exoplayer2.text.Subtitle) r0
            long r1 = r3.subsampleOffsetUs
            long r4 = r4 - r1
            int r4 = r0.getNextEventTimeIndex(r4)
            return r4
    }

    public void setContent(long r3, com.google.android.exoplayer2.text.Subtitle r5, long r6) {
            r2 = this;
            r2.timeUs = r3
            r2.subtitle = r5
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto Le
            goto Lf
        Le:
            r3 = r6
        Lf:
            r2.subsampleOffsetUs = r3
            return
    }
}
