package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzk {
    private final java.util.Map zza;

    public /* synthetic */ zzk(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.util.Map zza(java.util.Collection r8) {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r1 = r7.zza
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = r7.zza
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L28
            java.util.Set r3 = java.util.Collections.emptySet()
            goto L61
        L28:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Map r4 = r7.zza
            java.lang.Object r4 = r4.get(r2)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L3d
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.add(r5)
            goto L3d
        L5d:
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
        L61:
            r0.put(r2, r3)
            goto Lf
        L65:
            return r0
    }
}
