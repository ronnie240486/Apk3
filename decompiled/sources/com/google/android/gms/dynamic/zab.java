package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zab implements com.google.android.gms.dynamic.zah {
    public final /* synthetic */ android.app.Activity zaa;
    public final /* synthetic */ android.os.Bundle zab;
    public final /* synthetic */ android.os.Bundle zac;
    public final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zad;

    public zab(com.google.android.gms.dynamic.DeferredLifecycleHelper r1, android.app.Activity r2, android.os.Bundle r3, android.os.Bundle r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r4) {
            r3 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r4 = r3.zad
            com.google.android.gms.dynamic.LifecycleDelegate r4 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r4)
            android.app.Activity r0 = r3.zaa
            android.os.Bundle r1 = r3.zab
            android.os.Bundle r2 = r3.zac
            r4.onInflate(r0, r1, r2)
            return
    }
}
