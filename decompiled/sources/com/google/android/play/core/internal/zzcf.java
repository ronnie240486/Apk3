package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcf {
    private final android.content.Context zza;

    public zzcf(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static java.lang.String zzb(java.util.Locale r3) {
            java.lang.String r0 = r3.getLanguage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r3.getCountry()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            java.lang.String r3 = ""
            goto L2f
        L15:
            java.lang.String r3 = r3.getCountry()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "_"
            int r2 = r3.length()
            if (r2 == 0) goto L2a
            java.lang.String r3 = r1.concat(r3)
            goto L2f
        L2a:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L2f:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            if (r1 == 0) goto L3e
            java.lang.String r3 = r0.concat(r3)
            goto L43
        L3e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L43:
            return r3
    }

    public final java.util.List zza() {
            r4 = this;
            android.content.Context r0 = r4.zza
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L33
            android.os.LocaleList r0 = r0.getLocales()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r2 = 0
        L1e:
            int r3 = r0.size()
            if (r2 >= r3) goto L32
            java.util.Locale r3 = r0.get(r2)
            java.lang.String r3 = zzb(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1e
        L32:
            return r1
        L33:
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = zzb(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }
}
