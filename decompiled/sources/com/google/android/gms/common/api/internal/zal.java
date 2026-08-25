package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zal {
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaa;
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String> zab;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zac;
    private int zad;
    private boolean zae;

    public zal(java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> r4) {
            r3 = this;
            r3.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r3.zab = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r3.zac = r0
            r0 = 0
            r3.zae = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r3.zaa = r0
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            com.google.android.gms.common.api.HasApiKey r0 = (com.google.android.gms.common.api.HasApiKey) r0
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r1 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.getApiKey()
            r2 = 0
            r1.put(r0, r2)
            goto L1f
        L36:
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r4 = r3.zaa
            java.util.Set r4 = r4.keySet()
            int r4 = r4.size()
            r3.zad = r4
            return
    }

    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zaa() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> r0 = r1.zac
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    public final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zab() {
            r1 = this;
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r1.zaa
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public final void zac(com.google.android.gms.common.api.internal.ApiKey<?> r2, com.google.android.gms.common.ConnectionResult r3, @androidx.annotation.Nullable java.lang.String r4) {
            r1 = this;
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r0 = r1.zaa
            r0.put(r2, r3)
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String> r0 = r1.zab
            r0.put(r2, r4)
            int r2 = r1.zad
            int r2 = r2 + (-1)
            r1.zad = r2
            boolean r2 = r3.isSuccess()
            if (r2 != 0) goto L19
            r2 = 1
            r1.zae = r2
        L19:
            int r2 = r1.zad
            if (r2 != 0) goto L35
            boolean r2 = r1.zae
            if (r2 == 0) goto L2e
            com.google.android.gms.common.api.AvailabilityException r2 = new com.google.android.gms.common.api.AvailabilityException
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r3 = r1.zaa
            r2.<init>(r3)
            com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> r3 = r1.zac
            r3.setException(r2)
            return
        L2e:
            com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> r2 = r1.zac
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String> r3 = r1.zab
            r2.setResult(r3)
        L35:
            return
    }
}
