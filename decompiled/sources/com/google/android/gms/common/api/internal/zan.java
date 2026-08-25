package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zan extends com.google.android.gms.common.api.internal.zabw {
    public final /* synthetic */ android.app.Dialog zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zao zab;

    public zan(com.google.android.gms.common.api.internal.zao r1, android.app.Dialog r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
            r1 = this;
            com.google.android.gms.common.api.internal.zao r0 = r1.zab
            com.google.android.gms.common.api.internal.zap r0 = r0.zaa
            com.google.android.gms.common.api.internal.zap.zag(r0)
            android.app.Dialog r0 = r1.zaa
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            android.app.Dialog r0 = r1.zaa
            r0.dismiss()
        L14:
            return
    }
}
