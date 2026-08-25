package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final boolean defaultValue;

    public boolean get() {
            r1 = this;
            boolean r0 = r1.defaultValue
            boolean r0 = r1.getOr(r0)
            return r0
    }

    public boolean getOr(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPreferences
            java.lang.String r1 = r2.key
            boolean r3 = r0.getBoolean(r1, r3)
            return r3
    }

    public void put(boolean r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r3)
            return
    }
}
