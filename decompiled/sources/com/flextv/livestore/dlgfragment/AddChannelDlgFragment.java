package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes3.dex */
public class AddChannelDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public android.widget.ImageButton btn_back;
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModelList;
    public int category_pos;
    public com.flextv.livestore.adapter.AddChannelRecyclerAdapter channelRecyclerAdapter;
    public com.flextv.livestore.view.LiveVerticalGridView channel_list;
    public boolean[] checkedItems;
    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> epgChannels;
    public com.flextv.livestore.dlgfragment.GroupDlgFragment groupDlgFragment;
    public android.widget.ImageView image_add;
    public boolean is_m3u;
    public java.lang.String key;
    public com.flextv.livestore.dlgfragment.AddChannelDlgFragment.onSendMyGroupNamesListener listener;
    public android.widget.LinearLayout ly_category;
    public android.widget.LinearLayout ly_complete;
    public android.widget.LinearLayout ly_search;
    public java.util.List<java.lang.String> myChannelNames;
    public com.flextv.livestore.adapter.MyChannelRecyclerAdapter myChannelRecyclerAdapter;
    public com.flextv.livestore.view.LiveVerticalGridView my_channel_list;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.dlgfragment.SearchChannelDlgFragment searchChannelDlgFragment;
    public int selected_category;
    public android.widget.TextView str_add_channel;
    public android.widget.TextView str_check;
    public android.widget.TextView str_complete;
    public android.widget.TextView str_search;
    public android.widget.TextView txt_category;
    public android.widget.TextView txt_category_name;
    public android.widget.TextView txt_count;
    public android.widget.TextView txt_my_category;
    public com.flextv.livestore.models.WordModels wordModels;



    /* JADX INFO: loaded from: classes2.dex */
    public interface onSendMyGroupNamesListener {
        void onSendMyGroup(java.util.List<java.lang.String> r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$-_urMWAkc-30kIovhZjPHCzTuoQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m121$r8$lambda$_urMWAkc30kIovhZjPHCzTuoQ(com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0, java.lang.String r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$6d-8Oel12DpYGtLPr44umIIwuz4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m122$r8$lambda$6d8Oel12DpYGtLPr44umIIwuz4(com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$JNuB9ksIOXoB3Idngt9w385QqCM(com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$2(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$VU2DDTagwALI3Vu5Eo5i9wmx460(com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0, java.util.List r1) {
            r0.lambda$showSearchDlgFragment$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$dWulPqn_xQ3jSxq_v8ONgzml0qA(com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0, int r1) {
            r0.lambda$showGroupDlgFragment$3(r1)
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.dlgfragment.AddChannelDlgFragment> r0 = com.flextv.livestore.dlgfragment.AddChannelDlgFragment.class
            return
    }

    public AddChannelDlgFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.myChannelNames = r0
            r0 = 0
            r1.selected_category = r0
            r1.is_m3u = r0
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131427896(0x7f0b0238, float:1.8477421E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_category = r0
            r0 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_search = r0
            r0 = 2131427900(0x7f0b023c, float:1.847743E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_complete = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.btn_back = r0
            android.widget.LinearLayout r0 = r1.ly_category
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.ly_search
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.ly_complete
            r0.setOnClickListener(r1)
            android.widget.ImageButton r0 = r1.btn_back
            r0.setOnClickListener(r1)
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_category = r0
            r0 = 2131428289(0x7f0b03c1, float:1.8478218E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_category_name = r0
            r0 = 2131428295(0x7f0b03c7, float:1.847823E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_count = r0
            r0 = 2131428323(0x7f0b03e3, float:1.8478287E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_my_category = r0
            r0 = 2131428208(0x7f0b0370, float:1.8478054E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_search = r0
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_complete = r0
            r0 = 2131428279(0x7f0b03b7, float:1.8478198E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_add_channel = r0
            r0 = 2131427815(0x7f0b01e7, float:1.8477257E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r0 = r2.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r1.channel_list = r0
            r0 = 2131428011(0x7f0b02ab, float:1.8477654E38)
            android.view.View r0 = r2.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r1.my_channel_list = r0
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_check = r0
            r0 = 2131427778(0x7f0b01c2, float:1.8477182E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.image_add = r2
            android.widget.TextView r2 = r1.str_search
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_search_channels()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_complete
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_complete()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_add_channel
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_add_channels()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_check
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_mark_channels()
            r2.setText(r0)
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r2 = r3.booleanValue()
            if (r2 != 0) goto L1c
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L35
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            java.lang.String r1 = r1.getName()
            r2.add(r1)
            goto L35
        L1c:
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L35
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            java.lang.String r1 = r1.getName()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2.removeAll(r1)
        L35:
            java.util.List<java.lang.String> r1 = r0.myChannelNames
            int r1 = r1.size()
            r2 = 8
            r3 = 0
            if (r1 <= 0) goto L50
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.my_channel_list
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.str_check
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r0.image_add
            r1.setVisibility(r2)
            goto L5f
        L50:
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.my_channel_list
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.str_check
            r1.setVisibility(r3)
            android.widget.ImageView r1 = r0.image_add
            r1.setVisibility(r3)
        L5f:
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r1 = r0.myChannelRecyclerAdapter
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            r1.setChannelData(r2, r3)
            android.widget.TextView r1 = r0.txt_count
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List<java.lang.String> r3 = r0.myChannelNames
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = "/300"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            r1 = 0
            return r1
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$1(java.lang.String r2, java.lang.Integer r3, java.lang.Boolean r4) {
            r1 = this;
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L6e
            java.util.List<java.lang.String> r3 = r1.myChannelNames
            r3.remove(r2)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r2 = r1.myChannelRecyclerAdapter
            java.util.List<java.lang.String> r3 = r1.myChannelNames
            r4 = 0
            r2.setChannelData(r3, r4)
            android.widget.TextView r2 = r1.txt_count
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r0 = r1.myChannelNames
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r0 = "/300"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            com.flextv.livestore.helper.PreferenceHelper r2 = r1.preferenceHelper
            java.lang.String r3 = r1.key
            java.util.List<java.lang.String> r0 = r1.myChannelNames
            r2.setSharedPreferenceMyGroupChannels(r3, r0)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r1.epgChannels
            int r2 = r2.size()
            boolean[] r2 = new boolean[r2]
            r1.checkedItems = r2
        L42:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r1.epgChannels
            int r2 = r2.size()
            if (r4 >= r2) goto L65
            boolean[] r2 = r1.checkedItems
            java.util.List<java.lang.String> r3 = r1.myChannelNames
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r1.epgChannels
            java.lang.Object r0 = r0.get(r4)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getName()
            boolean r3 = r3.contains(r0)
            r3 = r3 ^ 1
            r2[r4] = r3
            int r4 = r4 + 1
            goto L42
        L65:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r2 = r1.channelRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r3 = r1.epgChannels
            boolean[] r4 = r1.checkedItems
            r2.setChannelData(r3, r4)
        L6e:
            r2 = 0
            return r2
    }

    private /* synthetic */ boolean lambda$onCreateView$2(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L6a
            r1 = 22
            r3 = 1
            if (r2 != r1) goto L40
            android.widget.LinearLayout r1 = r0.ly_category
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L3a
            android.widget.LinearLayout r1 = r0.ly_search
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L3a
            android.widget.LinearLayout r1 = r0.ly_complete
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L24
            goto L3a
        L24:
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.channel_list
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L39
            java.util.List<java.lang.String> r1 = r0.myChannelNames
            int r1 = r1.size()
            if (r1 <= 0) goto L39
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.my_channel_list
            r1.requestFocus()
        L39:
            return r3
        L3a:
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.channel_list
            r1.requestFocus()
            return r3
        L40:
            r1 = 21
            if (r2 != r1) goto L60
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.my_channel_list
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L52
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.channel_list
            r1.requestFocus()
            return r3
        L52:
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.channel_list
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L5f
            android.widget.LinearLayout r1 = r0.ly_category
            r1.requestFocus()
        L5f:
            return r3
        L60:
            r1 = 4
            if (r2 != r1) goto L6a
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$onSendMyGroupNamesListener r1 = r0.listener
            java.util.List<java.lang.String> r2 = r0.myChannelNames
            r1.onSendMyGroup(r2)
        L6a:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$showGroupDlgFragment$3(int r5) {
            r4 = this;
            r4.selected_category = r5
            android.widget.TextView r0 = r4.txt_category
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModelList
            java.lang.Object r1 = r1.get(r5)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            android.widget.TextView r0 = r4.txt_category_name
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModelList
            java.lang.Object r1 = r1.get(r5)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModelList
            java.lang.Object r5 = r1.get(r5)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            boolean r1 = r4.is_m3u
            java.lang.String r2 = ""
            r3 = 0
            io.realm.RealmResults r5 = r0.getLiveChannelsByCategory(r5, r2, r1, r3)
            r4.epgChannels = r5
            int r5 = r5.size()
            boolean[] r5 = new boolean[r5]
            r4.checkedItems = r5
            r5 = 0
        L44:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r0 = r0.size()
            if (r5 >= r0) goto L67
            boolean[] r0 = r4.checkedItems
            java.util.List<java.lang.String> r1 = r4.myChannelNames
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            java.lang.Object r2 = r2.get(r5)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.contains(r2)
            r1 = r1 ^ 1
            r0[r5] = r1
            int r5 = r5 + 1
            goto L44
        L67:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r5 = r4.channelRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            boolean[] r1 = r4.checkedItems
            r5.setChannelData(r0, r1)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r5 = r4.epgChannels
            int r5 = r5.size()
            if (r5 <= 0) goto L7d
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.channel_list
            r5.setSelectedPosition(r3)
        L7d:
            return
    }

    private /* synthetic */ void lambda$showSearchDlgFragment$4(java.util.List r4) {
            r3 = this;
            r3.myChannelNames = r4
            android.widget.TextView r4 = r3.txt_count
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<java.lang.String> r1 = r3.myChannelNames
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "/300"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r4 = r3.myChannelRecyclerAdapter
            java.util.List<java.lang.String> r0 = r3.myChannelNames
            r1 = 0
            r4.setChannelData(r0, r1)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            java.lang.String r0 = r3.key
            java.util.List<java.lang.String> r2 = r3.myChannelNames
            r4.setSharedPreferenceMyGroupChannels(r0, r2)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r4 = r3.epgChannels
            int r4 = r4.size()
            boolean[] r4 = new boolean[r4]
            r3.checkedItems = r4
        L39:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r4 = r3.epgChannels
            int r4 = r4.size()
            if (r1 >= r4) goto L5c
            boolean[] r4 = r3.checkedItems
            java.util.List<java.lang.String> r0 = r3.myChannelNames
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r3.epgChannels
            java.lang.Object r2 = r2.get(r1)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ 1
            r4[r1] = r0
            int r1 = r1 + 1
            goto L39
        L5c:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r4 = r3.channelRecyclerAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r3.epgChannels
            boolean[] r1 = r3.checkedItems
            r4.setChannelData(r0, r1)
            return
    }

    public static com.flextv.livestore.dlgfragment.AddChannelDlgFragment newInstance(java.lang.String r1, int r2) {
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment r0 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment
            r0.<init>()
            r0.key = r1
            r0.category_pos = r2
            return r0
    }

    private void showGroupDlgFragment() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_my_group"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L18
            r1.remove(r3)
            r0 = 0
            r1.addToBackStack(r0)
            return
        L18:
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModelList
            int r3 = r4.selected_category
            com.flextv.livestore.dlgfragment.GroupDlgFragment r1 = com.flextv.livestore.dlgfragment.GroupDlgFragment.newInstance(r1, r3)
            r4.groupDlgFragment = r1
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda0
            r3.<init>(r4)
            r1.setOnSelectCategoryListener(r3)
            com.flextv.livestore.dlgfragment.GroupDlgFragment r1 = r4.groupDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showSearchDlgFragment() {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_search_channel"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L18
            r1.remove(r3)
            r0 = 0
            r1.addToBackStack(r0)
            return
        L18:
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModelList
            java.util.List<java.lang.String> r3 = r5.myChannelNames
            int r4 = r5.selected_category
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r1 = com.flextv.livestore.dlgfragment.SearchChannelDlgFragment.newInstance(r1, r3, r4)
            r5.searchChannelDlgFragment = r1
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda0
            r3.<init>(r5)
            r1.setOnSearchChannelListener(r3)
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r1 = r5.searchChannelDlgFragment
            r1.show(r0, r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            switch(r2) {
                case 2131427464: goto L10;
                case 2131427896: goto Lc;
                case 2131427900: goto L10;
                case 2131427918: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            r1.showSearchDlgFragment()
            goto L1a
        Lc:
            r1.showGroupDlgFragment()
            goto L1a
        L10:
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$onSendMyGroupNamesListener r2 = r1.listener
            java.util.List<java.lang.String> r0 = r1.myChannelNames
            r2.onSendMyGroup(r0)
            r1.dismiss()
        L1a:
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
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
            r5 = this;
            r8 = 2131624022(0x7f0e0056, float:1.8875212E38)
            android.view.View r6 = r6.inflate(r8, r7)
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r8 = r5.getContext()
            r7.<init>(r8)
            r5.preferenceHelper = r7
            android.content.Context r7 = r5.getContext()
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r5.wordModels = r7
            r5.initView(r6)
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.preferenceHelper
            boolean r7 = r7.getSharedPreferenceISM3U()
            r5.is_m3u = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.categoryModelList = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.preferenceHelper
            java.util.List r7 = r7.getSharedPreferenceMyGroupCategory()
            int r7 = r7.size()
            int r7 = r7 + 5
        L3a:
            com.flextv.livestore.helper.PreferenceHelper r8 = r5.preferenceHelper
            java.util.List r8 = r8.getSharedLiveCategoryModels()
            int r8 = r8.size()
            if (r7 >= r8) goto L67
            com.flextv.livestore.helper.PreferenceHelper r8 = r5.preferenceHelper
            java.util.List r8 = r8.getSharedLiveCategoryModels()
            java.lang.Object r8 = r8.get(r7)
            com.flextv.livestore.models.CategoryModel r8 = (com.flextv.livestore.models.CategoryModel) r8
            java.util.List<java.lang.String> r0 = com.flextv.livestore.apps.Constants.xxx_live_categories
            java.lang.String r1 = r8.getId()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5f
            goto L64
        L5f:
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModelList
            r0.add(r8)
        L64:
            int r7 = r7 + 1
            goto L3a
        L67:
            android.widget.TextView r7 = r5.txt_category
            java.util.List<com.flextv.livestore.models.CategoryModel> r8 = r5.categoryModelList
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.CategoryModel r8 = (com.flextv.livestore.models.CategoryModel) r8
            java.lang.String r8 = r8.getName()
            r7.setText(r8)
            android.widget.TextView r7 = r5.txt_category_name
            java.util.List<com.flextv.livestore.models.CategoryModel> r8 = r5.categoryModelList
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.CategoryModel r8 = (com.flextv.livestore.models.CategoryModel) r8
            java.lang.String r8 = r8.getName()
            r7.setText(r8)
            com.flextv.livestore.helper.RealmController r7 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r8 = r5.categoryModelList
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.CategoryModel r8 = (com.flextv.livestore.models.CategoryModel) r8
            boolean r1 = r5.is_m3u
            java.lang.String r2 = ""
            io.realm.RealmResults r7 = r7.getLiveChannelsByCategory(r8, r2, r1, r0)
            r5.epgChannels = r7
            int r7 = r5.category_pos
            r8 = 1
            if (r7 != r8) goto Lb9
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.preferenceHelper
            java.util.List r7 = r7.getSharedPreferenceLiveFavChannels()
            r5.myChannelNames = r7
            android.widget.TextView r7 = r5.txt_my_category
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getFavorite()
            r7.setText(r1)
            goto Lca
        Lb9:
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.preferenceHelper
            java.lang.String r1 = r5.key
            java.util.List r7 = r7.getSharedPreferenceMyGroupChannels(r1)
            r5.myChannelNames = r7
            android.widget.TextView r7 = r5.txt_my_category
            java.lang.String r1 = r5.key
            r7.setText(r1)
        Lca:
            android.widget.TextView r7 = r5.txt_count
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List<java.lang.String> r2 = r5.myChannelNames
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = "/300"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.setText(r1)
            java.util.List<java.lang.String> r7 = r5.myChannelNames
            int r7 = r7.size()
            r1 = 8
            if (r7 <= 0) goto L100
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            r7.setVisibility(r0)
            android.widget.TextView r7 = r5.str_check
            r7.setVisibility(r1)
            android.widget.ImageView r7 = r5.image_add
            r7.setVisibility(r1)
            goto L10f
        L100:
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            r7.setVisibility(r1)
            android.widget.TextView r7 = r5.str_check
            r7.setVisibility(r0)
            android.widget.ImageView r7 = r5.image_add
            r7.setVisibility(r0)
        L10f:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r5.epgChannels
            int r7 = r7.size()
            boolean[] r7 = new boolean[r7]
            r5.checkedItems = r7
            r7 = 0
        L11a:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            int r1 = r1.size()
            if (r7 >= r1) goto L13c
            boolean[] r1 = r5.checkedItems
            java.util.List<java.lang.String> r2 = r5.myChannelNames
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r3 = r5.epgChannels
            java.lang.Object r3 = r3.get(r7)
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.contains(r3)
            r2 = r2 ^ r8
            r1[r7] = r2
            int r7 = r7 + 1
            goto L11a
        L13c:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r7 = new com.flextv.livestore.adapter.AddChannelRecyclerAdapter
            android.content.Context r1 = r5.getContext()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r5.epgChannels
            boolean[] r3 = r5.checkedItems
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda1 r4 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda1
            r4.<init>(r5, r0)
            r7.<init>(r1, r2, r3, r4)
            r5.channelRecyclerAdapter = r7
            com.flextv.livestore.view.LiveVerticalGridView r1 = r5.channel_list
            r1.setAdapter(r7)
            android.content.Context r7 = r5.getContext()
            boolean r7 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r7)
            r1 = 0
            if (r7 == 0) goto L17e
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r7.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r7.setNumColumns(r8)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r7.setPreserveFocusAfterLayout(r8)
            android.view.View[] r7 = new android.view.View[r8]
            r7[r0] = r1
            com.flextv.livestore.view.LiveVerticalGridView r2 = r5.channel_list
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$1 r3 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$1
            r3.<init>(r7)
            r2.setOnChildViewHolderSelectedListener(r3)
            goto L18c
        L17e:
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r7.setLayoutManager(r2)
        L18c:
            com.flextv.livestore.adapter.MyChannelRecyclerAdapter r7 = new com.flextv.livestore.adapter.MyChannelRecyclerAdapter
            android.content.Context r2 = r5.getContext()
            java.util.List<java.lang.String> r3 = r5.myChannelNames
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda1 r4 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$$ExternalSyntheticLambda1
            r4.<init>(r5, r8)
            r7.<init>(r2, r3, r0, r4)
            r5.myChannelRecyclerAdapter = r7
            com.flextv.livestore.view.LiveVerticalGridView r2 = r5.my_channel_list
            r2.setAdapter(r7)
            android.content.Context r7 = r5.getContext()
            boolean r7 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r7)
            if (r7 == 0) goto L1cb
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            r7.setNumColumns(r8)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            r7.setLoop(r0)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            r7.setPreserveFocusAfterLayout(r8)
            android.view.View[] r7 = new android.view.View[r8]
            r7[r0] = r1
            com.flextv.livestore.view.LiveVerticalGridView r0 = r5.my_channel_list
            com.flextv.livestore.dlgfragment.AddChannelDlgFragment$2 r1 = new com.flextv.livestore.dlgfragment.AddChannelDlgFragment$2
            r1.<init>(r7)
            r0.setOnChildViewHolderSelectedListener(r1)
            goto L1d9
        L1cb:
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.my_channel_list
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r7.setLayoutManager(r0)
        L1d9:
            android.app.Dialog r7 = r5.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0.<init>(r5, r8)
            r7.setOnKeyListener(r0)
            android.widget.LinearLayout r7 = r5.ly_category
            r7.requestFocus()
            return r6
    }

    public void setOnSendMyGroupNamesListener(com.flextv.livestore.dlgfragment.AddChannelDlgFragment.onSendMyGroupNamesListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
