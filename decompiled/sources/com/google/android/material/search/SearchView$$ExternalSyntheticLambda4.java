package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda4 implements com.google.android.exoplayer2.util.ListenerSet.Event, androidx.core.view.OnApplyWindowInsetsListener {
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda4(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r0
            int r1 = r3.f$1
            int r2 = r3.f$2
            com.google.android.exoplayer2.analytics.AnalyticsListener r4 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r4
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.$r8$lambda$NdBPAXdPfjuofkLwBdfhXC5LLuY(r0, r1, r2, r4)
            return
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r4, androidx.core.view.WindowInsetsCompat r5) {
            r3 = this;
            java.lang.Object r0 = r3.f$0
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.f$1
            int r2 = r3.f$2
            androidx.core.view.WindowInsetsCompat r4 = com.google.android.material.search.SearchView.$r8$lambda$xkENgK0o8NkI6sYdug3w2nASPuk(r0, r1, r2, r4, r5)
            return r4
    }
}
