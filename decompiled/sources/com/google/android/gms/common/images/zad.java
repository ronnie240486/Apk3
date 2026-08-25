package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zad {
    public final android.net.Uri zaa;

    public zad(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.images.zad
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.common.images.zad r2 = (com.google.android.gms.common.images.zad) r2
            android.net.Uri r2 = r2.zaa
            android.net.Uri r0 = r1.zaa
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r0)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.net.Uri r1 = r3.zaa
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }
}
