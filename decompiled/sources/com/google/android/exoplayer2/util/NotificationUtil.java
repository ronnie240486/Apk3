package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.SuppressLint({"InlinedApi"})
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void createNotificationChannel(android.content.Context r2, java.lang.String r3, @androidx.annotation.StringRes int r4, @androidx.annotation.StringRes int r5, int r6) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 < r1) goto L29
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r4 = r2.getString(r4)
            r1.<init>(r3, r4, r6)
            if (r5 == 0) goto L26
            java.lang.String r2 = r2.getString(r5)
            r1.setDescription(r2)
        L26:
            r0.createNotificationChannel(r1)
        L29:
            return
    }

    public static void setNotification(android.content.Context r1, int r2, @androidx.annotation.Nullable android.app.Notification r3) {
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            if (r3 == 0) goto L14
            r1.notify(r2, r3)
            goto L17
        L14:
            r1.cancel(r2)
        L17:
            return
    }
}
