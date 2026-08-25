package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes2.dex */
final class TextEmphasis {
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_FILL_VALUES = null;
    public static final int MARK_SHAPE_AUTO = -1;
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_SHAPE_VALUES = null;
    public static final int POSITION_OUTSIDE = -2;
    private static final com.google.common.collect.ImmutableSet<java.lang.String> POSITION_VALUES = null;
    private static final com.google.common.collect.ImmutableSet<java.lang.String> SINGLE_STYLE_VALUES = null;
    private static final java.util.regex.Pattern WHITESPACE_PATTERN = null;
    public final int markFill;
    public final int markShape;
    public final int position;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    static {
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TextEmphasis.WHITESPACE_PATTERN = r0
            java.lang.String r0 = "auto"
            java.lang.String r1 = "none"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1)
            com.google.android.exoplayer2.text.ttml.TextEmphasis.SINGLE_STYLE_VALUES = r0
            java.lang.String r0 = "dot"
            java.lang.String r1 = "sesame"
            java.lang.String r2 = "circle"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1, r2)
            com.google.android.exoplayer2.text.ttml.TextEmphasis.MARK_SHAPE_VALUES = r0
            java.lang.String r0 = "filled"
            java.lang.String r1 = "open"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1)
            com.google.android.exoplayer2.text.ttml.TextEmphasis.MARK_FILL_VALUES = r0
            java.lang.String r0 = "after"
            java.lang.String r1 = "before"
            java.lang.String r2 = "outside"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1, r2)
            com.google.android.exoplayer2.text.ttml.TextEmphasis.POSITION_VALUES = r0
            return
    }

    private TextEmphasis(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.markShape = r1
            r0.markFill = r2
            r0.position = r3
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.text.ttml.TextEmphasis parse(@androidx.annotation.Nullable java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TextEmphasis.WHITESPACE_PATTERN
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r0)
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.copyOf(r2)
            com.google.android.exoplayer2.text.ttml.TextEmphasis r2 = parseWords(r2)
            return r2
    }

    private static com.google.android.exoplayer2.text.ttml.TextEmphasis parseWords(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
            com.google.common.collect.ImmutableSet<java.lang.String> r0 = com.google.android.exoplayer2.text.ttml.TextEmphasis.POSITION_VALUES
            com.google.common.collect.Sets$SetView r0 = com.google.common.collect.Sets.intersection(r0, r9)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.google.common.collect.Iterables.getFirst(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            if (r2 == r3) goto L38
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r2 == r3) goto L30
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L26
            goto L42
        L26:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = 0
            goto L43
        L30:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = 1
            goto L43
        L38:
            java.lang.String r1 = "before"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = 2
            goto L43
        L42:
            r0 = -1
        L43:
            if (r0 == 0) goto L4b
            if (r0 == r7) goto L49
            r0 = 1
            goto L4c
        L49:
            r0 = -2
            goto L4c
        L4b:
            r0 = 2
        L4c:
            com.google.common.collect.ImmutableSet<java.lang.String> r1 = com.google.android.exoplayer2.text.ttml.TextEmphasis.SINGLE_STYLE_VALUES
            com.google.common.collect.Sets$SetView r1 = com.google.common.collect.Sets.intersection(r1, r9)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L8f
            java.util.Iterator r9 = r1.iterator()
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r9.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L7b
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L71
            goto L84
        L71:
            java.lang.String r1 = "none"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L84
            r7 = 0
            goto L85
        L7b:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L84
            goto L85
        L84:
            r7 = -1
        L85:
            if (r7 == 0) goto L88
            goto L89
        L88:
            r5 = 0
        L89:
            com.google.android.exoplayer2.text.ttml.TextEmphasis r9 = new com.google.android.exoplayer2.text.ttml.TextEmphasis
            r9.<init>(r5, r6, r0)
            return r9
        L8f:
            com.google.common.collect.ImmutableSet<java.lang.String> r1 = com.google.android.exoplayer2.text.ttml.TextEmphasis.MARK_FILL_VALUES
            com.google.common.collect.Sets$SetView r1 = com.google.common.collect.Sets.intersection(r1, r9)
            com.google.common.collect.ImmutableSet<java.lang.String> r2 = com.google.android.exoplayer2.text.ttml.TextEmphasis.MARK_SHAPE_VALUES
            com.google.common.collect.Sets$SetView r9 = com.google.common.collect.Sets.intersection(r2, r9)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lad
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto Lad
            com.google.android.exoplayer2.text.ttml.TextEmphasis r9 = new com.google.android.exoplayer2.text.ttml.TextEmphasis
            r9.<init>(r5, r6, r0)
            return r9
        Lad:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = com.google.common.collect.Iterables.getFirst(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.hashCode()
            r8 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r3 == r8) goto Lce
            r2 = 3417674(0x34264a, float:4.789181E-39)
            if (r3 == r2) goto Lc4
            goto Ld6
        Lc4:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld6
            r1 = 0
            goto Ld7
        Lce:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld6
            r1 = 1
            goto Ld7
        Ld6:
            r1 = -1
        Ld7:
            if (r1 == 0) goto Ldb
            r1 = 1
            goto Ldc
        Ldb:
            r1 = 2
        Ldc:
            java.lang.String r2 = "circle"
            java.lang.Object r9 = com.google.common.collect.Iterables.getFirst(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.hashCode()
            r8 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r3 == r8) goto L10d
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r3 == r2) goto L102
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r3 == r2) goto Lf8
            goto L114
        Lf8:
            java.lang.String r2 = "dot"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L114
            r5 = 0
            goto L114
        L102:
            java.lang.String r2 = "sesame"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L114
            r5 = 1
            goto L114
        L10d:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L114
            r5 = 2
        L114:
            if (r5 == 0) goto L11b
            if (r5 == r7) goto L11a
            r4 = 1
            goto L11b
        L11a:
            r4 = 3
        L11b:
            com.google.android.exoplayer2.text.ttml.TextEmphasis r9 = new com.google.android.exoplayer2.text.ttml.TextEmphasis
            r9.<init>(r4, r1, r0)
            return r9
    }
}
