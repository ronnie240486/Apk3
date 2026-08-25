package com.google.android.material.chip;

/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends com.google.android.material.internal.FlowLayout {
    private static final int DEF_STYLE_RES = 0;
    private final com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> checkableGroup;

    @androidx.annotation.Dimension
    private int chipSpacingHorizontal;

    @androidx.annotation.Dimension
    private int chipSpacingVertical;
    private final int defaultCheckedId;

    @androidx.annotation.Nullable
    private com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;

    @androidx.annotation.NonNull
    private final com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener passThroughListener;



    /* JADX INFO: loaded from: classes.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
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

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@androidx.annotation.NonNull com.google.android.material.chip.ChipGroup r1, @androidx.annotation.IdRes int r2);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@androidx.annotation.NonNull com.google.android.material.chip.ChipGroup r1, @androidx.annotation.NonNull java.util.List<java.lang.Integer> r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        public final /* synthetic */ com.google.android.material.chip.ChipGroup this$0;

        private PassThroughHierarchyChangeListener(com.google.android.material.chip.ChipGroup r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PassThroughHierarchyChangeListener(com.google.android.material.chip.ChipGroup r1, com.google.android.material.chip.ChipGroup.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ android.view.ViewGroup.OnHierarchyChangeListener access$302(com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener r0, android.view.ViewGroup.OnHierarchyChangeListener r1) {
                r0.onHierarchyChangeListener = r1
                return r1
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r3, android.view.View r4) {
                r2 = this;
                com.google.android.material.chip.ChipGroup r0 = r2.this$0
                if (r3 != r0) goto L22
                boolean r0 = r4 instanceof com.google.android.material.chip.Chip
                if (r0 == 0) goto L22
                int r0 = r4.getId()
                r1 = -1
                if (r0 != r1) goto L16
                int r0 = androidx.core.view.ViewCompat.generateViewId()
                r4.setId(r0)
            L16:
                com.google.android.material.chip.ChipGroup r0 = r2.this$0
                com.google.android.material.internal.CheckableGroup r0 = com.google.android.material.chip.ChipGroup.access$200(r0)
                r1 = r4
                com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
                r0.addCheckable(r1)
            L22:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r2.onHierarchyChangeListener
                if (r0 == 0) goto L29
                r0.onChildViewAdded(r3, r4)
            L29:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                com.google.android.material.chip.ChipGroup r0 = r2.this$0
                if (r3 != r0) goto L12
                boolean r1 = r4 instanceof com.google.android.material.chip.Chip
                if (r1 == 0) goto L12
                com.google.android.material.internal.CheckableGroup r0 = com.google.android.material.chip.ChipGroup.access$200(r0)
                r1 = r4
                com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
                r0.removeCheckable(r1)
            L12:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r2.onHierarchyChangeListener
                if (r0 == 0) goto L19
                r0.onChildViewRemoved(r3, r4)
            L19:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_ChipGroup
            com.google.android.material.chip.ChipGroup.DEF_STYLE_RES = r0
            return
    }

    public ChipGroup(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ChipGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.chipGroupStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.CheckableGroup r9 = new com.google.android.material.internal.CheckableGroup
            r9.<init>()
            r8.checkableGroup = r9
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r6 = new com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener
            r0 = 0
            r6.<init>(r8, r0)
            r8.passThroughListener = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.defaultCheckedId = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$1 r10 = new com.google.android.material.chip.ChipGroup$1
            r10.<init>(r8)
            r9.setOnCheckedStateChangeListener(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r8, r9)
            return
    }

    public static /* synthetic */ com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener access$100(com.google.android.material.chip.ChipGroup r0) {
            com.google.android.material.chip.ChipGroup$OnCheckedStateChangeListener r0 = r0.onCheckedStateChangeListener
            return r0
    }

    public static /* synthetic */ com.google.android.material.internal.CheckableGroup access$200(com.google.android.material.chip.ChipGroup r0) {
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r0.checkableGroup
            return r0
    }

    private int getVisibleChipCount() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L1b
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L18
            boolean r2 = r3.isChildVisible(r0)
            if (r2 == 0) goto L18
            int r1 = r1 + 1
        L18:
            int r0 = r0 + 1
            goto L2
        L1b:
            return r1
    }

    private boolean isChildVisible(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public void check(@androidx.annotation.IdRes int r2) {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            r0.check(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof com.google.android.material.chip.ChipGroup.LayoutParams
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void clearCheck() {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            r0.clearCheck()
            return
    }

    @Override // android.view.ViewGroup
    @androidx.annotation.NonNull
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    @androidx.annotation.NonNull
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    @androidx.annotation.NonNull
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.IdRes
    public int getCheckedChipId() {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            int r0 = r0.getSingleCheckedId()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.Integer> getCheckedChipIds() {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            java.util.List r0 = r0.getCheckedIdsSortedByChildOrder(r1)
            return r0
    }

    @androidx.annotation.Dimension
    public int getChipSpacingHorizontal() {
            r1 = this;
            int r0 = r1.chipSpacingHorizontal
            return r0
    }

    @androidx.annotation.Dimension
    public int getChipSpacingVertical() {
            r1 = this;
            int r0 = r1.chipSpacingVertical
            return r0
    }

    public final int getIndexOfChip(@androidx.annotation.Nullable android.view.View r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.material.chip.Chip
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = 0
        L8:
            int r3 = r5.getChildCount()
            if (r0 >= r3) goto L26
            android.view.View r3 = r5.getChildAt(r0)
            boolean r4 = r3 instanceof com.google.android.material.chip.Chip
            if (r4 == 0) goto L23
            boolean r4 = r5.isChildVisible(r0)
            if (r4 == 0) goto L23
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            if (r3 != r6) goto L21
            return r2
        L21:
            int r2 = r2 + 1
        L23:
            int r0 = r0 + 1
            goto L8
        L26:
            return r1
    }

    public boolean isSelectionRequired() {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            boolean r0 = r0.isSelectionRequired()
            return r0
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
            r1 = this;
            boolean r0 = super.isSingleLine()
            return r0
    }

    public boolean isSingleSelection() {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            boolean r0 = r0.isSingleSelection()
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.defaultCheckedId
            r1 = -1
            if (r0 == r1) goto Ld
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r1 = r2.checkableGroup
            r1.check(r0)
        Ld:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r5)
            boolean r0 = r4.isSingleLine()
            if (r0 == 0) goto L12
            int r0 = r4.getVisibleChipCount()
            goto L13
        L12:
            r0 = -1
        L13:
            int r1 = r4.getRowCount()
            r2 = 0
            boolean r3 = r4.isSingleSelection()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 2
        L21:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r1, r0, r2, r3)
            r5.setCollectionInfo(r0)
            return
    }

    public void setChipSpacing(@androidx.annotation.Dimension int r1) {
            r0 = this;
            r0.setChipSpacingHorizontal(r1)
            r0.setChipSpacingVertical(r1)
            return
    }

    public void setChipSpacingHorizontal(@androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.chipSpacingHorizontal
            if (r0 == r2) goto Lc
            r1.chipSpacingHorizontal = r2
            r1.setItemSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingHorizontalResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingHorizontal(r2)
            return
    }

    public void setChipSpacingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacing(r2)
            return
    }

    public void setChipSpacingVertical(@androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.chipSpacingVertical
            if (r0 == r2) goto Lc
            r1.chipSpacingVertical = r2
            r1.setLineSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingVerticalResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingVertical(r2)
            return
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setFlexWrap(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setOnCheckedChangeListener(@androidx.annotation.Nullable com.google.android.material.chip.ChipGroup.OnCheckedChangeListener r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            r1.setOnCheckedStateChangeListener(r2)
            return
        L7:
            com.google.android.material.chip.ChipGroup$2 r0 = new com.google.android.material.chip.ChipGroup$2
            r0.<init>(r1, r2)
            r1.setOnCheckedStateChangeListener(r0)
            return
    }

    public void setOnCheckedStateChangeListener(@androidx.annotation.Nullable com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener r1) {
            r0 = this;
            r0.onCheckedStateChangeListener = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r0 = r1.passThroughListener
            com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener.access$302(r0, r2)
            return
    }

    public void setSelectionRequired(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            r0.setSelectionRequired(r2)
            return
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    public void setSingleLine(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleLine(r2)
            return
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean r1) {
            r0 = this;
            super.setSingleLine(r1)
            return
    }

    public void setSingleSelection(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> r0 = r1.checkableGroup
            r0.setSingleSelection(r2)
            return
    }
}
