package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
final class Platform {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final java.util.logging.Logger logger = null;
    private static final com.google.common.base.PatternCompiler patternCompiler = null;

    /* JADX INFO: renamed from: com.google.common.base.Platform$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class JdkPatternCompiler implements com.google.common.base.PatternCompiler {
        private JdkPatternCompiler() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ JdkPatternCompiler(com.google.common.base.Platform.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.PatternCompiler
        public com.google.common.base.CommonPattern compile(java.lang.String r2) {
                r1 = this;
                com.google.common.base.JdkPattern r0 = new com.google.common.base.JdkPattern
                java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.base.Platform> r0 = com.google.common.base.Platform.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.base.Platform.logger = r0
            com.google.common.base.PatternCompiler r0 = loadPatternCompiler()
            com.google.common.base.Platform.patternCompiler = r0
            return
    }

    private Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.CommonPattern compilePattern(java.lang.String r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.PatternCompiler r0 = com.google.common.base.Platform.patternCompiler
            com.google.common.base.CommonPattern r1 = r0.compile(r1)
            return r1
    }

    private static com.google.common.base.PatternCompiler loadPatternCompiler() {
            com.google.common.base.Platform$JdkPatternCompiler r0 = new com.google.common.base.Platform$JdkPatternCompiler
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private static void logPatternCompilerError(java.util.ServiceConfigurationError r3) {
            java.util.logging.Logger r0 = com.google.common.base.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Error loading regex compiler, falling back to next option"
            r0.log(r1, r2, r3)
            return
    }

    public static boolean patternCompilerIsPcreLike() {
            com.google.common.base.PatternCompiler r0 = com.google.common.base.Platform.patternCompiler
            boolean r0 = r0.isPcreLike()
            return r0
    }
}
