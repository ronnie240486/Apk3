package com.google.android.material.textfield;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ClearTextEndIconDelegate$$ExternalSyntheticLambda1 implements android.view.View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ClearTextEndIconDelegate$$ExternalSyntheticLambda1(com.google.android.material.textfield.EndIconDelegate r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
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
            com.google.android.material.textfield.DropdownMenuEndIconDelegate r0 = (com.google.android.material.textfield.DropdownMenuEndIconDelegate) r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.$r8$lambda$GC4Z4aSLx1o4GNefaOGyXn6tdak(r0, r2)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.ClearTextEndIconDelegate r0 = (com.google.android.material.textfield.ClearTextEndIconDelegate) r0
            com.google.android.material.textfield.ClearTextEndIconDelegate.$r8$lambda$nI62G89ozUOuRnvjwrP0IYYoGyA(r0, r2)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.textfield.PasswordToggleEndIconDelegate r0 = (com.google.android.material.textfield.PasswordToggleEndIconDelegate) r0
            com.google.android.material.textfield.PasswordToggleEndIconDelegate.$r8$lambda$twlq6SYcv_LydKclcBcdQZ6NHKY(r0, r2)
            return
    }
}
