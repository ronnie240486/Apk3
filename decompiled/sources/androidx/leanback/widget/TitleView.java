package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class TitleView extends android.widget.FrameLayout implements androidx.leanback.widget.TitleViewAdapter.Provider {
    private int flags;
    private android.widget.ImageView mBadgeView;
    private boolean mHasSearchListener;
    private androidx.leanback.widget.SearchOrbView mSearchOrbView;
    private android.widget.TextView mTextView;
    private final androidx.leanback.widget.TitleViewAdapter mTitleViewAdapter;


    public TitleView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TitleView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.attr.browseTitleViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TitleView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 6
            r0.flags = r2
            r2 = 0
            r0.mHasSearchListener = r2
            androidx.leanback.widget.TitleView$1 r3 = new androidx.leanback.widget.TitleView$1
            r3.<init>(r0)
            r0.mTitleViewAdapter = r3
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r3 = androidx.leanback.R.layout.lb_title_view
            android.view.View r1 = r1.inflate(r3, r0)
            int r3 = androidx.leanback.R.id.title_badge
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.mBadgeView = r3
            int r3 = androidx.leanback.R.id.title_text
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.mTextView = r3
            int r3 = androidx.leanback.R.id.title_orb
            android.view.View r1 = r1.findViewById(r3)
            androidx.leanback.widget.SearchOrbView r1 = (androidx.leanback.widget.SearchOrbView) r1
            r0.mSearchOrbView = r1
            r0.setClipToPadding(r2)
            r0.setClipChildren(r2)
            return
    }

    private void updateBadgeVisibility() {
            r3 = this;
            android.widget.ImageView r0 = r3.mBadgeView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L16
            android.widget.ImageView r0 = r3.mBadgeView
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.mTextView
            r0.setVisibility(r2)
            goto L20
        L16:
            android.widget.ImageView r0 = r3.mBadgeView
            r0.setVisibility(r2)
            android.widget.TextView r0 = r3.mTextView
            r0.setVisibility(r1)
        L20:
            return
    }

    private void updateSearchOrbViewVisiblity() {
            r2 = this;
            boolean r0 = r2.mHasSearchListener
            r1 = 4
            if (r0 == 0) goto Lb
            int r0 = r2.flags
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            r1 = 0
        Lb:
            androidx.leanback.widget.SearchOrbView r0 = r2.mSearchOrbView
            r0.setVisibility(r1)
            return
    }

    public void enableAnimation(boolean r2) {
            r1 = this;
            androidx.leanback.widget.SearchOrbView r0 = r1.mSearchOrbView
            if (r2 == 0) goto Lc
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r0.enableOrbColorAnimation(r2)
            return
    }

    public android.graphics.drawable.Drawable getBadgeDrawable() {
            r1 = this;
            android.widget.ImageView r0 = r1.mBadgeView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public androidx.leanback.widget.SearchOrbView.Colors getSearchAffordanceColors() {
            r1 = this;
            androidx.leanback.widget.SearchOrbView r0 = r1.mSearchOrbView
            androidx.leanback.widget.SearchOrbView$Colors r0 = r0.getOrbColors()
            return r0
    }

    public android.view.View getSearchAffordanceView() {
            r1 = this;
            androidx.leanback.widget.SearchOrbView r0 = r1.mSearchOrbView
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @Override // androidx.leanback.widget.TitleViewAdapter.Provider
    public androidx.leanback.widget.TitleViewAdapter getTitleViewAdapter() {
            r1 = this;
            androidx.leanback.widget.TitleViewAdapter r0 = r1.mTitleViewAdapter
            return r0
    }

    public void setBadgeDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mBadgeView
            r0.setImageDrawable(r2)
            r1.updateBadgeVisibility()
            return
    }

    public void setOnSearchClickedListener(android.view.View.OnClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.mHasSearchListener = r0
            androidx.leanback.widget.SearchOrbView r0 = r1.mSearchOrbView
            r0.setOnOrbClickedListener(r2)
            r1.updateSearchOrbViewVisiblity()
            return
    }

    public void setSearchAffordanceColors(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            androidx.leanback.widget.SearchOrbView r0 = r1.mSearchOrbView
            r0.setOrbColors(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            r0.setText(r2)
            r1.updateBadgeVisibility()
            return
    }

    public void updateComponentsVisibility(int r2) {
            r1 = this;
            r1.flags = r2
            r0 = 2
            r2 = r2 & r0
            if (r2 != r0) goto La
            r1.updateBadgeVisibility()
            goto L16
        La:
            android.widget.ImageView r2 = r1.mBadgeView
            r0 = 8
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.mTextView
            r2.setVisibility(r0)
        L16:
            r1.updateSearchOrbViewVisiblity()
            return
    }
}
