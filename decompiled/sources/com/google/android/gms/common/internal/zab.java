package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zab {
    public final java.util.Set<com.google.android.gms.common.api.Scope> zaa;

    public zab(java.util.Set<com.google.android.gms.common.api.Scope> r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.zaa = r1
            return
    }
}
