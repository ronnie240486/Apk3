package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
abstract class BaseRowFragment extends android.app.Fragment {
    private static final java.lang.String CURRENT_SELECTED_POSITION = "currentSelectedPosition";
    private androidx.leanback.widget.ObjectAdapter mAdapter;
    public final androidx.leanback.widget.ItemBridgeAdapter mBridgeAdapter;
    public androidx.leanback.app.BaseRowFragment.LateSelectionObserver mLateSelectionObserver;
    private boolean mPendingTransitionPrepare;
    private androidx.leanback.widget.PresenterSelector mPresenterSelector;
    private final androidx.leanback.widget.OnChildViewHolderSelectedListener mRowSelectedListener;
    public int mSelectedPosition;
    public androidx.leanback.widget.VerticalGridView mVerticalGridView;


    public class LateSelectionObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        public boolean mIsLateSelection;
        public final /* synthetic */ androidx.leanback.app.BaseRowFragment this$0;

        public LateSelectionObserver(androidx.leanback.app.BaseRowFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mIsLateSelection = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
                r0 = this;
                r0.performLateSelection()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.performLateSelection()
                return
        }

        public final void performLateSelection() {
                r2 = this;
                boolean r0 = r2.mIsLateSelection
                if (r0 == 0) goto Le
                r0 = 0
                r2.mIsLateSelection = r0
                androidx.leanback.app.BaseRowFragment r0 = r2.this$0
                androidx.leanback.widget.ItemBridgeAdapter r0 = r0.mBridgeAdapter
                r0.unregisterAdapterDataObserver(r2)
            Le:
                androidx.leanback.app.BaseRowFragment r0 = r2.this$0
                androidx.leanback.widget.VerticalGridView r1 = r0.mVerticalGridView
                if (r1 == 0) goto L19
                int r0 = r0.mSelectedPosition
                r1.setSelectedPosition(r0)
            L19:
                return
        }
    }

    public BaseRowFragment() {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.ItemBridgeAdapter r0 = new androidx.leanback.widget.ItemBridgeAdapter
            r0.<init>()
            r1.mBridgeAdapter = r0
            r0 = -1
            r1.mSelectedPosition = r0
            androidx.leanback.app.BaseRowFragment$LateSelectionObserver r0 = new androidx.leanback.app.BaseRowFragment$LateSelectionObserver
            r0.<init>(r1)
            r1.mLateSelectionObserver = r0
            androidx.leanback.app.BaseRowFragment$1 r0 = new androidx.leanback.app.BaseRowFragment$1
            r0.<init>(r1)
            r1.mRowSelectedListener = r0
            return
    }

    public androidx.leanback.widget.VerticalGridView findGridViewFromRoot(android.view.View r1) {
            r0 = this;
            androidx.leanback.widget.VerticalGridView r1 = (androidx.leanback.widget.VerticalGridView) r1
            return r1
    }

    public final androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    public final androidx.leanback.widget.ItemBridgeAdapter getBridgeAdapter() {
            r1 = this;
            androidx.leanback.widget.ItemBridgeAdapter r0 = r1.mBridgeAdapter
            return r0
    }

    public abstract int getLayoutResourceId();

    public final androidx.leanback.widget.PresenterSelector getPresenterSelector() {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r1.mPresenterSelector
            return r0
    }

    public int getSelectedPosition() {
            r1 = this;
            int r0 = r1.mSelectedPosition
            return r0
    }

    public final androidx.leanback.widget.VerticalGridView getVerticalGridView() {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.mVerticalGridView
            return r0
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = r1.getLayoutResourceId()
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            androidx.leanback.widget.VerticalGridView r3 = r1.findGridViewFromRoot(r2)
            r1.mVerticalGridView = r3
            boolean r3 = r1.mPendingTransitionPrepare
            if (r3 == 0) goto L18
            r1.mPendingTransitionPrepare = r0
            r1.onTransitionPrepare()
        L18:
            return r2
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            androidx.leanback.app.BaseRowFragment$LateSelectionObserver r0 = r2.mLateSelectionObserver
            boolean r1 = r0.mIsLateSelection
            if (r1 == 0) goto L13
            r1 = 0
            r0.mIsLateSelection = r1
            androidx.leanback.app.BaseRowFragment r1 = r0.this$0
            androidx.leanback.widget.ItemBridgeAdapter r1 = r1.mBridgeAdapter
            r1.unregisterAdapterDataObserver(r0)
        L13:
            r0 = 0
            r2.mVerticalGridView = r0
            return
    }

    public void onRowSelected(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            int r0 = r2.mSelectedPosition
            java.lang.String r1 = "currentSelectedPosition"
            r3.putInt(r1, r0)
            return
    }

    public void onTransitionEnd() {
            r3 = this;
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            if (r0 == 0) goto L1d
            r1 = 0
            r0.setLayoutFrozen(r1)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r2 = 1
            r0.setAnimateChildLayout(r2)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r0.setPruneChild(r2)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r0.setFocusSearchDisabled(r1)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r0.setScrollEnabled(r2)
        L1d:
            return
    }

    public boolean onTransitionPrepare() {
            r3 = this;
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            r0.setAnimateChildLayout(r2)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r0.setScrollEnabled(r2)
            return r1
        Lf:
            r3.mPendingTransitionPrepare = r1
            return r2
    }

    public void onTransitionStart() {
            r2 = this;
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            if (r0 == 0) goto L13
            r1 = 0
            r0.setPruneChild(r1)
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            r1 = 1
            r0.setLayoutFrozen(r1)
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            r0.setFocusSearchDisabled(r1)
        L13:
            return
    }

    @Override // android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            r2 = -1
            java.lang.String r0 = "currentSelectedPosition"
            int r2 = r3.getInt(r0, r2)
            r1.mSelectedPosition = r2
        Lb:
            r1.setAdapterAndSelection()
            androidx.leanback.widget.VerticalGridView r2 = r1.mVerticalGridView
            androidx.leanback.widget.OnChildViewHolderSelectedListener r3 = r1.mRowSelectedListener
            r2.setOnChildViewHolderSelectedListener(r3)
            return
    }

    public final void setAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            if (r0 == r2) goto L9
            r1.mAdapter = r2
            r1.updateAdapter()
        L9:
            return
    }

    public final void setAdapterAndSelection() {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            if (r0 != 0) goto L5
            return
        L5:
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            androidx.leanback.widget.ItemBridgeAdapter r1 = r2.mBridgeAdapter
            if (r0 == r1) goto L14
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            r0.setAdapter(r1)
        L14:
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.mBridgeAdapter
            int r0 = r0.getItemCount()
            r1 = 1
            if (r0 != 0) goto L23
            int r0 = r2.mSelectedPosition
            if (r0 < 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L32
            androidx.leanback.app.BaseRowFragment$LateSelectionObserver r0 = r2.mLateSelectionObserver
            r0.mIsLateSelection = r1
            androidx.leanback.app.BaseRowFragment r1 = r0.this$0
            androidx.leanback.widget.ItemBridgeAdapter r1 = r1.mBridgeAdapter
            r1.registerAdapterDataObserver(r0)
            goto L3b
        L32:
            int r0 = r2.mSelectedPosition
            if (r0 < 0) goto L3b
            androidx.leanback.widget.VerticalGridView r1 = r2.mVerticalGridView
            r1.setSelectedPosition(r0)
        L3b:
            return
    }

    public void setAlignment(int r4) {
            r3 = this;
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            if (r0 == 0) goto L1e
            r1 = 0
            r0.setItemAlignmentOffset(r1)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setItemAlignmentOffsetPercent(r2)
            androidx.leanback.widget.VerticalGridView r0 = r3.mVerticalGridView
            r0.setWindowAlignmentOffset(r4)
            androidx.leanback.widget.VerticalGridView r4 = r3.mVerticalGridView
            r4.setWindowAlignmentOffsetPercent(r2)
            androidx.leanback.widget.VerticalGridView r4 = r3.mVerticalGridView
            r4.setWindowAlignment(r1)
        L1e:
            return
    }

    public final void setPresenterSelector(androidx.leanback.widget.PresenterSelector r2) {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r1.mPresenterSelector
            if (r0 == r2) goto L9
            r1.mPresenterSelector = r2
            r1.updateAdapter()
        L9:
            return
    }

    public void setSelectedPosition(int r2) {
            r1 = this;
            r0 = 1
            r1.setSelectedPosition(r2, r0)
            return
    }

    public void setSelectedPosition(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.mSelectedPosition
            if (r0 != r3) goto L5
            return
        L5:
            r2.mSelectedPosition = r3
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            if (r0 == 0) goto L1b
            androidx.leanback.app.BaseRowFragment$LateSelectionObserver r1 = r2.mLateSelectionObserver
            boolean r1 = r1.mIsLateSelection
            if (r1 == 0) goto L12
            return
        L12:
            if (r4 == 0) goto L18
            r0.setSelectedPositionSmooth(r3)
            goto L1b
        L18:
            r0.setSelectedPosition(r3)
        L1b:
            return
    }

    public void updateAdapter() {
            r2 = this;
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.mBridgeAdapter
            androidx.leanback.widget.ObjectAdapter r1 = r2.mAdapter
            r0.setAdapter(r1)
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.mBridgeAdapter
            androidx.leanback.widget.PresenterSelector r1 = r2.mPresenterSelector
            r0.setPresenter(r1)
            androidx.leanback.widget.VerticalGridView r0 = r2.mVerticalGridView
            if (r0 == 0) goto L15
            r2.setAdapterAndSelection()
        L15:
            return
    }
}
