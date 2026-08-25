package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zad extends com.google.android.gms.common.internal.zag {
    public final /* synthetic */ android.content.Intent zaa;
    public final /* synthetic */ android.app.Activity zab;
    public final /* synthetic */ int zac;

    public zad(android.content.Intent r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r3 = this;
            android.content.Intent r0 = r3.zaa
            if (r0 == 0) goto Lb
            android.app.Activity r1 = r3.zab
            int r2 = r3.zac
            r1.startActivityForResult(r0, r2)
        Lb:
            return
    }
}
