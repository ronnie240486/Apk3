package androidx.activity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ComponentDialog$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ComponentDialog$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L55;
                case 2: goto L4d;
                case 3: goto L45;
                case 4: goto L3d;
                case 5: goto L35;
                case 6: goto L2d;
                case 7: goto L25;
                case 8: goto L1d;
                case 9: goto L15;
                case 10: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f$0
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomappbar.BottomAppBar.m280$r8$lambda$w7TZ1dukS0NyaoArwjwMZK7iE(r0)
            return
        Ld:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector r0 = (com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector) r0
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.m189$r8$lambda$7qCi01KBI5__9dONi6GjpRtMPc(r0)
            return
        L15:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0 = (com.flextv.livestore.dlgfragment.SearchChannelDlgFragment) r0
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment.$r8$lambda$NsIvHmWUrTn6PpNqaazIVL91nQw(r0)
            return
        L1d:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.mobile.SeriesMobilePlayer r0 = (com.flextv.livestore.activities.mobile.SeriesMobilePlayer) r0
            com.flextv.livestore.activities.mobile.SeriesMobilePlayer.$r8$lambda$MAj9qJshAVP0L0M9xJyZvOuGJVI(r0)
            return
        L25:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.mobile.MovieMobilePlayer r0 = (com.flextv.livestore.activities.mobile.MovieMobilePlayer) r0
            com.flextv.livestore.activities.mobile.MovieMobilePlayer.m87$r8$lambda$Vk1clhxg4ieokHs6cEoIyq3IUI(r0)
            return
        L2d:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveMobileActivity r0 = (com.flextv.livestore.activities.mobile.LiveMobileActivity) r0
            com.flextv.livestore.activities.mobile.LiveMobileActivity.$r8$lambda$sl9M4m8wIbdsfoNFEzcbhcGlERs(r0)
            return
        L35:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = (com.flextv.livestore.activities.mobile.LiveChannelMobileActivity) r0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.$r8$lambda$3ic9_15xMeYOqeuiZm98UjcWM8w(r0)
            return
        L3d:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.CatchUpPlayerActivity r0 = (com.flextv.livestore.activities.CatchUpPlayerActivity) r0
            com.flextv.livestore.activities.CatchUpPlayerActivity.m48$r8$lambda$x4gJvdi4Tqv9U63mlXsrdHL0Q(r0)
            return
        L45:
            java.lang.Object r0 = r1.f$0
            androidx.constraintlayout.helper.widget.Carousel r0 = (androidx.constraintlayout.helper.widget.Carousel) r0
            androidx.constraintlayout.helper.widget.Carousel.m6$r8$lambda$NfsCQvYOydIR2JH7qqFadhs0gY(r0)
            return
        L4d:
            java.lang.Object r0 = r1.f$0
            androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
            r0.onBackPressed()
            return
        L55:
            java.lang.Object r0 = r1.f$0
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateMenu()
            return
        L5d:
            java.lang.Object r0 = r1.f$0
            androidx.activity.ComponentDialog r0 = (androidx.activity.ComponentDialog) r0
            androidx.activity.ComponentDialog.$r8$lambda$3VrmmHeIN9Sasz9FquQXdvV7x_o(r0)
            return
    }
}
