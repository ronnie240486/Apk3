package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzae<E> extends com.google.android.gms.internal.common.zzz<E> {
    private final com.google.android.gms.internal.common.zzag<E> zza;

    public zzae(com.google.android.gms.internal.common.zzag<E> r2, int r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0, r3)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final E zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzag<E> r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
