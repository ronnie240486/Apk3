package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes2.dex */
public class SelectColorDlgFragment extends androidx.fragment.app.DialogFragment {
    public java.lang.String[] backgroundColors;
    public android.content.Context context;
    public boolean is_subtitle_color;
    public com.flextv.livestore.dlgfragment.SelectColorDlgFragment.ChangeColorListener listener;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_colors;
    public int selected_position;
    public java.lang.String[] subtitleColors;
    public android.widget.TextView txt_header;
    public android.widget.TextView txt_subtitle;
    public com.flextv.livestore.models.WordModels wordModels;


    public interface ChangeColorListener {
        void onChangeColor();
    }

    /* JADX INFO: renamed from: $r8$lambda$-TZmCbnC3TY66_8E9h6PiQxOs5E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m141$r8$lambda$TZmCbnC3TY66_8E9h6PiQxOs5E(com.flextv.livestore.dlgfragment.SelectColorDlgFragment r0, java.lang.Integer r1, java.lang.Boolean r2) {
            kotlin.Unit r0 = r0.lambda$onCreateView$0(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$Og5JytxM6gXGhDMvATm6xh4bPN4(com.flextv.livestore.dlgfragment.SelectColorDlgFragment r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$onCreateView$1(r1, r2, r3)
            return r0
    }

    public SelectColorDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.selected_position = r0
            r0 = 1
            r1.is_subtitle_color = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void initView(android.view.View r5) {
            r4 = this;
            r0 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_header = r0
            r0 = 2131428348(0x7f0b03fc, float:1.8478338E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.txt_subtitle = r0
            r0 = 2131428077(0x7f0b02ed, float:1.8477788E38)
            android.view.View r5 = r5.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = (com.flextv.livestore.view.LiveVerticalGridView) r5
            r4.recycler_colors = r5
            android.content.Context r5 = r4.context
            boolean r5 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r5)
            r0 = 5
            r1 = 1
            if (r5 == 0) goto L4b
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_colors
            r5.setNumColumns(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_colors
            r0 = 0
            r5.setLoop(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_colors
            r5.setPreserveFocusAfterLayout(r1)
            android.view.View[] r5 = new android.view.View[r1]
            r1 = 0
            r5[r0] = r1
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_colors
            com.flextv.livestore.dlgfragment.SelectColorDlgFragment$1 r1 = new com.flextv.livestore.dlgfragment.SelectColorDlgFragment$1
            r1.<init>(r5)
            r0.setOnChildViewHolderSelectedListener(r1)
            goto L5c
        L4b:
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_colors
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r3 = r4.context
            r2.<init>(r3, r0)
            r5.setLayoutManager(r2)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_colors
            r5.setHasFixedSize(r1)
        L5c:
            boolean r5 = r4.is_subtitle_color
            if (r5 == 0) goto L6c
            android.widget.TextView r5 = r4.txt_header
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getSubtitel_color()
            r5.setText(r0)
            goto L77
        L6c:
            android.widget.TextView r5 = r4.txt_header
            com.flextv.livestore.models.WordModels r0 = r4.wordModels
            java.lang.String r0 = r0.getSubtitel_background()
            r5.setText(r0)
        L77:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreateView$0(java.lang.Integer r3, java.lang.Boolean r4) {
            r2 = this;
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            int r4 = r3.intValue()
            r2.selected_position = r4
            boolean r4 = r2.is_subtitle_color
            if (r4 == 0) goto L2f
            android.widget.TextView r4 = r2.txt_subtitle
            java.lang.String[] r0 = r2.subtitleColors
            int r1 = r3.intValue()
            r0 = r0[r1]
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            java.lang.String[] r0 = r2.subtitleColors
            int r3 = r3.intValue()
            r3 = r0[r3]
            r4.setSharedPreferenceSubtitleColor(r3)
            goto L4d
        L2f:
            android.widget.TextView r4 = r2.txt_subtitle
            java.lang.String[] r0 = r2.backgroundColors
            int r1 = r3.intValue()
            r0 = r0[r1]
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setBackgroundColor(r0)
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            java.lang.String[] r0 = r2.backgroundColors
            int r3 = r3.intValue()
            r3 = r0[r3]
            r4.setSharedPreferenceSubtitleBgColor(r3)
        L4d:
            r3 = 0
            return r3
    }

    private /* synthetic */ boolean lambda$onCreateView$1(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            if (r1 != 0) goto L12
            int r1 = r3.getKeyCode()
            r2 = 4
            if (r1 != r2) goto L12
            com.flextv.livestore.dlgfragment.SelectColorDlgFragment$ChangeColorListener r1 = r0.listener
            r1.onChangeColor()
        L12:
            r1 = 0
            return r1
    }

    public static com.flextv.livestore.dlgfragment.SelectColorDlgFragment newInstance(android.content.Context r1, boolean r2) {
            com.flextv.livestore.dlgfragment.SelectColorDlgFragment r0 = new com.flextv.livestore.dlgfragment.SelectColorDlgFragment
            r0.<init>()
            r0.context = r1
            r0.is_subtitle_color = r2
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
            r6 = 2131624044(0x7f0e006c, float:1.8875257E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            com.flextv.livestore.helper.PreferenceHelper r5 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r6 = r3.context
            r5.<init>(r6)
            r3.preferenceHelper = r5
            android.content.Context r5 = r3.context
            com.flextv.livestore.models.WordModels r5 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r3.wordModels = r5
            r3.initView(r4)
            android.content.res.Resources r5 = r3.getResources()
            r6 = 2130903042(0x7f030002, float:1.741289E38)
            java.lang.String[] r5 = r5.getStringArray(r6)
            r3.subtitleColors = r5
            android.content.res.Resources r5 = r3.getResources()
            r6 = 2130903041(0x7f030001, float:1.7412889E38)
            java.lang.String[] r5 = r5.getStringArray(r6)
            r3.backgroundColors = r5
            boolean r6 = r3.is_subtitle_color
            if (r6 == 0) goto L45
            android.content.Context r5 = r3.context
            java.lang.String[] r6 = r3.subtitleColors
            int r5 = com.flextv.livestore.helper.GetSharedInfo.getSubtitleColorPosition(r5, r6)
            r3.selected_position = r5
            goto L4d
        L45:
            android.content.Context r6 = r3.context
            int r5 = com.flextv.livestore.helper.GetSharedInfo.getSubtitleBgColorPosition(r6, r5)
            r3.selected_position = r5
        L4d:
            android.widget.TextView r5 = r3.txt_subtitle
            com.flextv.livestore.helper.PreferenceHelper r6 = r3.preferenceHelper
            java.lang.String r6 = r6.getSharedPreferenceSubtitleBgColor()
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setBackgroundColor(r6)
            android.widget.TextView r5 = r3.txt_subtitle
            com.flextv.livestore.helper.PreferenceHelper r6 = r3.preferenceHelper
            java.lang.String r6 = r6.getSharedPreferenceSubtitleColor()
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTextColor(r6)
            android.widget.TextView r5 = r3.txt_subtitle
            r6 = 3
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper
            int r0 = r0.getSharedPreferenceSubtitleSize()
            float r0 = (float) r0
            r5.setTextSize(r6, r0)
            com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter r5 = new com.flextv.livestore.adapter.SubtitleColorRecyclerAdapter
            boolean r6 = r3.is_subtitle_color
            if (r6 == 0) goto L81
            java.lang.String[] r6 = r3.subtitleColors
            goto L83
        L81:
            java.lang.String[] r6 = r3.backgroundColors
        L83:
            int r0 = r3.selected_position
            com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.dlgfragment.EpisodeDlgFragment$$ExternalSyntheticLambda1
            r2 = 7
            r1.<init>(r3, r2)
            r5.<init>(r6, r0, r1)
            com.flextv.livestore.view.LiveVerticalGridView r6 = r3.recycler_colors
            r6.setAdapter(r5)
            android.app.Dialog r5 = r3.getDialog()
            com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0 r6 = new com.flextv.livestore.dlgfragment.ExitDlgFragment$$ExternalSyntheticLambda0
            r0 = 10
            r6.<init>(r3, r0)
            r5.setOnKeyListener(r6)
            return r4
    }

    public void setOnChangeColorListener(com.flextv.livestore.dlgfragment.SelectColorDlgFragment.ChangeColorListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
