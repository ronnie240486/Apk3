package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountPicker {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class AccountChooserOptions {

        @androidx.annotation.Nullable
        private android.accounts.Account zza;
        private boolean zzb;

        @androidx.annotation.Nullable
        private java.util.ArrayList<android.accounts.Account> zzc;

        @androidx.annotation.Nullable
        private java.util.ArrayList<java.lang.String> zzd;
        private boolean zze;

        @androidx.annotation.Nullable
        private java.lang.String zzf;

        @androidx.annotation.Nullable
        private android.os.Bundle zzg;
        private boolean zzh;
        private int zzi;

        @androidx.annotation.Nullable
        private java.lang.String zzj;
        private boolean zzk;

        @androidx.annotation.Nullable
        private com.google.android.gms.common.zza zzl;

        @androidx.annotation.Nullable
        private java.lang.String zzm;
        private boolean zzn;
        private boolean zzo;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class Builder {

            @androidx.annotation.Nullable
            private android.accounts.Account zza;

            @androidx.annotation.Nullable
            private java.util.ArrayList<android.accounts.Account> zzb;

            @androidx.annotation.Nullable
            private java.util.ArrayList<java.lang.String> zzc;
            private boolean zzd;

            @androidx.annotation.Nullable
            private java.lang.String zze;

            @androidx.annotation.Nullable
            private android.os.Bundle zzf;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.zzd = r0
                    return
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions build() {
                    r2 = this;
                    r0 = 1
                    java.lang.String r1 = "We only support hostedDomain filter for account chip styled account picker"
                    com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                    java.lang.String r1 = "Consent is only valid for account chip styled account picker"
                    com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                    com.google.android.gms.common.AccountPicker$AccountChooserOptions r0 = new com.google.android.gms.common.AccountPicker$AccountChooserOptions
                    r0.<init>()
                    java.util.ArrayList<java.lang.String> r1 = r2.zzc
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzj(r0, r1)
                    java.util.ArrayList<android.accounts.Account> r1 = r2.zzb
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzk(r0, r1)
                    boolean r1 = r2.zzd
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzl(r0, r1)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzm(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzp(r0)
                    android.os.Bundle r1 = r2.zzf
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzq(r0, r1)
                    android.accounts.Account r1 = r2.zza
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzs(r0, r1)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzt(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzu(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzr(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzv(r0)
                    java.lang.String r1 = r2.zze
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzw(r0, r1)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzx(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzn(r0)
                    com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzo(r0)
                    return r0
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(@androidx.annotation.Nullable java.util.List<android.accounts.Account> r2) {
                    r1 = this;
                    if (r2 != 0) goto L4
                    r2 = 0
                    goto La
                L4:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    r2 = r0
                La:
                    r1.zzb = r2
                    return r1
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(@androidx.annotation.Nullable java.util.List<java.lang.String> r2) {
                    r1 = this;
                    if (r2 != 0) goto L4
                    r2 = 0
                    goto La
                L4:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    r2 = r0
                La:
                    r1.zzc = r2
                    return r1
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAlwaysShowAccountPicker(boolean r1) {
                    r0 = this;
                    r0.zzd = r1
                    return r0
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setOptionsForAddingAccount(@androidx.annotation.Nullable android.os.Bundle r1) {
                    r0 = this;
                    r0.zzf = r1
                    return r0
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setSelectedAccount(@androidx.annotation.Nullable android.accounts.Account r1) {
                    r0 = this;
                    r0.zza = r1
                    return r0
            }

            @androidx.annotation.NonNull
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setTitleOverrideText(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.zze = r1
                    return r0
            }
        }

        public AccountChooserOptions() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* bridge */ /* synthetic */ void zzA(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zzo
                return
        }

        public static /* bridge */ /* synthetic */ void zzB(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zzb
                return
        }

        public static /* bridge */ /* synthetic */ void zzC(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zzh
                return
        }

        public static /* bridge */ /* synthetic */ void zzD(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zzk
                return
        }

        public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                int r0 = r0.zzi
                return
        }

        public static /* bridge */ /* synthetic */ android.accounts.Account zzb(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                android.accounts.Account r0 = r0.zza
                return r0
        }

        public static /* bridge */ /* synthetic */ android.os.Bundle zzc(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                android.os.Bundle r0 = r0.zzg
                return r0
        }

        public static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                com.google.android.gms.common.zza r0 = r0.zzl
                return
        }

        public static /* bridge */ /* synthetic */ void zze(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                java.lang.String r0 = r0.zzj
                return
        }

        public static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                java.lang.String r0 = r0.zzm
                return
        }

        public static /* bridge */ /* synthetic */ java.lang.String zzg(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                java.lang.String r0 = r0.zzf
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zzh(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                java.util.ArrayList<java.lang.String> r0 = r0.zzd
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zzi(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                java.util.ArrayList<android.accounts.Account> r0 = r0.zzc
                return r0
        }

        public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, java.util.ArrayList r1) {
                r0.zzd = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, java.util.ArrayList r1) {
                r0.zzc = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, boolean r1) {
                r0.zze = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzl = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzn(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzn = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzo(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzo = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzp(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzj = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzq(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, android.os.Bundle r1) {
                r0.zzg = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzr(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzm = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzs(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, android.accounts.Account r1) {
                r0.zza = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzt(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzb = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzu(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzh = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzv(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzi = r0
                return
        }

        public static /* bridge */ /* synthetic */ void zzw(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0, java.lang.String r1) {
                r0.zzf = r1
                return
        }

        public static /* bridge */ /* synthetic */ void zzx(com.google.android.gms.common.AccountPicker.AccountChooserOptions r1) {
                r0 = 0
                r1.zzk = r0
                return
        }

        public static /* bridge */ /* synthetic */ boolean zzy(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zze
                return r0
        }

        public static /* bridge */ /* synthetic */ void zzz(com.google.android.gms.common.AccountPicker.AccountChooserOptions r0) {
                boolean r0 = r0.zzn
                return
        }
    }

    private AccountPicker() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static android.content.Intent newChooseAccountIntent(@androidx.annotation.Nullable android.accounts.Account r3, @androidx.annotation.Nullable java.util.ArrayList<android.accounts.Account> r4, @androidx.annotation.Nullable java.lang.String[] r5, boolean r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable android.os.Bundle r10) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "We only support hostedDomain filter for account chip styled account picker"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            java.lang.String r1 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT"
            r0.setAction(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            java.lang.String r1 = "allowableAccounts"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "allowableAccountTypes"
            r0.putExtra(r4, r5)
            java.lang.String r4 = "addAccountOptions"
            r0.putExtra(r4, r10)
            java.lang.String r4 = "selectedAccount"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "alwaysPromptForAccount"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "descriptionTextOverride"
            r0.putExtra(r3, r7)
            java.lang.String r3 = "authTokenType"
            r0.putExtra(r3, r8)
            java.lang.String r3 = "addAccountRequiredFeatures"
            r0.putExtra(r3, r9)
            java.lang.String r3 = "setGmsCoreAccount"
            r4 = 0
            r0.putExtra(r3, r4)
            java.lang.String r3 = "overrideTheme"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "overrideCustomTheme"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "hostedDomainFilter"
            r4 = 0
            r0.putExtra(r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.content.Intent newChooseAccountIntent(@androidx.annotation.NonNull com.google.android.gms.common.AccountPicker.AccountChooserOptions r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(r4)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zze(r4)
            r1 = 1
            java.lang.String r2 = "We only support hostedDomain filter for account chip styled account picker"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzd(r4)
            java.lang.String r2 = "Consent is only valid for account chip styled account picker"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzB(r4)
            java.lang.String r2 = "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(r4)
            java.lang.String r1 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT"
            r0.setAction(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            java.util.ArrayList r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzi(r4)
            java.lang.String r2 = "allowableAccounts"
            r0.putExtra(r2, r1)
            java.util.ArrayList r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzh(r4)
            r2 = 0
            if (r1 == 0) goto L4f
            java.util.ArrayList r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzh(r4)
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r3 = "allowableAccountTypes"
            r0.putExtra(r3, r1)
        L4f:
            android.os.Bundle r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzc(r4)
            java.lang.String r3 = "addAccountOptions"
            r0.putExtra(r3, r1)
            android.accounts.Account r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzb(r4)
            java.lang.String r3 = "selectedAccount"
            r0.putExtra(r3, r1)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzB(r4)
            java.lang.String r1 = "selectedAccountIsNotClickable"
            r0.putExtra(r1, r2)
            boolean r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzy(r4)
            java.lang.String r3 = "alwaysPromptForAccount"
            r0.putExtra(r3, r1)
            java.lang.String r1 = com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzg(r4)
            java.lang.String r3 = "descriptionTextOverride"
            r0.putExtra(r3, r1)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzC(r4)
            java.lang.String r1 = "setGmsCoreAccount"
            r0.putExtra(r1, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzf(r4)
            r1 = 0
            java.lang.String r3 = "realClientPackage"
            r0.putExtra(r3, r1)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zza(r4)
            java.lang.String r3 = "overrideTheme"
            r0.putExtra(r3, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(r4)
            java.lang.String r3 = "overrideCustomTheme"
            r0.putExtra(r3, r2)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zze(r4)
            java.lang.String r2 = "hostedDomainFilter"
            r0.putExtra(r2, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(r4)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzd(r4)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzz(r4)
            com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzA(r4)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto Lc4
            java.lang.String r4 = "first_party_options_bundle"
            r0.putExtra(r4, r1)
        Lc4:
            return r0
    }
}
