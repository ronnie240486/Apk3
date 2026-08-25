package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
class ControlBarPresenter extends androidx.leanback.widget.Presenter {
    private static int sChildMarginDefault;
    private static int sControlIconWidth;
    public boolean mDefaultFocusToMiddle;
    private int mLayoutResourceId;
    public androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    public androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;

    /* JADX INFO: loaded from: classes.dex */
    public static class BoundData {
        public androidx.leanback.widget.ObjectAdapter adapter;
        public androidx.leanback.widget.Presenter presenter;

        public BoundData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public interface OnControlClickedListener {
        void onControlClicked(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, androidx.leanback.widget.ControlBarPresenter.BoundData r3);
    }

    public interface OnControlSelectedListener {
        void onControlSelected(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, androidx.leanback.widget.ControlBarPresenter.BoundData r3);
    }

    public class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public androidx.leanback.widget.ObjectAdapter mAdapter;
        public androidx.leanback.widget.ControlBar mControlBar;
        public android.view.View mControlsContainer;
        public androidx.leanback.widget.ControlBarPresenter.BoundData mData;
        public androidx.leanback.widget.ObjectAdapter.DataObserver mDataObserver;
        public androidx.leanback.widget.Presenter mPresenter;
        public android.util.SparseArray<androidx.leanback.widget.Presenter.ViewHolder> mViewHolders;
        public final /* synthetic */ androidx.leanback.widget.ControlBarPresenter this$0;




        public ViewHolder(androidx.leanback.widget.ControlBarPresenter r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r3)
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mViewHolders = r0
                int r0 = androidx.leanback.R.id.controls_container
                android.view.View r0 = r3.findViewById(r0)
                r1.mControlsContainer = r0
                int r0 = androidx.leanback.R.id.control_bar
                android.view.View r3 = r3.findViewById(r0)
                androidx.leanback.widget.ControlBar r3 = (androidx.leanback.widget.ControlBar) r3
                r1.mControlBar = r3
                if (r3 == 0) goto L34
                boolean r2 = r2.mDefaultFocusToMiddle
                r3.mDefaultFocusToMiddle = r2
                androidx.leanback.widget.ControlBarPresenter$ViewHolder$1 r2 = new androidx.leanback.widget.ControlBarPresenter$ViewHolder$1
                r2.<init>(r1)
                r3.setOnChildFocusedListener(r2)
                androidx.leanback.widget.ControlBarPresenter$ViewHolder$2 r2 = new androidx.leanback.widget.ControlBarPresenter$ViewHolder$2
                r2.<init>(r1)
                r1.mDataObserver = r2
                return
            L34:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Couldn't find control_bar"
                r2.<init>(r3)
                throw r2
        }

        private void bindControlToAction(int r3, androidx.leanback.widget.ObjectAdapter r4, androidx.leanback.widget.Presenter r5) {
                r2 = this;
                android.util.SparseArray<androidx.leanback.widget.Presenter$ViewHolder> r0 = r2.mViewHolders
                java.lang.Object r0 = r0.get(r3)
                androidx.leanback.widget.Presenter$ViewHolder r0 = (androidx.leanback.widget.Presenter.ViewHolder) r0
                java.lang.Object r4 = r4.get(r3)
                if (r0 != 0) goto L21
                androidx.leanback.widget.ControlBar r0 = r2.mControlBar
                androidx.leanback.widget.Presenter$ViewHolder r0 = r5.onCreateViewHolder(r0)
                android.util.SparseArray<androidx.leanback.widget.Presenter$ViewHolder> r1 = r2.mViewHolders
                r1.put(r3, r0)
                androidx.leanback.widget.ControlBarPresenter$ViewHolder$3 r1 = new androidx.leanback.widget.ControlBarPresenter$ViewHolder$3
                r1.<init>(r2, r3, r0)
                r5.setOnClickListener(r0, r1)
            L21:
                android.view.View r3 = r0.view
                android.view.ViewParent r3 = r3.getParent()
                if (r3 != 0) goto L30
                androidx.leanback.widget.ControlBar r3 = r2.mControlBar
                android.view.View r1 = r0.view
                r3.addView(r1)
            L30:
                r5.onBindViewHolder(r0, r4)
                return
        }

        public final void bindControlToAction(int r2, androidx.leanback.widget.Presenter r3) {
                r1 = this;
                androidx.leanback.widget.ObjectAdapter r0 = r1.getDisplayedAdapter()
                r1.bindControlToAction(r2, r0, r3)
                return
        }

        public int getChildMarginFromCenter(android.content.Context r2, int r3) {
                r1 = this;
                androidx.leanback.widget.ControlBarPresenter r3 = r1.this$0
                int r3 = r3.getChildMarginDefault(r2)
                androidx.leanback.widget.ControlBarPresenter r0 = r1.this$0
                int r2 = r0.getControlIconWidth(r2)
                int r3 = r3 + r2
                return r3
        }

        public androidx.leanback.widget.ObjectAdapter getDisplayedAdapter() {
                r1 = this;
                androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
                return r0
        }

        public final void showControls(androidx.leanback.widget.Presenter r6) {
                r5 = this;
                androidx.leanback.widget.ObjectAdapter r0 = r5.getDisplayedAdapter()
                r1 = 0
                if (r0 != 0) goto L9
                r2 = 0
                goto Ld
            L9:
                int r2 = r0.size()
            Ld:
                androidx.leanback.widget.ControlBar r3 = r5.mControlBar
                android.view.View r3 = r3.getFocusedChild()
                if (r3 == 0) goto L2e
                if (r2 <= 0) goto L2e
                androidx.leanback.widget.ControlBar r4 = r5.mControlBar
                int r3 = r4.indexOfChild(r3)
                if (r3 < r2) goto L2e
                androidx.leanback.widget.ControlBar r3 = r5.mControlBar
                int r4 = r0.size()
                int r4 = r4 + (-1)
                android.view.View r3 = r3.getChildAt(r4)
                r3.requestFocus()
            L2e:
                androidx.leanback.widget.ControlBar r3 = r5.mControlBar
                int r3 = r3.getChildCount()
                int r3 = r3 + (-1)
            L36:
                if (r3 < r2) goto L40
                androidx.leanback.widget.ControlBar r4 = r5.mControlBar
                r4.removeViewAt(r3)
                int r3 = r3 + (-1)
                goto L36
            L40:
                if (r1 >= r2) goto L4b
                r3 = 7
                if (r1 >= r3) goto L4b
                r5.bindControlToAction(r1, r0, r6)
                int r1 = r1 + 1
                goto L40
            L4b:
                androidx.leanback.widget.ControlBar r6 = r5.mControlBar
                android.content.Context r0 = r6.getContext()
                int r0 = r5.getChildMarginFromCenter(r0, r2)
                r6.setChildMarginFromCenter(r0)
                return
        }
    }

    public ControlBarPresenter(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mDefaultFocusToMiddle = r0
            r1.mLayoutResourceId = r2
            return
    }

    public final int getChildMarginDefault(android.content.Context r2) {
            r1 = this;
            int r0 = androidx.leanback.widget.ControlBarPresenter.sChildMarginDefault
            if (r0 != 0) goto L10
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_controls_child_margin_default
            int r2 = r2.getDimensionPixelSize(r0)
            androidx.leanback.widget.ControlBarPresenter.sChildMarginDefault = r2
        L10:
            int r2 = androidx.leanback.widget.ControlBarPresenter.sChildMarginDefault
            return r2
    }

    public final int getControlIconWidth(android.content.Context r2) {
            r1 = this;
            int r0 = androidx.leanback.widget.ControlBarPresenter.sControlIconWidth
            if (r0 != 0) goto L10
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_control_icon_width
            int r2 = r2.getDimensionPixelSize(r0)
            androidx.leanback.widget.ControlBarPresenter.sControlIconWidth = r2
        L10:
            int r2 = androidx.leanback.widget.ControlBarPresenter.sControlIconWidth
            return r2
    }

    public int getLayoutResourceId() {
            r1 = this;
            int r0 = r1.mLayoutResourceId
            return r0
    }

    public androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener getOnItemControlListener() {
            r1 = this;
            androidx.leanback.widget.ControlBarPresenter$OnControlSelectedListener r0 = r1.mOnControlSelectedListener
            return r0
    }

    public androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.ControlBarPresenter$OnControlClickedListener r0 = r1.mOnControlClickedListener
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3, java.lang.Object r4) {
            r2 = this;
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r3 = (androidx.leanback.widget.ControlBarPresenter.ViewHolder) r3
            androidx.leanback.widget.ControlBarPresenter$BoundData r4 = (androidx.leanback.widget.ControlBarPresenter.BoundData) r4
            androidx.leanback.widget.ObjectAdapter r0 = r3.mAdapter
            androidx.leanback.widget.ObjectAdapter r1 = r4.adapter
            if (r0 == r1) goto L13
            r3.mAdapter = r1
            if (r1 == 0) goto L13
            androidx.leanback.widget.ObjectAdapter$DataObserver r0 = r3.mDataObserver
            r1.registerObserver(r0)
        L13:
            androidx.leanback.widget.Presenter r0 = r4.presenter
            r3.mPresenter = r0
            r3.mData = r4
            r3.showControls(r0)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.getLayoutResourceId()
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = new androidx.leanback.widget.ControlBarPresenter$ViewHolder
            r0.<init>(r3, r4)
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r4) {
            r3 = this;
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r4 = (androidx.leanback.widget.ControlBarPresenter.ViewHolder) r4
            androidx.leanback.widget.ObjectAdapter r0 = r4.mAdapter
            r1 = 0
            if (r0 == 0) goto Le
            androidx.leanback.widget.ObjectAdapter$DataObserver r2 = r4.mDataObserver
            r0.unregisterObserver(r2)
            r4.mAdapter = r1
        Le:
            r4.mData = r1
            return
    }

    public void setBackgroundColor(androidx.leanback.widget.ControlBarPresenter.ViewHolder r1, int r2) {
            r0 = this;
            android.view.View r1 = r1.mControlsContainer
            r1.setBackgroundColor(r2)
            return
    }

    public void setOnControlClickedListener(androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener r1) {
            r0 = this;
            r0.mOnControlClickedListener = r1
            return
    }

    public void setOnControlSelectedListener(androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener r1) {
            r0 = this;
            r0.mOnControlSelectedListener = r1
            return
    }
}
