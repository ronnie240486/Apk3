package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsManifest {

    @java.lang.Deprecated
    public final com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist masterPlaylist;
    public final com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist mediaPlaylist;
    public final com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;

    public HlsManifest(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r14, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r15) {
            r13 = this;
            r13.<init>()
            r13.multivariantPlaylist = r14
            r13.mediaPlaylist = r15
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r15 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist
            java.lang.String r1 = r14.baseUri
            java.util.List<java.lang.String> r2 = r14.tags
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r3 = r14.variants
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r4 = r14.videos
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r5 = r14.audios
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r6 = r14.subtitles
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r7 = r14.closedCaptions
            com.google.android.exoplayer2.Format r8 = r14.muxedAudioFormat
            java.util.List<com.google.android.exoplayer2.Format> r9 = r14.muxedCaptionFormats
            boolean r10 = r14.hasIndependentSegments
            java.util.Map<java.lang.String, java.lang.String> r11 = r14.variableDefinitions
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r12 = r14.sessionKeyDrmInitData
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.masterPlaylist = r15
            return
    }
}
