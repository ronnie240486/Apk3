package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> zaa;

    public zaar(com.google.android.gms.common.api.internal.zaaw r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @androidx.annotation.BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak r4) {
            r3 = this;
            java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> r0 = r3.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaaw r0 = (com.google.android.gms.common.api.internal.zaaw) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r0)
            com.google.android.gms.common.api.internal.zaaq r2 = new com.google.android.gms.common.api.internal.zaaq
            r2.<init>(r0, r0, r4)
            r1.zal(r2)
            return
    }
}
