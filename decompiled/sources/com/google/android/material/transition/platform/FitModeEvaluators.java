package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
class FitModeEvaluators {
    private static final com.google.android.material.transition.platform.FitModeEvaluator HEIGHT = null;
    private static final com.google.android.material.transition.platform.FitModeEvaluator WIDTH = null;



    static {
            com.google.android.material.transition.platform.FitModeEvaluators$1 r0 = new com.google.android.material.transition.platform.FitModeEvaluators$1
            r0.<init>()
            com.google.android.material.transition.platform.FitModeEvaluators.WIDTH = r0
            com.google.android.material.transition.platform.FitModeEvaluators$2 r0 = new com.google.android.material.transition.platform.FitModeEvaluators$2
            r0.<init>()
            com.google.android.material.transition.platform.FitModeEvaluators.HEIGHT = r0
            return
    }

    private FitModeEvaluators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.material.transition.platform.FitModeEvaluator get(int r0, boolean r1, android.graphics.RectF r2, android.graphics.RectF r3) {
            if (r0 == 0) goto L1a
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 != r1) goto Lb
            com.google.android.material.transition.platform.FitModeEvaluator r0 = com.google.android.material.transition.platform.FitModeEvaluators.HEIGHT
            return r0
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid fit mode: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
        L17:
            com.google.android.material.transition.platform.FitModeEvaluator r0 = com.google.android.material.transition.platform.FitModeEvaluators.WIDTH
            return r0
        L1a:
            boolean r0 = shouldAutoFitToWidth(r1, r2, r3)
            if (r0 == 0) goto L23
            com.google.android.material.transition.platform.FitModeEvaluator r0 = com.google.android.material.transition.platform.FitModeEvaluators.WIDTH
            goto L25
        L23:
            com.google.android.material.transition.platform.FitModeEvaluator r0 = com.google.android.material.transition.platform.FitModeEvaluators.HEIGHT
        L25:
            return r0
    }

    private static boolean shouldAutoFitToWidth(boolean r4, android.graphics.RectF r5, android.graphics.RectF r6) {
            float r0 = r5.width()
            float r5 = r5.height()
            float r1 = r6.width()
            float r6 = r6.height()
            float r2 = r6 * r0
            float r2 = r2 / r1
            float r1 = r1 * r5
            float r1 = r1 / r0
            r0 = 1
            r3 = 0
            if (r4 == 0) goto L1f
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L24
            goto L25
        L1f:
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 < 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }
}
