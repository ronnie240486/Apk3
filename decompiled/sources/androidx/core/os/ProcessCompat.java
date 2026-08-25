package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessCompat {

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private static java.lang.reflect.Method sMethodUserIdIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api16Impl.sResolvedLock = r0
                return
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock = r0
                return
        }

        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
        public static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock     // Catch: java.lang.Exception -> L3f
                monitor-enter(r1)     // Catch: java.lang.Exception -> L3f
                boolean r2 = androidx.core.os.ProcessCompat.Api17Impl.sResolved     // Catch: java.lang.Throwable -> L3c
                r3 = 0
                if (r2 != 0) goto L1b
                androidx.core.os.ProcessCompat.Api17Impl.sResolved = r0     // Catch: java.lang.Throwable -> L3c
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r4 = "isApp"
                java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3c
                r5[r3] = r6     // Catch: java.lang.Throwable -> L3c
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L3c
                androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L3c
            L1b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L3f
                if (r1 == 0) goto L43
                r2 = 0
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3f
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3f
                r4[r3] = r7     // Catch: java.lang.Exception -> L3f
                java.lang.Object r7 = r1.invoke(r2, r4)     // Catch: java.lang.Exception -> L3f
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L3f
                if (r7 == 0) goto L36
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L3f
                return r7
            L36:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L3f
                r7.<init>()     // Catch: java.lang.Exception -> L3f
                throw r7     // Catch: java.lang.Exception -> L3f
            L3c:
                r7 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
                throw r7     // Catch: java.lang.Exception -> L3f
            L3f:
                r7 = move-exception
                r7.printStackTrace()
            L43:
                return r0
        }
    }

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean isApplicationUid(int r0) {
                boolean r0 = android.os.Process.isApplicationUid(r0)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r2)
            return r2
        Lb:
            boolean r2 = androidx.core.os.ProcessCompat.Api17Impl.isApplicationUid(r2)
            return r2
    }
}
