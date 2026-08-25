package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes.dex */
class TabIndicatorInterpolator {

    @androidx.annotation.Dimension(unit = 0)
    private static final int MIN_INDICATOR_WIDTH = 24;

    public TabIndicatorInterpolator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.RectF calculateIndicatorWidthForTab(com.google.android.material.tabs.TabLayout r3, @androidx.annotation.Nullable android.view.View r4) {
            if (r4 != 0) goto L8
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            return r3
        L8:
            boolean r3 = r3.isTabIndicatorFullWidth()
            if (r3 != 0) goto L56
            boolean r3 = r4 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r3 == 0) goto L56
            com.google.android.material.tabs.TabLayout$TabView r4 = (com.google.android.material.tabs.TabLayout.TabView) r4
            r3 = 24
            int r0 = r4.getContentWidth()
            int r1 = r4.getContentHeight()
            android.content.Context r2 = r4.getContext()
            float r3 = com.google.android.material.internal.ViewUtils.dpToPx(r2, r3)
            int r3 = (int) r3
            if (r0 >= r3) goto L2a
            r0 = r3
        L2a:
            int r3 = r4.getLeft()
            int r2 = r4.getRight()
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r3 = r4.getTop()
            int r4 = r4.getBottom()
            int r4 = r4 + r3
            int r4 = r4 / 2
            int r0 = r0 / 2
            int r3 = r2 - r0
            int r1 = r1 / 2
            int r1 = r4 - r1
            int r0 = r0 + r2
            int r2 = r2 / 2
            int r2 = r2 + r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            r4.<init>(r3, r1, r0, r2)
            return r4
        L56:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r3.<init>(r0, r1, r2, r4)
            return r3
    }

    public void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout r2, android.view.View r3, android.view.View r4, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5, @androidx.annotation.NonNull android.graphics.drawable.Drawable r6) {
            r1 = this;
            android.graphics.RectF r3 = calculateIndicatorWidthForTab(r2, r3)
            android.graphics.RectF r2 = calculateIndicatorWidthForTab(r2, r4)
            float r4 = r3.left
            int r4 = (int) r4
            float r0 = r2.left
            int r0 = (int) r0
            int r4 = com.google.android.material.animation.AnimationUtils.lerp(r4, r0, r5)
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.top
            float r3 = r3.right
            int r3 = (int) r3
            float r2 = r2.right
            int r2 = (int) r2
            int r2 = com.google.android.material.animation.AnimationUtils.lerp(r3, r2, r5)
            android.graphics.Rect r3 = r6.getBounds()
            int r3 = r3.bottom
            r6.setBounds(r4, r0, r2, r3)
            return
    }
}
