package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes.dex */
public interface PlaybackSessionManager {

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {
        void onAdPlaybackStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, java.lang.String r3);

        void onSessionActive(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2);

        void onSessionCreated(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2);

        void onSessionFinished(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, boolean r3);
    }

    boolean belongsToSession(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2);

    void finishAllSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    @androidx.annotation.Nullable
    java.lang.String getActiveSessionId();

    java.lang.String getSessionForMediaPeriodId(com.google.android.exoplayer2.Timeline r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);

    void setListener(com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener r1);

    void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void updateSessionsWithTimelineChange(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);
}
