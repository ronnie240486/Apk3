package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistParserFactory {
    com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser();

    com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> createPlaylistParser(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2);
}
