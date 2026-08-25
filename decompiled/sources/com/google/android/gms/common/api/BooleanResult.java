package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final boolean zab;

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public BooleanResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Status must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            r1.zaa = r2
            r1.zab = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.BooleanResult
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.common.api.BooleanResult r5 = (com.google.android.gms.common.api.BooleanResult) r5
            com.google.android.gms.common.api.Status r2 = r4.zaa
            com.google.android.gms.common.api.Status r3 = r5.zaa
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            boolean r2 = r4.zab
            boolean r5 = r5.zab
            if (r2 != r5) goto L20
            return r1
        L20:
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getValue() {
            r1 = this;
            boolean r0 = r1.zab
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final int hashCode() {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = r2.zaa
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            boolean r1 = r2.zab
            int r0 = r0 + r1
            return r0
    }
}
