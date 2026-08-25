package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
final class SpannedToHtmlConverter {
    private static final java.util.regex.Pattern NEWLINE_PATTERN = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SpannedToHtmlConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class HtmlAndCss {
        public final java.util.Map<java.lang.String, java.lang.String> cssRuleSets;
        public final java.lang.String html;

        private HtmlAndCss(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.html = r1
                r0.cssRuleSets = r2
                return
        }

        public /* synthetic */ HtmlAndCss(java.lang.String r1, java.util.Map r2, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SpanInfo {
        private static final java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> FOR_CLOSING_TAGS = null;
        private static final java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> FOR_OPENING_TAGS = null;
        public final java.lang.String closingTag;
        public final int end;
        public final java.lang.String openingTag;
        public final int start;

        public static /* synthetic */ int $r8$lambda$PID6wcJZ_0iQR0TUk7wendeqYKg(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r0, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r1) {
                int r0 = lambda$static$0(r0, r1)
                return r0
        }

        public static /* synthetic */ int $r8$lambda$wdhPY3eswLvZmYgaJLTPStB2Qzs(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r0, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r1) {
                int r0 = lambda$static$1(r0, r1)
                return r0
        }

        static {
                com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0.INSTANCE
                com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS = r0
                com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0.INSTANCE$1
                com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS = r0
                return
        }

        private SpanInfo(int r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                r0.openingTag = r3
                r0.closingTag = r4
                return
        }

        public /* synthetic */ SpanInfo(int r1, int r2, java.lang.String r3, java.lang.String r4, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ java.util.Comparator access$200() {
                java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo> r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS
                return r0
        }

        public static /* synthetic */ java.util.Comparator access$400() {
                java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo> r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS
                return r0
        }

        private static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r2, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r3) {
                int r0 = r3.end
                int r1 = r2.end
                int r0 = java.lang.Integer.compare(r0, r1)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.String r0 = r2.openingTag
                java.lang.String r1 = r3.openingTag
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto L16
                return r0
            L16:
                java.lang.String r2 = r2.closingTag
                java.lang.String r3 = r3.closingTag
                int r2 = r2.compareTo(r3)
                return r2
        }

        private static /* synthetic */ int lambda$static$1(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r2, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo r3) {
                int r0 = r3.start
                int r1 = r2.start
                int r0 = java.lang.Integer.compare(r0, r1)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.String r0 = r3.openingTag
                java.lang.String r1 = r2.openingTag
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto L16
                return r0
            L16:
                java.lang.String r3 = r3.closingTag
                java.lang.String r2 = r2.closingTag
                int r2 = r3.compareTo(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Transition {
        private final java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> spansAdded;
        private final java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> spansRemoved;

        public Transition() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.spansAdded = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.spansRemoved = r0
                return
        }

        public static /* synthetic */ java.util.List access$100(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition r0) {
                java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo> r0 = r0.spansRemoved
                return r0
        }

        public static /* synthetic */ java.util.List access$300(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition r0) {
                java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo> r0 = r0.spansAdded
                return r0
        }
    }

    static {
            java.lang.String r0 = "(&#13;)?&#10;"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter.NEWLINE_PATTERN = r0
            return
    }

    private SpannedToHtmlConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss convert(@androidx.annotation.Nullable java.lang.CharSequence r8, float r9) {
            r0 = 0
            if (r8 != 0) goto Lf
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss r8 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss
            com.google.common.collect.ImmutableMap r9 = com.google.common.collect.ImmutableMap.of()
            java.lang.String r1 = ""
            r8.<init>(r1, r9, r0)
            return r8
        Lf:
            boolean r1 = r8 instanceof android.text.Spanned
            if (r1 != 0) goto L21
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss r9 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss
            java.lang.String r8 = escapeHtml(r8)
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
            r9.<init>(r8, r1, r0)
            return r9
        L21:
            android.text.Spanned r8 = (android.text.Spanned) r8
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r8.length()
            java.lang.Class<android.text.style.BackgroundColorSpan> r3 = android.text.style.BackgroundColorSpan.class
            r4 = 0
            java.lang.Object[] r2 = r8.getSpans(r4, r2, r3)
            android.text.style.BackgroundColorSpan[] r2 = (android.text.style.BackgroundColorSpan[]) r2
            int r3 = r2.length
            r5 = 0
        L37:
            if (r5 >= r3) goto L49
            r6 = r2[r5]
            int r6 = r6.getBackgroundColor()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
            int r5 = r5 + 1
            goto L37
        L49:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r5 = "bg_"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r3)
            java.lang.String r5 = com.google.android.exoplayer2.ui.HtmlUtils.cssAllClassDescendantsSelector(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r3)
            r6[r4] = r3
            java.lang.String r3 = "background-color:%s;"
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.formatInvariant(r3, r6)
            r2.put(r5, r3)
            goto L52
        L7f:
            android.util.SparseArray r9 = findSpanTransitions(r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r8.length()
            r1.<init>(r3)
            r3 = 0
        L8d:
            int r5 = r9.size()
            if (r4 >= r5) goto Lf6
            int r5 = r9.keyAt(r4)
            java.lang.CharSequence r3 = r8.subSequence(r3, r5)
            java.lang.String r3 = escapeHtml(r3)
            r1.append(r3)
            java.lang.Object r3 = r9.get(r5)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition r3 = (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition) r3
            java.util.List r6 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$100(r3)
            java.util.Comparator r7 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.access$200()
            java.util.Collections.sort(r6, r7)
            java.util.List r6 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$100(r3)
            java.util.Iterator r6 = r6.iterator()
        Lbb:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r6.next()
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo r7 = (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) r7
            java.lang.String r7 = r7.closingTag
            r1.append(r7)
            goto Lbb
        Lcd:
            java.util.List r6 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$300(r3)
            java.util.Comparator r7 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.access$400()
            java.util.Collections.sort(r6, r7)
            java.util.List r3 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$300(r3)
            java.util.Iterator r3 = r3.iterator()
        Le0:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lf2
            java.lang.Object r6 = r3.next()
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo r6 = (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) r6
            java.lang.String r6 = r6.openingTag
            r1.append(r6)
            goto Le0
        Lf2:
            int r4 = r4 + 1
            r3 = r5
            goto L8d
        Lf6:
            int r9 = r8.length()
            java.lang.CharSequence r8 = r8.subSequence(r3, r9)
            java.lang.String r8 = escapeHtml(r8)
            r1.append(r8)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss r8 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss
            java.lang.String r9 = r1.toString()
            r8.<init>(r9, r2, r0)
            return r8
    }

    private static java.lang.String escapeHtml(java.lang.CharSequence r1) {
            java.lang.String r1 = android.text.Html.escapeHtml(r1)
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.NEWLINE_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = "<br>"
            java.lang.String r1 = r1.replaceAll(r0)
            return r1
    }

    private static android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> findSpanTransitions(android.text.Spanned r13, float r14) {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = r13.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            java.lang.Object[] r1 = r13.getSpans(r3, r1, r2)
            int r2 = r1.length
        L11:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.lang.String r8 = getOpeningTag(r4, r14)
            java.lang.String r9 = getClosingTag(r4)
            int r11 = r13.getSpanStart(r4)
            int r4 = r13.getSpanEnd(r4)
            if (r8 == 0) goto L49
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo r12 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo
            r10 = 0
            r5 = r12
            r6 = r11
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition r5 = getOrCreate(r0, r11)
            java.util.List r5 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$300(r5)
            r5.add(r12)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition r4 = getOrCreate(r0, r4)
            java.util.List r4 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition.access$100(r4)
            r4.add(r12)
        L49:
            int r3 = r3 + 1
            goto L11
        L4c:
            return r0
    }

    @androidx.annotation.Nullable
    private static java.lang.String getClosingTag(java.lang.Object r3) {
            boolean r0 = r3 instanceof android.text.style.StrikethroughSpan
            java.lang.String r1 = "</span>"
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof android.text.style.ForegroundColorSpan
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof android.text.style.BackgroundColorSpan
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof android.text.style.RelativeSizeSpan
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof com.google.android.exoplayer2.text.span.TextEmphasisSpan
            if (r0 == 0) goto L1f
            goto L6d
        L1f:
            boolean r0 = r3 instanceof android.text.style.TypefaceSpan
            r2 = 0
            if (r0 == 0) goto L2f
            android.text.style.TypefaceSpan r3 = (android.text.style.TypefaceSpan) r3
            java.lang.String r3 = r3.getFamily()
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r1 = r2
        L2e:
            return r1
        L2f:
            boolean r0 = r3 instanceof android.text.style.StyleSpan
            if (r0 == 0) goto L4c
            android.text.style.StyleSpan r3 = (android.text.style.StyleSpan) r3
            int r3 = r3.getStyle()
            r0 = 1
            if (r3 == r0) goto L49
            r0 = 2
            if (r3 == r0) goto L46
            r0 = 3
            if (r3 == r0) goto L43
            goto L6c
        L43:
            java.lang.String r3 = "</i></b>"
            return r3
        L46:
            java.lang.String r3 = "</i>"
            return r3
        L49:
            java.lang.String r3 = "</b>"
            return r3
        L4c:
            boolean r0 = r3 instanceof com.google.android.exoplayer2.text.span.RubySpan
            if (r0 == 0) goto L65
            com.google.android.exoplayer2.text.span.RubySpan r3 = (com.google.android.exoplayer2.text.span.RubySpan) r3
            java.lang.String r0 = "<rt>"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r3 = r3.rubyText
            java.lang.String r3 = escapeHtml(r3)
            java.lang.String r1 = "</rt></ruby>"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            return r3
        L65:
            boolean r3 = r3 instanceof android.text.style.UnderlineSpan
            if (r3 == 0) goto L6c
            java.lang.String r3 = "</u>"
            return r3
        L6c:
            return r2
        L6d:
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.String getOpeningTag(java.lang.Object r4, float r5) {
            boolean r0 = r4 instanceof android.text.style.StrikethroughSpan
            if (r0 == 0) goto L7
            java.lang.String r4 = "<span style='text-decoration:line-through;'>"
            return r4
        L7:
            boolean r0 = r4 instanceof android.text.style.ForegroundColorSpan
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            android.text.style.ForegroundColorSpan r4 = (android.text.style.ForegroundColorSpan) r4
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r4 = r4.getForegroundColor()
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r5[r1] = r4
            java.lang.String r4 = "<span style='color:%s;'>"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
            return r4
        L22:
            boolean r0 = r4 instanceof android.text.style.BackgroundColorSpan
            if (r0 == 0) goto L3b
            android.text.style.BackgroundColorSpan r4 = (android.text.style.BackgroundColorSpan) r4
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r4 = r4.getBackgroundColor()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r1] = r4
            java.lang.String r4 = "<span class='bg_%s'>"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
            return r4
        L3b:
            boolean r0 = r4 instanceof com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan
            if (r0 == 0) goto L42
            java.lang.String r4 = "<span style='text-combine-upright:all;'>"
            return r4
        L42:
            boolean r0 = r4 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 == 0) goto L69
            android.text.style.AbsoluteSizeSpan r4 = (android.text.style.AbsoluteSizeSpan) r4
            boolean r0 = r4.getDip()
            if (r0 == 0) goto L54
            int r4 = r4.getSize()
            float r4 = (float) r4
            goto L5a
        L54:
            int r4 = r4.getSize()
            float r4 = (float) r4
            float r4 = r4 / r5
        L5a:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r1] = r4
            java.lang.String r4 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
            return r4
        L69:
            boolean r5 = r4 instanceof android.text.style.RelativeSizeSpan
            if (r5 == 0) goto L86
            java.lang.Object[] r5 = new java.lang.Object[r2]
            android.text.style.RelativeSizeSpan r4 = (android.text.style.RelativeSizeSpan) r4
            float r4 = r4.getSizeChange()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r1] = r4
            java.lang.String r4 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
            return r4
        L86:
            boolean r5 = r4 instanceof android.text.style.TypefaceSpan
            r0 = 0
            if (r5 == 0) goto L9e
            android.text.style.TypefaceSpan r4 = (android.text.style.TypefaceSpan) r4
            java.lang.String r4 = r4.getFamily()
            if (r4 == 0) goto L9d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "<span style='font-family:\"%s\";'>"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
        L9d:
            return r0
        L9e:
            boolean r5 = r4 instanceof android.text.style.StyleSpan
            r3 = 2
            if (r5 == 0) goto Lba
            android.text.style.StyleSpan r4 = (android.text.style.StyleSpan) r4
            int r4 = r4.getStyle()
            if (r4 == r2) goto Lb7
            if (r4 == r3) goto Lb4
            r5 = 3
            if (r4 == r5) goto Lb1
            return r0
        Lb1:
            java.lang.String r4 = "<b><i>"
            return r4
        Lb4:
            java.lang.String r4 = "<i>"
            return r4
        Lb7:
            java.lang.String r4 = "<b>"
            return r4
        Lba:
            boolean r5 = r4 instanceof com.google.android.exoplayer2.text.span.RubySpan
            if (r5 == 0) goto Ld3
            com.google.android.exoplayer2.text.span.RubySpan r4 = (com.google.android.exoplayer2.text.span.RubySpan) r4
            int r4 = r4.position
            r5 = -1
            if (r4 == r5) goto Ld0
            if (r4 == r2) goto Lcd
            if (r4 == r3) goto Lca
            return r0
        Lca:
            java.lang.String r4 = "<ruby style='ruby-position:under;'>"
            return r4
        Lcd:
            java.lang.String r4 = "<ruby style='ruby-position:over;'>"
            return r4
        Ld0:
            java.lang.String r4 = "<ruby style='ruby-position:unset;'>"
            return r4
        Ld3:
            boolean r5 = r4 instanceof android.text.style.UnderlineSpan
            if (r5 == 0) goto Lda
            java.lang.String r4 = "<u>"
            return r4
        Lda:
            boolean r5 = r4 instanceof com.google.android.exoplayer2.text.span.TextEmphasisSpan
            if (r5 == 0) goto Lfb
            com.google.android.exoplayer2.text.span.TextEmphasisSpan r4 = (com.google.android.exoplayer2.text.span.TextEmphasisSpan) r4
            int r5 = r4.markShape
            int r0 = r4.markFill
            java.lang.String r5 = getTextEmphasisStyle(r5, r0)
            int r4 = r4.position
            java.lang.String r4 = getTextEmphasisPosition(r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r5
            r0[r2] = r4
            java.lang.String r4 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r0)
            return r4
        Lfb:
            return r0
    }

    private static com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition getOrCreate(android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> r1, int r2) {
            java.lang.Object r0 = r1.get(r2)
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition r0 = (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition) r0
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition r0 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter$Transition
            r0.<init>()
            r1.put(r2, r0)
        L10:
            return r0
    }

    private static java.lang.String getTextEmphasisPosition(int r1) {
            r0 = 2
            if (r1 == r0) goto L6
            java.lang.String r1 = "over right"
            return r1
        L6:
            java.lang.String r1 = "under left"
            return r1
    }

    private static java.lang.String getTextEmphasisStyle(int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto L12
            if (r4 == r1) goto Lc
            goto L17
        Lc:
            java.lang.String r4 = "open "
            r0.append(r4)
            goto L17
        L12:
            java.lang.String r4 = "filled "
            r0.append(r4)
        L17:
            if (r3 == 0) goto L3a
            if (r3 == r2) goto L34
            if (r3 == r1) goto L2e
            r4 = 3
            if (r3 == r4) goto L27
            java.lang.String r3 = "unset"
            r0.append(r3)
            goto L3f
        L27:
            java.lang.String r3 = "sesame"
            r0.append(r3)
            goto L3f
        L2e:
            java.lang.String r3 = "dot"
            r0.append(r3)
            goto L3f
        L34:
            java.lang.String r3 = "circle"
            r0.append(r3)
            goto L3f
        L3a:
            java.lang.String r3 = "none"
            r0.append(r3)
        L3f:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
