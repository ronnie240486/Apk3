package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes2.dex */
class FadeTabIndicatorInterpolator extends com.google.android.material.tabs.TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    public FadeTabIndicatorInterpolator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public final void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout r3, android.view.View r4, android.view.View r5, float r6, @androidx.annotation.NonNull android.graphics.drawable.Drawable r7) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
            goto L8
        L7:
            r4 = r5
        L8:
            android.graphics.RectF r3 = com.google.android.material.tabs.TabIndicatorInterpolator.calculateIndicatorWidthForTab(r3, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r1 >= 0) goto L16
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r4, r5, r5, r0, r6)
            goto L1a
        L16:
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r5, r4, r0, r4, r6)
        L1a:
            float r5 = r3.left
            int r5 = (int) r5
            android.graphics.Rect r6 = r7.getBounds()
            int r6 = r6.top
            float r3 = r3.right
            int r3 = (int) r3
            android.graphics.Rect r0 = r7.getBounds()
            int r0 = r0.bottom
            r7.setBounds(r5, r6, r3, r0)
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            r7.setAlpha(r3)
            return
    }
}
