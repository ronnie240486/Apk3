package org.intellij.lang.annotations;

/* JADX INFO: compiled from: PrintFormat.java */
/* JADX INFO: loaded from: classes3.dex */
class PrintFormatPattern {

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String ARG_INDEX = "(?:\\d+\\$)?";

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String CONVERSION = "(?:[tT])?(?:[a-zA-Z%])";

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String FLAGS = "(?:[-#+ 0,(<]*)?";

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String PRECISION = "(?:\\.\\d+)?";

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String TEXT = "[^%]|%%";

    @org.intellij.lang.annotations.Language("RegExp")
    private static final java.lang.String WIDTH = "(?:\\d+)?";

    public PrintFormatPattern() {
            r0 = this;
            r0.<init>()
            return
    }
}
