package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.util.VisibleForTesting
public final class zzc {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "\\\\u[0-9a-fA-F]{4}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.zzc.zza = r0
            return
    }

    public static java.lang.String zza(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L40
            java.util.regex.Pattern r0 = com.google.android.gms.common.util.zzc.zza
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r1 = 0
        Ld:
            boolean r2 = r0.find()
            if (r2 == 0) goto L36
            if (r1 != 0) goto L1a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L1a:
            java.lang.String r2 = r0.group()
            r3 = 2
            java.lang.String r2 = r2.substring(r3)
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)
            java.lang.String r3 = new java.lang.String
            char[] r2 = java.lang.Character.toChars(r2)
            r3.<init>(r2)
            r0.appendReplacement(r1, r3)
            goto Ld
        L36:
            if (r1 != 0) goto L39
            return r4
        L39:
            r0.appendTail(r1)
            java.lang.String r4 = r1.toString()
        L40:
            return r4
    }
}
