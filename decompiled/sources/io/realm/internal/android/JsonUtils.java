package io.realm.internal.android;

/* JADX INFO: loaded from: classes2.dex */
public class JsonUtils {
    private static java.util.regex.Pattern jsonDate;
    private static java.util.regex.Pattern numericOnly;
    private static java.text.ParsePosition parsePosition;

    static {
            java.lang.String r0 = "/Date\\((\\d*)(?:[+-]\\d*)?\\)/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.realm.internal.android.JsonUtils.jsonDate = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.realm.internal.android.JsonUtils.numericOnly = r0
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r1 = 0
            r0.<init>(r1)
            io.realm.internal.android.JsonUtils.parsePosition = r0
            return
    }

    public JsonUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] stringToBytes(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Lf
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto Lf
        La:
            byte[] r2 = android.util.Base64.decode(r2, r0)
            return r2
        Lf:
            byte[] r2 = new byte[r0]
            return r2
    }

    @javax.annotation.Nullable
    public static java.util.Date stringToDate(java.lang.String r3) {
            if (r3 == 0) goto L5d
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L5d
        L9:
            java.util.regex.Pattern r0 = io.realm.internal.android.JsonUtils.jsonDate
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r1 = r0.find()
            if (r1 == 0) goto L24
            r3 = 1
            java.lang.String r3 = r0.group(r3)
            java.util.Date r0 = new java.util.Date
            long r1 = java.lang.Long.parseLong(r3)
            r0.<init>(r1)
            return r0
        L24:
            java.util.regex.Pattern r0 = io.realm.internal.android.JsonUtils.numericOnly
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L45
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.NumberFormatException -> L3a
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L3a
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L3a
            return r0
        L3a:
            r3 = move-exception
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
        L45:
            java.text.ParsePosition r0 = io.realm.internal.android.JsonUtils.parsePosition     // Catch: java.text.ParseException -> L52
            r1 = 0
            r0.setIndex(r1)     // Catch: java.text.ParseException -> L52
            java.text.ParsePosition r0 = io.realm.internal.android.JsonUtils.parsePosition     // Catch: java.text.ParseException -> L52
            java.util.Date r3 = io.realm.internal.android.ISO8601Utils.parse(r3, r0)     // Catch: java.text.ParseException -> L52
            return r3
        L52:
            r3 = move-exception
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
        L5d:
            r3 = 0
            return r3
    }
}
