package androidx.leanback.widget.picker;

/* JADX INFO: loaded from: classes2.dex */
public class Picker extends android.widget.FrameLayout {
    private android.view.animation.Interpolator mAccelerateInterpolator;
    private int mAlphaAnimDuration;
    private final androidx.leanback.widget.OnChildViewHolderSelectedListener mColumnChangeListener;
    public final java.util.List<androidx.leanback.widget.VerticalGridView> mColumnViews;
    public java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> mColumns;
    private android.view.animation.Interpolator mDecelerateInterpolator;
    private float mFocusedAlpha;
    private float mInvisibleColumnAlpha;
    private java.util.ArrayList<androidx.leanback.widget.picker.Picker.PickerValueListener> mListeners;
    private int mPickerItemLayoutId;
    private int mPickerItemTextViewId;
    private android.view.ViewGroup mPickerView;
    private android.view.ViewGroup mRootView;
    private int mSelectedColumn;
    private java.util.List<java.lang.CharSequence> mSeparators;
    private float mUnfocusedAlpha;
    private float mVisibleColumnAlpha;
    private float mVisibleItems;
    private float mVisibleItemsActivated;


    public class PickerScrollArrayAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.leanback.widget.picker.Picker.ViewHolder> {
        private final int mColIndex;
        private androidx.leanback.widget.picker.PickerColumn mData;
        private final int mResource;
        private final int mTextViewResourceId;
        public final /* synthetic */ androidx.leanback.widget.picker.Picker this$0;

        public PickerScrollArrayAdapter(androidx.leanback.widget.picker.Picker r1, int r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mResource = r2
                r0.mColIndex = r4
                r0.mTextViewResourceId = r3
                java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r1 = r1.mColumns
                java.lang.Object r1 = r1.get(r4)
                androidx.leanback.widget.picker.PickerColumn r1 = (androidx.leanback.widget.picker.PickerColumn) r1
                r0.mData = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                androidx.leanback.widget.picker.PickerColumn r0 = r1.mData
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.getCount()
            La:
                return r0
        }

        public void onBindViewHolder(androidx.leanback.widget.picker.Picker.ViewHolder r4, int r5) {
                r3 = this;
                android.widget.TextView r0 = r4.textView
                if (r0 == 0) goto L14
                androidx.leanback.widget.picker.PickerColumn r1 = r3.mData
                if (r1 == 0) goto L14
                int r2 = r1.getMinValue()
                int r2 = r2 + r5
                java.lang.CharSequence r1 = r1.getLabelFor(r2)
                r0.setText(r1)
            L14:
                androidx.leanback.widget.picker.Picker r0 = r3.this$0
                android.view.View r4 = r4.itemView
                java.util.List<androidx.leanback.widget.VerticalGridView> r1 = r0.mColumnViews
                int r2 = r3.mColIndex
                java.lang.Object r1 = r1.get(r2)
                androidx.leanback.widget.VerticalGridView r1 = (androidx.leanback.widget.VerticalGridView) r1
                int r1 = r1.getSelectedPosition()
                r2 = 0
                if (r1 != r5) goto L2b
                r5 = 1
                goto L2c
            L2b:
                r5 = 0
            L2c:
                int r1 = r3.mColIndex
                r0.setOrAnimateAlpha(r4, r5, r1, r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                androidx.leanback.widget.picker.Picker$ViewHolder r1 = (androidx.leanback.widget.picker.Picker.ViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public androidx.leanback.widget.picker.Picker.ViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                android.content.Context r4 = r3.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = r2.mResource
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                int r4 = r2.mTextViewResourceId
                if (r4 == 0) goto L1a
                android.view.View r4 = r3.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                goto L1d
            L1a:
                r4 = r3
                android.widget.TextView r4 = (android.widget.TextView) r4
            L1d:
                androidx.leanback.widget.picker.Picker$ViewHolder r0 = new androidx.leanback.widget.picker.Picker$ViewHolder
                r0.<init>(r3, r4)
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                androidx.leanback.widget.picker.Picker$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        public void onViewAttachedToWindow(androidx.leanback.widget.picker.Picker.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                androidx.leanback.widget.picker.Picker r0 = r1.this$0
                boolean r0 = r0.isActivated()
                r2.setFocusable(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                androidx.leanback.widget.picker.Picker$ViewHolder r1 = (androidx.leanback.widget.picker.Picker.ViewHolder) r1
                r0.onViewAttachedToWindow(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface PickerValueListener {
        void onValueChanged(androidx.leanback.widget.picker.Picker r1, int r2);
    }

    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final android.widget.TextView textView;

        public ViewHolder(android.view.View r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>(r1)
                r0.textView = r2
                return
        }
    }

    public Picker(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mColumnViews = r1
            r1 = 1077936128(0x40400000, float:3.0)
            r0.mVisibleItemsActivated = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mVisibleItems = r1
            r2 = 0
            r0.mSelectedColumn = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mSeparators = r3
            int r3 = androidx.leanback.R.layout.lb_picker_item
            r0.mPickerItemLayoutId = r3
            r0.mPickerItemTextViewId = r2
            androidx.leanback.widget.picker.Picker$1 r2 = new androidx.leanback.widget.picker.Picker$1
            r2.<init>(r0)
            r0.mColumnChangeListener = r2
            r2 = 1
            r0.setEnabled(r2)
            r3 = 262144(0x40000, float:3.67342E-40)
            r0.setDescendantFocusability(r3)
            r0.mFocusedAlpha = r1
            r0.mUnfocusedAlpha = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mVisibleColumnAlpha = r1
            r1 = 0
            r0.mInvisibleColumnAlpha = r1
            r1 = 200(0xc8, float:2.8E-43)
            r0.mAlphaAnimDuration = r1
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r3 = 1075838976(0x40200000, float:2.5)
            r1.<init>(r3)
            r0.mDecelerateInterpolator = r1
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>(r3)
            r0.mAccelerateInterpolator = r1
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r3 = androidx.leanback.R.layout.lb_picker
            android.view.View r1 = r1.inflate(r3, r0, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.mRootView = r1
            int r2 = androidx.leanback.R.id.picker
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.mPickerView = r1
            return
    }

    private float getFloat(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 1
            r1.getValue(r4, r0, r2)
            float r4 = r0.getFloat()
            return r4
    }

    private void notifyValueChanged(int r3) {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.Picker$PickerValueListener> r0 = r2.mListeners
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<androidx.leanback.widget.picker.Picker$PickerValueListener> r1 = r2.mListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.picker.Picker$PickerValueListener r1 = (androidx.leanback.widget.picker.Picker.PickerValueListener) r1
            r1.onValueChanged(r2, r3)
            int r0 = r0 + (-1)
            goto La
        L1a:
            return
    }

    private void setOrAnimateAlpha(android.view.View r2, boolean r3, float r4, float r5, android.view.animation.Interpolator r6) {
            r1 = this;
            android.view.ViewPropertyAnimator r0 = r2.animate()
            r0.cancel()
            if (r3 != 0) goto Ld
            r2.setAlpha(r4)
            goto L2b
        Ld:
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L15
            r2.setAlpha(r5)
        L15:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            android.view.ViewPropertyAnimator r2 = r2.alpha(r4)
            int r3 = r1.mAlphaAnimDuration
            long r3 = (long) r3
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r6)
            r2.start()
        L2b:
            return
    }

    private void updateColumnSize() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.getColumnsCount()
            if (r0 >= r1) goto L15
            java.util.List<androidx.leanback.widget.VerticalGridView> r1 = r2.mColumnViews
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.VerticalGridView r1 = (androidx.leanback.widget.VerticalGridView) r1
            r2.updateColumnSize(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    private void updateColumnSize(androidx.leanback.widget.VerticalGridView r6) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            boolean r1 = r5.isActivated()
            if (r1 == 0) goto Lf
            float r1 = r5.getActivatedVisibleItemCount()
            goto L13
        Lf:
            float r1 = r5.getVisibleItemCount()
        L13:
            int r2 = r5.getPickerItemHeightPixels()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r3 = r6.getVerticalSpacing()
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r3, r2)
            int r1 = (int) r1
            r0.height = r1
            r6.setLayoutParams(r0)
            return
    }

    private void updateItemFocusable() {
            r6 = this;
            boolean r0 = r6.isActivated()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r6.getColumnsCount()
            if (r2 >= r3) goto L28
            java.util.List<androidx.leanback.widget.VerticalGridView> r3 = r6.mColumnViews
            java.lang.Object r3 = r3.get(r2)
            androidx.leanback.widget.VerticalGridView r3 = (androidx.leanback.widget.VerticalGridView) r3
            r4 = 0
        L15:
            int r5 = r3.getChildCount()
            if (r4 >= r5) goto L25
            android.view.View r5 = r3.getChildAt(r4)
            r5.setFocusable(r0)
            int r4 = r4 + 1
            goto L15
        L25:
            int r2 = r2 + 1
            goto L6
        L28:
            return
    }

    public void addOnValueChangedListener(androidx.leanback.widget.picker.Picker.PickerValueListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.Picker$PickerValueListener> r0 = r1.mListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Lb:
            java.util.ArrayList<androidx.leanback.widget.picker.Picker$PickerValueListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.isActivated()
            if (r0 == 0) goto L22
            int r0 = r3.getKeyCode()
            r1 = 23
            if (r0 == r1) goto L17
            r1 = 66
            if (r0 == r1) goto L17
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
        L17:
            int r3 = r3.getAction()
            r0 = 1
            if (r3 != r0) goto L21
            r2.performClick()
        L21:
            return r0
        L22:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    public float getActivatedVisibleItemCount() {
            r1 = this;
            float r0 = r1.mVisibleItemsActivated
            return r0
    }

    public androidx.leanback.widget.picker.PickerColumn getColumnAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r0 = r1.mColumns
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.widget.picker.PickerColumn r2 = (androidx.leanback.widget.picker.PickerColumn) r2
            return r2
    }

    public int getColumnsCount() {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r0 = r1.mColumns
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public int getPickerItemHeightPixels() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.leanback.R.dimen.picker_item_height
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    public final int getPickerItemLayoutId() {
            r1 = this;
            int r0 = r1.mPickerItemLayoutId
            return r0
    }

    public final int getPickerItemTextViewId() {
            r1 = this;
            int r0 = r1.mPickerItemTextViewId
            return r0
    }

    public int getSelectedColumn() {
            r1 = this;
            int r0 = r1.mSelectedColumn
            return r0
    }

    public final java.lang.CharSequence getSeparator() {
            r2 = this;
            java.util.List<java.lang.CharSequence> r0 = r2.mSeparators
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    public final java.util.List<java.lang.CharSequence> getSeparators() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.mSeparators
            return r0
    }

    public float getVisibleItemCount() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public void onColumnValueChanged(int r3, int r4) {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r0 = r2.mColumns
            java.lang.Object r0 = r0.get(r3)
            androidx.leanback.widget.picker.PickerColumn r0 = (androidx.leanback.widget.picker.PickerColumn) r0
            int r1 = r0.getCurrentValue()
            if (r1 == r4) goto L14
            r0.setCurrentValue(r4)
            r2.notifyValueChanged(r3)
        L14:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r3, android.graphics.Rect r4) {
            r2 = this;
            int r0 = r2.getSelectedColumn()
            java.util.List<androidx.leanback.widget.VerticalGridView> r1 = r2.mColumnViews
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.List<androidx.leanback.widget.VerticalGridView> r1 = r2.mColumnViews
            java.lang.Object r0 = r1.get(r0)
            androidx.leanback.widget.VerticalGridView r0 = (androidx.leanback.widget.VerticalGridView) r0
            boolean r3 = r0.requestFocus(r3, r4)
            return r3
        L19:
            r3 = 0
            return r3
    }

    public void removeOnValueChangedListener(androidx.leanback.widget.picker.Picker.PickerValueListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.Picker$PickerValueListener> r0 = r1.mListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r1, android.view.View r2) {
            r0 = this;
            super.requestChildFocus(r1, r2)
            r1 = 0
        L4:
            java.util.List<androidx.leanback.widget.VerticalGridView> r2 = r0.mColumnViews
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<androidx.leanback.widget.VerticalGridView> r2 = r0.mColumnViews
            java.lang.Object r2 = r2.get(r1)
            androidx.leanback.widget.VerticalGridView r2 = (androidx.leanback.widget.VerticalGridView) r2
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto L1d
            r0.setSelectedColumn(r1)
        L1d:
            int r1 = r1 + 1
            goto L4
        L20:
            return
    }

    @Override // android.view.View
    public void setActivated(boolean r5) {
            r4 = this;
            boolean r0 = r4.isActivated()
            if (r5 != r0) goto La
            super.setActivated(r5)
            return
        La:
            super.setActivated(r5)
            boolean r0 = r4.hasFocus()
            int r1 = r4.getSelectedColumn()
            r2 = 131072(0x20000, float:1.83671E-40)
            r4.setDescendantFocusability(r2)
            if (r5 != 0) goto L27
            if (r0 == 0) goto L27
            boolean r2 = r4.isFocusable()
            if (r2 == 0) goto L27
            r4.requestFocus()
        L27:
            r2 = 0
        L28:
            int r3 = r4.getColumnsCount()
            if (r2 >= r3) goto L3c
            java.util.List<androidx.leanback.widget.VerticalGridView> r3 = r4.mColumnViews
            java.lang.Object r3 = r3.get(r2)
            androidx.leanback.widget.VerticalGridView r3 = (androidx.leanback.widget.VerticalGridView) r3
            r3.setFocusable(r5)
            int r2 = r2 + 1
            goto L28
        L3c:
            r4.updateColumnSize()
            r4.updateItemFocusable()
            if (r5 == 0) goto L53
            if (r0 == 0) goto L53
            if (r1 < 0) goto L53
            java.util.List<androidx.leanback.widget.VerticalGridView> r5 = r4.mColumnViews
            java.lang.Object r5 = r5.get(r1)
            androidx.leanback.widget.VerticalGridView r5 = (androidx.leanback.widget.VerticalGridView) r5
            r5.requestFocus()
        L53:
            r5 = 262144(0x40000, float:3.67342E-40)
            r4.setDescendantFocusability(r5)
            return
    }

    public void setActivatedVisibleItemCount(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = r1.mVisibleItemsActivated
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r1.mVisibleItemsActivated = r2
            boolean r2 = r1.isActivated()
            if (r2 == 0) goto L16
            r1.updateColumnSize()
        L16:
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public void setColumnAt(int r2, androidx.leanback.widget.picker.PickerColumn r3) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r0 = r1.mColumns
            r0.set(r2, r3)
            java.util.List<androidx.leanback.widget.VerticalGridView> r0 = r1.mColumnViews
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.widget.VerticalGridView r2 = (androidx.leanback.widget.VerticalGridView) r2
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            androidx.leanback.widget.picker.Picker$PickerScrollArrayAdapter r0 = (androidx.leanback.widget.picker.Picker.PickerScrollArrayAdapter) r0
            if (r0 == 0) goto L18
            r0.notifyDataSetChanged()
        L18:
            int r0 = r3.getCurrentValue()
            int r3 = r3.getMinValue()
            int r0 = r0 - r3
            r2.setSelectedPosition(r0)
            return
    }

    public void setColumnValue(int r3, int r4, boolean r5) {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r0 = r2.mColumns
            java.lang.Object r0 = r0.get(r3)
            androidx.leanback.widget.picker.PickerColumn r0 = (androidx.leanback.widget.picker.PickerColumn) r0
            int r1 = r0.getCurrentValue()
            if (r1 == r4) goto L34
            r0.setCurrentValue(r4)
            r2.notifyValueChanged(r3)
            java.util.List<androidx.leanback.widget.VerticalGridView> r0 = r2.mColumnViews
            java.lang.Object r0 = r0.get(r3)
            androidx.leanback.widget.VerticalGridView r0 = (androidx.leanback.widget.VerticalGridView) r0
            if (r0 == 0) goto L34
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r1 = r2.mColumns
            java.lang.Object r3 = r1.get(r3)
            androidx.leanback.widget.picker.PickerColumn r3 = (androidx.leanback.widget.picker.PickerColumn) r3
            int r3 = r3.getMinValue()
            int r4 = r4 - r3
            if (r5 == 0) goto L31
            r0.setSelectedPositionSmooth(r4)
            goto L34
        L31:
            r0.setSelectedPosition(r4)
        L34:
            return
    }

    public void setColumns(java.util.List<androidx.leanback.widget.picker.PickerColumn> r9) {
            r8 = this;
            java.util.List<java.lang.CharSequence> r0 = r8.mSeparators
            int r0 = r0.size()
            if (r0 == 0) goto L13e
            java.util.List<java.lang.CharSequence> r0 = r8.mSeparators
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L3c
            java.util.List<java.lang.CharSequence> r0 = r8.mSeparators
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.util.List<java.lang.CharSequence> r3 = r8.mSeparators
            r3.clear()
            java.util.List<java.lang.CharSequence> r3 = r8.mSeparators
            java.lang.String r4 = ""
            r3.add(r4)
            r3 = 0
        L27:
            int r5 = r9.size()
            int r5 = r5 - r2
            if (r3 >= r5) goto L36
            java.util.List<java.lang.CharSequence> r5 = r8.mSeparators
            r5.add(r0)
            int r3 = r3 + 1
            goto L27
        L36:
            java.util.List<java.lang.CharSequence> r0 = r8.mSeparators
            r0.add(r4)
            goto L49
        L3c:
            java.util.List<java.lang.CharSequence> r0 = r8.mSeparators
            int r0 = r0.size()
            int r3 = r9.size()
            int r3 = r3 + r2
            if (r0 != r3) goto L10f
        L49:
            java.util.List<androidx.leanback.widget.VerticalGridView> r0 = r8.mColumnViews
            r0.clear()
            android.view.ViewGroup r0 = r8.mPickerView
            r0.removeAllViews()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            r8.mColumns = r0
            int r9 = r8.mSelectedColumn
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r9 <= r0) goto L6c
            java.util.ArrayList<androidx.leanback.widget.picker.PickerColumn> r9 = r8.mColumns
            int r9 = r9.size()
            int r9 = r9 - r2
            r8.mSelectedColumn = r9
        L6c:
            android.content.Context r9 = r8.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r0 = r8.getColumnsCount()
            java.util.List<java.lang.CharSequence> r2 = r8.mSeparators
            java.lang.Object r2 = r2.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto La0
            int r2 = androidx.leanback.R.layout.lb_picker_separator
            android.view.ViewGroup r3 = r8.mPickerView
            android.view.View r2 = r9.inflate(r2, r3, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.util.List<java.lang.CharSequence> r3 = r8.mSeparators
            java.lang.Object r3 = r3.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.view.ViewGroup r3 = r8.mPickerView
            r3.addView(r2)
        La0:
            r2 = 0
        La1:
            if (r2 >= r0) goto L10e
            int r3 = androidx.leanback.R.layout.lb_picker_column
            android.view.ViewGroup r4 = r8.mPickerView
            android.view.View r3 = r9.inflate(r3, r4, r1)
            androidx.leanback.widget.VerticalGridView r3 = (androidx.leanback.widget.VerticalGridView) r3
            r8.updateColumnSize(r3)
            r3.setWindowAlignment(r1)
            r3.setHasFixedSize(r1)
            boolean r4 = r8.isActivated()
            r3.setFocusable(r4)
            r3.setItemViewCacheSize(r1)
            java.util.List<androidx.leanback.widget.VerticalGridView> r4 = r8.mColumnViews
            r4.add(r3)
            android.view.ViewGroup r4 = r8.mPickerView
            r4.addView(r3)
            java.util.List<java.lang.CharSequence> r4 = r8.mSeparators
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lf4
            int r4 = androidx.leanback.R.layout.lb_picker_separator
            android.view.ViewGroup r6 = r8.mPickerView
            android.view.View r4 = r9.inflate(r4, r6, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.List<java.lang.CharSequence> r6 = r8.mSeparators
            java.lang.Object r6 = r6.get(r5)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.setText(r6)
            android.view.ViewGroup r6 = r8.mPickerView
            r6.addView(r4)
        Lf4:
            androidx.leanback.widget.picker.Picker$PickerScrollArrayAdapter r4 = new androidx.leanback.widget.picker.Picker$PickerScrollArrayAdapter
            r8.getContext()
            int r6 = r8.getPickerItemLayoutId()
            int r7 = r8.getPickerItemTextViewId()
            r4.<init>(r8, r6, r7, r2)
            r3.setAdapter(r4)
            androidx.leanback.widget.OnChildViewHolderSelectedListener r2 = r8.mColumnChangeListener
            r3.setOnChildViewHolderSelectedListener(r2)
            r2 = r5
            goto La1
        L10e:
            return
        L10f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Separators size: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.util.List<java.lang.CharSequence> r2 = r8.mSeparators
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = " must"
            r1.append(r2)
            java.lang.String r2 = "equal the size of columns: "
            r1.append(r2)
            int r9 = r9.size()
            r1.append(r9)
            java.lang.String r9 = " + 1"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L13e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Separators size is: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<java.lang.CharSequence> r1 = r8.mSeparators
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ". At least one separator must be provided"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    public final void setOrAnimateAlpha(android.view.View r7, boolean r8, int r9, boolean r10) {
            r6 = this;
            int r0 = r6.mSelectedColumn
            if (r9 == r0) goto Ld
            boolean r0 = r6.hasFocus()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            if (r8 == 0) goto L2c
            if (r0 == 0) goto L1f
            float r3 = r6.mFocusedAlpha
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.Interpolator r5 = r6.mDecelerateInterpolator
            r0 = r6
            r1 = r7
            r2 = r10
            r0.setOrAnimateAlpha(r1, r2, r3, r4, r5)
            goto L47
        L1f:
            float r3 = r6.mUnfocusedAlpha
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.Interpolator r5 = r6.mDecelerateInterpolator
            r0 = r6
            r1 = r7
            r2 = r10
            r0.setOrAnimateAlpha(r1, r2, r3, r4, r5)
            goto L47
        L2c:
            if (r0 == 0) goto L3b
            float r3 = r6.mVisibleColumnAlpha
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.Interpolator r5 = r6.mDecelerateInterpolator
            r0 = r6
            r1 = r7
            r2 = r10
            r0.setOrAnimateAlpha(r1, r2, r3, r4, r5)
            goto L47
        L3b:
            float r3 = r6.mInvisibleColumnAlpha
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.Interpolator r5 = r6.mDecelerateInterpolator
            r0 = r6
            r1 = r7
            r2 = r10
            r0.setOrAnimateAlpha(r1, r2, r3, r4, r5)
        L47:
            return
    }

    public final void setPickerItemTextViewId(int r1) {
            r0 = this;
            r0.mPickerItemTextViewId = r1
            return
    }

    public void setSelectedColumn(int r2) {
            r1 = this;
            int r0 = r1.mSelectedColumn
            if (r0 == r2) goto L15
            r1.mSelectedColumn = r2
            r2 = 0
        L7:
            java.util.List<androidx.leanback.widget.VerticalGridView> r0 = r1.mColumnViews
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            r1.updateColumnAlpha(r2)
            int r2 = r2 + 1
            goto L7
        L15:
            return
    }

    public final void setSeparator(java.lang.CharSequence r3) {
            r2 = this;
            r0 = 1
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r2.setSeparators(r3)
            return
    }

    public final void setSeparators(java.util.List<java.lang.CharSequence> r2) {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.mSeparators
            r0.clear()
            java.util.List<java.lang.CharSequence> r0 = r1.mSeparators
            r0.addAll(r2)
            return
    }

    public void setVisibleItemCount(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = r1.mVisibleItems
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r1.mVisibleItems = r2
            boolean r2 = r1.isActivated()
            if (r2 != 0) goto L16
            r1.updateColumnSize()
        L16:
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public final void updateColumnAlpha(int r8) {
            r7 = this;
            java.util.List<androidx.leanback.widget.VerticalGridView> r0 = r7.mColumnViews
            java.lang.Object r0 = r0.get(r8)
            androidx.leanback.widget.VerticalGridView r0 = (androidx.leanback.widget.VerticalGridView) r0
            int r1 = r0.getSelectedPosition()
            r2 = 0
            r3 = 0
        Le:
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r0.getAdapter()
            int r4 = r4.getItemCount()
            if (r3 >= r4) goto L2e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r0.getLayoutManager()
            android.view.View r4 = r4.findViewByPosition(r3)
            if (r4 == 0) goto L2b
            r5 = 1
            if (r1 != r3) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            r7.setOrAnimateAlpha(r4, r6, r8, r5)
        L2b:
            int r3 = r3 + 1
            goto Le
        L2e:
            return
    }
}
