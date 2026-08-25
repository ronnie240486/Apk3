package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class LiveSearchDlgFragment extends androidx.fragment.app.DialogFragment {
    public com.flextv.livestore.models.CategoryModel categoryModel;
    public int category_pos;
    public android.content.Context context;
    public android.widget.EditText et_search;
    public int focus_channel_pos;
    public boolean is_m3u;
    public com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener listener;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_channels;
    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> searchChannels;
    public com.flextv.livestore.models.WordModels wordModels;




    /* JADX INFO: loaded from: classes.dex */
    public interface SelectCurrentChannelListener {
        void onSelectCurrentChannel(com.flextv.livestore.models.EPGChannel r1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SYCFR5S2bnvKqvLSZTVJ2Yrl6V4(com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3, java.lang.Boolean r4) {
            kotlin.Unit r0 = r0.lambda$searchLiveChannels$1(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$VQ_CO082ujyORF89Uzj71ywktqM(com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    static {
            java.lang.Class<com.flextv.livestore.dlgfragment.LiveSearchDlgFragment> r0 = com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.class
            return
    }

    public LiveSearchDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.category_pos = r0
            r0 = -1
            r1.focus_channel_pos = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r0, java.lang.String r1) {
            r0.searchLiveChannels(r1)
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r2.et_search = r0
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            android.view.View r3 = r3.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r3 = (com.flextv.livestore.view.LiveVerticalGridView) r3
            r2.recycler_channels = r3
            android.content.Context r3 = r2.context
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r3 == 0) goto L3f
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_channels
            r0 = 1
            r3.setNumColumns(r0)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_channels
            r1 = 0
            r3.setLoop(r1)
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_channels
            r3.setPreserveFocusAfterLayout(r0)
            android.view.View[] r3 = new android.view.View[r0]
            r0 = 0
            r3[r1] = r0
            com.flextv.livestore.view.LiveVerticalGridView r0 = r2.recycler_channels
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$3 r1 = new com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$3
            r1.<init>(r3)
            r0.setOnChildViewHolderSelectedListener(r1)
            goto L4d
        L3f:
            com.flextv.livestore.view.LiveVerticalGridView r3 = r2.recycler_channels
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r3.setLayoutManager(r0)
        L4d:
            return
    }

    private boolean isAdultChannel(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L26
            java.lang.String r2 = "adult"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "xxx"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "porn"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            return r2
        L26:
            java.util.List<java.lang.String> r3 = com.flextv.livestore.apps.Constants.xxx_live_categories
            boolean r2 = r3.contains(r2)
            return r2
    }

    private /* synthetic */ boolean lambda$onCreateView$0(android.content.DialogInterface r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            int r2 = r4.getAction()
            r3 = 0
            if (r2 != 0) goto L3f
            int r2 = r4.getKeyCode()
            r4 = 19
            r0 = 1
            if (r2 == r4) goto L28
            r4 = 20
            if (r2 == r4) goto L15
            goto L3f
        L15:
            android.widget.EditText r2 = r1.et_search
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto L3f
            android.widget.EditText r2 = r1.et_search
            r2.setFocusable(r3)
            com.flextv.livestore.view.LiveVerticalGridView r2 = r1.recycler_channels
            r2.requestFocus()
            return r0
        L28:
            com.flextv.livestore.view.LiveVerticalGridView r2 = r1.recycler_channels
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto L3f
            int r2 = r1.focus_channel_pos
            if (r2 != 0) goto L3f
            android.widget.EditText r2 = r1.et_search
            r2.setFocusable(r0)
            android.widget.EditText r2 = r1.et_search
            r2.requestFocus()
            return r0
        L3f:
            return r3
    }

    private /* synthetic */ kotlin.Unit lambda$searchLiveChannels$1(com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3, java.lang.Boolean r4) {
            r0 = this;
            int r2 = r2.intValue()
            r0.focus_channel_pos = r2
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L36
            int r2 = r0.category_pos
            r3 = 4
            if (r2 == r3) goto L17
            boolean r2 = r1.is_locked()
            if (r2 != 0) goto L2a
        L17:
            int r2 = r0.category_pos
            r3 = 2
            if (r2 != r3) goto L2e
            java.lang.String r2 = r1.getCategory_id()
            java.lang.String r3 = r1.getCategory_name()
            boolean r2 = r0.isAdultChannel(r2, r3)
            if (r2 == 0) goto L2e
        L2a:
            r0.showLockDlgFragment(r1)
            goto L36
        L2e:
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$SelectCurrentChannelListener r2 = r0.listener
            r2.onSelectCurrentChannel(r1)
            r0.dismiss()
        L36:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.LiveSearchDlgFragment newInstance(android.content.Context r1, com.flextv.livestore.models.CategoryModel r2, int r3, boolean r4) {
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r0 = new com.flextv.livestore.dlgfragment.LiveSearchDlgFragment
            r0.<init>()
            r0.context = r1
            r0.categoryModel = r2
            r0.is_m3u = r4
            r0.category_pos = r3
            return r0
    }

    private void searchLiveChannels(java.lang.String r6) {
            r5 = this;
            int r0 = r5.category_pos
            r1 = 5
            r2 = 4
            if (r0 <= r2) goto L3f
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceMyGroupCategory()
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L3f
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r0 = r0.size()
            if (r0 <= 0) goto L4e
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r2 = r5.category_pos
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            java.util.List r0 = r2.getSharedPreferenceMyGroupChannels(r0)
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r6 = r2.getEpgChannelsByNameArray(r0, r6)
            r5.searchChannels = r6
            goto L4e
        L3f:
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.CategoryModel r2 = r5.categoryModel
            boolean r3 = r5.is_m3u
            r4 = 0
            io.realm.RealmResults r6 = r0.getLiveChannelsByCategory(r2, r6, r3, r4)
            r5.searchChannels = r6
        L4e:
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r6 = new com.flextv.livestore.adapter.RecyclerLiveChannelAdapter
            android.content.Context r0 = r5.context
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r5.searchChannels
            r3 = -1
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4 r4 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4
            r4.<init>(r5, r1)
            r6.<init>(r0, r2, r3, r4)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r5.recycler_channels
            r0.setAdapter(r6)
            return
    }

    private void showLockDlgFragment(com.flextv.livestore.models.EPGChannel r5) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_channel_lock"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceParentPassword()
            com.flextv.livestore.dlgfragment.LockDlgFragment r1 = com.flextv.livestore.dlgfragment.LockDlgFragment.newInstance(r1)
            r4.lockDlgFragment = r1
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$2 r3 = new com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$2
            r3.<init>(r4, r5)
            r1.setOnPinEventListener(r3)
            com.flextv.livestore.dlgfragment.LockDlgFragment r5 = r4.lockDlgFragment
            r5.show(r0, r2)
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
            r4 = 2131624042(0x7f0e006a, float:1.8875253E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.context
            r3.<init>(r4)
            r1.preferenceHelper = r3
            android.content.Context r3 = r1.context
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            r1.initView(r2)
            android.widget.EditText r3 = r1.et_search
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$1 r4 = new com.flextv.livestore.dlgfragment.LiveSearchDlgFragment$1
            r4.<init>(r1)
            r3.addTextChangedListener(r4)
            java.lang.String r3 = ""
            r1.searchLiveChannels(r3)
            android.content.Context r3 = r1.context
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r3 == 0) goto L38
            android.widget.EditText r3 = r1.et_search
            r3.setFocusable(r0)
        L38:
            com.flextv.livestore.view.LiveVerticalGridView r3 = r1.recycler_channels
            r3.requestFocus()
            android.app.Dialog r3 = r1.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 6
            r4.<init>(r1, r0)
            r3.setOnKeyListener(r4)
            return r2
    }

    public void setSelectCurrentChannelListener(com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.SelectCurrentChannelListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
