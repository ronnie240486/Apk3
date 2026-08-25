package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class BrowseRowsFrameLayout extends android.widget.FrameLayout {
    public BrowseRowsFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BrowseRowsFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BrowseRowsFrameLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r2 = r2 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r2, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r1 = r1 + r6
            int r1 = r1 + r8
            int r6 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r6)
            r4.measure(r5, r6)
            return
    }
}
