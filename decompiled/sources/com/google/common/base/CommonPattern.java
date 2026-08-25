package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
abstract class CommonPattern {
    public CommonPattern() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.CommonPattern compile(java.lang.String r0) {
            com.google.common.base.CommonPattern r0 = com.google.common.base.Platform.compilePattern(r0)
            return r0
    }

    public static boolean isPcreLike() {
            boolean r0 = com.google.common.base.Platform.patternCompilerIsPcreLike()
            return r0
    }

    public abstract int flags();

    public abstract com.google.common.base.CommonMatcher matcher(java.lang.CharSequence r1);

    public abstract java.lang.String pattern();

    public abstract java.lang.String toString();
}
