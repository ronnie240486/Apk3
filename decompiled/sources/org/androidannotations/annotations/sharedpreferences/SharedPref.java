package org.androidannotations.annotations.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface SharedPref {

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Scope extends java.lang.Enum<org.androidannotations.annotations.sharedpreferences.SharedPref.Scope> {
        private static final /* synthetic */ org.androidannotations.annotations.sharedpreferences.SharedPref.Scope[] $VALUES = null;
        public static final org.androidannotations.annotations.sharedpreferences.SharedPref.Scope ACTIVITY = null;
        public static final org.androidannotations.annotations.sharedpreferences.SharedPref.Scope ACTIVITY_DEFAULT = null;
        public static final org.androidannotations.annotations.sharedpreferences.SharedPref.Scope APPLICATION_DEFAULT = null;
        public static final org.androidannotations.annotations.sharedpreferences.SharedPref.Scope UNIQUE = null;

        static {
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope r0 = new org.androidannotations.annotations.sharedpreferences.SharedPref$Scope
                java.lang.String r1 = "APPLICATION_DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.APPLICATION_DEFAULT = r0
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope r1 = new org.androidannotations.annotations.sharedpreferences.SharedPref$Scope
                java.lang.String r3 = "ACTIVITY"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.ACTIVITY = r1
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope r3 = new org.androidannotations.annotations.sharedpreferences.SharedPref$Scope
                java.lang.String r5 = "ACTIVITY_DEFAULT"
                r6 = 2
                r3.<init>(r5, r6)
                org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.ACTIVITY_DEFAULT = r3
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope r5 = new org.androidannotations.annotations.sharedpreferences.SharedPref$Scope
                java.lang.String r7 = "UNIQUE"
                r8 = 3
                r5.<init>(r7, r8)
                org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.UNIQUE = r5
                r7 = 4
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope[] r7 = new org.androidannotations.annotations.sharedpreferences.SharedPref.Scope[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.$VALUES = r7
                return
        }

        private Scope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.sharedpreferences.SharedPref.Scope valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.sharedpreferences.SharedPref$Scope> r0 = org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope r1 = (org.androidannotations.annotations.sharedpreferences.SharedPref.Scope) r1
                return r1
        }

        public static org.androidannotations.annotations.sharedpreferences.SharedPref.Scope[] values() {
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope[] r0 = org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.sharedpreferences.SharedPref$Scope[] r0 = (org.androidannotations.annotations.sharedpreferences.SharedPref.Scope[]) r0
                return r0
        }
    }

    int mode() default 0;

    org.androidannotations.annotations.sharedpreferences.SharedPref.Scope value() default org.androidannotations.annotations.sharedpreferences.SharedPref.Scope.ACTIVITY;
}
