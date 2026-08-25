package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zaa implements com.google.android.gms.dynamic.OnDelegateCreatedListener {
    public final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    public zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate r3) {
            r2 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r0 = r2.zaa
            com.google.android.gms.dynamic.DeferredLifecycleHelper.zac(r0, r3)
            com.google.android.gms.dynamic.DeferredLifecycleHelper r3 = r2.zaa
            java.util.LinkedList r3 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(r3)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            com.google.android.gms.dynamic.zah r0 = (com.google.android.gms.dynamic.zah) r0
            com.google.android.gms.dynamic.DeferredLifecycleHelper r1 = r2.zaa
            com.google.android.gms.dynamic.LifecycleDelegate r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r1)
            r0.zab(r1)
            goto Lf
        L25:
            com.google.android.gms.dynamic.DeferredLifecycleHelper r3 = r2.zaa
            java.util.LinkedList r3 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(r3)
            r3.clear()
            com.google.android.gms.dynamic.DeferredLifecycleHelper r3 = r2.zaa
            com.google.android.gms.dynamic.DeferredLifecycleHelper.zad(r3)
            return
    }
}
