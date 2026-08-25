package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
class ResizingTextView extends android.widget.TextView {
    public static final int TRIGGER_MAX_LINES = 1;
    private float mDefaultLineSpacingExtra;
    private int mDefaultPaddingBottom;
    private int mDefaultPaddingTop;
    private int mDefaultTextSize;
    private boolean mDefaultsInitialized;
    private boolean mIsResized;
    private boolean mMaintainLineSpacing;
    private int mResizedPaddingAdjustmentBottom;
    private int mResizedPaddingAdjustmentTop;
    private int mResizedTextSize;
    private int mTriggerConditions;

    public ResizingTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ResizingTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ResizingTextView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ResizingTextView(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r0 = 0
            r2.mIsResized = r0
            r2.mDefaultsInitialized = r0
            int[] r1 = androidx.leanback.R.styleable.lbResizingTextView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r5, r6)
            int r4 = androidx.leanback.R.styleable.lbResizingTextView_resizeTrigger     // Catch: java.lang.Throwable -> L3c
            r5 = 1
            int r4 = r3.getInt(r4, r5)     // Catch: java.lang.Throwable -> L3c
            r2.mTriggerConditions = r4     // Catch: java.lang.Throwable -> L3c
            int r4 = androidx.leanback.R.styleable.lbResizingTextView_resizedTextSize     // Catch: java.lang.Throwable -> L3c
            r5 = -1
            int r4 = r3.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Throwable -> L3c
            r2.mResizedTextSize = r4     // Catch: java.lang.Throwable -> L3c
            int r4 = androidx.leanback.R.styleable.lbResizingTextView_maintainLineSpacing     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r3.getBoolean(r4, r0)     // Catch: java.lang.Throwable -> L3c
            r2.mMaintainLineSpacing = r4     // Catch: java.lang.Throwable -> L3c
            int r4 = androidx.leanback.R.styleable.lbResizingTextView_resizedPaddingAdjustmentTop     // Catch: java.lang.Throwable -> L3c
            int r4 = r3.getDimensionPixelOffset(r4, r0)     // Catch: java.lang.Throwable -> L3c
            r2.mResizedPaddingAdjustmentTop = r4     // Catch: java.lang.Throwable -> L3c
            int r4 = androidx.leanback.R.styleable.lbResizingTextView_resizedPaddingAdjustmentBottom     // Catch: java.lang.Throwable -> L3c
            int r4 = r3.getDimensionPixelOffset(r4, r0)     // Catch: java.lang.Throwable -> L3c
            r2.mResizedPaddingAdjustmentBottom = r4     // Catch: java.lang.Throwable -> L3c
            r3.recycle()
            return
        L3c:
            r4 = move-exception
            r3.recycle()
            throw r4
    }

    private void resizeParamsChanged() {
            r1 = this;
            boolean r0 = r1.mIsResized
            if (r0 == 0) goto L7
            r1.requestLayout()
        L7:
            return
    }

    private void setPaddingTopAndBottom(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.isPaddingRelative()
            if (r0 == 0) goto L12
            int r0 = r2.getPaddingStart()
            int r1 = r2.getPaddingEnd()
            r2.setPaddingRelative(r0, r3, r1, r4)
            goto L1d
        L12:
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r2.setPadding(r0, r3, r1, r4)
        L1d:
            return
    }

    public boolean getMaintainLineSpacing() {
            r1 = this;
            boolean r0 = r1.mMaintainLineSpacing
            return r0
    }

    public int getResizedPaddingAdjustmentBottom() {
            r1 = this;
            int r0 = r1.mResizedPaddingAdjustmentBottom
            return r0
    }

    public int getResizedPaddingAdjustmentTop() {
            r1 = this;
            int r0 = r1.mResizedPaddingAdjustmentTop
            return r0
    }

    public int getResizedTextSize() {
            r1 = this;
            int r0 = r1.mResizedTextSize
            return r0
    }

    public int getTriggerConditions() {
            r1 = this;
            int r0 = r1.mTriggerConditions
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.mDefaultsInitialized
            r1 = 1
            if (r0 != 0) goto L20
            float r0 = r6.getTextSize()
            int r0 = (int) r0
            r6.mDefaultTextSize = r0
            float r0 = r6.getLineSpacingExtra()
            r6.mDefaultLineSpacingExtra = r0
            int r0 = r6.getPaddingTop()
            r6.mDefaultPaddingTop = r0
            int r0 = r6.getPaddingBottom()
            r6.mDefaultPaddingBottom = r0
            r6.mDefaultsInitialized = r1
        L20:
            int r0 = r6.mDefaultTextSize
            float r0 = (float) r0
            r2 = 0
            r6.setTextSize(r2, r0)
            float r0 = r6.mDefaultLineSpacingExtra
            float r3 = r6.getLineSpacingMultiplier()
            r6.setLineSpacing(r0, r3)
            int r0 = r6.mDefaultPaddingTop
            int r3 = r6.mDefaultPaddingBottom
            r6.setPaddingTopAndBottom(r0, r3)
            super.onMeasure(r7, r8)
            android.text.Layout r0 = r6.getLayout()
            if (r0 == 0) goto L53
            int r3 = r6.mTriggerConditions
            r3 = r3 & r1
            if (r3 <= 0) goto L53
            int r0 = r0.getLineCount()
            int r3 = r6.getMaxLines()
            if (r3 <= r1) goto L53
            if (r0 != r3) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            float r3 = r6.getTextSize()
            int r3 = (int) r3
            r4 = -1
            if (r0 == 0) goto L9f
            int r5 = r6.mResizedTextSize
            if (r5 == r4) goto L67
            if (r3 == r5) goto L67
            float r3 = (float) r5
            r6.setTextSize(r2, r3)
            r2 = 1
        L67:
            float r3 = r6.mDefaultLineSpacingExtra
            int r4 = r6.mDefaultTextSize
            float r4 = (float) r4
            float r3 = r3 + r4
            int r4 = r6.mResizedTextSize
            float r4 = (float) r4
            float r3 = r3 - r4
            boolean r4 = r6.mMaintainLineSpacing
            if (r4 == 0) goto L85
            float r4 = r6.getLineSpacingExtra()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L85
            float r2 = r6.getLineSpacingMultiplier()
            r6.setLineSpacing(r3, r2)
            r2 = 1
        L85:
            int r3 = r6.mDefaultPaddingTop
            int r4 = r6.mResizedPaddingAdjustmentTop
            int r3 = r3 + r4
            int r4 = r6.mDefaultPaddingBottom
            int r5 = r6.mResizedPaddingAdjustmentBottom
            int r4 = r4 + r5
            int r5 = r6.getPaddingTop()
            if (r5 != r3) goto L9b
            int r5 = r6.getPaddingBottom()
            if (r5 == r4) goto Ld3
        L9b:
            r6.setPaddingTopAndBottom(r3, r4)
            goto Ldc
        L9f:
            int r5 = r6.mResizedTextSize
            if (r5 == r4) goto Lac
            int r4 = r6.mDefaultTextSize
            if (r3 == r4) goto Lac
            float r3 = (float) r4
            r6.setTextSize(r2, r3)
            r2 = 1
        Lac:
            boolean r3 = r6.mMaintainLineSpacing
            if (r3 == 0) goto Lc2
            float r3 = r6.getLineSpacingExtra()
            float r4 = r6.mDefaultLineSpacingExtra
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto Lc2
            float r2 = r6.getLineSpacingMultiplier()
            r6.setLineSpacing(r4, r2)
            r2 = 1
        Lc2:
            int r3 = r6.getPaddingTop()
            int r4 = r6.mDefaultPaddingTop
            if (r3 != r4) goto Ld5
            int r3 = r6.getPaddingBottom()
            int r4 = r6.mDefaultPaddingBottom
            if (r3 == r4) goto Ld3
            goto Ld5
        Ld3:
            r1 = r2
            goto Ldc
        Ld5:
            int r2 = r6.mDefaultPaddingTop
            int r3 = r6.mDefaultPaddingBottom
            r6.setPaddingTopAndBottom(r2, r3)
        Ldc:
            r6.mIsResized = r0
            if (r1 == 0) goto Le3
            super.onMeasure(r7, r8)
        Le3:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setMaintainLineSpacing(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMaintainLineSpacing
            if (r0 == r2) goto L9
            r1.mMaintainLineSpacing = r2
            r1.resizeParamsChanged()
        L9:
            return
    }

    public void setResizedPaddingAdjustmentBottom(int r2) {
            r1 = this;
            int r0 = r1.mResizedPaddingAdjustmentBottom
            if (r0 == r2) goto L9
            r1.mResizedPaddingAdjustmentBottom = r2
            r1.resizeParamsChanged()
        L9:
            return
    }

    public void setResizedPaddingAdjustmentTop(int r2) {
            r1 = this;
            int r0 = r1.mResizedPaddingAdjustmentTop
            if (r0 == r2) goto L9
            r1.mResizedPaddingAdjustmentTop = r2
            r1.resizeParamsChanged()
        L9:
            return
    }

    public void setResizedTextSize(int r2) {
            r1 = this;
            int r0 = r1.mResizedTextSize
            if (r0 == r2) goto L9
            r1.mResizedTextSize = r2
            r1.resizeParamsChanged()
        L9:
            return
    }

    public void setTriggerConditions(int r2) {
            r1 = this;
            int r0 = r1.mTriggerConditions
            if (r0 == r2) goto L9
            r1.mTriggerConditions = r2
            r1.requestLayout()
        L9:
            return
    }
}
