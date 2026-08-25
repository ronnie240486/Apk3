package javax.annotation;

/* JADX INFO: loaded from: classes2.dex */
@javax.annotation.Syntax("RegEx")
@javax.annotation.meta.TypeQualifierNickname
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RegEx {

    /* JADX INFO: loaded from: classes.dex */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.RegEx> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.RegEx r1 = (javax.annotation.RegEx) r1
                javax.annotation.meta.When r1 = r0.forConstantValue(r1, r2)
                return r1
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.RegEx r1, java.lang.Object r2) {
                r0 = this;
                boolean r1 = r2 instanceof java.lang.String
                if (r1 != 0) goto L7
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
            L7:
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.regex.PatternSyntaxException -> Lf
                java.util.regex.Pattern.compile(r2)     // Catch: java.util.regex.PatternSyntaxException -> Lf
                javax.annotation.meta.When r1 = javax.annotation.meta.When.ALWAYS
                return r1
            Lf:
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
