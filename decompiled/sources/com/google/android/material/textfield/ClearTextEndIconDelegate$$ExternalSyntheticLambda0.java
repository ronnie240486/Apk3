package com.google.android.material.textfield;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ClearTextEndIconDelegate$$ExternalSyntheticLambda0 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ClearTextEndIconDelegate$$ExternalSyntheticLambda0(com.google.android.material.textfield.EndIconDelegate r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.ClearTextEndIconDelegate r0 = (com.google.android.material.textfield.ClearTextEndIconDelegate) r0
            com.google.android.material.textfield.ClearTextEndIconDelegate.$r8$lambda$tQahUbi3HJfsEhbpmdlHLxzqxv4(r0, r2)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.ClearTextEndIconDelegate r0 = (com.google.android.material.textfield.ClearTextEndIconDelegate) r0
            com.google.android.material.textfield.ClearTextEndIconDelegate.m292$r8$lambda$Abvjkt9KmYeJvJ7_vHGwZxlmVA(r0, r2)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate r0 = (com.google.android.material.textfield.DropdownMenuEndIconDelegate) r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.$r8$lambda$4SBpO57tjhDSopV0DemkySdxojY(r0, r2)
            return
    }
}
