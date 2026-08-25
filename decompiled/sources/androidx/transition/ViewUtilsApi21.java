package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    public ViewUtilsApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix
            if (r0 == 0) goto Lb
            r2.setAnimationMatrix(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal
            if (r0 == 0) goto Lb
            r2.transformMatrixToGlobal(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal
            if (r0 == 0) goto Lb
            r2.transformMatrixToLocal(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal = r2
        Lb:
            return
    }
}
