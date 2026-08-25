package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMediaItemPresenter extends androidx.leanback.widget.RowPresenter {
    public static final int PLAY_STATE_INITIAL = 0;
    public static final int PLAY_STATE_PAUSED = 1;
    public static final int PLAY_STATE_PLAYING = 2;
    public static final android.graphics.Rect sTempRect = null;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private androidx.leanback.widget.Presenter mMediaItemActionPresenter;
    private boolean mMediaRowSeparator;
    private int mThemeId;


    /* JADX INFO: loaded from: classes3.dex */
    public static class ViewHolder extends androidx.leanback.widget.RowPresenter.ViewHolder {
        private final java.util.List<androidx.leanback.widget.Presenter.ViewHolder> mActionViewHolders;
        public android.animation.ValueAnimator mFocusViewAnimator;
        private final android.view.ViewGroup mMediaItemActionsContainer;
        private final android.view.View mMediaItemDetailsView;
        private final android.widget.TextView mMediaItemDurationView;
        private final android.widget.TextView mMediaItemNameView;
        public final android.widget.TextView mMediaItemNumberView;
        public final android.widget.ViewFlipper mMediaItemNumberViewFlipper;
        public final android.view.View mMediaItemPausedView;
        public final android.view.View mMediaItemPlayingView;
        public androidx.leanback.widget.MultiActionsProvider.MultiAction[] mMediaItemRowActions;
        private final android.view.View mMediaItemRowSeparator;
        public final android.view.View mMediaRowView;
        public androidx.leanback.widget.AbstractMediaItemPresenter mRowPresenter;
        public final android.view.View mSelectorView;





        public ViewHolder(android.view.View r6) {
                r5 = this;
                r5.<init>(r6)
                int r0 = androidx.leanback.R.id.mediaRowSelector
                android.view.View r0 = r6.findViewById(r0)
                r5.mSelectorView = r0
                int r0 = androidx.leanback.R.id.mediaItemRow
                android.view.View r0 = r6.findViewById(r0)
                r5.mMediaRowView = r0
                int r0 = androidx.leanback.R.id.mediaItemDetails
                android.view.View r0 = r6.findViewById(r0)
                r5.mMediaItemDetailsView = r0
                int r0 = androidx.leanback.R.id.mediaItemName
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.mMediaItemNameView = r0
                int r0 = androidx.leanback.R.id.mediaItemDuration
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.mMediaItemDurationView = r0
                int r0 = androidx.leanback.R.id.mediaRowSeparator
                android.view.View r0 = r6.findViewById(r0)
                r5.mMediaItemRowSeparator = r0
                int r0 = androidx.leanback.R.id.mediaItemActionsContainer
                android.view.View r0 = r6.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r5.mMediaItemActionsContainer = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mActionViewHolders = r0
                android.view.View r0 = r5.getMediaItemDetailsView()
                androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$1 r1 = new androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$1
                r1.<init>(r5)
                r0.setOnClickListener(r1)
                android.view.View r0 = r5.getMediaItemDetailsView()
                androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$2 r1 = new androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$2
                r1.<init>(r5)
                r0.setOnFocusChangeListener(r1)
                int r0 = androidx.leanback.R.id.mediaItemNumberViewFlipper
                android.view.View r0 = r6.findViewById(r0)
                android.widget.ViewFlipper r0 = (android.widget.ViewFlipper) r0
                r5.mMediaItemNumberViewFlipper = r0
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.Context r2 = r6.getContext()
                android.content.res.Resources$Theme r2 = r2.getTheme()
                int r3 = androidx.leanback.R.attr.playbackMediaItemNumberViewFlipperLayout
                r4 = 1
                boolean r2 = r2.resolveAttribute(r3, r1, r4)
                android.content.Context r6 = r6.getContext()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                if (r2 == 0) goto L8b
                int r1 = r1.resourceId
                goto L8d
            L8b:
                int r1 = androidx.leanback.R.layout.lb_media_item_number_view_flipper
            L8d:
                android.view.View r6 = r6.inflate(r1, r0, r4)
                int r0 = androidx.leanback.R.id.initial
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.mMediaItemNumberView = r0
                int r0 = androidx.leanback.R.id.paused
                android.view.View r0 = r6.findViewById(r0)
                r5.mMediaItemPausedView = r0
                int r0 = androidx.leanback.R.id.playing
                android.view.View r6 = r6.findViewById(r0)
                r5.mMediaItemPlayingView = r6
                return
        }

        public android.view.ViewGroup getMediaItemActionsContainer() {
                r1 = this;
                android.view.ViewGroup r0 = r1.mMediaItemActionsContainer
                return r0
        }

        public android.view.View getMediaItemDetailsView() {
                r1 = this;
                android.view.View r0 = r1.mMediaItemDetailsView
                return r0
        }

        public android.widget.TextView getMediaItemDurationView() {
                r1 = this;
                android.widget.TextView r0 = r1.mMediaItemDurationView
                return r0
        }

        public android.widget.TextView getMediaItemNameView() {
                r1 = this;
                android.widget.TextView r0 = r1.mMediaItemNameView
                return r0
        }

        public android.widget.TextView getMediaItemNumberView() {
                r1 = this;
                android.widget.TextView r0 = r1.mMediaItemNumberView
                return r0
        }

        public android.widget.ViewFlipper getMediaItemNumberViewFlipper() {
                r1 = this;
                android.widget.ViewFlipper r0 = r1.mMediaItemNumberViewFlipper
                return r0
        }

        public android.view.View getMediaItemPausedView() {
                r1 = this;
                android.view.View r0 = r1.mMediaItemPausedView
                return r0
        }

        public android.view.View getMediaItemPlayingView() {
                r1 = this;
                android.view.View r0 = r1.mMediaItemPlayingView
                return r0
        }

        public androidx.leanback.widget.MultiActionsProvider.MultiAction[] getMediaItemRowActions() {
                r1 = this;
                androidx.leanback.widget.MultiActionsProvider$MultiAction[] r0 = r1.mMediaItemRowActions
                return r0
        }

        public android.view.View getMediaItemRowSeparator() {
                r1 = this;
                android.view.View r0 = r1.mMediaItemRowSeparator
                return r0
        }

        public android.view.View getSelectorView() {
                r1 = this;
                android.view.View r0 = r1.mSelectorView
                return r0
        }

        public void notifyActionChanged(androidx.leanback.widget.MultiActionsProvider.MultiAction r5) {
                r4 = this;
                androidx.leanback.widget.AbstractMediaItemPresenter r0 = r4.mRowPresenter
                androidx.leanback.widget.Presenter r0 = r0.getActionPresenter()
                if (r0 != 0) goto L9
                return
            L9:
                androidx.leanback.widget.MultiActionsProvider$MultiAction[] r1 = r4.mMediaItemRowActions
                if (r1 == 0) goto L1b
                r1 = 0
            Le:
                androidx.leanback.widget.MultiActionsProvider$MultiAction[] r2 = r4.mMediaItemRowActions
                int r3 = r2.length
                if (r1 >= r3) goto L1b
                r2 = r2[r1]
                if (r2 != r5) goto L18
                goto L1c
            L18:
                int r1 = r1 + 1
                goto Le
            L1b:
                r1 = -1
            L1c:
                if (r1 < 0) goto L2c
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r2 = r4.mActionViewHolders
                java.lang.Object r1 = r2.get(r1)
                androidx.leanback.widget.Presenter$ViewHolder r1 = (androidx.leanback.widget.Presenter.ViewHolder) r1
                r0.onUnbindViewHolder(r1)
                r0.onBindViewHolder(r1, r5)
            L2c:
                return
        }

        public void notifyDetailsChanged() {
                r1 = this;
                androidx.leanback.widget.AbstractMediaItemPresenter r0 = r1.mRowPresenter
                java.util.Objects.requireNonNull(r0)
                androidx.leanback.widget.AbstractMediaItemPresenter r0 = r1.mRowPresenter
                r1.getRowObject()
                r0.onBindMediaDetails()
                return
        }

        public void notifyPlayStateChanged() {
                r1 = this;
                androidx.leanback.widget.AbstractMediaItemPresenter r0 = r1.mRowPresenter
                r0.onBindMediaPlayState(r1)
                return
        }

        public void onBindRowActions() {
                r6 = this;
                android.view.ViewGroup r0 = r6.getMediaItemActionsContainer()
                int r0 = r0.getChildCount()
                int r0 = r0 + (-1)
            La:
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r1 = r6.mActionViewHolders
                int r1 = r1.size()
                if (r0 < r1) goto L21
                android.view.ViewGroup r1 = r6.getMediaItemActionsContainer()
                r1.removeViewAt(r0)
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r1 = r6.mActionViewHolders
                r1.remove(r0)
                int r0 = r0 + (-1)
                goto La
            L21:
                r0 = 0
                r6.mMediaItemRowActions = r0
                java.lang.Object r0 = r6.getRowObject()
                boolean r1 = r0 instanceof androidx.leanback.widget.MultiActionsProvider
                if (r1 == 0) goto L90
                androidx.leanback.widget.MultiActionsProvider r0 = (androidx.leanback.widget.MultiActionsProvider) r0
                androidx.leanback.widget.MultiActionsProvider$MultiAction[] r0 = r0.getActions()
                androidx.leanback.widget.AbstractMediaItemPresenter r1 = r6.mRowPresenter
                androidx.leanback.widget.Presenter r1 = r1.getActionPresenter()
                if (r1 != 0) goto L3b
                return
            L3b:
                r6.mMediaItemRowActions = r0
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r2 = r6.mActionViewHolders
                int r2 = r2.size()
            L43:
                int r3 = r0.length
                if (r2 >= r3) goto L73
                android.view.ViewGroup r3 = r6.getMediaItemActionsContainer()
                androidx.leanback.widget.Presenter$ViewHolder r3 = r1.onCreateViewHolder(r3)
                android.view.ViewGroup r4 = r6.getMediaItemActionsContainer()
                android.view.View r5 = r3.view
                r4.addView(r5)
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r4 = r6.mActionViewHolders
                r4.add(r3)
                android.view.View r4 = r3.view
                androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$3 r5 = new androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$3
                r5.<init>(r6)
                r4.setOnFocusChangeListener(r5)
                android.view.View r4 = r3.view
                androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$4 r5 = new androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder$4
                r5.<init>(r6, r3, r2)
                r4.setOnClickListener(r5)
                int r2 = r2 + 1
                goto L43
            L73:
                android.view.ViewGroup r2 = r6.mMediaItemActionsContainer
                if (r2 == 0) goto L90
                r2 = 0
            L78:
                int r3 = r0.length
                if (r2 >= r3) goto L90
                java.util.List<androidx.leanback.widget.Presenter$ViewHolder> r3 = r6.mActionViewHolders
                java.lang.Object r3 = r3.get(r2)
                androidx.leanback.widget.Presenter$ViewHolder r3 = (androidx.leanback.widget.Presenter.ViewHolder) r3
                r1.onUnbindViewHolder(r3)
                androidx.leanback.widget.MultiActionsProvider$MultiAction[] r4 = r6.mMediaItemRowActions
                r4 = r4[r2]
                r1.onBindViewHolder(r3, r4)
                int r2 = r2 + 1
                goto L78
            L90:
                return
        }

        public void setSelectedMediaItemNumberView(int r2) {
                r1 = this;
                if (r2 < 0) goto Lf
                android.widget.ViewFlipper r0 = r1.mMediaItemNumberViewFlipper
                int r0 = r0.getChildCount()
                if (r2 >= r0) goto Lf
                android.widget.ViewFlipper r0 = r1.mMediaItemNumberViewFlipper
                r0.setDisplayedChild(r2)
            Lf:
                return
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.leanback.widget.AbstractMediaItemPresenter.sTempRect = r0
            return
    }

    public AbstractMediaItemPresenter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public AbstractMediaItemPresenter(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBackgroundColor = r0
            androidx.leanback.widget.MediaItemActionPresenter r0 = new androidx.leanback.widget.MediaItemActionPresenter
            r0.<init>()
            r1.mMediaItemActionPresenter = r0
            r1.mThemeId = r2
            r2 = 0
            r1.setHeaderPresenter(r2)
            return
    }

    public static android.animation.ValueAnimator updateSelector(android.view.View r16, android.view.View r17, android.animation.ValueAnimator r18, boolean r19) {
            android.content.Context r0 = r17.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 17694720(0x10e0000, float:2.608128E-38)
            int r0 = r0.getInteger(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r16)
            boolean r3 = r17.hasFocus()
            r4 = 0
            if (r3 != 0) goto L3a
            android.view.ViewPropertyAnimator r2 = r16.animate()
            r2.cancel()
            android.view.ViewPropertyAnimator r2 = r16.animate()
            android.view.ViewPropertyAnimator r2 = r2.alpha(r4)
            long r3 = (long) r0
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r3)
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
            return r18
        L3a:
            if (r18 == 0) goto L41
            r18.cancel()
            r3 = 0
            goto L43
        L41:
            r3 = r18
        L43:
            float r5 = r16.getAlpha()
            android.view.ViewPropertyAnimator r6 = r16.animate()
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            long r7 = (long) r0
            android.view.ViewPropertyAnimator r0 = r6.setDuration(r7)
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
            android.view.ViewGroup$LayoutParams r0 = r16.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            android.view.ViewParent r0 = r16.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.graphics.Rect r6 = androidx.leanback.widget.AbstractMediaItemPresenter.sTempRect
            int r9 = r17.getWidth()
            int r11 = r17.getHeight()
            r12 = 0
            r6.set(r12, r12, r9, r11)
            r9 = r17
            r0.offsetDescendantRectToMyCoords(r9, r6)
            r9 = 2
            if (r19 == 0) goto Laa
            r11 = 1
            if (r2 != r11) goto L97
            int r2 = r6.right
            int r11 = r0.getHeight()
            int r11 = r11 + r2
            r6.right = r11
            int r2 = r6.left
            int r0 = r0.getHeight()
            int r0 = r0 / r9
            int r2 = r2 - r0
            r6.left = r2
            goto Laa
        L97:
            int r2 = r6.left
            int r11 = r0.getHeight()
            int r2 = r2 - r11
            r6.left = r2
            int r2 = r6.right
            int r0 = r0.getHeight()
            int r0 = r0 / r9
            int r0 = r0 + r2
            r6.right = r0
        Laa:
            int r11 = r6.left
            int r13 = r6.width()
            int r0 = r10.width
            int r0 = r0 - r13
            float r14 = (float) r0
            int r0 = r10.leftMargin
            int r0 = r0 - r11
            float r12 = (float) r0
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc1
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc1
            goto Lea
        Lc1:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto Lcd
            r10.width = r13
            r10.leftMargin = r11
            r16.requestLayout()
            goto Lea
        Lcd:
            float[] r0 = new float[r9]
            r0 = {x00ec: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r3.setDuration(r7)
            r3.setInterpolator(r1)
            androidx.leanback.widget.AbstractMediaItemPresenter$1 r0 = new androidx.leanback.widget.AbstractMediaItemPresenter$1
            r9 = r0
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.addUpdateListener(r0)
            r3.start()
        Lea:
            return r3
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = r3.mThemeId
            if (r1 == 0) goto L10
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r2 = r3.mThemeId
            r1.<init>(r0, r2)
            r0 = r1
        L10:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_row_media_item
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder r0 = new androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder
            r0.<init>(r4)
            r0.mRowPresenter = r3
            boolean r4 = r3.mBackgroundColorSet
            if (r4 == 0) goto L2d
            android.view.View r4 = r0.mMediaRowView
            int r1 = r3.mBackgroundColor
            r4.setBackgroundColor(r1)
        L2d:
            return r0
    }

    public androidx.leanback.widget.Presenter getActionPresenter() {
            r1 = this;
            androidx.leanback.widget.Presenter r0 = r1.mMediaItemActionPresenter
            return r0
    }

    public int getThemeId() {
            r1 = this;
            int r0 = r1.mThemeId
            return r0
    }

    public boolean hasMediaRowSeparator() {
            r1 = this;
            boolean r0 = r1.mMediaRowSeparator
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void onBindMediaDetails();

    public void onBindMediaPlayState(androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder r4) {
            r3 = this;
            androidx.leanback.widget.AbstractMediaItemPresenter r0 = r4.mRowPresenter
            r4.getRowObject()
            java.util.Objects.requireNonNull(r0)
            android.widget.TextView r0 = r4.mMediaItemNumberView
            r1 = -1
            if (r0 != 0) goto Lf
            r0 = -1
            goto L15
        Lf:
            android.widget.ViewFlipper r2 = r4.mMediaItemNumberViewFlipper
            int r0 = r2.indexOfChild(r0)
        L15:
            if (r0 == r1) goto L24
            android.widget.ViewFlipper r1 = r4.mMediaItemNumberViewFlipper
            int r1 = r1.getDisplayedChild()
            if (r1 == r0) goto L24
            android.widget.ViewFlipper r4 = r4.mMediaItemNumberViewFlipper
            r4.setDisplayedChild(r0)
        L24:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r2, java.lang.Object r3) {
            r1 = this;
            super.onBindRowViewHolder(r2, r3)
            androidx.leanback.widget.AbstractMediaItemPresenter$ViewHolder r2 = (androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder) r2
            r2.onBindRowActions()
            android.view.View r3 = r2.getMediaItemRowSeparator()
            boolean r0 = r1.hasMediaRowSeparator()
            if (r0 == 0) goto L14
            r0 = 0
            goto L16
        L14:
            r0 = 8
        L16:
            r3.setVisibility(r0)
            r1.onBindMediaPlayState(r2)
            r1.onBindMediaDetails()
            return
    }

    public void onUnbindMediaPlayState(androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder r1) {
            r0 = this;
            return
    }

    public void setActionPresenter(androidx.leanback.widget.Presenter r1) {
            r0 = this;
            r0.mMediaItemActionPresenter = r1
            return
    }

    public void setBackgroundColor(int r2) {
            r1 = this;
            r0 = 1
            r1.mBackgroundColorSet = r0
            r1.mBackgroundColor = r2
            return
    }

    public void setHasMediaRowSeparator(boolean r1) {
            r0 = this;
            r0.mMediaRowSeparator = r1
            return
    }

    public void setThemeId(int r1) {
            r0 = this;
            r0.mThemeId = r1
            return
    }
}
