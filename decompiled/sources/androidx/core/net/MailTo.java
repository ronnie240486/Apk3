package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class MailTo {
    private static final java.lang.String BCC = "bcc";
    private static final java.lang.String BODY = "body";
    private static final java.lang.String CC = "cc";
    private static final java.lang.String MAILTO = "mailto";
    public static final java.lang.String MAILTO_SCHEME = "mailto:";
    private static final java.lang.String SUBJECT = "subject";
    private static final java.lang.String TO = "to";
    private java.util.HashMap<java.lang.String, java.lang.String> mHeaders;

    private MailTo() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHeaders = r0
            return
    }

    public static boolean isMailTo(@androidx.annotation.Nullable android.net.Uri r1) {
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.getScheme()
            java.lang.String r0 = "mailto"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public static boolean isMailTo(@androidx.annotation.Nullable java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "mailto:"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.core.net.MailTo parse(@androidx.annotation.NonNull android.net.Uri r0) throws androidx.core.net.ParseException {
            java.lang.String r0 = r0.toString()
            androidx.core.net.MailTo r0 = parse(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.net.MailTo parse(@androidx.annotation.NonNull java.lang.String r10) throws androidx.core.net.ParseException {
            androidx.core.util.Preconditions.checkNotNull(r10)
            boolean r0 = isMailTo(r10)
            if (r0 == 0) goto L8c
            r0 = 35
            int r0 = r10.indexOf(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L17
            java.lang.String r10 = r10.substring(r2, r0)
        L17:
            r0 = 63
            int r0 = r10.indexOf(r0)
            r3 = 0
            r4 = 7
            r5 = 1
            if (r0 != r1) goto L2d
            java.lang.String r10 = r10.substring(r4)
            java.lang.String r10 = android.net.Uri.decode(r10)
            r1 = r10
            r10 = r3
            goto L3a
        L2d:
            java.lang.String r1 = r10.substring(r4, r0)
            java.lang.String r1 = android.net.Uri.decode(r1)
            int r0 = r0 + r5
            java.lang.String r10 = r10.substring(r0)
        L3a:
            androidx.core.net.MailTo r0 = new androidx.core.net.MailTo
            r0.<init>()
            if (r10 == 0) goto L77
            java.lang.String r4 = "&"
            java.lang.String[] r10 = r10.split(r4)
            int r4 = r10.length
            r6 = 0
        L49:
            if (r6 >= r4) goto L77
            r7 = r10[r6]
            r8 = 2
            java.lang.String r9 = "="
            java.lang.String[] r7 = r7.split(r9, r8)
            int r8 = r7.length
            if (r8 != 0) goto L58
            goto L74
        L58:
            r8 = r7[r2]
            java.lang.String r8 = android.net.Uri.decode(r8)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            int r9 = r7.length
            if (r9 <= r5) goto L6e
            r7 = r7[r5]
            java.lang.String r7 = android.net.Uri.decode(r7)
            goto L6f
        L6e:
            r7 = r3
        L6f:
            java.util.HashMap<java.lang.String, java.lang.String> r9 = r0.mHeaders
            r9.put(r8, r7)
        L74:
            int r6 = r6 + 1
            goto L49
        L77:
            java.lang.String r10 = r0.getTo()
            if (r10 == 0) goto L83
            java.lang.String r2 = ", "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r10)
        L83:
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r0.mHeaders
            java.lang.String r2 = "to"
            r10.put(r2, r1)
            return r0
        L8c:
            androidx.core.net.ParseException r10 = new androidx.core.net.ParseException
            r10.<init>()
            throw r10
    }

    @androidx.annotation.Nullable
    public java.lang.String getBcc() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "bcc"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getBody() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "body"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getCc() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "cc"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.mHeaders
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getSubject() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "subject"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getTo() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "to"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mailto:"
            r0.<init>(r1)
            r1 = 63
            r0.append(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.mHeaders
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.encode(r3)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = android.net.Uri.encode(r2)
            r0.append(r2)
            r2 = 38
            r0.append(r2)
            goto L16
        L47:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
