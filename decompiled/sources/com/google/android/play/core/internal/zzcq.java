package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcq implements com.google.android.play.core.internal.zzcs, com.google.android.play.core.internal.zzco {
    private static final java.lang.Object zza = null;
    private volatile com.google.android.play.core.internal.zzcs zzb;
    private volatile java.lang.Object zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.play.core.internal.zzcq.zza = r0
            return
    }

    private zzcq(com.google.android.play.core.internal.zzcs r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.play.core.internal.zzcq.zza
            r1.zzc = r0
            r1.zzb = r2
            return
    }

    public static com.google.android.play.core.internal.zzco zzb(com.google.android.play.core.internal.zzcs r1) {
            boolean r0 = r1 instanceof com.google.android.play.core.internal.zzco
            if (r0 == 0) goto L7
            com.google.android.play.core.internal.zzco r1 = (com.google.android.play.core.internal.zzco) r1
            return r1
        L7:
            com.google.android.play.core.internal.zzcq r0 = new com.google.android.play.core.internal.zzcq
            java.util.Objects.requireNonNull(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.play.core.internal.zzcs zzc(com.google.android.play.core.internal.zzcs r1) {
            java.util.Objects.requireNonNull(r1)
            boolean r0 = r1 instanceof com.google.android.play.core.internal.zzcq
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.android.play.core.internal.zzcq r0 = new com.google.android.play.core.internal.zzcq
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final java.lang.Object zza() {
            r5 = this;
            java.lang.Object r0 = r5.zzc
            java.lang.Object r1 = com.google.android.play.core.internal.zzcq.zza
            if (r0 != r1) goto L59
            monitor-enter(r5)
            java.lang.Object r0 = r5.zzc     // Catch: java.lang.Throwable -> L56
            if (r0 != r1) goto L54
            com.google.android.play.core.internal.zzcs r0 = r5.zzb     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r5.zzc     // Catch: java.lang.Throwable -> L56
            if (r2 == r1) goto L4f
            if (r2 != r0) goto L18
            goto L4f
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L56
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + 118
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "Scoped provider was invoked recursively returning different results: "
            r4.append(r3)     // Catch: java.lang.Throwable -> L56
            r4.append(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = " & "
            r4.append(r2)     // Catch: java.lang.Throwable -> L56
            r4.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = ". This is likely due to a circular dependency."
            r4.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L56
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L56
            throw r1     // Catch: java.lang.Throwable -> L56
        L4f:
            r5.zzc = r0     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r5.zzb = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            throw r0
        L59:
            return r0
    }
}
