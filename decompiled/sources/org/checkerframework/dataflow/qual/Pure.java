package org.checkerframework.dataflow.qual;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Pure {

    public static final enum Kind extends java.lang.Enum<org.checkerframework.dataflow.qual.Pure.Kind> {
        private static final /* synthetic */ org.checkerframework.dataflow.qual.Pure.Kind[] $VALUES = null;
        public static final org.checkerframework.dataflow.qual.Pure.Kind DETERMINISTIC = null;
        public static final org.checkerframework.dataflow.qual.Pure.Kind SIDE_EFFECT_FREE = null;

        static {
                org.checkerframework.dataflow.qual.Pure$Kind r0 = new org.checkerframework.dataflow.qual.Pure$Kind
                java.lang.String r1 = "SIDE_EFFECT_FREE"
                r2 = 0
                r0.<init>(r1, r2)
                org.checkerframework.dataflow.qual.Pure.Kind.SIDE_EFFECT_FREE = r0
                org.checkerframework.dataflow.qual.Pure$Kind r1 = new org.checkerframework.dataflow.qual.Pure$Kind
                java.lang.String r3 = "DETERMINISTIC"
                r4 = 1
                r1.<init>(r3, r4)
                org.checkerframework.dataflow.qual.Pure.Kind.DETERMINISTIC = r1
                r3 = 2
                org.checkerframework.dataflow.qual.Pure$Kind[] r3 = new org.checkerframework.dataflow.qual.Pure.Kind[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.checkerframework.dataflow.qual.Pure.Kind.$VALUES = r3
                return
        }

        private Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.checkerframework.dataflow.qual.Pure.Kind valueOf(java.lang.String r1) {
                java.lang.Class<org.checkerframework.dataflow.qual.Pure$Kind> r0 = org.checkerframework.dataflow.qual.Pure.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.checkerframework.dataflow.qual.Pure$Kind r1 = (org.checkerframework.dataflow.qual.Pure.Kind) r1
                return r1
        }

        public static org.checkerframework.dataflow.qual.Pure.Kind[] values() {
                org.checkerframework.dataflow.qual.Pure$Kind[] r0 = org.checkerframework.dataflow.qual.Pure.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                org.checkerframework.dataflow.qual.Pure$Kind[] r0 = (org.checkerframework.dataflow.qual.Pure.Kind[]) r0
                return r0
        }
    }
}
