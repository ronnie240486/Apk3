package androidx.core.telephony;

/* JADX INFO: loaded from: classes2.dex */
public class TelephonyManagerCompat {
    private static java.lang.reflect.Method sGetDeviceIdMethod;
    private static java.lang.reflect.Method sGetSubIdMethod;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        @androidx.annotation.Nullable
        @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        @androidx.annotation.DoNotInline
        public static java.lang.String getDeviceId(android.telephony.TelephonyManager r0, int r1) {
                java.lang.String r0 = r0.getDeviceId(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        @androidx.annotation.Nullable
        @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        @androidx.annotation.DoNotInline
        public static java.lang.String getImei(android.telephony.TelephonyManager r0) {
                java.lang.String r0 = r0.getImei()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getSubscriptionId(android.telephony.TelephonyManager r0) {
                int r0 = r0.getSubscriptionId()
                return r0
        }
    }

    private TelephonyManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"MissingPermission"})
    public static java.lang.String getImei(@androidx.annotation.NonNull android.telephony.TelephonyManager r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r7 = androidx.core.telephony.TelephonyManagerCompat.Api26Impl.getImei(r7)
            return r7
        Lb:
            r1 = 22
            if (r0 < r1) goto L54
            int r1 = getSubscriptionId(r7)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L54
            r2 = -1
            if (r1 == r2) goto L54
            int r1 = androidx.core.telephony.SubscriptionManagerCompat.getSlotIndex(r1)
            r2 = 23
            if (r0 < r2) goto L28
            java.lang.String r7 = androidx.core.telephony.TelephonyManagerCompat.Api23Impl.getDeviceId(r7, r1)
            return r7
        L28:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetDeviceIdMethod     // Catch: java.lang.Throwable -> L52
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L41
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r4 = "getDeviceId"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L52
            r5[r2] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L52
            androidx.core.telephony.TelephonyManagerCompat.sGetDeviceIdMethod = r0     // Catch: java.lang.Throwable -> L52
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L52
        L41:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetDeviceIdMethod     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L52
            r3[r2] = r1     // Catch: java.lang.Throwable -> L52
            java.lang.Object r7 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L52
            return r7
        L52:
            r7 = 0
            return r7
        L54:
            java.lang.String r7 = r7.getDeviceId()
            return r7
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public static int getSubscriptionId(@androidx.annotation.NonNull android.telephony.TelephonyManager r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r4 = androidx.core.telephony.TelephonyManagerCompat.Api30Impl.getSubscriptionId(r4)
            return r4
        Lb:
            r1 = 22
            if (r0 < r1) goto L3c
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "getSubId"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L3c
            androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod = r0     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L24:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L3c
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L3c
            r1 = -1
            if (r0 == r1) goto L3c
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }
}
