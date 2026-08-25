package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    public final /* synthetic */ com.google.android.gms.common.api.Response zaa;

    public zaq(com.google.android.gms.common.api.Response r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result r2) {
            r1 = this;
            com.google.android.gms.common.api.Response r0 = r1.zaa
            r0.setResult(r2)
            com.google.android.gms.common.api.Response r2 = r1.zaa
            return r2
    }
}
