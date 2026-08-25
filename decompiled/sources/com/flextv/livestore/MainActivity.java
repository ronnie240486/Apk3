package com.flextv.livestore;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends com.flextv.livestore.apps.BaseActivity implements com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public com.flextv.livestore.models.AppInfoModel.UrlModel currentUrlModel;
    public java.lang.String description;
    public com.flextv.livestore.dlgfragment.DescriptionDlgFragment descriptionDlgFragment;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public int failed_count;
    public pl.droidsonroids.gif.GifImageView image_loader;
    public int playlist_position;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public java.lang.String subscription;
    public com.flextv.livestore.models.WordModels wordModels;




    public MainActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.subscription = r0
            r1.description = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.failed_count = r0
            r1.playlist_position = r0
            return
    }

    @androidx.annotation.RequiresApi(api = 23)
    private void CheckSDK23Permission() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r2 = r3.addPermission(r1, r2)
            if (r2 != 0) goto L17
            java.lang.String r2 = "READ / WRITE SD CARD"
            r0.add(r2)
        L17:
            int r0 = r1.size()
            if (r0 <= 0) goto L2f
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = 124(0x7c, float:1.74E-43)
            r3.requestPermissions(r0, r1)
            return
        L2f:
            r3.getMacAddress()
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.MainActivity r0) {
            r0.goToWebsite()
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.MainActivity r0) {
            r0.loadingData()
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.MainActivity r0) {
            r0.finishApp()
            return
    }

    @androidx.annotation.RequiresApi(api = 23)
    private boolean addPermission(java.util.List<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r3)
            if (r0 == 0) goto L11
            r2.add(r3)
            boolean r2 = r1.shouldShowRequestPermissionRationale(r3)
            if (r2 != 0) goto L11
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    private void checkAppInfoModel(com.flextv.livestore.models.AppInfoModel r12) {
            r11 = this;
            com.flextv.livestore.models.WordModels r0 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r11)
            r11.wordModels = r0
            r0 = 0
            r11.failed_count = r0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd"
            r1.<init>(r2)
            r2 = 0
            java.lang.String r4 = r12.getExpiredDate()     // Catch: java.lang.Exception -> L20
            java.util.Date r1 = r1.parse(r4)     // Catch: java.lang.Exception -> L20
            long r4 = r1.getTime()     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r4 = r2
        L21:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r6 = r1.getTime()
            long r6 = r4 - r6
            r8 = 604800000(0x240c8400, double:2.988109026E-315)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L11d
            boolean r1 = r12.isIs_google_pay()
            if (r1 == 0) goto L3b
            goto L11d
        L3b:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r6 = r1.getTime()
            long r6 = r4 - r6
            java.lang.String r1 = " "
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 <= 0) goto Ld2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r2 = r4 - r2
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 >= 0) goto Ld2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r4 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r2
            r2 = 3600(0xe10, double:1.7786E-320)
            long r4 = r4 / r2
            r2 = 24
            long r4 = r4 / r2
            int r2 = (int) r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.flextv.livestore.models.WordModels r4 = r11.wordModels
            java.lang.String r4 = r4.getSub_remaining()
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            r3.append(r1)
            com.flextv.livestore.models.WordModels r1 = r11.wordModels
            java.lang.String r1 = r1.getDays()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.util.List r2 = r12.getResult()
            int r2 = r2.size()
            if (r2 <= 0) goto Lbc
            java.util.List r2 = r12.getResult()
            java.lang.Object r0 = r2.get(r0)
            com.flextv.livestore.models.AppInfoModel$UrlModel r0 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "0"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lbc
            com.flextv.livestore.models.WordModels r0 = r11.wordModels
            java.lang.String r0 = r0.getTo_add_manage()
            r11.description = r0
            goto Lc4
        Lbc:
            com.flextv.livestore.models.WordModels r0 = r11.wordModels
            java.lang.String r0 = r0.getNo_playlist_description()
            r11.description = r0
        Lc4:
            java.lang.String r0 = r11.description
            java.util.List r12 = r12.getResult()
            int r12 = r12.size()
            r11.showDescriptionDlgFragment(r1, r0, r12)
            goto L13c
        Ld2:
            int r0 = r12.getIs_trial()
            r2 = 1
            if (r0 != r2) goto Le2
            com.flextv.livestore.models.WordModels r0 = r11.wordModels
            java.lang.String r0 = r0.getTrial_ended()
            r11.subscription = r0
            goto Lea
        Le2:
            com.flextv.livestore.models.WordModels r0 = r11.wordModels
            java.lang.String r0 = r0.getTv_mac_expired()
            r11.subscription = r0
        Lea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.flextv.livestore.models.WordModels r2 = r11.wordModels
            java.lang.String r2 = r2.getTo_continue()
            r0.append(r2)
            java.lang.String r2 = " €"
            r0.append(r2)
            java.lang.String r12 = r12.getPrice()
            r0.append(r12)
            r0.append(r1)
            com.flextv.livestore.models.WordModels r12 = r11.wordModels
            java.lang.String r12 = r12.getVia_website()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.description = r12
            java.lang.String r0 = r11.subscription
            r1 = -1
            r11.showDescriptionDlgFragment(r0, r12, r1)
            goto L13c
        L11d:
            java.util.List r12 = r12.getResult()
            int r12 = r12.size()
            if (r12 <= 0) goto L12b
            r11.loadingData()
            goto L13c
        L12b:
            java.lang.String r12 = ""
            r11.subscription = r12
            com.flextv.livestore.models.WordModels r12 = r11.wordModels
            java.lang.String r12 = r12.getNo_playlist_description()
            r11.description = r12
            java.lang.String r1 = r11.subscription
            r11.showDescriptionDlgFragment(r1, r12, r0)
        L13c:
            return
    }

    private void checkLocalStorageAccount() {
            r7 = this;
            java.lang.String r0 = com.flextv.livestore.utils.Utils.ReadFile()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Network Error! Please check your internet connection!"
            r2 = 3
            r3 = 0
            if (r0 == 0) goto L30
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            com.flextv.livestore.models.AppInfoModel r0 = r0.getSharedPreferenceAppInfo()
            r7.appInfoModel = r0
            if (r0 != 0) goto L2c
            int r0 = r7.failed_count
            int r0 = r0 + 1
            r7.failed_count = r0
            if (r0 >= r2) goto L24
            r7.getUserInfoModel()
            goto L84
        L24:
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r1, r3)
            r0.show()
            goto L84
        L2c:
            r7.checkAppInfoModel(r0)
            goto L84
        L30:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r4 = new java.lang.String
            java.lang.String r5 = com.flextv.livestore.utils.Utils.ReadFile()
            byte[] r5 = android.util.Base64.decode(r5, r3)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r5, r6)
            java.lang.String r4 = r4.trim()
            com.flextv.livestore.MainActivity$1 r5 = new com.flextv.livestore.MainActivity$1
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            java.lang.Object r0 = r0.fromJson(r4, r5)
            com.flextv.livestore.models.AppInfoModel r0 = (com.flextv.livestore.models.AppInfoModel) r0
            r7.appInfoModel = r0
            if (r0 == 0) goto L71
            com.flextv.livestore.helper.PreferenceHelper r1 = r7.preferenceHelper
            r1.setSharedPreferenceAppInfo(r0)
            com.flextv.livestore.models.AppInfoModel r0 = r7.appInfoModel
            r7.checkAppInfoModel(r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            com.flextv.livestore.models.AppInfoModel r1 = r7.appInfoModel
            java.lang.String r1 = r1.getMac_address()
            r0.setSharedPreferenceMacAddress(r1)
            goto L84
        L71:
            int r0 = r7.failed_count
            int r0 = r0 + 1
            r7.failed_count = r0
            if (r0 >= r2) goto L7d
            r7.getUserInfoModel()
            goto L84
        L7d:
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r1, r3)
            r0.show()
        L84:
            return
    }

    private void finishApp() {
            r3 = this;
            r0 = 0
            java.lang.System.exit(r0)
            int r1 = android.os.Process.myPid()
            android.os.Process.killProcess(r1)
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r3.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            if (r1 == 0) goto L2b
            java.util.List r1 = r1.getAppTasks()
            if (r1 == 0) goto L2b
            int r2 = r1.size()
            if (r2 <= 0) goto L2b
            java.lang.Object r0 = r1.get(r0)
            android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0
            r1 = 1
            r0.setExcludeFromRecents(r1)
        L2b:
            r3.finishAndRemoveTask()
            return
    }

    private void getMacAddress() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceLanguageCode()
            if (r0 == 0) goto Le
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            r0.getSharedPreferenceLanguageCode()
            goto L1b
        Le:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            com.flextv.livestore.helper.PreferenceHelper r1 = r2.preferenceHelper
            r1.setSharedPreferenceLanguageCode(r0)
        L1b:
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            int r0 = r0.getSharedPreferenceSubtitleSize()
            if (r0 != 0) goto L45
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r2)
            if (r0 == 0) goto L31
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            r1 = 46
            r0.setSharedPreferenceSubtitleSize(r1)
            goto L38
        L31:
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            r1 = 12
            r0.setSharedPreferenceSubtitleSize(r1)
        L38:
            boolean r0 = com.flextv.livestore.utils.Utils.IsAmazonDevice()
            if (r0 == 0) goto L45
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            r1 = 35
            r0.setSharedPreferenceSubtitleSize(r1)
        L45:
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            r0.versionCheck()
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            r0.loadVersion()
            r2.getUserInfoModel()
            return
    }

    private void getUserInfoModel() {
            r4 = this;
            java.lang.String r0 = com.flextv.livestore.utils.Utils.getDeviceId(r4)
            java.lang.String r1 = com.flextv.livestore.apps.LTVApp.version_name
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceDeviceType()
            r3 = 0
            java.lang.String r0 = com.flextv.livestore.utils.Security.getStringData(r0, r1, r3, r2)
            java.lang.String r0 = r0.trim()
            com.flextv.livestore.remote.GetDataRequest r1 = new com.flextv.livestore.remote.GetDataRequest
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r4, r2)
            org.json.JSONObject r0 = com.flextv.livestore.utils.Security.getJsonData(r0)
            java.lang.String r2 = com.flextv.livestore.apps.Constants.second_response_url
            r1.getResponse(r0, r2)
            r1.setOnGetResponseListener(r4)
            return
    }

    private void goToWebsite() {
            r3 = this;
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r0 == 0) goto La
            r3.finishApp()
            goto L20
        La:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r2 = "https://iboproapp.com/manage-playlists/login/"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L20
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L20
            r1 = 276856832(0x10808000, float:5.0684313E-29)
            r0.addFlags(r1)     // Catch: java.lang.Exception -> L20
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L20
        L20:
            return
    }

    private void loadingData() {
            r4 = this;
            java.lang.Class<com.andyhax.veeepeeen.ui.login.LoginActivity> r0 = com.andyhax.veeepeeen.ui.login.LoginActivity.class
            pl.droidsonroids.gif.GifImageView r1 = r4.image_loader
            r2 = 0
            r1.setVisibility(r2)
            int r1 = com.flextv.livestore.helper.GetSharedInfo.getPlaylistPosition(r4)
            r4.playlist_position = r1
            com.flextv.livestore.models.AppInfoModel r1 = r4.appInfoModel     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L99
            java.util.List r1 = r1.getResult()     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L99
            com.flextv.livestore.models.AppInfoModel r1 = r4.appInfoModel     // Catch: java.lang.Exception -> La5
            java.util.List r1 = r1.getResult()     // Catch: java.lang.Exception -> La5
            int r1 = r1.size()     // Catch: java.lang.Exception -> La5
            if (r1 <= 0) goto L99
            com.flextv.livestore.models.AppInfoModel r1 = r4.appInfoModel     // Catch: java.lang.Exception -> La5
            java.util.List r1 = r1.getResult()     // Catch: java.lang.Exception -> La5
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r1     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "0"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> La5
            if (r1 != 0) goto L99
            com.flextv.livestore.models.AppInfoModel r1 = r4.appInfoModel     // Catch: java.lang.Exception -> La5
            java.util.List r1 = r1.getResult()     // Catch: java.lang.Exception -> La5
            int r3 = r4.playlist_position     // Catch: java.lang.Exception -> La5
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = (com.flextv.livestore.models.AppInfoModel.UrlModel) r1     // Catch: java.lang.Exception -> La5
            r4.currentUrlModel = r1     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "username"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L6a
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper     // Catch: java.lang.Exception -> La5
            r1.setSharedPreferenceISM3U(r2)     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = r4.currentUrlModel     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.WordModels r2 = r4.wordModels     // Catch: java.lang.Exception -> La5
            r4.goToLogin(r1, r2)     // Catch: java.lang.Exception -> La5
            goto Lb0
        L6a:
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = r4.currentUrlModel     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> La5
            boolean r1 = com.flextv.livestore.helper.GetSharedInfo.checkXUILink(r1)     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L87
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper     // Catch: java.lang.Exception -> La5
            r1.setSharedPreferenceISM3U(r2)     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = r4.currentUrlModel     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.WordModels r2 = r4.wordModels     // Catch: java.lang.Exception -> La5
            r4.goToXUILogin(r1, r2)     // Catch: java.lang.Exception -> La5
            goto Lb0
        L87:
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper     // Catch: java.lang.Exception -> La5
            r2 = 1
            r1.setSharedPreferenceISM3U(r2)     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.AppInfoModel$UrlModel r1 = r4.currentUrlModel     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> La5
            com.flextv.livestore.models.WordModels r2 = r4.wordModels     // Catch: java.lang.Exception -> La5
            r4.reloadM3UData(r1, r2)     // Catch: java.lang.Exception -> La5
            goto Lb0
        L99:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> La5
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> La5
            r4.startActivity(r1)     // Catch: java.lang.Exception -> La5
            r4.finish()     // Catch: java.lang.Exception -> La5
            goto Lb0
        La5:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb0
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> Lb0
            r4.startActivity(r1)     // Catch: java.lang.Exception -> Lb0
            r4.finish()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            return
    }

    private void showDescriptionDlgFragment(java.lang.String r5, java.lang.String r6, int r7) {
            r4 = this;
            pl.droidsonroids.gif.GifImageView r0 = r4.image_loader
            r1 = 8
            r0.setVisibility(r1)
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_description"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L1c
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L1c:
            android.content.Context r1 = r4.getApplicationContext()
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment r5 = com.flextv.livestore.dlgfragment.DescriptionDlgFragment.newInstance(r1, r5, r6, r7)
            r4.descriptionDlgFragment = r5
            com.flextv.livestore.MainActivity$2 r6 = new com.flextv.livestore.MainActivity$2
            r6.<init>(r4, r7)
            r5.setButtonClickListener(r6)
            com.flextv.livestore.dlgfragment.DescriptionDlgFragment r5 = r4.descriptionDlgFragment
            r5.show(r0, r2)
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
            com.flextv.livestore.MainActivity$3 r3 = new com.flextv.livestore.MainActivity$3
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.exitDlgFragment
            r1.show(r0, r2)
            return
    }

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L83
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r0) goto L86
            java.lang.String r3 = "data"
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L7f
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> L7b
            java.lang.String r2 = com.flextv.livestore.utils.Security.getDecodedString(r2)     // Catch: java.lang.Exception -> L7b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L73
            r3.<init>(r2)     // Catch: java.lang.Exception -> L73
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L73
            r2.<init>()     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L73
            java.lang.Class<com.flextv.livestore.models.AppInfoModel> r0 = com.flextv.livestore.models.AppInfoModel.class
            java.lang.Object r2 = r2.fromJson(r3, r0)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r2 = (com.flextv.livestore.models.AppInfoModel) r2     // Catch: java.lang.Exception -> L73
            r1.appInfoModel = r2     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            r3.setSharedPreferenceAppInfo(r2)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            r3 = 0
            r2.setSharedPreferenceIsPlaylistChanged(r3)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            r2.setSharedPreferenceFirstLunch(r3)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r3 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r3.getMac_address()     // Catch: java.lang.Exception -> L73
            r2.setSharedPreferenceMacAddress(r3)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r3 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r3.getDevice_key()     // Catch: java.lang.Exception -> L73
            r2.setSharedPreferenceDeviceKey(r3)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r2 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            int r2 = r2.getParent_synced()     // Catch: java.lang.Exception -> L73
            r3 = 1
            if (r2 != r3) goto L68
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r3 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r3.getParent_control()     // Catch: java.lang.Exception -> L73
            r2.setSharedPreferenceParentPassword(r3)     // Catch: java.lang.Exception -> L73
        L68:
            com.flextv.livestore.models.AppInfoModel r2 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.utils.Utils.saveToFile(r2)     // Catch: java.lang.Exception -> L73
            com.flextv.livestore.models.AppInfoModel r2 = r1.appInfoModel     // Catch: java.lang.Exception -> L73
            r1.checkAppInfoModel(r2)     // Catch: java.lang.Exception -> L73
            goto L86
        L73:
            r2 = move-exception
            r1.checkLocalStorageAccount()     // Catch: java.lang.Exception -> L7b
            r2.printStackTrace()     // Catch: java.lang.Exception -> L7b
            goto L86
        L7b:
            r1.checkLocalStorageAccount()
            goto L86
        L7f:
            r1.checkLocalStorageAccount()
            goto L86
        L83:
            r1.checkLocalStorageAccount()
        L86:
            return
    }

    public void checkAn() {
            r2 = this;
            r0 = 2131951645(0x7f13001d, float:1.953971E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = com.android.volley.Async2Cache.b
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            r2.finish()
            return
        L17:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto L2e
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L2e
            pl.droidsonroids.gif.GifImageView r3 = r2.image_loader
            int r3 = r3.getVisibility()
            r0 = 1
            if (r3 != 0) goto L27
            r2.setStop(r0)
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r3.<init>(r2, r1)
            r2.startActivity(r3)
            r2.finish()
            goto L2d
        L27:
            r2.setStop(r0)
            r2.showExitDlgFragment()
        L2d:
            return r0
        L2e:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    @Override // com.flextv.livestore.apps.BaseActivity
    public final void doNextTask(boolean r5) {
            r4 = this;
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "newlogin"
            java.lang.String r1 = r1.getStringExtra(r0)
            if (r1 != 0) goto L4b
            if (r5 == 0) goto L25
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r5.setSharedPreferenceLastPlaylistDate(r0)
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.HomeActivity> r0 = com.flextv.livestore.activities.HomeActivity.class
            r5.<init>(r4, r0)
            r4.startActivity(r5)
            goto L55
        L25:
            pl.droidsonroids.gif.GifImageView r5 = r4.image_loader
            r0 = 8
            r5.setVisibility(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = ""
            r5.append(r0)
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPlaylist_is_not_working()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
        L4b:
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.HomeActivity> r0 = com.flextv.livestore.activities.HomeActivity.class
            r5.<init>(r4, r0)
            r4.startActivity(r5)
        L55:
            r4.finish()
            return
    }

    @Override // com.flextv.livestore.apps.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            com.flextv.livestore.apps.Constants.second_url_id()
            r1.checkAn()
            r2 = 2131623975(0x7f0e0027, float:1.8875117E38)
            r1.setContentView(r2)
            com.flextv.livestore.utils.Utils.FullScreenCall(r1)
            com.flextv.livestore.helper.PreferenceHelper r2 = new com.flextv.livestore.helper.PreferenceHelper
            r2.<init>(r1)
            r1.preferenceHelper = r2
            r2 = 2131427803(0x7f0b01db, float:1.8477233E38)
            android.view.View r2 = r1.findViewById(r2)
            pl.droidsonroids.gif.GifImageView r2 = (pl.droidsonroids.gif.GifImageView) r2
            r1.image_loader = r2
            r2 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = ""
            r2.setText(r0)
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceDeviceType()
            if (r2 != 0) goto L50
            boolean r2 = com.flextv.livestore.utils.Utils.checkIsTelevision(r1)
            if (r2 == 0) goto L49
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r0 = "tv"
            r2.setSharedPreferenceDeviceType(r0)
            goto L50
        L49:
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r0 = "mobile"
            r2.setSharedPreferenceDeviceType(r0)
        L50:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 < r0) goto L5a
            r1.CheckSDK23Permission()
            goto L5d
        L5a:
            r1.getMacAddress()
        L5d:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3) {
            r0 = this;
            r0.getMacAddress()
            super.onRequestPermissionsResult(r1, r2, r3)
            return
    }
}
