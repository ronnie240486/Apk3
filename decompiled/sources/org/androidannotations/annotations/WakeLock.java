package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface WakeLock {
    public static final java.lang.String DEFAULT_TAG = "NO_TAG";

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Flag extends java.lang.Enum<org.androidannotations.annotations.WakeLock.Flag> {
        private static final /* synthetic */ org.androidannotations.annotations.WakeLock.Flag[] $VALUES = null;
        public static final org.androidannotations.annotations.WakeLock.Flag ACQUIRE_CAUSES_WAKEUP = null;
        public static final org.androidannotations.annotations.WakeLock.Flag ON_AFTER_RELEASE = null;

        static {
                org.androidannotations.annotations.WakeLock$Flag r0 = new org.androidannotations.annotations.WakeLock$Flag
                java.lang.String r1 = "ACQUIRE_CAUSES_WAKEUP"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.WakeLock.Flag.ACQUIRE_CAUSES_WAKEUP = r0
                org.androidannotations.annotations.WakeLock$Flag r1 = new org.androidannotations.annotations.WakeLock$Flag
                java.lang.String r3 = "ON_AFTER_RELEASE"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.WakeLock.Flag.ON_AFTER_RELEASE = r1
                r3 = 2
                org.androidannotations.annotations.WakeLock$Flag[] r3 = new org.androidannotations.annotations.WakeLock.Flag[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.androidannotations.annotations.WakeLock.Flag.$VALUES = r3
                return
        }

        private Flag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.WakeLock.Flag valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.WakeLock$Flag> r0 = org.androidannotations.annotations.WakeLock.Flag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.WakeLock$Flag r1 = (org.androidannotations.annotations.WakeLock.Flag) r1
                return r1
        }

        public static org.androidannotations.annotations.WakeLock.Flag[] values() {
                org.androidannotations.annotations.WakeLock$Flag[] r0 = org.androidannotations.annotations.WakeLock.Flag.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.WakeLock$Flag[] r0 = (org.androidannotations.annotations.WakeLock.Flag[]) r0
                return r0
        }
    }

    public static final enum Level extends java.lang.Enum<org.androidannotations.annotations.WakeLock.Level> {
        private static final /* synthetic */ org.androidannotations.annotations.WakeLock.Level[] $VALUES = null;
        public static final org.androidannotations.annotations.WakeLock.Level FULL_WAKE_LOCK = null;
        public static final org.androidannotations.annotations.WakeLock.Level PARTIAL_WAKE_LOCK = null;
        public static final org.androidannotations.annotations.WakeLock.Level SCREEN_BRIGHT_WAKE_LOCK = null;
        public static final org.androidannotations.annotations.WakeLock.Level SCREEN_DIM_WAKE_LOCK = null;

        static {
                org.androidannotations.annotations.WakeLock$Level r0 = new org.androidannotations.annotations.WakeLock$Level
                java.lang.String r1 = "FULL_WAKE_LOCK"
                r2 = 0
                r0.<init>(r1, r2)
                org.androidannotations.annotations.WakeLock.Level.FULL_WAKE_LOCK = r0
                org.androidannotations.annotations.WakeLock$Level r1 = new org.androidannotations.annotations.WakeLock$Level
                java.lang.String r3 = "PARTIAL_WAKE_LOCK"
                r4 = 1
                r1.<init>(r3, r4)
                org.androidannotations.annotations.WakeLock.Level.PARTIAL_WAKE_LOCK = r1
                org.androidannotations.annotations.WakeLock$Level r3 = new org.androidannotations.annotations.WakeLock$Level
                java.lang.String r5 = "SCREEN_BRIGHT_WAKE_LOCK"
                r6 = 2
                r3.<init>(r5, r6)
                org.androidannotations.annotations.WakeLock.Level.SCREEN_BRIGHT_WAKE_LOCK = r3
                org.androidannotations.annotations.WakeLock$Level r5 = new org.androidannotations.annotations.WakeLock$Level
                java.lang.String r7 = "SCREEN_DIM_WAKE_LOCK"
                r8 = 3
                r5.<init>(r7, r8)
                org.androidannotations.annotations.WakeLock.Level.SCREEN_DIM_WAKE_LOCK = r5
                r7 = 4
                org.androidannotations.annotations.WakeLock$Level[] r7 = new org.androidannotations.annotations.WakeLock.Level[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.androidannotations.annotations.WakeLock.Level.$VALUES = r7
                return
        }

        private Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.androidannotations.annotations.WakeLock.Level valueOf(java.lang.String r1) {
                java.lang.Class<org.androidannotations.annotations.WakeLock$Level> r0 = org.androidannotations.annotations.WakeLock.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.androidannotations.annotations.WakeLock$Level r1 = (org.androidannotations.annotations.WakeLock.Level) r1
                return r1
        }

        public static org.androidannotations.annotations.WakeLock.Level[] values() {
                org.androidannotations.annotations.WakeLock$Level[] r0 = org.androidannotations.annotations.WakeLock.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                org.androidannotations.annotations.WakeLock$Level[] r0 = (org.androidannotations.annotations.WakeLock.Level[]) r0
                return r0
        }
    }

    org.androidannotations.annotations.WakeLock.Flag[] flags() default {};

    org.androidannotations.annotations.WakeLock.Level level() default org.androidannotations.annotations.WakeLock.Level.PARTIAL_WAKE_LOCK;

    java.lang.String tag() default "NO_TAG";
}
