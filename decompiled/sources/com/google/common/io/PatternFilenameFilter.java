package com.google.common.io;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class PatternFilenameFilter implements java.io.FilenameFilter {
    private final java.util.regex.Pattern pattern;

    public PatternFilenameFilter(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.<init>(r1)
            return
    }

    public PatternFilenameFilter(java.util.regex.Pattern r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            r0.pattern = r1
            return
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r1 = r0.pattern
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            return r1
    }
}
