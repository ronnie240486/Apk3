package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistTracker {

    /* JADX INFO: loaded from: classes3.dex */
    public interface Factory {
        com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker createTracker(com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r1, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(android.net.Uri r1, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r2, boolean r3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PlaylistResetException extends java.io.IOException {
        public final android.net.Uri url;

        public PlaylistResetException(android.net.Uri r1) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                return
        }
    }

    public static final class PlaylistStuckException extends java.io.IOException {
        public final android.net.Uri url;

        public PlaylistStuckException(android.net.Uri r1) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1);
    }

    void addListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener r1);

    boolean excludeMediaPlaylist(android.net.Uri r1, long r2);

    long getInitialStartTimeUs();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist getMultivariantPlaylist();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot(android.net.Uri r1, boolean r2);

    boolean isLive();

    boolean isSnapshotValid(android.net.Uri r1);

    void maybeThrowPlaylistRefreshError(android.net.Uri r1) throws java.io.IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws java.io.IOException;

    void refreshPlaylist(android.net.Uri r1);

    void removeListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener r1);

    void start(android.net.Uri r1, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r2, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener r3);

    void stop();
}
