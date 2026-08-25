package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class PersistentFocusWrapper extends android.widget.FrameLayout {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "PersistentFocusWrapper";
    private boolean mPersistFocusVertical;
    private int mSelectedPosition;

    /* JADX INFO: loaded from: classes3.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.leanback.widget.PersistentFocusWrapper.SavedState> CREATOR = null;
        public int mSelectedPosition;


        static {
                androidx.leanback.widget.PersistentFocusWrapper$SavedState$1 r0 = new androidx.leanback.widget.PersistentFocusWrapper$SavedState$1
                r0.<init>()
                androidx.leanback.widget.PersistentFocusWrapper.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.mSelectedPosition = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.mSelectedPosition
                r1.writeInt(r2)
                return
        }
    }

    public PersistentFocusWrapper(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.mSelectedPosition = r1
            r1 = 1
            r0.mPersistFocusVertical = r1
            return
    }

    public PersistentFocusWrapper(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mSelectedPosition = r1
            r1 = 1
            r0.mPersistFocusVertical = r1
            return
    }

    private boolean shouldPersistFocusFromDirection(int r3) {
            r2 = this;
            boolean r0 = r2.mPersistFocusVertical
            if (r0 == 0) goto Lc
            r1 = 33
            if (r3 == r1) goto L16
            r1 = 130(0x82, float:1.82E-43)
            if (r3 == r1) goto L16
        Lc:
            if (r0 != 0) goto L18
            r0 = 17
            if (r3 == r0) goto L16
            r0 = 66
            if (r3 != r0) goto L18
        L16:
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.hasFocus()
            if (r0 != 0) goto L21
            r0 = 0
            android.view.View r1 = r2.getChildAt(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L10
            goto L14
        L10:
            int r0 = r1.getChildCount()
        L14:
            if (r0 == 0) goto L21
            boolean r0 = r2.shouldPersistFocusFromDirection(r4)
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            r3.add(r2)
            goto L24
        L21:
            super.addFocusables(r3, r4, r5)
        L24:
            return
    }

    public void clearSelection() {
            r1 = this;
            r0 = -1
            r1.mSelectedPosition = r0
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto Lc
            r1.clearFocus()
        Lc:
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.widget.PersistentFocusWrapper.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.leanback.widget.PersistentFocusWrapper$SavedState r2 = (androidx.leanback.widget.PersistentFocusWrapper.SavedState) r2
            int r0 = r2.mSelectedPosition
            r1.mSelectedPosition = r0
            android.os.Parcelable r2 = r2.getSuperState()
            super.onRestoreInstanceState(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.leanback.widget.PersistentFocusWrapper$SavedState r0 = new androidx.leanback.widget.PersistentFocusWrapper$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            int r1 = r2.mSelectedPosition
            r0.mSelectedPosition = r1
            return r0
    }

    public void persistFocusHorizontal() {
            r1 = this;
            r0 = 0
            r1.mPersistFocusVertical = r0
            return
    }

    public void persistFocusVertical() {
            r1 = this;
            r0 = 1
            r1.mPersistFocusVertical = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            super.requestChildFocus(r2, r3)
        L3:
            if (r3 == 0) goto L12
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == r2) goto L12
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L3
        L12:
            if (r3 != 0) goto L16
            r2 = -1
            goto L1c
        L16:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r2 = r2.indexOfChild(r3)
        L1c:
            r1.mSelectedPosition = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r5, android.graphics.Rect r6) {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L2a
            int r2 = r4.mSelectedPosition
            if (r2 < 0) goto L2a
            android.view.View r3 = r4.getChildAt(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L16
            goto L1a
        L16:
            int r0 = r3.getChildCount()
        L1a:
            if (r2 >= r0) goto L2a
            int r0 = r4.mSelectedPosition
            android.view.View r0 = r1.getChildAt(r0)
            boolean r0 = r0.requestFocus(r5, r6)
            if (r0 == 0) goto L2a
            r5 = 1
            return r5
        L2a:
            boolean r5 = super.requestFocus(r5, r6)
            return r5
    }
}
