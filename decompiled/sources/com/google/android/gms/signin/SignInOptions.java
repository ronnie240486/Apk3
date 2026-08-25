package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {

    @androidx.annotation.NonNull
    public static final com.google.android.gms.signin.SignInOptions zaa = null;
    private final boolean zab;
    private final boolean zac;

    @androidx.annotation.Nullable
    private final java.lang.String zad;
    private final boolean zae;

    @androidx.annotation.Nullable
    private final java.lang.String zaf;

    @androidx.annotation.Nullable
    private final java.lang.String zag;
    private final boolean zah;

    @androidx.annotation.Nullable
    private final java.lang.Long zai;

    @androidx.annotation.Nullable
    private final java.lang.Long zaj;

    static {
            com.google.android.gms.signin.SignInOptions r0 = new com.google.android.gms.signin.SignInOptions
            r0.<init>()
            com.google.android.gms.signin.SignInOptions.zaa = r0
            return
    }

    public /* synthetic */ SignInOptions() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zab = r0
            r2.zac = r0
            r1 = 0
            r2.zad = r1
            r2.zae = r0
            r2.zah = r0
            r2.zaf = r1
            r2.zag = r1
            r2.zai = r1
            r2.zaj = r1
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.signin.SignInOptions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.signin.SignInOptions r4 = (com.google.android.gms.signin.SignInOptions) r4
            boolean r4 = r4.zab
            r4 = 0
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2e
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2e
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2e
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2e
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r4 == 0) goto L2e
            return r0
        L2e:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            r0[r2] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r3 = 0
            r0[r2] = r3
            r2 = 3
            r0[r2] = r1
            r2 = 4
            r0[r2] = r1
            r1 = 5
            r0[r1] = r3
            r1 = 6
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r1 = 8
            r0[r1] = r3
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }
}
