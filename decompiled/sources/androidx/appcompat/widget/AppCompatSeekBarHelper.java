package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatSeekBarHelper extends androidx.appcompat.widget.AppCompatProgressBarHelper {
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    private android.graphics.drawable.Drawable mTickMark;
    private android.content.res.ColorStateList mTickMarkTintList;
    private android.graphics.PorterDuff.Mode mTickMarkTintMode;
    private final android.widget.SeekBar mView;

    public AppCompatSeekBarHelper(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mTickMarkTintList = r0
            r1.mTickMarkTintMode = r0
            r0 = 0
            r1.mHasTickMarkTint = r0
            r1.mHasTickMarkTintMode = r0
            r1.mView = r2
            return
    }

    private void applyTickMarkTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            if (r0 == 0) goto L3d
            boolean r1 = r2.mHasTickMarkTint
            if (r1 != 0) goto Lc
            boolean r1 = r2.mHasTickMarkTintMode
            if (r1 == 0) goto L3d
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r2.mTickMark = r0
            boolean r1 = r2.mHasTickMarkTint
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.mTickMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L1f:
            boolean r0 = r2.mHasTickMarkTintMode
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.graphics.PorterDuff$Mode r1 = r2.mTickMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.widget.SeekBar r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L3d:
            return
    }

    public final void drawTickMarks(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mTickMark
            if (r0 == 0) goto L6a
            android.widget.SeekBar r0 = r6.mView
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L6a
            android.graphics.drawable.Drawable r2 = r6.mTickMark
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r6.mTickMark
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L1e
            int r2 = r2 / 2
            goto L1f
        L1e:
            r2 = 1
        L1f:
            if (r3 < 0) goto L23
            int r1 = r3 / 2
        L23:
            android.graphics.drawable.Drawable r3 = r6.mTickMark
            int r4 = -r2
            int r5 = -r1
            r3.setBounds(r4, r5, r2, r1)
            android.widget.SeekBar r1 = r6.mView
            int r1 = r1.getWidth()
            android.widget.SeekBar r2 = r6.mView
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            android.widget.SeekBar r2 = r6.mView
            int r2 = r2.getPaddingRight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r0
            float r1 = r1 / r2
            int r2 = r7.save()
            android.widget.SeekBar r3 = r6.mView
            int r3 = r3.getPaddingLeft()
            float r3 = (float) r3
            android.widget.SeekBar r4 = r6.mView
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            float r4 = (float) r4
            r7.translate(r3, r4)
            r3 = 0
        L59:
            if (r3 > r0) goto L67
            android.graphics.drawable.Drawable r4 = r6.mTickMark
            r4.draw(r7)
            r4 = 0
            r7.translate(r1, r4)
            int r3 = r3 + 1
            goto L59
        L67:
            r7.restoreToCount(r2)
        L6a:
            return
    }

    public final void drawableStateChanged() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            if (r0 == 0) goto L1b
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            boolean r1 = r0.setState(r1)
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.mView
            r1.invalidateDrawable(r0)
        L1b:
            return
    }

    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mTickMark
            if (r0 == 0) goto L7
            r0.jumpToCurrentState()
        L7:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public final void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            super.loadFromAttributes(r9, r10)
            android.widget.SeekBar r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatSeekBar
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r3, r10, r1)
            android.widget.SeekBar r1 = r8.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.AppCompatSeekBar_android_thumb
            android.graphics.drawable.Drawable r9 = r0.getDrawableIfKnown(r9)
            if (r9 == 0) goto L2d
            android.widget.SeekBar r10 = r8.mView
            r10.setThumb(r9)
        L2d:
            int r9 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMark
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9)
            android.graphics.drawable.Drawable r10 = r8.mTickMark
            if (r10 == 0) goto L3b
            r1 = 0
            r10.setCallback(r1)
        L3b:
            r8.mTickMark = r9
            if (r9 == 0) goto L5f
            android.widget.SeekBar r10 = r8.mView
            r9.setCallback(r10)
            android.widget.SeekBar r10 = r8.mView
            int r10 = androidx.core.view.ViewCompat.getLayoutDirection(r10)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r9, r10)
            boolean r10 = r9.isStateful()
            if (r10 == 0) goto L5c
            android.widget.SeekBar r10 = r8.mView
            int[] r10 = r10.getDrawableState()
            r9.setState(r10)
        L5c:
            r8.applyTickMarkTint()
        L5f:
            android.widget.SeekBar r9 = r8.mView
            r9.invalidate()
            int r9 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode
            boolean r10 = r0.hasValue(r9)
            r1 = 1
            if (r10 == 0) goto L7c
            r10 = -1
            int r9 = r0.getInt(r9, r10)
            android.graphics.PorterDuff$Mode r10 = r8.mTickMarkTintMode
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r9, r10)
            r8.mTickMarkTintMode = r9
            r8.mHasTickMarkTintMode = r1
        L7c:
            int r9 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint
            boolean r10 = r0.hasValue(r9)
            if (r10 == 0) goto L8c
            android.content.res.ColorStateList r9 = r0.getColorStateList(r9)
            r8.mTickMarkTintList = r9
            r8.mHasTickMarkTint = r1
        L8c:
            r0.recycle()
            r8.applyTickMarkTint()
            return
    }
}
