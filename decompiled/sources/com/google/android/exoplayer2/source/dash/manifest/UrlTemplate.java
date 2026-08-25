package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class UrlTemplate {
    private static final java.lang.String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final java.lang.String DEFAULT_FORMAT_TAG = "%01d";
    private static final java.lang.String ESCAPED_DOLLAR = "$$";
    private static final java.lang.String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final java.lang.String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final java.lang.String TIME = "Time";
    private static final int TIME_ID = 4;
    private final int identifierCount;
    private final java.lang.String[] identifierFormatTags;
    private final int[] identifiers;
    private final java.lang.String[] urlPieces;

    private UrlTemplate(java.lang.String[] r1, int[] r2, java.lang.String[] r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.urlPieces = r1
            r0.identifiers = r2
            r0.identifierFormatTags = r3
            r0.identifierCount = r4
            return
    }

    public static com.google.android.exoplayer2.source.dash.manifest.UrlTemplate compile(java.lang.String r4) {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 4
            int[] r2 = new int[r1]
            java.lang.String[] r1 = new java.lang.String[r1]
            int r4 = parseTemplate(r4, r0, r2, r1)
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r3 = new com.google.android.exoplayer2.source.dash.manifest.UrlTemplate
            r3.<init>(r0, r2, r1, r4)
            return r3
    }

    private static int parseTemplate(java.lang.String r9, java.lang.String[] r10, int[] r11, java.lang.String[] r12) {
            r0 = 0
            java.lang.String r1 = ""
            r10[r0] = r1
            r2 = 0
            r3 = 0
        L7:
            int r4 = r9.length()
            if (r2 >= r4) goto Lff
            java.lang.String r4 = "$"
            int r5 = r9.indexOf(r4, r2)
            r6 = -1
            if (r5 != r6) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r10[r3]
            r4.append(r5)
            java.lang.String r2 = r9.substring(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r10[r3] = r2
            int r2 = r9.length()
            goto L7
        L32:
            if (r5 == r2) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r10[r3]
            r4.append(r6)
            java.lang.String r2 = r9.substring(r2, r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r10[r3] = r2
            r2 = r5
            goto L7
        L4d:
            java.lang.String r5 = "$$"
            boolean r5 = r9.startsWith(r5, r2)
            if (r5 == 0) goto L65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r10[r3]
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6, r4)
            r10[r3] = r4
            int r2 = r2 + 2
            goto L7
        L65:
            int r2 = r2 + 1
            int r4 = r9.indexOf(r4, r2)
            java.lang.String r2 = r9.substring(r2, r4)
            java.lang.String r5 = "RepresentationID"
            boolean r5 = r2.equals(r5)
            r7 = 1
            if (r5 == 0) goto L7c
            r11[r3] = r7
            goto Lf7
        L7c:
            java.lang.String r5 = "%0"
            int r5 = r2.indexOf(r5)
            if (r5 == r6) goto Laa
            java.lang.String r6 = r2.substring(r5)
            java.lang.String r7 = "d"
            boolean r8 = r6.endsWith(r7)
            if (r8 != 0) goto La5
            java.lang.String r8 = "x"
            boolean r8 = r6.endsWith(r8)
            if (r8 != 0) goto La5
            java.lang.String r8 = "X"
            boolean r8 = r6.endsWith(r8)
            if (r8 != 0) goto La5
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
        La5:
            java.lang.String r2 = r2.substring(r0, r5)
            goto Lac
        Laa:
            java.lang.String r6 = "%01d"
        Lac:
            java.util.Objects.requireNonNull(r2)
            r2.hashCode()
            r5 = 2
            r7 = -1
            int r8 = r2.hashCode()
            switch(r8) {
                case -1950496919: goto Ld2;
                case 2606829: goto Lc7;
                case 38199441: goto Lbc;
                default: goto Lbb;
            }
        Lbb:
            goto Ldc
        Lbc:
            java.lang.String r8 = "Bandwidth"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto Lc5
            goto Ldc
        Lc5:
            r7 = 2
            goto Ldc
        Lc7:
            java.lang.String r8 = "Time"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto Ld0
            goto Ldc
        Ld0:
            r7 = 1
            goto Ldc
        Ld2:
            java.lang.String r8 = "Number"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto Ldb
            goto Ldc
        Ldb:
            r7 = 0
        Ldc:
            switch(r7) {
                case 0: goto Lf3;
                case 1: goto Lef;
                case 2: goto Leb;
                default: goto Ldf;
            }
        Ldf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid template: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r9)
            r10.<init>(r9)
            throw r10
        Leb:
            r2 = 3
            r11[r3] = r2
            goto Lf5
        Lef:
            r2 = 4
            r11[r3] = r2
            goto Lf5
        Lf3:
            r11[r3] = r5
        Lf5:
            r12[r3] = r6
        Lf7:
            int r3 = r3 + 1
            r10[r3] = r1
            int r2 = r4 + 1
            goto L7
        Lff:
            return r3
    }

    public java.lang.String buildUri(java.lang.String r8, long r9, int r11, long r12) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.identifierCount
            if (r2 >= r3) goto L70
            java.lang.String[] r3 = r7.urlPieces
            r3 = r3[r2]
            r0.append(r3)
            int[] r3 = r7.identifiers
            r4 = r3[r2]
            r5 = 1
            if (r4 != r5) goto L1d
            r0.append(r8)
            goto L6d
        L1d:
            r4 = r3[r2]
            r6 = 2
            if (r4 != r6) goto L38
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String[] r4 = r7.identifierFormatTags
            r4 = r4[r2]
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r5[r1] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4, r5)
            r0.append(r3)
            goto L6d
        L38:
            r4 = r3[r2]
            r6 = 3
            if (r4 != r6) goto L53
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String[] r4 = r7.identifierFormatTags
            r4 = r4[r2]
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5[r1] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4, r5)
            r0.append(r3)
            goto L6d
        L53:
            r3 = r3[r2]
            r4 = 4
            if (r3 != r4) goto L6d
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String[] r4 = r7.identifierFormatTags
            r4 = r4[r2]
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r5[r1] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4, r5)
            r0.append(r3)
        L6d:
            int r2 = r2 + 1
            goto L7
        L70:
            java.lang.String[] r8 = r7.urlPieces
            r8 = r8[r3]
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }
}
