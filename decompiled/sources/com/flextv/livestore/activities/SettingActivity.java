package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class SettingActivity extends com.flextv.livestore.apps.BaseActivity implements android.view.View.OnClickListener, com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public com.flextv.livestore.adapter.SettingRecyclerAdapter adapter;
    public com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment addPlaylistDlgFragment;
    public double api_version;
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public android.widget.ImageButton btn_back;
    public android.widget.Button btn_pay;
    public android.widget.Button btn_tv_pay;
    public double current_version;
    public java.text.SimpleDateFormat expire_format;
    public long expired_mils;
    public com.flextv.livestore.dlgfragment.HideCategoryDlgFragment hideCategoryDlgFragment;
    public com.flextv.livestore.dlgfragment.NoConnectionDlgFragment noConnectionDlgFragment;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public pl.droidsonroids.gif.GifImageView progress_bar;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_setting;
    public com.google.android.play.core.review.ReviewInfo reviewInfo;
    public com.google.android.play.core.review.ReviewManager reviewManager;
    public java.util.List<com.flextv.livestore.apps.SideMenu> settingLists;
    public int setting_pos;
    private java.lang.String tv_mac_address;
    public android.widget.TextView txt_mac_address;
    public android.widget.TextView txt_setting;
    public com.flextv.livestore.dlgfragment.UpdateDlgFragment updateDlgFragment;
    public com.flextv.livestore.models.WordModels wordModels;




    public class versionUpdate extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.lang.String> {
        public java.io.File file;
        public android.app.ProgressDialog mProgressDialog;
        public final /* synthetic */ com.flextv.livestore.activities.SettingActivity this$0;

        public versionUpdate(com.flextv.livestore.activities.SettingActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public final java.lang.String doInBackground(java.lang.String[] r15) {
                r14 = this;
                java.lang.String[] r15 = (java.lang.String[]) r15
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lc9 java.lang.Exception -> Lce
                r2 = 0
                r15 = r15[r2]     // Catch: java.lang.Throwable -> Lc9 java.lang.Exception -> Lce
                r1.<init>(r15)     // Catch: java.lang.Throwable -> Lc9 java.lang.Exception -> Lce
                java.net.URLConnection r15 = r1.openConnection()     // Catch: java.lang.Throwable -> Lc9 java.lang.Exception -> Lce
                java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch: java.lang.Throwable -> Lc9 java.lang.Exception -> Lce
                r1 = 60000(0xea60, float:8.4078E-41)
                r15.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> Lc1 java.lang.Exception -> Lc4
                r15.connect()     // Catch: java.lang.Throwable -> Lc1 java.lang.Exception -> Lc4
                int r1 = r15.getContentLength()     // Catch: java.lang.Throwable -> Lc1 java.lang.Exception -> Lc4
                java.io.InputStream r3 = r15.getInputStream()     // Catch: java.lang.Throwable -> Lc1 java.lang.Exception -> Lc4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r4.<init>()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r4.append(r5)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.lang.String r5 = "/"
                r4.append(r5)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.lang.String r5 = "com.flextv.livestore.apk"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r6.<init>()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r6.append(r4)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r6.append(r5)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r7 = 30
                if (r6 < r7) goto L5e
                java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                com.flextv.livestore.apps.LTVApp r6 = com.flextv.livestore.apps.LTVApp.getInstance()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r14.file = r4     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                goto L65
            L5e:
                java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r5.<init>(r4)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r14.file = r5     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            L65:
                java.io.File r4 = r14.file     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                if (r4 == 0) goto L72
                java.io.File r4 = r14.file     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r4.delete()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            L72:
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                java.io.File r5 = r14.file     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
                r5 = 4096(0x1000, float:5.74E-42)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r6 = 0
            L7f:
                int r8 = r3.read(r5)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r9 = -1
                if (r8 == r9) goto Lb2
                boolean r9 = r14.isCancelled()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                if (r9 == 0) goto L97
                r3.close()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r4.close()     // Catch: java.io.IOException -> Le9
            L92:
                r3.close()     // Catch: java.io.IOException -> Le9
                goto Le9
            L97:
                long r9 = (long) r8
                long r6 = r6 + r9
                if (r1 <= 0) goto Lae
                r9 = 1
                java.lang.Integer[] r9 = new java.lang.Integer[r9]     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r10 = 100
                long r10 = r10 * r6
                long r12 = (long) r1     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                long r10 = r10 / r12
                int r11 = (int) r10     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r9[r2] = r10     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                r14.publishProgress(r9)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
            Lae:
                r4.write(r5, r2, r8)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lba
                goto L7f
            Lb2:
                r4.close()     // Catch: java.io.IOException -> Le9
                goto L92
            Lb6:
                r0 = move-exception
                r1 = r0
            Lb8:
                r0 = r4
                goto Lef
            Lba:
                r0 = move-exception
                goto Ld3
            Lbc:
                r1 = move-exception
                goto Lef
            Lbe:
                r1 = move-exception
                r4 = r0
                goto Lc7
            Lc1:
                r1 = move-exception
                r3 = r0
                goto Lef
            Lc4:
                r1 = move-exception
                r3 = r0
                r4 = r3
            Lc7:
                r0 = r1
                goto Ld3
            Lc9:
                r15 = move-exception
                r1 = r15
                r15 = r0
                r3 = r15
                goto Lef
            Lce:
                r15 = move-exception
                r3 = r0
                r4 = r3
                r0 = r15
                r15 = r4
            Ld3:
                r0.printStackTrace()     // Catch: java.lang.Throwable -> Led
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Led
                if (r4 == 0) goto Le2
                r4.close()     // Catch: java.io.IOException -> Le0
                goto Le2
            Le0:
                goto Le7
            Le2:
                if (r3 == 0) goto Le7
                r3.close()     // Catch: java.io.IOException -> Le0
            Le7:
                if (r15 == 0) goto Lec
            Le9:
                r15.disconnect()
            Lec:
                return r0
            Led:
                r1 = move-exception
                goto Lb8
            Lef:
                if (r0 == 0) goto Lf7
                r0.close()     // Catch: java.io.IOException -> Lf5
                goto Lf7
            Lf5:
                goto Lfc
            Lf7:
                if (r3 == 0) goto Lfc
                r3.close()     // Catch: java.io.IOException -> Lf5
            Lfc:
                if (r15 == 0) goto L101
                r15.disconnect()
            L101:
                throw r1
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                android.app.ProgressDialog r0 = r2.mProgressDialog
                r0.dismiss()
                if (r3 == 0) goto L20
                com.flextv.livestore.activities.SettingActivity r3 = r2.this$0
                android.content.Context r3 = r3.getApplicationContext()
                com.flextv.livestore.activities.SettingActivity r0 = r2.this$0
                com.flextv.livestore.models.WordModels r0 = r0.wordModels
                java.lang.String r0 = r0.getUpdate_failed()
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                goto L27
            L20:
                com.flextv.livestore.activities.SettingActivity r3 = r2.this$0
                java.io.File r0 = r2.file
                com.flextv.livestore.activities.SettingActivity.access$000(r3, r0)
            L27:
                return
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
                r2 = this;
                android.app.ProgressDialog r0 = new android.app.ProgressDialog
                com.flextv.livestore.activities.SettingActivity r1 = r2.this$0
                r0.<init>(r1)
                r2.mProgressDialog = r0
                com.flextv.livestore.activities.SettingActivity r1 = r2.this$0
                com.flextv.livestore.models.WordModels r1 = r1.wordModels
                java.lang.String r1 = r1.getRequest_download()
                r0.setMessage(r1)
                android.app.ProgressDialog r0 = r2.mProgressDialog
                r1 = 1
                r0.setIndeterminate(r1)
                android.app.ProgressDialog r0 = r2.mProgressDialog
                r0.setProgressStyle(r1)
                android.app.ProgressDialog r0 = r2.mProgressDialog
                r1 = 0
                r0.setCancelable(r1)
                android.app.ProgressDialog r0 = r2.mProgressDialog
                r0.show()
                return
        }

        @Override // android.os.AsyncTask
        public final void onProgressUpdate(java.lang.Integer[] r4) {
                r3 = this;
                java.lang.Integer[] r4 = (java.lang.Integer[]) r4
                android.app.ProgressDialog r0 = r3.mProgressDialog
                r1 = 0
                r0.setIndeterminate(r1)
                android.app.ProgressDialog r0 = r3.mProgressDialog
                r2 = 100
                r0.setMax(r2)
                android.app.ProgressDialog r0 = r3.mProgressDialog
                r4 = r4[r1]
                int r4 = r4.intValue()
                r0.setProgress(r4)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$3gyp6nTAfIK5xq-SOYRYXGgPiAk, reason: not valid java name */
    public static /* synthetic */ void m75$r8$lambda$3gyp6nTAfIK5xqSOYRYXGgPiAk(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showChangeTimeFormatDlgFragment$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$4IIySkxN7zw0o2a_4G9w7NV4fdI(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showExternalDlgFragment$10(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$4e6FsLzk986sZGB7vGizOenfn0g(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showDeviceTypeDlgFragment$9(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$A6fLzTQqz0xFjL-M2LTflDxbsvw, reason: not valid java name */
    public static /* synthetic */ void m76$r8$lambda$A6fLzTQqz0xFjLM2LTflDxbsvw() {
            lambda$showHideCategoryDlgFragment$4()
            return
    }

    public static /* synthetic */ void $r8$lambda$EC9NFLkI4D4NuFB5ymgkCTMXcX4(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showLiveStreamFormatDlgFragment$8(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$FMzLco1PwPNrK6RYUIoFEi9A79I(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showChangeLayoutDlgFragment$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$OwVIBvY54P9zPb-QVSEpXd01Xa8, reason: not valid java name */
    public static /* synthetic */ void m77$r8$lambda$OwVIBvY54P9zPbQVSEpXd01Xa8(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showLiveChannelSortDlgFragment$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$PAwWxyePVbuAlE9yyrdwQ7VXVfM(com.flextv.livestore.activities.SettingActivity r0, int r1) {
            r0.lambda$showAutomationDlgFragment$11(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Vblds8t7iLAeufTecdBkIp2lphU(com.flextv.livestore.activities.SettingActivity r0, com.google.android.play.core.tasks.Task r1) {
            r0.lambda$startReviewFlow$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Y1pjJR28da_CPxVE1kbXzQgtv8c() {
            lambda$ClearHistoryChannels$5()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Z-jPcH132aK2Cnp09TCRavv8U-w, reason: not valid java name */
    public static /* synthetic */ void m78$r8$lambda$ZjPcH132aK2Cnp09TCRavv8Uw(com.flextv.livestore.activities.SettingActivity r0, com.google.android.play.core.tasks.Task r1) {
            r0.lambda$activateReviewInfo$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$dxhQJW_07Lb4g-oyWWzakEBu3Ng, reason: not valid java name */
    public static /* synthetic */ void m79$r8$lambda$dxhQJW_07Lb4goyWWzakEBu3Ng(com.flextv.livestore.activities.SettingActivity r0) {
            r0.goToUpdate()
            return
    }

    public static /* synthetic */ void $r8$lambda$l61HhA1v5o3_qes1_BIoB_qQRP0(com.flextv.livestore.activities.SettingActivity r0, java.util.List r1, int r2) {
            r0.lambda$showChangeLangDlgFragment$2(r1, r2)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qzpzr8dBmvkedgqEn03FiK3gdB8(com.flextv.livestore.activities.SettingActivity r0, com.flextv.livestore.apps.SideMenu r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$zIXUDWNg_XOfe3J7bGf4aF-fXLw, reason: not valid java name */
    public static /* synthetic */ void m80$r8$lambda$zIXUDWNg_XOfe3J7bGf4aFfXLw(com.flextv.livestore.activities.SettingActivity r0) {
            r0.lambda$showNoConnectionDlgFragment$13()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.SettingActivity> r0 = com.flextv.livestore.activities.SettingActivity.class
            return
    }

    public SettingActivity() {
            r2 = this;
            r2.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            r0 = 0
            r2.setting_pos = r0
            java.lang.String r0 = ""
            r2.tv_mac_address = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            r2.expire_format = r0
            r0 = 0
            r2.expired_mils = r0
            return
    }

    private void ClearHistoryChannels() {
            r5 = this;
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r0 = r0.getRecentChannelNames()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r4 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$12
            r3.addToRecentChannels(r1, r2, r4)
            goto Lc
        L23:
            com.flextv.livestore.models.WordModels r0 = r5.wordModels
            java.lang.String r0 = r0.getRecent_channels_removed()
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.SettingActivity r0, java.io.File r1) {
            r0.startInstall(r1)
            return
    }

    public static /* synthetic */ java.lang.String access$102(com.flextv.livestore.activities.SettingActivity r0, java.lang.String r1) {
            r0.tv_mac_address = r1
            return r1
    }

    private void activateReviewInfo() {
            r3 = this;
            com.google.android.play.core.review.ReviewManager r0 = com.google.android.play.core.review.ReviewManagerFactory.create(r3)
            r3.reviewManager = r0
            com.google.android.play.core.tasks.Task r0 = r0.requestReviewFlow()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r2 = 3
            r1.<init>(r3, r2)
            r0.addOnCompleteListener(r1)
            return
    }

    private java.util.List<com.flextv.livestore.apps.SideMenu> getSettingLists(com.flextv.livestore.models.WordModels r7) {
            r6 = this;
            android.widget.TextView r0 = r6.txt_setting
            java.lang.String r1 = r7.getSettings()
            r0.setText(r1)
            android.widget.Button r0 = r6.btn_pay
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getPay_with_google_pay()
            r1.append(r2)
            java.lang.String r2 = "(€"
            r1.append(r2)
            com.flextv.livestore.models.AppInfoModel r2 = r6.appInfoModel
            java.lang.String r2 = r2.getPrice()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getAdd_playlist()
            r3 = 0
            r4 = 2131231056(0x7f080150, float:1.8078182E38)
            r1.<init>(r2, r3, r4)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getParent_control()
            r3 = 1
            r5 = 2131231014(0x7f080126, float:1.8078097E38)
            r1.<init>(r2, r3, r5)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getChange_playlist()
            r3 = 2
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getChange_language()
            r3 = 3
            r4 = 2131231055(0x7f08014f, float:1.807818E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getChangeLayout()
            r3 = 4
            r4 = 2131231046(0x7f080146, float:1.8078162E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getHide_live_category()
            r3 = 5
            r4 = 2131231054(0x7f08014e, float:1.8078178E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getHide_vod_category()
            r3 = 6
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getHide_series_category()
            r3 = 7
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getClear_history_channels()
            r3 = 8
            r4 = 2131231001(0x7f080119, float:1.807807E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getClear_history_movies()
            r3 = 9
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getClear_history_series()
            r3 = 10
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getLive_sort()
            r3 = 11
            r4 = 2131231059(0x7f080153, float:1.8078188E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getLive_stream_format()
            r3 = 12
            r4 = 2131231048(0x7f080148, float:1.8078166E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getExternal_player()
            r3 = 13
            r4 = 2131231004(0x7f08011c, float:1.8078077E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getAutomatic()
            r3 = 14
            r4 = 2131230994(0x7f080112, float:1.8078056E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getTime_format()
            r3 = 15
            r4 = 2131231042(0x7f080142, float:1.8078154E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getSubtitle_settings()
            r3 = 16
            r4 = 2131231060(0x7f080154, float:1.807819E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r2 = r7.getSelect_device_type()
            r3 = 17
            r4 = 2131231002(0x7f08011a, float:1.8078073E38)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            com.flextv.livestore.apps.SideMenu r1 = new com.flextv.livestore.apps.SideMenu
            java.lang.String r7 = r7.getUpdate_now()
            r2 = 18
            r3 = 2131231043(0x7f080143, float:1.8078156E38)
            r1.<init>(r7, r2, r3)
            r0.add(r1)
            return r0
    }

    private void goToChangePlaylist() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r0.<init>(r3, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = "is_home"
            r2 = 1
            r0.putExtra(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
    }

    private void goToUpdate() {
            r5 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            boolean r1 = com.flextv.livestore.utils.Utils.IsAmazonDevice()
            if (r1 == 0) goto L1d
            com.flextv.livestore.activities.SettingActivity$versionUpdate r0 = new com.flextv.livestore.activities.SettingActivity$versionUpdate
            r0.<init>(r5)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            com.flextv.livestore.models.AppInfoModel r3 = r5.appInfoModel
            java.lang.String r3 = r3.getApk_link()
            r1[r2] = r3
            r0.execute(r1)
            goto L5c
        L1d:
            java.lang.String r1 = r5.getPackageName()
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L3f
            r3.<init>()     // Catch: android.content.ActivityNotFoundException -> L3f
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch: android.content.ActivityNotFoundException -> L3f
            r3.append(r1)     // Catch: android.content.ActivityNotFoundException -> L3f
            java.lang.String r3 = r3.toString()     // Catch: android.content.ActivityNotFoundException -> L3f
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: android.content.ActivityNotFoundException -> L3f
            r2.<init>(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L3f
            r5.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L3f
            goto L5c
        L3f:
            android.content.Intent r2 = new android.content.Intent
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://play.google.com/store/apps/details?id="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.<init>(r0, r1)
            r5.startActivity(r2)
        L5c:
            return
    }

    private void initView() {
            r4 = this;
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r4.btn_back = r0
            r0 = 2131428344(0x7f0b03f8, float:1.847833E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_setting = r0
            r0 = 2131428319(0x7f0b03df, float:1.847828E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_mac_address = r0
            r0 = 2131427479(0x7f0b0097, float:1.8476575E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.btn_pay = r0
            r0 = 2131427492(0x7f0b00a4, float:1.8476602E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.btn_tv_pay = r0
            r0 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r0 = r4.findViewById(r0)
            pl.droidsonroids.gif.GifImageView r0 = (pl.droidsonroids.gif.GifImageView) r0
            r4.progress_bar = r0
            android.widget.Button r0 = r4.btn_pay
            r0.setOnClickListener(r4)
            android.widget.Button r0 = r4.btn_tv_pay
            r0.setOnClickListener(r4)
            android.widget.ImageButton r0 = r4.btn_back
            r0.setOnClickListener(r4)
            r0 = 2131428083(0x7f0b02f3, float:1.84778E38)
            android.view.View r0 = r4.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r4.recycler_setting = r0
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r4)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L86
            android.widget.Button r0 = r4.btn_tv_pay
            r3 = 8
            r0.setVisibility(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_setting
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_setting
            r0.setPreserveFocusAfterLayout(r2)
            android.view.View[] r0 = new android.view.View[r2]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            com.flextv.livestore.view.LiveVerticalGridView r1 = r4.recycler_setting
            com.flextv.livestore.activities.SettingActivity$2 r2 = new com.flextv.livestore.activities.SettingActivity$2
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            goto L95
        L86:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_setting
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r4, r1)
            r0.setLayoutManager(r3)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_setting
            r0.setHasFixedSize(r2)
        L95:
            return
    }

    private static /* synthetic */ void lambda$ClearHistoryChannels$5() {
            return
    }

    private /* synthetic */ void lambda$activateReviewInfo$1(com.google.android.play.core.tasks.Task r2) {
            r1 = this;
            boolean r0 = r2.isSuccessful()
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r2.getResult()
            com.google.android.play.core.review.ReviewInfo r2 = (com.google.android.play.core.review.ReviewInfo) r2
            r1.reviewInfo = r2
            goto L19
        Lf:
            r2 = 0
            java.lang.String r0 = "Review failed to start!"
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r0, r2)
            r2.show()
        L19:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.apps.SideMenu r2, java.lang.Integer r3, java.lang.Boolean r4) {
            r1 = this;
            int r3 = r3.intValue()
            r1.setting_pos = r3
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto Lbc
            int r2 = r2.getPosition()
            r3 = 2
            r4 = 1
            r0 = 0
            switch(r2) {
                case 0: goto Lb9;
                case 1: goto Lb5;
                case 2: goto Lb1;
                case 3: goto Lad;
                case 4: goto La9;
                case 5: goto La5;
                case 6: goto La1;
                case 7: goto L9d;
                case 8: goto L7d;
                case 9: goto L5f;
                case 10: goto L40;
                case 11: goto L3b;
                case 12: goto L36;
                case 13: goto L31;
                case 14: goto L2c;
                case 15: goto L27;
                case 16: goto L22;
                case 17: goto L1d;
                case 18: goto L18;
                default: goto L16;
            }
        L16:
            goto Lbc
        L18:
            r1.showUpdateDlgFragment()
            goto Lbc
        L1d:
            r1.showDeviceTypeDlgFragment()
            goto Lbc
        L22:
            r1.showSubTitleSettingDlgFragment()
            goto Lbc
        L27:
            r1.showChangeTimeFormatDlgFragment()
            goto Lbc
        L2c:
            r1.showAutomationDlgFragment()
            goto Lbc
        L31:
            r1.showExternalDlgFragment()
            goto Lbc
        L36:
            r1.showLiveStreamFormatDlgFragment()
            goto Lbc
        L3b:
            r1.showLiveChannelSortDlgFragment()
            goto Lbc
        L40:
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceRecentSeriesNames()
            int r2 = r2.size()
            if (r2 <= 0) goto L51
            r1.showClearHistoryDlgFragment(r3)
            goto Lbc
        L51:
            com.flextv.livestore.models.WordModels r2 = r1.wordModels
            java.lang.String r2 = r2.getNo_recently_series()
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto Lbc
        L5f:
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceResumeModel()
            int r2 = r2.size()
            if (r2 <= 0) goto L6f
            r1.showClearHistoryDlgFragment(r4)
            goto Lbc
        L6f:
            com.flextv.livestore.models.WordModels r2 = r1.wordModels
            java.lang.String r2 = r2.getNo_recently_movies()
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto Lbc
        L7d:
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r2 = r2.getRecentChannelNames()
            int r2 = r2.size()
            if (r2 <= 0) goto L8f
            r1.ClearHistoryChannels()
            goto Lbc
        L8f:
            com.flextv.livestore.models.WordModels r2 = r1.wordModels
            java.lang.String r2 = r2.getNo_recently_channels()
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto Lbc
        L9d:
            r1.showHideCategoryDlgFragment(r3)
            goto Lbc
        La1:
            r1.showHideCategoryDlgFragment(r4)
            goto Lbc
        La5:
            r1.showHideCategoryDlgFragment(r0)
            goto Lbc
        La9:
            r1.showChangeLayoutDlgFragment()
            goto Lbc
        Lad:
            r1.showChangeLangDlgFragment()
            goto Lbc
        Lb1:
            r1.goToChangePlaylist()
            goto Lbc
        Lb5:
            r1.showParentalControlDlgFragment()
            goto Lbc
        Lb9:
            r1.showAddPlaylistDlgFragment()
        Lbc:
            r2 = 0
            return r2
    }

    private /* synthetic */ void lambda$showAutomationDlgFragment$11(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            r0.setSharedPreferenceUpdatePeriod(r2)
            return
    }

    private /* synthetic */ void lambda$showChangeLangDlgFragment$2(java.util.List r2, int r3) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.LanguageModel r2 = (com.flextv.livestore.models.LanguageModel) r2
            java.lang.String r2 = r2.getCode()
            r0.setSharedPreferenceLanguageCode(r2)
            com.flextv.livestore.models.WordModels r2 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r1)
            r1.wordModels = r2
            java.util.List r2 = r1.getSettingLists(r2)
            r1.settingLists = r2
            com.flextv.livestore.adapter.SettingRecyclerAdapter r3 = r1.adapter
            r3.setSettingData(r2)
            return
    }

    private /* synthetic */ void lambda$showChangeLayoutDlgFragment$3(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            if (r2 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r0.setSharedPreferenceIsGrid(r2)
            return
    }

    private /* synthetic */ void lambda$showChangeTimeFormatDlgFragment$6(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            r0.setSharedPreferenceTimeFormat(r2)
            return
    }

    private /* synthetic */ void lambda$showDeviceTypeDlgFragment$9(int r2) {
            r1 = this;
            if (r2 != 0) goto Lb
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r0 = "tv"
            r2.setSharedPreferenceDeviceType(r0)
            goto L12
        Lb:
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r0 = "mobile"
            r2.setSharedPreferenceDeviceType(r0)
        L12:
            return
    }

    private /* synthetic */ void lambda$showExternalDlgFragment$10(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            r0.setSharedPreferenceExternalPlayer(r2)
            return
    }

    private static /* synthetic */ void lambda$showHideCategoryDlgFragment$4() {
            return
    }

    private /* synthetic */ void lambda$showLiveChannelSortDlgFragment$7(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            r0.setSharedPreferenceLiveOrder(r2)
            return
    }

    private /* synthetic */ void lambda$showLiveStreamFormatDlgFragment$8(int r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            if (r2 != 0) goto L8
            java.lang.String r2 = "ts"
            goto La
        L8:
            java.lang.String r2 = "m3u8"
        La:
            r0.setSharedPreferenceLiveStreamFormat(r2)
            return
    }

    private /* synthetic */ void lambda$showNoConnectionDlgFragment$13() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.ChangePlaylistActivity> r1 = com.flextv.livestore.activities.ChangePlaylistActivity.class
            r0.<init>(r2, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r2.startActivity(r0)
            r2.finish()
            return
    }

    private /* synthetic */ void lambda$startReviewFlow$12(com.google.android.play.core.tasks.Task r3) {
            r2 = this;
            java.lang.String r3 = "Rating is completed."
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "market://details?id=com.flextv.livestore"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            r3.<init>(r1, r0)
            r2.startActivity(r3)
            return
    }

    private void showAddPlaylistDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_add"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            r1 = -1
            com.flextv.livestore.activities.SettingActivity$1 r3 = new com.flextv.livestore.activities.SettingActivity$1
            r3.<init>(r4)
            com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r1 = com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.newInstance(r4, r1, r3)
            r4.addPlaylistDlgFragment = r1
            r1.show(r0, r2)
            return
    }

    private void showAutomationDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            r0.getSharedPreferenceUpdatePeriod()
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getAuto_update_everytime()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getAuto_update_everyday()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getAuto_update_2day()
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_automation"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L3b
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L3b:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getAutomatic()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 0
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment r0 = com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment.newInstance(r7, r1, r3, r0, r5)
            r0.show(r2, r4)
            return
    }

    private void showChangeLangDlgFragment() {
            r6 = this;
            int r0 = com.flextv.livestore.helper.GetSharedInfo.getLanguagePosition(r6)
            com.flextv.livestore.models.AppInfoModel r1 = r6.appInfoModel
            java.util.List r1 = r1.getLanguageModels()
            androidx.fragment.app.FragmentManager r2 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_language"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L1f
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L1f:
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r5 = 1
            r3.<init>(r6, r1, r5)
            com.flextv.livestore.dlgfragment.LanguageDlgFragment r0 = com.flextv.livestore.dlgfragment.LanguageDlgFragment.newInstance(r6, r1, r0, r3)
            r0.show(r2, r4)
            return
    }

    private void showChangeLayoutDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            boolean r0 = r0.getSharedPreferenceIsGrid()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getList_layout()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getGrid_layout()
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_layout"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L32
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L32:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getChangeLayout()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 5
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = com.flextv.livestore.dlgfragment.LiveSortDlgFragment.newInstance(r7, r1, r0, r3, r5)
            r0.show(r2, r4)
            return
    }

    private void showChangeTimeFormatDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            int r0 = r0.getSharedPreferenceTimeFormat()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.get_12_hour_format()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.get_24_hour_format()
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_live_sort"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L32
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L32:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getTime_format()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 6
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = com.flextv.livestore.dlgfragment.LiveSortDlgFragment.newInstance(r7, r1, r0, r3, r5)
            r0.show(r2, r4)
            return
    }

    private void showClearHistoryDlgFragment(int r5) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_clear_history"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment r5 = com.flextv.livestore.dlgfragment.ClearHistoryDlgFragment.newInstance(r4, r5)
            r5.show(r0, r2)
            return
    }

    private void showDeviceTypeDlgFragment() {
            r6 = this;
            boolean r0 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r6)
            r0 = r0 ^ 1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "TV"
            r1.add(r2)
            java.lang.String r2 = "Mobile"
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_device_type"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L2a
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L2a:
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r5 = 9
            r3.<init>(r6, r5)
            java.lang.String r5 = "Select Device Type"
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = com.flextv.livestore.dlgfragment.LiveSortDlgFragment.newInstance(r6, r1, r0, r5, r3)
            r0.show(r2, r4)
            return
    }

    private void showExternalDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            int r0 = r0.getSharedPreferenceExternalPlayer()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getString_default()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getVlc_player()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getMx_player()
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_external_player"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L3b
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L3b:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getExternal_player()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 1
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment r0 = com.flextv.livestore.dlgfragment.ExternalPlayerDlgFragment.newInstance(r7, r1, r3, r0, r5)
            r0.show(r2, r4)
            return
    }

    private void showHideCategoryDlgFragment(int r5) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_hide_category"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.dlgfragment.HideCategoryDlgFragment r5 = com.flextv.livestore.dlgfragment.HideCategoryDlgFragment.newInstance(r4, r5)
            r4.hideCategoryDlgFragment = r5
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r1 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$13
            r5.setOnCategoryChangedListener(r1)
            com.flextv.livestore.dlgfragment.HideCategoryDlgFragment r5 = r4.hideCategoryDlgFragment
            r5.show(r0, r2)
            return
    }

    private void showLiveChannelSortDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            int r0 = r0.getSharedPreferenceLiveOrder()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getString_default()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getSort_a_z()
            r1.add(r2)
            com.flextv.livestore.models.WordModels r2 = r7.wordModels
            java.lang.String r2 = r2.getSort_z_a()
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_live_sort"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L3b
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L3b:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getLive_sort()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 4
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = com.flextv.livestore.dlgfragment.LiveSortDlgFragment.newInstance(r7, r1, r0, r3, r5)
            r0.show(r2, r4)
            return
    }

    private void showLiveStreamFormatDlgFragment() {
            r7 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceLiveStreamFormat()
            java.lang.String r1 = "ts"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r0 = r0 ^ 1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "MPEG(ts)"
            r1.add(r2)
            java.lang.String r2 = "HLS(m3u8)"
            r1.add(r2)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r2.beginTransaction()
            java.lang.String r4 = "fragment_live_format"
            androidx.fragment.app.Fragment r5 = r2.findFragmentByTag(r4)
            if (r5 == 0) goto L33
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5, r0)
            return
        L33:
            com.flextv.livestore.models.WordModels r3 = r7.wordModels
            java.lang.String r3 = r3.getLive_stream_format()
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r6 = 10
            r5.<init>(r7, r6)
            com.flextv.livestore.dlgfragment.LiveSortDlgFragment r0 = com.flextv.livestore.dlgfragment.LiveSortDlgFragment.newInstance(r7, r1, r0, r3, r5)
            r0.show(r2, r4)
            return
    }

    private void showNoConnectionDlgFragment() {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_no_connection"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getPlaylist_is_not_working()
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.newInstance(r5, r1)
            r5.noConnectionDlgFragment = r1
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r4 = 7
            r3.<init>(r5, r4)
            r1.setOnRetryClickListener(r3)
            com.flextv.livestore.dlgfragment.NoConnectionDlgFragment r1 = r5.noConnectionDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showParentalControlDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_parent"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.dlgfragment.ParentControlDlgFragment r1 = new com.flextv.livestore.dlgfragment.ParentControlDlgFragment
            r1.<init>()
            r1.show(r0, r2)
            return
    }

    private void showSubTitleSettingDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_subtitle_setting"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment r1 = com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment.newInstance(r4)
            r1.show(r0, r2)
            return
    }

    private void showTVDeviceDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_pay_tv"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.dlgfragment.PayForTvDlgFragment r1 = new com.flextv.livestore.dlgfragment.PayForTvDlgFragment
            r1.<init>()
            com.flextv.livestore.activities.SettingActivity$3 r3 = new com.flextv.livestore.activities.SettingActivity$3
            r3.<init>(r4)
            r1.setOnButtonClickListener(r3)
            r1.show(r0, r2)
            return
    }

    private void showUpdateDlgFragment() {
            r8 = this;
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            r0.versionCheck()
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            r0.loadVersion()
            double r0 = r8.api_version
            double r2 = r8.current_version
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L26
            r0 = 1
            com.flextv.livestore.models.WordModels r1 = r8.wordModels
            java.lang.String r1 = r1.getNew_software_update_available()
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getUpdate_now()
            com.flextv.livestore.models.WordModels r3 = r8.wordModels
            java.lang.String r3 = r3.getSkip()
            goto L39
        L26:
            com.flextv.livestore.models.WordModels r0 = r8.wordModels
            java.lang.String r1 = r0.getApp_is_up_to_date()
            com.flextv.livestore.models.WordModels r0 = r8.wordModels
            java.lang.String r2 = r0.getOk()
            com.flextv.livestore.models.WordModels r0 = r8.wordModels
            java.lang.String r3 = r0.getCancel()
            r0 = 0
        L39:
            androidx.fragment.app.FragmentManager r4 = r8.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r5 = r4.beginTransaction()
            java.lang.String r6 = "fragment_update"
            androidx.fragment.app.Fragment r7 = r4.findFragmentByTag(r6)
            if (r7 == 0) goto L4e
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r7, r0)
            return
        L4e:
            com.flextv.livestore.dlgfragment.UpdateDlgFragment r0 = com.flextv.livestore.dlgfragment.UpdateDlgFragment.newInstance(r8, r1, r2, r3, r0)
            r8.updateDlgFragment = r0
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r2 = 2
            r1.<init>(r8, r2)
            r0.setOnUpdateAvailableListener(r1)
            com.flextv.livestore.dlgfragment.UpdateDlgFragment r0 = r8.updateDlgFragment
            r0.show(r4, r6)
            return
    }

    private void startInstall(java.io.File r6) {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r3 = "application/vnd.android.package-archive"
            r4 = 24
            if (r1 <= r4) goto L22
            java.lang.String r1 = "com.flextv.livestore.provider"
            android.net.Uri r6 = androidx.core.content.FileProvider.getUriForFile(r5, r1, r6)
            r0.setDataAndType(r6, r3)
            r0.setFlags(r2)
            r6 = 1
            r0.addFlags(r6)
            goto L2c
        L22:
            android.net.Uri r6 = android.net.Uri.fromFile(r6)
            r0.setDataAndType(r6, r3)
            r0.setFlags(r2)
        L2c:
            r5.startActivity(r0)
            return
    }

    private void startReviewFlow() {
            r3 = this;
            com.google.android.play.core.review.ReviewInfo r0 = r3.reviewInfo
            if (r0 == 0) goto L14
            com.google.android.play.core.review.ReviewManager r1 = r3.reviewManager
            com.google.android.play.core.tasks.Task r0 = r1.launchReviewFlow(r3, r0)
            com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SettingActivity$$ExternalSyntheticLambda0
            r2 = 8
            r1.<init>(r3, r2)
            r0.addOnCompleteListener(r1)
        L14:
            return
    }

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L8d
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r1 = "status"
            if (r5 != r0) goto L75
            r5 = 2
            r0 = 8
            r2 = 1
            boolean r4 = r4.getBoolean(r1)     // Catch: java.lang.Exception -> L48
            if (r4 == 0) goto L6f
            com.flextv.livestore.models.WordModels r4 = r3.wordModels     // Catch: java.lang.Exception -> L48
            java.lang.String r4 = r4.getActivate_success()     // Catch: java.lang.Exception -> L48
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r1)     // Catch: java.lang.Exception -> L48
            r4.show()     // Catch: java.lang.Exception -> L48
            com.flextv.livestore.models.AppInfoModel r4 = r3.appInfoModel     // Catch: java.lang.Exception -> L48
            r4.setIs_trial(r5)     // Catch: java.lang.Exception -> L48
            com.flextv.livestore.models.AppInfoModel r4 = r3.appInfoModel     // Catch: java.lang.Exception -> L48
            r4.setIs_google_pay(r2)     // Catch: java.lang.Exception -> L48
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper     // Catch: java.lang.Exception -> L48
            r4.setSharedPreferenceIsPlaylistChanged(r2)     // Catch: java.lang.Exception -> L48
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper     // Catch: java.lang.Exception -> L48
            com.flextv.livestore.models.AppInfoModel r1 = r3.appInfoModel     // Catch: java.lang.Exception -> L48
            r4.setSharedPreferenceAppInfo(r1)     // Catch: java.lang.Exception -> L48
            android.widget.Button r4 = r3.btn_pay     // Catch: java.lang.Exception -> L48
            r4.setVisibility(r0)     // Catch: java.lang.Exception -> L48
            boolean r4 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)     // Catch: java.lang.Exception -> L48
            if (r4 == 0) goto L6f
            android.widget.Button r4 = r3.btn_tv_pay     // Catch: java.lang.Exception -> L48
            r4.setVisibility(r0)     // Catch: java.lang.Exception -> L48
            goto L6f
        L48:
            com.flextv.livestore.models.AppInfoModel r4 = r3.appInfoModel
            r4.setIs_trial(r5)
            com.flextv.livestore.models.AppInfoModel r4 = r3.appInfoModel
            r4.setIs_google_pay(r2)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            r4.setSharedPreferenceIsPlaylistChanged(r2)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            com.flextv.livestore.models.AppInfoModel r5 = r3.appInfoModel
            r4.setSharedPreferenceAppInfo(r5)
            android.widget.Button r4 = r3.btn_pay
            r4.setVisibility(r0)
            boolean r4 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r4 == 0) goto L6f
            android.widget.Button r4 = r3.btn_tv_pay
            r4.setVisibility(r0)
        L6f:
            com.flextv.livestore.models.AppInfoModel r4 = r3.appInfoModel
            com.flextv.livestore.utils.Utils.saveToFile(r4)
            goto L8d
        L75:
            java.lang.String r5 = "data"
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L8d
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Exception -> L8d
            java.lang.String r5 = com.flextv.livestore.utils.Security.getDecodedString(r5)     // Catch: java.lang.Exception -> L8d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8d
            r0.<init>(r5)     // Catch: java.lang.Exception -> L8d
            r4.getBoolean(r1)     // Catch: java.lang.Exception -> L8d
        L8d:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            if (r0 != 0) goto L92
            int r0 = r5.getKeyCode()
            r1 = 0
            r2 = 4
            if (r0 == r2) goto L69
            r3 = 1
            switch(r0) {
                case 19: goto L59;
                case 20: goto L2b;
                case 21: goto L1d;
                case 22: goto L14;
                default: goto L12;
            }
        L12:
            goto L92
        L14:
            android.widget.ImageButton r0 = r4.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L92
            return r3
        L1d:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_setting
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L92
            int r0 = r4.setting_pos
            int r0 = r0 % r2
            if (r0 != 0) goto L92
            return r3
        L2b:
            android.widget.ImageButton r0 = r4.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e
            android.widget.ImageButton r5 = r4.btn_back
            r5.setFocusable(r1)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_setting
            r5.requestFocus()
            return r3
        L3e:
            int r0 = r4.setting_pos
            java.util.List<com.flextv.livestore.apps.SideMenu> r1 = r4.settingLists
            int r1 = r1.size()
            int r1 = r1 - r2
            if (r0 <= r1) goto L92
            android.widget.Button r5 = r4.btn_tv_pay
            r5.setFocusable(r3)
            android.widget.Button r5 = r4.btn_pay
            r5.setFocusable(r3)
            android.widget.Button r5 = r4.btn_pay
            r5.requestFocus()
            return r3
        L59:
            int r0 = r4.setting_pos
            r1 = 3
            if (r0 >= r1) goto L92
            android.widget.ImageButton r5 = r4.btn_back
            r5.setFocusable(r3)
            android.widget.ImageButton r5 = r4.btn_back
            r5.requestFocus()
            return r3
        L69:
            pl.droidsonroids.gif.GifImageView r0 = r4.progress_bar
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L7f
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getPlaylist_is_loading()
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            goto L92
        L7f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)
            r1 = -1
            r4.setResult(r1, r0)
            r4.finish()
        L92:
            boolean r5 = super.dispatchKeyEvent(r5)
            return r5
    }

    @Override // com.flextv.livestore.apps.BaseActivity
    public final void doNextTask(boolean r2) {
            r1 = this;
            r0 = 8
            if (r2 == 0) goto L1d
            pl.droidsonroids.gif.GifImageView r2 = r1.progress_bar
            r2.setVisibility(r0)
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            r0 = 0
            r2.setSharedPreferencePlaylistPosition(r0)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.HomeActivity> r0 = com.flextv.livestore.activities.HomeActivity.class
            r2.<init>(r1, r0)
            r1.startActivity(r2)
            r1.finish()
            goto L25
        L1d:
            pl.droidsonroids.gif.GifImageView r2 = r1.progress_bar
            r2.setVisibility(r0)
            r1.showNoConnectionDlgFragment()
        L25:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            if (r3 == r0) goto L13
            r0 = 2131427492(0x7f0b00a4, float:1.8476602E38)
            if (r3 == r0) goto Lf
            goto L3d
        Lf:
            r2.showTVDeviceDlgFragment()
            goto L3d
        L13:
            pl.droidsonroids.gif.GifImageView r3 = r2.progress_bar
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L2a
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getPlaylist_is_loading()
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L3d
        L2a:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = ""
            r3.putExtra(r0, r1)
            r0 = -1
            r2.setResult(r0, r3)
            r2.finish()
        L3d:
            return
    }

    @Override // com.flextv.livestore.apps.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r7) {
            r6 = this;
            super.onCreate(r7)
            r7 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r6.setContentView(r7)
            com.flextv.livestore.utils.Utils.FullScreenCall(r6)
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            r7.<init>(r6)
            r6.preferenceHelper = r7
            com.flextv.livestore.models.AppInfoModel r7 = r7.getSharedPreferenceAppInfo()
            r6.appInfoModel = r7
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r6.wordModels = r7
            r6.initView()
            android.widget.TextView r7 = r6.txt_mac_address
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getMac_address()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceMacAddress()
            r0.append(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            com.flextv.livestore.models.WordModels r2 = r6.wordModels
            java.lang.String r2 = r2.getDevice_key()
            r0.append(r2)
            r0.append(r1)
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceDeviceKey()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            com.flextv.livestore.models.WordModels r7 = r6.wordModels
            java.util.List r7 = r6.getSettingLists(r7)
            r6.settingLists = r7
            java.lang.String r7 = com.flextv.livestore.apps.LTVApp.version_name
            double r0 = java.lang.Double.parseDouble(r7)
            r6.current_version = r0
            com.flextv.livestore.models.AppInfoModel r7 = r6.appInfoModel
            java.lang.String r7 = r7.getApp_version()
            double r0 = java.lang.Double.parseDouble(r7)
            r6.api_version = r0
            com.flextv.livestore.adapter.SettingRecyclerAdapter r7 = new com.flextv.livestore.adapter.SettingRecyclerAdapter
            java.util.List<com.flextv.livestore.apps.SideMenu> r2 = r6.settingLists
            double r3 = r6.current_version
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L8a
            r0 = 16
            goto L8b
        L8a:
            r0 = -1
        L8b:
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r3 = 7
            r1.<init>(r6, r3)
            r7.<init>(r6, r2, r0, r1)
            r6.adapter = r7
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_setting
            r0.setAdapter(r7)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_setting
            r0 = 0
            r7.setSelectedPosition(r0)
            android.widget.ImageButton r7 = r6.btn_back
            r7.setFocusable(r0)
            android.widget.Button r7 = r6.btn_pay
            r7.setFocusable(r0)
            android.widget.Button r7 = r6.btn_tv_pay
            r7.setFocusable(r0)
            android.widget.Button r7 = r6.btn_tv_pay
            r0 = 8
            r7.setVisibility(r0)
            android.widget.Button r7 = r6.btn_pay
            r7.setVisibility(r0)
            java.text.SimpleDateFormat r7 = r6.expire_format     // Catch: java.lang.Exception -> Lcf
            com.flextv.livestore.models.AppInfoModel r1 = r6.appInfoModel     // Catch: java.lang.Exception -> Lcf
            java.lang.String r1 = r1.getExpiredDate()     // Catch: java.lang.Exception -> Lcf
            java.util.Date r7 = r7.parse(r1)     // Catch: java.lang.Exception -> Lcf
            long r1 = r7.getTime()     // Catch: java.lang.Exception -> Lcf
            r6.expired_mils = r1     // Catch: java.lang.Exception -> Lcf
            goto Ld3
        Lcf:
            r1 = 0
            r6.expired_mils = r1
        Ld3:
            com.flextv.livestore.models.AppInfoModel r7 = r6.appInfoModel
            int r7 = r7.getIs_trial()
            r1 = 2
            if (r7 == r1) goto Lf7
            com.flextv.livestore.models.AppInfoModel r7 = r6.appInfoModel
            boolean r7 = r7.isIs_google_pay()
            if (r7 != 0) goto Lf7
            long r1 = r6.expired_mils
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r3 = r7.getTime()
            long r1 = r1 - r3
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto Lfc
        Lf7:
            android.widget.Button r7 = r6.btn_pay
            r7.setVisibility(r0)
        Lfc:
            return
    }
}
