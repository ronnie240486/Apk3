package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractPrefField {
    public final java.lang.String key;
    public final android.content.SharedPreferences sharedPreferences;

    public AbstractPrefField(android.content.SharedPreferences r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.sharedPreferences = r1
            r0.key = r2
            return
    }

    public final android.content.SharedPreferences.Editor edit() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            return r0
    }

    public final boolean exists() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPreferences
            java.lang.String r1 = r2.key
            boolean r0 = r0.contains(r1)
            return r0
    }

    public java.lang.String key() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final void remove() {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r0)
            return
    }
}
