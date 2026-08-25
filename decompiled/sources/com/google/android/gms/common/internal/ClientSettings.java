package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.common.annotation.KeepForSdk
public final class ClientSettings {

    @javax.annotation.Nullable
    private final android.accounts.Account zaa;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zab;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zac;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> zad;
    private final int zae;

    @javax.annotation.Nullable
    private final android.view.View zaf;
    private final java.lang.String zag;
    private final java.lang.String zah;
    private final com.google.android.gms.signin.SignInOptions zai;
    private java.lang.Integer zaj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes2.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class Builder {

        @javax.annotation.Nullable
        private android.accounts.Account zaa;
        private androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> zab;
        private java.lang.String zac;
        private java.lang.String zad;
        private com.google.android.gms.signin.SignInOptions zae;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.signin.SignInOptions r0 = com.google.android.gms.signin.SignInOptions.zaa
                r1.zae = r0
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.ClientSettings build() {
                r11 = this;
                com.google.android.gms.common.internal.ClientSettings r10 = new com.google.android.gms.common.internal.ClientSettings
                android.accounts.Account r1 = r11.zaa
                androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r2 = r11.zab
                java.lang.String r6 = r11.zac
                java.lang.String r7 = r11.zad
                com.google.android.gms.signin.SignInOptions r8 = r11.zae
                r3 = 0
                r4 = 0
                r5 = 0
                r9 = 0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.ClientSettings.Builder setRealClientPackageName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.zac = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.internal.ClientSettings.Builder zaa(@androidx.annotation.NonNull java.util.Collection<com.google.android.gms.common.api.Scope> r2) {
                r1 = this;
                androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r0 = r1.zab
                if (r0 != 0) goto Lb
                androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
                r0.<init>()
                r1.zab = r0
            Lb:
                androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r0 = r1.zab
                r0.addAll(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.internal.ClientSettings.Builder zab(@javax.annotation.Nullable android.accounts.Account r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.internal.ClientSettings.Builder zac(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public ClientSettings(@androidx.annotation.NonNull android.accounts.Account r11, @androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r12, @androidx.annotation.NonNull java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> r13, int r14, @javax.annotation.Nullable android.view.View r15, @androidx.annotation.NonNull java.lang.String r16, @androidx.annotation.NonNull java.lang.String r17, @javax.annotation.Nullable com.google.android.gms.signin.SignInOptions r18) {
            r10 = this;
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public ClientSettings(@javax.annotation.Nullable android.accounts.Account r1, @androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r2, @androidx.annotation.NonNull java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> r3, int r4, @javax.annotation.Nullable android.view.View r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7, @javax.annotation.Nullable com.google.android.gms.signin.SignInOptions r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            if (r2 != 0) goto Lc
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L10
        Lc:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
        L10:
            r0.zab = r1
            if (r3 != 0) goto L18
            java.util.Map r3 = java.util.Collections.emptyMap()
        L18:
            r0.zad = r3
            r0.zaf = r5
            r0.zae = r4
            r0.zag = r6
            r0.zah = r7
            if (r8 != 0) goto L26
            com.google.android.gms.signin.SignInOptions r8 = com.google.android.gms.signin.SignInOptions.zaa
        L26:
            r0.zai = r8
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            java.util.Collection r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r1.next()
            com.google.android.gms.common.internal.zab r3 = (com.google.android.gms.common.internal.zab) r3
            java.util.Set<com.google.android.gms.common.api.Scope> r3 = r3.zaa
            r2.addAll(r3)
            goto L35
        L47:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.zac = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.ClientSettings createDefault(@androidx.annotation.NonNull android.content.Context r1) {
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            r0.<init>(r1)
            com.google.android.gms.common.internal.ClientSettings r1 = r0.zaa()
            return r1
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zaa
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public java.lang.String getAccountName() {
            r1 = this;
            android.accounts.Account r0 = r1.zaa
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.name
            return r0
        L7:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.accounts.Account getAccountOrDefault() {
            r3 = this;
            android.accounts.Account r0 = r3.zaa
            if (r0 == 0) goto L5
            return r0
        L5:
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "<<default account>>"
            java.lang.String r2 = "com.google"
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getAllRequestedScopes() {
            r1 = this;
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.zac
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getApplicableScopes(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r3) {
            r2 = this;
            java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> r0 = r2.zad
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.common.internal.zab r3 = (com.google.android.gms.common.internal.zab) r3
            if (r3 == 0) goto L20
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r3.zaa
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L20
        L13:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<com.google.android.gms.common.api.Scope> r1 = r2.zab
            r0.<init>(r1)
            java.util.Set<com.google.android.gms.common.api.Scope> r3 = r3.zaa
            r0.addAll(r3)
            return r0
        L20:
            java.util.Set<com.google.android.gms.common.api.Scope> r3 = r2.zab
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getGravityForPopups() {
            r1 = this;
            int r0 = r1.zae
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getRealClientPackageName() {
            r1 = this;
            java.lang.String r0 = r1.zag
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getRequiredScopes() {
            r1 = this;
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.zab
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.view.View getViewForPopups() {
            r1 = this;
            android.view.View r0 = r1.zaf
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.signin.SignInOptions zaa() {
            r1 = this;
            com.google.android.gms.signin.SignInOptions r0 = r1.zai
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.Integer zab() {
            r1 = this;
            java.lang.Integer r0 = r1.zaj
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.String zac() {
            r1 = this;
            java.lang.String r0 = r1.zah
            return r0
    }

    @androidx.annotation.NonNull
    public final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> zad() {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> r0 = r1.zad
            return r0
    }

    public final void zae(@androidx.annotation.NonNull java.lang.Integer r1) {
            r0 = this;
            r0.zaj = r1
            return
    }
}
