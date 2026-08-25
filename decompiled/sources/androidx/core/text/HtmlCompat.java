package androidx.core.text;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"InlinedApi"})
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.text.Spanned fromHtml(java.lang.String r0, int r1) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.text.Spanned fromHtml(java.lang.String r0, int r1, android.text.Html.ImageGetter r2, android.text.Html.TagHandler r3) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r0, r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String toHtml(android.text.Spanned r0, int r1) {
                java.lang.String r0 = android.text.Html.toHtml(r0, r1)
                return r0
        }
    }

    private HtmlCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.text.Spanned fromHtml(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.text.Spanned r2 = androidx.core.text.HtmlCompat.Api24Impl.fromHtml(r2, r3)
            return r2
        Lb:
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static android.text.Spanned fromHtml(@androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.Nullable android.text.Html.ImageGetter r4, @androidx.annotation.Nullable android.text.Html.TagHandler r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.text.Spanned r2 = androidx.core.text.HtmlCompat.Api24Impl.fromHtml(r2, r3, r4, r5)
            return r2
        Lb:
            android.text.Spanned r2 = android.text.Html.fromHtml(r2, r4, r5)
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String toHtml(@androidx.annotation.NonNull android.text.Spanned r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.text.HtmlCompat.Api24Impl.toHtml(r2, r3)
            return r2
        Lb:
            java.lang.String r2 = android.text.Html.toHtml(r2)
            return r2
    }
}
