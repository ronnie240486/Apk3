package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {
    private static final java.util.regex.Pattern GAPLESS_COMMENT_PATTERN = null;
    private static final java.lang.String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final java.lang.String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay;
    public int encoderPadding;

    static {
            java.lang.String r0 = "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.extractor.GaplessInfoHolder.GAPLESS_COMMENT_PATTERN = r0
            return
    }

    public GaplessInfoHolder() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.encoderDelay = r0
            r1.encoderPadding = r0
            return
    }

    private boolean setFromComment(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.extractor.GaplessInfoHolder.GAPLESS_COMMENT_PATTERN
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.find()
            if (r0 == 0) goto L35
            r0 = 1
            java.lang.String r1 = r5.group(r0)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L35
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch: java.lang.NumberFormatException -> L35
            r3 = 2
            java.lang.String r5 = r5.group(r3)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NumberFormatException -> L35
            int r5 = java.lang.Integer.parseInt(r5, r2)     // Catch: java.lang.NumberFormatException -> L35
            if (r1 > 0) goto L30
            if (r5 <= 0) goto L35
        L30:
            r4.encoderDelay = r1     // Catch: java.lang.NumberFormatException -> L35
            r4.encoderPadding = r5     // Catch: java.lang.NumberFormatException -> L35
            return r0
        L35:
            r5 = 0
            return r5
    }

    public boolean hasGaplessInfo() {
            r2 = this;
            int r0 = r2.encoderDelay
            r1 = -1
            if (r0 == r1) goto Lb
            int r0 = r2.encoderPadding
            if (r0 == r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean setFromMetadata(com.google.android.exoplayer2.metadata.Metadata r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length()
            if (r1 >= r2) goto L4a
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r8.get(r1)
            boolean r3 = r2 instanceof com.google.android.exoplayer2.metadata.id3.CommentFrame
            java.lang.String r4 = "iTunSMPB"
            r5 = 1
            if (r3 == 0) goto L26
            com.google.android.exoplayer2.metadata.id3.CommentFrame r2 = (com.google.android.exoplayer2.metadata.id3.CommentFrame) r2
            java.lang.String r3 = r2.description
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L47
            java.lang.String r2 = r2.text
            boolean r2 = r7.setFromComment(r2)
            if (r2 == 0) goto L47
            return r5
        L26:
            boolean r3 = r2 instanceof com.google.android.exoplayer2.metadata.id3.InternalFrame
            if (r3 == 0) goto L47
            com.google.android.exoplayer2.metadata.id3.InternalFrame r2 = (com.google.android.exoplayer2.metadata.id3.InternalFrame) r2
            java.lang.String r3 = r2.domain
            java.lang.String r6 = "com.apple.iTunes"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L47
            java.lang.String r3 = r2.description
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L47
            java.lang.String r2 = r2.text
            boolean r2 = r7.setFromComment(r2)
            if (r2 == 0) goto L47
            return r5
        L47:
            int r1 = r1 + 1
            goto L2
        L4a:
            return r0
    }

    public boolean setFromXingHeaderValue(int r2) {
            r1 = this;
            int r0 = r2 >> 12
            r2 = r2 & 4095(0xfff, float:5.738E-42)
            if (r0 > 0) goto Lb
            if (r2 <= 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r1.encoderDelay = r0
            r1.encoderPadding = r2
            r2 = 1
            return r2
    }
}
