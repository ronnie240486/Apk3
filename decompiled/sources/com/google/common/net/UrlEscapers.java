package com.google.common.net;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class UrlEscapers {
    private static final com.google.common.escape.Escaper URL_FORM_PARAMETER_ESCAPER = null;
    private static final com.google.common.escape.Escaper URL_FRAGMENT_ESCAPER = null;
    private static final com.google.common.escape.Escaper URL_PATH_SEGMENT_ESCAPER = null;

    static {
            com.google.common.net.PercentEscaper r0 = new com.google.common.net.PercentEscaper
            java.lang.String r1 = "-_.*"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.common.net.UrlEscapers.URL_FORM_PARAMETER_ESCAPER = r0
            com.google.common.net.PercentEscaper r0 = new com.google.common.net.PercentEscaper
            java.lang.String r1 = "-._~!$'()*,;&=@:+"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.net.UrlEscapers.URL_PATH_SEGMENT_ESCAPER = r0
            com.google.common.net.PercentEscaper r0 = new com.google.common.net.PercentEscaper
            java.lang.String r1 = "-._~!$'()*,;&=@:+/?"
            r0.<init>(r1, r2)
            com.google.common.net.UrlEscapers.URL_FRAGMENT_ESCAPER = r0
            return
    }

    private UrlEscapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escaper urlFormParameterEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.net.UrlEscapers.URL_FORM_PARAMETER_ESCAPER
            return r0
    }

    public static com.google.common.escape.Escaper urlFragmentEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.net.UrlEscapers.URL_FRAGMENT_ESCAPER
            return r0
    }

    public static com.google.common.escape.Escaper urlPathSegmentEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.net.UrlEscapers.URL_PATH_SEGMENT_ESCAPER
            return r0
    }
}
