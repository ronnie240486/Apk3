package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPropertyAnimationFactory<R> implements com.bumptech.glide.request.transition.TransitionFactory<R> {
    private com.bumptech.glide.request.transition.ViewPropertyTransition<R> animation;
    private final com.bumptech.glide.request.transition.ViewPropertyTransition.Animator animator;

    public ViewPropertyAnimationFactory(com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r1) {
            r0 = this;
            r0.<init>()
            r0.animator = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public com.bumptech.glide.request.transition.Transition<R> build(com.bumptech.glide.load.DataSource r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            if (r2 == r0) goto L17
            if (r3 != 0) goto L7
            goto L17
        L7:
            com.bumptech.glide.request.transition.ViewPropertyTransition<R> r2 = r1.animation
            if (r2 != 0) goto L14
            com.bumptech.glide.request.transition.ViewPropertyTransition r2 = new com.bumptech.glide.request.transition.ViewPropertyTransition
            com.bumptech.glide.request.transition.ViewPropertyTransition$Animator r3 = r1.animator
            r2.<init>(r3)
            r1.animation = r2
        L14:
            com.bumptech.glide.request.transition.ViewPropertyTransition<R> r2 = r1.animation
            return r2
        L17:
            com.bumptech.glide.request.transition.Transition r2 = com.bumptech.glide.request.transition.NoTransition.get()
            return r2
    }
}
