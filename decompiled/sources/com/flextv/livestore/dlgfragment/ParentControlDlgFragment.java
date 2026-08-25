package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class ParentControlDlgFragment extends androidx.fragment.app.DialogFragment implements com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public android.widget.EditText et_confirm_password;
    public android.widget.EditText et_new_password;
    public android.widget.EditText et_password;
    public java.lang.String pin_code;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;
    public android.widget.TextView str_confirm_password;
    public android.widget.TextView str_new_password;
    public android.widget.TextView str_password;
    public android.widget.TextView txt_name;
    public com.flextv.livestore.models.WordModels wordModels;



    public static /* synthetic */ boolean $r8$lambda$GgFagvOo74IUWLUKvHyjAYBWDDg(com.flextv.livestore.dlgfragment.ParentControlDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$W7zPUVP1Z94MI49BzhOwtJDiCtA(com.flextv.livestore.dlgfragment.ParentControlDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$2(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$r5M5_P1iMxfzGlvw81-0irM8u1o, reason: not valid java name */
    public static /* synthetic */ void m137$r8$lambda$r5M5_P1iMxfzGlvw810irM8u1o(com.flextv.livestore.dlgfragment.ParentControlDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    public ParentControlDlgFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.pin_code = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_name = r0
            r0 = 2131428205(0x7f0b036d, float:1.8478048E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_password = r0
            r0 = 2131428204(0x7f0b036c, float:1.8478046E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_new_password = r0
            r0 = 2131428188(0x7f0b035c, float:1.8478013E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_confirm_password = r0
            r0 = 2131427628(0x7f0b012c, float:1.8476878E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r2.et_password = r0
            r0 = 2131427626(0x7f0b012a, float:1.8476874E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r2.et_new_password = r0
            r0 = 2131427623(0x7f0b0127, float:1.8476867E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r2.et_confirm_password = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r3 = r3.findViewById(r0)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.btn_cancel = r3
            android.widget.Button r3 = r2.btn_ok
            com.flextv.livestore.dlgfragment.ParentControlDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.ParentControlDlgFragment$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            android.widget.Button r3 = r2.btn_cancel
            com.flextv.livestore.dlgfragment.ParentControlDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.ParentControlDlgFragment$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r2) {
            r1 = this;
            android.widget.EditText r2 = r1.et_password
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            android.widget.EditText r2 = r1.et_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getParent_pass_cant_empty()
            r2.setError(r0)
            return
        L1c:
            android.widget.EditText r2 = r1.et_new_password
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            android.widget.EditText r2 = r1.et_new_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getNew_pass_cant_empty()
            r2.setError(r0)
            return
        L38:
            android.widget.EditText r2 = r1.et_new_password
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            r0 = 4
            if (r2 == r0) goto L55
            android.widget.EditText r2 = r1.et_new_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getNew_pass_length()
            r2.setError(r0)
            return
        L55:
            android.widget.EditText r2 = r1.et_confirm_password
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L71
            android.widget.EditText r2 = r1.et_confirm_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getConfirm_pass_cant_empty()
            r2.setError(r0)
            return
        L71:
            java.lang.String r2 = r1.pin_code
            android.widget.EditText r0 = r1.et_password
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 != 0) goto L8f
            android.widget.EditText r2 = r1.et_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getPass_incorrect()
            r2.setError(r0)
            return
        L8f:
            android.widget.EditText r2 = r1.et_new_password
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            android.widget.EditText r0 = r1.et_confirm_password
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 != 0) goto Lb5
            android.widget.EditText r2 = r1.et_confirm_password
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getConfirm_pass_not_matched()
            r2.setError(r0)
            return
        Lb5:
            r1.updatePinCode()
            return
    }

    private /* synthetic */ void lambda$initView$2(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    private /* synthetic */ boolean lambda$onCreateView$0(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L12
            int r1 = r3.getKeyCode()
            r2 = 4
            if (r1 != r2) goto L12
            r0.dismiss()
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private void updatePinCode() {
            r4 = this;
            android.widget.EditText r0 = r4.et_new_password
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r4.pin_code = r0
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.sharedPreferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceMacAddress()
            java.lang.String r1 = r4.pin_code
            java.lang.String r0 = com.flextv.livestore.utils.Security.getParentData(r0, r1)
            com.flextv.livestore.remote.GetDataRequest r1 = new com.flextv.livestore.remote.GetDataRequest
            android.content.Context r2 = r4.getContext()
            r3 = 3000(0xbb8, float:4.204E-42)
            r1.<init>(r2, r3)
            org.json.JSONObject r0 = com.flextv.livestore.utils.Security.getJsonData(r0)
            java.lang.String r2 = com.flextv.livestore.apps.Constants.second_update_control
            r1.getResponse(r0, r2)
            r1.setOnGetResponseListener(r4)
            return
    }

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r3, int r4) {
            r2 = this;
            java.lang.String r4 = ""
            if (r3 == 0) goto L38
            java.lang.String r0 = "status"
            boolean r3 = r3.getBoolean(r0)     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L38
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r2.pin_code     // Catch: java.lang.Exception -> L38
            r3.setSharedPreferenceParentPassword(r0)     // Catch: java.lang.Exception -> L38
            android.content.Context r3 = r2.getContext()     // Catch: java.lang.Exception -> L38
            com.flextv.livestore.models.WordModels r0 = r2.wordModels     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r0.getParent_pass_changed()     // Catch: java.lang.Exception -> L38
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)     // Catch: java.lang.Exception -> L38
            r3.show()     // Catch: java.lang.Exception -> L38
            android.widget.EditText r3 = r2.et_password     // Catch: java.lang.Exception -> L38
            r3.setText(r4)     // Catch: java.lang.Exception -> L38
            android.widget.EditText r3 = r2.et_new_password     // Catch: java.lang.Exception -> L38
            r3.setText(r4)     // Catch: java.lang.Exception -> L38
            android.widget.EditText r3 = r2.et_confirm_password     // Catch: java.lang.Exception -> L38
            r3.setText(r4)     // Catch: java.lang.Exception -> L38
            r2.dismiss()     // Catch: java.lang.Exception -> L38
        L38:
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
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            r4 = 2131624039(0x7f0e0067, float:1.8875246E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            r1.initView(r2)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            r1.sharedPreferenceHelper = r3
            r3.getSharedPreferenceAppInfo()
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.sharedPreferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceParentPassword()
            r1.pin_code = r3
            android.content.Context r3 = r1.getContext()
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            android.widget.TextView r4 = r1.txt_name
            java.lang.String r3 = r3.getParent_control()
            r4.setText(r3)
            android.widget.TextView r3 = r1.str_password
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getPassword()
            r3.setText(r4)
            android.widget.TextView r3 = r1.str_new_password
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getNet_pass()
            r3.setText(r4)
            android.widget.TextView r3 = r1.str_confirm_password
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getConfirm_password()
            r3.setText(r4)
            android.widget.Button r3 = r1.btn_ok
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getOk()
            r3.setText(r4)
            android.widget.Button r3 = r1.btn_cancel
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getCancel()
            r3.setText(r4)
            android.widget.EditText r3 = r1.et_password
            com.flextv.livestore.dlgfragment.ParentControlDlgFragment$1 r4 = new com.flextv.livestore.dlgfragment.ParentControlDlgFragment$1
            r4.<init>(r1)
            r3.addTextChangedListener(r4)
            android.widget.EditText r3 = r1.et_confirm_password
            com.flextv.livestore.dlgfragment.ParentControlDlgFragment$2 r4 = new com.flextv.livestore.dlgfragment.ParentControlDlgFragment$2
            r4.<init>(r1)
            r3.addTextChangedListener(r4)
            android.app.Dialog r3 = r1.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 8
            r4.<init>(r1, r0)
            r3.setOnKeyListener(r4)
            return r2
    }
}
