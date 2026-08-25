package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa implements com.google.android.gms.tasks.Continuation<java.lang.Void, java.util.List> {
    public final /* synthetic */ java.util.Collection zza;

    public zzaa(java.util.Collection r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.util.List then(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<java.lang.Void> r3) throws java.lang.Exception {
            r2 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r0 = r2.zza
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.tasks.Task r1 = (com.google.android.gms.tasks.Task) r1
            java.lang.Object r1 = r1.getResult()
            r3.add(r1)
            goto Lb
        L1f:
            return r3
    }
}
