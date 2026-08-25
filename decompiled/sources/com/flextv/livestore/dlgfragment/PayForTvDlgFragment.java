package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class PayForTvDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public android.widget.EditText et_mac;
    public com.flextv.livestore.dlgfragment.PayForTvDlgFragment.OnButtonClickListener listener;
    public com.flextv.livestore.models.WordModels wordModels;


    /* JADX INFO: loaded from: classes2.dex */
    public interface OnButtonClickListener {
        void onCancelClick();

        void onOkClick(java.lang.String r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$6sXmarOMcy2_k6D8dNwQv58-6TI, reason: not valid java name */
    public static /* synthetic */ void m138$r8$lambda$6sXmarOMcy2_k6D8dNwQv586TI(com.flextv.livestore.dlgfragment.PayForTvDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$75OID_-BSTNqjsDwHKROp7JzkpU, reason: not valid java name */
    public static /* synthetic */ void m139$r8$lambda$75OID_BSTNqjsDwHKROp7JzkpU(com.flextv.livestore.dlgfragment.PayForTvDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$0(r1)
            return
    }

    public PayForTvDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131427624(0x7f0b0128, float:1.847687E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_mac = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_cancel = r2
            return
    }

    private /* synthetic */ void lambda$onCreateView$0(android.view.View r4) {
            r3 = this;
            android.widget.EditText r4 = r3.et_mac
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L52
            r3.dismiss()
            android.widget.EditText r4 = r3.et_mac
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = ":"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replaceAll(r0, r1)
            java.lang.String r4 = com.flextv.livestore.utils.Utils.getSamsungMac(r4)
            java.lang.String r2 = "Samsung Mac"
            android.util.Log.e(r2, r4)
            com.flextv.livestore.dlgfragment.PayForTvDlgFragment$OnButtonClickListener r4 = r3.listener
            android.widget.EditText r2 = r3.et_mac
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = r2.replaceAll(r0, r1)
            java.lang.String r0 = com.flextv.livestore.utils.Utils.getSamsungMac(r0)
            r4.onOkClick(r0)
            goto L60
        L52:
            android.content.Context r4 = r3.getContext()
            r0 = 0
            java.lang.String r1 = "Please put the mac address!"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r1, r0)
            r4.show()
        L60:
            return
    }

    private /* synthetic */ void lambda$onCreateView$1(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 0
            r0 = 2132017470(0x7f14013e, float:1.967322E38)
            r1.setStyle(r2, r0)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            r7 = 2131624040(0x7f0e0068, float:1.8875248E38)
            r0 = 0
            android.view.View r5 = r5.inflate(r7, r6, r0)
            r4.initView(r5)
            android.content.Context r6 = r4.getContext()
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r4.wordModels = r6
            android.widget.Button r7 = r4.btn_ok
            java.lang.String r6 = r6.getOk()
            r7.setText(r6)
            android.widget.Button r6 = r4.btn_cancel
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getCancel()
            r6.setText(r7)
            android.widget.EditText r6 = r4.et_mac
            r7 = 1
            android.text.InputFilter[] r1 = new android.text.InputFilter[r7]
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r3 = 17
            r2.<init>(r3)
            r1[r0] = r2
            r6.setFilters(r1)
            android.widget.EditText r6 = r4.et_mac
            com.flextv.livestore.dlgfragment.PayForTvDlgFragment$1 r1 = new com.flextv.livestore.dlgfragment.PayForTvDlgFragment$1
            r1.<init>(r4)
            r6.addTextChangedListener(r1)
            android.widget.Button r6 = r4.btn_ok
            com.flextv.livestore.dlgfragment.PayForTvDlgFragment$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.dlgfragment.PayForTvDlgFragment$$ExternalSyntheticLambda0
            r1.<init>(r4, r0)
            r6.setOnClickListener(r1)
            android.widget.Button r6 = r4.btn_cancel
            com.flextv.livestore.dlgfragment.PayForTvDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.PayForTvDlgFragment$$ExternalSyntheticLambda0
            r0.<init>(r4, r7)
            r6.setOnClickListener(r0)
            android.widget.Button r6 = r4.btn_ok
            r6.requestFocus()
            return r5
    }

    public void setOnButtonClickListener(com.flextv.livestore.dlgfragment.PayForTvDlgFragment.OnButtonClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
