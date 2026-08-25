package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class CheckableImageView extends android.widget.ImageView implements android.widget.Checkable {
    private static final int[] CHECKED_STATE_SET = null;
    private boolean mChecked;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            androidx.leanback.widget.CheckableImageView.CHECKED_STATE_SET = r0
            return
    }

    public CheckableImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CheckableImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CheckableImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.mChecked
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.leanback.widget.CheckableImageView.CHECKED_STATE_SET
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            return r2
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.mChecked
            if (r0 == r2) goto L9
            r1.mChecked = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.mChecked
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
