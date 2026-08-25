package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrandedFragment extends android.app.Fragment {
    private static final java.lang.String TITLE_SHOW = "titleShow";
    private android.graphics.drawable.Drawable mBadgeDrawable;
    private android.view.View.OnClickListener mExternalOnSearchClickedListener;
    private boolean mSearchAffordanceColorSet;
    private androidx.leanback.widget.SearchOrbView.Colors mSearchAffordanceColors;
    private boolean mShowingTitle;
    private java.lang.CharSequence mTitle;
    private androidx.leanback.widget.TitleHelper mTitleHelper;
    private android.view.View mTitleView;
    private androidx.leanback.widget.TitleViewAdapter mTitleViewAdapter;

    public BrandedFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowingTitle = r0
            return
    }

    public android.graphics.drawable.Drawable getBadgeDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBadgeDrawable
            return r0
    }

    public int getSearchAffordanceColor() {
            r1 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = r1.getSearchAffordanceColors()
            int r0 = r0.color
            return r0
    }

    public androidx.leanback.widget.SearchOrbView.Colors getSearchAffordanceColors() {
            r2 = this;
            boolean r0 = r2.mSearchAffordanceColorSet
            if (r0 == 0) goto L7
            androidx.leanback.widget.SearchOrbView$Colors r0 = r2.mSearchAffordanceColors
            return r0
        L7:
            androidx.leanback.widget.TitleViewAdapter r0 = r2.mTitleViewAdapter
            if (r0 == 0) goto L10
            androidx.leanback.widget.SearchOrbView$Colors r0 = r0.getSearchAffordanceColors()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment views not yet created"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public final androidx.leanback.widget.TitleHelper getTitleHelper() {
            r1 = this;
            androidx.leanback.widget.TitleHelper r0 = r1.mTitleHelper
            return r0
    }

    public android.view.View getTitleView() {
            r1 = this;
            android.view.View r0 = r1.mTitleView
            return r0
    }

    public androidx.leanback.widget.TitleViewAdapter getTitleViewAdapter() {
            r1 = this;
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            return r0
    }

    public void installTitleView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            android.view.View r1 = r0.onInflateTitleView(r1, r2, r3)
            if (r1 == 0) goto L13
            r2.addView(r1)
            int r2 = androidx.leanback.R.id.browse_title_group
            android.view.View r1 = r1.findViewById(r2)
            r0.setTitleView(r1)
            goto L17
        L13:
            r1 = 0
            r0.setTitleView(r1)
        L17:
            return
    }

    public final boolean isShowingTitle() {
            r1 = this;
            boolean r0 = r1.mShowingTitle
            return r0
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
            r1 = this;
            super.onDestroyView()
            r0 = 0
            r1.mTitleHelper = r0
            return
    }

    public android.view.View onInflateTitleView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r1 = androidx.leanback.R.attr.browseTitleViewLayout
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r6, r2)
            if (r0 == 0) goto L19
            int r6 = r6.resourceId
            goto L1b
        L19:
            int r6 = androidx.leanback.R.layout.lb_browse_title
        L1b:
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            return r4
    }

    @Override // android.app.Fragment
    public void onPause() {
            r2 = this;
            androidx.leanback.widget.TitleViewAdapter r0 = r2.mTitleViewAdapter
            if (r0 == 0) goto L8
            r1 = 0
            r0.setAnimationEnabled(r1)
        L8:
            super.onPause()
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r2 = this;
            super.onResume()
            androidx.leanback.widget.TitleViewAdapter r0 = r2.mTitleViewAdapter
            if (r0 == 0) goto Lb
            r1 = 1
            r0.setAnimationEnabled(r1)
        Lb:
            return
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            boolean r0 = r2.mShowingTitle
            java.lang.String r1 = "titleShow"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r2 = this;
            super.onStart()
            androidx.leanback.widget.TitleViewAdapter r0 = r2.mTitleViewAdapter
            if (r0 == 0) goto L12
            boolean r0 = r2.mShowingTitle
            r2.showTitle(r0)
            androidx.leanback.widget.TitleViewAdapter r0 = r2.mTitleViewAdapter
            r1 = 1
            r0.setAnimationEnabled(r1)
        L12:
            return
    }

    @Override // android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            super.onViewCreated(r2, r3)
            if (r3 == 0) goto Le
            java.lang.String r0 = "titleShow"
            boolean r3 = r3.getBoolean(r0)
            r1.mShowingTitle = r3
        Le:
            android.view.View r3 = r1.mTitleView
            if (r3 == 0) goto L24
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            androidx.leanback.widget.TitleHelper r0 = new androidx.leanback.widget.TitleHelper
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.<init>(r2, r3)
            r1.mTitleHelper = r0
            boolean r2 = r1.mShowingTitle
            r0.showTitle(r2)
        L24:
            return
    }

    public void setBadgeDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBadgeDrawable
            if (r0 == r2) goto Ld
            r1.mBadgeDrawable = r2
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            if (r0 == 0) goto Ld
            r0.setBadgeDrawable(r2)
        Ld:
            return
    }

    public void setOnSearchClickedListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.mExternalOnSearchClickedListener = r2
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            if (r0 == 0) goto L9
            r0.setOnSearchClickedListener(r2)
        L9:
            return
    }

    public void setSearchAffordanceColor(int r2) {
            r1 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = new androidx.leanback.widget.SearchOrbView$Colors
            r0.<init>(r2)
            r1.setSearchAffordanceColors(r0)
            return
    }

    public void setSearchAffordanceColors(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            r1.mSearchAffordanceColors = r2
            r0 = 1
            r1.mSearchAffordanceColorSet = r0
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            if (r0 == 0) goto Lc
            r0.setSearchAffordanceColors(r2)
        Lc:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            if (r0 == 0) goto L9
            r0.setTitle(r2)
        L9:
            return
    }

    public void setTitleView(android.view.View r3) {
            r2 = this;
            r2.mTitleView = r3
            if (r3 != 0) goto La
            r3 = 0
            r2.mTitleViewAdapter = r3
            r2.mTitleHelper = r3
            goto L47
        La:
            androidx.leanback.widget.TitleViewAdapter$Provider r3 = (androidx.leanback.widget.TitleViewAdapter.Provider) r3
            androidx.leanback.widget.TitleViewAdapter r3 = r3.getTitleViewAdapter()
            r2.mTitleViewAdapter = r3
            java.lang.CharSequence r0 = r2.mTitle
            r3.setTitle(r0)
            androidx.leanback.widget.TitleViewAdapter r3 = r2.mTitleViewAdapter
            android.graphics.drawable.Drawable r0 = r2.mBadgeDrawable
            r3.setBadgeDrawable(r0)
            boolean r3 = r2.mSearchAffordanceColorSet
            if (r3 == 0) goto L29
            androidx.leanback.widget.TitleViewAdapter r3 = r2.mTitleViewAdapter
            androidx.leanback.widget.SearchOrbView$Colors r0 = r2.mSearchAffordanceColors
            r3.setSearchAffordanceColors(r0)
        L29:
            android.view.View$OnClickListener r3 = r2.mExternalOnSearchClickedListener
            if (r3 == 0) goto L30
            r2.setOnSearchClickedListener(r3)
        L30:
            android.view.View r3 = r2.getView()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L47
            androidx.leanback.widget.TitleHelper r3 = new androidx.leanback.widget.TitleHelper
            android.view.View r0 = r2.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r2.mTitleView
            r3.<init>(r0, r1)
            r2.mTitleHelper = r3
        L47:
            return
    }

    public void showTitle(int r2) {
            r1 = this;
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            if (r0 == 0) goto L7
            r0.updateComponentsVisibility(r2)
        L7:
            r2 = 1
            r1.showTitle(r2)
            return
    }

    public void showTitle(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShowingTitle
            if (r2 != r0) goto L5
            return
        L5:
            r1.mShowingTitle = r2
            androidx.leanback.widget.TitleHelper r0 = r1.mTitleHelper
            if (r0 == 0) goto Le
            r0.showTitle(r2)
        Le:
            return
    }
}
