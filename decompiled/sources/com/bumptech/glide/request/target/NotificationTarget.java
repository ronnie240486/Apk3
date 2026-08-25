package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationTarget extends com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap> {
    private final android.content.Context context;
    private final android.app.Notification notification;
    private final int notificationId;
    private final java.lang.String notificationTag;
    private final android.widget.RemoteViews remoteViews;
    private final int viewId;

    public NotificationTarget(android.content.Context r1, int r2, int r3, int r4, android.widget.RemoteViews r5, android.app.Notification r6, int r7, java.lang.String r8) {
            r0 = this;
            r0.<init>(r2, r3)
            java.lang.String r2 = "Context must not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1, r2)
            android.content.Context r1 = (android.content.Context) r1
            r0.context = r1
            java.lang.String r1 = "Notification object can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r6, r1)
            android.app.Notification r1 = (android.app.Notification) r1
            r0.notification = r1
            java.lang.String r1 = "RemoteViews object can not be null!"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r5, r1)
            android.widget.RemoteViews r1 = (android.widget.RemoteViews) r1
            r0.remoteViews = r1
            r0.viewId = r4
            r0.notificationId = r7
            r0.notificationTag = r8
            return
    }

    public NotificationTarget(android.content.Context r8, int r9, android.widget.RemoteViews r10, android.app.Notification r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public NotificationTarget(android.content.Context r10, int r11, android.widget.RemoteViews r12, android.app.Notification r13, int r14, java.lang.String r15) {
            r9 = this;
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r9
            r1 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private void setBitmap(@androidx.annotation.Nullable android.graphics.Bitmap r3) {
            r2 = this;
            android.widget.RemoteViews r0 = r2.remoteViews
            int r1 = r2.viewId
            r0.setImageViewBitmap(r1, r3)
            r2.update()
            return
    }

    private void update() {
            r4 = this;
            android.content.Context r0 = r4.context
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r1 = r4.notificationTag
            int r2 = r4.notificationId
            android.app.Notification r3 = r4.notification
            r0.notify(r1, r2, r3)
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = 0
            r0.setBitmap(r1)
            return
    }

    public void onResourceReady(@androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> r2) {
            r0 = this;
            r0.setBitmap(r1)
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition r2) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.onResourceReady(r1, r2)
            return
    }
}
