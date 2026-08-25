package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
class GhostViewPort extends android.view.ViewGroup implements androidx.transition.GhostView {
    public static final /* synthetic */ int $r8$clinit = 0;

    @androidx.annotation.Nullable
    private android.graphics.Matrix mMatrix;
    private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    public int mReferences;
    public android.view.ViewGroup mStartParent;
    public android.view.View mStartView;
    public final android.view.View mView;


    public GhostViewPort(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            androidx.transition.GhostViewPort$1 r0 = new androidx.transition.GhostViewPort$1
            r0.<init>(r1)
            r1.mOnPreDrawListener = r0
            r1.mView = r2
            r2 = 0
            r1.setWillNotDraw(r2)
            r2 = 2
            r0 = 0
            r1.setLayerType(r2, r0)
            return
    }

    public static androidx.transition.GhostViewPort addGhost(android.view.View r4, android.view.ViewGroup r5, android.graphics.Matrix r6) {
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L54
            int r0 = androidx.transition.GhostViewHolder.$r8$clinit
            int r0 = androidx.transition.R.id.ghost_view_holder
            java.lang.Object r0 = r5.getTag(r0)
            androidx.transition.GhostViewHolder r0 = (androidx.transition.GhostViewHolder) r0
            int r1 = androidx.transition.R.id.ghost_view
            java.lang.Object r1 = r4.getTag(r1)
            androidx.transition.GhostViewPort r1 = (androidx.transition.GhostViewPort) r1
            r2 = 0
            if (r1 == 0) goto L2b
            android.view.ViewParent r3 = r1.getParent()
            androidx.transition.GhostViewHolder r3 = (androidx.transition.GhostViewHolder) r3
            if (r3 == r0) goto L2b
            int r2 = r1.mReferences
            r3.removeView(r1)
            r1 = 0
        L2b:
            if (r1 != 0) goto L4b
            androidx.transition.GhostViewPort r1 = new androidx.transition.GhostViewPort
            r1.<init>(r4)
            r1.mMatrix = r6
            if (r0 != 0) goto L3c
            androidx.transition.GhostViewHolder r0 = new androidx.transition.GhostViewHolder
            r0.<init>(r5)
            goto L3f
        L3c:
            r0.popToOverlayTop()
        L3f:
            copySize(r5, r0)
            copySize(r5, r1)
            r0.addGhostView(r1)
            r1.mReferences = r2
            goto L4d
        L4b:
            r1.mMatrix = r6
        L4d:
            int r4 = r1.mReferences
            int r4 = r4 + 1
            r1.mReferences = r4
            return r1
        L54:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Ghosted views must be parented by a ViewGroup"
            r4.<init>(r5)
            throw r4
    }

    public static void copySize(android.view.View r4, android.view.View r5) {
            int r0 = r5.getLeft()
            int r1 = r5.getTop()
            int r2 = r5.getLeft()
            int r3 = r4.getWidth()
            int r3 = r3 + r2
            int r2 = r5.getTop()
            int r4 = r4.getHeight()
            int r4 = r4 + r2
            androidx.transition.ViewUtils.setLeftTopRightBottom(r5, r0, r1, r3, r4)
            return
    }

    public static androidx.transition.GhostViewPort getGhostView(android.view.View r1) {
            int r0 = androidx.transition.R.id.ghost_view
            java.lang.Object r1 = r1.getTag(r0)
            androidx.transition.GhostViewPort r1 = (androidx.transition.GhostViewPort) r1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.View r0 = r2.mView
            int r1 = androidx.transition.R.id.ghost_view
            r0.setTag(r1, r2)
            android.view.View r0 = r2.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
            android.view.View r0 = r2.mView
            r1 = 4
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2e
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            android.view.View r0 = r3.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r3.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r3.mView
            r1 = 0
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r3.mView
            int r1 = androidx.transition.R.id.ghost_view
            r2 = 0
            r0.setTag(r1, r2)
            android.view.View r0 = r3.mView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2c
            android.view.View r0 = r3.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2c:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            r0 = 1
            androidx.transition.CanvasUtils.enableZ(r5, r0)
            android.graphics.Matrix r0 = r4.mMatrix
            r5.setMatrix(r0)
            android.view.View r0 = r4.mView
            r1 = 0
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r4.mView
            r0.invalidate()
            android.view.View r0 = r4.mView
            r2 = 4
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r2)
            android.view.View r0 = r4.mView
            long r2 = r4.getDrawingTime()
            r4.drawChild(r5, r0, r2)
            androidx.transition.CanvasUtils.enableZ(r5, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            r0.mStartParent = r1
            r0.mStartView = r2
            return
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            android.view.View r0 = r1.mView
            androidx.transition.GhostViewPort r0 = getGhostView(r0)
            if (r0 != r1) goto L15
            if (r2 != 0) goto Lf
            r2 = 4
            goto L10
        Lf:
            r2 = 0
        L10:
            android.view.View r0 = r1.mView
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r2)
        L15:
            return
    }
}
