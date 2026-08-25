package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
class FadeModeResult {
    public final int endAlpha;
    public final boolean endOnTop;
    public final int startAlpha;

    private FadeModeResult(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.startAlpha = r1
            r0.endAlpha = r2
            r0.endOnTop = r3
            return
    }

    public static com.google.android.material.transition.platform.FadeModeResult endOnTop(int r3) {
            com.google.android.material.transition.platform.FadeModeResult r0 = new com.google.android.material.transition.platform.FadeModeResult
            r1 = 255(0xff, float:3.57E-43)
            r2 = 1
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static com.google.android.material.transition.platform.FadeModeResult startOnTop(int r2, int r3) {
            com.google.android.material.transition.platform.FadeModeResult r0 = new com.google.android.material.transition.platform.FadeModeResult
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
