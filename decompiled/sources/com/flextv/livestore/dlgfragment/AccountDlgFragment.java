package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class AccountDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public android.widget.Button btn_pay;
    public android.content.Context context;
    public java.text.SimpleDateFormat expire_format;
    public long expired_mils;
    public com.flextv.livestore.dlgfragment.AccountDlgFragment.PayButtonClickListener listener;
    public com.flextv.livestore.models.LoginModel loginModel;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;
    public android.widget.TextView str_account;
    public android.widget.TextView str_device_key;
    public android.widget.TextView str_expire;
    public android.widget.TextView str_mac;
    public android.widget.TextView str_playlist_expire;
    public android.widget.TextView str_state;
    public android.widget.TextView str_username;
    public android.widget.TextView txt_active_con;
    public android.widget.TextView txt_device_key;
    public android.widget.TextView txt_expire;
    public android.widget.TextView txt_mac;
    public android.widget.TextView txt_max_con;
    public android.widget.TextView txt_playlist_expire;
    public android.widget.TextView txt_state;
    public android.widget.TextView txt_username;
    public android.view.View view_click;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes2.dex */
    public interface PayButtonClickListener {
        void onPayButtonClicked();
    }

    public static /* synthetic */ void $r8$lambda$LJu8AbF2aLRJGga7f75m7pCntTw(com.flextv.livestore.dlgfragment.AccountDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iEG2vFb6jTs2ObmlS_gt64RSinA(com.flextv.livestore.dlgfragment.AccountDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    public AccountDlgFragment() {
            r2 = this;
            r2.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            r2.expire_format = r0
            r0 = 0
            r2.expired_mils = r0
            return
    }

    private void initView(android.view.View r4) {
            r3 = this;
            r0 = 2131428180(0x7f0b0354, float:1.8477997E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_account = r0
            r0 = 2131428216(0x7f0b0378, float:1.847807E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_username = r0
            r0 = 2131428199(0x7f0b0367, float:1.8478036E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_mac = r0
            r0 = 2131428210(0x7f0b0372, float:1.8478058E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_state = r0
            r0 = 2131428193(0x7f0b0361, float:1.8478024E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_expire = r0
            r0 = 2131428190(0x7f0b035e, float:1.8478017E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_device_key = r0
            r0 = 2131428189(0x7f0b035d, float:1.8478015E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131428202(0x7f0b036a, float:1.8478042E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131428206(0x7f0b036e, float:1.847805E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.str_playlist_expire = r0
            r0 = 2131428377(0x7f0b0419, float:1.8478397E38)
            android.view.View r0 = r4.findViewById(r0)
            r3.view_click = r0
            r0 = 2131428353(0x7f0b0401, float:1.8478348E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_username = r0
            r0 = 2131428318(0x7f0b03de, float:1.8478277E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_mac = r0
            r0 = 2131428346(0x7f0b03fa, float:1.8478334E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_state = r0
            r0 = 2131428306(0x7f0b03d2, float:1.8478253E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_expire = r0
            r0 = 2131428300(0x7f0b03cc, float:1.847824E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_device_key = r0
            r0 = 2131428294(0x7f0b03c6, float:1.8478228E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_active_con = r0
            r0 = 2131428320(0x7f0b03e0, float:1.8478281E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_max_con = r0
            r0 = 2131428331(0x7f0b03eb, float:1.8478303E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_playlist_expire = r0
            android.view.View r0 = r3.view_click
            com.flextv.livestore.dlgfragment.AccountDlgFragment$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.dlgfragment.AccountDlgFragment$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r2)
            r0.setOnClickListener(r1)
            r0 = 2131427479(0x7f0b0097, float:1.8476575E38)
            android.view.View r4 = r4.findViewById(r0)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.btn_pay = r4
            com.flextv.livestore.dlgfragment.AccountDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.AccountDlgFragment$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r3, r1)
            r4.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$initView$0(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r1) {
            r0 = this;
            com.flextv.livestore.dlgfragment.AccountDlgFragment$PayButtonClickListener r1 = r0.listener
            r1.onPayButtonClicked()
            return
    }

    public static com.flextv.livestore.dlgfragment.AccountDlgFragment newInstance(android.content.Context r1) {
            com.flextv.livestore.dlgfragment.AccountDlgFragment r0 = new com.flextv.livestore.dlgfragment.AccountDlgFragment
            r0.<init>()
            r0.context = r1
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
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            r7 = 2131624021(0x7f0e0055, float:1.887521E38)
            r0 = 0
            android.view.View r5 = r5.inflate(r7, r6, r0)
            r4.initView(r5)
            com.flextv.livestore.helper.PreferenceHelper r6 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r7 = r4.context
            r6.<init>(r7)
            r4.sharedPreferenceHelper = r6
            com.flextv.livestore.models.AppInfoModel r6 = r6.getSharedPreferenceAppInfo()
            r4.appInfoModel = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r4.sharedPreferenceHelper
            com.flextv.livestore.models.LoginModel r6 = r6.getSharedPreferenceLoginModel()
            r4.loginModel = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r4.sharedPreferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            if (r6 == 0) goto L41
            android.widget.TextView r6 = r4.txt_username
            java.lang.String r7 = ""
            r6.setText(r7)
            android.widget.TextView r6 = r4.txt_active_con
            r6.setText(r7)
            android.widget.TextView r6 = r4.txt_max_con
            r6.setText(r7)
            android.widget.TextView r6 = r4.txt_playlist_expire
            r6.setText(r7)
            goto L73
        L41:
            com.flextv.livestore.models.LoginModel r6 = r4.loginModel
            if (r6 == 0) goto L73
            android.widget.TextView r7 = r4.txt_username
            java.lang.String r6 = r6.getUsername()
            r7.setText(r6)
            android.widget.TextView r6 = r4.txt_active_con
            com.flextv.livestore.models.LoginModel r7 = r4.loginModel
            java.lang.String r7 = r7.getActive_cons()
            r6.setText(r7)
            android.widget.TextView r6 = r4.txt_max_con
            com.flextv.livestore.models.LoginModel r7 = r4.loginModel
            java.lang.String r7 = r7.getMax_connections()
            r6.setText(r7)
            android.widget.TextView r6 = r4.txt_playlist_expire
            com.flextv.livestore.models.LoginModel r7 = r4.loginModel
            java.lang.Long r7 = r7.getExp_date()
            java.lang.String r7 = com.flextv.livestore.utils.Utils.getDate(r7)
            r6.setText(r7)
        L73:
            java.text.SimpleDateFormat r6 = r4.expire_format     // Catch: java.lang.Exception -> L86
            com.flextv.livestore.models.AppInfoModel r7 = r4.appInfoModel     // Catch: java.lang.Exception -> L86
            java.lang.String r7 = r7.getExpiredDate()     // Catch: java.lang.Exception -> L86
            java.util.Date r6 = r6.parse(r7)     // Catch: java.lang.Exception -> L86
            long r6 = r6.getTime()     // Catch: java.lang.Exception -> L86
            r4.expired_mils = r6     // Catch: java.lang.Exception -> L86
            goto L8a
        L86:
            r6 = 0
            r4.expired_mils = r6
        L8a:
            android.widget.TextView r6 = r4.txt_mac
            com.flextv.livestore.helper.PreferenceHelper r7 = r4.sharedPreferenceHelper
            java.lang.String r7 = r7.getSharedPreferenceMacAddress()
            r6.setText(r7)
            com.flextv.livestore.models.AppInfoModel r6 = r4.appInfoModel
            int r6 = r6.getIs_trial()
            r7 = 2
            r0 = 8
            if (r6 == r7) goto Lc9
            com.flextv.livestore.models.AppInfoModel r6 = r4.appInfoModel
            boolean r6 = r6.isIs_google_pay()
            if (r6 != 0) goto Lc9
            long r6 = r4.expired_mils
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r1 = r1.getTime()
            long r6 = r6 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lbc
            goto Lc9
        Lbc:
            android.widget.Button r6 = r4.btn_pay
            r6.setVisibility(r0)
            android.widget.TextView r6 = r4.txt_state
            java.lang.String r7 = "Free Trial"
            r6.setText(r7)
            goto Ld5
        Lc9:
            android.widget.TextView r6 = r4.txt_state
            java.lang.String r7 = "Activate"
            r6.setText(r7)
            android.widget.Button r6 = r4.btn_pay
            r6.setVisibility(r0)
        Ld5:
            boolean r6 = com.flextv.livestore.utils.Utils.IsAmazonDevice()
            if (r6 == 0) goto Le0
            android.widget.Button r6 = r4.btn_pay
            r6.setVisibility(r0)
        Le0:
            android.widget.TextView r6 = r4.txt_expire     // Catch: java.lang.Exception -> Lec
            com.flextv.livestore.models.AppInfoModel r7 = r4.appInfoModel     // Catch: java.lang.Exception -> Lec
            java.lang.String r7 = r7.getExpiredDate()     // Catch: java.lang.Exception -> Lec
            r6.setText(r7)     // Catch: java.lang.Exception -> Lec
            goto Lf4
        Lec:
            android.widget.TextView r6 = r4.txt_expire
            java.lang.String r7 = "unlimited"
            r6.setText(r7)
        Lf4:
            android.widget.TextView r6 = r4.txt_device_key
            com.flextv.livestore.models.AppInfoModel r7 = r4.appInfoModel
            java.lang.String r7 = r7.getDevice_key()
            r6.setText(r7)
            android.content.Context r6 = r4.context
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r4.wordModels = r6
            android.widget.TextView r7 = r4.str_account
            java.lang.String r6 = r6.getAccount()
            r7.setText(r6)
            android.widget.TextView r6 = r4.str_username
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getUsername()
            r6.setText(r7)
            android.widget.TextView r6 = r4.str_mac
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getMac_address()
            r6.setText(r7)
            android.widget.TextView r6 = r4.str_expire
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getExpire_date()
            r6.setText(r7)
            android.widget.TextView r6 = r4.str_state
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getApp_status()
            r6.setText(r7)
            android.widget.TextView r6 = r4.str_device_key
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getDevice_key()
            r6.setText(r7)
            android.widget.TextView r6 = r4.str_playlist_expire
            com.flextv.livestore.models.WordModels r7 = r4.wordModels
            java.lang.String r7 = r7.getPlaylist_expire_date()
            r6.setText(r7)
            android.widget.Button r6 = r4.btn_pay
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPay_with_google_pay()
            r7.append(r0)
            java.lang.String r0 = "(€"
            r7.append(r0)
            com.flextv.livestore.models.AppInfoModel r0 = r4.appInfoModel
            java.lang.String r0 = r0.getPrice()
            r7.append(r0)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.setText(r7)
            return r5
    }

    public void setOnPayButtonClickListener(com.flextv.livestore.dlgfragment.AccountDlgFragment.PayButtonClickListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
