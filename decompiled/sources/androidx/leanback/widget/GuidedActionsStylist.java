package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class GuidedActionsStylist implements androidx.leanback.widget.FragmentAnimationProvider {
    private static final java.lang.String TAG = "GuidedActionsStylist";
    public static final int VIEW_TYPE_DATE_PICKER = 1;
    public static final int VIEW_TYPE_DEFAULT = 0;
    public static final androidx.leanback.widget.ItemAlignmentFacet sGuidedActionItemAlignFacet = null;
    private androidx.leanback.widget.VerticalGridView mActionsGridView;
    private boolean mBackToCollapseActivatorView;
    private boolean mBackToCollapseSubActions;
    private android.view.View mBgView;
    private boolean mButtonActions;
    private android.view.View mContentView;
    private int mDescriptionMinLines;
    private float mDisabledChevronAlpha;
    private float mDisabledDescriptionAlpha;
    private float mDisabledTextAlpha;
    private int mDisplayHeight;
    private androidx.leanback.widget.GuidedActionAdapter.EditListener mEditListener;
    private float mEnabledChevronAlpha;
    private float mEnabledDescriptionAlpha;
    private float mEnabledTextAlpha;
    public java.lang.Object mExpandTransition;
    public androidx.leanback.widget.GuidedAction mExpandedAction;
    private float mKeyLinePercent;
    public android.view.ViewGroup mMainView;
    private android.view.View mSubActionsBackground;
    public androidx.leanback.widget.VerticalGridView mSubActionsGridView;
    private int mTitleMaxLines;
    private int mTitleMinLines;
    private int mVerticalPadding;








    /* JADX INFO: loaded from: classes3.dex */
    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements androidx.leanback.widget.FacetProvider {
        public androidx.leanback.widget.GuidedAction mAction;
        public android.view.View mActivatorView;
        public android.widget.ImageView mCheckmarkView;
        public android.widget.ImageView mChevronView;
        private android.view.View mContentView;
        public android.widget.TextView mDescriptionView;
        public int mEditingMode;
        public android.widget.ImageView mIconView;
        private final boolean mIsSubAction;
        public android.animation.Animator mPressAnimator;
        public android.widget.TextView mTitleView;



        public ViewHolder(android.view.View r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public ViewHolder(android.view.View r3, boolean r4) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mEditingMode = r0
                androidx.leanback.widget.GuidedActionsStylist$ViewHolder$1 r0 = new androidx.leanback.widget.GuidedActionsStylist$ViewHolder$1
                r0.<init>(r2)
                int r1 = androidx.leanback.R.id.guidedactions_item_content
                android.view.View r1 = r3.findViewById(r1)
                r2.mContentView = r1
                int r1 = androidx.leanback.R.id.guidedactions_item_title
                android.view.View r1 = r3.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2.mTitleView = r1
                int r1 = androidx.leanback.R.id.guidedactions_activator_item
                android.view.View r1 = r3.findViewById(r1)
                r2.mActivatorView = r1
                int r1 = androidx.leanback.R.id.guidedactions_item_description
                android.view.View r1 = r3.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2.mDescriptionView = r1
                int r1 = androidx.leanback.R.id.guidedactions_item_icon
                android.view.View r1 = r3.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r2.mIconView = r1
                int r1 = androidx.leanback.R.id.guidedactions_item_checkmark
                android.view.View r1 = r3.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r2.mCheckmarkView = r1
                int r1 = androidx.leanback.R.id.guidedactions_item_chevron
                android.view.View r1 = r3.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r2.mChevronView = r1
                r2.mIsSubAction = r4
                r3.setAccessibilityDelegate(r0)
                return
        }

        public androidx.leanback.widget.GuidedAction getAction() {
                r1 = this;
                androidx.leanback.widget.GuidedAction r0 = r1.mAction
                return r0
        }

        public android.widget.ImageView getCheckmarkView() {
                r1 = this;
                android.widget.ImageView r0 = r1.mCheckmarkView
                return r0
        }

        public android.widget.ImageView getChevronView() {
                r1 = this;
                android.widget.ImageView r0 = r1.mChevronView
                return r0
        }

        public android.view.View getContentView() {
                r1 = this;
                android.view.View r0 = r1.mContentView
                return r0
        }

        public android.widget.TextView getDescriptionView() {
                r1 = this;
                android.widget.TextView r0 = r1.mDescriptionView
                return r0
        }

        public android.widget.EditText getEditableDescriptionView() {
                r2 = this;
                android.widget.TextView r0 = r2.mDescriptionView
                boolean r1 = r0 instanceof android.widget.EditText
                if (r1 == 0) goto L9
                android.widget.EditText r0 = (android.widget.EditText) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public android.widget.EditText getEditableTitleView() {
                r2 = this;
                android.widget.TextView r0 = r2.mTitleView
                boolean r1 = r0 instanceof android.widget.EditText
                if (r1 == 0) goto L9
                android.widget.EditText r0 = (android.widget.EditText) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public android.view.View getEditingView() {
                r2 = this;
                int r0 = r2.mEditingMode
                r1 = 1
                if (r0 == r1) goto L13
                r1 = 2
                if (r0 == r1) goto L10
                r1 = 3
                if (r0 == r1) goto Ld
                r0 = 0
                return r0
            Ld:
                android.view.View r0 = r2.mActivatorView
                return r0
            L10:
                android.widget.TextView r0 = r2.mDescriptionView
                return r0
            L13:
                android.widget.TextView r0 = r2.mTitleView
                return r0
        }

        @Override // androidx.leanback.widget.FacetProvider
        public java.lang.Object getFacet(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<androidx.leanback.widget.ItemAlignmentFacet> r0 = androidx.leanback.widget.ItemAlignmentFacet.class
                if (r2 != r0) goto L7
                androidx.leanback.widget.ItemAlignmentFacet r2 = androidx.leanback.widget.GuidedActionsStylist.sGuidedActionItemAlignFacet
                return r2
            L7:
                r2 = 0
                return r2
        }

        public android.widget.ImageView getIconView() {
                r1 = this;
                android.widget.ImageView r0 = r1.mIconView
                return r0
        }

        public android.widget.TextView getTitleView() {
                r1 = this;
                android.widget.TextView r0 = r1.mTitleView
                return r0
        }

        public boolean isInEditing() {
                r1 = this;
                int r0 = r1.mEditingMode
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isInEditingActivatorView() {
                r2 = this;
                int r0 = r2.mEditingMode
                r1 = 3
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isInEditingDescription() {
                r2 = this;
                int r0 = r2.mEditingMode
                r1 = 2
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isInEditingText() {
                r3 = this;
                int r0 = r3.mEditingMode
                r1 = 1
                if (r0 == r1) goto La
                r2 = 2
                if (r0 != r2) goto L9
                goto La
            L9:
                r1 = 0
            La:
                return r1
        }

        public boolean isInEditingTitle() {
                r2 = this;
                int r0 = r2.mEditingMode
                r1 = 1
                if (r0 != r1) goto L6
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        public boolean isSubAction() {
                r1 = this;
                boolean r0 = r1.mIsSubAction
                return r0
        }

        public final void press(boolean r5) {
                r4 = this;
                android.animation.Animator r0 = r4.mPressAnimator
                if (r0 == 0) goto La
                r0.cancel()
                r0 = 0
                r4.mPressAnimator = r0
            La:
                if (r5 == 0) goto Lf
                int r5 = androidx.leanback.R.attr.guidedActionPressedAnimation
                goto L11
            Lf:
                int r5 = androidx.leanback.R.attr.guidedActionUnpressedAnimation
            L11:
                android.view.View r0 = r4.itemView
                android.content.Context r0 = r0.getContext()
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.res.Resources$Theme r2 = r0.getTheme()
                r3 = 1
                boolean r5 = r2.resolveAttribute(r5, r1, r3)
                if (r5 == 0) goto L43
                int r5 = r1.resourceId
                android.animation.Animator r5 = android.animation.AnimatorInflater.loadAnimator(r0, r5)
                r4.mPressAnimator = r5
                android.view.View r0 = r4.itemView
                r5.setTarget(r0)
                android.animation.Animator r5 = r4.mPressAnimator
                androidx.leanback.widget.GuidedActionsStylist$ViewHolder$2 r0 = new androidx.leanback.widget.GuidedActionsStylist$ViewHolder$2
                r0.<init>(r4)
                r5.addListener(r0)
                android.animation.Animator r5 = r4.mPressAnimator
                r5.start()
            L43:
                return
        }
    }

    static {
            androidx.leanback.widget.ItemAlignmentFacet r0 = new androidx.leanback.widget.ItemAlignmentFacet
            r0.<init>()
            androidx.leanback.widget.GuidedActionsStylist.sGuidedActionItemAlignFacet = r0
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef r1 = new androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef
            r1.<init>()
            int r2 = androidx.leanback.R.id.guidedactions_item_title
            r1.setItemAlignmentViewId(r2)
            r2 = 1
            r1.setAlignedToTextViewBaseline(r2)
            r3 = 0
            r1.setItemAlignmentOffset(r3)
            r1.setItemAlignmentOffsetWithPadding(r2)
            r4 = 0
            r1.setItemAlignmentOffsetPercent(r4)
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r2 = new androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[r2]
            r2[r3] = r1
            r0.setAlignmentDefs(r2)
            return
    }

    public GuidedActionsStylist() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mExpandedAction = r0
            r0 = 1
            r1.mBackToCollapseSubActions = r0
            r1.mBackToCollapseActivatorView = r0
            return
    }

    private int getDescriptionMaxHeight(android.content.Context r2, android.widget.TextView r3) {
            r1 = this;
            int r2 = r1.mDisplayHeight
            int r0 = r1.mVerticalPadding
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r0 = r1.mTitleMaxLines
            int r0 = r0 * 2
            int r3 = r3.getLineHeight()
            int r3 = r3 * r0
            int r2 = r2 - r3
            return r2
    }

    private static int getDimension(android.content.Context r2, android.util.TypedValue r3, int r4) {
            android.content.res.Resources$Theme r0 = r2.getTheme()
            r1 = 1
            r0.resolveAttribute(r4, r3, r1)
            android.content.res.Resources r2 = r2.getResources()
            int r3 = r3.resourceId
            int r2 = r2.getDimensionPixelSize(r3)
            return r2
    }

    private static float getFloat(android.content.Context r1, android.util.TypedValue r2, int r3) {
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r0 = 1
            r1.resolveAttribute(r3, r2, r0)
            float r1 = r2.getFloat()
            return r1
    }

    private static float getFloatValue(android.content.res.Resources r1, android.util.TypedValue r2, int r3) {
            r0 = 1
            r1.getValue(r3, r2, r0)
            float r1 = r2.getFloat()
            return r1
    }

    private static int getInteger(android.content.Context r2, android.util.TypedValue r3, int r4) {
            android.content.res.Resources$Theme r0 = r2.getTheme()
            r1 = 1
            r0.resolveAttribute(r4, r3, r1)
            android.content.res.Resources r2 = r2.getResources()
            int r3 = r3.resourceId
            int r2 = r2.getInteger(r3)
            return r2
    }

    private boolean setIcon(android.widget.ImageView r3, androidx.leanback.widget.GuidedAction r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1d
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L17
            int r1 = r4.getLevel()
            r3.setImageLevel(r1)
            r3.setImageDrawable(r4)
            r3.setVisibility(r0)
            goto L1e
        L17:
            r1 = 8
            r3.setVisibility(r1)
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    private static void setMaxLines(android.widget.TextView r1, int r2) {
            r0 = 1
            if (r2 != r0) goto L7
            r1.setSingleLine(r0)
            goto Le
        L7:
            r0 = 0
            r1.setSingleLine(r0)
            r1.setMaxLines(r2)
        Le:
            return
    }

    private void setupNextImeOptions(android.widget.EditText r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 5
            r2.setImeOptions(r0)
        L6:
            return
    }

    private void updateChevronAndVisibility(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r6) {
            r5 = this;
            boolean r0 = r6.isSubAction()
            if (r0 != 0) goto L83
            androidx.leanback.widget.GuidedAction r0 = r5.mExpandedAction
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L2a
            android.view.View r0 = r6.itemView
            r0.setVisibility(r3)
            android.view.View r0 = r6.itemView
            r0.setTranslationY(r2)
            android.view.View r0 = r6.mActivatorView
            if (r0 == 0) goto L83
            r0.setActivated(r3)
            android.view.View r0 = r6.itemView
            boolean r2 = r0 instanceof androidx.leanback.widget.GuidedActionItemContainer
            if (r2 == 0) goto L83
            androidx.leanback.widget.GuidedActionItemContainer r0 = (androidx.leanback.widget.GuidedActionItemContainer) r0
            r0.setFocusOutAllowed(r1)
            goto L83
        L2a:
            androidx.leanback.widget.GuidedAction r0 = r6.getAction()
            androidx.leanback.widget.GuidedAction r4 = r5.mExpandedAction
            if (r0 != r4) goto L78
            android.view.View r0 = r6.itemView
            r0.setVisibility(r3)
            androidx.leanback.widget.GuidedAction r0 = r6.getAction()
            boolean r0 = r0.hasSubActions()
            if (r0 == 0) goto L5e
            android.view.View r0 = r6.itemView
            float r1 = r5.mKeyLinePercent
            androidx.leanback.widget.VerticalGridView r2 = r5.mActionsGridView
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            int r1 = (int) r1
            android.view.View r2 = r6.itemView
            int r2 = r2.getBottom()
            int r1 = r1 - r2
            float r1 = (float) r1
            r0.setTranslationY(r1)
            goto L83
        L5e:
            android.view.View r0 = r6.mActivatorView
            if (r0 == 0) goto L83
            android.view.View r0 = r6.itemView
            r0.setTranslationY(r2)
            android.view.View r0 = r6.mActivatorView
            r0.setActivated(r1)
            android.view.View r0 = r6.itemView
            boolean r1 = r0 instanceof androidx.leanback.widget.GuidedActionItemContainer
            if (r1 == 0) goto L83
            androidx.leanback.widget.GuidedActionItemContainer r0 = (androidx.leanback.widget.GuidedActionItemContainer) r0
            r0.setFocusOutAllowed(r3)
            goto L83
        L78:
            android.view.View r0 = r6.itemView
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r6.itemView
            r0.setTranslationY(r2)
        L83:
            android.widget.ImageView r0 = r6.mChevronView
            if (r0 == 0) goto L8e
            androidx.leanback.widget.GuidedAction r0 = r6.getAction()
            r5.onBindChevronView(r6, r0)
        L8e:
            return
    }

    public void collapseAction(boolean r4) {
            r3 = this;
            boolean r0 = r3.isInExpandTransition()
            if (r0 != 0) goto L44
            androidx.leanback.widget.GuidedAction r0 = r3.mExpandedAction
            if (r0 != 0) goto Lb
            goto L44
        Lb:
            boolean r0 = r3.isExpandTransitionSupported()
            r1 = 0
            if (r0 == 0) goto L16
            if (r4 == 0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            androidx.leanback.widget.VerticalGridView r0 = r3.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            androidx.leanback.widget.GuidedActionAdapter r0 = (androidx.leanback.widget.GuidedActionAdapter) r0
            androidx.leanback.widget.GuidedAction r2 = r3.mExpandedAction
            int r0 = r0.indexOf(r2)
            if (r0 >= 0) goto L2a
            return
        L2a:
            androidx.leanback.widget.GuidedAction r2 = r3.mExpandedAction
            boolean r2 = r2.hasEditableActivatorView()
            if (r2 == 0) goto L40
            androidx.leanback.widget.VerticalGridView r2 = r3.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.findViewHolderForPosition(r0)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r0
            r3.setEditingMode(r0, r1, r4)
            goto L44
        L40:
            r0 = 0
            r3.startExpanded(r0, r4)
        L44:
            return
    }

    public void expandAction(androidx.leanback.widget.GuidedAction r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.isInExpandTransition()
            if (r0 != 0) goto L4c
            androidx.leanback.widget.GuidedAction r0 = r3.mExpandedAction
            if (r0 == 0) goto Lb
            goto L4c
        Lb:
            androidx.leanback.widget.VerticalGridView r0 = r3.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            androidx.leanback.widget.GuidedActionAdapter r0 = (androidx.leanback.widget.GuidedActionAdapter) r0
            int r0 = r0.indexOf(r4)
            if (r0 >= 0) goto L1c
            return
        L1c:
            boolean r1 = r3.isExpandTransitionSupported()
            r2 = 1
            if (r1 == 0) goto L27
            if (r5 == 0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 != 0) goto L40
            androidx.leanback.widget.VerticalGridView r5 = r3.getActionsGridView()
            androidx.leanback.widget.GuidedActionsStylist$4 r1 = new androidx.leanback.widget.GuidedActionsStylist$4
            r1.<init>(r3)
            r5.setSelectedPosition(r0, r1)
            boolean r5 = r4.hasSubActions()
            if (r5 == 0) goto L4c
            r3.onUpdateSubActionsGridView(r4, r2)
            goto L4c
        L40:
            androidx.leanback.widget.VerticalGridView r4 = r3.getActionsGridView()
            androidx.leanback.widget.GuidedActionsStylist$5 r5 = new androidx.leanback.widget.GuidedActionsStylist$5
            r5.<init>(r3)
            r4.setSelectedPosition(r0, r5)
        L4c:
            return
    }

    public androidx.leanback.widget.VerticalGridView getActionsGridView() {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.mActionsGridView
            return r0
    }

    public androidx.leanback.widget.GuidedAction getExpandedAction() {
            r1 = this;
            androidx.leanback.widget.GuidedAction r0 = r1.mExpandedAction
            return r0
    }

    public int getItemViewType(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.leanback.widget.GuidedDatePickerAction
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public final int getKeyLine() {
            r2 = this;
            float r0 = r2.mKeyLinePercent
            androidx.leanback.widget.VerticalGridView r1 = r2.mActionsGridView
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            return r0
    }

    public androidx.leanback.widget.VerticalGridView getSubActionsGridView() {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.mSubActionsGridView
            return r0
    }

    public final boolean isBackKeyToCollapseActivatorView() {
            r1 = this;
            boolean r0 = r1.mBackToCollapseActivatorView
            return r0
    }

    public final boolean isBackKeyToCollapseSubActions() {
            r1 = this;
            boolean r0 = r1.mBackToCollapseSubActions
            return r0
    }

    public boolean isButtonActions() {
            r1 = this;
            boolean r0 = r1.mButtonActions
            return r0
    }

    public boolean isExpandTransitionSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isExpanded() {
            r1 = this;
            androidx.leanback.widget.GuidedAction r0 = r1.mExpandedAction
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isInExpandTransition() {
            r1 = this;
            java.lang.Object r0 = r1.mExpandTransition
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isSubActionsExpanded() {
            r1 = this;
            androidx.leanback.widget.GuidedAction r0 = r1.mExpandedAction
            if (r0 == 0) goto Lc
            boolean r0 = r0.hasSubActions()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void onAnimateItemChecked(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r2, boolean r3) {
            r1 = this;
            android.widget.ImageView r2 = r2.mCheckmarkView
            boolean r0 = r2 instanceof android.widget.Checkable
            if (r0 == 0) goto Lb
            android.widget.Checkable r2 = (android.widget.Checkable) r2
            r2.setChecked(r3)
        Lb:
            return
    }

    public void onAnimateItemFocused(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r1, boolean r2) {
            r0 = this;
            return
    }

    public void onAnimateItemPressed(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r1, boolean r2) {
            r0 = this;
            r1.press(r2)
            return
    }

    public void onAnimateItemPressedCancelled(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r2) {
            r1 = this;
            r0 = 0
            r2.press(r0)
            return
    }

    public void onBindActivatorView(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r6, androidx.leanback.widget.GuidedAction r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.leanback.widget.GuidedDatePickerAction
            if (r0 == 0) goto L54
            androidx.leanback.widget.GuidedDatePickerAction r7 = (androidx.leanback.widget.GuidedDatePickerAction) r7
            android.view.View r6 = r6.mActivatorView
            androidx.leanback.widget.picker.DatePicker r6 = (androidx.leanback.widget.picker.DatePicker) r6
            java.lang.String r0 = r7.getDatePickerFormat()
            r6.setDatePickerFormat(r0)
            long r0 = r7.getMinDate()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            long r0 = r7.getMinDate()
            r6.setMinDate(r0)
        L22:
            long r0 = r7.getMaxDate()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r0 = r7.getMaxDate()
            r6.setMaxDate(r0)
        L36:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r1 = r7.getDate()
            r0.setTimeInMillis(r1)
            r7 = 1
            int r7 = r0.get(r7)
            r1 = 2
            int r1 = r0.get(r1)
            r2 = 5
            int r0 = r0.get(r2)
            r2 = 0
            r6.updateDate(r7, r1, r0, r2)
        L54:
            return
    }

    public void onBindCheckMarkView(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r7, androidx.leanback.widget.GuidedAction r8) {
            r6 = this;
            int r0 = r8.getCheckSetId()
            if (r0 == 0) goto L4c
            android.widget.ImageView r0 = r7.mCheckmarkView
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r8.getCheckSetId()
            r1 = -1
            if (r0 != r1) goto L17
            r0 = 16843290(0x101021a, float:2.3695066E-38)
            goto L1a
        L17:
            r0 = 16843289(0x1010219, float:2.3695063E-38)
        L1a:
            android.widget.ImageView r1 = r7.mCheckmarkView
            android.content.Context r1 = r1.getContext()
            r2 = 0
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r4 = r1.getTheme()
            r5 = 1
            boolean r0 = r4.resolveAttribute(r0, r3, r5)
            if (r0 == 0) goto L37
            int r0 = r3.resourceId
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r1, r0)
        L37:
            android.widget.ImageView r0 = r7.mCheckmarkView
            r0.setImageDrawable(r2)
            android.widget.ImageView r7 = r7.mCheckmarkView
            boolean r0 = r7 instanceof android.widget.Checkable
            if (r0 == 0) goto L53
            android.widget.Checkable r7 = (android.widget.Checkable) r7
            boolean r8 = r8.isChecked()
            r7.setChecked(r8)
            goto L53
        L4c:
            android.widget.ImageView r7 = r7.mCheckmarkView
            r8 = 8
            r7.setVisibility(r8)
        L53:
            return
    }

    public void onBindChevronView(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r4, androidx.leanback.widget.GuidedAction r5) {
            r3 = this;
            boolean r0 = r5.hasNext()
            boolean r1 = r5.hasSubActions()
            if (r0 != 0) goto L15
            if (r1 == 0) goto Ld
            goto L15
        Ld:
            android.widget.ImageView r4 = r4.mChevronView
            r5 = 8
            r4.setVisibility(r5)
            goto L55
        L15:
            android.widget.ImageView r1 = r4.mChevronView
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r4.mChevronView
            boolean r2 = r5.isEnabled()
            if (r2 == 0) goto L26
            float r2 = r3.mEnabledChevronAlpha
            goto L28
        L26:
            float r2 = r3.mDisabledChevronAlpha
        L28:
            r1.setAlpha(r2)
            if (r0 == 0) goto L42
            android.view.ViewGroup r5 = r3.mMainView
            if (r5 == 0) goto L3b
            int r5 = r5.getLayoutDirection()
            r0 = 1
            if (r5 != r0) goto L3b
            r5 = 1127481344(0x43340000, float:180.0)
            goto L3c
        L3b:
            r5 = 0
        L3c:
            android.widget.ImageView r4 = r4.mChevronView
            r4.setRotation(r5)
            goto L55
        L42:
            androidx.leanback.widget.GuidedAction r0 = r3.mExpandedAction
            if (r5 != r0) goto L4e
            android.widget.ImageView r4 = r4.mChevronView
            r5 = 1132920832(0x43870000, float:270.0)
            r4.setRotation(r5)
            goto L55
        L4e:
            android.widget.ImageView r4 = r4.mChevronView
            r5 = 1119092736(0x42b40000, float:90.0)
            r4.setRotation(r5)
        L55:
            return
    }

    public void onBindViewHolder(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r8, androidx.leanback.widget.GuidedAction r9) {
            r7 = this;
            r8.mAction = r9
            android.widget.TextView r0 = r8.mTitleView
            r1 = 0
            r2 = 2
            r3 = 26
            r4 = 28
            r5 = 0
            if (r0 == 0) goto L5d
            int r6 = r9.getInputType()
            r0.setInputType(r6)
            android.widget.TextView r0 = r8.mTitleView
            java.lang.CharSequence r6 = r9.getTitle()
            r0.setText(r6)
            android.widget.TextView r0 = r8.mTitleView
            boolean r6 = r9.isEnabled()
            if (r6 == 0) goto L28
            float r6 = r7.mEnabledTextAlpha
            goto L2a
        L28:
            float r6 = r7.mDisabledTextAlpha
        L2a:
            r0.setAlpha(r6)
            android.widget.TextView r0 = r8.mTitleView
            r0.setFocusable(r5)
            android.widget.TextView r0 = r8.mTitleView
            r0.setClickable(r5)
            android.widget.TextView r0 = r8.mTitleView
            r0.setLongClickable(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L56
            boolean r0 = r9.isEditable()
            if (r0 == 0) goto L50
            android.widget.TextView r0 = r8.mTitleView
            java.lang.String[] r6 = r9.getAutofillHints()
            r0.setAutofillHints(r6)
            goto L5d
        L50:
            android.widget.TextView r0 = r8.mTitleView
            r0.setAutofillHints(r1)
            goto L5d
        L56:
            if (r0 < r3) goto L5d
            android.widget.TextView r0 = r8.mTitleView
            r0.setImportantForAutofill(r2)
        L5d:
            android.widget.TextView r0 = r8.mDescriptionView
            if (r0 == 0) goto Lc4
            int r6 = r9.getDescriptionInputType()
            r0.setInputType(r6)
            android.widget.TextView r0 = r8.mDescriptionView
            java.lang.CharSequence r6 = r9.getDescription()
            r0.setText(r6)
            android.widget.TextView r0 = r8.mDescriptionView
            java.lang.CharSequence r6 = r9.getDescription()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L80
            r6 = 8
            goto L81
        L80:
            r6 = 0
        L81:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r8.mDescriptionView
            boolean r6 = r9.isEnabled()
            if (r6 == 0) goto L8f
            float r6 = r7.mEnabledDescriptionAlpha
            goto L91
        L8f:
            float r6 = r7.mDisabledDescriptionAlpha
        L91:
            r0.setAlpha(r6)
            android.widget.TextView r0 = r8.mDescriptionView
            r0.setFocusable(r5)
            android.widget.TextView r0 = r8.mDescriptionView
            r0.setClickable(r5)
            android.widget.TextView r0 = r8.mDescriptionView
            r0.setLongClickable(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto Lbd
            boolean r0 = r9.isDescriptionEditable()
            if (r0 == 0) goto Lb7
            android.widget.TextView r0 = r8.mDescriptionView
            java.lang.String[] r1 = r9.getAutofillHints()
            r0.setAutofillHints(r1)
            goto Lc4
        Lb7:
            android.widget.TextView r0 = r8.mDescriptionView
            r0.setAutofillHints(r1)
            goto Lc4
        Lbd:
            if (r0 < r3) goto Lc4
            android.widget.TextView r0 = r8.mTitleView
            r0.setImportantForAutofill(r2)
        Lc4:
            android.widget.ImageView r0 = r8.mCheckmarkView
            if (r0 == 0) goto Lcb
            r7.onBindCheckMarkView(r8, r9)
        Lcb:
            android.widget.ImageView r0 = r8.mIconView
            r7.setIcon(r0, r9)
            boolean r0 = r9.hasMultilineDescription()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 == 0) goto L109
            android.widget.TextView r0 = r8.mTitleView
            if (r0 == 0) goto L11b
            int r2 = r7.mTitleMaxLines
            setMaxLines(r0, r2)
            android.widget.TextView r0 = r8.mTitleView
            int r2 = r0.getInputType()
            r2 = r2 | r1
            r0.setInputType(r2)
            android.widget.TextView r0 = r8.mDescriptionView
            if (r0 == 0) goto L11b
            int r2 = r0.getInputType()
            r2 = r2 | r1
            r0.setInputType(r2)
            android.widget.TextView r0 = r8.mDescriptionView
            android.view.View r2 = r8.itemView
            android.content.Context r2 = r2.getContext()
            android.widget.TextView r3 = r8.mTitleView
            int r2 = r7.getDescriptionMaxHeight(r2, r3)
            r0.setMaxHeight(r2)
            goto L11b
        L109:
            android.widget.TextView r0 = r8.mTitleView
            if (r0 == 0) goto L112
            int r2 = r7.mTitleMinLines
            setMaxLines(r0, r2)
        L112:
            android.widget.TextView r0 = r8.mDescriptionView
            if (r0 == 0) goto L11b
            int r2 = r7.mDescriptionMinLines
            setMaxLines(r0, r2)
        L11b:
            android.view.View r0 = r8.mActivatorView
            if (r0 == 0) goto L122
            r7.onBindActivatorView(r8, r9)
        L122:
            r7.setEditingMode(r8, r5, r5)
            boolean r9 = r9.isFocusable()
            if (r9 == 0) goto L139
            android.view.View r9 = r8.itemView
            r0 = 1
            r9.setFocusable(r0)
            android.view.View r9 = r8.itemView
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.setDescendantFocusability(r1)
            goto L147
        L139:
            android.view.View r9 = r8.itemView
            r9.setFocusable(r5)
            android.view.View r9 = r8.itemView
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0 = 393216(0x60000, float:5.51013E-40)
            r9.setDescendantFocusability(r0)
        L147:
            android.widget.EditText r9 = r8.getEditableTitleView()
            r7.setupNextImeOptions(r9)
            android.widget.EditText r9 = r8.getEditableDescriptionView()
            r7.setupNextImeOptions(r9)
            r7.updateChevronAndVisibility(r8)
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme_guidedStepKeyline
            r2 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.getFloat(r1, r2)
            int r1 = r3.onProvideLayoutId()
            r2 = 0
            android.view.View r4 = r4.inflate(r1, r5, r2)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.mMainView = r4
            boolean r5 = r3.mButtonActions
            if (r5 == 0) goto L2a
            int r5 = androidx.leanback.R.id.guidedactions_content2
            goto L2c
        L2a:
            int r5 = androidx.leanback.R.id.guidedactions_content
        L2c:
            android.view.View r4 = r4.findViewById(r5)
            r3.mContentView = r4
            android.view.ViewGroup r4 = r3.mMainView
            boolean r5 = r3.mButtonActions
            if (r5 == 0) goto L3b
            int r5 = androidx.leanback.R.id.guidedactions_list_background2
            goto L3d
        L3b:
            int r5 = androidx.leanback.R.id.guidedactions_list_background
        L3d:
            android.view.View r4 = r4.findViewById(r5)
            r3.mBgView = r4
            android.view.ViewGroup r4 = r3.mMainView
            boolean r5 = r4 instanceof androidx.leanback.widget.VerticalGridView
            if (r5 == 0) goto L4e
            androidx.leanback.widget.VerticalGridView r4 = (androidx.leanback.widget.VerticalGridView) r4
            r3.mActionsGridView = r4
            goto L83
        L4e:
            boolean r5 = r3.mButtonActions
            if (r5 == 0) goto L55
            int r5 = androidx.leanback.R.id.guidedactions_list2
            goto L57
        L55:
            int r5 = androidx.leanback.R.id.guidedactions_list
        L57:
            android.view.View r4 = r4.findViewById(r5)
            androidx.leanback.widget.VerticalGridView r4 = (androidx.leanback.widget.VerticalGridView) r4
            r3.mActionsGridView = r4
            if (r4 == 0) goto L124
            r4.setWindowAlignmentOffsetPercent(r0)
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.setWindowAlignment(r2)
            boolean r4 = r3.mButtonActions
            if (r4 != 0) goto L83
            android.view.ViewGroup r4 = r3.mMainView
            int r5 = androidx.leanback.R.id.guidedactions_sub_list
            android.view.View r4 = r4.findViewById(r5)
            androidx.leanback.widget.VerticalGridView r4 = (androidx.leanback.widget.VerticalGridView) r4
            r3.mSubActionsGridView = r4
            android.view.ViewGroup r4 = r3.mMainView
            int r5 = androidx.leanback.R.id.guidedactions_sub_list_background
            android.view.View r4 = r4.findViewById(r5)
            r3.mSubActionsBackground = r4
        L83:
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.setFocusable(r2)
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.setFocusableInTouchMode(r2)
            android.view.ViewGroup r4 = r3.mMainView
            android.content.Context r4 = r4.getContext()
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            int r0 = androidx.leanback.R.attr.guidedActionEnabledChevronAlpha
            float r0 = getFloat(r4, r5, r0)
            r3.mEnabledChevronAlpha = r0
            int r0 = androidx.leanback.R.attr.guidedActionDisabledChevronAlpha
            float r0 = getFloat(r4, r5, r0)
            r3.mDisabledChevronAlpha = r0
            int r0 = androidx.leanback.R.attr.guidedActionTitleMinLines
            int r0 = getInteger(r4, r5, r0)
            r3.mTitleMinLines = r0
            int r0 = androidx.leanback.R.attr.guidedActionTitleMaxLines
            int r0 = getInteger(r4, r5, r0)
            r3.mTitleMaxLines = r0
            int r0 = androidx.leanback.R.attr.guidedActionDescriptionMinLines
            int r0 = getInteger(r4, r5, r0)
            r3.mDescriptionMinLines = r0
            int r0 = androidx.leanback.R.attr.guidedActionVerticalPadding
            int r0 = getDimension(r4, r5, r0)
            r3.mVerticalPadding = r0
            java.lang.String r0 = "window"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getHeight()
            r3.mDisplayHeight = r0
            android.content.res.Resources r0 = r4.getResources()
            int r1 = androidx.leanback.R.dimen.lb_guidedactions_item_unselected_text_alpha
            float r0 = getFloatValue(r0, r5, r1)
            r3.mEnabledTextAlpha = r0
            android.content.res.Resources r0 = r4.getResources()
            int r1 = androidx.leanback.R.dimen.lb_guidedactions_item_disabled_text_alpha
            float r0 = getFloatValue(r0, r5, r1)
            r3.mDisabledTextAlpha = r0
            android.content.res.Resources r0 = r4.getResources()
            int r1 = androidx.leanback.R.dimen.lb_guidedactions_item_unselected_description_text_alpha
            float r0 = getFloatValue(r0, r5, r1)
            r3.mEnabledDescriptionAlpha = r0
            android.content.res.Resources r0 = r4.getResources()
            int r1 = androidx.leanback.R.dimen.lb_guidedactions_item_disabled_description_text_alpha
            float r5 = getFloatValue(r0, r5, r1)
            r3.mDisabledDescriptionAlpha = r5
            float r4 = androidx.leanback.widget.GuidanceStylingRelativeLayout.getKeyLinePercent(r4)
            r3.mKeyLinePercent = r4
            android.view.View r4 = r3.mContentView
            boolean r5 = r4 instanceof androidx.leanback.widget.GuidedActionsRelativeLayout
            if (r5 == 0) goto L121
            androidx.leanback.widget.GuidedActionsRelativeLayout r4 = (androidx.leanback.widget.GuidedActionsRelativeLayout) r4
            androidx.leanback.widget.GuidedActionsStylist$1 r5 = new androidx.leanback.widget.GuidedActionsStylist$1
            r5.<init>(r3)
            r4.setInterceptKeyEventListener(r5)
        L121:
            android.view.ViewGroup r4 = r3.mMainView
            return r4
        L124:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No ListView exists."
            r4.<init>(r5)
            throw r4
    }

    public androidx.leanback.widget.GuidedActionsStylist.ViewHolder onCreateViewHolder(android.view.ViewGroup r5) {
            r4 = this;
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r4.onProvideItemLayoutId()
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r5, r2)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r1 = new androidx.leanback.widget.GuidedActionsStylist$ViewHolder
            androidx.leanback.widget.VerticalGridView r3 = r4.mSubActionsGridView
            if (r5 != r3) goto L18
            r2 = 1
        L18:
            r1.<init>(r0, r2)
            return r1
    }

    public androidx.leanback.widget.GuidedActionsStylist.ViewHolder onCreateViewHolder(android.view.ViewGroup r4, int r5) {
            r3 = this;
            if (r5 != 0) goto L7
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r4 = r3.onCreateViewHolder(r4)
            return r4
        L7:
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r5 = r3.onProvideItemLayoutId(r5)
            r1 = 0
            android.view.View r5 = r0.inflate(r5, r4, r1)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = new androidx.leanback.widget.GuidedActionsStylist$ViewHolder
            androidx.leanback.widget.VerticalGridView r2 = r3.mSubActionsGridView
            if (r4 != r2) goto L1f
            r1 = 1
        L1f:
            r0.<init>(r5, r1)
            return r0
    }

    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.mExpandedAction = r0
            r1.mExpandTransition = r0
            r1.mActionsGridView = r0
            r1.mSubActionsGridView = r0
            r1.mSubActionsBackground = r0
            r1.mContentView = r0
            r1.mBgView = r0
            r1.mMainView = r0
            return
    }

    public final void onEditActivatorView(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r3, boolean r4, boolean r5) {
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L1b
            r2.startExpanded(r3, r5)
            android.view.View r4 = r3.itemView
            r4.setFocusable(r0)
            android.view.View r4 = r3.mActivatorView
            r4.requestFocus()
            android.view.View r4 = r3.mActivatorView
            androidx.leanback.widget.GuidedActionsStylist$3 r5 = new androidx.leanback.widget.GuidedActionsStylist$3
            r5.<init>(r2, r3)
            r4.setOnClickListener(r5)
            goto L49
        L1b:
            androidx.leanback.widget.GuidedAction r4 = r3.getAction()
            boolean r4 = r2.onUpdateActivatorView(r3, r4)
            if (r4 == 0) goto L30
            androidx.leanback.widget.GuidedActionAdapter$EditListener r4 = r2.mEditListener
            if (r4 == 0) goto L30
            androidx.leanback.widget.GuidedAction r1 = r3.getAction()
            r4.onGuidedActionEditedAndProceed(r1)
        L30:
            android.view.View r4 = r3.itemView
            r1 = 1
            r4.setFocusable(r1)
            android.view.View r4 = r3.itemView
            r4.requestFocus()
            r4 = 0
            r2.startExpanded(r4, r5)
            android.view.View r5 = r3.mActivatorView
            r5.setOnClickListener(r4)
            android.view.View r3 = r3.mActivatorView
            r3.setClickable(r0)
        L49:
            return
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeAppearing(@androidx.annotation.NonNull java.util.List<android.animation.Animator> r1) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeDisappearing(@androidx.annotation.NonNull java.util.List<android.animation.Animator> r1) {
            r0 = this;
            return
    }

    public int onProvideItemLayoutId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_guidedactions_item
            return r0
    }

    public int onProvideItemLayoutId(int r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.onProvideItemLayoutId()
            return r4
        L7:
            r0 = 1
            if (r4 != r0) goto Ld
            int r4 = androidx.leanback.R.layout.lb_guidedactions_datepicker_item
            return r4
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "ViewType "
            java.lang.String r2 = " not supported in GuidedActionsStylist"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public int onProvideLayoutId() {
            r1 = this;
            boolean r0 = r1.mButtonActions
            if (r0 == 0) goto L7
            int r0 = androidx.leanback.R.layout.lb_guidedbuttonactions
            goto L9
        L7:
            int r0 = androidx.leanback.R.layout.lb_guidedactions
        L9:
            return r0
    }

    public boolean onUpdateActivatorView(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r6, androidx.leanback.widget.GuidedAction r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.leanback.widget.GuidedDatePickerAction
            if (r0 == 0) goto L1f
            androidx.leanback.widget.GuidedDatePickerAction r7 = (androidx.leanback.widget.GuidedDatePickerAction) r7
            android.view.View r6 = r6.mActivatorView
            androidx.leanback.widget.picker.DatePicker r6 = (androidx.leanback.widget.picker.DatePicker) r6
            long r0 = r7.getDate()
            long r2 = r6.getDate()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1f
            long r0 = r6.getDate()
            r7.setDate(r0)
            r6 = 1
            return r6
        L1f:
            r6 = 0
            return r6
    }

    public void onUpdateExpandedViewHolder(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Ld
            r4 = 0
            r3.mExpandedAction = r4
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r1 = 1
            r4.setPruneChild(r1)
            goto L20
        Ld:
            androidx.leanback.widget.GuidedAction r1 = r4.getAction()
            androidx.leanback.widget.GuidedAction r2 = r3.mExpandedAction
            if (r1 == r2) goto L20
            androidx.leanback.widget.GuidedAction r4 = r4.getAction()
            r3.mExpandedAction = r4
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.setPruneChild(r0)
        L20:
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.setAnimateChildLayout(r0)
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            int r4 = r4.getChildCount()
        L2b:
            if (r0 >= r4) goto L3f
            androidx.leanback.widget.VerticalGridView r1 = r3.mActionsGridView
            android.view.View r2 = r1.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.getChildViewHolder(r2)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r1 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r1
            r3.updateChevronAndVisibility(r1)
            int r0 = r0 + 1
            goto L2b
        L3f:
            return
    }

    public final void onUpdateSubActionsGridView(androidx.leanback.widget.GuidedAction r4, boolean r5) {
            r3 = this;
            androidx.leanback.widget.VerticalGridView r0 = r3.mSubActionsGridView
            if (r0 == 0) goto L71
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            androidx.leanback.widget.VerticalGridView r1 = r3.mSubActionsGridView
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            androidx.leanback.widget.GuidedActionAdapter r1 = (androidx.leanback.widget.GuidedActionAdapter) r1
            r2 = 0
            if (r5 == 0) goto L37
            r5 = -2
            r0.topMargin = r5
            r5 = -1
            r0.height = r5
            androidx.leanback.widget.VerticalGridView r5 = r3.mSubActionsGridView
            r5.setLayoutParams(r0)
            androidx.leanback.widget.VerticalGridView r5 = r3.mSubActionsGridView
            r5.setVisibility(r2)
            android.view.View r5 = r3.mSubActionsBackground
            r5.setVisibility(r2)
            androidx.leanback.widget.VerticalGridView r5 = r3.mSubActionsGridView
            r5.requestFocus()
            java.util.List r4 = r4.getSubActions()
            r1.setActions(r4)
            goto L71
        L37:
            androidx.leanback.widget.VerticalGridView r5 = r3.mActionsGridView
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            androidx.leanback.widget.GuidedActionAdapter r5 = (androidx.leanback.widget.GuidedActionAdapter) r5
            int r4 = r5.indexOf(r4)
            androidx.leanback.widget.VerticalGridView r5 = r3.mActionsGridView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            android.view.View r4 = r5.findViewByPosition(r4)
            int r4 = r4.getBottom()
            r0.topMargin = r4
            r0.height = r2
            androidx.leanback.widget.VerticalGridView r4 = r3.mSubActionsGridView
            r5 = 4
            r4.setVisibility(r5)
            android.view.View r4 = r3.mSubActionsBackground
            r4.setVisibility(r5)
            androidx.leanback.widget.VerticalGridView r4 = r3.mSubActionsGridView
            r4.setLayoutParams(r0)
            java.util.List r4 = java.util.Collections.emptyList()
            r1.setActions(r4)
            androidx.leanback.widget.VerticalGridView r4 = r3.mActionsGridView
            r4.requestFocus()
        L71:
            return
    }

    public void openInEditMode(androidx.leanback.widget.GuidedAction r4) {
            r3 = this;
            androidx.leanback.widget.VerticalGridView r0 = r3.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            androidx.leanback.widget.GuidedActionAdapter r0 = (androidx.leanback.widget.GuidedActionAdapter) r0
            java.util.List r1 = r0.getActions()
            int r1 = r1.indexOf(r4)
            if (r1 < 0) goto L27
            boolean r4 = r4.isEditable()
            if (r4 != 0) goto L1b
            goto L27
        L1b:
            androidx.leanback.widget.VerticalGridView r4 = r3.getActionsGridView()
            androidx.leanback.widget.GuidedActionsStylist$2 r2 = new androidx.leanback.widget.GuidedActionsStylist$2
            r2.<init>(r0)
            r4.setSelectedPosition(r1, r2)
        L27:
            return
    }

    public void setAsButtonActions() {
            r2 = this;
            android.view.ViewGroup r0 = r2.mMainView
            if (r0 != 0) goto L8
            r0 = 1
            r2.mButtonActions = r0
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "setAsButtonActions() must be called before creating views"
            r0.<init>(r1)
            throw r0
    }

    public final void setBackKeyToCollapseActivatorView(boolean r1) {
            r0 = this;
            r0.mBackToCollapseActivatorView = r1
            return
    }

    public final void setBackKeyToCollapseSubActions(boolean r1) {
            r0 = this;
            r0.mBackToCollapseSubActions = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setEditListener(androidx.leanback.widget.GuidedActionAdapter.EditListener r1) {
            r0 = this;
            r0.mEditListener = r1
            return
    }

    @java.lang.Deprecated
    public void setEditingMode(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r1, androidx.leanback.widget.GuidedAction r2, boolean r3) {
            r0 = this;
            boolean r1 = r1.isInEditing()
            if (r3 == r1) goto L9
            r0.isInExpandTransition()
        L9:
            return
    }

    public final void setEditingMode(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r9, boolean r10, boolean r11) {
            r8 = this;
            boolean r0 = r9.isInEditing()
            if (r10 == r0) goto Lad
            boolean r0 = r8.isInExpandTransition()
            if (r0 != 0) goto Lad
            androidx.leanback.widget.GuidedAction r0 = r9.getAction()
            android.widget.TextView r1 = r9.getTitleView()
            android.widget.TextView r2 = r9.getDescriptionView()
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r10 == 0) goto L65
            java.lang.CharSequence r7 = r0.getEditTitle()
            if (r1 == 0) goto L29
            if (r7 == 0) goto L29
            r1.setText(r7)
        L29:
            java.lang.CharSequence r7 = r0.getEditDescription()
            if (r2 == 0) goto L34
            if (r7 == 0) goto L34
            r2.setText(r7)
        L34:
            boolean r7 = r0.isDescriptionEditable()
            if (r7 == 0) goto L49
            if (r2 == 0) goto L46
            r2.setVisibility(r6)
            int r10 = r0.getDescriptionEditInputType()
            r2.setInputType(r10)
        L46:
            r9.mEditingMode = r5
            goto Lad
        L49:
            boolean r2 = r0.isEditable()
            if (r2 == 0) goto L5b
            if (r1 == 0) goto L58
            int r10 = r0.getEditInputType()
            r1.setInputType(r10)
        L58:
            r9.mEditingMode = r4
            goto Lad
        L5b:
            android.view.View r0 = r9.mActivatorView
            if (r0 == 0) goto Lad
            r8.onEditActivatorView(r9, r10, r11)
            r9.mEditingMode = r3
            goto Lad
        L65:
            if (r1 == 0) goto L6e
            java.lang.CharSequence r7 = r0.getTitle()
            r1.setText(r7)
        L6e:
            if (r2 == 0) goto L77
            java.lang.CharSequence r7 = r0.getDescription()
            r2.setText(r7)
        L77:
            int r7 = r9.mEditingMode
            if (r7 != r5) goto L96
            if (r2 == 0) goto Lab
            java.lang.CharSequence r10 = r0.getDescription()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L8a
            r10 = 8
            goto L8b
        L8a:
            r10 = 0
        L8b:
            r2.setVisibility(r10)
            int r10 = r0.getDescriptionInputType()
            r2.setInputType(r10)
            goto Lab
        L96:
            if (r7 != r4) goto La2
            if (r1 == 0) goto Lab
            int r10 = r0.getInputType()
            r1.setInputType(r10)
            goto Lab
        La2:
            if (r7 != r3) goto Lab
            android.view.View r0 = r9.mActivatorView
            if (r0 == 0) goto Lab
            r8.onEditActivatorView(r9, r10, r11)
        Lab:
            r9.mEditingMode = r6
        Lad:
            return
    }

    @java.lang.Deprecated
    public void setExpandedViewHolder(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto L8
        L4:
            androidx.leanback.widget.GuidedAction r2 = r2.getAction()
        L8:
            boolean r0 = r1.isExpandTransitionSupported()
            r1.expandAction(r2, r0)
            return
    }

    public final void startExpanded(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r17, boolean r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            androidx.leanback.widget.VerticalGridView r2 = r0.mActionsGridView
            int r2 = r2.getChildCount()
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L35
            androidx.leanback.widget.VerticalGridView r5 = r0.mActionsGridView
            android.view.View r6 = r5.getChildAt(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = r5.getChildViewHolder(r6)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r5 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r5
            if (r1 != 0) goto L25
            android.view.View r6 = r5.itemView
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L25
            goto L36
        L25:
            if (r1 == 0) goto L32
            androidx.leanback.widget.GuidedAction r6 = r5.getAction()
            androidx.leanback.widget.GuidedAction r7 = r17.getAction()
            if (r6 != r7) goto L32
            goto L36
        L32:
            int r4 = r4 + 1
            goto Lc
        L35:
            r5 = 0
        L36:
            if (r5 != 0) goto L39
            return
        L39:
            if (r1 == 0) goto L3d
            r6 = 1
            goto L3e
        L3d:
            r6 = 0
        L3e:
            androidx.leanback.widget.GuidedAction r7 = r5.getAction()
            boolean r7 = r7.hasSubActions()
            if (r18 == 0) goto L117
            java.lang.Object r8 = androidx.leanback.transition.TransitionHelper.createTransitionSet(r3)
            android.view.View r9 = r5.itemView
            if (r7 == 0) goto L56
            int r9 = r9.getHeight()
            float r9 = (float) r9
            goto L5f
        L56:
            int r9 = r9.getHeight()
            float r9 = (float) r9
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
        L5f:
            r10 = 112(0x70, float:1.57E-43)
            java.lang.Object r9 = androidx.leanback.transition.TransitionHelper.createFadeAndShortSlide(r10, r9)
            androidx.leanback.widget.GuidedActionsStylist$6 r10 = new androidx.leanback.widget.GuidedActionsStylist$6
            r10.<init>(r0)
            androidx.leanback.transition.TransitionHelper.setEpicenterCallback(r9, r10)
            java.lang.Object r10 = androidx.leanback.transition.TransitionHelper.createChangeTransform()
            java.lang.Object r11 = androidx.leanback.transition.TransitionHelper.createChangeBounds(r3)
            r12 = 3
            java.lang.Object r12 = androidx.leanback.transition.TransitionHelper.createFadeTransition(r12)
            java.lang.Object r13 = androidx.leanback.transition.TransitionHelper.createChangeBounds(r3)
            r14 = 100
            if (r1 != 0) goto L91
            r3 = 150(0x96, double:7.4E-322)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r9, r3)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r10, r14)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r11, r14)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r13, r14)
            goto L9f
        L91:
            androidx.leanback.transition.TransitionHelper.setStartDelay(r12, r14)
            r3 = 50
            androidx.leanback.transition.TransitionHelper.setStartDelay(r13, r3)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r10, r3)
            androidx.leanback.transition.TransitionHelper.setStartDelay(r11, r3)
        L9f:
            r3 = 0
        La0:
            if (r3 >= r2) goto Lcc
            androidx.leanback.widget.VerticalGridView r4 = r0.mActionsGridView
            android.view.View r14 = r4.getChildAt(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r4.getChildViewHolder(r14)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r4 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r4
            if (r4 != r5) goto Lbe
            if (r7 == 0) goto Lbc
            android.view.View r14 = r4.itemView
            androidx.leanback.transition.TransitionHelper.include(r10, r14)
            android.view.View r4 = r4.itemView
            androidx.leanback.transition.TransitionHelper.include(r11, r4)
        Lbc:
            r14 = 1
            goto Lc9
        Lbe:
            android.view.View r14 = r4.itemView
            androidx.leanback.transition.TransitionHelper.include(r9, r14)
            android.view.View r4 = r4.itemView
            r14 = 1
            androidx.leanback.transition.TransitionHelper.exclude(r12, r4, r14)
        Lc9:
            int r3 = r3 + 1
            goto La0
        Lcc:
            androidx.leanback.widget.VerticalGridView r2 = r0.mSubActionsGridView
            androidx.leanback.transition.TransitionHelper.include(r13, r2)
            android.view.View r2 = r0.mSubActionsBackground
            androidx.leanback.transition.TransitionHelper.include(r13, r2)
            androidx.leanback.transition.TransitionHelper.addTransition(r8, r9)
            if (r7 == 0) goto Le1
            androidx.leanback.transition.TransitionHelper.addTransition(r8, r10)
            androidx.leanback.transition.TransitionHelper.addTransition(r8, r11)
        Le1:
            androidx.leanback.transition.TransitionHelper.addTransition(r8, r12)
            androidx.leanback.transition.TransitionHelper.addTransition(r8, r13)
            r0.mExpandTransition = r8
            androidx.leanback.widget.GuidedActionsStylist$7 r2 = new androidx.leanback.widget.GuidedActionsStylist$7
            r2.<init>(r0)
            androidx.leanback.transition.TransitionHelper.addTransitionListener(r8, r2)
            if (r6 == 0) goto L110
            if (r7 == 0) goto L110
            android.view.View r2 = r1.itemView
            int r2 = r2.getBottom()
            androidx.leanback.widget.VerticalGridView r3 = r0.mSubActionsGridView
            int r4 = r3.getTop()
            int r4 = r2 - r4
            r3.offsetTopAndBottom(r4)
            android.view.View r3 = r0.mSubActionsBackground
            int r4 = r3.getTop()
            int r2 = r2 - r4
            r3.offsetTopAndBottom(r2)
        L110:
            android.view.ViewGroup r2 = r0.mMainView
            java.lang.Object r3 = r0.mExpandTransition
            androidx.leanback.transition.TransitionHelper.beginDelayedTransition(r2, r3)
        L117:
            r16.onUpdateExpandedViewHolder(r17)
            if (r7 == 0) goto L123
            androidx.leanback.widget.GuidedAction r1 = r5.getAction()
            r0.onUpdateSubActionsGridView(r1, r6)
        L123:
            return
    }

    @java.lang.Deprecated
    public void startExpandedTransition(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto L8
        L4:
            androidx.leanback.widget.GuidedAction r2 = r2.getAction()
        L8:
            boolean r0 = r1.isExpandTransitionSupported()
            r1.expandAction(r2, r0)
            return
    }
}
