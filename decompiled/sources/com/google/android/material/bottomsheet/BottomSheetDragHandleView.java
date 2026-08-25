package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends androidx.appcompat.widget.AppCompatImageView implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = 0;

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;

    @androidx.annotation.Nullable
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final java.lang.String clickFeedback;
    private final java.lang.String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final java.lang.String clickToExpandActionLabel;
    private boolean interactable;



    /* JADX INFO: renamed from: $r8$lambda$xAn-b-a4Gk3yqfHJB7SUvsig1zc, reason: not valid java name */
    public static /* synthetic */ boolean m281$r8$lambda$xAnba4Gk3yqfHJB7SUvsig1zc(com.google.android.material.bottomsheet.BottomSheetDragHandleView r0, android.view.View r1, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r2) {
            boolean r0 = r0.lambda$onBottomSheetStateChanged$0(r1, r2)
            return r0
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_BottomSheet_DragHandle
            com.google.android.material.bottomsheet.BottomSheetDragHandleView.DEF_STYLE_RES = r0
            return
    }

    public BottomSheetDragHandleView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomSheetDragHandleView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.bottomSheetDragHandleStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomSheetDragHandleView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.bottomsheet.BottomSheetDragHandleView.DEF_STYLE_RES
            android.content.Context r2 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r2, r3, r4, r0)
            r1.<init>(r2, r3, r4)
            android.content.res.Resources r2 = r1.getResources()
            int r3 = com.google.android.material.R.string.bottomsheet_action_expand
            java.lang.String r2 = r2.getString(r3)
            r1.clickToExpandActionLabel = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = com.google.android.material.R.string.bottomsheet_action_collapse
            java.lang.String r2 = r2.getString(r3)
            r1.clickToCollapseActionLabel = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = com.google.android.material.R.string.bottomsheet_drag_handle_clicked
            java.lang.String r2 = r2.getString(r3)
            r1.clickFeedback = r2
            com.google.android.material.bottomsheet.BottomSheetDragHandleView$1 r2 = new com.google.android.material.bottomsheet.BottomSheetDragHandleView$1
            r2.<init>(r1)
            r1.bottomSheetCallback = r2
            android.content.Context r2 = r1.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r1.accessibilityManager = r2
            r1.updateInteractableState()
            com.google.android.material.bottomsheet.BottomSheetDragHandleView$2 r2 = new com.google.android.material.bottomsheet.BottomSheetDragHandleView$2
            r2.<init>(r1)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r2)
            return
    }

    public static /* synthetic */ void access$000(com.google.android.material.bottomsheet.BottomSheetDragHandleView r0, int r1) {
            r0.onBottomSheetStateChanged(r1)
            return
    }

    public static /* synthetic */ boolean access$100(com.google.android.material.bottomsheet.BottomSheetDragHandleView r0) {
            boolean r0 = r0.expandOrCollapseBottomSheetIfPossible()
            return r0
    }

    private void announceAccessibilityEvent(java.lang.String r3) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            java.util.List r1 = r0.getText()
            r1.add(r3)
            android.view.accessibility.AccessibilityManager r3 = r2.accessibilityManager
            r3.sendAccessibilityEvent(r0)
            return
    }

    private boolean expandOrCollapseBottomSheetIfPossible() {
            r6 = this;
            boolean r0 = r6.interactable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r6.clickFeedback
            r6.announceAccessibilityEvent(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.bottomSheetBehavior
            boolean r0 = r0.isFitToContents()
            r2 = 1
            if (r0 != 0) goto L1d
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.bottomSheetBehavior
            boolean r0 = r0.shouldSkipHalfExpandedStateWhenDragging()
            if (r0 != 0) goto L1d
            r1 = 1
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.bottomSheetBehavior
            int r0 = r0.getState()
            r3 = 6
            r4 = 3
            r5 = 4
            if (r0 != r5) goto L2d
            if (r1 == 0) goto L2b
            goto L3b
        L2b:
            r3 = 3
            goto L3b
        L2d:
            if (r0 != r4) goto L34
            if (r1 == 0) goto L32
            goto L3b
        L32:
            r3 = 4
            goto L3b
        L34:
            boolean r0 = r6.clickToExpand
            if (r0 == 0) goto L39
            goto L3a
        L39:
            r4 = 4
        L3a:
            r3 = r4
        L3b:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.bottomSheetBehavior
            r0.setState(r3)
            return r2
    }

    @androidx.annotation.Nullable
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> findParentBottomSheetBehavior() {
            r3 = this;
            r0 = r3
        L1:
            android.view.View r0 = getParentView(r0)
            if (r0 == 0) goto L1c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r2 == 0) goto L1
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r2 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r2 == 0) goto L1
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            return r1
        L1c:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    private static android.view.View getParentView(android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto Lb
            android.view.View r1 = (android.view.View) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    private /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(android.view.View r1, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r2) {
            r0 = this;
            boolean r1 = r0.expandOrCollapseBottomSheetIfPossible()
            return r1
    }

    private void onBottomSheetStateChanged(int r4) {
            r3 = this;
            r0 = 4
            if (r4 != r0) goto L7
            r4 = 1
            r3.clickToExpand = r4
            goto Ld
        L7:
            r0 = 3
            if (r4 != r0) goto Ld
            r4 = 0
            r3.clickToExpand = r4
        Ld:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
            boolean r0 = r3.clickToExpand
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.clickToExpandActionLabel
            goto L18
        L16:
            java.lang.String r0 = r3.clickToCollapseActionLabel
        L18:
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r2 = 11
            r1.<init>(r3, r2)
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r3, r4, r0, r1)
            return
    }

    private void setBottomSheetBehavior(@androidx.annotation.Nullable com.google.android.material.bottomsheet.BottomSheetBehavior<?> r3) {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r2.bottomSheetBehavior
            if (r0 == 0) goto Lf
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r2.bottomSheetCallback
            r0.removeBottomSheetCallback(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r2.bottomSheetBehavior
            r1 = 0
            r0.setAccessibilityDelegateView(r1)
        Lf:
            r2.bottomSheetBehavior = r3
            if (r3 == 0) goto L26
            r3.setAccessibilityDelegateView(r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r3 = r2.bottomSheetBehavior
            int r3 = r3.getState()
            r2.onBottomSheetStateChanged(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r3 = r2.bottomSheetBehavior
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r0 = r2.bottomSheetCallback
            r3.addBottomSheetCallback(r0)
        L26:
            r2.updateInteractableState()
            return
    }

    private void updateInteractableState() {
            r2 = this;
            boolean r0 = r2.accessibilityServiceEnabled
            r1 = 1
            if (r0 == 0) goto Lb
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r2.bottomSheetBehavior
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.interactable = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r2.bottomSheetBehavior
            if (r0 == 0) goto L13
            goto L14
        L13:
            r1 = 2
        L14:
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r1)
            boolean r0 = r2.interactable
            r2.setClickable(r0)
            return
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean r1) {
            r0 = this;
            r0.accessibilityServiceEnabled = r1
            r0.updateInteractableState()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.findParentBottomSheetBehavior()
            r1.setBottomSheetBehavior(r0)
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L1a
            r0.addAccessibilityStateChangeListener(r1)
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            boolean r0 = r0.isEnabled()
            r1.onAccessibilityStateChanged(r0)
        L1a:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L7
            r0.removeAccessibilityStateChangeListener(r1)
        L7:
            r0 = 0
            r1.setBottomSheetBehavior(r0)
            super.onDetachedFromWindow()
            return
    }
}
