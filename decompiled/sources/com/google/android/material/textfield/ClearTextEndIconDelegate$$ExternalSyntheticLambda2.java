package com.google.android.material.textfield;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ClearTextEndIconDelegate$$ExternalSyntheticLambda2 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ClearTextEndIconDelegate$$ExternalSyntheticLambda2(com.google.android.material.textfield.EndIconDelegate r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r2, boolean r3) {
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
            com.google.android.material.textfield.ClearTextEndIconDelegate r0 = (com.google.android.material.textfield.ClearTextEndIconDelegate) r0
            com.google.android.material.textfield.ClearTextEndIconDelegate.$r8$lambda$ycpHjhDocuatJlJAPKZepsuRHG8(r0, r2, r3)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate r0 = (com.google.android.material.textfield.DropdownMenuEndIconDelegate) r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.$r8$lambda$s0Go8aDJW6wdKEyjtVLy3FzDAsw(r0, r2, r3)
            return
    }
}
