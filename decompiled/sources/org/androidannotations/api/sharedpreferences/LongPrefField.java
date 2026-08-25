package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class LongPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final long defaultValue;

    public long get() {
            r2 = this;
            long r0 = r2.defaultValue
            long r0 = r2.getOr(r0)
            return r0
    }

    public long getOr(long r6) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.sharedPreferences     // Catch: java.lang.ClassCastException -> L9
            java.lang.String r1 = r5.key     // Catch: java.lang.ClassCastException -> L9
            long r6 = r0.getLong(r1, r6)     // Catch: java.lang.ClassCastException -> L9
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
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L28
            return r6
        L28:
            throw r0
    }

    public void put(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r3 = r0.putLong(r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r3)
            return
    }
}
