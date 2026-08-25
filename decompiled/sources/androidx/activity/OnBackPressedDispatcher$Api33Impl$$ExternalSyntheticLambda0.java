package androidx.activity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0 implements android.window.OnBackInvokedCallback {
    public final /* synthetic */ java.lang.Runnable f$0;

    public /* synthetic */ OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
            r1 = this;
            java.lang.Runnable r0 = r1.f$0
            r0.run()
            return
    }
}
