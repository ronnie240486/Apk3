package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptionDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_reload;
    public android.content.Context context;
    public java.lang.String description;
    public com.flextv.livestore.dlgfragment.DescriptionDlgFragment.ButtonClickListener listener;
    public int playlist_size;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public android.widget.TextView str_device_key;
    public android.widget.TextView str_mac_address;
    public java.lang.String subscription;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_device_key;
    public android.widget.TextView txt_mac_address;
    public android.widget.TextView txt_subscription;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes.dex */
    public interface ButtonClickListener {
        void onCancelClick();

        void onContinueClick();
    }

    public static /* synthetic */ void $r8$lambda$4VwyvJWqLFITaoimn8OLY2V28Go(com.flextv.livestore.dlgfragment.DescriptionDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$bKp-G8GZCvOJknbSYZ3DQz08Mwg, reason: not valid java name */
    public static /* synthetic */ void m126$r8$lambda$bKpG8GZCvOJknbSYZ3DQz08Mwg(com.flextv.livestore.dlgfragment.DescriptionDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public DescriptionDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.playlist_size = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_description = r0
            r0 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_subscription = r0
            r0 = 2131428319(0x7f0b03df, float:1.847828E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_mac_address = r0
            r0 = 2131428300(0x7f0b03cc, float:1.847824E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_device_key = r0
            r0 = 2131428190(0x7f0b035e, float:1.8478017E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_device_key = r0
            r0 = 2131427483(0x7f0b009b, float:1.8476584E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_reload = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_cancel = r0
            r0 = 2131428200(0x7f0b0368, float:1.8478038E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.str_mac_address = r2
            android.widget.Button r2 = r1.btn_reload
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_continue()
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_cancel
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getCancel()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_device_key
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getDevice_key()
            r2.setText(r0)
            int r2 = r1.playlist_size
            r0 = -1
            if (r2 != r0) goto L9d
            android.content.Context r2 = r1.context
            boolean r2 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            if (r2 == 0) goto L92
            android.widget.Button r2 = r1.btn_reload
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getOk()
            r2.setText(r0)
            goto L9d
        L92:
            android.widget.Button r2 = r1.btn_reload
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getOpen_website()
            r2.setText(r0)
        L9d:
            return
    }

    private /* synthetic */ void lambda$onCreateView$0(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment$ButtonClickListener r1 = r0.listener
            r1.onContinueClick()
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$onCreateView$1(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment$ButtonClickListener r1 = r0.listener
            r1.onCancelClick()
            r0.dismiss()
            return
    }

    public static com.flextv.livestore.dlgfragment.DescriptionDlgFragment newInstance(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment r0 = new com.flextv.livestore.dlgfragment.DescriptionDlgFragment
            r0.<init>()
            r0.context = r1
            r0.subscription = r2
            r0.description = r3
            r0.playlist_size = r4
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
            r4 = 2131624027(0x7f0e005b, float:1.8875222E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.context
            r3.<init>(r4)
            r1.preferenceHelper = r3
            android.content.Context r3 = r1.context
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            r3.getSharedPreferenceAppInfo()
            r1.initView(r2)
            android.widget.TextView r3 = r1.txt_subscription
            java.lang.String r4 = r1.subscription
            r3.setText(r4)
            android.widget.TextView r3 = r1.txt_description
            java.lang.String r4 = r1.description
            r3.setText(r4)
            android.widget.TextView r3 = r1.txt_mac_address
            com.flextv.livestore.helper.PreferenceHelper r4 = r1.preferenceHelper
            java.lang.String r4 = r4.getSharedPreferenceMacAddress()
            r3.setText(r4)
            android.widget.TextView r3 = r1.txt_device_key
            com.flextv.livestore.helper.PreferenceHelper r4 = r1.preferenceHelper
            java.lang.String r4 = r4.getSharedPreferenceDeviceKey()
            r3.setText(r4)
            android.widget.TextView r3 = r1.str_mac_address
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getMac_address()
            r3.setText(r4)
            android.widget.Button r3 = r1.btn_reload
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.DescriptionDlgFragment$$ExternalSyntheticLambda0
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
            android.widget.Button r3 = r1.btn_reload
            r3.performClick()
            android.widget.Button r3 = r1.btn_cancel
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.DescriptionDlgFragment$$ExternalSyntheticLambda0
            r0 = 1
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
            android.widget.Button r3 = r1.btn_reload
            r3.requestFocus()
            return r2
    }

    public void setButtonClickListener(com.flextv.livestore.dlgfragment.DescriptionDlgFragment.ButtonClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
