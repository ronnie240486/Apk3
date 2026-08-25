package androidx.core.text.util;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkifyCompat {
    private static final java.util.Comparator<androidx.core.text.util.LinkifyCompat.LinkSpec> COMPARATOR = null;
    private static final java.lang.String[] EMPTY_STRING = null;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void addLinks(android.widget.TextView r0, java.util.regex.Pattern r1, java.lang.String r2, java.lang.String[] r3, android.text.util.Linkify.MatchFilter r4, android.text.util.Linkify.TransformFilter r5) {
                android.text.util.Linkify.addLinks(r0, r1, r2, r3, r4, r5)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean addLinks(android.text.Spannable r0, java.util.regex.Pattern r1, java.lang.String r2, java.lang.String[] r3, android.text.util.Linkify.MatchFilter r4, android.text.util.Linkify.TransformFilter r5) {
                boolean r0 = android.text.util.Linkify.addLinks(r0, r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LinkSpec {
        public int end;
        public android.text.style.URLSpan frameworkAddedSpan;
        public int start;
        public java.lang.String url;

        public LinkSpec() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface LinkifyMask {
    }

    /* JADX INFO: renamed from: $r8$lambda$ZKIVp-YQfVVlE_POSX3ZpOQbt6w, reason: not valid java name */
    public static /* synthetic */ int m35$r8$lambda$ZKIVpYQfVVlE_POSX3ZpOQbt6w(androidx.core.text.util.LinkifyCompat.LinkSpec r0, androidx.core.text.util.LinkifyCompat.LinkSpec r1) {
            int r0 = lambda$static$0(r0, r1)
            return r0
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.text.util.LinkifyCompat.EMPTY_STRING = r0
            androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0 r0 = androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0.INSTANCE
            androidx.core.text.util.LinkifyCompat.COMPARATOR = r0
            return
    }

    private LinkifyCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addLinkMovementMethod(@androidx.annotation.NonNull android.widget.TextView r1) {
            android.text.method.MovementMethod r0 = r1.getMovementMethod()
            boolean r0 = r0 instanceof android.text.method.LinkMovementMethod
            if (r0 != 0) goto L15
            boolean r0 = r1.getLinksClickable()
            if (r0 == 0) goto L15
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
        L15:
            return
    }

    public static void addLinks(@androidx.annotation.NonNull android.widget.TextView r7, @androidx.annotation.NonNull java.util.regex.Pattern r8, @androidx.annotation.Nullable java.lang.String r9) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9)
            return
        La:
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(@androidx.annotation.NonNull android.widget.TextView r7, @androidx.annotation.NonNull java.util.regex.Pattern r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable android.text.util.Linkify.MatchFilter r10, @androidx.annotation.Nullable android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11)
            return
        La:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(@androidx.annotation.NonNull android.widget.TextView r7, @androidx.annotation.NonNull java.util.regex.Pattern r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String[] r10, @androidx.annotation.Nullable android.text.util.Linkify.MatchFilter r11, @androidx.annotation.Nullable android.text.util.Linkify.TransformFilter r12) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(r7, r8, r9, r10, r11, r12)
            return
        La:
            java.lang.CharSequence r0 = r7.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r8 = addLinks(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L24
            r7.setText(r0)
            addLinkMovementMethod(r7)
        L24:
            return
    }

    public static boolean addLinks(@androidx.annotation.NonNull android.text.Spannable r10, int r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r10 = android.text.util.Linkify.addLinks(r10, r11)
            return r10
        Lb:
            r0 = 0
            if (r11 != 0) goto Lf
            return r0
        Lf:
            int r1 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r10.getSpans(r0, r1, r2)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
        L1e:
            if (r2 < 0) goto L28
            r4 = r1[r2]
            r10.removeSpan(r4)
            int r2 = r2 + (-1)
            goto L1e
        L28:
            r1 = r11 & 4
            if (r1 == 0) goto L30
            r1 = 4
            android.text.util.Linkify.addLinks(r10, r1)
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r11 & 1
            if (r2 == 0) goto L4e
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_WEB_URL
            java.lang.String r2 = "http://"
            java.lang.String r4 = "https://"
            java.lang.String r5 = "rtsp://"
            java.lang.String[] r7 = new java.lang.String[]{r2, r4, r5}
            android.text.util.Linkify$MatchFilter r8 = android.text.util.Linkify.sUrlMatchFilter
            r9 = 0
            r4 = r1
            r5 = r10
            gatherLinks(r4, r5, r6, r7, r8, r9)
        L4e:
            r2 = r11 & 2
            if (r2 == 0) goto L61
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_EMAIL_ADDRESS
            java.lang.String r2 = "mailto:"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r10
            gatherLinks(r4, r5, r6, r7, r8, r9)
        L61:
            r11 = r11 & 8
            if (r11 == 0) goto L68
            gatherMapLinks(r1, r10)
        L68:
            pruneOverlaps(r1, r10)
            int r11 = r1.size()
            if (r11 != 0) goto L72
            return r0
        L72:
            java.util.Iterator r11 = r1.iterator()
        L76:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r11.next()
            androidx.core.text.util.LinkifyCompat$LinkSpec r0 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r0
            android.text.style.URLSpan r1 = r0.frameworkAddedSpan
            if (r1 != 0) goto L76
            java.lang.String r1 = r0.url
            int r2 = r0.start
            int r0 = r0.end
            applyLink(r1, r2, r0, r10)
            goto L76
        L90:
            return r3
    }

    public static boolean addLinks(@androidx.annotation.NonNull android.text.Spannable r6, @androidx.annotation.NonNull java.util.regex.Pattern r7, @androidx.annotation.Nullable java.lang.String r8) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8)
            return r6
        Lb:
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            boolean r6 = addLinks(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean addLinks(@androidx.annotation.NonNull android.text.Spannable r6, @androidx.annotation.NonNull java.util.regex.Pattern r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable android.text.util.Linkify.MatchFilter r9, @androidx.annotation.Nullable android.text.util.Linkify.TransformFilter r10) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8, r9, r10)
            return r6
        Lb:
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = addLinks(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean addLinks(@androidx.annotation.NonNull android.text.Spannable r6, @androidx.annotation.NonNull java.util.regex.Pattern r7, @androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable android.text.util.Linkify.MatchFilter r10, @androidx.annotation.Nullable android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(r6, r7, r8, r9, r10, r11)
            return r6
        Lb:
            java.lang.String r0 = ""
            if (r8 != 0) goto L10
            r8 = r0
        L10:
            r1 = 1
            if (r9 == 0) goto L16
            int r2 = r9.length
            if (r2 >= r1) goto L18
        L16:
            java.lang.String[] r9 = androidx.core.text.util.LinkifyCompat.EMPTY_STRING
        L18:
            int r2 = r9.length
            int r2 = r2 + r1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r3)
            r3 = 0
            r2[r3] = r8
            r8 = 0
        L26:
            int r4 = r9.length
            if (r8 >= r4) goto L3a
            r4 = r9[r8]
            int r8 = r8 + 1
            if (r4 != 0) goto L31
            r4 = r0
            goto L37
        L31:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
        L37:
            r2[r8] = r4
            goto L26
        L3a:
            java.util.regex.Matcher r7 = r7.matcher(r6)
            r8 = 0
        L3f:
            boolean r9 = r7.find()
            if (r9 == 0) goto L66
            int r9 = r7.start()
            int r0 = r7.end()
            java.lang.String r4 = r7.group(r3)
            if (r10 == 0) goto L58
            boolean r5 = r10.acceptMatch(r6, r9, r0)
            goto L59
        L58:
            r5 = 1
        L59:
            if (r5 == 0) goto L3f
            if (r4 == 0) goto L3f
            java.lang.String r8 = makeUrl(r4, r2, r7, r11)
            applyLink(r8, r9, r0, r6)
            r8 = 1
            goto L3f
        L66:
            return r8
    }

    public static boolean addLinks(@androidx.annotation.NonNull android.widget.TextView r4, int r5) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r4 = android.text.util.Linkify.addLinks(r4, r5)
            return r4
        Lb:
            r0 = 0
            if (r5 != 0) goto Lf
            return r0
        Lf:
            java.lang.CharSequence r1 = r4.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 1
            if (r2 == 0) goto L24
            android.text.Spannable r1 = (android.text.Spannable) r1
            boolean r5 = addLinks(r1, r5)
            if (r5 == 0) goto L35
            addLinkMovementMethod(r4)
            return r3
        L24:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            boolean r5 = addLinks(r1, r5)
            if (r5 == 0) goto L35
            addLinkMovementMethod(r4)
            r4.setText(r1)
            return r3
        L35:
            return r0
    }

    private static void applyLink(java.lang.String r1, int r2, int r3, android.text.Spannable r4) {
            android.text.style.URLSpan r0 = new android.text.style.URLSpan
            r0.<init>(r1)
            r1 = 33
            r4.setSpan(r0, r2, r3, r1)
            return
    }

    private static java.lang.String findAddress(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = android.webkit.WebView.findAddress(r2)
            return r2
        Lb:
            java.lang.String r2 = androidx.core.text.util.FindAddress.findAddress(r2)
            return r2
    }

    private static void gatherLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r4, android.text.Spannable r5, java.util.regex.Pattern r6, java.lang.String[] r7, android.text.util.Linkify.MatchFilter r8, android.text.util.Linkify.TransformFilter r9) {
            java.util.regex.Matcher r6 = r6.matcher(r5)
        L4:
            boolean r0 = r6.find()
            if (r0 == 0) goto L34
            int r0 = r6.start()
            int r1 = r6.end()
            r2 = 0
            java.lang.String r2 = r6.group(r2)
            if (r8 == 0) goto L1f
            boolean r3 = r8.acceptMatch(r5, r0, r1)
            if (r3 == 0) goto L4
        L1f:
            if (r2 == 0) goto L4
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r3.<init>()
            java.lang.String r2 = makeUrl(r2, r7, r6, r9)
            r3.url = r2
            r3.start = r0
            r3.end = r1
            r4.add(r3)
            goto L4
        L34:
            return
    }

    private static void gatherMapLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r5, android.text.Spannable r6) {
            java.lang.String r6 = r6.toString()
            r0 = 0
        L5:
            java.lang.String r1 = findAddress(r6)     // Catch: java.lang.UnsupportedOperationException -> L43
            if (r1 == 0) goto L43
            int r2 = r6.indexOf(r1)     // Catch: java.lang.UnsupportedOperationException -> L43
            if (r2 >= 0) goto L12
            goto L43
        L12:
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = new androidx.core.text.util.LinkifyCompat$LinkSpec     // Catch: java.lang.UnsupportedOperationException -> L43
            r3.<init>()     // Catch: java.lang.UnsupportedOperationException -> L43
            int r4 = r1.length()     // Catch: java.lang.UnsupportedOperationException -> L43
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.start = r2     // Catch: java.lang.UnsupportedOperationException -> L43
            int r0 = r0 + r4
            r3.end = r0     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r6 = r6.substring(r4)     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L5 java.lang.UnsupportedOperationException -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L43
            r2.<init>()     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch: java.lang.UnsupportedOperationException -> L43
            r2.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r1 = r2.toString()     // Catch: java.lang.UnsupportedOperationException -> L43
            r3.url = r1     // Catch: java.lang.UnsupportedOperationException -> L43
            r5.add(r3)     // Catch: java.lang.UnsupportedOperationException -> L43
            goto L5
        L43:
            return
    }

    private static /* synthetic */ int lambda$static$0(androidx.core.text.util.LinkifyCompat.LinkSpec r2, androidx.core.text.util.LinkifyCompat.LinkSpec r3) {
            int r0 = r2.start
            int r1 = r3.start
            if (r0 >= r1) goto L8
            r2 = -1
            return r2
        L8:
            if (r0 <= r1) goto Lc
            r2 = 1
            return r2
        Lc:
            int r3 = r3.end
            int r2 = r2.end
            int r2 = java.lang.Integer.compare(r3, r2)
            return r2
    }

    private static java.lang.String makeUrl(@androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull java.lang.String[] r10, java.util.regex.Matcher r11, @androidx.annotation.Nullable android.text.util.Linkify.TransformFilter r12) {
            if (r12 == 0) goto L6
            java.lang.String r9 = r12.transformUrl(r11, r9)
        L6:
            int r11 = r10.length
            r12 = 0
            r0 = 0
            r6 = 0
        La:
            r7 = 1
            if (r6 >= r11) goto L44
            r8 = r10[r6]
            r1 = 1
            r2 = 0
            r4 = 0
            int r5 = r8.length()
            r0 = r9
            r3 = r8
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L41
            r1 = 0
            r2 = 0
            r4 = 0
            int r5 = r8.length()
            r0 = r9
            r3 = r8
            boolean r11 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r11 != 0) goto L45
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            int r0 = r8.length()
            java.lang.String r9 = r9.substring(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            goto L45
        L41:
            int r6 = r6 + 1
            goto La
        L44:
            r7 = 0
        L45:
            if (r7 != 0) goto L55
            int r11 = r10.length
            if (r11 <= 0) goto L55
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r10 = r10[r12]
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r10, r9)
        L55:
            return r9
    }

    private static void pruneOverlaps(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r10, android.text.Spannable r11) {
            int r0 = r11.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r11.getSpans(r2, r0, r1)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            int r1 = r0.length
            r3 = 0
        Lf:
            if (r3 >= r1) goto L2c
            r4 = r0[r3]
            androidx.core.text.util.LinkifyCompat$LinkSpec r5 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r5.<init>()
            r5.frameworkAddedSpan = r4
            int r6 = r11.getSpanStart(r4)
            r5.start = r6
            int r4 = r11.getSpanEnd(r4)
            r5.end = r4
            r10.add(r5)
            int r3 = r3 + 1
            goto Lf
        L2c:
            java.util.Comparator<androidx.core.text.util.LinkifyCompat$LinkSpec> r0 = androidx.core.text.util.LinkifyCompat.COMPARATOR
            java.util.Collections.sort(r10, r0)
            int r0 = r10.size()
        L35:
            int r1 = r0 + (-1)
            if (r2 >= r1) goto L7d
            java.lang.Object r1 = r10.get(r2)
            androidx.core.text.util.LinkifyCompat$LinkSpec r1 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r1
            int r3 = r2 + 1
            java.lang.Object r4 = r10.get(r3)
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r4
            int r5 = r1.start
            int r6 = r4.start
            if (r5 > r6) goto L7b
            int r1 = r1.end
            if (r1 <= r6) goto L7b
            int r4 = r4.end
            r7 = -1
            if (r4 > r1) goto L58
        L56:
            r1 = r3
            goto L66
        L58:
            int r8 = r1 - r5
            int r9 = r4 - r6
            if (r8 <= r9) goto L5f
            goto L56
        L5f:
            int r1 = r1 - r5
            int r4 = r4 - r6
            if (r1 >= r4) goto L65
            r1 = r2
            goto L66
        L65:
            r1 = -1
        L66:
            if (r1 == r7) goto L7b
            java.lang.Object r3 = r10.get(r1)
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r3
            android.text.style.URLSpan r3 = r3.frameworkAddedSpan
            if (r3 == 0) goto L75
            r11.removeSpan(r3)
        L75:
            r10.remove(r1)
            int r0 = r0 + (-1)
            goto L35
        L7b:
            r2 = r3
            goto L35
        L7d:
            return
    }

    private static boolean shouldAddLinksFallbackToFramework() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
