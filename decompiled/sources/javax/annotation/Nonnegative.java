package javax.annotation;

/* JADX INFO: loaded from: classes2.dex */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.Number.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Nonnegative {

    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnegative> {
        public Checker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.annotation.meta.TypeQualifierValidator
        public /* bridge */ /* synthetic */ javax.annotation.meta.When forConstantValue(java.lang.annotation.Annotation r1, java.lang.Object r2) {
                r0 = this;
                javax.annotation.Nonnegative r1 = (javax.annotation.Nonnegative) r1
                javax.annotation.meta.When r1 = r0.forConstantValue(r1, r2)
                return r1
        }

        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnegative r6, java.lang.Object r7) {
                r5 = this;
                boolean r6 = r7 instanceof java.lang.Number
                if (r6 != 0) goto L7
                javax.annotation.meta.When r6 = javax.annotation.meta.When.NEVER
                return r6
            L7:
                java.lang.Number r7 = (java.lang.Number) r7
                boolean r6 = r7 instanceof java.lang.Long
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L1c
                long r6 = r7.longValue()
                r2 = 0
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 >= 0) goto L1a
                goto L3f
            L1a:
                r0 = 0
                goto L3f
            L1c:
                boolean r6 = r7 instanceof java.lang.Double
                if (r6 == 0) goto L2b
                double r6 = r7.doubleValue()
                r2 = 0
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 >= 0) goto L1a
                goto L3f
            L2b:
                boolean r6 = r7 instanceof java.lang.Float
                if (r6 == 0) goto L39
                float r6 = r7.floatValue()
                r7 = 0
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 >= 0) goto L1a
                goto L3f
            L39:
                int r6 = r7.intValue()
                if (r6 >= 0) goto L1a
            L3f:
                if (r0 == 0) goto L44
                javax.annotation.meta.When r6 = javax.annotation.meta.When.NEVER
                return r6
            L44:
                javax.annotation.meta.When r6 = javax.annotation.meta.When.ALWAYS
                return r6
        }
    }

    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;
}
