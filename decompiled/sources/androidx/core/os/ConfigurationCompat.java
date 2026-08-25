package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationCompat {

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList getLocales(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                return r0
        }
    }

    private ConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.os.LocaleListCompat getLocales(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r2 = androidx.core.os.ConfigurationCompat.Api24Impl.getLocales(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.wrap(r2)
            return r2
        Lf:
            r0 = 1
            java.util.Locale[] r0 = new java.util.Locale[r0]
            r1 = 0
            java.util.Locale r2 = r2.locale
            r0[r1] = r2
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.create(r0)
            return r2
    }
}
