package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR = null;

    @androidx.annotation.NonNull
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_GAMES_SIGN_IN = null;

    @androidx.annotation.NonNull
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_SIGN_IN = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public static final com.google.android.gms.common.api.Scope zaa = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public static final com.google.android.gms.common.api.Scope zab = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public static final com.google.android.gms.common.api.Scope zac = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public static final com.google.android.gms.common.api.Scope zad = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public static final com.google.android.gms.common.api.Scope zae = null;
    private static java.util.Comparator<com.google.android.gms.common.api.Scope> zag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getScopes", id = 2)
    private final java.util.ArrayList<com.google.android.gms.common.api.Scope> zah;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccount", id = 3)
    private android.accounts.Account zai;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private boolean zaj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    private final boolean zak;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    private final boolean zal;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerClientId", id = 7)
    private java.lang.String zam;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    private java.lang.String zan;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getExtensions", id = 9)
    private java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zao;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    private java.lang.String zap;
    private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaq;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class Builder {
        private java.util.Set<com.google.android.gms.common.api.Scope> zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;

        @androidx.annotation.Nullable
        private java.lang.String zae;

        @androidx.annotation.Nullable
        private android.accounts.Account zaf;

        @androidx.annotation.Nullable
        private java.lang.String zag;
        private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zah;

        @androidx.annotation.Nullable
        private java.lang.String zai;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.zaa = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.zah = r0
                return
        }

        public Builder(@androidx.annotation.NonNull com.google.android.gms.auth.api.signin.GoogleSignInOptions r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.zaa = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.zah = r0
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
                java.util.HashSet r0 = new java.util.HashSet
                java.util.ArrayList r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zah(r3)
                r0.<init>(r1)
                r2.zaa = r0
                boolean r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zal(r3)
                r2.zab = r0
                boolean r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaj(r3)
                r2.zac = r0
                boolean r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zak(r3)
                r2.zad = r0
                java.lang.String r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae(r3)
                r2.zae = r0
                android.accounts.Account r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa(r3)
                r2.zaf = r0
                java.lang.String r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac(r3)
                r2.zag = r0
                java.util.ArrayList r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag(r3)
                java.util.Map r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zai(r0)
                r2.zah = r0
                java.lang.String r3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad(r3)
                r2.zai = r3
                return
        }

        private final java.lang.String zaa(java.lang.String r3) {
                r2 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
                java.lang.String r0 = r2.zae
                r1 = 1
                if (r0 == 0) goto L10
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                java.lang.String r0 = "two different server client ids provided"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                return r3
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder addExtension(@androidx.annotation.NonNull com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r4) {
                r3 = this;
                java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r3.zah
                int r1 = r4.getExtensionType()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.containsKey(r1)
                if (r0 != 0) goto L2e
                java.util.List r0 = r4.getImpliedScopes()
                if (r0 == 0) goto L1b
                java.util.Set<com.google.android.gms.common.api.Scope> r1 = r3.zaa
                r1.addAll(r0)
            L1b:
                java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r3.zah
                int r1 = r4.getExtensionType()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r2 = new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable
                r2.<init>(r4)
                r0.put(r1, r2)
                return r3
            L2e:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Only one extension per type may be added"
                r4.<init>(r0)
                throw r4
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions build() {
                r11 = this;
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r11.zaa
                com.google.android.gms.common.api.Scope r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L19
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r11.zaa
                com.google.android.gms.common.api.Scope r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L19
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r11.zaa
                r0.remove(r1)
            L19:
                boolean r0 = r11.zad
                if (r0 == 0) goto L2c
                android.accounts.Account r0 = r11.zaf
                if (r0 == 0) goto L29
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r11.zaa
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2c
            L29:
                r11.requestId()
            L2c:
                com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Set<com.google.android.gms.common.api.Scope> r1 = r11.zaa
                r2.<init>(r1)
                android.accounts.Account r3 = r11.zaf
                boolean r4 = r11.zad
                boolean r5 = r11.zab
                boolean r6 = r11.zac
                java.lang.String r7 = r11.zae
                java.lang.String r8 = r11.zag
                java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r9 = r11.zah
                java.lang.String r10 = r11.zai
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestEmail() {
                r2 = this;
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r2.zaa
                com.google.android.gms.common.api.Scope r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab
                r0.add(r1)
                return r2
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestId() {
                r2 = this;
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r2.zaa
                com.google.android.gms.common.api.Scope r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac
                r0.add(r1)
                return r2
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestIdToken(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r0 = 1
                r1.zad = r0
                r1.zaa(r2)
                r1.zae = r2
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestProfile() {
                r2 = this;
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r2.zaa
                com.google.android.gms.common.api.Scope r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa
                r0.add(r1)
                return r2
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestScopes(@androidx.annotation.NonNull com.google.android.gms.common.api.Scope r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Scope... r3) {
                r1 = this;
                java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.zaa
                r0.add(r2)
                java.util.Set<com.google.android.gms.common.api.Scope> r2 = r1.zaa
                java.util.List r3 = java.util.Arrays.asList(r3)
                r2.addAll(r3)
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.requestServerAuthCode(r2, r0)
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
                r1 = this;
                r0 = 1
                r1.zab = r0
                r1.zaa(r2)
                r1.zae = r2
                r1.zac = r3
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setAccountName(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                android.accounts.Account r0 = new android.accounts.Account
                java.lang.String r3 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
                java.lang.String r1 = "com.google"
                r0.<init>(r3, r1)
                r2.zaf = r0
                return r2
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setHostedDomain(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
                r0.zag = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setLogSessionId(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.zai = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            java.lang.String r1 = "profile"
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa = r0
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            java.lang.String r1 = "email"
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab = r0
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            java.lang.String r1 = "openid"
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac = r0
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            java.lang.String r1 = "https://www.googleapis.com/auth/games_lite"
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad = r0
            com.google.android.gms.common.api.Scope r1 = new com.google.android.gms.common.api.Scope
            java.lang.String r2 = "https://www.googleapis.com/auth/games"
            r1.<init>(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae = r1
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r1.<init>()
            r1.requestId()
            r1.requestProfile()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r1.build()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN = r1
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r1.<init>()
            r2 = 0
            com.google.android.gms.common.api.Scope[] r2 = new com.google.android.gms.common.api.Scope[r2]
            r1.requestScopes(r0, r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r1.build()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN = r0
            com.google.android.gms.auth.api.signin.zae r0 = new com.google.android.gms.auth.api.signin.zae
            r0.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR = r0
            com.google.android.gms.auth.api.signin.zac r0 = new com.google.android.gms.auth.api.signin.zac
            r0.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public GoogleSignInOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.ArrayList<com.google.android.gms.common.api.Scope> r13, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.accounts.Account r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r17, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r18, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r20, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.String r21) {
            r11 = this;
            java.util.Map r9 = zam(r20)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private GoogleSignInOptions(int r1, java.util.ArrayList<com.google.android.gms.common.api.Scope> r2, @androidx.annotation.Nullable android.accounts.Account r3, boolean r4, boolean r5, boolean r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r9, @androidx.annotation.Nullable java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.zaf = r1
            r0.zah = r2
            r0.zai = r3
            r0.zaj = r4
            r0.zak = r5
            r0.zal = r6
            r0.zam = r7
            r0.zan = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            r0.zao = r1
            r0.zaq = r9
            r0.zap = r10
            return
    }

    public /* synthetic */ GoogleSignInOptions(java.util.ArrayList r12, android.accounts.Account r13, boolean r14, boolean r15, boolean r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, java.lang.String r20) {
            r11 = this;
            r1 = 3
            r0 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* bridge */ /* synthetic */ android.accounts.Account zaa(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            android.accounts.Account r0 = r0.zai
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions zab(@androidx.annotation.Nullable java.lang.String r17) throws org.json.JSONException {
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r2 = r17
            r0.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r3 = "scopes"
            org.json.JSONArray r3 = r0.getJSONArray(r3)
            int r4 = r3.length()
            r5 = 0
        L20:
            if (r5 >= r4) goto L31
            com.google.android.gms.common.api.Scope r6 = new com.google.android.gms.common.api.Scope
            java.lang.String r7 = r3.getString(r5)
            r6.<init>(r7)
            r2.add(r6)
            int r5 = r5 + 1
            goto L20
        L31:
            java.lang.String r3 = "accountName"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L3e
            java.lang.String r3 = r0.optString(r3)
            goto L3f
        L3e:
            r3 = r1
        L3f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L4e
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r4.<init>(r3, r5)
            r9 = r4
            goto L4f
        L4e:
            r9 = r1
        L4f:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r2)
            java.lang.String r2 = "idTokenRequested"
            boolean r10 = r0.getBoolean(r2)
            java.lang.String r2 = "serverAuthRequested"
            boolean r11 = r0.getBoolean(r2)
            java.lang.String r2 = "forceCodeForRefreshToken"
            boolean r12 = r0.getBoolean(r2)
            java.lang.String r2 = "serverClientId"
            boolean r4 = r0.has(r2)
            if (r4 == 0) goto L78
            java.lang.String r2 = r0.optString(r2)
            r13 = r2
            goto L79
        L78:
            r13 = r1
        L79:
            java.lang.String r2 = "hostedDomain"
            boolean r4 = r0.has(r2)
            if (r4 == 0) goto L85
            java.lang.String r1 = r0.optString(r2)
        L85:
            r14 = r1
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r7 = 3
            r16 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
    }

    public static /* bridge */ /* synthetic */ java.lang.String zac(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            java.lang.String r0 = r0.zan
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zad(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            java.lang.String r0 = r0.zap
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zae(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            java.lang.String r0 = r0.zam
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zag(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r0.zao
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zah(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zai(java.util.List r0) {
            java.util.Map r0 = zam(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zaj(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            boolean r0 = r0.zal
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zak(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            boolean r0 = r0.zaj
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zal(com.google.android.gms.auth.api.signin.GoogleSignInOptions r0) {
            boolean r0 = r0.zak
            return r0
    }

    private static java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zam(@androidx.annotation.Nullable java.util.List<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r1 = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) r1
            int r2 = r1.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r1)
            goto Lc
        L24:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.zao     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.zao     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isIdTokenRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isServerAuthCodeRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.getLogSessionId()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zai
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> getExtensions() {
            r1 = this;
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r1.zao
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getLogSessionId() {
            r1 = this;
            java.lang.String r0 = r1.zap
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.Scope[] getScopeArray() {
            r2 = this;
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r0 = r2.zah
            int r1 = r0.size()
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.ArrayList<com.google.android.gms.common.api.Scope> getScopes() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r2.zah
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getServerClientId() {
            r1 = this;
            java.lang.String r0 = r1.zam
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r5.zah
            int r2 = r1.size()
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1e
            java.lang.Object r4 = r1.get(r3)
            com.google.android.gms.common.api.Scope r4 = (com.google.android.gms.common.api.Scope) r4
            java.lang.String r4 = r4.getScopeUri()
            r0.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1e:
            java.util.Collections.sort(r0)
            com.google.android.gms.auth.api.signin.internal.HashAccumulator r1 = new com.google.android.gms.auth.api.signin.internal.HashAccumulator
            r1.<init>()
            r1.addObject(r0)
            android.accounts.Account r0 = r5.zai
            r1.addObject(r0)
            java.lang.String r0 = r5.zam
            r1.addObject(r0)
            boolean r0 = r5.zal
            r1.zaa(r0)
            boolean r0 = r5.zaj
            r1.zaa(r0)
            boolean r0 = r5.zak
            r1.zaa(r0)
            java.lang.String r0 = r5.zap
            r1.addObject(r0)
            int r0 = r1.hash()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isForceCodeForRefreshToken() {
            r1 = this;
            boolean r0 = r1.zal
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isIdTokenRequested() {
            r1 = this;
            boolean r0 = r1.zaj
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isServerAuthCodeRequested() {
            r1 = this;
            boolean r0 = r1.zak
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaf
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.util.ArrayList r1 = r4.getScopes()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            android.accounts.Account r1 = r4.getAccount()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.isIdTokenRequested()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.isServerAuthCodeRequested()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.isForceCodeForRefreshToken()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.lang.String r6 = r4.getServerClientId()
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.zan
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.util.ArrayList r6 = r4.getExtensions()
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r1, r6, r3)
            java.lang.String r6 = r4.getLogSessionId()
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String zaf() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L76
            r1.<init>()     // Catch: org.json.JSONException -> L76
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r2 = r4.zah     // Catch: org.json.JSONException -> L76
            java.util.Comparator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag     // Catch: org.json.JSONException -> L76
            java.util.Collections.sort(r2, r3)     // Catch: org.json.JSONException -> L76
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r2 = r4.zah     // Catch: org.json.JSONException -> L76
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L76
        L17:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L76
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L76
            com.google.android.gms.common.api.Scope r3 = (com.google.android.gms.common.api.Scope) r3     // Catch: org.json.JSONException -> L76
            java.lang.String r3 = r3.getScopeUri()     // Catch: org.json.JSONException -> L76
            r1.put(r3)     // Catch: org.json.JSONException -> L76
            goto L17
        L2b:
            java.lang.String r2 = "scopes"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
            android.accounts.Account r1 = r4.zai     // Catch: org.json.JSONException -> L76
            if (r1 == 0) goto L3c
            java.lang.String r2 = "accountName"
            java.lang.String r1 = r1.name     // Catch: org.json.JSONException -> L76
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L76
        L3c:
            java.lang.String r1 = "idTokenRequested"
            boolean r2 = r4.zaj     // Catch: org.json.JSONException -> L76
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = "forceCodeForRefreshToken"
            boolean r2 = r4.zal     // Catch: org.json.JSONException -> L76
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = "serverAuthRequested"
            boolean r2 = r4.zak     // Catch: org.json.JSONException -> L76
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = r4.zam     // Catch: org.json.JSONException -> L76
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L76
            if (r1 != 0) goto L62
            java.lang.String r1 = "serverClientId"
            java.lang.String r2 = r4.zam     // Catch: org.json.JSONException -> L76
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
        L62:
            java.lang.String r1 = r4.zan     // Catch: org.json.JSONException -> L76
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L76
            if (r1 != 0) goto L71
            java.lang.String r1 = "hostedDomain"
            java.lang.String r2 = r4.zan     // Catch: org.json.JSONException -> L76
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
        L71:
            java.lang.String r0 = r0.toString()
            return r0
        L76:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
