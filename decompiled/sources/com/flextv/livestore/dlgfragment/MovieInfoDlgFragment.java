package com.flextv.livestore.dlgfragment;

/* JADX INFO: loaded from: classes.dex */
public class MovieInfoDlgFragment extends androidx.fragment.app.DialogFragment {
    public java.lang.String description;
    public android.widget.ImageView image_logo;
    public com.makeramen.roundedimageview.RoundedImageView image_movie;
    public java.lang.String image_url;
    public java.lang.String name;
    public java.lang.String resolution;
    public android.widget.TextView txt_description;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_resolution;

    public static /* synthetic */ void $r8$lambda$tteMarqNprJr5HudZGl5qdbxPSw(com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r0, android.view.View r1) {
            r0.lambda$initView$0(r1)
            return
    }

    public MovieInfoDlgFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private void initView(android.view.View r3) {
            r2 = this;
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_name = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_description = r0
            r0 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.txt_resolution = r0
            r0 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.image_logo = r0
            r0 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.View r0 = r3.findViewById(r0)
            com.makeramen.roundedimageview.RoundedImageView r0 = (com.makeramen.roundedimageview.RoundedImageView) r0
            r2.image_movie = r0
            r0 = 2131428377(0x7f0b0419, float:1.8478397E38)
            android.view.View r3 = r3.findViewById(r0)
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r1 = 11
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void lambda$initView$0(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    public static com.flextv.livestore.dlgfragment.MovieInfoDlgFragment newInstance(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r0 = new com.flextv.livestore.dlgfragment.MovieInfoDlgFragment
            r0.<init>()
            r0.name = r1
            r0.description = r2
            r0.image_url = r3
            r0.resolution = r4
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
            r6 = 2131624007(0x7f0e0047, float:1.8875182E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            r3.initView(r4)
            android.widget.TextView r5 = r3.txt_name
            java.lang.String r6 = r3.name
            r5.setText(r6)
            android.widget.TextView r5 = r3.txt_description
            java.lang.String r6 = r3.description
            r5.setText(r6)
            android.widget.TextView r5 = r3.txt_resolution
            java.lang.String r6 = r3.resolution
            r5.setText(r6)
            android.content.Context r5 = r3.getContext()
            com.makeramen.roundedimageview.RoundedImageView r6 = r3.image_movie
            java.lang.String r0 = r3.image_url
            android.widget.ImageView r1 = r3.image_logo
            r2 = 2131230889(0x7f0800a9, float:1.8077844E38)
            com.flextv.livestore.utils.ImageLoaderJava.imageLoadUrlWithVodHolder(r5, r6, r0, r2, r1)
            return r4
    }
}
