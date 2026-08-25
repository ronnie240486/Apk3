package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
class FadeModeEvaluators {
    private static final com.google.android.material.transition.platform.FadeModeEvaluator CROSS = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator IN = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator OUT = null;
    private static final com.google.android.material.transition.platform.FadeModeEvaluator THROUGH = null;





    static {
            com.google.android.material.transition.platform.FadeModeEvaluators$1 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$1
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.IN = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$2 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$2
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.OUT = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$3 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$3
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.CROSS = r0
            com.google.android.material.transition.platform.FadeModeEvaluators$4 r0 = new com.google.android.material.transition.platform.FadeModeEvaluators$4
            r0.<init>()
            com.google.android.material.transition.platform.FadeModeEvaluators.THROUGH = r0
            return
    }

    private FadeModeEvaluators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.material.transition.platform.FadeModeEvaluator get(int r1, boolean r2) {
            if (r1 == 0) goto L25
            r0 = 1
            if (r1 == r0) goto L1d
            r2 = 2
            if (r1 == r2) goto L1a
            r2 = 3
            if (r1 != r2) goto Le
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.THROUGH
            return r1
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid fade mode: "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            r2.<init>(r1)
            throw r2
        L1a:
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.CROSS
            return r1
        L1d:
            if (r2 == 0) goto L22
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.OUT
            goto L24
        L22:
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.IN
        L24:
            return r1
        L25:
            if (r2 == 0) goto L2a
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.IN
            goto L2c
        L2a:
            com.google.android.material.transition.platform.FadeModeEvaluator r1 = com.google.android.material.transition.platform.FadeModeEvaluators.OUT
        L2c:
            return r1
    }
}
