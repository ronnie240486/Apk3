package io.realm.internal.android;

/* JADX INFO: loaded from: classes3.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = null;
    private static final java.util.TimeZone TIMEZONE_Z = null;
    private static final java.lang.String UTC_ID = "UTC";

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            io.realm.internal.android.ISO8601Utils.TIMEZONE_UTC = r0
            io.realm.internal.android.ISO8601Utils.TIMEZONE_Z = r0
            return
    }

    public ISO8601Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkOffset(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static int indexOfNonDigit(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L17
            char r0 = r2.charAt(r3)
            r1 = 48
            if (r0 < r1) goto L16
            r1 = 57
            if (r0 <= r1) goto L13
            goto L16
        L13:
            int r3 = r3 + 1
            goto L0
        L16:
            return r3
        L17:
            int r2 = r2.length()
            return r2
    }

    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
            r1 = r18
            r2 = r19
            java.lang.String r3 = "'"
            int r0 = r19.getIndex()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r4 = r0 + 4
            int r0 = parseInt(r1, r0, r4)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r5 = 45
            boolean r6 = checkOffset(r1, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r6 == 0) goto L1a
            int r4 = r4 + 1
        L1a:
            int r6 = r4 + 2
            int r4 = parseInt(r1, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            boolean r7 = checkOffset(r1, r6, r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r7 == 0) goto L28
            int r6 = r6 + 1
        L28:
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r8 = 84
            boolean r8 = checkOffset(r1, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r9 = 1
            if (r8 != 0) goto L4b
            int r10 = r18.length()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r10 > r7) goto L4b
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r4 = r4 - r9
            r5.<init>(r0, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r2.setIndex(r7)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.util.Date r0 = r5.getTime()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            return r0
        L4b:
            r10 = 43
            r11 = 90
            r12 = 2
            if (r8 == 0) goto Lc2
            int r7 = r7 + 1
            int r8 = r7 + 2
            int r7 = parseInt(r1, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r13 = 58
            boolean r14 = checkOffset(r1, r8, r13)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r14 == 0) goto L64
            int r8 = r8 + 1
        L64:
            int r14 = r8 + 2
            int r8 = parseInt(r1, r8, r14)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            boolean r13 = checkOffset(r1, r14, r13)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r13 == 0) goto L72
            int r14 = r14 + 1
        L72:
            int r13 = r18.length()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r13 <= r14) goto Lbf
            char r13 = r1.charAt(r14)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r13 == r11) goto Lbf
            if (r13 == r10) goto Lbf
            if (r13 == r5) goto Lbf
            int r5 = r14 + 2
            int r13 = parseInt(r1, r14, r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r14 = 59
            if (r13 <= r14) goto L92
            r14 = 63
            if (r13 >= r14) goto L92
            r13 = 59
        L92:
            r14 = 46
            boolean r14 = checkOffset(r1, r5, r14)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r14 == 0) goto Lbb
            int r5 = r5 + 1
            int r14 = r5 + 1
            int r14 = indexOfNonDigit(r1, r14)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r15 = r5 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r16 = parseInt(r1, r5, r15)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r15 = r15 - r5
            if (r15 == r9) goto Lb5
            if (r15 == r12) goto Lb2
            goto Lb7
        Lb2:
            int r16 = r16 * 10
            goto Lb7
        Lb5:
            int r16 = r16 * 100
        Lb7:
            r5 = r14
            r12 = r16
            goto Lcd
        Lbb:
            r16 = 0
            r12 = 0
            goto Lcd
        Lbf:
            r5 = r7
            r7 = r14
            goto Lc4
        Lc2:
            r5 = 0
            r8 = 0
        Lc4:
            r16 = 0
            r13 = 0
            r12 = 0
            r17 = r7
            r7 = r5
            r5 = r17
        Lcd:
            int r14 = r18.length()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r14 <= r5) goto L1b6
            char r14 = r1.charAt(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r14 != r11) goto Lde
            java.util.TimeZone r10 = io.realm.internal.android.ISO8601Utils.TIMEZONE_Z     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r5 = r5 + r9
            goto L184
        Lde:
            if (r14 == r10) goto Lff
            r9 = 45
            if (r14 != r9) goto Le5
            goto Lff
        Le5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r5 = "Invalid time zone indicator '"
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.append(r14)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
        Lff:
            java.lang.String r9 = r1.substring(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r10 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r5 = r5 + r10
            int r10 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r11 = 3
            if (r10 != r11) goto L120
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r9 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
        L120:
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r10 != 0) goto L182
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r10 == 0) goto L131
            goto L182
        L131:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r11 = "GMT"
            r10.append(r11)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r9 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r11 = r10.getID()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            boolean r14 = r11.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r14 != 0) goto L184
            java.lang.String r14 = ":"
            java.lang.String r15 = ""
            java.lang.String r11 = r11.replace(r14, r15)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            boolean r11 = r11.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            if (r11 == 0) goto L15f
            goto L184
        L15f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r5 = "Mismatching time zone indicator: "
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r5 = " given, resolves to "
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r5 = r10.getID()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
        L182:
            java.util.TimeZone r10 = io.realm.internal.android.ISO8601Utils.TIMEZONE_Z     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
        L184:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r9.<init>(r10)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10 = 0
            r9.setLenient(r10)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r10 = 1
            r9.set(r10, r0)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            int r4 = r4 - r10
            r0 = 2
            r9.set(r0, r4)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0 = 5
            r9.set(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0 = 11
            r9.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0 = 12
            r9.set(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0 = 13
            r9.set(r0, r13)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r0 = 14
            r9.set(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            r2.setIndex(r5)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.util.Date r0 = r9.getTime()     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            return r0
        L1b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            java.lang.String r4 = "No time zone indicator"
            r0.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1be java.lang.NumberFormatException -> L1c0 java.lang.IndexOutOfBoundsException -> L1c2
        L1be:
            r0 = move-exception
            goto L1c3
        L1c0:
            r0 = move-exception
            goto L1c3
        L1c2:
            r0 = move-exception
        L1c3:
            if (r1 != 0) goto L1c7
            r1 = 0
            goto L1db
        L1c7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 34
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L1db:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1e7
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L201
        L1e7:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L201:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r19.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    private static int parseInt(java.lang.String r5, int r6, int r7) throws java.lang.NumberFormatException {
            if (r6 < 0) goto L5f
            int r0 = r5.length()
            if (r7 > r0) goto L5f
            if (r6 > r7) goto L5f
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L33
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L35
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
        L33:
            r3 = 0
            r2 = r6
        L35:
            if (r2 >= r7) goto L5d
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L48
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L35
        L48:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
        L5d:
            int r5 = -r3
            return r5
        L5f:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }
}
