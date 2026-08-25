package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RowPresenter extends androidx.leanback.widget.Presenter {
    public static final int SYNC_ACTIVATED_CUSTOM = 0;
    public static final int SYNC_ACTIVATED_TO_EXPANDED = 1;
    public static final int SYNC_ACTIVATED_TO_EXPANDED_AND_SELECTED = 3;
    public static final int SYNC_ACTIVATED_TO_SELECTED = 2;
    private androidx.leanback.widget.RowHeaderPresenter mHeaderPresenter;
    public boolean mSelectEffectEnabled;
    public int mSyncActivatePolicy;

    public static class ContainerViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public final androidx.leanback.widget.RowPresenter.ViewHolder mRowViewHolder;

        public ContainerViewHolder(androidx.leanback.widget.RowContainerView r2, androidx.leanback.widget.RowPresenter.ViewHolder r3) {
                r1 = this;
                r1.<init>(r2)
                android.view.View r0 = r3.view
                r2.addRowView(r0)
                androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r3.mHeaderViewHolder
                if (r0 == 0) goto L11
                android.view.View r0 = r0.view
                r2.addHeaderView(r0)
            L11:
                r1.mRowViewHolder = r3
                r3.mContainerViewHolder = r1
                return
        }
    }

    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        private static final int ACTIVATED = 1;
        private static final int ACTIVATED_NOT_ASSIGNED = 0;
        private static final int NOT_ACTIVATED = 2;
        public int mActivated;
        public final androidx.leanback.graphics.ColorOverlayDimmer mColorDimmer;
        public androidx.leanback.widget.RowPresenter.ContainerViewHolder mContainerViewHolder;
        public boolean mExpanded;
        public androidx.leanback.widget.RowHeaderPresenter.ViewHolder mHeaderViewHolder;
        public boolean mInitialzed;
        private androidx.leanback.widget.BaseOnItemViewClickedListener mOnItemViewClickedListener;
        public androidx.leanback.widget.BaseOnItemViewSelectedListener mOnItemViewSelectedListener;
        private android.view.View.OnKeyListener mOnKeyListener;
        public androidx.leanback.widget.Row mRow;
        public java.lang.Object mRowObject;
        public float mSelectLevel;
        public boolean mSelected;

        public ViewHolder(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mActivated = r0
                r0 = 0
                r1.mSelectLevel = r0
                android.content.Context r2 = r2.getContext()
                androidx.leanback.graphics.ColorOverlayDimmer r2 = androidx.leanback.graphics.ColorOverlayDimmer.createDefault(r2)
                r1.mColorDimmer = r2
                return
        }

        public final androidx.leanback.widget.RowHeaderPresenter.ViewHolder getHeaderViewHolder() {
                r1 = this;
                androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r1.mHeaderViewHolder
                return r0
        }

        public final androidx.leanback.widget.BaseOnItemViewClickedListener getOnItemViewClickedListener() {
                r1 = this;
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
                return r0
        }

        public final androidx.leanback.widget.BaseOnItemViewSelectedListener getOnItemViewSelectedListener() {
                r1 = this;
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r1.mOnItemViewSelectedListener
                return r0
        }

        public android.view.View.OnKeyListener getOnKeyListener() {
                r1 = this;
                android.view.View$OnKeyListener r0 = r1.mOnKeyListener
                return r0
        }

        public final androidx.leanback.widget.Row getRow() {
                r1 = this;
                androidx.leanback.widget.Row r0 = r1.mRow
                return r0
        }

        public final java.lang.Object getRowObject() {
                r1 = this;
                java.lang.Object r0 = r1.mRowObject
                return r0
        }

        public final float getSelectLevel() {
                r1 = this;
                float r0 = r1.mSelectLevel
                return r0
        }

        public java.lang.Object getSelectedItem() {
                r1 = this;
                r0 = 0
                return r0
        }

        public androidx.leanback.widget.Presenter.ViewHolder getSelectedItemViewHolder() {
                r1 = this;
                r0 = 0
                return r0
        }

        public final boolean isExpanded() {
                r1 = this;
                boolean r0 = r1.mExpanded
                return r0
        }

        public final boolean isSelected() {
                r1 = this;
                boolean r0 = r1.mSelected
                return r0
        }

        public final void setActivated(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                goto L5
            L4:
                r1 = 2
            L5:
                r0.mActivated = r1
                return
        }

        public final void setOnItemViewClickedListener(androidx.leanback.widget.BaseOnItemViewClickedListener r1) {
                r0 = this;
                r0.mOnItemViewClickedListener = r1
                return
        }

        public final void setOnItemViewSelectedListener(androidx.leanback.widget.BaseOnItemViewSelectedListener r1) {
                r0 = this;
                r0.mOnItemViewSelectedListener = r1
                return
        }

        public void setOnKeyListener(android.view.View.OnKeyListener r1) {
                r0 = this;
                r0.mOnKeyListener = r1
                return
        }

        public final void syncActivatedStatus(android.view.View r3) {
                r2 = this;
                int r0 = r2.mActivated
                r1 = 1
                if (r0 != r1) goto L9
                r3.setActivated(r1)
                goto L10
            L9:
                r1 = 2
                if (r0 != r1) goto L10
                r0 = 0
                r3.setActivated(r0)
            L10:
                return
        }
    }

    public RowPresenter() {
            r2 = this;
            r2.<init>()
            androidx.leanback.widget.RowHeaderPresenter r0 = new androidx.leanback.widget.RowHeaderPresenter
            r0.<init>()
            r2.mHeaderPresenter = r0
            r1 = 1
            r2.mSelectEffectEnabled = r1
            r2.mSyncActivatePolicy = r1
            r0.setNullItemVisibilityGone(r1)
            return
    }

    private void updateActivateStatus(androidx.leanback.widget.RowPresenter.ViewHolder r4, android.view.View r5) {
            r3 = this;
            int r0 = r3.mSyncActivatePolicy
            r1 = 1
            if (r0 == r1) goto L26
            r2 = 2
            if (r0 == r2) goto L1e
            r2 = 3
            if (r0 == r2) goto Lc
            goto L2d
        Lc:
            boolean r0 = r4.isExpanded()
            if (r0 == 0) goto L19
            boolean r0 = r4.isSelected()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            r4.setActivated(r1)
            goto L2d
        L1e:
            boolean r0 = r4.isSelected()
            r4.setActivated(r0)
            goto L2d
        L26:
            boolean r0 = r4.isExpanded()
            r4.setActivated(r0)
        L2d:
            r4.syncActivatedStatus(r5)
            return
    }

    private void updateHeaderViewVisibility(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.mHeaderPresenter
            if (r0 == 0) goto L15
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r2.mHeaderViewHolder
            if (r0 == 0) goto L15
            androidx.leanback.widget.RowPresenter$ContainerViewHolder r0 = r2.mContainerViewHolder
            android.view.View r0 = r0.view
            androidx.leanback.widget.RowContainerView r0 = (androidx.leanback.widget.RowContainerView) r0
            boolean r2 = r2.isExpanded()
            r0.showHeader(r2)
        L15:
            return
    }

    public abstract androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r1);

    public void dispatchItemSelectedListener(androidx.leanback.widget.RowPresenter.ViewHolder r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto Le
            androidx.leanback.widget.BaseOnItemViewSelectedListener r4 = r3.mOnItemViewSelectedListener
            if (r4 == 0) goto Le
            java.lang.Object r0 = r3.getRowObject()
            r1 = 0
            r4.onItemSelected(r1, r1, r3, r0)
        Le:
            return
    }

    public void freeze(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            return
    }

    public final androidx.leanback.widget.RowHeaderPresenter getHeaderPresenter() {
            r1 = this;
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.mHeaderPresenter
            return r0
    }

    public final androidx.leanback.widget.RowPresenter.ViewHolder getRowViewHolder(androidx.leanback.widget.Presenter.ViewHolder r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.widget.RowPresenter.ContainerViewHolder
            if (r0 == 0) goto L9
            androidx.leanback.widget.RowPresenter$ContainerViewHolder r2 = (androidx.leanback.widget.RowPresenter.ContainerViewHolder) r2
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = r2.mRowViewHolder
            return r2
        L9:
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = (androidx.leanback.widget.RowPresenter.ViewHolder) r2
            return r2
    }

    public final boolean getSelectEffectEnabled() {
            r1 = this;
            boolean r0 = r1.mSelectEffectEnabled
            return r0
    }

    public final float getSelectLevel(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            float r1 = r1.mSelectLevel
            return r1
    }

    public final int getSyncActivatePolicy() {
            r1 = this;
            int r0 = r1.mSyncActivatePolicy
            return r0
    }

    public void initializeRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r4) {
            r3 = this;
            r0 = 1
            r4.mInitialzed = r0
            boolean r0 = r3.isClippingChildren()
            if (r0 != 0) goto L20
            android.view.View r0 = r4.view
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L15
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setClipChildren(r2)
        L15:
            androidx.leanback.widget.RowPresenter$ContainerViewHolder r4 = r4.mContainerViewHolder
            if (r4 == 0) goto L20
            android.view.View r4 = r4.view
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.setClipChildren(r2)
        L20:
            return
    }

    public boolean isClippingChildren() {
            r0 = this;
            boolean r0 = r0 instanceof androidx.leanback.widget.AbstractMediaItemPresenter
            return r0
    }

    public boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r2, java.lang.Object r3) {
            r1 = this;
            r2.mRowObject = r3
            boolean r0 = r3 instanceof androidx.leanback.widget.Row
            if (r0 == 0) goto La
            r0 = r3
            androidx.leanback.widget.Row r0 = (androidx.leanback.widget.Row) r0
            goto Lb
        La:
            r0 = 0
        Lb:
            r2.mRow = r0
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r2.mHeaderViewHolder
            if (r0 == 0) goto L1e
            androidx.leanback.widget.Row r0 = r2.getRow()
            if (r0 == 0) goto L1e
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.mHeaderPresenter
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r2 = r2.mHeaderViewHolder
            r0.onBindViewHolder(r2, r3)
        L1e:
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r0.onBindRowViewHolder(r1, r2)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r5) {
            r4 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r0 = r4.createRowViewHolder(r5)
            r1 = 0
            r0.mInitialzed = r1
            androidx.leanback.widget.RowHeaderPresenter r2 = r4.mHeaderPresenter
            r3 = 1
            if (r2 != 0) goto L1d
            boolean r2 = r4.isUsingDefaultSelectEffect()
            if (r2 == 0) goto L1a
            boolean r2 = r4.getSelectEffectEnabled()
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L1e
        L1d:
            r1 = 1
        L1e:
            if (r1 == 0) goto L3f
            androidx.leanback.widget.RowContainerView r1 = new androidx.leanback.widget.RowContainerView
            android.content.Context r5 = r5.getContext()
            r1.<init>(r5)
            androidx.leanback.widget.RowHeaderPresenter r5 = r4.mHeaderPresenter
            if (r5 == 0) goto L39
            android.view.View r2 = r0.view
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.leanback.widget.Presenter$ViewHolder r5 = r5.onCreateViewHolder(r2)
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r5 = (androidx.leanback.widget.RowHeaderPresenter.ViewHolder) r5
            r0.mHeaderViewHolder = r5
        L39:
            androidx.leanback.widget.RowPresenter$ContainerViewHolder r5 = new androidx.leanback.widget.RowPresenter$ContainerViewHolder
            r5.<init>(r1, r0)
            goto L40
        L3f:
            r5 = r0
        L40:
            r4.initializeRowViewHolder(r0)
            boolean r0 = r0.mInitialzed
            if (r0 == 0) goto L48
            return r5
        L48:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "super.initializeRowViewHolder() must be called"
            r5.<init>(r0)
            throw r5
    }

    public void onRowViewAttachedToWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r2 = r2.mHeaderViewHolder
            if (r2 == 0) goto L9
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.mHeaderPresenter
            r0.onViewAttachedToWindow(r2)
        L9:
            return
    }

    public void onRowViewDetachedFromWindow(androidx.leanback.widget.RowPresenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r3.mHeaderViewHolder
            if (r0 == 0) goto L9
            androidx.leanback.widget.RowHeaderPresenter r1 = r2.mHeaderPresenter
            r1.onViewDetachedFromWindow(r0)
        L9:
            android.view.View r3 = r3.view
            androidx.leanback.widget.Presenter.cancelAnimationsRecursive(r3)
            return
    }

    public void onRowViewExpanded(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            r0.updateHeaderViewVisibility(r1)
            android.view.View r2 = r1.view
            r0.updateActivateStatus(r1, r2)
            return
    }

    public void onRowViewSelected(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            r0.dispatchItemSelectedListener(r1, r2)
            r0.updateHeaderViewVisibility(r1)
            android.view.View r2 = r1.view
            r0.updateActivateStatus(r1, r2)
            return
    }

    public void onSelectLevelChanged(androidx.leanback.widget.RowPresenter.ViewHolder r4) {
            r3 = this;
            boolean r0 = r3.getSelectEffectEnabled()
            if (r0 == 0) goto L31
            androidx.leanback.graphics.ColorOverlayDimmer r0 = r4.mColorDimmer
            float r1 = r4.mSelectLevel
            r0.setActiveLevel(r1)
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r4.mHeaderViewHolder
            if (r0 == 0) goto L18
            androidx.leanback.widget.RowHeaderPresenter r1 = r3.mHeaderPresenter
            float r2 = r4.mSelectLevel
            r1.setSelectLevel(r0, r2)
        L18:
            boolean r0 = r3.isUsingDefaultSelectEffect()
            if (r0 == 0) goto L31
            androidx.leanback.widget.RowPresenter$ContainerViewHolder r0 = r4.mContainerViewHolder
            android.view.View r0 = r0.view
            androidx.leanback.widget.RowContainerView r0 = (androidx.leanback.widget.RowContainerView) r0
            androidx.leanback.graphics.ColorOverlayDimmer r4 = r4.mColorDimmer
            android.graphics.Paint r4 = r4.getPaint()
            int r4 = r4.getColor()
            r0.setForegroundColor(r4)
        L31:
            return
    }

    public void onUnbindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r3.mHeaderViewHolder
            if (r0 == 0) goto L9
            androidx.leanback.widget.RowHeaderPresenter r1 = r2.mHeaderPresenter
            r1.onUnbindViewHolder(r0)
        L9:
            r0 = 0
            r3.mRow = r0
            r3.mRowObject = r0
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r0.onUnbindRowViewHolder(r1)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onViewAttachedToWindow(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r0.onRowViewAttachedToWindow(r1)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onViewDetachedFromWindow(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r0.onRowViewDetachedFromWindow(r1)
            return
    }

    public void setEntranceTransitionState(androidx.leanback.widget.RowPresenter.ViewHolder r3, boolean r4) {
            r2 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = r3.mHeaderViewHolder
            if (r0 == 0) goto L1a
            android.view.View r0 = r0.view
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto L1a
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r3 = r3.mHeaderViewHolder
            android.view.View r3 = r3.view
            if (r4 == 0) goto L16
            r4 = 0
            goto L17
        L16:
            r4 = 4
        L17:
            r3.setVisibility(r4)
        L1a:
            return
    }

    public final void setHeaderPresenter(androidx.leanback.widget.RowHeaderPresenter r1) {
            r0 = this;
            r0.mHeaderPresenter = r1
            return
    }

    public final void setRowViewExpanded(androidx.leanback.widget.Presenter.ViewHolder r1, boolean r2) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r1.mExpanded = r2
            r0.onRowViewExpanded(r1, r2)
            return
    }

    public final void setRowViewSelected(androidx.leanback.widget.Presenter.ViewHolder r1, boolean r2) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r1.mSelected = r2
            r0.onRowViewSelected(r1, r2)
            return
    }

    public final void setSelectEffectEnabled(boolean r1) {
            r0 = this;
            r0.mSelectEffectEnabled = r1
            return
    }

    public final void setSelectLevel(androidx.leanback.widget.Presenter.ViewHolder r1, float r2) {
            r0 = this;
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            r1.mSelectLevel = r2
            r0.onSelectLevelChanged(r1)
            return
    }

    public final void setSyncActivatePolicy(int r1) {
            r0 = this;
            r0.mSyncActivatePolicy = r1
            return
    }
}
