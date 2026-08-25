package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zac implements com.google.android.gms.dynamic.zah {
    public final /* synthetic */ android.os.Bundle zaa;
    public final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zab;

    public zac(com.google.android.gms.dynamic.DeferredLifecycleHelper r1, android.os.Bundle r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r2) {
            r1 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r2 = r1.zab
            com.google.android.gms.dynamic.LifecycleDelegate r2 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r2)
            android.os.Bundle r0 = r1.zaa
            r2.onCreate(r0)
            return
    }
}
