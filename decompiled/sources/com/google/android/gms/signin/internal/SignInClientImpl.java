package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class SignInClientImpl extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.signin.internal.zaf> implements com.google.android.gms.signin.zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab;
    private final com.google.android.gms.common.internal.ClientSettings zac;
    private final android.os.Bundle zad;

    @androidx.annotation.Nullable
    private final java.lang.Integer zae;

    public SignInClientImpl(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull android.os.Looper r9, boolean r10, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r11, @androidx.annotation.NonNull android.os.Bundle r12, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r13, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r14) {
            r7 = this;
            r3 = 44
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 1
            r7.zab = r8
            r7.zac = r11
            r7.zad = r12
            java.lang.Integer r8 = r11.zab()
            r7.zae = r8
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.Bundle createBundleFromClientSettings(@androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r4) {
            r4.zaa()
            java.lang.Integer r0 = r4.zab()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.accounts.Account r4 = r4.getAccount()
            java.lang.String r2 = "com.google.android.gms.signin.internal.clientRequestedAccount"
            r1.putParcelable(r2, r4)
            if (r0 == 0) goto L20
            int r4 = r0.intValue()
            java.lang.String r0 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            r1.putInt(r0, r4)
        L20:
            java.lang.String r4 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            r0 = 0
            r1.putBoolean(r4, r0)
            java.lang.String r4 = "com.google.android.gms.signin.internal.idTokenRequested"
            r1.putBoolean(r4, r0)
            java.lang.String r4 = "com.google.android.gms.signin.internal.serverClientId"
            r2 = 0
            r1.putString(r4, r2)
            r4 = 1
            java.lang.String r3 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            r1.putBoolean(r3, r4)
            java.lang.String r4 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            r1.putBoolean(r4, r0)
            java.lang.String r4 = "com.google.android.gms.signin.internal.hostedDomain"
            r1.putString(r4, r2)
            java.lang.String r4 = "com.google.android.gms.signin.internal.logSessionId"
            r1.putString(r4, r2)
            java.lang.String r4 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            r1.putBoolean(r4, r0)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final /* synthetic */ android.os.IInterface createServiceInterface(@androidx.annotation.NonNull android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.signin.internal.zaf
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.signin.internal.zaf r3 = (com.google.android.gms.signin.internal.zaf) r3
            goto L18
        L12:
            com.google.android.gms.signin.internal.zaf r0 = new com.google.android.gms.signin.internal.zaf
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
            r3 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r3.zac
            java.lang.String r0 = r0.getRealClientPackageName()
            android.content.Context r1 = r3.getContext()
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            android.os.Bundle r0 = r3.zad
            com.google.android.gms.common.internal.ClientSettings r1 = r3.zac
            java.lang.String r1 = r1.getRealClientPackageName()
            java.lang.String r2 = "com.google.android.gms.signin.internal.realClientPackageName"
            r0.putString(r2, r1)
        L21:
            android.os.Bundle r0 = r3.zad
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r1 = this;
            boolean r0 = r1.zab
            return r0
    }

    @Override // com.google.android.gms.signin.zae
    public final void zaa() {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.signin.internal.zaf r0 = (com.google.android.gms.signin.internal.zaf) r0     // Catch: android.os.RemoteException -> L16
            java.lang.Integer r1 = r2.zae     // Catch: android.os.RemoteException -> L16
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: android.os.RemoteException -> L16
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: android.os.RemoteException -> L16
            int r1 = r1.intValue()     // Catch: android.os.RemoteException -> L16
            r0.zae(r1)     // Catch: android.os.RemoteException -> L16
            return
        L16:
            java.lang.String r0 = "SignInClientImpl"
            java.lang.String r1 = "Remote service probably died when clearAccountFromSessionStore is called"
            android.util.Log.w(r0, r1)
            return
    }

    @Override // com.google.android.gms.signin.zae
    public final void zab() {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r1)
            r1.connect(r0)
            return
    }

    @Override // com.google.android.gms.signin.zae
    public final void zac(@androidx.annotation.NonNull com.google.android.gms.common.internal.IAccountAccessor r3, boolean r4) {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.signin.internal.zaf r0 = (com.google.android.gms.signin.internal.zaf) r0     // Catch: android.os.RemoteException -> L16
            java.lang.Integer r1 = r2.zae     // Catch: android.os.RemoteException -> L16
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: android.os.RemoteException -> L16
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: android.os.RemoteException -> L16
            int r1 = r1.intValue()     // Catch: android.os.RemoteException -> L16
            r0.zaf(r3, r1, r4)     // Catch: android.os.RemoteException -> L16
            return
        L16:
            java.lang.String r3 = "SignInClientImpl"
            java.lang.String r4 = "Remote service probably died when saveDefaultAccount is called"
            android.util.Log.w(r3, r4)
            return
    }

    @Override // com.google.android.gms.signin.zae
    public final void zad(com.google.android.gms.signin.internal.zae r8) {
            r7 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            r0 = 1
            r1 = 0
            com.google.android.gms.common.internal.ClientSettings r2 = r7.zac     // Catch: android.os.RemoteException -> L45
            android.accounts.Account r2 = r2.getAccountOrDefault()     // Catch: android.os.RemoteException -> L45
            java.lang.String r3 = "<<default account>>"
            java.lang.String r4 = r2.name     // Catch: android.os.RemoteException -> L45
            boolean r3 = r3.equals(r4)     // Catch: android.os.RemoteException -> L45
            if (r3 == 0) goto L24
            android.content.Context r3 = r7.getContext()     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.auth.api.signin.internal.Storage r3 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r3)     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r3.getSavedDefaultGoogleSignInAccount()     // Catch: android.os.RemoteException -> L45
            goto L25
        L24:
            r3 = r1
        L25:
            com.google.android.gms.common.internal.zat r4 = new com.google.android.gms.common.internal.zat     // Catch: android.os.RemoteException -> L45
            java.lang.Integer r5 = r7.zae     // Catch: android.os.RemoteException -> L45
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: android.os.RemoteException -> L45
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: android.os.RemoteException -> L45
            int r5 = r5.intValue()     // Catch: android.os.RemoteException -> L45
            r4.<init>(r2, r5, r3)     // Catch: android.os.RemoteException -> L45
            android.os.IInterface r2 = r7.getService()     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.signin.internal.zaf r2 = (com.google.android.gms.signin.internal.zaf) r2     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.signin.internal.zai r3 = new com.google.android.gms.signin.internal.zai     // Catch: android.os.RemoteException -> L45
            r3.<init>(r0, r4)     // Catch: android.os.RemoteException -> L45
            r2.zag(r3, r8)     // Catch: android.os.RemoteException -> L45
            return
        L45:
            r2 = move-exception
            java.lang.String r3 = "SignInClientImpl"
            java.lang.String r4 = "Remote service probably died when signIn is called"
            android.util.Log.w(r3, r4)
            com.google.android.gms.signin.internal.zak r4 = new com.google.android.gms.signin.internal.zak     // Catch: android.os.RemoteException -> L5d
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult     // Catch: android.os.RemoteException -> L5d
            r6 = 8
            r5.<init>(r6, r1)     // Catch: android.os.RemoteException -> L5d
            r4.<init>(r0, r5, r1)     // Catch: android.os.RemoteException -> L5d
            r8.zab(r4)     // Catch: android.os.RemoteException -> L5d
            return
        L5d:
            java.lang.String r8 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."
            android.util.Log.wtf(r3, r8, r2)
            return
    }
}
