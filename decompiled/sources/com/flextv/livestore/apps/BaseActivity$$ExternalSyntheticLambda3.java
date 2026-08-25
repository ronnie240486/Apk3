package com.flextv.livestore.apps;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda3 implements com.flextv.livestore.net.NetworkTask.OnExceptionListener, com.flextv.livestore.net.NetworkTask.OnCompleteListener, com.flextv.livestore.net.NetworkTask.OnNetworkUnavailableListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.flextv.livestore.apps.BaseActivity f$0;

    public /* synthetic */ BaseActivity$$ExternalSyntheticLambda3(com.flextv.livestore.apps.BaseActivity r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask.OnCompleteListener
    public final void onComplete(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            java.util.List r2 = (java.util.List) r2
            com.flextv.livestore.apps.BaseActivity.m108$r8$lambda$BZWMRqXgllEU7maNcyp619BT4(r0, r2)
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask.OnExceptionListener
    public final void onException(java.lang.Exception r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto Lc;
                case 2: goto L5;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.m105$r8$lambda$7hEuTESPZ601OCx6sw4AzjLY(r0, r2)
            return
        Lc:
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$jYJq0LQLolOuhmaSUQxp1bqLLeM(r0, r2)
            return
        L12:
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.$r8$lambda$0XCo166mUUBrVIex60Oh0SFpkP4(r0, r2)
            return
        L18:
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.m110$r8$lambda$l7nnitKLMtp31n48eqZnX8ebys(r0, r2)
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask.OnNetworkUnavailableListener
    public final void onNetworkException(android.accounts.NetworkErrorException r2) {
            r1 = this;
            com.flextv.livestore.apps.BaseActivity r0 = r1.f$0
            com.flextv.livestore.apps.BaseActivity.m109$r8$lambda$YzwjBnprNGFJkCxzQ4vn3kO51M(r0, r2)
            return
    }
}
