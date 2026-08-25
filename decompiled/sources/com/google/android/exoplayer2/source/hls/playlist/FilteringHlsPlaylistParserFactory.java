package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes2.dex */
public final class FilteringHlsPlaylistParserFactory implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory {
    private final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory;
    private final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;

    public FilteringHlsPlaylistParserFactory(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r1, java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2) {
            r0 = this;
            r0.<init>()
            r0.hlsPlaylistParserFactory = r1
            r0.streamKeys = r2
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    public com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser() {
            r3 = this;
            com.google.android.exoplayer2.offline.FilteringManifestParser r0 = new com.google.android.exoplayer2.offline.FilteringManifestParser
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r1 = r3.hlsPlaylistParserFactory
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser r1 = r1.createPlaylistParser()
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r3.streamKeys
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    public com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r4) {
            r2 = this;
            com.google.android.exoplayer2.offline.FilteringManifestParser r0 = new com.google.android.exoplayer2.offline.FilteringManifestParser
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r1 = r2.hlsPlaylistParserFactory
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser r3 = r1.createPlaylistParser(r3, r4)
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r4 = r2.streamKeys
            r0.<init>(r3, r4)
            return r0
    }
}
