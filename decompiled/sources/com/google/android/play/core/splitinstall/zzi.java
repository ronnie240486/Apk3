package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    private final java.util.Map zza;

    public zzi() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.play.core.splitinstall.zzi zza(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.util.Map r0 = r2.zza
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L12
            java.util.Map r0 = r2.zza
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.put(r4, r1)
        L12:
            java.util.Map r0 = r2.zza
            java.lang.Object r4 = r0.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r3, r5)
            return r2
    }

    public final com.google.android.play.core.splitinstall.zzk zzb() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r1 = r5.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r4 = new java.util.HashMap
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            r4.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r4)
            r0.put(r3, r2)
            goto Lf
        L34:
            com.google.android.play.core.splitinstall.zzk r1 = new com.google.android.play.core.splitinstall.zzk
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            r1.<init>(r0)
            return r1
    }
}
