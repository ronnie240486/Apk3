package androidx.leanback.app;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class HeadersFragment extends androidx.leanback.app.BaseRowFragment {
    private static final androidx.leanback.widget.PresenterSelector sHeaderPresenter = null;
    public static android.view.View.OnLayoutChangeListener sLayoutChangeListener;
    private final androidx.leanback.widget.ItemBridgeAdapter.AdapterListener mAdapterListener;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private boolean mHeadersEnabled;
    private boolean mHeadersGone;
    public androidx.leanback.app.HeadersFragment.OnHeaderClickedListener mOnHeaderClickedListener;
    private androidx.leanback.app.HeadersFragment.OnHeaderViewSelectedListener mOnHeaderViewSelectedListener;
    public final androidx.leanback.widget.ItemBridgeAdapter.Wrapper mWrapper;




    /* JADX INFO: loaded from: classes2.dex */
    public static class NoOverlappingFrameLayout extends android.widget.FrameLayout {
        public NoOverlappingFrameLayout(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View
        public boolean hasOverlappingRendering() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.Deprecated
    public interface OnHeaderClickedListener {
        void onHeaderClicked(androidx.leanback.widget.RowHeaderPresenter.ViewHolder r1, androidx.leanback.widget.Row r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public interface OnHeaderViewSelectedListener {
        void onHeaderSelected(androidx.leanback.widget.RowHeaderPresenter.ViewHolder r1, androidx.leanback.widget.Row r2);
    }

    static {
            androidx.leanback.widget.ClassPresenterSelector r0 = new androidx.leanback.widget.ClassPresenterSelector
            r0.<init>()
            java.lang.Class<androidx.leanback.widget.DividerRow> r1 = androidx.leanback.widget.DividerRow.class
            androidx.leanback.widget.DividerPresenter r2 = new androidx.leanback.widget.DividerPresenter
            r2.<init>()
            androidx.leanback.widget.ClassPresenterSelector r0 = r0.addClassPresenter(r1, r2)
            java.lang.Class<androidx.leanback.widget.SectionRow> r1 = androidx.leanback.widget.SectionRow.class
            androidx.leanback.widget.RowHeaderPresenter r2 = new androidx.leanback.widget.RowHeaderPresenter
            int r3 = androidx.leanback.R.layout.lb_section_header
            r4 = 0
            r2.<init>(r3, r4)
            androidx.leanback.widget.ClassPresenterSelector r0 = r0.addClassPresenter(r1, r2)
            java.lang.Class<androidx.leanback.widget.Row> r1 = androidx.leanback.widget.Row.class
            androidx.leanback.widget.RowHeaderPresenter r2 = new androidx.leanback.widget.RowHeaderPresenter
            int r3 = androidx.leanback.R.layout.lb_header
            r2.<init>(r3)
            androidx.leanback.widget.ClassPresenterSelector r0 = r0.addClassPresenter(r1, r2)
            androidx.leanback.app.HeadersFragment.sHeaderPresenter = r0
            androidx.leanback.app.HeadersFragment$2 r0 = new androidx.leanback.app.HeadersFragment$2
            r0.<init>()
            androidx.leanback.app.HeadersFragment.sLayoutChangeListener = r0
            return
    }

    public HeadersFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mHeadersEnabled = r0
            r0 = 0
            r1.mHeadersGone = r0
            androidx.leanback.app.HeadersFragment$1 r0 = new androidx.leanback.app.HeadersFragment$1
            r0.<init>(r1)
            r1.mAdapterListener = r0
            androidx.leanback.app.HeadersFragment$3 r0 = new androidx.leanback.app.HeadersFragment$3
            r0.<init>()
            r1.mWrapper = r0
            androidx.leanback.widget.PresenterSelector r0 = androidx.leanback.app.HeadersFragment.sHeaderPresenter
            r1.setPresenterSelector(r0)
            androidx.leanback.widget.ItemBridgeAdapter r0 = r1.getBridgeAdapter()
            androidx.leanback.widget.FocusHighlightHelper.setupHeaderItemFocusHighlight(r0)
            return
    }

    private void updateFadingEdgeToBrandColor(int r4) {
            r3 = this;
            android.view.View r0 = r3.getView()
            int r1 = androidx.leanback.R.id.fade_out_edge
            android.view.View r0 = r0.findViewById(r1)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L23
            r0.mutate()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r2
            r2 = 1
            r1[r2] = r4
            r0.setColors(r1)
        L23:
            return
    }

    private void updateListViewVisibility() {
            r4 = this;
            androidx.leanback.widget.VerticalGridView r0 = r4.getVerticalGridView()
            if (r0 == 0) goto L26
            android.view.View r1 = r4.getView()
            boolean r2 = r4.mHeadersGone
            r3 = 0
            if (r2 == 0) goto L12
            r2 = 8
            goto L13
        L12:
            r2 = 0
        L13:
            r1.setVisibility(r2)
            boolean r1 = r4.mHeadersGone
            if (r1 != 0) goto L26
            boolean r1 = r4.mHeadersEnabled
            if (r1 == 0) goto L22
            r0.setChildrenVisibility(r3)
            goto L26
        L22:
            r1 = 4
            r0.setChildrenVisibility(r1)
        L26:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final androidx.leanback.widget.VerticalGridView findGridViewFromRoot(android.view.View r2) {
            r1 = this;
            int r0 = androidx.leanback.R.id.browse_headers
            android.view.View r2 = r2.findViewById(r0)
            androidx.leanback.widget.VerticalGridView r2 = (androidx.leanback.widget.VerticalGridView) r2
            return r2
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final int getLayoutResourceId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_headers_fragment
            return r0
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ int getSelectedPosition() {
            r1 = this;
            int r0 = super.getSelectedPosition()
            return r0
    }

    public boolean isScrolling() {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.getVerticalGridView()
            int r0 = r0.getScrollState()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            android.view.View r1 = super.onCreateView(r1, r2, r3)
            return r1
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public /* bridge */ /* synthetic */ void onDestroyView() {
            r0 = this;
            super.onDestroyView()
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final void onRowSelected(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2, int r3) {
            r0 = this;
            androidx.leanback.app.HeadersFragment$OnHeaderViewSelectedListener r3 = r0.mOnHeaderViewSelectedListener
            if (r3 == 0) goto L1e
            if (r1 == 0) goto L1a
            if (r2 < 0) goto L1a
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r1 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r1
            androidx.leanback.widget.Presenter$ViewHolder r2 = r1.getViewHolder()
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r2 = (androidx.leanback.widget.RowHeaderPresenter.ViewHolder) r2
            java.lang.Object r1 = r1.getItem()
            androidx.leanback.widget.Row r1 = (androidx.leanback.widget.Row) r1
            r3.onHeaderSelected(r2, r1)
            goto L1e
        L1a:
            r1 = 0
            r3.onHeaderSelected(r1, r1)
        L1e:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            super.onSaveInstanceState(r1)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public void onTransitionEnd() {
            r2 = this;
            boolean r0 = r2.mHeadersEnabled
            if (r0 == 0) goto L18
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            if (r0 == 0) goto L18
            r1 = 262144(0x40000, float:3.67342E-40)
            r0.setDescendantFocusability(r1)
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L18
            r0.requestFocus()
        L18:
            super.onTransitionEnd()
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ boolean onTransitionPrepare() {
            r1 = this;
            boolean r0 = super.onTransitionPrepare()
            return r0
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public void onTransitionStart() {
            r2 = this;
            super.onTransitionStart()
            boolean r0 = r2.mHeadersEnabled
            if (r0 != 0) goto L1b
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            if (r0 == 0) goto L1b
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.setDescendantFocusability(r1)
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L1b
            r0.requestFocus()
        L1b:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            androidx.leanback.widget.VerticalGridView r1 = r0.getVerticalGridView()
            if (r1 != 0) goto La
            return
        La:
            boolean r2 = r0.mBackgroundColorSet
            if (r2 == 0) goto L19
            int r2 = r0.mBackgroundColor
            r1.setBackgroundColor(r2)
            int r1 = r0.mBackgroundColor
            r0.updateFadingEdgeToBrandColor(r1)
            goto L2a
        L19:
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L2a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            r0.updateFadingEdgeToBrandColor(r1)
        L2a:
            r0.updateListViewVisibility()
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void setAlignment(int r1) {
            r0 = this;
            super.setAlignment(r1)
            return
    }

    public final void setBackgroundColor(int r2) {
            r1 = this;
            r1.mBackgroundColor = r2
            r2 = 1
            r1.mBackgroundColorSet = r2
            androidx.leanback.widget.VerticalGridView r2 = r1.getVerticalGridView()
            if (r2 == 0) goto L19
            androidx.leanback.widget.VerticalGridView r2 = r1.getVerticalGridView()
            int r0 = r1.mBackgroundColor
            r2.setBackgroundColor(r0)
            int r2 = r1.mBackgroundColor
            r1.updateFadingEdgeToBrandColor(r2)
        L19:
            return
    }

    public final void setHeadersEnabled(boolean r1) {
            r0 = this;
            r0.mHeadersEnabled = r1
            r0.updateListViewVisibility()
            return
    }

    public final void setHeadersGone(boolean r1) {
            r0 = this;
            r0.mHeadersGone = r1
            r0.updateListViewVisibility()
            return
    }

    public void setOnHeaderClickedListener(androidx.leanback.app.HeadersFragment.OnHeaderClickedListener r1) {
            r0 = this;
            r0.mOnHeaderClickedListener = r1
            return
    }

    public void setOnHeaderViewSelectedListener(androidx.leanback.app.HeadersFragment.OnHeaderViewSelectedListener r1) {
            r0 = this;
            r0.mOnHeaderViewSelectedListener = r1
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int r1) {
            r0 = this;
            super.setSelectedPosition(r1)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int r1, boolean r2) {
            r0 = this;
            super.setSelectedPosition(r1, r2)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final void updateAdapter() {
            r2 = this;
            super.updateAdapter()
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.getBridgeAdapter()
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r1 = r2.mAdapterListener
            r0.setAdapterListener(r1)
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r1 = r2.mWrapper
            r0.setWrapper(r1)
            return
    }
}
