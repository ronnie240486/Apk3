package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"MissingPermission"})
public class AndroidAuthenticator implements com.android.volley.toolbox.Authenticator {
    private final android.accounts.Account mAccount;
    private final android.accounts.AccountManager mAccountManager;
    private final java.lang.String mAuthTokenType;
    private final boolean mNotifyAuthFailure;

    public AndroidAuthenticator(android.content.Context r2, android.accounts.Account r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AndroidAuthenticator(android.content.Context r1, android.accounts.Account r2, java.lang.String r3, boolean r4) {
            r0 = this;
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r1)
            r0.<init>()
            r0.mAccountManager = r1
            r0.mAccount = r2
            r0.mAuthTokenType = r3
            r0.mNotifyAuthFailure = r4
            return
    }

    public android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.mAccount
            return r0
    }

    @Override // com.android.volley.toolbox.Authenticator
    public java.lang.String getAuthToken() throws com.android.volley.AuthFailureError {
            r6 = this;
            android.accounts.AccountManager r0 = r6.mAccountManager
            android.accounts.Account r1 = r6.mAccount
            java.lang.String r2 = r6.mAuthTokenType
            boolean r3 = r6.mNotifyAuthFailure
            r4 = 0
            r5 = 0
            android.accounts.AccountManagerFuture r0 = r0.getAuthToken(r1, r2, r3, r4, r5)
            java.lang.Object r1 = r0.getResult()     // Catch: java.lang.Exception -> L54
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Exception -> L54
            r2 = 0
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L3c
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L3c
            java.lang.String r0 = "intent"
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L30
            java.lang.String r0 = "authtoken"
            java.lang.String r2 = r1.getString(r0)
            goto L3c
        L30:
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            com.android.volley.AuthFailureError r1 = new com.android.volley.AuthFailureError
            r1.<init>(r0)
            throw r1
        L3c:
            if (r2 == 0) goto L3f
            return r2
        L3f:
            com.android.volley.AuthFailureError r0 = new com.android.volley.AuthFailureError
            java.lang.String r1 = "Got null auth token for type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r6.mAuthTokenType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L54:
            r0 = move-exception
            com.android.volley.AuthFailureError r1 = new com.android.volley.AuthFailureError
            java.lang.String r2 = "Error while retrieving auth token"
            r1.<init>(r2, r0)
            throw r1
    }

    public java.lang.String getAuthTokenType() {
            r1 = this;
            java.lang.String r0 = r1.mAuthTokenType
            return r0
    }

    @Override // com.android.volley.toolbox.Authenticator
    public void invalidateAuthToken(java.lang.String r3) {
            r2 = this;
            android.accounts.AccountManager r0 = r2.mAccountManager
            android.accounts.Account r1 = r2.mAccount
            java.lang.String r1 = r1.type
            r0.invalidateAuthToken(r1, r3)
            return
    }
}
