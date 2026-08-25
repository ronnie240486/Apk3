package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LiveActivity$$ExternalSyntheticLambda1 implements com.flextv.livestore.helper.RealmChangeItemListener, androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener {
    public final /* synthetic */ com.flextv.livestore.activities.LiveActivity f$0;

    public /* synthetic */ LiveActivity$$ExternalSyntheticLambda1(com.flextv.livestore.activities.LiveActivity r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.activities.LiveActivity r0 = r1.f$0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.LiveActivity.$r8$lambda$y3gbUPHxhhShnNHlCuk9ZdM6ydQ(r0, r2)
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r1 = this;
            com.flextv.livestore.activities.LiveActivity r0 = r1.f$0
            com.flextv.livestore.activities.LiveActivity.$r8$lambda$X1VBSCKeMEfPvjKyGqEQih6zTQc(r0)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener
    public final void onSelectCurrentChannel(com.flextv.livestore.models.EPGChannel r2) {
            r1 = this;
            com.flextv.livestore.activities.LiveActivity r0 = r1.f$0
            com.flextv.livestore.activities.LiveActivity.m54$r8$lambda$BZYU1S9MpAj6ygdXihrvf1RT30(r0, r2)
            return
    }
}
