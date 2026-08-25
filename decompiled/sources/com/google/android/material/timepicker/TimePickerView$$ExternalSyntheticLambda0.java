package com.google.android.material.timepicker;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TimePickerView$$ExternalSyntheticLambda0 implements com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ TimePickerView$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup r2, int r3, boolean r4) {
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
            com.google.android.material.timepicker.TimePickerView r0 = (com.google.android.material.timepicker.TimePickerView) r0
            com.google.android.material.timepicker.TimePickerView.$r8$lambda$qcr5SAw_DiQbOm3iFiOG_eXPQ9M(r0, r2, r3, r4)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.timepicker.TimePickerTextInputPresenter r0 = (com.google.android.material.timepicker.TimePickerTextInputPresenter) r0
            com.google.android.material.timepicker.TimePickerTextInputPresenter.$r8$lambda$qLct7ZDGXjHV1i86sX6BxI1uiU8(r0, r2, r3, r4)
            return
    }
}
