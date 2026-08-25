package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbu extends com.google.android.play.core.internal.zzbv {
    public zzbu(java.lang.Object r2, java.lang.reflect.Field r3, java.lang.Class r4) {
            r1 = this;
            r0 = 0
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            r1.<init>(r2, r3, r4)
            return
    }

    private final java.lang.Class zzf() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.zzd()
            java.lang.Class r0 = r0.getType()
            java.lang.Class r0 = r0.getComponentType()
            return r0
    }

    public final void zza(java.util.Collection r6) {
            r5 = this;
            java.lang.Object r0 = r5.zzc()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = 0
            goto Lc
        Lb:
            int r2 = r0.length
        Lc:
            java.lang.Class r3 = r5.zzf()
            int r4 = r6.size()
            int r4 = r4 + r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            if (r0 == 0) goto L21
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r4)
        L21:
            java.util.Iterator r6 = r6.iterator()
        L25:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r6.next()
            r3[r2] = r0
            int r2 = r2 + 1
            goto L25
        L34:
            r5.zze(r3)
            return
    }

    public final void zzb(java.util.Collection r6) {
            r5 = this;
            java.lang.Object r0 = r5.zzc()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = 0
            goto Lc
        Lb:
            int r2 = r0.length
        Lc:
            java.lang.Class r3 = r5.zzf()
            int r4 = r6.size()
            int r4 = r4 + r2
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            if (r0 == 0) goto L25
            int r3 = r6.size()
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L25:
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r6.next()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L29
        L38:
            r5.zze(r2)
            return
    }
}
