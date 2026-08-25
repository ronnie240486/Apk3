package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class GuidanceStylist implements androidx.leanback.widget.FragmentAnimationProvider {
    private android.widget.TextView mBreadcrumbView;
    private android.widget.TextView mDescriptionView;
    private android.view.View mGuidanceContainer;
    private android.widget.ImageView mIconView;
    private android.widget.TextView mTitleView;

    /* JADX INFO: loaded from: classes.dex */
    public static class Guidance {
        private final java.lang.String mBreadcrumb;
        private final java.lang.String mDescription;
        private final android.graphics.drawable.Drawable mIconDrawable;
        private final java.lang.String mTitle;

        public Guidance(java.lang.String r1, java.lang.String r2, java.lang.String r3, android.graphics.drawable.Drawable r4) {
                r0 = this;
                r0.<init>()
                r0.mBreadcrumb = r3
                r0.mTitle = r1
                r0.mDescription = r2
                r0.mIconDrawable = r4
                return
        }

        public java.lang.String getBreadcrumb() {
                r1 = this;
                java.lang.String r0 = r1.mBreadcrumb
                return r0
        }

        public java.lang.String getDescription() {
                r1 = this;
                java.lang.String r0 = r1.mDescription
                return r0
        }

        public android.graphics.drawable.Drawable getIconDrawable() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mIconDrawable
                return r0
        }

        public java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.mTitle
                return r0
        }
    }

    public GuidanceStylist() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.widget.TextView getBreadcrumbView() {
            r1 = this;
            android.widget.TextView r0 = r1.mBreadcrumbView
            return r0
    }

    public android.widget.TextView getDescriptionView() {
            r1 = this;
            android.widget.TextView r0 = r1.mDescriptionView
            return r0
    }

    public android.widget.ImageView getIconView() {
            r1 = this;
            android.widget.ImageView r0 = r1.mIconView
            return r0
    }

    public android.widget.TextView getTitleView() {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleView
            return r0
    }

    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, androidx.leanback.widget.GuidanceStylist.Guidance r5) {
            r2 = this;
            int r0 = r2.onProvideLayoutId()
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            int r4 = androidx.leanback.R.id.guidance_title
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.mTitleView = r4
            int r4 = androidx.leanback.R.id.guidance_breadcrumb
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.mBreadcrumbView = r4
            int r4 = androidx.leanback.R.id.guidance_description
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.mDescriptionView = r4
            int r4 = androidx.leanback.R.id.guidance_icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mIconView = r4
            int r4 = androidx.leanback.R.id.guidance_container
            android.view.View r4 = r3.findViewById(r4)
            r2.mGuidanceContainer = r4
            android.widget.TextView r4 = r2.mTitleView
            if (r4 == 0) goto L44
            java.lang.String r0 = r5.getTitle()
            r4.setText(r0)
        L44:
            android.widget.TextView r4 = r2.mBreadcrumbView
            if (r4 == 0) goto L4f
            java.lang.String r0 = r5.getBreadcrumb()
            r4.setText(r0)
        L4f:
            android.widget.TextView r4 = r2.mDescriptionView
            if (r4 == 0) goto L5a
            java.lang.String r0 = r5.getDescription()
            r4.setText(r0)
        L5a:
            android.widget.ImageView r4 = r2.mIconView
            if (r4 == 0) goto L75
            android.graphics.drawable.Drawable r4 = r5.getIconDrawable()
            if (r4 == 0) goto L6e
            android.widget.ImageView r4 = r2.mIconView
            android.graphics.drawable.Drawable r0 = r5.getIconDrawable()
            r4.setImageDrawable(r0)
            goto L75
        L6e:
            android.widget.ImageView r4 = r2.mIconView
            r0 = 8
            r4.setVisibility(r0)
        L75:
            android.view.View r4 = r2.mGuidanceContainer
            if (r4 == 0) goto Lcb
            java.lang.CharSequence r4 = r4.getContentDescription()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Lcb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r5.getBreadcrumb()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 10
            if (r0 != 0) goto L9e
            java.lang.String r0 = r5.getBreadcrumb()
            r4.append(r0)
            r4.append(r1)
        L9e:
            java.lang.String r0 = r5.getTitle()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = r5.getTitle()
            r4.append(r0)
            r4.append(r1)
        Lb2:
            java.lang.String r0 = r5.getDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc6
            java.lang.String r5 = r5.getDescription()
            r4.append(r5)
            r4.append(r1)
        Lc6:
            android.view.View r5 = r2.mGuidanceContainer
            r5.setContentDescription(r4)
        Lcb:
            return r3
    }

    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.mBreadcrumbView = r0
            r1.mDescriptionView = r0
            r1.mIconView = r0
            r1.mTitleView = r0
            return
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeAppearing(@androidx.annotation.NonNull java.util.List<android.animation.Animator> r1) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeDisappearing(@androidx.annotation.NonNull java.util.List<android.animation.Animator> r1) {
            r0 = this;
            return
    }

    public int onProvideLayoutId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_guidance
            return r0
    }
}
