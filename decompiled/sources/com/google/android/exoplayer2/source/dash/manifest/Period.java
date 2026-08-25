package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class Period {
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> adaptationSets;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.dash.manifest.Descriptor assetIdentifier;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> eventStreams;

    @androidx.annotation.Nullable
    public final java.lang.String id;
    public final long startMs;

    public Period(@androidx.annotation.Nullable java.lang.String r8, long r9, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r11) {
            r7 = this;
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r5, r6)
            return
    }

    public Period(@androidx.annotation.Nullable java.lang.String r8, long r9, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r11, java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            return
    }

    public Period(@androidx.annotation.Nullable java.lang.String r1, long r2, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r4, java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r5, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.Descriptor r6) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.startMs = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.adaptationSets = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.eventStreams = r1
            r0.assetIdentifier = r6
            return
    }

    public int getAdaptationSetIndex(int r4) {
            r3 = this;
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r0 = r3.adaptationSets
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r3.adaptationSets
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            int r2 = r2.type
            if (r2 != r4) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r4 = -1
            return r4
    }
}
