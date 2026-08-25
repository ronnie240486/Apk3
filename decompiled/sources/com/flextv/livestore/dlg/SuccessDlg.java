package com.flextv.livestore.dlg;

/* JADX INFO: loaded from: classes.dex */
public class SuccessDlg extends android.app.Dialog {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener listener;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OkButtonClickListener {
        void onCancelClick();

        void onOkClick();
    }

    /* JADX INFO: renamed from: $r8$lambda$8fvfpS-Cg1yzpxlbceJNVwLbVZk, reason: not valid java name */
    public static /* synthetic */ void m120$r8$lambda$8fvfpSCg1yzpxlbceJNVwLbVZk(com.flextv.livestore.dlg.SuccessDlg r0, com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener r1, android.view.View r2) {
            r0.lambda$new$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$OF0TBiG6rOwq01aAlkwCc80Tgug(com.flextv.livestore.dlg.SuccessDlg r0, com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener r1, android.view.View r2) {
            r0.lambda$new$1(r1, r2)
            return
    }

    public SuccessDlg(@androidx.annotation.NonNull android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener r8) {
            r3 = this;
            r3.<init>(r4)
            r3.listener = r8
            r4 = 1
            r3.requestWindowFeature(r4)
            r0 = 2131624008(0x7f0e0048, float:1.8875184E38)
            r3.setContentView(r0)
            android.view.Window r0 = r3.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.btn_cancel = r0
            android.widget.Button r0 = r3.btn_ok
            r0.setText(r6)
            android.widget.Button r6 = r3.btn_cancel
            r6.setText(r7)
            r6 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r5)
            android.widget.Button r5 = r3.btn_ok
            com.flextv.livestore.dlg.SuccessDlg$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.dlg.SuccessDlg$$ExternalSyntheticLambda0
            r6.<init>(r3, r8, r2)
            r5.setOnClickListener(r6)
            android.widget.Button r5 = r3.btn_cancel
            com.flextv.livestore.dlg.SuccessDlg$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.dlg.SuccessDlg$$ExternalSyntheticLambda0
            r6.<init>(r3, r8, r4)
            r5.setOnClickListener(r6)
            android.widget.Button r4 = r3.btn_ok
            r4.requestFocus()
            return
    }

    private /* synthetic */ void lambda$new$0(com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener r1, android.view.View r2) {
            r0 = this;
            r0.dismiss()
            r1.onOkClick()
            return
    }

    private /* synthetic */ void lambda$new$1(com.flextv.livestore.dlg.SuccessDlg.OkButtonClickListener r1, android.view.View r2) {
            r0 = this;
            r0.dismiss()
            r1.onCancelClick()
            return
    }
}
