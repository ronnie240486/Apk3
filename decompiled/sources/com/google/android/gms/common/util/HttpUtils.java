package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class HttpUtils {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;
    private static final java.util.regex.Pattern zzc = null;

    static {
            java.lang.String r0 = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zza = r0
            java.lang.String r0 = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zzb = r0
            java.lang.String r0 = "^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zzc = r0
            return
    }

    private HttpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.Map<java.lang.String, java.lang.String> parse(@androidx.annotation.NonNull java.net.URI r6, @androidx.annotation.NonNull java.lang.String r7) {
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r6 = r6.getRawQuery()
            if (r6 == 0) goto L7c
            int r1 = r6.length()
            if (r1 <= 0) goto L7c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 61
            com.google.android.gms.internal.common.zzo r1 = com.google.android.gms.internal.common.zzo.zzb(r1)
            com.google.android.gms.internal.common.zzx r1 = com.google.android.gms.internal.common.zzx.zzc(r1)
            r2 = 38
            com.google.android.gms.internal.common.zzo r2 = com.google.android.gms.internal.common.zzo.zzb(r2)
            com.google.android.gms.internal.common.zzx r2 = com.google.android.gms.internal.common.zzx.zzc(r2)
            com.google.android.gms.internal.common.zzx r2 = r2.zzb()
            java.lang.Iterable r6 = r2.zzd(r6)
            java.util.Iterator r6 = r6.iterator()
        L35:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r2 = r1.zzf(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L74
            int r3 = r2.size()
            r4 = 2
            if (r3 > r4) goto L74
            r3 = 0
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = zza(r3, r7)
            int r5 = r2.size()
            if (r5 != r4) goto L6f
            r4 = 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = zza(r2, r7)
            goto L70
        L6f:
            r2 = 0
        L70:
            r0.put(r3, r2)
            goto L35
        L74:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "bad parameter"
            r6.<init>(r7)
            throw r6
        L7c:
            return r0
    }

    private static java.lang.String zza(java.lang.String r0, java.lang.String r1) {
            if (r1 != 0) goto L4
            java.lang.String r1 = "ISO-8859-1"
        L4:
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }
}
