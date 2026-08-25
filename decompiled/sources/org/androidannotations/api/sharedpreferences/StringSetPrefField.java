package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
public final class StringSetPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final java.util.Set<java.lang.String> defaultValue;

    public java.util.Set<java.lang.String> get() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.defaultValue
            java.util.Set r0 = r1.getOr(r0)
            return r0
    }

    public java.util.Set<java.lang.String> getOr(java.util.Set<java.lang.String> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPreferences
            java.lang.String r1 = r2.key
            java.util.Set r3 = org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.getStringSet(r0, r1, r3)
            return r3
    }

    public void put(java.util.Set<java.lang.String> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.key
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.putStringSet(r0, r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r0)
            return
    }
}
