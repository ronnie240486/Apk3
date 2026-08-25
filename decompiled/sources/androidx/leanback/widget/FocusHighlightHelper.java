package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class FocusHighlightHelper {

    /* JADX INFO: loaded from: classes2.dex */
    public static class BrowseItemFocusHighlight implements androidx.leanback.widget.FocusHighlightHandler {
        private static final int DURATION_MS = 150;
        private int mScaleIndex;
        private final boolean mUseDimmer;

        public BrowseItemFocusHighlight(int r2, boolean r3) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto Le
                int r0 = androidx.leanback.widget.FocusHighlightHelper.getResId(r2)
                if (r0 <= 0) goto Lc
                goto Le
            Lc:
                r0 = 0
                goto Lf
            Le:
                r0 = 1
            Lf:
                if (r0 == 0) goto L16
                r1.mScaleIndex = r2
                r1.mUseDimmer = r3
                return
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Unhandled zoom index"
                r2.<init>(r3)
                throw r2
        }

        private androidx.leanback.widget.FocusHighlightHelper.FocusAnimator getOrCreateAnimator(android.view.View r6) {
                r5 = this;
                int r0 = androidx.leanback.R.id.lb_focus_animator
                java.lang.Object r1 = r6.getTag(r0)
                androidx.leanback.widget.FocusHighlightHelper$FocusAnimator r1 = (androidx.leanback.widget.FocusHighlightHelper.FocusAnimator) r1
                if (r1 != 0) goto L1e
                androidx.leanback.widget.FocusHighlightHelper$FocusAnimator r1 = new androidx.leanback.widget.FocusHighlightHelper$FocusAnimator
                android.content.res.Resources r2 = r6.getResources()
                float r2 = r5.getScale(r2)
                boolean r3 = r5.mUseDimmer
                r4 = 150(0x96, float:2.1E-43)
                r1.<init>(r6, r2, r3, r4)
                r6.setTag(r0, r1)
            L1e:
                return r1
        }

        private float getScale(android.content.res.Resources r3) {
                r2 = this;
                int r0 = r2.mScaleIndex
                if (r0 != 0) goto L7
                r3 = 1065353216(0x3f800000, float:1.0)
                goto L10
            L7:
                int r0 = androidx.leanback.widget.FocusHighlightHelper.getResId(r0)
                r1 = 1
                float r3 = r3.getFraction(r0, r1, r1)
            L10:
                return r3
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onInitializeView(android.view.View r3) {
                r2 = this;
                androidx.leanback.widget.FocusHighlightHelper$FocusAnimator r3 = r2.getOrCreateAnimator(r3)
                r0 = 0
                r1 = 1
                r3.animateFocus(r0, r1)
                return
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onItemFocused(android.view.View r2, boolean r3) {
                r1 = this;
                r2.setSelected(r3)
                androidx.leanback.widget.FocusHighlightHelper$FocusAnimator r2 = r1.getOrCreateAnimator(r2)
                r0 = 0
                r2.animateFocus(r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class FocusAnimator implements android.animation.TimeAnimator.TimeListener {
        private final android.animation.TimeAnimator mAnimator;
        private final androidx.leanback.graphics.ColorOverlayDimmer mDimmer;
        private final int mDuration;
        private float mFocusLevel;
        private float mFocusLevelDelta;
        private float mFocusLevelStart;
        private final android.view.animation.Interpolator mInterpolator;
        private final float mScaleDiff;
        private final android.view.View mView;
        private final androidx.leanback.widget.ShadowOverlayContainer mWrapper;

        public FocusAnimator(android.view.View r3, float r4, boolean r5, int r6) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mFocusLevel = r0
                android.animation.TimeAnimator r0 = new android.animation.TimeAnimator
                r0.<init>()
                r2.mAnimator = r0
                android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
                r1.<init>()
                r2.mInterpolator = r1
                r2.mView = r3
                r2.mDuration = r6
                r6 = 1065353216(0x3f800000, float:1.0)
                float r4 = r4 - r6
                r2.mScaleDiff = r4
                boolean r4 = r3 instanceof androidx.leanback.widget.ShadowOverlayContainer
                r6 = 0
                if (r4 == 0) goto L28
                r4 = r3
                androidx.leanback.widget.ShadowOverlayContainer r4 = (androidx.leanback.widget.ShadowOverlayContainer) r4
                r2.mWrapper = r4
                goto L2a
            L28:
                r2.mWrapper = r6
            L2a:
                r0.setTimeListener(r2)
                if (r5 == 0) goto L3a
                android.content.Context r3 = r3.getContext()
                androidx.leanback.graphics.ColorOverlayDimmer r3 = androidx.leanback.graphics.ColorOverlayDimmer.createDefault(r3)
                r2.mDimmer = r3
                goto L3c
            L3a:
                r2.mDimmer = r6
            L3c:
                return
        }

        public final void animateFocus(boolean r2, boolean r3) {
                r1 = this;
                android.animation.TimeAnimator r0 = r1.mAnimator
                r0.end()
                if (r2 == 0) goto La
                r2 = 1065353216(0x3f800000, float:1.0)
                goto Lb
            La:
                r2 = 0
            Lb:
                if (r3 == 0) goto L11
                r1.setFocusLevel(r2)
                goto L21
            L11:
                float r3 = r1.mFocusLevel
                int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r0 == 0) goto L21
                r1.mFocusLevelStart = r3
                float r2 = r2 - r3
                r1.mFocusLevelDelta = r2
                android.animation.TimeAnimator r2 = r1.mAnimator
                r2.start()
            L21:
                return
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(android.animation.TimeAnimator r2, long r3, long r5) {
                r1 = this;
                int r2 = r1.mDuration
                long r5 = (long) r2
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto Lf
                r2 = 1065353216(0x3f800000, float:1.0)
                android.animation.TimeAnimator r3 = r1.mAnimator
                r3.end()
                goto L13
            Lf:
                double r3 = (double) r3
                double r5 = (double) r2
                double r3 = r3 / r5
                float r2 = (float) r3
            L13:
                android.view.animation.Interpolator r3 = r1.mInterpolator
                if (r3 == 0) goto L1b
                float r2 = r3.getInterpolation(r2)
            L1b:
                float r3 = r1.mFocusLevelStart
                float r4 = r1.mFocusLevelDelta
                float r2 = r2 * r4
                float r2 = r2 + r3
                r1.setFocusLevel(r2)
                return
        }

        public void setFocusLevel(float r3) {
                r2 = this;
                r2.mFocusLevel = r3
                float r0 = r2.mScaleDiff
                float r0 = r0 * r3
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 + r1
                android.view.View r1 = r2.mView
                r1.setScaleX(r0)
                android.view.View r1 = r2.mView
                r1.setScaleY(r0)
                androidx.leanback.widget.ShadowOverlayContainer r0 = r2.mWrapper
                if (r0 == 0) goto L1b
                r0.setShadowFocusLevel(r3)
                goto L20
            L1b:
                android.view.View r0 = r2.mView
                androidx.leanback.widget.ShadowOverlayHelper.setNoneWrapperShadowFocusLevel(r0, r3)
            L20:
                androidx.leanback.graphics.ColorOverlayDimmer r0 = r2.mDimmer
                if (r0 == 0) goto L3e
                r0.setActiveLevel(r3)
                androidx.leanback.graphics.ColorOverlayDimmer r3 = r2.mDimmer
                android.graphics.Paint r3 = r3.getPaint()
                int r3 = r3.getColor()
                androidx.leanback.widget.ShadowOverlayContainer r0 = r2.mWrapper
                if (r0 == 0) goto L39
                r0.setOverlayColor(r3)
                goto L3e
            L39:
                android.view.View r0 = r2.mView
                androidx.leanback.widget.ShadowOverlayHelper.setNoneWrapperOverlayColor(r0, r3)
            L3e:
                return
        }
    }

    public static class HeaderItemFocusHighlight implements androidx.leanback.widget.FocusHighlightHandler {
        private int mDuration;
        private boolean mInitialized;
        public boolean mScaleEnabled;
        private float mSelectScale;

        /* JADX INFO: loaded from: classes3.dex */
        public static class HeaderFocusAnimator extends androidx.leanback.widget.FocusHighlightHelper.FocusAnimator {
            public androidx.leanback.widget.ItemBridgeAdapter.ViewHolder mViewHolder;

            public HeaderFocusAnimator(android.view.View r2, float r3, int r4) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r4)
                    android.view.ViewParent r3 = r2.getParent()
                L8:
                    if (r3 == 0) goto L14
                    boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView
                    if (r4 == 0) goto Lf
                    goto L14
                Lf:
                    android.view.ViewParent r3 = r3.getParent()
                    goto L8
                L14:
                    if (r3 == 0) goto L20
                    androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
                    androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r3.getChildViewHolder(r2)
                    androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
                    r1.mViewHolder = r2
                L20:
                    return
            }

            @Override // androidx.leanback.widget.FocusHighlightHelper.FocusAnimator
            public final void setFocusLevel(float r3) {
                    r2 = this;
                    androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = r2.mViewHolder
                    androidx.leanback.widget.Presenter r0 = r0.getPresenter()
                    boolean r1 = r0 instanceof androidx.leanback.widget.RowHeaderPresenter
                    if (r1 == 0) goto L17
                    androidx.leanback.widget.RowHeaderPresenter r0 = (androidx.leanback.widget.RowHeaderPresenter) r0
                    androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r1 = r2.mViewHolder
                    androidx.leanback.widget.Presenter$ViewHolder r1 = r1.getViewHolder()
                    androidx.leanback.widget.RowHeaderPresenter$ViewHolder r1 = (androidx.leanback.widget.RowHeaderPresenter.ViewHolder) r1
                    r0.setSelectLevel(r1, r3)
                L17:
                    super.setFocusLevel(r3)
                    return
            }
        }

        public HeaderItemFocusHighlight(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.mScaleEnabled = r1
                return
        }

        private void viewFocused(android.view.View r5, boolean r6) {
                r4 = this;
                boolean r0 = r4.mInitialized
                if (r0 != 0) goto L2d
                android.content.res.Resources r0 = r5.getResources()
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                boolean r2 = r4.mScaleEnabled
                r3 = 1
                if (r2 == 0) goto L1e
                int r2 = androidx.leanback.R.dimen.lb_browse_header_select_scale
                r0.getValue(r2, r1, r3)
                float r2 = r1.getFloat()
                r4.mSelectScale = r2
                goto L22
            L1e:
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.mSelectScale = r2
            L22:
                int r2 = androidx.leanback.R.dimen.lb_browse_header_select_duration
                r0.getValue(r2, r1, r3)
                int r0 = r1.data
                r4.mDuration = r0
                r4.mInitialized = r3
            L2d:
                r5.setSelected(r6)
                int r0 = androidx.leanback.R.id.lb_focus_animator
                java.lang.Object r1 = r5.getTag(r0)
                androidx.leanback.widget.FocusHighlightHelper$FocusAnimator r1 = (androidx.leanback.widget.FocusHighlightHelper.FocusAnimator) r1
                if (r1 != 0) goto L46
                androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight$HeaderFocusAnimator r1 = new androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight$HeaderFocusAnimator
                float r2 = r4.mSelectScale
                int r3 = r4.mDuration
                r1.<init>(r5, r2, r3)
                r5.setTag(r0, r1)
            L46:
                r5 = 0
                r1.animateFocus(r6, r5)
                return
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onInitializeView(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.leanback.widget.FocusHighlightHandler
        public void onItemFocused(android.view.View r1, boolean r2) {
                r0 = this;
                r0.viewFocused(r1, r2)
                return
        }
    }

    @java.lang.Deprecated
    public FocusHighlightHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getResId(int r1) {
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L11
            r0 = 4
            if (r1 == r0) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = androidx.leanback.R.fraction.lb_focus_zoom_factor_xsmall
            return r1
        L11:
            int r1 = androidx.leanback.R.fraction.lb_focus_zoom_factor_large
            return r1
        L14:
            int r1 = androidx.leanback.R.fraction.lb_focus_zoom_factor_medium
            return r1
        L17:
            int r1 = androidx.leanback.R.fraction.lb_focus_zoom_factor_small
            return r1
    }

    public static void setupBrowseItemFocusHighlight(androidx.leanback.widget.ItemBridgeAdapter r1, int r2, boolean r3) {
            androidx.leanback.widget.FocusHighlightHelper$BrowseItemFocusHighlight r0 = new androidx.leanback.widget.FocusHighlightHelper$BrowseItemFocusHighlight
            r0.<init>(r2, r3)
            r1.mFocusHighlight = r0
            return
    }

    public static void setupHeaderItemFocusHighlight(androidx.leanback.widget.ItemBridgeAdapter r1) {
            r0 = 1
            setupHeaderItemFocusHighlight(r1, r0)
            return
    }

    public static void setupHeaderItemFocusHighlight(androidx.leanback.widget.ItemBridgeAdapter r1, boolean r2) {
            androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight r0 = new androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight
            r0.<init>(r2)
            r1.mFocusHighlight = r0
            return
    }

    @java.lang.Deprecated
    public static void setupHeaderItemFocusHighlight(androidx.leanback.widget.VerticalGridView r1) {
            r0 = 1
            setupHeaderItemFocusHighlight(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void setupHeaderItemFocusHighlight(androidx.leanback.widget.VerticalGridView r1, boolean r2) {
            if (r1 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.getAdapter()
            boolean r0 = r0 instanceof androidx.leanback.widget.ItemBridgeAdapter
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            androidx.leanback.widget.ItemBridgeAdapter r1 = (androidx.leanback.widget.ItemBridgeAdapter) r1
            androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight r0 = new androidx.leanback.widget.FocusHighlightHelper$HeaderItemFocusHighlight
            r0.<init>(r2)
            r1.mFocusHighlight = r0
        L17:
            return
    }
}
