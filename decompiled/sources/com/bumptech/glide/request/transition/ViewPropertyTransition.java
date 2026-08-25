package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class ViewPropertyTransition<R> implements com.bumptech.glide.request.transition.Transition<R> {
    private final com.bumptech.glide.request.transition.ViewPropertyTransition.Animator animator;

    /* JADX INFO: loaded from: classes2.dex */
    public interface Animator {
        void animate(android.view.View r1);
    }

    public ViewPropertyTransition(com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r1) {
            r0 = this;
            r0.<init>()
            r0.animator = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r1, com.bumptech.glide.request.transition.Transition.ViewAdapter r2) {
            r0 = this;
            android.view.View r1 = r2.getView()
            if (r1 == 0) goto Lf
            com.bumptech.glide.request.transition.ViewPropertyTransition$Animator r1 = r0.animator
            android.view.View r2 = r2.getView()
            r1.animate(r2)
        Lf:
            r1 = 0
            return r1
    }
}
