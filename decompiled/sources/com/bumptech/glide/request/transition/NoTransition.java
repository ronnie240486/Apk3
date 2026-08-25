package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes2.dex */
public class NoTransition<R> implements com.bumptech.glide.request.transition.Transition<R> {
    public static final com.bumptech.glide.request.transition.NoTransition<?> NO_ANIMATION = null;
    private static final com.bumptech.glide.request.transition.TransitionFactory<?> NO_ANIMATION_FACTORY = null;

    public static class NoAnimationFactory<R> implements com.bumptech.glide.request.transition.TransitionFactory<R> {
        public NoAnimationFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.request.transition.TransitionFactory
        public com.bumptech.glide.request.transition.Transition<R> build(com.bumptech.glide.load.DataSource r1, boolean r2) {
                r0 = this;
                com.bumptech.glide.request.transition.NoTransition<?> r1 = com.bumptech.glide.request.transition.NoTransition.NO_ANIMATION
                return r1
        }
    }

    static {
            com.bumptech.glide.request.transition.NoTransition r0 = new com.bumptech.glide.request.transition.NoTransition
            r0.<init>()
            com.bumptech.glide.request.transition.NoTransition.NO_ANIMATION = r0
            com.bumptech.glide.request.transition.NoTransition$NoAnimationFactory r0 = new com.bumptech.glide.request.transition.NoTransition$NoAnimationFactory
            r0.<init>()
            com.bumptech.glide.request.transition.NoTransition.NO_ANIMATION_FACTORY = r0
            return
    }

    public NoTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <R> com.bumptech.glide.request.transition.Transition<R> get() {
            com.bumptech.glide.request.transition.NoTransition<?> r0 = com.bumptech.glide.request.transition.NoTransition.NO_ANIMATION
            return r0
    }

    public static <R> com.bumptech.glide.request.transition.TransitionFactory<R> getFactory() {
            com.bumptech.glide.request.transition.TransitionFactory<?> r0 = com.bumptech.glide.request.transition.NoTransition.NO_ANIMATION_FACTORY
            return r0
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(java.lang.Object r1, com.bumptech.glide.request.transition.Transition.ViewAdapter r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
