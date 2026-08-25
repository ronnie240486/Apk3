package androidx.core.net;

/* JADX INFO: loaded from: classes2.dex */
public final class UriCompat {
    private UriCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String toSafeString(@androidx.annotation.NonNull android.net.Uri r7) {
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = r7.getSchemeSpecificPart()
            r2 = 58
            r3 = 64
            if (r0 == 0) goto Lce
            java.lang.String r4 = "tel"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9a
            java.lang.String r4 = "sip"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9a
            java.lang.String r4 = "sms"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9a
            java.lang.String r4 = "smsto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9a
            java.lang.String r4 = "mailto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9a
            java.lang.String r4 = "nfc"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L43
            goto L9a
        L43:
            java.lang.String r4 = "http"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L64
            java.lang.String r4 = "https"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L64
            java.lang.String r4 = "ftp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L64
            java.lang.String r4 = "rtsp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto Lce
        L64:
            java.lang.String r1 = "//"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r4 = r7.getHost()
            java.lang.String r5 = ""
            if (r4 == 0) goto L77
            java.lang.String r4 = r7.getHost()
            goto L78
        L77:
            r4 = r5
        L78:
            r1.append(r4)
            int r4 = r7.getPort()
            r6 = -1
            if (r4 == r6) goto L93
            java.lang.String r4 = ":"
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            int r7 = r7.getPort()
            r4.append(r7)
            java.lang.String r5 = r4.toString()
        L93:
            java.lang.String r7 = "/..."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r7)
            goto Lce
        L9a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r0)
            r7.append(r2)
            if (r1 == 0) goto Lc9
            r0 = 0
        La8:
            int r2 = r1.length()
            if (r0 >= r2) goto Lc9
            char r2 = r1.charAt(r0)
            r4 = 45
            if (r2 == r4) goto Lc3
            if (r2 == r3) goto Lc3
            r4 = 46
            if (r2 != r4) goto Lbd
            goto Lc3
        Lbd:
            r2 = 120(0x78, float:1.68E-43)
            r7.append(r2)
            goto Lc6
        Lc3:
            r7.append(r2)
        Lc6:
            int r0 = r0 + 1
            goto La8
        Lc9:
            java.lang.String r7 = r7.toString()
            return r7
        Lce:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            if (r0 == 0) goto Ldb
            r7.append(r0)
            r7.append(r2)
        Ldb:
            if (r1 == 0) goto Le0
            r7.append(r1)
        Le0:
            java.lang.String r7 = r7.toString()
            return r7
    }
}
