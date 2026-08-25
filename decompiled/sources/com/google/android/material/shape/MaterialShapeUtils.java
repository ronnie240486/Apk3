package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.shape.CornerTreatment createCornerTreatment(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Lb
            com.google.android.material.shape.RoundedCornerTreatment r1 = new com.google.android.material.shape.RoundedCornerTreatment
            r1.<init>()
            return r1
        Lb:
            com.google.android.material.shape.CutCornerTreatment r1 = new com.google.android.material.shape.CutCornerTreatment
            r1.<init>()
            return r1
        L11:
            com.google.android.material.shape.RoundedCornerTreatment r1 = new com.google.android.material.shape.RoundedCornerTreatment
            r1.<init>()
            return r1
    }

    public static void setElevation(@androidx.annotation.NonNull android.view.View r1, float r2) {
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r0 = r1 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r1 = (com.google.android.material.shape.MaterialShapeDrawable) r1
            r1.setElevation(r2)
        Ld:
            return
    }

    public static void setParentAbsoluteElevation(@androidx.annotation.NonNull android.view.View r2) {
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r1 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
            setParentAbsoluteElevation(r2, r0)
        Ld:
            return
    }

    public static void setParentAbsoluteElevation(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull com.google.android.material.shape.MaterialShapeDrawable r2) {
            boolean r0 = r2.isElevationOverlayEnabled()
            if (r0 == 0) goto Ld
            float r1 = com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(r1)
            r2.setParentAbsoluteElevation(r1)
        Ld:
            return
    }
}
