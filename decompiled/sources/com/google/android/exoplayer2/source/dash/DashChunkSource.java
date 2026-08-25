package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public interface DashChunkSource extends com.google.android.exoplayer2.source.chunk.ChunkSource {

    public interface Factory {
        com.google.android.exoplayer2.source.dash.DashChunkSource createDashChunkSource(com.google.android.exoplayer2.upstream.LoaderErrorThrower r1, com.google.android.exoplayer2.source.dash.manifest.DashManifest r2, com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r3, int r4, int[] r5, com.google.android.exoplayer2.trackselection.ExoTrackSelection r6, int r7, long r8, boolean r10, java.util.List<com.google.android.exoplayer2.Format> r11, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler r12, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r13, com.google.android.exoplayer2.analytics.PlayerId r14);
    }

    void updateManifest(com.google.android.exoplayer2.source.dash.manifest.DashManifest r1, int r2);

    void updateTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection r1);
}
