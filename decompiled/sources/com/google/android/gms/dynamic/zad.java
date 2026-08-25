package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zad implements com.google.android.gms.dynamic.zah {
    public final /* synthetic */ android.widget.FrameLayout zaa;
    public final /* synthetic */ android.view.LayoutInflater zab;
    public final /* synthetic */ android.view.ViewGroup zac;
    public final /* synthetic */ android.os.Bundle zad;
    public final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zae;

    public zad(com.google.android.gms.dynamic.DeferredLifecycleHelper r1, android.widget.FrameLayout r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r0 = this;
            r0.zae = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.zad = r5
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r5) {
            r4 = this;
            android.widget.FrameLayout r5 = r4.zaa
            r5.removeAllViews()
            android.widget.FrameLayout r5 = r4.zaa
            com.google.android.gms.dynamic.DeferredLifecycleHelper r0 = r4.zae
            com.google.android.gms.dynamic.LifecycleDelegate r0 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r0)
            android.view.LayoutInflater r1 = r4.zab
            android.view.ViewGroup r2 = r4.zac
            android.os.Bundle r3 = r4.zad
            android.view.View r0 = r0.onCreateView(r1, r2, r3)
            r5.addView(r0)
            return
    }
}
