package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class StringPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final java.lang.String defaultValue;

    public java.lang.String get() {
            r1 = this;
            java.lang.String r0 = r1.defaultValue
            java.lang.String r0 = r1.getOr(r0)
            return r0
    }

    public java.lang.String getOr(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPreferences
            java.lang.String r1 = r2.key
            java.lang.String r3 = r0.getString(r1, r3)
            return r3
    }

    public void put(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r3)
            return
    }
}
