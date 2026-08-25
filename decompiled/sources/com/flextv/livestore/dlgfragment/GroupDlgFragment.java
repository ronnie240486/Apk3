package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class GroupDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.ImageButton btn_back;
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModelList;
    public com.flextv.livestore.view.LiveVerticalGridView category_list;
    public int category_pos;
    public com.flextv.livestore.dlgfragment.GroupDlgFragment.onSelectCategoryListener listener;
    public com.flextv.livestore.adapter.MyGroupRecyclerAdapter myGroupRecyclerAdapter;
    public android.widget.TextView txt_add;
    public com.flextv.livestore.models.WordModels wordModels;


    /* JADX INFO: loaded from: classes2.dex */
    public interface onSelectCategoryListener {
        void onSelectCategory(int r1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sRE_NL05jNyDODkYHnL75mN9iQs(com.flextv.livestore.dlgfragment.GroupDlgFragment r0, com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$yarHQIKLWvhKK32jxe15WcwP3hg(com.flextv.livestore.dlgfragment.GroupDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$0(r1)
            return
    }

    public GroupDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.category_pos = r0
            return
    }

    private /* synthetic */ void lambda$onCreateView$0(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$1(com.flextv.livestore.models.CategoryModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L12
            com.flextv.livestore.dlgfragment.GroupDlgFragment$onSelectCategoryListener r1 = r0.listener
            int r2 = r2.intValue()
            r1.onSelectCategory(r2)
            r0.dismiss()
        L12:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.GroupDlgFragment newInstance(java.util.List<com.flextv.livestore.models.CategoryModel> r1, int r2) {
            com.flextv.livestore.dlgfragment.GroupDlgFragment r0 = new com.flextv.livestore.dlgfragment.GroupDlgFragment
            r0.<init>()
            r0.categoryModelList = r1
            r0.category_pos = r2
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
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            r6 = 2131624031(0x7f0e005f, float:1.887523E38)
            android.view.View r4 = r4.inflate(r6, r5)
            android.content.Context r5 = r3.getContext()
            com.flextv.livestore.models.WordModels r5 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r3.wordModels = r5
            r5 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r3.btn_back = r5
            r5 = 2131428279(0x7f0b03b7, float:1.8478198E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.txt_add = r5
            android.widget.ImageButton r5 = r3.btn_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r0 = 9
            r6.<init>(r3, r0)
            r5.setOnClickListener(r6)
            r5 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r5 = r4.findViewById(r5)
            com.flextv.livestore.view.LiveVerticalGridView r5 = (com.flextv.livestore.view.LiveVerticalGridView) r5
            r3.category_list = r5
            android.widget.TextView r5 = r3.txt_add
            com.flextv.livestore.models.WordModels r6 = r3.wordModels
            java.lang.String r6 = r6.getStr_my_group()
            r5.setText(r6)
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter r5 = new com.flextv.livestore.adapter.MyGroupRecyclerAdapter
            android.content.Context r6 = r3.getContext()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r3.categoryModelList
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r2 = 10
            r1.<init>(r3, r2)
            r5.<init>(r6, r0, r1)
            r3.myGroupRecyclerAdapter = r5
            android.content.Context r5 = r3.getContext()
            boolean r5 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            if (r5 == 0) goto L8f
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            int r6 = r3.category_pos
            r5.setSelectedPosition(r6)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            r6 = 1
            r5.setNumColumns(r6)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            r0 = 0
            r5.setLoop(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            r5.setPreserveFocusAfterLayout(r6)
            android.view.View[] r5 = new android.view.View[r6]
            r6 = 0
            r5[r0] = r6
            com.flextv.livestore.view.LiveVerticalGridView r6 = r3.category_list
            com.flextv.livestore.dlgfragment.GroupDlgFragment$1 r0 = new com.flextv.livestore.dlgfragment.GroupDlgFragment$1
            r0.<init>(r5)
            r6.setOnChildViewHolderSelectedListener(r0)
            goto L9d
        L8f:
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r3.getContext()
            r6.<init>(r0)
            r5.setLayoutManager(r6)
        L9d:
            com.flextv.livestore.view.LiveVerticalGridView r5 = r3.category_list
            com.flextv.livestore.adapter.MyGroupRecyclerAdapter r6 = r3.myGroupRecyclerAdapter
            r5.setAdapter(r6)
            return r4
    }

    public void setOnSelectCategoryListener(com.flextv.livestore.dlgfragment.GroupDlgFragment.onSelectCategoryListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
