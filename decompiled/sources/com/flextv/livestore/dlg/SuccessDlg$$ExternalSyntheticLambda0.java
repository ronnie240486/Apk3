package com.flextv.livestore.dlg;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SuccessDlg$$ExternalSyntheticLambda0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ SuccessDlg$$ExternalSyntheticLambda0(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.dlg.SuccessDlg r0 = (com.flextv.livestore.dlg.SuccessDlg) r0
            java.lang.Object r1 = r2.f$1
            com.flextv.livestore.dlg.SuccessDlg$OkButtonClickListener r1 = (com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener) r1
            com.flextv.livestore.dlg.SuccessDlg.$r8$lambda$OF0TBiG6rOwq01aAlkwCc80Tgug(r0, r1, r3)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.flextv.livestore.dlg.SuccessDlg r0 = (com.flextv.livestore.dlg.SuccessDlg) r0
            java.lang.Object r1 = r2.f$1
            com.flextv.livestore.dlg.SuccessDlg$OkButtonClickListener r1 = (com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener) r1
            com.flextv.livestore.dlg.SuccessDlg.m120$r8$lambda$8fvfpSCg1yzpxlbceJNVwLbVZk(r0, r1, r3)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.material.snackbar.Snackbar r0 = (com.google.android.material.snackbar.Snackbar) r0
            java.lang.Object r1 = r2.f$1
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            com.google.android.material.snackbar.Snackbar.m291$r8$lambda$4rINiMZz55Dc47hSTCuzALWyEw(r0, r1, r3)
            return
    }
}
