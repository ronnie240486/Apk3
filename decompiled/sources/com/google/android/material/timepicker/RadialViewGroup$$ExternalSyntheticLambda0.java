package com.google.android.material.timepicker;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RadialViewGroup$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ RadialViewGroup$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.timepicker.RadialViewGroup r0 = (com.google.android.material.timepicker.RadialViewGroup) r0
            r0.updateLayoutParams()
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.timepicker.MaterialTimePicker r0 = (com.google.android.material.timepicker.MaterialTimePicker) r0
            com.google.android.material.timepicker.MaterialTimePicker.m296$r8$lambda$EAchhS67SdqVEMlxdxEgAdPAbo(r0)
            return
    }
}
