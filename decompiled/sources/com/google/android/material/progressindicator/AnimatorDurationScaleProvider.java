package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    public AnimatorDurationScaleProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.VisibleForTesting
    public static void setDefaultSystemAnimatorDurationScale(float r0) {
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider.defaultSystemAnimatorDurationScale = r0
            return
    }

    public float getSystemAnimatorDurationScale(@androidx.annotation.NonNull android.content.ContentResolver r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "animator_duration_scale"
            float r3 = android.provider.Settings.Global.getFloat(r3, r1, r0)
            return r3
    }
}
