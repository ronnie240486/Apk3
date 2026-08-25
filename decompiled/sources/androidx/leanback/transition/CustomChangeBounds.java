package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
class CustomChangeBounds extends android.transition.ChangeBounds {
    public final java.util.HashMap<java.lang.String, java.lang.Integer> mClassStartDelays;
    public int mDefaultStartDelay;
    public final android.util.SparseIntArray mIdStartDelays;
    public final java.util.HashMap<android.view.View, java.lang.Integer> mViewStartDelays;

    public CustomChangeBounds() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mViewStartDelays = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mIdStartDelays = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mClassStartDelays = r0
            return
    }

    private int getDelay(android.view.View r4) {
            r3 = this;
            java.util.HashMap<android.view.View, java.lang.Integer> r0 = r3.mViewStartDelays
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r4 = r0.intValue()
            return r4
        Lf:
            android.util.SparseIntArray r0 = r3.mIdStartDelays
            int r1 = r4.getId()
            r2 = -1
            int r0 = r0.get(r1, r2)
            if (r0 == r2) goto L1d
            return r0
        L1d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.mClassStartDelays
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L34
            int r4 = r4.intValue()
            return r4
        L34:
            int r4 = r3.mDefaultStartDelay
            return r4
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r1, android.transition.TransitionValues r2, android.transition.TransitionValues r3) {
            r0 = this;
            android.animation.Animator r1 = super.createAnimator(r1, r2, r3)
            if (r1 == 0) goto L14
            if (r3 == 0) goto L14
            android.view.View r2 = r3.view
            if (r2 == 0) goto L14
            int r2 = r0.getDelay(r2)
            long r2 = (long) r2
            r1.setStartDelay(r2)
        L14:
            return r1
    }

    public void setDefaultStartDelay(int r1) {
            r0 = this;
            r0.mDefaultStartDelay = r1
            return
    }

    public void setStartDelay(int r2, int r3) {
            r1 = this;
            android.util.SparseIntArray r0 = r1.mIdStartDelays
            r0.put(r2, r3)
            return
    }

    public void setStartDelay(android.view.View r2, int r3) {
            r1 = this;
            java.util.HashMap<android.view.View, java.lang.Integer> r0 = r1.mViewStartDelays
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void setStartDelay(java.lang.String r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mClassStartDelays
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }
}
