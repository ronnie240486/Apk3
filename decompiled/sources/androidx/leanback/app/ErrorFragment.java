package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ErrorFragment extends androidx.leanback.app.BrandedFragment {
    private android.graphics.drawable.Drawable mBackgroundDrawable;
    private android.widget.Button mButton;
    private android.view.View.OnClickListener mButtonClickListener;
    private java.lang.String mButtonText;
    private android.graphics.drawable.Drawable mDrawable;
    private android.view.ViewGroup mErrorFrame;
    private android.widget.ImageView mImageView;
    private boolean mIsBackgroundTranslucent;
    private java.lang.CharSequence mMessage;
    private android.widget.TextView mTextView;

    public ErrorFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsBackgroundTranslucent = r0
            return
    }

    private static android.graphics.Paint.FontMetricsInt getFontMetricsInt(android.widget.TextView r2) {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            float r1 = r2.getTextSize()
            r0.setTextSize(r1)
            android.graphics.Typeface r2 = r2.getTypeface()
            r0.setTypeface(r2)
            android.graphics.Paint$FontMetricsInt r2 = r0.getFontMetricsInt()
            return r2
    }

    private static void setTopMargin(android.widget.TextView r1, int r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r2
            r1.setLayoutParams(r0)
            return
    }

    private void updateBackground() {
            r3 = this;
            android.view.ViewGroup r0 = r3.mErrorFrame
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r1 = r3.mBackgroundDrawable
            if (r1 == 0) goto Lc
            r0.setBackground(r1)
            goto L20
        Lc:
            android.content.res.Resources r1 = r0.getResources()
            boolean r2 = r3.mIsBackgroundTranslucent
            if (r2 == 0) goto L17
            int r2 = androidx.leanback.R.color.lb_error_background_color_translucent
            goto L19
        L17:
            int r2 = androidx.leanback.R.color.lb_error_background_color_opaque
        L19:
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
        L20:
            return
    }

    private void updateButton() {
            r2 = this;
            android.widget.Button r0 = r2.mButton
            if (r0 == 0) goto L26
            java.lang.String r1 = r2.mButtonText
            r0.setText(r1)
            android.widget.Button r0 = r2.mButton
            android.view.View$OnClickListener r1 = r2.mButtonClickListener
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.mButton
            java.lang.String r1 = r2.mButtonText
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1d
            r1 = 8
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.setVisibility(r1)
            android.widget.Button r0 = r2.mButton
            r0.requestFocus()
        L26:
            return
    }

    private void updateImageDrawable() {
            r2 = this;
            android.widget.ImageView r0 = r2.mImageView
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r2.mDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r2.mImageView
            android.graphics.drawable.Drawable r1 = r2.mDrawable
            if (r1 != 0) goto L12
            r1 = 8
            goto L13
        L12:
            r1 = 0
        L13:
            r0.setVisibility(r1)
        L16:
            return
    }

    private void updateMessage() {
            r2 = this;
            android.widget.TextView r0 = r2.mTextView
            if (r0 == 0) goto L1a
            java.lang.CharSequence r1 = r2.mMessage
            r0.setText(r1)
            android.widget.TextView r0 = r2.mTextView
            java.lang.CharSequence r1 = r2.mMessage
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L16
            r1 = 8
            goto L17
        L16:
            r1 = 0
        L17:
            r0.setVisibility(r1)
        L1a:
            return
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBackgroundDrawable
            return r0
    }

    public android.view.View.OnClickListener getButtonClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.mButtonClickListener
            return r0
    }

    public java.lang.String getButtonText() {
            r1 = this;
            java.lang.String r0 = r1.mButtonText
            return r0
    }

    public android.graphics.drawable.Drawable getImageDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            return r0
    }

    public java.lang.CharSequence getMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mMessage
            return r0
    }

    public boolean isBackgroundTranslucent() {
            r1 = this;
            boolean r0 = r1.mIsBackgroundTranslucent
            return r0
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            int r0 = androidx.leanback.R.layout.lb_error_fragment
            r1 = 0
            android.view.View r0 = r4.inflate(r0, r5, r1)
            int r1 = androidx.leanback.R.id.error_frame
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.mErrorFrame = r1
            r3.updateBackground()
            android.view.ViewGroup r1 = r3.mErrorFrame
            r3.installTitleView(r4, r1, r6)
            int r4 = androidx.leanback.R.id.image
            android.view.View r4 = r0.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.mImageView = r4
            r3.updateImageDrawable()
            int r4 = androidx.leanback.R.id.message
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.mTextView = r4
            r3.updateMessage()
            int r4 = androidx.leanback.R.id.button
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.mButton = r4
            r3.updateButton()
            android.widget.TextView r4 = r3.mTextView
            android.graphics.Paint$FontMetricsInt r4 = getFontMetricsInt(r4)
            android.content.res.Resources r6 = r5.getResources()
            int r1 = androidx.leanback.R.dimen.lb_error_under_image_baseline_margin
            int r6 = r6.getDimensionPixelSize(r1)
            android.widget.TextView r1 = r3.mTextView
            int r2 = r4.ascent
            int r6 = r6 + r2
            setTopMargin(r1, r6)
            android.content.res.Resources r5 = r5.getResources()
            int r6 = androidx.leanback.R.dimen.lb_error_under_message_baseline_margin
            int r5 = r5.getDimensionPixelSize(r6)
            android.widget.Button r6 = r3.mButton
            int r4 = r4.descent
            int r5 = r5 - r4
            setTopMargin(r6, r5)
            return r0
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            android.view.ViewGroup r0 = r1.mErrorFrame
            r0.requestFocus()
            return
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.mBackgroundDrawable = r2
            if (r2 == 0) goto L14
            int r2 = r2.getOpacity()
            r0 = -3
            if (r2 == r0) goto L11
            r0 = -2
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            r1.mIsBackgroundTranslucent = r2
        L14:
            r1.updateBackground()
            r1.updateMessage()
            return
    }

    public void setButtonClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.mButtonClickListener = r1
            r0.updateButton()
            return
    }

    public void setButtonText(java.lang.String r1) {
            r0 = this;
            r0.mButtonText = r1
            r0.updateButton()
            return
    }

    public void setDefaultBackground(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mBackgroundDrawable = r0
            r1.mIsBackgroundTranslucent = r2
            r1.updateBackground()
            r1.updateMessage()
            return
    }

    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mDrawable = r1
            r0.updateImageDrawable()
            return
    }

    public void setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.mMessage = r1
            r0.updateMessage()
            return
    }
}
