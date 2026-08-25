package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes.dex */
public interface AdsLoader {

    public interface EventListener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.AdsLoader$EventListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAdClicked(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r0) {
                    return
            }

            public static void $default$onAdLoadError(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r0, com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException r1, com.google.android.exoplayer2.upstream.DataSpec r2) {
                    return
            }

            public static void $default$onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r0, com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
                    return
            }

            public static void $default$onAdTapped(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r0) {
                    return
            }
        }

        void onAdClicked();

        void onAdLoadError(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException r1, com.google.android.exoplayer2.upstream.DataSpec r2);

        void onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r1);

        void onAdTapped();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Provider {
        @androidx.annotation.Nullable
        com.google.android.exoplayer2.source.ads.AdsLoader getAdsLoader(com.google.android.exoplayer2.MediaItem.AdsConfiguration r1);
    }

    void handlePrepareComplete(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, int r2, int r3);

    void handlePrepareError(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, int r2, int r3, java.io.IOException r4);

    void release();

    void setPlayer(@androidx.annotation.Nullable com.google.android.exoplayer2.Player r1);

    void setSupportedContentTypes(int... r1);

    void start(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, java.lang.Object r3, com.google.android.exoplayer2.ui.AdViewProvider r4, com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r5);

    void stop(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, com.google.android.exoplayer2.source.ads.AdsLoader.EventListener r2);
}
