package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHlsPlaylistParserFactory implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory {
    public DefaultHlsPlaylistParserFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    public com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser() {
            r1 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser
            r0.<init>()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    public com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3) {
            r1 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser
            r0.<init>(r2, r3)
            return r0
    }
}
