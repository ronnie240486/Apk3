package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedPreferencesHelper {
    private final android.content.SharedPreferences sharedPreferences;

    public SharedPreferencesHelper(android.content.SharedPreferences r1) {
            r0 = this;
            r0.<init>()
            r0.sharedPreferences = r1
            return
    }

    public final void clear() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r0)
            return
    }

    public final android.content.SharedPreferences getSharedPreferences() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPreferences
            return r0
    }
}
