package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class SearchChannelDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public com.flextv.livestore.adapter.AddChannelRecyclerAdapter addChannelRecyclerAdapter;
    public android.widget.ImageButton btn_back;
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModelList;
    public int category_pos;
    public com.flextv.livestore.view.LiveVerticalGridView channel_list;
    public boolean[] checkedItems;
    public java.util.List<com.flextv.livestore.models.EPGChannel> epgChannels;
    public android.widget.EditText et_search;
    public android.os.Handler handler;
    public boolean is_m3u;
    public com.flextv.livestore.dlgfragment.SearchChannelDlgFragment.onSearchChannelListener listener;
    public android.widget.LinearLayout ly_all;
    public android.widget.LinearLayout ly_clear;
    public android.widget.LinearLayout ly_complete;
    public java.util.List<java.lang.String> myChannelNames;
    public androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 searchTicker;
    public int search_time;
    public android.widget.TextView str_clear;
    public android.widget.TextView str_complete;
    public android.widget.TextView txt_add;
    public android.widget.TextView txt_category;
    public com.flextv.livestore.models.WordModels wordModels;



    /* JADX INFO: loaded from: classes2.dex */
    public interface onSearchChannelListener {
        void onSearchChannelNames(java.util.List<java.lang.String> r1);
    }

    public static /* synthetic */ void $r8$lambda$NsIvHmWUrTn6PpNqaazIVL91nQw(com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0) {
            r0.lambda$searchTimer$2()
            return
    }

    public static /* synthetic */ boolean $r8$lambda$fZxtgAKq8JbCCySrwkpvspZuvu8(com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zoCDtnEHLgf3tnaYShskUjD79sI(com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public SearchChannelDlgFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.epgChannels = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.myChannelNames = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.handler = r0
            r0 = 0
            r1.is_m3u = r0
            r0 = 2
            r1.search_time = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0) {
            r0.searchTimer()
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131427889(0x7f0b0231, float:1.8477407E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_all = r0
            r0 = 2131427899(0x7f0b023b, float:1.8477427E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_clear = r0
            r0 = 2131427900(0x7f0b023c, float:1.847743E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.ly_complete = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.btn_back = r0
            android.widget.LinearLayout r0 = r1.ly_all
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.ly_clear
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.ly_complete
            r0.setOnClickListener(r1)
            android.widget.ImageButton r0 = r1.btn_back
            r0.setOnClickListener(r1)
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.et_search = r0
            r0 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r0 = r2.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r1.channel_list = r0
            r0 = 2131428279(0x7f0b03b7, float:1.8478198E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_add = r0
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_category = r0
            r0 = 2131428186(0x7f0b035a, float:1.847801E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.str_clear = r0
            r0 = 2131428187(0x7f0b035b, float:1.8478011E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.str_complete = r2
            android.widget.TextView r2 = r1.txt_add
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getSearch()
            r2.setText(r0)
            android.widget.TextView r2 = r1.txt_category
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getSelect_all()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_clear
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getClear_all()
            r2.setText(r0)
            android.widget.TextView r2 = r1.str_complete
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_confirm()
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
            r1 = 0
            return r1
    }

    private /* synthetic */ boolean lambda$onCreateView$1(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L19
            r1 = 19
            if (r2 != r1) goto L19
            com.flextv.livestore.view.LiveVerticalGridView r1 = r0.channel_list
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L19
            android.widget.EditText r1 = r0.et_search
            r1.requestFocus()
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$searchTimer$2() {
            r1 = this;
            int r0 = r1.search_time
            if (r0 != 0) goto L8
            r1.searchChannels()
            return
        L8:
            r1.runNextTicker()
            return
    }

    public static com.flextv.livestore.dlgfragment.SearchChannelDlgFragment newInstance(java.util.List<com.flextv.livestore.models.CategoryModel> r1, java.util.List<java.lang.String> r2, int r3) {
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment r0 = new com.flextv.livestore.dlgfragment.SearchChannelDlgFragment
            r0.<init>()
            r0.categoryModelList = r1
            r0.myChannelNames = r2
            r0.category_pos = r3
            return r0
    }

    private void runNextTicker() {
            r4 = this;
            int r0 = r4.search_time
            int r0 = r0 + (-1)
            r4.search_time = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = r4.searchTicker
            r2.postAtTime(r3, r0)
            return
    }

    private void searchChannels() {
            r5 = this;
            android.widget.EditText r0 = r5.et_search
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r5.categoryModelList
            int r3 = r5.category_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            boolean r3 = r5.is_m3u
            r4 = 0
            io.realm.RealmResults r0 = r1.getLiveChannelsByCategory(r2, r0, r3, r4)
            r5.epgChannels = r0
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r5.checkedItems = r0
        L2d:
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r0 = r0.size()
            if (r4 >= r0) goto L50
            boolean[] r0 = r5.checkedItems
            java.util.List<java.lang.String> r1 = r5.myChannelNames
            java.util.List<com.flextv.livestore.models.EPGChannel> r2 = r5.epgChannels
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.contains(r2)
            r1 = r1 ^ 1
            r0[r4] = r1
            int r4 = r4 + 1
            goto L2d
        L50:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r0 = r5.addChannelRecyclerAdapter
            java.util.List<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            boolean[] r2 = r5.checkedItems
            r0.setChannelData(r1, r2)
            return
    }

    private void searchTimer() {
            r2 = this;
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r1 = 9
            r0.<init>(r2, r1)
            r2.searchTicker = r0
            r0.run()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            r0 = 0
            switch(r4) {
                case 2131427464: goto L84;
                case 2131427889: goto L3d;
                case 2131427899: goto La;
                case 2131427900: goto L84;
                default: goto L8;
            }
        L8:
            goto L8e
        La:
            java.util.List<com.flextv.livestore.models.EPGChannel> r4 = r3.epgChannels
            int r4 = r4.size()
            if (r4 <= 0) goto L8e
        L12:
            java.util.List<com.flextv.livestore.models.EPGChannel> r4 = r3.epgChannels
            int r4 = r4.size()
            if (r0 >= r4) goto L33
            boolean[] r4 = r3.checkedItems
            r1 = 1
            r4[r0] = r1
            java.util.List<java.lang.String> r4 = r3.myChannelNames
            java.util.List<com.flextv.livestore.models.EPGChannel> r1 = r3.epgChannels
            java.lang.Object r1 = r1.get(r0)
            com.flextv.livestore.models.EPGChannel r1 = (com.flextv.livestore.models.EPGChannel) r1
            java.lang.String r1 = r1.getName()
            r4.remove(r1)
            int r0 = r0 + 1
            goto L12
        L33:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r4 = r3.addChannelRecyclerAdapter
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r3.epgChannels
            boolean[] r1 = r3.checkedItems
            r4.setChannelData(r0, r1)
            goto L8e
        L3d:
            java.util.List<com.flextv.livestore.models.EPGChannel> r4 = r3.epgChannels
            int r4 = r4.size()
            if (r4 <= 0) goto L8e
            r4 = 0
        L46:
            java.util.List<com.flextv.livestore.models.EPGChannel> r1 = r3.epgChannels
            int r1 = r1.size()
            if (r4 >= r1) goto L7a
            boolean[] r1 = r3.checkedItems
            r1[r4] = r0
            java.util.List<java.lang.String> r1 = r3.myChannelNames
            java.util.List<com.flextv.livestore.models.EPGChannel> r2 = r3.epgChannels
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L77
            java.util.List<java.lang.String> r1 = r3.myChannelNames
            java.util.List<com.flextv.livestore.models.EPGChannel> r2 = r3.epgChannels
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            r1.add(r2)
        L77:
            int r4 = r4 + 1
            goto L46
        L7a:
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r4 = r3.addChannelRecyclerAdapter
            java.util.List<com.flextv.livestore.models.EPGChannel> r0 = r3.epgChannels
            boolean[] r1 = r3.checkedItems
            r4.setChannelData(r0, r1)
            goto L8e
        L84:
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment$onSearchChannelListener r4 = r3.listener
            java.util.List<java.lang.String> r0 = r3.myChannelNames
            r4.onSearchChannelNames(r0)
            r3.dismiss()
        L8e:
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
            r8 = 2131624043(0x7f0e006b, float:1.8875255E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            android.content.Context r7 = r5.getContext()
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r5.wordModels = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r8 = r5.getContext()
            r7.<init>(r8)
            boolean r7 = r7.getSharedPreferenceISM3U()
            r5.is_m3u = r7
            r5.initView(r6)
            boolean[] r7 = new boolean[r0]
            r5.checkedItems = r7
            com.flextv.livestore.adapter.AddChannelRecyclerAdapter r7 = new com.flextv.livestore.adapter.AddChannelRecyclerAdapter
            android.content.Context r8 = r5.getContext()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean[] r2 = r5.checkedItems
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r3 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r4 = 12
            r3.<init>(r5, r4)
            r7.<init>(r8, r1, r2, r3)
            r5.addChannelRecyclerAdapter = r7
            com.flextv.livestore.view.LiveVerticalGridView r8 = r5.channel_list
            r8.setAdapter(r7)
            android.content.Context r7 = r5.getContext()
            boolean r7 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r7)
            if (r7 == 0) goto L70
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r7.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r8 = 1
            r7.setNumColumns(r8)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            r7.setPreserveFocusAfterLayout(r8)
            android.view.View[] r7 = new android.view.View[r8]
            r8 = 0
            r7[r0] = r8
            com.flextv.livestore.view.LiveVerticalGridView r8 = r5.channel_list
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment$1 r0 = new com.flextv.livestore.dlgfragment.SearchChannelDlgFragment$1
            r0.<init>(r7)
            r8.setOnChildViewHolderSelectedListener(r0)
            goto L7e
        L70:
            com.flextv.livestore.view.LiveVerticalGridView r7 = r5.channel_list
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r5.getContext()
            r8.<init>(r0)
            r7.setLayoutManager(r8)
        L7e:
            android.widget.EditText r7 = r5.et_search
            com.flextv.livestore.dlgfragment.SearchChannelDlgFragment$2 r8 = new com.flextv.livestore.dlgfragment.SearchChannelDlgFragment$2
            r8.<init>(r5)
            r7.addTextChangedListener(r8)
            android.widget.EditText r7 = r5.et_search
            r7.requestFocus()
            android.app.Dialog r7 = r5.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 9
            r8.<init>(r5, r0)
            r7.setOnKeyListener(r8)
            return r6
    }

    public void setOnSearchChannelListener(com.flextv.livestore.dlgfragment.SearchChannelDlgFragment.onSearchChannelListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
