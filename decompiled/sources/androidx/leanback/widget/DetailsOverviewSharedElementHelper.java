package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
final class DetailsOverviewSharedElementHelper extends androidx.core.app.SharedElementCallback {
    public android.app.Activity mActivityToRunTransition;
    public int mRightPanelHeight;
    public int mRightPanelWidth;
    private android.graphics.Matrix mSavedMatrix;
    private android.widget.ImageView.ScaleType mSavedScaleType;
    public java.lang.String mSharedElementName;
    public boolean mStartedPostpone;
    public androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder mViewHolder;



    /* JADX INFO: loaded from: classes.dex */
    public static class TransitionTimeOutRunnable implements java.lang.Runnable {
        public java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewSharedElementHelper> mHelperRef;

        public TransitionTimeOutRunnable(androidx.leanback.widget.DetailsOverviewSharedElementHelper r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mHelperRef = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewSharedElementHelper> r0 = r2.mHelperRef
                java.lang.Object r0 = r0.get()
                androidx.leanback.widget.DetailsOverviewSharedElementHelper r0 = (androidx.leanback.widget.DetailsOverviewSharedElementHelper) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                boolean r1 = r0.mStartedPostpone
                if (r1 != 0) goto L17
                android.app.Activity r1 = r0.mActivityToRunTransition
                androidx.core.app.ActivityCompat.startPostponedEnterTransition(r1)
                r1 = 1
                r0.mStartedPostpone = r1
            L17:
                return
        }
    }

    public DetailsOverviewSharedElementHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private void changeImageViewScale(android.view.View r4) {
            r3 = this;
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r3.mViewHolder
            android.widget.ImageView r0 = r0.mImageView
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            r0.setScaleType(r1)
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
            if (r1 != r2) goto L1c
            android.graphics.Matrix r4 = r4.getImageMatrix()
            r0.setImageMatrix(r4)
        L1c:
            updateImageViewAfterScaleTypeChange(r0)
            return
    }

    private boolean hasImageViewScaleChange(android.view.View r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.widget.ImageView
            return r1
    }

    private void restoreImageViewScale() {
            r3 = this;
            android.widget.ImageView$ScaleType r0 = r3.mSavedScaleType
            if (r0 == 0) goto L1c
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r1 = r3.mViewHolder
            android.widget.ImageView r1 = r1.mImageView
            r1.setScaleType(r0)
            android.widget.ImageView$ScaleType r0 = r3.mSavedScaleType
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
            if (r0 != r2) goto L16
            android.graphics.Matrix r0 = r3.mSavedMatrix
            r1.setImageMatrix(r0)
        L16:
            r0 = 0
            r3.mSavedScaleType = r0
            updateImageViewAfterScaleTypeChange(r1)
        L1c:
            return
    }

    private void saveImageViewScale() {
            r3 = this;
            android.widget.ImageView$ScaleType r0 = r3.mSavedScaleType
            if (r0 != 0) goto L1a
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r3.mViewHolder
            android.widget.ImageView r0 = r0.mImageView
            android.widget.ImageView$ScaleType r1 = r0.getScaleType()
            r3.mSavedScaleType = r1
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
            if (r1 != r2) goto L17
            android.graphics.Matrix r0 = r0.getMatrix()
            goto L18
        L17:
            r0 = 0
        L18:
            r3.mSavedMatrix = r0
        L1a:
            return
    }

    private static void updateImageViewAfterScaleTypeChange(android.widget.ImageView r4) {
            int r0 = r4.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = r4.getMeasuredHeight()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r4.measure(r0, r1)
            int r0 = r4.getLeft()
            int r1 = r4.getTop()
            int r2 = r4.getRight()
            int r3 = r4.getBottom()
            r4.layout(r0, r1, r2, r3)
            return
    }

    @Override // androidx.core.app.SharedElementCallback
    public void onSharedElementEnd(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            int r1 = r2.size()
            r3 = 1
            if (r1 >= r3) goto L8
            return
        L8:
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r3 = r0.mViewHolder
            if (r3 == 0) goto L42
            android.widget.FrameLayout r3 = r3.mOverviewFrame
            if (r3 == r2) goto L18
            goto L42
        L18:
            r0.restoreImageViewScale()
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r0.mViewHolder
            androidx.leanback.widget.HorizontalGridView r2 = r2.mActionsRow
            r3 = 131072(0x20000, float:1.83671E-40)
            r2.setDescendantFocusability(r3)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r0.mViewHolder
            androidx.leanback.widget.HorizontalGridView r2 = r2.mActionsRow
            r2.setVisibility(r1)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r0.mViewHolder
            androidx.leanback.widget.HorizontalGridView r2 = r2.mActionsRow
            r3 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r3)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r0.mViewHolder
            androidx.leanback.widget.HorizontalGridView r2 = r2.mActionsRow
            r2.requestFocus()
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r0.mViewHolder
            android.widget.FrameLayout r2 = r2.mDetailsDescriptionFrame
            r2.setVisibility(r1)
        L42:
            return
    }

    @Override // androidx.core.app.SharedElementCallback
    public void onSharedElementStart(java.util.List<java.lang.String> r5, java.util.List<android.view.View> r6, java.util.List<android.view.View> r7) {
            r4 = this;
            int r5 = r6.size()
            r0 = 1
            if (r5 >= r0) goto L8
            return
        L8:
            r5 = 0
            java.lang.Object r6 = r6.get(r5)
            android.view.View r6 = (android.view.View) r6
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r4.mViewHolder
            if (r0 == 0) goto L88
            android.widget.FrameLayout r0 = r0.mOverviewFrame
            if (r0 == r6) goto L18
            goto L88
        L18:
            java.lang.Object r7 = r7.get(r5)
            android.view.View r7 = (android.view.View) r7
            boolean r0 = r4.hasImageViewScaleChange(r7)
            if (r0 == 0) goto L2a
            r4.saveImageViewScale()
            r4.changeImageViewScale(r7)
        L2a:
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r7 = r4.mViewHolder
            android.widget.ImageView r7 = r7.mImageView
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
            r7.measure(r2, r3)
            r7.layout(r5, r5, r0, r6)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r5 = r4.mViewHolder
            android.view.ViewGroup r5 = r5.mRightPanel
            int r6 = r4.mRightPanelWidth
            if (r6 == 0) goto L71
            int r7 = r4.mRightPanelHeight
            if (r7 == 0) goto L71
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
            int r7 = r4.mRightPanelHeight
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            r5.measure(r6, r7)
            int r6 = r5.getTop()
            int r7 = r4.mRightPanelWidth
            int r7 = r7 + r0
            int r1 = r5.getTop()
            int r2 = r4.mRightPanelHeight
            int r1 = r1 + r2
            r5.layout(r0, r6, r7, r1)
            goto L79
        L71:
            int r6 = r5.getLeft()
            int r0 = r0 - r6
            r5.offsetLeftAndRight(r0)
        L79:
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r5 = r4.mViewHolder
            androidx.leanback.widget.HorizontalGridView r5 = r5.mActionsRow
            r6 = 4
            r5.setVisibility(r6)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r5 = r4.mViewHolder
            android.widget.FrameLayout r5 = r5.mDetailsDescriptionFrame
            r5.setVisibility(r6)
        L88:
            return
    }
}
