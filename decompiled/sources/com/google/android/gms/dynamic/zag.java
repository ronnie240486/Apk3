package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zag implements com.google.android.gms.dynamic.zah {
    public final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    public zag(com.google.android.gms.dynamic.DeferredLifecycleHelper r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r1) {
            r0 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r1 = r0.zaa
            com.google.android.gms.dynamic.LifecycleDelegate r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r1)
            r1.onResume()
            return
    }
}
