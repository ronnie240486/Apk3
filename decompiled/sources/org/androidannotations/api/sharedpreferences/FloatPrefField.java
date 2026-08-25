package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
public final class FloatPrefField extends org.androidannotations.api.sharedpreferences.AbstractPrefField {
    private final float defaultValue;

    public float get() {
            r1 = this;
            float r0 = r1.defaultValue
            float r0 = r1.getOr(r0)
            return r0
    }

    public float getOr(float r6) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.sharedPreferences     // Catch: java.lang.ClassCastException -> L9
            java.lang.String r1 = r5.key     // Catch: java.lang.ClassCastException -> L9
            float r6 = r0.getFloat(r1, r6)     // Catch: java.lang.ClassCastException -> L9
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
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> L28
            return r6
        L28:
            throw r0
    }

    public void put(float r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r1 = r2.key
            android.content.SharedPreferences$Editor r3 = r0.putFloat(r1, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r3)
            return
    }
}
