package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
final class JdkPattern extends com.google.common.base.CommonPattern implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.regex.Pattern pattern;

    /* JADX INFO: loaded from: classes.dex */
    public static final class JdkMatcher extends com.google.common.base.CommonMatcher {
        public final java.util.regex.Matcher matcher;

        public JdkMatcher(java.util.regex.Matcher r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.regex.Matcher r1 = (java.util.regex.Matcher) r1
                r0.matcher = r1
                return
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                int r0 = r0.end()
                return r0
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                boolean r0 = r0.find()
                return r0
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int r2) {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                boolean r2 = r0.find(r2)
                return r2
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                boolean r0 = r0.matches()
                return r0
        }

        @Override // com.google.common.base.CommonMatcher
        public java.lang.String replaceAll(java.lang.String r2) {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                java.lang.String r2 = r0.replaceAll(r2)
                return r2
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
                r1 = this;
                java.util.regex.Matcher r0 = r1.matcher
                int r0 = r0.start()
                return r0
        }
    }

    public JdkPattern(java.util.regex.Pattern r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            r0.pattern = r1
            return
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.pattern
            int r0 = r0.flags()
            return r0
    }

    @Override // com.google.common.base.CommonPattern
    public com.google.common.base.CommonMatcher matcher(java.lang.CharSequence r3) {
            r2 = this;
            com.google.common.base.JdkPattern$JdkMatcher r0 = new com.google.common.base.JdkPattern$JdkMatcher
            java.util.regex.Pattern r1 = r2.pattern
            java.util.regex.Matcher r3 = r1.matcher(r3)
            r0.<init>(r3)
            return r0
    }

    @Override // com.google.common.base.CommonPattern
    public java.lang.String pattern() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.pattern
            java.lang.String r0 = r0.pattern()
            return r0
    }

    @Override // com.google.common.base.CommonPattern
    public java.lang.String toString() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.pattern
            java.lang.String r0 = r0.toString()
            return r0
    }
}
