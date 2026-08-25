package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class Presenter implements androidx.leanback.widget.FacetProvider {
    private java.util.Map<java.lang.Class, java.lang.Object> mFacets;

    public static class ViewHolder implements androidx.leanback.widget.FacetProvider {
        private java.util.Map<java.lang.Class, java.lang.Object> mFacets;
        public final android.view.View view;

        public ViewHolder(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.view = r1
                return
        }

        @Override // androidx.leanback.widget.FacetProvider
        public final java.lang.Object getFacet(java.lang.Class<?> r2) {
                r1 = this;
                java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public final void setFacet(java.lang.Class<?> r2, java.lang.Object r3) {
                r1 = this;
                java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
                if (r0 != 0) goto Lb
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mFacets = r0
            Lb:
                java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
                r0.put(r2, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ViewHolderTask {
        public ViewHolderTask() {
                r0 = this;
                r0.<init>()
                return
        }

        public void run(androidx.leanback.widget.Presenter.ViewHolder r1) {
                r0 = this;
                return
        }
    }

    public Presenter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void cancelAnimationsRecursive(android.view.View r4) {
            if (r4 == 0) goto L2d
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L2d
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2d
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            r2 = 0
        L1b:
            boolean r3 = r4.hasTransientState()
            if (r3 == 0) goto L2d
            if (r2 >= r1) goto L2d
            android.view.View r3 = r0.getChildAt(r2)
            cancelAnimationsRecursive(r3)
            int r2 = r2 + 1
            goto L1b
        L2d:
            return
    }

    @Override // androidx.leanback.widget.FacetProvider
    public final java.lang.Object getFacet(java.lang.Class<?> r2) {
            r1 = this;
            java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public abstract void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2);

    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, java.util.List<java.lang.Object> r3) {
            r0 = this;
            r0.onBindViewHolder(r1, r2)
            return
    }

    public abstract androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r1);

    public abstract void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1);

    public void onViewAttachedToWindow(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onViewDetachedFromWindow(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            android.view.View r1 = r1.view
            cancelAnimationsRecursive(r1)
            return
    }

    public final void setFacet(java.lang.Class<?> r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mFacets = r0
        Lb:
            java.util.Map<java.lang.Class, java.lang.Object> r0 = r1.mFacets
            r0.put(r2, r3)
            return
    }

    public void setOnClickListener(androidx.leanback.widget.Presenter.ViewHolder r1, android.view.View.OnClickListener r2) {
            r0 = this;
            android.view.View r1 = r1.view
            r1.setOnClickListener(r2)
            return
    }
}
