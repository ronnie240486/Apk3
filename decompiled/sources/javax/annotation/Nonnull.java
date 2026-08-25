package javax.annotation;

/* JADX INFO: loaded from: classes.dex */
@javax.annotation.meta.TypeQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Nonnull {

    /* JADX INFO: loaded from: classes2.dex */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnull> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.Nonnull r1 = (javax.annotation.Nonnull) r1
                javax.annotation.meta.When r1 = r0.forConstantValue(r1, r2)
                return r1
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnull r1, java.lang.Object r2) {
                r0 = this;
                if (r2 != 0) goto L5
                javax.annotation.meta.When r1 = javax.annotation.meta.When.NEVER
                return r1
            L5:
                javax.annotation.meta.When r1 = javax.annotation.meta.When.ALWAYS
                return r1
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
