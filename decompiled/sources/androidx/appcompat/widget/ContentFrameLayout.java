package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends android.widget.FrameLayout {
    private androidx.appcompat.widget.ContentFrameLayout.OnAttachListener mAttachListener;
    private final android.graphics.Rect mDecorPadding;
    private android.util.TypedValue mFixedHeightMajor;
    private android.util.TypedValue mFixedHeightMinor;
    private android.util.TypedValue mFixedWidthMajor;
    private android.util.TypedValue mFixedWidthMinor;
    private android.util.TypedValue mMinWidthMajor;
    private android.util.TypedValue mMinWidthMinor;

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentFrameLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ContentFrameLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mDecorPadding = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void dispatchFitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            r0.fitSystemWindows(r1)
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedHeightMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedHeightMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedHeightMajor
            return r0
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedHeightMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedHeightMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedHeightMinor
            return r0
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedWidthMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedWidthMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedWidthMajor
            return r0
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedWidthMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedWidthMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedWidthMinor
            return r0
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mMinWidthMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mMinWidthMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mMinWidthMajor
            return r0
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mMinWidthMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mMinWidthMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mMinWidthMinor
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            if (r0 == 0) goto La
            r0.onAttachedFromWindow()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            if (r0 == 0) goto La
            r0.onDetachedFromWindow()
        La:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r14, int r15) {
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L60
            if (r1 == 0) goto L2c
            android.util.TypedValue r10 = r13.mFixedWidthMinor
            goto L2e
        L2c:
            android.util.TypedValue r10 = r13.mFixedWidthMajor
        L2e:
            if (r10 == 0) goto L60
            int r11 = r10.type
            if (r11 == 0) goto L60
            if (r11 != r7) goto L3c
            float r10 = r10.getDimension(r0)
        L3a:
            int r10 = (int) r10
            goto L48
        L3c:
            if (r11 != r6) goto L47
            int r11 = r0.widthPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r10 = r10.getFraction(r12, r11)
            goto L3a
        L47:
            r10 = 0
        L48:
            if (r10 <= 0) goto L60
            android.graphics.Rect r11 = r13.mDecorPadding
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r10 = r10 - r12
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r5 != r8) goto L9a
            if (r1 == 0) goto L68
            android.util.TypedValue r5 = r13.mFixedHeightMajor
            goto L6a
        L68:
            android.util.TypedValue r5 = r13.mFixedHeightMinor
        L6a:
            if (r5 == 0) goto L9a
            int r11 = r5.type
            if (r11 == 0) goto L9a
            if (r11 != r7) goto L78
            float r5 = r5.getDimension(r0)
        L76:
            int r5 = (int) r5
            goto L84
        L78:
            if (r11 != r6) goto L83
            int r11 = r0.heightPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r5 = r5.getFraction(r12, r11)
            goto L76
        L83:
            r5 = 0
        L84:
            if (r5 <= 0) goto L9a
            android.graphics.Rect r11 = r13.mDecorPadding
            int r12 = r11.top
            int r11 = r11.bottom
            int r12 = r12 + r11
            int r5 = r5 - r12
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L9a:
            super.onMeasure(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            if (r10 != 0) goto Ldb
            if (r2 != r8) goto Ldb
            if (r1 == 0) goto Lae
            android.util.TypedValue r1 = r13.mMinWidthMinor
            goto Lb0
        Lae:
            android.util.TypedValue r1 = r13.mMinWidthMajor
        Lb0:
            if (r1 == 0) goto Ldb
            int r2 = r1.type
            if (r2 == 0) goto Ldb
            if (r2 != r7) goto Lbe
            float r0 = r1.getDimension(r0)
        Lbc:
            int r0 = (int) r0
            goto Lca
        Lbe:
            if (r2 != r6) goto Lc9
            int r0 = r0.widthPixels
            float r2 = (float) r0
            float r0 = (float) r0
            float r0 = r1.getFraction(r2, r0)
            goto Lbc
        Lc9:
            r0 = 0
        Lca:
            if (r0 <= 0) goto Ld4
            android.graphics.Rect r1 = r13.mDecorPadding
            int r2 = r1.left
            int r1 = r1.right
            int r2 = r2 + r1
            int r0 = r0 - r2
        Ld4:
            if (r14 >= r0) goto Ldb
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto Ldc
        Ldb:
            r3 = 0
        Ldc:
            if (r3 == 0) goto Le1
            super.onMeasure(r5, r15)
        Le1:
            return
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.OnAttachListener r1) {
            r0 = this;
            r0.mAttachListener = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setDecorPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mDecorPadding
            r0.set(r2, r3, r4, r5)
            boolean r2 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r2 == 0) goto Le
            r1.requestLayout()
        Le:
            return
    }
}
