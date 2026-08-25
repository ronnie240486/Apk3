package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MultiViewUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final com.google.android.material.internal.MultiViewUpdateListener.Listener listener;
    private final android.view.View[] views;

    public interface Listener {
        void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator r1, @androidx.annotation.NonNull android.view.View r2);
    }

    /* JADX INFO: renamed from: $r8$lambda$Mtp5sBfS5LXd-63Z9XctnK3kqJE, reason: not valid java name */
    public static /* synthetic */ void m284$r8$lambda$Mtp5sBfS5LXd63Z9XctnK3kqJE(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationY(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Rryxfo13bMOcs5cmz2mcweOWiUY(android.animation.ValueAnimator r0, android.view.View r1) {
            setScale(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$fJMU4cyqqeA8DD96LAqv3uCgNCo(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationX(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$gtAYAqr0qsjIEvRsrfPVuv0tXPs(android.animation.ValueAnimator r0, android.view.View r1) {
            setAlpha(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@androidx.annotation.NonNull com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r1 = 0
            android.view.View[] r1 = new android.view.View[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.view.View[] r1 = (android.view.View[]) r1
            r0.views = r1
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@androidx.annotation.NonNull com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @androidx.annotation.NonNull android.view.View... r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r0.views = r2
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$5
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$7
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$2
            r0.<init>(r1, r2)
            return r0
    }

    private static void setAlpha(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            return
    }

    private static void setScale(@androidx.annotation.NonNull android.animation.ValueAnimator r1, @androidx.annotation.NonNull android.view.View r2) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r1.floatValue()
            r2.setScaleX(r0)
            float r1 = r1.floatValue()
            r2.setScaleY(r1)
            return
    }

    private static void setTranslationX(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationX(r0)
            return
    }

    private static void setTranslationY(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationY(r0)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$3
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$6
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0.INSTANCE$4
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator r6) {
            r5 = this;
            android.view.View[] r0 = r5.views
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            com.google.android.material.internal.MultiViewUpdateListener$Listener r4 = r5.listener
            r4.onAnimationUpdate(r6, r3)
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }
}
