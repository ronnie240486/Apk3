package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class ImageCardView extends androidx.leanback.widget.BaseCardView {
    private static final java.lang.String ALPHA = "alpha";
    public static final int CARD_TYPE_FLAG_CONTENT = 2;
    public static final int CARD_TYPE_FLAG_ICON_LEFT = 8;
    public static final int CARD_TYPE_FLAG_ICON_RIGHT = 4;
    public static final int CARD_TYPE_FLAG_IMAGE_ONLY = 0;
    public static final int CARD_TYPE_FLAG_TITLE = 1;
    private boolean mAttachedToWindow;
    private android.widget.ImageView mBadgeImage;
    private android.widget.TextView mContentView;
    public android.animation.ObjectAnimator mFadeInAnimator;
    private android.widget.ImageView mImageView;
    private android.view.ViewGroup mInfoArea;
    private android.widget.TextView mTitleView;

    public ImageCardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public ImageCardView(android.content.Context r2, int r3) {
            r1 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    public ImageCardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.attr.imageCardViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ImageCardView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            int r1 = androidx.leanback.R.style.Widget_Leanback_ImageCardView
            r0.buildImageCardView(r2, r3, r1)
            return
    }

    private void buildImageCardView(android.util.AttributeSet r11, int r12, int r13) {
            r10 = this;
            r0 = 1
            r10.setFocusable(r0)
            r10.setFocusableInTouchMode(r0)
            android.content.Context r1 = r10.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = androidx.leanback.R.layout.lb_image_card_view
            r1.inflate(r2, r10)
            android.content.Context r2 = r10.getContext()
            int[] r3 = androidx.leanback.R.styleable.lbImageCardView
            android.content.res.TypedArray r11 = r2.obtainStyledAttributes(r11, r3, r12, r13)
            int r12 = androidx.leanback.R.styleable.lbImageCardView_lbImageCardViewType
            r13 = 0
            int r12 = r11.getInt(r12, r13)
            if (r12 != 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            r3 = r12 & 1
            if (r3 != r0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            r4 = r12 & 2
            r5 = 2
            if (r4 != r5) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            r5 = r12 & 4
            r6 = 4
            if (r5 != r6) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            r7 = 8
            if (r5 != 0) goto L4a
            r12 = r12 & r7
            if (r12 != r7) goto L4a
            r12 = 1
            goto L4b
        L4a:
            r12 = 0
        L4b:
            int r8 = androidx.leanback.R.id.main_image
            android.view.View r8 = r10.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r10.mImageView = r8
            android.graphics.drawable.Drawable r8 = r8.getDrawable()
            if (r8 != 0) goto L60
            android.widget.ImageView r8 = r10.mImageView
            r8.setVisibility(r6)
        L60:
            android.widget.ImageView r6 = r10.mImageView
            float[] r0 = new float[r0]
            r8 = 1065353216(0x3f800000, float:1.0)
            r0[r13] = r8
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r8, r0)
            r10.mFadeInAnimator = r0
            android.widget.ImageView r6 = r10.mImageView
            android.content.res.Resources r6 = r6.getResources()
            r8 = 17694720(0x10e0000, float:2.608128E-38)
            int r6 = r6.getInteger(r8)
            long r8 = (long) r6
            r0.setDuration(r8)
            int r0 = androidx.leanback.R.id.info_field
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r10.mInfoArea = r0
            if (r2 == 0) goto L93
            r10.removeView(r0)
            r11.recycle()
            return
        L93:
            if (r3 == 0) goto La4
            int r2 = androidx.leanback.R.layout.lb_image_card_view_themed_title
            android.view.View r0 = r1.inflate(r2, r0, r13)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.mTitleView = r0
            android.view.ViewGroup r2 = r10.mInfoArea
            r2.addView(r0)
        La4:
            if (r4 == 0) goto Lb7
            int r0 = androidx.leanback.R.layout.lb_image_card_view_themed_content
            android.view.ViewGroup r2 = r10.mInfoArea
            android.view.View r0 = r1.inflate(r0, r2, r13)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.mContentView = r0
            android.view.ViewGroup r2 = r10.mInfoArea
            r2.addView(r0)
        Lb7:
            if (r5 != 0) goto Lbb
            if (r12 == 0) goto Ld0
        Lbb:
            int r0 = androidx.leanback.R.layout.lb_image_card_view_themed_badge_right
            if (r12 == 0) goto Lc1
            int r0 = androidx.leanback.R.layout.lb_image_card_view_themed_badge_left
        Lc1:
            android.view.ViewGroup r2 = r10.mInfoArea
            android.view.View r13 = r1.inflate(r0, r2, r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r10.mBadgeImage = r13
            android.view.ViewGroup r0 = r10.mInfoArea
            r0.addView(r13)
        Ld0:
            r13 = 17
            r0 = 16
            if (r3 == 0) goto Lfe
            if (r4 != 0) goto Lfe
            android.widget.ImageView r1 = r10.mBadgeImage
            if (r1 == 0) goto Lfe
            android.widget.TextView r1 = r10.mTitleView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            if (r12 == 0) goto Lf0
            android.widget.ImageView r2 = r10.mBadgeImage
            int r2 = r2.getId()
            r1.addRule(r13, r2)
            goto Lf9
        Lf0:
            android.widget.ImageView r2 = r10.mBadgeImage
            int r2 = r2.getId()
            r1.addRule(r0, r2)
        Lf9:
            android.widget.TextView r2 = r10.mTitleView
            r2.setLayoutParams(r1)
        Lfe:
            if (r4 == 0) goto L127
            android.widget.TextView r1 = r10.mContentView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            if (r3 != 0) goto L10f
            r2 = 10
            r1.addRule(r2)
        L10f:
            if (r12 == 0) goto L122
            r1.removeRule(r0)
            r12 = 20
            r1.removeRule(r12)
            android.widget.ImageView r12 = r10.mBadgeImage
            int r12 = r12.getId()
            r1.addRule(r13, r12)
        L122:
            android.widget.TextView r12 = r10.mContentView
            r12.setLayoutParams(r1)
        L127:
            android.widget.ImageView r12 = r10.mBadgeImage
            if (r12 == 0) goto L14d
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            if (r4 == 0) goto L13d
            android.widget.TextView r13 = r10.mContentView
            int r13 = r13.getId()
            r12.addRule(r7, r13)
            goto L148
        L13d:
            if (r3 == 0) goto L148
            android.widget.TextView r13 = r10.mTitleView
            int r13 = r13.getId()
            r12.addRule(r7, r13)
        L148:
            android.widget.ImageView r13 = r10.mBadgeImage
            r13.setLayoutParams(r12)
        L14d:
            int r12 = androidx.leanback.R.styleable.lbImageCardView_infoAreaBackground
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            if (r12 == 0) goto L158
            r10.setInfoAreaBackground(r12)
        L158:
            android.widget.ImageView r12 = r10.mBadgeImage
            if (r12 == 0) goto L167
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L167
            android.widget.ImageView r12 = r10.mBadgeImage
            r12.setVisibility(r7)
        L167:
            r11.recycle()
            return
    }

    private void fadeIn() {
            r2 = this;
            android.widget.ImageView r0 = r2.mImageView
            r1 = 0
            r0.setAlpha(r1)
            boolean r0 = r2.mAttachedToWindow
            if (r0 == 0) goto Lf
            android.animation.ObjectAnimator r0 = r2.mFadeInAnimator
            r0.start()
        Lf:
            return
    }

    public android.graphics.drawable.Drawable getBadgeImage() {
            r1 = this;
            android.widget.ImageView r0 = r1.mBadgeImage
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getContentText() {
            r1 = this;
            android.widget.TextView r0 = r1.mContentView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public android.graphics.drawable.Drawable getInfoAreaBackground() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mInfoArea
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getMainImage() {
            r1 = this;
            android.widget.ImageView r0 = r1.mImageView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public final android.widget.ImageView getMainImageView() {
            r1 = this;
            android.widget.ImageView r0 = r1.mImageView
            return r0
    }

    public java.lang.CharSequence getTitleText() {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 1
            r2.mAttachedToWindow = r0
            android.widget.ImageView r0 = r2.mImageView
            float r0 = r0.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            r2.fadeIn()
        L14:
            return
    }

    @Override // androidx.leanback.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            r0 = 0
            r2.mAttachedToWindow = r0
            android.animation.ObjectAnimator r0 = r2.mFadeInAnimator
            r0.cancel()
            android.widget.ImageView r0 = r2.mImageView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            super.onDetachedFromWindow()
            return
    }

    public void setBadgeImage(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mBadgeImage
            if (r0 != 0) goto L5
            return
        L5:
            r0.setImageDrawable(r2)
            if (r2 == 0) goto L11
            android.widget.ImageView r2 = r1.mBadgeImage
            r0 = 0
            r2.setVisibility(r0)
            goto L18
        L11:
            android.widget.ImageView r2 = r1.mBadgeImage
            r0 = 8
            r2.setVisibility(r0)
        L18:
            return
    }

    public void setContentText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mContentView
            if (r0 != 0) goto L5
            return
        L5:
            r0.setText(r2)
            return
    }

    public void setInfoAreaBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.mInfoArea
            if (r0 == 0) goto L7
            r0.setBackground(r2)
        L7:
            return
    }

    public void setInfoAreaBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.mInfoArea
            if (r0 == 0) goto L7
            r0.setBackgroundColor(r2)
        L7:
            return
    }

    public void setMainImage(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 1
            r1.setMainImage(r2, r0)
            return
    }

    public void setMainImage(android.graphics.drawable.Drawable r3, boolean r4) {
            r2 = this;
            android.widget.ImageView r0 = r2.mImageView
            if (r0 != 0) goto L5
            return
        L5:
            r0.setImageDrawable(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto L1d
            android.animation.ObjectAnimator r3 = r2.mFadeInAnimator
            r3.cancel()
            android.widget.ImageView r3 = r2.mImageView
            r3.setAlpha(r0)
            android.widget.ImageView r3 = r2.mImageView
            r4 = 4
            r3.setVisibility(r4)
            goto L33
        L1d:
            android.widget.ImageView r3 = r2.mImageView
            r1 = 0
            r3.setVisibility(r1)
            if (r4 == 0) goto L29
            r2.fadeIn()
            goto L33
        L29:
            android.animation.ObjectAnimator r3 = r2.mFadeInAnimator
            r3.cancel()
            android.widget.ImageView r3 = r2.mImageView
            r3.setAlpha(r0)
        L33:
            return
    }

    public void setMainImageAdjustViewBounds(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mImageView
            if (r0 == 0) goto L7
            r0.setAdjustViewBounds(r2)
        L7:
            return
    }

    public void setMainImageDimensions(int r2, int r3) {
            r1 = this;
            android.widget.ImageView r0 = r1.mImageView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r3
            android.widget.ImageView r2 = r1.mImageView
            r2.setLayoutParams(r0)
            return
    }

    public void setMainImageScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mImageView
            if (r0 == 0) goto L7
            r0.setScaleType(r2)
        L7:
            return
    }

    public void setTitleText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleView
            if (r0 != 0) goto L5
            return
        L5:
            r0.setText(r2)
            return
    }
}
