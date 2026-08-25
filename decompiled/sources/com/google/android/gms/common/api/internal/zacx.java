package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zacx implements com.google.android.gms.tasks.Continuation<java.lang.Boolean, java.lang.Void> {
    public zacx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Void then(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<java.lang.Boolean> r4) throws java.lang.Exception {
            r3 = this;
            java.lang.Object r4 = r4.getResult()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Le
            r4 = 0
            return r4
        Le:
            com.google.android.gms.common.api.ApiException r4 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 13
            java.lang.String r2 = "listener already unregistered"
            r0.<init>(r1, r2)
            r4.<init>(r0)
            throw r4
    }
}
