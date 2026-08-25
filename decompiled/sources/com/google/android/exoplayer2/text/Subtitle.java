package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes2.dex */
public interface Subtitle {
    java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r1);

    long getEventTime(int r1);

    int getEventTimeCount();

    int getNextEventTimeIndex(long r1);
}
