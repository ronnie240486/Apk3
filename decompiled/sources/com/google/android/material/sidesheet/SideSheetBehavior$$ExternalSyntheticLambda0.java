package com.google.android.material.sidesheet;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SideSheetBehavior$$ExternalSyntheticLambda0 implements com.flextv.livestore.helper.RealmChangeItemListener, androidx.core.view.accessibility.AccessibilityViewCommand {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SideSheetBehavior$$ExternalSyntheticLambda0(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.helper.RealmChangeItemListener
    public final void onItemChanged() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = (com.flextv.livestore.activities.mobile.LiveChannelMobileActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.$r8$lambda$PQRGdOlHtibDZ9nQxt0FlJ5AB6Y(r0, r1)
            return
        L10:
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0 = (com.flextv.livestore.activities.mobile.LiveChannelMobileActivity) r0
            int r1 = r2.f$1
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.$r8$lambda$O9teDMwgvHQZOa8ipZnH7j8aDRQ(r0, r1)
            return
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(android.view.View r3, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r4) {
            r2 = this;
            java.lang.Object r0 = r2.f$0
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            int r1 = r2.f$1
            boolean r3 = com.google.android.material.sidesheet.SideSheetBehavior.m290$r8$lambda$tYSQPZMO83x5k0C9LPAWDLRmyo(r0, r1, r3, r4)
            return r3
    }
}
