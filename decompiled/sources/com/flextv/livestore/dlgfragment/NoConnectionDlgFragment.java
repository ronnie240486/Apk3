package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class NoConnectionDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_retry;
    public android.content.Context context;
    public java.lang.String description;
    public com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener listener;
    public android.widget.TextView txt_check_network;
    public android.widget.TextView txt_no_connection;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnRetryClickListener {
        void onRetryClick();
    }

    /* JADX INFO: renamed from: $r8$lambda$tFltdWao8zGcD0GdQj-rASkUFNI, reason: not valid java name */
    public static /* synthetic */ boolean m136$r8$lambda$tFltdWao8zGcD0GdQjrASkUFNI(com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$wl3hD6YymXTBPy2peh69Qg2QKc0(com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    public NoConnectionDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            java.lang.String r0 = ""
            r1.description = r0
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428327(0x7f0b03e7, float:1.8478295E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_no_connection = r0
            r0 = 2131428292(0x7f0b03c4, float:1.8478224E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_check_network = r0
            android.widget.TextView r0 = r2.txt_no_connection
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getNo_connection()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_check_network
            java.lang.String r1 = r2.description
            r0.setText(r1)
            r0 = 2131427485(0x7f0b009d, float:1.8476588E38)
            android.view.View r3 = r3.findViewById(r0)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.btn_retry = r3
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getRetry()
            r3.setText(r0)
            android.widget.Button r3 = r2.btn_retry
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r1 = 12
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            android.widget.Button r3 = r2.btn_retry
            r3.requestFocus()
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment$OnRetryClickListener r1 = r0.listener
            r1.onRetryClick()
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

    public static com.flextv.livestore.dlgfragment.NoConnectionDlgFragment newInstance(android.content.Context r1, java.lang.String r2) {
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r0 = new com.flextv.livestore.dlgfragment.NoConnectionDlgFragment
            r0.<init>()
            r0.context = r1
            r0.description = r2
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
            r4 = 2131624038(0x7f0e0066, float:1.8875244E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            android.content.Context r3 = r1.context
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            r1.initView(r2)
            android.app.Dialog r3 = r1.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 7
            r4.<init>(r1, r0)
            r3.setOnKeyListener(r4)
            return r2
    }

    public void setOnRetryClickListener(com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
