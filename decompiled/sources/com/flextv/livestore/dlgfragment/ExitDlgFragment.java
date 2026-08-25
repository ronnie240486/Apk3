package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class ExitDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public java.lang.String description;
    public java.lang.String header;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener listener;
    public java.lang.String str_no;
    public java.lang.String str_yes;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_quit;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OkButtonClickListener {
        void onCancelClick();

        void onOkClick();
    }

    /* JADX INFO: renamed from: $r8$lambda$HdpIx70GW1ksOJIhsjUNT-JA6f0, reason: not valid java name */
    public static /* synthetic */ void m129$r8$lambda$HdpIx70GW1ksOJIhsjUNTJA6f0(com.flextv.livestore.dlgfragment.ExitDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Of6cyMTQgs35ypmMw-nqRsqMhwo, reason: not valid java name */
    public static /* synthetic */ void m130$r8$lambda$Of6cyMTQgs35ypmMwnqRsqMhwo(com.flextv.livestore.dlgfragment.ExitDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$2(r1)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$y52iz1jfTjmW0ETwgNQ2h44qIIQ(com.flextv.livestore.dlgfragment.ExitDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public ExitDlgFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428335(0x7f0b03ef, float:1.8478312E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_quit = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_description = r0
            android.widget.TextView r0 = r2.txt_quit
            java.lang.String r1 = r2.header
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_description
            java.lang.String r1 = r2.description
            r0.setText(r1)
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r3 = r3.findViewById(r0)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.btn_cancel = r3
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda1
            r1 = 0
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            android.widget.Button r3 = r2.btn_ok
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda1
            r1 = 1
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            android.widget.Button r3 = r2.btn_ok
            java.lang.String r0 = r2.str_yes
            r3.setText(r0)
            android.widget.Button r3 = r2.btn_cancel
            java.lang.String r0 = r2.str_no
            r3.setText(r0)
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.ExitDlgFragment$OkButtonClickListener r1 = r0.listener
            r1.onCancelClick()
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$initView$2(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.ExitDlgFragment$OkButtonClickListener r1 = r0.listener
            r1.onOkClick()
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

    public static com.flextv.livestore.dlgfragment.ExitDlgFragment newInstance(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.flextv.livestore.dlgfragment.ExitDlgFragment r0 = new com.flextv.livestore.dlgfragment.ExitDlgFragment
            r0.<init>()
            r0.header = r1
            r0.description = r2
            r0.str_yes = r3
            r0.str_no = r4
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
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            r4 = 2131624029(0x7f0e005d, float:1.8875226E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            r1.initView(r2)
            android.app.Dialog r3 = r1.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r4.<init>(r1, r0)
            r3.setOnKeyListener(r4)
            android.widget.Button r3 = r1.btn_cancel
            r3.requestFocus()
            return r2
    }

    public void setOkButtonClickListener(com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
