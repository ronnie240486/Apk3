package com.google.android.exoplayer2.text.subrip;

/* JADX INFO: loaded from: classes2.dex */
public final class SubripDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final java.lang.String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final java.lang.String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final java.lang.String ALIGN_MID_LEFT = "{\\an4}";
    private static final java.lang.String ALIGN_MID_MID = "{\\an5}";
    private static final java.lang.String ALIGN_MID_RIGHT = "{\\an6}";
    private static final java.lang.String ALIGN_TOP_LEFT = "{\\an7}";
    private static final java.lang.String ALIGN_TOP_MID = "{\\an8}";
    private static final java.lang.String ALIGN_TOP_RIGHT = "{\\an9}";
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final java.lang.String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final java.util.regex.Pattern SUBRIP_TAG_PATTERN = null;
    private static final java.lang.String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final java.util.regex.Pattern SUBRIP_TIMING_LINE = null;
    private static final java.lang.String TAG = "SubripDecoder";
    private final java.util.ArrayList<java.lang.String> tags;
    private final java.lang.StringBuilder textBuilder;

    static {
            java.lang.String r0 = "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.subrip.SubripDecoder.SUBRIP_TIMING_LINE = r0
            java.lang.String r0 = "\\{\\\\.*?\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.subrip.SubripDecoder.SUBRIP_TAG_PATTERN = r0
            return
    }

    public SubripDecoder() {
            r1 = this;
            java.lang.String r0 = "SubripDecoder"
            r1.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.textBuilder = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.tags = r0
            return
    }

    private com.google.android.exoplayer2.text.Cue buildCue(android.text.Spanned r17, @androidx.annotation.Nullable java.lang.String r18) {
            r16 = this;
            r0 = r18
            com.google.android.exoplayer2.text.Cue$Builder r1 = new com.google.android.exoplayer2.text.Cue$Builder
            r1.<init>()
            r2 = r17
            com.google.android.exoplayer2.text.Cue$Builder r1 = r1.setText(r2)
            if (r0 != 0) goto L14
            com.google.android.exoplayer2.text.Cue r0 = r1.build()
            return r0
        L14:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L7c;
                case -685620679: goto L74;
                case -685620648: goto L6c;
                case -685620617: goto L64;
                case -685620586: goto L5c;
                case -685620555: goto L54;
                case -685620524: goto L4c;
                case -685620493: goto L43;
                case -685620462: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L84
        L3b:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L84
            r2 = 5
            goto L85
        L43:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L84
            r2 = 8
            goto L85
        L4c:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L84
            r2 = 2
            goto L85
        L54:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L84
            r2 = 4
            goto L85
        L5c:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L84
            r2 = 7
            goto L85
        L64:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L84
            r2 = 1
            goto L85
        L6c:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L84
            r2 = 3
            goto L85
        L74:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L84
            r2 = 6
            goto L85
        L7c:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L84
            r2 = 0
            goto L85
        L84:
            r2 = -1
        L85:
            if (r2 == 0) goto L9a
            if (r2 == r3) goto L9a
            if (r2 == r15) goto L9a
            if (r2 == r5) goto L96
            if (r2 == r4) goto L96
            r4 = 5
            if (r2 == r4) goto L96
            r1.setPositionAnchor(r3)
            goto L9e
        L96:
            r1.setPositionAnchor(r15)
            goto L9e
        L9a:
            r2 = 0
            r1.setPositionAnchor(r2)
        L9e:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto Le7;
                case -685620679: goto Ldf;
                case -685620648: goto Ld7;
                case -685620617: goto Lcf;
                case -685620586: goto Lc7;
                case -685620555: goto Lbe;
                case -685620524: goto Lb6;
                case -685620493: goto Lae;
                case -685620462: goto La6;
                default: goto La5;
            }
        La5:
            goto Lef
        La6:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lef
            r0 = 5
            goto Lf0
        Lae:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lef
            r0 = 4
            goto Lf0
        Lb6:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lef
            r0 = 3
            goto Lf0
        Lbe:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto Lef
            r0 = 8
            goto Lf0
        Lc7:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto Lef
            r0 = 7
            goto Lf0
        Lcf:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto Lef
            r0 = 6
            goto Lf0
        Ld7:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto Lef
            r0 = 2
            goto Lf0
        Ldf:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto Lef
            r0 = 1
            goto Lf0
        Le7:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto Lef
            r0 = 0
            goto Lf0
        Lef:
            r0 = -1
        Lf0:
            if (r0 == 0) goto L107
            if (r0 == r3) goto L107
            if (r0 == r15) goto L107
            if (r0 == r5) goto L102
            r2 = 4
            if (r0 == r2) goto L102
            r2 = 5
            if (r0 == r2) goto L102
            r1.setLineAnchor(r3)
            goto L10a
        L102:
            r0 = 0
            r1.setLineAnchor(r0)
            goto L10a
        L107:
            r1.setLineAnchor(r15)
        L10a:
            int r0 = r1.getPositionAnchor()
            float r0 = getFractionalPositionForAnchorType(r0)
            com.google.android.exoplayer2.text.Cue$Builder r0 = r1.setPosition(r0)
            int r1 = r1.getLineAnchor()
            float r1 = getFractionalPositionForAnchorType(r1)
            r2 = 0
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setLine(r1, r2)
            com.google.android.exoplayer2.text.Cue r0 = r0.build()
            return r0
    }

    private java.nio.charset.Charset detectUtfCharset(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = this;
            java.nio.charset.Charset r1 = r1.readUtfCharsetFromBom()
            if (r1 == 0) goto L7
            goto L9
        L7:
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
        L9:
            return r1
    }

    public static float getFractionalPositionForAnchorType(int r1) {
            if (r1 == 0) goto L15
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 1064011039(0x3f6b851f, float:0.92)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L12:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L15:
            r1 = 1034147594(0x3da3d70a, float:0.08)
            return r1
    }

    private static long parseTimecode(java.util.regex.Matcher r9, int r10) {
            int r0 = r10 + 1
            java.lang.String r0 = r9.group(r0)
            r1 = 60
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L17
            long r5 = java.lang.Long.parseLong(r0)
            long r5 = r5 * r1
            long r5 = r5 * r1
            long r5 = r5 * r3
            goto L19
        L17:
            r5 = 0
        L19:
            int r0 = r10 + 2
            java.lang.String r0 = r9.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r7 = java.lang.Long.parseLong(r0)
            long r7 = r7 * r1
            long r7 = r7 * r3
            long r7 = r7 + r5
            int r0 = r10 + 3
            java.lang.String r0 = r9.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r3
            long r0 = r0 + r7
            int r10 = r10 + 4
            java.lang.String r9 = r9.group(r10)
            if (r9 == 0) goto L4e
            long r9 = java.lang.Long.parseLong(r9)
            long r0 = r0 + r9
        L4e:
            long r0 = r0 * r3
            return r0
    }

    private java.lang.String processLine(java.lang.String r7, java.util.ArrayList<java.lang.String> r8) {
            r6 = this;
            java.lang.String r7 = r7.trim()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.text.subrip.SubripDecoder.SUBRIP_TAG_PATTERN
            java.util.regex.Matcher r7 = r1.matcher(r7)
            r1 = 0
        L10:
            boolean r2 = r7.find()
            if (r2 == 0) goto L2f
            java.lang.String r2 = r7.group()
            r8.add(r2)
            int r3 = r7.start()
            int r3 = r3 - r1
            int r2 = r2.length()
            int r4 = r3 + r2
            java.lang.String r5 = ""
            r0.replace(r3, r4, r5)
            int r1 = r1 + r2
            goto L10
        L2f:
            java.lang.String r7 = r0.toString()
            return r7
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r8, int r9, boolean r10) {
            r7 = this;
            java.lang.String r10 = "SubripDecoder"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.util.LongArray r1 = new com.google.android.exoplayer2.util.LongArray
            r1.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>(r8, r9)
            java.nio.charset.Charset r8 = r7.detectUtfCharset(r2)
        L15:
            java.lang.String r9 = r2.readLine(r8)
            r3 = 0
            if (r9 == 0) goto Lc6
            int r4 = r9.length()
            if (r4 != 0) goto L23
            goto L15
        L23:
            java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r9 = r2.readLine(r8)
            if (r9 != 0) goto L33
            java.lang.String r8 = "Unexpected end"
            com.google.android.exoplayer2.util.Log.w(r10, r8)
            goto Lc6
        L33:
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.text.subrip.SubripDecoder.SUBRIP_TIMING_LINE
            java.util.regex.Matcher r4 = r4.matcher(r9)
            boolean r5 = r4.matches()
            if (r5 == 0) goto Lb8
            r9 = 1
            long r5 = parseTimecode(r4, r9)
            r1.add(r5)
            r9 = 6
            long r4 = parseTimecode(r4, r9)
            r1.add(r4)
            java.lang.StringBuilder r9 = r7.textBuilder
            r9.setLength(r3)
            java.util.ArrayList<java.lang.String> r9 = r7.tags
            r9.clear()
            java.lang.String r9 = r2.readLine(r8)
        L5d:
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L82
            java.lang.StringBuilder r4 = r7.textBuilder
            int r4 = r4.length()
            if (r4 <= 0) goto L72
            java.lang.StringBuilder r4 = r7.textBuilder
            java.lang.String r5 = "<br>"
            r4.append(r5)
        L72:
            java.lang.StringBuilder r4 = r7.textBuilder
            java.util.ArrayList<java.lang.String> r5 = r7.tags
            java.lang.String r9 = r7.processLine(r9, r5)
            r4.append(r9)
            java.lang.String r9 = r2.readLine(r8)
            goto L5d
        L82:
            java.lang.StringBuilder r9 = r7.textBuilder
            java.lang.String r9 = r9.toString()
            android.text.Spanned r9 = android.text.Html.fromHtml(r9)
            r4 = 0
        L8d:
            java.util.ArrayList<java.lang.String> r5 = r7.tags
            int r5 = r5.size()
            if (r3 >= r5) goto Laa
            java.util.ArrayList<java.lang.String> r5 = r7.tags
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "\\{\\\\an[1-9]\\}"
            boolean r6 = r5.matches(r6)
            if (r6 == 0) goto La7
            r4 = r5
            goto Laa
        La7:
            int r3 = r3 + 1
            goto L8d
        Laa:
            com.google.android.exoplayer2.text.Cue r9 = r7.buildCue(r9, r4)
            r0.add(r9)
            com.google.android.exoplayer2.text.Cue r9 = com.google.android.exoplayer2.text.Cue.EMPTY
            r0.add(r9)
            goto L15
        Lb8:
            java.lang.String r3 = "Skipping invalid timing: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r3, r9, r10)
            goto L15
        Lbf:
            java.lang.String r3 = "Skipping invalid index: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r3, r9, r10)
            goto L15
        Lc6:
            com.google.android.exoplayer2.text.Cue[] r8 = new com.google.android.exoplayer2.text.Cue[r3]
            java.lang.Object[] r8 = r0.toArray(r8)
            com.google.android.exoplayer2.text.Cue[] r8 = (com.google.android.exoplayer2.text.Cue[]) r8
            long[] r9 = r1.toArray()
            com.google.android.exoplayer2.text.subrip.SubripSubtitle r10 = new com.google.android.exoplayer2.text.subrip.SubripSubtitle
            r10.<init>(r8, r9)
            return r10
    }
}
