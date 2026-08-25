package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes3.dex */
public class ViewAnimationFactory<R> implements com.bumptech.glide.request.transition.TransitionFactory<R> {
    private com.bumptech.glide.request.transition.Transition<R> transition;
    private final com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ConcreteViewTransitionAnimationFactory implements com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory {
        private final android.view.animation.Animation animation;

        public ConcreteViewTransitionAnimationFactory(android.view.animation.Animation r1) {
                r0 = this;
                r0.<init>()
                r0.animation = r1
                return
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory
        public android.view.animation.Animation build(android.content.Context r1) {
                r0 = this;
                android.view.animation.Animation r1 = r0.animation
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ResourceViewTransitionAnimationFactory implements com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory {
        private final int animationId;

        public ResourceViewTransitionAnimationFactory(int r1) {
                r0 = this;
                r0.<init>()
                r0.animationId = r1
                return
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory
        public android.view.animation.Animation build(android.content.Context r2) {
                r1 = this;
                int r0 = r1.animationId
                android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r0)
                return r2
        }
    }

    public ViewAnimationFactory(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewAnimationFactory$ResourceViewTransitionAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewAnimationFactory$ResourceViewTransitionAnimationFactory
            r0.<init>(r2)
            r1.<init>()
            r1.viewTransitionAnimationFactory = r0
            return
    }

    public ViewAnimationFactory(android.view.animation.Animation r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewAnimationFactory$ConcreteViewTransitionAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewAnimationFactory$ConcreteViewTransitionAnimationFactory
            r0.<init>(r2)
            r1.<init>()
            r1.viewTransitionAnimationFactory = r0
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
            com.bumptech.glide.request.transition.Transition<R> r2 = r1.transition
            if (r2 != 0) goto L14
            com.bumptech.glide.request.transition.ViewTransition r2 = new com.bumptech.glide.request.transition.ViewTransition
            com.bumptech.glide.request.transition.ViewTransition$ViewTransitionAnimationFactory r3 = r1.viewTransitionAnimationFactory
            r2.<init>(r3)
            r1.transition = r2
        L14:
            com.bumptech.glide.request.transition.Transition<R> r2 = r1.transition
            return r2
        L17:
            com.bumptech.glide.request.transition.Transition r2 = com.bumptech.glide.request.transition.NoTransition.get()
            return r2
    }
}
