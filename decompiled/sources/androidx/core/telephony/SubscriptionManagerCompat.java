package androidx.core.telephony;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(22)
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getSlotIndex(int r0) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r0)
                return r0
        }
    }

    private SubscriptionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSlotIndex(int r7) {
            r0 = -1
            if (r7 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r7 = androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(r7)
            return r7
        Lf:
            java.lang.reflect.Method r2 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L57
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L3f
            r2 = 26
            if (r1 < r2) goto L2a
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotIndex"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L57
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L57
            r5[r3] = r6     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L57
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.Throwable -> L57
            goto L3a
        L2a:
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotId"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L57
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L57
            r5[r3] = r6     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L57
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.Throwable -> L57
        L3a:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L57
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L57
        L3f:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L57
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L57
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L57
            r4[r3] = r7     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r1.invoke(r2, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L57
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L57
            return r7
        L57:
            return r0
    }
}
