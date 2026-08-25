package javax.annotation;

/* JADX INFO: loaded from: classes2.dex */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.String.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MatchesPattern {

    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.MatchesPattern> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.MatchesPattern r1 = (javax.annotation.MatchesPattern) r1
                javax.annotation.meta.When r1 = r0.forConstantValue(r1, r2)
                return r1
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.MatchesPattern r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = r2.value()
                int r2 = r2.flags()
                java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0, r2)
                java.lang.String r3 = (java.lang.String) r3
                java.util.regex.Matcher r2 = r2.matcher(r3)
                boolean r2 = r2.matches()
                if (r2 == 0) goto L1b
                javax.annotation.meta.When r2 = javax.annotation.meta.When.ALWAYS
                return r2
            L1b:
                javax.annotation.meta.When r2 = javax.annotation.meta.When.NEVER
                return r2
        }
    }

    int flags() default 0;

    @javax.annotation.RegEx
    java.lang.String value();
}
