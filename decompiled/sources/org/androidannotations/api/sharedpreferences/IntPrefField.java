package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class IntPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final int defaultValue;

    public int get() {
            r1 = this;
            int r0 = r1.defaultValue
            int r0 = r1.getOr(r0)
            return r0
    }

    public int getOr(int r6) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.sharedPreferences     // Catch: java.lang.ClassCastException -> L9
            java.lang.String r1 = r5.key     // Catch: java.lang.ClassCastException -> L9
            int r6 = r0.getInt(r1, r6)     // Catch: java.lang.ClassCastException -> L9
            return r6
        L9:
            r0 = move-exception
            android.content.SharedPreferences r1 = r5.sharedPreferences     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r5.key     // Catch: java.lang.Exception -> L28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L28
            r3.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Exception -> L28
            r3.append(r6)     // Catch: java.lang.Exception -> L28
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Exception -> L28
            java.lang.String r6 = r1.getString(r2, r6)     // Catch: java.lang.Exception -> L28
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L28
            return r6
        L28:
            throw r0
    }

    public void put(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r3)
            return
    }
}
