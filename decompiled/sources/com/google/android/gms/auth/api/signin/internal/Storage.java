package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class Storage {
    private static final java.util.concurrent.locks.Lock zaa = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("sLk")
    private static com.google.android.gms.auth.api.signin.internal.Storage zab;
    private final java.util.concurrent.locks.Lock zac;

    @javax.annotation.concurrent.GuardedBy("mLk")
    private final android.content.SharedPreferences zad;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            com.google.android.gms.auth.api.signin.internal.Storage.zaa = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public Storage(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.zac = r0
            java.lang.String r0 = "com.google.android.gms.signin"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.zad = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.signin.internal.Storage getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.auth.api.signin.internal.Storage.zaa
            r0.lock()
            com.google.android.gms.auth.api.signin.internal.Storage r1 = com.google.android.gms.auth.api.signin.internal.Storage.zab     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L17
            com.google.android.gms.auth.api.signin.internal.Storage r1 = new com.google.android.gms.auth.api.signin.internal.Storage     // Catch: java.lang.Throwable -> L1d
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.auth.api.signin.internal.Storage.zab = r1     // Catch: java.lang.Throwable -> L1d
        L17:
            com.google.android.gms.auth.api.signin.internal.Storage r2 = com.google.android.gms.auth.api.signin.internal.Storage.zab     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r2
        L1d:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.auth.api.signin.internal.Storage.zaa
            r0.unlock()
            throw r2
    }

    private static final java.lang.String zae(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r3.length()
            int r2 = r2 + 1
            int r2 = r2 + r0
            r1.<init>(r2)
            java.lang.String r0 = ":"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0, r4)
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void clear() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zac
            r0.lock()
            android.content.SharedPreferences r0 = r2.zad     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L18
            r0.apply()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Lock r0 = r2.zac
            r0.unlock()
            return
        L18:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.zac
            r1.unlock()
            throw r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
            r3 = this;
            java.lang.String r0 = "defaultGoogleSignInAccount"
            java.lang.String r0 = r3.zaa(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            goto L1e
        Le:
            java.lang.String r1 = "googleSignInAccount"
            java.lang.String r0 = zae(r1, r0)
            java.lang.String r0 = r3.zaa(r0)
            if (r0 == 0) goto L1e
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.zab(r0)     // Catch: org.json.JSONException -> L1e
        L1e:
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
            r3 = this;
            java.lang.String r0 = "defaultGoogleSignInAccount"
            java.lang.String r0 = r3.zaa(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            goto L1e
        Le:
            java.lang.String r1 = "googleSignInOptions"
            java.lang.String r0 = zae(r1, r0)
            java.lang.String r0 = r3.zaa(r0)
            if (r0 == 0) goto L1e
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab(r0)     // Catch: org.json.JSONException -> L1e
        L1e:
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getSavedRefreshToken() {
            r1 = this;
            java.lang.String r0 = "refreshToken"
            java.lang.String r0 = r1.zaa(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void saveDefaultGoogleSignInAccount(@androidx.annotation.NonNull com.google.android.gms.auth.api.signin.GoogleSignInAccount r3, @androidx.annotation.NonNull com.google.android.gms.auth.api.signin.GoogleSignInOptions r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r0 = r3.zac()
            java.lang.String r1 = "defaultGoogleSignInAccount"
            r2.zad(r1, r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r0 = r3.zac()
            java.lang.String r1 = "googleSignInAccount"
            java.lang.String r1 = zae(r1, r0)
            java.lang.String r3 = r3.zad()
            r2.zad(r1, r3)
            java.lang.String r3 = "googleSignInOptions"
            java.lang.String r3 = zae(r3, r0)
            java.lang.String r4 = r4.zaf()
            r2.zad(r3, r4)
            return
    }

    @androidx.annotation.Nullable
    public final java.lang.String zaa(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zac
            r0.lock()
            android.content.SharedPreferences r0 = r2.zad     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.locks.Lock r0 = r2.zac
            r0.unlock()
            return r3
        L12:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zac
            r0.unlock()
            throw r3
    }

    public final void zab(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zac
            r0.lock()
            android.content.SharedPreferences r0 = r1.zad     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L18
            r2.apply()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Lock r2 = r1.zac
            r2.unlock()
            return
        L18:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.zac
            r0.unlock()
            throw r2
    }

    public final void zac() {
            r2 = this;
            java.lang.String r0 = "defaultGoogleSignInAccount"
            java.lang.String r1 = r2.zaa(r0)
            r2.zab(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.String r0 = "googleSignInAccount"
            java.lang.String r0 = zae(r0, r1)
            r2.zab(r0)
            java.lang.String r0 = "googleSignInOptions"
            java.lang.String r0 = zae(r0, r1)
            r2.zab(r0)
            return
    }

    public final void zad(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zac
            r0.lock()
            android.content.SharedPreferences r0 = r1.zad     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L18
            r2.apply()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Lock r2 = r1.zac
            r2.unlock()
            return
        L18:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.zac
            r3.unlock()
            throw r2
    }
}
