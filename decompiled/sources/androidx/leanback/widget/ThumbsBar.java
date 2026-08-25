package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ThumbsBar extends android.widget.LinearLayout {
    public final android.util.SparseArray<android.graphics.Bitmap> mBitmaps;
    public int mHeroThumbHeightInPixel;
    public int mHeroThumbWidthInPixel;
    private boolean mIsUserSets;
    public int mMeasuredMarginInPixel;
    public int mNumOfThumbs;
    public int mThumbHeightInPixel;
    public int mThumbWidthInPixel;

    public ThumbsBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ThumbsBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = -1
            r0.mNumOfThumbs = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.mBitmaps = r2
            r2 = 0
            r0.mIsUserSets = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = androidx.leanback.R.dimen.lb_playback_transport_thumbs_width
            int r2 = r2.getDimensionPixelSize(r3)
            r0.mThumbWidthInPixel = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = androidx.leanback.R.dimen.lb_playback_transport_thumbs_height
            int r2 = r2.getDimensionPixelSize(r3)
            r0.mThumbHeightInPixel = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = androidx.leanback.R.dimen.lb_playback_transport_hero_thumbs_width
            int r2 = r2.getDimensionPixelSize(r3)
            r0.mHeroThumbHeightInPixel = r2
            android.content.res.Resources r2 = r1.getResources()
            int r3 = androidx.leanback.R.dimen.lb_playback_transport_hero_thumbs_height
            int r2 = r2.getDimensionPixelSize(r3)
            r0.mHeroThumbWidthInPixel = r2
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.leanback.R.dimen.lb_playback_transport_thumbs_margin
            int r1 = r1.getDimensionPixelSize(r2)
            r0.mMeasuredMarginInPixel = r1
            return
    }

    private int calculateNumOfThumbs(int r3) {
            r2 = this;
            int r0 = r2.mHeroThumbWidthInPixel
            int r3 = r3 - r0
            int r0 = r2.mThumbWidthInPixel
            int r1 = r2.mMeasuredMarginInPixel
            int r0 = r0 + r1
            int r3 = roundUp(r3, r0)
            r0 = 2
            if (r3 >= r0) goto L11
            r3 = 2
            goto L17
        L11:
            r0 = r3 & 1
            if (r0 == 0) goto L17
            int r3 = r3 + 1
        L17:
            int r3 = r3 + 1
            return r3
    }

    private static int roundUp(int r0, int r1) {
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            int r0 = r0 / r1
            return r0
    }

    private void setNumberOfThumbsInternal() {
            r5 = this;
        L0:
            int r0 = r5.getChildCount()
            int r1 = r5.mNumOfThumbs
            if (r0 <= r1) goto L16
            int r0 = r5.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r5.getChildAt(r0)
            r5.removeView(r0)
            goto L0
        L16:
            int r0 = r5.getChildCount()
            int r1 = r5.mNumOfThumbs
            if (r0 >= r1) goto L34
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = r5.mThumbWidthInPixel
            int r3 = r5.mThumbHeightInPixel
            r1.<init>(r2, r3)
            r5.addView(r0, r1)
            goto L16
        L34:
            int r0 = r5.getHeroIndex()
            r1 = 0
        L39:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L62
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            if (r0 != r1) goto L54
            int r4 = r5.mHeroThumbWidthInPixel
            r3.width = r4
            int r4 = r5.mHeroThumbHeightInPixel
            r3.height = r4
            goto L5c
        L54:
            int r4 = r5.mThumbWidthInPixel
            r3.width = r4
            int r4 = r5.mThumbHeightInPixel
            r3.height = r4
        L5c:
            r2.setLayoutParams(r3)
            int r1 = r1 + 1
            goto L39
        L62:
            return
    }

    public void clearThumbBitmaps() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto Le
            r1 = 0
            r2.setThumbBitmap(r0, r1)
            int r0 = r0 + 1
            goto L1
        Le:
            android.util.SparseArray<android.graphics.Bitmap> r0 = r2.mBitmaps
            r0.clear()
            return
    }

    public int getHeroIndex() {
            r1 = this;
            int r0 = r1.getChildCount()
            int r0 = r0 / 2
            return r0
    }

    public android.graphics.Bitmap getThumbBitmap(int r2) {
            r1 = this;
            android.util.SparseArray<android.graphics.Bitmap> r0 = r1.mBitmaps
            java.lang.Object r2 = r0.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            int r5 = r4.getHeroIndex()
            android.view.View r6 = r4.getChildAt(r5)
            int r7 = r4.getWidth()
            int r7 = r7 / 2
            int r8 = r6.getMeasuredWidth()
            int r8 = r8 / 2
            int r7 = r7 - r8
            int r8 = r4.getWidth()
            int r8 = r8 / 2
            int r9 = r6.getMeasuredWidth()
            int r9 = r9 / 2
            int r9 = r9 + r8
            int r8 = r4.getPaddingTop()
            int r0 = r4.getPaddingTop()
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r0
            r6.layout(r7, r8, r9, r1)
            int r8 = r4.getPaddingTop()
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 / 2
            int r6 = r6 + r8
            int r8 = r5 + (-1)
        L42:
            if (r8 < 0) goto L6b
            int r0 = r4.mMeasuredMarginInPixel
            int r7 = r7 - r0
            android.view.View r0 = r4.getChildAt(r8)
            int r1 = r0.getMeasuredWidth()
            int r1 = r7 - r1
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 / 2
            int r2 = r6 - r2
            int r3 = r0.getMeasuredHeight()
            int r3 = r3 / 2
            int r3 = r3 + r6
            r0.layout(r1, r2, r7, r3)
            int r0 = r0.getMeasuredWidth()
            int r7 = r7 - r0
            int r8 = r8 + (-1)
            goto L42
        L6b:
            int r5 = r5 + 1
            int r7 = r4.mNumOfThumbs
            if (r5 >= r7) goto L95
            int r7 = r4.mMeasuredMarginInPixel
            int r9 = r9 + r7
            android.view.View r7 = r4.getChildAt(r5)
            int r8 = r7.getMeasuredHeight()
            int r8 = r8 / 2
            int r8 = r6 - r8
            int r0 = r7.getMeasuredWidth()
            int r0 = r0 + r9
            int r1 = r7.getMeasuredHeight()
            int r1 = r1 / 2
            int r1 = r1 + r6
            r7.layout(r9, r8, r0, r1)
            int r7 = r7.getMeasuredWidth()
            int r9 = r9 + r7
            goto L6b
        L95:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            int r1 = r0.getMeasuredWidth()
            boolean r2 = r0.mIsUserSets
            if (r2 != 0) goto L18
            int r1 = r0.calculateNumOfThumbs(r1)
            int r2 = r0.mNumOfThumbs
            if (r2 == r1) goto L18
            r0.mNumOfThumbs = r1
            r0.setNumberOfThumbsInternal()
        L18:
            return
    }

    public void setHeroThumbSize(int r9, int r10) {
            r8 = this;
            r8.mHeroThumbHeightInPixel = r10
            r8.mHeroThumbWidthInPixel = r9
            int r0 = r8.getHeroIndex()
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.getChildCount()
            if (r2 >= r3) goto L36
            if (r0 != r2) goto L33
            android.view.View r3 = r8.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r5 = r4.height
            r6 = 1
            if (r5 == r10) goto L25
            r4.height = r10
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            int r7 = r4.width
            if (r7 == r9) goto L2d
            r4.width = r9
            goto L2e
        L2d:
            r6 = r5
        L2e:
            if (r6 == 0) goto L33
            r3.setLayoutParams(r4)
        L33:
            int r2 = r2 + 1
            goto La
        L36:
            return
    }

    public void setNumberOfThumbs(int r2) {
            r1 = this;
            r0 = 1
            r1.mIsUserSets = r0
            r1.mNumOfThumbs = r2
            r1.setNumberOfThumbsInternal()
            return
    }

    public void setThumbBitmap(int r2, android.graphics.Bitmap r3) {
            r1 = this;
            android.util.SparseArray<android.graphics.Bitmap> r0 = r1.mBitmaps
            r0.put(r2, r3)
            android.view.View r2 = r1.getChildAt(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageBitmap(r3)
            return
    }

    public void setThumbSize(int r9, int r10) {
            r8 = this;
            r8.mThumbHeightInPixel = r10
            r8.mThumbWidthInPixel = r9
            int r0 = r8.getHeroIndex()
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.getChildCount()
            if (r2 >= r3) goto L36
            if (r0 == r2) goto L33
            android.view.View r3 = r8.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r5 = r4.height
            r6 = 1
            if (r5 == r10) goto L25
            r4.height = r10
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            int r7 = r4.width
            if (r7 == r9) goto L2d
            r4.width = r9
            goto L2e
        L2d:
            r6 = r5
        L2e:
            if (r6 == 0) goto L33
            r3.setLayoutParams(r4)
        L33:
            int r2 = r2 + 1
            goto La
        L36:
            return
    }

    public void setThumbSpace(int r1) {
            r0 = this;
            r0.mMeasuredMarginInPixel = r1
            r0.requestLayout()
            return
    }
}
