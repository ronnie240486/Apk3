package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedPreferencesCompat {
    private static final java.lang.reflect.Method sApplyMethod = null;
    private static final java.lang.reflect.Method sGetStringSetMethod = null;
    private static final java.lang.reflect.Method sPutStringSetMethod = null;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.content.SharedPreferences$Editor> r1 = android.content.SharedPreferences.Editor.class
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.String r4 = "apply"
            java.lang.reflect.Method r1 = findMethod(r1, r4, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sApplyMethod = r1
            java.lang.Class<android.content.SharedPreferences> r1 = android.content.SharedPreferences.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]
            r4[r2] = r0
            java.lang.Class<java.util.Set> r5 = java.util.Set.class
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "getStringSet"
            java.lang.reflect.Method r1 = findMethod(r1, r5, r4)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sGetStringSetMethod = r1
            java.lang.Class<android.content.SharedPreferences$Editor> r1 = android.content.SharedPreferences.Editor.class
            java.lang.Class[] r3 = new java.lang.Class[r3]
            r3[r2] = r0
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            r3[r6] = r0
            java.lang.String r0 = "putStringSet"
            java.lang.reflect.Method r0 = findMethod(r1, r0, r3)
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sPutStringSetMethod = r0
            return
    }

    private SharedPreferencesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void apply(android.content.SharedPreferences.Editor r2) {
            java.lang.reflect.Method r0 = org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sApplyMethod     // Catch: java.lang.NoSuchMethodException -> L9
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L9
            invoke(r0, r2, r1)     // Catch: java.lang.NoSuchMethodException -> L9
            return
        L9:
            r2.commit()
            return
    }

    private static java.lang.reflect.Method findMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.util.Set<java.lang.String> getStringSet(android.content.SharedPreferences r3, java.lang.String r4, java.util.Set<java.lang.String> r5) {
            java.lang.reflect.Method r0 = org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sGetStringSetMethod     // Catch: java.lang.NoSuchMethodException -> L12
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L12
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L12
            r2 = 1
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L12
            java.lang.Object r5 = invoke(r0, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L12
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.NoSuchMethodException -> L12
            return r5
        L12:
            r5 = 0
            java.lang.String r3 = r3.getString(r4, r5)
            java.util.Set r3 = org.androidannotations.api.sharedpreferences.SetXmlSerializer.deserialize(r3)
            return r3
    }

    public static <T> T invoke(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) throws java.lang.NoSuchMethodException {
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.getName()
            r1.<init>(r0)
            throw r1
        L11:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>()
            throw r0
    }

    public static void putStringSet(android.content.SharedPreferences.Editor r3, java.lang.String r4, java.util.Set<java.lang.String> r5) {
            java.lang.reflect.Method r0 = org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.sPutStringSetMethod     // Catch: java.lang.NoSuchMethodException -> Lf
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> Lf
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.NoSuchMethodException -> Lf
            r2 = 1
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> Lf
            invoke(r0, r3, r1)     // Catch: java.lang.NoSuchMethodException -> Lf
            goto L16
        Lf:
            java.lang.String r5 = org.androidannotations.api.sharedpreferences.SetXmlSerializer.serialize(r5)
            r3.putString(r4, r5)
        L16:
            return
    }
}
