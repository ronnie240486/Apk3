package androidx.leanback.transition;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ParallaxTransition extends android.transition.Visibility {
    public static android.view.animation.LinearInterpolator sInterpolator;


    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            androidx.leanback.transition.ParallaxTransition.sInterpolator = r0
            return
    }

    public ParallaxTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    public ParallaxTransition(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final android.animation.Animator createAnimator(android.view.View r3) {
            r2 = this;
            int r0 = androidx.leanback.R.id.lb_parallax_source
            java.lang.Object r3 = r3.getTag(r0)
            androidx.leanback.widget.Parallax r3 = (androidx.leanback.widget.Parallax) r3
            if (r3 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.view.animation.LinearInterpolator r1 = androidx.leanback.transition.ParallaxTransition.sInterpolator
            r0.setInterpolator(r1)
            androidx.leanback.transition.ParallaxTransition$1 r1 = new androidx.leanback.transition.ParallaxTransition$1
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            return r0
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            if (r4 != 0) goto L4
            r1 = 0
            return r1
        L4:
            android.animation.Animator r1 = r0.createAnimator(r2)
            return r1
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            if (r3 != 0) goto L4
            r1 = 0
            return r1
        L4:
            android.animation.Animator r1 = r0.createAnimator(r2)
            return r1
    }
}
