package com.google.j2objc.annotations;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.LOCAL_VARIABLE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface LoopTranslation {

    public static final enum LoopStyle extends java.lang.Enum<com.google.j2objc.annotations.LoopTranslation.LoopStyle> {
        private static final /* synthetic */ com.google.j2objc.annotations.LoopTranslation.LoopStyle[] $VALUES = null;
        public static final com.google.j2objc.annotations.LoopTranslation.LoopStyle FAST_ENUMERATION = null;
        public static final com.google.j2objc.annotations.LoopTranslation.LoopStyle JAVA_ITERATOR = null;

        static {
                com.google.j2objc.annotations.LoopTranslation$LoopStyle r0 = new com.google.j2objc.annotations.LoopTranslation$LoopStyle
                java.lang.String r1 = "JAVA_ITERATOR"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.j2objc.annotations.LoopTranslation.LoopStyle.JAVA_ITERATOR = r0
                com.google.j2objc.annotations.LoopTranslation$LoopStyle r1 = new com.google.j2objc.annotations.LoopTranslation$LoopStyle
                java.lang.String r3 = "FAST_ENUMERATION"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.j2objc.annotations.LoopTranslation.LoopStyle.FAST_ENUMERATION = r1
                r3 = 2
                com.google.j2objc.annotations.LoopTranslation$LoopStyle[] r3 = new com.google.j2objc.annotations.LoopTranslation.LoopStyle[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.j2objc.annotations.LoopTranslation.LoopStyle.$VALUES = r3
                return
        }

        private LoopStyle(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.j2objc.annotations.LoopTranslation.LoopStyle valueOf(java.lang.String r1) {
                java.lang.Class<com.google.j2objc.annotations.LoopTranslation$LoopStyle> r0 = com.google.j2objc.annotations.LoopTranslation.LoopStyle.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.j2objc.annotations.LoopTranslation$LoopStyle r1 = (com.google.j2objc.annotations.LoopTranslation.LoopStyle) r1
                return r1
        }

        public static com.google.j2objc.annotations.LoopTranslation.LoopStyle[] values() {
                com.google.j2objc.annotations.LoopTranslation$LoopStyle[] r0 = com.google.j2objc.annotations.LoopTranslation.LoopStyle.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.j2objc.annotations.LoopTranslation$LoopStyle[] r0 = (com.google.j2objc.annotations.LoopTranslation.LoopStyle[]) r0
                return r0
        }
    }

    com.google.j2objc.annotations.LoopTranslation.LoopStyle value();
}
