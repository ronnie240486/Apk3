package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HlsPlaylist implements com.google.android.exoplayer2.offline.FilterableManifest<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> {
    public final java.lang.String baseUri;
    public final boolean hasIndependentSegments;
    public final java.util.List<java.lang.String> tags;

    public HlsPlaylist(java.lang.String r1, java.util.List<java.lang.String> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.baseUri = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.tags = r1
            r0.hasIndependentSegments = r3
            return
    }
}
