package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class UpdateDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public java.lang.String description;
    public boolean is_available;
    public com.flextv.livestore.dlgfragment.UpdateDlgFragment.UpdateAvailableListener listener;
    public java.lang.String str_cancel;
    public java.lang.String str_update;
    public android.widget.TextView txt_description;

    /* JADX INFO: loaded from: classes2.dex */
    public interface UpdateAvailableListener {
        void onUpdateAvailable();
    }

    public UpdateDlgFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.description = r0
            r1.str_update = r0
            r1.str_cancel = r0
            r0 = 0
            r1.is_available = r0
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_description = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_cancel = r2
            android.widget.Button r2 = r1.btn_ok
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_cancel
            r2.setOnClickListener(r1)
            android.widget.TextView r2 = r1.txt_description
            java.lang.String r0 = r1.description
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_ok
            java.lang.String r0 = r1.str_update
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_cancel
            java.lang.String r0 = r1.str_cancel
            r2.setText(r0)
            return
    }

    public static com.flextv.livestore.dlgfragment.UpdateDlgFragment newInstance(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            com.flextv.livestore.dlgfragment.UpdateDlgFragment r0 = new com.flextv.livestore.dlgfragment.UpdateDlgFragment
            r0.<init>()
            r0.description = r1
            r0.is_available = r4
            r0.str_update = r2
            r0.str_cancel = r3
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            if (r2 == r0) goto L1d
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            if (r2 == r0) goto Lf
            goto L20
        Lf:
            boolean r2 = r1.is_available
            if (r2 == 0) goto L19
            com.flextv.livestore.dlgfragment.UpdateDlgFragment$UpdateAvailableListener r2 = r1.listener
            r2.onUpdateAvailable()
            goto L20
        L19:
            r1.dismiss()
            goto L20
        L1d:
            r1.dismiss()
        L20:
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
            r4 = 2131624047(0x7f0e006f, float:1.8875263E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            r1.initView(r2)
            return r2
    }

    public void setOnUpdateAvailableListener(com.flextv.livestore.dlgfragment.UpdateDlgFragment.UpdateAvailableListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
