package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectDlgFragment extends androidx.fragment.app.DialogFragment {
    public eightbitlab.com.blurview.BlurView blur_view;
    public android.content.Context context;
    public android.widget.ImageButton image_back;
    public java.util.List<com.flextv.livestore.apps.SideMenu> list;
    public java.lang.String portal_name;
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    public com.flextv.livestore.dlgfragment.ConnectDlgFragment.SelectList selectListener;
    public com.flextv.livestore.models.WordModels wordModels;

    /* JADX INFO: loaded from: classes.dex */
    public interface SelectList {
        void onSelect(int r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$fNIdRHbZ7ildvcBYJYOv6P-bTW8, reason: not valid java name */
    public static /* synthetic */ void m125$r8$lambda$fNIdRHbZ7ildvcBYJYOv6PbTW8(com.flextv.livestore.dlgfragment.ConnectDlgFragment r0, android.view.View r1) {
            r0.lambda$onCreateView$1(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v6FfRZYiATCrgzRjn0cUuBGSWnk(com.flextv.livestore.dlgfragment.ConnectDlgFragment r0, com.flextv.livestore.apps.SideMenu r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2, r3)
            return r0
    }

    public ConnectDlgFragment() {
            r1 = this;
            r1.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(com.flextv.livestore.apps.SideMenu r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            r0.dismiss()
            com.flextv.livestore.dlgfragment.ConnectDlgFragment$SelectList r1 = r0.selectListener
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

    public static com.flextv.livestore.dlgfragment.ConnectDlgFragment newInstance(android.content.Context r1, java.lang.String r2) {
            com.flextv.livestore.dlgfragment.ConnectDlgFragment r0 = new com.flextv.livestore.dlgfragment.ConnectDlgFragment
            r0.<init>()
            r0.context = r1
            r0.portal_name = r2
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
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            r7 = 2131624026(0x7f0e005a, float:1.887522E38)
            android.view.View r5 = r5.inflate(r7, r6)
            android.content.Context r6 = r4.context
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r4.wordModels = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.list = r6
            com.flextv.livestore.apps.SideMenu r7 = new com.flextv.livestore.apps.SideMenu
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getConnect()
            r1 = 0
            r7.<init>(r0, r1, r1)
            r6.add(r7)
            java.util.List<com.flextv.livestore.apps.SideMenu> r6 = r4.list
            com.flextv.livestore.apps.SideMenu r7 = new com.flextv.livestore.apps.SideMenu
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getEdit()
            r2 = 1
            r7.<init>(r0, r2, r1)
            r6.add(r7)
            java.util.List<com.flextv.livestore.apps.SideMenu> r6 = r4.list
            com.flextv.livestore.apps.SideMenu r7 = new com.flextv.livestore.apps.SideMenu
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getDelete()
            r3 = 2
            r7.<init>(r0, r3, r1)
            r6.add(r7)
            r6 = 2131428332(0x7f0b03ec, float:1.8478305E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r4.portal_name
            r6.setText(r7)
            r6 = 2131428084(0x7f0b02f4, float:1.8477802E38)
            android.view.View r6 = r5.findViewById(r6)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r4.recyclerView = r6
            r6 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r4.image_back = r6
            r6 = 2131427442(0x7f0b0072, float:1.84765E38)
            android.view.View r6 = r5.findViewById(r6)
            eightbitlab.com.blurview.BlurView r6 = (eightbitlab.com.blurview.BlurView) r6
            r4.blur_view = r6
            androidx.fragment.app.FragmentActivity r6 = r4.getActivity()
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            r7 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r7 = r6.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.graphics.drawable.Drawable r6 = r6.getBackground()
            eightbitlab.com.blurview.BlurView r0 = r4.blur_view
            eightbitlab.com.blurview.BlurViewFacade r7 = r0.setupWith(r7)
            eightbitlab.com.blurview.BlurViewFacade r6 = r7.setFrameClearDrawable(r6)
            eightbitlab.com.blurview.RenderScriptBlur r7 = new eightbitlab.com.blurview.RenderScriptBlur
            android.content.Context r0 = r4.getContext()
            r7.<init>(r0)
            eightbitlab.com.blurview.BlurViewFacade r6 = r6.setBlurAlgorithm(r7)
            r7 = 1101004800(0x41a00000, float:20.0)
            eightbitlab.com.blurview.BlurViewFacade r6 = r6.setBlurRadius(r7)
            eightbitlab.com.blurview.BlurViewFacade r6 = r6.setBlurAutoUpdate(r2)
            r6.setHasFixedTransformationMatrix(r2)
            com.flextv.livestore.adapter.ConnectPlaylistAdapter r6 = new com.flextv.livestore.adapter.ConnectPlaylistAdapter
            android.content.Context r7 = r4.getContext()
            java.util.List<com.flextv.livestore.apps.SideMenu> r0 = r4.list
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r1 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r2 = 9
            r1.<init>(r4, r2)
            r6.<init>(r7, r0, r1)
            androidx.recyclerview.widget.RecyclerView r7 = r4.recyclerView
            r7.setAdapter(r6)
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerView
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r4.requireContext()
            r7.<init>(r0)
            r6.setLayoutManager(r7)
            android.widget.ImageButton r6 = r4.image_back
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r7 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r0 = 8
            r7.<init>(r4, r0)
            r6.setOnClickListener(r7)
            return r5
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            return
    }

    public void setSelectListener(com.flextv.livestore.dlgfragment.ConnectDlgFragment.SelectList r1) {
            r0 = this;
            r0.selectListener = r1
            return
    }
}
