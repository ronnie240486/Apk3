package androidx.core.telephony.mbms;

/* JADX INFO: loaded from: classes2.dex */
public final class MbmsHelper {

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.CharSequence getBestNameForService(android.content.Context r5, android.telephony.mbms.ServiceInfo r6) {
                java.util.Set r0 = r6.getNamedContentLocales()
                boolean r1 = r0.isEmpty()
                r2 = 0
                if (r1 == 0) goto Lc
                return r2
            Lc:
                int r0 = r0.size()
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.util.Set r3 = r6.getNamedContentLocales()
                java.util.Iterator r3 = r3.iterator()
            L1b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L30
                java.lang.Object r4 = r3.next()
                java.util.Locale r4 = (java.util.Locale) r4
                java.lang.String r4 = r4.toLanguageTag()
                r0[r1] = r4
                int r1 = r1 + 1
                goto L1b
            L30:
                android.content.res.Resources r5 = r5.getResources()
                android.content.res.Configuration r5 = r5.getConfiguration()
                android.os.LocaleList r5 = r5.getLocales()
                java.util.Locale r5 = r5.getFirstMatch(r0)
                if (r5 != 0) goto L43
                goto L47
            L43:
                java.lang.CharSequence r2 = r6.getNameForLocale(r5)
            L47:
                return r2
        }
    }

    private MbmsHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.CharSequence getBestNameForService(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.telephony.mbms.ServiceInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.CharSequence r2 = androidx.core.telephony.mbms.MbmsHelper.Api28Impl.getBestNameForService(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
