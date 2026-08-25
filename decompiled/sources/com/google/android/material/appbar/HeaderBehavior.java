package com.google.android.material.appbar;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @androidx.annotation.Nullable
    private java.lang.Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    public android.widget.OverScroller scroller;
    private int touchSlop;

    @androidx.annotation.Nullable
    private android.view.VelocityTracker velocityTracker;

    /* JADX INFO: loaded from: classes2.dex */
    public class FlingRunnable implements java.lang.Runnable {
        private final V layout;
        private final androidx.coordinatorlayout.widget.CoordinatorLayout parent;
        public final /* synthetic */ com.google.android.material.appbar.HeaderBehavior this$0;

        public FlingRunnable(com.google.android.material.appbar.HeaderBehavior r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parent = r2
                r0.layout = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                V extends android.view.View r0 = r4.layout
                if (r0 == 0) goto L2e
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                android.widget.OverScroller r0 = r0.scroller
                if (r0 == 0) goto L2e
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L25
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                android.widget.OverScroller r3 = r0.scroller
                int r3 = r3.getCurrY()
                r0.setHeaderTopBottomOffset(r1, r2, r3)
                V extends android.view.View r0 = r4.layout
                androidx.core.view.ViewCompat.postOnAnimation(r0, r4)
                goto L2e
            L25:
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                r0.onFlingFinished(r1, r2)
            L2e:
                return
        }
    }

    public HeaderBehavior() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.activePointerId = r0
            r1.touchSlop = r0
            return
    }

    public HeaderBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.activePointerId = r1
            r0.touchSlop = r1
            return
    }

    private void ensureVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.velocityTracker = r0
        La:
            return
    }

    public boolean canDragView(V r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int getMaxDragOffset(@androidx.annotation.NonNull V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            int r1 = -r1
            return r1
    }

    public int getScrollRangeForDragFling(@androidx.annotation.NonNull V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            return r1
    }

    public int getTopBottomOffsetForScrollingSibling() {
            r1 = this;
            int r0 = r1.getTopAndBottomOffset()
            return r0
    }

    public void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull V r8, @androidx.annotation.NonNull android.view.MotionEvent r9) {
            r6 = this;
            int r0 = r6.touchSlop
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.touchSlop = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.isBeingDragged
            if (r0 == 0) goto L40
            int r0 = r6.activePointerId
            if (r0 != r3) goto L25
            return r4
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            return r4
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.lastMotionY
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.touchSlop
            if (r1 <= r5) goto L40
            r6.lastMotionY = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L80
            r6.activePointerId = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.canDragView(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = 1
            goto L61
        L60:
            r7 = 0
        L61:
            r6.isBeingDragged = r7
            if (r7 == 0) goto L80
            r6.lastMotionY = r1
            int r7 = r9.getPointerId(r4)
            r6.activePointerId = r7
            r6.ensureVelocityTracker()
            android.widget.OverScroller r7 = r6.scroller
            if (r7 == 0) goto L80
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r6.scroller
            r7.abortAnimation()
            return r2
        L80:
            android.view.VelocityTracker r7 = r6.velocityTracker
            if (r7 == 0) goto L87
            r7.addMovement(r9)
        L87:
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r20, @androidx.annotation.NonNull V r21, @androidx.annotation.NonNull android.view.MotionEvent r22) {
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L59
            r4 = 2
            if (r0 == r4) goto L34
            r2 = 3
            if (r0 == r2) goto Lbe
            r1 = 6
            if (r0 == r1) goto L1a
            goto L56
        L1a:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            int r1 = r7.getPointerId(r0)
            r6.activePointerId = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.lastMotionY = r0
            goto L56
        L34:
            int r0 = r6.activePointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L3d
            return r9
        L3d:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.lastMotionY
            int r3 = r1 - r0
            r6.lastMotionY = r0
            int r4 = r6.getMaxDragOffset(r2)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.scroll(r1, r2, r3, r4, r5)
        L56:
            r0 = 0
            goto Lcc
        L59:
            android.view.VelocityTracker r0 = r6.velocityTracker
            if (r0 == 0) goto Lbe
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.velocityTracker
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.velocityTracker
            int r4 = r6.activePointerId
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.getScrollRangeForDragFling(r2)
            int r4 = -r4
            r18 = 0
            java.lang.Runnable r5 = r6.flingRunnable
            if (r5 == 0) goto L7f
            r2.removeCallbacks(r5)
            r6.flingRunnable = r1
        L7f:
            android.widget.OverScroller r5 = r6.scroller
            if (r5 != 0) goto L8e
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.scroller = r5
        L8e:
            android.widget.OverScroller r10 = r6.scroller
            r11 = 0
            int r12 = r19.getTopAndBottomOffset()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.scroller
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto Lb7
            com.google.android.material.appbar.HeaderBehavior$FlingRunnable r0 = new com.google.android.material.appbar.HeaderBehavior$FlingRunnable
            r4 = r20
            r0.<init>(r6, r4, r2)
            r6.flingRunnable = r0
            androidx.core.view.ViewCompat.postOnAnimation(r2, r0)
            goto Lbc
        Lb7:
            r4 = r20
            r19.onFlingFinished(r20, r21)
        Lbc:
            r0 = 1
            goto Lbf
        Lbe:
            r0 = 0
        Lbf:
            r6.isBeingDragged = r9
            r6.activePointerId = r3
            android.view.VelocityTracker r2 = r6.velocityTracker
            if (r2 == 0) goto Lcc
            r2.recycle()
            r6.velocityTracker = r1
        Lcc:
            android.view.VelocityTracker r1 = r6.velocityTracker
            if (r1 == 0) goto Ld3
            r1.addMovement(r7)
        Ld3:
            boolean r1 = r6.isBeingDragged
            if (r1 != 0) goto Ldb
            if (r0 == 0) goto Lda
            goto Ldb
        Lda:
            r8 = 0
        Ldb:
            return r8
    }

    public final int scroll(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.getTopBottomOffsetForScrollingSibling()
            int r4 = r0 - r10
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            int r8 = r1.setHeaderTopBottomOffset(r2, r3, r4, r5, r6)
            return r8
    }

    public final int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.setHeaderTopBottomOffset(r1, r2, r3, r4, r5)
            return r7
    }

    public int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.getTopAndBottomOffset()
            if (r4 == 0) goto L15
            if (r1 < r4) goto L15
            if (r1 > r5) goto L15
            int r2 = androidx.core.math.MathUtils.clamp(r3, r4, r5)
            if (r1 == r2) goto L15
            r0.setTopAndBottomOffset(r2)
            int r1 = r1 - r2
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }
}
