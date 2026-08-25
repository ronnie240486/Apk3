package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class HomeActivity extends com.flextv.livestore.apps.BaseActivity implements android.view.View.OnClickListener, com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public com.flextv.livestore.dlgfragment.AccountDlgFragment accountDlgFragment;
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public androidx.constraintlayout.widget.ConstraintLayout ly_account;
    public androidx.constraintlayout.widget.ConstraintLayout ly_change;
    public androidx.constraintlayout.widget.ConstraintLayout ly_exit;
    public androidx.constraintlayout.widget.ConstraintLayout ly_live;
    public androidx.constraintlayout.widget.ConstraintLayout ly_movie;
    public androidx.constraintlayout.widget.ConstraintLayout ly_reload;
    public androidx.constraintlayout.widget.ConstraintLayout ly_series;
    public androidx.constraintlayout.widget.ConstraintLayout ly_setting;
    public com.flextv.livestore.dlgfragment.NoConnectionDlgFragment noConnectionDlgFragment;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public pl.droidsonroids.gif.GifImageView progressBar;
    public androidx.activity.result.ActivityResultLauncher<android.content.Intent> someActivityResultLauncher;
    public android.widget.TextView txt_account;
    public android.widget.TextView txt_change;
    public android.widget.TextView txt_exit;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_reload;
    public android.widget.TextView txt_series;
    public android.widget.TextView txt_setting;
    public android.widget.TextView txt_time;
    public android.widget.TextView txt_version;
    public com.flextv.livestore.models.WordModels wordModels;


    /* JADX INFO: renamed from: $r8$lambda$-Sva-EQ37hIvvLxDd7dJZVbj16Q, reason: not valid java name */
    public static /* synthetic */ void m52$r8$lambda$SvaEQ37hIvvLxDd7dJZVbj16Q(com.flextv.livestore.activities.HomeActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$WbPkpSXMw5MKLhOhUBDuMpTS46c(com.flextv.livestore.activities.HomeActivity r0) {
            r0.lambda$showAccountDlgFragment$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$kn6NdZpjkNECc63I5cQZXLnMOuc(com.flextv.livestore.activities.HomeActivity r0) {
            r0.lambda$showNoConnectionDlgFragment$2()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.HomeActivity> r0 = com.flextv.livestore.activities.HomeActivity.class
            return
    }

    public HomeActivity() {
            r2 = this;
            r2.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.someActivityResultLauncher = r0
            return
    }

    private void changeStringsInApp() {
            r2 = this;
            com.flextv.livestore.models.WordModels r0 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r2)
            r2.wordModels = r0
            android.widget.TextView r1 = r2.txt_live
            java.lang.String r0 = r0.getLive_tv()
            r1.setText(r0)
            android.widget.TextView r0 = r2.txt_movie
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_series
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_account
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getAccount()
            java.lang.String r1 = "Esportes"
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_change
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getChange_playlist()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_setting
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getSettings()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_reload
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getReload_portal()
            r0.setText(r1)
            android.widget.TextView r0 = r2.txt_exit
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getExit()
            r0.setText(r1)
            return
    }

    private java.lang.String getCurrentPlaylistExpiredDate() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            java.lang.String r1 = "Undefined."
            if (r0 == 0) goto Lb
            return r1
        Lb:
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.models.LoginModel r0 = r0.getSharedPreferenceLoginModel()
            if (r0 == 0) goto L1c
            java.lang.Long r0 = r0.getExp_date()
            java.lang.String r0 = com.flextv.livestore.utils.Utils.getDate(r0)
            return r0
        L1c:
            return r1
    }

    private void initView() {
            r1 = this;
            r0 = 2131428350(0x7f0b03fe, float:1.8478342E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_time = r0
            r0 = 2131427909(0x7f0b0245, float:1.8477448E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_live = r0
            r0 = 2131427913(0x7f0b0249, float:1.8477456E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_movie = r0
            r0 = 2131427920(0x7f0b0250, float:1.847747E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_series = r0
            r0 = 2131427887(0x7f0b022f, float:1.8477403E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_account = r0
            r0 = 2131427897(0x7f0b0239, float:1.8477423E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_change = r0
            r0 = 2131427921(0x7f0b0251, float:1.8477472E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_setting = r0
            r0 = 2131427916(0x7f0b024c, float:1.8477462E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_reload = r0
            r0 = 2131427904(0x7f0b0240, float:1.8477437E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.ly_exit = r0
            r0 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_live = r0
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_movie = r0
            r0 = 2131428343(0x7f0b03f7, float:1.8478328E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_series = r0
            r0 = 2131428278(0x7f0b03b6, float:1.8478196E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_account = r0
            r0 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_change = r0
            r0 = 2131428344(0x7f0b03f8, float:1.847833E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_setting = r0
            r0 = 2131428337(0x7f0b03f1, float:1.8478316E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_reload = r0
            r0 = 2131428305(0x7f0b03d1, float:1.847825E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_exit = r0
            r0 = 2131428354(0x7f0b0402, float:1.847835E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_version = r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r1.findViewById(r0)
            pl.droidsonroids.gif.GifImageView r0 = (pl.droidsonroids.gif.GifImageView) r0
            r1.progressBar = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_live
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_movie
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_series
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_account
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_change
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_setting
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_reload
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.ly_exit
            r0.setOnClickListener(r1)
            r1.loadWebview()
            return
    }

    private /* synthetic */ void lambda$new$0(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            int r0 = r3.getResultCode()
            r1 = -1
            if (r0 != r1) goto L10
            android.content.Intent r3 = r3.getData()
            if (r3 == 0) goto L10
            r2.changeStringsInApp()
        L10:
            return
    }

    private /* synthetic */ void lambda$showAccountDlgFragment$1() {
            r1 = this;
            com.flextv.livestore.dlgfragment.AccountDlgFragment r0 = r1.accountDlgFragment
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$showNoConnectionDlgFragment$2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "is_home"
            r2 = 0
            r0.putExtra(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
    }

    private void loadWebview() {
            r6 = this;
            r0 = 2131428404(0x7f0b0434, float:1.8478452E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L28
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            android.webkit.WebSettings r1 = r0.getSettings()
            r2 = 1
            r1.setJavaScriptEnabled(r2)
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            com.flextv.livestore.models.AppInfoModel r1 = r1.getSharedPreferenceAppInfo()
            java.lang.String r1 = r1.getHome_url1()
            r0.loadUrl(r1)
            r1 = 0
            r0.setBackgroundColor(r1)
        L28:
            return
    }

    private void reloadPortal() {
            r5 = this;
            pl.droidsonroids.gif.GifImageView r0 = r5.progressBar
            r1 = 0
            r0.setVisibility(r1)
            int r0 = com.flextv.livestore.helper.GetSharedInfo.getPlaylistPosition(r5)
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            com.flextv.livestore.models.AppInfoModel r2 = r2.getSharedPreferenceAppInfo()
            java.util.List r3 = r2.getResult()
            int r3 = r3.size()
            if (r3 <= 0) goto L6f
            java.util.List r2 = r2.getResult()
            java.lang.Object r0 = r2.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r0 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r0
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            r3 = 0
            r2.setSharedPreferenceLastPlaylistDate(r3)
            java.lang.String r2 = r0.getUrl()
            java.lang.String r3 = "username"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L47
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            r2.setSharedPreferenceISM3U(r1)
            java.lang.String r0 = r0.getUrl()
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            r5.goToLogin(r0, r1)
            goto L6f
        L47:
            java.lang.String r2 = r0.getUrl()
            boolean r2 = com.flextv.livestore.helper.GetSharedInfo.checkXUILink(r2)
            if (r2 == 0) goto L60
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            r2.setSharedPreferenceISM3U(r1)
            java.lang.String r0 = r0.getUrl()
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            r5.goToXUILogin(r0, r1)
            goto L6f
        L60:
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            r2 = 1
            r1.setSharedPreferenceISM3U(r2)
            java.lang.String r0 = r0.getUrl()
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            r5.reloadM3UData(r0, r1)
        L6f:
            return
    }

    private void showAccountDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_account"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.dlgfragment.AccountDlgFragment r1 = com.flextv.livestore.dlgfragment.AccountDlgFragment.newInstance(r4)
            r4.accountDlgFragment = r1
            com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0
            r3.<init>(r4)
            r1.setOnPayButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.AccountDlgFragment r1 = r4.accountDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showExitDlgFragment() {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_exit"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getExit()
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getExit_description()
            com.flextv.livestore.models.WordModels r4 = r6.wordModels
            java.lang.String r4 = r4.getStr_yes()
            com.flextv.livestore.models.WordModels r5 = r6.wordModels
            java.lang.String r5 = r5.getNo()
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = com.flextv.livestore.dlgfragment.ExitDlgFragment.newInstance(r1, r3, r4, r5)
            r6.exitDlgFragment = r1
            com.flextv.livestore.activities.HomeActivity$1 r3 = new com.flextv.livestore.activities.HomeActivity$1
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.exitDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showNoConnectionDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_no_connection"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getPlaylist_is_not_working()
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.newInstance(r4, r1)
            r4.noConnectionDlgFragment = r1
            com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.HomeActivity$$ExternalSyntheticLambda0
            r3.<init>(r4)
            r1.setOnRetryClickListener(r3)
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = r4.noConnectionDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showWaitToast() {
            r2 = this;
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getPlaylist_is_loading()
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
    }

    private void syncParentControl() {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceMacAddress()
            com.flextv.livestore.helper.PreferenceHelper r1 = r3.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceParentPassword()
            java.lang.String r0 = com.flextv.livestore.utils.Security.getParentData(r0, r1)
            com.flextv.livestore.remote.GetDataRequest r1 = new com.flextv.livestore.remote.GetDataRequest
            r2 = 3000(0xbb8, float:4.204E-42)
            r1.<init>(r3, r2)
            org.json.JSONObject r0 = com.flextv.livestore.utils.Security.getJsonData(r0)
            java.lang.String r2 = com.flextv.livestore.apps.Constants.second_update_control
            r1.getResponse(r0, r2)
            r1.setOnGetResponseListener(r3)
            return
    }

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r1, int r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto L12
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L12
            r2.showExitDlgFragment()
            r3 = 1
            return r3
        L12:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    @Override // com.flextv.livestore.apps.BaseActivity
    public final void doNextTask(boolean r6) {
            r5 = this;
            r0 = 8
            if (r6 == 0) goto L24
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r6.setSharedPreferenceLastPlaylistDate(r1)
            pl.droidsonroids.gif.GifImageView r6 = r5.progressBar
            r6.setVisibility(r0)
            com.flextv.livestore.models.WordModels r6 = r5.wordModels
            java.lang.String r6 = r6.getPortal_loaded_successfully()
            r0 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r0)
            r6.show()
            goto L2c
        L24:
            pl.droidsonroids.gif.GifImageView r6 = r5.progressBar
            r6.setVisibility(r0)
            r5.showNoConnectionDlgFragment()
        L2c:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            switch(r3) {
                case 2131427887: goto Lf6;
                case 2131427897: goto Lda;
                case 2131427904: goto Ld6;
                case 2131427909: goto L97;
                case 2131427913: goto L67;
                case 2131427916: goto L55;
                case 2131427920: goto L24;
                case 2131427921: goto L9;
                default: goto L7;
            }
        L7:
            goto Lf9
        L9:
            pl.droidsonroids.gif.GifImageView r3 = r2.progressBar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L16
            r2.showWaitToast()
            goto Lf9
        L16:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r3 = r2.someActivityResultLauncher
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SettingActivity> r1 = com.flextv.livestore.activities.SettingActivity.class
            r0.<init>(r2, r1)
            r3.launch(r0)
            goto Lf9
        L24:
            pl.droidsonroids.gif.GifImageView r3 = r2.progressBar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L31
            r2.showWaitToast()
            goto Lf9
        L31:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            boolean r3 = r3.getSharedPreferenceIsGrid()
            if (r3 == 0) goto L49
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.series
            com.flextv.livestore.apps.LTVApp.homeType = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.CategoryActivity> r0 = com.flextv.livestore.activities.CategoryActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        L49:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SeriesActivity> r0 = com.flextv.livestore.activities.SeriesActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        L55:
            pl.droidsonroids.gif.GifImageView r3 = r2.progressBar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L62
            r2.showWaitToast()
            goto Lf9
        L62:
            r2.reloadPortal()
            goto Lf9
        L67:
            pl.droidsonroids.gif.GifImageView r3 = r2.progressBar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L74
            r2.showWaitToast()
            goto Lf9
        L74:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            boolean r3 = r3.getSharedPreferenceIsGrid()
            if (r3 == 0) goto L8c
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.movies
            com.flextv.livestore.apps.LTVApp.homeType = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.CategoryActivity> r0 = com.flextv.livestore.activities.CategoryActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        L8c:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.MovieActivity> r0 = com.flextv.livestore.activities.MovieActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        L97:
            pl.droidsonroids.gif.GifImageView r3 = r2.progressBar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto La3
            r2.showWaitToast()
            goto Lf9
        La3:
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.preferenceHelper
            boolean r3 = r3.getSharedPreferenceIsGrid()
            if (r3 == 0) goto Lba
            com.flextv.livestore.apps.HomeType r3 = com.flextv.livestore.apps.HomeType.live
            com.flextv.livestore.apps.LTVApp.homeType = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.CategoryActivity> r0 = com.flextv.livestore.activities.CategoryActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        Lba:
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            if (r3 == 0) goto Lcb
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.LiveActivity> r0 = com.flextv.livestore.activities.LiveActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        Lcb:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.mobile.LiveMobileActivity> r0 = com.flextv.livestore.activities.mobile.LiveMobileActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto Lf9
        Ld6:
            r2.showExitDlgFragment()
            goto Lf9
        Lda:
            r3 = 1
            r2.setStop(r3)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r0.<init>(r2, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = "is_home"
            r0.putExtra(r1, r3)
            r2.startActivity(r0)
            r2.finish()
            goto Lf9
        Lf6:
            r2.showAccountDlgFragment()
        Lf9:
            return
    }

    @Override // com.flextv.livestore.apps.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            com.flextv.livestore.helper.PreferenceHelper r1 = new com.flextv.livestore.helper.PreferenceHelper
            r1.<init>(r2)
            com.flextv.livestore.apps.Constants.second_url_id()
            com.flextv.livestore.models.AppInfoModel r1 = r1.getSharedPreferenceAppInfo()
            java.lang.String r1 = r1.getTheme()
            java.lang.String r0 = "6"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "5"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "4"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            r3 = 2131623970(0x7f0e0022, float:1.8875107E38)
            goto L53
        L3f:
            r3 = 2131624211(0x7f0e0113, float:1.8875595E38)
            goto L53
        L43:
            r3 = 2131624210(0x7f0e0112, float:1.8875593E38)
            goto L53
        L47:
            r3 = 2131624207(0x7f0e010f, float:1.8875587E38)
            goto L53
        L4b:
            r3 = 2131624208(0x7f0e0110, float:1.887559E38)
            goto L53
        L4f:
            r3 = 2131624209(0x7f0e0111, float:1.8875591E38)
            goto L53
        L53:
            r2.setContentView(r3)
            com.flextv.livestore.utils.Utils.FullScreenCall(r2)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            r3.<init>(r2)
            r2.preferenceHelper = r3
            com.flextv.livestore.models.AppInfoModel r3 = r3.getSharedPreferenceAppInfo()
            r2.appInfoModel = r3
            r2.initView()
            r2.changeStringsInApp()
            android.widget.TextView r3 = r2.txt_time
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getCurrent_expired()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.getCurrentPlaylistExpiredDate()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            com.flextv.livestore.apps.LTVApp r3 = com.flextv.livestore.apps.LTVApp.instance
            r3.versionCheck()
            com.flextv.livestore.apps.LTVApp r3 = com.flextv.livestore.apps.LTVApp.instance
            r3.loadVersion()
            android.widget.TextView r3 = r2.txt_version
            java.lang.String r0 = "v"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = com.flextv.livestore.apps.LTVApp.version_name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            com.flextv.livestore.models.AppInfoModel r3 = r2.appInfoModel
            int r3 = r3.getParent_synced()
            if (r3 != 0) goto Lb9
            r2.syncParentControl()
        Lb9:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_live
            r3.requestFocus()
            return
    }
}
