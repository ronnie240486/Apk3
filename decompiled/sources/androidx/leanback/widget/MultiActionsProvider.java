package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public interface MultiActionsProvider {

    /* JADX INFO: loaded from: classes2.dex */
    public static class MultiAction {
        private android.graphics.drawable.Drawable[] mDrawables;
        private long mId;
        private int mIndex;

        public MultiAction(long r1) {
                r0 = this;
                r0.<init>()
                r0.mId = r1
                r1 = 0
                r0.mIndex = r1
                return
        }

        public android.graphics.drawable.Drawable getCurrentDrawable() {
                r2 = this;
                android.graphics.drawable.Drawable[] r0 = r2.mDrawables
                int r1 = r2.mIndex
                r0 = r0[r1]
                return r0
        }

        public android.graphics.drawable.Drawable[] getDrawables() {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.mDrawables
                return r0
        }

        public long getId() {
                r2 = this;
                long r0 = r2.mId
                return r0
        }

        public int getIndex() {
                r1 = this;
                int r0 = r1.mIndex
                return r0
        }

        public void incrementIndex() {
                r2 = this;
                int r0 = r2.mIndex
                android.graphics.drawable.Drawable[] r1 = r2.mDrawables
                int r1 = r1.length
                int r1 = r1 + (-1)
                if (r0 >= r1) goto Lc
                int r0 = r0 + 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                r2.setIndex(r0)
                return
        }

        public void setDrawables(android.graphics.drawable.Drawable[] r3) {
                r2 = this;
                r2.mDrawables = r3
                int r0 = r2.mIndex
                int r1 = r3.length
                int r1 = r1 + (-1)
                if (r0 <= r1) goto Le
                int r3 = r3.length
                int r3 = r3 + (-1)
                r2.mIndex = r3
            Le:
                return
        }

        public void setIndex(int r1) {
                r0 = this;
                r0.mIndex = r1
                return
        }
    }

    androidx.leanback.widget.MultiActionsProvider.MultiAction[] getActions();
}
