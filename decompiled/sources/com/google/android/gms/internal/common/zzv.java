package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzv implements java.lang.Iterable<java.lang.String> {
    public final /* synthetic */ java.lang.CharSequence zza;
    public final /* synthetic */ com.google.android.gms.internal.common.zzx zzb;

    public zzv(com.google.android.gms.internal.common.zzx r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
            r2 = this;
            com.google.android.gms.internal.common.zzx r0 = r2.zzb
            java.lang.CharSequence r1 = r2.zza
            java.util.Iterator r0 = com.google.android.gms.internal.common.zzx.zze(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r5.iterator()
            java.lang.String r2 = ", "
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L54
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L54
            java.util.Objects.requireNonNull(r3)     // Catch: java.io.IOException -> L54
            boolean r4 = r3 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L54
            if (r4 == 0) goto L24
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.io.IOException -> L54
            goto L28
        L24:
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L54
        L28:
            r0.append(r3)     // Catch: java.io.IOException -> L54
        L2b:
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L54
            if (r3 == 0) goto L4a
            r0.append(r2)     // Catch: java.io.IOException -> L54
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L54
            java.util.Objects.requireNonNull(r3)     // Catch: java.io.IOException -> L54
            boolean r4 = r3 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L54
            if (r4 == 0) goto L42
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.io.IOException -> L54
            goto L46
        L42:
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L54
        L46:
            r0.append(r3)     // Catch: java.io.IOException -> L54
            goto L2b
        L4a:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L54:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
