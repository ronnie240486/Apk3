package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectorResult {

    @androidx.annotation.Nullable
    public final java.lang.Object info;
    public final int length;
    public final com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurations;
    public final com.google.android.exoplayer2.trackselection.ExoTrackSelection[] selections;
    public final com.google.android.exoplayer2.Tracks tracks;

    public TrackSelectorResult(com.google.android.exoplayer2.RendererConfiguration[] r1, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2, com.google.android.exoplayer2.Tracks r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.rendererConfigurations = r1
            java.lang.Object r2 = r2.clone()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) r2
            r0.selections = r2
            r0.tracks = r3
            r0.info = r4
            int r1 = r1.length
            r0.length = r1
            return
    }

    @java.lang.Deprecated
    public TrackSelectorResult(com.google.android.exoplayer2.RendererConfiguration[] r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r1 = this;
            com.google.android.exoplayer2.Tracks r0 = com.google.android.exoplayer2.Tracks.EMPTY
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public boolean isEquivalent(@androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.TrackSelectorResult r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1e
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r4.selections
            int r1 = r1.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = r3.selections
            int r2 = r2.length
            if (r1 == r2) goto Lc
            goto L1e
        Lc:
            r1 = 0
        Ld:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = r3.selections
            int r2 = r2.length
            if (r1 >= r2) goto L1c
            boolean r2 = r3.isEquivalent(r4, r1)
            if (r2 != 0) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto Ld
        L1c:
            r4 = 1
            return r4
        L1e:
            return r0
    }

    public boolean isEquivalent(@androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.TrackSelectorResult r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.exoplayer2.RendererConfiguration[] r1 = r3.rendererConfigurations
            r1 = r1[r5]
            com.google.android.exoplayer2.RendererConfiguration[] r2 = r4.rendererConfigurations
            r2 = r2[r5]
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r2)
            if (r1 == 0) goto L21
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r3.selections
            r1 = r1[r5]
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r4 = r4.selections
            r4 = r4[r5]
            boolean r4 = com.google.android.exoplayer2.util.Util.areEqual(r1, r4)
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    public boolean isRendererEnabled(int r2) {
            r1 = this;
            com.google.android.exoplayer2.RendererConfiguration[] r0 = r1.rendererConfigurations
            r2 = r0[r2]
            if (r2 == 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }
}
