package com.google.android.material.transition;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialFadeThrough extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.FadeThroughProvider> {
    private static final float DEFAULT_START_SCALE = 0.92f;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_DURATION_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_EASING_ATTR = 0;

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong1
            com.google.android.material.transition.MaterialFadeThrough.DEFAULT_THEMED_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.transition.MaterialFadeThrough.DEFAULT_THEMED_EASING_ATTR = r0
            return
    }

    public MaterialFadeThrough() {
            r2 = this;
            com.google.android.material.transition.FadeThroughProvider r0 = createPrimaryAnimatorProvider()
            com.google.android.material.transition.VisibilityAnimatorProvider r1 = createSecondaryAnimatorProvider()
            r2.<init>(r0, r1)
            return
    }

    private static com.google.android.material.transition.FadeThroughProvider createPrimaryAnimatorProvider() {
            com.google.android.material.transition.FadeThroughProvider r0 = new com.google.android.material.transition.FadeThroughProvider
            r0.<init>()
            return r0
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
            com.google.android.material.transition.ScaleProvider r0 = new com.google.android.material.transition.ScaleProvider
            r0.<init>()
            r1 = 0
            r0.setScaleOnDisappear(r1)
            r1 = 1064011039(0x3f6b851f, float:0.92)
            r0.setIncomingStartScale(r1)
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.addAdditionalAnimatorProvider(r1)
            return
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
            r0 = this;
            super.clearAdditionalAnimatorProvider()
            return
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    public final int getDurationThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.MaterialFadeThrough.DEFAULT_THEMED_DURATION_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    public final int getEasingThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.MaterialFadeThrough.DEFAULT_THEMED_EASING_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.VisibilityAnimatorProvider r0 = super.getPrimaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.VisibilityAnimatorProvider r0 = super.getSecondaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onAppear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onDisappear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            boolean r1 = super.removeAdditionalAnimatorProvider(r1)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@androidx.annotation.Nullable com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.setSecondaryAnimatorProvider(r1)
            return
    }
}
