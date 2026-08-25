package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class RenameGroupDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.ImageButton btn_back;
    public androidx.recyclerview.widget.RecyclerView recycler_rename;
    public java.util.List<com.flextv.livestore.apps.SideMenu> renameLists;
    public com.flextv.livestore.dlgfragment.RenameGroupDlgFragment.SelectList selectListener;
    public android.widget.TextView txt_name;
    public com.flextv.livestore.models.WordModels wordModels;

    public interface SelectList {
        void onSelect(int r1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1ftwaUADSrdcEOmXHhDQE5thhHs(com.flextv.livestore.dlgfragment.RenameGroupDlgFragment r0, com.flextv.livestore.apps.SideMenu r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$sDpcl9hqALD6xOE2fqnu7FaPSrI(com.flextv.livestore.dlgfragment.RenameGroupDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public RenameGroupDlgFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(com.flextv.livestore.apps.SideMenu r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            r0.dismiss()
            com.flextv.livestore.dlgfragment.RenameGroupDlgFragment$SelectList r1 = r0.selectListener
            int r2 = r2.intValue()
            r1.onSelect(r2)
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$onCreateView$1(android.view.View r1) {
            r0 = this;
            r0.dismiss()
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
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            r6 = 2131624041(0x7f0e0069, float:1.887525E38)
            android.view.View r4 = r4.inflate(r6, r5)
            r5 = 2131428084(0x7f0b02f4, float:1.8477802E38)
            android.view.View r5 = r4.findViewById(r5)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r3.recycler_rename = r5
            r5 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r3.btn_back = r5
            r5 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.txt_name = r5
            com.flextv.livestore.helper.PreferenceHelper r5 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6)
            android.content.Context r5 = r3.getContext()
            com.flextv.livestore.models.WordModels r5 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r3.wordModels = r5
            android.widget.TextView r6 = r3.txt_name
            java.lang.String r5 = r5.getChange_my_group()
            r6.setText(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.renameLists = r5
            com.flextv.livestore.apps.SideMenu r6 = new com.flextv.livestore.apps.SideMenu
            com.flextv.livestore.models.WordModels r0 = r3.wordModels
            java.lang.String r0 = r0.getRename()
            r1 = 0
            r6.<init>(r0, r1, r1)
            r5.add(r6)
            java.util.List<com.flextv.livestore.apps.SideMenu> r5 = r3.renameLists
            com.flextv.livestore.apps.SideMenu r6 = new com.flextv.livestore.apps.SideMenu
            com.flextv.livestore.models.WordModels r0 = r3.wordModels
            java.lang.String r0 = r0.getStr_delete()
            r1 = 1
            r6.<init>(r0, r1, r1)
            r5.add(r6)
            com.flextv.livestore.adapter.ConnectPlaylistAdapter r5 = new com.flextv.livestore.adapter.ConnectPlaylistAdapter
            android.content.Context r6 = r3.getContext()
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r3.renameLists
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r2 = 11
            r1.<init>(r3, r2)
            r5.<init>(r6, r0, r1)
            androidx.recyclerview.widget.RecyclerView r6 = r3.recycler_rename
            r6.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r3.recycler_rename
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r3.requireContext()
            r6.<init>(r0)
            r5.setLayoutManager(r6)
            android.widget.ImageButton r5 = r3.btn_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r0 = 13
            r6.<init>(r3, r0)
            r5.setOnClickListener(r6)
            return r4
    }

    public void setSelectListener(com.flextv.livestore.dlgfragment.RenameGroupDlgFragment.SelectList r1) {
            r0 = this;
            r0.selectListener = r1
            return
    }
}
