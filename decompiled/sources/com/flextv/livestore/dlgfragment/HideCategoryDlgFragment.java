package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class HideCategoryDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter adapter;
    public android.widget.Button btn_all;
    public android.widget.Button btn_cancel;
    public android.widget.Button btn_ok;
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public java.lang.String[] category_ids;
    public java.lang.String[] category_names;
    public int category_start_pos;
    public boolean[] checkedItems;
    public android.content.Context context;
    public int id;
    public com.flextv.livestore.dlgfragment.HideCategoryDlgFragment.OnCategoryChanged listener;
    public androidx.recyclerview.widget.RecyclerView recyclerGroups;
    public java.util.List<java.lang.String> selectedIds;
    public com.flextv.livestore.helper.PreferenceHelper sharedPreferenceHelper;
    public android.widget.TextView txt_header;
    public com.flextv.livestore.models.WordModels wordModels;

    public interface OnCategoryChanged {
        void CategoryChanged();
    }

    /* JADX INFO: renamed from: $r8$lambda$IuBL57TxcjmG9tziDfN-detA17o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m132$r8$lambda$IuBL57TxcjmG9tziDfNdetA17o(com.flextv.livestore.dlgfragment.HideCategoryDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$K3eyOBfZ8HQmxHg-fCe63mwnQ6E, reason: not valid java name */
    public static /* synthetic */ boolean m133$r8$lambda$K3eyOBfZ8HQmxHgfCe63mwnQ6E(com.flextv.livestore.dlgfragment.HideCategoryDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    public HideCategoryDlgFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.selectedIds = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            r0 = 0
            r1.category_start_pos = r0
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_header = r0
            r0 = 2131428073(0x7f0b02e9, float:1.847778E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.recyclerGroups = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_ok = r0
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.btn_cancel = r0
            r0 = 2131427462(0x7f0b0086, float:1.847654E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_all = r2
            android.widget.Button r2 = r1.btn_ok
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_cancel
            r2.setOnClickListener(r1)
            android.widget.Button r2 = r1.btn_all
            r2.setOnClickListener(r1)
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(java.lang.Integer r3, java.lang.Boolean r4) {
            r2 = this;
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L24
            java.util.List<java.lang.String> r4 = r2.selectedIds
            java.lang.String[] r0 = r2.category_ids
            int r1 = r3.intValue()
            r0 = r0[r1]
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L45
            java.util.List<java.lang.String> r4 = r2.selectedIds
            java.lang.String[] r0 = r2.category_ids
            int r3 = r3.intValue()
            r3 = r0[r3]
            r4.add(r3)
            goto L45
        L24:
            java.util.List<java.lang.String> r4 = r2.selectedIds
            java.lang.String[] r0 = r2.category_ids
            int r1 = r3.intValue()
            r0 = r0[r1]
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L45
            java.util.List<java.lang.String> r4 = r2.selectedIds
            java.lang.String[] r0 = r2.category_ids
            int r3 = r3.intValue()
            r3 = r0[r3]
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r4.removeAll(r3)
        L45:
            r3 = 0
            return r3
    }

    private /* synthetic */ boolean lambda$onCreateView$1(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L2c
            r1 = 21
            r3 = 1
            if (r2 == r1) goto L1e
            r1 = 22
            if (r2 == r1) goto L10
            goto L2c
        L10:
            androidx.recyclerview.widget.RecyclerView r1 = r0.recyclerGroups
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L2c
            android.widget.Button r1 = r0.btn_cancel
            r1.requestFocus()
            return r3
        L1e:
            androidx.recyclerview.widget.RecyclerView r1 = r0.recyclerGroups
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L2c
            android.widget.Button r1 = r0.btn_ok
            r1.requestFocus()
            return r3
        L2c:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.HideCategoryDlgFragment newInstance(android.content.Context r1, int r2) {
            com.flextv.livestore.dlgfragment.HideCategoryDlgFragment r0 = new com.flextv.livestore.dlgfragment.HideCategoryDlgFragment
            r0.<init>()
            r0.context = r1
            r0.id = r2
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131427462(0x7f0b0086, float:1.847654E38)
            r1 = 1
            if (r3 == r0) goto L58
            r0 = 2131427465(0x7f0b0089, float:1.8476547E38)
            if (r3 == r0) goto L54
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            if (r3 == r0) goto L15
            goto L81
        L15:
            int r3 = r2.id
            if (r3 == 0) goto L3d
            if (r3 == r1) goto L2e
            r0 = 2
            if (r3 == r0) goto L1f
            goto L4b
        L1f:
            java.util.List<java.lang.String> r3 = r2.selectedIds
            android.content.Context r0 = r2.context
            com.flextv.livestore.apps.Constants.getSeriesGroupModels(r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper
            java.util.List<java.lang.String> r0 = r2.selectedIds
            r3.setSharedPreferenceInvisibleSeriesCategories(r0)
            goto L4b
        L2e:
            java.util.List<java.lang.String> r3 = r2.selectedIds
            android.content.Context r0 = r2.context
            com.flextv.livestore.apps.Constants.getVodGroupModels(r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper
            java.util.List<java.lang.String> r0 = r2.selectedIds
            r3.setSharedPreferenceInvisibleVodCategories(r0)
            goto L4b
        L3d:
            java.util.List<java.lang.String> r3 = r2.selectedIds
            android.content.Context r0 = r2.context
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = r2.sharedPreferenceHelper
            java.util.List<java.lang.String> r0 = r2.selectedIds
            r3.setSharedPreferenceInvisibleLiveCategories(r0)
        L4b:
            com.flextv.livestore.dlgfragment.HideCategoryDlgFragment$OnCategoryChanged r3 = r2.listener
            r3.CategoryChanged()
            r2.dismiss()
            goto L81
        L54:
            r2.dismiss()
            goto L81
        L58:
            java.util.List<java.lang.String> r3 = r2.selectedIds
            int r3 = r3.size()
            java.lang.String[] r0 = r2.category_ids
            int r0 = r0.length
            if (r3 >= r0) goto L74
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r3 = r2.adapter
            r3.allChecked(r1)
            java.util.List<java.lang.String> r3 = r2.selectedIds
            java.lang.String[] r0 = r2.category_ids
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.addAll(r0)
            goto L81
        L74:
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r3 = r2.adapter
            r0 = 0
            r3.allChecked(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.selectedIds = r3
        L81:
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
            r8 = 2131624032(0x7f0e0060, float:1.8875232E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            r5.initView(r6)
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r8 = r5.context
            r7.<init>(r8)
            r5.sharedPreferenceHelper = r7
            android.content.Context r7 = r5.context
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r5.wordModels = r7
            android.widget.TextView r8 = r5.txt_header
            java.lang.String r7 = r7.getSelect_categories_you_want_to_hide()
            r8.setText(r7)
            android.widget.Button r7 = r5.btn_ok
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getOk()
            r7.setText(r8)
            android.widget.Button r7 = r5.btn_all
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getSelect_all()
            r7.setText(r8)
            android.widget.Button r7 = r5.btn_cancel
            com.flextv.livestore.models.WordModels r8 = r5.wordModels
            java.lang.String r8 = r8.getCancel()
            r7.setText(r8)
            int r7 = r5.id
            r8 = 1
            if (r7 == 0) goto Lc6
            r1 = 3
            if (r7 == r8) goto L8d
            r2 = 2
            if (r7 == r2) goto L53
            goto L10a
        L53:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.categoryModels = r7
            r5.category_start_pos = r1
            r7 = 0
        L5d:
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.sharedPreferenceHelper
            java.util.List r1 = r1.getSharedPreferenceSeriesCategoryModel()
            int r1 = r1.size()
            int r2 = r5.category_start_pos
            int r1 = r1 - r2
            if (r7 >= r1) goto L83
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.sharedPreferenceHelper
            java.util.List r2 = r2.getSharedPreferenceSeriesCategoryModel()
            int r3 = r5.category_start_pos
            int r3 = r3 + r7
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            r1.add(r2)
            int r7 = r7 + 1
            goto L5d
        L83:
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceInvisibleSeriesCategories()
            r5.selectedIds = r7
            goto L10a
        L8d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.categoryModels = r7
            r5.category_start_pos = r1
            r7 = 0
        L97:
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.sharedPreferenceHelper
            java.util.List r1 = r1.getSharedPreferenceVodCategory()
            int r1 = r1.size()
            int r2 = r5.category_start_pos
            int r1 = r1 - r2
            if (r7 >= r1) goto Lbd
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.sharedPreferenceHelper
            java.util.List r2 = r2.getSharedPreferenceVodCategory()
            int r3 = r5.category_start_pos
            int r3 = r3 + r7
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            r1.add(r2)
            int r7 = r7 + 1
            goto L97
        Lbd:
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceInvisibleVodCategories()
            r5.selectedIds = r7
            goto L10a
        Lc6:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.categoryModels = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceMyGroupCategory()
            int r7 = r7.size()
            int r7 = r7 + 5
            r5.category_start_pos = r7
            r7 = 0
        Ldc:
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.sharedPreferenceHelper
            java.util.List r1 = r1.getSharedLiveCategoryModels()
            int r1 = r1.size()
            int r2 = r5.category_start_pos
            int r1 = r1 - r2
            if (r7 >= r1) goto L102
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.sharedPreferenceHelper
            java.util.List r2 = r2.getSharedLiveCategoryModels()
            int r3 = r5.category_start_pos
            int r3 = r3 + r7
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            r1.add(r2)
            int r7 = r7 + 1
            goto Ldc
        L102:
            com.flextv.livestore.helper.PreferenceHelper r7 = r5.sharedPreferenceHelper
            java.util.List r7 = r7.getSharedPreferenceInvisibleLiveCategories()
            r5.selectedIds = r7
        L10a:
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = r5.categoryModels
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.category_names = r7
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = r5.categoryModels
            int r7 = r7.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.category_ids = r7
            java.lang.String[] r7 = r5.category_names
            int r7 = r7.length
            boolean[] r7 = new boolean[r7]
            r5.checkedItems = r7
        L125:
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = r5.categoryModels
            int r7 = r7.size()
            if (r0 >= r7) goto L156
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = r5.categoryModels
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.CategoryModel r7 = (com.flextv.livestore.models.CategoryModel) r7
            java.lang.String[] r1 = r5.category_names
            java.lang.String r2 = r7.getName()
            r1[r0] = r2
            java.lang.String[] r1 = r5.category_ids
            java.lang.String r2 = r7.getId()
            r1[r0] = r2
            boolean[] r1 = r5.checkedItems
            java.util.List<java.lang.String> r2 = r5.selectedIds
            java.lang.String r7 = r7.getId()
            boolean r7 = r2.contains(r7)
            r1[r0] = r7
            int r0 = r0 + 1
            goto L125
        L156:
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r7 = new com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter
            android.content.Context r0 = r5.getContext()
            java.lang.String[] r1 = r5.category_names
            boolean[] r2 = r5.checkedItems
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r4 = 4
            r3.<init>(r5, r4)
            r7.<init>(r0, r1, r2, r3)
            r5.adapter = r7
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r7.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            r7.setHasFixedSize(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.recyclerGroups
            com.flextv.livestore.adapter.HideCategoryRecyclerViewAdapter r8 = r5.adapter
            r7.setAdapter(r8)
            android.app.Dialog r7 = r5.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r8 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r8.<init>(r5, r4)
            r7.setOnKeyListener(r8)
            return r6
    }

    public void setOnCategoryChangedListener(com.flextv.livestore.dlgfragment.HideCategoryDlgFragment.OnCategoryChanged r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
