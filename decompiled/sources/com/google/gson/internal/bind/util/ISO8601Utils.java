package com.google.gson.internal.bind.util;

/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = null;
    private static final java.lang.String UTC_ID = "UTC";

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC = r0
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

    public static java.lang.String format(java.util.Date r2) {
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            r1 = 0
            java.lang.String r2 = format(r2, r1, r0)
            return r2
    }

    public static java.lang.String format(java.util.Date r1, boolean r2) {
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r1 = format(r1, r2, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r6, boolean r7, java.util.TimeZone r8) {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r8, r1)
            r0.setTime(r6)
            r6 = 4
            if (r7 == 0) goto Lf
            r1 = 4
            goto L10
        Lf:
            r1 = 0
        L10:
            r2 = 19
            int r2 = r2 + r1
            int r1 = r8.getRawOffset()
            r3 = 1
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 6
        L1d:
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            int r2 = r0.get(r3)
            padInt(r1, r2, r6)
            r6 = 45
            r1.append(r6)
            r2 = 2
            int r4 = r0.get(r2)
            int r4 = r4 + r3
            padInt(r1, r4, r2)
            r1.append(r6)
            r3 = 5
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 84
            r1.append(r3)
            r3 = 11
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 58
            r1.append(r3)
            r4 = 12
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            r1.append(r3)
            r4 = 13
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            if (r7 == 0) goto L7c
            r7 = 46
            r1.append(r7)
            r7 = 14
            int r7 = r0.get(r7)
            r4 = 3
            padInt(r1, r7, r4)
        L7c:
            long r4 = r0.getTimeInMillis()
            int r7 = r8.getOffset(r4)
            if (r7 == 0) goto La9
            r8 = 60000(0xea60, float:8.4078E-41)
            int r8 = r7 / r8
            int r0 = r8 / 60
            int r0 = java.lang.Math.abs(r0)
            int r8 = r8 % 60
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= 0) goto L9a
            goto L9c
        L9a:
            r6 = 43
        L9c:
            r1.append(r6)
            padInt(r1, r0, r2)
            r1.append(r3)
            padInt(r1, r8, r2)
            goto Lae
        La9:
            r6 = 90
            r1.append(r6)
        Lae:
            java.lang.String r6 = r1.toString()
            return r6
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

    private static void padInt(java.lang.StringBuilder r1, int r2, int r3) {
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r0 = r2.length()
            int r3 = r3 - r0
        L9:
            if (r3 <= 0) goto L13
            r0 = 48
            r1.append(r0)
            int r3 = r3 + (-1)
            goto L9
        L13:
            r1.append(r2)
            return
    }

    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r3 = r0 + 4
            int r0 = parseInt(r1, r0, r3)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r4 = 45
            boolean r5 = checkOffset(r1, r3, r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r5 == 0) goto L18
            int r3 = r3 + 1
        L18:
            int r5 = r3 + 2
            int r3 = parseInt(r1, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            boolean r6 = checkOffset(r1, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r6 == 0) goto L26
            int r5 = r5 + 1
        L26:
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r7 = 84
            boolean r7 = checkOffset(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r8 = 1
            if (r7 != 0) goto L49
            int r9 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r9 > r6) goto L49
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r2.setIndex(r6)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.util.Date r0 = r4.getTime()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            return r0
        L49:
            r9 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto Lc2
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r12 = 58
            boolean r13 = checkOffset(r1, r7, r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r13 == 0) goto L62
            int r7 = r7 + 1
        L62:
            int r13 = r7 + 2
            int r7 = parseInt(r1, r7, r13)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            boolean r12 = checkOffset(r1, r13, r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r12 == 0) goto L70
            int r13 = r13 + 1
        L70:
            int r12 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r12 <= r13) goto Lbb
            char r12 = r1.charAt(r13)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r12 == r10) goto Lbb
            if (r12 == r9) goto Lbb
            if (r12 == r4) goto Lbb
            int r12 = r13 + 2
            int r13 = parseInt(r1, r13, r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r14 = 59
            if (r13 <= r14) goto L90
            r14 = 63
            if (r13 >= r14) goto L90
            r13 = 59
        L90:
            r14 = 46
            boolean r14 = checkOffset(r1, r12, r14)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r14 == 0) goto Lb7
            int r12 = r12 + 1
            int r14 = r12 + 1
            int r14 = indexOfNonDigit(r1, r14)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r15 = r12 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r16 = parseInt(r1, r12, r15)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r15 = r15 - r12
            if (r15 == r8) goto Lb3
            if (r15 == r11) goto Lb0
            goto Lb5
        Lb0:
            int r16 = r16 * 10
            goto Lb5
        Lb3:
            int r16 = r16 * 100
        Lb5:
            r12 = r14
            goto Lcb
        Lb7:
            r16 = 0
            r11 = 0
            goto Lcd
        Lbb:
            r11 = 0
            r11 = r7
            r16 = 0
            r7 = r6
            r6 = r13
            goto Lc7
        Lc2:
            r7 = 0
            r11 = 0
            r12 = 0
            r16 = 0
        Lc7:
            r13 = 0
            r12 = r6
            r6 = r7
            r7 = r11
        Lcb:
            r11 = r16
        Lcd:
            int r14 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r14 <= r12) goto L1b8
            char r14 = r1.charAt(r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r15 = 5
            if (r14 != r10) goto Ldf
            java.util.TimeZone r4 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r12 = r12 + r8
            goto L187
        Ldf:
            if (r14 == r9) goto L100
            if (r14 != r4) goto Le4
            goto L100
        Le4:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r3.append(r14)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
        L100:
            java.lang.String r4 = r1.substring(r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r9 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r9 < r15) goto L10b
            goto L11c
        L10b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.<init>()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = r9.toString()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
        L11c:
            int r9 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r12 = r12 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r9 != 0) goto L185
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r9 == 0) goto L132
            goto L185
        L132:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.<init>()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = r9.toString()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r10 = r9.getID()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            boolean r14 = r10.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r14 != 0) goto L183
            java.lang.String r14 = ":"
            java.lang.String r15 = ""
            java.lang.String r10 = r10.replace(r14, r15)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            boolean r10 = r10.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            if (r10 == 0) goto L160
            goto L183
        L160:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r4 = r9.getID()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
        L183:
            r4 = r9
            goto L187
        L185:
            java.util.TimeZone r4 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
        L187:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r4 = 0
            r9.setLenient(r4)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r9.set(r8, r0)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0 = 5
            r9.set(r0, r5)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0 = 11
            r9.set(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0 = 12
            r9.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0 = 13
            r9.set(r0, r13)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r0 = 14
            r9.set(r0, r11)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            r2.setIndex(r12)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.util.Date r0 = r9.getTime()     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            return r0
        L1b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1c0 java.lang.NumberFormatException -> L1c2 java.lang.IndexOutOfBoundsException -> L1c4
        L1c0:
            r0 = move-exception
            goto L1c5
        L1c2:
            r0 = move-exception
            goto L1c5
        L1c4:
            r0 = move-exception
        L1c5:
            if (r1 != 0) goto L1c9
            r1 = 0
            goto L1dd
        L1c9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L1dd:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1e9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L203
        L1e9:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L203:
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
            int r2 = r18.getIndex()
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
