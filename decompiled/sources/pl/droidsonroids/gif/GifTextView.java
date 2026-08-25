package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifTextView extends android.widget.TextView {
    private pl.droidsonroids.gif.GifViewUtils.GifViewAttributes viewAttributes;

    public GifTextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public GifTextView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.init(r2, r1, r1)
            return
    }

    public GifTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.init(r2, r3, r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public GifTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.init(r2, r3, r4)
            return
    }

    private void applyGifViewAttributes() {
            r6 = this;
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = r6.viewAttributes
            int r0 = r0.mLoopCount
            if (r0 >= 0) goto L7
            return
        L7:
            android.graphics.drawable.Drawable[] r0 = r6.getCompoundDrawables()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L1c
            r4 = r0[r3]
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r5 = r6.viewAttributes
            int r5 = r5.mLoopCount
            pl.droidsonroids.gif.GifViewUtils.applyLoopCount(r5, r4)
            int r3 = r3 + 1
            goto Le
        L1c:
            android.graphics.drawable.Drawable[] r0 = r6.getCompoundDrawablesRelative()
            int r1 = r0.length
        L21:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r4 = r6.viewAttributes
            int r4 = r4.mLoopCount
            pl.droidsonroids.gif.GifViewUtils.applyLoopCount(r4, r3)
            int r2 = r2 + 1
            goto L21
        L2f:
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = r6.viewAttributes
            int r0 = r0.mLoopCount
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            pl.droidsonroids.gif.GifViewUtils.applyLoopCount(r0, r1)
            return
    }

    private android.graphics.drawable.Drawable getGifOrDefaultDrawable(int r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r4)
            boolean r2 = r3.isInEditMode()
            if (r2 != 0) goto L20
            java.util.List<java.lang.String> r2 = pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L20
            pl.droidsonroids.gif.GifDrawable r1 = new pl.droidsonroids.gif.GifDrawable     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4, r1)
            return r4
    }

    private void init(android.util.AttributeSet r10, int r11, int r12) {
            r9 = this;
            if (r10 == 0) goto L71
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = "drawableLeft"
            r2 = 0
            int r1 = r10.getAttributeResourceValue(r0, r1, r2)
            android.graphics.drawable.Drawable r1 = r9.getGifOrDefaultDrawable(r1)
            java.lang.String r3 = "drawableTop"
            int r3 = r10.getAttributeResourceValue(r0, r3, r2)
            android.graphics.drawable.Drawable r3 = r9.getGifOrDefaultDrawable(r3)
            java.lang.String r4 = "drawableRight"
            int r4 = r10.getAttributeResourceValue(r0, r4, r2)
            android.graphics.drawable.Drawable r4 = r9.getGifOrDefaultDrawable(r4)
            java.lang.String r5 = "drawableBottom"
            int r5 = r10.getAttributeResourceValue(r0, r5, r2)
            android.graphics.drawable.Drawable r5 = r9.getGifOrDefaultDrawable(r5)
            java.lang.String r6 = "drawableStart"
            int r6 = r10.getAttributeResourceValue(r0, r6, r2)
            android.graphics.drawable.Drawable r6 = r9.getGifOrDefaultDrawable(r6)
            java.lang.String r7 = "drawableEnd"
            int r7 = r10.getAttributeResourceValue(r0, r7, r2)
            android.graphics.drawable.Drawable r7 = r9.getGifOrDefaultDrawable(r7)
            int r8 = r9.getLayoutDirection()
            if (r8 != 0) goto L4f
            if (r6 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r6
        L4b:
            if (r7 != 0) goto L57
            r7 = r4
            goto L57
        L4f:
            if (r6 != 0) goto L52
            goto L53
        L52:
            r4 = r6
        L53:
            if (r7 != 0) goto L56
            r7 = r1
        L56:
            r1 = r4
        L57:
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r3, r7, r5)
            java.lang.String r1 = "background"
            int r0 = r10.getAttributeResourceValue(r0, r1, r2)
            android.graphics.drawable.Drawable r0 = r9.getGifOrDefaultDrawable(r0)
            r9.setBackground(r0)
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = new pl.droidsonroids.gif.GifViewUtils$GifViewAttributes
            r0.<init>(r9, r10, r11, r12)
            r9.viewAttributes = r0
            r9.applyGifViewAttributes()
        L71:
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r10 = new pl.droidsonroids.gif.GifViewUtils$GifViewAttributes
            r10.<init>()
            r9.viewAttributes = r10
            return
    }

    private void setCompoundDrawablesVisible(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable[] r0 = r1.getCompoundDrawables()
            setDrawablesVisible(r0, r2)
            android.graphics.drawable.Drawable[] r0 = r1.getCompoundDrawablesRelative()
            setDrawablesVisible(r0, r2)
            return
    }

    private static void setDrawablesVisible(android.graphics.drawable.Drawable[] r4, boolean r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Lf
            r3 = r4[r2]
            if (r3 == 0) goto Lc
            r3.setVisible(r5, r1)
        Lc:
            int r2 = r2 + 1
            goto L3
        Lf:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.setCompoundDrawablesVisible(r0)
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setCompoundDrawablesVisible(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r5) {
            r4 = this;
            boolean r0 = r5 instanceof pl.droidsonroids.gif.GifViewSavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r5)
            return
        L8:
            pl.droidsonroids.gif.GifViewSavedState r5 = (pl.droidsonroids.gif.GifViewSavedState) r5
            android.os.Parcelable r0 = r5.getSuperState()
            super.onRestoreInstanceState(r0)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawables()
            r1 = 0
            r2 = r0[r1]
            r5.restoreState(r2, r1)
            r2 = 1
            r3 = r0[r2]
            r5.restoreState(r3, r2)
            r2 = 2
            r3 = r0[r2]
            r5.restoreState(r3, r2)
            r3 = 3
            r0 = r0[r3]
            r5.restoreState(r0, r3)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawablesRelative()
            r1 = r0[r1]
            r3 = 4
            r5.restoreState(r1, r3)
            r0 = r0[r2]
            r1 = 5
            r5.restoreState(r0, r1)
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r1 = 6
            r5.restoreState(r0, r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r4 = this;
            r0 = 7
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r1 = r4.viewAttributes
            boolean r1 = r1.freezesAnimation
            if (r1 == 0) goto L28
            android.graphics.drawable.Drawable[] r1 = r4.getCompoundDrawables()
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            android.graphics.drawable.Drawable[] r1 = r4.getCompoundDrawablesRelative()
            r2 = 4
            r3 = r1[r3]
            r0[r2] = r3
            r2 = 5
            r3 = 2
            r1 = r1[r3]
            r0[r2] = r1
            r1 = 6
            android.graphics.drawable.Drawable r2 = r4.getBackground()
            r0[r1] = r2
        L28:
            pl.droidsonroids.gif.GifViewSavedState r1 = new pl.droidsonroids.gif.GifViewSavedState
            android.os.Parcelable r2 = super.onSaveInstanceState()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.getGifOrDefaultDrawable(r1)
            r0.setBackground(r1)
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.getGifOrDefaultDrawable(r1)
            android.graphics.drawable.Drawable r2 = r0.getGifOrDefaultDrawable(r2)
            android.graphics.drawable.Drawable r3 = r0.getGifOrDefaultDrawable(r3)
            android.graphics.drawable.Drawable r4 = r0.getGifOrDefaultDrawable(r4)
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.getGifOrDefaultDrawable(r1)
            android.graphics.drawable.Drawable r2 = r0.getGifOrDefaultDrawable(r2)
            android.graphics.drawable.Drawable r3 = r0.getGifOrDefaultDrawable(r3)
            android.graphics.drawable.Drawable r4 = r0.getGifOrDefaultDrawable(r4)
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public void setFreezesAnimation(boolean r2) {
            r1 = this;
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = r1.viewAttributes
            r0.freezesAnimation = r2
            return
    }
}
