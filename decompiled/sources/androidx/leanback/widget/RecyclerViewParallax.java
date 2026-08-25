package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerViewParallax extends androidx.leanback.widget.Parallax<androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty> {
    public boolean mIsVertical;
    public android.view.View.OnLayoutChangeListener mOnLayoutChangeListener;
    public androidx.recyclerview.widget.RecyclerView.OnScrollListener mOnScrollListener;
    public androidx.recyclerview.widget.RecyclerView mRecylerView;



    public static final class ChildPositionProperty extends androidx.leanback.widget.Parallax.IntProperty {
        public int mAdapterPosition;
        public float mFraction;
        public int mOffset;
        public int mViewId;

        public ChildPositionProperty(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty adapterPosition(int r1) {
                r0 = this;
                r0.mAdapterPosition = r1
                return r0
        }

        public androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty fraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return r0
        }

        public int getAdapterPosition() {
                r1 = this;
                int r0 = r1.mAdapterPosition
                return r0
        }

        public float getFraction() {
                r1 = this;
                float r0 = r1.mFraction
                return r0
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.mOffset
                return r0
        }

        public int getViewId() {
                r1 = this;
                int r0 = r1.mViewId
                return r0
        }

        public androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty offset(int r1) {
                r0 = this;
                r0.mOffset = r1
                return r0
        }

        public androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty viewId(int r1) {
                r0 = this;
                r0.mViewId = r1
                return r0
        }
    }

    public RecyclerViewParallax() {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.RecyclerViewParallax$1 r0 = new androidx.leanback.widget.RecyclerViewParallax$1
            r0.<init>(r1)
            r1.mOnScrollListener = r0
            androidx.leanback.widget.RecyclerViewParallax$2 r0 = new androidx.leanback.widget.RecyclerViewParallax$2
            r0.<init>(r1)
            r1.mOnLayoutChangeListener = r0
            return
    }

    @Override // androidx.leanback.widget.Parallax
    public /* bridge */ /* synthetic */ android.util.Property createProperty(java.lang.String r1, int r2) {
            r0 = this;
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r1 = r0.createProperty(r1, r2)
            return r1
    }

    @Override // androidx.leanback.widget.Parallax
    public androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty createProperty(java.lang.String r2, int r3) {
            r1 = this;
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = new androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.leanback.widget.Parallax
    public float getMaxValue() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecylerView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r1 = r2.mIsVertical
            if (r1 == 0) goto Lf
            int r0 = r0.getHeight()
            goto L13
        Lf:
            int r0 = r0.getWidth()
        L13:
            float r0 = (float) r0
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecylerView
            return r0
    }

    public void setRecyclerView(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecylerView
            if (r0 != r3) goto L5
            return
        L5:
            if (r0 == 0) goto L13
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r2.mOnScrollListener
            r0.removeOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecylerView
            android.view.View$OnLayoutChangeListener r1 = r2.mOnLayoutChangeListener
            r0.removeOnLayoutChangeListener(r1)
        L13:
            r2.mRecylerView = r3
            if (r3 == 0) goto L3c
            r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecylerView
            android.content.Context r3 = r3.getContext()
            r0 = 0
            r1 = 0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r3, r0, r1, r1)
            int r3 = r3.orientation
            r0 = 1
            if (r3 != r0) goto L2c
            r1 = 1
        L2c:
            r2.mIsVertical = r1
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecylerView
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r2.mOnScrollListener
            r3.addOnScrollListener(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecylerView
            android.view.View$OnLayoutChangeListener r0 = r2.mOnLayoutChangeListener
            r3.addOnLayoutChangeListener(r0)
        L3c:
            return
    }

    @Override // androidx.leanback.widget.Parallax
    public void updateValues() {
            r8 = this;
            java.util.List r0 = r8.getProperties()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le1
            java.lang.Object r1 = r0.next()
            android.util.Property r1 = (android.util.Property) r1
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r1 = (androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty) r1
            java.util.Objects.requireNonNull(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r8.mRecylerView
            if (r2 != 0) goto L1f
            r3 = 0
            goto L25
        L1f:
            int r3 = r1.mAdapterPosition
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.findViewHolderForAdapterPosition(r3)
        L25:
            r4 = 0
            if (r3 != 0) goto L66
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L5e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r2.getLayoutManager()
            int r5 = r5.getChildCount()
            if (r5 != 0) goto L38
            goto L5e
        L38:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r2.getLayoutManager()
            android.view.View r4 = r5.getChildAt(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r2.findContainingViewHolder(r4)
            int r2 = r2.getAdapterPosition()
            int r4 = r1.mAdapterPosition
            if (r2 >= r4) goto L54
            int r1 = r1.getIndex()
            r8.setIntPropertyValue(r1, r3)
            goto L8
        L54:
            int r1 = r1.getIndex()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.setIntPropertyValue(r1, r2)
            goto L8
        L5e:
            int r1 = r1.getIndex()
            r8.setIntPropertyValue(r1, r3)
            goto L8
        L66:
            android.view.View r3 = r3.itemView
            int r5 = r1.mViewId
            android.view.View r3 = r3.findViewById(r5)
            if (r3 != 0) goto L71
            goto L8
        L71:
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            r5.<init>(r4, r4, r6, r7)
            r2.offsetDescendantRectToMyCoords(r3, r5)
            r4 = 0
            r6 = 0
        L83:
            if (r3 == r2) goto La6
            if (r3 == 0) goto La6
            android.view.ViewParent r7 = r3.getParent()
            if (r7 != r2) goto L93
            boolean r7 = r2.isAnimating()
            if (r7 != 0) goto L9f
        L93:
            float r7 = r3.getTranslationX()
            float r7 = r7 + r4
            float r4 = r3.getTranslationY()
            float r4 = r4 + r6
            r6 = r4
            r4 = r7
        L9f:
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L83
        La6:
            int r2 = (int) r4
            int r3 = (int) r6
            r5.offset(r2, r3)
            boolean r2 = r8.mIsVertical
            if (r2 == 0) goto Lc8
            int r2 = r1.getIndex()
            int r3 = r5.top
            int r4 = r1.mOffset
            int r3 = r3 + r4
            float r1 = r1.mFraction
            int r4 = r5.height()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r1 = (int) r1
            int r3 = r3 + r1
            r8.setIntPropertyValue(r2, r3)
            goto L8
        Lc8:
            int r2 = r1.getIndex()
            int r3 = r5.left
            int r4 = r1.mOffset
            int r3 = r3 + r4
            float r1 = r1.mFraction
            int r4 = r5.width()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r1 = (int) r1
            int r3 = r3 + r1
            r8.setIntPropertyValue(r2, r3)
            goto L8
        Le1:
            super.updateValues()
            return
    }
}
