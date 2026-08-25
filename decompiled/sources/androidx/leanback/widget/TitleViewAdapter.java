package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TitleViewAdapter {
    public static final int BRANDING_VIEW_VISIBLE = 2;
    public static final int FULL_VIEW_VISIBLE = 6;
    public static final int SEARCH_VIEW_VISIBLE = 4;

    /* JADX INFO: loaded from: classes2.dex */
    public interface Provider {
        androidx.leanback.widget.TitleViewAdapter getTitleViewAdapter();
    }

    public TitleViewAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.graphics.drawable.Drawable getBadgeDrawable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.leanback.widget.SearchOrbView.Colors getSearchAffordanceColors() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract android.view.View getSearchAffordanceView();

    public java.lang.CharSequence getTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setAnimationEnabled(boolean r1) {
            r0 = this;
            return
    }

    public void setBadgeDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    public void setOnSearchClickedListener(android.view.View.OnClickListener r2) {
            r1 = this;
            android.view.View r0 = r1.getSearchAffordanceView()
            if (r0 == 0) goto L9
            r0.setOnClickListener(r2)
        L9:
            return
    }

    public void setSearchAffordanceColors(androidx.leanback.widget.SearchOrbView.Colors r1) {
            r0 = this;
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void updateComponentsVisibility(int r1) {
            r0 = this;
            return
    }
}
