package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long r1, long r3);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration r1);

    void setTargetLiveOffsetOverrideUs(long r1);
}
