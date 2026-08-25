package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] getUriIndices(java.lang.String r10) {
            r0 = 4
            int[] r0 = new int[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r2 = 0
            r3 = -1
            if (r1 == 0) goto Le
            r0[r2] = r3
            return r0
        Le:
            int r1 = r10.length()
            r4 = 35
            int r4 = r10.indexOf(r4)
            if (r4 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r4
        L1c:
            r4 = 63
            int r4 = r10.indexOf(r4)
            if (r4 == r3) goto L26
            if (r4 <= r1) goto L27
        L26:
            r4 = r1
        L27:
            r5 = 47
            int r6 = r10.indexOf(r5)
            if (r6 == r3) goto L31
            if (r6 <= r4) goto L32
        L31:
            r6 = r4
        L32:
            r7 = 58
            int r7 = r10.indexOf(r7)
            if (r7 <= r6) goto L3b
            r7 = -1
        L3b:
            int r6 = r7 + 2
            r8 = 1
            if (r6 >= r4) goto L50
            int r9 = r7 + 1
            char r9 = r10.charAt(r9)
            if (r9 != r5) goto L50
            char r6 = r10.charAt(r6)
            if (r6 != r5) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L5f
            int r6 = r7 + 3
            int r10 = r10.indexOf(r5, r6)
            if (r10 == r3) goto L5d
            if (r10 <= r4) goto L61
        L5d:
            r10 = r4
            goto L61
        L5f:
            int r10 = r7 + 1
        L61:
            r0[r2] = r7
            r0[r8] = r10
            r10 = 2
            r0[r10] = r4
            r10 = 3
            r0[r10] = r1
            return r0
    }

    public static boolean isAbsolute(@androidx.annotation.Nullable java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Ld
            int[] r2 = getUriIndices(r2)
            r2 = r2[r0]
            r1 = -1
            if (r2 == r1) goto Ld
            r0 = 1
        Ld:
            return r0
    }

    private static java.lang.String removeDotSegments(java.lang.StringBuilder r7, int r8, int r9) {
            if (r8 < r9) goto L7
            java.lang.String r7 = r7.toString()
            return r7
        L7:
            char r0 = r7.charAt(r8)
            r1 = 47
            if (r0 != r1) goto L11
            int r8 = r8 + 1
        L11:
            r0 = r8
            r2 = r0
        L13:
            if (r0 > r9) goto L60
            if (r0 != r9) goto L19
            r3 = r0
            goto L21
        L19:
            char r3 = r7.charAt(r0)
            if (r3 != r1) goto L5d
            int r3 = r0 + 1
        L21:
            int r4 = r2 + 1
            r5 = 46
            if (r0 != r4) goto L33
            char r6 = r7.charAt(r2)
            if (r6 != r5) goto L33
            r7.delete(r2, r3)
            int r3 = r3 - r2
            int r9 = r9 - r3
            goto L5b
        L33:
            int r6 = r2 + 2
            if (r0 != r6) goto L58
            char r6 = r7.charAt(r2)
            if (r6 != r5) goto L58
            char r4 = r7.charAt(r4)
            if (r4 != r5) goto L58
            int r2 = r2 + (-2)
            java.lang.String r0 = "/"
            int r0 = r7.lastIndexOf(r0, r2)
            int r0 = r0 + 1
            if (r0 <= r8) goto L51
            r2 = r0
            goto L52
        L51:
            r2 = r8
        L52:
            r7.delete(r2, r3)
            int r3 = r3 - r2
            int r9 = r9 - r3
            goto L5a
        L58:
            int r0 = r0 + 1
        L5a:
            r2 = r0
        L5b:
            r0 = r2
            goto L13
        L5d:
            int r0 = r0 + 1
            goto L13
        L60:
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static android.net.Uri removeQueryParameter(android.net.Uri r5, java.lang.String r6) {
            android.net.Uri$Builder r0 = r5.buildUpon()
            r0.clearQuery()
            java.util.Set r1 = r5.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto Lf
            java.util.List r3 = r5.getQueryParameters(r2)
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.appendQueryParameter(r2, r4)
            goto L29
        L39:
            android.net.Uri r5 = r0.build()
            return r5
    }

    public static java.lang.String resolve(@androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            if (r10 != 0) goto La
            r10 = r1
        La:
            if (r11 != 0) goto Ld
            r11 = r1
        Ld:
            int[] r1 = getUriIndices(r11)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L28
            r0.append(r11)
            r10 = r1[r6]
            r11 = r1[r5]
            removeDotSegments(r0, r10, r11)
            java.lang.String r10 = r0.toString()
            return r10
        L28:
            int[] r3 = getUriIndices(r10)
            r7 = 3
            r8 = r1[r7]
            if (r8 != 0) goto L3e
            r1 = r3[r7]
            r0.append(r10, r2, r1)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L3e:
            r7 = r1[r5]
            if (r7 != 0) goto L4f
            r1 = r3[r5]
            r0.append(r10, r2, r1)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            return r10
        L4f:
            r7 = r1[r6]
            if (r7 == 0) goto L67
            r3 = r3[r2]
            int r3 = r3 + r6
            r0.append(r10, r2, r3)
            r0.append(r11)
            r10 = r1[r6]
            int r10 = r10 + r3
            r11 = r1[r5]
            int r3 = r3 + r11
            java.lang.String r10 = removeDotSegments(r0, r10, r3)
            return r10
        L67:
            r7 = r1[r6]
            char r7 = r11.charAt(r7)
            r8 = 47
            if (r7 != r8) goto L85
            r4 = r3[r6]
            r0.append(r10, r2, r4)
            r0.append(r11)
            r10 = r3[r6]
            r11 = r3[r6]
            r1 = r1[r5]
            int r11 = r11 + r1
            java.lang.String r10 = removeDotSegments(r0, r10, r11)
            return r10
        L85:
            r7 = r3[r2]
            int r7 = r7 + r5
            r9 = r3[r6]
            if (r7 >= r9) goto Laa
            r7 = r3[r6]
            r9 = r3[r5]
            if (r7 != r9) goto Laa
            r4 = r3[r6]
            r0.append(r10, r2, r4)
            r0.append(r8)
            r0.append(r11)
            r10 = r3[r6]
            r11 = r3[r6]
            r1 = r1[r5]
            int r11 = r11 + r1
            int r11 = r11 + r6
            java.lang.String r10 = removeDotSegments(r0, r10, r11)
            return r10
        Laa:
            r7 = r3[r5]
            int r7 = r7 - r6
            int r7 = r10.lastIndexOf(r8, r7)
            if (r7 != r4) goto Lb6
            r4 = r3[r6]
            goto Lb8
        Lb6:
            int r4 = r7 + 1
        Lb8:
            r0.append(r10, r2, r4)
            r0.append(r11)
            r10 = r3[r6]
            r11 = r1[r5]
            int r4 = r4 + r11
            java.lang.String r10 = removeDotSegments(r0, r10, r4)
            return r10
    }

    public static android.net.Uri resolveToUri(@androidx.annotation.Nullable java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1) {
            java.lang.String r0 = resolve(r0, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }
}
