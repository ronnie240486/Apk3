package com.google.common.escape;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class Escapers {
    private static final com.google.common.escape.Escaper NULL_ESCAPER = null;



    @com.google.common.annotations.Beta
    public static final class Builder {
        private final java.util.Map<java.lang.Character, java.lang.String> replacementMap;
        private char safeMax;
        private char safeMin;

        @javax.annotation.CheckForNull
        private java.lang.String unsafeReplacement;


        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.replacementMap = r0
                r0 = 0
                r1.safeMin = r0
                r0 = 65535(0xffff, float:9.1834E-41)
                r1.safeMax = r0
                r0 = 0
                r1.unsafeReplacement = r0
                return
        }

        public /* synthetic */ Builder(com.google.common.escape.Escapers.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.lang.String access$100(com.google.common.escape.Escapers.Builder r0) {
                java.lang.String r0 = r0.unsafeReplacement
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder addEscape(char r2, java.lang.String r3) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.Map<java.lang.Character, java.lang.String> r0 = r1.replacementMap
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                r0.put(r2, r3)
                return r1
        }

        public com.google.common.escape.Escaper build() {
                r4 = this;
                com.google.common.escape.Escapers$Builder$1 r0 = new com.google.common.escape.Escapers$Builder$1
                java.util.Map<java.lang.Character, java.lang.String> r1 = r4.replacementMap
                char r2 = r4.safeMin
                char r3 = r4.safeMax
                r0.<init>(r4, r1, r2, r3)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder setSafeRange(char r1, char r2) {
                r0 = this;
                r0.safeMin = r1
                r0.safeMax = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.escape.Escapers.Builder setUnsafeReplacement(java.lang.String r1) {
                r0 = this;
                r0.unsafeReplacement = r1
                return r0
        }
    }

    static {
            com.google.common.escape.Escapers$1 r0 = new com.google.common.escape.Escapers$1
            r0.<init>()
            com.google.common.escape.Escapers.NULL_ESCAPER = r0
            return
    }

    private Escapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escapers.Builder builder() {
            com.google.common.escape.Escapers$Builder r0 = new com.google.common.escape.Escapers$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @javax.annotation.CheckForNull
    public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper r0, char r1) {
            char[] r0 = r0.escape(r1)
            java.lang.String r0 = stringOrNull(r0)
            return r0
    }

    @javax.annotation.CheckForNull
    public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper r0, int r1) {
            char[] r0 = r0.escape(r1)
            java.lang.String r0 = stringOrNull(r0)
            return r0
    }

    public static com.google.common.escape.Escaper nullEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.escape.Escapers.NULL_ESCAPER
            return r0
    }

    @javax.annotation.CheckForNull
    private static java.lang.String stringOrNull(@javax.annotation.CheckForNull char[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    private static com.google.common.escape.UnicodeEscaper wrap(com.google.common.escape.CharEscaper r1) {
            com.google.common.escape.Escapers$2 r0 = new com.google.common.escape.Escapers$2
            r0.<init>(r1)
            return r0
    }
}
