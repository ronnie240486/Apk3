package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectAdapter {
    public static final int NO_ID = -1;
    private boolean mHasStableIds;
    private final androidx.leanback.widget.ObjectAdapter.DataObservable mObservable;
    private androidx.leanback.widget.PresenterSelector mPresenterSelector;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class DataObservable extends android.database.Observable<androidx.leanback.widget.ObjectAdapter.DataObserver> {
        public DataObservable() {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean hasObserver() {
                r1 = this;
                java.util.ArrayList r0 = r1.mObservers
                int r0 = r0.size()
                if (r0 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public void notifyChanged() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemMoved(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onItemMoved(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeChanged(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onItemRangeChanged(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeChanged(int r3, int r4, java.lang.Object r5) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onItemRangeChanged(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeInserted(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onItemRangeInserted(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeRemoved(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.leanback.widget.ObjectAdapter$DataObserver r1 = (androidx.leanback.widget.ObjectAdapter.DataObserver) r1
                r1.onItemRangeRemoved(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }
    }

    public static abstract class DataObserver {
        public DataObserver() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onChanged() {
                r0 = this;
                return
        }

        public void onItemMoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        public void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        public void onItemRangeChanged(int r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        public void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }
    }

    public ObjectAdapter() {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = new androidx.leanback.widget.ObjectAdapter$DataObservable
            r0.<init>()
            r1.mObservable = r0
            return
    }

    public ObjectAdapter(androidx.leanback.widget.Presenter r2) {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = new androidx.leanback.widget.ObjectAdapter$DataObservable
            r0.<init>()
            r1.mObservable = r0
            androidx.leanback.widget.SinglePresenterSelector r0 = new androidx.leanback.widget.SinglePresenterSelector
            r0.<init>(r2)
            r1.setPresenterSelector(r0)
            return
    }

    public ObjectAdapter(androidx.leanback.widget.PresenterSelector r2) {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = new androidx.leanback.widget.ObjectAdapter$DataObservable
            r0.<init>()
            r1.mObservable = r0
            r1.setPresenterSelector(r2)
            return
    }

    public abstract java.lang.Object get(int r1);

    public long getId(int r3) {
            r2 = this;
            r0 = -1
            return r0
    }

    public final androidx.leanback.widget.Presenter getPresenter(java.lang.Object r2) {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r1.mPresenterSelector
            if (r0 == 0) goto L9
            androidx.leanback.widget.Presenter r2 = r0.getPresenter(r2)
            return r2
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Presenter selector must not be null"
            r2.<init>(r0)
            throw r2
    }

    public final androidx.leanback.widget.PresenterSelector getPresenterSelector() {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r1.mPresenterSelector
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasObserver() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            boolean r0 = r0.hasObserver()
            return r0
    }

    public final boolean hasStableIds() {
            r1 = this;
            boolean r0 = r1.mHasStableIds
            return r0
    }

    public boolean isImmediateNotifySupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void notifyChanged() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyChanged()
            return
    }

    public final void notifyItemMoved(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyItemMoved(r2, r3)
            return
    }

    public final void notifyItemRangeChanged(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyItemRangeChanged(r2, r3)
            return
    }

    public final void notifyItemRangeChanged(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyItemRangeChanged(r2, r3, r4)
            return
    }

    public final void notifyItemRangeInserted(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyItemRangeInserted(r2, r3)
            return
    }

    public final void notifyItemRangeRemoved(int r2, int r3) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.notifyItemRangeRemoved(r2, r3)
            return
    }

    public final void registerObserver(androidx.leanback.widget.ObjectAdapter.DataObserver r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.registerObserver(r2)
            return
    }

    public final void setHasStableIds(boolean r1) {
            r0 = this;
            r0.mHasStableIds = r1
            return
    }

    public final void setPresenterSelector(androidx.leanback.widget.PresenterSelector r3) {
            r2 = this;
            if (r3 == 0) goto L11
            androidx.leanback.widget.PresenterSelector r0 = r2.mPresenterSelector
            if (r0 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            r2.mPresenterSelector = r3
            if (r1 == 0) goto L10
            r2.notifyChanged()
        L10:
            return
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Presenter selector must not be null"
            r3.<init>(r0)
            throw r3
    }

    public abstract int size();

    public final void unregisterAllObservers() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.unregisterAll()
            return
    }

    public final void unregisterObserver(androidx.leanback.widget.ObjectAdapter.DataObserver r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter$DataObservable r0 = r1.mObservable
            r0.unregisterObserver(r2)
            return
    }
}
