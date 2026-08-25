package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
public final class GenericTransitionOptions<TranscodeType> extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.GenericTransitionOptions<TranscodeType>, TranscodeType> {
    public GenericTransitionOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(int r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(@androidx.annotation.NonNull com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(@androidx.annotation.NonNull com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> withNoTransition() {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r0 = r0.dontTransition()
            com.bumptech.glide.GenericTransitionOptions r0 = (com.bumptech.glide.GenericTransitionOptions) r0
            return r0
    }
}
