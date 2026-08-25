package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcj {
    public static java.lang.String zza(java.io.File r3) {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = ".apk"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L4e
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "(_\\d+)?\\.apk"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceFirst(r0, r1)
            java.lang.String r0 = "base-master"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "base-main"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L29
            goto L4d
        L29:
            java.lang.String r0 = "base-"
            boolean r2 = r3.startsWith(r0)
            if (r2 == 0) goto L38
            java.lang.String r1 = "config."
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
        L38:
            java.lang.String r0 = "-"
            java.lang.String r2 = ".config."
            java.lang.String r3 = r3.replace(r0, r2)
            java.lang.String r0 = ".config.master"
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = ".config.main"
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
        L4d:
            return r1
        L4e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-apk found in splits directory."
            r3.<init>(r0)
            throw r3
    }
}
