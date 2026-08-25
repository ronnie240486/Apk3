package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleSettingDlgFragment extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public android.widget.ImageButton btn_minus;
    public android.widget.ImageButton btn_plus;
    public android.content.Context context;
    public android.widget.ImageView image_background_color;
    public android.widget.ImageView image_subtitle_color;
    public boolean is_enable;
    public androidx.constraintlayout.widget.ConstraintLayout ly_bg_color;
    public androidx.constraintlayout.widget.ConstraintLayout ly_color;
    public androidx.constraintlayout.widget.ConstraintLayout ly_enable;
    public int max_size;
    public int min_size;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.dlgfragment.SelectColorDlgFragment selectColorDlgFragment;
    public int step;
    public android.widget.TextView str_bg_color;
    public android.widget.TextView str_enable;
    public android.widget.TextView str_subtitle_size;
    public android.widget.TextView str_text_color;
    public int subtitle_size;
    public androidx.appcompat.widget.SwitchCompat switch_subtitle;
    public android.widget.TextView txt_header;
    public android.widget.TextView txt_subtitle_size;
    public com.flextv.livestore.models.WordModels wordModels;

    public static /* synthetic */ void $r8$lambda$fYkze2Zf1bZ3K4c7k7kANToQPL4(com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment r0) {
            r0.lambda$showSelectColorDlgFragment$0()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment> r0 = com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment.class
            return
    }

    public SubtitleSettingDlgFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.is_enable = r0
            r0 = 5
            r1.step = r0
            r0 = 12
            r1.min_size = r0
            r0 = 60
            r1.max_size = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r1.wordModels = r0
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428312(0x7f0b03d8, float:1.8478265E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_header = r0
            r0 = 2131428191(0x7f0b035f, float:1.847802E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_enable = r0
            r0 = 2131428211(0x7f0b0373, float:1.847806E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_subtitle_size = r0
            r0 = 2131428212(0x7f0b0374, float:1.8478062E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_text_color = r0
            r0 = 2131428183(0x7f0b0357, float:1.8478003E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.str_bg_color = r0
            r0 = 2131428349(0x7f0b03fd, float:1.847834E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_subtitle_size = r0
            r0 = 2131427902(0x7f0b023e, float:1.8477433E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.ly_enable = r0
            r0 = 2131427926(0x7f0b0256, float:1.8477482E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.ly_color = r0
            r0 = 2131427892(0x7f0b0234, float:1.8477413E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.ly_bg_color = r0
            r0 = 2131427476(0x7f0b0094, float:1.847657E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.btn_minus = r0
            r0 = 2131427481(0x7f0b0099, float:1.847658E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.btn_plus = r0
            r0 = 2131427819(0x7f0b01eb, float:1.8477265E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.image_subtitle_color = r0
            r0 = 2131427782(0x7f0b01c6, float:1.847719E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.image_background_color = r0
            r0 = 2131428223(0x7f0b037f, float:1.8478084E38)
            android.view.View r3 = r3.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r3 = (androidx.appcompat.widget.SwitchCompat) r3
            r2.switch_subtitle = r3
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_enable
            r3.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_color
            r3.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_bg_color
            r3.setOnClickListener(r2)
            android.widget.ImageButton r3 = r2.btn_minus
            r3.setOnClickListener(r2)
            android.widget.ImageButton r3 = r2.btn_plus
            r3.setOnClickListener(r2)
            android.widget.TextView r3 = r2.str_subtitle_size
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSubtitel_size()
            r3.setText(r0)
            android.widget.TextView r3 = r2.txt_header
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSubtitle_settings()
            r3.setText(r0)
            android.widget.TextView r3 = r2.str_enable
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getEnable_subtitles()
            r3.setText(r0)
            android.widget.TextView r3 = r2.str_text_color
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSubtitel_color()
            r3.setText(r0)
            android.widget.TextView r3 = r2.str_bg_color
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getSubtitel_background()
            r3.setText(r0)
            android.widget.TextView r3 = r2.txt_subtitle_size
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.subtitle_size
            r0.append(r1)
            java.lang.String r1 = "pt"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            androidx.appcompat.widget.SwitchCompat r3 = r2.switch_subtitle
            boolean r0 = r2.is_enable
            r3.setChecked(r0)
            android.widget.ImageView r3 = r2.image_subtitle_color
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceSubtitleColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setBackgroundColor(r0)
            android.widget.ImageView r3 = r2.image_background_color
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceSubtitleBgColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setBackgroundColor(r0)
            return
    }

    private /* synthetic */ void lambda$showSelectColorDlgFragment$0() {
            r2 = this;
            android.widget.ImageView r0 = r2.image_subtitle_color
            com.flextv.livestore.helper.PreferenceHelper r1 = r2.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            android.widget.ImageView r0 = r2.image_background_color
            com.flextv.livestore.helper.PreferenceHelper r1 = r2.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleBgColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            return
    }

    public static com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment newInstance(android.content.Context r1) {
            com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment r0 = new com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment
            r0.<init>()
            r0.context = r1
            return r0
    }

    private void showSelectColorDlgFragment(boolean r5) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_subtitle_color"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            android.content.Context r1 = r4.getContext()
            com.flextv.livestore.dlgfragment.SelectColorDlgFragment r5 = com.flextv.livestore.dlgfragment.SelectColorDlgFragment.newInstance(r1, r5)
            r4.selectColorDlgFragment = r5
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r3 = 7
            r1.<init>(r4, r3)
            r5.setOnChangeColorListener(r1)
            com.flextv.livestore.dlgfragment.SelectColorDlgFragment r5 = r4.selectColorDlgFragment
            r5.show(r0, r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            java.lang.String r0 = "pt"
            r1 = 1
            switch(r4) {
                case 2131427476: goto L51;
                case 2131427481: goto L27;
                case 2131427892: goto L22;
                case 2131427902: goto L10;
                case 2131427926: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L7a
        Lc:
            r3.showSelectColorDlgFragment(r1)
            goto L7a
        L10:
            boolean r4 = r3.is_enable
            r4 = r4 ^ r1
            r3.is_enable = r4
            androidx.appcompat.widget.SwitchCompat r0 = r3.switch_subtitle
            r0.setChecked(r4)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            boolean r0 = r3.is_enable
            r4.setSharedPreferenceSubtitleEnable(r0)
            goto L7a
        L22:
            r4 = 0
            r3.showSelectColorDlgFragment(r4)
            goto L7a
        L27:
            int r4 = r3.subtitle_size
            int r1 = r3.max_size
            int r2 = r3.step
            int r1 = r1 - r2
            if (r4 >= r1) goto L7a
            int r4 = r4 + r2
            r3.subtitle_size = r4
            android.widget.TextView r4 = r3.txt_subtitle_size
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.subtitle_size
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.setText(r0)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            int r0 = r3.subtitle_size
            r4.setSharedPreferenceSubtitleSize(r0)
            goto L7a
        L51:
            int r4 = r3.subtitle_size
            int r1 = r3.min_size
            int r2 = r3.step
            int r1 = r1 + r2
            if (r4 <= r1) goto L7a
            int r4 = r4 - r2
            r3.subtitle_size = r4
            android.widget.TextView r4 = r3.txt_subtitle_size
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.subtitle_size
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.setText(r0)
            com.flextv.livestore.helper.PreferenceHelper r4 = r3.preferenceHelper
            int r0 = r3.subtitle_size
            r4.setSharedPreferenceSubtitleSize(r0)
        L7a:
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
            r4 = 2131624045(0x7f0e006d, float:1.8875259E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            com.flextv.livestore.helper.PreferenceHelper r3 = new com.flextv.livestore.helper.PreferenceHelper
            android.content.Context r4 = r1.context
            r3.<init>(r4)
            r1.preferenceHelper = r3
            android.content.Context r3 = r1.context
            com.flextv.livestore.models.WordModels r3 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r3)
            r1.wordModels = r3
            android.content.Context r3 = r1.context
            boolean r3 = com.flextv.livestore.helper.GetSharedInfo.isTVDevice(r3)
            if (r3 == 0) goto L2d
            r3 = 5
            r1.step = r3
            r3 = 12
            r1.min_size = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.max_size = r3
            goto L37
        L2d:
            r3 = 2
            r1.step = r3
            r3 = 6
            r1.min_size = r3
            r3 = 48
            r1.max_size = r3
        L37:
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            int r3 = r3.getSharedPreferenceSubtitleSize()
            r1.subtitle_size = r3
            com.flextv.livestore.helper.PreferenceHelper r3 = r1.preferenceHelper
            boolean r3 = r3.getSharedPreferenceSubtitleEnable()
            r1.is_enable = r3
            r1.initView(r2)
            return r2
    }
}
