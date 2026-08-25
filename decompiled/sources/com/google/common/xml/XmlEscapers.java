package com.google.common.xml;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.xml.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final com.google.common.escape.Escaper XML_ATTRIBUTE_ESCAPER = null;
    private static final com.google.common.escape.Escaper XML_CONTENT_ESCAPER = null;
    private static final com.google.common.escape.Escaper XML_ESCAPER = null;

    static {
            com.google.common.escape.Escapers$Builder r0 = com.google.common.escape.Escapers.builder()
            r1 = 0
            r2 = 65533(0xfffd, float:9.1831E-41)
            r0.setSafeRange(r1, r2)
            java.lang.String r2 = "�"
            r0.setUnsafeReplacement(r2)
        L11:
            r3 = 31
            r4 = 13
            r5 = 10
            r6 = 9
            if (r1 > r3) goto L28
            if (r1 == r6) goto L24
            if (r1 == r5) goto L24
            if (r1 == r4) goto L24
            r0.addEscape(r1, r2)
        L24:
            int r1 = r1 + 1
            char r1 = (char) r1
            goto L11
        L28:
            r1 = 38
            java.lang.String r2 = "&amp;"
            r0.addEscape(r1, r2)
            r1 = 60
            java.lang.String r2 = "&lt;"
            r0.addEscape(r1, r2)
            r1 = 62
            java.lang.String r2 = "&gt;"
            r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r1 = r0.build()
            com.google.common.xml.XmlEscapers.XML_CONTENT_ESCAPER = r1
            r1 = 39
            java.lang.String r2 = "&apos;"
            r0.addEscape(r1, r2)
            r1 = 34
            java.lang.String r2 = "&quot;"
            r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r1 = r0.build()
            com.google.common.xml.XmlEscapers.XML_ESCAPER = r1
            java.lang.String r1 = "&#x9;"
            r0.addEscape(r6, r1)
            java.lang.String r1 = "&#xA;"
            r0.addEscape(r5, r1)
            java.lang.String r1 = "&#xD;"
            r0.addEscape(r4, r1)
            com.google.common.escape.Escaper r0 = r0.build()
            com.google.common.xml.XmlEscapers.XML_ATTRIBUTE_ESCAPER = r0
            return
    }

    private XmlEscapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escaper xmlAttributeEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.xml.XmlEscapers.XML_ATTRIBUTE_ESCAPER
            return r0
    }

    public static com.google.common.escape.Escaper xmlContentEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.xml.XmlEscapers.XML_CONTENT_ESCAPER
            return r0
    }
}
