package com.google.android.exoplayer2.text.ssa;

/* JADX INFO: loaded from: classes2.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final java.lang.String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final java.lang.String name;

    @androidx.annotation.Nullable
    @androidx.annotation.ColorInt
    public final java.lang.Integer outlineColor;

    @androidx.annotation.Nullable
    @androidx.annotation.ColorInt
    public final java.lang.Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
                r0 = this;
                r0.<init>()
                r0.nameIndex = r1
                r0.alignmentIndex = r2
                r0.primaryColorIndex = r3
                r0.outlineColorIndex = r4
                r0.fontSizeIndex = r5
                r0.boldIndex = r6
                r0.italicIndex = r7
                r0.underlineIndex = r8
                r0.strikeoutIndex = r9
                r0.borderStyleIndex = r10
                r0.length = r11
                return
        }

        @androidx.annotation.Nullable
        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Format fromFormatLine(java.lang.String r17) {
                r0 = 7
                r1 = r17
                java.lang.String r1 = r1.substring(r0)
                java.lang.String r2 = ","
                java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
                r2 = 0
                r3 = -1
                r4 = 0
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
                r13 = -1
                r14 = -1
                r15 = -1
            L1a:
                int r5 = r1.length
                if (r4 >= r5) goto Lc4
                r5 = r1[r4]
                java.lang.String r5 = r5.trim()
                java.lang.String r5 = com.google.common.base.Ascii.toLowerCase(r5)
                java.util.Objects.requireNonNull(r5)
                int r16 = r5.hashCode()
                switch(r16) {
                    case -1178781136: goto L9e;
                    case -1026963764: goto L92;
                    case -192095652: goto L86;
                    case -70925746: goto L7a;
                    case 3029637: goto L6f;
                    case 3373707: goto L64;
                    case 366554320: goto L59;
                    case 767321349: goto L4e;
                    case 1767875043: goto L41;
                    case 1988365454: goto L34;
                    default: goto L31;
                }
            L31:
                r0 = -1
                goto La8
            L34:
                java.lang.String r0 = "outlinecolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L3d
                goto L31
            L3d:
                r0 = 9
                goto La8
            L41:
                java.lang.String r0 = "alignment"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L4a
                goto L31
            L4a:
                r0 = 8
                goto La8
            L4e:
                java.lang.String r0 = "borderstyle"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L57
                goto L31
            L57:
                r0 = 7
                goto La8
            L59:
                java.lang.String r0 = "fontsize"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L62
                goto L31
            L62:
                r0 = 6
                goto La8
            L64:
                java.lang.String r0 = "name"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L6d
                goto L31
            L6d:
                r0 = 5
                goto La8
            L6f:
                java.lang.String r0 = "bold"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L78
                goto L31
            L78:
                r0 = 4
                goto La8
            L7a:
                java.lang.String r0 = "primarycolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L84
                goto L31
            L84:
                r0 = 3
                goto La8
            L86:
                java.lang.String r0 = "strikeout"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L90
                goto L31
            L90:
                r0 = 2
                goto La8
            L92:
                java.lang.String r0 = "underline"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L9c
                goto L31
            L9c:
                r0 = 1
                goto La8
            L9e:
                java.lang.String r0 = "italic"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto La7
                goto L31
            La7:
                r0 = 0
            La8:
                switch(r0) {
                    case 0: goto Lbe;
                    case 1: goto Lbc;
                    case 2: goto Lba;
                    case 3: goto Lb8;
                    case 4: goto Lb6;
                    case 5: goto Lb4;
                    case 6: goto Lb2;
                    case 7: goto Lb0;
                    case 8: goto Lae;
                    case 9: goto Lac;
                    default: goto Lab;
                }
            Lab:
                goto Lbf
            Lac:
                r9 = r4
                goto Lbf
            Lae:
                r7 = r4
                goto Lbf
            Lb0:
                r15 = r4
                goto Lbf
            Lb2:
                r10 = r4
                goto Lbf
            Lb4:
                r6 = r4
                goto Lbf
            Lb6:
                r11 = r4
                goto Lbf
            Lb8:
                r8 = r4
                goto Lbf
            Lba:
                r14 = r4
                goto Lbf
            Lbc:
                r13 = r4
                goto Lbf
            Lbe:
                r12 = r4
            Lbf:
                int r4 = r4 + 1
                r0 = 7
                goto L1a
            Lc4:
                if (r6 == r3) goto Ld0
                com.google.android.exoplayer2.text.ssa.SsaStyle$Format r0 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Format
                int r1 = r1.length
                r5 = r0
                r16 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                goto Ld1
            Ld0:
                r0 = 0
            Ld1:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Overrides {
        private static final java.util.regex.Pattern ALIGNMENT_OVERRIDE_PATTERN = null;
        private static final java.util.regex.Pattern BRACES_PATTERN = null;
        private static final java.util.regex.Pattern MOVE_PATTERN = null;
        private static final java.lang.String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final java.util.regex.Pattern POSITION_PATTERN = null;
        private static final java.lang.String TAG = "SsaStyle.Overrides";
        public final int alignment;

        @androidx.annotation.Nullable
        public final android.graphics.PointF position;

        static {
                java.lang.String r0 = "\\{([^}]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.BRACES_PATTERN = r0
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                java.lang.String r3 = "\\s*\\d+(?:\\.\\d+)?\\s*"
                r1[r2] = r3
                java.lang.String r4 = "\\\\pos\\((%1$s),(%1$s)\\)"
                java.lang.String r1 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r1)
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
                com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.POSITION_PATTERN = r1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r3
                java.lang.String r1 = "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)"
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.MOVE_PATTERN = r0
                java.lang.String r0 = "\\\\an(\\d+)"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.ALIGNMENT_OVERRIDE_PATTERN = r0
                return
        }

        private Overrides(int r1, @androidx.annotation.Nullable android.graphics.PointF r2) {
                r0 = this;
                r0.<init>()
                r0.alignment = r1
                r0.position = r2
                return
        }

        private static int parseAlignmentOverride(java.lang.String r1) {
                java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.ALIGNMENT_OVERRIDE_PATTERN
                java.util.regex.Matcher r1 = r0.matcher(r1)
                boolean r0 = r1.find()
                if (r0 == 0) goto L1c
                r0 = 1
                java.lang.String r1 = r1.group(r0)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                int r1 = com.google.android.exoplayer2.text.ssa.SsaStyle.access$000(r1)
                goto L1d
            L1c:
                r1 = -1
            L1d:
                return r1
        }

        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides parseFromDialogue(java.lang.String r5) {
                java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.BRACES_PATTERN
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L9:
                boolean r3 = r5.find()
                if (r3 == 0) goto L2b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = parsePosition(r3)     // Catch: java.lang.RuntimeException -> L21
                if (r4 == 0) goto L21
                r1 = r4
            L21:
                int r3 = parseAlignmentOverride(r3)     // Catch: java.lang.RuntimeException -> L29
                if (r3 == r0) goto L9
                r2 = r3
                goto L9
            L29:
                goto L9
            L2b:
                com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides r5 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides
                r5.<init>(r2, r1)
                return r5
        }

        @androidx.annotation.Nullable
        private static android.graphics.PointF parsePosition(java.lang.String r6) {
                java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.POSITION_PATTERN
                java.util.regex.Matcher r0 = r0.matcher(r6)
                java.util.regex.Pattern r1 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.MOVE_PATTERN
                java.util.regex.Matcher r1 = r1.matcher(r6)
                boolean r2 = r0.find()
                boolean r3 = r1.find()
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3e
                if (r3 == 0) goto L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = "'"
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                java.lang.String r1 = "SsaStyle.Overrides"
                com.google.android.exoplayer2.util.Log.i(r1, r6)
            L35:
                java.lang.String r6 = r0.group(r5)
                java.lang.String r0 = r0.group(r4)
                goto L48
            L3e:
                if (r3 == 0) goto L6a
                java.lang.String r6 = r1.group(r5)
                java.lang.String r0 = r1.group(r4)
            L48:
                android.graphics.PointF r1 = new android.graphics.PointF
                java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = r6.trim()
                float r6 = java.lang.Float.parseFloat(r6)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.trim()
                float r0 = java.lang.Float.parseFloat(r0)
                r1.<init>(r6, r0)
                return r1
            L6a:
                r6 = 0
                return r6
        }

        public static java.lang.String stripStyleOverrides(java.lang.String r1) {
                java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.BRACES_PATTERN
                java.util.regex.Matcher r1 = r0.matcher(r1)
                java.lang.String r0 = ""
                java.lang.String r1 = r1.replaceAll(r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private SsaStyle(java.lang.String r1, int r2, @androidx.annotation.Nullable @androidx.annotation.ColorInt java.lang.Integer r3, @androidx.annotation.Nullable @androidx.annotation.ColorInt java.lang.Integer r4, float r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.alignment = r2
            r0.primaryColor = r3
            r0.outlineColor = r4
            r0.fontSize = r5
            r0.bold = r6
            r0.italic = r7
            r0.underline = r8
            r0.strikeout = r9
            r0.borderStyle = r10
            return
    }

    public static /* synthetic */ int access$000(java.lang.String r0) {
            int r0 = parseAlignment(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.text.ssa.SsaStyle fromStyleLine(java.lang.String r18, com.google.android.exoplayer2.text.ssa.SsaStyle.Format r19) {
            r1 = r18
            r0 = r19
            java.lang.String r2 = "Style:"
            boolean r2 = r1.startsWith(r2)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r2 = 6
            java.lang.String r2 = r1.substring(r2)
            java.lang.String r3 = ","
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r3)
            int r3 = r2.length
            int r4 = r0.length
            java.lang.String r5 = "SsaStyle"
            r6 = 0
            r7 = 1
            r8 = 0
            if (r3 == r4) goto L3f
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r8] = r3
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r7] = r2
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
            com.google.android.exoplayer2.util.Log.w(r5, r0)
            return r6
        L3f:
            com.google.android.exoplayer2.text.ssa.SsaStyle r3 = new com.google.android.exoplayer2.text.ssa.SsaStyle     // Catch: java.lang.RuntimeException -> Lfb
            int r4 = r0.nameIndex     // Catch: java.lang.RuntimeException -> Lfb
            r4 = r2[r4]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r4 = r4.trim()     // Catch: java.lang.RuntimeException -> Lfb
            int r9 = r0.alignmentIndex     // Catch: java.lang.RuntimeException -> Lfb
            r10 = -1
            if (r9 == r10) goto L59
            r9 = r2[r9]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r9 = r9.trim()     // Catch: java.lang.RuntimeException -> Lfb
            int r9 = parseAlignment(r9)     // Catch: java.lang.RuntimeException -> Lfb
            goto L5a
        L59:
            r9 = -1
        L5a:
            int r11 = r0.primaryColorIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r11 == r10) goto L69
            r11 = r2[r11]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r11 = r11.trim()     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.Integer r11 = parseColor(r11)     // Catch: java.lang.RuntimeException -> Lfb
            goto L6a
        L69:
            r11 = r6
        L6a:
            int r12 = r0.outlineColorIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r12 == r10) goto L79
            r12 = r2[r12]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r12 = r12.trim()     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.Integer r12 = parseColor(r12)     // Catch: java.lang.RuntimeException -> Lfb
            goto L7a
        L79:
            r12 = r6
        L7a:
            int r13 = r0.fontSizeIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r13 == r10) goto L89
            r13 = r2[r13]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r13 = r13.trim()     // Catch: java.lang.RuntimeException -> Lfb
            float r13 = parseFontSize(r13)     // Catch: java.lang.RuntimeException -> Lfb
            goto L8c
        L89:
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L8c:
            int r14 = r0.boldIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r14 == r10) goto L9e
            r14 = r2[r14]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r14 = r14.trim()     // Catch: java.lang.RuntimeException -> Lfb
            boolean r14 = parseBooleanValue(r14)     // Catch: java.lang.RuntimeException -> Lfb
            if (r14 == 0) goto L9e
            r14 = 1
            goto L9f
        L9e:
            r14 = 0
        L9f:
            int r15 = r0.italicIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r15 == r10) goto Lb1
            r15 = r2[r15]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r15 = r15.trim()     // Catch: java.lang.RuntimeException -> Lfb
            boolean r15 = parseBooleanValue(r15)     // Catch: java.lang.RuntimeException -> Lfb
            if (r15 == 0) goto Lb1
            r15 = 1
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            int r7 = r0.underlineIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r7 == r10) goto Lc5
            r7 = r2[r7]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> Lfb
            boolean r7 = parseBooleanValue(r7)     // Catch: java.lang.RuntimeException -> Lfb
            if (r7 == 0) goto Lc5
            r17 = 1
            goto Lc7
        Lc5:
            r17 = 0
        Lc7:
            int r7 = r0.strikeoutIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r7 == r10) goto Lda
            r7 = r2[r7]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> Lfb
            boolean r7 = parseBooleanValue(r7)     // Catch: java.lang.RuntimeException -> Lfb
            if (r7 == 0) goto Lda
            r16 = 1
            goto Ldc
        Lda:
            r16 = 0
        Ldc:
            int r0 = r0.borderStyleIndex     // Catch: java.lang.RuntimeException -> Lfb
            if (r0 == r10) goto Leb
            r0 = r2[r0]     // Catch: java.lang.RuntimeException -> Lfb
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> Lfb
            int r0 = parseBorderStyle(r0)     // Catch: java.lang.RuntimeException -> Lfb
            goto Lec
        Leb:
            r0 = -1
        Lec:
            r7 = r3
            r8 = r4
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r17
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.RuntimeException -> Lfb
            return r3
        Lfb:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skipping malformed 'Style:' line: '"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "'"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.exoplayer2.util.Log.w(r5, r1, r0)
            return r6
    }

    private static boolean isValidAlignment(int r0) {
            switch(r0) {
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 1
            return r0
    }

    private static boolean isValidBorderStyle(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 3
            if (r2 == r1) goto L8
            r2 = 0
            return r2
        L8:
            return r0
    }

    private static int parseAlignment(java.lang.String r2) {
            java.lang.String r0 = r2.trim()     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lf
            boolean r1 = isValidAlignment(r0)     // Catch: java.lang.NumberFormatException -> Lf
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "Ignoring unknown alignment: "
            java.lang.String r1 = "SsaStyle"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r2, r1)
            r2 = -1
            return r2
    }

    private static boolean parseBooleanValue(java.lang.String r4) {
            r0 = 0
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Ld
            r1 = 1
            if (r4 == r1) goto Lb
            r2 = -1
            if (r4 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse boolean value: '"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "'"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "SsaStyle"
            com.google.android.exoplayer2.util.Log.w(r2, r4, r1)
            return r0
    }

    private static int parseBorderStyle(java.lang.String r2) {
            java.lang.String r0 = r2.trim()     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lf
            boolean r1 = isValidBorderStyle(r0)     // Catch: java.lang.NumberFormatException -> Lf
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "Ignoring unknown BorderStyle: "
            java.lang.String r1 = "SsaStyle"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r2, r1)
            r2 = -1
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.ColorInt
    public static java.lang.Integer parseColor(java.lang.String r8) {
            java.lang.String r0 = "&H"
            boolean r0 = r8.startsWith(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            r1 = 16
            if (r0 == 0) goto L14
            r0 = 2
            java.lang.String r0 = r8.substring(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            long r2 = java.lang.Long.parseLong(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L51
            goto L18
        L14:
            long r2 = java.lang.Long.parseLong(r8)     // Catch: java.lang.IllegalArgumentException -> L51
        L18:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            r8 = 24
            long r4 = r2 >> r8
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r4 = r4 ^ r6
            int r8 = com.google.common.primitives.Ints.checkedCast(r4)
            long r0 = r2 >> r1
            long r0 = r0 & r6
            int r0 = com.google.common.primitives.Ints.checkedCast(r0)
            r1 = 8
            long r4 = r2 >> r1
            long r4 = r4 & r6
            int r1 = com.google.common.primitives.Ints.checkedCast(r4)
            long r2 = r2 & r6
            int r2 = com.google.common.primitives.Ints.checkedCast(r2)
            int r8 = android.graphics.Color.argb(r8, r2, r1, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L51:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse color expression: '"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = "'"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "SsaStyle"
            com.google.android.exoplayer2.util.Log.w(r1, r8, r0)
            r8 = 0
            return r8
    }

    private static float parseFontSize(java.lang.String r3) {
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L5
            return r3
        L5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse font size: '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "SsaStyle"
            com.google.android.exoplayer2.util.Log.w(r1, r3, r0)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            return r3
    }
}
