package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaj implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private boolean zab;

    public zaaj(com.google.android.gms.common.api.internal.zabi r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zab = r0
            r1.zaa = r2
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zac(com.google.android.gms.common.api.internal.zaaj r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zaa
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T zaa(T r1) {
            r0 = this;
            r0.zab(r1)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zab(T r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r3.zaa     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.internal.zadc r0 = r0.zai     // Catch: android.os.DeadObjectException -> L41
            r0.zaa(r4)     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.internal.zabi r0 = r3.zaa     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.Api$AnyClientKey r1 = r4.getClientKey()     // Catch: android.os.DeadObjectException -> L41
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r0.zac     // Catch: android.os.DeadObjectException -> L41
            java.lang.Object r0 = r0.get(r1)     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.Api$Client r0 = (com.google.android.gms.common.api.Api.Client) r0     // Catch: android.os.DeadObjectException -> L41
            java.lang.String r1 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)     // Catch: android.os.DeadObjectException -> L41
            boolean r1 = r0.isConnected()     // Catch: android.os.DeadObjectException -> L41
            if (r1 != 0) goto L3d
            com.google.android.gms.common.api.internal.zabi r1 = r3.zaa     // Catch: android.os.DeadObjectException -> L41
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.zab     // Catch: android.os.DeadObjectException -> L41
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r4.getClientKey()     // Catch: android.os.DeadObjectException -> L41
            boolean r1 = r1.containsKey(r2)     // Catch: android.os.DeadObjectException -> L41
            if (r1 == 0) goto L3d
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch: android.os.DeadObjectException -> L41
            r1 = 17
            r0.<init>(r1)     // Catch: android.os.DeadObjectException -> L41
            r4.setFailedResult(r0)     // Catch: android.os.DeadObjectException -> L41
            goto L4b
        L3d:
            r4.run(r0)     // Catch: android.os.DeadObjectException -> L41
            goto L4b
        L41:
            com.google.android.gms.common.api.internal.zabi r0 = r3.zaa
            com.google.android.gms.common.api.internal.zaah r1 = new com.google.android.gms.common.api.internal.zaah
            r1.<init>(r3, r3)
            r0.zal(r1)
        L4b:
            return r4
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
            r2 = this;
            boolean r0 = r2.zab
            if (r0 == 0) goto L11
            r0 = 0
            r2.zab = r0
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            com.google.android.gms.common.api.internal.zaai r1 = new com.google.android.gms.common.api.internal.zaai
            r1.<init>(r2, r2)
            r0.zal(r1)
        L11:
            return
    }

    public final void zaf() {
            r1 = this;
            boolean r0 = r1.zab
            if (r0 == 0) goto L13
            r0 = 0
            r1.zab = r0
            com.google.android.gms.common.api.internal.zabi r0 = r1.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            com.google.android.gms.common.api.internal.zadc r0 = r0.zai
            r0.zab()
            r1.zaj()
        L13:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api<?> r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            r1 = 0
            r0.zak(r1)
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            com.google.android.gms.common.api.internal.zabz r0 = r0.zah
            boolean r1 = r2.zab
            r0.zac(r3, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
            r4 = this;
            boolean r0 = r4.zab
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r0.zah
            r2 = 1
            if (r0 == 0) goto L2c
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L2c
            r4.zab = r2
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.zada r2 = (com.google.android.gms.common.api.internal.zada) r2
            r2.zah()
            goto L1b
        L2b:
            return r1
        L2c:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zaa
            r1 = 0
            r0.zak(r1)
            return r2
    }
}
