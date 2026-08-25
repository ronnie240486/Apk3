package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabs {
    private final com.google.android.gms.common.api.internal.ApiKey<?> zaa;
    private final com.google.android.gms.common.Feature zab;

    public /* synthetic */ zabs(com.google.android.gms.common.api.internal.ApiKey r1, com.google.android.gms.common.Feature r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.Feature zaa(com.google.android.gms.common.api.internal.zabs r0) {
            com.google.android.gms.common.Feature r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabs r0) {
            com.google.android.gms.common.api.internal.ApiKey<?> r0 = r0.zaa
            return r0
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r4 instanceof com.google.android.gms.common.api.internal.zabs
            if (r1 == 0) goto L1f
            com.google.android.gms.common.api.internal.zabs r4 = (com.google.android.gms.common.api.internal.zabs) r4
            com.google.android.gms.common.api.internal.ApiKey<?> r1 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey<?> r2 = r4.zaa
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L1f
            com.google.android.gms.common.Feature r1 = r3.zab
            com.google.android.gms.common.Feature r4 = r4.zab
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r1, r4)
            if (r4 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.common.api.internal.ApiKey<?> r1 = r3.zaa
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.common.Feature r1 = r3.zab
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            com.google.android.gms.common.api.internal.ApiKey<?> r1 = r3.zaa
            java.lang.String r2 = "key"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.common.Feature r1 = r3.zab
            java.lang.String r2 = "feature"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
