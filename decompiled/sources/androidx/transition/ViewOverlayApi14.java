package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewOverlayApi14 implements androidx.transition.ViewOverlayImpl {
    public androidx.transition.ViewOverlayApi14.OverlayViewGroup mOverlayViewGroup;

    /* JADX INFO: loaded from: classes3.dex */
    public static class OverlayViewGroup extends android.view.ViewGroup {
        private boolean mDisposed;
        public java.util.ArrayList<android.graphics.drawable.Drawable> mDrawables;
        public android.view.ViewGroup mHostView;
        public android.view.View mRequestingView;

        static {
                java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
                java.lang.String r1 = "invalidateChildInParentFast"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L17
                r3 = 0
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L17
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L17
                r3 = 1
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L17
                r3 = 2
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L17
                r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L17
            L17:
                return
        }

        private void assertNotDisposed() {
                r2 = this;
                boolean r0 = r2.mDisposed
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()"
                r0.<init>(r1)
                throw r0
        }

        private void disposeIfEmpty() {
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L18
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                if (r0 == 0) goto L10
                int r0 = r0.size()
                if (r0 != 0) goto L18
            L10:
                r0 = 1
                r1.mDisposed = r0
                android.view.ViewGroup r0 = r1.mHostView
                r0.removeView(r1)
            L18:
                return
        }

        private void getOffset(int[] r6) {
                r5 = this;
                r0 = 2
                int[] r1 = new int[r0]
                int[] r0 = new int[r0]
                android.view.ViewGroup r2 = r5.mHostView
                r2.getLocationOnScreen(r1)
                android.view.View r2 = r5.mRequestingView
                r2.getLocationOnScreen(r0)
                r2 = 0
                r3 = r0[r2]
                r4 = r1[r2]
                int r3 = r3 - r4
                r6[r2] = r3
                r2 = 1
                r0 = r0[r2]
                r1 = r1[r2]
                int r0 = r0 - r1
                r6[r2] = r0
                return
        }

        public void add(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.assertNotDisposed()
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                if (r0 != 0) goto Le
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mDrawables = r0
            Le:
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L25
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                r0.add(r2)
                android.graphics.Rect r0 = r2.getBounds()
                r1.invalidate(r0)
                r2.setCallback(r1)
            L25:
                return
        }

        public void add(android.view.View r6) {
                r5 = this;
                r5.assertNotDisposed()
                android.view.ViewParent r0 = r6.getParent()
                boolean r0 = r0 instanceof android.view.ViewGroup
                if (r0 == 0) goto L4c
                android.view.ViewParent r0 = r6.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.ViewGroup r1 = r5.mHostView
                if (r0 == r1) goto L40
                android.view.ViewParent r1 = r0.getParent()
                if (r1 == 0) goto L40
                boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r1 == 0) goto L40
                r1 = 2
                int[] r2 = new int[r1]
                int[] r1 = new int[r1]
                r0.getLocationOnScreen(r2)
                android.view.ViewGroup r3 = r5.mHostView
                r3.getLocationOnScreen(r1)
                r3 = 0
                r4 = r2[r3]
                r3 = r1[r3]
                int r4 = r4 - r3
                androidx.core.view.ViewCompat.offsetLeftAndRight(r6, r4)
                r3 = 1
                r2 = r2[r3]
                r1 = r1[r3]
                int r2 = r2 - r1
                androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r2)
            L40:
                r0.removeView(r6)
                android.view.ViewParent r1 = r6.getParent()
                if (r1 == 0) goto L4c
                r0.removeView(r6)
            L4c:
                super.addView(r6)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDraw(android.graphics.Canvas r6) {
                r5 = this;
                r0 = 2
                int[] r1 = new int[r0]
                int[] r0 = new int[r0]
                android.view.ViewGroup r2 = r5.mHostView
                r2.getLocationOnScreen(r1)
                android.view.View r2 = r5.mRequestingView
                r2.getLocationOnScreen(r0)
                r2 = 0
                r3 = r0[r2]
                r4 = r1[r2]
                int r3 = r3 - r4
                float r3 = (float) r3
                r4 = 1
                r0 = r0[r4]
                r1 = r1[r4]
                int r0 = r0 - r1
                float r0 = (float) r0
                r6.translate(r3, r0)
                android.graphics.Rect r0 = new android.graphics.Rect
                android.view.View r1 = r5.mRequestingView
                int r1 = r1.getWidth()
                android.view.View r3 = r5.mRequestingView
                int r3 = r3.getHeight()
                r0.<init>(r2, r2, r1, r3)
                r6.clipRect(r0)
                super.dispatchDraw(r6)
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r5.mDrawables
                if (r0 != 0) goto L3d
                r0 = 0
                goto L41
            L3d:
                int r0 = r0.size()
            L41:
                if (r2 >= r0) goto L51
                java.util.ArrayList<android.graphics.drawable.Drawable> r1 = r5.mDrawables
                java.lang.Object r1 = r1.get(r2)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r1.draw(r6)
                int r2 = r2 + 1
                goto L41
            L51:
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public android.view.ViewParent invalidateChildInParent(int[] r5, android.graphics.Rect r6) {
                r4 = this;
                android.view.ViewGroup r0 = r4.mHostView
                if (r0 == 0) goto L2c
                r0 = 0
                r1 = r5[r0]
                r2 = 1
                r3 = r5[r2]
                r6.offset(r1, r3)
                android.view.ViewGroup r1 = r4.mHostView
                boolean r1 = r1 instanceof android.view.ViewGroup
                if (r1 == 0) goto L29
                r5[r0] = r0
                r5[r2] = r0
                r1 = 2
                int[] r1 = new int[r1]
                r4.getOffset(r1)
                r0 = r1[r0]
                r1 = r1[r2]
                r6.offset(r0, r1)
                android.view.ViewParent r5 = super.invalidateChildInParent(r5, r6)
                return r5
            L29:
                r4.invalidate(r6)
            L2c:
                r5 = 0
                return r5
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
                r0 = this;
                android.graphics.Rect r1 = r1.getBounds()
                r0.invalidate(r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                return
        }

        public void remove(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                if (r0 == 0) goto L15
                r0.remove(r2)
                android.graphics.Rect r0 = r2.getBounds()
                r1.invalidate(r0)
                r0 = 0
                r2.setCallback(r0)
                r1.disposeIfEmpty()
            L15:
                return
        }

        public void remove(android.view.View r1) {
                r0 = this;
                super.removeView(r1)
                r0.disposeIfEmpty()
                return
        }

        @Override // android.view.View
        public final boolean verifyDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L13
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.mDrawables
                if (r0 == 0) goto L11
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                return r2
        }
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.remove(r2)
            return
    }
}
