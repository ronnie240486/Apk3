package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaClock {
    com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r1);
}
