package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class PlayErrorDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public java.lang.String description;
    public java.lang.String header;
    public boolean is_vod;
    public com.flextv.livestore.dlgfragment.PlayErrorDlgFragment.OkButtonClickListener listener;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_quit;

    /* JADX INFO: loaded from: classes2.dex */
    public interface OkButtonClickListener {
        void onCancelClick();

        void onOkClick();
    }

    /* JADX INFO: renamed from: $r8$lambda$C_K_CDrI-eeCKuAGH5O9fxjpG3s, reason: not valid java name */
    public static /* synthetic */ void m140$r8$lambda$C_K_CDrIeeCKuAGH5O9fxjpG3s(com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qdKMpC4DnpNNXH44XAKsNYNmAZY(com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$0(r1)
            return
    }

    public PlayErrorDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.is_vod = r0
            return
    }

    private void initView(android.view.View r4) {
            r3 = this;
            r0 = 2131428335(0x7f0b03ef, float:1.8478312E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_quit = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_description = r0
            android.widget.TextView r0 = r3.txt_quit
            java.lang.String r1 = r3.header
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_description
            java.lang.String r1 = r3.description
            r0.setText(r1)
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r4 = r4.findViewById(r0)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.btn_cancel = r4
            android.widget.Button r4 = r3.btn_ok
            java.lang.String r0 = "Exit"
            r4.setText(r0)
            android.widget.Button r4 = r3.btn_cancel
            java.lang.String r0 = "Play Next"
            r4.setText(r0)
            android.widget.TextView r4 = r3.txt_quit
            r0 = 1
            r4.setAllCaps(r0)
            boolean r4 = r3.is_vod
            if (r4 == 0) goto L5f
            android.widget.Button r4 = r3.btn_cancel
            r1 = 8
            r4.setVisibility(r1)
            android.widget.Button r4 = r3.btn_ok
            r4.requestFocus()
            goto L64
        L5f:
            android.widget.Button r4 = r3.btn_cancel
            r4.requestFocus()
        L64:
            android.widget.Button r4 = r3.btn_cancel
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r2)
            r4.setOnClickListener(r1)
            android.widget.Button r4 = r3.btn_ok
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$$ExternalSyntheticLambda0
            r1.<init>(r3, r0)
            r4.setOnClickListener(r1)
            return
    }

    private /* synthetic */ void lambda$initView$0(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$OkButtonClickListener r1 = r0.listener
            r1.onCancelClick()
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment$OkButtonClickListener r1 = r0.listener
            r1.onOkClick()
            return
    }

    public static com.flextv.livestore.dlgfragment.PlayErrorDlgFragment newInstance(java.lang.String r1, java.lang.String r2, boolean r3) {
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r0 = new com.flextv.livestore.dlgfragment.PlayErrorDlgFragment
            r0.<init>()
            r0.header = r1
            r0.description = r2
            r0.is_vod = r3
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
            return r2
    }

    public void setOkButtonClickListener(com.flextv.livestore.dlgfragment.PlayErrorDlgFragment.OkButtonClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
