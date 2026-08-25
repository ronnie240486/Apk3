package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.mBaselineAligned = r0
            r1 = -1
            r11.mBaselineAlignedChildIndex = r1
            r2 = 0
            r11.mBaselineChildTop = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.mGravity = r3
            int[] r6 = androidx.appcompat.R.styleable.LinearLayoutCompat
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r6, r14, r2)
            android.content.res.TypedArray r8 = r3.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L2e
            r11.setOrientation(r12)
        L2e:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L39
            r11.setGravity(r12)
        L39:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r12 = r3.getBoolean(r12, r0)
            if (r12 != 0) goto L44
            r11.setBaselineAligned(r12)
        L44:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = r3.getFloat(r12, r13)
            r11.mWeightSum = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r12 = r3.getInt(r12, r1)
            r11.mBaselineAlignedChildIndex = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r12 = r3.getBoolean(r12, r2)
            r11.mUseLargestChild = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r12)
            r11.setDividerDrawable(r12)
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers
            int r12 = r3.getInt(r12, r2)
            r11.mShowDividers = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.mDividerPadding = r12
            r3.recycle()
            return
    }

    private void forceUniformHeight(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.getChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            int r2 = r8.height
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.width
            int r2 = r3.getMeasuredWidth()
            r8.width = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r12
            r6 = r0
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.width = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private void forceUniformWidth(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.getChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private void setChildFrame(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            return r1
    }

    public final void drawHorizontalDivider(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mDivider
            int r1 = r4.getPaddingLeft()
            int r2 = r4.mDividerPadding
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.mDividerPadding
            int r2 = r2 - r3
            int r3 = r4.mDividerHeight
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.mDivider
            r6.draw(r5)
            return
    }

    public final void drawVerticalDivider(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDivider
            int r1 = r5.getPaddingTop()
            int r2 = r5.mDividerPadding
            int r1 = r1 + r2
            int r2 = r5.mDividerWidth
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mDividerPadding
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.mDivider
            r7.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r1, r1)
            return r0
        Lb:
            r2 = 1
            if (r0 != r2) goto L15
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.mBaselineAlignedChildIndex
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = r5.mBaselineChildTop
            int r3 = r5.mOrientation
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r5.mTotalLength
            int r2 = r2 - r3
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mTotalLength
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.mBaselineAlignedChildIndex
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.mDividerPadding
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.mDividerWidth
            return r0
    }

    @androidx.annotation.GravityInt
    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.mShowDividers
            return r0
    }

    public int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.mWeightSum
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final boolean hasDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r5 = r4.mShowDividers
            r5 = r5 & r1
            if (r5 == 0) goto La
            r0 = 1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r5 = r4.mShowDividers
            r5 = r5 & 4
            if (r5 == 0) goto L18
            r0 = 1
        L18:
            return r0
        L19:
            int r2 = r4.mShowDividers
            r2 = r2 & 2
            if (r2 == 0) goto L33
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L33
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L30
            r0 = 1
            goto L33
        L30:
            int r5 = r5 + (-1)
            goto L20
        L33:
            return r0
    }

    public boolean isBaselineAligned() {
            r1 = this;
            boolean r0 = r1.mBaselineAligned
            return r0
    }

    public boolean isMeasureWithLargestChildEnabled() {
            r1 = this;
            boolean r0 = r1.mUseLargestChild
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mDivider
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r6.mOrientation
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L68
            int r0 = r6.getVirtualChildCount()
        L11:
            if (r2 >= r0) goto L3b
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L38
            int r4 = r3.getVisibility()
            if (r4 == r1) goto L38
            boolean r4 = r6.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L38
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r3 = r3.getTop()
            int r4 = r4.topMargin
            int r3 = r3 - r4
            int r4 = r6.mDividerHeight
            int r3 = r3 - r4
            r6.drawHorizontalDivider(r7, r3)
        L38:
            int r2 = r2 + 1
            goto L11
        L3b:
            boolean r1 = r6.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto Le2
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r6.getHeight()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r6.mDividerHeight
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r6.drawHorizontalDivider(r7, r0)
            goto Le2
        L68:
            int r0 = r6.getVirtualChildCount()
            boolean r3 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
        L70:
            if (r2 >= r0) goto La4
            android.view.View r4 = r6.getChildAt(r2)
            if (r4 == 0) goto La1
            int r5 = r4.getVisibility()
            if (r5 == r1) goto La1
            boolean r5 = r6.hasDividerBeforeChildAt(r2)
            if (r5 == 0) goto La1
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            if (r3 == 0) goto L94
            int r4 = r4.getRight()
            int r5 = r5.rightMargin
            int r4 = r4 + r5
            goto L9e
        L94:
            int r4 = r4.getLeft()
            int r5 = r5.leftMargin
            int r4 = r4 - r5
            int r5 = r6.mDividerWidth
            int r4 = r4 - r5
        L9e:
            r6.drawVerticalDivider(r7, r4)
        La1:
            int r2 = r2 + 1
            goto L70
        La4:
            boolean r1 = r6.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto Le2
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            if (r0 != 0) goto Lc5
            if (r3 == 0) goto Lb9
            int r0 = r6.getPaddingLeft()
            goto Ldf
        Lb9:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
            goto Ld6
        Lc5:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            if (r3 == 0) goto Ld8
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
        Ld6:
            int r0 = r0 - r1
            goto Ldf
        Ld8:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Ldf:
            r6.drawVerticalDivider(r7, r0)
        Le2:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
            r26 = this;
            r6 = r26
            int r0 = r6.mOrientation
            r7 = 8
            r8 = 16
            r9 = 80
            r10 = 1
            r11 = 2
            r12 = 0
            r13 = 5
            r1 = 8388615(0x800007, float:1.1754953E-38)
            if (r0 != r10) goto Lc3
            int r14 = r26.getPaddingLeft()
            int r0 = r30 - r28
            int r2 = r26.getPaddingRight()
            int r15 = r0 - r2
            int r0 = r0 - r14
            int r2 = r26.getPaddingRight()
            int r16 = r0 - r2
            int r5 = r26.getVirtualChildCount()
            int r0 = r6.mGravity
            r2 = r0 & 112(0x70, float:1.57E-43)
            r17 = r0 & r1
            if (r2 == r8) goto L45
            if (r2 == r9) goto L39
            int r0 = r26.getPaddingTop()
            goto L50
        L39:
            int r0 = r26.getPaddingTop()
            int r0 = r0 + r31
            int r0 = r0 - r29
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L50
        L45:
            int r0 = r26.getPaddingTop()
            int r1 = r31 - r29
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / r11
            int r0 = r0 + r1
        L50:
            r8 = 0
        L51:
            if (r8 >= r5) goto L1e9
            android.view.View r1 = r6.getChildAt(r8)
            if (r1 != 0) goto L5c
            int r0 = r0 + 0
            goto Lba
        L5c:
            int r2 = r1.getVisibility()
            if (r2 == r7) goto Lba
            int r4 = r1.getMeasuredWidth()
            int r9 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r3 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r2 = r3.gravity
            if (r2 >= 0) goto L77
            r2 = r17
        L77:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r26)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r7)
            r2 = r2 & 7
            if (r2 == r10) goto L8e
            if (r2 == r13) goto L89
            int r2 = r3.leftMargin
            int r2 = r2 + r14
            goto L98
        L89:
            int r2 = r15 - r4
            int r7 = r3.rightMargin
            goto L97
        L8e:
            int r2 = r16 - r4
            int r2 = r2 / r11
            int r2 = r2 + r14
            int r7 = r3.leftMargin
            int r2 = r2 + r7
            int r7 = r3.rightMargin
        L97:
            int r2 = r2 - r7
        L98:
            boolean r7 = r6.hasDividerBeforeChildAt(r8)
            if (r7 == 0) goto La1
            int r7 = r6.mDividerHeight
            int r0 = r0 + r7
        La1:
            int r7 = r3.topMargin
            int r7 = r7 + r0
            int r18 = r7 + 0
            r0 = r26
            r11 = r3
            r3 = r18
            r18 = r5
            r5 = r9
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r11.bottomMargin
            int r9 = r9 + r0
            int r9 = r9 + r12
            int r9 = r9 + r7
            int r8 = r8 + 0
            r0 = r9
            goto Lbc
        Lba:
            r18 = r5
        Lbc:
            int r8 = r8 + r10
            r5 = r18
            r7 = 8
            r11 = 2
            goto L51
        Lc3:
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r26)
            int r7 = r26.getPaddingTop()
            int r2 = r31 - r29
            int r3 = r26.getPaddingBottom()
            int r11 = r2 - r3
            int r2 = r2 - r7
            int r3 = r26.getPaddingBottom()
            int r14 = r2 - r3
            int r15 = r26.getVirtualChildCount()
            int r2 = r6.mGravity
            r1 = r1 & r2
            r16 = r2 & 112(0x70, float:1.57E-43)
            boolean r5 = r6.mBaselineAligned
            int[] r4 = r6.mMaxAscent
            int[] r3 = r6.mMaxDescent
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r26)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            if (r1 == r10) goto L106
            if (r1 == r13) goto Lfa
            int r1 = r26.getPaddingLeft()
            goto L112
        Lfa:
            int r1 = r26.getPaddingLeft()
            int r1 = r1 + r30
            int r1 = r1 - r28
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            goto L112
        L106:
            int r1 = r26.getPaddingLeft()
            int r2 = r30 - r28
            int r13 = r6.mTotalLength
            int r2 = r2 - r13
            r13 = 2
            int r2 = r2 / r13
            int r1 = r1 + r2
        L112:
            r13 = -1
            if (r0 == 0) goto L11c
            int r0 = r15 + (-1)
            r17 = r0
            r18 = -1
            goto L120
        L11c:
            r17 = 0
            r18 = 1
        L120:
            r2 = 0
        L121:
            if (r2 >= r15) goto L1e9
            int r0 = r18 * r2
            int r0 = r0 + r17
            android.view.View r20 = r6.getChildAt(r0)
            if (r20 != 0) goto L131
            int r1 = r1 + 0
            goto L1ce
        L131:
            int r12 = r20.getVisibility()
            r10 = 8
            if (r12 == r10) goto L1ce
            int r12 = r20.getMeasuredWidth()
            int r22 = r20.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r23 = r20.getLayoutParams()
            r10 = r23
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            if (r5 == 0) goto L154
            int r9 = r10.height
            if (r9 == r13) goto L154
            int r9 = r20.getBaseline()
            goto L155
        L154:
            r9 = -1
        L155:
            int r13 = r10.gravity
            if (r13 >= 0) goto L15b
            r13 = r16
        L15b:
            r13 = r13 & 112(0x70, float:1.57E-43)
            if (r13 == r8) goto L193
            r8 = 48
            if (r13 == r8) goto L180
            r8 = 80
            if (r13 == r8) goto L16a
            r13 = r7
            r8 = -1
            goto L18f
        L16a:
            int r13 = r11 - r22
            int r8 = r10.bottomMargin
            int r13 = r13 - r8
            r8 = -1
            if (r9 == r8) goto L18f
            int r24 = r20.getMeasuredHeight()
            int r24 = r24 - r9
            r9 = 2
            r25 = r3[r9]
            int r25 = r25 - r24
            int r13 = r13 - r25
            goto L18f
        L180:
            r8 = -1
            int r13 = r10.topMargin
            int r13 = r13 + r7
            if (r9 == r8) goto L18f
            r21 = 1
            r24 = r4[r21]
            int r24 = r24 - r9
            int r24 = r24 + r13
            goto L191
        L18f:
            r24 = r13
        L191:
            r13 = 2
            goto L1a1
        L193:
            r8 = -1
            int r9 = r14 - r22
            r13 = 2
            int r9 = r9 / r13
            int r9 = r9 + r7
            int r8 = r10.topMargin
            int r9 = r9 + r8
            int r8 = r10.bottomMargin
            int r9 = r9 - r8
            r24 = r9
        L1a1:
            boolean r0 = r6.hasDividerBeforeChildAt(r0)
            if (r0 == 0) goto L1aa
            int r0 = r6.mDividerWidth
            int r1 = r1 + r0
        L1aa:
            int r0 = r10.leftMargin
            int r8 = r1 + r0
            int r9 = r8 + 0
            r0 = r26
            r1 = r20
            r19 = r2
            r2 = r9
            r9 = r3
            r3 = r24
            r20 = r4
            r4 = r12
            r24 = r5
            r5 = r22
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r10.rightMargin
            int r12 = r12 + r0
            r0 = 0
            int r12 = r12 + r0
            int r12 = r12 + r8
            int r2 = r19 + 0
            r1 = r12
            goto L1d9
        L1ce:
            r19 = r2
            r9 = r3
            r20 = r4
            r24 = r5
            r0 = 0
            r13 = 2
            r2 = r19
        L1d9:
            r3 = 1
            int r2 = r2 + r3
            r3 = r9
            r4 = r20
            r5 = r24
            r8 = 16
            r9 = 80
            r10 = 1
            r12 = 0
            r13 = -1
            goto L121
        L1e9:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r38, int r39) {
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.mOrientation
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L362
            r6.mTotalLength = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.mBaselineAlignedChildIndex
            boolean r9 = r6.mUseLargestChild
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L39:
            if (r14 >= r3) goto L17c
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L47
            int r5 = r6.mTotalLength
            int r5 = r5 + r4
            r6.mTotalLength = r5
            goto L4f
        L47:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L5b
            int r14 = r14 + 0
        L4f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r17
            r27 = 1
            goto L166
        L5b:
            boolean r5 = r6.hasDividerBeforeChildAt(r14)
            if (r5 == 0) goto L68
            int r5 = r6.mTotalLength
            int r4 = r6.mDividerHeight
            int r5 = r5 + r4
            r6.mTotalLength = r5
        L68:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r4 = r5.weight
            float r21 = r21 + r4
            if (r1 != r15) goto L97
            int r12 = r5.height
            if (r12 != 0) goto L97
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L97
            int r4 = r6.mTotalLength
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.mTotalLength = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto Lee
        L97:
            int r12 = r5.height
            if (r12 != 0) goto La3
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto La3
            r5.height = r10
            r12 = 0
            goto La5
        La3:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        La5:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto Lae
            int r15 = r6.mTotalLength
            r10 = r0
            goto Lb0
        Lae:
            r10 = r0
            r15 = 0
        Lb0:
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r13 = 0
            r4 = r39
            r13 = r5
            r27 = 1
            r5 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto Lcb
            r13.height = r12
        Lcb:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.mTotalLength
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.mTotalLength = r1
            if (r9 == 0) goto Lea
            r4 = r18
            int r18 = java.lang.Math.max(r0, r4)
            goto Lec
        Lea:
            r4 = r18
        Lec:
            r5 = r22
        Lee:
            if (r10 < 0) goto Lf8
            int r0 = r14 + 1
            if (r10 != r0) goto Lf8
            int r0 = r6.mTotalLength
            r6.mBaselineChildTop = r0
        Lf8:
            if (r14 >= r10) goto L10a
            float r0 = r13.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L102
            goto L10a
        L102:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L10a:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L119
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L119
            r1 = 1
            r25 = 1
            goto L11a
        L119:
            r1 = 0
        L11a:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r17
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r23
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L13d
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L13d
            r11 = 1
            goto L13e
        L13d:
            r11 = 0
        L13e:
            float r13 = r13.weight
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L150
            if (r1 == 0) goto L148
            goto L149
        L148:
            r2 = r3
        L149:
            r13 = r20
            int r20 = java.lang.Math.max(r13, r2)
            goto L15e
        L150:
            r13 = r20
            if (r1 == 0) goto L155
            goto L156
        L155:
            r2 = r3
        L156:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r20 = r13
        L15e:
            int r14 = r14 + 0
            r22 = r5
            r24 = r11
            r23 = r12
        L166:
            int r14 = r14 + 1
            r2 = r0
            r17 = r4
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L39
        L17c:
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r17
            r4 = r18
            r1 = r19
            r13 = r20
            r15 = r23
            r27 = 1
            int r2 = r6.mTotalLength
            if (r2 <= 0) goto L1a1
            r2 = r31
            boolean r3 = r6.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L1a3
            int r3 = r6.mTotalLength
            int r5 = r6.mDividerHeight
            int r3 = r3 + r5
            r6.mTotalLength = r3
            goto L1a3
        L1a1:
            r2 = r31
        L1a3:
            r3 = r29
            if (r9 == 0) goto L1e9
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L1ad
            if (r3 != 0) goto L1e9
        L1ad:
            r5 = 0
            r6.mTotalLength = r5
            r10 = 0
        L1b1:
            if (r10 >= r2) goto L1e9
            android.view.View r11 = r6.getChildAt(r10)
            if (r11 != 0) goto L1bf
            int r11 = r6.mTotalLength
            int r11 = r11 + r5
            r6.mTotalLength = r11
            goto L1e5
        L1bf:
            int r5 = r11.getVisibility()
            r14 = 8
            if (r5 != r14) goto L1ca
            int r10 = r10 + 0
            goto L1e5
        L1ca:
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r11 = r6.mTotalLength
            int r18 = r11 + r4
            int r14 = r5.topMargin
            int r18 = r18 + r14
            int r5 = r5.bottomMargin
            int r18 = r18 + r5
            r5 = 0
            int r14 = r18 + 0
            int r5 = java.lang.Math.max(r11, r14)
            r6.mTotalLength = r5
        L1e5:
            int r10 = r10 + 1
            r5 = 0
            goto L1b1
        L1e9:
            int r5 = r6.mTotalLength
            int r10 = r37.getPaddingTop()
            int r11 = r37.getPaddingBottom()
            int r11 = r11 + r10
            int r11 = r11 + r5
            r6.mTotalLength = r11
            int r5 = r37.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r11, r5)
            r10 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r8, r10)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r5
            int r11 = r6.mTotalLength
            int r10 = r10 - r11
            if (r22 != 0) goto L256
            if (r10 == 0) goto L215
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L215
            goto L256
        L215:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L252
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 == r9) goto L252
            r3 = 0
        L220:
            if (r3 >= r2) goto L252
            android.view.View r9 = r6.getChildAt(r3)
            if (r9 == 0) goto L24f
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 != r11) goto L231
            goto L24f
        L231:
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r10 = r10.weight
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L24f
            int r10 = r9.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r9.measure(r10, r13)
        L24f:
            int r3 = r3 + 1
            goto L220
        L252:
            r17 = r12
            goto L339
        L256:
            float r4 = r6.mWeightSum
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L25f
            r21 = r4
        L25f:
            r4 = 0
            r6.mTotalLength = r4
            r4 = 0
        L263:
            if (r4 >= r2) goto L329
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L275
            r29 = r3
            goto L323
        L275:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r13 = r11.weight
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L2d8
            float r14 = (float) r10
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r10 = r10 - r14
            int r13 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r10
            int r10 = r11.width
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r10)
            int r13 = r11.height
            if (r13 != 0) goto L2ba
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L2ae
            goto L2bc
        L2ae:
            if (r14 <= 0) goto L2b1
            goto L2b2
        L2b1:
            r14 = 0
        L2b2:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r10, r14)
            goto L2cc
        L2ba:
            r13 = 1073741824(0x40000000, float:2.0)
        L2bc:
            int r17 = r9.getMeasuredHeight()
            int r14 = r17 + r14
            if (r14 >= 0) goto L2c5
            r14 = 0
        L2c5:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r10, r14)
        L2cc:
            int r10 = r9.getMeasuredState()
            r10 = r10 & (-256(0xffffffffffffff00, float:NaN))
            int r15 = android.view.View.combineMeasuredStates(r15, r10)
            r10 = r16
        L2d8:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L2f5
            int r3 = r11.width
            r16 = r10
            r10 = -1
            if (r3 != r10) goto L2f8
            r3 = 1
            goto L2f9
        L2f5:
            r16 = r10
            r10 = -1
        L2f8:
            r3 = 0
        L2f9:
            if (r3 == 0) goto L2fc
            goto L2fd
        L2fc:
            r13 = r14
        L2fd:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L309
            int r3 = r11.width
            if (r3 != r10) goto L309
            r3 = 1
            goto L30a
        L309:
            r3 = 0
        L30a:
            int r10 = r6.mTotalLength
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r10
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r9 = java.lang.Math.max(r10, r9)
            r6.mTotalLength = r9
            r24 = r3
            r10 = r16
        L323:
            int r4 = r4 + 1
            r3 = r29
            goto L263
        L329:
            int r3 = r6.mTotalLength
            int r4 = r37.getPaddingTop()
            int r9 = r37.getPaddingBottom()
            int r9 = r9 + r4
            int r9 = r9 + r3
            r6.mTotalLength = r9
            goto L252
        L339:
            if (r24 != 0) goto L340
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L340
            goto L342
        L340:
            r1 = r17
        L342:
            int r0 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r3 = r3 + r0
            int r3 = r3 + r1
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r5)
            if (r25 == 0) goto L855
            r6.forceUniformWidth(r2, r8)
            goto L855
        L362:
            r27 = 1
            r0 = 0
            r6.mTotalLength = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.mMaxAscent
            r12 = 4
            if (r0 == 0) goto L37c
            int[] r0 = r6.mMaxDescent
            if (r0 != 0) goto L384
        L37c:
            int[] r0 = new int[r12]
            r6.mMaxAscent = r0
            int[] r0 = new int[r12]
            r6.mMaxDescent = r0
        L384:
            int[] r13 = r6.mMaxAscent
            int[] r14 = r6.mMaxDescent
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r18 = 2
            r13[r18] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r18] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.mBaselineAligned
            boolean r4 = r6.mUseLargestChild
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L3a8
            r19 = 1
            goto L3aa
        L3a8:
            r19 = 0
        L3aa:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L3b7:
            if (r3 >= r9) goto L559
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L3cc
            int r7 = r6.mTotalLength
            r25 = 0
            int r7 = r7 + 0
            r6.mTotalLength = r7
            r25 = r0
            r26 = r2
            goto L3da
        L3cc:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L3e4
            int r3 = r3 + 0
        L3da:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L54f
        L3e4:
            boolean r0 = r6.hasDividerBeforeChildAt(r3)
            if (r0 == 0) goto L3f1
            int r0 = r6.mTotalLength
            int r2 = r6.mDividerWidth
            int r0 = r0 + r2
            r6.mTotalLength = r0
        L3f1:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L44f
            int r1 = r2.width
            if (r1 != 0) goto L44f
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L44f
            if (r19 == 0) goto L418
            int r0 = r6.mTotalLength
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.mTotalLength = r1
            goto L428
        L418:
            r30 = r3
            int r0 = r6.mTotalLength
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.mTotalLength = r0
        L428:
            if (r5 == 0) goto L43f
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L4c6
        L43f:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = 1
            goto L4ca
        L44f:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L45f
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L460
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L462
        L45f:
            r1 = 0
        L460:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L462:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L46b
            int r0 = r6.mTotalLength
            r31 = r0
            goto L46d
        L46b:
            r31 = 0
        L46d:
            r32 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r39
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L498
            r1 = r35
            r1.width = r0
            goto L49a
        L498:
            r1 = r35
        L49a:
            int r0 = r7.getMeasuredWidth()
            if (r19 == 0) goto L4ae
            int r2 = r6.mTotalLength
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.mTotalLength = r3
            goto L4c0
        L4ae:
            r4 = 0
            int r2 = r6.mTotalLength
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.mTotalLength = r2
        L4c0:
            if (r26 == 0) goto L4c6
            int r8 = java.lang.Math.max(r0, r8)
        L4c6:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L4ca:
            if (r11 == r0) goto L4d5
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L4d5
            r0 = 1
            r24 = 1
            goto L4d6
        L4d5:
            r0 = 0
        L4d6:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L518
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L518
            int r12 = r1.gravity
            if (r12 >= 0) goto L4f7
            int r12 = r6.mGravity
        L4f7:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & (-2)
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L51a
        L518:
            r22 = r2
        L51a:
            r2 = r34
            int r2 = java.lang.Math.max(r2, r3)
            if (r23 == 0) goto L529
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L529
            r7 = 1
            goto L52a
        L529:
            r7 = 0
        L52a:
            float r1 = r1.weight
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L53c
            if (r0 == 0) goto L535
            r3 = r22
        L535:
            int r15 = java.lang.Math.max(r15, r3)
            r0 = r33
            goto L546
        L53c:
            if (r0 == 0) goto L540
            r3 = r22
        L540:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r3)
        L546:
            int r3 = r25 + 0
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
        L54f:
            int r3 = r3 + 1
            r7 = r38
            r4 = r26
            r5 = r30
            goto L3b7
        L559:
            r26 = r4
            r30 = r5
            int r3 = r6.mTotalLength
            if (r3 <= 0) goto L56e
            boolean r3 = r6.hasDividerBeforeChildAt(r9)
            if (r3 == 0) goto L56e
            int r3 = r6.mTotalLength
            int r4 = r6.mDividerWidth
            int r3 = r3 + r4
            r6.mTotalLength = r3
        L56e:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L585
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L585
            r3 = r13[r18]
            if (r3 != r4) goto L585
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L582
            goto L586
        L582:
            r25 = r12
            goto L5b8
        L585:
            r3 = 3
        L586:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r18]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r18]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r2 = java.lang.Math.max(r2, r4)
        L5b8:
            if (r26 == 0) goto L60a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L5c0
            if (r10 != 0) goto L60a
        L5c0:
            r3 = 0
            r6.mTotalLength = r3
            r4 = 0
        L5c4:
            if (r4 >= r9) goto L60a
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L5d2
            int r5 = r6.mTotalLength
            int r5 = r5 + r3
            r6.mTotalLength = r5
            goto L606
        L5d2:
            int r3 = r5.getVisibility()
            r7 = 8
            if (r3 != r7) goto L5dd
            int r4 = r4 + 0
            goto L606
        L5dd:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            if (r19 == 0) goto L5f3
            int r5 = r6.mTotalLength
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r12 = 0
            int r7 = r7 + r12
            int r7 = r7 + r5
            r6.mTotalLength = r7
            goto L606
        L5f3:
            r12 = 0
            int r5 = r6.mTotalLength
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r5, r7)
            r6.mTotalLength = r3
        L606:
            int r4 = r4 + 1
            r3 = 0
            goto L5c4
        L60a:
            int r3 = r6.mTotalLength
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.mTotalLength = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r4 = r38
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r4, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r7 = r6.mTotalLength
            int r5 = r5 - r7
            if (r22 != 0) goto L67d
            if (r5 == 0) goto L638
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L638
            goto L67d
        L638:
            int r0 = java.lang.Math.max(r0, r15)
            if (r26 == 0) goto L675
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L675
            r1 = 0
        L643:
            if (r1 >= r9) goto L675
            android.view.View r5 = r6.getChildAt(r1)
            if (r5 == 0) goto L672
            int r10 = r5.getVisibility()
            r12 = 8
            if (r10 != r12) goto L654
            goto L672
        L654:
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r10 = r10.weight
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L672
            r10 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r13 = r5.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            r5.measure(r12, r13)
        L672:
            int r1 = r1 + 1
            goto L643
        L675:
            r8 = r39
            r22 = r9
            r12 = r25
            goto L825
        L67d:
            float r2 = r6.mWeightSum
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L685
            r1 = r2
        L685:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r18] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r18] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.mTotalLength = r12
            r8 = r5
            r12 = r25
            r2 = -1
            r5 = 0
        L69f:
            if (r5 >= r9) goto L7cf
            android.view.View r15 = r6.getChildAt(r5)
            if (r15 == 0) goto L7ba
            int r7 = r15.getVisibility()
            r4 = 8
            if (r7 != r4) goto L6b1
            goto L7ba
        L6b1:
            android.view.ViewGroup$LayoutParams r7 = r15.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            float r4 = r7.weight
            r17 = 0
            int r22 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r22 <= 0) goto L71d
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r4
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r4
            int r8 = r8 - r9
            int r4 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r4
            int r4 = r7.topMargin
            int r25 = r25 + r4
            int r4 = r7.bottomMargin
            int r4 = r25 + r4
            r25 = r1
            int r1 = r7.height
            r26 = r8
            r8 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r4, r1)
            int r4 = r7.width
            if (r4 != 0) goto L6fb
            r4 = 1073741824(0x40000000, float:2.0)
            if (r10 == r4) goto L6ef
            goto L6fd
        L6ef:
            if (r9 <= 0) goto L6f2
            goto L6f3
        L6f2:
            r9 = 0
        L6f3:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r15.measure(r9, r1)
            goto L70d
        L6fb:
            r4 = 1073741824(0x40000000, float:2.0)
        L6fd:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L706
            r9 = 0
        L706:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r15.measure(r9, r1)
        L70d:
            int r1 = r15.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r4 = r26
            goto L722
        L71d:
            r4 = r8
            r22 = r9
            r8 = r39
        L722:
            if (r19 == 0) goto L73e
            int r9 = r6.mTotalLength
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r7.leftMargin
            int r25 = r25 + r1
            int r1 = r7.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r9 = r25 + r9
            r6.mTotalLength = r9
            r29 = r4
            goto L75c
        L73e:
            r26 = r1
            r1 = 0
            int r9 = r6.mTotalLength
            int r25 = r15.getMeasuredWidth()
            int r25 = r25 + r9
            int r1 = r7.leftMargin
            int r25 = r25 + r1
            int r1 = r7.rightMargin
            int r25 = r25 + r1
            r29 = r4
            r1 = 0
            int r4 = r25 + 0
            int r1 = java.lang.Math.max(r9, r4)
            r6.mTotalLength = r1
        L75c:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L767
            int r1 = r7.height
            r4 = -1
            if (r1 != r4) goto L767
            r1 = 1
            goto L768
        L767:
            r1 = 0
        L768:
            int r4 = r7.topMargin
            int r9 = r7.bottomMargin
            int r4 = r4 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r4
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L779
            goto L77a
        L779:
            r4 = r9
        L77a:
            int r0 = java.lang.Math.max(r0, r4)
            if (r23 == 0) goto L787
            int r1 = r7.height
            r4 = -1
            if (r1 != r4) goto L788
            r1 = 1
            goto L789
        L787:
            r4 = -1
        L788:
            r1 = 0
        L789:
            if (r30 == 0) goto L7b3
            int r15 = r15.getBaseline()
            if (r15 == r4) goto L7b3
            int r4 = r7.gravity
            if (r4 >= 0) goto L797
            int r4 = r6.mGravity
        L797:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r7 = 4
            int r4 = r4 >> r7
            r21 = -2
            r4 = r4 & (-2)
            int r4 = r4 >> 1
            r7 = r13[r4]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r4] = r7
            r7 = r14[r4]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r4] = r7
            goto L7b5
        L7b3:
            r21 = -2
        L7b5:
            r23 = r1
            r1 = r26
            goto L7c5
        L7ba:
            r4 = r8
            r22 = r9
            r17 = 0
            r21 = -2
            r8 = r39
            r29 = r4
        L7c5:
            int r5 = r5 + 1
            r4 = r38
            r9 = r22
            r8 = r29
            goto L69f
        L7cf:
            r8 = r39
            r22 = r9
            int r1 = r6.mTotalLength
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.mTotalLength = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L7f5
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L7f5
            r1 = r13[r18]
            if (r1 != r4) goto L7f5
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L825
            goto L7f6
        L7f5:
            r1 = 3
        L7f6:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r18]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r5 = r14[r5]
            r7 = r14[r27]
            r9 = r14[r18]
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r2 = r1
        L825:
            if (r23 != 0) goto L82c
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L82c
            goto L82d
        L82c:
            r0 = r2
        L82d:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L855
            r0 = r38
            r1 = r22
            r6.forceUniformHeight(r1, r0)
        L855:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.mBaselineAligned = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.mBaselineAlignedChildIndex = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base aligned child index out of range (0, "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.getChildCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r3 != r0) goto L5
            return
        L5:
            r2.mDivider = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.mDividerWidth = r1
            int r1 = r3.getIntrinsicHeight()
            r2.mDividerHeight = r1
            goto L1b
        L17:
            r2.mDividerWidth = r0
            r2.mDividerHeight = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.mDividerPadding = r1
            return
    }

    public void setGravity(@androidx.annotation.GravityInt int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.mGravity = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.mGravity
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.mUseLargestChild = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 == r2) goto L9
            r1.mOrientation = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.mShowDividers
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mShowDividers = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.mWeightSum = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
