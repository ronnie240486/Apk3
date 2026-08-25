package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableCrossFadeTransition implements com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> {
    private final int duration;
    private final boolean isCrossFadeEnabled;

    public DrawableCrossFadeTransition(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.duration = r1
            r0.isCrossFadeEnabled = r2
            return
    }

    /* JADX INFO: renamed from: transition, reason: avoid collision after fix types in other method */
    public boolean transition2(android.graphics.drawable.Drawable r5, com.bumptech.glide.request.transition.Transition.ViewAdapter r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r6.getCurrentDrawable()
            r1 = 0
            if (r0 != 0) goto Lc
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
        Lc:
            android.graphics.drawable.TransitionDrawable r2 = new android.graphics.drawable.TransitionDrawable
            r3 = 2
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
            r3[r1] = r0
            r0 = 1
            r3[r0] = r5
            r2.<init>(r3)
            boolean r5 = r4.isCrossFadeEnabled
            r2.setCrossFadeEnabled(r5)
            int r5 = r4.duration
            r2.startTransition(r5)
            r6.setDrawable(r2)
            return r0
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public /* bridge */ /* synthetic */ boolean transition(android.graphics.drawable.Drawable r1, com.bumptech.glide.request.transition.Transition.ViewAdapter r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r1 = r0.transition2(r1, r2)
            return r1
    }
}
