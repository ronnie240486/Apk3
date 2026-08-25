package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ScaleFrameLayout extends android.widget.FrameLayout {
    private static final int DEFAULT_CHILD_GRAVITY = 8388659;
    private float mChildScale;
    private float mLayoutScaleX;
    private float mLayoutScaleY;

    public ScaleFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ScaleFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ScaleFrameLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mLayoutScaleX = r1
            r0.mLayoutScaleY = r1
            r0.mChildScale = r1
            return
    }

    private static int getScaledMeasureSpec(int r1, float r2) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L19
        L7:
            int r0 = android.view.View.MeasureSpec.getSize(r1)
            float r0 = (float) r0
            float r0 = r0 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r2 = (int) r0
            int r1 = android.view.View.MeasureSpec.getMode(r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L19:
            return r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            float r2 = r0.mChildScale
            r1.setScaleX(r2)
            float r2 = r0.mChildScale
            r1.setScaleY(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3, boolean r4) {
            r0 = this;
            boolean r2 = super.addViewInLayout(r1, r2, r3, r4)
            if (r2 == 0) goto L10
            float r3 = r0.mChildScale
            r1.setScaleX(r3)
            float r3 = r0.mChildScale
            r1.setScaleY(r3)
        L10:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            int r1 = r16.getChildCount()
            int r2 = r16.getLayoutDirection()
            r3 = 1
            if (r2 != r3) goto L18
            int r4 = r16.getWidth()
            float r4 = (float) r4
            float r5 = r16.getPivotX()
            float r4 = r4 - r5
            goto L1c
        L18:
            float r4 = r16.getPivotX()
        L1c:
            float r5 = r0.mLayoutScaleX
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L40
            int r5 = r16.getPaddingLeft()
            float r8 = r0.mLayoutScaleX
            float r9 = r4 / r8
            float r9 = r4 - r9
            float r9 = r9 + r7
            int r9 = (int) r9
            int r5 = r5 + r9
            int r9 = r20 - r18
            float r9 = (float) r9
            float r9 = r9 - r4
            float r9 = r9 / r8
            float r9 = r9 + r4
            float r9 = r9 + r7
            int r8 = (int) r9
            int r9 = r16.getPaddingRight()
            goto L4a
        L40:
            int r5 = r16.getPaddingLeft()
            int r8 = r20 - r18
            int r9 = r16.getPaddingRight()
        L4a:
            int r8 = r8 - r9
            float r9 = r16.getPivotY()
            float r10 = r0.mLayoutScaleY
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 == 0) goto L6f
            int r6 = r16.getPaddingTop()
            float r10 = r0.mLayoutScaleY
            float r11 = r9 / r10
            float r11 = r9 - r11
            float r11 = r11 + r7
            int r11 = (int) r11
            int r6 = r6 + r11
            int r11 = r21 - r19
            float r11 = (float) r11
            float r11 = r11 - r9
            float r11 = r11 / r10
            float r11 = r11 + r9
            float r11 = r11 + r7
            int r7 = (int) r11
            int r10 = r16.getPaddingBottom()
            goto L79
        L6f:
            int r6 = r16.getPaddingTop()
            int r7 = r21 - r19
            int r10 = r16.getPaddingBottom()
        L79:
            int r7 = r7 - r10
            r10 = 0
        L7b:
            if (r10 >= r1) goto Lfe
            android.view.View r11 = r0.getChildAt(r10)
            int r12 = r11.getVisibility()
            r13 = 8
            if (r12 == r13) goto Lf7
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            int r13 = r11.getMeasuredWidth()
            int r14 = r11.getMeasuredHeight()
            int r15 = r12.gravity
            r3 = -1
            if (r15 != r3) goto L9f
            r15 = 8388659(0x800033, float:1.1755015E-38)
        L9f:
            int r3 = android.view.Gravity.getAbsoluteGravity(r15, r2)
            r15 = r15 & 112(0x70, float:1.57E-43)
            r3 = r3 & 7
            r0 = 1
            if (r3 == r0) goto Lb6
            r0 = 5
            if (r3 == r0) goto Lb1
            int r0 = r12.leftMargin
            int r0 = r0 + r5
            goto Lc2
        Lb1:
            int r0 = r8 - r13
            int r3 = r12.rightMargin
            goto Lc1
        Lb6:
            int r0 = r8 - r5
            int r0 = r0 - r13
            int r0 = r0 / 2
            int r0 = r0 + r5
            int r3 = r12.leftMargin
            int r0 = r0 + r3
            int r3 = r12.rightMargin
        Lc1:
            int r0 = r0 - r3
        Lc2:
            r3 = 16
            if (r15 == r3) goto Lda
            r3 = 48
            if (r15 == r3) goto Ld6
            r3 = 80
            if (r15 == r3) goto Ld1
            int r3 = r12.topMargin
            goto Ld8
        Ld1:
            int r3 = r7 - r14
            int r12 = r12.bottomMargin
            goto Le5
        Ld6:
            int r3 = r12.topMargin
        Ld8:
            int r3 = r3 + r6
            goto Le6
        Lda:
            int r3 = r7 - r6
            int r3 = r3 - r14
            int r3 = r3 / 2
            int r3 = r3 + r6
            int r15 = r12.topMargin
            int r3 = r3 + r15
            int r12 = r12.bottomMargin
        Le5:
            int r3 = r3 - r12
        Le6:
            int r13 = r13 + r0
            int r14 = r14 + r3
            r11.layout(r0, r3, r13, r14)
            float r0 = (float) r0
            float r0 = r4 - r0
            r11.setPivotX(r0)
            float r0 = (float) r3
            float r0 = r9 - r0
            r11.setPivotY(r0)
        Lf7:
            int r10 = r10 + 1
            r0 = r16
            r3 = 1
            goto L7b
        Lfe:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            float r0 = r3.mLayoutScaleX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L13
            float r2 = r3.mLayoutScaleY
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto Lf
            goto L13
        Lf:
            super.onMeasure(r4, r5)
            goto L3b
        L13:
            int r4 = getScaledMeasureSpec(r4, r0)
            float r0 = r3.mLayoutScaleY
            int r5 = getScaledMeasureSpec(r5, r0)
            super.onMeasure(r4, r5)
            int r4 = r3.getMeasuredWidth()
            float r4 = (float) r4
            float r5 = r3.mLayoutScaleX
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            int r0 = r3.getMeasuredHeight()
            float r0 = (float) r0
            float r1 = r3.mLayoutScaleY
            float r0 = r0 * r1
            float r0 = r0 + r5
            int r5 = (int) r0
            r3.setMeasuredDimension(r4, r5)
        L3b:
            return
    }

    public void setChildScale(float r3) {
            r2 = this;
            float r0 = r2.mChildScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L20
            r2.mChildScale = r3
            r0 = 0
        L9:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L20
            android.view.View r1 = r2.getChildAt(r0)
            r1.setScaleX(r3)
            android.view.View r1 = r2.getChildAt(r0)
            r1.setScaleY(r3)
            int r0 = r0 + 1
            goto L9
        L20:
            return
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void setLayoutScaleX(float r2) {
            r1 = this;
            float r0 = r1.mLayoutScaleX
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mLayoutScaleX = r2
            r1.requestLayout()
        Lb:
            return
    }

    public void setLayoutScaleY(float r2) {
            r1 = this;
            float r0 = r1.mLayoutScaleY
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mLayoutScaleY = r2
            r1.requestLayout()
        Lb:
            return
    }
}
