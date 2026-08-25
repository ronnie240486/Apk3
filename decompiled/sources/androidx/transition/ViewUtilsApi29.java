package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(29)
class ViewUtilsApi29 extends androidx.transition.ViewUtilsApi23 {
    public ViewUtilsApi29() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            float r1 = r1.getTransitionAlpha()
            return r1
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.graphics.Matrix r2) {
            r0 = this;
            r1.setAnimationMatrix(r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1.setLeftTopRightBottom(r2, r3, r4, r5)
            return
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(@androidx.annotation.NonNull android.view.View r1, float r2) {
            r0 = this;
            r1.setTransitionAlpha(r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(@androidx.annotation.NonNull android.view.View r1, int r2) {
            r0 = this;
            r1.setTransitionVisibility(r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            r0 = this;
            r1.transformMatrixToGlobal(r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            r0 = this;
            r1.transformMatrixToLocal(r2)
            return
    }
}
