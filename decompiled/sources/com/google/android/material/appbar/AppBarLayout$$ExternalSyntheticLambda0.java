package com.google.android.material.appbar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AppBarLayout$$ExternalSyntheticLambda0 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ AppBarLayout$$ExternalSyntheticLambda0(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.material.shape.MaterialShapeDrawable r1 = (com.google.android.material.shape.MaterialShapeDrawable) r1
            com.google.android.material.appbar.AppBarLayout.$r8$lambda$XV3VI5THqRjqH1lLQck6TBMHyoU(r0, r1, r3)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.material.shape.MaterialShapeDrawable r1 = (com.google.android.material.shape.MaterialShapeDrawable) r1
            com.google.android.material.appbar.AppBarLayout.$r8$lambda$L4UAs858CLQVMmD1QMlZMKD6UY8(r0, r1, r3)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.material.internal.ExpandCollapseAnimationHelper r0 = (com.google.android.material.internal.ExpandCollapseAnimationHelper) r0
            java.lang.Object r1 = r2.f$1
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            com.google.android.material.internal.ExpandCollapseAnimationHelper.$r8$lambda$PhjrFv1MAxh6Fwygg9NCQItD7gQ(r0, r1, r3)
            return
    }
}
