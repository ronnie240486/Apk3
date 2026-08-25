package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzad<E> extends com.google.android.gms.internal.common.zzaa<E> {
    public zzad() {
            r0 = this;
            r0.<init>()
            return
    }

    public zzad(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.common.zzad<E> zzb(E r1) {
            r0 = this;
            super.zza(r1)
            return r0
    }

    public final com.google.android.gms.internal.common.zzad<E> zzc(java.util.Iterator<? extends E> r2) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            super.zza(r0)
            goto L0
        Le:
            return r1
    }
}
