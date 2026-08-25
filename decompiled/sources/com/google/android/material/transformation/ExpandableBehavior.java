package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<android.view.View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;


    public ExpandableBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.currentState = r0
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.currentState = r1
            return
    }

    public static /* synthetic */ int access$000(com.google.android.material.transformation.ExpandableBehavior r0) {
            int r0 = r0.currentState
            return r0
    }

    private boolean didStateChange(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto Ld
            int r4 = r3.currentState
            if (r4 == 0) goto Lb
            r2 = 2
            if (r4 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            int r4 = r3.currentState
            if (r4 != r1) goto L12
            r0 = 1
        L12:
            return r0
    }

    @androidx.annotation.Nullable
    public static <T extends com.google.android.material.transformation.ExpandableBehavior> T from(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto L21
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r0 = r1 instanceof com.google.android.material.transformation.ExpandableBehavior
            if (r0 == 0) goto L19
            java.lang.Object r1 = r2.cast(r1)
            com.google.android.material.transformation.ExpandableBehavior r1 = (com.google.android.material.transformation.ExpandableBehavior) r1
            return r1
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The view is not associated with ExpandableBehavior"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The view is not a child of CoordinatorLayout"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.CallSuper
    public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            com.google.android.material.expandable.ExpandableWidget r4 = (com.google.android.material.expandable.ExpandableWidget) r4
            boolean r2 = r4.isExpanded()
            boolean r2 = r1.didStateChange(r2)
            if (r2 == 0) goto L23
            boolean r2 = r4.isExpanded()
            r0 = 1
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 2
        L16:
            r1.currentState = r2
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r4 = r4.isExpanded()
            r1.onExpandedStateChange(r2, r3, r4, r0)
            return r0
        L23:
            r2 = 0
            return r2
    }

    public abstract void onExpandedStateChange(android.view.View r1, android.view.View r2, boolean r3, boolean r4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.CallSuper
    public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull android.view.View r7, int r8) {
            r5 = this;
            boolean r8 = androidx.core.view.ViewCompat.isLaidOut(r7)
            r0 = 0
            if (r8 != 0) goto L48
            java.util.List r8 = r6.getDependencies(r7)
            int r1 = r8.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L24
            java.lang.Object r3 = r8.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.layoutDependsOn(r6, r7, r3)
            if (r4 == 0) goto L21
            com.google.android.material.expandable.ExpandableWidget r3 = (com.google.android.material.expandable.ExpandableWidget) r3
            goto L25
        L21:
            int r2 = r2 + 1
            goto L10
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L48
            boolean r6 = r3.isExpanded()
            boolean r6 = r5.didStateChange(r6)
            if (r6 == 0) goto L48
            boolean r6 = r3.isExpanded()
            if (r6 == 0) goto L39
            r6 = 1
            goto L3a
        L39:
            r6 = 2
        L3a:
            r5.currentState = r6
            android.view.ViewTreeObserver r8 = r7.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$1 r1 = new com.google.android.material.transformation.ExpandableBehavior$1
            r1.<init>(r5, r7, r6, r3)
            r8.addOnPreDrawListener(r1)
        L48:
            return r0
    }
}
