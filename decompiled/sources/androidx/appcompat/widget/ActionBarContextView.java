package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {
    private android.view.View mClose;
    private android.view.View mCloseButton;
    private int mCloseItemLayout;
    private android.view.View mCustomView;
    private java.lang.CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private android.widget.TextView mSubtitleView;
    private java.lang.CharSequence mTitle;
    private android.widget.LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private android.widget.TextView mTitleView;


    public ActionBarContextView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.actionModeStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = androidx.appcompat.R.styleable.ActionMode
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r4, r0, r5, r1)
            int r4 = androidx.appcompat.R.styleable.ActionMode_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            androidx.core.view.ViewCompat.setBackground(r2, r4)
            int r4 = androidx.appcompat.R.styleable.ActionMode_titleTextStyle
            int r4 = r3.getResourceId(r4, r1)
            r2.mTitleStyleRes = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle
            int r4 = r3.getResourceId(r4, r1)
            r2.mSubtitleStyleRes = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_height
            int r4 = r3.getLayoutDimension(r4, r1)
            r2.mContentHeight = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_closeItemLayout
            int r5 = androidx.appcompat.R.layout.abc_action_mode_close_item_material
            int r4 = r3.getResourceId(r4, r5)
            r2.mCloseItemLayout = r4
            r3.recycle()
            return
    }

    private void initTitle() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.mTitleLayout
            if (r0 != 0) goto L53
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.appcompat.R.layout.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.mTitleLayout = r0
            int r1 = androidx.appcompat.R.id.action_bar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.mTitleView = r0
            android.widget.LinearLayout r0 = r6.mTitleLayout
            int r1 = androidx.appcompat.R.id.action_bar_subtitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.mSubtitleView = r0
            int r0 = r6.mTitleStyleRes
            if (r0 == 0) goto L44
            android.widget.TextView r0 = r6.mTitleView
            android.content.Context r1 = r6.getContext()
            int r2 = r6.mTitleStyleRes
            r0.setTextAppearance(r1, r2)
        L44:
            int r0 = r6.mSubtitleStyleRes
            if (r0 == 0) goto L53
            android.widget.TextView r0 = r6.mSubtitleView
            android.content.Context r1 = r6.getContext()
            int r2 = r6.mSubtitleStyleRes
            r0.setTextAppearance(r1, r2)
        L53:
            android.widget.TextView r0 = r6.mTitleView
            java.lang.CharSequence r1 = r6.mTitle
            r0.setText(r1)
            android.widget.TextView r0 = r6.mSubtitleView
            java.lang.CharSequence r1 = r6.mSubtitle
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.mSubtitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.mSubtitleView
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L7a
            r5 = 0
            goto L7c
        L7a:
            r5 = 8
        L7c:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.mTitleLayout
            if (r0 != 0) goto L88
            if (r1 == 0) goto L86
            goto L88
        L86:
            r3 = 8
        L88:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.mTitleLayout
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L98
            android.widget.LinearLayout r0 = r6.mTitleLayout
            r6.addView(r0)
        L98:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int r1) {
            r0 = this;
            super.animateToVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
            r1 = this;
            boolean r0 = super.canShowOverflowMenu()
            return r0
    }

    public void closeMode() {
            r1 = this;
            android.view.View r0 = r1.mClose
            if (r0 != 0) goto L7
            r1.killMode()
        L7:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
            r0 = this;
            super.dismissPopupMenus()
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.hideOverflowMenu()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void initForMode(androidx.appcompat.view.ActionMode r4) {
            r3 = this;
            android.view.View r0 = r3.mClose
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.mCloseItemLayout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.mClose = r0
            r3.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r3.mClose
            r3.addView(r0)
        L24:
            android.view.View r0 = r3.mClose
            int r1 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.mCloseButton = r0
            androidx.appcompat.widget.ActionBarContextView$1 r1 = new androidx.appcompat.widget.ActionBarContextView$1
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.getMenu()
            androidx.appcompat.view.menu.MenuBuilder r4 = (androidx.appcompat.view.menu.MenuBuilder) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            if (r0 == 0) goto L43
            r0.dismissPopupMenus()
        L43:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.mActionMenuPresenter = r0
            r1 = 1
            r0.setReserveOverflow(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.mActionMenuPresenter
            android.content.Context r2 = r3.mPopupContext
            r4.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.mActionMenuPresenter
            androidx.appcompat.view.menu.MenuView r4 = r4.getMenuView(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.mMenuView = r4
            r1 = 0
            androidx.core.view.ViewCompat.setBackground(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.mMenuView
            r3.addView(r4, r0)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
            r1 = this;
            boolean r0 = super.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = super.isOverflowReserved()
            return r0
    }

    public boolean isTitleOptional() {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            return r0
    }

    public void killMode() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.mCustomView = r0
            r2.mMenuView = r0
            r2.mActionMenuPresenter = r0
            android.view.View r1 = r2.mCloseButton
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lf
            r0.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            r0.hideSubMenus()
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onHoverEvent(r1)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r9)
            if (r10 == 0) goto Le
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r9.getPaddingLeft()
        L12:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.mClose
            r7 = 8
            if (r14 == 0) goto L5c
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L5c
            android.view.View r14 = r9.mClose
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L3b
            int r1 = r14.rightMargin
            goto L3d
        L3b:
            int r1 = r14.leftMargin
        L3d:
            if (r10 == 0) goto L42
            int r14 = r14.leftMargin
            goto L44
        L42:
            int r14 = r14.rightMargin
        L44:
            if (r10 == 0) goto L48
            int r0 = r0 - r1
            goto L49
        L48:
            int r0 = r0 + r1
        L49:
            r8 = r0
            android.view.View r1 = r9.mClose
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.positionChild(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            if (r10 == 0) goto L5a
            int r8 = r8 - r14
            goto L5b
        L5a:
            int r8 = r8 + r14
        L5b:
            r0 = r8
        L5c:
            r14 = r0
            android.widget.LinearLayout r0 = r9.mTitleLayout
            if (r0 == 0) goto L77
            android.view.View r1 = r9.mCustomView
            if (r1 != 0) goto L77
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L77
            android.widget.LinearLayout r1 = r9.mTitleLayout
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.positionChild(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L77:
            r2 = r14
            android.view.View r1 = r9.mCustomView
            if (r1 == 0) goto L83
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.positionChild(r1, r2, r3, r4, r5)
        L83:
            if (r10 == 0) goto L8b
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L92
        L8b:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L92:
            androidx.appcompat.widget.ActionMenuView r2 = r9.mMenuView
            if (r2 == 0) goto L9f
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.positionChild(r2, r3, r4, r5, r6)
        L9f:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L104
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le5
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.mContentHeight
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r2 = r2 + r12
            int r12 = r10.getPaddingLeft()
            int r12 = r11 - r12
            int r3 = r10.getPaddingRight()
            int r12 = r12 - r3
            int r3 = r0 - r2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.mClose
            if (r6 == 0) goto L4d
            int r12 = r10.measureChildView(r6, r12, r5)
            android.view.View r6 = r10.mClose
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.mMenuView
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.mMenuView
            int r12 = r10.measureChildView(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.mTitleLayout
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.mCustomView
            if (r8 != 0) goto L91
            boolean r8 = r10.mTitleOptional
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.mTitleLayout
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.mTitleLayout
            int r5 = r5.getMeasuredWidth()
            if (r5 > r12) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = 0
        L7e:
            if (r6 == 0) goto L81
            int r12 = r12 - r5
        L81:
            android.widget.LinearLayout r5 = r10.mTitleLayout
            if (r6 == 0) goto L87
            r6 = 0
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = r10.measureChildView(r6, r12, r5)
        L91:
            android.view.View r5 = r10.mCustomView
            if (r5 == 0) goto Lc3
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La1
            r9 = 1073741824(0x40000000, float:2.0)
            goto La3
        La1:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        La3:
            if (r6 < 0) goto La9
            int r12 = java.lang.Math.min(r6, r12)
        La9:
            int r5 = r5.height
            if (r5 == r8) goto Lae
            goto Lb0
        Lae:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        Lb0:
            if (r5 < 0) goto Lb6
            int r3 = java.lang.Math.min(r5, r3)
        Lb6:
            android.view.View r4 = r10.mCustomView
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc3:
            int r12 = r10.mContentHeight
            if (r12 > 0) goto Le1
            int r12 = r10.getChildCount()
            r0 = 0
        Lcc:
            if (r7 >= r12) goto Ldd
            android.view.View r1 = r10.getChildAt(r7)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            if (r1 <= r0) goto Lda
            r0 = r1
        Lda:
            int r7 = r7 + 1
            goto Lcc
        Ldd:
            r10.setMeasuredDimension(r11, r0)
            goto Le4
        Le1:
            r10.setMeasuredDimension(r11, r0)
        Le4:
            return
        Le5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L104:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
            r0 = this;
            super.postShowOverflowMenu()
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.mCustomView = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.mTitleLayout
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.mTitleLayout = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mSubtitle = r1
            r0.initTitle()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            r0.initTitle()
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mTitleOptional = r2
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r1, long r2) {
            r0 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r1 = super.setupAnimatorToVisibility(r1, r2)
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.showOverflowMenu()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
