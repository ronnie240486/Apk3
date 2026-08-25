package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = null;
    private static final char[] zab = null;
    private static final char[] zac = null;
    private static final char[] zad = null;
    private static final char[] zae = null;
    private static final char[] zaf = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.Integer> zag = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.Long> zah = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.Float> zai = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.Double> zaj = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.Boolean> zak = null;
    private static final com.google.android.gms.common.server.response.zai<java.lang.String> zal = null;
    private static final com.google.android.gms.common.server.response.zai<java.math.BigInteger> zam = null;
    private static final com.google.android.gms.common.server.response.zai<java.math.BigDecimal> zan = null;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final java.lang.StringBuilder zar;
    private final java.lang.StringBuilder zas;
    private final java.util.Stack<java.lang.Integer> zat;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class ParseException extends java.lang.Exception {
        public ParseException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ParseException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                java.lang.String r1 = "Error instantiating inner object"
                r0.<init>(r1, r2)
                return
        }

        public ParseException(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [117, 108, 108} // fill-array
            com.google.android.gms.common.server.response.FastParser.zaa = r1
            char[] r0 = new char[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [114, 117, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zab = r0
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [114, 117, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zac = r1
            char[] r0 = new char[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [97, 108, 115, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zad = r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x008a: FILL_ARRAY_DATA , data: [97, 108, 115, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zae = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 10
            r0[r1] = r2
            com.google.android.gms.common.server.response.FastParser.zaf = r0
            com.google.android.gms.common.server.response.zaa r0 = new com.google.android.gms.common.server.response.zaa
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zag = r0
            com.google.android.gms.common.server.response.zab r0 = new com.google.android.gms.common.server.response.zab
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zah = r0
            com.google.android.gms.common.server.response.zac r0 = new com.google.android.gms.common.server.response.zac
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zai = r0
            com.google.android.gms.common.server.response.zad r0 = new com.google.android.gms.common.server.response.zad
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zaj = r0
            com.google.android.gms.common.server.response.zae r0 = new com.google.android.gms.common.server.response.zae
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zak = r0
            com.google.android.gms.common.server.response.zaf r0 = new com.google.android.gms.common.server.response.zaf
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zal = r0
            com.google.android.gms.common.server.response.zag r0 = new com.google.android.gms.common.server.response.zag
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zam = r0
            com.google.android.gms.common.server.response.zah r0 = new com.google.android.gms.common.server.response.zah
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zan = r0
            return
    }

    public FastParser() {
            r3 = this;
            r3.<init>()
            r0 = 1
            char[] r0 = new char[r0]
            r3.zao = r0
            r0 = 32
            char[] r1 = new char[r0]
            r3.zap = r1
            r1 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r1]
            r3.zaq = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r3.zar = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r3.zas = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r3.zat = r0
            return
    }

    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, @androidx.annotation.Nullable char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = 0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = 0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L53
            if (r2 != 0) goto L5c
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r6 = 92
            if (r5 != r6) goto L5c
            r1 = r2 ^ 1
            r2 = r1
            r1 = 1
            goto L5d
        L5c:
            r2 = 0
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
    }

    public static /* bridge */ /* synthetic */ double zaa(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            double r0 = r0.zaj(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ float zab(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            float r0 = r0.zak(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int zac(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            int r0 = r0.zal(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ long zad(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            long r0 = r0.zan(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zae(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.lang.String r0 = r0.zao(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.math.BigDecimal zaf(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigDecimal r0 = r0.zas(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.math.BigInteger zag(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigInteger r0 = r0.zat(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.server.response.FastParser r1, java.io.BufferedReader r2) {
            r0 = 0
            boolean r1 = r1.zay(r2, r0)
            return r1
    }

    private final char zai(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L22
        La:
            char[] r0 = r3.zao
            char r0 = r0[r2]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1d
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            if (r0 != r1) goto La
            return r2
        L1d:
            char[] r4 = r3.zao
            char r4 = r4[r2]
            return r4
        L22:
            return r2
    }

    private final double zaj(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.zaq
            r2 = 0
            r0.<init>(r1, r2, r4)
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    private final float zak(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto La
            r4 = 0
            return r4
        La:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.zaq
            r2 = 0
            r0.<init>(r1, r2, r4)
            float r4 = java.lang.Float.parseFloat(r0)
            return r4
    }

    private final int zal(java.io.BufferedReader r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r11 = this;
            char[] r0 = r11.zaq
            int r12 = r11.zam(r12, r0)
            r0 = 0
            if (r12 != 0) goto La
            return r0
        La:
            char[] r1 = r11.zaq
            if (r12 <= 0) goto L77
            char r2 = r1[r0]
            r3 = 45
            if (r2 != r3) goto L17
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1a
        L17:
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L1a:
            r5 = 1
            if (r2 != r3) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r3 = "Unexpected non-digit character"
            r6 = 10
            if (r2 >= r12) goto L38
            int r0 = r2 + 1
            char r7 = r1[r2]
            int r7 = java.lang.Character.digit(r7, r6)
            if (r7 < 0) goto L32
            int r7 = -r7
            goto L3a
        L32:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L38:
            r0 = r2
            r7 = 0
        L3a:
            if (r0 >= r12) goto L68
            int r8 = r0 + 1
            char r0 = r1[r0]
            int r0 = java.lang.Character.digit(r0, r6)
            if (r0 < 0) goto L62
            r9 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            java.lang.String r10 = "Number too large"
            if (r7 < r9) goto L5c
            int r7 = r7 * 10
            int r9 = r4 + r0
            if (r7 < r9) goto L56
            int r7 = r7 - r0
            r0 = r8
            goto L3a
        L56:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L5c:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L62:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L68:
            if (r2 == 0) goto L75
            if (r0 <= r5) goto L6d
            goto L76
        L6d:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No digits to parse"
            r12.<init>(r0)
            throw r12
        L75:
            int r7 = -r7
        L76:
            return r7
        L77:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No number to parse"
            r12.<init>(r0)
            throw r12
    }

    private final int zam(java.io.BufferedReader r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r10 = this;
            char r0 = r10.zai(r11)
            java.lang.String r1 = "Unexpected EOF"
            if (r0 == 0) goto L9d
            r2 = 44
            if (r0 == r2) goto L95
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            if (r0 != r3) goto L17
            char[] r12 = com.google.android.gms.common.server.response.FastParser.zaa
            r10.zax(r11, r12)
            return r4
        L17:
            r3 = 1024(0x400, float:1.435E-42)
            r11.mark(r3)
            r5 = 34
            r6 = -1
            r7 = 1
            if (r0 != r5) goto L56
            r0 = 0
            r2 = 0
        L24:
            if (r0 >= r3) goto L85
            int r8 = r11.read(r12, r0, r7)
            if (r8 == r6) goto L85
            char r8 = r12[r0]
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 != 0) goto L4e
            if (r8 != r5) goto L43
            if (r2 == 0) goto L39
            goto L4a
        L39:
            r11.reset()
            int r12 = r0 + 1
            long r1 = (long) r12
            r11.skip(r1)
            return r0
        L43:
            r9 = 92
            if (r8 != r9) goto L4a
            r2 = r2 ^ 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            int r0 = r0 + 1
            goto L24
        L4e:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Unexpected control character while reading string"
            r11.<init>(r12)
            throw r11
        L56:
            r12[r4] = r0
            r0 = 1
        L59:
            if (r0 >= r3) goto L85
            int r5 = r11.read(r12, r0, r7)
            if (r5 == r6) goto L85
            char r5 = r12[r0]
            r8 = 125(0x7d, float:1.75E-43)
            if (r5 == r8) goto L79
            if (r5 == r2) goto L79
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 != 0) goto L79
            char r5 = r12[r0]
            r8 = 93
            if (r5 != r8) goto L76
            goto L79
        L76:
            int r0 = r0 + 1
            goto L59
        L79:
            r11.reset()
            int r1 = r0 + (-1)
            long r1 = (long) r1
            r11.skip(r1)
            r12[r0] = r4
            return r0
        L85:
            if (r0 != r3) goto L8f
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Absurdly long value"
            r11.<init>(r12)
            throw r11
        L8f:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
        L95:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Missing value"
            r11.<init>(r12)
            throw r11
        L9d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
    }

    private final long zan(java.io.BufferedReader r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r18 = this;
            r0 = r18
            char[] r1 = r0.zaq
            r2 = r19
            int r1 = r0.zam(r2, r1)
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            char[] r4 = r0.zaq
            if (r1 <= 0) goto L87
            r5 = 0
            char r6 = r4[r5]
            r7 = 45
            if (r6 != r7) goto L1d
            r8 = -9223372036854775808
            goto L22
        L1d:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            r10 = 1
            if (r6 != r7) goto L26
            r5 = 1
        L26:
            java.lang.String r6 = "Unexpected non-digit character"
            r7 = 10
            if (r5 >= r1) goto L3f
            int r2 = r5 + 1
            char r3 = r4[r5]
            int r3 = java.lang.Character.digit(r3, r7)
            if (r3 < 0) goto L39
            int r3 = -r3
            long r11 = (long) r3
            goto L41
        L39:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L3f:
            r11 = r2
            r2 = r5
        L41:
            if (r2 >= r1) goto L78
            int r3 = r2 + 1
            char r2 = r4[r2]
            int r2 = java.lang.Character.digit(r2, r7)
            if (r2 < 0) goto L72
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r15 = "Number too large"
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 < 0) goto L6c
            r13 = 10
            long r11 = r11 * r13
            long r13 = (long) r2
            long r16 = r8 + r13
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 < 0) goto L66
            long r11 = r11 - r13
            r2 = r3
            goto L41
        L66:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L6c:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L72:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L78:
            if (r5 == 0) goto L85
            if (r2 <= r10) goto L7d
            goto L86
        L7d:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No digits to parse"
            r1.<init>(r2)
            throw r1
        L85:
            long r11 = -r11
        L86:
            return r11
        L87:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No number to parse"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.Nullable
    private final java.lang.String zao(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zap
            java.lang.StringBuilder r1 = r3.zar
            r2 = 0
            java.lang.String r4 = r3.zap(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.Nullable
    private final java.lang.String zap(java.io.BufferedReader r3, char[] r4, java.lang.StringBuilder r5, @androidx.annotation.Nullable char[] r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.zai(r3)
            r1 = 34
            if (r0 == r1) goto L1b
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L13
            char[] r4 = com.google.android.gms.common.server.response.FastParser.zaa
            r2.zax(r3, r4)
            r3 = 0
            return r3
        L13:
            com.google.android.gms.common.server.response.FastParser$ParseException r3 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r4 = "Expected string"
            r3.<init>(r4)
            throw r3
        L1b:
            java.lang.String r3 = zaA(r3, r4, r5, r6)
            return r3
    }

    @androidx.annotation.Nullable
    private final java.lang.String zaq(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            java.util.Stack<java.lang.Integer> r0 = r4.zat
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char r0 = r4.zai(r5)
            r2 = 34
            r3 = 0
            if (r0 == r2) goto L44
            r5 = 93
            if (r0 == r5) goto L38
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto L1f
            r4.zaw(r1)
            return r3
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 19
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected token: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L38:
            r4.zaw(r1)
            r5 = 1
            r4.zaw(r5)
            r5 = 5
            r4.zaw(r5)
            return r3
        L44:
            java.util.Stack<java.lang.Integer> r0 = r4.zat
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char[] r0 = r4.zap
            java.lang.StringBuilder r2 = r4.zar
            java.lang.String r0 = zaA(r5, r0, r2, r3)
            r4.zaw(r1)
            char r5 = r4.zai(r5)
            r1 = 58
            if (r5 != r1) goto L62
            return r0
        L62:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Expected key/value separator"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.Nullable
    private final java.lang.String zar(java.io.BufferedReader r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1024(0x400, float:1.435E-42)
            r1.mark(r2)
            char r2 = r17.zai(r18)
            r3 = 92
            java.lang.String r4 = "Unexpected token "
            r5 = 18
            r6 = 125(0x7d, float:1.75E-43)
            r7 = 44
            r8 = 34
            r9 = 0
            r10 = 1
            if (r2 == r8) goto Ld7
            if (r2 == r7) goto Lcf
            r11 = 32
            r12 = 91
            if (r2 == r12) goto L72
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L33
            r18.reset()
            char[] r2 = r0.zaq
            r0.zam(r1, r2)
            goto Lef
        L33:
            java.util.Stack<java.lang.Integer> r2 = r0.zat
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.push(r3)
            r1.mark(r11)
            char r2 = r17.zai(r18)
            if (r2 != r6) goto L4a
            r0.zaw(r10)
            goto Lef
        L4a:
            if (r2 != r8) goto L5d
            r18.reset()
            r17.zaq(r18)
        L52:
            java.lang.String r2 = r17.zar(r18)
            if (r2 != 0) goto L52
            r0.zaw(r10)
            goto Lef
        L5d:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L72:
            java.util.Stack<java.lang.Integer> r2 = r0.zat
            r13 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r2.push(r14)
            r1.mark(r11)
            char r2 = r17.zai(r18)
            r11 = 93
            if (r2 != r11) goto L8b
            r0.zaw(r13)
            goto Lef
        L8b:
            r18.reset()
            r2 = 0
        L8f:
            r14 = 0
        L90:
            if (r10 <= 0) goto Lcb
            char r15 = r17.zai(r18)
            if (r15 == 0) goto Lc3
            boolean r16 = java.lang.Character.isISOControl(r15)
            if (r16 != 0) goto Lbb
            if (r15 != r8) goto La6
            if (r14 != 0) goto La4
            r2 = r2 ^ 1
        La4:
            r15 = 34
        La6:
            if (r15 != r12) goto Lae
            if (r2 != 0) goto Lac
            int r10 = r10 + 1
        Lac:
            r15 = 91
        Lae:
            if (r15 != r11) goto Lb4
            if (r2 != 0) goto Lb4
            int r10 = r10 + (-1)
        Lb4:
            if (r15 != r3) goto L8f
            if (r2 == 0) goto L8f
            r14 = r14 ^ 1
            goto L90
        Lbb:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected control character while reading array"
            r1.<init>(r2)
            throw r1
        Lc3:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF while parsing array"
            r1.<init>(r2)
            throw r1
        Lcb:
            r0.zaw(r13)
            goto Lef
        Lcf:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Missing value"
            r1.<init>(r2)
            throw r1
        Ld7:
            char[] r2 = r0.zao
            int r2 = r1.read(r2)
            java.lang.String r11 = "Unexpected EOF while parsing string"
            r12 = -1
            if (r2 == r12) goto L142
            char[] r2 = r0.zao
            char r2 = r2[r9]
            r13 = 0
        Le7:
            if (r2 != r8) goto L11a
            if (r13 == 0) goto Lef
            r2 = 34
            r13 = 1
            goto L11a
        Lef:
            char r2 = r17.zai(r18)
            r3 = 2
            if (r2 == r7) goto L112
            if (r2 != r6) goto Lfd
            r0.zaw(r3)
            r1 = 0
            return r1
        Lfd:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L112:
            r0.zaw(r3)
            java.lang.String r1 = r17.zaq(r18)
            return r1
        L11a:
            if (r2 != r3) goto L120
            r2 = r13 ^ 1
            r13 = r2
            goto L121
        L120:
            r13 = 0
        L121:
            char[] r2 = r0.zao
            int r2 = r1.read(r2)
            if (r2 == r12) goto L13c
            char[] r2 = r0.zao
            char r2 = r2[r9]
            boolean r14 = java.lang.Character.isISOControl(r2)
            if (r14 != 0) goto L134
            goto Le7
        L134:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected control character while reading string"
            r1.<init>(r2)
            throw r1
        L13c:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r11)
            throw r1
        L142:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r11)
            throw r1
    }

    @androidx.annotation.Nullable
    private final java.math.BigDecimal zas(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = new java.lang.String
            char[] r2 = r4.zaq
            r3 = 0
            r1.<init>(r2, r3, r5)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private final java.math.BigInteger zat(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = new java.lang.String
            char[] r2 = r4.zaq
            r3 = 0
            r1.<init>(r2, r3, r5)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private final <O> java.util.ArrayList<O> zau(java.io.BufferedReader r5, com.google.android.gms.common.server.response.zai<O> r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto Lf
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            r5 = 0
            return r5
        Lf:
            r1 = 91
            if (r0 != r1) goto L4c
            java.util.Stack<java.lang.Integer> r0 = r4.zat
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L22:
            r2 = 1024(0x400, float:1.435E-42)
            r5.mark(r2)
            char r2 = r4.zai(r5)
            if (r2 == 0) goto L44
            r3 = 44
            if (r2 == r3) goto L22
            r3 = 93
            if (r2 == r3) goto L40
            r5.reset()
            java.lang.Object r2 = r6.zaa(r4, r5)
            r0.add(r2)
            goto L22
        L40:
            r4.zaw(r1)
            return r0
        L44:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Unexpected EOF"
            r5.<init>(r6)
            throw r5
        L4c:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Expected start of array"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.Nullable
    private final <T extends com.google.android.gms.common.server.response.FastJsonResponse> java.util.ArrayList<T> zav(java.io.BufferedReader r11, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r10 = this;
            java.lang.String r0 = "Error instantiating inner object"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            char r2 = r10.zai(r11)
            r3 = 93
            r4 = 5
            if (r2 == r3) goto L9c
            r5 = 110(0x6e, float:1.54E-43)
            if (r2 == r5) goto L92
            java.lang.String r5 = "Unexpected token: "
            r6 = 19
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 != r7) goto L7d
            java.util.Stack<java.lang.Integer> r2 = r10.zat
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r2.push(r9)
        L26:
            com.google.android.gms.common.server.response.FastJsonResponse r2 = r12.zad()     // Catch: java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L76
            boolean r9 = r10.zaz(r11, r2)     // Catch: java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L76
            if (r9 == 0) goto L6e
            r1.add(r2)     // Catch: java.lang.IllegalAccessException -> L6f java.lang.InstantiationException -> L76
            char r2 = r10.zai(r11)
            r9 = 44
            if (r2 == r9) goto L56
            if (r2 != r3) goto L41
            r10.zaw(r4)
            return r1
        L41:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r5)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L56:
            char r2 = r10.zai(r11)
            if (r2 != r7) goto L66
            java.util.Stack<java.lang.Integer> r2 = r10.zat
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r2.push(r9)
            goto L26
        L66:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Expected start of next object in array"
            r11.<init>(r12)
            throw r11
        L6e:
            return r1
        L6f:
            r11 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r0, r11)
            throw r12
        L76:
            r11 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r0, r11)
            throw r12
        L7d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r5)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L92:
            char[] r12 = com.google.android.gms.common.server.response.FastParser.zaa
            r10.zax(r11, r12)
            r10.zaw(r4)
            r11 = 0
            return r11
        L9c:
            r10.zaw(r4)
            return r1
    }

    private final void zaw(int r6) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r5 = this;
            java.util.Stack<java.lang.Integer> r0 = r5.zat
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Expected state "
            r2 = 46
            if (r0 != 0) goto L38
            java.util.Stack<java.lang.Integer> r0 = r5.zat
            java.lang.Object r0 = r0.pop()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto L1b
            return
        L1b:
            com.google.android.gms.common.server.response.FastParser$ParseException r3 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r1)
            r4.append(r6)
            java.lang.String r6 = " but had "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r6 = r4.toString()
            r3.<init>(r6)
            throw r3
        L38:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = " but had empty stack"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0.<init>(r6)
            throw r0
    }

    private final void zax(java.io.BufferedReader r7, char[] r8) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L31
            char[] r3 = r6.zap
            int r2 = r2 - r1
            int r2 = r7.read(r3, r0, r2)
            r3 = -1
            if (r2 == r3) goto L29
            r3 = 0
        L10:
            if (r3 >= r2) goto L27
            int r4 = r3 + r1
            char r4 = r8[r4]
            char[] r5 = r6.zap
            char r5 = r5[r3]
            if (r4 != r5) goto L1f
            int r3 = r3 + 1
            goto L10
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected character"
            r7.<init>(r8)
            throw r7
        L27:
            int r1 = r1 + r2
            goto L2
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected EOF"
            r7.<init>(r8)
            throw r7
        L31:
            return
    }

    private final boolean zay(java.io.BufferedReader r5, boolean r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 34
            r2 = 1
            if (r0 == r1) goto L4b
            r1 = 102(0x66, float:1.43E-43)
            r3 = 0
            if (r0 == r1) goto L40
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L3a
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L21
            if (r6 == 0) goto L1b
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zac
            goto L1d
        L1b:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zab
        L1d:
            r4.zax(r5, r6)
            return r2
        L21:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r1 = 19
            r6.<init>(r1)
            java.lang.String r1 = "Unexpected token: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3a:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            return r3
        L40:
            if (r6 == 0) goto L45
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zae
            goto L47
        L45:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zad
        L47:
            r4.zax(r5, r6)
            return r3
        L4b:
            if (r6 != 0) goto L52
            boolean r5 = r4.zay(r5, r2)
            return r5
        L52:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "No boolean value found in string"
            r5.<init>(r6)
            throw r5
    }

    private final boolean zaz(java.io.BufferedReader r14, com.google.android.gms.common.server.response.FastJsonResponse r15) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r13 = this;
            java.lang.String r0 = "Error instantiating inner object"
            java.util.Map r1 = r15.getFieldMappings()
            java.lang.String r2 = r13.zaq(r14)
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L289
            r5 = 0
        L12:
            if (r2 == 0) goto L285
            java.lang.Object r2 = r1.get(r2)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            if (r2 != 0) goto L21
            java.lang.String r2 = r13.zar(r14)
            goto L12
        L21:
            java.util.Stack<java.lang.Integer> r6 = r13.zat
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.push(r7)
            int r6 = r2.zaa
            r7 = 123(0x7b, float:1.72E-43)
            r8 = 44
            r9 = 125(0x7d, float:1.75E-43)
            r10 = 110(0x6e, float:1.54E-43)
            switch(r6) {
                case 0: goto L23e;
                case 1: goto L228;
                case 2: goto L212;
                case 3: goto L1fc;
                case 4: goto L1e6;
                case 5: goto L1ce;
                case 6: goto L1b5;
                case 7: goto L19d;
                case 8: goto L18a;
                case 9: goto L177;
                case 10: goto Lba;
                case 11: goto L46;
                default: goto L38;
            }
        L38:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15 = 30
            java.lang.String r0 = "Invalid field type "
            java.lang.String r15 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r15, r0, r6)
            r14.<init>(r15)
            throw r14
        L46:
            boolean r6 = r2.zab
            if (r6 == 0) goto L7d
            char r6 = r13.zai(r14)
            if (r6 != r10) goto L5c
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r13.zax(r14, r6)
            java.lang.String r6 = r2.zae
            r15.addConcreteTypeArrayInternal(r2, r6, r5)
            goto L253
        L5c:
            java.util.Stack<java.lang.Integer> r7 = r13.zat
            r10 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.push(r10)
            r7 = 91
            if (r6 != r7) goto L75
            java.lang.String r6 = r2.zae
            java.util.ArrayList r7 = r13.zav(r14, r2)
            r15.addConcreteTypeArrayInternal(r2, r6, r7)
            goto L253
        L75:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = "Expected array start"
            r14.<init>(r15)
            throw r14
        L7d:
            char r6 = r13.zai(r14)
            if (r6 != r10) goto L8f
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r13.zax(r14, r6)
            java.lang.String r6 = r2.zae
            r15.addConcreteTypeInternal(r2, r6, r5)
            goto L253
        L8f:
            java.util.Stack<java.lang.Integer> r10 = r13.zat
            r10.push(r4)
            if (r6 != r7) goto Lb2
            com.google.android.gms.common.server.response.FastJsonResponse r6 = r2.zad()     // Catch: java.lang.IllegalAccessException -> La4 java.lang.InstantiationException -> Lab
            r13.zaz(r14, r6)     // Catch: java.lang.IllegalAccessException -> La4 java.lang.InstantiationException -> Lab
            java.lang.String r7 = r2.zae     // Catch: java.lang.IllegalAccessException -> La4 java.lang.InstantiationException -> Lab
            r15.addConcreteTypeInternal(r2, r7, r6)     // Catch: java.lang.IllegalAccessException -> La4 java.lang.InstantiationException -> Lab
            goto L253
        La4:
            r14 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r0, r14)
            throw r15
        Lab:
            r14 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r0, r14)
            throw r15
        Lb2:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = "Expected start of object"
            r14.<init>(r15)
            throw r14
        Lba:
            char r6 = r13.zai(r14)
            if (r6 != r10) goto Lc8
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r13.zax(r14, r6)
            r6 = r5
            goto L149
        Lc8:
            if (r6 != r7) goto L16f
            java.util.Stack<java.lang.Integer> r6 = r13.zat
            r6.push(r4)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        Ld4:
            char r7 = r13.zai(r14)
            if (r7 == 0) goto L167
            r10 = 34
            if (r7 == r10) goto Le5
            if (r7 == r9) goto Le1
            goto Ld4
        Le1:
            r13.zaw(r3)
            goto L149
        Le5:
            char[] r7 = r13.zap
            java.lang.StringBuilder r11 = r13.zar
            java.lang.String r7 = zaA(r14, r7, r11, r5)
            char r11 = r13.zai(r14)
            r12 = 58
            if (r11 == r12) goto L111
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "No map value found for key "
            int r1 = r15.length()
            if (r1 == 0) goto L108
            java.lang.String r15 = r0.concat(r15)
            goto L10d
        L108:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r0)
        L10d:
            r14.<init>(r15)
            throw r14
        L111:
            char r11 = r13.zai(r14)
            if (r11 == r10) goto L133
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Expected String value for key "
            int r1 = r15.length()
            if (r1 == 0) goto L12a
            java.lang.String r15 = r0.concat(r15)
            goto L12f
        L12a:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r0)
        L12f:
            r14.<init>(r15)
            throw r14
        L133:
            char[] r10 = r13.zap
            java.lang.StringBuilder r11 = r13.zar
            java.lang.String r10 = zaA(r14, r10, r11, r5)
            r6.put(r7, r10)
            char r7 = r13.zai(r14)
            if (r7 == r8) goto Ld4
            if (r7 != r9) goto L14e
            r13.zaw(r3)
        L149:
            r15.zaB(r2, r6)
            goto L253
        L14e:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 48
            r15.<init>(r0)
            java.lang.String r0 = "Unexpected character while parsing string map: "
            r15.append(r0)
            r15.append(r7)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L167:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = "Unexpected EOF"
            r14.<init>(r15)
            throw r14
        L16f:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r15 = "Expected start of a map object"
            r14.<init>(r15)
            throw r14
        L177:
            char[] r6 = r13.zaq
            java.lang.StringBuilder r7 = r13.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r6 = r13.zap(r14, r6, r7, r10)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r6)
            r15.zal(r2, r6)
            goto L253
        L18a:
            char[] r6 = r13.zaq
            java.lang.StringBuilder r7 = r13.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r6 = r13.zap(r14, r6, r7, r10)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decode(r6)
            r15.zal(r2, r6)
            goto L253
        L19d:
            boolean r6 = r2.zab
            if (r6 == 0) goto L1ac
            com.google.android.gms.common.server.response.zai<java.lang.String> r6 = com.google.android.gms.common.server.response.FastParser.zal
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zaC(r2, r6)
            goto L253
        L1ac:
            java.lang.String r6 = r13.zao(r14)
            r15.zaA(r2, r6)
            goto L253
        L1b5:
            boolean r6 = r2.zab
            if (r6 == 0) goto L1c4
            com.google.android.gms.common.server.response.zai<java.lang.Boolean> r6 = com.google.android.gms.common.server.response.FastParser.zak
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zaj(r2, r6)
            goto L253
        L1c4:
            r6 = 0
            boolean r6 = r13.zay(r14, r6)
            r15.zai(r2, r6)
            goto L253
        L1ce:
            boolean r6 = r2.zab
            if (r6 == 0) goto L1dd
            com.google.android.gms.common.server.response.zai<java.math.BigDecimal> r6 = com.google.android.gms.common.server.response.FastParser.zan
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zac(r2, r6)
            goto L253
        L1dd:
            java.math.BigDecimal r6 = r13.zas(r14)
            r15.zaa(r2, r6)
            goto L253
        L1e6:
            boolean r6 = r2.zab
            if (r6 == 0) goto L1f4
            com.google.android.gms.common.server.response.zai<java.lang.Double> r6 = com.google.android.gms.common.server.response.FastParser.zaj
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zao(r2, r6)
            goto L253
        L1f4:
            double r6 = r13.zaj(r14)
            r15.zam(r2, r6)
            goto L253
        L1fc:
            boolean r6 = r2.zab
            if (r6 == 0) goto L20a
            com.google.android.gms.common.server.response.zai<java.lang.Float> r6 = com.google.android.gms.common.server.response.FastParser.zai
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zas(r2, r6)
            goto L253
        L20a:
            float r6 = r13.zak(r14)
            r15.zaq(r2, r6)
            goto L253
        L212:
            boolean r6 = r2.zab
            if (r6 == 0) goto L220
            com.google.android.gms.common.server.response.zai<java.lang.Long> r6 = com.google.android.gms.common.server.response.FastParser.zah
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zay(r2, r6)
            goto L253
        L220:
            long r6 = r13.zan(r14)
            r15.zax(r2, r6)
            goto L253
        L228:
            boolean r6 = r2.zab
            if (r6 == 0) goto L236
            com.google.android.gms.common.server.response.zai<java.math.BigInteger> r6 = com.google.android.gms.common.server.response.FastParser.zam
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zag(r2, r6)
            goto L253
        L236:
            java.math.BigInteger r6 = r13.zat(r14)
            r15.zae(r2, r6)
            goto L253
        L23e:
            boolean r6 = r2.zab
            if (r6 == 0) goto L24c
            com.google.android.gms.common.server.response.zai<java.lang.Integer> r6 = com.google.android.gms.common.server.response.FastParser.zag
            java.util.ArrayList r6 = r13.zau(r14, r6)
            r15.zav(r2, r6)
            goto L253
        L24c:
            int r6 = r13.zal(r14)
            r15.zau(r2, r6)
        L253:
            r2 = 4
            r13.zaw(r2)
            r2 = 2
            r13.zaw(r2)
            char r2 = r13.zai(r14)
            if (r2 == r8) goto L27f
            if (r2 != r9) goto L266
            r2 = r5
            goto L12
        L266:
            com.google.android.gms.common.server.response.FastParser$ParseException r14 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 55
            r15.<init>(r0)
            java.lang.String r0 = "Expected end of object or field separator, but found: "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L27f:
            java.lang.String r2 = r13.zaq(r14)
            goto L12
        L285:
            r13.zaw(r3)
            return r3
        L289:
            r13.zaw(r3)
            r14 = 0
            return r14
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void parse(@androidx.annotation.NonNull java.io.InputStream r7, @androidx.annotation.NonNull T r8) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r6 = this;
            java.lang.String r0 = "Failed to close reader while parsing."
            java.lang.String r1 = "FastParser"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r7)
            r7 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r7)
            java.util.Stack<java.lang.Integer> r7 = r6.zat     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r7.push(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            char r7 = r6.zai(r2)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            if (r7 == 0) goto L93
            r4 = 91
            r5 = 1
            if (r7 == r4) goto L4f
            r4 = 123(0x7b, float:1.72E-43)
            if (r7 != r4) goto L36
            java.util.Stack<java.lang.Integer> r7 = r6.zat     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r7.push(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r6.zaz(r2, r8)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            goto L80
        L36:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r4 = 19
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.String r4 = "Unexpected token: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r3.append(r7)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            throw r8     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
        L4f:
            java.util.Stack<java.lang.Integer> r7 = r6.zat     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r7.push(r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.util.Map r7 = r8.getFieldMappings()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            int r4 = r7.size()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            if (r4 != r5) goto L8b
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.Object r7 = r7.next()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r7     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.util.ArrayList r4 = r6.zav(r2, r7)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.String r5 = r7.zae     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r8.addConcreteTypeArrayInternal(r7, r5, r4)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
        L80:
            r6.zaw(r3)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            r2.close()     // Catch: java.io.IOException -> L87
            return
        L87:
            android.util.Log.w(r1, r0)
            return
        L8b:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.String r8 = "Object array response class must have a single Field"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            throw r7     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
        L93:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            java.lang.String r8 = "No data to parse"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
            throw r7     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
        L9b:
            r7 = move-exception
            goto La4
        L9d:
            r7 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L9b
            throw r8     // Catch: java.lang.Throwable -> L9b
        La4:
            r2.close()     // Catch: java.io.IOException -> La8
            goto Lab
        La8:
            android.util.Log.w(r1, r0)
        Lab:
            throw r7
    }
}
