package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlRenderUtil {
    private static final java.lang.String TAG = "TtmlRenderUtil";

    private TtmlRenderUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyStylesToSpan(android.text.Spannable r8, int r9, int r10, com.google.android.exoplayer2.text.ttml.TtmlStyle r11, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlNode r12, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r13, int r14) {
            int r0 = r11.getStyle()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L15
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r3 = r11.getStyle()
            r0.<init>(r3)
            r8.setSpan(r0, r9, r10, r2)
        L15:
            boolean r0 = r11.isLinethrough()
            if (r0 == 0) goto L23
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r8.setSpan(r0, r9, r10, r2)
        L23:
            boolean r0 = r11.isUnderline()
            if (r0 == 0) goto L31
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r8.setSpan(r0, r9, r10, r2)
        L31:
            boolean r0 = r11.hasFontColor()
            if (r0 == 0) goto L43
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r3 = r11.getFontColor()
            r0.<init>(r3)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r0, r9, r10, r2)
        L43:
            boolean r0 = r11.hasBackgroundColor()
            if (r0 == 0) goto L55
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r3 = r11.getBackgroundColor()
            r0.<init>(r3)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r0, r9, r10, r2)
        L55:
            java.lang.String r0 = r11.getFontFamily()
            if (r0 == 0) goto L67
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r3 = r11.getFontFamily()
            r0.<init>(r3)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r0, r9, r10, r2)
        L67:
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = r11.getTextEmphasis()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L98
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = r11.getTextEmphasis()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = (com.google.android.exoplayer2.text.ttml.TextEmphasis) r0
            int r6 = r0.markShape
            if (r6 != r1) goto L88
            if (r14 == r4) goto L85
            if (r14 != r5) goto L83
            goto L85
        L83:
            r6 = 1
            goto L86
        L85:
            r6 = 3
        L86:
            r14 = 1
            goto L8a
        L88:
            int r14 = r0.markFill
        L8a:
            int r0 = r0.position
            r7 = -2
            if (r0 != r7) goto L90
            r0 = 1
        L90:
            com.google.android.exoplayer2.text.span.TextEmphasisSpan r7 = new com.google.android.exoplayer2.text.span.TextEmphasisSpan
            r7.<init>(r6, r14, r0)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r7, r9, r10, r2)
        L98:
            int r14 = r11.getRubyType()
            if (r14 == r4) goto Lad
            if (r14 == r3) goto La4
            r12 = 4
            if (r14 == r12) goto La4
            goto L10a
        La4:
            com.google.android.exoplayer2.text.ttml.DeleteTextSpan r12 = new com.google.android.exoplayer2.text.ttml.DeleteTextSpan
            r12.<init>()
            r8.setSpan(r12, r9, r10, r2)
            goto L10a
        Lad:
            com.google.android.exoplayer2.text.ttml.TtmlNode r12 = findRubyContainerNode(r12, r13)
            if (r12 != 0) goto Lb4
            goto L10a
        Lb4:
            com.google.android.exoplayer2.text.ttml.TtmlNode r14 = findRubyTextNode(r12, r13)
            if (r14 != 0) goto Lbb
            goto L10a
        Lbb:
            int r0 = r14.getChildCount()
            if (r0 != r5) goto L103
            r0 = 0
            com.google.android.exoplayer2.text.ttml.TtmlNode r6 = r14.getChild(r0)
            java.lang.String r6 = r6.text
            if (r6 == 0) goto L103
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = r14.getChild(r0)
            java.lang.String r0 = r0.text
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.exoplayer2.text.ttml.TtmlStyle r6 = r14.style
            java.lang.String[] r14 = r14.getStyleIds()
            com.google.android.exoplayer2.text.ttml.TtmlStyle r14 = resolveStyle(r6, r14, r13)
            if (r14 == 0) goto Le7
            int r14 = r14.getRubyPosition()
            goto Le8
        Le7:
            r14 = -1
        Le8:
            if (r14 != r1) goto Lfa
            com.google.android.exoplayer2.text.ttml.TtmlStyle r1 = r12.style
            java.lang.String[] r12 = r12.getStyleIds()
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = resolveStyle(r1, r12, r13)
            if (r12 == 0) goto Lfa
            int r14 = r12.getRubyPosition()
        Lfa:
            com.google.android.exoplayer2.text.span.RubySpan r12 = new com.google.android.exoplayer2.text.span.RubySpan
            r12.<init>(r0, r14)
            r8.setSpan(r12, r9, r10, r2)
            goto L10a
        L103:
            java.lang.String r12 = "TtmlRenderUtil"
            java.lang.String r13 = "Skipping rubyText node without exactly one text child."
            com.google.android.exoplayer2.util.Log.i(r12, r13)
        L10a:
            boolean r12 = r11.getTextCombine()
            if (r12 == 0) goto L118
            com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan r12 = new com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan
            r12.<init>()
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r12, r9, r10, r2)
        L118:
            int r12 = r11.getFontSizeUnit()
            if (r12 == r5) goto L140
            if (r12 == r4) goto L133
            if (r12 == r3) goto L123
            goto L14d
        L123:
            android.text.style.RelativeSizeSpan r12 = new android.text.style.RelativeSizeSpan
            float r11 = r11.getFontSize()
            r13 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r13
            r12.<init>(r11)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r12, r9, r10, r2)
            goto L14d
        L133:
            android.text.style.RelativeSizeSpan r12 = new android.text.style.RelativeSizeSpan
            float r11 = r11.getFontSize()
            r12.<init>(r11)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r12, r9, r10, r2)
            goto L14d
        L140:
            android.text.style.AbsoluteSizeSpan r12 = new android.text.style.AbsoluteSizeSpan
            float r11 = r11.getFontSize()
            int r11 = (int) r11
            r12.<init>(r11, r5)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r8, r12, r9, r10, r2)
        L14d:
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.ttml.TtmlNode findRubyContainerNode(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlNode r2, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r3) {
        L0:
            if (r2 == 0) goto L19
            com.google.android.exoplayer2.text.ttml.TtmlStyle r0 = r2.style
            java.lang.String[] r1 = r2.getStyleIds()
            com.google.android.exoplayer2.text.ttml.TtmlStyle r0 = resolveStyle(r0, r1, r3)
            if (r0 == 0) goto L16
            int r0 = r0.getRubyType()
            r1 = 1
            if (r0 != r1) goto L16
            return r2
        L16:
            com.google.android.exoplayer2.text.ttml.TtmlNode r2 = r2.parent
            goto L0
        L19:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.ttml.TtmlNode findRubyTextNode(com.google.android.exoplayer2.text.ttml.TtmlNode r3, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r4) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r0.push(r3)
        L8:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3a
            java.lang.Object r3 = r0.pop()
            com.google.android.exoplayer2.text.ttml.TtmlNode r3 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r3
            com.google.android.exoplayer2.text.ttml.TtmlStyle r1 = r3.style
            java.lang.String[] r2 = r3.getStyleIds()
            com.google.android.exoplayer2.text.ttml.TtmlStyle r1 = resolveStyle(r1, r2, r4)
            if (r1 == 0) goto L28
            int r1 = r1.getRubyType()
            r2 = 3
            if (r1 != r2) goto L28
            return r3
        L28:
            int r1 = r3.getChildCount()
            int r1 = r1 + (-1)
        L2e:
            if (r1 < 0) goto L8
            com.google.android.exoplayer2.text.ttml.TtmlNode r2 = r3.getChild(r1)
            r0.push(r2)
            int r1 = r1 + (-1)
            goto L2e
        L3a:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.text.ttml.TtmlStyle resolveStyle(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r3, @androidx.annotation.Nullable java.lang.String[] r4, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r5) {
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L2e
            if (r4 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r2 = r4.length
            if (r2 != r1) goto L14
            r3 = r4[r0]
            java.lang.Object r3 = r5.get(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r3 = (com.google.android.exoplayer2.text.ttml.TtmlStyle) r3
            return r3
        L14:
            int r2 = r4.length
            if (r2 <= r1) goto L56
            com.google.android.exoplayer2.text.ttml.TtmlStyle r3 = new com.google.android.exoplayer2.text.ttml.TtmlStyle
            r3.<init>()
            int r1 = r4.length
        L1d:
            if (r0 >= r1) goto L2d
            r2 = r4[r0]
            java.lang.Object r2 = r5.get(r2)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r2 = (com.google.android.exoplayer2.text.ttml.TtmlStyle) r2
            r3.chain(r2)
            int r0 = r0 + 1
            goto L1d
        L2d:
            return r3
        L2e:
            if (r4 == 0) goto L40
            int r2 = r4.length
            if (r2 != r1) goto L40
            r4 = r4[r0]
            java.lang.Object r4 = r5.get(r4)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r4 = (com.google.android.exoplayer2.text.ttml.TtmlStyle) r4
            com.google.android.exoplayer2.text.ttml.TtmlStyle r3 = r3.chain(r4)
            return r3
        L40:
            if (r4 == 0) goto L56
            int r2 = r4.length
            if (r2 <= r1) goto L56
            int r1 = r4.length
        L46:
            if (r0 >= r1) goto L56
            r2 = r4[r0]
            java.lang.Object r2 = r5.get(r2)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r2 = (com.google.android.exoplayer2.text.ttml.TtmlStyle) r2
            r3.chain(r2)
            int r0 = r0 + 1
            goto L46
        L56:
            return r3
    }
}
