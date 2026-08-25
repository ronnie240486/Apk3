package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final java.lang.String STATE_ADAPTER = "android:menu:adapter";
    private static final java.lang.String STATE_HEADER = "android:menu:header";
    private static final java.lang.String STATE_HIERARCHY = "android:menu:list";
    public com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter adapter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback callback;

    @androidx.annotation.Px
    public int dividerInsetEnd;

    @androidx.annotation.Px
    public int dividerInsetStart;
    public boolean hasCustomItemIconSize;
    public android.widget.LinearLayout headerLayout;
    public android.content.res.ColorStateList iconTintList;
    private int id;
    public boolean isBehindStatusBar;
    public android.graphics.drawable.Drawable itemBackground;
    public android.graphics.drawable.RippleDrawable itemForeground;
    public int itemHorizontalPadding;
    public int itemIconPadding;
    public int itemIconSize;
    private int itemMaxLines;

    @androidx.annotation.Px
    public int itemVerticalPadding;
    public android.view.LayoutInflater layoutInflater;
    public androidx.appcompat.view.menu.MenuBuilder menu;
    private com.google.android.material.internal.NavigationMenuView menuView;
    public final android.view.View.OnClickListener onClickListener;
    private int overScrollMode;
    public int paddingSeparator;
    private int paddingTopDefault;

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList subheaderColor;

    @androidx.annotation.Px
    public int subheaderInsetEnd;

    @androidx.annotation.Px
    public int subheaderInsetStart;
    public int subheaderTextAppearance;
    public int textAppearance;
    public android.content.res.ColorStateList textColor;


    public static class HeaderViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public HeaderViewHolder(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class NavigationMenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.internal.NavigationMenuPresenter.ViewHolder> {
        private static final java.lang.String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final java.lang.String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private androidx.appcompat.view.menu.MenuItemImpl checkedItem;
        private final java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem> items;
        public final /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter this$0;
        private boolean updateSuspended;


        public NavigationMenuAdapter(com.google.android.material.internal.NavigationMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.items = r1
                r0.prepareMenuItems()
                return
        }

        public static /* synthetic */ int access$100(com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter r0, int r1) {
                int r0 = r0.adjustItemPositionForA11yDelegate(r1)
                return r0
        }

        private int adjustItemPositionForA11yDelegate(int r5) {
                r4 = this;
                r0 = 0
                r1 = r5
            L2:
                if (r0 >= r5) goto L14
                com.google.android.material.internal.NavigationMenuPresenter r2 = r4.this$0
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r2 = r2.adapter
                int r2 = r2.getItemViewType(r0)
                r3 = 2
                if (r2 != r3) goto L11
                int r1 = r1 + (-1)
            L11:
                int r0 = r0 + 1
                goto L2
            L14:
                com.google.android.material.internal.NavigationMenuPresenter r5 = r4.this$0
                android.widget.LinearLayout r5 = r5.headerLayout
                int r5 = r5.getChildCount()
                if (r5 != 0) goto L20
                int r1 = r1 + (-1)
            L20:
                return r1
        }

        private void appendTransparentIconIfMissing(int r3, int r4) {
                r2 = this;
            L0:
                if (r3 >= r4) goto L10
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r2.items
                java.lang.Object r0 = r0.get(r3)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r0 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r0
                r1 = 1
                r0.needsEmptyIcon = r1
                int r3 = r3 + 1
                goto L0
            L10:
                return
        }

        private void prepareMenuItems() {
                r16 = this;
                r0 = r16
                boolean r1 = r0.updateSuspended
                if (r1 == 0) goto L7
                return
            L7:
                r1 = 1
                r0.updateSuspended = r1
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r0.items
                r2.clear()
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r0.items
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuHeaderItem r3 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuHeaderItem
                r3.<init>()
                r2.add(r3)
                r2 = -1
                com.google.android.material.internal.NavigationMenuPresenter r3 = r0.this$0
                androidx.appcompat.view.menu.MenuBuilder r3 = r3.menu
                java.util.ArrayList r3 = r3.getVisibleItems()
                int r3 = r3.size()
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
            L2a:
                if (r5 >= r3) goto L111
                com.google.android.material.internal.NavigationMenuPresenter r8 = r0.this$0
                androidx.appcompat.view.menu.MenuBuilder r8 = r8.menu
                java.util.ArrayList r8 = r8.getVisibleItems()
                java.lang.Object r8 = r8.get(r5)
                androidx.appcompat.view.menu.MenuItemImpl r8 = (androidx.appcompat.view.menu.MenuItemImpl) r8
                boolean r9 = r8.isChecked()
                if (r9 == 0) goto L43
                r0.setCheckedItem(r8)
            L43:
                boolean r9 = r8.isCheckable()
                if (r9 == 0) goto L4c
                r8.setExclusiveCheckable(r4)
            L4c:
                boolean r9 = r8.hasSubMenu()
                if (r9 == 0) goto Lc5
                android.view.SubMenu r9 = r8.getSubMenu()
                boolean r10 = r9.hasVisibleItems()
                if (r10 == 0) goto L10c
                if (r5 == 0) goto L6c
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r10 = r0.items
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem r11 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem
                com.google.android.material.internal.NavigationMenuPresenter r12 = r0.this$0
                int r12 = r12.paddingSeparator
                r11.<init>(r12, r4)
                r10.add(r11)
            L6c:
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r10 = r0.items
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r11 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem
                r11.<init>(r8)
                r10.add(r11)
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r10 = r0.items
                int r10 = r10.size()
                int r11 = r9.size()
                r12 = 0
                r13 = 0
            L82:
                if (r12 >= r11) goto Lb9
                android.view.MenuItem r14 = r9.getItem(r12)
                androidx.appcompat.view.menu.MenuItemImpl r14 = (androidx.appcompat.view.menu.MenuItemImpl) r14
                boolean r15 = r14.isVisible()
                if (r15 == 0) goto Lb5
                if (r13 != 0) goto L99
                android.graphics.drawable.Drawable r15 = r14.getIcon()
                if (r15 == 0) goto L99
                r13 = 1
            L99:
                boolean r15 = r14.isCheckable()
                if (r15 == 0) goto La2
                r14.setExclusiveCheckable(r4)
            La2:
                boolean r15 = r8.isChecked()
                if (r15 == 0) goto Lab
                r0.setCheckedItem(r8)
            Lab:
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r15 = r0.items
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r1 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem
                r1.<init>(r14)
                r15.add(r1)
            Lb5:
                int r12 = r12 + 1
                r1 = 1
                goto L82
            Lb9:
                if (r13 == 0) goto L10c
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r1 = r0.items
                int r1 = r1.size()
                r0.appendTransparentIconIfMissing(r10, r1)
                goto L10c
            Lc5:
                int r1 = r8.getGroupId()
                if (r1 == r2) goto Led
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r0.items
                int r7 = r2.size()
                android.graphics.drawable.Drawable r2 = r8.getIcon()
                if (r2 == 0) goto Ld9
                r6 = 1
                goto Lda
            Ld9:
                r6 = 0
            Lda:
                if (r5 == 0) goto Lff
                int r7 = r7 + 1
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r0.items
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem r9 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem
                com.google.android.material.internal.NavigationMenuPresenter r10 = r0.this$0
                int r10 = r10.paddingSeparator
                r9.<init>(r10, r10)
                r2.add(r9)
                goto Lff
            Led:
                if (r6 != 0) goto Lff
                android.graphics.drawable.Drawable r2 = r8.getIcon()
                if (r2 == 0) goto Lff
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r0.items
                int r2 = r2.size()
                r0.appendTransparentIconIfMissing(r7, r2)
                r6 = 1
            Lff:
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r2 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem
                r2.<init>(r8)
                r2.needsEmptyIcon = r6
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r8 = r0.items
                r8.add(r2)
                r2 = r1
            L10c:
                int r5 = r5 + 1
                r1 = 1
                goto L2a
            L111:
                r0.updateSuspended = r4
                return
        }

        private void setAccessibilityDelegate(android.view.View r2, int r3, boolean r4) {
                r1 = this;
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter$1 r0 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter$1
                r0.<init>(r1, r3, r4)
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r2, r0)
                return
        }

        @androidx.annotation.NonNull
        public android.os.Bundle createInstanceState() {
                r7 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                androidx.appcompat.view.menu.MenuItemImpl r1 = r7.checkedItem
                if (r1 == 0) goto L12
                int r1 = r1.getItemId()
                java.lang.String r2 = "android:menu:checked"
                r0.putInt(r2, r1)
            L12:
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r2 = 0
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r3 = r7.items
                int r3 = r3.size()
            L1e:
                if (r2 >= r3) goto L4e
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r4 = r7.items
                java.lang.Object r4 = r4.get(r2)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem r4 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem) r4
                boolean r5 = r4 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem
                if (r5 == 0) goto L4b
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r4 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r4
                androidx.appcompat.view.menu.MenuItemImpl r4 = r4.getMenuItem()
                if (r4 == 0) goto L39
                android.view.View r5 = r4.getActionView()
                goto L3a
            L39:
                r5 = 0
            L3a:
                if (r5 == 0) goto L4b
                com.google.android.material.internal.ParcelableSparseArray r6 = new com.google.android.material.internal.ParcelableSparseArray
                r6.<init>()
                r5.saveHierarchyState(r6)
                int r4 = r4.getItemId()
                r1.put(r4, r6)
            L4b:
                int r2 = r2 + 1
                goto L1e
            L4e:
                java.lang.String r2 = "android:menu:action_views"
                r0.putSparseParcelableArray(r2, r1)
                return r0
        }

        public androidx.appcompat.view.menu.MenuItemImpl getCheckedItem() {
                r1 = this;
                androidx.appcompat.view.menu.MenuItemImpl r0 = r1.checkedItem
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r1.items
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int r2) {
                r1 = this;
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r1.items
                java.lang.Object r2 = r0.get(r2)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem r2 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem) r2
                boolean r0 = r2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem
                if (r0 == 0) goto Le
                r2 = 2
                return r2
            Le:
                boolean r0 = r2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuHeaderItem
                if (r0 == 0) goto L14
                r2 = 3
                return r2
            L14:
                boolean r0 = r2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem
                if (r0 == 0) goto L28
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r2 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r2
                androidx.appcompat.view.menu.MenuItemImpl r2 = r2.getMenuItem()
                boolean r2 = r2.hasSubMenu()
                if (r2 == 0) goto L26
                r2 = 1
                return r2
            L26:
                r2 = 0
                return r2
            L28:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r0 = "Unknown item type."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                com.google.android.material.internal.NavigationMenuPresenter$ViewHolder r1 = (com.google.android.material.internal.NavigationMenuPresenter.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(@androidx.annotation.NonNull com.google.android.material.internal.NavigationMenuPresenter.ViewHolder r6, int r7) {
                r5 = this;
                int r0 = r5.getItemViewType(r7)
                if (r0 == 0) goto L78
                r1 = 1
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L18
                r2 = 3
                if (r0 == r2) goto L11
                goto Lf5
            L11:
                android.view.View r6 = r6.itemView
                r5.setAccessibilityDelegate(r6, r7, r1)
                goto Lf5
            L18:
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r5.items
                java.lang.Object r7 = r0.get(r7)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem r7 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuSeparatorItem) r7
                android.view.View r6 = r6.itemView
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                int r0 = r0.dividerInsetStart
                int r1 = r7.getPaddingTop()
                com.google.android.material.internal.NavigationMenuPresenter r2 = r5.this$0
                int r2 = r2.dividerInsetEnd
                int r7 = r7.getPaddingBottom()
                r6.setPadding(r0, r1, r2, r7)
                goto Lf5
            L37:
                android.view.View r6 = r6.itemView
                android.widget.TextView r6 = (android.widget.TextView) r6
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r5.items
                java.lang.Object r0 = r0.get(r7)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r0 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r0
                androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getMenuItem()
                java.lang.CharSequence r0 = r0.getTitle()
                r6.setText(r0)
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                int r0 = r0.subheaderTextAppearance
                if (r0 == 0) goto L57
                androidx.core.widget.TextViewCompat.setTextAppearance(r6, r0)
            L57:
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                int r0 = r0.subheaderInsetStart
                int r2 = r6.getPaddingTop()
                com.google.android.material.internal.NavigationMenuPresenter r3 = r5.this$0
                int r3 = r3.subheaderInsetEnd
                int r4 = r6.getPaddingBottom()
                r6.setPadding(r0, r2, r3, r4)
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                android.content.res.ColorStateList r0 = r0.subheaderColor
                if (r0 == 0) goto L73
                r6.setTextColor(r0)
            L73:
                r5.setAccessibilityDelegate(r6, r7, r1)
                goto Lf5
            L78:
                android.view.View r6 = r6.itemView
                com.google.android.material.internal.NavigationMenuItemView r6 = (com.google.android.material.internal.NavigationMenuItemView) r6
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                android.content.res.ColorStateList r0 = r0.iconTintList
                r6.setIconTintList(r0)
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                int r0 = r0.textAppearance
                if (r0 == 0) goto L8c
                r6.setTextAppearance(r0)
            L8c:
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                android.content.res.ColorStateList r0 = r0.textColor
                if (r0 == 0) goto L95
                r6.setTextColor(r0)
            L95:
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.itemBackground
                if (r0 == 0) goto La4
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                goto La5
            La4:
                r0 = 0
            La5:
                androidx.core.view.ViewCompat.setBackground(r6, r0)
                com.google.android.material.internal.NavigationMenuPresenter r0 = r5.this$0
                android.graphics.drawable.RippleDrawable r0 = r0.itemForeground
                if (r0 == 0) goto Lb9
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                r6.setForeground(r0)
            Lb9:
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r5.items
                java.lang.Object r0 = r0.get(r7)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r0 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r0
                boolean r1 = r0.needsEmptyIcon
                r6.setNeedsEmptyIcon(r1)
                com.google.android.material.internal.NavigationMenuPresenter r1 = r5.this$0
                int r2 = r1.itemHorizontalPadding
                int r1 = r1.itemVerticalPadding
                r6.setPadding(r2, r1, r2, r1)
                com.google.android.material.internal.NavigationMenuPresenter r1 = r5.this$0
                int r1 = r1.itemIconPadding
                r6.setIconPadding(r1)
                com.google.android.material.internal.NavigationMenuPresenter r1 = r5.this$0
                boolean r2 = r1.hasCustomItemIconSize
                if (r2 == 0) goto Le1
                int r1 = r1.itemIconSize
                r6.setIconSize(r1)
            Le1:
                com.google.android.material.internal.NavigationMenuPresenter r1 = r5.this$0
                int r1 = com.google.android.material.internal.NavigationMenuPresenter.access$000(r1)
                r6.setMaxLines(r1)
                androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getMenuItem()
                r1 = 0
                r6.initialize(r0, r1)
                r5.setAccessibilityDelegate(r6, r7, r1)
            Lf5:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @androidx.annotation.Nullable
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                com.google.android.material.internal.NavigationMenuPresenter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @androidx.annotation.Nullable
        public com.google.android.material.internal.NavigationMenuPresenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                if (r4 == 0) goto L2b
                r0 = 1
                if (r4 == r0) goto L21
                r0 = 2
                if (r4 == r0) goto L17
                r3 = 3
                if (r4 == r3) goto Ld
                r3 = 0
                return r3
            Ld:
                com.google.android.material.internal.NavigationMenuPresenter$HeaderViewHolder r3 = new com.google.android.material.internal.NavigationMenuPresenter$HeaderViewHolder
                com.google.android.material.internal.NavigationMenuPresenter r4 = r2.this$0
                android.widget.LinearLayout r4 = r4.headerLayout
                r3.<init>(r4)
                return r3
            L17:
                com.google.android.material.internal.NavigationMenuPresenter$SeparatorViewHolder r4 = new com.google.android.material.internal.NavigationMenuPresenter$SeparatorViewHolder
                com.google.android.material.internal.NavigationMenuPresenter r0 = r2.this$0
                android.view.LayoutInflater r0 = r0.layoutInflater
                r4.<init>(r0, r3)
                return r4
            L21:
                com.google.android.material.internal.NavigationMenuPresenter$SubheaderViewHolder r4 = new com.google.android.material.internal.NavigationMenuPresenter$SubheaderViewHolder
                com.google.android.material.internal.NavigationMenuPresenter r0 = r2.this$0
                android.view.LayoutInflater r0 = r0.layoutInflater
                r4.<init>(r0, r3)
                return r4
            L2b:
                com.google.android.material.internal.NavigationMenuPresenter$NormalViewHolder r4 = new com.google.android.material.internal.NavigationMenuPresenter$NormalViewHolder
                com.google.android.material.internal.NavigationMenuPresenter r0 = r2.this$0
                android.view.LayoutInflater r1 = r0.layoutInflater
                android.view.View$OnClickListener r0 = r0.onClickListener
                r4.<init>(r1, r3, r0)
                return r4
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                com.google.android.material.internal.NavigationMenuPresenter$ViewHolder r1 = (com.google.android.material.internal.NavigationMenuPresenter.ViewHolder) r1
                r0.onViewRecycled(r1)
                return
        }

        public void onViewRecycled(com.google.android.material.internal.NavigationMenuPresenter.ViewHolder r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NormalViewHolder
                if (r0 == 0) goto Lb
                android.view.View r2 = r2.itemView
                com.google.android.material.internal.NavigationMenuItemView r2 = (com.google.android.material.internal.NavigationMenuItemView) r2
                r2.recycle()
            Lb:
                return
        }

        public void restoreInstanceState(@androidx.annotation.NonNull android.os.Bundle r7) {
                r6 = this;
                java.lang.String r0 = "android:menu:checked"
                r1 = 0
                int r0 = r7.getInt(r0, r1)
                if (r0 == 0) goto L3b
                r2 = 1
                r6.updateSuspended = r2
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r6.items
                int r2 = r2.size()
                r3 = 0
            L13:
                if (r3 >= r2) goto L36
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r4 = r6.items
                java.lang.Object r4 = r4.get(r3)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem r4 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem) r4
                boolean r5 = r4 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem
                if (r5 == 0) goto L33
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r4 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r4
                androidx.appcompat.view.menu.MenuItemImpl r4 = r4.getMenuItem()
                if (r4 == 0) goto L33
                int r5 = r4.getItemId()
                if (r5 != r0) goto L33
                r6.setCheckedItem(r4)
                goto L36
            L33:
                int r3 = r3 + 1
                goto L13
            L36:
                r6.updateSuspended = r1
                r6.prepareMenuItems()
            L3b:
                java.lang.String r0 = "android:menu:action_views"
                android.util.SparseArray r7 = r7.getSparseParcelableArray(r0)
                if (r7 == 0) goto L7b
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r0 = r6.items
                int r0 = r0.size()
            L49:
                if (r1 >= r0) goto L7b
                java.util.ArrayList<com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem> r2 = r6.items
                java.lang.Object r2 = r2.get(r1)
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem r2 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem) r2
                boolean r3 = r2 instanceof com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem
                if (r3 != 0) goto L58
                goto L78
            L58:
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem r2 = (com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuTextItem) r2
                androidx.appcompat.view.menu.MenuItemImpl r2 = r2.getMenuItem()
                if (r2 != 0) goto L61
                goto L78
            L61:
                android.view.View r3 = r2.getActionView()
                if (r3 != 0) goto L68
                goto L78
            L68:
                int r2 = r2.getItemId()
                java.lang.Object r2 = r7.get(r2)
                com.google.android.material.internal.ParcelableSparseArray r2 = (com.google.android.material.internal.ParcelableSparseArray) r2
                if (r2 != 0) goto L75
                goto L78
            L75:
                r3.restoreHierarchyState(r2)
            L78:
                int r1 = r1 + 1
                goto L49
            L7b:
                return
        }

        public void setCheckedItem(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuItemImpl r3) {
                r2 = this;
                androidx.appcompat.view.menu.MenuItemImpl r0 = r2.checkedItem
                if (r0 == r3) goto L19
                boolean r0 = r3.isCheckable()
                if (r0 != 0) goto Lb
                goto L19
            Lb:
                androidx.appcompat.view.menu.MenuItemImpl r0 = r2.checkedItem
                if (r0 == 0) goto L13
                r1 = 0
                r0.setChecked(r1)
            L13:
                r2.checkedItem = r3
                r0 = 1
                r3.setChecked(r0)
            L19:
                return
        }

        public void setUpdateSuspended(boolean r1) {
                r0 = this;
                r0.updateSuspended = r1
                return
        }

        public void update() {
                r0 = this;
                r0.prepareMenuItems()
                r0.notifyDataSetChanged()
                return
        }
    }

    public static class NavigationMenuHeaderItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        public NavigationMenuHeaderItem() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.paddingTop = r1
                r0.paddingBottom = r2
                return
        }

        public int getPaddingBottom() {
                r1 = this;
                int r0 = r1.paddingBottom
                return r0
        }

        public int getPaddingTop() {
                r1 = this;
                int r0 = r1.paddingTop
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class NavigationMenuTextItem implements com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuItem {
        private final androidx.appcompat.view.menu.MenuItemImpl menuItem;
        public boolean needsEmptyIcon;

        public NavigationMenuTextItem(androidx.appcompat.view.menu.MenuItemImpl r1) {
                r0 = this;
                r0.<init>()
                r0.menuItem = r1
                return
        }

        public androidx.appcompat.view.menu.MenuItemImpl getMenuItem() {
                r1 = this;
                androidx.appcompat.view.menu.MenuItemImpl r0 = r1.menuItem
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class NavigationMenuViewAccessibilityDelegate extends androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate {
        public final /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter this$0;

        public NavigationMenuViewAccessibilityDelegate(@androidx.annotation.NonNull com.google.android.material.internal.NavigationMenuPresenter r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r6, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                r5 = this;
                super.onInitializeAccessibilityNodeInfo(r6, r7)
                com.google.android.material.internal.NavigationMenuPresenter r6 = r5.this$0
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r6 = r6.adapter
                com.google.android.material.internal.NavigationMenuPresenter r0 = r6.this$0
                android.widget.LinearLayout r0 = r0.headerLayout
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L16
                r0 = 0
                r3 = 0
                goto L18
            L16:
                r0 = 0
                r3 = 1
            L18:
                com.google.android.material.internal.NavigationMenuPresenter r4 = r6.this$0
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r4 = r4.adapter
                int r4 = r4.getItemCount()
                if (r0 >= r4) goto L33
                com.google.android.material.internal.NavigationMenuPresenter r4 = r6.this$0
                com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r4 = r4.adapter
                int r4 = r4.getItemViewType(r0)
                if (r4 == 0) goto L2e
                if (r4 != r2) goto L30
            L2e:
                int r3 = r3 + 1
            L30:
                int r0 = r0 + 1
                goto L18
            L33:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r6 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r3, r2, r1)
                r7.setCollectionInfo(r6)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class NormalViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public NormalViewHolder(@androidx.annotation.NonNull android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
                r2 = this;
                int r0 = com.google.android.material.R.layout.design_navigation_item
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                android.view.View r3 = r2.itemView
                r3.setOnClickListener(r5)
                return
        }
    }

    public static class SeparatorViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public SeparatorViewHolder(@androidx.annotation.NonNull android.view.LayoutInflater r3, android.view.ViewGroup r4) {
                r2 = this;
                int r0 = com.google.android.material.R.layout.design_navigation_item_separator
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SubheaderViewHolder extends com.google.android.material.internal.NavigationMenuPresenter.ViewHolder {
        public SubheaderViewHolder(@androidx.annotation.NonNull android.view.LayoutInflater r3, android.view.ViewGroup r4) {
                r2 = this;
                int r0 = com.google.android.material.R.layout.design_navigation_item_subheader
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                return
        }
    }

    public static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public ViewHolder(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public NavigationMenuPresenter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.subheaderTextAppearance = r0
            r1.textAppearance = r0
            r0 = 1
            r1.isBehindStatusBar = r0
            r0 = -1
            r1.overScrollMode = r0
            com.google.android.material.internal.NavigationMenuPresenter$1 r0 = new com.google.android.material.internal.NavigationMenuPresenter$1
            r0.<init>(r1)
            r1.onClickListener = r0
            return
    }

    public static /* synthetic */ int access$000(com.google.android.material.internal.NavigationMenuPresenter r0) {
            int r0 = r0.itemMaxLines
            return r0
    }

    private void updateTopPadding() {
            r4 = this;
            android.widget.LinearLayout r0 = r4.headerLayout
            int r0 = r0.getChildCount()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r4.isBehindStatusBar
            if (r0 == 0) goto L10
            int r0 = r4.paddingTopDefault
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.material.internal.NavigationMenuView r2 = r4.menuView
            int r3 = r2.getPaddingBottom()
            r2.setPadding(r1, r0, r1, r3)
            return
    }

    public void addHeaderView(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.headerLayout
            r0.addView(r3)
            com.google.android.material.internal.NavigationMenuView r3 = r2.menuView
            int r0 = r3.getPaddingBottom()
            r1 = 0
            r3.setPadding(r1, r1, r1, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void dispatchApplyWindowInsets(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r5) {
            r4 = this;
            int r0 = r5.getSystemWindowInsetTop()
            int r1 = r4.paddingTopDefault
            if (r1 == r0) goto Ld
            r4.paddingTopDefault = r0
            r4.updateTopPadding()
        Ld:
            com.google.android.material.internal.NavigationMenuView r0 = r4.menuView
            int r1 = r0.getPaddingTop()
            int r2 = r5.getSystemWindowInsetBottom()
            r3 = 0
            r0.setPadding(r3, r1, r3, r2)
            android.widget.LinearLayout r0 = r4.headerLayout
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r0, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.appcompat.view.menu.MenuItemImpl getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r0 = r1.adapter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getCheckedItem()
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetEnd() {
            r1 = this;
            int r0 = r1.dividerInsetEnd
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetStart() {
            r1 = this;
            int r0 = r1.dividerInsetStart
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.headerLayout
            int r0 = r0.getChildCount()
            return r0
    }

    public android.view.View getHeaderView(int r2) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.headerLayout
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.itemBackground
            return r0
    }

    public int getItemHorizontalPadding() {
            r1 = this;
            int r0 = r1.itemHorizontalPadding
            return r0
    }

    public int getItemIconPadding() {
            r1 = this;
            int r0 = r1.itemIconPadding
            return r0
    }

    public int getItemMaxLines() {
            r1 = this;
            int r0 = r1.itemMaxLines
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.textColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.iconTintList
            return r0
    }

    @androidx.annotation.Px
    public int getItemVerticalPadding() {
            r1 = this;
            int r0 = r1.itemVerticalPadding
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            com.google.android.material.internal.NavigationMenuView r0 = r3.menuView
            if (r0 != 0) goto L45
            android.view.LayoutInflater r0 = r3.layoutInflater
            int r1 = com.google.android.material.R.layout.design_navigation_menu
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            com.google.android.material.internal.NavigationMenuView r4 = (com.google.android.material.internal.NavigationMenuView) r4
            r3.menuView = r4
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate r0 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate
            com.google.android.material.internal.NavigationMenuView r1 = r3.menuView
            r0.<init>(r3, r1)
            r4.setAccessibilityDelegateCompat(r0)
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r4 = r3.adapter
            if (r4 != 0) goto L26
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r4 = new com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter
            r4.<init>(r3)
            r3.adapter = r4
        L26:
            int r4 = r3.overScrollMode
            r0 = -1
            if (r4 == r0) goto L30
            com.google.android.material.internal.NavigationMenuView r0 = r3.menuView
            r0.setOverScrollMode(r4)
        L30:
            android.view.LayoutInflater r4 = r3.layoutInflater
            int r0 = com.google.android.material.R.layout.design_navigation_item_header
            com.google.android.material.internal.NavigationMenuView r1 = r3.menuView
            android.view.View r4 = r4.inflate(r0, r1, r2)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.headerLayout = r4
            com.google.android.material.internal.NavigationMenuView r4 = r3.menuView
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r0 = r3.adapter
            r4.setAdapter(r0)
        L45:
            com.google.android.material.internal.NavigationMenuView r4 = r3.menuView
            return r4
    }

    @androidx.annotation.Px
    public int getSubheaderInsetEnd() {
            r1 = this;
            int r0 = r1.subheaderInsetEnd
            return r0
    }

    @androidx.annotation.Px
    public int getSubheaderInsetStart() {
            r1 = this;
            int r0 = r1.subheaderInsetStart
            return r0
    }

    public android.view.View inflateHeaderView(@androidx.annotation.LayoutRes int r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.layoutInflater
            android.widget.LinearLayout r1 = r3.headerLayout
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.addHeaderView(r4)
            return r4
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r3) {
            r1 = this;
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            r1.layoutInflater = r0
            r1.menu = r3
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.design_navigation_separator_vertical_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r1.paddingSeparator = r2
            return
    }

    public boolean isBehindStatusBar() {
            r1 = this;
            boolean r0 = r1.isBehindStatusBar
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.callback
            if (r0 == 0) goto L7
            r0.onCloseMenu(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.os.Bundle
            if (r0 == 0) goto L2d
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r0 = r3.getSparseParcelableArray(r0)
            if (r0 == 0) goto L13
            com.google.android.material.internal.NavigationMenuView r1 = r2.menuView
            r1.restoreHierarchyState(r0)
        L13:
            java.lang.String r0 = "android:menu:adapter"
            android.os.Bundle r0 = r3.getBundle(r0)
            if (r0 == 0) goto L20
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r1 = r2.adapter
            r1.restoreInstanceState(r0)
        L20:
            java.lang.String r0 = "android:menu:header"
            android.util.SparseArray r3 = r3.getSparseParcelableArray(r0)
            if (r3 == 0) goto L2d
            android.widget.LinearLayout r0 = r2.headerLayout
            r0.restoreHierarchyState(r3)
        L2d:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @androidx.annotation.NonNull
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.material.internal.NavigationMenuView r1 = r3.menuView
            if (r1 == 0) goto L18
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.google.android.material.internal.NavigationMenuView r2 = r3.menuView
            r2.saveHierarchyState(r1)
            java.lang.String r2 = "android:menu:list"
            r0.putSparseParcelableArray(r2, r1)
        L18:
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r1 = r3.adapter
            if (r1 == 0) goto L25
            android.os.Bundle r1 = r1.createInstanceState()
            java.lang.String r2 = "android:menu:adapter"
            r0.putBundle(r2, r1)
        L25:
            android.widget.LinearLayout r1 = r3.headerLayout
            if (r1 == 0) goto L38
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.widget.LinearLayout r2 = r3.headerLayout
            r2.saveHierarchyState(r1)
            java.lang.String r2 = "android:menu:header"
            r0.putSparseParcelableArray(r2, r1)
        L38:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void removeHeaderView(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            android.widget.LinearLayout r0 = r3.headerLayout
            r0.removeView(r4)
            android.widget.LinearLayout r4 = r3.headerLayout
            int r4 = r4.getChildCount()
            if (r4 != 0) goto L19
            com.google.android.material.internal.NavigationMenuView r4 = r3.menuView
            int r0 = r3.paddingTopDefault
            int r1 = r4.getPaddingBottom()
            r2 = 0
            r4.setPadding(r2, r0, r2, r1)
        L19:
            return
    }

    public void setBehindStatusBar(boolean r2) {
            r1 = this;
            boolean r0 = r1.isBehindStatusBar
            if (r0 == r2) goto L9
            r1.isBehindStatusBar = r2
            r1.updateTopPadding()
        L9:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.callback = r1
            return
    }

    public void setCheckedItem(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuItemImpl r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r0 = r1.adapter
            r0.setCheckedItem(r2)
            return
    }

    public void setDividerInsetEnd(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.dividerInsetEnd = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setDividerInsetStart(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.dividerInsetStart = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.itemBackground = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemForeground(@androidx.annotation.Nullable android.graphics.drawable.RippleDrawable r1) {
            r0 = this;
            r0.itemForeground = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemHorizontalPadding(int r1) {
            r0 = this;
            r0.itemHorizontalPadding = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemIconPadding(int r1) {
            r0 = this;
            r0.itemIconPadding = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.itemIconSize
            if (r0 == r2) goto Ld
            r1.itemIconSize = r2
            r2 = 1
            r1.hasCustomItemIconSize = r2
            r2 = 0
            r1.updateMenuView(r2)
        Ld:
            return
    }

    public void setItemIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.iconTintList = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemMaxLines(int r1) {
            r0 = this;
            r0.itemMaxLines = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemTextAppearance(@androidx.annotation.StyleRes int r1) {
            r0 = this;
            r0.textAppearance = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.textColor = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setItemVerticalPadding(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.itemVerticalPadding = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setOverScrollMode(int r2) {
            r1 = this;
            r1.overScrollMode = r2
            com.google.android.material.internal.NavigationMenuView r0 = r1.menuView
            if (r0 == 0) goto L9
            r0.setOverScrollMode(r2)
        L9:
            return
    }

    public void setSubheaderColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.subheaderColor = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setSubheaderInsetEnd(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.subheaderInsetEnd = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setSubheaderInsetStart(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.subheaderInsetStart = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setSubheaderTextAppearance(@androidx.annotation.StyleRes int r1) {
            r0 = this;
            r0.subheaderTextAppearance = r1
            r1 = 0
            r0.updateMenuView(r1)
            return
    }

    public void setUpdateSuspended(boolean r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.setUpdateSuspended(r2)
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r1) {
            r0 = this;
            com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter r1 = r0.adapter
            if (r1 == 0) goto L7
            r1.update()
        L7:
            return
    }
}
