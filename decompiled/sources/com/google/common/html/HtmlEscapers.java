package com.google.common.html;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.html.ElementTypesAreNonnullByDefault
public final class HtmlEscapers {
    private static final com.google.common.escape.Escaper HTML_ESCAPER = null;

    static {
            com.google.common.escape.Escapers$Builder r0 = com.google.common.escape.Escapers.builder()
            r1 = 34
            java.lang.String r2 = "&quot;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 39
            java.lang.String r2 = "&#39;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 38
            java.lang.String r2 = "&amp;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 60
            java.lang.String r2 = "&lt;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            r1 = 62
            java.lang.String r2 = "&gt;"
            com.google.common.escape.Escapers$Builder r0 = r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r0 = r0.build()
            com.google.common.html.HtmlEscapers.HTML_ESCAPER = r0
            return
    }

    private HtmlEscapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escaper htmlEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.html.HtmlEscapers.HTML_ESCAPER
            return r0
    }
}
