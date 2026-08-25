package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zah extends android.graphics.drawable.Drawable.ConstantState {
    public int zaa;
    public int zab;

    public zah(@androidx.annotation.Nullable com.google.android.gms.internal.base.zah r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Ld
            int r0 = r2.zaa
            r1.zaa = r0
            int r2 = r2.zab
            r1.zab = r2
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            com.google.android.gms.internal.base.zai r0 = new com.google.android.gms.internal.base.zai
            r0.<init>(r1)
            return r0
    }
}
