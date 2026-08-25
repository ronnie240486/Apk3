package com.flextv.livestore.activities.mobile;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LiveChannelMobileActivity$$ExternalSyntheticLambda0 implements com.flextv.livestore.helper.RealmChangeItemListener, androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener {
    public final /* synthetic */ com.flextv.livestore.activities.mobile.LiveChannelMobileActivity f$0;

    public /* synthetic */ LiveChannelMobileActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = r1.f$0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.m81$r8$lambda$7_tb4DLF3mwjf3ApCSpifoONo(r0, r2)
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.m82$r8$lambda$tMxPjZ6iUGSHce6GAZRGwsCU0E(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener
    public final void onSelectCurrentChannel(com.flextv.livestore.models.EPGChannel r2) {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.$r8$lambda$c_uj51BGZ6dqTKUx1n4nP_Pj7UM(r0, r2)
            return
    }
}
