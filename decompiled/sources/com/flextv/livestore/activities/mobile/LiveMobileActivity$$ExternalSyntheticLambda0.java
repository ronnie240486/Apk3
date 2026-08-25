package com.flextv.livestore.activities.mobile;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LiveMobileActivity$$ExternalSyntheticLambda0 implements androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener, com.flextv.livestore.helper.RealmChangeItemListener {
    public final /* synthetic */ com.flextv.livestore.activities.mobile.LiveMobileActivity f$0;

    public /* synthetic */ LiveMobileActivity$$ExternalSyntheticLambda0(com.flextv.livestore.activities.mobile.LiveMobileActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveMobileActivity r0 = r1.f$0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.mobile.LiveMobileActivity.$r8$lambda$Yobmr7MakffYJM_PFoWZWyYFjp8(r0, r2)
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveMobileActivity r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveMobileActivity.$r8$lambda$H12dY3oqmXrHXah5hx3XS4V5t8c(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener
    public final void onSelectCurrentChannel(com.flextv.livestore.models.EPGChannel r2) {
            r1 = this;
            com.flextv.livestore.activities.mobile.LiveMobileActivity r0 = r1.f$0
            com.flextv.livestore.activities.mobile.LiveMobileActivity.m84$r8$lambda$MKgtMHVBjo00_FTDGh_OuRrZIM(r0, r2)
            return
    }
}
