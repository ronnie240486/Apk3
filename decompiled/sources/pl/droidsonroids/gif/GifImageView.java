package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public class GifImageView extends android.widget.ImageView {
    private boolean mFreezesAnimation;

    public GifImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public GifImageView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes r1 = pl.droidsonroids.gif.GifViewUtils.initImageView(r0, r2, r1, r1)
            r0.postInit(r1)
            return
    }

    public GifImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes r1 = pl.droidsonroids.gif.GifViewUtils.initImageView(r0, r2, r3, r1)
            r0.postInit(r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public GifImageView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            pl.droidsonroids.gif.GifViewUtils$GifImageViewAttributes r1 = pl.droidsonroids.gif.GifViewUtils.initImageView(r0, r2, r3, r4)
            r0.postInit(r1)
            return
    }

    private void postInit(pl.droidsonroids.gif.GifViewUtils.GifImageViewAttributes r2) {
            r1 = this;
            boolean r0 = r2.freezesAnimation
            r1.mFreezesAnimation = r0
            int r0 = r2.mSourceResId
            if (r0 <= 0) goto Lb
            super.setImageResource(r0)
        Lb:
            int r2 = r2.mBackgroundResId
            if (r2 <= 0) goto L12
            super.setBackgroundResource(r2)
        L12:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof pl.droidsonroids.gif.GifViewSavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            pl.droidsonroids.gif.GifViewSavedState r3 = (pl.droidsonroids.gif.GifViewSavedState) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            r1 = 0
            r3.restoreState(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            r1 = 1
            r3.restoreState(r0, r1)
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r6 = this;
            boolean r0 = r6.mFreezesAnimation
            r1 = 0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            goto Lb
        La:
            r0 = r1
        Lb:
            boolean r2 = r6.mFreezesAnimation
            if (r2 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r6.getBackground()
        L13:
            pl.droidsonroids.gif.GifViewSavedState r2 = new pl.droidsonroids.gif.GifViewSavedState
            android.os.Parcelable r3 = super.onSaveInstanceState()
            r4 = 2
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r2.<init>(r3, r4)
            return r2
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = pl.droidsonroids.gif.GifViewUtils.setResource(r1, r0, r2)
            if (r0 != 0) goto La
            super.setBackgroundResource(r2)
        La:
            return
    }

    public void setFreezesAnimation(boolean r1) {
            r0 = this;
            r0.mFreezesAnimation = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            r0 = 1
            boolean r0 = pl.droidsonroids.gif.GifViewUtils.setResource(r1, r0, r2)
            if (r0 != 0) goto La
            super.setImageResource(r2)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r2) {
            r1 = this;
            boolean r0 = pl.droidsonroids.gif.GifViewUtils.setGifImageUri(r1, r2)
            if (r0 != 0) goto L9
            super.setImageURI(r2)
        L9:
            return
    }
}
