package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zad {
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> zaa = null;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> zab = null;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> zac = null;
    public static final com.google.android.gms.common.api.Scope zae = null;
    public static final com.google.android.gms.common.api.Scope zaf = null;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.signin.SignInOptions> zag = null;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.signin.zac> zah = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.signin.zad.zaa = r0
            com.google.android.gms.common.api.Api$ClientKey r1 = new com.google.android.gms.common.api.Api$ClientKey
            r1.<init>()
            com.google.android.gms.signin.zad.zab = r1
            com.google.android.gms.signin.zaa r2 = new com.google.android.gms.signin.zaa
            r2.<init>()
            com.google.android.gms.signin.zad.zac = r2
            com.google.android.gms.signin.zab r3 = new com.google.android.gms.signin.zab
            r3.<init>()
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "profile"
            r4.<init>(r5)
            com.google.android.gms.signin.zad.zae = r4
            com.google.android.gms.common.api.Scope r4 = new com.google.android.gms.common.api.Scope
            java.lang.String r5 = "email"
            r4.<init>(r5)
            com.google.android.gms.signin.zad.zaf = r4
            com.google.android.gms.common.api.Api r4 = new com.google.android.gms.common.api.Api
            java.lang.String r5 = "SignIn.API"
            r4.<init>(r5, r2, r0)
            com.google.android.gms.signin.zad.zag = r4
            com.google.android.gms.common.api.Api r0 = new com.google.android.gms.common.api.Api
            java.lang.String r2 = "SignIn.INTERNAL_API"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.signin.zad.zah = r0
            return
    }
}
