package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class DetailsOverviewRow extends androidx.leanback.widget.Row {
    private androidx.leanback.widget.ObjectAdapter mActionsAdapter;
    private androidx.leanback.widget.PresenterSelector mDefaultActionPresenter;
    private android.graphics.drawable.Drawable mImageDrawable;
    private boolean mImageScaleUpAllowed;
    private java.lang.Object mItem;
    private java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow.Listener>> mListeners;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onActionsAdapterChanged(androidx.leanback.widget.DetailsOverviewRow r1) {
                r0 = this;
                return
        }

        public void onImageDrawableChanged(androidx.leanback.widget.DetailsOverviewRow r1) {
                r0 = this;
                return
        }

        public void onItemChanged(androidx.leanback.widget.DetailsOverviewRow r1) {
                r0 = this;
                return
        }
    }

    public DetailsOverviewRow(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r0 = 1
            r2.mImageScaleUpAllowed = r0
            androidx.leanback.widget.ActionPresenterSelector r0 = new androidx.leanback.widget.ActionPresenterSelector
            r0.<init>()
            r2.mDefaultActionPresenter = r0
            androidx.leanback.widget.ArrayObjectAdapter r0 = new androidx.leanback.widget.ArrayObjectAdapter
            androidx.leanback.widget.PresenterSelector r1 = r2.mDefaultActionPresenter
            r0.<init>(r1)
            r2.mActionsAdapter = r0
            r2.mItem = r3
            r2.verify()
            return
    }

    private androidx.leanback.widget.ArrayObjectAdapter getArrayObjectAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mActionsAdapter
            androidx.leanback.widget.ArrayObjectAdapter r0 = (androidx.leanback.widget.ArrayObjectAdapter) r0
            return r0
    }

    private void verify() {
            r2 = this;
            java.lang.Object r0 = r2.mItem
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Object cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public final void addAction(int r2, androidx.leanback.widget.Action r3) {
            r1 = this;
            androidx.leanback.widget.ArrayObjectAdapter r0 = r1.getArrayObjectAdapter()
            r0.add(r2, r3)
            return
    }

    @java.lang.Deprecated
    public final void addAction(androidx.leanback.widget.Action r2) {
            r1 = this;
            androidx.leanback.widget.ArrayObjectAdapter r0 = r1.getArrayObjectAdapter()
            r0.add(r2)
            return
    }

    public final void addListener(androidx.leanback.widget.DetailsOverviewRow.Listener r3) {
            r2 = this;
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r2.mListeners
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mListeners = r0
            goto L31
        Lc:
            r0 = 0
        Ld:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L31
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.leanback.widget.DetailsOverviewRow$Listener r1 = (androidx.leanback.widget.DetailsOverviewRow.Listener) r1
            if (r1 != 0) goto L2b
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            r1.remove(r0)
            goto Ld
        L2b:
            if (r1 != r3) goto L2e
            return
        L2e:
            int r0 = r0 + 1
            goto Ld
        L31:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r2.mListeners
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public androidx.leanback.widget.Action getActionForKeyCode(int r5) {
            r4 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r4.getActionsAdapter()
            if (r0 == 0) goto L1d
            r1 = 0
        L7:
            int r2 = r0.size()
            if (r1 >= r2) goto L1d
            java.lang.Object r2 = r0.get(r1)
            androidx.leanback.widget.Action r2 = (androidx.leanback.widget.Action) r2
            boolean r3 = r2.respondsToKeyCode(r5)
            if (r3 == 0) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r5 = 0
            return r5
    }

    @java.lang.Deprecated
    public final java.util.List<androidx.leanback.widget.Action> getActions() {
            r1 = this;
            androidx.leanback.widget.ArrayObjectAdapter r0 = r1.getArrayObjectAdapter()
            java.util.List r0 = r0.unmodifiableList()
            return r0
    }

    public final androidx.leanback.widget.ObjectAdapter getActionsAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mActionsAdapter
            return r0
    }

    public final android.graphics.drawable.Drawable getImageDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mImageDrawable
            return r0
    }

    public final java.lang.Object getItem() {
            r1 = this;
            java.lang.Object r0 = r1.mItem
            return r0
    }

    public boolean isImageScaleUpAllowed() {
            r1 = this;
            boolean r0 = r1.mImageScaleUpAllowed
            return r0
    }

    public final void notifyImageDrawableChanged() {
            r2 = this;
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r2.mListeners
            if (r0 == 0) goto L29
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.leanback.widget.DetailsOverviewRow$Listener r1 = (androidx.leanback.widget.DetailsOverviewRow.Listener) r1
            if (r1 != 0) goto L23
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            r1.remove(r0)
            goto L5
        L23:
            r1.onImageDrawableChanged(r2)
            int r0 = r0 + 1
            goto L5
        L29:
            return
    }

    @java.lang.Deprecated
    public final boolean removeAction(androidx.leanback.widget.Action r2) {
            r1 = this;
            androidx.leanback.widget.ArrayObjectAdapter r0 = r1.getArrayObjectAdapter()
            boolean r2 = r0.remove(r2)
            return r2
    }

    public final void removeListener(androidx.leanback.widget.DetailsOverviewRow.Listener r3) {
            r2 = this;
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r2.mListeners
            if (r0 == 0) goto L2e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L2e
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.leanback.widget.DetailsOverviewRow$Listener r1 = (androidx.leanback.widget.DetailsOverviewRow.Listener) r1
            if (r1 != 0) goto L23
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r1 = r2.mListeners
            r1.remove(r0)
            goto L5
        L23:
            if (r1 != r3) goto L2b
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r3 = r2.mListeners
            r3.remove(r0)
            return
        L2b:
            int r0 = r0 + 1
            goto L5
        L2e:
            return
    }

    public final void setActionsAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mActionsAdapter
            if (r2 == r0) goto L3c
            r1.mActionsAdapter = r2
            androidx.leanback.widget.PresenterSelector r2 = r2.getPresenterSelector()
            if (r2 != 0) goto L13
            androidx.leanback.widget.ObjectAdapter r2 = r1.mActionsAdapter
            androidx.leanback.widget.PresenterSelector r0 = r1.mDefaultActionPresenter
            r2.setPresenterSelector(r0)
        L13:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r2 = r1.mListeners
            if (r2 == 0) goto L3c
            r2 = 0
        L18:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            int r0 = r0.size()
            if (r2 >= r0) goto L3c
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            java.lang.Object r0 = r0.get(r2)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            androidx.leanback.widget.DetailsOverviewRow$Listener r0 = (androidx.leanback.widget.DetailsOverviewRow.Listener) r0
            if (r0 != 0) goto L36
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            r0.remove(r2)
            goto L18
        L36:
            r0.onActionsAdapterChanged(r1)
            int r2 = r2 + 1
            goto L18
        L3c:
            return
    }

    public final void setImageBitmap(android.content.Context r2, android.graphics.Bitmap r3) {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r0.<init>(r2, r3)
            r1.mImageDrawable = r0
            r1.notifyImageDrawableChanged()
            return
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mImageDrawable
            if (r0 == r2) goto L9
            r1.mImageDrawable = r2
            r1.notifyImageDrawableChanged()
        L9:
            return
    }

    public void setImageScaleUpAllowed(boolean r2) {
            r1 = this;
            boolean r0 = r1.mImageScaleUpAllowed
            if (r2 == r0) goto L9
            r1.mImageScaleUpAllowed = r2
            r1.notifyImageDrawableChanged()
        L9:
            return
    }

    public final void setItem(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.mItem
            if (r2 == r0) goto L2f
            r1.mItem = r2
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r2 = r1.mListeners
            if (r2 == 0) goto L2f
            r2 = 0
        Lb:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            int r0 = r0.size()
            if (r2 >= r0) goto L2f
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            java.lang.Object r0 = r0.get(r2)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            androidx.leanback.widget.DetailsOverviewRow$Listener r0 = (androidx.leanback.widget.DetailsOverviewRow.Listener) r0
            if (r0 != 0) goto L29
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.leanback.widget.DetailsOverviewRow$Listener>> r0 = r1.mListeners
            r0.remove(r2)
            goto Lb
        L29:
            r0.onItemChanged(r1)
            int r2 = r2 + 1
            goto Lb
        L2f:
            return
    }
}
