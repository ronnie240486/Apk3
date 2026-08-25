package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzaa<E> extends com.google.android.gms.internal.common.zzab<E> {
    public java.lang.Object[] zza;
    public int zzb;
    public boolean zzc;

    public zzaa() {
            r1 = this;
            r1.<init>()
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            return
    }

    private final void zzb(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.zza
            int r1 = r0.length
            r2 = 0
            if (r1 >= r5) goto L23
            int r3 = r1 >> 1
            int r1 = r1 + r3
            int r1 = r1 + 1
            if (r1 >= r5) goto L15
            int r5 = r5 + (-1)
            int r5 = java.lang.Integer.highestOneBit(r5)
            int r1 = r5 + r5
        L15:
            if (r1 >= 0) goto L1a
            r1 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r1)
            r4.zza = r5
            r4.zzc = r2
            return
        L23:
            boolean r5 = r4.zzc
            if (r5 == 0) goto L31
            java.lang.Object r5 = r0.clone()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r4.zza = r5
            r4.zzc = r2
        L31:
            return
    }

    public final com.google.android.gms.internal.common.zzaa<E> zza(E r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r3.zzb
            int r0 = r0 + 1
            r3.zzb(r0)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + 1
            r3.zzb = r2
            r0[r1] = r4
            return r3
    }
}
