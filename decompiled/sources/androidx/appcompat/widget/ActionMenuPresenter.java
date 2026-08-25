package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.BaseMenuPresenter implements androidx.core.view.ActionProvider.SubUiVisibilityListener {
    private static final java.lang.String TAG = "ActionMenuPresenter";
    private final android.util.SparseBooleanArray mActionButtonGroups;
    public androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    public int mOpenSubMenuId;
    public androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton mOverflowButton;
    public androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mOverflowPopup;
    private android.graphics.drawable.Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
    public final androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback;
    public androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    /* JADX INFO: loaded from: classes3.dex */
    public class ActionButtonSubmenu extends androidx.appcompat.view.menu.MenuPopupHelper {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public ActionButtonSubmenu(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.SubMenuBuilder r9, android.view.View r10) {
                r6 = this;
                r6.this$0 = r7
                int r5 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r4 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                android.view.MenuItem r8 = r9.getItem()
                androidx.appcompat.view.menu.MenuItemImpl r8 = (androidx.appcompat.view.menu.MenuItemImpl) r8
                boolean r8 = r8.isActionButton()
                if (r8 != 0) goto L23
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r8 = r7.mOverflowButton
                if (r8 != 0) goto L20
                androidx.appcompat.view.menu.MenuView r8 = r7.mMenuView
                android.view.View r8 = (android.view.View) r8
            L20:
                r6.setAnchorView(r8)
            L23:
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mActionButtonPopup = r1
                r1 = 0
                r0.mOpenSubMenuId = r1
                super.onDismiss()
                return
        }
    }

    public class ActionMenuPopupCallback extends androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public ActionMenuPopupCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                r1 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r0.mActionButtonPopup
                if (r0 == 0) goto Lb
                androidx.appcompat.view.menu.MenuPopup r0 = r0.getPopup()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class OpenOverflowRunnable implements java.lang.Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mPopup;
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OpenOverflowRunnable(androidx.appcompat.widget.ActionMenuPresenter r1, androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mPopup = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
                if (r0 == 0) goto L9
                r0.changeMenuMode()
            L9:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuView r0 = r0.mMenuView
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L25
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L25
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r2.mPopup
                boolean r0 = r0.tryShow()
                if (r0 == 0) goto L25
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r1 = r2.mPopup
                r0.mOverflowPopup = r1
            L25:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mPostedOpenRunnable = r1
                return
        }
    }

    public class OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;


        public OverflowMenuButton(androidx.appcompat.widget.ActionMenuPresenter r2, android.content.Context r3) {
                r1 = this;
                r1.this$0 = r2
                int r2 = androidx.appcompat.R.attr.actionOverflowButtonStyle
                r0 = 0
                r1.<init>(r3, r0, r2)
                r2 = 1
                r1.setClickable(r2)
                r1.setFocusable(r2)
                r3 = 0
                r1.setVisibility(r3)
                r1.setEnabled(r2)
                java.lang.CharSequence r2 = r1.getContentDescription()
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r1, r2)
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1 r2 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1
                r2.<init>(r1, r1)
                r1.setOnTouchListener(r2)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r0.showOverflowMenu()
                return r1
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r5 = super.setFrame(r5, r6, r7, r8)
                android.graphics.drawable.Drawable r6 = r4.getDrawable()
                android.graphics.drawable.Drawable r7 = r4.getBackground()
                if (r6 == 0) goto L3f
                if (r7 == 0) goto L3f
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r0 = java.lang.Math.max(r6, r8)
                int r0 = r0 / 2
                int r1 = r4.getPaddingLeft()
                int r2 = r4.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r4.getPaddingTop()
                int r3 = r4.getPaddingBottom()
                int r2 = r2 - r3
                int r6 = r6 + r1
                int r6 = r6 / 2
                int r8 = r8 + r2
                int r8 = r8 / 2
                int r1 = r6 - r0
                int r2 = r8 - r0
                int r6 = r6 + r0
                int r8 = r8 + r0
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r7, r1, r2, r6, r8)
            L3f:
                return r5
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class OverflowPopup extends androidx.appcompat.view.menu.MenuPopupHelper {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OverflowPopup(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, boolean r11) {
                r6 = this;
                r6.this$0 = r7
                int r5 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r6.setGravity(r8)
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
                if (r0 == 0) goto L9
                r0.close()
            L9:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mOverflowPopup = r1
                super.onDismiss()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class PopupPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public PopupPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.SubMenuBuilder
                if (r0 == 0) goto Lc
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.getRootMenu()
                r1 = 0
                r0.close(r1)
            Lc:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L17
                r0.onCloseMenu(r3, r4)
            L17:
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r4) {
                r3 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
                r2 = 0
                if (r4 != r1) goto L8
                return r2
            L8:
                r1 = r4
                androidx.appcompat.view.menu.SubMenuBuilder r1 = (androidx.appcompat.view.menu.SubMenuBuilder) r1
                android.view.MenuItem r1 = r1.getItem()
                int r1 = r1.getItemId()
                r0.mOpenSubMenuId = r1
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L21
                boolean r2 = r0.onOpenSubMenu(r4)
            L21:
                return r2
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState> CREATOR = null;
        public int openSubMenuId;


        static {
                androidx.appcompat.widget.ActionMenuPresenter$SavedState$1 r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.ActionMenuPresenter.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        public SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1.readInt()
                r0.openSubMenuId = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.openSubMenuId
                r1.writeInt(r2)
                return
        }
    }

    public ActionMenuPresenter(android.content.Context r3) {
            r2 = this;
            int r0 = androidx.appcompat.R.layout.abc_action_menu_layout
            int r1 = androidx.appcompat.R.layout.abc_action_menu_item_layout
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.mActionButtonGroups = r3
            androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r3 = new androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback
            r3.<init>(r2)
            r2.mPopupPresenterCallback = r3
            return
    }

    private android.view.View findViewForItem(android.view.MenuItem r7) {
            r6 = this;
            androidx.appcompat.view.menu.MenuView r0 = r6.mMenuView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.getChildCount()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L24
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r5 == 0) goto L21
            r5 = r4
            androidx.appcompat.view.menu.MenuView$ItemView r5 = (androidx.appcompat.view.menu.MenuView.ItemView) r5
            androidx.appcompat.view.menu.MenuItemImpl r5 = r5.getItemData()
            if (r5 != r7) goto L21
            return r4
        L21:
            int r3 = r3 + 1
            goto Ld
        L24:
            return r1
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(androidx.appcompat.view.menu.MenuItemImpl r2, androidx.appcompat.view.menu.MenuView.ItemView r3) {
            r1 = this;
            r0 = 0
            r3.initialize(r2, r0)
            androidx.appcompat.view.menu.MenuView r2 = r1.mMenuView
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            r3.setItemInvoker(r2)
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r1.mPopupCallback
            if (r2 != 0) goto L18
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = new androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback
            r2.<init>(r1)
            r1.mPopupCallback = r2
        L18:
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r1.mPopupCallback
            r3.setPopupCallback(r2)
            return
    }

    public boolean dismissPopupMenus() {
            r2 = this;
            boolean r0 = r2.hideOverflowMenu()
            boolean r1 = r2.hideSubMenus()
            r0 = r0 | r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.view.View r0 = r3.getChildAt(r4)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r2.mOverflowButton
            if (r0 != r1) goto La
            r3 = 0
            return r3
        La:
            r3.removeViewAt(r4)
            r3 = 1
            return r3
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r20 = this;
            r0 = r20
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L11
            java.util.ArrayList r1 = r1.getVisibleItems()
            int r4 = r1.size()
            goto L13
        L11:
            r1 = r2
            r4 = 0
        L13:
            int r5 = r0.mMaxItems
            int r6 = r0.mActionItemWidthLimit
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.view.menu.MenuView r8 = r0.mMenuView
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L23:
            if (r9 >= r4) goto L4c
            java.lang.Object r14 = r1.get(r9)
            androidx.appcompat.view.menu.MenuItemImpl r14 = (androidx.appcompat.view.menu.MenuItemImpl) r14
            boolean r15 = r14.requiresActionButton()
            if (r15 == 0) goto L34
            int r11 = r11 + 1
            goto L3e
        L34:
            boolean r15 = r14.requestsActionButton()
            if (r15 == 0) goto L3d
            int r12 = r12 + 1
            goto L3e
        L3d:
            r10 = 1
        L3e:
            boolean r13 = r0.mExpandedActionViewsExclusive
            if (r13 == 0) goto L49
            boolean r13 = r14.isActionViewExpanded()
            if (r13 == 0) goto L49
            r5 = 0
        L49:
            int r9 = r9 + 1
            goto L23
        L4c:
            boolean r9 = r0.mReserveOverflow
            if (r9 == 0) goto L57
            if (r10 != 0) goto L55
            int r12 = r12 + r11
            if (r12 <= r5) goto L57
        L55:
            int r5 = r5 + (-1)
        L57:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r9 = r0.mActionButtonGroups
            r9.clear()
            boolean r10 = r0.mStrictWidthLimit
            if (r10 == 0) goto L6a
            int r10 = r0.mMinCellSize
            int r11 = r6 / r10
            int r12 = r6 % r10
            int r12 = r12 / r11
            int r12 = r12 + r10
            goto L6c
        L6a:
            r11 = 0
            r12 = 0
        L6c:
            r10 = 0
            r14 = 0
        L6e:
            if (r10 >= r4) goto L143
            java.lang.Object r15 = r1.get(r10)
            androidx.appcompat.view.menu.MenuItemImpl r15 = (androidx.appcompat.view.menu.MenuItemImpl) r15
            boolean r16 = r15.requiresActionButton()
            if (r16 == 0) goto La7
            android.view.View r13 = r0.getItemView(r15, r2, r8)
            boolean r2 = r0.mStrictWidthLimit
            if (r2 == 0) goto L8a
            int r2 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r13, r12, r11, r7, r3)
            int r11 = r11 - r2
            goto L8d
        L8a:
            r13.measure(r7, r7)
        L8d:
            int r2 = r13.getMeasuredWidth()
            int r6 = r6 - r2
            if (r14 != 0) goto L95
            r14 = r2
        L95:
            int r2 = r15.getGroupId()
            r13 = 1
            if (r2 == 0) goto L9f
            r9.put(r2, r13)
        L9f:
            r15.setIsActionButton(r13)
            r17 = r4
        La4:
            r0 = 0
            goto L139
        La7:
            boolean r2 = r15.requestsActionButton()
            if (r2 == 0) goto L133
            int r2 = r15.getGroupId()
            boolean r13 = r9.get(r2)
            if (r5 > 0) goto Lb9
            if (r13 == 0) goto Lc3
        Lb9:
            if (r6 <= 0) goto Lc3
            boolean r3 = r0.mStrictWidthLimit
            if (r3 == 0) goto Lc1
            if (r11 <= 0) goto Lc3
        Lc1:
            r3 = 1
            goto Lc4
        Lc3:
            r3 = 0
        Lc4:
            r18 = r3
            r17 = r4
            if (r3 == 0) goto Lfb
            r3 = 0
            android.view.View r4 = r0.getItemView(r15, r3, r8)
            boolean r3 = r0.mStrictWidthLimit
            if (r3 == 0) goto Ldf
            r3 = 0
            int r19 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r4, r12, r11, r7, r3)
            int r11 = r11 - r19
            if (r19 != 0) goto Le2
            r18 = 0
            goto Le2
        Ldf:
            r4.measure(r7, r7)
        Le2:
            r3 = r18
            int r4 = r4.getMeasuredWidth()
            int r6 = r6 - r4
            if (r14 != 0) goto Lec
            r14 = r4
        Lec:
            boolean r4 = r0.mStrictWidthLimit
            if (r4 == 0) goto Lf3
            if (r6 < 0) goto Lf9
            goto Lf7
        Lf3:
            int r4 = r6 + r14
            if (r4 <= 0) goto Lf9
        Lf7:
            r4 = 1
            goto Lfa
        Lf9:
            r4 = 0
        Lfa:
            r3 = r3 & r4
        Lfb:
            if (r3 == 0) goto L104
            if (r2 == 0) goto L104
            r4 = 1
            r9.put(r2, r4)
            goto L12a
        L104:
            if (r13 == 0) goto L12a
            r4 = 0
            r9.put(r2, r4)
            r4 = 0
        L10b:
            if (r4 >= r10) goto L12a
            java.lang.Object r13 = r1.get(r4)
            androidx.appcompat.view.menu.MenuItemImpl r13 = (androidx.appcompat.view.menu.MenuItemImpl) r13
            int r0 = r13.getGroupId()
            if (r0 != r2) goto L125
            boolean r0 = r13.isActionButton()
            if (r0 == 0) goto L121
            int r5 = r5 + 1
        L121:
            r0 = 0
            r13.setIsActionButton(r0)
        L125:
            int r4 = r4 + 1
            r0 = r20
            goto L10b
        L12a:
            if (r3 == 0) goto L12e
            int r5 = r5 + (-1)
        L12e:
            r15.setIsActionButton(r3)
            goto La4
        L133:
            r17 = r4
            r0 = 0
            r15.setIsActionButton(r0)
        L139:
            int r10 = r10 + 1
            r2 = 0
            r0 = r20
            r4 = r17
            r3 = 0
            goto L6e
        L143:
            r2 = 1
            return r2
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r0 = r3.getActionView()
            if (r0 == 0) goto Lc
            boolean r1 = r3.hasCollapsibleActionView()
            if (r1 == 0) goto L10
        Lc:
            android.view.View r0 = super.getItemView(r3, r4, r5)
        L10:
            boolean r3 = r3.isActionViewExpanded()
            if (r3 == 0) goto L19
            r3 = 8
            goto L1a
        L19:
            r3 = 0
        L1a:
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r5.checkLayoutParams(r3)
            if (r4 != 0) goto L30
            androidx.appcompat.widget.ActionMenuView$LayoutParams r3 = r5.generateLayoutParams(r3)
            r0.setLayoutParams(r3)
        L30:
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.mMenuView
            androidx.appcompat.view.menu.MenuView r2 = super.getMenuView(r2)
            if (r0 == r2) goto Le
            r0 = r2
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r1)
        Le:
            return r2
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            boolean r0 = r1.mPendingOverflowIconSet
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.mPendingOverflowIcon
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean hideOverflowMenu() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r3.mPostedOpenRunnable
            r1 = 1
            if (r0 == 0) goto L12
            androidx.appcompat.view.menu.MenuView r2 = r3.mMenuView
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.mPostedOpenRunnable = r0
            return r1
        L12:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r3.mOverflowPopup
            if (r0 == 0) goto L1a
            r0.dismiss()
            return r1
        L1a:
            r0 = 0
            return r0
    }

    public boolean hideSubMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r1.mActionButtonPopup
            if (r0 == 0) goto L9
            r0.dismiss()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable androidx.appcompat.view.menu.MenuBuilder r6) {
            r4 = this;
            super.initForMenu(r5, r6)
            android.content.res.Resources r6 = r5.getResources()
            androidx.appcompat.view.ActionBarPolicy r5 = androidx.appcompat.view.ActionBarPolicy.get(r5)
            boolean r0 = r4.mReserveOverflowSet
            if (r0 != 0) goto L15
            boolean r0 = r5.showsOverflowMenuButton()
            r4.mReserveOverflow = r0
        L15:
            boolean r0 = r4.mWidthLimitSet
            if (r0 != 0) goto L1f
            int r0 = r5.getEmbeddedMenuWidthLimit()
            r4.mWidthLimit = r0
        L1f:
            boolean r0 = r4.mMaxItemsSet
            if (r0 != 0) goto L29
            int r5 = r5.getMaxActionButtons()
            r4.mMaxItems = r5
        L29:
            int r5 = r4.mWidthLimit
            boolean r0 = r4.mReserveOverflow
            r1 = 0
            if (r0 == 0) goto L5c
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            if (r0 != 0) goto L54
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r2 = r4.mSystemContext
            r0.<init>(r4, r2)
            r4.mOverflowButton = r0
            boolean r2 = r4.mPendingOverflowIconSet
            r3 = 0
            if (r2 == 0) goto L4b
            android.graphics.drawable.Drawable r2 = r4.mPendingOverflowIcon
            r0.setImageDrawable(r2)
            r4.mPendingOverflowIcon = r1
            r4.mPendingOverflowIconSet = r3
        L4b:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r4.mOverflowButton
            r1.measure(r0, r0)
        L54:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L5e
        L5c:
            r4.mOverflowButton = r1
        L5e:
            r4.mActionItemWidthLimit = r5
            r5 = 1113587712(0x42600000, float:56.0)
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r5 = (int) r6
            r4.mMinCellSize = r5
            return
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r1.mPostedOpenRunnable
            if (r0 != 0) goto Ld
            boolean r0 = r1.isOverflowMenuShowing()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r1.mOverflowPopup
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
            r0 = this;
            r0.dismissPopupMenus()
            super.onCloseMenu(r1, r2)
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            boolean r2 = r1.mMaxItemsSet
            if (r2 != 0) goto L10
            android.content.Context r2 = r1.mContext
            androidx.appcompat.view.ActionBarPolicy r2 = androidx.appcompat.view.ActionBarPolicy.get(r2)
            int r2 = r2.getMaxActionButtons()
            r1.mMaxItems = r2
        L10:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            if (r2 == 0) goto L18
            r0 = 1
            r2.onItemsChanged(r0)
        L18:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuPresenter.SavedState
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r2 = (androidx.appcompat.widget.ActionMenuPresenter.SavedState) r2
            int r2 = r2.openSubMenuId
            if (r2 <= 0) goto L1c
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L1c
            android.view.SubMenu r2 = r2.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r2 = (androidx.appcompat.view.menu.SubMenuBuilder) r2
            r1.onSubMenuSelected(r2)
        L1c:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState
            r0.<init>()
            int r1 = r2.mOpenSubMenuId
            r0.openSubMenuId = r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r8
        L9:
            android.view.Menu r2 = r0.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r3 = r7.mMenu
            if (r2 == r3) goto L18
            android.view.Menu r0 = r0.getParentMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r0 = (androidx.appcompat.view.menu.SubMenuBuilder) r0
            goto L9
        L18:
            android.view.MenuItem r0 = r0.getItem()
            android.view.View r0 = r7.findViewForItem(r0)
            if (r0 != 0) goto L23
            return r1
        L23:
            android.view.MenuItem r2 = r8.getItem()
            int r2 = r2.getItemId()
            r7.mOpenSubMenuId = r2
            int r2 = r8.size()
            r3 = 0
        L32:
            r4 = 1
            if (r3 >= r2) goto L4a
            android.view.MenuItem r5 = r8.getItem(r3)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L47
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L47
            r1 = 1
            goto L4a
        L47:
            int r3 = r3 + 1
            goto L32
        L4a:
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r2 = new androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu
            android.content.Context r3 = r7.mContext
            r2.<init>(r7, r3, r8, r0)
            r7.mActionButtonPopup = r2
            r2.setForceShowIcon(r1)
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r7.mActionButtonPopup
            r0.show()
            super.onSubMenuSelected(r8)
            return r4
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r2 = 0
            super.onSubMenuSelected(r2)
            goto Lf
        L7:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            if (r2 == 0) goto Lf
            r0 = 0
            r2.close(r0)
        Lf:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r1) {
            r0 = this;
            r0.mExpandedActionViewsExclusive = r1
            return
    }

    public void setItemLimit(int r1) {
            r0 = this;
            r0.mMaxItems = r1
            r1 = 1
            r0.mMaxItemsSet = r1
            return
    }

    public void setMenuView(androidx.appcompat.widget.ActionMenuView r2) {
            r1 = this;
            r1.mMenuView = r2
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            r2.initialize(r0)
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto L8
            r0.setImageDrawable(r2)
            goto Ld
        L8:
            r0 = 1
            r1.mPendingOverflowIconSet = r0
            r1.mPendingOverflowIcon = r2
        Ld:
            return
    }

    public void setReserveOverflow(boolean r1) {
            r0 = this;
            r0.mReserveOverflow = r1
            r1 = 1
            r0.mReserveOverflowSet = r1
            return
    }

    public void setWidthLimit(int r1, boolean r2) {
            r0 = this;
            r0.mWidthLimit = r1
            r0.mStrictWidthLimit = r2
            r1 = 1
            r0.mWidthLimitSet = r1
            return
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            boolean r1 = r2.isActionButton()
            return r1
    }

    public boolean showOverflowMenu() {
            r7 = this;
            boolean r0 = r7.mReserveOverflow
            if (r0 == 0) goto L3e
            boolean r0 = r7.isOverflowMenuShowing()
            if (r0 != 0) goto L3e
            androidx.appcompat.view.menu.MenuBuilder r0 = r7.mMenu
            if (r0 == 0) goto L3e
            androidx.appcompat.view.menu.MenuView r1 = r7.mMenuView
            if (r1 == 0) goto L3e
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r1 = r7.mPostedOpenRunnable
            if (r1 != 0) goto L3e
            java.util.ArrayList r0 = r0.getNonActionItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup
            android.content.Context r3 = r7.mContext
            androidx.appcompat.view.menu.MenuBuilder r4 = r7.mMenu
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r7.mOverflowButton
            r6 = 1
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r1 = new androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable
            r1.<init>(r7, r0)
            r7.mPostedOpenRunnable = r1
            androidx.appcompat.view.menu.MenuView r0 = r7.mMenuView
            android.view.View r0 = (android.view.View) r0
            r0.post(r1)
            r0 = 1
            return r0
        L3e:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r5) {
            r4 = this;
            super.updateMenuView(r5)
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            r0 = 0
            if (r5 == 0) goto L2c
            java.util.ArrayList r5 = r5.getActionItems()
            int r1 = r5.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2c
            java.lang.Object r3 = r5.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            androidx.core.view.ActionProvider r3 = r3.getSupportActionProvider()
            if (r3 == 0) goto L29
            r3.setSubUiVisibilityListener(r4)
        L29:
            int r2 = r2 + 1
            goto L18
        L2c:
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            if (r5 == 0) goto L35
            java.util.ArrayList r5 = r5.getNonActionItems()
            goto L36
        L35:
            r5 = 0
        L36:
            boolean r1 = r4.mReserveOverflow
            if (r1 == 0) goto L53
            if (r5 == 0) goto L53
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L50
            java.lang.Object r5 = r5.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            boolean r5 = r5.isActionViewExpanded()
            r0 = r5 ^ 1
            goto L53
        L50:
            if (r1 <= 0) goto L53
            r0 = 1
        L53:
            if (r0 == 0) goto L83
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 != 0) goto L62
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r0 = r4.mSystemContext
            r5.<init>(r4, r0)
            r4.mOverflowButton = r5
        L62:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.appcompat.view.menu.MenuView r0 = r4.mMenuView
            if (r5 == r0) goto L96
            if (r5 == 0) goto L75
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            r5.removeView(r0)
        L75:
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r5.generateOverflowButtonLayoutParams()
            r5.addView(r0, r1)
            goto L96
        L83:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 == 0) goto L96
            android.view.ViewParent r5 = r5.getParent()
            androidx.appcompat.view.menu.MenuView r0 = r4.mMenuView
            if (r5 != r0) goto L96
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            r0.removeView(r5)
        L96:
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            boolean r0 = r4.mReserveOverflow
            r5.setOverflowReserved(r0)
            return
    }
}
