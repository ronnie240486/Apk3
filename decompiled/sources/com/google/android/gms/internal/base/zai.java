package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zai extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private com.google.android.gms.internal.base.zah zai;
    private android.graphics.drawable.Drawable zaj;
    private android.graphics.drawable.Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zai(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            if (r3 != 0) goto La
            com.google.android.gms.internal.base.zag r3 = com.google.android.gms.internal.base.zag.zaa()
        La:
            r2.zaj = r3
            r3.setCallback(r2)
            com.google.android.gms.internal.base.zah r0 = r2.zai
            int r1 = r0.zab
            int r3 = r3.getChangingConfigurations()
            r3 = r3 | r1
            r0.zab = r3
            if (r4 != 0) goto L20
            com.google.android.gms.internal.base.zag r4 = com.google.android.gms.internal.base.zag.zaa()
        L20:
            r2.zak = r4
            r4.setCallback(r2)
            com.google.android.gms.internal.base.zah r3 = r2.zai
            int r0 = r3.zab
            int r4 = r4.getChangingConfigurations()
            r4 = r4 | r0
            r3.zab = r4
            return
    }

    public zai(@androidx.annotation.Nullable com.google.android.gms.internal.base.zah r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zaa = r0
            r1 = 255(0xff, float:3.57E-43)
            r2.zad = r1
            r2.zaf = r0
            r0 = 1
            r2.zag = r0
            com.google.android.gms.internal.base.zah r0 = new com.google.android.gms.internal.base.zah
            r0.<init>(r3)
            r2.zai = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r7.zaa
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L39
            if (r0 == r1) goto La
            goto L42
        La:
            long r0 = r7.zab
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L42
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.zab
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r7.zae
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L25
            goto L26
        L25:
            r3 = 0
        L26:
            if (r3 == 0) goto L2a
            r7.zaa = r2
        L2a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.zac
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.zaf = r0
            goto L42
        L39:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7.zab = r3
            r7.zaa = r1
            r3 = 0
        L42:
            int r0 = r7.zaf
            boolean r1 = r7.zag
            android.graphics.drawable.Drawable r4 = r7.zaj
            android.graphics.drawable.Drawable r5 = r7.zak
            if (r3 == 0) goto L61
            if (r1 == 0) goto L51
            if (r0 != 0) goto L56
            goto L52
        L51:
            r2 = r0
        L52:
            r4.draw(r8)
            r0 = r2
        L56:
            int r1 = r7.zad
            if (r0 != r1) goto L60
            r5.setAlpha(r1)
            r5.draw(r8)
        L60:
            return
        L61:
            if (r1 == 0) goto L69
            int r2 = r7.zad
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L69:
            r4.draw(r8)
            if (r1 == 0) goto L73
            int r1 = r7.zad
            r4.setAlpha(r1)
        L73:
            if (r0 <= 0) goto L80
            r5.setAlpha(r0)
            r5.draw(r8)
            int r8 = r7.zad
            r5.setAlpha(r8)
        L80:
            r7.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r3 = this;
            int r0 = super.getChangingConfigurations()
            com.google.android.gms.internal.base.zah r1 = r3.zai
            int r2 = r1.zaa
            r0 = r0 | r2
            int r1 = r1.zab
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            boolean r0 = r2.zac()
            if (r0 == 0) goto L11
            com.google.android.gms.internal.base.zah r0 = r2.zai
            int r1 = r2.getChangingConfigurations()
            r0.zaa = r1
            com.google.android.gms.internal.base.zah r0 = r2.zai
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.zaj
            int r0 = r0.getIntrinsicHeight()
            android.graphics.drawable.Drawable r1 = r2.zak
            int r1 = r1.getIntrinsicHeight()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.zaj
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r2.zak
            int r1 = r1.getIntrinsicWidth()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r2 = this;
            boolean r0 = r2.zan
            if (r0 != 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.zaj
            int r0 = r0.getOpacity()
            android.graphics.drawable.Drawable r1 = r2.zak
            int r1 = r1.getOpacity()
            int r0 = android.graphics.drawable.Drawable.resolveOpacity(r0, r1)
            r2.zao = r0
            r0 = 1
            r2.zan = r0
        L19:
            int r0 = r2.zao
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.zah
            if (r0 != 0) goto L26
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L26
            boolean r0 = r2.zac()
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r2.zaj
            r0.mutate()
            android.graphics.drawable.Drawable r0 = r2.zak
            r0.mutate()
            r0 = 1
            r2.zah = r0
            goto L26
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated."
            r0.<init>(r1)
            throw r0
        L26:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zaj
            r0.setBounds(r2)
            android.graphics.drawable.Drawable r0 = r1.zak
            r0.setBounds(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
            r2 = this;
            int r0 = r2.zaf
            int r1 = r2.zad
            if (r0 != r1) goto L8
            r2.zaf = r3
        L8:
            r2.zad = r3
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zaj
            r0.setColorFilter(r2)
            android.graphics.drawable.Drawable r0 = r1.zak
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }

    public final android.graphics.drawable.Drawable zaa() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zak
            return r0
    }

    public final void zab(int r1) {
            r0 = this;
            int r1 = r0.zad
            r0.zac = r1
            r1 = 0
            r0.zaf = r1
            r1 = 250(0xfa, float:3.5E-43)
            r0.zae = r1
            r1 = 1
            r0.zaa = r1
            r0.invalidateSelf()
            return
    }

    public final boolean zac() {
            r3 = this;
            boolean r0 = r3.zal
            if (r0 != 0) goto L1b
            android.graphics.drawable.Drawable r0 = r3.zaj
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r3.zak
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 == 0) goto L17
            r2 = 1
        L17:
            r3.zam = r2
            r3.zal = r1
        L1b:
            boolean r0 = r3.zam
            return r0
    }
}
