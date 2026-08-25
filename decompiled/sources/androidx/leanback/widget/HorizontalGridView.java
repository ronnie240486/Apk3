package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends androidx.leanback.widget.BaseGridView {
    private boolean mFadingHighEdge;
    private boolean mFadingLowEdge;
    private android.graphics.LinearGradient mHighFadeShader;
    private int mHighFadeShaderLength;
    private int mHighFadeShaderOffset;
    private android.graphics.LinearGradient mLowFadeShader;
    private int mLowFadeShaderLength;
    private int mLowFadeShaderOffset;
    private android.graphics.Bitmap mTempBitmapHigh;
    private android.graphics.Bitmap mTempBitmapLow;
    private android.graphics.Paint mTempPaint;
    private android.graphics.Rect mTempRect;

    public HorizontalGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public HorizontalGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public HorizontalGridView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r1.mTempPaint = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.mTempRect = r4
            androidx.leanback.widget.GridLayoutManager r4 = r1.mLayoutManager
            r0 = 0
            r4.setOrientation(r0)
            r1.initBaseGridViewAttributes(r2, r3)
            int[] r4 = androidx.leanback.R.styleable.lbHorizontalGridView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r4)
            r1.setRowHeight(r2)
            int r3 = androidx.leanback.R.styleable.lbHorizontalGridView_numberOfRows
            r4 = 1
            int r3 = r2.getInt(r3, r4)
            r1.setNumRows(r3)
            r2.recycle()
            r1.updateLayerType()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.mTempPaint = r2
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.DST_IN
            r3.<init>(r4)
            r2.setXfermode(r3)
            return
    }

    private android.graphics.Bitmap getTempBitmapHigh() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.mTempBitmapHigh
            if (r0 == 0) goto L18
            int r0 = r0.getWidth()
            int r1 = r3.mHighFadeShaderLength
            if (r0 != r1) goto L18
            android.graphics.Bitmap r0 = r3.mTempBitmapHigh
            int r0 = r0.getHeight()
            int r1 = r3.getHeight()
            if (r0 == r1) goto L26
        L18:
            int r0 = r3.mHighFadeShaderLength
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r3.mTempBitmapHigh = r0
        L26:
            android.graphics.Bitmap r0 = r3.mTempBitmapHigh
            return r0
    }

    private android.graphics.Bitmap getTempBitmapLow() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.mTempBitmapLow
            if (r0 == 0) goto L18
            int r0 = r0.getWidth()
            int r1 = r3.mLowFadeShaderLength
            if (r0 != r1) goto L18
            android.graphics.Bitmap r0 = r3.mTempBitmapLow
            int r0 = r0.getHeight()
            int r1 = r3.getHeight()
            if (r0 == r1) goto L26
        L18:
            int r0 = r3.mLowFadeShaderLength
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r3.mTempBitmapLow = r0
        L26:
            android.graphics.Bitmap r0 = r3.mTempBitmapLow
            return r0
    }

    private boolean needsFadingHighEdge() {
            r6 = this;
            boolean r0 = r6.mFadingHighEdge
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r6.getChildCount()
            r2 = 1
            int r0 = r0 - r2
        Lc:
            if (r0 < 0) goto L39
            android.view.View r3 = r6.getChildAt(r0)
            androidx.leanback.widget.GridLayoutManager r4 = r6.mLayoutManager
            java.util.Objects.requireNonNull(r4)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r4 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r4
            java.util.Objects.requireNonNull(r4)
            int r3 = r3.getRight()
            int r4 = r4.mRightInset
            int r3 = r3 - r4
            int r4 = r6.getWidth()
            int r5 = r6.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r6.mHighFadeShaderOffset
            int r4 = r4 + r5
            if (r3 <= r4) goto L36
            return r2
        L36:
            int r0 = r0 + (-1)
            goto Lc
        L39:
            return r1
    }

    private boolean needsFadingLowEdge() {
            r6 = this;
            boolean r0 = r6.mFadingLowEdge
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r6.getChildCount()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L34
            android.view.View r3 = r6.getChildAt(r2)
            androidx.leanback.widget.GridLayoutManager r4 = r6.mLayoutManager
            java.util.Objects.requireNonNull(r4)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.leanback.widget.GridLayoutManager$LayoutParams r4 = (androidx.leanback.widget.GridLayoutManager.LayoutParams) r4
            java.util.Objects.requireNonNull(r4)
            int r3 = r3.getLeft()
            int r4 = r4.mLeftInset
            int r3 = r3 + r4
            int r4 = r6.getPaddingLeft()
            int r5 = r6.mLowFadeShaderOffset
            int r4 = r4 - r5
            if (r3 >= r4) goto L31
            r0 = 1
            return r0
        L31:
            int r2 = r2 + 1
            goto Lb
        L34:
            return r1
    }

    private void updateLayerType() {
            r3 = this;
            boolean r0 = r3.mFadingLowEdge
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L13
            boolean r0 = r3.mFadingHighEdge
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            r3.setLayerType(r1, r2)
            r0 = 1
            r3.setWillNotDraw(r0)
            goto L1a
        L13:
            r0 = 2
            r3.setLayerType(r0, r2)
            r3.setWillNotDraw(r1)
        L1a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r18.needsFadingLowEdge()
            boolean r3 = r18.needsFadingHighEdge()
            r4 = 0
            if (r2 != 0) goto L11
            r0.mTempBitmapLow = r4
        L11:
            if (r3 != 0) goto L15
            r0.mTempBitmapHigh = r4
        L15:
            if (r2 != 0) goto L1d
            if (r3 != 0) goto L1d
            super.draw(r19)
            return
        L1d:
            boolean r5 = r0.mFadingLowEdge
            r6 = 0
            if (r5 == 0) goto L2d
            int r5 = r18.getPaddingLeft()
            int r7 = r0.mLowFadeShaderOffset
            int r5 = r5 - r7
            int r7 = r0.mLowFadeShaderLength
            int r5 = r5 - r7
            goto L2e
        L2d:
            r5 = 0
        L2e:
            boolean r7 = r0.mFadingHighEdge
            if (r7 == 0) goto L42
            int r7 = r18.getWidth()
            int r8 = r18.getPaddingRight()
            int r7 = r7 - r8
            int r8 = r0.mHighFadeShaderOffset
            int r7 = r7 + r8
            int r8 = r0.mHighFadeShaderLength
            int r7 = r7 + r8
            goto L46
        L42:
            int r7 = r18.getWidth()
        L46:
            int r8 = r19.save()
            boolean r9 = r0.mFadingLowEdge
            if (r9 == 0) goto L51
            int r9 = r0.mLowFadeShaderLength
            goto L52
        L51:
            r9 = 0
        L52:
            int r9 = r9 + r5
            boolean r10 = r0.mFadingHighEdge
            if (r10 == 0) goto L5a
            int r10 = r0.mHighFadeShaderLength
            goto L5b
        L5a:
            r10 = 0
        L5b:
            int r10 = r7 - r10
            int r11 = r18.getHeight()
            r1.clipRect(r9, r6, r10, r11)
            super.draw(r19)
            r1.restoreToCount(r8)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>()
            android.graphics.Rect r9 = r0.mTempRect
            r9.top = r6
            int r10 = r18.getHeight()
            r9.bottom = r10
            r9 = 0
            if (r2 == 0) goto Ld1
            int r2 = r0.mLowFadeShaderLength
            if (r2 <= 0) goto Ld1
            android.graphics.Bitmap r2 = r18.getTempBitmapLow()
            r2.eraseColor(r6)
            r8.setBitmap(r2)
            int r10 = r8.save()
            int r11 = r0.mLowFadeShaderLength
            int r12 = r18.getHeight()
            r8.clipRect(r6, r6, r11, r12)
            int r11 = -r5
            float r11 = (float) r11
            r8.translate(r11, r9)
            super.draw(r8)
            r8.restoreToCount(r10)
            android.graphics.Paint r10 = r0.mTempPaint
            android.graphics.LinearGradient r12 = r0.mLowFadeShader
            r10.setShader(r12)
            r13 = 0
            r14 = 0
            int r10 = r0.mLowFadeShaderLength
            float r15 = (float) r10
            int r10 = r18.getHeight()
            float r10 = (float) r10
            android.graphics.Paint r12 = r0.mTempPaint
            r17 = r12
            r12 = r8
            r16 = r10
            r12.drawRect(r13, r14, r15, r16, r17)
            android.graphics.Rect r10 = r0.mTempRect
            r10.left = r6
            int r12 = r0.mLowFadeShaderLength
            r10.right = r12
            float r5 = (float) r5
            r1.translate(r5, r9)
            android.graphics.Rect r5 = r0.mTempRect
            r1.drawBitmap(r2, r5, r5, r4)
            r1.translate(r11, r9)
        Ld1:
            if (r3 == 0) goto L133
            int r2 = r0.mHighFadeShaderLength
            if (r2 <= 0) goto L133
            android.graphics.Bitmap r2 = r18.getTempBitmapHigh()
            r2.eraseColor(r6)
            r8.setBitmap(r2)
            int r3 = r8.save()
            int r5 = r0.mHighFadeShaderLength
            int r10 = r18.getHeight()
            r8.clipRect(r6, r6, r5, r10)
            int r5 = r0.mHighFadeShaderLength
            int r5 = r7 - r5
            int r5 = -r5
            float r5 = (float) r5
            r8.translate(r5, r9)
            super.draw(r8)
            r8.restoreToCount(r3)
            android.graphics.Paint r3 = r0.mTempPaint
            android.graphics.LinearGradient r5 = r0.mHighFadeShader
            r3.setShader(r5)
            r13 = 0
            r14 = 0
            int r3 = r0.mHighFadeShaderLength
            float r15 = (float) r3
            int r3 = r18.getHeight()
            float r3 = (float) r3
            android.graphics.Paint r5 = r0.mTempPaint
            r12 = r8
            r16 = r3
            r17 = r5
            r12.drawRect(r13, r14, r15, r16, r17)
            android.graphics.Rect r3 = r0.mTempRect
            r3.left = r6
            int r5 = r0.mHighFadeShaderLength
            r3.right = r5
            int r3 = r7 - r5
            float r3 = (float) r3
            r1.translate(r3, r9)
            android.graphics.Rect r3 = r0.mTempRect
            r1.drawBitmap(r2, r3, r3, r4)
            int r2 = r0.mHighFadeShaderLength
            int r7 = r7 - r2
            int r2 = -r7
            float r2 = (float) r2
            r1.translate(r2, r9)
        L133:
            return
    }

    public final boolean getFadingLeftEdge() {
            r1 = this;
            boolean r0 = r1.mFadingLowEdge
            return r0
    }

    public final int getFadingLeftEdgeLength() {
            r1 = this;
            int r0 = r1.mLowFadeShaderLength
            return r0
    }

    public final int getFadingLeftEdgeOffset() {
            r1 = this;
            int r0 = r1.mLowFadeShaderOffset
            return r0
    }

    public final boolean getFadingRightEdge() {
            r1 = this;
            boolean r0 = r1.mFadingHighEdge
            return r0
    }

    public final int getFadingRightEdgeLength() {
            r1 = this;
            int r0 = r1.mHighFadeShaderLength
            return r0
    }

    public final int getFadingRightEdgeOffset() {
            r1 = this;
            int r0 = r1.mHighFadeShaderOffset
            return r0
    }

    public final void setFadingLeftEdge(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFadingLowEdge
            if (r0 == r2) goto L11
            r1.mFadingLowEdge = r2
            if (r2 != 0) goto Lb
            r2 = 0
            r1.mTempBitmapLow = r2
        Lb:
            r1.invalidate()
            r1.updateLayerType()
        L11:
            return
    }

    public final void setFadingLeftEdgeLength(int r10) {
            r9 = this;
            int r0 = r9.mLowFadeShaderLength
            if (r0 == r10) goto L22
            r9.mLowFadeShaderLength = r10
            if (r10 == 0) goto L1c
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r2 = 0
            r3 = 0
            int r0 = r9.mLowFadeShaderLength
            float r4 = (float) r0
            r5 = 0
            r6 = 0
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.mLowFadeShader = r10
            goto L1f
        L1c:
            r10 = 0
            r9.mLowFadeShader = r10
        L1f:
            r9.invalidate()
        L22:
            return
    }

    public final void setFadingLeftEdgeOffset(int r2) {
            r1 = this;
            int r0 = r1.mLowFadeShaderOffset
            if (r0 == r2) goto L9
            r1.mLowFadeShaderOffset = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setFadingRightEdge(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFadingHighEdge
            if (r0 == r2) goto L11
            r1.mFadingHighEdge = r2
            if (r2 != 0) goto Lb
            r2 = 0
            r1.mTempBitmapHigh = r2
        Lb:
            r1.invalidate()
            r1.updateLayerType()
        L11:
            return
    }

    public final void setFadingRightEdgeLength(int r10) {
            r9 = this;
            int r0 = r9.mHighFadeShaderLength
            if (r0 == r10) goto L22
            r9.mHighFadeShaderLength = r10
            if (r10 == 0) goto L1c
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r2 = 0
            r3 = 0
            int r0 = r9.mHighFadeShaderLength
            float r4 = (float) r0
            r5 = 0
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = 0
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.mHighFadeShader = r10
            goto L1f
        L1c:
            r10 = 0
            r9.mHighFadeShader = r10
        L1f:
            r9.invalidate()
        L22:
            return
    }

    public final void setFadingRightEdgeOffset(int r2) {
            r1 = this;
            int r0 = r1.mHighFadeShaderOffset
            if (r0 == r2) goto L9
            r1.mHighFadeShaderOffset = r2
            r1.invalidate()
        L9:
            return
    }

    public void setNumRows(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setNumRows(r2)
            r1.requestLayout()
            return
    }

    public void setRowHeight(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setRowHeight(r2)
            r1.requestLayout()
            return
    }

    public void setRowHeight(android.content.res.TypedArray r3) {
            r2 = this;
            int r0 = androidx.leanback.R.styleable.lbHorizontalGridView_rowHeight
            android.util.TypedValue r1 = r3.peekValue(r0)
            if (r1 == 0) goto L10
            r1 = 0
            int r3 = r3.getLayoutDimension(r0, r1)
            r2.setRowHeight(r3)
        L10:
            return
    }
}
