package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zaf extends com.google.android.gms.common.internal.zag {
    public final /* synthetic */ android.content.Intent zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleFragment zab;

    public zaf(android.content.Intent r1, com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r3 = this;
            android.content.Intent r0 = r3.zaa
            if (r0 == 0) goto La
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = r3.zab
            r2 = 2
            r1.startActivityForResult(r0, r2)
        La:
            return
    }
}
