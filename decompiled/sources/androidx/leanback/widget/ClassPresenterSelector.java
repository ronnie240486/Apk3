package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassPresenterSelector extends androidx.leanback.widget.PresenterSelector {
    private final java.util.HashMap<java.lang.Class<?>, java.lang.Object> mClassMap;
    private final java.util.ArrayList<androidx.leanback.widget.Presenter> mPresenters;

    public ClassPresenterSelector() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPresenters = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mClassMap = r0
            return
    }

    public androidx.leanback.widget.ClassPresenterSelector addClassPresenter(java.lang.Class<?> r2, androidx.leanback.widget.Presenter r3) {
            r1 = this;
            java.util.HashMap<java.lang.Class<?>, java.lang.Object> r0 = r1.mClassMap
            r0.put(r2, r3)
            java.util.ArrayList<androidx.leanback.widget.Presenter> r2 = r1.mPresenters
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L12
            java.util.ArrayList<androidx.leanback.widget.Presenter> r2 = r1.mPresenters
            r2.add(r3)
        L12:
            return r1
    }

    public androidx.leanback.widget.ClassPresenterSelector addClassPresenterSelector(java.lang.Class<?> r3, androidx.leanback.widget.PresenterSelector r4) {
            r2 = this;
            java.util.HashMap<java.lang.Class<?>, java.lang.Object> r0 = r2.mClassMap
            r0.put(r3, r4)
            androidx.leanback.widget.Presenter[] r3 = r4.getPresenters()
            r4 = 0
        La:
            int r0 = r3.length
            if (r4 >= r0) goto L21
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            r1 = r3[r4]
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1e
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            r1 = r3[r4]
            r0.add(r1)
        L1e:
            int r4 = r4 + 1
            goto La
        L21:
            return r2
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter getPresenter(java.lang.Object r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
        L4:
            java.util.HashMap<java.lang.Class<?>, java.lang.Object> r1 = r3.mClassMap
            java.lang.Object r1 = r1.get(r0)
            boolean r2 = r1 instanceof androidx.leanback.widget.PresenterSelector
            if (r2 == 0) goto L18
            r2 = r1
            androidx.leanback.widget.PresenterSelector r2 = (androidx.leanback.widget.PresenterSelector) r2
            androidx.leanback.widget.Presenter r2 = r2.getPresenter(r4)
            if (r2 == 0) goto L18
            return r2
        L18:
            java.lang.Class r0 = r0.getSuperclass()
            if (r1 != 0) goto L20
            if (r0 != 0) goto L4
        L20:
            androidx.leanback.widget.Presenter r1 = (androidx.leanback.widget.Presenter) r1
            return r1
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter[] getPresenters() {
            r2 = this;
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            int r1 = r0.size()
            androidx.leanback.widget.Presenter[] r1 = new androidx.leanback.widget.Presenter[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            androidx.leanback.widget.Presenter[] r0 = (androidx.leanback.widget.Presenter[]) r0
            return r0
    }
}
