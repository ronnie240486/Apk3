package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface EBean {

    public static final enum Scope extends java.lang.Enum<org.androidannotations.annotations.EBean.Scope> {
        private static final /* synthetic */ org.androidannotations.annotations.EBean.Scope[] $VALUES = null;
        public static final org.androidannotations.annotations.EBean.Scope Default = null;
        public static final org.androidannotations.annotations.EBean.Scope Singleton = null;

        static {
                org.androidannotations.annotations.EBean$Scope r0 = new org.androidannotations.annotations.EBean$Scope
                java.lang.String r1 = "Default"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.EBean.Scope.Default = r0
                org.androidannotations.annotations.EBean$Scope r1 = new org.androidannotations.annotations.EBean$Scope
                java.lang.String r3 = "Singleton"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.EBean.Scope.Singleton = r1
                r3 = 2
                org.androidannotations.annotations.EBean$Scope[] r3 = new org.androidannotations.annotations.EBean.Scope[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.androidannotations.annotations.EBean.Scope.$VALUES = r3
                return
        }

        private Scope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.EBean.Scope valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.EBean$Scope> r0 = org.androidannotations.annotations.EBean.Scope.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.EBean$Scope r1 = (org.androidannotations.annotations.EBean.Scope) r1
                return r1
        }

        public static org.androidannotations.annotations.EBean.Scope[] values() {
                org.androidannotations.annotations.EBean$Scope[] r0 = org.androidannotations.annotations.EBean.Scope.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.EBean$Scope[] r0 = (org.androidannotations.annotations.EBean.Scope[]) r0
                return r0
        }
    }

    org.androidannotations.annotations.EBean.Scope scope() default org.androidannotations.annotations.EBean.Scope.Default;
}
