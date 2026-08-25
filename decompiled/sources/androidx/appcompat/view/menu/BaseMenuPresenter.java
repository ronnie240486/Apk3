package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class BaseMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    private androidx.appcompat.view.menu.MenuPresenter.Callback mCallback;
    public android.content.Context mContext;
    private int mId;
    private int mItemLayoutRes;
    public androidx.appcompat.view.menu.MenuBuilder mMenu;
    private int mMenuLayoutRes;
    public androidx.appcompat.view.menu.MenuView mMenuView;
    public android.content.Context mSystemContext;
    public android.view.LayoutInflater mSystemInflater;

    public BaseMenuPresenter(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mSystemContext = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.mSystemInflater = r1
            r0.mMenuLayoutRes = r2
            r0.mItemLayoutRes = r3
            return
    }

    public abstract void bindItemView(androidx.appcompat.view.menu.MenuItemImpl r1, androidx.appcompat.view.menu.MenuView.ItemView r2);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.appcompat.view.menu.MenuView.ItemView createItemView(android.view.ViewGroup r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.mSystemInflater
            int r1 = r3.mItemLayoutRes
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.MenuView$ItemView r4 = (androidx.appcompat.view.menu.MenuView.ItemView) r4
            return r4
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean filterLeftoverView(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r1.removeViewAt(r2)
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.appcompat.view.menu.MenuPresenter.Callback getCallback() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r0 == 0) goto L7
            androidx.appcompat.view.menu.MenuView$ItemView r3 = (androidx.appcompat.view.menu.MenuView.ItemView) r3
            goto Lb
        L7:
            androidx.appcompat.view.menu.MenuView$ItemView r3 = r1.createItemView(r4)
        Lb:
            r1.bindItemView(r2, r3)
            android.view.View r3 = (android.view.View) r3
            return r3
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            if (r0 != 0) goto L1a
            android.view.LayoutInflater r0 = r3.mSystemInflater
            int r1 = r3.mMenuLayoutRes
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.MenuView r4 = (androidx.appcompat.view.menu.MenuView) r4
            r3.mMenuView = r4
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            r4.initialize(r0)
            r4 = 1
            r3.updateMenuView(r4)
        L1a:
            androidx.appcompat.view.menu.MenuView r4 = r3.mMenuView
            return r4
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2) {
            r0 = this;
            r0.mContext = r1
            android.view.LayoutInflater.from(r1)
            r0.mMenu = r2
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onCloseMenu(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            if (r0 == 0) goto Le
            if (r2 == 0) goto L7
            goto L9
        L7:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
        L9:
            boolean r2 = r0.onOpenSubMenu(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    public boolean shouldIncludeItem(int r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r10) {
            r9 = this;
            androidx.appcompat.view.menu.MenuView r10 = r9.mMenuView
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r10 != 0) goto L7
            return
        L7:
            androidx.appcompat.view.menu.MenuBuilder r0 = r9.mMenu
            r1 = 0
            if (r0 == 0) goto L60
            r0.flagActionItems()
            androidx.appcompat.view.menu.MenuBuilder r0 = r9.mMenu
            java.util.ArrayList r0 = r0.getVisibleItems()
            int r2 = r0.size()
            r3 = 0
            r4 = 0
        L1b:
            if (r3 >= r2) goto L5f
            java.lang.Object r5 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            boolean r6 = r9.shouldIncludeItem(r4, r5)
            if (r6 == 0) goto L5c
            android.view.View r6 = r10.getChildAt(r4)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r7 == 0) goto L39
            r7 = r6
            androidx.appcompat.view.menu.MenuView$ItemView r7 = (androidx.appcompat.view.menu.MenuView.ItemView) r7
            androidx.appcompat.view.menu.MenuItemImpl r7 = r7.getItemData()
            goto L3a
        L39:
            r7 = 0
        L3a:
            android.view.View r8 = r9.getItemView(r5, r6, r10)
            if (r5 == r7) goto L46
            r8.setPressed(r1)
            r8.jumpDrawablesToCurrentState()
        L46:
            if (r8 == r6) goto L5a
            android.view.ViewParent r5 = r8.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L53
            r5.removeView(r8)
        L53:
            androidx.appcompat.view.menu.MenuView r5 = r9.mMenuView
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.addView(r8, r4)
        L5a:
            int r4 = r4 + 1
        L5c:
            int r3 = r3 + 1
            goto L1b
        L5f:
            r1 = r4
        L60:
            int r0 = r10.getChildCount()
            if (r1 >= r0) goto L6f
            boolean r0 = r9.filterLeftoverView(r10, r1)
            if (r0 != 0) goto L60
            int r1 = r1 + 1
            goto L60
        L6f:
            return
    }
}
