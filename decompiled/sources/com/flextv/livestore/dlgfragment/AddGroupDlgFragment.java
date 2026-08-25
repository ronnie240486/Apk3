package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes3.dex */
public class AddGroupDlgFragment extends androidx.fragment.app.DialogFragment {
    public android.widget.ImageButton btn_back;
    public android.widget.Button btn_ok;
    public boolean is_rename;
    public com.flextv.livestore.dlgfragment.AddGroupDlgFragment.OnAddedGroupListener listener;
    public java.util.List<java.lang.String> myGroupNames;
    public java.lang.String originalName;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public android.widget.TextView txt_add;
    public android.widget.EditText txt_name;
    public android.widget.TextView txt_pick_name;
    public com.flextv.livestore.models.WordModels wordModels;

    public interface OnAddedGroupListener {
        void onAddedGroup(java.lang.String r1);
    }

    public static /* synthetic */ void $r8$lambda$7hXNzL2hLXX_gGuAtAX6S2T0NZQ(com.flextv.livestore.dlgfragment.AddGroupDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$nfxt9tPoPuf0RvvwumTgVIu2B00(com.flextv.livestore.dlgfragment.AddGroupDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public AddGroupDlgFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.myGroupNames = r0
            r0 = 0
            r1.is_rename = r0
            return
    }

    private void addGroupToModel() {
            r3 = this;
            android.widget.EditText r0 = r3.txt_name
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            android.widget.EditText r0 = r3.txt_name
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.util.List<java.lang.String> r1 = r3.myGroupNames
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L39
            android.content.Context r0 = r3.getContext()
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getStr_contain_this_name()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L4a
        L39:
            java.util.List<java.lang.String> r1 = r3.myGroupNames
            r1.add(r0)
            com.flextv.livestore.helper.PreferenceHelper r1 = r3.preferenceHelper
            java.util.List<java.lang.String> r2 = r3.myGroupNames
            r1.setSharedPreferenceMyGroupCategory(r2)
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment$OnAddedGroupListener r1 = r3.listener
            r1.onAddedGroup(r0)
        L4a:
            return
    }

    private void initView(android.view.View r2) {
            r1 = this;
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.btn_back = r0
            r0 = 2131428279(0x7f0b03b7, float:1.8478198E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_add = r0
            r0 = 2131428329(0x7f0b03e9, float:1.84783E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.txt_pick_name = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.txt_name = r0
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_ok = r2
            android.widget.TextView r2 = r1.txt_add
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_my_group()
            r2.setText(r0)
            android.widget.TextView r2 = r1.txt_pick_name
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getStr_group_name()
            r2.setText(r0)
            android.widget.Button r2 = r1.btn_ok
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getOk()
            r2.setText(r0)
            return
    }

    private /* synthetic */ void lambda$onCreateView$0(android.view.View r1) {
            r0 = this;
            r0.addGroupToModel()
            return
    }

    private /* synthetic */ void lambda$onCreateView$1(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    public static com.flextv.livestore.dlgfragment.AddGroupDlgFragment newInstance(boolean r1, java.lang.String r2) {
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment r0 = new com.flextv.livestore.dlgfragment.AddGroupDlgFragment
            r0.<init>()
            r0.is_rename = r1
            r0.originalName = r2
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
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            r4 = 2131624023(0x7f0e0057, float:1.8875214E38)
            android.view.View r2 = r2.inflate(r4, r3)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            r1.preferenceHelper = r3
            android.content.Context r3 = r1.getContext()
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            r1.initView(r2)
            boolean r3 = r1.is_rename
            if (r3 == 0) goto L2a
            android.widget.EditText r3 = r1.txt_name
            java.lang.String r4 = r1.originalName
            r3.setText(r4)
        L2a:
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            java.util.List r3 = r3.getSharedPreferenceMyGroupCategory()
            r1.myGroupNames = r3
            android.widget.Button r3 = r1.btn_ok
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.AddGroupDlgFragment$$ExternalSyntheticLambda0
            r0 = 0
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
            android.widget.ImageButton r3 = r1.btn_back
            com.flextv.livestore.dlgfragment.AddGroupDlgFragment$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.dlgfragment.AddGroupDlgFragment$$ExternalSyntheticLambda0
            r0 = 1
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
            android.widget.EditText r3 = r1.txt_name
            r3.requestFocus()
            return r2
    }

    public void setOnAddedGroupListener(com.flextv.livestore.dlgfragment.AddGroupDlgFragment.OnAddedGroupListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
