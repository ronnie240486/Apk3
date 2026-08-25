package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class SeekBar extends android.view.View {
    private androidx.leanback.widget.SeekBar.AccessibilitySeekListener mAccessibilitySeekListener;
    private int mActiveBarHeight;
    private int mActiveRadius;
    private final android.graphics.Paint mBackgroundPaint;
    private final android.graphics.RectF mBackgroundRect;
    private int mBarHeight;
    private final android.graphics.Paint mKnobPaint;
    private int mKnobx;
    private int mMax;
    private int mProgress;
    private final android.graphics.Paint mProgressPaint;
    private final android.graphics.RectF mProgressRect;
    private int mSecondProgress;
    private final android.graphics.Paint mSecondProgressPaint;
    private final android.graphics.RectF mSecondProgressRect;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class AccessibilitySeekListener {
        public AccessibilitySeekListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean onAccessibilitySeekBackward();

        public abstract boolean onAccessibilitySeekForward();
    }

    public SeekBar(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r4.mProgressRect = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r4.mSecondProgressRect = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r4.mBackgroundRect = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r0 = 1
            r6.<init>(r0)
            r4.mSecondProgressPaint = r6
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r0)
            r4.mProgressPaint = r1
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r4.mBackgroundPaint = r2
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r0)
            r4.mKnobPaint = r3
            r0 = 0
            r4.setWillNotDraw(r0)
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r2.setColor(r0)
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
            r6.setColor(r0)
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r1.setColor(r6)
            r6 = -1
            r3.setColor(r6)
            android.content.res.Resources r6 = r5.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_transport_progressbar_bar_height
            int r6 = r6.getDimensionPixelSize(r0)
            r4.mBarHeight = r6
            android.content.res.Resources r6 = r5.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_transport_progressbar_active_bar_height
            int r6 = r6.getDimensionPixelSize(r0)
            r4.mActiveBarHeight = r6
            android.content.res.Resources r5 = r5.getResources()
            int r6 = androidx.leanback.R.dimen.lb_playback_transport_progressbar_active_radius
            int r5 = r5.getDimensionPixelSize(r6)
            r4.mActiveRadius = r5
            return
    }

    private void calculate() {
            r8 = this;
            boolean r0 = r8.isFocused()
            if (r0 == 0) goto L9
            int r0 = r8.mActiveBarHeight
            goto Lb
        L9:
            int r0 = r8.mBarHeight
        Lb:
            int r1 = r8.getWidth()
            int r2 = r8.getHeight()
            int r0 = r2 - r0
            int r0 = r0 / 2
            android.graphics.RectF r3 = r8.mBackgroundRect
            int r4 = r8.mBarHeight
            int r5 = r4 / 2
            float r5 = (float) r5
            float r6 = (float) r0
            int r4 = r4 / 2
            int r4 = r1 - r4
            float r4 = (float) r4
            int r2 = r2 - r0
            float r0 = (float) r2
            r3.set(r5, r6, r4, r0)
            boolean r2 = r8.isFocused()
            if (r2 == 0) goto L32
            int r2 = r8.mActiveRadius
            goto L36
        L32:
            int r2 = r8.mBarHeight
            int r2 = r2 / 2
        L36:
            int r3 = r2 * 2
            int r1 = r1 - r3
            int r3 = r8.mProgress
            float r3 = (float) r3
            int r4 = r8.mMax
            float r4 = (float) r4
            float r3 = r3 / r4
            float r1 = (float) r1
            float r3 = r3 * r1
            android.graphics.RectF r4 = r8.mProgressRect
            int r5 = r8.mBarHeight
            int r7 = r5 / 2
            float r7 = (float) r7
            int r5 = r5 / 2
            float r5 = (float) r5
            float r5 = r5 + r3
            r4.set(r7, r6, r5, r0)
            int r4 = r8.mSecondProgress
            float r4 = (float) r4
            int r5 = r8.mMax
            float r5 = (float) r5
            float r4 = r4 / r5
            float r4 = r4 * r1
            android.graphics.RectF r1 = r8.mSecondProgressRect
            android.graphics.RectF r5 = r8.mProgressRect
            float r5 = r5.right
            int r7 = r8.mBarHeight
            int r7 = r7 / 2
            float r7 = (float) r7
            float r7 = r7 + r4
            r1.set(r5, r6, r7, r0)
            int r0 = (int) r3
            int r2 = r2 + r0
            r8.mKnobx = r2
            r8.invalidate()
            return
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getMax() {
            r1 = this;
            int r0 = r1.mMax
            return r0
    }

    public int getProgress() {
            r1 = this;
            int r0 = r1.mProgress
            return r0
    }

    public int getSecondProgress() {
            r1 = this;
            int r0 = r1.mSecondProgress
            return r0
    }

    public int getSecondaryProgressColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.mSecondProgressPaint
            int r0 = r0.getColor()
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.isFocused()
            if (r0 == 0) goto Lc
            int r0 = r4.mActiveRadius
            goto L10
        Lc:
            int r0 = r4.mBarHeight
            int r0 = r0 / 2
        L10:
            android.graphics.RectF r1 = r4.mBackgroundRect
            float r0 = (float) r0
            android.graphics.Paint r2 = r4.mBackgroundPaint
            r5.drawRoundRect(r1, r0, r0, r2)
            android.graphics.RectF r1 = r4.mSecondProgressRect
            float r2 = r1.right
            float r3 = r1.left
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L27
            android.graphics.Paint r2 = r4.mSecondProgressPaint
            r5.drawRoundRect(r1, r0, r0, r2)
        L27:
            android.graphics.RectF r1 = r4.mProgressRect
            android.graphics.Paint r2 = r4.mProgressPaint
            r5.drawRoundRect(r1, r0, r0, r2)
            int r1 = r4.mKnobx
            float r1 = (float) r1
            int r2 = r4.getHeight()
            int r2 = r2 / 2
            float r2 = (float) r2
            android.graphics.Paint r3 = r4.mKnobPaint
            r5.drawCircle(r1, r2, r0, r3)
            return
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            r0.calculate()
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.calculate()
            return
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int r3, android.os.Bundle r4) {
            r2 = this;
            androidx.leanback.widget.SeekBar$AccessibilitySeekListener r0 = r2.mAccessibilitySeekListener
            if (r0 == 0) goto L17
            r1 = 4096(0x1000, float:5.74E-42)
            if (r3 == r1) goto L12
            r1 = 8192(0x2000, float:1.148E-41)
            if (r3 == r1) goto Ld
            goto L17
        Ld:
            boolean r3 = r0.onAccessibilitySeekBackward()
            return r3
        L12:
            boolean r3 = r0.onAccessibilitySeekForward()
            return r3
        L17:
            boolean r3 = super.performAccessibilityAction(r3, r4)
            return r3
    }

    public void setAccessibilitySeekListener(androidx.leanback.widget.SeekBar.AccessibilitySeekListener r1) {
            r0 = this;
            r0.mAccessibilitySeekListener = r1
            return
    }

    public void setActiveBarHeight(int r1) {
            r0 = this;
            r0.mActiveBarHeight = r1
            r0.calculate()
            return
    }

    public void setActiveRadius(int r1) {
            r0 = this;
            r0.mActiveRadius = r1
            r0.calculate()
            return
    }

    public void setBarHeight(int r1) {
            r0 = this;
            r0.mBarHeight = r1
            r0.calculate()
            return
    }

    public void setMax(int r1) {
            r0 = this;
            r0.mMax = r1
            r0.calculate()
            return
    }

    public void setProgress(int r2) {
            r1 = this;
            int r0 = r1.mMax
            if (r2 <= r0) goto L6
            r2 = r0
            goto L9
        L6:
            if (r2 >= 0) goto L9
            r2 = 0
        L9:
            r1.mProgress = r2
            r1.calculate()
            return
    }

    public void setProgressColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mProgressPaint
            r0.setColor(r2)
            return
    }

    public void setSecondaryProgress(int r2) {
            r1 = this;
            int r0 = r1.mMax
            if (r2 <= r0) goto L6
            r2 = r0
            goto L9
        L6:
            if (r2 >= 0) goto L9
            r2 = 0
        L9:
            r1.mSecondProgress = r2
            r1.calculate()
            return
    }

    public void setSecondaryProgressColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mSecondProgressPaint
            r0.setColor(r2)
            return
    }
}
