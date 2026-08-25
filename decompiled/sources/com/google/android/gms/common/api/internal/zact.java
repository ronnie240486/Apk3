package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> zaa = null;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> zad;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zae;
    private final com.google.android.gms.common.internal.ClientSettings zaf;
    private com.google.android.gms.signin.zae zag;
    private com.google.android.gms.common.api.internal.zacs zah;

    static {
            com.google.android.gms.common.api.Api$AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> r0 = com.google.android.gms.signin.zad.zac
            com.google.android.gms.common.api.internal.zact.zaa = r0
            return
    }

    @androidx.annotation.WorkerThread
    public zact(android.content.Context r2, android.os.Handler r3, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r4) {
            r1 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r0 = com.google.android.gms.common.api.internal.zact.zaa
            r1.<init>()
            r1.zab = r2
            r1.zac = r3
            java.lang.String r2 = "ClientSettings must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r2)
            com.google.android.gms.common.internal.ClientSettings r2 = (com.google.android.gms.common.internal.ClientSettings) r2
            r1.zaf = r2
            java.util.Set r2 = r4.getRequiredScopes()
            r1.zae = r2
            r1.zad = r0
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zacs zac(com.google.android.gms.common.api.internal.zact r0) {
            com.google.android.gms.common.api.internal.zacs r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.internal.zact r3, com.google.android.gms.signin.internal.zak r4) {
            com.google.android.gms.common.ConnectionResult r0 = r4.zaa()
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L49
            com.google.android.gms.common.internal.zav r4 = r4.zab()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.zav r4 = (com.google.android.gms.common.internal.zav) r4
            com.google.android.gms.common.ConnectionResult r0 = r4.zaa()
            boolean r1 = r0.isSuccess()
            if (r1 != 0) goto L3d
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "SignInCoordinator"
            android.util.Log.wtf(r2, r4, r1)
            com.google.android.gms.common.api.internal.zacs r4 = r3.zah
            r4.zae(r0)
            com.google.android.gms.signin.zae r3 = r3.zag
            r3.disconnect()
            return
        L3d:
            com.google.android.gms.common.api.internal.zacs r0 = r3.zah
            com.google.android.gms.common.internal.IAccountAccessor r4 = r4.zab()
            java.util.Set<com.google.android.gms.common.api.Scope> r1 = r3.zae
            r0.zaf(r4, r1)
            goto L4e
        L49:
            com.google.android.gms.common.api.internal.zacs r4 = r3.zah
            r4.zae(r0)
        L4e:
            com.google.android.gms.signin.zae r3 = r3.zag
            r3.disconnect()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @androidx.annotation.WorkerThread
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.signin.zae r1 = r0.zag
            r1.zad(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @androidx.annotation.WorkerThread
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zacs r0 = r1.zah
            r0.zae(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @androidx.annotation.WorkerThread
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            com.google.android.gms.signin.zae r1 = r0.zag
            r1.disconnect()
            return
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @androidx.annotation.BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak r3) {
            r2 = this;
            android.os.Handler r0 = r2.zac
            com.google.android.gms.common.api.internal.zacr r1 = new com.google.android.gms.common.api.internal.zacr
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zae(com.google.android.gms.common.api.internal.zacs r10) {
            r9 = this;
            com.google.android.gms.signin.zae r0 = r9.zag
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            com.google.android.gms.common.internal.ClientSettings r0 = r9.zaf
            int r1 = java.lang.System.identityHashCode(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zae(r1)
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r2 = r9.zad
            android.content.Context r3 = r9.zab
            android.os.Handler r0 = r9.zac
            android.os.Looper r4 = r0.getLooper()
            com.google.android.gms.common.internal.ClientSettings r5 = r9.zaf
            com.google.android.gms.signin.SignInOptions r6 = r5.zaa()
            r7 = r9
            r8 = r9
            com.google.android.gms.common.api.Api$Client r0 = r2.buildClient(r3, r4, r5, r6, r7, r8)
            r9.zag = r0
            r9.zah = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r9.zae
            if (r10 == 0) goto L3f
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L39
            goto L3f
        L39:
            com.google.android.gms.signin.zae r10 = r9.zag
            r10.zab()
            return
        L3f:
            android.os.Handler r10 = r9.zac
            com.google.android.gms.common.api.internal.zacq r0 = new com.google.android.gms.common.api.internal.zacq
            r0.<init>(r9)
            r10.post(r0)
            return
    }

    public final void zaf() {
            r1 = this;
            com.google.android.gms.signin.zae r0 = r1.zag
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            return
    }
}
