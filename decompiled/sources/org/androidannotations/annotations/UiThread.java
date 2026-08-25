package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface UiThread {

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Propagation extends java.lang.Enum<org.androidannotations.annotations.UiThread.Propagation> {
        private static final /* synthetic */ org.androidannotations.annotations.UiThread.Propagation[] $VALUES = null;
        public static final org.androidannotations.annotations.UiThread.Propagation ENQUEUE = null;
        public static final org.androidannotations.annotations.UiThread.Propagation REUSE = null;

        static {
                org.androidannotations.annotations.UiThread$Propagation r0 = new org.androidannotations.annotations.UiThread$Propagation
                java.lang.String r1 = "ENQUEUE"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.UiThread.Propagation.ENQUEUE = r0
                org.androidannotations.annotations.UiThread$Propagation r1 = new org.androidannotations.annotations.UiThread$Propagation
                java.lang.String r3 = "REUSE"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.UiThread.Propagation.REUSE = r1
                r3 = 2
                org.androidannotations.annotations.UiThread$Propagation[] r3 = new org.androidannotations.annotations.UiThread.Propagation[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.androidannotations.annotations.UiThread.Propagation.$VALUES = r3
                return
        }

        private Propagation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.UiThread.Propagation valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.UiThread$Propagation> r0 = org.androidannotations.annotations.UiThread.Propagation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.UiThread$Propagation r1 = (org.androidannotations.annotations.UiThread.Propagation) r1
                return r1
        }

        public static org.androidannotations.annotations.UiThread.Propagation[] values() {
                org.androidannotations.annotations.UiThread$Propagation[] r0 = org.androidannotations.annotations.UiThread.Propagation.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.UiThread$Propagation[] r0 = (org.androidannotations.annotations.UiThread.Propagation[]) r0
                return r0
        }
    }

    long delay() default 0;

    org.androidannotations.annotations.UiThread.Propagation propagation() default org.androidannotations.annotations.UiThread.Propagation.ENQUEUE;
}
