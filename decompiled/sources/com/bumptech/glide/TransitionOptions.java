package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TransitionOptions<CHILD extends com.bumptech.glide.TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements java.lang.Cloneable {
    private com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> transitionFactory;

    public TransitionOptions() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.transition.TransitionFactory r0 = com.bumptech.glide.request.transition.NoTransition.getFactory()
            r1.transitionFactory = r0
            return
    }

    private CHILD self() {
            r0 = this;
            return r0
    }

    public final CHILD clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bumptech.glide.TransitionOptions r0 = (com.bumptech.glide.TransitionOptions) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m46clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.TransitionOptions r0 = r1.clone()
            return r0
    }

    @androidx.annotation.NonNull
    public final CHILD dontTransition() {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory r0 = com.bumptech.glide.request.transition.NoTransition.getFactory()
            com.bumptech.glide.TransitionOptions r0 = r1.transition(r0)
            return r0
    }

    public final com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> getTransitionFactory() {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r0 = r1.transitionFactory
            return r0
    }

    @androidx.annotation.NonNull
    public final CHILD transition(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewAnimationFactory
            r0.<init>(r2)
            com.bumptech.glide.TransitionOptions r2 = r1.transition(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final CHILD transition(@androidx.annotation.NonNull com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.request.transition.TransitionFactory r1 = (com.bumptech.glide.request.transition.TransitionFactory) r1
            r0.transitionFactory = r1
            com.bumptech.glide.TransitionOptions r1 = r0.self()
            return r1
    }

    @androidx.annotation.NonNull
    public final CHILD transition(@androidx.annotation.NonNull com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewPropertyAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewPropertyAnimationFactory
            r0.<init>(r2)
            com.bumptech.glide.TransitionOptions r2 = r1.transition(r0)
            return r2
    }
}
