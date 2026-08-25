package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransition<R> implements com.bumptech.glide.request.transition.Transition<R> {
    private final com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;

    public interface ViewTransitionAnimationFactory {
        android.view.animation.Animation build(android.content.Context r1);
    }

    public ViewTransition(com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory r1) {
            r0 = this;
            r0.<init>()
            r0.viewTransitionAnimationFactory = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r2, com.bumptech.glide.request.transition.Transition.ViewAdapter r3) {
            r1 = this;
            android.view.View r2 = r3.getView()
            if (r2 == 0) goto L16
            r2.clearAnimation()
            com.bumptech.glide.request.transition.ViewTransition$ViewTransitionAnimationFactory r3 = r1.viewTransitionAnimationFactory
            android.content.Context r0 = r2.getContext()
            android.view.animation.Animation r3 = r3.build(r0)
            r2.startAnimation(r3)
        L16:
            r2 = 0
            return r2
    }
}
