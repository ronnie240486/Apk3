package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.MenuItemHoverListener {
    private static final java.lang.String TAG = "MenuPopupWindow";
    private static java.lang.reflect.Method sSetTouchModalMethod;
    private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setEnterTransition(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setEnterTransition(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setExitTransition(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setExitTransition(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTouchModal(android.widget.PopupWindow r0, boolean r1) {
                r0.setTouchModal(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends androidx.appcompat.widget.DropDownListView {
        public final int mAdvanceKey;
        private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;
        private android.view.MenuItem mHoveredMenuItem;
        public final int mRetreatKey;

        /* JADX INFO: loaded from: classes.dex */
        @androidx.annotation.RequiresApi(17)
        public static class Api17Impl {
            private Api17Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.DoNotInline
            public static int getLayoutDirection(android.content.res.Configuration r0) {
                    int r0 = r0.getLayoutDirection()
                    return r0
            }
        }

        public MenuDropDownListView(android.content.Context r3, boolean r4) {
                r2 = this;
                r2.<init>(r3, r4)
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r4 = 1
                int r3 = androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView.Api17Impl.getLayoutDirection(r3)
                r0 = 21
                r1 = 22
                if (r4 != r3) goto L1b
                r2.mAdvanceKey = r0
                r2.mRetreatKey = r1
                goto L1f
            L1b:
                r2.mAdvanceKey = r1
                r2.mRetreatKey = r0
            L1f:
                return
        }

        public void clearSelection() {
                r1 = this;
                r0 = -1
                r1.setSelection(r0)
                return
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
                r1 = this;
                boolean r0 = super.hasFocus()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
                r1 = this;
                boolean r0 = super.hasWindowFocus()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
                r1 = this;
                boolean r0 = super.isFocused()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
                r1 = this;
                boolean r0 = super.isInTouchMode()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int r1, boolean r2) {
                r0 = this;
                int r1 = super.lookForSelectablePosition(r1, r2)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r1 = super.measureHeightOfChildrenCompat(r1, r2, r3, r4, r5)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(android.view.MotionEvent r1, int r2) {
                r0 = this;
                boolean r1 = super.onForwardedEvent(r1, r2)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r6) {
                r5 = this;
                androidx.appcompat.widget.MenuItemHoverListener r0 = r5.mHoverListener
                if (r0 == 0) goto L5b
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L19
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.MenuAdapter r0 = (androidx.appcompat.view.menu.MenuAdapter) r0
                goto L1c
            L19:
                r1 = 0
                androidx.appcompat.view.menu.MenuAdapter r0 = (androidx.appcompat.view.menu.MenuAdapter) r0
            L1c:
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L43
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L43
                int r3 = r3 - r1
                if (r3 < 0) goto L43
                int r1 = r0.getCount()
                if (r3 >= r1) goto L43
                androidx.appcompat.view.menu.MenuItemImpl r2 = r0.getItem(r3)
            L43:
                android.view.MenuItem r1 = r5.mHoveredMenuItem
                if (r1 == r2) goto L5b
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.getAdapterMenu()
                if (r1 == 0) goto L52
                androidx.appcompat.widget.MenuItemHoverListener r3 = r5.mHoverListener
                r3.onItemHoverExit(r0, r1)
            L52:
                r5.mHoveredMenuItem = r2
                if (r2 == 0) goto L5b
                androidx.appcompat.widget.MenuItemHoverListener r1 = r5.mHoverListener
                r1.onItemHoverEnter(r0, r2)
            L5b:
                boolean r6 = super.onHoverEvent(r6)
                return r6
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L29
                int r2 = r4.mAdvanceKey
                if (r5 != r2) goto L29
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L28
                androidx.appcompat.view.menu.MenuItemImpl r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L28
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L28:
                return r1
            L29:
                if (r0 == 0) goto L4f
                int r0 = r4.mRetreatKey
                if (r5 != r0) goto L4f
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r5 = r4.getAdapter()
                boolean r6 = r5 instanceof android.widget.HeaderViewListAdapter
                if (r6 == 0) goto L44
                android.widget.HeaderViewListAdapter r5 = (android.widget.HeaderViewListAdapter) r5
                android.widget.ListAdapter r5 = r5.getWrappedAdapter()
                androidx.appcompat.view.menu.MenuAdapter r5 = (androidx.appcompat.view.menu.MenuAdapter) r5
                goto L46
            L44:
                androidx.appcompat.view.menu.MenuAdapter r5 = (androidx.appcompat.view.menu.MenuAdapter) r5
            L46:
                androidx.appcompat.view.menu.MenuBuilder r5 = r5.getAdapterMenu()
                r6 = 0
                r5.close(r6)
                return r1
            L4f:
                boolean r5 = super.onKeyDown(r5, r6)
                return r5
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                boolean r1 = super.onTouchEvent(r1)
                return r1
        }

        public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener r1) {
                r0 = this;
                r0.mHoverListener = r1
                return
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L1a
            r1 = 28
            if (r0 > r1) goto L21
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1a
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.appcompat.widget.MenuPopupWindow.sSetTouchModalMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L21
        L1a:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L21:
            return
    }

    public MenuPopupWindow(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @androidx.annotation.NonNull
    public final androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView r0 = new androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r2, @androidx.annotation.NonNull android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            if (r0 == 0) goto L7
            r0.onItemHoverEnter(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r2, @androidx.annotation.NonNull android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            if (r0 == 0) goto L7
            r0.onItemHoverExit(r2, r3)
        L7:
            return
    }

    public void setEnterTransition(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.widget.PopupWindow r0 = r2.mPopup
            android.transition.Transition r3 = (android.transition.Transition) r3
            androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setEnterTransition(r0, r3)
        Ld:
            return
    }

    public void setExitTransition(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.widget.PopupWindow r0 = r2.mPopup
            android.transition.Transition r3 = (android.transition.Transition) r3
            androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setExitTransition(r0, r3)
        Ld:
            return
    }

    public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener r1) {
            r0 = this;
            r0.mHoverListener = r1
            return
    }

    public void setTouchModal(boolean r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L22
            java.lang.reflect.Method r0 = androidx.appcompat.widget.MenuPopupWindow.sSetTouchModalMethod
            if (r0 == 0) goto L27
            android.widget.PopupWindow r1 = r4.mPopup     // Catch: java.lang.Exception -> L1a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1a
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L1a
            r2[r3] = r5     // Catch: java.lang.Exception -> L1a
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L27
        L1a:
            java.lang.String r5 = "MenuPopupWindow"
            java.lang.String r0 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r5, r0)
            goto L27
        L22:
            android.widget.PopupWindow r0 = r4.mPopup
            androidx.appcompat.widget.MenuPopupWindow.Api29Impl.setTouchModal(r0, r5)
        L27:
            return
    }
}
