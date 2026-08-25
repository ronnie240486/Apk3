package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zag {
    public final com.google.android.gms.common.images.zad zaa;
    public int zab;

    public zag(android.net.Uri r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zab = r0
            com.google.android.gms.common.images.zad r0 = new com.google.android.gms.common.images.zad
            r0.<init>(r2)
            r1.zaa = r0
            r1.zab = r3
            return
    }

    public abstract void zaa(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, boolean r2, boolean r3, boolean r4);

    public final void zab(android.content.Context r2, boolean r3) {
            r1 = this;
            int r0 = r1.zab
            if (r0 == 0) goto Ld
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            goto Le
        Ld:
            r2 = 0
        Le:
            r0 = 0
            r1.zaa(r2, r3, r0, r0)
            return
    }
}
