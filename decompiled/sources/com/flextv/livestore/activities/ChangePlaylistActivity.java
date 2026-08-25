package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class ChangePlaylistActivity extends com.flextv.livestore.apps.BaseActivity implements com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener {
    public com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment addPlaylistDlgFragment;
    public com.flextv.livestore.models.AppInfoModel appInfoModel;
    public android.widget.Button btn_pay;
    public android.widget.Button btn_web_site;
    public com.flextv.livestore.dlgfragment.ConnectDlgFragment connectDlgFragment;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public java.text.SimpleDateFormat expire_format;
    public long expired_mils;
    public int focused_position;
    public android.webkit.WebView image_qr;
    public boolean is_home;
    public com.flextv.livestore.dlgfragment.NoConnectionDlgFragment noConnectionDlgFragment;
    public android.widget.TextView notiContent;
    public android.widget.TextView notiTitle;
    public int playlist_position;
    public com.flextv.livestore.adapter.PortalRecyclerAdapter portalAdapter;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public pl.droidsonroids.gif.GifImageView progress_bar;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_playlist;
    public com.flextv.livestore.models.AppInfoModel.UrlModel selectedModel;
    public android.widget.TextView str_device_key;
    public android.widget.TextView str_link;
    public android.widget.TextView str_mac_address;
    public android.widget.TextView str_mac_trial;
    public android.widget.TextView str_scan_code;
    public android.widget.TextView str_trial;
    public android.widget.TextView str_upload;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_device_key;
    public android.widget.TextView txt_mac_address;
    public android.widget.TextView txt_version;
    public java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> urlModelList;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: renamed from: com.flextv.livestore.activities.ChangePlaylistActivity$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass1 implements com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener {
        public final /* synthetic */ com.flextv.livestore.activities.ChangePlaylistActivity this$0;
        public final /* synthetic */ com.flextv.livestore.dlgfragment.ExitDlgFragment val$dlgFragment;
        public final /* synthetic */ com.flextv.livestore.models.AppInfoModel.UrlModel val$selectedModel;

        public AnonymousClass1(com.flextv.livestore.activities.ChangePlaylistActivity r1, com.flextv.livestore.dlgfragment.ExitDlgFragment r2, com.flextv.livestore.models.AppInfoModel.UrlModel r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$dlgFragment = r2
                r0.val$selectedModel = r3
                r0.<init>()
                return
        }

        @Override // com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener
        public void onCancelClick() {
                r0 = this;
                return
        }

        @Override // com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener
        public void onOkClick() {
                r4 = this;
                com.flextv.livestore.dlgfragment.ExitDlgFragment r0 = r4.val$dlgFragment
                r0.dismiss()
                com.flextv.livestore.activities.ChangePlaylistActivity r0 = r4.this$0
                com.flextv.livestore.helper.PreferenceHelper r0 = r0.preferenceHelper
                java.lang.String r0 = r0.getSharedPreferenceMacAddress()
                java.lang.String r0 = r0.toLowerCase()
                com.flextv.livestore.models.AppInfoModel$UrlModel r1 = r4.val$selectedModel
                java.lang.String r1 = r1.getId()
                java.lang.String r0 = com.flextv.livestore.utils.Security.getDeleteData(r0, r1)
                com.flextv.livestore.remote.GetDataRequest r1 = new com.flextv.livestore.remote.GetDataRequest
                com.flextv.livestore.activities.ChangePlaylistActivity r2 = r4.this$0
                r3 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r3)
                org.json.JSONObject r0 = com.flextv.livestore.utils.Security.getJsonData(r0)
                java.lang.String r2 = com.flextv.livestore.apps.Constants.second_delete_url
                r1.getResponse(r0, r2)
                com.flextv.livestore.activities.ChangePlaylistActivity r0 = r4.this$0
                r1.setOnGetResponseListener(r0)
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.activities.ChangePlaylistActivity$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass2 implements com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.SuccessAddedListener {
        public final /* synthetic */ com.flextv.livestore.activities.ChangePlaylistActivity this$0;

        public native AnonymousClass2(com.flextv.livestore.activities.ChangePlaylistActivity r1);

        @Override // com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.SuccessAddedListener
        public void onReload(int r2) {
                r1 = this;
                com.flextv.livestore.activities.ChangePlaylistActivity r2 = r1.this$0
                r0 = 0
                r2.is_home = r0
                com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r2 = r2.addPlaylistDlgFragment
                r2.dismiss()
                com.flextv.livestore.activities.ChangePlaylistActivity r2 = r1.this$0
                com.flextv.livestore.activities.ChangePlaylistActivity.access$000(r2)
                return
        }

        @Override // com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.SuccessAddedListener
        public void onSkip() {
                r2 = this;
                com.flextv.livestore.activities.ChangePlaylistActivity r0 = r2.this$0
                r1 = 0
                r0.is_home = r1
                com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r0 = r0.addPlaylistDlgFragment
                r0.dismiss()
                com.flextv.livestore.activities.ChangePlaylistActivity r0 = r2.this$0
                com.flextv.livestore.activities.ChangePlaylistActivity.access$000(r0)
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.activities.ChangePlaylistActivity$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass3 extends androidx.leanback.widget.OnChildViewHolderSelectedListener {
        public final /* synthetic */ android.view.View[] val$previousSelectedView0;

        public AnonymousClass3(android.view.View[] r1) {
                r0 = this;
                r0.val$previousSelectedView0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.OnChildViewHolderSelectedListener
        public void onChildViewHolderSelected(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, int r4) {
                r0 = this;
                super.onChildViewHolderSelected(r1, r2, r3, r4)
                android.view.View[] r1 = r0.val$previousSelectedView0
                r3 = 0
                r4 = r1[r3]
                if (r4 == 0) goto L1b
                r1 = r1[r3]
                r1.setSelected(r3)
                android.view.View[] r1 = r0.val$previousSelectedView0
                android.view.View r2 = r2.itemView
                r1[r3] = r2
                r1 = r1[r3]
                r2 = 1
                r1.setSelected(r2)
            L1b:
                return
        }
    }

    /* JADX INFO: renamed from: com.flextv.livestore.activities.ChangePlaylistActivity$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass4 implements com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener {
        public final /* synthetic */ com.flextv.livestore.activities.ChangePlaylistActivity this$0;

        public native AnonymousClass4(com.flextv.livestore.activities.ChangePlaylistActivity r1);

        @Override // com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener
        public void onCancelClick() {
                r0 = this;
                return
        }

        @Override // com.flextv.livestore.dlgfragment.ExitDlgFragment.OkButtonClickListener
        public void onOkClick() {
                r1 = this;
                com.flextv.livestore.activities.ChangePlaylistActivity r0 = r1.this$0
                r0.finishAffinity()
                r0 = 0
                java.lang.System.exit(r0)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$1q4iYGnGxDZRvCW6TPdJq45qclo(com.flextv.livestore.activities.ChangePlaylistActivity r0, int r1, com.flextv.livestore.models.AppInfoModel.UrlModel r2, int r3) {
            r0.lambda$showConnectDlgFragment$1(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$JOtS7caYizPzHKKFai-aAosdBbc, reason: not valid java name */
    public static native /* synthetic */ void m50$r8$lambda$JOtS7caYizPzHKKFaiaAosdBbc(com.flextv.livestore.activities.ChangePlaylistActivity r0, android.view.View r1);

    /* JADX INFO: renamed from: $r8$lambda$XC-dUZZKq-s_m-7s7472HM40lW8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m51$r8$lambda$XCdUZZKqs_m7s7472HM40lW8(com.flextv.livestore.activities.ChangePlaylistActivity r0, com.flextv.livestore.models.AppInfoModel.UrlModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    public static native /* synthetic */ void $r8$lambda$kduY8luUhxx8n5Av10Ea7A3mmEE(com.flextv.livestore.activities.ChangePlaylistActivity r0);

    public native ChangePlaylistActivity();

    public static native /* synthetic */ void access$000(com.flextv.livestore.activities.ChangePlaylistActivity r0);

    private native void changePlaylistView();

    private native void checkDescription();

    private native void deletePlaylist(com.flextv.livestore.models.AppInfoModel.UrlModel r1);

    private native void initView();

    private native /* synthetic */ void lambda$initView$3(android.view.View r1);

    private native /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.AppInfoModel.UrlModel r1, java.lang.Integer r2, java.lang.Boolean r3);

    private native /* synthetic */ void lambda$showConnectDlgFragment$1(int r1, com.flextv.livestore.models.AppInfoModel.UrlModel r2, int r3);

    private native /* synthetic */ void lambda$showNoConnectionDlgFragment$2();

    private native void loadingData(com.flextv.livestore.models.AppInfoModel.UrlModel r1);

    private native void showAddPlaylistDlgFragment(int r1);

    private native void showConnectDlgFragment(com.flextv.livestore.models.AppInfoModel.UrlModel r1, int r2);

    private native void showExitDlgFragment();

    private native void showNoConnectionDlgFragment();

    @Override // com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener
    public native void OnGetResponseResult(org.json.JSONObject r1, int r2);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public native boolean dispatchKeyEvent(android.view.KeyEvent r1);

    @Override // com.flextv.livestore.apps.BaseActivity
    public final native void doNextTask(boolean r1);

    @Override // com.flextv.livestore.apps.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final native void onCreate(android.os.Bundle r1);
}
