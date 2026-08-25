package com.andyhax.Setting;

/* JADX INFO: loaded from: classes2.dex */
public final class Prefs {
    private static final java.lang.String DEFAULT_SUFFIX = "";
    private static final java.lang.String LENGTH = "#LENGTH";
    private static android.content.SharedPreferences mPrefs;

    public static final class Builder {
        private android.content.Context mContext;
        private java.lang.String mKey;
        private int mMode;
        private boolean mUseDefault;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mMode = r0
                r0 = 0
                r1.mUseDefault = r0
                return
        }

        public void build() {
                r3 = this;
                android.content.Context r0 = r3.mContext
                if (r0 == 0) goto L3f
                java.lang.String r0 = r3.mKey
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L14
                android.content.Context r0 = r3.mContext
                java.lang.String r0 = r0.getPackageName()
                r3.mKey = r0
            L14:
                boolean r0 = r3.mUseDefault
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.mKey
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.mKey = r0
            L2d:
                int r0 = r3.mMode
                r1 = -1
                if (r0 != r1) goto L35
                r0 = 0
                r3.mMode = r0
            L35:
                android.content.Context r0 = r3.mContext
                java.lang.String r1 = r3.mKey
                int r2 = r3.mMode
                com.andyhax.Setting.Prefs.m44$$Nest$sminitPrefs(r0, r1, r2)
                return
            L3f:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Context not set, please set context before building the Prefs instance."
                r0.<init>(r1)
                throw r0
        }

        public com.andyhax.Setting.Prefs.Builder setContext(android.content.Context r1) {
                r0 = this;
                r0.mContext = r1
                return r0
        }

        public com.andyhax.Setting.Prefs.Builder setMode(int r3) {
                r2 = this;
                if (r3 == 0) goto L14
                r0 = 1
                if (r3 == r0) goto L14
                r0 = 2
                if (r3 == r0) goto L14
                r0 = 4
                if (r3 != r0) goto Lc
                goto L14
            Lc:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "The mode in the SharedPreference can only be set too ContextWrapper.MODE_PRIVATE, ContextWrapper.MODE_WORLD_READABLE, ContextWrapper.MODE_WORLD_WRITEABLE or ContextWrapper.MODE_MULTI_PROCESS"
                r0.<init>(r1)
                throw r0
            L14:
                r2.mMode = r3
                return r2
        }

        public com.andyhax.Setting.Prefs.Builder setPrefsName(java.lang.String r1) {
                r0 = this;
                r0.mKey = r1
                return r0
        }

        public com.andyhax.Setting.Prefs.Builder setUseDefaultSharedPreference(boolean r1) {
                r0 = this;
                r0.mUseDefault = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$sminitPrefs, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m44$$Nest$sminitPrefs(android.content.Context r0, java.lang.String r1, int r2) {
            initPrefs(r0, r1, r2)
            return
    }

    public Prefs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.SharedPreferences.Editor clear() {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            return r0
    }

    public static boolean contains(java.lang.String r1) {
            android.content.SharedPreferences r0 = getPreferences()
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static android.content.SharedPreferences.Editor edit() {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            return r0
    }

    public static java.util.Map<java.lang.String, ?> getAll() {
            android.content.SharedPreferences r0 = getPreferences()
            java.util.Map r0 = r0.getAll()
            return r0
    }

    public static boolean getBoolean(java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            r1 = 0
            boolean r0 = r0.getBoolean(r2, r1)
            return r0
    }

    public static boolean getBoolean(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getPreferences()
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static double getDouble(java.lang.String r3) {
            android.content.SharedPreferences r0 = getPreferences()
            r1 = 0
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r0 = r0.getLong(r3, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static double getDouble(java.lang.String r3, double r4) {
            android.content.SharedPreferences r0 = getPreferences()
            long r1 = java.lang.Double.doubleToLongBits(r4)
            long r0 = r0.getLong(r3, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static float getFloat(java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            r1 = 0
            float r0 = r0.getFloat(r2, r1)
            return r0
    }

    public static float getFloat(java.lang.String r1, float r2) {
            android.content.SharedPreferences r0 = getPreferences()
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int getInt(java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            r1 = 0
            int r0 = r0.getInt(r2, r1)
            return r0
    }

    public static int getInt(java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getPreferences()
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long getLong(java.lang.String r3) {
            android.content.SharedPreferences r0 = getPreferences()
            r1 = 0
            long r0 = r0.getLong(r3, r1)
            return r0
    }

    public static long getLong(java.lang.String r2, long r3) {
            android.content.SharedPreferences r0 = getPreferences()
            long r0 = r0.getLong(r2, r3)
            return r0
    }

    public static java.util.Set<java.lang.String> getOrderedStringSet(java.lang.String r6, java.util.Set<java.lang.String> r7) {
            android.content.SharedPreferences r0 = getPreferences()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = "#LENGTH"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L5e
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = -1
            int r2 = r0.getInt(r2, r3)
            if (r2 < 0) goto L5d
            r3 = 0
        L37:
            if (r3 >= r2) goto L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = "["
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            java.lang.String r4 = r0.getString(r4, r5)
            r1.add(r4)
            int r3 = r3 + 1
            goto L37
        L5d:
            return r1
        L5e:
            return r7
    }

    public static android.content.SharedPreferences getPreferences() {
            android.content.SharedPreferences r0 = com.andyhax.Setting.Prefs.mPrefs
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Prefs class not correctly instantiated. Please call Builder.setContext().build() in the Application class onCreate."
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String getString(java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            java.lang.String r1 = ""
            java.lang.String r0 = r0.getString(r2, r1)
            return r0
    }

    public static java.lang.String getString(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static java.util.Set<java.lang.String> getStringSet(java.lang.String r3, java.util.Set<java.lang.String> r4) {
            android.content.SharedPreferences r0 = getPreferences()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r1 < r2) goto Lf
            java.util.Set r1 = r0.getStringSet(r3, r4)
            return r1
        Lf:
            java.util.Set r1 = getOrderedStringSet(r3, r4)
            return r1
    }

    @java.lang.Deprecated
    public static void initPrefs(android.content.Context r1) {
            com.andyhax.Setting.Prefs$Builder r0 = new com.andyhax.Setting.Prefs$Builder
            r0.<init>()
            com.andyhax.Setting.Prefs$Builder r0 = r0.setContext(r1)
            r0.build()
            return
    }

    private static void initPrefs(android.content.Context r1, java.lang.String r2, int r3) {
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r3)
            com.andyhax.Setting.Prefs.mPrefs = r0
            return
    }

    public static void putBoolean(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r1, r2)
            r0.apply()
            return
    }

    public static void putDouble(java.lang.String r3, double r4) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = java.lang.Double.doubleToRawLongBits(r4)
            r0.putLong(r3, r1)
            r0.apply()
            return
    }

    public static void putFloat(java.lang.String r1, float r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putFloat(r1, r2)
            r0.apply()
            return
    }

    public static void putInt(java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putInt(r1, r2)
            r0.apply()
            return
    }

    public static void putLong(java.lang.String r1, long r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putLong(r1, r2)
            r0.apply()
            return
    }

    public static void putOrderedStringSet(java.lang.String r8, java.util.Set<java.lang.String> r9) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 0
            android.content.SharedPreferences r2 = com.andyhax.Setting.Prefs.mPrefs
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = "#LENGTH"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            android.content.SharedPreferences r2 = com.andyhax.Setting.Prefs.mPrefs
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5 = -1
            int r1 = r2.getInt(r3, r5)
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r3 = r9.size()
            r0.putInt(r2, r3)
            r2 = 0
            java.util.Iterator r3 = r9.iterator()
        L53:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "]"
            java.lang.String r6 = "["
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r6)
            r7.append(r2)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r0.putString(r5, r4)
            int r2 = r2 + 1
            goto L53
        L7f:
            if (r2 >= r1) goto L9c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r6)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.remove(r3)
            int r2 = r2 + 1
            goto L7f
        L9c:
            r0.apply()
            return
    }

    public static void putString(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r1, r2)
            r0.apply()
            return
    }

    public static void putStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L15
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putStringSet(r2, r3)
            r0.apply()
            goto L18
        L15:
            putOrderedStringSet(r2, r3)
        L18:
            return
    }

    public static void remove(java.lang.String r6) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "#LENGTH"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4 = -1
            int r2 = r0.getInt(r2, r4)
            if (r2 < 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.remove(r3)
            r3 = 0
        L48:
            if (r3 >= r2) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = "["
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.remove(r4)
            int r3 = r3 + 1
            goto L48
        L69:
            r1.remove(r6)
            r1.apply()
            return
    }
}
