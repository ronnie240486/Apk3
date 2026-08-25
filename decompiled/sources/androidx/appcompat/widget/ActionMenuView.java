package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView {
    private static final java.lang.String TAG = "ActionMenuView";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    public androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    public androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private androidx.appcompat.widget.ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {

        @android.view.ViewDebug.ExportedProperty
        public int cellsUsed;

        @android.view.ViewDebug.ExportedProperty
        public boolean expandable;
        public boolean expanded;

        @android.view.ViewDebug.ExportedProperty
        public int extraPixels;

        @android.view.ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @android.view.ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.isOverflowButton = r1
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = r1.isOverflowButton
                r0.isOverflowButton = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuView this$0;

        public MenuBuilderCallback(androidx.appcompat.widget.ActionMenuView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, @androidx.annotation.NonNull android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.widget.ActionMenuView r1 = r0.this$0
                androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener r1 = r1.mOnMenuItemClickListener
                if (r1 == 0) goto Le
                boolean r1 = r1.onMenuItemClick(r2)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r2) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r0.mMenuBuilderCallback
                if (r0 == 0) goto L9
                r0.onMenuModeChange(r2)
            L9:
                return
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public ActionMenuView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuView(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.setBaselineAligned(r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r2.mMinCellSize = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.mGeneratedItemPadding = r0
            r2.mPopupContext = r3
            r2.mPopupTheme = r4
            return
    }

    public static int measureChildForCells(android.view.View r5, int r6, int r7, int r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L28
            boolean r9 = r9.hasText()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            r3 = 2
            if (r7 <= 0) goto L4d
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.isOverflowButton
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            r0.expandable = r1
            r0.cellsUsed = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
    }

    private void onMeasureExactFormat(int r30, int r31) {
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r5 = r5 + r4
            int r4 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r6 = r6 + r4
            r4 = -2
            r7 = r31
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r4)
            int r2 = r2 - r5
            int r5 = r0.mMinCellSize
            int r7 = r2 / r5
            int r8 = r2 % r5
            r9 = 0
            if (r7 != 0) goto L35
            r0.setMeasuredDimension(r2, r9)
            return
        L35:
            int r8 = r8 / r7
            int r8 = r8 + r5
            int r5 = r29.getChildCount()
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L44:
            if (r12 >= r5) goto Lc8
            android.view.View r11 = r0.getChildAt(r12)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L57
            r9 = r6
            goto Lc0
        L57:
            boolean r3 = r11 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r14 = r14 + 1
            if (r3 == 0) goto L66
            int r9 = r0.mGeneratedItemPadding
            r20 = r14
            r14 = 0
            r11.setPadding(r9, r14, r9, r14)
            goto L69
        L66:
            r20 = r14
            r14 = 0
        L69:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r9 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r9
            r9.expanded = r14
            r9.extraPixels = r14
            r9.cellsUsed = r14
            r9.expandable = r14
            r9.leftMargin = r14
            r9.rightMargin = r14
            if (r3 == 0) goto L88
            r3 = r11
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.hasText()
            if (r3 == 0) goto L88
            r3 = 1
            goto L89
        L88:
            r3 = 0
        L89:
            r9.preventEdgeOffset = r3
            boolean r3 = r9.isOverflowButton
            if (r3 == 0) goto L91
            r3 = 1
            goto L92
        L91:
            r3 = r7
        L92:
            int r3 = measureChildForCells(r11, r8, r3, r4, r6)
            int r15 = java.lang.Math.max(r15, r3)
            boolean r14 = r9.expandable
            if (r14 == 0) goto La0
            int r16 = r16 + 1
        La0:
            boolean r9 = r9.isOverflowButton
            if (r9 == 0) goto La5
            r13 = 1
        La5:
            int r7 = r7 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto Lbc
            int r3 = r9 << r12
            r9 = r6
            r11 = r7
            long r6 = (long) r3
            long r6 = r17 | r6
            r17 = r6
            r7 = r11
            goto Lbe
        Lbc:
            r9 = r6
            r11 = r7
        Lbe:
            r14 = r20
        Lc0:
            int r12 = r12 + 1
            r6 = r9
            r3 = r19
            r9 = 0
            goto L44
        Lc8:
            r19 = r3
            r3 = 2
            if (r13 == 0) goto Ld1
            if (r14 != r3) goto Ld1
            r6 = 1
            goto Ld2
        Ld1:
            r6 = 0
        Ld2:
            r9 = 0
        Ld3:
            if (r16 <= 0) goto L177
            if (r7 <= 0) goto L177
            r20 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r11 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            r20 = 0
        Le1:
            if (r11 >= r5) goto L116
            android.view.View r24 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r9
            r9 = r24
            androidx.appcompat.widget.ActionMenuView$LayoutParams r9 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r9
            r24 = r10
            boolean r10 = r9.expandable
            if (r10 != 0) goto Lf8
            goto L10f
        Lf8:
            int r9 = r9.cellsUsed
            if (r9 >= r12) goto L103
            r22 = 1
            long r20 = r22 << r11
            r12 = r9
            r3 = 1
            goto L10f
        L103:
            r22 = 1
            if (r9 != r12) goto L10f
            long r9 = r22 << r11
            long r9 = r20 | r9
            int r3 = r3 + 1
            r20 = r9
        L10f:
            int r11 = r11 + 1
            r10 = r24
            r9 = r25
            goto Le1
        L116:
            r25 = r9
            r24 = r10
            long r17 = r17 | r20
            if (r3 <= r7) goto L122
            r11 = r1
            r26 = r2
            goto L17e
        L122:
            int r12 = r12 + 1
            r3 = 0
        L125:
            if (r3 >= r5) goto L171
            android.view.View r9 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r10 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r3
            r11 = r1
            long r1 = (long) r2
            long r22 = r20 & r1
            r27 = 0
            int r25 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r25 != 0) goto L149
            int r9 = r10.cellsUsed
            if (r9 != r12) goto L146
            long r17 = r17 | r1
        L146:
            r27 = r6
            goto L169
        L149:
            if (r6 == 0) goto L15d
            boolean r1 = r10.preventEdgeOffset
            if (r1 == 0) goto L15d
            r1 = 1
            if (r7 != r1) goto L15d
            int r2 = r0.mGeneratedItemPadding
            int r1 = r2 + r8
            r27 = r6
            r6 = 0
            r9.setPadding(r1, r6, r2, r6)
            goto L15f
        L15d:
            r27 = r6
        L15f:
            int r1 = r10.cellsUsed
            r2 = 1
            int r1 = r1 + r2
            r10.cellsUsed = r1
            r10.expanded = r2
            int r7 = r7 + (-1)
        L169:
            int r3 = r3 + 1
            r1 = r11
            r2 = r26
            r6 = r27
            goto L125
        L171:
            r10 = r24
            r3 = 2
            r9 = 1
            goto Ld3
        L177:
            r11 = r1
            r26 = r2
            r25 = r9
            r24 = r10
        L17e:
            r1 = 1
            if (r13 != 0) goto L185
            if (r14 != r1) goto L185
            r2 = 1
            goto L186
        L185:
            r2 = 0
        L186:
            if (r7 <= 0) goto L23b
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L23b
            int r14 = r14 - r1
            if (r7 < r14) goto L195
            if (r2 != 0) goto L195
            if (r15 <= r1) goto L23b
        L195:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L1d6
            r2 = 1
            long r2 = r17 & r2
            r6 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r14 = 0
            if (r12 == 0) goto L1b8
            android.view.View r2 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.preventEdgeOffset
            if (r2 != 0) goto L1b8
            float r1 = r1 - r6
        L1b8:
            int r2 = r5 + (-1)
            r3 = 1
            int r9 = r3 << r2
            long r9 = (long) r9
            long r9 = r17 & r9
            r12 = 0
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 == 0) goto L1d7
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.preventEdgeOffset
            if (r2 != 0) goto L1d7
            float r1 = r1 - r6
            goto L1d7
        L1d6:
            r14 = 0
        L1d7:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e2
            int r7 = r7 * r8
            float r2 = (float) r7
            float r2 = r2 / r1
            int r1 = (int) r2
            goto L1e3
        L1e2:
            r1 = 0
        L1e3:
            r9 = r25
            r2 = 0
        L1e6:
            if (r2 >= r5) goto L23e
            r3 = 1
            int r6 = r3 << r2
            long r6 = (long) r6
            long r6 = r17 & r6
            r12 = 0
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 != 0) goto L1f7
            r3 = 1
            r7 = 2
            goto L238
        L1f7:
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            boolean r3 = r3 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r3 == 0) goto L219
            r6.extraPixels = r1
            r3 = 1
            r6.expanded = r3
            if (r2 != 0) goto L216
            boolean r3 = r6.preventEdgeOffset
            if (r3 != 0) goto L216
            int r3 = -r1
            r7 = 2
            int r3 = r3 / r7
            r6.leftMargin = r3
            goto L217
        L216:
            r7 = 2
        L217:
            r3 = 1
            goto L227
        L219:
            r7 = 2
            boolean r3 = r6.isOverflowButton
            if (r3 == 0) goto L229
            r6.extraPixels = r1
            r3 = 1
            r6.expanded = r3
            int r9 = -r1
            int r9 = r9 / r7
            r6.rightMargin = r9
        L227:
            r9 = 1
            goto L238
        L229:
            r3 = 1
            if (r2 == 0) goto L230
            int r10 = r1 / 2
            r6.leftMargin = r10
        L230:
            int r10 = r5 + (-1)
            if (r2 == r10) goto L238
            int r10 = r1 / 2
            r6.rightMargin = r10
        L238:
            int r2 = r2 + 1
            goto L1e6
        L23b:
            r14 = 0
            r9 = r25
        L23e:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L265
            r9 = 0
        L243:
            if (r9 >= r5) goto L265
            android.view.View r2 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r3
            boolean r6 = r3.expanded
            if (r6 != 0) goto L254
            goto L262
        L254:
            int r6 = r3.cellsUsed
            int r6 = r6 * r8
            int r3 = r3.extraPixels
            int r6 = r6 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
            r2.measure(r3, r4)
        L262:
            int r9 = r9 + 1
            goto L243
        L265:
            if (r11 == r1) goto L26a
            r3 = r24
            goto L26c
        L26a:
            r3 = r19
        L26c:
            r2 = r26
            r0.setMeasuredDimension(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            return r1
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto L7
            r0.dismissPopupMenus()
        L7:
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final androidx.appcompat.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.gravity = r1
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            r0.<init>(r2)
            goto L13
        Le:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r0.<init>(r2)
        L13:
            int r2 = r0.gravity
            if (r2 > 0) goto L1b
            r2 = 16
            r0.gravity = r2
        L1b:
            return r0
        L1c:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = r1.generateDefaultLayoutParams()
            return r2
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateOverflowButtonLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r2.generateDefaultLayoutParams()
            r1 = 1
            r0.isOverflowButton = r1
            return r0
    }

    public android.view.Menu getMenu() {
            r3 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            if (r0 != 0) goto L3f
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            r1.<init>(r0)
            r3.mMenu = r1
            androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback r2 = new androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback
            r2.<init>(r3)
            r1.setCallback(r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = new androidx.appcompat.widget.ActionMenuPresenter
            r1.<init>(r0)
            r3.mPresenter = r1
            r0 = 1
            r1.setReserveOverflow(r0)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mPresenter
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r3.mActionMenuPresenterCallback
            if (r1 == 0) goto L29
            goto L2e
        L29:
            androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback r1 = new androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback
            r1.<init>()
        L2e:
            r0.setCallback(r1)
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.mPresenter
            android.content.Context r2 = r3.mPopupContext
            r0.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mPresenter
            r0.setMenuView(r3)
        L3f:
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.mPopupTheme
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasSupportDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5 + (-1)
            android.view.View r1 = r4.getChildAt(r1)
            android.view.View r2 = r4.getChildAt(r5)
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L1f
            boolean r3 = r1 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r3 == 0) goto L1f
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r1 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r1
            boolean r1 = r1.needsDividerAfter()
            r0 = r0 | r1
        L1f:
            if (r5 <= 0) goto L2c
            boolean r5 = r2 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r5 == 0) goto L2c
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r2 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r2
            boolean r5 = r2.needsDividerBefore()
            r0 = r0 | r5
        L2c:
            return r0
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.hideOverflowMenu()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.mMenu = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            boolean r3 = r0.performItemAction(r3, r1)
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            if (r2 == 0) goto L1d
            r0 = 0
            r2.updateMenuView(r0)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            boolean r2 = r2.isOverflowMenuShowing()
            if (r2 == 0) goto L1d
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            r2.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            r2.showOverflowMenu()
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.dismissPopupMenus()
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.mFormatItems
            if (r1 != 0) goto La
            super.onLayout(r18, r19, r20, r21, r22)
            return
        La:
            int r1 = r17.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r17.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r17.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r17.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r17)
            r8 = 0
            r9 = 0
            r10 = 0
        L2a:
            r11 = 8
            r12 = 1
            if (r8 >= r1) goto L8d
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r11) goto L3a
            goto L8a
        L3a:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            boolean r14 = r11.isOverflowButton
            if (r14 == 0) goto L7a
            int r9 = r13.getMeasuredWidth()
            boolean r14 = r0.hasSupportDividerBeforeChildAt(r8)
            if (r14 == 0) goto L4f
            int r9 = r9 + r3
        L4f:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L5f
            int r15 = r17.getPaddingLeft()
            int r11 = r11.leftMargin
            int r15 = r15 + r11
            int r11 = r15 + r9
            goto L6f
        L5f:
            int r15 = r17.getWidth()
            int r16 = r17.getPaddingRight()
            int r15 = r15 - r16
            int r11 = r11.rightMargin
            int r11 = r15 - r11
            int r15 = r11 - r9
        L6f:
            int r16 = r14 / 2
            int r7 = r2 - r16
            int r14 = r14 + r7
            r13.layout(r15, r7, r11, r14)
            int r5 = r5 - r9
            r9 = 1
            goto L8a
        L7a:
            int r7 = r13.getMeasuredWidth()
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r11 = r11.rightMargin
            int r7 = r7 + r11
            int r5 = r5 - r7
            r0.hasSupportDividerBeforeChildAt(r8)
            int r10 = r10 + 1
        L8a:
            int r8 = r8 + 1
            goto L2a
        L8d:
            if (r1 != r12) goto Lac
            if (r9 != 0) goto Lac
            r3 = 0
            android.view.View r1 = r0.getChildAt(r3)
            int r3 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            int r4 = r4 / 2
            int r6 = r3 / 2
            int r4 = r4 - r6
            int r6 = r5 / 2
            int r2 = r2 - r6
            int r3 = r3 + r4
            int r5 = r5 + r2
            r1.layout(r4, r2, r3, r5)
            return
        Lac:
            r3 = r9 ^ 1
            int r10 = r10 - r3
            if (r10 <= 0) goto Lb4
            int r3 = r5 / r10
            goto Lb5
        Lb4:
            r3 = 0
        Lb5:
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            if (r6 == 0) goto Lfa
            int r5 = r17.getWidth()
            int r6 = r17.getPaddingRight()
            int r5 = r5 - r6
            r7 = 0
        Lc6:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto Lf7
            boolean r8 = r6.isOverflowButton
            if (r8 == 0) goto Ldd
            goto Lf7
        Ldd:
            int r8 = r6.rightMargin
            int r5 = r5 - r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 - r8
            int r9 = r9 + r10
            r4.layout(r12, r10, r5, r9)
            int r4 = r6.leftMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 - r8
        Lf7:
            int r7 = r7 + 1
            goto Lc6
        Lfa:
            int r5 = r17.getPaddingLeft()
            r7 = 0
        Lff:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto L131
            boolean r8 = r6.isOverflowButton
            if (r8 == 0) goto L116
            goto L131
        L116:
            int r8 = r6.leftMargin
            int r5 = r5 + r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 + r8
            int r9 = r9 + r10
            r4.layout(r5, r10, r12, r9)
            int r4 = r6.rightMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r8 = r8 + r5
            r5 = r8
        L131:
            int r7 = r7 + 1
            goto Lff
        L134:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.mFormatItems
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r5.mFormatItems = r1
            if (r0 == r1) goto L15
            r5.mFormatItemsWidth = r3
        L15:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.mFormatItems
            if (r1 == 0) goto L2a
            androidx.appcompat.view.menu.MenuBuilder r1 = r5.mMenu
            if (r1 == 0) goto L2a
            int r4 = r5.mFormatItemsWidth
            if (r0 == r4) goto L2a
            r5.mFormatItemsWidth = r0
            r1.onItemsChanged(r2)
        L2a:
            int r0 = r5.getChildCount()
            boolean r1 = r5.mFormatItems
            if (r1 == 0) goto L38
            if (r0 <= 0) goto L38
            r5.onMeasureExactFormat(r6, r7)
            goto L4f
        L38:
            r1 = 0
        L39:
            if (r1 >= r0) goto L4c
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            r2.rightMargin = r3
            r2.leftMargin = r3
            int r1 = r1 + 1
            goto L39
        L4c:
            super.onMeasure(r6, r7)
        L4f:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.MenuBuilder peekMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setExpandedActionViewsExclusive(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r1, androidx.appcompat.view.menu.MenuBuilder.Callback r2) {
            r0 = this;
            r0.mActionMenuPresenterCallback = r1
            r0.mMenuBuilderCallback = r2
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mOnMenuItemClickListener = r1
            return
    }

    public void setOverflowIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setOverflowIcon(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.mReserveOverflow = r1
            return
    }

    public void setPopupTheme(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            int r0 = r2.mPopupTheme
            if (r0 == r3) goto L1a
            r2.mPopupTheme = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.mPopupContext = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.mPopupContext = r0
        L1a:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setPresenter(androidx.appcompat.widget.ActionMenuPresenter r1) {
            r0 = this;
            r0.mPresenter = r1
            r1.setMenuView(r0)
            return
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.showOverflowMenu()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }
}
