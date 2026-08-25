package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Receiver {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Extra {
        java.lang.String value() default "";
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum RegisterAt extends java.lang.Enum<org.androidannotations.annotations.Receiver.RegisterAt> {
        private static final /* synthetic */ org.androidannotations.annotations.Receiver.RegisterAt[] $VALUES = null;
        public static final org.androidannotations.annotations.Receiver.RegisterAt OnAttachOnDetach = null;
        public static final org.androidannotations.annotations.Receiver.RegisterAt OnCreateOnDestroy = null;
        public static final org.androidannotations.annotations.Receiver.RegisterAt OnResumeOnPause = null;
        public static final org.androidannotations.annotations.Receiver.RegisterAt OnStartOnStop = null;

        static {
                org.androidannotations.annotations.Receiver$RegisterAt r0 = new org.androidannotations.annotations.Receiver$RegisterAt
                java.lang.String r1 = "OnCreateOnDestroy"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.Receiver.RegisterAt.OnCreateOnDestroy = r0
                org.androidannotations.annotations.Receiver$RegisterAt r1 = new org.androidannotations.annotations.Receiver$RegisterAt
                java.lang.String r3 = "OnStartOnStop"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.Receiver.RegisterAt.OnStartOnStop = r1
                org.androidannotations.annotations.Receiver$RegisterAt r3 = new org.androidannotations.annotations.Receiver$RegisterAt
                java.lang.String r5 = "OnResumeOnPause"
                r6 = 2
                r3.<init>(r5, r6)
                org.androidannotations.annotations.Receiver.RegisterAt.OnResumeOnPause = r3
                org.androidannotations.annotations.Receiver$RegisterAt r5 = new org.androidannotations.annotations.Receiver$RegisterAt
                java.lang.String r7 = "OnAttachOnDetach"
                r8 = 3
                r5.<init>(r7, r8)
                org.androidannotations.annotations.Receiver.RegisterAt.OnAttachOnDetach = r5
                r7 = 4
                org.androidannotations.annotations.Receiver$RegisterAt[] r7 = new org.androidannotations.annotations.Receiver.RegisterAt[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.androidannotations.annotations.Receiver.RegisterAt.$VALUES = r7
                return
        }

        private RegisterAt(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.Receiver.RegisterAt valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.Receiver$RegisterAt> r0 = org.androidannotations.annotations.Receiver.RegisterAt.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.Receiver$RegisterAt r1 = (org.androidannotations.annotations.Receiver.RegisterAt) r1
                return r1
        }

        public static org.androidannotations.annotations.Receiver.RegisterAt[] values() {
                org.androidannotations.annotations.Receiver$RegisterAt[] r0 = org.androidannotations.annotations.Receiver.RegisterAt.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.Receiver$RegisterAt[] r0 = (org.androidannotations.annotations.Receiver.RegisterAt[]) r0
                return r0
        }
    }

    java.lang.String[] actions();

    java.lang.String[] dataSchemes() default {};

    boolean local() default false;

    org.androidannotations.annotations.Receiver.RegisterAt registerAt() default org.androidannotations.annotations.Receiver.RegisterAt.OnCreateOnDestroy;
}
