package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Charsets {
    public static final java.nio.charset.Charset ISO_8859_1 = null;

    @com.google.common.annotations.GwtIncompatible
    public static final java.nio.charset.Charset US_ASCII = null;

    @com.google.common.annotations.GwtIncompatible
    public static final java.nio.charset.Charset UTF_16 = null;

    @com.google.common.annotations.GwtIncompatible
    public static final java.nio.charset.Charset UTF_16BE = null;

    @com.google.common.annotations.GwtIncompatible
    public static final java.nio.charset.Charset UTF_16LE = null;
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.US_ASCII = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.ISO_8859_1 = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.UTF_8 = r0
            java.lang.String r0 = "UTF-16BE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.UTF_16BE = r0
            java.lang.String r0 = "UTF-16LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.UTF_16LE = r0
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.common.base.Charsets.UTF_16 = r0
            return
    }

    private Charsets() {
            r0 = this;
            r0.<init>()
            return
    }
}
