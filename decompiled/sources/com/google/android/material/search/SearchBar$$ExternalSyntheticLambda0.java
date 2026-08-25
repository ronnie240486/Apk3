package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SearchBar$$ExternalSyntheticLambda0 implements com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener, com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener, com.google.android.exoplayer2.extractor.ExtractorsFactory, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener, com.google.android.material.animation.AnimatableView.Listener {
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ SearchBar$$ExternalSyntheticLambda0(java.lang.Object r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            com.google.android.exoplayer2.extractor.Extractor[] r0 = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.m237$r8$lambda$kCLgPvx_eEewdVW5S3ZC0F5E4I(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri r1, java.util.Map r2) {
            r0 = this;
            com.google.android.exoplayer2.extractor.Extractor[] r1 = com.google.android.exoplayer2.extractor.ExtractorsFactory.CC.$default$createExtractors(r0, r1, r2)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.extractor.ExtractorsFactory r0 = (com.google.android.exoplayer2.extractor.ExtractorsFactory) r0
            com.google.android.exoplayer2.source.ProgressiveMediaExtractor r2 = com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory.$r8$lambda$y4TETOfcSxTmcpg0vTpcLE9i7ek(r0, r2)
            return r2
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
    public void onProgress(long r9, long r11, long r13) {
            r8 = this;
            java.lang.Object r0 = r8.f$0
            r1 = r0
            com.google.android.exoplayer2.offline.ProgressiveDownloader r1 = (com.google.android.exoplayer2.offline.ProgressiveDownloader) r1
            r2 = r9
            r4 = r11
            r6 = r13
            com.google.android.exoplayer2.offline.ProgressiveDownloader.m234$r8$lambda$jTRyQ80tvqq1k5F55r6HxM2p9Y(r1, r2, r4, r6)
            return
    }

    @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(com.google.android.exoplayer2.scheduler.RequirementsWatcher r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.offline.DownloadManager r0 = (com.google.android.exoplayer2.offline.DownloadManager) r0
            com.google.android.exoplayer2.offline.DownloadManager.$r8$lambda$9_Cit3svlv2xVuUzheKnCxLjKrE(r0, r2, r3)
            return
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.material.search.SearchBar r0 = (com.google.android.material.search.SearchBar) r0
            com.google.android.material.search.SearchBar.$r8$lambda$5c5I5ljcFX0E60cUbkIqa0sWZAQ(r0, r2)
            return
    }
}
