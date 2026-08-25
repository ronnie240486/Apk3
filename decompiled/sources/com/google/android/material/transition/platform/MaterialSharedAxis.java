package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
public final class MaterialSharedAxis extends com.google.android.material.transition.platform.MaterialVisibility<com.google.android.material.transition.platform.VisibilityAnimatorProvider> {

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_DURATION_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_EASING_ATTR = 0;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong1
            com.google.android.material.transition.platform.MaterialSharedAxis.DEFAULT_THEMED_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.transition.platform.MaterialSharedAxis.DEFAULT_THEMED_EASING_ATTR = r0
            return
    }

    public MaterialSharedAxis(int r3, boolean r4) {
            r2 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = createPrimaryAnimatorProvider(r3, r4)
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r1 = createSecondaryAnimatorProvider()
            r2.<init>(r0, r1)
            r2.axis = r3
            r2.forward = r4
            return
    }

    private static com.google.android.material.transition.platform.VisibilityAnimatorProvider createPrimaryAnimatorProvider(int r1, boolean r2) {
            if (r1 == 0) goto L27
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 2
            if (r1 != r0) goto Le
            com.google.android.material.transition.platform.ScaleProvider r1 = new com.google.android.material.transition.platform.ScaleProvider
            r1.<init>(r2)
            return r1
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid axis: "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            r2.<init>(r1)
            throw r2
        L1a:
            com.google.android.material.transition.platform.SlideDistanceProvider r1 = new com.google.android.material.transition.platform.SlideDistanceProvider
            if (r2 == 0) goto L21
            r2 = 80
            goto L23
        L21:
            r2 = 48
        L23:
            r1.<init>(r2)
            return r1
        L27:
            com.google.android.material.transition.platform.SlideDistanceProvider r1 = new com.google.android.material.transition.platform.SlideDistanceProvider
            if (r2 == 0) goto L2f
            r2 = 8388613(0x800005, float:1.175495E-38)
            goto L32
        L2f:
            r2 = 8388611(0x800003, float:1.1754948E-38)
        L32:
            r1.<init>(r2)
            return r1
    }

    private static com.google.android.material.transition.platform.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
            com.google.android.material.transition.platform.FadeThroughProvider r0 = new com.google.android.material.transition.platform.FadeThroughProvider
            r0.<init>()
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.addAdditionalAnimatorProvider(r1)
            return
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
            r0 = this;
            super.clearAdditionalAnimatorProvider()
            return
    }

    public int getAxis() {
            r1 = this;
            int r0 = r1.axis
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @androidx.annotation.AttrRes
    public final int getDurationThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.platform.MaterialSharedAxis.DEFAULT_THEMED_DURATION_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @androidx.annotation.AttrRes
    public final int getEasingThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.platform.MaterialSharedAxis.DEFAULT_THEMED_EASING_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = super.getPrimaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = super.getSecondaryAnimatorProvider()
            return r0
    }

    public boolean isForward() {
            r1 = this;
            boolean r0 = r1.forward
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onAppear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onDisappear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            boolean r1 = super.removeAdditionalAnimatorProvider(r1)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@androidx.annotation.Nullable com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.setSecondaryAnimatorProvider(r1)
            return
    }
}
