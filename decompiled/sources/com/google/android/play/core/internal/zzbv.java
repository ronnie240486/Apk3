package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzbv {
    private final java.lang.Object zza;
    private final java.lang.reflect.Field zzb;
    private final java.lang.Class zzc;

    public zzbv(java.lang.Object r1, java.lang.reflect.Field r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final java.lang.Object zzc() {
            r5 = this;
            java.lang.Class r0 = r5.zzc     // Catch: java.lang.Exception -> Lf
            java.lang.reflect.Field r1 = r5.zzb     // Catch: java.lang.Exception -> Lf
            java.lang.Object r2 = r5.zza     // Catch: java.lang.Exception -> Lf
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = move-exception
            com.google.android.play.core.internal.zzbx r1 = new com.google.android.play.core.internal.zzbx
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.reflect.Field r4 = r5.zzb
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r3 = 1
            java.lang.Object r4 = r5.zza
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r3 = 2
            java.lang.Class r4 = r5.zzc
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            java.lang.String r3 = "Failed to get value of field %s of type %s on object of type %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2, r0)
            throw r1
    }

    public final java.lang.reflect.Field zzd() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.zzb
            return r0
    }

    public final void zze(java.lang.Object r5) {
            r4 = this;
            java.lang.reflect.Field r0 = r4.zzb     // Catch: java.lang.Exception -> L8
            java.lang.Object r1 = r4.zza     // Catch: java.lang.Exception -> L8
            r0.set(r1, r5)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r5 = move-exception
            com.google.android.play.core.internal.zzbx r0 = new com.google.android.play.core.internal.zzbx
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.reflect.Field r3 = r4.zzb
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r2 = 1
            java.lang.Object r3 = r4.zza
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r2 = 2
            java.lang.Class r3 = r4.zzc
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            java.lang.String r2 = "Failed to set value of field %s of type %s on object of type %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }
}
