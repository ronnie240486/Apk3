package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
final class RowContainerView extends android.widget.LinearLayout {
    private android.graphics.drawable.Drawable mForeground;
    private boolean mForegroundBoundsChanged;
    private android.view.ViewGroup mHeaderDock;

    public RowContainerView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public RowContainerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RowContainerView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 1
            r0.mForegroundBoundsChanged = r2
            r0.setOrientation(r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = androidx.leanback.R.layout.lb_row_container
            r1.inflate(r2, r0)
            int r1 = androidx.leanback.R.id.lb_row_container_header_dock
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.mHeaderDock = r1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            return
    }

    public void addHeaderView(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.mHeaderDock
            int r0 = r0.indexOfChild(r3)
            if (r0 >= 0) goto Le
            android.view.ViewGroup r0 = r2.mHeaderDock
            r1 = 0
            r0.addView(r3, r1)
        Le:
            return
    }

    public void addRowView(android.view.View r1) {
            r0 = this;
            r0.addView(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            super.draw(r5)
            android.graphics.drawable.Drawable r0 = r4.mForeground
            if (r0 == 0) goto L1e
            boolean r1 = r4.mForegroundBoundsChanged
            if (r1 == 0) goto L19
            r1 = 0
            r4.mForegroundBoundsChanged = r1
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r0.setBounds(r1, r1, r2, r3)
        L19:
            android.graphics.drawable.Drawable r0 = r4.mForeground
            r0.draw(r5)
        L1e:
            return
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mForeground
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r1 = 1
            r0.mForegroundBoundsChanged = r1
            return
    }

    public void removeHeaderView(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.mHeaderDock
            int r0 = r0.indexOfChild(r2)
            if (r0 < 0) goto Ld
            android.view.ViewGroup r0 = r1.mHeaderDock
            r0.removeView(r2)
        Ld:
            return
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mForeground = r1
            if (r1 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.setWillNotDraw(r1)
            r0.invalidate()
            return
    }

    public void setForegroundColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mForeground
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r0.setColor(r3)
            r2.invalidate()
            goto L1b
        L13:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r3)
            r2.setForeground(r0)
        L1b:
            return
    }

    public void showHeader(boolean r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.mHeaderDock
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return
    }
}
