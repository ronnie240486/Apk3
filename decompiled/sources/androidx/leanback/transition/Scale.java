package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
class Scale extends android.transition.Transition {
    private static final java.lang.String PROPNAME_SCALE = "android:leanback:scale";


    public Scale() {
            r0 = this;
            r0.<init>()
            return
    }

    private void captureValues(android.transition.TransitionValues r3) {
            r2 = this;
            android.view.View r0 = r3.view
            java.util.Map r3 = r3.values
            float r0 = r0.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "android:leanback:scale"
            r3.put(r1, r0)
            return
    }

    @Override // android.transition.Transition
    public void captureEndValues(android.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // android.transition.Transition
    public void captureStartValues(android.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // android.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r3, android.transition.TransitionValues r4, android.transition.TransitionValues r5) {
            r2 = this;
            if (r4 == 0) goto L3d
            if (r5 != 0) goto L5
            goto L3d
        L5:
            java.util.Map r3 = r4.values
            java.lang.String r0 = "android:leanback:scale"
            java.lang.Object r3 = r3.get(r0)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.util.Map r5 = r5.values
            java.lang.Object r5 = r5.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.view
            r4.setScaleX(r3)
            r4.setScaleY(r3)
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r5
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            androidx.leanback.transition.Scale$1 r5 = new androidx.leanback.transition.Scale$1
            r5.<init>(r4)
            r3.addUpdateListener(r5)
            return r3
        L3d:
            r3 = 0
            return r3
    }
}
