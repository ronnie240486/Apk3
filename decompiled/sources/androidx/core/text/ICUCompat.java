package androidx.core.text;

/* JADX INFO: loaded from: classes2.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getScript(java.util.Locale r0) {
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.icu.util.ULocale addLikelySubtags(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.icu.util.ULocale forLocale(java.util.Locale r0) {
                android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getScript(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L24
            java.lang.String r0 = "libcore.icu.ICU"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "addLikelySubtags"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1d
            r3 = 0
            java.lang.Class<java.util.Locale> r4 = java.util.Locale.class
            r2[r3] = r4     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1d
            androidx.core.text.ICUCompat.sAddLikelySubtagsMethod = r0     // Catch: java.lang.Exception -> L1d
            goto L24
        L1d:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L24:
            return
    }

    private ICUCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale r4) {
            java.lang.String r0 = "ICUCompat"
            java.lang.String r4 = r4.toString()
            java.lang.reflect.Method r1 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            if (r1 == 0) goto L21
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            return r1
        L18:
            r1 = move-exception
            android.util.Log.w(r0, r1)
            goto L21
        L1d:
            r1 = move-exception
            android.util.Log.w(r0, r1)
        L21:
            return r4
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static java.lang.String getScriptBelowApi21(java.lang.String r5) {
            java.lang.String r0 = "ICUCompat"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            if (r2 == 0) goto L1d
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.Object r5 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            return r5
        L14:
            r5 = move-exception
            android.util.Log.w(r0, r5)
            goto L1d
        L19:
            r5 = move-exception
            android.util.Log.w(r0, r5)
        L1d:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String maximizeAndGetScript(@androidx.annotation.NonNull java.util.Locale r4) {
            java.lang.String r0 = "ICUCompat"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L15
            android.icu.util.ULocale r4 = androidx.core.text.ICUCompat.Api24Impl.forLocale(r4)
            android.icu.util.ULocale r4 = androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(r4)
            java.lang.String r4 = androidx.core.text.ICUCompat.Api24Impl.getScript(r4)
            return r4
        L15:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            r3 = 0
            java.lang.Object r1 = r2.invoke(r3, r1)     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            java.util.Locale r1 = (java.util.Locale) r1     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            java.lang.String r4 = androidx.core.text.ICUCompat.Api21Impl.getScript(r1)     // Catch: java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L2e
            return r4
        L29:
            r1 = move-exception
            android.util.Log.w(r0, r1)
            goto L32
        L2e:
            r1 = move-exception
            android.util.Log.w(r0, r1)
        L32:
            java.lang.String r4 = androidx.core.text.ICUCompat.Api21Impl.getScript(r4)
            return r4
    }
}
