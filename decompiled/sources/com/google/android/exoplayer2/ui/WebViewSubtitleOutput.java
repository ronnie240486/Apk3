package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
final class WebViewSubtitleOutput extends android.widget.FrameLayout implements com.google.android.exoplayer2.ui.SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final java.lang.String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final com.google.android.exoplayer2.ui.CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private java.util.List<com.google.android.exoplayer2.text.Cue> textCues;
    private final android.webkit.WebView webView;


    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment = null;

        static {
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.exoplayer2.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.exoplayer2.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment     // Catch: java.lang.NoSuchFieldError -> L1d
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.exoplayer2.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment     // Catch: java.lang.NoSuchFieldError -> L28
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public WebViewSubtitleOutput(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WebViewSubtitleOutput(android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            java.util.List r0 = java.util.Collections.emptyList()
            r3.textCues = r0
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            r3.style = r0
            r0 = 1029329178(0x3d5a511a, float:0.0533)
            r3.defaultTextSize = r0
            r0 = 0
            r3.defaultTextSizeType = r0
            r1 = 1034147594(0x3da3d70a, float:0.08)
            r3.bottomPaddingFraction = r1
            com.google.android.exoplayer2.ui.CanvasSubtitleOutput r1 = new com.google.android.exoplayer2.ui.CanvasSubtitleOutput
            r1.<init>(r4, r5)
            r3.canvasSubtitleOutput = r1
            com.google.android.exoplayer2.ui.WebViewSubtitleOutput$1 r2 = new com.google.android.exoplayer2.ui.WebViewSubtitleOutput$1
            r2.<init>(r4, r5)
            r3.webView = r2
            r2.setBackgroundColor(r0)
            r3.addView(r1)
            r3.addView(r2)
            return
    }

    private static int anchorTypeToTranslatePercent(int r1) {
            r0 = 1
            if (r1 == r0) goto Lb
            r0 = 2
            if (r1 == r0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = -100
            return r1
        Lb:
            r1 = -50
            return r1
    }

    private static java.lang.String convertAlignmentToCss(@androidx.annotation.Nullable android.text.Layout.Alignment r2) {
            java.lang.String r0 = "center"
            if (r2 != 0) goto L5
            return r0
        L5:
            int[] r1 = com.google.android.exoplayer2.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L17
            r1 = 2
            if (r2 == r1) goto L14
            return r0
        L14:
            java.lang.String r2 = "end"
            return r2
        L17:
            java.lang.String r2 = "start"
            return r2
    }

    private static java.lang.String convertCaptionStyleToCssTextShadow(com.google.android.exoplayer2.ui.CaptionStyleCompat r4) {
            int r0 = r4.edgeType
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L46
            r3 = 2
            if (r0 == r3) goto L35
            r3 = 3
            if (r0 == r3) goto L24
            r3 = 4
            if (r0 == r3) goto L13
            java.lang.String r4 = "unset"
            return r4
        L13:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r4.edgeColor
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r0[r1] = r4
            java.lang.String r4 = "-0.05em -0.05em 0.15em %s"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r0)
            return r4
        L24:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r4.edgeColor
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r0[r1] = r4
            java.lang.String r4 = "0.06em 0.08em 0.15em %s"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r0)
            return r4
        L35:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r4.edgeColor
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r0[r1] = r4
            java.lang.String r4 = "0.1em 0.12em 0.15em %s"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r0)
            return r4
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r4.edgeColor
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r0[r1] = r4
            java.lang.String r4 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r0)
            return r4
    }

    private java.lang.String convertTextSizeToCss(int r4, float r5) {
            r3 = this;
            int r0 = r3.getHeight()
            int r1 = r3.getHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            float r4 = com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(r4, r5, r0, r1)
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L21
            java.lang.String r4 = "unset"
            return r4
        L21:
            android.content.Context r5 = r3.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 / r5
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%.2fpx"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r5)
            return r4
    }

    private static java.lang.String convertVerticalTypeToCss(int r1) {
            r0 = 1
            if (r1 == r0) goto Ld
            r0 = 2
            if (r1 == r0) goto L9
            java.lang.String r1 = "horizontal-tb"
            return r1
        L9:
            java.lang.String r1 = "vertical-lr"
            return r1
        Ld:
            java.lang.String r1 = "vertical-rl"
            return r1
    }

    private static java.lang.String getBlockShearTransformFunction(com.google.android.exoplayer2.text.Cue r4) {
            float r0 = r4.shearDegrees
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L29
            int r4 = r4.verticalType
            r1 = 1
            r2 = 2
            if (r4 == r2) goto L14
            if (r4 != r1) goto L10
            goto L14
        L10:
            java.lang.String r4 = "skewX"
            goto L17
        L14:
            java.lang.String r4 = "skewY"
        L17:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r2[r1] = r4
            java.lang.String r4 = "%s(%.2fdeg)"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r4, r2)
            return r4
        L29:
            java.lang.String r4 = ""
            return r4
    }

    private void updateWebView() {
            r26 = this;
            r0 = r26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.google.android.exoplayer2.ui.CaptionStyleCompat r4 = r0.style
            int r4 = r4.foregroundColor
            java.lang.String r4 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.defaultTextSizeType
            float r6 = r0.defaultTextSize
            java.lang.String r4 = r0.convertTextSizeToCss(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            com.google.android.exoplayer2.ui.CaptionStyleCompat r7 = r0.style
            java.lang.String r7 = convertCaptionStyleToCssTextShadow(r7)
            r9 = 3
            r3[r9] = r7
            java.lang.String r7 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.formatInvariant(r7, r3)
            r1.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r7 = "default_bg"
            java.lang.String r10 = com.google.android.exoplayer2.ui.HtmlUtils.cssAllClassDescendantsSelector(r7)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            com.google.android.exoplayer2.ui.CaptionStyleCompat r12 = r0.style
            int r12 = r12.backgroundColor
            java.lang.String r12 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r12)
            r11[r5] = r12
            java.lang.String r12 = "background-color:%s;"
            java.lang.String r11 = com.google.android.exoplayer2.util.Util.formatInvariant(r12, r11)
            r3.put(r10, r11)
            r10 = 0
        L5d:
            java.util.List<com.google.android.exoplayer2.text.Cue> r11 = r0.textCues
            int r11 = r11.size()
            if (r10 >= r11) goto L25f
            java.util.List<com.google.android.exoplayer2.text.Cue> r11 = r0.textCues
            java.lang.Object r11 = r11.get(r10)
            com.google.android.exoplayer2.text.Cue r11 = (com.google.android.exoplayer2.text.Cue) r11
            float r12 = r11.position
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = 1120403456(0x42c80000, float:100.0)
            int r15 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r15 == 0) goto L7b
            float r12 = r12 * r14
            goto L7d
        L7b:
            r12 = 1112014848(0x42480000, float:50.0)
        L7d:
            int r15 = r11.positionAnchor
            int r15 = anchorTypeToTranslatePercent(r15)
            float r2 = r11.line
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r9 = "%.2f%%"
            int r18 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r18 == 0) goto Ldd
            int r8 = r11.lineType
            if (r8 == r6) goto Lb2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r14
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.formatInvariant(r9, r8)
            int r8 = r11.verticalType
            if (r8 != r6) goto Lab
            int r8 = r11.lineAnchor
            int r8 = anchorTypeToTranslatePercent(r8)
            int r8 = -r8
            goto Lf1
        Lab:
            int r8 = r11.lineAnchor
            int r8 = anchorTypeToTranslatePercent(r8)
            goto Lf1
        Lb2:
            r8 = 0
            java.lang.String r13 = "%.2fem"
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto Lc9
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.formatInvariant(r13, r8)
            r8 = 0
            goto Lf1
        Lc9:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = -r2
            float r2 = r2 - r17
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.formatInvariant(r13, r8)
            r8 = 0
            r13 = 1
            goto Lf2
        Ldd:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r0.bottomPaddingFraction
            float r17 = r17 - r8
            float r17 = r17 * r14
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r2[r5] = r8
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.formatInvariant(r9, r2)
            r8 = -100
        Lf1:
            r13 = 0
        Lf2:
            float r4 = r11.size
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r19 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r19 == 0) goto L10b
            java.lang.Object[] r5 = new java.lang.Object[r6]
            float r4 = r4 * r14
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r14 = 0
            r5[r14] = r4
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.formatInvariant(r9, r5)
            goto L10d
        L10b:
            java.lang.String r4 = "fit-content"
        L10d:
            android.text.Layout$Alignment r5 = r11.textAlignment
            java.lang.String r5 = convertAlignmentToCss(r5)
            int r9 = r11.verticalType
            java.lang.String r9 = convertVerticalTypeToCss(r9)
            int r14 = r11.textSizeType
            float r6 = r11.textSize
            java.lang.String r6 = r0.convertTextSizeToCss(r14, r6)
            boolean r14 = r11.windowColorSet
            if (r14 == 0) goto L128
            int r14 = r11.windowColor
            goto L12c
        L128:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r14 = r0.style
            int r14 = r14.windowColor
        L12c:
            java.lang.String r14 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(r14)
            r20 = r8
            int r8 = r11.verticalType
            java.lang.String r21 = "right"
            java.lang.String r22 = "left"
            java.lang.String r23 = "top"
            r24 = r15
            r15 = 1
            if (r8 == r15) goto L14d
            r15 = 2
            if (r8 == r15) goto L14a
            if (r13 == 0) goto L148
            java.lang.String r23 = "bottom"
        L148:
            r13 = 2
            goto L156
        L14a:
            if (r13 == 0) goto L14f
            goto L151
        L14d:
            if (r13 == 0) goto L151
        L14f:
            r21 = r22
        L151:
            r22 = r23
            r13 = 2
            r23 = r21
        L156:
            if (r8 == r13) goto L162
            r13 = 1
            if (r8 != r13) goto L15c
            goto L162
        L15c:
            java.lang.String r8 = "width"
            r15 = r24
            goto L168
        L162:
            java.lang.String r8 = "height"
            r15 = r20
            r20 = r24
        L168:
            java.lang.CharSequence r13 = r11.text
            android.content.Context r21 = r26.getContext()
            android.content.res.Resources r21 = r21.getResources()
            android.util.DisplayMetrics r0 = r21.getDisplayMetrics()
            float r0 = r0.density
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter$HtmlAndCss r0 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.convert(r13, r0)
            java.util.Set r13 = r3.keySet()
            java.util.Iterator r13 = r13.iterator()
        L184:
            boolean r21 = r13.hasNext()
            if (r21 == 0) goto L1bc
            java.lang.Object r21 = r13.next()
            r24 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r21 = r3.get(r13)
            r25 = r0
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.put(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1b3
            java.lang.Object r13 = r3.get(r13)
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L1b1
            goto L1b3
        L1b1:
            r0 = 0
            goto L1b4
        L1b3:
            r0 = 1
        L1b4:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r13 = r24
            r0 = r25
            goto L184
        L1bc:
            r25 = r0
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r19 = 0
            r0[r19] = r13
            r13 = 1
            r0[r13] = r22
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r13 = 2
            r0[r13] = r12
            r12 = 3
            r0[r12] = r23
            r16 = 4
            r0[r16] = r2
            r2 = 5
            r0[r2] = r8
            r2 = 6
            r0[r2] = r4
            r2 = 7
            r0[r2] = r5
            r2 = 8
            r0[r2] = r9
            r2 = 9
            r0[r2] = r6
            r2 = 10
            r0[r2] = r14
            r2 = 11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r0[r2] = r4
            r2 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r0[r2] = r4
            r2 = 13
            java.lang.String r4 = getBlockShearTransformFunction(r11)
            r0[r2] = r4
            java.lang.String r2 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r2, r0)
            r1.append(r0)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            r2[r4] = r7
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.formatInvariant(r5, r2)
            r1.append(r2)
            android.text.Layout$Alignment r2 = r11.multiRowAlignment
            java.lang.String r5 = "</span>"
            if (r2 == 0) goto L242
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = convertAlignmentToCss(r2)
            r6[r4] = r0
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r0, r6)
            r1.append(r0)
            r0 = r25
            java.lang.String r0 = r0.html
            r1.append(r0)
            r1.append(r5)
            goto L249
        L242:
            r0 = r25
            java.lang.String r0 = r0.html
            r1.append(r0)
        L249:
            r1.append(r5)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r10 = r10 + 1
            r2 = 4
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r8 = 2
            r9 = 3
            r0 = r26
            r6 = 1
            goto L5d
        L25f:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "<html><head><style>"
            r0.append(r2)
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L276:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L29b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L276
        L29b:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r26
            android.webkit.WebView r2 = r0.webView
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = com.google.common.base.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
    }

    public void destroy() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            r0.destroy()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L10
            java.util.List<com.google.android.exoplayer2.text.Cue> r1 = r0.textCues
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L10
            r0.updateWebView()
        L10:
            return
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(java.util.List<com.google.android.exoplayer2.text.Cue> r7, com.google.android.exoplayer2.ui.CaptionStyleCompat r8, float r9, int r10, float r11) {
            r6 = this;
            r6.style = r8
            r6.defaultTextSize = r9
            r6.defaultTextSizeType = r10
            r6.bottomPaddingFraction = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L13:
            int r3 = r7.size()
            if (r2 >= r3) goto L2d
            java.lang.Object r3 = r7.get(r2)
            com.google.android.exoplayer2.text.Cue r3 = (com.google.android.exoplayer2.text.Cue) r3
            android.graphics.Bitmap r4 = r3.bitmap
            if (r4 == 0) goto L27
            r1.add(r3)
            goto L2a
        L27:
            r0.add(r3)
        L2a:
            int r2 = r2 + 1
            goto L13
        L2d:
            java.util.List<com.google.android.exoplayer2.text.Cue> r7 = r6.textCues
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3b
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L40
        L3b:
            r6.textCues = r0
            r6.updateWebView()
        L40:
            com.google.android.exoplayer2.ui.CanvasSubtitleOutput r0 = r6.canvasSubtitleOutput
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.update(r1, r2, r3, r4, r5)
            r6.invalidate()
            return
    }
}
