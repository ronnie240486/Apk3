package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LiveChannelActivity$$ExternalSyntheticLambda0 implements androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener, com.flextv.livestore.helper.RealmChangeItemListener {
    public final /* synthetic */ com.flextv.livestore.activities.LiveChannelActivity f$0;

    public /* synthetic */ LiveChannelActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.LiveChannelActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.LiveChannelActivity r0 = r1.f$0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.LiveChannelActivity.m59$r8$lambda$iWoLsL4WMCXLWxxtbh5FvuLOgM(r0, r2)
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            com.flextv.livestore.activities.LiveChannelActivity r0 = r1.f$0
            com.flextv.livestore.activities.LiveChannelActivity.m60$r8$lambda$pJ0ViEHxxntMgfGYtoKvFwBPc(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener
    public final void onSelectCurrentChannel(com.flextv.livestore.models.EPGChannel r2) {
            r1 = this;
            com.flextv.livestore.activities.LiveChannelActivity r0 = r1.f$0
            com.flextv.livestore.activities.LiveChannelActivity.$r8$lambda$C9Naf1vpjmYQntabwSQAt2uAMYE(r0, r2)
            return
    }
}
