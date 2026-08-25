package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zae extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference<android.widget.ImageView> zac;

    public zae(android.widget.ImageView r2, int r3) {
            r1 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            r1.<init>(r0, r3)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.zac = r3
            return
    }

    public zae(android.widget.ImageView r2, android.net.Uri r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.zac = r3
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.common.images.zae
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.images.zae r4 = (com.google.android.gms.common.images.zae) r4
            java.lang.ref.WeakReference<android.widget.ImageView> r1 = r3.zac
            java.lang.Object r1 = r1.get()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.ref.WeakReference<android.widget.ImageView> r4 = r4.zac
            java.lang.Object r4 = r4.get()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L27
            if (r1 == 0) goto L27
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r1)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3, boolean r4, boolean r5, boolean r6) {
            r2 = this;
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r2.zac
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L4e
            r1 = 0
            if (r5 != 0) goto L17
            if (r6 != 0) goto L17
            boolean r6 = r0 instanceof com.google.android.gms.internal.base.zaj
            if (r6 != 0) goto L14
            goto L17
        L14:
            com.google.android.gms.internal.base.zaj r0 = (com.google.android.gms.internal.base.zaj) r0
            throw r1
        L17:
            r6 = 0
            if (r5 != 0) goto L1e
            if (r4 == 0) goto L1d
            goto L1e
        L1d:
            r6 = 1
        L1e:
            if (r6 == 0) goto L38
            android.graphics.drawable.Drawable r4 = r0.getDrawable()
            if (r4 == 0) goto L31
            boolean r5 = r4 instanceof com.google.android.gms.internal.base.zai
            if (r5 == 0) goto L32
            com.google.android.gms.internal.base.zai r4 = (com.google.android.gms.internal.base.zai) r4
            android.graphics.drawable.Drawable r4 = r4.zaa()
            goto L32
        L31:
            r4 = r1
        L32:
            com.google.android.gms.internal.base.zai r5 = new com.google.android.gms.internal.base.zai
            r5.<init>(r4, r3)
            r3 = r5
        L38:
            r0.setImageDrawable(r3)
            boolean r4 = r0 instanceof com.google.android.gms.internal.base.zaj
            if (r4 != 0) goto L4b
            if (r3 == 0) goto L4e
            if (r6 == 0) goto L4e
            com.google.android.gms.internal.base.zai r3 = (com.google.android.gms.internal.base.zai) r3
            r4 = 250(0xfa, float:3.5E-43)
            r3.zab(r4)
            return
        L4b:
            com.google.android.gms.internal.base.zaj r0 = (com.google.android.gms.internal.base.zaj) r0
            throw r1
        L4e:
            return
    }
}
