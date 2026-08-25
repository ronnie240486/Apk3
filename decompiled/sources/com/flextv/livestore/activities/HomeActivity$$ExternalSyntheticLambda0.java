package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HomeActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener, androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.AccountDlgFragment.PayButtonClickListener {
    public final /* synthetic */ com.flextv.livestore.activities.HomeActivity f$0;

    public /* synthetic */ HomeActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.HomeActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.HomeActivity r0 = r1.f$0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.HomeActivity.m52$r8$lambda$SvaEQ37hIvvLxDd7dJZVbj16Q(r0, r2)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.AccountDlgFragment.PayButtonClickListener
    public final void onPayButtonClicked() {
            r1 = this;
            com.flextv.livestore.activities.HomeActivity r0 = r1.f$0
            com.flextv.livestore.activities.HomeActivity.$r8$lambda$WbPkpSXMw5MKLhOhUBDuMpTS46c(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener
    public final void onRetryClick() {
            r1 = this;
            com.flextv.livestore.activities.HomeActivity r0 = r1.f$0
            com.flextv.livestore.activities.HomeActivity.$r8$lambda$kn6NdZpjkNECc63I5cQZXLnMOuc(r0)
            return
    }
}
