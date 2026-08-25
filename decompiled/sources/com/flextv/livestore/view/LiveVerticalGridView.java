package com.flextv.livestore.view;

/* JADX INFO: loaded from: classes.dex */
public class LiveVerticalGridView extends androidx.leanback.widget.VerticalGridView {
    private int K;
    private boolean L;

    public LiveVerticalGridView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.K = r1
            r1 = 1
            r0.L = r1
            return
    }

    public LiveVerticalGridView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.K = r1
            r1 = 1
            r0.L = r1
            return
    }

    public LiveVerticalGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.K = r1
            r1 = 1
            r0.L = r1
            return
    }

    @Override // androidx.leanback.widget.BaseGridView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            int r0 = r6.getSelectedPosition()
            int r1 = r7.getAction()
            if (r1 != 0) goto L51
            int r1 = r7.getKeyCode()
            r2 = 19
            r3 = 0
            r4 = -1
            r5 = 1
            if (r1 == r2) goto L35
            r2 = 20
            if (r1 == r2) goto L1a
            goto L51
        L1a:
            if (r0 == r4) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r6.getAdapter()
            if (r1 == 0) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r6.getAdapter()
            int r1 = r1.getItemCount()
            int r1 = r1 - r5
            if (r0 != r1) goto L51
            boolean r0 = r6.L
            if (r0 == 0) goto L51
            r6.setSelectedPosition(r3)
            return r5
        L35:
            if (r0 == r4) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r6.getAdapter()
            if (r1 == 0) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.getAdapter()
            int r7 = r7.getItemCount()
            if (r0 != 0) goto L50
            boolean r0 = r6.L
            if (r0 == 0) goto L50
            int r7 = r7 - r5
            r6.setSelectedPosition(r7)
            return r5
        L50:
            return r3
        L51:
            boolean r7 = super.dispatchKeyEvent(r7)
            return r7
    }

    public int getPage() {
            r1 = this;
            int r0 = r1.K
            return r0
    }

    public void setLoop(boolean r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void setPage(int r1) {
            r0 = this;
            r0.K = r1
            return
    }
}
