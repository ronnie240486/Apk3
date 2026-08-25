package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleManagerCompat {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String toLanguageTag(java.util.Locale r0) {
                java.lang.String r0 = r0.toLanguageTag()
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
        public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList localeManagerGetSystemLocales(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getSystemLocales()
                return r0
        }
    }

    private LocaleManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(33)
    private static java.lang.Object getLocaleManagerForApplication(android.content.Context r1) {
            java.lang.String r0 = "locale"
            java.lang.Object r1 = r1.getSystemService(r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.AnyThread
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static androidx.core.os.LocaleListCompat getSystemLocales(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r1 == 0) goto L19
            java.lang.Object r2 = getLocaleManagerForApplication(r2)
            if (r2 == 0) goto L3b
            android.os.LocaleList r2 = androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetSystemLocales(r2)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r2)
            goto L3b
        L19:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L30
            androidx.core.os.LocaleListCompat r2 = androidx.core.app.LocaleManagerCompat.Api24Impl.getLocales(r2)
            goto L3a
        L30:
            java.util.Locale r2 = r2.locale
            java.lang.String r2 = androidx.core.app.LocaleManagerCompat.Api21Impl.toLanguageTag(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.forLanguageTags(r2)
        L3a:
            r0 = r2
        L3b:
            return r0
    }
}
