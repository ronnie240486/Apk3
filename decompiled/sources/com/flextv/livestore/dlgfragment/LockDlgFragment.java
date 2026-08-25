package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class LockDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_ok;
    public android.widget.EditText et_pass;
    public com.flextv.livestore.dlgfragment.LockDlgFragment.OnPinEventListener listener;
    public java.lang.String pin_code;

    /* JADX INFO: loaded from: classes.dex */
    public interface OnPinEventListener {
        void OnPinCorrect();

        void OnPinIncorrect();

        void OnPutPinCode();
    }

    public static /* synthetic */ void $r8$lambda$bb2LZEdejUl7nPpOyDtTVqpKA8U(com.flextv.livestore.dlgfragment.LockDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$0(r1)
            return
    }

    public LockDlgFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ void lambda$onCreateView$0(android.view.View r2) {
            r1 = this;
            android.widget.EditText r2 = r1.et_pass
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
            com.flextv.livestore.dlgfragment.LockDlgFragment$OnPinEventListener r2 = r1.listener
            r2.OnPutPinCode()
            goto L3d
        L16:
            java.lang.String r2 = r1.pin_code
            android.widget.EditText r0 = r1.et_pass
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L31
            r1.dismiss()
            com.flextv.livestore.dlgfragment.LockDlgFragment$OnPinEventListener r2 = r1.listener
            r2.OnPinCorrect()
            goto L3d
        L31:
            com.flextv.livestore.dlgfragment.LockDlgFragment$OnPinEventListener r2 = r1.listener
            r2.OnPinIncorrect()
            android.widget.EditText r2 = r1.et_pass
            java.lang.String r0 = ""
            r2.setText(r0)
        L3d:
            return
    }

    public static com.flextv.livestore.dlgfragment.LockDlgFragment newInstance(java.lang.String r1) {
            com.flextv.livestore.dlgfragment.LockDlgFragment r0 = new com.flextv.livestore.dlgfragment.LockDlgFragment
            r0.<init>()
            r0.pin_code = r1
            return r0
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
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            r6 = 2131624035(0x7f0e0063, float:1.8875238E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            r5 = 2131427627(0x7f0b012b, float:1.8476876E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r3.et_pass = r5
            r5 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r3.btn_ok = r5
            android.widget.EditText r5 = r3.et_pass
            r6 = 1
            android.text.InputFilter[] r6 = new android.text.InputFilter[r6]
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r2 = 4
            r1.<init>(r2)
            r6[r0] = r1
            r5.setFilters(r6)
            android.widget.Button r5 = r3.btn_ok
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r0 = 10
            r6.<init>(r3, r0)
            r5.setOnClickListener(r6)
            return r4
    }

    public void setOnPinEventListener(com.flextv.livestore.dlgfragment.LockDlgFragment.OnPinEventListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
