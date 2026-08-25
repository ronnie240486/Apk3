package com.google.android.material.animation;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class AnimatorSetCompat {
    public AnimatorSetCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void playTogether(@androidx.annotation.NonNull android.animation.AnimatorSet r10, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r11) {
            int r0 = r11.size()
            r1 = 0
            r2 = 0
            r4 = 0
        L8:
            if (r4 >= r0) goto L20
            java.lang.Object r5 = r11.get(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r8 = r8 + r6
            long r2 = java.lang.Math.max(r2, r8)
            int r4 = r4 + 1
            goto L8
        L20:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0034: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r2)
            r11.add(r1, r0)
            r10.playTogether(r11)
            return
    }
}
