package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadNotificationHelper {

    @androidx.annotation.StringRes
    private static final int NULL_STRING_ID = 0;
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder;

    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        @android.annotation.SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = 1
                r1.setForegroundServiceBehavior(r0)
                return
        }
    }

    public DownloadNotificationHelper(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r2 = r2.getApplicationContext()
            r0.<init>(r2, r3)
            r1.notificationBuilder = r0
            return
    }

    private android.app.Notification buildEndStateNotification(android.content.Context r12, @androidx.annotation.DrawableRes int r13, @androidx.annotation.Nullable android.app.PendingIntent r14, @androidx.annotation.Nullable java.lang.String r15, @androidx.annotation.StringRes int r16) {
            r11 = this;
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            android.app.Notification r0 = r0.buildNotification(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private android.app.Notification buildNotification(android.content.Context r2, @androidx.annotation.DrawableRes int r3, @androidx.annotation.Nullable android.app.PendingIntent r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.StringRes int r6, int r7, int r8, boolean r9, boolean r10, boolean r11) {
            r1 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r1.notificationBuilder
            r0.setSmallIcon(r3)
            androidx.core.app.NotificationCompat$Builder r3 = r1.notificationBuilder
            r0 = 0
            if (r6 != 0) goto Lc
            r2 = r0
            goto L14
        Lc:
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r6)
        L14:
            r3.setContentTitle(r2)
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            r2.setContentIntent(r4)
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            if (r5 != 0) goto L21
            goto L2a
        L21:
            androidx.core.app.NotificationCompat$BigTextStyle r3 = new androidx.core.app.NotificationCompat$BigTextStyle
            r3.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r0 = r3.bigText(r5)
        L2a:
            r2.setStyle(r0)
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            r2.setProgress(r7, r8, r9)
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            r2.setOngoing(r10)
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            r2.setShowWhen(r11)
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 31
            if (r2 < r3) goto L47
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            com.google.android.exoplayer2.ui.DownloadNotificationHelper.Api31.setForegroundServiceBehavior(r2)
        L47:
            androidx.core.app.NotificationCompat$Builder r2 = r1.notificationBuilder
            android.app.Notification r2 = r2.build()
            return r2
    }

    public android.app.Notification buildDownloadCompletedNotification(android.content.Context r7, @androidx.annotation.DrawableRes int r8, @androidx.annotation.Nullable android.app.PendingIntent r9, @androidx.annotation.Nullable java.lang.String r10) {
            r6 = this;
            int r5 = com.google.android.exoplayer2.core.R.string.exo_download_completed
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.app.Notification r7 = r0.buildEndStateNotification(r1, r2, r3, r4, r5)
            return r7
    }

    public android.app.Notification buildDownloadFailedNotification(android.content.Context r7, @androidx.annotation.DrawableRes int r8, @androidx.annotation.Nullable android.app.PendingIntent r9, @androidx.annotation.Nullable java.lang.String r10) {
            r6 = this;
            int r5 = com.google.android.exoplayer2.core.R.string.exo_download_failed
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.app.Notification r7 = r0.buildEndStateNotification(r1, r2, r3, r4, r5)
            return r7
    }

    @java.lang.Deprecated
    public android.app.Notification buildProgressNotification(android.content.Context r8, @androidx.annotation.DrawableRes int r9, @androidx.annotation.Nullable android.app.PendingIntent r10, @androidx.annotation.Nullable java.lang.String r11, java.util.List<com.google.android.exoplayer2.offline.Download> r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.app.Notification r8 = r0.buildProgressNotification(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public android.app.Notification buildProgressNotification(android.content.Context r22, @androidx.annotation.DrawableRes int r23, @androidx.annotation.Nullable android.app.PendingIntent r24, @androidx.annotation.Nullable java.lang.String r25, java.util.List<com.google.android.exoplayer2.offline.Download> r26, int r27) {
            r21 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            com.google.android.exoplayer2.offline.Download r11 = (com.google.android.exoplayer2.offline.Download) r11
            int r12 = r11.state
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r7 = 1
            goto L47
        L28:
            float r4 = r11.getPercentDownloaded()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r2 = r2 + r4
            r9 = 0
        L34:
            long r11 = r11.getBytesDownloaded()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            r6 = r6 | r4
            int r8 = r8 + 1
            r4 = 1
            goto L47
        L46:
            r5 = 1
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L51
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_downloading
        L4e:
            r15 = r3
            r3 = 1
            goto L6f
        L51:
            if (r5 == 0) goto L68
            if (r27 == 0) goto L68
            r3 = r27 & 2
            if (r3 == 0) goto L5e
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi
        L5b:
            r15 = r3
            r3 = 0
            goto L6f
        L5e:
            r3 = r27 & 1
            if (r3 == 0) goto L65
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network
            goto L5b
        L65:
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused
            goto L5b
        L68:
            if (r7 == 0) goto L6d
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_removing
            goto L4e
        L6d:
            r3 = 1
            r15 = 0
        L6f:
            if (r3 == 0) goto L8c
            r3 = 100
            if (r4 == 0) goto L85
            float r4 = (float) r8
            float r2 = r2 / r4
            int r2 = (int) r2
            if (r9 == 0) goto L7d
            if (r6 == 0) goto L7d
            goto L7e
        L7d:
            r0 = 0
        L7e:
            r18 = r0
            r17 = r2
            r16 = 100
            goto L92
        L85:
            r16 = 100
            r17 = 0
            r18 = 1
            goto L92
        L8c:
            r16 = 0
            r17 = 0
            r18 = 0
        L92:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.buildNotification(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
    }
}
