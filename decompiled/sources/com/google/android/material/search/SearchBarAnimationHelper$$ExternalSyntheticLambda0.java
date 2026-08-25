package com.google.android.material.search;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SearchBarAnimationHelper$$ExternalSyntheticLambda0 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ SearchBarAnimationHelper$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.material.internal.FadeThroughDrawable r0 = (com.google.android.material.internal.FadeThroughDrawable) r0
            com.google.android.material.search.SearchViewAnimationHelper.m289$r8$lambda$vIDpQzdq85GEYIUPmWfoiQqvEQ(r0, r2)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.search.SearchBarAnimationHelper.$r8$lambda$2I8f9dhWFZQCPYrRMzZyxkZ3meI(r0, r2)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) r0
            com.google.android.material.search.SearchViewAnimationHelper.m288$r8$lambda$Z1IpSvBz1A0UFDUBqPbMGBVQYc(r0, r2)
            return
    }
}
