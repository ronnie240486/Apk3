package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class AddPlaylistDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener, com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public android.widget.Button btn_add;
    public android.widget.Button btn_add_m3u;
    public android.widget.Button btn_add_xc;
    public android.widget.ImageButton btn_back;
    public android.content.Context context;
    public com.flextv.livestore.dlgfragment.NoConnectionDlgFragment dlgFragment;
    public android.widget.EditText et_name;
    public android.widget.EditText et_password;
    public android.widget.EditText et_url;
    public android.widget.EditText et_username;
    public boolean is_xc;
    public com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.SuccessAddedListener listener;
    public java.lang.String playlistID;
    public java.lang.String playlistName;
    public java.lang.String playlistType;
    public java.lang.String playlistUrl;
    public int playlist_position;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;
    public android.widget.TextView str_list_name;
    public android.widget.TextView str_mac_address;
    public android.widget.TextView str_password;
    public android.widget.TextView str_url;
    public android.widget.TextView str_username;
    public android.widget.TextView txt_mac_address;
    public android.widget.TextView txt_name;
    public java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> urlModelList;
    public java.lang.String username;
    public com.flextv.livestore.models.WordModels wordModels;


    /* JADX INFO: loaded from: classes.dex */
    public interface SuccessAddedListener {
        void onReload(int r1);

        void onSkip();
    }

    public static /* synthetic */ void $r8$lambda$NdtwcmTEv2ewAwNTlMpf6unx6xk(com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r0) {
            r0.lambda$showNoConnectionDlgFragment$1()
            return
    }

    public static /* synthetic */ boolean $r8$lambda$xVOD26K7_jqtWhpeCGMJaLnIbeM(com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    static {
            java.lang.Class<com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment> r0 = com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.class
            return
    }

    public AddPlaylistDlgFragment() {
            r2 = this;
            r2.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.urlModelList = r0
            r0 = -1
            r2.playlist_position = r0
            java.lang.String r0 = ""
            r2.playlistName = r0
            java.lang.String r1 = "general"
            r2.playlistType = r1
            r2.username = r0
            r2.playlistID = r0
            r2.playlistUrl = r0
            r0 = 0
            r2.is_xc = r0
            return
    }

    private void addPlaylist(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "general"
            r4.playlistType = r0
            java.lang.String r1 = ""
            r4.username = r1
            android.widget.EditText r1 = r4.et_name
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L34
            java.lang.String r1 = "Playlist"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r2 = r4.urlModelList
            int r2 = r2.size()
            int r2 = r2 + 1
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.playlistName = r1
            android.widget.EditText r2 = r4.et_name
            r2.setText(r1)
        L34:
            android.widget.EditText r1 = r4.et_name
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r4.playlistName = r1
            android.widget.EditText r1 = r4.et_url
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 == 0) goto L61
            android.content.Context r5 = r4.context
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPut_m3u_link()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r2)
            r5.show()
            return
        L61:
            android.widget.EditText r1 = r4.et_url
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            r4.playlistUrl = r1
            boolean r1 = r4.is_xc
            if (r1 == 0) goto Le3
            r4.playlistType = r0
            android.widget.EditText r0 = r4.et_username
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L97
            android.content.Context r5 = r4.context
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPut_username()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r2)
            r5.show()
            return
        L97:
            android.widget.EditText r0 = r4.et_password
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb7
            android.content.Context r5 = r4.context
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPut_password()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r2)
            r5.show()
            return
        Lb7:
            android.widget.EditText r0 = r4.et_username
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r4.username = r0
            android.widget.EditText r0 = r4.et_password
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = r4.playlistUrl
            java.lang.String r2 = r4.username
            java.lang.String r0 = com.flextv.livestore.helper.GetSharedInfo.getPlaylistUrl(r1, r2, r0)
            java.lang.String r0 = r0.trim()
            r4.playlistUrl = r0
        Le3:
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.sharedPreferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceMacAddress()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = r4.playlistName
            java.lang.String r2 = r4.playlistUrl
            java.lang.String r3 = r4.playlistType
            java.lang.String r5 = com.flextv.livestore.utils.Security.getAddData(r0, r5, r1, r2, r3)
            com.flextv.livestore.remote.GetDataRequest r0 = new com.flextv.livestore.remote.GetDataRequest
            android.content.Context r1 = r4.getContext()
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1, r2)
            org.json.JSONObject r5 = com.flextv.livestore.utils.Security.getJsonData(r5)
            java.lang.String r1 = com.flextv.livestore.apps.Constants.second_create_url
            r0.getResponse(r5, r1)
            r0.setOnGetResponseListener(r4)
            return
    }

    private void changeXCFormat() {
            r3 = this;
            boolean r0 = r3.is_xc
            if (r0 == 0) goto L55
            android.widget.TextView r0 = r3.str_url
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getPort()
            r0.setText(r1)
            android.widget.TextView r0 = r3.str_username
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getUsername()
            r0.setText(r1)
            android.widget.TextView r0 = r3.str_password
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getPassword()
            r0.setText(r1)
            android.widget.TextView r0 = r3.str_username
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.str_password
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_username
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_password
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_name
            r1 = 2131427631(0x7f0b012f, float:1.8476884E38)
            r0.setNextFocusDownId(r1)
            android.widget.EditText r0 = r3.et_url
            r2 = 2131427628(0x7f0b012c, float:1.8476878E38)
            r0.setNextFocusDownId(r2)
            android.widget.Button r0 = r3.btn_add
            r0.setNextFocusUpId(r1)
            android.widget.Button r0 = r3.btn_add_xc
            r0.requestFocus()
            goto L90
        L55:
            android.widget.TextView r0 = r3.str_url
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getEnter_m3u()
            r0.setText(r1)
            android.widget.TextView r0 = r3.str_username
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.str_password
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_username
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_password
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.et_name
            r1 = 2131427460(0x7f0b0084, float:1.8476537E38)
            r0.setNextFocusDownId(r1)
            android.widget.EditText r0 = r3.et_url
            r0.setNextFocusDownId(r1)
            android.widget.Button r0 = r3.btn_add
            r1 = 2131427625(0x7f0b0129, float:1.8476872E38)
            r0.setNextFocusUpId(r1)
            android.widget.Button r0 = r3.btn_add_m3u
            r0.requestFocus()
        L90:
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.btn_back = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_name = r0
            r0 = 2131428281(0x7f0b03b9, float:1.8478202E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_add_xc = r0
            r0 = 2131428280(0x7f0b03b8, float:1.84782E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_add_m3u = r0
            r0 = 2131428319(0x7f0b03df, float:1.847828E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_mac_address = r0
            r0 = 2131428200(0x7f0b0368, float:1.8478038E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_mac_address = r0
            r0 = 2131428197(0x7f0b0365, float:1.8478032E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_list_name = r0
            r0 = 2131428215(0x7f0b0377, float:1.8478068E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_url = r0
            r0 = 2131428216(0x7f0b0378, float:1.847807E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_username = r0
            r0 = 2131428205(0x7f0b036d, float:1.8478048E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_password = r0
            r0 = 2131427625(0x7f0b0129, float:1.8476872E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_name = r0
            r0 = 2131427630(0x7f0b012e, float:1.8476882E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_url = r0
            r0 = 2131427631(0x7f0b012f, float:1.8476884E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_username = r0
            r0 = 2131427628(0x7f0b012c, float:1.8476878E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_password = r0
            r0 = 2131427460(0x7f0b0084, float:1.8476537E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_add = r2
            android.widget.ImageButton r2 = r1.btn_back
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_add_xc
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_add_m3u
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_add
            r2.setOnClickListener(r1)
            android.widget.TextView r2 = r1.txt_name
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getAdd_playlist()
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_add_xc
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getXtreme_codes()
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_add_m3u
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getAdd_m3u()
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_add
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getAdd_playlist()
            r2.setText(r0)
            android.widget.TextView r2 = r1.txt_mac_address
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.sharedPreferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceMacAddress()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_mac_address
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getMac_address()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_list_name
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getPlaylist_name()
            r2.setText(r0)
            return
    }

    private /* synthetic */ boolean lambda$onCreateView$0(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getKeyCode()
            r2 = 0
            if (r1 != 0) goto L8b
            int r1 = r3.getKeyCode()
            r3 = 1
            switch(r1) {
                case 19: goto L70;
                case 20: goto L53;
                case 21: goto L32;
                case 22: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L8b
        L11:
            android.widget.EditText r1 = r0.et_url
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L31
            android.widget.EditText r1 = r0.et_password
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L31
            android.widget.Button r1 = r0.btn_add
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L31
            android.widget.Button r1 = r0.btn_add_xc
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L8b
        L31:
            return r3
        L32:
            android.widget.EditText r1 = r0.et_name
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L52
            android.widget.EditText r1 = r0.et_username
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L52
            android.widget.Button r1 = r0.btn_add
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L52
            android.widget.Button r1 = r0.btn_add_m3u
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L8b
        L52:
            return r3
        L53:
            android.widget.ImageButton r1 = r0.btn_back
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L8b
            android.widget.ImageButton r1 = r0.btn_back
            r1.setFocusable(r2)
            boolean r1 = r0.is_xc
            if (r1 == 0) goto L6a
            android.widget.Button r1 = r0.btn_add_xc
            r1.requestFocus()
            goto L6f
        L6a:
            android.widget.Button r1 = r0.btn_add_m3u
            r1.requestFocus()
        L6f:
            return r3
        L70:
            android.widget.Button r1 = r0.btn_add_m3u
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L80
            android.widget.Button r1 = r0.btn_add_xc
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L8b
        L80:
            android.widget.ImageButton r1 = r0.btn_back
            r1.setFocusable(r3)
            android.widget.ImageButton r1 = r0.btn_back
            r1.requestFocus()
            return r3
        L8b:
            return r2
    }

    private /* synthetic */ void lambda$showNoConnectionDlgFragment$1() {
            r1 = this;
            java.lang.String r0 = r1.playlistID
            r1.addPlaylist(r0)
            return
    }

    public static com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment newInstance(android.content.Context r1, int r2, com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.SuccessAddedListener r3) {
            com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r0 = new com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment
            r0.<init>()
            r0.context = r1
            r0.listener = r3
            r0.playlist_position = r2
            return r0
    }

    private void showNoConnectionDlgFragment() {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "no_connection"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            android.content.Context r1 = r5.getContext()
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getCheck_internet()
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.newInstance(r1, r3)
            r5.dlgFragment = r1
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r3 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r4 = 6
            r3.<init>(r5, r4)
            r1.setOnRetryClickListener(r3)
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = r5.dlgFragment
            r1.show(r0, r2)
            return
    }

    private void showSuccessDlg() {
            r7 = this;
            com.flextv.livestore.dlg.SuccessDlg r6 = new com.flextv.livestore.dlg.SuccessDlg
            android.content.Context r1 = r7.getContext()
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r2 = r0.getStr_playlist_uploaded_successfully()
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r3 = r0.getOk()
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r4 = r0.getCancel()
            com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment$1 r5 = new com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment$1
            r5.<init>(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return
    }

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L52
            com.flextv.livestore.models.AppInfoModel$UrlModel r3 = new com.flextv.livestore.models.AppInfoModel$UrlModel     // Catch: java.lang.Exception -> L55
            r3.<init>()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Exception -> L55
            r3.setId(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = "name"
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> L55
            r3.setName(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = "url"
            java.lang.String r2 = r2.getString(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L55
            r3.setUrl(r2)     // Catch: java.lang.Exception -> L55
            int r2 = r1.playlist_position     // Catch: java.lang.Exception -> L55
            r0 = -1
            if (r2 == r0) goto L36
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r0 = r1.urlModelList     // Catch: java.lang.Exception -> L55
            r0.set(r2, r3)     // Catch: java.lang.Exception -> L55
            goto L3b
        L36:
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r2 = r1.urlModelList     // Catch: java.lang.Exception -> L55
            r2.add(r3)     // Catch: java.lang.Exception -> L55
        L3b:
            com.flextv.livestore.models.AppInfoModel r2 = r1.appInfoModel     // Catch: java.lang.Exception -> L55
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r3 = r1.urlModelList     // Catch: java.lang.Exception -> L55
            r2.setResult(r3)     // Catch: java.lang.Exception -> L55
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.sharedPreferenceHelper     // Catch: java.lang.Exception -> L55
            com.flextv.livestore.models.AppInfoModel r3 = r1.appInfoModel     // Catch: java.lang.Exception -> L55
            r2.setSharedPreferenceAppInfo(r3)     // Catch: java.lang.Exception -> L55
            com.flextv.livestore.models.AppInfoModel r2 = r1.appInfoModel     // Catch: java.lang.Exception -> L55
            com.flextv.livestore.utils.Utils.saveToFile(r2)     // Catch: java.lang.Exception -> L55
            r1.showSuccessDlg()     // Catch: java.lang.Exception -> L55
            goto L55
        L52:
            r1.showNoConnectionDlgFragment()
        L55:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r1.getId()
            switch(r1) {
                case 2131427460: goto L1a;
                case 2131427464: goto L16;
                case 2131428280: goto Lf;
                case 2131428281: goto L8;
                default: goto L7;
            }
        L7:
            goto L1f
        L8:
            r1 = 1
            r0.is_xc = r1
            r0.changeXCFormat()
            goto L1f
        Lf:
            r1 = 0
            r0.is_xc = r1
            r0.changeXCFormat()
            goto L1f
        L16:
            r0.dismiss()
            goto L1f
        L1a:
            java.lang.String r1 = r0.playlistID
            r0.addPlaylist(r1)
        L1f:
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
            r4 = 2131624024(0x7f0e0058, float:1.8875216E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            r1.sharedPreferenceHelper = r3
            android.content.Context r3 = r1.getContext()
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.sharedPreferenceHelper
            com.flextv.livestore.models.AppInfoModel r3 = r3.getSharedPreferenceAppInfo()
            r1.appInfoModel = r3
            if (r3 == 0) goto L2d
            java.util.List r3 = r3.getResult()
            r1.urlModelList = r3
        L2d:
            r1.initView(r2)
            int r3 = r1.playlist_position
            r4 = -1
            if (r3 == r4) goto Lf7
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            java.lang.Object r3 = r4.get(r3)
            com.flextv.livestore.models.AppInfoModel$UrlModel r3 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r3
            java.lang.String r3 = r3.getUrl()
            java.lang.String r4 = "username"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto La9
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r3 = r1.urlModelList
            int r4 = r1.playlist_position
            java.lang.Object r3 = r3.get(r4)
            com.flextv.livestore.models.AppInfoModel$UrlModel r3 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r3
            java.lang.String r3 = r3.getUrl()
            java.lang.String r4 = "password"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto La9
            r3 = 1
            r1.is_xc = r3
            android.widget.EditText r3 = r1.et_url
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            int r0 = r1.playlist_position
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getUrl()
            java.lang.String r4 = com.flextv.livestore.helper.GetSharedInfo.getDomainFromUrl(r4)
            r3.setText(r4)
            android.widget.EditText r3 = r1.et_username
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            int r0 = r1.playlist_position
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getUrl()
            java.lang.String r4 = com.flextv.livestore.helper.GetSharedInfo.getUsernameFromUrl(r4)
            r3.setText(r4)
            android.widget.EditText r3 = r1.et_password
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            int r0 = r1.playlist_position
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getUrl()
            java.lang.String r4 = com.flextv.livestore.helper.GetSharedInfo.getPasswordFromUrl(r4)
            r3.setText(r4)
            goto Lbe
        La9:
            r1.is_xc = r0
            android.widget.EditText r3 = r1.et_url
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            int r0 = r1.playlist_position
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getUrl()
            r3.setText(r4)
        Lbe:
            android.widget.EditText r3 = r1.et_name
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r4 = r1.urlModelList
            int r0 = r1.playlist_position
            java.lang.Object r4 = r4.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r4 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r4
            java.lang.String r4 = r4.getName()
            r3.setText(r4)
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r3 = r1.urlModelList
            int r4 = r1.playlist_position
            java.lang.Object r3 = r3.get(r4)
            com.flextv.livestore.models.AppInfoModel$UrlModel r3 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r3
            java.lang.String r3 = r3.getId()
            r1.playlistID = r3
            android.widget.Button r3 = r1.btn_add
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getStr_update_playlist()
            r3.setText(r4)
            android.widget.TextView r3 = r1.txt_name
            com.flextv.livestore.models.WordModels r4 = r1.wordModels
            java.lang.String r4 = r4.getStr_edit_playlist()
            r3.setText(r4)
        Lf7:
            r1.changeXCFormat()
            android.app.Dialog r3 = r1.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 2
            r4.<init>(r1, r0)
            r3.setOnKeyListener(r4)
            return r2
    }
}
